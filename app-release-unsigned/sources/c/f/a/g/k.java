package c.f.a.g;

import android.view.ViewGroup;
import i.m;
import i.s.b.l;
import i.s.c.h;
import i.s.c.i;

public final class k extends i implements l<ViewGroup.MarginLayoutParams, m> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f1585f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(h hVar) {
        super(1);
        this.f1585f = hVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // i.s.b.l
    public m o(ViewGroup.MarginLayoutParams marginLayoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        h.f(marginLayoutParams2, "$receiver");
        marginLayoutParams2.setMarginStart(this.f1585f.f1580m);
        marginLayoutParams2.setMarginEnd(this.f1585f.f1580m);
        return m.a;
    }
}
