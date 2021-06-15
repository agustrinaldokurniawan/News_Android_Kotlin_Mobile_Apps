package c.d.a.m.x.c;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.x.c.t;
import java.util.Objects;

public final class w implements r<ParcelFileDescriptor, Bitmap> {
    public final m a;

    public w(m mVar) {
        this.a = mVar;
    }

    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public c.d.a.m.v.w<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, p pVar) {
        m mVar = this.a;
        return mVar.a(new t.b(parcelFileDescriptor, mVar.f1055l, mVar.f1054k), i2, i3, pVar, m.f1049f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, p pVar) {
        Objects.requireNonNull(this.a);
        return true;
    }
}
