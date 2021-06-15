package c.e.b.a0.z;

import c.e.b.c0.c;
import c.e.b.k;
import c.e.b.n;
import c.e.b.p;
import c.e.b.q;
import c.e.b.s;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class f extends c {
    public static final Writer o = new a();
    public static final s p = new s("closed");
    public final List<n> q = new ArrayList();
    public String r;
    public n s = p.a;

    public class a extends Writer {
        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f() {
        super(o);
    }

    @Override // c.e.b.c0.c
    public c K() {
        if (this.q.isEmpty() || this.r != null) {
            throw new IllegalStateException();
        } else if (n0() instanceof q) {
            List<n> list = this.q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // c.e.b.c0.c
    public c Q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.q.isEmpty() || this.r != null) {
            throw new IllegalStateException();
        } else if (n0() instanceof q) {
            this.r = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // c.e.b.c0.c
    public c b0() {
        o0(p.a);
        return this;
    }

    @Override // c.e.b.c0.c
    public c c() {
        k kVar = new k();
        o0(kVar);
        this.q.add(kVar);
        return this;
    }

    @Override // java.io.Closeable, c.e.b.c0.c, java.lang.AutoCloseable
    public void close() {
        if (this.q.isEmpty()) {
            this.q.add(p);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // c.e.b.c0.c
    public c e() {
        q qVar = new q();
        o0(qVar);
        this.q.add(qVar);
        return this;
    }

    @Override // c.e.b.c0.c, java.io.Flushable
    public void flush() {
    }

    @Override // c.e.b.c0.c
    public c h0(long j2) {
        o0(new s(Long.valueOf(j2)));
        return this;
    }

    @Override // c.e.b.c0.c
    public c i0(Boolean bool) {
        if (bool == null) {
            o0(p.a);
            return this;
        }
        o0(new s(bool));
        return this;
    }

    @Override // c.e.b.c0.c
    public c j0(Number number) {
        if (number == null) {
            o0(p.a);
            return this;
        }
        if (!this.f1535l) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        o0(new s(number));
        return this;
    }

    @Override // c.e.b.c0.c
    public c k0(String str) {
        if (str == null) {
            o0(p.a);
            return this;
        }
        o0(new s(str));
        return this;
    }

    @Override // c.e.b.c0.c
    public c l0(boolean z) {
        o0(new s(Boolean.valueOf(z)));
        return this;
    }

    public final n n0() {
        List<n> list = this.q;
        return list.get(list.size() - 1);
    }

    public final void o0(n nVar) {
        if (this.r != null) {
            if (!(nVar instanceof p) || this.n) {
                ((q) n0()).a.put(this.r, nVar);
            }
            this.r = null;
        } else if (this.q.isEmpty()) {
            this.s = nVar;
        } else {
            n n0 = n0();
            if (n0 instanceof k) {
                ((k) n0).e.add(nVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // c.e.b.c0.c
    public c u() {
        if (this.q.isEmpty() || this.r != null) {
            throw new IllegalStateException();
        } else if (n0() instanceof k) {
            List<n> list = this.q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }
}
