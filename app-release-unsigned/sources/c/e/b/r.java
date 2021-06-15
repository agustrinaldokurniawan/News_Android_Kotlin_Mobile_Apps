package c.e.b;

public class r extends RuntimeException {
    public r(String str) {
        super(str);
    }

    public r(String str, Throwable th) {
        super(str, th);
    }

    public r(Throwable th) {
        super(th);
    }
}
