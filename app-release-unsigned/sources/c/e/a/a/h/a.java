package c.e.a.a.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import c.e.a.a.w.g;
import c.e.a.a.w.j;
import c.e.a.a.w.n;
import com.google.android.material.button.MaterialButton;
import com.tsuga.news.R;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    public final MaterialButton a;
    public j b;

    /* renamed from: c  reason: collision with root package name */
    public int f1208c;

    /* renamed from: d  reason: collision with root package name */
    public int f1209d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f1210f;

    /* renamed from: g  reason: collision with root package name */
    public int f1211g;

    /* renamed from: h  reason: collision with root package name */
    public int f1212h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f1213i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f1214j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f1215k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f1216l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f1217m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;
    public int s;

    public a(MaterialButton materialButton, j jVar) {
        this.a = materialButton;
        this.b = jVar;
    }

    public n a() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    public g b() {
        return c(false);
    }

    public final g c(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final g d() {
        return c(true);
    }

    public void e(j jVar) {
        this.b = jVar;
        if (b() != null) {
            g b2 = b();
            b2.f1340g.a = jVar;
            b2.invalidateSelf();
        }
        if (d() != null) {
            g d2 = d();
            d2.f1340g.a = jVar;
            d2.invalidateSelf();
        }
        if (a() != null) {
            a().setShapeAppearanceModel(jVar);
        }
    }

    public final void f(int i2, int i3) {
        MaterialButton materialButton = this.a;
        AtomicInteger atomicInteger = o.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = this.a.getPaddingTop();
        int paddingEnd = this.a.getPaddingEnd();
        int paddingBottom = this.a.getPaddingBottom();
        int i4 = this.e;
        int i5 = this.f1210f;
        this.f1210f = i3;
        this.e = i2;
        if (!this.o) {
            g();
        }
        this.a.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    public final void g() {
        MaterialButton materialButton = this.a;
        g gVar = new g(this.b);
        gVar.n(this.a.getContext());
        gVar.setTintList(this.f1214j);
        PorterDuff.Mode mode = this.f1213i;
        if (mode != null) {
            gVar.setTintMode(mode);
        }
        gVar.s((float) this.f1212h, this.f1215k);
        g gVar2 = new g(this.b);
        gVar2.setTint(0);
        gVar2.r((float) this.f1212h, this.n ? c.e.a.a.a.f(this.a, R.attr.colorSurface) : 0);
        g gVar3 = new g(this.b);
        this.f1217m = gVar3;
        gVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(c.e.a.a.u.a.a(this.f1216l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f1208c, this.e, this.f1209d, this.f1210f), this.f1217m);
        this.r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b();
        if (b2 != null) {
            b2.o((float) this.s);
        }
    }

    public final void h() {
        g b2 = b();
        g d2 = d();
        if (b2 != null) {
            b2.s((float) this.f1212h, this.f1215k);
            if (d2 != null) {
                d2.r((float) this.f1212h, this.n ? c.e.a.a.a.f(this.a, R.attr.colorSurface) : 0);
            }
        }
    }
}
