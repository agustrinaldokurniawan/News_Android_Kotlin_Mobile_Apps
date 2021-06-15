package g.u;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import g.h.j.o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends h {
    public static final String[] B = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> C = new a(PointF.class, "boundsOrigin");
    public static final Property<i, PointF> D = new C0099b(PointF.class, "topLeft");
    public static final Property<i, PointF> E = new c(PointF.class, "bottomRight");
    public static final Property<View, PointF> F = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> G = new e(PointF.class, "topLeft");
    public static final Property<View, PointF> H = new f(PointF.class, "position");
    public static f I = new f();
    public int[] J = new int[2];

    public static class a extends Property<Drawable, PointF> {
        public Rect a = new Rect();

        public a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.a);
        }
    }

    /* renamed from: g.u.b$b  reason: collision with other inner class name */
    public static class C0099b extends Property<i, PointF> {
        public C0099b(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.b = round;
            int i2 = iVar2.f3039f + 1;
            iVar2.f3039f = i2;
            if (i2 == iVar2.f3040g) {
                s.b(iVar2.e, iVar2.a, round, iVar2.f3037c, iVar2.f3038d);
                iVar2.f3039f = 0;
                iVar2.f3040g = 0;
            }
        }
    }

    public static class c extends Property<i, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f3037c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f3038d = round;
            int i2 = iVar2.f3040g + 1;
            iVar2.f3040g = i2;
            if (iVar2.f3039f == i2) {
                s.b(iVar2.e, iVar2.a, iVar2.b, iVar2.f3037c, round);
                iVar2.f3039f = 0;
                iVar2.f3040g = 0;
            }
        }
    }

    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            s.b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            s.b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            s.b(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        private i mViewBounds;

        public g(b bVar, i iVar) {
            this.a = iVar;
            this.mViewBounds = iVar;
        }
    }

    public class h extends k {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public h(b bVar, ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // g.u.k, g.u.h.d
        public void a(h hVar) {
            r.a(this.b, false);
        }

        @Override // g.u.k, g.u.h.d
        public void b(h hVar) {
            r.a(this.b, true);
        }

        @Override // g.u.k, g.u.h.d
        public void d(h hVar) {
            r.a(this.b, false);
            this.a = true;
        }

        @Override // g.u.h.d
        public void e(h hVar) {
            if (!this.a) {
                r.a(this.b, false);
            }
            hVar.A(this);
        }
    }

    public static class i {
        public int a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f3037c;

        /* renamed from: d  reason: collision with root package name */
        public int f3038d;
        public View e;

        /* renamed from: f  reason: collision with root package name */
        public int f3039f;

        /* renamed from: g  reason: collision with root package name */
        public int f3040g;

        public i(View view) {
            this.e = view;
        }
    }

    public final void N(p pVar) {
        View view = pVar.b;
        AtomicInteger atomicInteger = o.a;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            pVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            pVar.a.put("android:changeBounds:parent", pVar.b.getParent());
        }
    }

    @Override // g.u.h
    public void g(p pVar) {
        N(pVar);
    }

    @Override // g.u.h
    public void j(p pVar) {
        N(pVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v11, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    @Override // g.u.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator o(android.view.ViewGroup r19, g.u.p r20, g.u.p r21) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: g.u.b.o(android.view.ViewGroup, g.u.p, g.u.p):android.animation.Animator");
    }

    @Override // g.u.h
    public String[] t() {
        return B;
    }
}
