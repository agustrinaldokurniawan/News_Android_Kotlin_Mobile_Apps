package g.e;

public class i<E> implements Cloneable {
    public static final Object e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public boolean f2252f = false;

    /* renamed from: g  reason: collision with root package name */
    public int[] f2253g;

    /* renamed from: h  reason: collision with root package name */
    public Object[] f2254h;

    /* renamed from: i  reason: collision with root package name */
    public int f2255i;

    public i() {
        int e2 = d.e(10);
        this.f2253g = new int[e2];
        this.f2254h = new Object[e2];
    }

    public void a(int i2, E e2) {
        int i3 = this.f2255i;
        if (i3 == 0 || i2 > this.f2253g[i3 - 1]) {
            if (this.f2252f && i3 >= this.f2253g.length) {
                f();
            }
            int i4 = this.f2255i;
            if (i4 >= this.f2253g.length) {
                int e3 = d.e(i4 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.f2253g;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f2254h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2253g = iArr;
                this.f2254h = objArr;
            }
            this.f2253g[i4] = i2;
            this.f2254h[i4] = e2;
            this.f2255i = i4 + 1;
            return;
        }
        j(i2, e2);
    }

    /* renamed from: d */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f2253g = (int[]) this.f2253g.clone();
            iVar.f2254h = (Object[]) this.f2254h.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void f() {
        int i2 = this.f2255i;
        int[] iArr = this.f2253g;
        Object[] objArr = this.f2254h;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != e) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2252f = false;
        this.f2255i = i3;
    }

    public E g(int i2) {
        return h(i2, null);
    }

    public E h(int i2, E e2) {
        int a = d.a(this.f2253g, this.f2255i, i2);
        if (a >= 0) {
            Object[] objArr = this.f2254h;
            if (objArr[a] != e) {
                return (E) objArr[a];
            }
        }
        return e2;
    }

    public int i(int i2) {
        if (this.f2252f) {
            f();
        }
        return this.f2253g[i2];
    }

    public void j(int i2, E e2) {
        int a = d.a(this.f2253g, this.f2255i, i2);
        if (a >= 0) {
            this.f2254h[a] = e2;
            return;
        }
        int i3 = ~a;
        int i4 = this.f2255i;
        if (i3 < i4) {
            Object[] objArr = this.f2254h;
            if (objArr[i3] == e) {
                this.f2253g[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f2252f && i4 >= this.f2253g.length) {
            f();
            i3 = ~d.a(this.f2253g, this.f2255i, i2);
        }
        int i5 = this.f2255i;
        if (i5 >= this.f2253g.length) {
            int e3 = d.e(i5 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f2253g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2254h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2253g = iArr;
            this.f2254h = objArr2;
        }
        int i6 = this.f2255i;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f2253g;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f2254h;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f2255i - i3);
        }
        this.f2253g[i3] = i2;
        this.f2254h[i3] = e2;
        this.f2255i++;
    }

    public int k() {
        if (this.f2252f) {
            f();
        }
        return this.f2255i;
    }

    public E l(int i2) {
        if (this.f2252f) {
            f();
        }
        return (E) this.f2254h[i2];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2255i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2255i; i2++) {
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
