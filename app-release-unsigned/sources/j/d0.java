package j;

import i.s.c.f;

public enum d0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: l  reason: collision with root package name */
    public static final a f3393l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public final String f3394m;

    public static final class a {
        public a(f fVar) {
        }
    }

    /* access modifiers changed from: public */
    d0(String str) {
        this.f3394m = str;
    }

    public String toString() {
        return this.f3394m;
    }
}
