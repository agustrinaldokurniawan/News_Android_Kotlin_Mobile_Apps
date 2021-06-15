package c.d.a.s;

import java.io.FilterInputStream;
import java.io.InputStream;

public class h extends FilterInputStream {
    public int e = Integer.MIN_VALUE;

    public h(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i2 = this.e;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    public final long b(long j2) {
        int i2 = this.e;
        if (i2 == 0) {
            return -1;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : (long) i2;
    }

    public final void c(long j2) {
        int i2 = this.e;
        if (i2 != Integer.MIN_VALUE && j2 != -1) {
            this.e = (int) (((long) i2) - j2);
        }
    }

    public synchronized void mark(int i2) {
        super.mark(i2);
        this.e = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (b(1) == -1) {
            return -1;
        }
        int read = super.read();
        c(1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        int b = (int) b((long) i3);
        if (b == -1) {
            return -1;
        }
        int read = super.read(bArr, i2, b);
        c((long) read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.e = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        long b = b(j2);
        if (b == -1) {
            return 0;
        }
        long skip = super.skip(b);
        c(skip);
        return skip;
    }
}
