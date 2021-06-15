package j.n0.e;

import i.j;
import i.s.c.f;
import i.s.c.h;
import i.x.e;
import j.d0;
import j.e0;
import j.i0;
import j.j0;
import j.n0.g.c;
import j.n0.h.g;
import j.w;
import j.x;
import j.z;
import java.util.ArrayList;

public final class a implements z {
    public static final C0122a a = new C0122a(null);

    /* renamed from: j.n0.e.a$a  reason: collision with other inner class name */
    public static final class C0122a {
        public C0122a(f fVar) {
        }

        public static final i0 a(C0122a aVar, i0 i0Var) {
            if ((i0Var != null ? i0Var.f3413k : null) == null) {
                return i0Var;
            }
            h.f(i0Var, "response");
            e0 e0Var = i0Var.e;
            d0 d0Var = i0Var.f3408f;
            int i2 = i0Var.f3410h;
            String str = i0Var.f3409g;
            w wVar = i0Var.f3411i;
            x.a c2 = i0Var.f3412j.c();
            i0 i0Var2 = i0Var.f3414l;
            i0 i0Var3 = i0Var.f3415m;
            i0 i0Var4 = i0Var.n;
            long j2 = i0Var.o;
            long j3 = i0Var.p;
            c cVar = i0Var.q;
            if (!(i2 >= 0)) {
                throw new IllegalStateException(c.c.a.a.a.l("code < 0: ", i2).toString());
            } else if (e0Var == null) {
                throw new IllegalStateException("request == null".toString());
            } else if (d0Var == null) {
                throw new IllegalStateException("protocol == null".toString());
            } else if (str != null) {
                return new i0(e0Var, d0Var, str, i2, wVar, c2.c(), null, i0Var2, i0Var3, i0Var4, j2, j3, cVar);
            } else {
                throw new IllegalStateException("message == null".toString());
            }
        }

        public final boolean b(String str) {
            return e.d("Content-Length", str, true) || e.d("Content-Encoding", str, true) || e.d("Content-Type", str, true);
        }

        public final boolean c(String str) {
            return !e.d("Connection", str, true) && !e.d("Keep-Alive", str, true) && !e.d("Proxy-Authenticate", str, true) && !e.d("Proxy-Authorization", str, true) && !e.d("TE", str, true) && !e.d("Trailers", str, true) && !e.d("Transfer-Encoding", str, true) && !e.d("Upgrade", str, true);
        }
    }

    @Override // j.z
    public i0 a(z.a aVar) {
        x xVar;
        h.f(aVar, "chain");
        g gVar = (g) aVar;
        j.n0.g.e eVar = gVar.b;
        System.currentTimeMillis();
        e0 e0Var = gVar.f3544f;
        h.f(e0Var, "request");
        b bVar = new b(e0Var, null);
        if (e0Var != null && e0Var.a().f3384k) {
            bVar = new b(null, null);
        }
        e0 e0Var2 = bVar.a;
        i0 i0Var = bVar.b;
        if (!(eVar instanceof j.n0.g.e)) {
        }
        if (e0Var2 == null && i0Var == null) {
            i0.a aVar2 = new i0.a();
            aVar2.g(gVar.f3544f);
            aVar2.f(d0.HTTP_1_1);
            aVar2.f3416c = 504;
            aVar2.e("Unsatisfiable Request (only-if-cached)");
            aVar2.f3419g = j.n0.c.f3469c;
            aVar2.f3423k = -1;
            aVar2.f3424l = System.currentTimeMillis();
            i0 a2 = aVar2.a();
            h.f(eVar, "call");
            h.f(a2, "response");
            return a2;
        } else if (e0Var2 != null) {
            if (i0Var != null) {
                h.f(eVar, "call");
                h.f(i0Var, "cachedResponse");
            }
            i0 b = ((g) aVar).b(e0Var2);
            if (i0Var != null) {
                if (b.f3410h == 304) {
                    i0.a aVar3 = new i0.a(i0Var);
                    C0122a aVar4 = a;
                    x xVar2 = i0Var.f3412j;
                    x xVar3 = b.f3412j;
                    ArrayList arrayList = new ArrayList(20);
                    int size = xVar2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        String b2 = xVar2.b(i2);
                        String d2 = xVar2.d(i2);
                        if (e.d("Warning", b2, true)) {
                            xVar = xVar2;
                            if (e.u(d2, "1", false, 2)) {
                                i2++;
                                xVar2 = xVar;
                            }
                        } else {
                            xVar = xVar2;
                        }
                        if (aVar4.b(b2) || !aVar4.c(b2) || xVar3.a(b2) == null) {
                            h.f(b2, "name");
                            h.f(d2, "value");
                            arrayList.add(b2);
                            arrayList.add(e.y(d2).toString());
                            i2++;
                            xVar2 = xVar;
                        } else {
                            i2++;
                            xVar2 = xVar;
                        }
                    }
                    int size2 = xVar3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        String b3 = xVar3.b(i3);
                        if (!aVar4.b(b3) && aVar4.c(b3)) {
                            String d3 = xVar3.d(i3);
                            h.f(b3, "name");
                            h.f(d3, "value");
                            arrayList.add(b3);
                            arrayList.add(e.y(d3).toString());
                        }
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        aVar3.d(new x((String[]) array, null));
                        aVar3.f3423k = b.o;
                        aVar3.f3424l = b.p;
                        C0122a aVar5 = a;
                        aVar3.b(C0122a.a(aVar5, i0Var));
                        i0 a3 = C0122a.a(aVar5, b);
                        aVar3.c("networkResponse", a3);
                        aVar3.f3420h = a3;
                        aVar3.a();
                        j0 j0Var = b.f3413k;
                        if (j0Var != null) {
                            j0Var.close();
                            h.j();
                            throw null;
                        }
                        h.j();
                        throw null;
                    }
                    throw new j("null cannot be cast to non-null type kotlin.Array<T>");
                }
                j0 j0Var2 = i0Var.f3413k;
                if (j0Var2 != null) {
                    byte[] bArr = j.n0.c.a;
                    h.f(j0Var2, "$this$closeQuietly");
                    try {
                        j0Var2.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
            }
            i0.a aVar6 = new i0.a(b);
            C0122a aVar7 = a;
            aVar6.b(C0122a.a(aVar7, i0Var));
            i0 a4 = C0122a.a(aVar7, b);
            aVar6.c("networkResponse", a4);
            aVar6.f3420h = a4;
            return aVar6.a();
        } else if (i0Var != null) {
            i0.a aVar8 = new i0.a(i0Var);
            aVar8.b(C0122a.a(a, i0Var));
            i0 a5 = aVar8.a();
            h.f(eVar, "call");
            h.f(a5, "response");
            return a5;
        } else {
            h.j();
            throw null;
        }
    }
}
