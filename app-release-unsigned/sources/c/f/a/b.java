package c.f.a;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c.f.a.f.a;
import c.f.a.f.f;
import i.j;
import i.m;
import i.s.b.l;
import i.s.c.h;
import java.util.concurrent.atomic.AtomicLong;

public final class b {
    public static long a(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            j4 = Long.MAX_VALUE;
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            long j5 = j3 + j2;
            if (j5 >= 0) {
                j4 = j5;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
        return j3;
    }

    public static final Animator b(ImageView imageView, int i2, int i3, PorterDuff.Mode mode, long j2) {
        h.f(imageView, "$this$colorAnimator");
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i2), Integer.valueOf(i3));
        ofObject.setDuration(j2);
        ofObject.addUpdateListener(new a(ofObject, imageView, j2, mode));
        h.b(ofObject, "ValueAnimator.ofObject(A…orFilter(color) }\n    }\n}");
        return ofObject;
    }

    public static final Animator c(TextView textView, int i2, int i3, long j2) {
        h.f(textView, "$this$colorAnimator");
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i2), Integer.valueOf(i3));
        ofObject.setDuration(j2);
        ofObject.addUpdateListener(new f(textView, j2));
        h.b(ofObject, "ValueAnimator.ofObject(A…atedValue as Int)\n    }\n}");
        return ofObject;
    }

    public static long d(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                h.a.t.a.M(new IllegalStateException(c.c.a.a.a.n("More produced than requested: ", j4)));
                j4 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
        return j4;
    }

    public static int e(int i2) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1));
    }

    public static final void f(ImageView imageView, int i2, int i3, PorterDuff.Mode mode) {
        h.f(imageView, "$this$setColorStateListAnimator");
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842913}, b(imageView, i3, i2, mode, 350));
        stateListAnimator.addState(new int[0], b(imageView, i2, i3, mode, 350));
        imageView.setStateListAnimator(stateListAnimator);
        imageView.refreshDrawableState();
    }

    public static final void g(TextView textView, int i2, int i3) {
        h.f(textView, "$this$setColorStateListAnimator");
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842913}, c(textView, i3, i2, 350));
        stateListAnimator.addState(new int[0], c(textView, i2, i3, 350));
        textView.setStateListAnimator(stateListAnimator);
        textView.refreshDrawableState();
    }

    public static void h(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final <T extends ViewGroup.LayoutParams> void i(View view, l<? super T, m> lVar) {
        h.f(view, "$this$updateLayoutParams");
        h.f(lVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            lVar.o(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new j("null cannot be cast to non-null type T");
    }
}
