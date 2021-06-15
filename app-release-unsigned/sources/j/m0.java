package j;

import i.s.c.f;
import i.s.c.h;

public enum m0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: k  reason: collision with root package name */
    public static final a f3456k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public final String f3457l;

    public static final class a {
        public a(f fVar) {
        }

        public final m0 a(String str) {
            h.f(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return m0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return m0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return m0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return m0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return m0.SSL_3_0;
            }
            throw new IllegalArgumentException(c.c.a.a.a.q("Unexpected TLS version: ", str));
        }
    }

    /* access modifiers changed from: public */
    m0(String str) {
        this.f3457l = str;
    }
}
