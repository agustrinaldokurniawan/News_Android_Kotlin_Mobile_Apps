package c.d.a.m.x.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c.d.a.m.v.s;
import c.d.a.m.v.w;
import java.util.Objects;

public final class v implements w<BitmapDrawable>, s {
    public final Resources e;

    /* renamed from: f  reason: collision with root package name */
    public final w<Bitmap> f1071f;

    public v(Resources resources, w<Bitmap> wVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.e = resources;
        this.f1071f = wVar;
    }

    public static w<BitmapDrawable> e(Resources resources, w<Bitmap> wVar) {
        if (wVar == null) {
            return null;
        }
        return new v(resources, wVar);
    }

    @Override // c.d.a.m.v.s
    public void a() {
        w<Bitmap> wVar = this.f1071f;
        if (wVar instanceof s) {
            ((s) wVar).a();
        }
    }

    @Override // c.d.a.m.v.w
    public int b() {
        return this.f1071f.b();
    }

    @Override // c.d.a.m.v.w
    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // c.d.a.m.v.w
    public void d() {
        this.f1071f.d();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.d.a.m.v.w
    public BitmapDrawable get() {
        return new BitmapDrawable(this.e, this.f1071f.get());
    }
}
