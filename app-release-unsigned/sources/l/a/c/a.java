package l.a.c;

import i.s.c.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import l.a.c.h.d;
import l.a.c.i.c;
import l.a.c.m.b;

public final class a {
    public final b a = new b(this);
    public c b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<l.a.c.j.a> f3782c;

    public a() {
        h.e(this, "_koin");
        new ConcurrentHashMap();
        this.b = new l.a.c.i.a();
        this.f3782c = new HashSet<>();
    }

    public static void b(a aVar, List list, boolean z, int i2) {
        T t;
        if ((i2 & 2) != 0) {
            z = false;
        }
        Objects.requireNonNull(aVar);
        h.e(list, "modules");
        aVar.f3782c.addAll(list);
        b bVar = aVar.a;
        Objects.requireNonNull(bVar);
        h.e(list, "modules");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l.a.c.j.a aVar2 = (l.a.c.j.a) it.next();
            if (!aVar2.f3802d) {
                for (T t2 : aVar2.e) {
                    l.a.c.n.b bVar2 = new l.a.c.n.b(t2, false, 2);
                    if (bVar.b.get(t2.getValue()) == null) {
                        bVar.b.put(t2.getValue(), bVar2);
                    }
                }
                for (T t3 : aVar2.f3803f) {
                    h.e(t3, "bean");
                    l.a.c.n.b bVar3 = bVar.b.get(t3.a.getValue());
                    if (bVar3 != null) {
                        l.a.c.n.b bVar4 = l.a.c.n.b.a;
                        h.e(t3, "beanDefinition");
                        if (bVar3.e.contains(t3)) {
                            if (!t3.f3789g.b) {
                                Iterator<T> it2 = bVar3.e.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it2.next();
                                    if (h.a(t, t3)) {
                                        break;
                                    }
                                }
                                throw new l.a.c.g.b("Definition '" + ((Object) t3) + "' try to override existing definition. Please use override option or check for definition '" + ((Object) t) + '\'');
                            }
                            bVar3.e.remove(t3);
                        }
                        bVar3.e.add(t3);
                        Collection<l.a.c.n.a> values = bVar.f3805c.values();
                        h.d(values, "_scopes.values");
                        ArrayList arrayList = new ArrayList();
                        for (T t4 : values) {
                            if (h.a(t4.b, bVar3)) {
                                arrayList.add(t4);
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            l.a.c.n.a aVar3 = (l.a.c.n.a) it3.next();
                            Objects.requireNonNull(aVar3);
                            h.e(t3, "beanDefinition");
                            l.a.c.m.a aVar4 = aVar3.e;
                            Objects.requireNonNull(aVar4);
                            h.e(t3, "definition");
                            aVar4.a(t3, t3.f3789g.b);
                        }
                    } else {
                        throw new IllegalStateException(h.i("Undeclared scope definition for definition: ", t3).toString());
                    }
                }
                aVar2.f3802d = true;
            } else {
                c cVar = bVar.a.b;
                String str = "module '" + aVar2 + "' already loaded!";
                Objects.requireNonNull(cVar);
                h.e(str, "msg");
                cVar.b(l.a.c.i.b.ERROR, str);
            }
        }
        if (z) {
            aVar.a();
        }
    }

    public static void c(a aVar, List list, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        h.e(list, "modules");
        b bVar = aVar.a;
        Objects.requireNonNull(bVar);
        h.e(list, "modules");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l.a.c.j.a aVar2 = (l.a.c.j.a) it.next();
            h.e(aVar2, "module");
            for (T t : aVar2.f3803f) {
                l.a.c.n.b bVar2 = bVar.b.get(t.a.getValue());
                if (bVar2 != null) {
                    h.e(t, "beanDefinition");
                    bVar2.e.remove(t);
                    Collection<l.a.c.n.a> values = bVar.f3805c.values();
                    h.d(values, "_scopes.values");
                    ArrayList arrayList = new ArrayList();
                    for (T t2 : values) {
                        if (h.a(t2.b.f3811c, bVar2.f3811c)) {
                            arrayList.add(t2);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        l.a.c.n.a aVar3 = (l.a.c.n.a) it2.next();
                        Objects.requireNonNull(aVar3);
                        h.e(t, "beanDefinition");
                        l.a.c.m.a aVar4 = aVar3.e;
                        Objects.requireNonNull(aVar4);
                        h.e(t, "definition");
                        HashMap<String, l.a.c.h.c<?>> hashMap = aVar4.f3804c;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, l.a.c.h.c<?>> entry : hashMap.entrySet()) {
                            if (h.a(entry.getValue().b, t)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            arrayList2.add((String) entry2.getKey());
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            aVar4.f3804c.remove((String) it3.next());
                        }
                    }
                } else {
                    throw new IllegalStateException(h.i("Can't find scope for definition ", t).toString());
                }
            }
            aVar2.f3802d = false;
        }
        aVar.f3782c.removeAll(list);
        if (z) {
            aVar.a();
        }
    }

    public final void a() {
        l.a.c.n.a aVar = this.a.e;
        if (aVar == null) {
            throw new IllegalStateException("No root scope".toString());
        } else if (aVar.b.f3812d) {
            l.a.c.m.a aVar2 = aVar.e;
            Collection<l.a.c.h.c<?>> values = aVar2.f3804c.values();
            ArrayList arrayList = new ArrayList();
            for (T t : values) {
                if (t instanceof d) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((d) next).b.f3789g.a) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).b(new l.a.c.h.b(aVar2.a, aVar2.b, null));
            }
        }
    }
}
