package c.d.a.m.x.c;

import android.graphics.Bitmap;
import c.d.a.m.m;
import c.d.a.m.v.c0.d;
import c.d.a.s.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class r extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(m.a);

    /* renamed from: c  reason: collision with root package name */
    public final float f1058c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1059d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final float f1060f;

    public r(float f2, float f3, float f4, float f5) {
        this.f1058c = f2;
        this.f1059d = f3;
        this.e = f4;
        this.f1060f = f5;
    }

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f1058c).putFloat(this.f1059d).putFloat(this.e).putFloat(this.f1060f).array());
    }

    @Override // c.d.a.m.x.c.f
    public Bitmap c(d dVar, Bitmap bitmap, int i2, int i3) {
        return d0.e(dVar, bitmap, new c0(this.f1058c, this.f1059d, this.e, this.f1060f));
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f1058c == rVar.f1058c && this.f1059d == rVar.f1059d && this.e == rVar.e && this.f1060f == rVar.f1060f;
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        return j.g(this.f1060f, j.g(this.e, j.g(this.f1059d, (j.g(this.f1058c, 17) * 31) - 2013597734)));
    }
}
