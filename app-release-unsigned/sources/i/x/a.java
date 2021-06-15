package i.x;

import i.s.c.h;
import java.nio.charset.Charset;

public final class a {
    public static final Charset a;
    public static Charset b;

    /* renamed from: c  reason: collision with root package name */
    public static Charset f3333c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f3334d = null;

    static {
        Charset forName = Charset.forName("UTF-8");
        h.d(forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        h.d(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        h.d(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        h.d(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        h.d(Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        h.d(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }
}
