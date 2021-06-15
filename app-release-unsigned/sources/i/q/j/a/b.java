package i.q.j.a;

import i.q.d;
import i.q.f;

public final class b implements d<Object> {
    public static final b e = new b();

    @Override // i.q.d
    public void a(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // i.q.d
    public f d() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
