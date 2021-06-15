package c.d.a.m.x.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.w;

public class a<DataType> implements r<DataType, BitmapDrawable> {
    public final r<DataType, Bitmap> a;
    public final Resources b;

    public a(Resources resources, r<DataType, Bitmap> rVar) {
        this.b = resources;
        this.a = rVar;
    }

    @Override // c.d.a.m.r
    public w<BitmapDrawable> a(DataType datatype, int i2, int i3, p pVar) {
        return v.e(this.b, this.a.a(datatype, i2, i3, pVar));
    }

    @Override // c.d.a.m.r
    public boolean b(DataType datatype, p pVar) {
        return this.a.b(datatype, pVar);
    }
}
