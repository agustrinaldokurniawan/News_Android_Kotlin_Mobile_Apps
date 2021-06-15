package j;

import i.s.c.h;
import j.a0;
import j.n0.c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import k.e;
import k.g;

public final class u extends h0 {
    public static final a0 b = a0.a.a("application/x-www-form-urlencoded");

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f3705c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f3706d;

    public static final class a {
        public final List<String> a = new ArrayList();
        public final List<String> b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final Charset f3707c = null;
    }

    static {
        a0.a aVar = a0.f3357c;
    }

    public u(List<String> list, List<String> list2) {
        h.f(list, "encodedNames");
        h.f(list2, "encodedValues");
        this.f3705c = c.v(list);
        this.f3706d = c.v(list2);
    }

    @Override // j.h0
    public long a() {
        return d(null, true);
    }

    @Override // j.h0
    public a0 b() {
        return b;
    }

    @Override // j.h0
    public void c(g gVar) {
        h.f(gVar, "sink");
        d(gVar, false);
    }

    public final long d(g gVar, boolean z) {
        e eVar;
        if (z) {
            eVar = new e();
        } else if (gVar != null) {
            eVar = gVar.d();
        } else {
            h.j();
            throw null;
        }
        int size = this.f3705c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                eVar.r0(38);
            }
            eVar.w0(this.f3705c.get(i2));
            eVar.r0(61);
            eVar.w0(this.f3706d.get(i2));
        }
        if (!z) {
            return 0;
        }
        long j2 = eVar.f3738f;
        eVar.a(j2);
        return j2;
    }
}
