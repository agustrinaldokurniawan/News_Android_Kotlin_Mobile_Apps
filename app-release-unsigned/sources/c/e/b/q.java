package c.e.b;

import c.e.b.a0.s;

public final class q extends n {
    public final s<String, n> a = new s<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof q) && ((q) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
