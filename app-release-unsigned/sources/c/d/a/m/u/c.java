package c.d.a.m.u;

import c.d.a.m.v.c0.b;
import java.io.OutputStream;

public final class c extends OutputStream {
    public final OutputStream e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f830f;

    /* renamed from: g  reason: collision with root package name */
    public b f831g;

    /* renamed from: h  reason: collision with root package name */
    public int f832h;

    public c(OutputStream outputStream, b bVar) {
        this.e = outputStream;
        this.f831g = bVar;
        this.f830f = (byte[]) bVar.e(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.e.close();
            byte[] bArr = this.f830f;
            if (bArr != null) {
                this.f831g.d(bArr);
                this.f830f = null;
            }
        } catch (Throwable th) {
            this.e.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        int i2 = this.f832h;
        if (i2 > 0) {
            this.e.write(this.f830f, 0, i2);
            this.f832h = 0;
        }
        this.e.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        byte[] bArr = this.f830f;
        int i3 = this.f832h;
        int i4 = i3 + 1;
        this.f832h = i4;
        bArr[i3] = (byte) i2;
        if (i4 == bArr.length && i4 > 0) {
            this.e.write(bArr, 0, i4);
            this.f832h = 0;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f832h;
            if (i7 != 0 || i5 < this.f830f.length) {
                int min = Math.min(i5, this.f830f.length - i7);
                System.arraycopy(bArr, i6, this.f830f, this.f832h, min);
                int i8 = this.f832h + min;
                this.f832h = i8;
                i4 += min;
                byte[] bArr2 = this.f830f;
                if (i8 == bArr2.length && i8 > 0) {
                    this.e.write(bArr2, 0, i8);
                    this.f832h = 0;
                    continue;
                }
            } else {
                this.e.write(bArr, i6, i5);
                return;
            }
        } while (i4 < i3);
    }
}
