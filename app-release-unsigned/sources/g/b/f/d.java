package g.b.f;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import g.b.f.a;
import g.b.f.i.g;
import g.b.g.c;
import java.lang.ref.WeakReference;

public class d extends a implements g.a {

    /* renamed from: g  reason: collision with root package name */
    public Context f1920g;

    /* renamed from: h  reason: collision with root package name */
    public ActionBarContextView f1921h;

    /* renamed from: i  reason: collision with root package name */
    public a.AbstractC0064a f1922i;

    /* renamed from: j  reason: collision with root package name */
    public WeakReference<View> f1923j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1924k;

    /* renamed from: l  reason: collision with root package name */
    public g f1925l;

    public d(Context context, ActionBarContextView actionBarContextView, a.AbstractC0064a aVar, boolean z) {
        this.f1920g = context;
        this.f1921h = actionBarContextView;
        this.f1922i = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.f1996m = 1;
        this.f1925l = gVar;
        gVar.f1989f = this;
    }

    @Override // g.b.f.i.g.a
    public boolean a(g gVar, MenuItem menuItem) {
        return this.f1922i.b(this, menuItem);
    }

    @Override // g.b.f.i.g.a
    public void b(g gVar) {
        i();
        c cVar = this.f1921h.f2032h;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // g.b.f.a
    public void c() {
        if (!this.f1924k) {
            this.f1924k = true;
            this.f1921h.sendAccessibilityEvent(32);
            this.f1922i.d(this);
        }
    }

    @Override // g.b.f.a
    public View d() {
        WeakReference<View> weakReference = this.f1923j;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // g.b.f.a
    public Menu e() {
        return this.f1925l;
    }

    @Override // g.b.f.a
    public MenuInflater f() {
        return new f(this.f1921h.getContext());
    }

    @Override // g.b.f.a
    public CharSequence g() {
        return this.f1921h.getSubtitle();
    }

    @Override // g.b.f.a
    public CharSequence h() {
        return this.f1921h.getTitle();
    }

    @Override // g.b.f.a
    public void i() {
        this.f1922i.a(this, this.f1925l);
    }

    @Override // g.b.f.a
    public boolean j() {
        return this.f1921h.w;
    }

    @Override // g.b.f.a
    public void k(View view) {
        this.f1921h.setCustomView(view);
        this.f1923j = view != null ? new WeakReference<>(view) : null;
    }

    @Override // g.b.f.a
    public void l(int i2) {
        this.f1921h.setSubtitle(this.f1920g.getString(i2));
    }

    @Override // g.b.f.a
    public void m(CharSequence charSequence) {
        this.f1921h.setSubtitle(charSequence);
    }

    @Override // g.b.f.a
    public void n(int i2) {
        this.f1921h.setTitle(this.f1920g.getString(i2));
    }

    @Override // g.b.f.a
    public void o(CharSequence charSequence) {
        this.f1921h.setTitle(charSequence);
    }

    @Override // g.b.f.a
    public void p(boolean z) {
        this.f1917f = z;
        this.f1921h.setTitleOptional(z);
    }
}
