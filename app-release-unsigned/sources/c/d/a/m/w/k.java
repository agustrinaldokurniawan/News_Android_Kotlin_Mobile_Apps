package c.d.a.m.w;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import c.d.a.f;
import c.d.a.m.p;
import c.d.a.m.u.d;
import c.d.a.m.w.n;
import java.io.File;
import java.io.FileNotFoundException;

public final class k implements n<Uri, File> {
    public final Context a;

    public static final class a implements o<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // c.d.a.m.w.o
        public n<Uri, File> b(r rVar) {
            return new k(this.a);
        }
    }

    public static class b implements d<File> {
        public static final String[] e = {"_data"};

        /* renamed from: f  reason: collision with root package name */
        public final Context f1005f;

        /* renamed from: g  reason: collision with root package name */
        public final Uri f1006g;

        public b(Context context, Uri uri) {
            this.f1005f = context;
            this.f1006g = uri;
        }

        @Override // c.d.a.m.u.d
        public Class<File> a() {
            return File.class;
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
        public void e(f fVar, d.a<? super File> aVar) {
            Cursor query = this.f1005f.getContentResolver().query(this.f1006g, e, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder f2 = c.c.a.a.a.f("Failed to find file path for: ");
                f2.append(this.f1006g);
                aVar.d(new FileNotFoundException(f2.toString()));
                return;
            }
            aVar.f(new File(str));
        }
    }

    public k(Context context) {
        this.a = context;
    }

    /* Return type fixed from 'c.d.a.m.w.n$a' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a<File> a(Uri uri, int i2, int i3, p pVar) {
        Uri uri2 = uri;
        return new n.a(new c.d.a.r.b(uri2), new b(this.a, uri2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public boolean b(Uri uri) {
        return g.q.a.n(uri);
    }
}
