package k;

import i.o.e;
import i.s.c.h;

public final class u {
    public final byte[] a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f3763c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3764d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public u f3765f;

    /* renamed from: g  reason: collision with root package name */
    public u f3766g;

    public u() {
        this.a = new byte[8192];
        this.e = true;
        this.f3764d = false;
    }

    public u(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        h.f(bArr, "data");
        this.a = bArr;
        this.b = i2;
        this.f3763c = i3;
        this.f3764d = z;
        this.e = z2;
    }

    public final u a() {
        u uVar = this.f3765f;
        u uVar2 = uVar != this ? uVar : null;
        u uVar3 = this.f3766g;
        if (uVar3 != null) {
            uVar3.f3765f = uVar;
            u uVar4 = this.f3765f;
            if (uVar4 != null) {
                uVar4.f3766g = uVar3;
                this.f3765f = null;
                this.f3766g = null;
                return uVar2;
            }
            h.j();
            throw null;
        }
        h.j();
        throw null;
    }

    public final u b(u uVar) {
        h.f(uVar, "segment");
        uVar.f3766g = this;
        uVar.f3765f = this.f3765f;
        u uVar2 = this.f3765f;
        if (uVar2 != null) {
            uVar2.f3766g = uVar;
            this.f3765f = uVar;
            return uVar;
        }
        h.j();
        throw null;
    }

    public final u c() {
        this.f3764d = true;
        return new u(this.a, this.b, this.f3763c, true, false);
    }

    public final void d(u uVar, int i2) {
        h.f(uVar, "sink");
        if (uVar.e) {
            int i3 = uVar.f3763c;
            if (i3 + i2 > 8192) {
                if (!uVar.f3764d) {
                    int i4 = uVar.b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = uVar.a;
                        e.c(bArr, bArr, 0, i4, i3, 2);
                        uVar.f3763c -= uVar.b;
                        uVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = uVar.a;
            int i5 = uVar.f3763c;
            int i6 = this.b;
            e.b(bArr2, bArr3, i5, i6, i6 + i2);
            uVar.f3763c += i2;
            this.b += i2;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
