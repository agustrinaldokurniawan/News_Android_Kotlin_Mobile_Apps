package g.h.j;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import g.h.j.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class y {
    public static final y a = (Build.VERSION.SDK_INT >= 30 ? i.o : j.a);
    public final j b;

    public static class a extends d {
        public static Field b = null;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f2539c = false;

        /* renamed from: d  reason: collision with root package name */
        public static Constructor<WindowInsets> f2540d = null;
        public static boolean e = false;

        /* renamed from: f  reason: collision with root package name */
        public WindowInsets f2541f;

        /* renamed from: g  reason: collision with root package name */
        public g.h.d.b f2542g;

        public a() {
            this.f2541f = e();
        }

        public a(y yVar) {
            this.f2541f = yVar.g();
        }

        public static WindowInsets e() {
            if (!f2539c) {
                try {
                    b = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f2539c = true;
            }
            Field field = b;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!e) {
                try {
                    f2540d = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                e = true;
            }
            Constructor<WindowInsets> constructor = f2540d;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // g.h.j.y.d
        public y b() {
            a();
            y h2 = y.h(this.f2541f);
            h2.b.l(null);
            h2.b.n(this.f2542g);
            return h2;
        }

        @Override // g.h.j.y.d
        public void c(g.h.d.b bVar) {
            this.f2542g = bVar;
        }

        @Override // g.h.j.y.d
        public void d(g.h.d.b bVar) {
            WindowInsets windowInsets = this.f2541f;
            if (windowInsets != null) {
                this.f2541f = windowInsets.replaceSystemWindowInsets(bVar.b, bVar.f2475c, bVar.f2476d, bVar.e);
            }
        }
    }

    public static class b extends d {
        public final WindowInsets.Builder b;

        public b() {
            this.b = new WindowInsets.Builder();
        }

        public b(y yVar) {
            WindowInsets.Builder builder;
            if (yVar.g() == null) {
                builder = new WindowInsets.Builder();
            }
            this.b = builder;
        }

        @Override // g.h.j.y.d
        public y b() {
            a();
            y h2 = y.h(this.b.build());
            h2.b.l(null);
            return h2;
        }

        @Override // g.h.j.y.d
        public void c(g.h.d.b bVar) {
            this.b.setStableInsets(bVar.b());
        }

        @Override // g.h.j.y.d
        public void d(g.h.d.b bVar) {
            this.b.setSystemWindowInsets(bVar.b());
        }
    }

    public static class c extends b {
        public c() {
        }

        public c(y yVar) {
            super(yVar);
        }
    }

    public static class d {
        public final y a;

        public d() {
            this(new y((y) null));
        }

        public d(y yVar) {
            this.a = yVar;
        }

        public final void a() {
        }

        public y b() {
            throw null;
        }

        public void c(g.h.d.b bVar) {
            throw null;
        }

        public void d(g.h.d.b bVar) {
            throw null;
        }
    }

    public static class e extends j {

        /* renamed from: c  reason: collision with root package name */
        public static boolean f2543c = false;

        /* renamed from: d  reason: collision with root package name */
        public static Method f2544d;
        public static Class<?> e;

        /* renamed from: f  reason: collision with root package name */
        public static Class<?> f2545f;

        /* renamed from: g  reason: collision with root package name */
        public static Field f2546g;

        /* renamed from: h  reason: collision with root package name */
        public static Field f2547h;

        /* renamed from: i  reason: collision with root package name */
        public final WindowInsets f2548i;

        /* renamed from: j  reason: collision with root package name */
        public g.h.d.b f2549j = null;

        /* renamed from: k  reason: collision with root package name */
        public y f2550k;

        /* renamed from: l  reason: collision with root package name */
        public g.h.d.b f2551l;

        public e(y yVar, WindowInsets windowInsets) {
            super(yVar);
            this.f2548i = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        public static void p() {
            try {
                f2544d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                e = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2545f = cls;
                f2546g = cls.getDeclaredField("mVisibleInsets");
                f2547h = e.getDeclaredField("mAttachInfo");
                f2546g.setAccessible(true);
                f2547h.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                StringBuilder f2 = c.c.a.a.a.f("Failed to get visible insets. (Reflection error). ");
                f2.append(e2.getMessage());
                Log.e("WindowInsetsCompat", f2.toString(), e2);
            }
            f2543c = true;
        }

        @Override // g.h.j.y.j
        public void d(View view) {
            g.h.d.b o = o(view);
            if (o == null) {
                o = g.h.d.b.a;
            }
            q(o);
        }

        @Override // g.h.j.y.j
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f2551l, ((e) obj).f2551l);
        }

        @Override // g.h.j.y.j
        public final g.h.d.b h() {
            if (this.f2549j == null) {
                this.f2549j = g.h.d.b.a(this.f2548i.getSystemWindowInsetLeft(), this.f2548i.getSystemWindowInsetTop(), this.f2548i.getSystemWindowInsetRight(), this.f2548i.getSystemWindowInsetBottom());
            }
            return this.f2549j;
        }

        @Override // g.h.j.y.j
        public y i(int i2, int i3, int i4, int i5) {
            y h2 = y.h(this.f2548i);
            int i6 = Build.VERSION.SDK_INT;
            d cVar = i6 >= 30 ? new c(h2) : i6 >= 29 ? new b(h2) : new a(h2);
            cVar.d(y.e(h(), i2, i3, i4, i5));
            cVar.c(y.e(g(), i2, i3, i4, i5));
            return cVar.b();
        }

        @Override // g.h.j.y.j
        public boolean k() {
            return this.f2548i.isRound();
        }

        @Override // g.h.j.y.j
        public void l(g.h.d.b[] bVarArr) {
        }

        @Override // g.h.j.y.j
        public void m(y yVar) {
            this.f2550k = yVar;
        }

        public final g.h.d.b o(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2543c) {
                    p();
                }
                Method method = f2544d;
                if (!(method == null || f2545f == null || f2546g == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2546g.get(f2547h.get(invoke));
                        if (rect != null) {
                            return g.h.d.b.a(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e2) {
                        StringBuilder f2 = c.c.a.a.a.f("Failed to get visible insets. (Reflection error). ");
                        f2.append(e2.getMessage());
                        Log.e("WindowInsetsCompat", f2.toString(), e2);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public void q(g.h.d.b bVar) {
            this.f2551l = bVar;
        }
    }

    public static class f extends e {

        /* renamed from: m  reason: collision with root package name */
        public g.h.d.b f2552m = null;

        public f(y yVar, WindowInsets windowInsets) {
            super(yVar, windowInsets);
        }

        @Override // g.h.j.y.j
        public y b() {
            return y.h(this.f2548i.consumeStableInsets());
        }

        @Override // g.h.j.y.j
        public y c() {
            return y.h(this.f2548i.consumeSystemWindowInsets());
        }

        @Override // g.h.j.y.j
        public final g.h.d.b g() {
            if (this.f2552m == null) {
                this.f2552m = g.h.d.b.a(this.f2548i.getStableInsetLeft(), this.f2548i.getStableInsetTop(), this.f2548i.getStableInsetRight(), this.f2548i.getStableInsetBottom());
            }
            return this.f2552m;
        }

        @Override // g.h.j.y.j
        public boolean j() {
            return this.f2548i.isConsumed();
        }

        @Override // g.h.j.y.j
        public void n(g.h.d.b bVar) {
            this.f2552m = bVar;
        }
    }

    public static class g extends f {
        public g(y yVar, WindowInsets windowInsets) {
            super(yVar, windowInsets);
        }

        @Override // g.h.j.y.j
        public y a() {
            return y.h(this.f2548i.consumeDisplayCutout());
        }

        @Override // g.h.j.y.j
        public d e() {
            DisplayCutout displayCutout = this.f2548i.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new d(displayCutout);
        }

        @Override // g.h.j.y.e, g.h.j.y.j
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f2548i, gVar.f2548i) && Objects.equals(this.f2551l, gVar.f2551l);
        }

        @Override // g.h.j.y.j
        public int hashCode() {
            return this.f2548i.hashCode();
        }
    }

    public static class h extends g {
        public g.h.d.b n = null;

        public h(y yVar, WindowInsets windowInsets) {
            super(yVar, windowInsets);
        }

        @Override // g.h.j.y.j
        public g.h.d.b f() {
            if (this.n == null) {
                Insets mandatorySystemGestureInsets = this.f2548i.getMandatorySystemGestureInsets();
                this.n = g.h.d.b.a(mandatorySystemGestureInsets.left, mandatorySystemGestureInsets.top, mandatorySystemGestureInsets.right, mandatorySystemGestureInsets.bottom);
            }
            return this.n;
        }

        @Override // g.h.j.y.e, g.h.j.y.j
        public y i(int i2, int i3, int i4, int i5) {
            return y.h(this.f2548i.inset(i2, i3, i4, i5));
        }

        @Override // g.h.j.y.f, g.h.j.y.j
        public void n(g.h.d.b bVar) {
        }
    }

    public static class i extends h {
        public static final y o = y.h(WindowInsets.CONSUMED);

        public i(y yVar, WindowInsets windowInsets) {
            super(yVar, windowInsets);
        }

        @Override // g.h.j.y.e, g.h.j.y.j
        public final void d(View view) {
        }
    }

    public static class j {
        public static final y a;
        public final y b;

        static {
            int i2 = Build.VERSION.SDK_INT;
            a = (i2 >= 30 ? new c() : i2 >= 29 ? new b() : new a()).b().b.a().b.b().b.c();
        }

        public j(y yVar) {
            this.b = yVar;
        }

        public y a() {
            return this.b;
        }

        public y b() {
            return this.b;
        }

        public y c() {
            return this.b;
        }

        public void d(View view) {
        }

        public d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return k() == jVar.k() && j() == jVar.j() && Objects.equals(h(), jVar.h()) && Objects.equals(g(), jVar.g()) && Objects.equals(e(), jVar.e());
        }

        public g.h.d.b f() {
            return h();
        }

        public g.h.d.b g() {
            return g.h.d.b.a;
        }

        public g.h.d.b h() {
            return g.h.d.b.a;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(k()), Boolean.valueOf(j()), h(), g(), e());
        }

        public y i(int i2, int i3, int i4, int i5) {
            return a;
        }

        public boolean j() {
            return false;
        }

        public boolean k() {
            return false;
        }

        public void l(g.h.d.b[] bVarArr) {
        }

        public void m(y yVar) {
        }

        public void n(g.h.d.b bVar) {
        }
    }

    public y(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        this.b = i2 >= 30 ? new i(this, windowInsets) : i2 >= 29 ? new h(this, windowInsets) : i2 >= 28 ? new g(this, windowInsets) : new f(this, windowInsets);
    }

    public y(y yVar) {
        this.b = new j(this);
    }

    public static g.h.d.b e(g.h.d.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.b - i2);
        int max2 = Math.max(0, bVar.f2475c - i3);
        int max3 = Math.max(0, bVar.f2476d - i4);
        int max4 = Math.max(0, bVar.e - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : g.h.d.b.a(max, max2, max3, max4);
    }

    public static y h(WindowInsets windowInsets) {
        return i(windowInsets, null);
    }

    public static y i(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        y yVar = new y(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            AtomicInteger atomicInteger = o.a;
            yVar.b.m(o.d.a(view));
            yVar.b.d(view.getRootView());
        }
        return yVar;
    }

    @Deprecated
    public int a() {
        return this.b.h().e;
    }

    @Deprecated
    public int b() {
        return this.b.h().b;
    }

    @Deprecated
    public int c() {
        return this.b.h().f2476d;
    }

    @Deprecated
    public int d() {
        return this.b.h().f2475c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        return Objects.equals(this.b, ((y) obj).b);
    }

    public boolean f() {
        return this.b.j();
    }

    public WindowInsets g() {
        j jVar = this.b;
        if (jVar instanceof e) {
            return ((e) jVar).f2548i;
        }
        return null;
    }

    public int hashCode() {
        j jVar = this.b;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }
}
