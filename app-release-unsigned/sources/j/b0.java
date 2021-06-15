package j;

import i.s.c.f;
import i.s.c.h;
import j.a0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k.e;
import k.g;
import k.i;

public final class b0 extends h0 {
    public static final a0 b = a0.a.a("multipart/mixed");

    /* renamed from: c  reason: collision with root package name */
    public static final a0 f3360c = a0.a.a("multipart/form-data");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f3361d = {(byte) 58, (byte) 32};
    public static final byte[] e = {(byte) 13, (byte) 10};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f3362f;

    /* renamed from: g  reason: collision with root package name */
    public final a0 f3363g;

    /* renamed from: h  reason: collision with root package name */
    public long f3364h = -1;

    /* renamed from: i  reason: collision with root package name */
    public final i f3365i;

    /* renamed from: j  reason: collision with root package name */
    public final a0 f3366j;

    /* renamed from: k  reason: collision with root package name */
    public final List<b> f3367k;

    public static final class a {
        public final i a;
        public a0 b = b0.b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f3368c = new ArrayList();

        public a() {
            String uuid = UUID.randomUUID().toString();
            h.b(uuid, "UUID.randomUUID().toString()");
            h.f(uuid, "boundary");
            this.a = i.f3739f.b(uuid);
        }
    }

    public static final class b {
        public final x a;
        public final h0 b;

        public b(x xVar, h0 h0Var, f fVar) {
            this.a = xVar;
            this.b = h0Var;
        }
    }

    static {
        a0.a aVar = a0.f3357c;
        a0.a.a("multipart/alternative");
        a0.a.a("multipart/digest");
        a0.a.a("multipart/parallel");
        byte b2 = (byte) 45;
        f3362f = new byte[]{b2, b2};
    }

    public b0(i iVar, a0 a0Var, List<b> list) {
        h.f(iVar, "boundaryByteString");
        h.f(a0Var, "type");
        h.f(list, "parts");
        this.f3365i = iVar;
        this.f3366j = a0Var;
        this.f3367k = list;
        a0.a aVar = a0.f3357c;
        this.f3363g = a0.a.a(a0Var + "; boundary=" + iVar.k());
    }

    @Override // j.h0
    public long a() {
        long j2 = this.f3364h;
        if (j2 != -1) {
            return j2;
        }
        long d2 = d(null, true);
        this.f3364h = d2;
        return d2;
    }

    @Override // j.h0
    public a0 b() {
        return this.f3363g;
    }

    @Override // j.h0
    public void c(g gVar) {
        h.f(gVar, "sink");
        d(gVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: k.e */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: k.e */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: k.e */
    /* JADX WARN: Multi-variable type inference failed */
    public final long d(g gVar, boolean z) {
        e eVar;
        if (z) {
            gVar = new e();
            eVar = gVar;
        } else {
            eVar = 0;
        }
        int size = this.f3367k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f3367k.get(i2);
            x xVar = bVar.a;
            h0 h0Var = bVar.b;
            if (gVar != null) {
                gVar.h(f3362f);
                gVar.m(this.f3365i);
                gVar.h(e);
                if (xVar != null) {
                    int size2 = xVar.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        gVar.N(xVar.b(i3)).h(f3361d).N(xVar.d(i3)).h(e);
                    }
                }
                a0 b2 = h0Var.b();
                if (b2 != null) {
                    gVar.N("Content-Type: ").N(b2.f3358d).h(e);
                }
                long a2 = h0Var.a();
                if (a2 != -1) {
                    gVar.N("Content-Length: ").O(a2).h(e);
                } else if (z) {
                    if (eVar != 0) {
                        eVar.a(eVar.f3738f);
                        return -1;
                    }
                    h.j();
                    throw null;
                }
                byte[] bArr = e;
                gVar.h(bArr);
                if (z) {
                    j2 += a2;
                } else {
                    h0Var.c(gVar);
                }
                gVar.h(bArr);
            } else {
                h.j();
                throw null;
            }
        }
        if (gVar != null) {
            byte[] bArr2 = f3362f;
            gVar.h(bArr2);
            gVar.m(this.f3365i);
            gVar.h(bArr2);
            gVar.h(e);
            if (!z) {
                return j2;
            }
            if (eVar != 0) {
                long j3 = eVar.f3738f;
                long j4 = j2 + j3;
                eVar.a(j3);
                return j4;
            }
            h.j();
            throw null;
        }
        h.j();
        throw null;
    }
}
