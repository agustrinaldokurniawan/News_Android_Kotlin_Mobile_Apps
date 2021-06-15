package c.d.a.m.x.h;

import android.graphics.Bitmap;
import c.d.a.m.p;
import c.d.a.m.v.w;
import c.d.a.m.x.d.b;
import java.io.ByteArrayOutputStream;

public class a implements e<Bitmap, byte[]> {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;
    public final int b = 100;

    @Override // c.d.a.m.x.h.e
    public w<byte[]> a(w<Bitmap> wVar, p pVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.a, this.b, byteArrayOutputStream);
        wVar.d();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
