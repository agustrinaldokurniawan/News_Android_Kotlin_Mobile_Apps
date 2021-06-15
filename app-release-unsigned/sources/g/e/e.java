package g.e;

public class e<E> implements Cloneable {
    public static final Object e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public boolean f2230f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f2231g;

    /* renamed from: h  reason: collision with root package name */
    public Object[] f2232h;

    /* renamed from: i  reason: collision with root package name */
    public int f2233i;

    public e() {
        this(10);
    }

    public e(int i2) {
        this.f2230f = false;
        if (i2 == 0) {
            this.f2231g = d.b;
            this.f2232h = d.f2229c;
            return;
        }
        int f2 = d.f(i2);
        this.f2231g = new long[f2];
        this.f2232h = new Object[f2];
    }

    public void a() {
        int i2 = this.f2233i;
        Object[] objArr = this.f2232h;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2233i = 0;
        this.f2230f = false;
    }

    /* renamed from: d */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f2231g = (long[]) this.f2231g.clone();
            eVar.f2232h = (Object[]) this.f2232h.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void f() {
        int i2 = this.f2233i;
        long[] jArr = this.f2231g;
        Object[] objArr = this.f2232h;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2230f = false;
        this.f2233i = i3;
    }

    public E g(long j2) {
        return h(j2, null);
    }

    public E h(long j2, E e2) {
        int b = d.b(this.f2231g, this.f2233i, j2);
        if (b >= 0) {
            Object[] objArr = this.f2232h;
            if (objArr[b] != e) {
                return (E) objArr[b];
            }
        }
        return e2;
    }

    public long i(int i2) {
        if (this.f2230f) {
            f();
        }
        return this.f2231g[i2];
    }

    public void j(long j2, E e2) {
        int b = d.b(this.f2231g, this.f2233i, j2);
        if (b >= 0) {
            this.f2232h[b] = e2;
            return;
        }
        int i2 = ~b;
        int i3 = this.f2233i;
        if (i2 < i3) {
            Object[] objArr = this.f2232h;
            if (objArr[i2] == e) {
                this.f2231g[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f2230f && i3 >= this.f2231g.length) {
            f();
            i2 = ~d.b(this.f2231g, this.f2233i, j2);
        }
        int i4 = this.f2233i;
        if (i4 >= this.f2231g.length) {
            int f2 = d.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f2231g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2232h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2231g = jArr;
            this.f2232h = objArr2;
        }
        int i5 = this.f2233i;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f2231g;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2232h;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2233i - i2);
        }
        this.f2231g[i2] = j2;
        this.f2232h[i2] = e2;
        this.f2233i++;
    }

    public int k() {
        if (this.f2230f) {
            f();
        }
        return this.f2233i;
    }

    public E l(int i2) {
        if (this.f2230f) {
            f();
        }
        return (E) this.f2232h[i2];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2233i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2233i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(i(i2));
            sb.append('=');
            E l2 = l(i2);
            if (l2 != this) {
                sb.append((Object) l2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
