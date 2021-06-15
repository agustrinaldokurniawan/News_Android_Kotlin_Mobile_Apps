package g.u;

import android.os.Build;

public class o {
    public static final boolean a = true;
    public static final boolean b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3057c;

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i2 < 28) {
            z = false;
        }
        f3057c = z;
    }
}
