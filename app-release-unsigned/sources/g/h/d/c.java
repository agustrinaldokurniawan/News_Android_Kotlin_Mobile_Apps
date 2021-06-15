package g.h.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import g.e.f;
import g.h.c.b.e;
import g.h.g.m;
import java.lang.reflect.Method;

@SuppressLint({"NewApi"})
public class c {
    public static final j a;
    public static final f<String, Typeface> b = new f<>(16);

    public static class a extends m {
        public e a;

        public a(e eVar) {
            this.a = eVar;
        }
    }

    static {
        j jVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            jVar = new h();
        } else if (i2 >= 28) {
            jVar = new g();
        } else if (i2 >= 26) {
            jVar = new f();
        } else {
            Method method = e.f2481d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            jVar = method != null ? new e() : new d();
        }
        a = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r6, g.h.c.b.a r7, android.content.res.Resources r8, int r9, int r10, g.h.c.b.e r11, android.os.Handler r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.d.c.a(android.content.Context, g.h.c.b.a, android.content.res.Resources, int, int, g.h.c.b.e, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i2, String str, int i3) {
        Typeface d2 = a.d(context, resources, i2, str, i3);
        if (d2 != null) {
            b.b(c(resources, i2, i3), d2);
        }
        return d2;
    }

    public static String c(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }
}
