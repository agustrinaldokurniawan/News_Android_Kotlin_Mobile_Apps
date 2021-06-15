package c.b.a;

import java.util.Arrays;

public final class s<V> {
    public final V a;
    public final Throwable b;

    public s(V v) {
        this.a = v;
        this.b = null;
    }

    public s(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        V v = this.a;
        if (v != null && v.equals(sVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || sVar.b == null) {
            return false;
        }
        return th.toString().equals(this.b.toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
