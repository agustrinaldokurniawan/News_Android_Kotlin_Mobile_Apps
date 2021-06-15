package c.f.a.g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c.f.a.b;
import c.f.a.f.i;
import com.ismaeldivita.chipnavigation.view.BadgeImageView;
import com.tsuga.news.R;
import h.a.t.a;
import i.c;
import i.s.c.h;
import i.s.c.l;
import i.s.c.p;
import i.s.c.q;
import java.util.Objects;

public final class e extends f {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ i.v.e[] f1567f;

    /* renamed from: g  reason: collision with root package name */
    public final c f1568g = a.F(new d(this));

    /* renamed from: h  reason: collision with root package name */
    public final c f1569h = a.F(new c(this));

    /* renamed from: i  reason: collision with root package name */
    public final c f1570i = a.F(new b(this));

    /* renamed from: j  reason: collision with root package name */
    public Drawable f1571j;

    static {
        l lVar = new l(p.a(e.class), "title", "getTitle()Landroid/widget/TextView;");
        q qVar = p.a;
        Objects.requireNonNull(qVar);
        l lVar2 = new l(p.a(e.class), "icon", "getIcon()Lcom/ismaeldivita/chipnavigation/view/BadgeImageView;");
        Objects.requireNonNull(qVar);
        l lVar3 = new l(p.a(e.class), "container", "getContainer()Landroid/view/View;");
        Objects.requireNonNull(qVar);
        f1567f = new i.v.e[]{lVar, lVar2, lVar3};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i2) {
        super(context, null);
        int i3 = i2 & 2;
        h.f(context, "context");
        View.inflate(getContext(), R.layout.cnb_horizontal_menu_item, this);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
    }

    private final View getContainer() {
        c cVar = this.f1570i;
        i.v.e eVar = f1567f[2];
        return (View) cVar.getValue();
    }

    private final BadgeImageView getIcon() {
        c cVar = this.f1569h;
        i.v.e eVar = f1567f[1];
        return (BadgeImageView) cVar.getValue();
    }

    private final TextView getTitle() {
        c cVar = this.f1568g;
        i.v.e eVar = f1567f[0];
        return (TextView) cVar.getValue();
    }

    @Override // c.f.a.g.f
    public void a(c.f.a.e.a aVar) {
        h.f(aVar, "item");
        setId(aVar.a);
        setImportantForAccessibility(1);
        CharSequence charSequence = aVar.f1542c;
        if (charSequence == null) {
            charSequence = aVar.b;
        }
        setContentDescription(charSequence);
        setEnabled(aVar.e);
        Integer num = aVar.f1548j.f1549c;
        if (num != null) {
            getTitle().setTextAppearance(num.intValue());
        }
        TextView title = getTitle();
        h.b(title, "title");
        title.setText(aVar.b);
        getTitle().setTextColor(aVar.f1546h);
        TextView title2 = getTitle();
        h.b(title2, "title");
        b.g(title2, aVar.f1546h, aVar.f1548j.b);
        BadgeImageView icon = getIcon();
        h.b(icon, "icon");
        icon.getLayoutParams().width = aVar.f1548j.e;
        BadgeImageView icon2 = getIcon();
        h.b(icon2, "icon");
        icon2.getLayoutParams().height = aVar.f1548j.e;
        getIcon().setImageResource(aVar.f1543d);
        getIcon().setBadgeColor(aVar.f1548j.a);
        BadgeImageView icon3 = getIcon();
        h.b(icon3, "icon");
        b.f(icon3, aVar.f1545g, aVar.f1548j.b, aVar.f1544f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(aVar.f1548j.f1550d);
        gradientDrawable.setTint(aVar.f1547i);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(aVar.f1548j.f1550d);
        gradientDrawable2.setTint(-16777216);
        this.f1571j = gradientDrawable2;
        View container = getContainer();
        h.b(container, "container");
        Drawable drawable = this.f1571j;
        if (drawable != null) {
            i.a(container, gradientDrawable, drawable);
        } else {
            h.k("mask");
            throw null;
        }
    }

    @Override // c.f.a.g.f
    public void b(int i2) {
        getIcon().c(i2);
    }

    @Override // c.f.a.g.f
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z && isSelected()) {
            setSelected(false);
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        int i2 = 8;
        if (z) {
            View container = getContainer();
            h.b(container, "container");
            container.setVisibility(8);
            Drawable drawable = this.f1571j;
            if (drawable != null) {
                drawable.jumpToCurrentState();
                View container2 = getContainer();
                h.b(container2, "container");
                i2 = 0;
                container2.setVisibility(0);
            } else {
                h.k("mask");
                throw null;
            }
        }
        TextView title = getTitle();
        h.b(title, "title");
        title.setVisibility(i2);
    }
}
