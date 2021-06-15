package i.t.d;

import i.s.c.h;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends i.t.a {
    @Override // i.t.c
    public int c(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    @Override // i.t.a
    public Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d(current, "ThreadLocalRandom.current()");
        return current;
    }
}
