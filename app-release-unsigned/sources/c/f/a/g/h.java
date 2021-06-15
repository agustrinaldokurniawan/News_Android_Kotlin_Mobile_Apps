package c.f.a.g;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ismaeldivita.chipnavigation.view.BadgeImageView;
import com.tsuga.news.R;
import i.j;
import i.m;
import i.s.b.l;
import i.s.c.i;
import i.s.c.p;
import i.s.c.q;
import i.v.e;
import java.util.Objects;

public final class h extends f {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ e[] f1573f;

    /* renamed from: g  reason: collision with root package name */
    public final i.c f1574g = h.a.t.a.F(new defpackage.b(1, this));

    /* renamed from: h  reason: collision with root package name */
    public final i.c f1575h = h.a.t.a.F(new i(this));

    /* renamed from: i  reason: collision with root package name */
    public final i.c f1576i = h.a.t.a.F(new defpackage.b(0, this));

    /* renamed from: j  reason: collision with root package name */
    public final i.c f1577j = h.a.t.a.F(new g(this));

    /* renamed from: k  reason: collision with root package name */
    public final GradientDrawable f1578k = new GradientDrawable();

    /* renamed from: l  reason: collision with root package name */
    public final GradientDrawable f1579l = new GradientDrawable();

    /* renamed from: m  reason: collision with root package name */
    public final int f1580m = ((int) getResources().getDimension(R.dimen.cnb_space_2));
    public final Typeface n;
    public int o = -1;
    public float p;

    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ h a;
        public final /* synthetic */ GradientDrawable b;

        public a(h hVar, GradientDrawable gradientDrawable) {
            this.a = hVar;
            this.b = gradientDrawable;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float[] fArr;
            i.s.c.h.b(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (this.b.getLayoutDirection() == 0) {
                    float f2 = this.a.p;
                    fArr = new float[]{floatValue, floatValue, f2, f2, f2, f2, floatValue, floatValue};
                } else {
                    float f3 = this.a.p;
                    fArr = new float[]{f3, f3, floatValue, floatValue, floatValue, floatValue, f3, f3};
                }
                this.b.setCornerRadii(fArr);
                return;
            }
            throw new j("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final class b extends i implements l<ViewGroup.MarginLayoutParams, m> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h f1581f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h hVar) {
            super(1);
            this.f1581f = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // i.s.b.l
        public m o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            i.s.c.h.f(marginLayoutParams2, "$receiver");
            marginLayoutParams2.setMarginStart(this.f1581f.f1580m);
            return m.a;
        }
    }

    public static final class c extends i implements l<ViewGroup.MarginLayoutParams, m> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f1582f = new c();

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // i.s.b.l
        public m o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            i.s.c.h.f(marginLayoutParams2, "$receiver");
            marginLayoutParams2.setMarginStart(0);
            marginLayoutParams2.setMarginEnd(0);
            return m.a;
        }
    }

    static {
        i.s.c.l lVar = new i.s.c.l(p.a(h.class), "title", "getTitle()Landroid/widget/TextView;");
        q qVar = p.a;
        Objects.requireNonNull(qVar);
        i.s.c.l lVar2 = new i.s.c.l(p.a(h.class), "icon", "getIcon()Lcom/ismaeldivita/chipnavigation/view/BadgeImageView;");
        Objects.requireNonNull(qVar);
        i.s.c.l lVar3 = new i.s.c.l(p.a(h.class), "countLabel", "getCountLabel()Landroid/widget/TextView;");
        Objects.requireNonNull(qVar);
        i.s.c.l lVar4 = new i.s.c.l(p.a(h.class), "container", "getContainer()Landroid/view/View;");
        Objects.requireNonNull(qVar);
        f1573f = new e[]{lVar, lVar2, lVar3, lVar4};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, int i2) {
        super(context, null);
        i.s.c.h.f(context, "context");
        View.inflate(getContext(), R.layout.cnb_vertical_menu_item, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView countLabel = getCountLabel();
        i.s.c.h.b(countLabel, "countLabel");
        Typeface typeface = countLabel.getTypeface();
        i.s.c.h.b(typeface, "countLabel.typeface");
        this.n = typeface;
    }

    private final View getContainer() {
        i.c cVar = this.f1577j;
        e eVar = f1573f[3];
        return (View) cVar.getValue();
    }

    private final TextView getCountLabel() {
        i.c cVar = this.f1576i;
        e eVar = f1573f[2];
        return (TextView) cVar.getValue();
    }

    private final BadgeImageView getIcon() {
        i.c cVar = this.f1575h;
        e eVar = f1573f[1];
        return (BadgeImageView) cVar.getValue();
    }

    private final TextView getTitle() {
        i.c cVar = this.f1574g;
        e eVar = f1573f[0];
        return (TextView) cVar.getValue();
    }

    @Override // c.f.a.g.f
    public void a(c.f.a.e.a aVar) {
        i.s.c.h.f(aVar, "item");
        setId(aVar.a);
        setEnabled(aVar.e);
        this.p = aVar.f1548j.f1550d;
        setImportantForAccessibility(1);
        CharSequence charSequence = aVar.f1542c;
        if (charSequence == null) {
            charSequence = aVar.b;
        }
        setContentDescription(charSequence);
        Integer num = aVar.f1548j.f1549c;
        if (num != null) {
            getTitle().setTextAppearance(num.intValue());
        }
        TextView title = getTitle();
        i.s.c.h.b(title, "title");
        title.setText(aVar.b);
        TextView title2 = getTitle();
        i.s.c.h.b(title2, "title");
        c.f.a.b.g(title2, aVar.f1546h, aVar.f1548j.b);
        Integer num2 = aVar.f1548j.f1549c;
        if (num2 != null) {
            getCountLabel().setTextAppearance(num2.intValue());
        }
        TextView countLabel = getCountLabel();
        i.s.c.h.b(countLabel, "countLabel");
        c.f.a.b.g(countLabel, aVar.f1546h, aVar.f1548j.b);
        BadgeImageView icon = getIcon();
        i.s.c.h.b(icon, "icon");
        icon.getLayoutParams().width = aVar.f1548j.e;
        BadgeImageView icon2 = getIcon();
        i.s.c.h.b(icon2, "icon");
        icon2.getLayoutParams().height = aVar.f1548j.e;
        getIcon().setBadgeColor(aVar.f1548j.a);
        getIcon().setImageResource(aVar.f1543d);
        BadgeImageView icon3 = getIcon();
        i.s.c.h.b(icon3, "icon");
        c.f.a.b.f(icon3, aVar.f1545g, aVar.f1548j.b, aVar.f1544f);
        this.f1578k.setTint(aVar.f1547i);
        this.f1579l.setTint(-16777216);
        f();
        View container = getContainer();
        i.s.c.h.b(container, "container");
        c.f.a.f.i.a(container, this.f1578k, this.f1579l);
    }

    @Override // c.f.a.g.f
    public void b(int i2) {
        TextView textView;
        String str;
        this.o = i2;
        if (i2 > 0) {
            TextView countLabel = getCountLabel();
            i.s.c.h.b(countLabel, "countLabel");
            countLabel.setTypeface(this.n);
            textView = getCountLabel();
            i.s.c.h.b(textView, "countLabel");
            str = String.valueOf(this.o);
        } else {
            TextView countLabel2 = getCountLabel();
            i.s.c.h.b(countLabel2, "countLabel");
            countLabel2.setTypeface(Typeface.DEFAULT);
            textView = getCountLabel();
            i.s.c.h.b(textView, "countLabel");
            str = String.valueOf((char) 11044);
        }
        textView.setText(str);
        TextView title = getTitle();
        i.s.c.h.b(title, "title");
        if (!(title.getVisibility() == 0)) {
            getIcon().c(this.o);
        }
    }

    public final void c() {
        f();
        if (this.o >= 0) {
            getIcon().c(this.o);
        }
    }

    public final Animator d(GradientDrawable gradientDrawable, float f2, float f3) {
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(f2, f3);
        ofFloat.addUpdateListener(new a(this, gradientDrawable));
        ofFloat.setDuration(250L);
        i.s.c.h.b(ofFloat, "ObjectAnimator.ofFloat(f…MATION_DURATION\n        }");
        return ofFloat;
    }

    public final void e() {
        float[] fArr;
        if (getLayoutDirection() == 0) {
            float f2 = this.p;
            fArr = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
        } else {
            float f3 = this.p;
            fArr = new float[]{f3, f3, 0.0f, 0.0f, 0.0f, 0.0f, f3, f3};
        }
        TextView title = getTitle();
        i.s.c.h.b(title, "title");
        title.setAlpha(0.0f);
        TextView title2 = getTitle();
        i.s.c.h.b(title2, "title");
        title2.setVisibility(0);
        getTitle().animate().alpha(1.0f).setStartDelay(200).start();
        TextView countLabel = getCountLabel();
        i.s.c.h.b(countLabel, "countLabel");
        countLabel.setVisibility(0);
        View container = getContainer();
        i.s.c.h.b(container, "container");
        c.f.a.b.i(container, j.f1584f);
        BadgeImageView icon = getIcon();
        i.s.c.h.b(icon, "icon");
        c.f.a.b.i(icon, new k(this));
        this.f1579l.setCornerRadii(fArr);
        if (isSelected()) {
            d(this.f1578k, this.p, 0.0f).start();
        } else {
            this.f1578k.setCornerRadii(fArr);
        }
        if (this.o >= 0) {
            BadgeImageView icon2 = getIcon();
            icon2.getOverlay().remove(icon2.f1743g);
            icon2.invalidate();
        }
    }

    public final void f() {
        TextView title = getTitle();
        i.s.c.h.b(title, "title");
        title.setVisibility(8);
        TextView countLabel = getCountLabel();
        i.s.c.h.b(countLabel, "countLabel");
        countLabel.setVisibility(8);
        this.f1579l.setCornerRadius(this.p);
        View container = getContainer();
        i.s.c.h.b(container, "container");
        c.f.a.b.i(container, new b(this));
        BadgeImageView icon = getIcon();
        i.s.c.h.b(icon, "icon");
        c.f.a.b.i(icon, c.f1582f);
        if (isSelected()) {
            d(this.f1578k, 0.0f, this.p).start();
        } else {
            this.f1578k.setCornerRadius(this.p);
        }
    }

    @Override // c.f.a.g.f
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z && isSelected()) {
            setSelected(false);
        }
    }
}
