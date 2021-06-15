package k;

import i.s.c.h;
import java.util.zip.Inflater;

public final class n implements z {
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3747f;

    /* renamed from: g  reason: collision with root package name */
    public final h f3748g;

    /* renamed from: h  reason: collision with root package name */
    public final Inflater f3749h;

    public n(h hVar, Inflater inflater) {
        h.f(hVar, "source");
        h.f(inflater, "inflater");
        this.f3748g = hVar;
        this.f3749h = inflater;
    }

    public final boolean b() {
        if (!this.f3749h.needsInput()) {
            return false;
        }
        if (this.f3748g.R()) {
            return true;
        }
        u uVar = this.f3748g.d().e;
        if (uVar != null) {
            int i2 = uVar.f3763c;
            int i3 = uVar.b;
            int i4 = i2 - i3;
            this.e = i4;
            this.f3749h.setInput(uVar.a, i3, i4);
            return false;
        }
        h.j();
        throw null;
    }

    @Override // k.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f3747f) {
            this.f3749h.end();
            this.f3747f = true;
            this.f3748g.close();
        }
    }

    @Override // k.z
    public a0 g() {
        return this.f3748g.g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0070 A[SYNTHETIC] */
    @Override // k.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long r(k.e r10, long r11) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: k.n.r(k.e, long):long");
    }
}
