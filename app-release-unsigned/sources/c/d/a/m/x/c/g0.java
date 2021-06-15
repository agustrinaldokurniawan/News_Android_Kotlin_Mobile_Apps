package c.d.a.m.x.c;

import android.media.MediaDataSource;
import c.d.a.m.x.c.f0;
import java.nio.ByteBuffer;

public class g0 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer e;

    public g0(f0.d dVar, ByteBuffer byteBuffer) {
        this.e = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return (long) this.e.limit();
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j2, byte[] bArr, int i2, int i3) {
        if (j2 >= ((long) this.e.limit())) {
            return -1;
        }
        this.e.position((int) j2);
        int min = Math.min(i3, this.e.remaining());
        this.e.get(bArr, i2, min);
        return min;
    }
}
