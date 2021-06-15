package c.d.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.Paint;
import c.d.a.m.m;
import c.d.a.m.v.c0.d;
import c.d.a.s.j;
import g.q.a;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class z extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(m.a);

    /* renamed from: c  reason: collision with root package name */
    public final int f1077c;

    public z(int i2) {
        a.c(i2 > 0, "roundingRadius must be greater than 0.");
        this.f1077c = i2;
    }

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f1077c).array());
    }

    @Override // c.d.a.m.x.c.f
    public Bitmap c(d dVar, Bitmap bitmap, int i2, int i3) {
        int i4 = this.f1077c;
        Paint paint = d0.a;
        a.c(i4 > 0, "roundingRadius must be greater than 0.");
        return d0.e(dVar, bitmap, new b0(i4));
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        return (obj instanceof z) && this.f1077c == ((z) obj).f1077c;
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        int i2 = this.f1077c;
        char[] cArr = j.a;
        return ((i2 + 527) * 31) - 569625254;
    }
}
