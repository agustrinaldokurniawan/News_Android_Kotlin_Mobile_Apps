package c.e.b;

import c.e.b.a0.g;
import c.e.b.a0.o;
import c.e.b.a0.z.b;
import c.e.b.a0.z.d;
import c.e.b.a0.z.h;
import c.e.b.a0.z.j;
import c.e.b.a0.z.k;
import c.e.b.a0.z.l;
import c.e.b.a0.z.p;
import c.e.b.a0.z.q;
import c.e.b.c0.c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class i {
    public static final c.e.b.b0.a<?> a = new c.e.b.b0.a<>(Object.class);
    public final ThreadLocal<Map<c.e.b.b0.a<?>, a<?>>> b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<c.e.b.b0.a<?>, x<?>> f1537c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final g f1538d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final List<y> f1539f;

    public static class a<T> extends x<T> {
        public x<T> a;

        @Override // c.e.b.x
        public T a(c.e.b.c0.a aVar) {
            x<T> xVar = this.a;
            if (xVar != null) {
                return xVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // c.e.b.x
        public void b(c cVar, T t) {
            x<T> xVar = this.a;
            if (xVar != null) {
                xVar.b(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public i() {
        o oVar = o.e;
        c cVar = c.IDENTITY;
        Map emptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        List emptyList = Collections.emptyList();
        this.f1538d = new g(emptyMap);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.e.b.a0.z.o.Y);
        arrayList.add(h.a);
        arrayList.add(oVar);
        arrayList.addAll(emptyList);
        arrayList.add(c.e.b.a0.z.o.D);
        arrayList.add(c.e.b.a0.z.o.f1499m);
        arrayList.add(c.e.b.a0.z.o.f1493g);
        arrayList.add(c.e.b.a0.z.o.f1495i);
        arrayList.add(c.e.b.a0.z.o.f1497k);
        x<Number> xVar = c.e.b.a0.z.o.t;
        arrayList.add(new q(Long.TYPE, Long.class, xVar));
        arrayList.add(new q(Double.TYPE, Double.class, new e(this)));
        arrayList.add(new q(Float.TYPE, Float.class, new f(this)));
        arrayList.add(c.e.b.a0.z.o.x);
        arrayList.add(c.e.b.a0.z.o.o);
        arrayList.add(c.e.b.a0.z.o.q);
        arrayList.add(new p(AtomicLong.class, new w(new g(xVar))));
        arrayList.add(new p(AtomicLongArray.class, new w(new h(xVar))));
        arrayList.add(c.e.b.a0.z.o.s);
        arrayList.add(c.e.b.a0.z.o.z);
        arrayList.add(c.e.b.a0.z.o.F);
        arrayList.add(c.e.b.a0.z.o.H);
        arrayList.add(new p(BigDecimal.class, c.e.b.a0.z.o.B));
        arrayList.add(new p(BigInteger.class, c.e.b.a0.z.o.C));
        arrayList.add(c.e.b.a0.z.o.J);
        arrayList.add(c.e.b.a0.z.o.L);
        arrayList.add(c.e.b.a0.z.o.P);
        arrayList.add(c.e.b.a0.z.o.R);
        arrayList.add(c.e.b.a0.z.o.W);
        arrayList.add(c.e.b.a0.z.o.N);
        arrayList.add(c.e.b.a0.z.o.f1491d);
        arrayList.add(c.e.b.a0.z.c.a);
        arrayList.add(c.e.b.a0.z.o.U);
        arrayList.add(l.a);
        arrayList.add(k.a);
        arrayList.add(c.e.b.a0.z.o.S);
        arrayList.add(c.e.b.a0.z.a.a);
        arrayList.add(c.e.b.a0.z.o.b);
        arrayList.add(new b(this.f1538d));
        arrayList.add(new c.e.b.a0.z.g(this.f1538d, false));
        d dVar = new d(this.f1538d);
        this.e = dVar;
        arrayList.add(dVar);
        arrayList.add(c.e.b.a0.z.o.Z);
        arrayList.add(new j(this.f1538d, cVar, oVar, dVar));
        this.f1539f = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public <T> x<T> b(c.e.b.b0.a<T> aVar) {
        x<T> xVar = (x<T>) this.f1537c.get(aVar);
        if (xVar != null) {
            return xVar;
        }
        Map<c.e.b.b0.a<?>, a<?>> map = this.b.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.b.set(map);
            z = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            for (y yVar : this.f1539f) {
                x<T> a2 = yVar.a(this, aVar);
                if (a2 != null) {
                    if (aVar3.a == null) {
                        aVar3.a = a2;
                        this.f1537c.put(aVar, a2);
                        return a2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.7) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.b.remove();
            }
        }
    }

    public <T> x<T> c(y yVar, c.e.b.b0.a<T> aVar) {
        if (!this.f1539f.contains(yVar)) {
            yVar = this.e;
        }
        boolean z = false;
        for (y yVar2 : this.f1539f) {
            if (z) {
                x<T> a2 = yVar2.a(this, aVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (yVar2 == yVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public String toString() {
        return "{serializeNulls:" + false + ",factories:" + this.f1539f + ",instanceCreators:" + this.f1538d + "}";
    }
}
