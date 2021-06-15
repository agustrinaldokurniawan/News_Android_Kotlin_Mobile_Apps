package c.e.b.a0;

import c.e.b.c0.c;
import c.e.b.i;
import c.e.b.x;
import c.e.b.y;
import java.util.Collections;
import java.util.List;

public final class o implements y, Cloneable {
    public static final o e = new o();

    /* renamed from: f  reason: collision with root package name */
    public List<c.e.b.a> f1450f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public List<c.e.b.a> f1451g = Collections.emptyList();

    public class a extends x<T> {
        public x<T> a;
        public final /* synthetic */ boolean b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f1452c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i f1453d;
        public final /* synthetic */ c.e.b.b0.a e;

        public a(boolean z, boolean z2, i iVar, c.e.b.b0.a aVar) {
            this.b = z;
            this.f1452c = z2;
            this.f1453d = iVar;
            this.e = aVar;
        }

        @Override // c.e.b.x
        public T a(c.e.b.c0.a aVar) {
            if (this.b) {
                aVar.u0();
                return null;
            }
            x<T> xVar = this.a;
            if (xVar == null) {
                xVar = this.f1453d.c(o.this, this.e);
                this.a = xVar;
            }
            return xVar.a(aVar);
        }

        @Override // c.e.b.x
        public void b(c cVar, T t) {
            if (this.f1452c) {
                cVar.b0();
                return;
            }
            x<T> xVar = this.a;
            if (xVar == null) {
                xVar = this.f1453d.c(o.this, this.e);
                this.a = xVar;
            }
            xVar.b(cVar, t);
        }
    }

    @Override // c.e.b.y
    public <T> x<T> a(i iVar, c.e.b.b0.a<T> aVar) {
        Class<? super T> cls = aVar.a;
        boolean f2 = f(cls);
        boolean z = f2 || d(cls, true);
        boolean z2 = f2 || d(cls, false);
        if (z || z2) {
            return new a(z2, z, iVar, aVar);
        }
        return null;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return (o) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean d(Class<?> cls, boolean z) {
        for (c.e.b.a aVar : z ? this.f1450f : this.f1451g) {
            if (aVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }
}
