package k;

import i.s.c.h;
import java.io.OutputStream;

public final class f extends OutputStream {
    public final /* synthetic */ e e;

    public f(e eVar) {
        this.e = eVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.e + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        this.e.r0(i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        h.f(bArr, "data");
        this.e.p0(bArr, i2, i3);
    }
}
