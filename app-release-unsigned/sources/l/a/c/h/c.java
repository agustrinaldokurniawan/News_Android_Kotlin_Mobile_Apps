package l.a.c.h;

import i.s.c.h;
import i.x.e;
import java.util.ArrayList;
import java.util.Objects;
import l.a.c.a;
import l.a.c.g.d;
import l.a.c.i.b;

public abstract class c<T> {
    public final a a;
    public final l.a.c.f.a<T> b;

    public c(a aVar, l.a.c.f.a<T> aVar2) {
        h.e(aVar, "_koin");
        h.e(aVar2, "beanDefinition");
        this.a = aVar;
        this.b = aVar2;
    }

    public T a(b bVar) {
        h.e(bVar, "context");
        if (this.a.b.c(b.DEBUG)) {
            this.a.b.a(h.i("| create instance for ", this.b));
        }
        try {
            l.a.c.k.a aVar = bVar.f3795c;
            l.a.c.n.a aVar2 = bVar.a;
            Objects.requireNonNull(aVar2);
            h.e(aVar, "parameters");
            aVar2.f3810g = aVar;
            T k2 = this.b.f3787d.k(bVar.a, aVar);
            bVar.a.f3810g = null;
            return k2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            h.d(stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                h.d(className, "it.className");
                if (!(!e.b(className, "sun.reflect", false, 2))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb.append(i.o.e.h(arrayList, "\n\t", null, null, 0, null, null, 62));
            String sb2 = sb.toString();
            l.a.c.i.c cVar = this.a.b;
            StringBuilder f2 = c.c.a.a.a.f("Instance creation error : could not create instance for ");
            f2.append(this.b);
            f2.append(": ");
            f2.append(sb2);
            String sb3 = f2.toString();
            Objects.requireNonNull(cVar);
            h.e(sb3, "msg");
            cVar.b(b.ERROR, sb3);
            throw new d(h.i("Could not create instance for ", this.b), e);
        }
    }

    public abstract T b(b bVar);
}
