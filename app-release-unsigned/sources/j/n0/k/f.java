package j.n0.k;

import i.j;
import i.s.c.h;
import j.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public class f extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3692d;
    public static final a e = new a(null);

    public static final class a {
        public a(i.s.c.f fVar) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1.intValue() >= 9) goto L_0x002c;
     */
    static {
        /*
            j.n0.k.f$a r0 = new j.n0.k.f$a
            r1 = 0
            r0.<init>(r1)
            j.n0.k.f.e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r1 = i.x.e.x(r0)
        L_0x0014:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            r0 = r2
            goto L_0x002c
        L_0x0023:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
            r1.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0021 }
        L_0x002c:
            j.n0.k.f.f3692d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.k.f.<clinit>():void");
    }

    @Override // j.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        h.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next != d0.HTTP_1_0) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(h.a.t.a.l(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((d0) it2.next()).f3394m);
        }
        h.b(sSLParameters, "sslParameters");
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new j("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // j.n0.k.h
    public String f(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (h.a(applicationProtocol, "")) {
                    return null;
                }
                return applicationProtocol;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }
}
