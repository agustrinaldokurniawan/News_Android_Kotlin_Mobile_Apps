package g.f.c.i.m;

import java.util.ArrayList;
import java.util.List;

public class f implements d {
    public d a = null;
    public boolean b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2362c = false;

    /* renamed from: d  reason: collision with root package name */
    public o f2363d;
    public a e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    public int f2364f;

    /* renamed from: g  reason: collision with root package name */
    public int f2365g;

    /* renamed from: h  reason: collision with root package name */
    public int f2366h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f2367i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2368j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<d> f2369k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<f> f2370l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(o oVar) {
        this.f2363d = oVar;
    }

    @Override // g.f.c.i.m.d
    public void a(d dVar) {
        for (f fVar : this.f2370l) {
            if (!fVar.f2368j) {
                return;
            }
        }
        this.f2362c = true;
        d dVar2 = this.a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.b) {
            this.f2363d.a(this);
            return;
        }
        f fVar2 = null;
        int i2 = 0;
        for (f fVar3 : this.f2370l) {
            if (!(fVar3 instanceof g)) {
                i2++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i2 == 1 && fVar2.f2368j) {
            g gVar = this.f2367i;
            if (gVar != null) {
                if (gVar.f2368j) {
                    this.f2364f = this.f2366h * gVar.f2365g;
                } else {
                    return;
                }
            }
            c(fVar2.f2365g + this.f2364f);
        }
        d dVar3 = this.a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.f2370l.clear();
        this.f2369k.clear();
        this.f2368j = false;
        this.f2365g = 0;
        this.f2362c = false;
        this.b = false;
    }

    public void c(int i2) {
        if (!this.f2368j) {
            this.f2368j = true;
            this.f2365g = i2;
            for (d dVar : this.f2369k) {
                dVar.a(dVar);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2363d.b.d0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.f2368j ? Integer.valueOf(this.f2365g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2370l.size());
        sb.append(":d=");
        sb.append(this.f2369k.size());
        sb.append(">");
        return sb.toString();
    }
}
