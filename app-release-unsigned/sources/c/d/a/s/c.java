package c.d.a.s;

import c.c.a.a.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public int f1161f;

    public c(InputStream inputStream, long j2) {
        super(inputStream);
        this.e = j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.e - ((long) this.f1161f), (long) ((FilterInputStream) this).in.available());
    }

    public final int b(int i2) {
        if (i2 >= 0) {
            this.f1161f += i2;
        } else if (this.e - ((long) this.f1161f) > 0) {
            StringBuilder f2 = a.f("Failed to read all expected data, expected: ");
            f2.append(this.e);
            f2.append(", but read: ");
            f2.append(this.f1161f);
            throw new IOException(f2.toString());
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        b(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) {
        int read;
        read = super.read(bArr, i2, i3);
        b(read);
        return read;
    }
}
