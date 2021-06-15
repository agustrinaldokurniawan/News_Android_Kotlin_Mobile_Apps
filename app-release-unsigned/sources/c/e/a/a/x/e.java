package c.e.a.a.x;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

public class e {
    public static e a;
    public final Object b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Handler f1405c = new Handler(Looper.getMainLooper(), new a());

    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e eVar = e.this;
            b bVar = (b) message.obj;
            synchronized (eVar.b) {
                if (bVar == null) {
                    Objects.requireNonNull(bVar);
                    throw null;
                }
            }
            return true;
        }
    }

    public static class b {
    }
}
