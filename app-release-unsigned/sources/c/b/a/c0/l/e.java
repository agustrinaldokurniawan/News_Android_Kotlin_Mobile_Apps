package c.b.a.c0.l;

import c.b.a.c0.j.j;
import c.b.a.c0.j.k;
import c.b.a.c0.j.l;
import c.b.a.c0.k.b;
import c.b.a.c0.k.f;
import c.b.a.g;
import java.util.List;
import java.util.Locale;

public class e {
    public final List<b> a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final String f609c;

    /* renamed from: d  reason: collision with root package name */
    public final long f610d;
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public final long f611f;

    /* renamed from: g  reason: collision with root package name */
    public final String f612g;

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f613h;

    /* renamed from: i  reason: collision with root package name */
    public final l f614i;

    /* renamed from: j  reason: collision with root package name */
    public final int f615j;

    /* renamed from: k  reason: collision with root package name */
    public final int f616k;

    /* renamed from: l  reason: collision with root package name */
    public final int f617l;

    /* renamed from: m  reason: collision with root package name */
    public final float f618m;
    public final float n;
    public final int o;
    public final int p;
    public final j q;
    public final k r;
    public final c.b.a.c0.j.b s;
    public final List<c.b.a.g0.a<Float>> t;
    public final int u;
    public final boolean v;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Lc/b/a/c0/k/b;>;Lc/b/a/g;Ljava/lang/String;JLc/b/a/c0/l/e$a;JLjava/lang/String;Ljava/util/List<Lc/b/a/c0/k/f;>;Lc/b/a/c0/j/l;IIIFFIILc/b/a/c0/j/j;Lc/b/a/c0/j/k;Ljava/util/List<Lc/b/a/g0/a<Ljava/lang/Float;>;>;Ljava/lang/Object;Lc/b/a/c0/j/b;Z)V */
    public e(List list, g gVar, String str, long j2, a aVar, long j3, String str2, List list2, l lVar, int i2, int i3, int i4, float f2, float f3, int i5, int i6, j jVar, k kVar, List list3, int i7, c.b.a.c0.j.b bVar, boolean z) {
        this.a = list;
        this.b = gVar;
        this.f609c = str;
        this.f610d = j2;
        this.e = aVar;
        this.f611f = j3;
        this.f612g = str2;
        this.f613h = list2;
        this.f614i = lVar;
        this.f615j = i2;
        this.f616k = i3;
        this.f617l = i4;
        this.f618m = f2;
        this.n = f3;
        this.o = i5;
        this.p = i6;
        this.q = jVar;
        this.r = kVar;
        this.t = list3;
        this.u = i7;
        this.s = bVar;
        this.v = z;
    }

    public String a(String str) {
        StringBuilder f2 = c.c.a.a.a.f(str);
        f2.append(this.f609c);
        f2.append("\n");
        e e2 = this.b.e(this.f611f);
        if (e2 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                f2.append(str2);
                f2.append(e2.f609c);
                e2 = this.b.e(e2.f611f);
                if (e2 == null) {
                    break;
                }
                str2 = "->";
            }
            f2.append(str);
            f2.append("\n");
        }
        if (!this.f613h.isEmpty()) {
            f2.append(str);
            f2.append("\tMasks: ");
            f2.append(this.f613h.size());
            f2.append("\n");
        }
        if (!(this.f615j == 0 || this.f616k == 0)) {
            f2.append(str);
            f2.append("\tBackground: ");
            f2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.f615j), Integer.valueOf(this.f616k), Integer.valueOf(this.f617l)));
        }
        if (!this.a.isEmpty()) {
            f2.append(str);
            f2.append("\tShapes:\n");
            for (b bVar : this.a) {
                f2.append(str);
                f2.append("\t\t");
                f2.append(bVar);
                f2.append("\n");
            }
        }
        return f2.toString();
    }

    public String toString() {
        return a("");
    }
}
