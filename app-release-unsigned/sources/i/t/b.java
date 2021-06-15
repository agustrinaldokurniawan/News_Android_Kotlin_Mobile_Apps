package i.t;

import i.s.c.h;
import java.util.Random;

public final class b extends a {

    /* renamed from: g  reason: collision with root package name */
    public final a f3318g = new a();

    public static final class a extends ThreadLocal<Random> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // i.t.a
    public Random d() {
        Object obj = this.f3318g.get();
        h.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
