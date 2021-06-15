package i.y;

import java.util.Objects;

public final class e {
    public static final e a = new e();
    public final /* synthetic */ c b = c.b;

    public d a() {
        return this.b.a();
    }

    public String toString() {
        Objects.requireNonNull(c.b);
        return "TimeSource(System.nanoTime())";
    }
}
