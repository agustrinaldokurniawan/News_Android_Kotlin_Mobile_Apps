package c.d.a.m.w.y;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import c.d.a.f;
import c.d.a.m.p;
import c.d.a.m.u.d;
import c.d.a.m.w.n;
import c.d.a.m.w.o;
import c.d.a.m.w.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class d<DataT> implements n<Uri, DataT> {
    public final Context a;
    public final n<File, DataT> b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f1020c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f1021d;

    public static abstract class a<DataT> implements o<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // c.d.a.m.w.o
        public final n<Uri, DataT> b(r rVar) {
            return new d(this.a, rVar.b(File.class, this.b), rVar.b(Uri.class, this.b), this.b);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: c.d.a.m.w.y.d$d  reason: collision with other inner class name */
    public static final class C0027d<DataT> implements c.d.a.m.u.d<DataT> {
        public static final String[] e = {"_data"};

        /* renamed from: f  reason: collision with root package name */
        public final Context f1022f;

        /* renamed from: g  reason: collision with root package name */
        public final n<File, DataT> f1023g;

        /* renamed from: h  reason: collision with root package name */
        public final n<Uri, DataT> f1024h;

        /* renamed from: i  reason: collision with root package name */
        public final Uri f1025i;

        /* renamed from: j  reason: collision with root package name */
        public final int f1026j;

        /* renamed from: k  reason: collision with root package name */
        public final int f1027k;

        /* renamed from: l  reason: collision with root package name */
        public final p f1028l;

        /* renamed from: m  reason: collision with root package name */
        public final Class<DataT> f1029m;
        public volatile boolean n;
        public volatile c.d.a.m.u.d<DataT> o;

        public C0027d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i2, int i3, p pVar, Class<DataT> cls) {
            this.f1022f = context.getApplicationContext();
            this.f1023g = nVar;
            this.f1024h = nVar2;
            this.f1025i = uri;
            this.f1026j = i2;
            this.f1027k = i3;
            this.f1028l = pVar;
            this.f1029m = cls;
        }

        @Override // c.d.a.m.u.d
        public Class<DataT> a() {
            return this.f1029m;
        }

        @Override // c.d.a.m.u.d
        public void b() {
            c.d.a.m.u.d<DataT> dVar = this.o;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // c.d.a.m.u.d
        public c.d.a.m.a c() {
            return c.d.a.m.a.LOCAL;
        }

        @Override // c.d.a.m.u.d
        public void cancel() {
            this.n = true;
            c.d.a.m.u.d<DataT> dVar = this.o;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: c.d.a.m.u.d<Data>, c.d.a.m.u.d<DataT> */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final c.d.a.m.u.d<DataT> d() {
            /*
            // Method dump skipped, instructions count: 167
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.w.y.d.C0027d.d():c.d.a.m.u.d");
        }

        @Override // c.d.a.m.u.d
        public void e(f fVar, d.a<? super DataT> aVar) {
            try {
                c.d.a.m.u.d<DataT> d2 = d();
                if (d2 == null) {
                    aVar.d(new IllegalArgumentException("Failed to build fetcher for: " + this.f1025i));
                    return;
                }
                this.o = d2;
                if (this.n) {
                    cancel();
                } else {
                    d2.e(fVar, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.d(e2);
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = nVar;
        this.f1020c = nVar2;
        this.f1021d = cls;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a a(Uri uri, int i2, int i3, p pVar) {
        Uri uri2 = uri;
        return new n.a(new c.d.a.r.b(uri2), new C0027d(this.a, this.b, this.f1020c, uri2, i2, i3, pVar, this.f1021d));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && g.q.a.n(uri);
    }
}
