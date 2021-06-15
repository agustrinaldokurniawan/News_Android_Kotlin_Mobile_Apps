package c.d.a.s;

import c.c.a.a.a;

public class i {
    public Class<?> a;
    public Class<?> b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f1165c;

    public i() {
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.f1165c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b) && j.b(this.f1165c, iVar.f1165c);
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.f1165c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder f2 = a.f("MultiClassKey{first=");
        f2.append(this.a);
        f2.append(", second=");
        f2.append(this.b);
        f2.append('}');
        return f2.toString();
    }
}
