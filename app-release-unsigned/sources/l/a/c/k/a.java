package l.a.c.k;

import i.o.e;
import i.s.c.h;
import i.s.c.p;
import i.v.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.a.c.g.c;

public class a {
    public final List<Object> a;

    public a() {
        this(null, 1);
    }

    public a(List<? extends Object> list) {
        h.e(list, "values");
        this.a = list;
    }

    public a(List list, int i2) {
        i.o.h hVar = (i2 & 1) != 0 ? i.o.h.e : null;
        h.e(hVar, "values");
        this.a = hVar;
    }

    public <T> T a(b<T> bVar) {
        h.e(bVar, "clazz");
        List<Object> list = this.a;
        h.e(list, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        h.e(list, "$this$filterNotNullTo");
        h.e(arrayList, "destination");
        for (T t : list) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (h.a(p.a(next.getClass()), bVar)) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (T) e.f(arrayList2);
        }
        StringBuilder f2 = c.c.a.a.a.f("Ambiguous parameter injection: more than one value of type '");
        f2.append(l.a.d.a.a(bVar));
        f2.append("' to get from ");
        f2.append(this);
        f2.append(". Check your injection parameters");
        throw new c(f2.toString());
    }

    public String toString() {
        return h.i("DefinitionParameters", e.o(this.a));
    }
}
