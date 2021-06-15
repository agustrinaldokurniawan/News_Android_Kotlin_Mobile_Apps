package c.b.a.e0;

import android.graphics.Path;
import android.graphics.PointF;
import c.b.a.c0.j.d;
import c.b.a.c0.j.h;
import c.b.a.c0.j.m;
import c.b.a.c0.k.b;
import c.b.a.c0.k.e;
import c.b.a.c0.k.g;
import c.b.a.c0.k.i;
import c.b.a.c0.k.j;
import c.b.a.c0.k.l;
import c.b.a.c0.k.n;
import c.b.a.c0.k.o;
import c.b.a.c0.k.p;
import c.b.a.e0.h0.c;
import c.b.a.g;
import g.q.a;
import java.util.ArrayList;
import java.util.Collections;

public class f {
    public static c.a a = c.a.a("ty", "d");

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(c cVar, g gVar) {
        String str;
        char c2;
        b bVar;
        cVar.c();
        int i2 = 2;
        while (true) {
            if (!cVar.K()) {
                str = null;
                break;
            }
            int h0 = cVar.h0(a);
            if (h0 == 0) {
                str = cVar.e0();
                break;
            } else if (h0 != 1) {
                cVar.i0();
                cVar.j0();
            } else {
                i2 = cVar.b0();
            }
        }
        if (str == null) {
            return null;
        }
        boolean z = false;
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3295:
                if (str.equals("gf")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3307:
                if (str.equals("gr")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c2 = '\f';
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
                c.a aVar = d.a;
                boolean z2 = i2 == 3;
                String str2 = null;
                m<PointF, PointF> mVar = null;
                c.b.a.c0.j.f fVar = null;
                boolean z3 = false;
                while (cVar.K()) {
                    int h02 = cVar.h0(d.a);
                    if (h02 == 0) {
                        str2 = cVar.e0();
                    } else if (h02 == 1) {
                        mVar = a.b(cVar, gVar);
                    } else if (h02 == 2) {
                        fVar = a.v(cVar, gVar);
                    } else if (h02 == 3) {
                        z3 = cVar.Q();
                    } else if (h02 != 4) {
                        cVar.i0();
                        cVar.j0();
                    } else {
                        z2 = cVar.b0() == 3;
                    }
                }
                bVar = new c.b.a.c0.k.a(str2, mVar, fVar, z2, z3);
                break;
            case 1:
                c.a aVar2 = b0.a;
                d dVar = null;
                String str3 = null;
                int i3 = 1;
                c.b.a.c0.j.a aVar3 = null;
                boolean z4 = false;
                boolean z5 = false;
                while (cVar.K()) {
                    int h03 = cVar.h0(b0.a);
                    if (h03 == 0) {
                        str3 = cVar.e0();
                    } else if (h03 == 1) {
                        aVar3 = a.r(cVar, gVar);
                    } else if (h03 == 2) {
                        dVar = a.u(cVar, gVar);
                    } else if (h03 == 3) {
                        z4 = cVar.Q();
                    } else if (h03 == 4) {
                        i3 = cVar.b0();
                    } else if (h03 != 5) {
                        cVar.i0();
                        cVar.j0();
                    } else {
                        z5 = cVar.Q();
                    }
                }
                if (dVar == null) {
                    dVar = new d(Collections.singletonList(new c.b.a.g0.a(100)));
                }
                bVar = new l(str3, z4, i3 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar3, dVar, z5);
                break;
            case 2:
                c.a aVar4 = l.a;
                d dVar2 = null;
                Path.FillType fillType = Path.FillType.WINDING;
                String str4 = null;
                c.b.a.c0.j.c cVar2 = null;
                c.b.a.c0.j.f fVar2 = null;
                c.b.a.c0.j.f fVar3 = null;
                int i4 = 0;
                boolean z6 = false;
                while (cVar.K()) {
                    switch (cVar.h0(l.a)) {
                        case 0:
                            str4 = cVar.e0();
                            break;
                        case 1:
                            cVar.c();
                            int i5 = -1;
                            while (cVar.K()) {
                                int h04 = cVar.h0(l.b);
                                if (h04 == 0) {
                                    i5 = cVar.b0();
                                } else if (h04 != 1) {
                                    cVar.i0();
                                    cVar.j0();
                                } else {
                                    cVar2 = new c.b.a.c0.j.c(a.q(cVar, gVar, new k(i5)));
                                }
                            }
                            cVar.n();
                            break;
                        case 2:
                            dVar2 = a.u(cVar, gVar);
                            break;
                        case 3:
                            if (cVar.b0() != 1) {
                                i4 = 2;
                                break;
                            } else {
                                i4 = 1;
                                break;
                            }
                        case 4:
                            fVar2 = a.v(cVar, gVar);
                            break;
                        case 5:
                            fVar3 = a.v(cVar, gVar);
                            break;
                        case 6:
                            fillType = cVar.b0() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            z6 = cVar.Q();
                            break;
                        default:
                            cVar.i0();
                            cVar.j0();
                            break;
                    }
                }
                bVar = new c.b.a.c0.k.d(str4, i4, fillType, cVar2, dVar2 == null ? new d(Collections.singletonList(new c.b.a.g0.a(100))) : dVar2, fVar2, fVar3, null, null, z6);
                break;
            case 3:
                c.a aVar5 = c0.a;
                ArrayList arrayList = new ArrayList();
                String str5 = null;
                while (cVar.K()) {
                    int h05 = cVar.h0(c0.a);
                    if (h05 == 0) {
                        str5 = cVar.e0();
                    } else if (h05 == 1) {
                        z = cVar.Q();
                    } else if (h05 != 2) {
                        cVar.j0();
                    } else {
                        cVar.b();
                        while (cVar.K()) {
                            b a2 = a(cVar, gVar);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        cVar.e();
                    }
                }
                bVar = new c.b.a.c0.k.m(str5, arrayList, z);
                break;
            case 4:
                c.a aVar6 = m.a;
                ArrayList arrayList2 = new ArrayList();
                d dVar3 = null;
                c.b.a.c0.j.c cVar3 = null;
                c.b.a.c0.j.f fVar4 = null;
                c.b.a.c0.j.f fVar5 = null;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                boolean z7 = false;
                float f2 = 0.0f;
                c.b.a.c0.j.b bVar2 = null;
                c.b.a.c0.j.b bVar3 = null;
                String str6 = null;
                while (cVar.K()) {
                    switch (cVar.h0(m.a)) {
                        case 0:
                            str6 = cVar.e0();
                            break;
                        case 1:
                            cVar.c();
                            int i9 = -1;
                            while (cVar.K()) {
                                int h06 = cVar.h0(m.b);
                                if (h06 == 0) {
                                    i9 = cVar.b0();
                                } else if (h06 != 1) {
                                    cVar.i0();
                                    cVar.j0();
                                } else {
                                    cVar3 = new c.b.a.c0.j.c(a.q(cVar, gVar, new k(i9)));
                                }
                            }
                            cVar.n();
                            break;
                        case 2:
                            dVar3 = a.u(cVar, gVar);
                            break;
                        case 3:
                            if (cVar.b0() != 1) {
                                i6 = 2;
                                break;
                            } else {
                                i6 = 1;
                                break;
                            }
                        case 4:
                            fVar4 = a.v(cVar, gVar);
                            break;
                        case 5:
                            fVar5 = a.v(cVar, gVar);
                            break;
                        case 6:
                            bVar2 = a.s(cVar, gVar);
                            break;
                        case 7:
                            i7 = g.f.c.g.com$airbnb$lottie$model$content$ShapeStroke$LineCapType$s$values()[cVar.b0() - 1];
                            break;
                        case 8:
                            i8 = g.f.c.g.com$airbnb$lottie$model$content$ShapeStroke$LineJoinType$s$values()[cVar.b0() - 1];
                            break;
                        case 9:
                            f2 = (float) cVar.V();
                            break;
                        case 10:
                            z7 = cVar.Q();
                            break;
                        case 11:
                            cVar.b();
                            while (cVar.K()) {
                                cVar.c();
                                c.b.a.c0.j.b bVar4 = null;
                                String str7 = null;
                                while (cVar.K()) {
                                    int h07 = cVar.h0(m.f647c);
                                    if (h07 == 0) {
                                        str7 = cVar.e0();
                                    } else if (h07 != 1) {
                                        cVar.i0();
                                        cVar.j0();
                                    } else {
                                        bVar4 = a.s(cVar, gVar);
                                    }
                                }
                                cVar.n();
                                if (str7.equals("o")) {
                                    bVar3 = bVar4;
                                } else if (str7.equals("d") || str7.equals("g")) {
                                    gVar.n = true;
                                    arrayList2.add(bVar4);
                                }
                            }
                            cVar.e();
                            if (arrayList2.size() != 1) {
                                break;
                            } else {
                                arrayList2.add(arrayList2.get(0));
                                break;
                            }
                        default:
                            cVar.i0();
                            cVar.j0();
                            break;
                    }
                }
                bVar = new e(str6, i6, cVar3, dVar3 == null ? new d(Collections.singletonList(new c.b.a.g0.a(100))) : dVar3, fVar4, fVar5, bVar2, i7, i8, f2, arrayList2, bVar3, z7);
                break;
            case 5:
                c.a aVar7 = t.a;
                g.a aVar8 = null;
                String str8 = null;
                while (cVar.K()) {
                    int h08 = cVar.h0(t.a);
                    if (h08 == 0) {
                        str8 = cVar.e0();
                    } else if (h08 == 1) {
                        int b0 = cVar.b0();
                        g.a aVar9 = g.a.MERGE;
                        if (b0 != 1) {
                            if (b0 == 2) {
                                aVar8 = g.a.ADD;
                            } else if (b0 == 3) {
                                aVar8 = g.a.SUBTRACT;
                            } else if (b0 == 4) {
                                aVar8 = g.a.INTERSECT;
                            } else if (b0 == 5) {
                                aVar8 = g.a.EXCLUDE_INTERSECTIONS;
                            }
                        }
                        aVar8 = aVar9;
                    } else if (h08 != 2) {
                        cVar.i0();
                        cVar.j0();
                    } else {
                        z = cVar.Q();
                    }
                }
                c.b.a.c0.k.g gVar2 = new c.b.a.c0.k.g(str8, aVar8, z);
                gVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                bVar = gVar2;
                break;
            case 6:
                c.a aVar10 = x.a;
                String str9 = null;
                m<PointF, PointF> mVar2 = null;
                c.b.a.c0.j.f fVar6 = null;
                c.b.a.c0.j.b bVar5 = null;
                boolean z8 = false;
                while (cVar.K()) {
                    int h09 = cVar.h0(x.a);
                    if (h09 == 0) {
                        str9 = cVar.e0();
                    } else if (h09 == 1) {
                        mVar2 = a.b(cVar, gVar);
                    } else if (h09 == 2) {
                        fVar6 = a.v(cVar, gVar);
                    } else if (h09 == 3) {
                        bVar5 = a.s(cVar, gVar);
                    } else if (h09 != 4) {
                        cVar.j0();
                    } else {
                        z8 = cVar.Q();
                    }
                }
                bVar = new i(str9, mVar2, fVar6, bVar5, z8);
                break;
            case 7:
                c.a aVar11 = y.a;
                String str10 = null;
                c.b.a.c0.j.b bVar6 = null;
                c.b.a.c0.j.b bVar7 = null;
                c.b.a.c0.j.l lVar = null;
                boolean z9 = false;
                while (cVar.K()) {
                    int h010 = cVar.h0(y.a);
                    if (h010 == 0) {
                        str10 = cVar.e0();
                    } else if (h010 == 1) {
                        bVar6 = a.t(cVar, gVar, false);
                    } else if (h010 == 2) {
                        bVar7 = a.t(cVar, gVar, false);
                    } else if (h010 == 3) {
                        lVar = c.a(cVar, gVar);
                    } else if (h010 != 4) {
                        cVar.j0();
                    } else {
                        z9 = cVar.Q();
                    }
                }
                bVar = new j(str10, bVar6, bVar7, lVar, z9);
                break;
            case '\b':
                c.a aVar12 = d0.a;
                h hVar = null;
                String str11 = null;
                int i10 = 0;
                boolean z10 = false;
                while (cVar.K()) {
                    int h011 = cVar.h0(d0.a);
                    if (h011 == 0) {
                        str11 = cVar.e0();
                    } else if (h011 == 1) {
                        i10 = cVar.b0();
                    } else if (h011 == 2) {
                        hVar = new h(q.a(cVar, gVar, c.b.a.f0.g.c(), a0.a, false));
                    } else if (h011 != 3) {
                        cVar.j0();
                    } else {
                        z10 = cVar.Q();
                    }
                }
                bVar = new n(str11, i10, hVar, z10);
                break;
            case '\t':
                c.a aVar13 = w.a;
                String str12 = null;
                c.b.a.c0.j.b bVar8 = null;
                m<PointF, PointF> mVar3 = null;
                c.b.a.c0.j.b bVar9 = null;
                c.b.a.c0.j.b bVar10 = null;
                c.b.a.c0.j.b bVar11 = null;
                c.b.a.c0.j.b bVar12 = null;
                c.b.a.c0.j.b bVar13 = null;
                int i11 = 0;
                boolean z11 = false;
                while (cVar.K()) {
                    switch (cVar.h0(w.a)) {
                        case 0:
                            str12 = cVar.e0();
                            break;
                        case 1:
                            int b02 = cVar.b0();
                            int[] com$airbnb$lottie$model$content$PolystarShape$Type$s$values = g.f.c.g.com$airbnb$lottie$model$content$PolystarShape$Type$s$values();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= 2) {
                                    i11 = 0;
                                    break;
                                } else {
                                    i11 = com$airbnb$lottie$model$content$PolystarShape$Type$s$values[i12];
                                    if (g.f.c.g.k(i11) == b02) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        case 2:
                            bVar8 = a.t(cVar, gVar, false);
                            break;
                        case 3:
                            mVar3 = a.b(cVar, gVar);
                            break;
                        case 4:
                            bVar9 = a.t(cVar, gVar, false);
                            break;
                        case 5:
                            bVar11 = a.s(cVar, gVar);
                            break;
                        case 6:
                            bVar13 = a.t(cVar, gVar, false);
                            break;
                        case 7:
                            bVar10 = a.s(cVar, gVar);
                            break;
                        case 8:
                            bVar12 = a.t(cVar, gVar, false);
                            break;
                        case 9:
                            z11 = cVar.Q();
                            break;
                        default:
                            cVar.i0();
                            cVar.j0();
                            break;
                    }
                }
                bVar = new c.b.a.c0.k.h(str12, i11, bVar8, mVar3, bVar9, bVar10, bVar11, bVar12, bVar13, z11);
                break;
            case '\n':
                c.a aVar14 = e0.a;
                ArrayList arrayList3 = new ArrayList();
                d dVar4 = null;
                String str13 = null;
                c.b.a.c0.j.b bVar14 = null;
                c.b.a.c0.j.a aVar15 = null;
                c.b.a.c0.j.b bVar15 = null;
                int i13 = 0;
                int i14 = 0;
                boolean z12 = false;
                float f3 = 0.0f;
                while (cVar.K()) {
                    switch (cVar.h0(e0.a)) {
                        case 0:
                            str13 = cVar.e0();
                            break;
                        case 1:
                            aVar15 = a.r(cVar, gVar);
                            break;
                        case 2:
                            bVar15 = a.s(cVar, gVar);
                            break;
                        case 3:
                            dVar4 = a.u(cVar, gVar);
                            break;
                        case 4:
                            i13 = g.f.c.g.com$airbnb$lottie$model$content$ShapeStroke$LineCapType$s$values()[cVar.b0() - 1];
                            break;
                        case 5:
                            i14 = g.f.c.g.com$airbnb$lottie$model$content$ShapeStroke$LineJoinType$s$values()[cVar.b0() - 1];
                            break;
                        case 6:
                            f3 = (float) cVar.V();
                            break;
                        case 7:
                            z12 = cVar.Q();
                            break;
                        case 8:
                            cVar.b();
                            while (cVar.K()) {
                                cVar.c();
                                c.b.a.c0.j.b bVar16 = null;
                                String str14 = null;
                                while (cVar.K()) {
                                    int h012 = cVar.h0(e0.b);
                                    if (h012 == 0) {
                                        str14 = cVar.e0();
                                    } else if (h012 != 1) {
                                        cVar.i0();
                                        cVar.j0();
                                    } else {
                                        bVar16 = a.s(cVar, gVar);
                                    }
                                }
                                cVar.n();
                                str14.hashCode();
                                str14.hashCode();
                                char c3 = 65535;
                                switch (str14.hashCode()) {
                                    case 100:
                                        if (str14.equals("d")) {
                                            c3 = 0;
                                            break;
                                        }
                                        break;
                                    case 103:
                                        if (str14.equals("g")) {
                                            c3 = 1;
                                            break;
                                        }
                                        break;
                                    case 111:
                                        if (str14.equals("o")) {
                                            c3 = 2;
                                            break;
                                        }
                                        break;
                                }
                                switch (c3) {
                                    case 0:
                                    case 1:
                                        gVar.n = true;
                                        arrayList3.add(bVar16);
                                        break;
                                    case 2:
                                        bVar14 = bVar16;
                                        break;
                                }
                            }
                            cVar.e();
                            if (arrayList3.size() != 1) {
                                break;
                            } else {
                                arrayList3.add(arrayList3.get(0));
                                break;
                            }
                        default:
                            cVar.j0();
                            break;
                    }
                }
                bVar = new o(str13, bVar14, arrayList3, aVar15, dVar4 == null ? new d(Collections.singletonList(new c.b.a.g0.a(100))) : dVar4, bVar15, i13, i14, f3, z12);
                break;
            case 11:
                c.a aVar16 = f0.a;
                String str15 = null;
                c.b.a.c0.j.b bVar17 = null;
                c.b.a.c0.j.b bVar18 = null;
                c.b.a.c0.j.b bVar19 = null;
                int i15 = 0;
                boolean z13 = false;
                while (cVar.K()) {
                    int h013 = cVar.h0(f0.a);
                    if (h013 == 0) {
                        bVar17 = a.t(cVar, gVar, false);
                    } else if (h013 == 1) {
                        bVar18 = a.t(cVar, gVar, false);
                    } else if (h013 == 2) {
                        bVar19 = a.t(cVar, gVar, false);
                    } else if (h013 == 3) {
                        str15 = cVar.e0();
                    } else if (h013 == 4) {
                        int b03 = cVar.b0();
                        if (b03 == 1) {
                            i15 = 1;
                        } else if (b03 == 2) {
                            i15 = 2;
                        } else {
                            throw new IllegalArgumentException(c.c.a.a.a.l("Unknown trim path type ", b03));
                        }
                    } else if (h013 != 5) {
                        cVar.j0();
                    } else {
                        z13 = cVar.Q();
                    }
                }
                bVar = new p(str15, i15, bVar17, bVar18, bVar19, z13);
                break;
            case '\f':
                bVar = c.a(cVar, gVar);
                break;
            default:
                c.b.a.f0.c.b("Unknown shape type " + str);
                bVar = null;
                break;
        }
        while (cVar.K()) {
            cVar.j0();
        }
        cVar.n();
        return bVar;
    }
}
