package g.b.d.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import g.b.g.p0;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public final class a {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<Context, SparseArray<?>> b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1916c = new Object();

    public static Drawable a(Context context, int i2) {
        return p0.c().e(context, i2);
    }
}
