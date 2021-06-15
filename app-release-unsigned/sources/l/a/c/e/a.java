package l.a.c.e;

import i.s.c.h;
import l.a.c.b;
import l.a.c.g.e;

public final class a {
    public static final a a = new a();
    public static l.a.c.a b;

    public void a(b bVar) {
        h.e(bVar, "koinApplication");
        if (b == null) {
            b = bVar.a;
            return;
        }
        throw new e("A Koin Application has already been started");
    }
}
