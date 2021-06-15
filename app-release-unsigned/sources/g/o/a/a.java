package g.o.a;

import g.n.i;
import g.n.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends i & w> a b(T t) {
        return new b(t, t.g());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
