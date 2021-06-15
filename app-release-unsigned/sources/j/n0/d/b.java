package j.n0.d;

import i.j;
import i.o.e;
import i.s.c.h;
import j.c;
import j.s;
import j.y;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;

public final class b implements c {
    public final s b;

    public b(s sVar, int i2) {
        s sVar2 = (i2 & 1) != 0 ? s.a : null;
        h.f(sVar2, "defaultDns");
        this.b = sVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0218  */
    @Override // j.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j.e0 a(j.l0 r21, j.i0 r22) {
        /*
        // Method dump skipped, instructions count: 560
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.d.b.a(j.l0, j.i0):j.e0");
    }

    public final InetAddress b(Proxy proxy, y yVar, s sVar) {
        Proxy.Type type = proxy.type();
        if (type != null && a.a[type.ordinal()] == 1) {
            return (InetAddress) e.f(sVar.a(yVar.f3716g));
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            h.b(address2, "(address() as InetSocketAddress).address");
            return address2;
        }
        throw new j("null cannot be cast to non-null type java.net.InetSocketAddress");
    }
}
