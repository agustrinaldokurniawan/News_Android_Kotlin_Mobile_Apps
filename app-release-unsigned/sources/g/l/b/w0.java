package g.l.b;

import android.util.Log;
import java.io.Writer;

public final class w0 extends Writer {
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public StringBuilder f2781f = new StringBuilder(128);

    public w0(String str) {
        this.e = str;
    }

    public final void b() {
        if (this.f2781f.length() > 0) {
            Log.d(this.e, this.f2781f.toString());
            StringBuilder sb = this.f2781f;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                b();
            } else {
                this.f2781f.append(c2);
            }
        }
    }
}
