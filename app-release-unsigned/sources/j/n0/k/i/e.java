package j.n0.k.i;

import i.s.c.h;
import j.n0.k.i.f;
import j.n0.k.i.j;
import javax.net.ssl.SSLSocket;

public final class e implements j.a {
    public final /* synthetic */ String a;

    public e(String str) {
        this.a = str;
    }

    @Override // j.n0.k.i.j.a
    public boolean a(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        h.b(name, "sslSocket.javaClass.name");
        return i.x.e.u(name, this.a + '.', false, 2);
    }

    @Override // j.n0.k.i.j.a
    public k b(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        f.a aVar = f.b;
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (cls2 != null && (!h.a(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        if (cls2 != null) {
            return new f(cls2);
        }
        h.j();
        throw null;
    }
}
