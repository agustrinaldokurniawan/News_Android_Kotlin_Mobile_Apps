package g.u;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

public class w extends v {

    /* renamed from: g  reason: collision with root package name */
    public static boolean f3064g = true;

    @Override // g.u.y
    @SuppressLint({"NewApi"})
    public void f(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i2);
        } else if (f3064g) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f3064g = false;
            }
        }
    }
}
