package c.d.a.m.v;

import c.d.a.d;
import c.d.a.f;
import c.d.a.g;
import c.d.a.m.m;
import c.d.a.m.p;
import c.d.a.m.t;
import c.d.a.m.v.d0.a;
import c.d.a.m.v.i;
import c.d.a.m.v.l;
import c.d.a.m.w.n;
import c.d.a.m.x.b;
import c.d.a.m.x.h.e;
import c.d.a.m.x.h.f;
import c.d.a.p.a;
import c.d.a.p.c;
import c.d.a.p.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class h<Transcode> {
    public final List<n.a<?>> a = new ArrayList();
    public final List<m> b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public d f900c;

    /* renamed from: d  reason: collision with root package name */
    public Object f901d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f902f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f903g;

    /* renamed from: h  reason: collision with root package name */
    public i.d f904h;

    /* renamed from: i  reason: collision with root package name */
    public p f905i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, t<?>> f906j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f907k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f908l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f909m;
    public m n;
    public f o;
    public k p;
    public boolean q;
    public boolean r;

    public List<m> a() {
        if (!this.f909m) {
            this.f909m = true;
            this.b.clear();
            List<n.a<?>> c2 = c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a<?> aVar = c2.get(i2);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i3 = 0; i3 < aVar.b.size(); i3++) {
                    if (!this.b.contains(aVar.b.get(i3))) {
                        this.b.add(aVar.b.get(i3));
                    }
                }
            }
        }
        return this.b;
    }

    public a b() {
        return ((l.c) this.f904h).a();
    }

    public List<n.a<?>> c() {
        if (!this.f908l) {
            this.f908l = true;
            this.a.clear();
            List f2 = this.f900c.f740c.f(this.f901d);
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a<?> a2 = ((n) f2.get(i2)).a(this.f901d, this.e, this.f902f, this.f905i);
                if (a2 != null) {
                    this.a.add(a2);
                }
            }
        }
        return this.a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: java.lang.Class<Data> */
    /* JADX WARN: Multi-variable type inference failed */
    public <Data> u<Data, ?, Transcode> d(Class<Data> cls) {
        u<Data, ?, Transcode> uVar;
        ArrayList arrayList;
        e eVar;
        g gVar = this.f900c.f740c;
        Class<?> cls2 = this.f903g;
        Class cls3 = (Class<Transcode>) this.f907k;
        c cVar = gVar.f757i;
        c.d.a.s.i andSet = cVar.f1125c.getAndSet(null);
        if (andSet == null) {
            andSet = new c.d.a.s.i();
        }
        andSet.a = cls;
        andSet.b = cls2;
        andSet.f1165c = cls3;
        synchronized (cVar.b) {
            uVar = (u<Data, ?, Transcode>) cVar.b.getOrDefault(andSet, null);
        }
        cVar.f1125c.set(andSet);
        Objects.requireNonNull(gVar.f757i);
        if (c.a.equals(uVar)) {
            return null;
        }
        if (uVar != null) {
            return uVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) gVar.f752c.b(cls, cls2)).iterator();
        while (it.hasNext()) {
            Class<?> cls4 = (Class) it.next();
            Iterator it2 = ((ArrayList) gVar.f754f.a(cls4, cls3)).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class<?> cls5 = (Class) it2.next();
                    c.d.a.p.e eVar2 = gVar.f752c;
                    synchronized (eVar2) {
                        arrayList = new ArrayList();
                        for (String str : eVar2.a) {
                            List<e.a<?, ?>> list = eVar2.b.get(str);
                            if (list != null) {
                                for (e.a<?, ?> aVar : list) {
                                    if (aVar.a(cls, cls4)) {
                                        arrayList.add(aVar.f1126c);
                                    }
                                }
                            }
                        }
                    }
                    c.d.a.m.x.h.f fVar = gVar.f754f;
                    synchronized (fVar) {
                        if (cls5.isAssignableFrom(cls4)) {
                            eVar = c.d.a.m.x.h.g.a;
                        } else {
                            for (f.a<?, ?> aVar2 : fVar.a) {
                                if (aVar2.a(cls4, cls5)) {
                                    eVar = aVar2.f1106c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                    }
                    arrayList2.add(new j(cls, cls4, cls5, arrayList, eVar, gVar.f758j));
                }
            }
        }
        u<Data, ?, Transcode> uVar2 = arrayList2.isEmpty() ? null : new u<>(cls, cls2, cls3, arrayList2, gVar.f758j);
        c cVar2 = gVar.f757i;
        synchronized (cVar2.b) {
            cVar2.b.put(new c.d.a.s.i(cls, cls2, cls3), uVar2 != null ? uVar2 : c.a);
        }
        return uVar2;
    }

    public <X> c.d.a.m.d<X> e(X x) {
        Object obj;
        c.d.a.p.a aVar = this.f900c.f740c.b;
        Class<?> cls = x.getClass();
        synchronized (aVar) {
            Iterator<a.C0032a<?>> it = aVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = (c.d.a.m.d<X>) null;
                    break;
                }
                a.C0032a<?> next = it.next();
                if (next.a.isAssignableFrom(cls)) {
                    obj = (c.d.a.m.d<T>) next.b;
                    break;
                }
            }
        }
        if (obj != null) {
            return (c.d.a.m.d<X>) obj;
        }
        throw new g.e(x.getClass());
    }

    public <Z> t<Z> f(Class<Z> cls) {
        t<Z> tVar = (t<Z>) this.f906j.get(cls);
        if (tVar == null) {
            Iterator<Map.Entry<Class<?>, t<?>>> it = this.f906j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, t<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    tVar = (t<Z>) next.getValue();
                    break;
                }
            }
        }
        if (tVar != null) {
            return tVar;
        }
        if (!this.f906j.isEmpty() || !this.q) {
            return (b) b.b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean g(Class<?> cls) {
        return d(cls) != null;
    }
}
