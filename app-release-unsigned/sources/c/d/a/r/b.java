package c.d.a.r;

import c.c.a.a.a;
import c.d.a.m.m;
import java.security.MessageDigest;
import java.util.Objects;

public final class b implements m {
    public final Object b;

    public b(Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(m.a));
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.b.equals(((b) obj).b);
        }
        return false;
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder f2 = a.f("ObjectKey{object=");
        f2.append(this.b);
        f2.append('}');
        return f2.toString();
    }
}
