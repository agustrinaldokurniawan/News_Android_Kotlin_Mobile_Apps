package c.e.b.a0.z;

import c.e.b.c0.c;
import c.e.b.i;
import c.e.b.v;
import c.e.b.x;
import c.e.b.y;

public class s implements y {
    public final /* synthetic */ Class e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f1505f;

    public class a extends x<T1> {
        public final /* synthetic */ Class a;

        public a(Class cls) {
            this.a = cls;
        }

        @Override // c.e.b.x
        public T1 a(c.e.b.c0.a aVar) {
            T1 t1 = (T1) s.this.f1505f.a(aVar);
            if (t1 == null || this.a.isInstance(t1)) {
                return t1;
            }
            StringBuilder f2 = c.c.a.a.a.f("Expected a ");
            f2.append(this.a.getName());
            f2.append(" but was ");
            f2.append(t1.getClass().getName());
            throw new v(f2.toString());
        }

        @Override // c.e.b.x
        public void b(c cVar, T1 t1) {
            s.this.f1505f.b(cVar, t1);
        }
    }

    public s(Class cls, x xVar) {
        this.e = cls;
        this.f1505f = xVar;
    }

    @Override // c.e.b.y
    public <T2> x<T2> a(i iVar, c.e.b.b0.a<T2> aVar) {
        Class<? super T> cls = aVar.a;
        if (!this.e.isAssignableFrom(cls)) {
            return null;
        }
        return new a(cls);
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Factory[typeHierarchy=");
        f2.append(this.e.getName());
        f2.append(",adapter=");
        f2.append(this.f1505f);
        f2.append("]");
        return f2.toString();
    }
}
