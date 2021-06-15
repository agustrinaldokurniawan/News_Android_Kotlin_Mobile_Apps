package c.d.a.m.w;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import c.d.a.m.p;
import c.d.a.m.w.n;
import java.io.File;
import java.io.InputStream;

public class u<Data> implements n<String, Data> {
    public final n<Uri, Data> a;

    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // c.d.a.m.w.o
        public n<String, AssetFileDescriptor> b(r rVar) {
            return new u(rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // c.d.a.m.w.o
        public n<String, ParcelFileDescriptor> b(r rVar) {
            return new u(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<String, InputStream> {
        @Override // c.d.a.m.w.o
        public n<String, InputStream> b(r rVar) {
            return new u(rVar.b(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.a = nVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a a(String str, int i2, int i3, p pVar) {
        Uri uri;
        File file;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else {
            if (str2.charAt(0) == '/') {
                file = new File(str2);
            } else {
                uri = Uri.parse(str2);
                if (uri.getScheme() == null) {
                    file = new File(str2);
                }
            }
            uri = Uri.fromFile(file);
        }
        if (uri == null || !this.a.b(uri)) {
            return null;
        }
        return this.a.a(uri, i2, i3, pVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public /* bridge */ /* synthetic */ boolean b(String str) {
        return true;
    }
}
