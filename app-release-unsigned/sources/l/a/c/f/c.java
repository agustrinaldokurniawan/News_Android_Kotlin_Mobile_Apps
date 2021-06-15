package l.a.c.f;

import c.c.a.a.a;

public final class c {
    public boolean a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3794c;

    public c() {
        this(false, false, false, 7);
    }

    public c(boolean z, boolean z2, boolean z3, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        z3 = (i2 & 4) != 0 ? false : z3;
        this.a = z;
        this.b = z2;
        this.f3794c = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && this.f3794c == cVar.f3794c;
    }

    public int hashCode() {
        boolean z = this.a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f3794c;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        return i10 + i2;
    }

    public String toString() {
        StringBuilder f2 = a.f("Options(isCreatedAtStart=");
        f2.append(this.a);
        f2.append(", override=");
        f2.append(this.b);
        f2.append(", isExtraDefinition=");
        f2.append(this.f3794c);
        f2.append(')');
        return f2.toString();
    }
}
