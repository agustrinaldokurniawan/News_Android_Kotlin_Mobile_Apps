package c.d.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import c.d.a.m.h;
import c.d.a.m.j;
import c.d.a.m.u.k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public interface t {

    public static final class a implements t {
        public final k a;
        public final c.d.a.m.v.c0.b b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f1069c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, c.d.a.m.v.c0.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.b = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f1069c = list;
            this.a = new k(inputStream, bVar);
        }

        @Override // c.d.a.m.x.c.t
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.a.a(), null, options);
        }

        @Override // c.d.a.m.x.c.t
        public ImageHeaderParser.ImageType b() {
            return g.q.a.k(this.f1069c, this.a.a(), this.b);
        }

        @Override // c.d.a.m.x.c.t
        public void c() {
            x xVar = this.a.a;
            synchronized (xVar) {
                xVar.f1073g = xVar.e.length;
            }
        }

        @Override // c.d.a.m.x.c.t
        public int d() {
            return g.q.a.i(this.f1069c, this.a.a(), this.b);
        }
    }

    public static final class b implements t {
        public final c.d.a.m.v.c0.b a;
        public final List<ImageHeaderParser> b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f1070c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, c.d.a.m.v.c0.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.a = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.b = list;
            this.f1070c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // c.d.a.m.x.c.t
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f1070c.a().getFileDescriptor(), null, options);
        }

        @Override // c.d.a.m.x.c.t
        public ImageHeaderParser.ImageType b() {
            return g.q.a.l(this.b, new h(this.f1070c, this.a));
        }

        @Override // c.d.a.m.x.c.t
        public void c() {
        }

        @Override // c.d.a.m.x.c.t
        public int d() {
            return g.q.a.j(this.b, new j(this.f1070c, this.a));
        }
    }

    Bitmap a(BitmapFactory.Options options);

    ImageHeaderParser.ImageType b();

    void c();

    int d();
}
