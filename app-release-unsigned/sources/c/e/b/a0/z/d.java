package c.e.b.a0.z;

import c.e.b.a0.g;
import c.e.b.b0.a;
import c.e.b.i;
import c.e.b.m;
import c.e.b.u;
import c.e.b.w;
import c.e.b.x;
import c.e.b.y;

public final class d implements y {
    public final g e;

    public d(g gVar) {
        this.e = gVar;
    }

    @Override // c.e.b.y
    public <T> x<T> a(i iVar, a<T> aVar) {
        c.e.b.z.a aVar2 = (c.e.b.z.a) aVar.a.getAnnotation(c.e.b.z.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (x<T>) b(this.e, iVar, aVar, aVar2);
    }

    public x<?> b(g gVar, i iVar, a<?> aVar, c.e.b.z.a aVar2) {
        x<?> xVar;
        Object a = gVar.a(new a(aVar2.value())).a();
        if (a instanceof x) {
            xVar = (x) a;
        } else if (a instanceof y) {
            xVar = ((y) a).a(iVar, aVar);
        } else {
            boolean z = a instanceof u;
            if (z || (a instanceof m)) {
                m mVar = null;
                u uVar = z ? (u) a : null;
                if (a instanceof m) {
                    mVar = (m) a;
                }
                xVar = new m<>(uVar, mVar, iVar, aVar, null);
            } else {
                StringBuilder f2 = c.c.a.a.a.f("Invalid attempt to bind an instance of ");
                f2.append(a.getClass().getName());
                f2.append(" as a @JsonAdapter for ");
                f2.append(aVar.toString());
                f2.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(f2.toString());
            }
        }
        return (xVar == null || !aVar2.nullSafe()) ? xVar : new w(xVar);
    }
}
