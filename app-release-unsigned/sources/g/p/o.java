package g.p;

public final class o {
    public boolean a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2861c;

    /* renamed from: d  reason: collision with root package name */
    public int f2862d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f2863f;

    /* renamed from: g  reason: collision with root package name */
    public int f2864g;

    public o(boolean z, int i2, boolean z2, int i3, int i4, int i5, int i6) {
        this.a = z;
        this.b = i2;
        this.f2861c = z2;
        this.f2862d = i3;
        this.e = i4;
        this.f2863f = i5;
        this.f2864g = i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b == oVar.b && this.f2861c == oVar.f2861c && this.f2862d == oVar.f2862d && this.e == oVar.e && this.f2863f == oVar.f2863f && this.f2864g == oVar.f2864g;
    }

    public int hashCode() {
        return ((((((((((((this.a ? 1 : 0) * 31) + this.b) * 31) + (this.f2861c ? 1 : 0)) * 31) + this.f2862d) * 31) + this.e) * 31) + this.f2863f) * 31) + this.f2864g;
    }
}
