package i.y;

import java.util.concurrent.TimeUnit;

public final class c extends a {
    public static final c b = new c();

    public c() {
        super(TimeUnit.NANOSECONDS);
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
