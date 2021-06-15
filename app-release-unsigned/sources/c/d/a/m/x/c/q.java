package c.d.a.m.x.c;

import android.graphics.Bitmap;
import c.d.a.m.m;
import c.d.a.m.v.c0.d;
import java.security.MessageDigest;

public class q extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(m.a);

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // c.d.a.m.x.c.f
    public Bitmap c(d dVar, Bitmap bitmap, int i2, int i3) {
        return d0.b(dVar, bitmap, i2, i3);
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        return 1572326941;
    }
}
