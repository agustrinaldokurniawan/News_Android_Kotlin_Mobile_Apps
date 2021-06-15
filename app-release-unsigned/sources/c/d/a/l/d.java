package c.d.a.l;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;

public class d {
    public final byte[] a = new byte[256];
    public ByteBuffer b;

    /* renamed from: c  reason: collision with root package name */
    public c f802c;

    /* renamed from: d  reason: collision with root package name */
    public int f803d = 0;

    public final boolean a() {
        return this.f802c.b != 0;
    }

    public c b() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f802c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 6; i2++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f802c.b = 1;
            } else {
                this.f802c.f796f = f();
                this.f802c.f797g = f();
                int c2 = c();
                c cVar = this.f802c;
                cVar.f798h = (c2 & 128) != 0;
                cVar.f799i = (int) Math.pow(2.0d, (double) ((c2 & 7) + 1));
                this.f802c.f800j = c();
                c cVar2 = this.f802c;
                c();
                Objects.requireNonNull(cVar2);
                if (this.f802c.f798h && !a()) {
                    c cVar3 = this.f802c;
                    cVar3.a = e(cVar3.f799i);
                    c cVar4 = this.f802c;
                    cVar4.f801k = cVar4.a[cVar4.f800j];
                }
            }
            if (!a()) {
                boolean z = false;
                while (!z && !a() && this.f802c.f794c <= Integer.MAX_VALUE) {
                    int c3 = c();
                    if (c3 == 33) {
                        int c4 = c();
                        if (c4 != 1) {
                            if (c4 != 249) {
                                if (c4 != 254 && c4 == 255) {
                                    d();
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i3 = 0; i3 < 11; i3++) {
                                        sb2.append((char) this.a[i3]);
                                    }
                                    if (sb2.toString().equals("NETSCAPE2.0")) {
                                        do {
                                            d();
                                            byte[] bArr = this.a;
                                            if (bArr[0] == 1) {
                                                byte b2 = bArr[1];
                                                byte b3 = bArr[2];
                                                Objects.requireNonNull(this.f802c);
                                            }
                                            if (this.f803d <= 0) {
                                                break;
                                            }
                                        } while (!a());
                                    }
                                }
                            } else {
                                this.f802c.f795d = new b();
                                c();
                                int c5 = c();
                                b bVar = this.f802c.f795d;
                                int i4 = (c5 & 28) >> 2;
                                bVar.f789g = i4;
                                if (i4 == 0) {
                                    bVar.f789g = 1;
                                }
                                bVar.f788f = (c5 & 1) != 0;
                                int f2 = f();
                                if (f2 < 2) {
                                    f2 = 10;
                                }
                                b bVar2 = this.f802c.f795d;
                                bVar2.f791i = f2 * 10;
                                bVar2.f790h = c();
                                c();
                            }
                        }
                        g();
                    } else if (c3 == 44) {
                        c cVar5 = this.f802c;
                        if (cVar5.f795d == null) {
                            cVar5.f795d = new b();
                        }
                        cVar5.f795d.a = f();
                        this.f802c.f795d.b = f();
                        this.f802c.f795d.f786c = f();
                        this.f802c.f795d.f787d = f();
                        int c6 = c();
                        boolean z2 = (c6 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c6 & 7) + 1));
                        b bVar3 = this.f802c.f795d;
                        bVar3.e = (c6 & 64) != 0;
                        if (z2) {
                            bVar3.f793k = e(pow);
                        } else {
                            bVar3.f793k = null;
                        }
                        this.f802c.f795d.f792j = this.b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.f802c;
                            cVar6.f794c++;
                            cVar6.e.add(cVar6.f795d);
                        }
                    } else if (c3 != 59) {
                        this.f802c.b = 1;
                    } else {
                        z = true;
                    }
                }
                c cVar7 = this.f802c;
                if (cVar7.f794c < 0) {
                    cVar7.b = 1;
                }
            }
            return this.f802c;
        }
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.f802c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int c2 = c();
        this.f803d = c2;
        if (c2 > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    int i4 = this.f803d;
                    if (i2 < i4) {
                        i3 = i4 - i2;
                        this.b.get(this.a, i2, i3);
                        i2 += i3;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i2 + " count: " + i3 + " blockSize: " + this.f803d, e);
                    }
                    this.f802c.b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i2) {
        byte[] bArr = new byte[(i2 * 3)];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | -16777216 | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f802c.b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.b.getShort();
    }

    public final void g() {
        int c2;
        do {
            c2 = c();
            this.b.position(Math.min(this.b.position() + c2, this.b.limit()));
        } while (c2 > 0);
    }
}
