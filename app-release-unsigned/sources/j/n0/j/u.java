package j.n0.j;

import i.s.c.h;
import java.io.IOException;

public final class u extends IOException {
    public final b e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(b bVar) {
        super("stream was reset: " + bVar);
        h.f(bVar, "errorCode");
        this.e = bVar;
    }
}
