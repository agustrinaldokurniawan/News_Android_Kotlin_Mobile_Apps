package g.h.c.b;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class e {

    public class a implements Runnable {
        public final /* synthetic */ Typeface e;

        public a(Typeface typeface) {
            this.e = typeface;
        }

        public void run() {
            e.this.e(this.e);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int e;

        public b(int i2) {
            this.e = i2;
        }

        public void run() {
            e.this.d(this.e);
        }
    }

    public static Handler c(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public final void a(int i2, Handler handler) {
        c(handler).post(new b(i2));
    }

    public final void b(Typeface typeface, Handler handler) {
        c(handler).post(new a(typeface));
    }

    public abstract void d(int i2);

    public abstract void e(Typeface typeface);
}
