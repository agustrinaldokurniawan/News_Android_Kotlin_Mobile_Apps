package c.d.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import c.d.a.m.m;
import c.d.a.m.v.c0.d;
import java.security.MessageDigest;

public class j extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(m.a);

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // c.d.a.m.x.c.f
    public Bitmap c(d dVar, Bitmap bitmap, int i2, int i3) {
        Paint paint = d0.a;
        if (bitmap.getWidth() > i2 || bitmap.getHeight() > i3) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return d0.b(dVar, bitmap, i2, i3);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        return -670243078;
    }
}
