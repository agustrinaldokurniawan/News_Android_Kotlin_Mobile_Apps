package c.e.a.a.q;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import c.e.a.a.v.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public class g extends d {
    public g(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // c.e.a.a.q.d
    public float c() {
        return this.z.getElevation();
    }

    @Override // c.e.a.a.q.d
    public void d(Rect rect) {
        if (FloatingActionButton.this.n) {
            super.d(rect);
            return;
        }
        int i2 = 0;
        if (!q()) {
            i2 = (0 - this.z.getSizeDimension()) / 2;
        }
        rect.set(i2, i2, i2, i2);
    }

    @Override // c.e.a.a.q.d
    public void g() {
    }

    @Override // c.e.a.a.q.d
    public void h() {
        s();
        throw null;
    }

    @Override // c.e.a.a.q.d
    public void i(int[] iArr) {
    }

    @Override // c.e.a.a.q.d
    public void j(float f2, float f3, float f4) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.b, t(f2, f4));
        stateListAnimator.addState(d.f1279c, t(f2, f3));
        stateListAnimator.addState(d.f1280d, t(f2, f3));
        stateListAnimator.addState(d.e, t(f2, f3));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.z, "elevation", f2).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.z, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.a);
        stateListAnimator.addState(d.f1281f, animatorSet);
        stateListAnimator.addState(d.f1282g, t(0.0f, 0.0f));
        this.z.setStateListAnimator(stateListAnimator);
        if (o()) {
            s();
            throw null;
        }
    }

    @Override // c.e.a.a.q.d
    public void n(ColorStateList colorStateList) {
    }

    @Override // c.e.a.a.q.d
    public boolean o() {
        return FloatingActionButton.this.n || !q();
    }

    @Override // c.e.a.a.q.d
    public void r() {
    }

    public final Animator t(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.z, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.z, View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(d.a);
        return animatorSet;
    }
}
