package g.q.c;

import androidx.recyclerview.widget.RecyclerView;
import g.h.i.c;
import g.h.i.d;
import g.q.c.p;
import java.util.ArrayList;
import java.util.List;

public final class a implements p.a {
    public c<b> a = new d(30);
    public final ArrayList<b> b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2885c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC0092a f2886d;
    public final p e;

    /* renamed from: g.q.c.a$a  reason: collision with other inner class name */
    public interface AbstractC0092a {
    }

    public static final class b {
        public int a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public Object f2887c;

        /* renamed from: d  reason: collision with root package name */
        public int f2888d;

        public b(int i2, int i3, int i4, Object obj) {
            this.a = i2;
            this.b = i3;
            this.f2888d = i4;
            this.f2887c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.a;
            if (i2 != bVar.a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f2888d - this.b) == 1 && this.f2888d == bVar.b && this.b == bVar.f2888d) {
                return true;
            }
            if (this.f2888d != bVar.f2888d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.f2887c;
            Object obj3 = bVar.f2887c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.f2888d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i2 = this.a;
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.f2888d);
            sb.append(",p:");
            sb.append(this.f2887c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(AbstractC0092a aVar) {
        this.f2886d = aVar;
        this.e = new p(this);
    }

    public final boolean a(int i2) {
        int size = this.f2885c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f2885c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                if (f(bVar.f2888d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.b;
                int i6 = bVar.f2888d + i5;
                while (i5 < i6) {
                    if (f(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        int size = this.f2885c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((w) this.f2886d).a(this.f2885c.get(i2));
        }
        l(this.f2885c);
    }

    public void c() {
        b();
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                ((w) this.f2886d).a(bVar);
                ((w) this.f2886d).d(bVar.b, bVar.f2888d);
            } else if (i3 == 2) {
                ((w) this.f2886d).a(bVar);
                AbstractC0092a aVar = this.f2886d;
                int i4 = bVar.b;
                int i5 = bVar.f2888d;
                w wVar = (w) aVar;
                wVar.a.R(i4, i5, true);
                RecyclerView recyclerView = wVar.a;
                recyclerView.p0 = true;
                recyclerView.m0.f275c += i5;
            } else if (i3 == 4) {
                ((w) this.f2886d).a(bVar);
                ((w) this.f2886d).c(bVar.b, bVar.f2888d, bVar.f2887c);
            } else if (i3 == 8) {
                ((w) this.f2886d).a(bVar);
                ((w) this.f2886d).e(bVar.b, bVar.f2888d);
            }
        }
        l(this.b);
    }

    public final void d(b bVar) {
        int i2;
        int i3 = bVar.a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m2 = m(bVar.b, i3);
        int i4 = bVar.b;
        int i5 = bVar.a;
        if (i5 == 2) {
            i2 = 0;
        } else if (i5 == 4) {
            i2 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f2888d; i7++) {
            int m3 = m((i2 * i7) + bVar.b, bVar.a);
            int i8 = bVar.a;
            if (i8 == 2 ? m3 == m2 : i8 == 4 && m3 == m2 + 1) {
                i6++;
            } else {
                b h2 = h(i8, m2, i6, bVar.f2887c);
                e(h2, i4);
                k(h2);
                if (bVar.a == 4) {
                    i4 += i6;
                }
                i6 = 1;
                m2 = m3;
            }
        }
        Object obj = bVar.f2887c;
        k(bVar);
        if (i6 > 0) {
            b h3 = h(bVar.a, m2, i6, obj);
            e(h3, i4);
            k(h3);
        }
    }

    public void e(b bVar, int i2) {
        ((w) this.f2886d).a(bVar);
        int i3 = bVar.a;
        if (i3 == 2) {
            AbstractC0092a aVar = this.f2886d;
            int i4 = bVar.f2888d;
            w wVar = (w) aVar;
            wVar.a.R(i2, i4, true);
            RecyclerView recyclerView = wVar.a;
            recyclerView.p0 = true;
            recyclerView.m0.f275c += i4;
        } else if (i3 == 4) {
            ((w) this.f2886d).c(i2, bVar.f2888d, bVar.f2887c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int f(int i2, int i3) {
        int size = this.f2885c.size();
        while (i3 < size) {
            b bVar = this.f2885c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.b;
                if (i5 == i2) {
                    i2 = bVar.f2888d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f2888d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f2888d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f2888d;
                }
            }
            i3++;
        }
        return i2;
    }

    public boolean g() {
        return this.b.size() > 0;
    }

    public b h(int i2, int i3, int i4, Object obj) {
        b b2 = this.a.b();
        if (b2 == null) {
            return new b(i2, i3, i4, obj);
        }
        b2.a = i2;
        b2.b = i3;
        b2.f2888d = i4;
        b2.f2887c = obj;
        return b2;
    }

    public final void i(b bVar) {
        this.f2885c.add(bVar);
        int i2 = bVar.a;
        if (i2 == 1) {
            ((w) this.f2886d).d(bVar.b, bVar.f2888d);
        } else if (i2 == 2) {
            AbstractC0092a aVar = this.f2886d;
            w wVar = (w) aVar;
            wVar.a.R(bVar.b, bVar.f2888d, false);
            wVar.a.p0 = true;
        } else if (i2 == 4) {
            ((w) this.f2886d).c(bVar.b, bVar.f2888d, bVar.f2887c);
        } else if (i2 == 8) {
            ((w) this.f2886d).e(bVar.b, bVar.f2888d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014b, code lost:
        if (r4 > r12.b) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0175, code lost:
        if (r4 >= r12.b) goto L_0x0177;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
        // Method dump skipped, instructions count: 663
        */
        throw new UnsupportedOperationException("Method not decompiled: g.q.c.a.j():void");
    }

    public void k(b bVar) {
        bVar.f2887c = null;
        this.a.a(bVar);
    }

    public void l(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            k(list.get(i2));
        }
        list.clear();
    }

    public final int m(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        for (int size = this.f2885c.size() - 1; size >= 0; size--) {
            b bVar = this.f2885c.get(size);
            int i10 = bVar.a;
            if (i10 == 8) {
                int i11 = bVar.b;
                int i12 = bVar.f2888d;
                if (i11 < i12) {
                    i6 = i11;
                    i5 = i12;
                } else {
                    i5 = i11;
                    i6 = i12;
                }
                if (i2 < i6 || i2 > i5) {
                    if (i2 < i11) {
                        if (i3 == 1) {
                            bVar.b = i11 + 1;
                            i7 = i12 + 1;
                        } else if (i3 == 2) {
                            bVar.b = i11 - 1;
                            i7 = i12 - 1;
                        }
                        bVar.f2888d = i7;
                    }
                } else if (i6 == i11) {
                    if (i3 == 1) {
                        i9 = i12 + 1;
                    } else {
                        if (i3 == 2) {
                            i9 = i12 - 1;
                        }
                        i2++;
                    }
                    bVar.f2888d = i9;
                    i2++;
                } else {
                    if (i3 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i3 == 2) {
                            i8 = i11 - 1;
                        }
                        i2--;
                    }
                    bVar.b = i8;
                    i2--;
                }
            } else {
                int i13 = bVar.b;
                if (i13 > i2) {
                    if (i3 == 1) {
                        i4 = i13 + 1;
                    } else if (i3 == 2) {
                        i4 = i13 - 1;
                    }
                    bVar.b = i4;
                } else if (i10 == 1) {
                    i2 -= bVar.f2888d;
                } else if (i10 == 2) {
                    i2 += bVar.f2888d;
                }
            }
        }
        for (int size2 = this.f2885c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2885c.get(size2);
            if (bVar2.a == 8) {
                int i14 = bVar2.f2888d;
                if (i14 != bVar2.b && i14 >= 0) {
                }
            } else if (bVar2.f2888d > 0) {
            }
            this.f2885c.remove(size2);
            k(bVar2);
        }
        return i2;
    }
}
