package i.u;

public final class c extends a {

    /* renamed from: h  reason: collision with root package name */
    public static final c f3325h = new c(1, 0);

    /* renamed from: i  reason: collision with root package name */
    public static final c f3326i = null;

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    @Override // i.u.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(this.e == cVar.e && this.f3320f == cVar.f3320f)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // i.u.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.e * 31) + this.f3320f;
    }

    @Override // i.u.a
    public boolean isEmpty() {
        return this.e > this.f3320f;
    }

    @Override // i.u.a
    public String toString() {
        return this.e + ".." + this.f3320f;
    }
}
