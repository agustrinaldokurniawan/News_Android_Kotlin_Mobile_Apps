package j.n0.i;

import i.j;
import i.x.e;
import j.x;
import java.util.ArrayList;
import k.h;

public final class a {
    public long a = ((long) 262144);
    public final h b;

    public a(h hVar) {
        i.s.c.h.f(hVar, "source");
        this.b = hVar;
    }

    public final x a() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String b2 = b();
            if (b2.length() == 0) {
                break;
            }
            i.s.c.h.f(b2, "line");
            int i2 = e.i(b2, ':', 1, false, 4);
            if (i2 != -1) {
                String substring = b2.substring(0, i2);
                i.s.c.h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                b2 = b2.substring(i2 + 1);
                i.s.c.h.b(b2, "(this as java.lang.String).substring(startIndex)");
                i.s.c.h.f(substring, "name");
                i.s.c.h.f(b2, "value");
                arrayList.add(substring);
            } else {
                if (b2.charAt(0) == ':') {
                    b2 = b2.substring(1);
                    i.s.c.h.b(b2, "(this as java.lang.String).substring(startIndex)");
                }
                i.s.c.h.f("", "name");
                i.s.c.h.f(b2, "value");
                arrayList.add("");
            }
            arrayList.add(e.y(b2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new x((String[]) array, null);
        }
        throw new j("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final String b() {
        String w = this.b.w(this.a);
        this.a -= (long) w.length();
        return w;
    }
}
