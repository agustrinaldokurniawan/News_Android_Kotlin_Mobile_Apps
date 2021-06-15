package g.r;

import g.r.i;
import h.a.d;
import h.a.e;
import h.a.p.c;
import h.a.s.e.b.b;
import java.util.Set;

public class m implements e<Object> {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ j b;

    public class a extends i.c {
        public final /* synthetic */ d b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m mVar, String[] strArr, d dVar) {
            super(strArr);
            this.b = dVar;
        }

        @Override // g.r.i.c
        public void a(Set<String> set) {
            if (!((b.a) this.b).d()) {
                this.b.c(n.a);
            }
        }
    }

    public class b implements h.a.r.a {
        public final /* synthetic */ i.c a;

        public b(i.c cVar) {
            this.a = cVar;
        }

        @Override // h.a.r.a
        public void run() {
            m.this.b.e.c(this.a);
        }
    }

    public m(String[] strArr, j jVar) {
        this.a = strArr;
        this.b = jVar;
    }

    public void a(d<Object> dVar) {
        a aVar = new a(this, this.a, dVar);
        b.a aVar2 = (b.a) dVar;
        if (!aVar2.d()) {
            this.b.e.a(aVar);
            h.a.p.a aVar3 = new h.a.p.a(new b(aVar));
            h.a.s.a.e eVar = aVar2.f3097f;
            while (true) {
                c cVar = (c) eVar.get();
                if (cVar == h.a.s.a.b.DISPOSED) {
                    aVar3.e();
                    break;
                } else if (eVar.compareAndSet(cVar, aVar3)) {
                    if (cVar != null) {
                        cVar.e();
                    }
                }
            }
        }
        if (!aVar2.d()) {
            aVar2.c(n.a);
        }
    }
}
