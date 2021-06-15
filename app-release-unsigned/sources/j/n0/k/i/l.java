package j.n0.k.i;

import i.s.c.f;
import i.s.c.h;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class l extends f {

    /* renamed from: h  reason: collision with root package name */
    public static final a f3702h = new a(null);

    public static final class a {
        public a(f fVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        h.f(cls, "sslSocketClass");
        h.f(cls2, "sslSocketFactoryClass");
        h.f(cls3, "paramClass");
    }
}
