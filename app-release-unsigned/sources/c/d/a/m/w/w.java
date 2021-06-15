package c.d.a.m.w;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c.d.a.m.p;
import c.d.a.m.u.i;
import c.d.a.m.u.n;
import c.d.a.m.w.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class w<Data> implements n<Uri, Data> {
    public static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    public final c<Data> b;

    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // c.d.a.m.w.w.c
        public c.d.a.m.u.d<AssetFileDescriptor> a(Uri uri) {
            return new c.d.a.m.u.a(this.a, uri);
        }

        @Override // c.d.a.m.w.o
        public n<Uri, AssetFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // c.d.a.m.w.w.c
        public c.d.a.m.u.d<ParcelFileDescriptor> a(Uri uri) {
            return new i(this.a, uri);
        }

        @Override // c.d.a.m.w.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    public interface c<Data> {
        c.d.a.m.u.d<Data> a(Uri uri);
    }

    public static class d implements o<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // c.d.a.m.w.w.c
        public c.d.a.m.u.d<InputStream> a(Uri uri) {
            return new n(this.a, uri);
        }

        @Override // c.d.a.m.w.o
        public n<Uri, InputStream> b(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.b = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a a(Uri uri, int i2, int i3, p pVar) {
        Uri uri2 = uri;
        return new n.a(new c.d.a.r.b(uri2), this.b.a(uri2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public boolean b(Uri uri) {
        return a.contains(uri.getScheme());
    }
}
