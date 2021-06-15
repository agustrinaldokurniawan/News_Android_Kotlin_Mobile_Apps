package c.d.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.w;
import java.nio.ByteBuffer;

public final class h implements r<ByteBuffer, Bitmap> {
    public final d a = new d();

    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public w<Bitmap> a(ByteBuffer byteBuffer, int i2, int i3, p pVar) {
        return this.a.a(ImageDecoder.createSource(byteBuffer), i2, i3, pVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public /* bridge */ /* synthetic */ boolean b(ByteBuffer byteBuffer, p pVar) {
        return true;
    }
}
