package c.d.a.l;

import android.graphics.Bitmap;
import android.util.Log;
import c.d.a.l.a;
import c.d.a.m.x.g.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public class e implements a {
    public static final String a = "e";
    public int[] b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f804c = new int[256];

    /* renamed from: d  reason: collision with root package name */
    public final a.AbstractC0013a f805d;
    public ByteBuffer e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f806f;

    /* renamed from: g  reason: collision with root package name */
    public short[] f807g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f808h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f809i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f810j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f811k;

    /* renamed from: l  reason: collision with root package name */
    public int f812l;

    /* renamed from: m  reason: collision with root package name */
    public c f813m;
    public Bitmap n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public Boolean t;
    public Bitmap.Config u = Bitmap.Config.ARGB_8888;

    public e(a.AbstractC0013a aVar, c cVar, ByteBuffer byteBuffer, int i2) {
        this.f805d = aVar;
        this.f813m = new c();
        synchronized (this) {
            if (i2 > 0) {
                int highestOneBit = Integer.highestOneBit(i2);
                this.p = 0;
                this.f813m = cVar;
                this.f812l = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.e = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.e.order(ByteOrder.LITTLE_ENDIAN);
                this.o = false;
                Iterator<b> it = cVar.e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f789g == 3) {
                            this.o = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.q = highestOneBit;
                int i3 = cVar.f796f;
                this.s = i3 / highestOneBit;
                int i4 = cVar.f797g;
                this.r = i4 / highestOneBit;
                this.f810j = ((b) this.f805d).a(i3 * i4);
                a.AbstractC0013a aVar2 = this.f805d;
                int i5 = this.s * this.r;
                c.d.a.m.v.c0.b bVar = ((b) aVar2).b;
                this.f811k = bVar == null ? new int[i5] : (int[]) bVar.e(i5, int[].class);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
            }
        }
    }

    @Override // c.d.a.l.a
    public int a() {
        return this.f812l;
    }

    @Override // c.d.a.l.a
    public int b() {
        return (this.f811k.length * 4) + this.e.limit() + this.f810j.length;
    }

    @Override // c.d.a.l.a
    public synchronized Bitmap c() {
        if (this.f813m.f794c <= 0 || this.f812l < 0) {
            String str = a;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f813m.f794c + ", framePointer=" + this.f812l);
            }
            this.p = 1;
        }
        int i2 = this.p;
        if (i2 != 1) {
            if (i2 != 2) {
                this.p = 0;
                if (this.f806f == null) {
                    this.f806f = ((b) this.f805d).a(255);
                }
                b bVar = this.f813m.e.get(this.f812l);
                int i3 = this.f812l - 1;
                b bVar2 = i3 >= 0 ? this.f813m.e.get(i3) : null;
                int[] iArr = bVar.f793k;
                if (iArr == null) {
                    iArr = this.f813m.a;
                }
                this.b = iArr;
                if (iArr == null) {
                    String str2 = a;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f812l);
                    }
                    this.p = 1;
                    return null;
                }
                if (bVar.f788f) {
                    System.arraycopy(iArr, 0, this.f804c, 0, iArr.length);
                    int[] iArr2 = this.f804c;
                    this.b = iArr2;
                    iArr2[bVar.f790h] = 0;
                    if (bVar.f789g == 2 && this.f812l == 0) {
                        this.t = Boolean.TRUE;
                    }
                }
                return j(bVar, bVar2);
            }
        }
        String str3 = a;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.p);
        }
        return null;
    }

    @Override // c.d.a.l.a
    public void clear() {
        c.d.a.m.v.c0.b bVar;
        c.d.a.m.v.c0.b bVar2;
        c.d.a.m.v.c0.b bVar3;
        this.f813m = null;
        byte[] bArr = this.f810j;
        if (!(bArr == null || (bVar3 = ((b) this.f805d).b) == null)) {
            bVar3.d(bArr);
        }
        int[] iArr = this.f811k;
        if (!(iArr == null || (bVar2 = ((b) this.f805d).b) == null)) {
            bVar2.d(iArr);
        }
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            ((b) this.f805d).a.e(bitmap);
        }
        this.n = null;
        this.e = null;
        this.t = null;
        byte[] bArr2 = this.f806f;
        if (bArr2 != null && (bVar = ((b) this.f805d).b) != null) {
            bVar.d(bArr2);
        }
    }

    @Override // c.d.a.l.a
    public void d() {
        this.f812l = (this.f812l + 1) % this.f813m.f794c;
    }

    @Override // c.d.a.l.a
    public int e() {
        return this.f813m.f794c;
    }

    @Override // c.d.a.l.a
    public int f() {
        int i2;
        c cVar = this.f813m;
        int i3 = cVar.f794c;
        if (i3 <= 0 || (i2 = this.f812l) < 0) {
            return 0;
        }
        if (i2 < 0 || i2 >= i3) {
            return -1;
        }
        return cVar.e.get(i2).f791i;
    }

    @Override // c.d.a.l.a
    public ByteBuffer g() {
        return this.e;
    }

    public final Bitmap h() {
        Boolean bool = this.t;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.u;
        Bitmap c2 = ((b) this.f805d).a.c(this.s, this.r, config);
        c2.setHasAlpha(true);
        return c2;
    }

    public void i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v29, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f800j == r36.f790h) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap j(c.d.a.l.b r36, c.d.a.l.b r37) {
        /*
        // Method dump skipped, instructions count: 1075
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.l.e.j(c.d.a.l.b, c.d.a.l.b):android.graphics.Bitmap");
    }
}
