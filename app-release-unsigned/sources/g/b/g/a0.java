package g.b.g;

import android.graphics.Typeface;
import android.widget.TextView;

public class a0 implements Runnable {
    public final /* synthetic */ TextView e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Typeface f2038f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f2039g;

    public a0(z zVar, TextView textView, Typeface typeface, int i2) {
        this.e = textView;
        this.f2038f = typeface;
        this.f2039g = i2;
    }

    public void run() {
        this.e.setTypeface(this.f2038f, this.f2039g);
    }
}
