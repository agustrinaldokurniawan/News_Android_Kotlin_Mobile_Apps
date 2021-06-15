package g.b.g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.tsuga.news.R;
import g.b.g.j;
import g.e.d;
import g.e.e;
import g.e.f;
import g.e.h;
import g.e.i;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class p0 {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public static p0 b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f2140c = new a(6);

    /* renamed from: d  reason: collision with root package name */
    public WeakHashMap<Context, i<ColorStateList>> f2141d;
    public h<String, b> e;

    /* renamed from: f  reason: collision with root package name */
    public i<String> f2142f;

    /* renamed from: g  reason: collision with root package name */
    public final WeakHashMap<Context, e<WeakReference<Drawable.ConstantState>>> f2143g = new WeakHashMap<>(0);

    /* renamed from: h  reason: collision with root package name */
    public TypedValue f2144h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2145i;

    /* renamed from: j  reason: collision with root package name */
    public c f2146j;

    public static class a extends f<Integer, PorterDuffColorFilter> {
        public a(int i2) {
            super(i2);
        }
    }

    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
    }

    public static synchronized p0 c() {
        p0 p0Var;
        synchronized (p0.class) {
            if (b == null) {
                b = new p0();
            }
            p0Var = b;
        }
        return p0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (p0.class) {
            a aVar = f2140c;
            Objects.requireNonNull(aVar);
            int i3 = (i2 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) aVar.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                Objects.requireNonNull(aVar);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) aVar.b(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            e<WeakReference<Drawable.ConstantState>> eVar = this.f2143g.get(context);
            if (eVar == null) {
                eVar = new e<>(10);
                this.f2143g.put(context, eVar);
            }
            eVar.j(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final Drawable b(Context context, int i2) {
        int i3;
        if (this.f2144h == null) {
            this.f2144h = new TypedValue();
        }
        TypedValue typedValue = this.f2144h;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable d2 = d(context, j2);
        if (d2 != null) {
            return d2;
        }
        c cVar = this.f2146j;
        LayerDrawable layerDrawable = null;
        if (cVar != null) {
            j.a aVar = (j.a) cVar;
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i2 == R.drawable.abc_ratingbar_material) {
                    i3 = R.dimen.abc_star_big;
                } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                    i3 = R.dimen.abc_star_medium;
                } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                    i3 = R.dimen.abc_star_small;
                }
                layerDrawable = aVar.c(this, context, i3);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable d(Context context, long j2) {
        Object[] objArr;
        Object obj;
        e<WeakReference<Drawable.ConstantState>> eVar = this.f2143g.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> h2 = eVar.h(j2, null);
        if (h2 != null) {
            Drawable.ConstantState constantState = h2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b2 = d.b(eVar.f2231g, eVar.f2233i, j2);
            if (b2 >= 0 && (objArr = eVar.f2232h)[b2] != (obj = e.e)) {
                objArr[b2] = obj;
                eVar.f2230f = true;
            }
        }
        return null;
    }

    public synchronized Drawable e(Context context, int i2) {
        return f(context, i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable f(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f2145i     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0006
            goto L_0x002b
        L_0x0006:
            r0 = 1
            r4.f2145i = r0     // Catch:{ all -> 0x0049 }
            r1 = 2131165269(0x7f070055, float:1.794475E38)
            android.graphics.drawable.Drawable r1 = r4.e(r5, r1)     // Catch:{ all -> 0x0049 }
            r2 = 0
            if (r1 == 0) goto L_0x004b
            boolean r3 = r1 instanceof g.v.a.a.b     // Catch:{ all -> 0x0049 }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0049 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r2
        L_0x0029:
            if (r0 == 0) goto L_0x004b
        L_0x002b:
            android.graphics.drawable.Drawable r0 = r4.i(r5, r6)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r4.b(r5, r6)     // Catch:{ all -> 0x0049 }
        L_0x0035:
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = g.h.c.a.a     // Catch:{ all -> 0x0049 }
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r6)     // Catch:{ all -> 0x0049 }
        L_0x003d:
            if (r0 == 0) goto L_0x0043
            android.graphics.drawable.Drawable r0 = r4.j(r5, r6, r7, r0)     // Catch:{ all -> 0x0049 }
        L_0x0043:
            if (r0 == 0) goto L_0x0047
            int[] r5 = g.b.g.g0.a     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r4)
            return r0
        L_0x0049:
            r5 = move-exception
            goto L_0x0055
        L_0x004b:
            r4.f2145i = r2
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)
            throw r5
        L_0x0055:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.p0.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public synchronized ColorStateList h(Context context, int i2) {
        ColorStateList colorStateList;
        i<ColorStateList> iVar;
        WeakHashMap<Context, i<ColorStateList>> weakHashMap = this.f2141d;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            colorStateList = iVar.h(i2, null);
        }
        if (colorStateList == null) {
            c cVar = this.f2146j;
            if (cVar != null) {
                colorStateList2 = ((j.a) cVar).d(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f2141d == null) {
                    this.f2141d = new WeakHashMap<>();
                }
                i<ColorStateList> iVar2 = this.f2141d.get(context);
                if (iVar2 == null) {
                    iVar2 = new i<>();
                    this.f2141d.put(context, iVar2);
                }
                iVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ Exception -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[Catch:{ Exception -> 0x00a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable i(android.content.Context r11, int r12) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.p0.i(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final Drawable j(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList h2 = h(context, i2);
        PorterDuff.Mode mode = null;
        if (h2 != null) {
            if (g0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(h2);
            c cVar = this.f2146j;
            if (cVar != null) {
                j.a aVar = (j.a) cVar;
                if (i2 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return drawable;
            }
            drawable.setTintMode(mode);
            return drawable;
        }
        c cVar2 = this.f2146j;
        if (cVar2 != null) {
            j.a aVar2 = (j.a) cVar2;
            boolean z2 = true;
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c2 = u0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = j.a;
                aVar2.e(findDrawableByLayerId, c2, mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908303), u0.c(context, R.attr.colorControlNormal), mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908301), u0.c(context, R.attr.colorControlActivated), mode2);
            } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b2 = u0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = j.a;
                aVar2.e(findDrawableByLayerId2, b2, mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908303), u0.c(context, R.attr.colorControlActivated), mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908301), u0.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (k(context, i2, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.p0.k(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
