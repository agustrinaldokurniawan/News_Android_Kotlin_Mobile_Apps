package c.d.a.m.u;

import c.d.a.m.u.e;
import c.d.a.m.v.c0.b;
import c.d.a.m.x.c.x;
import java.io.InputStream;

public final class k implements e<InputStream> {
    public final x a;

    public static final class a implements e.a<InputStream> {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // c.d.a.m.u.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        /* Return type fixed from 'c.d.a.m.u.e' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // c.d.a.m.u.e.a
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        x xVar = new x(inputStream, bVar);
        this.a = xVar;
        xVar.mark(5242880);
    }

    @Override // c.d.a.m.u.e
    public void b() {
        this.a.c();
    }

    /* renamed from: c */
    public InputStream a() {
        this.a.reset();
        return this.a;
    }
}
