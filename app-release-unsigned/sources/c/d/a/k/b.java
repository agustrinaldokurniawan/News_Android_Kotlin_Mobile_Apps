package c.d.a.k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class b implements Closeable {
    public final InputStream e;

    /* renamed from: f  reason: collision with root package name */
    public final Charset f782f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f783g;

    /* renamed from: h  reason: collision with root package name */
    public int f784h;

    /* renamed from: i  reason: collision with root package name */
    public int f785i;

    public class a extends ByteArrayOutputStream {
        public a(int i2) {
            super(i2);
        }

        public String toString() {
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 > 0 && ((ByteArrayOutputStream) this).buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i2, b.this.f782f.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(c.a)) {
            this.e = inputStream;
            this.f782f = charset;
            this.f783g = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void b() {
        InputStream inputStream = this.e;
        byte[] bArr = this.f783g;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f784h = 0;
            this.f785i = read;
            return;
        }
        throw new EOFException();
    }

    public String c() {
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.e) {
            if (this.f783g != null) {
                if (this.f784h >= this.f785i) {
                    b();
                }
                for (int i4 = this.f784h; i4 != this.f785i; i4++) {
                    byte[] bArr2 = this.f783g;
                    if (bArr2[i4] == 10) {
                        if (i4 != this.f784h) {
                            i3 = i4 - 1;
                            if (bArr2[i3] == 13) {
                                byte[] bArr3 = this.f783g;
                                int i5 = this.f784h;
                                String str = new String(bArr3, i5, i3 - i5, this.f782f.name());
                                this.f784h = i4 + 1;
                                return str;
                            }
                        }
                        i3 = i4;
                        byte[] bArr32 = this.f783g;
                        int i52 = this.f784h;
                        String str2 = new String(bArr32, i52, i3 - i52, this.f782f.name());
                        this.f784h = i4 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f785i - this.f784h) + 80);
                loop1:
                while (true) {
                    byte[] bArr4 = this.f783g;
                    int i6 = this.f784h;
                    aVar.write(bArr4, i6, this.f785i - i6);
                    this.f785i = -1;
                    b();
                    i2 = this.f784h;
                    while (true) {
                        if (i2 != this.f785i) {
                            bArr = this.f783g;
                            if (bArr[i2] == 10) {
                                break loop1;
                            }
                            i2++;
                        }
                    }
                }
                int i7 = this.f784h;
                if (i2 != i7) {
                    aVar.write(bArr, i7, i2 - i7);
                }
                this.f784h = i2 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.e) {
            if (this.f783g != null) {
                this.f783g = null;
                this.e.close();
            }
        }
    }
}
