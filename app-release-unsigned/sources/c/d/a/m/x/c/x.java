package c.d.a.m.x.c;

import c.d.a.m.v.c0.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class x extends FilterInputStream {
    public volatile byte[] e;

    /* renamed from: f  reason: collision with root package name */
    public int f1072f;

    /* renamed from: g  reason: collision with root package name */
    public int f1073g;

    /* renamed from: h  reason: collision with root package name */
    public int f1074h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f1075i;

    /* renamed from: j  reason: collision with root package name */
    public final b f1076j;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public x(InputStream inputStream, b bVar) {
        super(inputStream);
        this.f1076j = bVar;
        this.e = (byte[]) bVar.e(65536, byte[].class);
    }

    public static IOException e() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.e == null || inputStream == null) {
            e();
            throw null;
        }
        return (this.f1072f - this.f1075i) + inputStream.available();
    }

    public final int b(InputStream inputStream, byte[] bArr) {
        int i2;
        int i3 = this.f1074h;
        if (i3 == -1 || this.f1075i - i3 >= (i2 = this.f1073g)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f1074h = -1;
                this.f1075i = 0;
                this.f1072f = read;
            }
            return read;
        }
        if (i3 == 0 && i2 > bArr.length && this.f1072f == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i2) {
                i2 = length;
            }
            byte[] bArr2 = (byte[]) this.f1076j.e(i2, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.e = bArr2;
            this.f1076j.d(bArr);
            bArr = bArr2;
        } else if (i3 > 0) {
            System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
        }
        int i4 = this.f1075i - this.f1074h;
        this.f1075i = i4;
        this.f1074h = 0;
        this.f1072f = 0;
        int read2 = inputStream.read(bArr, i4, bArr.length - i4);
        int i5 = this.f1075i;
        if (read2 > 0) {
            i5 += read2;
        }
        this.f1072f = i5;
        return read2;
    }

    public synchronized void c() {
        if (this.e != null) {
            this.f1076j.d(this.e);
            this.e = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        if (this.e != null) {
            this.f1076j.d(this.e);
            this.e = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i2) {
        this.f1073g = Math.max(this.f1073g, i2);
        this.f1074h = this.f1075i;
    }

    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.e;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            e();
            throw null;
        } else if (this.f1075i >= this.f1072f && b(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr == this.e || (bArr = this.e) != null) {
                int i2 = this.f1072f;
                int i3 = this.f1075i;
                if (i2 - i3 <= 0) {
                    return -1;
                }
                this.f1075i = i3 + 1;
                return bArr[i3] & 255;
            }
            e();
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr2 = this.e;
        if (bArr2 == null) {
            e();
            throw null;
        } else if (i3 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i6 = this.f1075i;
                int i7 = this.f1072f;
                if (i6 < i7) {
                    int i8 = i7 - i6 >= i3 ? i3 : i7 - i6;
                    System.arraycopy(bArr2, i6, bArr, i2, i8);
                    this.f1075i += i8;
                    if (i8 == i3 || inputStream.available() == 0) {
                        return i8;
                    }
                    i2 += i8;
                    i4 = i3 - i8;
                } else {
                    i4 = i3;
                }
                while (true) {
                    int i9 = -1;
                    if (this.f1074h == -1 && i4 >= bArr2.length) {
                        i5 = inputStream.read(bArr, i2, i4);
                        if (i5 == -1) {
                            if (i4 != i3) {
                                i9 = i3 - i4;
                            }
                            return i9;
                        }
                    } else if (b(inputStream, bArr2) == -1) {
                        if (i4 != i3) {
                            i9 = i3 - i4;
                        }
                        return i9;
                    } else if (bArr2 == this.e || (bArr2 = this.e) != null) {
                        int i10 = this.f1072f;
                        int i11 = this.f1075i;
                        i5 = i10 - i11 >= i4 ? i4 : i10 - i11;
                        System.arraycopy(bArr2, i11, bArr, i2, i5);
                        this.f1075i += i5;
                    } else {
                        e();
                        throw null;
                    }
                    i4 -= i5;
                    if (i4 == 0) {
                        return i3;
                    }
                    if (inputStream.available() == 0) {
                        return i3 - i4;
                    }
                    i2 += i5;
                }
            } else {
                e();
                throw null;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.e != null) {
            int i2 = this.f1074h;
            if (-1 != i2) {
                this.f1075i = i2;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f1075i + " markLimit: " + this.f1073g);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) {
        if (j2 < 1) {
            return 0;
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i2 = this.f1072f;
                int i3 = this.f1075i;
                if (((long) (i2 - i3)) >= j2) {
                    this.f1075i = (int) (((long) i3) + j2);
                    return j2;
                }
                long j3 = ((long) i2) - ((long) i3);
                this.f1075i = i2;
                if (this.f1074h == -1 || j2 > ((long) this.f1073g)) {
                    long skip = inputStream.skip(j2 - j3);
                    if (skip > 0) {
                        this.f1074h = -1;
                    }
                    return j3 + skip;
                } else if (b(inputStream, bArr) == -1) {
                    return j3;
                } else {
                    int i4 = this.f1072f;
                    int i5 = this.f1075i;
                    if (((long) (i4 - i5)) >= j2 - j3) {
                        this.f1075i = (int) ((((long) i5) + j2) - j3);
                        return j2;
                    }
                    long j4 = (j3 + ((long) i4)) - ((long) i5);
                    this.f1075i = i4;
                    return j4;
                }
            } else {
                e();
                throw null;
            }
        } else {
            e();
            throw null;
        }
    }
}
