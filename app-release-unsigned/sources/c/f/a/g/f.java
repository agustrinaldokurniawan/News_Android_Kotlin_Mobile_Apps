package c.f.a.g;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import c.f.a.e.a;
import i.s.c.h;

public abstract class f extends FrameLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.f(context, "context");
    }

    public abstract void a(a aVar);

    public abstract void b(int i2);

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.38f);
    }
}
