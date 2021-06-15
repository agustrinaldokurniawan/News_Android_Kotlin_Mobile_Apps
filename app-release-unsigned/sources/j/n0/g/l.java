package j.n0.g;

import i.s.c.h;
import java.io.IOException;

public final class l extends RuntimeException {
    public IOException e;

    /* renamed from: f  reason: collision with root package name */
    public final IOException f3535f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(IOException iOException) {
        super(iOException);
        h.f(iOException, "firstConnectException");
        this.f3535f = iOException;
        this.e = iOException;
    }
}
