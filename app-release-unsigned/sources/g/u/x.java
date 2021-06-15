package g.u;

import android.graphics.Matrix;
import android.view.View;

public class x extends w {
    @Override // g.u.t, g.u.y
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // g.u.v, g.u.y
    public void d(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // g.u.t, g.u.y
    public void e(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // g.u.w, g.u.y
    public void f(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // g.u.u, g.u.y
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // g.u.u, g.u.y
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
