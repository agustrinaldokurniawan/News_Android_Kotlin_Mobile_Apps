package c.f.a.f;

import android.view.View;
import android.view.WindowInsets;
import i.m;
import i.s.b.q;
import i.s.c.h;
import i.s.c.i;

public final class c extends i implements q<View, WindowInsets, b, m> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f1554f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f1555g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f1556h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f1557i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(boolean z, boolean z2, boolean z3, boolean z4) {
        super(3);
        this.f1554f = z;
        this.f1555g = z2;
        this.f1556h = z3;
        this.f1557i = z4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // i.s.b.q
    public m j(View view, WindowInsets windowInsets, b bVar) {
        View view2 = view;
        WindowInsets windowInsets2 = windowInsets;
        b bVar2 = bVar;
        h.f(view2, "view");
        h.f(windowInsets2, "windowInsets");
        h.f(bVar2, "initialPadding");
        int i2 = bVar2.a;
        Integer valueOf = Integer.valueOf(windowInsets2.getSystemWindowInsetLeft());
        valueOf.intValue();
        Integer num = null;
        if (!this.f1554f) {
            valueOf = null;
        }
        int i3 = 0;
        int intValue = i2 + (valueOf != null ? valueOf.intValue() : 0);
        int i4 = bVar2.b;
        Integer valueOf2 = Integer.valueOf(windowInsets2.getSystemWindowInsetTop());
        valueOf2.intValue();
        if (!this.f1555g) {
            valueOf2 = null;
        }
        int intValue2 = i4 + (valueOf2 != null ? valueOf2.intValue() : 0);
        int i5 = bVar2.f1552c;
        Integer valueOf3 = Integer.valueOf(windowInsets2.getSystemWindowInsetRight());
        valueOf3.intValue();
        if (!this.f1556h) {
            valueOf3 = null;
        }
        int intValue3 = i5 + (valueOf3 != null ? valueOf3.intValue() : 0);
        int i6 = bVar2.f1553d;
        Integer valueOf4 = Integer.valueOf(windowInsets2.getSystemWindowInsetBottom());
        valueOf4.intValue();
        if (this.f1557i) {
            num = valueOf4;
        }
        if (num != null) {
            i3 = num.intValue();
        }
        view2.setPadding(intValue, intValue2, intValue3, i6 + i3);
        return m.a;
    }
}
