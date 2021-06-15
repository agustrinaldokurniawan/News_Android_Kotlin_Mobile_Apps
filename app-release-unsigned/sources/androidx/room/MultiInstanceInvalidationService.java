package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import g.r.g;
import g.r.h;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<Integer, String> f319f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final RemoteCallbackList<g> f320g = new a();

    /* renamed from: h  reason: collision with root package name */
    public final h f321h = new b();

    public class a extends RemoteCallbackList<g> {
        public a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.IInterface, java.lang.Object] */
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(g gVar, Object obj) {
            MultiInstanceInvalidationService.this.f319f.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    public class b extends h {
        public b() {
        }

        public void b(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f320g) {
                String str = MultiInstanceInvalidationService.this.f319f.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f320g.beginBroadcast();
                for (int i3 = 0; i3 < beginBroadcast; i3++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f320g.getBroadcastCookie(i3)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f319f.get(Integer.valueOf(intValue));
                        if (i2 != intValue && str.equals(str2)) {
                            try {
                                MultiInstanceInvalidationService.this.f320g.getBroadcastItem(i3).a(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f320g.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f320g.finishBroadcast();
            }
        }

        public int c(g gVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f320g) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.e + 1;
                multiInstanceInvalidationService.e = i2;
                if (multiInstanceInvalidationService.f320g.register(gVar, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f319f.put(Integer.valueOf(i2), str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.e--;
                return 0;
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f321h;
    }
}
