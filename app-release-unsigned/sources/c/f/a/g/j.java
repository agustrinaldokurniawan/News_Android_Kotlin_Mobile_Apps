package c.f.a.g;

import android.view.ViewGroup;
import i.m;
import i.s.b.l;
import i.s.c.h;
import i.s.c.i;

public final class j extends i implements l<ViewGroup.MarginLayoutParams, m> {

    /* renamed from: f  reason: collision with root package name */
    public static final j f1584f = new j();

    public j() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // i.s.b.l
    public m o(ViewGroup.MarginLayoutParams marginLayoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        h.f(marginLayoutParams2, "$receiver");
        marginLayoutParams2.setMarginStart(0);
        return m.a;
    }
}
