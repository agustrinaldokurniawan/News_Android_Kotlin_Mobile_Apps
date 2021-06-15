package g.u;

import android.annotation.SuppressLint;
import android.view.View;

public class v extends u {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f3063f = true;

    @Override // g.u.y
    @SuppressLint({"NewApi"})
    public void d(View view, int i2, int i3, int i4, int i5) {
        if (f3063f) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f3063f = false;
            }
        }
    }
}
