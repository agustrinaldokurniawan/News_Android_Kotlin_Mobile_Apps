package c.b.a.e0;

import android.graphics.Rect;
import c.b.a.c0.d;
import c.b.a.c0.h;
import c.b.a.c0.k.m;
import c.b.a.c0.l.e;
import c.b.a.e0.h0.c;
import c.b.a.g;
import c.b.a.n;
import g.e.e;
import g.e.i;
import java.util.ArrayList;
import java.util.HashMap;

public class s {
    public static final c.a a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static c.a b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f651c = c.a.a("list");

    /* renamed from: d  reason: collision with root package name */
    public static final c.a f652d = c.a.a("cm", "tm", "dr");

    public static g a(c cVar) {
        i<d> iVar;
        float f2;
        ArrayList arrayList;
        float f3;
        g gVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        g gVar2;
        g gVar3;
        float c2 = c.b.a.f0.g.c();
        e<c.b.a.c0.l.e> eVar = new e<>(10);
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        i<d> iVar2 = new i<>();
        g gVar4 = new g();
        cVar.c();
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (cVar.K()) {
            switch (cVar.h0(a)) {
                case 0:
                    arrayList2 = arrayList5;
                    i2 = cVar.b0();
                    break;
                case 1:
                    arrayList2 = arrayList5;
                    i3 = cVar.b0();
                    break;
                case 2:
                    arrayList3 = arrayList5;
                    iVar = iVar2;
                    gVar2 = gVar4;
                    f5 = (float) cVar.V();
                    gVar4 = gVar2;
                    arrayList5 = arrayList3;
                    iVar2 = iVar;
                case 3:
                    arrayList3 = arrayList5;
                    iVar = iVar2;
                    gVar2 = gVar4;
                    f4 = ((float) cVar.V()) - 0.01f;
                    gVar4 = gVar2;
                    arrayList5 = arrayList3;
                    iVar2 = iVar;
                case 4:
                    arrayList3 = arrayList5;
                    iVar = iVar2;
                    gVar2 = gVar4;
                    f6 = (float) cVar.V();
                    gVar4 = gVar2;
                    arrayList5 = arrayList3;
                    iVar2 = iVar;
                case 5:
                    arrayList = arrayList5;
                    iVar = iVar2;
                    gVar = gVar4;
                    f2 = f4;
                    f3 = f5;
                    String[] split = cVar.e0().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (!(parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 4 && (parseInt2 > 4 || Integer.parseInt(split[2]) >= 0))))) {
                        gVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    gVar4 = gVar;
                    f5 = f3;
                    arrayList5 = arrayList;
                    f4 = f2;
                    iVar2 = iVar;
                case 6:
                    arrayList = arrayList5;
                    iVar = iVar2;
                    g gVar5 = gVar4;
                    f2 = f4;
                    f3 = f5;
                    cVar.b();
                    int i4 = 0;
                    while (cVar.K()) {
                        c.b.a.c0.l.e a2 = r.a(cVar, gVar5);
                        if (a2.e == e.a.IMAGE) {
                            i4++;
                        }
                        arrayList4.add(a2);
                        eVar.j(a2.f610d, a2);
                        if (i4 > 4) {
                            c.b.a.f0.c.b("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        gVar5 = gVar5;
                    }
                    gVar = gVar5;
                    cVar.e();
                    gVar4 = gVar;
                    f5 = f3;
                    arrayList5 = arrayList;
                    f4 = f2;
                    iVar2 = iVar;
                case 7:
                    arrayList = arrayList5;
                    iVar = iVar2;
                    f2 = f4;
                    f3 = f5;
                    cVar.b();
                    while (cVar.K()) {
                        ArrayList arrayList6 = new ArrayList();
                        g.e.e eVar2 = new g.e.e(10);
                        cVar.c();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i5 = 0;
                        int i6 = 0;
                        while (cVar.K()) {
                            int h0 = cVar.h0(b);
                            if (h0 != 0) {
                                if (h0 == 1) {
                                    cVar.b();
                                    while (cVar.K()) {
                                        c.b.a.c0.l.e a3 = r.a(cVar, gVar4);
                                        eVar2.j(a3.f610d, a3);
                                        arrayList6.add(a3);
                                        gVar4 = gVar4;
                                    }
                                    gVar3 = gVar4;
                                    cVar.e();
                                } else if (h0 == 2) {
                                    i5 = cVar.b0();
                                } else if (h0 == 3) {
                                    i6 = cVar.b0();
                                } else if (h0 == 4) {
                                    str2 = cVar.e0();
                                } else if (h0 != 5) {
                                    cVar.i0();
                                    cVar.j0();
                                    gVar3 = gVar4;
                                } else {
                                    str3 = cVar.e0();
                                }
                                gVar4 = gVar3;
                            } else {
                                str = cVar.e0();
                            }
                        }
                        cVar.n();
                        if (str2 != null) {
                            hashMap2.put(str, new n(i5, i6, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList6);
                        }
                        gVar4 = gVar4;
                    }
                    cVar.e();
                    gVar = gVar4;
                    gVar4 = gVar;
                    f5 = f3;
                    arrayList5 = arrayList;
                    f4 = f2;
                    iVar2 = iVar;
                case 8:
                    f2 = f4;
                    f3 = f5;
                    cVar.c();
                    while (cVar.K()) {
                        if (cVar.h0(f651c) != 0) {
                            cVar.i0();
                            cVar.j0();
                        } else {
                            cVar.b();
                            while (cVar.K()) {
                                c.a aVar = j.a;
                                cVar.c();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                float f7 = 0.0f;
                                while (cVar.K()) {
                                    int h02 = cVar.h0(j.a);
                                    if (h02 != 0) {
                                        if (h02 == 1) {
                                            str5 = cVar.e0();
                                        } else if (h02 == 2) {
                                            str6 = cVar.e0();
                                        } else if (h02 != 3) {
                                            cVar.i0();
                                            cVar.j0();
                                        } else {
                                            f7 = (float) cVar.V();
                                        }
                                        arrayList5 = arrayList5;
                                        iVar2 = iVar2;
                                    } else {
                                        str4 = cVar.e0();
                                        arrayList5 = arrayList5;
                                    }
                                }
                                cVar.n();
                                hashMap3.put(str5, new c.b.a.c0.c(str4, str5, str6, f7));
                                arrayList5 = arrayList5;
                            }
                            cVar.e();
                        }
                    }
                    arrayList = arrayList5;
                    iVar = iVar2;
                    cVar.n();
                    gVar = gVar4;
                    gVar4 = gVar;
                    f5 = f3;
                    arrayList5 = arrayList;
                    f4 = f2;
                    iVar2 = iVar;
                case 9:
                    f2 = f4;
                    f3 = f5;
                    cVar.b();
                    while (cVar.K()) {
                        c.a aVar2 = i.a;
                        ArrayList arrayList7 = new ArrayList();
                        cVar.c();
                        double d2 = 0.0d;
                        double d3 = 0.0d;
                        String str7 = null;
                        String str8 = null;
                        char c3 = 0;
                        while (cVar.K()) {
                            int h03 = cVar.h0(i.a);
                            if (h03 == 0) {
                                c3 = cVar.e0().charAt(0);
                            } else if (h03 == 1) {
                                d2 = cVar.V();
                            } else if (h03 == 2) {
                                d3 = cVar.V();
                            } else if (h03 == 3) {
                                str7 = cVar.e0();
                            } else if (h03 == 4) {
                                str8 = cVar.e0();
                            } else if (h03 != 5) {
                                cVar.i0();
                                cVar.j0();
                            } else {
                                cVar.c();
                                while (cVar.K()) {
                                    if (cVar.h0(i.b) != 0) {
                                        cVar.i0();
                                        cVar.j0();
                                    } else {
                                        cVar.b();
                                        while (cVar.K()) {
                                            arrayList7.add((m) f.a(cVar, gVar4));
                                        }
                                        cVar.e();
                                    }
                                }
                                cVar.n();
                            }
                        }
                        cVar.n();
                        d dVar = new d(arrayList7, c3, d2, d3, str7, str8);
                        iVar2.j(dVar.hashCode(), dVar);
                    }
                    cVar.e();
                    arrayList = arrayList5;
                    iVar = iVar2;
                    gVar = gVar4;
                    gVar4 = gVar;
                    f5 = f3;
                    arrayList5 = arrayList;
                    f4 = f2;
                    iVar2 = iVar;
                case 10:
                    cVar.b();
                    while (cVar.K()) {
                        cVar.c();
                        String str9 = null;
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        while (cVar.K()) {
                            int h04 = cVar.h0(f652d);
                            if (h04 != 0) {
                                if (h04 == 1) {
                                    f8 = (float) cVar.V();
                                } else if (h04 != 2) {
                                    cVar.i0();
                                    cVar.j0();
                                } else {
                                    f9 = (float) cVar.V();
                                }
                                f4 = f4;
                            } else {
                                str9 = cVar.e0();
                            }
                        }
                        cVar.n();
                        arrayList5.add(new h(str9, f8, f9));
                        f5 = f5;
                        f4 = f4;
                    }
                    f2 = f4;
                    f3 = f5;
                    cVar.e();
                    arrayList = arrayList5;
                    iVar = iVar2;
                    gVar = gVar4;
                    gVar4 = gVar;
                    f5 = f3;
                    arrayList5 = arrayList;
                    f4 = f2;
                    iVar2 = iVar;
                default:
                    arrayList = arrayList5;
                    iVar = iVar2;
                    gVar = gVar4;
                    f2 = f4;
                    f3 = f5;
                    cVar.i0();
                    cVar.j0();
                    gVar4 = gVar;
                    f5 = f3;
                    arrayList5 = arrayList;
                    f4 = f2;
                    iVar2 = iVar;
            }
            arrayList5 = arrayList2;
        }
        gVar4.f671j = new Rect(0, 0, (int) (((float) i2) * c2), (int) (((float) i3) * c2));
        gVar4.f672k = f5;
        gVar4.f673l = f4;
        gVar4.f674m = f6;
        gVar4.f670i = arrayList4;
        gVar4.f669h = eVar;
        gVar4.f665c = hashMap;
        gVar4.f666d = hashMap2;
        gVar4.f668g = iVar2;
        gVar4.e = hashMap3;
        gVar4.f667f = arrayList5;
        return gVar4;
    }
}
