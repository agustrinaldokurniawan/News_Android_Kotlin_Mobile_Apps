package i.q;

import i.q.f;
import i.s.b.p;
import i.s.c.h;
import i.s.c.i;
import java.io.Serializable;
import java.util.Objects;

public final class c implements f, Serializable {
    public final f e;

    /* renamed from: f  reason: collision with root package name */
    public final f.a f3301f;

    public static final class a extends i implements p<String, f.a, String> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f3302f = new a();

        public a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // i.s.b.p
        public String k(String str, f.a aVar) {
            String str2 = str;
            f.a aVar2 = aVar;
            h.e(str2, "acc");
            h.e(aVar2, "element");
            if (str2.length() == 0) {
                return aVar2.toString();
            }
            return str2 + ", " + aVar2;
        }
    }

    public c(f fVar, f.a aVar) {
        h.e(fVar, "left");
        h.e(aVar, "element");
        this.e = fVar;
        this.f3301f = aVar;
    }

    public final int a() {
        int i2 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.e;
            if (!(fVar instanceof c)) {
                fVar = null;
            }
            cVar = (c) fVar;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.a() != a()) {
                return false;
            }
            Objects.requireNonNull(cVar);
            c cVar2 = this;
            while (true) {
                f.a aVar = cVar2.f3301f;
                if (h.a(cVar.get(aVar.getKey()), aVar)) {
                    f fVar = cVar2.e;
                    if (!(fVar instanceof c)) {
                        Objects.requireNonNull(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f.a aVar2 = (f.a) fVar;
                        z = h.a(cVar.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    cVar2 = (c) fVar;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // i.q.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        h.e(pVar, "operation");
        return (R) pVar.k((Object) this.e.fold(r, pVar), this.f3301f);
    }

    @Override // i.q.f
    public <E extends f.a> E get(f.b<E> bVar) {
        h.e(bVar, "key");
        c cVar = this;
        while (true) {
            E e2 = (E) cVar.f3301f.get(bVar);
            if (e2 != null) {
                return e2;
            }
            f fVar = cVar.e;
            if (!(fVar instanceof c)) {
                return (E) fVar.get(bVar);
            }
            cVar = (c) fVar;
        }
    }

    public int hashCode() {
        return this.f3301f.hashCode() + this.e.hashCode();
    }

    @Override // i.q.f
    public f minusKey(f.b<?> bVar) {
        h.e(bVar, "key");
        if (this.f3301f.get(bVar) != null) {
            return this.e;
        }
        f minusKey = this.e.minusKey(bVar);
        return minusKey == this.e ? this : minusKey == h.e ? this.f3301f : new c(minusKey, this.f3301f);
    }

    public String toString() {
        return c.c.a.a.a.e(c.c.a.a.a.f("["), (String) fold("", a.f3302f), "]");
    }
}
