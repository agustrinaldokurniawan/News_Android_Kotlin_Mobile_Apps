package c.b.a.c0;

import c.c.a.a.a;
import g.f.c.g;

public class b {
    public final String a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final float f525c;

    /* renamed from: d  reason: collision with root package name */
    public final int f526d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final float f527f;

    /* renamed from: g  reason: collision with root package name */
    public final float f528g;

    /* renamed from: h  reason: collision with root package name */
    public final int f529h;

    /* renamed from: i  reason: collision with root package name */
    public final int f530i;

    /* renamed from: j  reason: collision with root package name */
    public final float f531j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f532k;

    public b(String str, String str2, float f2, int i2, int i3, float f3, float f4, int i4, int i5, float f5, boolean z) {
        this.a = str;
        this.b = str2;
        this.f525c = f2;
        this.f526d = i2;
        this.e = i3;
        this.f527f = f3;
        this.f528g = f4;
        this.f529h = i4;
        this.f530i = i5;
        this.f531j = f5;
        this.f532k = z;
    }

    public int hashCode() {
        String str = this.b;
        int f2 = ((g.f(this.f526d) + (((int) (((float) a.b(str, this.a.hashCode() * 31, 31)) + this.f525c)) * 31)) * 31) + this.e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f527f);
        return (((f2 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f529h;
    }
}
