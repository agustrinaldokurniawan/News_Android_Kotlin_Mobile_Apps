package c.d.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.w;
import c.d.a.s.a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class u implements r<InputStream, Bitmap> {
    public final d a = new d();

    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public w<Bitmap> a(InputStream inputStream, int i2, int i3, p pVar) {
        InputStream inputStream2 = inputStream;
        AtomicReference<byte[]> atomicReference = a.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = a.a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream2.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                a.a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.a.a(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i2, i3, pVar);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public /* bridge */ /* synthetic */ boolean b(InputStream inputStream, p pVar) {
        return true;
    }
}
