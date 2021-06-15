package g.b.f.i;

import android.content.Context;
import android.view.LayoutInflater;
import g.b.f.i.m;

public abstract class b implements m {
    public Context e;

    /* renamed from: f  reason: collision with root package name */
    public Context f1956f;

    /* renamed from: g  reason: collision with root package name */
    public g f1957g;

    /* renamed from: h  reason: collision with root package name */
    public LayoutInflater f1958h;

    /* renamed from: i  reason: collision with root package name */
    public m.a f1959i;

    /* renamed from: j  reason: collision with root package name */
    public int f1960j;

    /* renamed from: k  reason: collision with root package name */
    public int f1961k;

    /* renamed from: l  reason: collision with root package name */
    public n f1962l;

    public b(Context context, int i2, int i3) {
        this.e = context;
        this.f1958h = LayoutInflater.from(context);
        this.f1960j = i2;
        this.f1961k = i3;
    }

    @Override // g.b.f.i.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // g.b.f.i.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // g.b.f.i.m
    public void h(m.a aVar) {
        this.f1959i = aVar;
    }
}
