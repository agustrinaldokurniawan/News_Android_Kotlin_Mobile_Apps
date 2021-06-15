package c.d.a.m.x.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import c.d.a.l.c;
import c.d.a.l.d;
import c.d.a.l.e;
import c.d.a.m.g;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.w;
import c.d.a.s.f;
import c.d.a.s.j;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class a implements r<ByteBuffer, c> {
    public static final C0031a a = new C0031a();
    public static final b b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final Context f1078c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f1079d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public final C0031a f1080f;

    /* renamed from: g  reason: collision with root package name */
    public final b f1081g;

    /* renamed from: c.d.a.m.x.g.a$a  reason: collision with other inner class name */
    public static class C0031a {
    }

    public static class b {
        public final Queue<d> a = new ArrayDeque(0);

        public b() {
            char[] cArr = j.a;
        }

        public synchronized void a(d dVar) {
            dVar.b = null;
            dVar.f802c = null;
            this.a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, c.d.a.m.v.c0.d dVar, c.d.a.m.v.c0.b bVar) {
        b bVar2 = b;
        C0031a aVar = a;
        this.f1078c = context.getApplicationContext();
        this.f1079d = list;
        this.f1080f = aVar;
        this.f1081g = new b(dVar, bVar);
        this.e = bVar2;
    }

    public static int d(c cVar, int i2, int i3) {
        int min = Math.min(cVar.f797g / i3, cVar.f796f / i2);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i2 + "x" + i3 + "], actual dimens: [" + cVar.f796f + "x" + cVar.f797g + "]");
        }
        return max;
    }

    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public w<c> a(ByteBuffer byteBuffer, int i2, int i3, p pVar) {
        d poll;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.e;
        synchronized (bVar) {
            poll = bVar.a.poll();
            if (poll == null) {
                poll = new d();
            }
            poll.b = null;
            Arrays.fill(poll.a, (byte) 0);
            poll.f802c = new c();
            poll.f803d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            poll.b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            poll.b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer2, i2, i3, poll, pVar);
        } finally {
            this.e.a(poll);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public boolean b(ByteBuffer byteBuffer, p pVar) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!((Boolean) pVar.c(i.b)).booleanValue()) {
            if ((byteBuffer2 == null ? ImageHeaderParser.ImageType.UNKNOWN : g.q.a.l(this.f1079d, new g(byteBuffer2))) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    public final e c(ByteBuffer byteBuffer, int i2, int i3, d dVar, p pVar) {
        int i4 = f.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            c b2 = dVar.b();
            if (b2.f794c > 0) {
                if (b2.b == 0) {
                    Bitmap.Config config = pVar.c(i.a) == c.d.a.m.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    int d2 = d(b2, i2, i3);
                    C0031a aVar = this.f1080f;
                    b bVar = this.f1081g;
                    Objects.requireNonNull(aVar);
                    e eVar = new e(bVar, b2, byteBuffer, d2);
                    eVar.i(config);
                    eVar.f812l = (eVar.f812l + 1) % eVar.f813m.f794c;
                    Bitmap c2 = eVar.c();
                    if (c2 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder f2 = c.c.a.a.a.f("Decoded GIF from stream in ");
                            f2.append(f.a(elapsedRealtimeNanos));
                            Log.v("BufferGifDecoder", f2.toString());
                        }
                        return null;
                    }
                    e eVar2 = new e(new c(this.f1078c, eVar, (c.d.a.m.x.b) c.d.a.m.x.b.b, i2, i3, c2));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder f3 = c.c.a.a.a.f("Decoded GIF from stream in ");
                        f3.append(f.a(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", f3.toString());
                    }
                    return eVar2;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder f4 = c.c.a.a.a.f("Decoded GIF from stream in ");
                f4.append(f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", f4.toString());
            }
        }
    }
}
