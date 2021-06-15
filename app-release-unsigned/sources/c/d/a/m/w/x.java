package c.d.a.m.w;

import android.net.Uri;
import c.d.a.m.p;
import c.d.a.m.w.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class x<Data> implements n<Uri, Data> {
    public static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final n<g, Data> b;

    public static class a implements o<Uri, InputStream> {
        @Override // c.d.a.m.w.o
        public n<Uri, InputStream> b(r rVar) {
            return new x(rVar.b(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.b = nVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a a(Uri uri, int i2, int i3, p pVar) {
        return this.b.a(new g(uri.toString()), i2, i3, pVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public boolean b(Uri uri) {
        return a.contains(uri.getScheme());
    }
}
