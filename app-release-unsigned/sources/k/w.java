package k;

import h.a.t.a;
import i.o.e;
import i.s.c.h;
import java.security.MessageDigest;

public final class w extends i {

    /* renamed from: j  reason: collision with root package name */
    public final transient byte[][] f3769j;

    /* renamed from: k  reason: collision with root package name */
    public final transient int[] f3770k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(byte[][] bArr, int[] iArr) {
        super(i.e.f3742i);
        h.f(bArr, "segments");
        h.f(iArr, "directory");
        this.f3769j = bArr;
        this.f3770k = iArr;
    }

    @Override // k.i
    public String a() {
        return n().a();
    }

    @Override // k.i
    public i b(String str) {
        h.f(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = this.f3769j.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f3770k;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            instance.update(this.f3769j[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = instance.digest();
        h.b(digest, "digest.digest()");
        return new i(digest);
    }

    @Override // k.i
    public int d() {
        return this.f3770k[this.f3769j.length - 1];
    }

    @Override // k.i
    public String e() {
        return n().e();
    }

    @Override // k.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.d() == d() && h(0, iVar, 0, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // k.i
    public byte[] f() {
        return m();
    }

    @Override // k.i
    public byte g(int i2) {
        int i3;
        a.i((long) this.f3770k[this.f3769j.length - 1], (long) i2, 1);
        int O = a.O(this, i2);
        if (O == 0) {
            i3 = 0;
        } else {
            i3 = this.f3770k[O - 1];
        }
        int[] iArr = this.f3770k;
        byte[][] bArr = this.f3769j;
        return bArr[O][(i2 - i3) + iArr[bArr.length + O]];
    }

    @Override // k.i
    public boolean h(int i2, i iVar, int i3, int i4) {
        int i5;
        h.f(iVar, "other");
        if (i2 < 0 || i2 > d() - i4) {
            return false;
        }
        int i6 = i4 + i2;
        int O = a.O(this, i2);
        while (i2 < i6) {
            if (O == 0) {
                i5 = 0;
            } else {
                i5 = this.f3770k[O - 1];
            }
            int[] iArr = this.f3770k;
            int i7 = iArr[this.f3769j.length + O];
            int min = Math.min(i6, (iArr[O] - i5) + i5) - i2;
            if (!iVar.i(i3, this.f3769j[O], (i2 - i5) + i7, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            O++;
        }
        return true;
    }

    @Override // k.i
    public int hashCode() {
        int i2 = this.f3740g;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f3769j.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f3770k;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr = this.f3769j[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f3740g = i4;
        return i4;
    }

    @Override // k.i
    public boolean i(int i2, byte[] bArr, int i3, int i4) {
        int i5;
        h.f(bArr, "other");
        if (i2 < 0 || i2 > d() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i6 = i4 + i2;
        int O = a.O(this, i2);
        while (i2 < i6) {
            if (O == 0) {
                i5 = 0;
            } else {
                i5 = this.f3770k[O - 1];
            }
            int[] iArr = this.f3770k;
            int i7 = iArr[this.f3769j.length + O];
            int min = Math.min(i6, (iArr[O] - i5) + i5) - i2;
            if (!a.f(this.f3769j[O], (i2 - i5) + i7, bArr, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            O++;
        }
        return true;
    }

    @Override // k.i
    public i j() {
        return n().j();
    }

    @Override // k.i
    public void l(e eVar, int i2, int i3) {
        int i4;
        h.f(eVar, "buffer");
        int i5 = i3 + i2;
        int O = a.O(this, i2);
        while (i2 < i5) {
            if (O == 0) {
                i4 = 0;
            } else {
                i4 = this.f3770k[O - 1];
            }
            int[] iArr = this.f3770k;
            int i6 = iArr[this.f3769j.length + O];
            int min = Math.min(i5, (iArr[O] - i4) + i4) - i2;
            int i7 = (i2 - i4) + i6;
            u uVar = new u(this.f3769j[O], i7, i7 + min, true, false);
            u uVar2 = eVar.e;
            if (uVar2 == null) {
                uVar.f3766g = uVar;
                uVar.f3765f = uVar;
                eVar.e = uVar;
            } else {
                u uVar3 = uVar2.f3766g;
                if (uVar3 != null) {
                    uVar3.b(uVar);
                } else {
                    h.j();
                    throw null;
                }
            }
            i2 += min;
            O++;
        }
        eVar.f3738f += (long) d();
    }

    public byte[] m() {
        byte[] bArr = new byte[d()];
        int length = this.f3769j.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f3770k;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            e.b(this.f3769j[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    public final i n() {
        return new i(m());
    }

    @Override // k.i
    public String toString() {
        return n().toString();
    }
}
