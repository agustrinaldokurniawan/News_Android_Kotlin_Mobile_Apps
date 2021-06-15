package c.d.a.m.w.y;

import c.d.a.m.p;
import c.d.a.m.w.g;
import c.d.a.m.w.n;
import c.d.a.m.w.o;
import c.d.a.m.w.r;
import java.io.InputStream;
import java.net.URL;

public class e implements n<URL, InputStream> {
    public final n<g, InputStream> a;

    public static class a implements o<URL, InputStream> {
        @Override // c.d.a.m.w.o
        public n<URL, InputStream> b(r rVar) {
            return new e(rVar.b(g.class, InputStream.class));
        }
    }

    public e(n<g, InputStream> nVar) {
        this.a = nVar;
    }

    /* Return type fixed from 'c.d.a.m.w.n$a' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a<InputStream> a(URL url, int i2, int i3, p pVar) {
        return this.a.a(new g(url), i2, i3, pVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public /* bridge */ /* synthetic */ boolean b(URL url) {
        return true;
    }
}
