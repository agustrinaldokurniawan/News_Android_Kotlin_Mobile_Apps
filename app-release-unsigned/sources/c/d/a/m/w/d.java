package c.d.a.m.w;

import android.util.Log;
import c.d.a.f;
import c.d.a.m.p;
import c.d.a.m.u.d;
import c.d.a.m.w.n;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d implements n<File, ByteBuffer> {

    public static final class a implements c.d.a.m.u.d<ByteBuffer> {
        public final File e;

        public a(File file) {
            this.e = file;
        }

        @Override // c.d.a.m.u.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // c.d.a.m.u.d
        public void b() {
        }

        @Override // c.d.a.m.u.d
        public c.d.a.m.a c() {
            return c.d.a.m.a.LOCAL;
        }

        @Override // c.d.a.m.u.d
        public void cancel() {
        }

        @Override // c.d.a.m.u.d
        public void e(f fVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(c.d.a.s.a.a(this.e));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.d(e2);
            }
        }
    }

    public static class b implements o<File, ByteBuffer> {
        @Override // c.d.a.m.w.o
        public n<File, ByteBuffer> b(r rVar) {
            return new d();
        }
    }

    /* Return type fixed from 'c.d.a.m.w.n$a' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a<ByteBuffer> a(File file, int i2, int i3, p pVar) {
        File file2 = file;
        return new n.a(new c.d.a.r.b(file2), new a(file2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }
}
