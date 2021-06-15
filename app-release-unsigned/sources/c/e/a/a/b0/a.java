package c.e.a.a.b0;

import android.view.ViewTreeObserver;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

public class a implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView e;

    public a(ClockFaceView clockFaceView) {
        this.e = clockFaceView;
    }

    public boolean onPreDraw() {
        if (!this.e.isShown()) {
            return true;
        }
        this.e.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.e;
        int height = ((this.e.getHeight() / 2) - clockFaceView.A.f1724l) - clockFaceView.H;
        if (height != clockFaceView.y) {
            clockFaceView.y = height;
            clockFaceView.k();
            ClockHandView clockHandView = clockFaceView.A;
            clockHandView.t = clockFaceView.y;
            clockHandView.invalidate();
        }
        return true;
    }
}
