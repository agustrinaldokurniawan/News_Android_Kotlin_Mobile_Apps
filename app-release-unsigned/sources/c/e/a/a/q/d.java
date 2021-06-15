package c.e.a.a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import c.e.a.a.w.j;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import g.h.j.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class d {
    public static final TimeInterpolator a = c.e.a.a.c.a.f1179c;
    public static final int[] b = {16842919, 16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1279c = {16843623, 16842908, 16842910};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1280d = {16842908, 16842910};
    public static final int[] e = {16843623, 16842910};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1281f = {16842910};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1282g = new int[0];
    public final c.e.a.a.v.b A;
    public final Rect B = new Rect();
    public final RectF C = new RectF();
    public final RectF D = new RectF();
    public final Matrix E = new Matrix();
    public ViewTreeObserver.OnPreDrawListener F;

    /* renamed from: h  reason: collision with root package name */
    public j f1283h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1284i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1285j = true;

    /* renamed from: k  reason: collision with root package name */
    public float f1286k;

    /* renamed from: l  reason: collision with root package name */
    public float f1287l;

    /* renamed from: m  reason: collision with root package name */
    public float f1288m;
    public final c.e.a.a.r.g n;
    public c.e.a.a.c.g o;
    public c.e.a.a.c.g p;
    public Animator q;
    public c.e.a.a.c.g r;
    public c.e.a.a.c.g s;
    public float t;
    public float u = 1.0f;
    public int v = 0;
    public ArrayList<Animator.AnimatorListener> w;
    public ArrayList<Animator.AnimatorListener> x;
    public ArrayList<e> y;
    public final FloatingActionButton z;

    public class a extends c.e.a.a.c.f {
        public a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            d.this.u = f2;
            matrix.getValues(this.a);
            matrix2.getValues(this.b);
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.b;
                float f3 = fArr[i2];
                float[] fArr2 = this.a;
                fArr[i2] = ((f3 - fArr2[i2]) * f2) + fArr2[i2];
            }
            this.f1181c.setValues(this.b);
            return this.f1181c;
        }
    }

    public class b extends h {
        public b(d dVar) {
            super(null);
        }

        @Override // c.e.a.a.q.d.h
        public float a() {
            return 0.0f;
        }
    }

    public class c extends h {
        public c() {
            super(null);
        }

        @Override // c.e.a.a.q.d.h
        public float a() {
            d dVar = d.this;
            return dVar.f1286k + dVar.f1287l;
        }
    }

    /* renamed from: c.e.a.a.q.d$d  reason: collision with other inner class name */
    public class C0040d extends h {
        public C0040d() {
            super(null);
        }

        @Override // c.e.a.a.q.d.h
        public float a() {
            d dVar = d.this;
            return dVar.f1286k + dVar.f1288m;
        }
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
    }

    public class g extends h {
        public g() {
            super(null);
        }

        @Override // c.e.a.a.q.d.h
        public float a() {
            return d.this.f1286k;
        }
    }

    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;
        public float b;

        public h(b bVar) {
        }

        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(d.this);
            this.a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                Objects.requireNonNull(d.this);
                this.b = a();
                this.a = true;
            }
            d dVar = d.this;
            valueAnimator.getAnimatedFraction();
            Objects.requireNonNull(dVar);
        }
    }

    public d(FloatingActionButton floatingActionButton, c.e.a.a.v.b bVar) {
        this.z = floatingActionButton;
        this.A = bVar;
        c.e.a.a.r.g gVar = new c.e.a.a.r.g();
        this.n = gVar;
        gVar.a(b, b(new C0040d()));
        gVar.a(f1279c, b(new c()));
        gVar.a(f1280d, b(new c()));
        gVar.a(e, b(new c()));
        gVar.a(f1281f, b(new g()));
        gVar.a(f1282g, b(new b(this)));
        this.t = floatingActionButton.getRotation();
    }

    public final AnimatorSet a(c.e.a.a.c.g gVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.z, View.ALPHA, f2);
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.z, View.SCALE_X, f3);
        gVar.d("scale").a(ofFloat2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 26) {
            ofFloat2.setEvaluator(new e(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.z, View.SCALE_Y, f3);
        gVar.d("scale").a(ofFloat3);
        if (i2 == 26) {
            ofFloat3.setEvaluator(new e(this));
        }
        arrayList.add(ofFloat3);
        this.E.reset();
        this.z.getDrawable();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.z, new c.e.a.a.c.e(), new a(), new Matrix(this.E));
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        c.e.a.a.a.p(animatorSet, arrayList);
        return animatorSet;
    }

    public final ValueAnimator b(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float c() {
        throw null;
    }

    public void d(Rect rect) {
        int i2 = 0;
        if (this.f1284i) {
            i2 = (0 - this.z.getSizeDimension()) / 2;
        }
        float c2 = this.f1285j ? c() + this.f1288m : 0.0f;
        int max = Math.max(i2, (int) Math.ceil((double) c2));
        int max2 = Math.max(i2, (int) Math.ceil((double) (c2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public boolean e() {
        return this.z.getVisibility() == 0 ? this.v == 1 : this.v != 2;
    }

    public boolean f() {
        return this.z.getVisibility() != 0 ? this.v == 2 : this.v != 1;
    }

    public void g() {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i(int[] iArr) {
        throw null;
    }

    public void j(float f2, float f3, float f4) {
        throw null;
    }

    public void k() {
        ArrayList<e> arrayList = this.y;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void l() {
        ArrayList<e> arrayList = this.y;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public final void m(float f2) {
        this.u = f2;
        Matrix matrix = this.E;
        matrix.reset();
        this.z.getDrawable();
        this.z.setImageMatrix(matrix);
    }

    public void n(ColorStateList colorStateList) {
        throw null;
    }

    public boolean o() {
        throw null;
    }

    public final boolean p() {
        FloatingActionButton floatingActionButton = this.z;
        AtomicInteger atomicInteger = o.a;
        return floatingActionButton.isLaidOut() && !this.z.isInEditMode();
    }

    public final boolean q() {
        return !this.f1284i || this.z.getSizeDimension() >= 0;
    }

    public void r() {
        throw null;
    }

    public final void s() {
        Rect rect = this.B;
        d(rect);
        g.h.b.d.e(null, "Didn't initialize content background");
        if (o()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.A;
            Objects.requireNonNull(bVar);
            d.super.setBackgroundDrawable(insetDrawable);
        } else {
            Objects.requireNonNull((FloatingActionButton.b) this.A);
        }
        c.e.a.a.v.b bVar2 = this.A;
        int i2 = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}
