package c.d.a.m.w.y;

import android.content.Context;
import android.net.Uri;
import c.d.a.m.p;
import c.d.a.m.u.o.b;
import c.d.a.m.w.n;
import c.d.a.m.w.o;
import c.d.a.m.w.r;
import c.d.a.m.x.c.f0;
import c.d.a.r.b;
import java.io.InputStream;

public class c implements n<Uri, InputStream> {
    public final Context a;

    public static class a implements o<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // c.d.a.m.w.o
        public n<Uri, InputStream> b(r rVar) {
            return new c(this.a);
        }
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    /* Return type fixed from 'c.d.a.m.w.n$a' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a<InputStream> a(Uri uri, int i2, int i3, p pVar) {
        Uri uri2 = uri;
        if (g.q.a.o(i2, i3)) {
            Long l2 = (Long) pVar.c(f0.a);
            if (l2 != null && l2.longValue() == -1) {
                b bVar = new b(uri2);
                Context context = this.a;
                return new n.a(bVar, c.d.a.m.u.o.b.d(context, uri2, new b.C0014b(context.getContentResolver())));
            }
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public boolean b(Uri uri) {
        Uri uri2 = uri;
        return g.q.a.n(uri2) && uri2.getPathSegments().contains("video");
    }
}
