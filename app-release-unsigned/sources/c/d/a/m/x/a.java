package c.d.a.m.x;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import c.d.a.m.b;
import c.d.a.m.o;
import c.d.a.m.p;
import c.d.a.m.q;
import c.d.a.m.r;
import c.d.a.m.v.w;
import c.d.a.m.x.c.d;
import c.d.a.m.x.c.e;
import c.d.a.m.x.c.l;
import c.d.a.m.x.c.m;
import c.d.a.m.x.c.s;

public abstract class a<T> implements r<ImageDecoder.Source, T> {
    public final s a = s.a();

    /* renamed from: c.d.a.m.x.a$a  reason: collision with other inner class name */
    public class C0028a implements ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f1030c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f1031d;
        public final /* synthetic */ l e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q f1032f;

        /* renamed from: c.d.a.m.x.a$a$a  reason: collision with other inner class name */
        public class C0029a implements ImageDecoder.OnPartialImageListener {
            public C0029a(C0028a aVar) {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C0028a(int i2, int i3, boolean z, b bVar, l lVar, q qVar) {
            this.a = i2;
            this.b = i3;
            this.f1030c = z;
            this.f1031d = bVar;
            this.e = lVar;
            this.f1032f = qVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (a.this.a.b(this.a, this.b, this.f1030c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f1031d == b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0029a(this));
            Size size = imageInfo.getSize();
            int i2 = this.a;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getWidth();
            }
            int i3 = this.b;
            if (i3 == Integer.MIN_VALUE) {
                i3 = size.getHeight();
            }
            float b2 = this.e.b(size.getWidth(), size.getHeight(), i2, i3);
            int round = Math.round(((float) size.getWidth()) * b2);
            int round2 = Math.round(((float) size.getHeight()) * b2);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder f2 = c.c.a.a.a.f("Resizing from [");
                f2.append(size.getWidth());
                f2.append("x");
                f2.append(size.getHeight());
                f2.append("] to [");
                f2.append(round);
                f2.append("x");
                f2.append(round2);
                f2.append("] scaleFactor: ");
                f2.append(b2);
                Log.v("ImageDecoder", f2.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                if (this.f1032f == q.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i4 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public /* bridge */ /* synthetic */ boolean b(ImageDecoder.Source source, p pVar) {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: c.d.a.m.p */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final w<T> a(ImageDecoder.Source source, int i2, int i3, p pVar) {
        b bVar = (b) pVar.c(m.a);
        l lVar = (l) pVar.c(l.f1045f);
        o<Boolean> oVar = m.f1048d;
        C0028a aVar = new C0028a(i2, i3, pVar.c(oVar) != null && ((Boolean) pVar.c(oVar)).booleanValue(), bVar, lVar, (q) pVar.c(m.b));
        d dVar = (d) this;
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, aVar);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder f2 = c.c.a.a.a.f("Decoded [");
            f2.append(decodeBitmap.getWidth());
            f2.append("x");
            f2.append(decodeBitmap.getHeight());
            f2.append("] for [");
            f2.append(i2);
            f2.append("x");
            f2.append(i3);
            f2.append("]");
            Log.v("BitmapImageDecoder", f2.toString());
        }
        return new e(decodeBitmap, dVar.b);
    }
}
