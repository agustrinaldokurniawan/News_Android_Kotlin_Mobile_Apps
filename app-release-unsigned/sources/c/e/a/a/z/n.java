package c.e.a.a.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.tsuga.news.R;
import g.h.j.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class n {
    public final Context a;
    public final TextInputLayout b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f1426c;

    /* renamed from: d  reason: collision with root package name */
    public int f1427d;
    public FrameLayout e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f1428f;

    /* renamed from: g  reason: collision with root package name */
    public final float f1429g;

    /* renamed from: h  reason: collision with root package name */
    public int f1430h;

    /* renamed from: i  reason: collision with root package name */
    public int f1431i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1432j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1433k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f1434l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f1435m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public TextView r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;
        public final /* synthetic */ TextView b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f1436c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f1437d;

        public a(int i2, TextView textView, int i3, TextView textView2) {
            this.a = i2;
            this.b = textView;
            this.f1436c = i3;
            this.f1437d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            TextView textView;
            n nVar = n.this;
            nVar.f1430h = this.a;
            nVar.f1428f = null;
            TextView textView2 = this.b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f1436c == 1 && (textView = n.this.f1434l) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.f1437d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.f1437d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f1437d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public n(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.f1429g = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public void a(TextView textView, int i2) {
        if (this.f1426c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.f1426c = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.f1426c, -1, -2);
            this.e = new FrameLayout(this.a);
            this.f1426c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.e.setVisibility(0);
            this.e.addView(textView);
        } else {
            this.f1426c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f1426c.setVisibility(0);
        this.f1427d++;
    }

    public void b() {
        if ((this.f1426c == null || this.b.getEditText() == null) ? false : true) {
            EditText editText = this.b.getEditText();
            boolean j2 = c.e.a.a.a.j(this.a);
            LinearLayout linearLayout = this.f1426c;
            AtomicInteger atomicInteger = o.a;
            linearLayout.setPaddingRelative(h(j2, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingStart()), h(j2, R.dimen.material_helper_text_font_1_3_padding_top, this.a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), h(j2, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingEnd()), 0);
        }
    }

    public void c() {
        Animator animator = this.f1428f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i4 == i2 ? 1.0f : 0.0f);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(c.e.a.a.c.a.a);
                list.add(ofFloat);
                if (i4 == i2) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f1429g, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(c.e.a.a.c.a.f1180d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public boolean e() {
        return this.f1431i == 1 && this.f1434l != null && !TextUtils.isEmpty(this.f1432j);
    }

    public final TextView f(int i2) {
        if (i2 == 1) {
            return this.f1434l;
        }
        if (i2 != 2) {
            return null;
        }
        return this.r;
    }

    public int g() {
        TextView textView = this.f1434l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int h(boolean z, int i2, int i3) {
        return z ? this.a.getResources().getDimensionPixelSize(i2) : i3;
    }

    public void i() {
        this.f1432j = null;
        c();
        if (this.f1430h == 1) {
            this.f1431i = (!this.q || TextUtils.isEmpty(this.p)) ? 0 : 2;
        }
        l(this.f1430h, this.f1431i, k(this.f1434l, null));
    }

    public void j(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f1426c;
        if (linearLayout != null) {
            if (!(i2 == 0 || i2 == 1) || (frameLayout = this.e) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i3 = this.f1427d - 1;
            this.f1427d = i3;
            LinearLayout linearLayout2 = this.f1426c;
            if (i3 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean k(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.b;
        AtomicInteger atomicInteger = o.a;
        return textInputLayout.isLaidOut() && this.b.isEnabled() && (this.f1431i != this.f1430h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void l(int i2, int i3, boolean z) {
        TextView f2;
        TextView f3;
        if (i2 != i3) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f1428f = animatorSet;
                ArrayList arrayList = new ArrayList();
                d(arrayList, this.q, this.r, 2, i2, i3);
                d(arrayList, this.f1433k, this.f1434l, 1, i2, i3);
                c.e.a.a.a.p(animatorSet, arrayList);
                animatorSet.addListener(new a(i3, f(i2), i2, f(i3)));
                animatorSet.start();
            } else if (i2 != i3) {
                if (!(i3 == 0 || (f3 = f(i3)) == null)) {
                    f3.setVisibility(0);
                    f3.setAlpha(1.0f);
                }
                if (!(i2 == 0 || (f2 = f(i2)) == null)) {
                    f2.setVisibility(4);
                    if (i2 == 1) {
                        f2.setText((CharSequence) null);
                    }
                }
                this.f1430h = i3;
            }
            this.b.w();
            this.b.y(z, false);
            this.b.F();
        }
    }
}
