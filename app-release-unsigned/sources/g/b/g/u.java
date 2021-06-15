package g.b.g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.tsuga.news.R;

public class u extends SeekBar {
    public final v e;

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        u0.a(this, getContext());
        v vVar = new v(this);
        this.e = vVar;
        vVar.a(attributeSet, R.attr.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        v vVar = this.e;
        Drawable drawable = vVar.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(vVar.f2165d.getDrawableState())) {
            vVar.f2165d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.e.d(canvas);
    }
}
