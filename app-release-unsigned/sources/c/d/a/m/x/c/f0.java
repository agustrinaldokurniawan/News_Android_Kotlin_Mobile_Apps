package c.d.a.m.x.c;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import c.d.a.m.o;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.w;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;

public class f0<T> implements r<T, Bitmap> {
    public static final o<Long> a = new o<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final o<Integer> b = new o<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: c  reason: collision with root package name */
    public static final e f1040c = new e();

    /* renamed from: d  reason: collision with root package name */
    public final f<T> f1041d;
    public final c.d.a.m.v.c0.d e;

    /* renamed from: f  reason: collision with root package name */
    public final e f1042f;

    public class a implements o.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [byte[], java.lang.Object, java.security.MessageDigest] */
        @Override // c.d.a.m.o.b
        public void a(byte[] bArr, Long l2, MessageDigest messageDigest) {
            Long l3 = l2;
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l3.longValue()).array());
            }
        }
    }

    public class b implements o.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [byte[], java.lang.Object, java.security.MessageDigest] */
        @Override // c.d.a.m.o.b
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 != null) {
                messageDigest.update(bArr);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putInt(num2.intValue()).array());
                }
            }
        }
    }

    public static final class c implements f<AssetFileDescriptor> {
        public c(a aVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.media.MediaMetadataRetriever, java.lang.Object] */
        @Override // c.d.a.m.x.c.f0.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    public static final class d implements f<ByteBuffer> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.media.MediaMetadataRetriever, java.lang.Object] */
        @Override // c.d.a.m.x.c.f0.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new g0(this, byteBuffer));
        }
    }

    public static class e {
    }

    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    public static final class g implements f<ParcelFileDescriptor> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.media.MediaMetadataRetriever, java.lang.Object] */
        @Override // c.d.a.m.x.c.f0.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public f0(c.d.a.m.v.c0.d dVar, f<T> fVar) {
        e eVar = f1040c;
        this.e = dVar;
        this.f1041d = fVar;
        this.f1042f = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, c.d.a.m.x.c.l r15) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.x.c.f0.c(android.media.MediaMetadataRetriever, long, int, int, int, c.d.a.m.x.c.l):android.graphics.Bitmap");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: c.d.a.m.p */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.d.a.m.r
    public w<Bitmap> a(T t, int i2, int i3, p pVar) {
        long longValue = ((Long) pVar.c(a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) pVar.c(b);
            if (num == null) {
                num = 2;
            }
            l lVar = (l) pVar.c(l.f1045f);
            if (lVar == null) {
                lVar = l.e;
            }
            Objects.requireNonNull(this.f1042f);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f1041d.a(mediaMetadataRetriever, t);
                Bitmap c2 = c(mediaMetadataRetriever, longValue, num.intValue(), i2, i3, lVar);
                mediaMetadataRetriever.release();
                return e.e(c2, this.e);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException(c.c.a.a.a.n("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }

    @Override // c.d.a.m.r
    public boolean b(T t, p pVar) {
        return true;
    }
}
