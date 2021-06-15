package g.q.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import g.h.j.o;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class l extends RecyclerView.k implements RecyclerView.o {
    public static final int[] a = {16842919};
    public static final int[] b = new int[0];
    public final int[] A = new int[2];
    public final ValueAnimator B;
    public int C;
    public final Runnable D;
    public final RecyclerView.p E;

    /* renamed from: c  reason: collision with root package name */
    public final int f2919c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2920d;
    public final StateListDrawable e;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable f2921f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2922g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2923h;

    /* renamed from: i  reason: collision with root package name */
    public final StateListDrawable f2924i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f2925j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2926k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2927l;

    /* renamed from: m  reason: collision with root package name */
    public int f2928m;
    public int n;
    public float o;
    public int p;
    public int q;
    public float r;
    public int s = 0;
    public int t = 0;
    public RecyclerView u;
    public boolean v = false;
    public boolean w = false;
    public int x = 0;
    public int y = 0;
    public final int[] z = new int[2];

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            l lVar = l.this;
            int i2 = lVar.C;
            if (i2 == 1) {
                lVar.B.cancel();
            } else if (i2 != 2) {
                return;
            }
            lVar.C = 3;
            ValueAnimator valueAnimator = lVar.B;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            lVar.B.setDuration((long) 500);
            lVar.B.start();
        }
    }

    public class b extends RecyclerView.p {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void b(RecyclerView recyclerView, int i2, int i3) {
            l lVar = l.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = lVar.u.computeVerticalScrollRange();
            int i4 = lVar.t;
            lVar.v = computeVerticalScrollRange - i4 > 0 && i4 >= lVar.f2919c;
            int computeHorizontalScrollRange = lVar.u.computeHorizontalScrollRange();
            int i5 = lVar.s;
            boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= lVar.f2919c;
            lVar.w = z;
            boolean z2 = lVar.v;
            if (z2 || z) {
                if (z2) {
                    float f2 = (float) i4;
                    lVar.n = (int) ((((f2 / 2.0f) + ((float) computeVerticalScrollOffset)) * f2) / ((float) computeVerticalScrollRange));
                    lVar.f2928m = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
                }
                if (lVar.w) {
                    float f3 = (float) computeHorizontalScrollOffset;
                    float f4 = (float) i5;
                    lVar.q = (int) ((((f4 / 2.0f) + f3) * f4) / ((float) computeHorizontalScrollRange));
                    lVar.p = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
                }
                int i6 = lVar.x;
                if (i6 == 0 || i6 == 1) {
                    lVar.j(1);
                }
            } else if (lVar.x != 0) {
                lVar.j(0);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {
        public boolean a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) l.this.B.getAnimatedValue()).floatValue() == 0.0f) {
                l lVar = l.this;
                lVar.C = 0;
                lVar.j(0);
            } else {
                l lVar2 = l.this;
                lVar2.C = 2;
                lVar2.u.invalidate();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l.this.e.setAlpha(floatValue);
            l.this.f2921f.setAlpha(floatValue);
            l.this.u.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        boolean z2 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = ofFloat;
        this.C = 0;
        this.D = new a();
        b bVar = new b();
        this.E = bVar;
        this.e = stateListDrawable;
        this.f2921f = drawable;
        this.f2924i = stateListDrawable2;
        this.f2925j = drawable2;
        this.f2922g = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f2923h = Math.max(i2, drawable.getIntrinsicWidth());
        this.f2926k = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f2927l = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f2919c = i3;
        this.f2920d = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.l lVar = recyclerView2.s;
                if (lVar != null) {
                    lVar.d("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.v.remove(this);
                if (recyclerView2.v.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z2);
                }
                recyclerView2.Q();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.u;
                recyclerView3.w.remove(this);
                if (recyclerView3.x == this) {
                    recyclerView3.x = null;
                }
                List<RecyclerView.p> list = this.u.o0;
                if (list != null) {
                    list.remove(bVar);
                }
                f();
            }
            this.u = recyclerView;
            recyclerView.g(this);
            this.u.w.add(this);
            this.u.h(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.x;
        if (i2 == 1) {
            boolean h2 = h(motionEvent.getX(), motionEvent.getY());
            boolean g2 = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (h2 || g2)) {
                if (g2) {
                    this.y = 1;
                    this.r = (float) ((int) motionEvent.getX());
                } else if (h2) {
                    this.y = 2;
                    this.o = (float) ((int) motionEvent.getY());
                }
                j(2);
                return true;
            }
        } else if (i2 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.x != 0) {
            if (motionEvent.getAction() == 0) {
                boolean h2 = h(motionEvent.getX(), motionEvent.getY());
                boolean g2 = g(motionEvent.getX(), motionEvent.getY());
                if (h2 || g2) {
                    if (g2) {
                        this.y = 1;
                        this.r = (float) ((int) motionEvent.getX());
                    } else if (h2) {
                        this.y = 2;
                        this.o = (float) ((int) motionEvent.getY());
                    }
                    j(2);
                }
            } else if (motionEvent.getAction() == 1 && this.x == 2) {
                this.o = 0.0f;
                this.r = 0.0f;
                j(1);
                this.y = 0;
            } else if (motionEvent.getAction() == 2 && this.x == 2) {
                k();
                if (this.y == 1) {
                    float x2 = motionEvent.getX();
                    int[] iArr = this.A;
                    int i2 = this.f2920d;
                    iArr[0] = i2;
                    iArr[1] = this.s - i2;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x2));
                    if (Math.abs(((float) this.q) - max) >= 2.0f) {
                        int i3 = i(this.r, max, iArr, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.s);
                        if (i3 != 0) {
                            this.u.scrollBy(i3, 0);
                        }
                        this.r = max;
                    }
                }
                if (this.y == 2) {
                    float y2 = motionEvent.getY();
                    int[] iArr2 = this.z;
                    int i4 = this.f2920d;
                    iArr2[0] = i4;
                    iArr2[1] = this.t - i4;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y2));
                    if (Math.abs(((float) this.n) - max2) >= 2.0f) {
                        int i5 = i(this.o, max2, iArr2, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.t);
                        if (i5 != 0) {
                            this.u.scrollBy(0, i5);
                        }
                        this.o = max2;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.w wVar) {
        if (this.s != this.u.getWidth() || this.t != this.u.getHeight()) {
            this.s = this.u.getWidth();
            this.t = this.u.getHeight();
            j(0);
        } else if (this.C != 0) {
            if (this.v) {
                int i2 = this.s;
                int i3 = this.f2922g;
                int i4 = i2 - i3;
                int i5 = this.n;
                int i6 = this.f2928m;
                int i7 = i5 - (i6 / 2);
                this.e.setBounds(0, 0, i3, i6);
                this.f2921f.setBounds(0, 0, this.f2923h, this.t);
                RecyclerView recyclerView2 = this.u;
                AtomicInteger atomicInteger = o.a;
                boolean z2 = true;
                if (recyclerView2.getLayoutDirection() != 1) {
                    z2 = false;
                }
                if (z2) {
                    this.f2921f.draw(canvas);
                    canvas.translate((float) this.f2922g, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.e.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    i4 = this.f2922g;
                } else {
                    canvas.translate((float) i4, 0.0f);
                    this.f2921f.draw(canvas);
                    canvas.translate(0.0f, (float) i7);
                    this.e.draw(canvas);
                }
                canvas.translate((float) (-i4), (float) (-i7));
            }
            if (this.w) {
                int i8 = this.t;
                int i9 = this.f2926k;
                int i10 = i8 - i9;
                int i11 = this.q;
                int i12 = this.p;
                int i13 = i11 - (i12 / 2);
                this.f2924i.setBounds(0, 0, i12, i9);
                this.f2925j.setBounds(0, 0, this.s, this.f2927l);
                canvas.translate(0.0f, (float) i10);
                this.f2925j.draw(canvas);
                canvas.translate((float) i13, 0.0f);
                this.f2924i.draw(canvas);
                canvas.translate((float) (-i13), (float) (-i10));
            }
        }
    }

    public final void f() {
        this.u.removeCallbacks(this.D);
    }

    public boolean g(float f2, float f3) {
        if (f3 >= ((float) (this.t - this.f2926k))) {
            int i2 = this.q;
            int i3 = this.p;
            return f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) ((i3 / 2) + i2));
        }
    }

    public boolean h(float f2, float f3) {
        RecyclerView recyclerView = this.u;
        AtomicInteger atomicInteger = o.a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (f2 > ((float) this.f2922g)) {
                return false;
            }
        } else if (f2 < ((float) (this.s - this.f2922g))) {
            return false;
        }
        int i2 = this.n;
        int i3 = this.f2928m / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final int i(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public void j(int i2) {
        int i3;
        if (i2 == 2 && this.x != 2) {
            this.e.setState(a);
            f();
        }
        if (i2 == 0) {
            this.u.invalidate();
        } else {
            k();
        }
        if (this.x != 2 || i2 == 2) {
            if (i2 == 1) {
                i3 = 1500;
            }
            this.x = i2;
        }
        this.e.setState(b);
        i3 = 1200;
        f();
        this.u.postDelayed(this.D, (long) i3);
        this.x = i2;
    }

    public void k() {
        int i2 = this.C;
        if (i2 != 0) {
            if (i2 == 3) {
                this.B.cancel();
            } else {
                return;
            }
        }
        this.C = 1;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.B.setDuration(500L);
        this.B.setStartDelay(0);
        this.B.start();
    }
}
