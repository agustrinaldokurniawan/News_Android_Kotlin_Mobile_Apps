package d.a;

import i.s.c.h;
import java.util.concurrent.CancellationException;

public final class m0 extends CancellationException {
    public final l0 e;

    public m0(String str, Throwable th, l0 l0Var) {
        super(str);
        this.e = l0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof m0) {
                m0 m0Var = (m0) obj;
                if (!h.a(m0Var.getMessage(), getMessage()) || !h.a(m0Var.e, this.e) || !h.a(m0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        h.c(message);
        int hashCode = (this.e.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.e;
    }
}
