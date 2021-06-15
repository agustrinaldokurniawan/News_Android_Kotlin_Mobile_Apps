package c.d.a.m.v;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class z {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((w) message.obj).d();
            return true;
        }
    }

    public synchronized void a(w<?> wVar, boolean z) {
        if (!this.a) {
            if (!z) {
                this.a = true;
                wVar.d();
                this.a = false;
            }
        }
        this.b.obtainMessage(1, wVar).sendToTarget();
    }
}
