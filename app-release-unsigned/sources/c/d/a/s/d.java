package c.d.a.s;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public final class d extends InputStream {
    public static final Queue<d> e = new ArrayDeque(0);

    /* renamed from: f  reason: collision with root package name */
    public InputStream f1162f;

    /* renamed from: g  reason: collision with root package name */
    public IOException f1163g;

    static {
        char[] cArr = j.a;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f1162f.available();
    }

    public void b() {
        this.f1163g = null;
        this.f1162f = null;
        Queue<d> queue = e;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.f1162f.close();
    }

    public void mark(int i2) {
        this.f1162f.mark(i2);
    }

    public boolean markSupported() {
        return this.f1162f.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f1162f.read();
        } catch (IOException e2) {
            this.f1163g = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f1162f.read(bArr);
        } catch (IOException e2) {
            this.f1163g = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.f1162f.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f1163g = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f1162f.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        try {
            return this.f1162f.skip(j2);
        } catch (IOException e2) {
            this.f1163g = e2;
            throw e2;
        }
    }
}
