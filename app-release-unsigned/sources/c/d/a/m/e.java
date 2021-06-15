package c.d.a.m;

import java.io.IOException;

public final class e extends IOException {
    public e(String str, int i2, Throwable th) {
        super(str + ", status code: " + i2, th);
    }
}
