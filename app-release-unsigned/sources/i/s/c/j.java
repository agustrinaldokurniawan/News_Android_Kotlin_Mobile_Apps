package i.s.c;

public final class j implements c {
    public final Class<?> a;

    public j(Class<?> cls, String str) {
        h.e(cls, "jClass");
        h.e(str, "moduleName");
        this.a = cls;
    }

    @Override // i.s.c.c
    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && h.a(this.a, ((j) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
