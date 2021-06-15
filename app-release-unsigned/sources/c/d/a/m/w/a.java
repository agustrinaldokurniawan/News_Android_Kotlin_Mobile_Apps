package c.d.a.m.w;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c.d.a.m.p;
import c.d.a.m.u.d;
import c.d.a.m.u.h;
import c.d.a.m.u.m;
import c.d.a.m.w.n;
import java.io.InputStream;

public class a<Data> implements n<Uri, Data> {
    public final AssetManager a;
    public final AbstractC0022a<Data> b;

    /* renamed from: c.d.a.m.w.a$a  reason: collision with other inner class name */
    public interface AbstractC0022a<Data> {
        d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, AbstractC0022a<ParcelFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // c.d.a.m.w.a.AbstractC0022a
        public d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }

        @Override // c.d.a.m.w.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.a, this);
        }
    }

    public static class c implements o<Uri, InputStream>, AbstractC0022a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // c.d.a.m.w.a.AbstractC0022a
        public d<InputStream> a(AssetManager assetManager, String str) {
            return new m(assetManager, str);
        }

        @Override // c.d.a.m.w.o
        public n<Uri, InputStream> b(r rVar) {
            return new a(this.a, this);
        }
    }

    public a(AssetManager assetManager, AbstractC0022a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a a(Uri uri, int i2, int i3, p pVar) {
        Uri uri2 = uri;
        return new n.a(new c.d.a.r.b(uri2), this.b.a(this.a, uri2.toString().substring(22)));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public boolean b(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}
