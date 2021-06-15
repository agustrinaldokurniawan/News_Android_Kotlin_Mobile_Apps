package g.u;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

public class u extends t {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f3062d = true;
    public static boolean e = true;

    @Override // g.u.y
    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f3062d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f3062d = false;
            }
        }
    }

    @Override // g.u.y
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
