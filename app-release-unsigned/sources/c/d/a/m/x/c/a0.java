package c.d.a.m.x.c;

import android.graphics.Bitmap;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.c0.b;
import c.d.a.m.v.w;
import c.d.a.m.x.c.m;
import c.d.a.s.d;
import c.d.a.s.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;

public class a0 implements r<InputStream, Bitmap> {
    public final m a;
    public final b b;

    public static class a implements m.b {
        public final x a;
        public final d b;

        public a(x xVar, d dVar) {
            this.a = xVar;
            this.b = dVar;
        }

        @Override // c.d.a.m.x.c.m.b
        public void a(c.d.a.m.v.c0.d dVar, Bitmap bitmap) {
            IOException iOException = this.b.f1163g;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.e(bitmap);
                }
                throw iOException;
            }
        }

        @Override // c.d.a.m.x.c.m.b
        public void b() {
            x xVar = this.a;
            synchronized (xVar) {
                xVar.f1073g = xVar.e.length;
            }
        }
    }

    public a0(m mVar, b bVar) {
        this.a = mVar;
        this.b = bVar;
    }

    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public w<Bitmap> a(InputStream inputStream, int i2, int i3, p pVar) {
        x xVar;
        boolean z;
        d poll;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof x) {
            xVar = (x) inputStream2;
            z = false;
        } else {
            z = true;
            xVar = new x(inputStream2, this.b);
        }
        Queue<d> queue = d.e;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.f1162f = xVar;
        try {
            return this.a.b(new h(poll), i2, i3, pVar, new a(xVar, poll));
        } finally {
            poll.b();
            if (z) {
                xVar.c();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public boolean b(InputStream inputStream, p pVar) {
        Objects.requireNonNull(this.a);
        return true;
    }
}
