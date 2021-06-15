package l.a.c.i;

import i.s.c.h;
import java.io.PrintStream;

public final class a extends c {
    public a() {
        super(b.NONE);
    }

    @Override // l.a.c.i.c
    public void d(b bVar, String str) {
        h.e(bVar, "level");
        h.e(str, "msg");
        PrintStream printStream = System.err;
        printStream.println("should not see this - " + bVar + " - " + str);
    }
}
