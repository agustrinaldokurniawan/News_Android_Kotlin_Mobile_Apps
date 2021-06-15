package g.r;

import g.t.a.c;
import java.io.IOException;
import java.util.Objects;

public final class b implements c, d {
    public final c e;

    /* renamed from: f  reason: collision with root package name */
    public final a f2955f;

    public static final class a implements g.t.a.b {
        public final a e;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw null;
        }
    }

    @Override // g.t.a.c
    public g.t.a.b P() {
        Objects.requireNonNull(this.f2955f.e);
        throw null;
    }

    @Override // g.r.d
    public c b() {
        return this.e;
    }

    @Override // java.io.Closeable, g.t.a.c, java.lang.AutoCloseable
    public void close() {
        try {
            this.f2955f.close();
        } catch (IOException e2) {
            throw e2;
        }
    }

    @Override // g.t.a.c
    public String getDatabaseName() {
        return this.e.getDatabaseName();
    }

    @Override // g.t.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.e.setWriteAheadLoggingEnabled(z);
    }
}
