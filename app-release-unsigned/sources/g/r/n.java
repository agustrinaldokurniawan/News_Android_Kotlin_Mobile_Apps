package g.r;

import h.a.g;
import h.a.i;
import h.a.m;
import h.a.r.c;
import h.a.s.e.b.b;
import h.a.s.e.b.d;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class n {
    public static final Object a = new Object();

    public class a implements c<Object, i<T>> {
        public final /* synthetic */ g a;

        public a(g gVar) {
            this.a = gVar;
        }

        @Override // h.a.r.c
        public Object a(Object obj) {
            return this.a;
        }
    }

    public static <T> h.a.c<T> a(j jVar, boolean z, String[] strArr, Callable<T> callable) {
        Executor executor;
        if (z) {
            executor = jVar.f2976c;
        } else {
            executor = jVar.b;
        }
        m mVar = h.a.u.a.a;
        h.a.s.g.c cVar = new h.a.s.g.c(executor, false);
        h.a.s.e.c.a aVar = new h.a.s.e.c.a(callable);
        m mVar2 = new m(strArr, jVar);
        int i2 = h.a.c.e;
        h.a.c<T> d2 = new b(mVar2, 5).h(cVar).j(cVar).d(cVar);
        a aVar2 = new a(aVar);
        h.a.s.b.b.a(Integer.MAX_VALUE, "maxConcurrency");
        return new d(d2, aVar2, false, Integer.MAX_VALUE);
    }
}
