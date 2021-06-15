package c.d.a.m.v.c0;

import android.graphics.Bitmap;

public class e implements d {
    @Override // c.d.a.m.v.c0.d
    public void a(int i2) {
    }

    @Override // c.d.a.m.v.c0.d
    public void b() {
    }

    @Override // c.d.a.m.v.c0.d
    public Bitmap c(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // c.d.a.m.v.c0.d
    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // c.d.a.m.v.c0.d
    public void e(Bitmap bitmap) {
        bitmap.recycle();
    }
}
