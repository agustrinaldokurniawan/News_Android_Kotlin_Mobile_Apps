package c.b.a.e0;

import android.graphics.Color;
import c.b.a.c0.j.b;
import c.b.a.c0.j.d;
import c.b.a.c0.j.h;
import c.b.a.c0.j.j;
import c.b.a.c0.j.k;
import c.b.a.c0.j.l;
import c.b.a.c0.k.f;
import c.b.a.c0.l.e;
import c.b.a.e0.h0.c;
import c.b.a.g;
import g.q.a;
import java.util.ArrayList;

public class r {
    public static final c.a a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
    public static final c.a b = c.a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f650c = c.a.a("nm");

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:202:0x02d7 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v10, resolved type: c.b.a.c0.j.d */
    /* JADX DEBUG: Multi-variable search result rejected for r6v11, resolved type: c.b.a.c0.j.d */
    /* JADX DEBUG: Multi-variable search result rejected for r6v13, resolved type: c.b.a.c0.j.d */
    /* JADX DEBUG: Multi-variable search result rejected for r6v24, resolved type: c.b.a.c0.j.d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static e a(c cVar, g gVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        long j2;
        boolean z;
        String str2;
        String str3;
        char c2;
        char c3;
        String str4;
        String str5;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.c();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        int i2 = 1;
        boolean z2 = false;
        float f2 = 1.0f;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.0f;
        long j3 = -1;
        String str6 = null;
        e.a aVar = null;
        String str7 = null;
        l lVar = null;
        j jVar = null;
        k kVar = null;
        b bVar = null;
        long j4 = 0;
        String str8 = "UNSET";
        float f5 = 0.0f;
        while (cVar.K()) {
            switch (cVar.h0(a)) {
                case 0:
                    str2 = str6;
                    j2 = j4;
                    z = z2;
                    str8 = cVar.e0();
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 1:
                    z2 = z2;
                    j4 = (long) cVar.b0();
                    i2 = 1;
                    break;
                case 2:
                    str2 = str6;
                    j2 = j4;
                    z = z2;
                    str7 = cVar.e0();
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 3:
                    str2 = str6;
                    j2 = j4;
                    z = z2;
                    int b0 = cVar.b0();
                    aVar = e.a.UNKNOWN;
                    if (b0 < 6) {
                        aVar = e.a.values()[b0];
                    }
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 4:
                    str2 = str6;
                    j2 = j4;
                    z = z2;
                    j3 = (long) cVar.b0();
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 5:
                    str2 = str6;
                    j2 = j4;
                    z = z2;
                    i4 = (int) (c.b.a.f0.g.c() * ((float) cVar.b0()));
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 6:
                    str2 = str6;
                    j2 = j4;
                    z = z2;
                    i5 = (int) (c.b.a.f0.g.c() * ((float) cVar.b0()));
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 7:
                    str2 = str6;
                    j2 = j4;
                    z = z2;
                    i6 = Color.parseColor(cVar.e0());
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 8:
                    str2 = str6;
                    j2 = j4;
                    z = z2;
                    lVar = c.a(cVar, gVar);
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 9:
                    str2 = str6;
                    j2 = j4;
                    z = z2;
                    int b02 = cVar.b0();
                    g.f.c.g.com$airbnb$lottie$model$layer$Layer$MatteType$s$values();
                    if (b02 >= 6) {
                        gVar.a("Unsupported matte type: " + b02);
                    } else {
                        i3 = g.f.c.g.com$airbnb$lottie$model$layer$Layer$MatteType$s$values()[b02];
                        int f6 = g.f.c.g.f(i3);
                        if (f6 != 3) {
                            if (f6 == 4) {
                                str3 = "Unsupported matte type: Luma Inverted";
                            }
                            gVar.o++;
                        } else {
                            str3 = "Unsupported matte type: Luma";
                        }
                        gVar.a(str3);
                        gVar.o++;
                    }
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 10:
                    str2 = str6;
                    h hVar = null;
                    cVar.b();
                    while (cVar.K()) {
                        cVar.c();
                        h hVar2 = hVar;
                        d dVar = hVar2;
                        int i9 = 0;
                        boolean z4 = false;
                        while (cVar.K()) {
                            String d0 = cVar.d0();
                            d0.hashCode();
                            switch (d0.hashCode()) {
                                case 111:
                                    if (d0.equals("o")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3588:
                                    if (d0.equals("pt")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 104433:
                                    if (d0.equals("inv")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3357091:
                                    if (d0.equals("mode")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    dVar = a.u(cVar, gVar);
                                    break;
                                case 1:
                                    hVar2 = new h(q.a(cVar, gVar, c.b.a.f0.g.c(), a0.a, false));
                                    break;
                                case 2:
                                    z4 = cVar.Q();
                                    break;
                                case 3:
                                    String e0 = cVar.e0();
                                    e0.hashCode();
                                    switch (e0.hashCode()) {
                                        case 97:
                                            if (e0.equals("a")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 105:
                                            if (e0.equals("i")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 110:
                                            if (e0.equals("n")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 115:
                                            if (e0.equals("s")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            i9 = 1;
                                            break;
                                        case 1:
                                            gVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            i9 = 3;
                                            break;
                                        case 2:
                                            i9 = 4;
                                            break;
                                        case 3:
                                            i9 = 2;
                                            break;
                                        default:
                                            c.b.a.f0.c.b("Unknown mask mode " + d0 + ". Defaulting to Add.");
                                            i9 = 1;
                                            break;
                                    }
                                    break;
                                default:
                                    cVar.j0();
                                    break;
                            }
                            j4 = j4;
                            dVar = dVar;
                        }
                        cVar.n();
                        arrayList3.add(new f(i9, hVar2, dVar, z4));
                        j4 = j4;
                        hVar = null;
                    }
                    j2 = j4;
                    z = false;
                    gVar.o += arrayList3.size();
                    cVar.e();
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 11:
                    str2 = str6;
                    cVar.b();
                    while (cVar.K()) {
                        c.b.a.c0.k.b a2 = f.a(cVar, gVar);
                        if (a2 != null) {
                            arrayList4.add(a2);
                        }
                    }
                    cVar.e();
                    j2 = j4;
                    z = false;
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 12:
                    cVar.c();
                    while (cVar.K()) {
                        int h0 = cVar.h0(b);
                        if (h0 == 0) {
                            str5 = str6;
                            jVar = new j(a.q(cVar, gVar, g.a));
                        } else if (h0 != i2) {
                            cVar.i0();
                            cVar.j0();
                        } else {
                            cVar.b();
                            if (cVar.K()) {
                                c.a aVar2 = b.a;
                                cVar.c();
                                k kVar2 = null;
                                while (cVar.K()) {
                                    if (cVar.h0(b.a) != 0) {
                                        cVar.i0();
                                        cVar.j0();
                                    } else {
                                        cVar.c();
                                        b bVar2 = null;
                                        b bVar3 = null;
                                        c.b.a.c0.j.a aVar3 = null;
                                        c.b.a.c0.j.a aVar4 = null;
                                        while (cVar.K()) {
                                            int h02 = cVar.h0(b.b);
                                            if (h02 == 0) {
                                                aVar3 = a.r(cVar, gVar);
                                            } else if (h02 == i2) {
                                                aVar4 = a.r(cVar, gVar);
                                            } else if (h02 == 2) {
                                                bVar2 = a.s(cVar, gVar);
                                            } else if (h02 != 3) {
                                                cVar.i0();
                                                cVar.j0();
                                            } else {
                                                bVar3 = a.s(cVar, gVar);
                                            }
                                            i2 = 1;
                                        }
                                        cVar.n();
                                        kVar2 = new k(aVar3, aVar4, bVar2, bVar3);
                                        str6 = str6;
                                        i2 = 1;
                                    }
                                }
                                str5 = str6;
                                cVar.n();
                                kVar = kVar2 == null ? new k(null, null, null, null) : kVar2;
                            } else {
                                str5 = str6;
                            }
                            while (cVar.K()) {
                                cVar.j0();
                            }
                            cVar.e();
                        }
                        str6 = str5;
                        i2 = 1;
                    }
                    str4 = str6;
                    cVar.n();
                    j2 = j4;
                    str6 = str4;
                    z = false;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 13:
                    cVar.b();
                    ArrayList arrayList5 = new ArrayList();
                    while (cVar.K()) {
                        cVar.c();
                        while (cVar.K()) {
                            if (cVar.h0(f650c) != 0) {
                                cVar.i0();
                                cVar.j0();
                            } else {
                                arrayList5.add(cVar.e0());
                            }
                        }
                        cVar.n();
                    }
                    cVar.e();
                    gVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    str2 = str6;
                    j2 = j4;
                    z = false;
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 14:
                    f2 = (float) cVar.V();
                    str4 = str6;
                    j2 = j4;
                    str6 = str4;
                    z = false;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 15:
                    f4 = (float) cVar.V();
                    str4 = str6;
                    j2 = j4;
                    str6 = str4;
                    z = false;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 16:
                    i7 = (int) (c.b.a.f0.g.c() * ((float) cVar.b0()));
                    str4 = str6;
                    j2 = j4;
                    str6 = str4;
                    z = false;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 17:
                    i8 = (int) (c.b.a.f0.g.c() * ((float) cVar.b0()));
                    str4 = str6;
                    j2 = j4;
                    str6 = str4;
                    z = false;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 18:
                    f3 = (float) cVar.V();
                    str4 = str6;
                    j2 = j4;
                    str6 = str4;
                    z = false;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 19:
                    f5 = (float) cVar.V();
                    j2 = j4;
                    z = z2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 20:
                    bVar = a.t(cVar, gVar, z2);
                    j2 = j4;
                    z = z2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 21:
                    str6 = cVar.e0();
                    j2 = j4;
                    z = z2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                case 22:
                    z3 = cVar.Q();
                    j2 = j4;
                    z = z2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
                default:
                    str2 = str6;
                    j2 = j4;
                    z = z2;
                    cVar.i0();
                    cVar.j0();
                    str6 = str2;
                    z2 = z;
                    j4 = j2;
                    i2 = 1;
                    break;
            }
        }
        cVar.n();
        float f7 = f3 / f2;
        float f8 = f5 / f2;
        ArrayList arrayList6 = new ArrayList();
        if (f7 > 0.0f) {
            arrayList = arrayList4;
            arrayList2 = arrayList3;
            str = str6;
            arrayList6.add(new c.b.a.g0.a(gVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f7)));
        } else {
            arrayList = arrayList4;
            arrayList2 = arrayList3;
            str = str6;
        }
        if (f8 <= 0.0f) {
            f8 = gVar.f673l;
        }
        arrayList6.add(new c.b.a.g0.a(gVar, valueOf, valueOf, null, f7, Float.valueOf(f8)));
        arrayList6.add(new c.b.a.g0.a(gVar, valueOf2, valueOf2, null, f8, Float.valueOf(Float.MAX_VALUE)));
        if (str8.endsWith(".ai") || "ai".equals(str)) {
            gVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new e(arrayList, gVar, str8, j4, aVar, j3, str7, arrayList2, lVar, i4, i5, i6, f2, f4, i7, i8, jVar, kVar, arrayList6, i3, bVar, z3);
    }
}
