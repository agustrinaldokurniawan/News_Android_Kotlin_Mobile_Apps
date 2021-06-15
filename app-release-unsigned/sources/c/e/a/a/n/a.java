package c.e.a.a.n;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class a implements View.OnTouchListener {
    public final Dialog e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1271f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1272g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1273h;

    public a(Dialog dialog, Rect rect) {
        this.e = dialog;
        this.f1271f = rect.left;
        this.f1272g = rect.top;
        this.f1273h = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f1271f;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f1272g;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i2 = this.f1273h;
            obtain.setLocation((float) ((-i2) - 1), (float) ((-i2) - 1));
        }
        view.performClick();
        return this.e.onTouchEvent(obtain);
    }
}
