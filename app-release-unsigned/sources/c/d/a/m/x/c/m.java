package c.d.a.m.x.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import c.d.a.m.o;
import c.d.a.m.p;
import c.d.a.m.q;
import c.d.a.m.v.c0.d;
import c.d.a.m.v.w;
import c.d.a.m.x.c.t;
import c.d.a.s.j;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class m {
    public static final o<c.d.a.m.b> a = o.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", c.d.a.m.b.PREFER_ARGB_8888);
    public static final o<q> b = o.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", q.SRGB);

    /* renamed from: c  reason: collision with root package name */
    public static final o<Boolean> f1047c;

    /* renamed from: d  reason: collision with root package name */
    public static final o<Boolean> f1048d;
    public static final Set<String> e = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));

    /* renamed from: f  reason: collision with root package name */
    public static final b f1049f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f1050g = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: h  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f1051h = new ArrayDeque(0);

    /* renamed from: i  reason: collision with root package name */
    public final d f1052i;

    /* renamed from: j  reason: collision with root package name */
    public final DisplayMetrics f1053j;

    /* renamed from: k  reason: collision with root package name */
    public final c.d.a.m.v.c0.b f1054k;

    /* renamed from: l  reason: collision with root package name */
    public final List<ImageHeaderParser> f1055l;

    /* renamed from: m  reason: collision with root package name */
    public final s f1056m = s.a();

    public class a implements b {
        @Override // c.d.a.m.x.c.m.b
        public void a(d dVar, Bitmap bitmap) {
        }

        @Override // c.d.a.m.x.c.m.b
        public void b() {
        }
    }

    public interface b {
        void a(d dVar, Bitmap bitmap);

        void b();
    }

    static {
        o<l> oVar = l.f1045f;
        Boolean bool = Boolean.FALSE;
        f1047c = o.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f1048d = o.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        char[] cArr = j.a;
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, d dVar, c.d.a.m.v.c0.b bVar) {
        this.f1055l = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f1053j = displayMetrics;
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.f1052i = dVar;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f1054k = bVar;
    }

    public static Bitmap d(t tVar, BitmapFactory.Options options, b bVar, d dVar) {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            tVar.c();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = d0.f1038d;
        lock.lock();
        try {
            Bitmap a2 = tVar.a(options);
            lock.unlock();
            return a2;
        } catch (IllegalArgumentException e2) {
            IOException i4 = i(e2, i2, i3, str, options);
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", i4);
            }
            Bitmap bitmap = options.inBitmap;
            if (bitmap != null) {
                try {
                    dVar.e(bitmap);
                    options.inBitmap = null;
                    Bitmap d2 = d(tVar, options, bVar, dVar);
                    d0.f1038d.unlock();
                    return d2;
                } catch (IOException unused) {
                    throw i4;
                }
            } else {
                throw i4;
            }
        } catch (Throwable th) {
            d0.f1038d.unlock();
            throw th;
        }
    }

    @TargetApi(19)
    public static String e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder f2 = c.c.a.a.a.f(" (");
        f2.append(bitmap.getAllocationByteCount());
        f2.append(")");
        String sb = f2.toString();
        StringBuilder f3 = c.c.a.a.a.f("[");
        f3.append(bitmap.getWidth());
        f3.append("x");
        f3.append(bitmap.getHeight());
        f3.append("] ");
        f3.append(bitmap.getConfig());
        f3.append(sb);
        return f3.toString();
    }

    public static int f(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    public static int[] g(t tVar, BitmapFactory.Options options, b bVar, d dVar) {
        options.inJustDecodeBounds = true;
        d(tVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static boolean h(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public static IOException i(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + e(options.inBitmap), illegalArgumentException);
    }

    public static void j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int k(double d2) {
        return (int) (d2 + 0.5d);
    }

    public final w<Bitmap> a(t tVar, int i2, int i3, p pVar, b bVar) {
        Queue<BitmapFactory.Options> queue;
        BitmapFactory.Options poll;
        byte[] bArr = (byte[]) this.f1054k.e(65536, byte[].class);
        synchronized (m.class) {
            queue = f1051h;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                j(poll);
            }
        }
        poll.inTempStorage = bArr;
        c.d.a.m.b bVar2 = (c.d.a.m.b) pVar.c(a);
        q qVar = (q) pVar.c(b);
        l lVar = (l) pVar.c(l.f1045f);
        boolean booleanValue = ((Boolean) pVar.c(f1047c)).booleanValue();
        o<Boolean> oVar = f1048d;
        try {
            e e2 = e.e(c(tVar, poll, lVar, bVar2, qVar, pVar.c(oVar) != null && ((Boolean) pVar.c(oVar)).booleanValue(), i2, i3, booleanValue, bVar), this.f1052i);
            j(poll);
            synchronized (queue) {
                queue.offer(poll);
            }
            this.f1054k.d(bArr);
            return e2;
        } catch (Throwable th) {
            j(poll);
            Queue<BitmapFactory.Options> queue2 = f1051h;
            synchronized (queue2) {
                queue2.offer(poll);
                this.f1054k.d(bArr);
                throw th;
            }
        }
    }

    public w<Bitmap> b(InputStream inputStream, int i2, int i3, p pVar, b bVar) {
        return a(new t.a(inputStream, this.f1055l, this.f1054k), i2, i3, pVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03ea, code lost:
        if (r4 >= 26) goto L_0x03ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03aa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0521 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap c(c.d.a.m.x.c.t r33, android.graphics.BitmapFactory.Options r34, c.d.a.m.x.c.l r35, c.d.a.m.b r36, c.d.a.m.q r37, boolean r38, int r39, int r40, boolean r41, c.d.a.m.x.c.m.b r42) {
        /*
        // Method dump skipped, instructions count: 1386
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.x.c.m.c(c.d.a.m.x.c.t, android.graphics.BitmapFactory$Options, c.d.a.m.x.c.l, c.d.a.m.b, c.d.a.m.q, boolean, int, int, boolean, c.d.a.m.x.c.m$b):android.graphics.Bitmap");
    }
}
