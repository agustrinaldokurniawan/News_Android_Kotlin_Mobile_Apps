package j;

import h.a.t.a;
import i.o.c;
import i.s.c.h;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public final class r implements s {
    @Override // j.s
    public List<InetAddress> a(String str) {
        h.f(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            h.b(allByName, "InetAddress.getAllByName(hostname)");
            h.e(allByName, "$this$toList");
            int length = allByName.length;
            if (length == 0) {
                return i.o.h.e;
            }
            if (length == 1) {
                return a.G(allByName[0]);
            }
            h.e(allByName, "$this$toMutableList");
            h.e(allByName, "$this$asCollection");
            return new ArrayList(new c(allByName, false));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(c.c.a.a.a.q("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
