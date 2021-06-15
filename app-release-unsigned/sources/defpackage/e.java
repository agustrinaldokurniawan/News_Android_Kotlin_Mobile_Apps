package defpackage;

import android.app.Application;
import android.content.Context;
import i.m;
import i.s.b.l;
import i.s.c.h;
import i.s.c.i;
import i.s.c.p;
import java.util.List;
import l.a.c.f.b;
import l.a.c.f.c;
import l.a.c.j.a;

/* renamed from: e  reason: default package */
public final class e extends i implements l<a, m> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1842f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f1843g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(int i2, Object obj) {
        super(1);
        this.f1842f = i2;
        this.f1843g = obj;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // i.s.b.l
    public final m o(a aVar) {
        b bVar = b.Single;
        int i2 = this.f1842f;
        if (i2 == 0) {
            a aVar2 = aVar;
            h.e(aVar2, "$this$module");
            l.a.a.b.a.a aVar3 = new l.a.a.b.a.a((Context) this.f1843g);
            c a = aVar2.a(false, false);
            l.a.c.f.a aVar4 = new l.a.c.f.a(aVar2.f3801c, p.a(Context.class), null, aVar3, bVar, i.o.h.e, a, null, 128);
            h.a.t.a.c(aVar2.f3803f, aVar4);
            i.v.b a2 = p.a(Application.class);
            h.e(aVar4, "<this>");
            h.e(a2, "clazz");
            List<? extends i.v.b<?>> l2 = i.o.e.l(aVar4.f3788f, a2);
            h.e(l2, "<set-?>");
            aVar4.f3788f = l2;
            return m.a;
        } else if (i2 == 1) {
            a aVar5 = aVar;
            h.e(aVar5, "$this$module");
            l.a.a.b.a.b bVar2 = new l.a.a.b.a.b((Context) this.f1843g);
            c a3 = aVar5.a(false, false);
            h.a.t.a.c(aVar5.f3803f, new l.a.c.f.a(aVar5.f3801c, p.a(Context.class), null, bVar2, bVar, i.o.h.e, a3, null, 128));
            return m.a;
        } else {
            throw null;
        }
    }
}
