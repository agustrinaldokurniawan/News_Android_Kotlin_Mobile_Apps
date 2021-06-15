package g.h.d;

import android.graphics.Insets;
import c.c.a.a.a;

public final class b {
    public static final b a = new b(0, 0, 0, 0);
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2475c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2476d;
    public final int e;

    public b(int i2, int i3, int i4, int i5) {
        this.b = i2;
        this.f2475c = i3;
        this.f2476d = i4;
        this.e = i5;
    }

    public static b a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? a : new b(i2, i3, i4, i5);
    }

    public Insets b() {
        return Insets.of(this.b, this.f2475c, this.f2476d, this.e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.e == bVar.e && this.b == bVar.b && this.f2476d == bVar.f2476d && this.f2475c == bVar.f2475c;
    }

    public int hashCode() {
        return (((((this.b * 31) + this.f2475c) * 31) + this.f2476d) * 31) + this.e;
    }

    public String toString() {
        StringBuilder f2 = a.f("Insets{left=");
        f2.append(this.b);
        f2.append(", top=");
        f2.append(this.f2475c);
        f2.append(", right=");
        f2.append(this.f2476d);
        f2.append(", bottom=");
        f2.append(this.e);
        f2.append('}');
        return f2.toString();
    }
}
