package g.u;

import android.annotation.SuppressLint;
import android.view.View;

public class t extends y {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f3061c = true;

    @Override // g.u.y
    public void a(View view) {
    }

    @Override // g.u.y
    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f3061c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f3061c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // g.u.y
    public void c(View view) {
    }

    @Override // g.u.y
    @SuppressLint({"NewApi"})
    public void e(View view, float f2) {
        if (f3061c) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f3061c = false;
            }
        }
        view.setAlpha(f2);
    }
}
