package c.d.a.m.u.o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import c.d.a.f;
import c.d.a.m.u.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class b implements d<InputStream> {
    public final Uri e;

    /* renamed from: f  reason: collision with root package name */
    public final d f845f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f846g;

    public static class a implements c {
        public static final String[] a = {"_data"};
        public final ContentResolver b;

        public a(ContentResolver contentResolver) {
            this.b = contentResolver;
        }

        @Override // c.d.a.m.u.o.c
        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* renamed from: c.d.a.m.u.o.b$b  reason: collision with other inner class name */
    public static class C0014b implements c {
        public static final String[] a = {"_data"};
        public final ContentResolver b;

        public C0014b(ContentResolver contentResolver) {
            this.b = contentResolver;
        }

        @Override // c.d.a.m.u.o.c
        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public b(Uri uri, d dVar) {
        this.e = uri;
        this.f845f = dVar;
    }

    public static b d(Context context, Uri uri, c cVar) {
        return new b(uri, new d(c.d.a.b.b(context).f726j.e(), cVar, c.d.a.b.b(context).f727k, context.getContentResolver()));
    }

    @Override // c.d.a.m.u.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // c.d.a.m.u.d
    public void b() {
        InputStream inputStream = this.f846g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // c.d.a.m.u.d
    public c.d.a.m.a c() {
        return c.d.a.m.a.LOCAL;
    }

    @Override // c.d.a.m.u.d
    public void cancel() {
    }

    @Override // c.d.a.m.u.d
    public void e(f fVar, d.a<? super InputStream> aVar) {
        try {
            InputStream f2 = f();
            this.f846g = f2;
            aVar.f(f2);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.d(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r6 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r7 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream f() {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.u.o.b.f():java.io.InputStream");
    }
}
