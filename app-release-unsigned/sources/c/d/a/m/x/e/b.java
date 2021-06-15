package c.d.a.m.x.e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c.d.a.m.v.s;
import c.d.a.m.v.w;
import c.d.a.m.x.g.c;
import java.util.Objects;

public abstract class b<T extends Drawable> implements w<T>, s {
    public final T e;

    public b(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.e = t;
    }

    @Override // c.d.a.m.v.s
    public void a() {
        Bitmap b;
        T t = this.e;
        if (t instanceof BitmapDrawable) {
            b = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof c) {
            b = ((c) t).b();
        } else {
            return;
        }
        b.prepareToDraw();
    }

    @Override // c.d.a.m.v.w
    public Object get() {
        Drawable.ConstantState constantState = this.e.getConstantState();
        return constantState == null ? this.e : constantState.newDrawable();
    }
}
