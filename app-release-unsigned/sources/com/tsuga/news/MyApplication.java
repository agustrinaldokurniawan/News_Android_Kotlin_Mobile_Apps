package com.tsuga.news;

import android.app.Application;
import i.o.e;
import i.s.c.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l.a.c.b;
import l.a.c.e.a;
import l.a.c.i.c;

public final class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        a aVar = a.a;
        h.e(aVar, "koinContext");
        h.e(aVar, "koinContext");
        synchronized (aVar) {
            b b = b.b();
            aVar.a(b);
            h.e(b, "$this$startKoin");
            l.a.c.i.b bVar = l.a.c.i.b.NONE;
            h.e(b, "<this>");
            h.e(bVar, "level");
            l.a.c.a aVar2 = b.a;
            l.a.a.c.a aVar3 = new l.a.a.c.a(bVar);
            Objects.requireNonNull(aVar2);
            h.e(aVar3, "logger");
            aVar2.b = aVar3;
            h.e(b, "<this>");
            h.e(this, "androidContext");
            c cVar = b.a.b;
            l.a.c.i.b bVar2 = l.a.c.i.b.INFO;
            if (cVar.c(bVar2)) {
                c cVar2 = b.a.b;
                Objects.requireNonNull(cVar2);
                h.e("[init] declare Android Context", "msg");
                cVar2.b(bVar2, "[init] declare Android Context");
            }
            int i2 = 0;
            l.a.c.a.b(b.a, h.a.t.a.G(h.a.t.a.K(false, false, new e(0, this), 3)), false, 2);
            l.a.c.j.a[] aVarArr = {c.a.a.b.a.a.a, c.a.a.b.a.a.b, c.a.a.b.a.a.f331c, c.a.a.a.a.a, c.a.a.a.a.b};
            h.e(aVarArr, "elements");
            List a = e.a(aVarArr);
            h.e(a, "modules");
            if (b.a.b.c(bVar2)) {
                double I = h.a.t.a.I(new l.a.c.c(b, a));
                Collection<l.a.c.n.b> values = b.a.a.b.values();
                h.d(values, "_scopeDefinitions.values");
                ArrayList arrayList = new ArrayList(h.a.t.a.l(values, 10));
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(it.next().e.size()));
                }
                h.e(arrayList, "$this$sum");
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    i2 += ((Number) it2.next()).intValue();
                }
                c cVar3 = b.a.b;
                String str = "loaded " + i2 + " definitions - " + I + " ms";
                Objects.requireNonNull(cVar3);
                h.e(str, "msg");
                cVar3.b(bVar2, str);
            } else {
                l.a.c.a.b(b.a, a, false, 2);
            }
            b.a();
        }
    }
}
