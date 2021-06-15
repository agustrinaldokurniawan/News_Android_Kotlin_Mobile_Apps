package g.h.g;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public class n implements ThreadFactory {
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public int f2504f;

    public static class a extends Thread {
        public final int e;

        public a(Runnable runnable, String str, int i2) {
            super(runnable, str);
            this.e = i2;
        }

        public void run() {
            Process.setThreadPriority(this.e);
            super.run();
        }
    }

    public n(String str, int i2) {
        this.e = str;
        this.f2504f = i2;
    }

    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.e, this.f2504f);
    }
}
