package c.a.a.b.b;

import c.a.a.b.b.m;
import c.a.a.b.b.o.b.d.a;
import h.a.s.e.a.b;
import h.a.s.e.a.c;
import i.s.c.h;
import java.util.ArrayList;
import java.util.Objects;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ l e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f346f;

    public /* synthetic */ f(l lVar, a aVar) {
        this.e = lVar;
        this.f346f = aVar;
    }

    public final void run() {
        l lVar = this.e;
        a aVar = this.f346f;
        h.e(lVar, "this$0");
        m.a aVar2 = (m.a) lVar;
        T<c.a.a.b.b.o.b.e.a> t = ((a.c) aVar).a;
        h.e(t, "data");
        h.e(t, "input");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(h.a.t.a.l(t, 10));
        for (c.a.a.b.b.o.b.e.a aVar3 : t) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new c.a.a.b.b.o.a.b.a(aVar3.a, aVar3.b, aVar3.f364c, aVar3.f365d, aVar3.e, aVar3.f366f, aVar3.f367g, aVar3.f368h, false))));
        }
        c.a.a.b.b.o.a.a aVar4 = aVar2.f351d.b;
        Objects.requireNonNull(aVar4);
        h.e(arrayList, "newsList");
        h.a.a d2 = aVar4.a.d(arrayList);
        h.a.m mVar = h.a.u.a.f3281c;
        Objects.requireNonNull(d2);
        Objects.requireNonNull(mVar, "scheduler is null");
        try {
            b bVar = new b(new h.a.s.d.a(), h.a.o.a.a.a());
            try {
                c cVar = new c(bVar, d2);
                bVar.d(cVar);
                h.a.s.a.b.c(cVar.f3092f, mVar.b(cVar));
                h.a.c a = lVar.a();
                a.h(h.a.u.a.b).d(h.a.o.a.a.a()).i(1).e(new a(a, lVar), h.a.s.b.a.f3089d, h.a.s.b.a.b, h.a.s.e.b.f.INSTANCE);
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                c.f.a.b.h(th);
                h.a.t.a.M(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } catch (NullPointerException e3) {
            throw e3;
        } catch (Throwable th2) {
            c.f.a.b.h(th2);
            h.a.t.a.M(th2);
            NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException2.initCause(th2);
            throw nullPointerException2;
        }
    }
}
