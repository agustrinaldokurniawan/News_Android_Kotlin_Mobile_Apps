package j.n0.g;

import c.c.a.a.a;
import i.s.c.h;
import j.j;
import j.m;
import j.n0.c;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class b {
    public int a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3485c;

    /* renamed from: d  reason: collision with root package name */
    public final List<m> f3486d;

    public b(List<m> list) {
        h.f(list, "connectionSpecs");
        this.f3486d = list;
    }

    public final m a(SSLSocket sSLSocket) {
        m mVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        h.f(sSLSocket, "sslSocket");
        int i2 = this.a;
        int size = this.f3486d.size();
        while (true) {
            if (i2 >= size) {
                mVar = null;
                break;
            }
            mVar = this.f3486d.get(i2);
            if (mVar.b(sSLSocket)) {
                this.a = i2 + 1;
                break;
            }
            i2++;
        }
        if (mVar == null) {
            StringBuilder f2 = a.f("Unable to find acceptable protocols. isFallback=");
            f2.append(this.f3485c);
            f2.append(',');
            f2.append(" modes=");
            f2.append(this.f3486d);
            f2.append(',');
            f2.append(" supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (enabledProtocols == null) {
                h.j();
                throw null;
            }
            String arrays = Arrays.toString(enabledProtocols);
            h.b(arrays, "java.util.Arrays.toString(this)");
            f2.append(arrays);
            throw new UnknownServiceException(f2.toString());
        }
        int i3 = this.a;
        int size2 = this.f3486d.size();
        while (true) {
            if (i3 >= size2) {
                z = false;
                break;
            } else if (this.f3486d.get(i3).b(sSLSocket)) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        this.b = z;
        boolean z2 = this.f3485c;
        h.f(sSLSocket, "sslSocket");
        if (mVar.f3447g != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            h.b(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            String[] strArr3 = mVar.f3447g;
            j.b bVar = j.s;
            Comparator<String> comparator = j.a;
            strArr = c.o(enabledCipherSuites, strArr3, j.a);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (mVar.f3448h != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            h.b(enabledProtocols2, "sslSocket.enabledProtocols");
            strArr2 = c.o(enabledProtocols2, mVar.f3448h, i.p.a.a);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        h.b(supportedCipherSuites, "supportedCipherSuites");
        j.b bVar2 = j.s;
        Comparator<String> comparator2 = j.a;
        Comparator<String> comparator3 = j.a;
        byte[] bArr = c.a;
        h.f(supportedCipherSuites, "$this$indexOf");
        h.f("TLS_FALLBACK_SCSV", "value");
        h.f(comparator3, "comparator");
        int length = supportedCipherSuites.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (((j.a) comparator3).compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i4++;
        }
        if (z2 && i4 != -1) {
            h.b(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i4];
            h.b(str, "supportedCipherSuites[indexOfFallbackScsv]");
            h.f(strArr, "$this$concat");
            h.f(str, "value");
            Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
            h.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            strArr = (String[]) copyOf;
            h.e(strArr, "$this$lastIndex");
            strArr[strArr.length - 1] = str;
        }
        m.a aVar = new m.a(mVar);
        h.b(strArr, "cipherSuitesIntersection");
        aVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
        h.b(strArr2, "tlsVersionsIntersection");
        aVar.e((String[]) Arrays.copyOf(strArr2, strArr2.length));
        m a2 = aVar.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.f3448h);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f3447g);
        }
        return mVar;
    }
}
