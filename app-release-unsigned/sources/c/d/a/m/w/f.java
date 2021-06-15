package c.d.a.m.w;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import c.d.a.m.p;
import c.d.a.m.u.d;
import c.d.a.m.w.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class f<Data> implements n<File, Data> {
    public final d<Data> a;

    public static class a<Data> implements o<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // c.d.a.m.w.o
        public final n<File, Data> b(r rVar) {
            return new f(this.a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            @Override // c.d.a.m.w.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // c.d.a.m.w.f.d
            public ParcelFileDescriptor b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // c.d.a.m.w.f.d
            public void c(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements c.d.a.m.u.d<Data> {
        public final File e;

        /* renamed from: f  reason: collision with root package name */
        public final d<Data> f996f;

        /* renamed from: g  reason: collision with root package name */
        public Data f997g;

        public c(File file, d<Data> dVar) {
            this.e = file;
            this.f996f = dVar;
        }

        @Override // c.d.a.m.u.d
        public Class<Data> a() {
            return this.f996f.a();
        }

        @Override // c.d.a.m.u.d
        public void b() {
            Data data = this.f997g;
            if (data != null) {
                try {
                    this.f996f.c(data);
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
        public void e(c.d.a.f fVar, d.a<? super Data> aVar) {
            try {
                Data b = this.f996f.b(this.e);
                this.f997g = b;
                aVar.f(b);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                aVar.d(e2);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    public static class e extends a<InputStream> {

        public class a implements d<InputStream> {
            @Override // c.d.a.m.w.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // c.d.a.m.w.f.d
            public InputStream b(File file) {
                return new FileInputStream(file);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // c.d.a.m.w.f.d
            public void c(InputStream inputStream) {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.a = dVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a a(File file, int i2, int i3, p pVar) {
        File file2 = file;
        return new n.a(new c.d.a.r.b(file2), new c(file2, this.a));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }
}
