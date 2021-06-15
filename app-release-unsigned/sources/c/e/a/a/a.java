package c.e.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import c.e.a.a.l.c;
import c.e.a.a.w.d;
import c.e.a.a.w.e;
import c.e.a.a.w.g;
import c.e.a.a.w.i;
import g.b.g.z0;
import g.h.j.o;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static Animator b(c cVar, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, c.C0038c.a, c.b.a, new c.e(f2, f3, f4));
        c.e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f2, (int) f3, revealInfo.f1226c, f4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static d c(int i2) {
        if (i2 == 0) {
            return new i();
        }
        if (i2 != 1) {
            return new i();
        }
        return new e();
    }

    public static float d(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot((double) (f4 - f2), (double) (f5 - f3));
    }

    public static int e(Context context, int i2, int i3) {
        TypedValue q = q(context, i2);
        return q != null ? q.data : i3;
    }

    public static int f(View view, int i2) {
        return s(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static ColorStateList g(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i2);
    }

    public static ColorStateList h(Context context, z0 z0Var, int i2) {
        int resourceId;
        if (z0Var.b.hasValue(i2) && (resourceId = z0Var.b.getResourceId(i2, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return z0Var.c(i2);
    }

    public static Drawable i(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable a;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (a = g.b.d.a.a.a(context, resourceId)) == null) ? typedArray.getDrawable(i2) : a;
    }

    public static boolean j(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean k(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static boolean l(View view) {
        AtomicInteger atomicInteger = o.a;
        return view.getLayoutDirection() == 1;
    }

    public static int m(int i2, int i3, float f2) {
        return g.h.d.a.a(g.h.d.a.c(i3, Math.round(((float) Color.alpha(i3)) * f2)), i2);
    }

    public static float n(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static PorterDuff.Mode o(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void p(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = list.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static TypedValue q(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean r(Context context, int i2, boolean z) {
        TypedValue q = q(context, i2);
        return (q == null || q.type != 18) ? z : q.data != 0;
    }

    public static int s(Context context, int i2, String str) {
        TypedValue q = q(context, i2);
        if (q != null) {
            return q.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static void t(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            g gVar = (g) background;
            g.b bVar = gVar.f1340g;
            if (bVar.o != f2) {
                bVar.o = f2;
                gVar.w();
            }
        }
    }

    public static void u(View view, g gVar) {
        c.e.a.a.o.a aVar = gVar.f1340g.b;
        if (aVar != null && aVar.a) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                AtomicInteger atomicInteger = o.a;
                f2 += ((View) parent).getElevation();
            }
            g.b bVar = gVar.f1340g;
            if (bVar.n != f2) {
                bVar.n = f2;
                gVar.w();
            }
        }
    }

    public static PorterDuffColorFilter v(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
