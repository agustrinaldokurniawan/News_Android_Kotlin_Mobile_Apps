package c.d.a.m.x.c;

import android.graphics.Bitmap;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.w;
import c.d.a.s.j;

public final class e0 implements r<Bitmap, Bitmap> {

    public static final class a implements w<Bitmap> {
        public final Bitmap e;

        public a(Bitmap bitmap) {
            this.e = bitmap;
        }

        @Override // c.d.a.m.v.w
        public int b() {
            return j.d(this.e);
        }

        @Override // c.d.a.m.v.w
        public Class<Bitmap> c() {
            return Bitmap.class;
        }

        @Override // c.d.a.m.v.w
        public void d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.d.a.m.v.w
        public Bitmap get() {
            return this.e;
        }
    }

    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public w<Bitmap> a(Bitmap bitmap, int i2, int i3, p pVar) {
        return new a(bitmap);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public /* bridge */ /* synthetic */ boolean b(Bitmap bitmap, p pVar) {
        return true;
    }
}
