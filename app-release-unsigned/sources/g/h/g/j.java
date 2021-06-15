package g.h.g;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import g.e.f;
import g.e.h;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class j {
    public static final f<String, Typeface> a = new f<>(16);
    public static final ExecutorService b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2500c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final h<String, ArrayList<g.h.i.a<a>>> f2501d = new h<>();

    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i2) {
            this.a = null;
            this.b = i2;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g.h.g.j.a a(java.lang.String r7, android.content.Context r8, g.h.g.e r9, int r10) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.g.j.a(java.lang.String, android.content.Context, g.h.g.e, int):g.h.g.j$a");
    }
}
