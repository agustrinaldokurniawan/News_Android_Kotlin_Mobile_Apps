package i.u;

import java.util.Iterator;

public class a implements Iterable<Integer>, i.s.c.s.a {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3320f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3321g;

    public a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i4 != Integer.MIN_VALUE) {
            this.e = i2;
            if (i4 > 0) {
                if (i2 < i3) {
                    i3 -= h.a.t.a.J(h.a.t.a.J(i3, i4) - h.a.t.a.J(i2, i4), i4);
                }
            } else if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i2 > i3) {
                int i5 = -i4;
                i3 += h.a.t.a.J(h.a.t.a.J(i2, i5) - h.a.t.a.J(i3, i5), i5);
            }
            this.f3320f = i3;
            this.f3321g = i4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.e == aVar.e && this.f3320f == aVar.f3320f && this.f3321g == aVar.f3321g)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.e * 31) + this.f3320f) * 31) + this.f3321g;
    }

    public boolean isEmpty() {
        if (this.f3321g > 0) {
            if (this.e > this.f3320f) {
                return true;
            }
        } else if (this.e < this.f3320f) {
            return true;
        }
        return false;
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new b(this.e, this.f3320f, this.f3321g);
    }

    public String toString() {
        int i2;
        StringBuilder sb;
        if (this.f3321g > 0) {
            sb = new StringBuilder();
            sb.append(this.e);
            sb.append("..");
            sb.append(this.f3320f);
            sb.append(" step ");
            i2 = this.f3321g;
        } else {
            sb = new StringBuilder();
            sb.append(this.e);
            sb.append(" downTo ");
            sb.append(this.f3320f);
            sb.append(" step ");
            i2 = -this.f3321g;
        }
        sb.append(i2);
        return sb.toString();
    }
}
