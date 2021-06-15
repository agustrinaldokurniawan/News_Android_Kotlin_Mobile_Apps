package l.a.c.l;

import i.s.c.h;

public final class b implements a {
    public final String a;

    public b(String str) {
        h.e(str, "value");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.a(this.a, ((b) obj).a);
    }

    @Override // l.a.c.l.a
    public String getValue() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
