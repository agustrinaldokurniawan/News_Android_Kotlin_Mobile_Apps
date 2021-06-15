package l.a.c.i;

import i.s.c.h;

public abstract class c {
    public b a;

    public c(b bVar) {
        h.e(bVar, "level");
        this.a = bVar;
    }

    public final void a(String str) {
        h.e(str, "msg");
        b(b.DEBUG, str);
    }

    public final void b(b bVar, String str) {
        if (this.a.compareTo(bVar) <= 0) {
            d(bVar, str);
        }
    }

    public final boolean c(b bVar) {
        h.e(bVar, "lvl");
        return this.a.compareTo(bVar) <= 0;
    }

    public abstract void d(b bVar, String str);
}
