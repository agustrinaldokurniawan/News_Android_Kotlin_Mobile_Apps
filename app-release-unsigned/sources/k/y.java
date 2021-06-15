package k;

import h.a.t.a;
import i.s.c.h;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class y extends b {

    /* renamed from: l  reason: collision with root package name */
    public final Logger f3771l = Logger.getLogger("okio.Okio");

    /* renamed from: m  reason: collision with root package name */
    public final Socket f3772m;

    public y(Socket socket) {
        h.f(socket, "socket");
        this.f3772m = socket;
    }

    @Override // k.b
    public IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.AssertionError */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.b
    public void k() {
        StringBuilder sb;
        Level level;
        Logger logger;
        Exception exc;
        try {
            this.f3772m.close();
            return;
        } catch (Exception e) {
            Logger logger2 = this.f3771l;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e;
            logger = logger2;
        } catch (AssertionError e2) {
            if (a.B(e2)) {
                Logger logger3 = this.f3771l;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e2;
                logger = logger3;
            } else {
                throw e2;
            }
        }
        sb.append("Failed to close timed out socket ");
        sb.append(this.f3772m);
        logger.log(level, sb.toString(), (Throwable) exc);
    }
}
