package g.f.c.i;

import g.f.c.h;
import g.f.c.i.m.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class c {
    public HashSet<c> a = null;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2313c;

    /* renamed from: d  reason: collision with root package name */
    public final d f2314d;
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public c f2315f;

    /* renamed from: g  reason: collision with root package name */
    public int f2316g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2317h = -1;

    /* renamed from: i  reason: collision with root package name */
    public h f2318i;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.f2314d = dVar;
        this.e = aVar;
    }

    public boolean a(c cVar, int i2) {
        return b(cVar, i2, -1, false);
    }

    public boolean b(c cVar, int i2, int i3, boolean z) {
        if (cVar == null) {
            k();
            return true;
        } else if (!z && !j(cVar)) {
            return false;
        } else {
            this.f2315f = cVar;
            if (cVar.a == null) {
                cVar.a = new HashSet<>();
            }
            HashSet<c> hashSet = this.f2315f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i2 > 0) {
                this.f2316g = i2;
            } else {
                this.f2316g = 0;
            }
            this.f2317h = i3;
            return true;
        }
    }

    public void c(int i2, ArrayList<n> arrayList, n nVar) {
        HashSet<c> hashSet = this.a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                g.b.a.b(it.next().f2314d, i2, arrayList, nVar);
            }
        }
    }

    public int d() {
        if (!this.f2313c) {
            return 0;
        }
        return this.b;
    }

    public int e() {
        c cVar;
        if (this.f2314d.c0 == 8) {
            return 0;
        }
        int i2 = this.f2317h;
        if (i2 <= -1 || (cVar = this.f2315f) == null || cVar.f2314d.c0 != 8) {
            return this.f2316g;
        }
        return i2;
    }

    public final c f() {
        switch (this.e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.f2314d.F;
            case 2:
                return this.f2314d.G;
            case 3:
                return this.f2314d.D;
            case 4:
                return this.f2314d.E;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public boolean g() {
        HashSet<c> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        HashSet<c> hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean i() {
        return this.f2315f != null;
    }

    public boolean j(c cVar) {
        a aVar = a.CENTER_Y;
        a aVar2 = a.CENTER_X;
        a aVar3 = a.BASELINE;
        boolean z = false;
        if (cVar == null) {
            return false;
        }
        a aVar4 = cVar.e;
        a aVar5 = this.e;
        if (aVar4 != aVar5) {
            switch (aVar5.ordinal()) {
                case 0:
                case 5:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    boolean z2 = aVar4 == a.LEFT || aVar4 == a.RIGHT;
                    if (!(cVar.f2314d instanceof g)) {
                        return z2;
                    }
                    if (z2 || aVar4 == aVar2) {
                        z = true;
                    }
                    return z;
                case 2:
                case 4:
                    boolean z3 = aVar4 == a.TOP || aVar4 == a.BOTTOM;
                    if (!(cVar.f2314d instanceof g)) {
                        return z3;
                    }
                    if (z3 || aVar4 == aVar) {
                        z = true;
                    }
                    return z;
                case 6:
                    if (aVar4 == aVar3 || aVar4 == aVar2 || aVar4 == aVar) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(this.e.name());
            }
        } else if (aVar5 != aVar3 || (cVar.f2314d.y && this.f2314d.y)) {
            return true;
        } else {
            return false;
        }
    }

    public void k() {
        HashSet<c> hashSet;
        c cVar = this.f2315f;
        if (!(cVar == null || (hashSet = cVar.a) == null)) {
            hashSet.remove(this);
            if (this.f2315f.a.size() == 0) {
                this.f2315f.a = null;
            }
        }
        this.a = null;
        this.f2315f = null;
        this.f2316g = 0;
        this.f2317h = -1;
        this.f2313c = false;
        this.b = 0;
    }

    public void l() {
        h hVar = this.f2318i;
        if (hVar == null) {
            this.f2318i = new h(1);
        } else {
            hVar.c();
        }
    }

    public void m(int i2) {
        this.b = i2;
        this.f2313c = true;
    }

    public void n(int i2) {
        if (i()) {
            this.f2317h = i2;
        }
    }

    public String toString() {
        return this.f2314d.d0 + ":" + this.e.toString();
    }
}
