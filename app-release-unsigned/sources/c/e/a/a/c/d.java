package c.e.a.a.c;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class d extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> a = new d();
    public final WeakHashMap<Drawable, Integer> b = new WeakHashMap<>();

    public d() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.util.Property
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
