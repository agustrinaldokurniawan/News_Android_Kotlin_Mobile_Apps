package c.d.a.m.u;

import c.c.a.a.a;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream {
    public static final byte[] e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f833f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f834g;

    /* renamed from: h  reason: collision with root package name */
    public final byte f835h;

    /* renamed from: i  reason: collision with root package name */
    public int f836i;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        e = bArr;
        int length = bArr.length;
        f833f = length;
        f834g = length + 2;
    }

    public g(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 < -1 || i2 > 8) {
            throw new IllegalArgumentException(a.l("Cannot add invalid orientation: ", i2));
        }
        this.f835h = (byte) i2;
    }

    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i2;
        int i3 = this.f836i;
        int read = (i3 < 2 || i3 > (i2 = f834g)) ? super.read() : i3 == i2 ? this.f835h : e[i3 - 2] & 255;
        if (read != -1) {
            this.f836i++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = this.f836i;
        int i6 = f834g;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.f835h;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int min = Math.min(i6 - i5, i3);
            System.arraycopy(e, this.f836i - 2, bArr, i2, min);
            i4 = min;
        }
        if (i4 > 0) {
            this.f836i += i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        long skip = super.skip(j2);
        if (skip > 0) {
            this.f836i = (int) (((long) this.f836i) + skip);
        }
        return skip;
    }
}
