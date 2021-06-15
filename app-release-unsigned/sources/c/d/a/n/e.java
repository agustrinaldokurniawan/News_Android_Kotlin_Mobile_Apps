package c.d.a.n;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import c.d.a.i;
import c.d.a.n.c;
import c.d.a.s.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class e implements c {
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final c.a f1108f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1109g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1110h;

    /* renamed from: i  reason: collision with root package name */
    public final BroadcastReceiver f1111i = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z = eVar.f1109g;
            eVar.f1109g = eVar.l(context);
            if (z != e.this.f1109g) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder f2 = c.c.a.a.a.f("connectivity changed, isConnected: ");
                    f2.append(e.this.f1109g);
                    Log.d("ConnectivityMonitor", f2.toString());
                }
                e eVar2 = e.this;
                c.a aVar = eVar2.f1108f;
                boolean z2 = eVar2.f1109g;
                i.b bVar = (i.b) aVar;
                Objects.requireNonNull(bVar);
                if (z2) {
                    synchronized (i.this) {
                        r rVar = bVar.a;
                        Iterator it = ((ArrayList) j.e(rVar.a)).iterator();
                        while (it.hasNext()) {
                            c.d.a.q.c cVar = (c.d.a.q.c) it.next();
                            if (!cVar.i() && !cVar.j()) {
                                cVar.clear();
                                if (!rVar.f1124c) {
                                    cVar.f();
                                } else {
                                    rVar.b.add(cVar);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public e(Context context, c.a aVar) {
        this.e = context.getApplicationContext();
        this.f1108f = aVar;
    }

    @Override // c.d.a.n.m
    public void e() {
        if (this.f1110h) {
            this.e.unregisterReceiver(this.f1111i);
            this.f1110h = false;
        }
    }

    @Override // c.d.a.n.m
    public void i() {
        if (!this.f1110h) {
            this.f1109g = l(this.e);
            try {
                this.e.registerReceiver(this.f1111i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f1110h = true;
            } catch (SecurityException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e2);
                }
            }
        }
    }

    @Override // c.d.a.n.m
    public void k() {
    }

    @SuppressLint({"MissingPermission"})
    public boolean l(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }
}
