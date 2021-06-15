package c.e.b.a0.z;

import c.e.b.a0.s;
import c.e.b.c0.c;
import c.e.b.i;
import c.e.b.x;
import c.e.b.y;
import java.util.ArrayList;
import java.util.Objects;

public final class h extends x<Object> {
    public static final y a = new a();
    public final i b;

    public class a implements y {
        @Override // c.e.b.y
        public <T> x<T> a(i iVar, c.e.b.b0.a<T> aVar) {
            if (aVar.a == Object.class) {
                return new h(iVar);
            }
            return null;
        }
    }

    public h(i iVar) {
        this.b = iVar;
    }

    @Override // c.e.b.x
    public Object a(c.e.b.c0.a aVar) {
        int ordinal = aVar.p0().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.b0()) {
                arrayList.add(a(aVar));
            }
            aVar.u();
            return arrayList;
        } else if (ordinal == 2) {
            s sVar = new s();
            aVar.c();
            while (aVar.b0()) {
                sVar.put(aVar.j0(), a(aVar));
            }
            aVar.K();
            return sVar;
        } else if (ordinal == 5) {
            return aVar.n0();
        } else {
            if (ordinal == 6) {
                return Double.valueOf(aVar.g0());
            }
            if (ordinal == 7) {
                return Boolean.valueOf(aVar.f0());
            }
            if (ordinal == 8) {
                aVar.l0();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    @Override // c.e.b.x
    public void b(c cVar, Object obj) {
        if (obj == null) {
            cVar.b0();
            return;
        }
        i iVar = this.b;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(iVar);
        x b2 = iVar.b(new c.e.b.b0.a(cls));
        if (b2 instanceof h) {
            cVar.e();
            cVar.K();
            return;
        }
        b2.b(cVar, obj);
    }
}
