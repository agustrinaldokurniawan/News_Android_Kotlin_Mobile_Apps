package h.a.q;

public final class c extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Throwable th) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th, th == null ? new NullPointerException() : th);
    }
}
