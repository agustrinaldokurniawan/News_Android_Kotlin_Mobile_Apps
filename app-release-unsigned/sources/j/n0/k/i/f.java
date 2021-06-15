package j.n0.k.i;

import i.s.c.h;
import j.d0;
import j.n0.k.b;
import j.n0.k.i.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

public class f implements k {
    public static final j.a a = new e("com.google.android.gms.org.conscrypt");
    public static final a b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f3697c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f3698d;
    public final Method e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f3699f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<? super SSLSocket> f3700g;

    public static final class a {
        public a(i.s.c.f fVar) {
        }
    }

    static {
        a aVar = new a(null);
        b = aVar;
        Objects.requireNonNull(aVar);
        h.f("com.google.android.gms.org.conscrypt", "packageName");
    }

    public f(Class<? super SSLSocket> cls) {
        h.f(cls, "sslSocketClass");
        this.f3700g = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        h.b(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3697c = declaredMethod;
        this.f3698d = cls.getMethod("setHostname", String.class);
        this.e = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f3699f = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // j.n0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        return this.f3700g.isInstance(sSLSocket);
    }

    @Override // j.n0.k.i.k
    public String b(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.e.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            h.b(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e2) {
            if (h.a(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // j.n0.k.i.k
    public boolean c() {
        b.a aVar = b.e;
        return b.f3680d;
    }

    @Override // j.n0.k.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f3697c.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f3698d.invoke(sSLSocket, str);
                }
                this.f3699f.invoke(sSLSocket, j.n0.k.h.f3695c.b(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
