package c.d.a.m.x.c;

import android.graphics.Bitmap;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.w;
import c.d.a.s.a;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class g implements r<ByteBuffer, Bitmap> {
    public final m a;

    public g(m mVar) {
        this.a = mVar;
    }

    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public w<Bitmap> a(ByteBuffer byteBuffer, int i2, int i3, p pVar) {
        AtomicReference<byte[]> atomicReference = a.a;
        return this.a.b(new a.C0035a(byteBuffer), i2, i3, pVar, m.f1049f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public boolean b(ByteBuffer byteBuffer, p pVar) {
        Objects.requireNonNull(this.a);
        return true;
    }
}
