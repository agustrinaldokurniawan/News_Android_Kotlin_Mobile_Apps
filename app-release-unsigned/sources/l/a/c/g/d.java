package l.a.c.g;

import i.s.c.h;

public final class d extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, Exception exc) {
        super(str, exc);
        h.e(str, "msg");
        h.e(exc, "parent");
    }
}
