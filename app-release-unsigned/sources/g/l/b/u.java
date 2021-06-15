package g.l.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import g.h.j.n;

public class u extends AnimationSet implements Runnable {
    public final ViewGroup e;

    /* renamed from: f  reason: collision with root package name */
    public final View f2774f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2775g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2776h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2777i = true;

    public u(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.e = viewGroup;
        this.f2774f = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public boolean getTransformation(long j2, Transformation transformation) {
        this.f2777i = true;
        if (this.f2775g) {
            return !this.f2776h;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f2775g = true;
            n.a(this.e, this);
        }
        return true;
    }

    public boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f2777i = true;
        if (this.f2775g) {
            return !this.f2776h;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f2775g = true;
            n.a(this.e, this);
        }
        return true;
    }

    public void run() {
        if (this.f2775g || !this.f2777i) {
            this.e.endViewTransition(this.f2774f);
            this.f2776h = true;
            return;
        }
        this.f2777i = false;
        this.e.post(this);
    }
}
