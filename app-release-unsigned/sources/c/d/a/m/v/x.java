package c.d.a.m.v;

import c.c.a.a.a;
import c.d.a.m.m;
import c.d.a.m.t;
import c.d.a.m.u.d;
import c.d.a.m.v.g;
import c.d.a.m.w.n;
import c.d.a.m.w.p;
import c.d.a.s.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class x implements g, d.a<Object> {
    public final g.a e;

    /* renamed from: f  reason: collision with root package name */
    public final h<?> f978f;

    /* renamed from: g  reason: collision with root package name */
    public int f979g;

    /* renamed from: h  reason: collision with root package name */
    public int f980h = -1;

    /* renamed from: i  reason: collision with root package name */
    public m f981i;

    /* renamed from: j  reason: collision with root package name */
    public List<n<File, ?>> f982j;

    /* renamed from: k  reason: collision with root package name */
    public int f983k;

    /* renamed from: l  reason: collision with root package name */
    public volatile n.a<?> f984l;

    /* renamed from: m  reason: collision with root package name */
    public File f985m;
    public y n;

    public x(h<?> hVar, g.a aVar) {
        this.f978f = hVar;
        this.e = aVar;
    }

    @Override // c.d.a.m.v.g
    public boolean a() {
        List<Class<?>> orDefault;
        List<Class<?>> d2;
        List<m> a = this.f978f.a();
        if (a.isEmpty()) {
            return false;
        }
        h<?> hVar = this.f978f;
        c.d.a.g gVar = hVar.f900c.f740c;
        Class<?> cls = hVar.f901d.getClass();
        Class<?> cls2 = hVar.f903g;
        Class cls3 = (Class<Transcode>) hVar.f907k;
        c.d.a.p.d dVar = gVar.f756h;
        i andSet = dVar.a.getAndSet(null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a = cls;
            andSet.b = cls2;
            andSet.f1165c = cls3;
        }
        synchronized (dVar.b) {
            orDefault = dVar.b.getOrDefault(andSet, null);
        }
        dVar.a.set(andSet);
        ArrayList arrayList = orDefault;
        if (orDefault == null) {
            ArrayList arrayList2 = new ArrayList();
            p pVar = gVar.a;
            synchronized (pVar) {
                d2 = pVar.a.d(cls);
            }
            Iterator it = ((ArrayList) d2).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) gVar.f752c.b((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) gVar.f754f.a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            c.d.a.p.d dVar2 = gVar.f756h;
            List<Class<?>> unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (dVar2.b) {
                dVar2.b.put(new i(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List<n<File, ?>> list = this.f982j;
                if (list != null) {
                    if (this.f983k < list.size()) {
                        this.f984l = null;
                        boolean z = false;
                        while (!z) {
                            if (!(this.f983k < this.f982j.size())) {
                                break;
                            }
                            List<n<File, ?>> list2 = this.f982j;
                            int i2 = this.f983k;
                            this.f983k = i2 + 1;
                            File file = this.f985m;
                            h<?> hVar2 = this.f978f;
                            this.f984l = list2.get(i2).a(file, hVar2.e, hVar2.f902f, hVar2.f905i);
                            if (this.f984l != null && this.f978f.g(this.f984l.f1009c.a())) {
                                this.f984l.f1009c.e(this.f978f.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                }
                int i3 = this.f980h + 1;
                this.f980h = i3;
                if (i3 >= arrayList.size()) {
                    int i4 = this.f979g + 1;
                    this.f979g = i4;
                    if (i4 >= a.size()) {
                        return false;
                    }
                    this.f980h = 0;
                }
                m mVar = a.get(this.f979g);
                Class<?> cls5 = arrayList.get(this.f980h);
                t<Z> f2 = this.f978f.f(cls5);
                h<?> hVar3 = this.f978f;
                this.n = new y(hVar3.f900c.b, mVar, hVar3.n, hVar3.e, hVar3.f902f, f2, cls5, hVar3.f905i);
                File b = hVar3.b().b(this.n);
                this.f985m = b;
                if (b != null) {
                    this.f981i = mVar;
                    this.f982j = this.f978f.f900c.f740c.f(b);
                    this.f983k = 0;
                }
            }
        } else if (File.class.equals(this.f978f.f907k)) {
            return false;
        } else {
            StringBuilder f3 = a.f("Failed to find any load path from ");
            f3.append(this.f978f.f901d.getClass());
            f3.append(" to ");
            f3.append(this.f978f.f907k);
            throw new IllegalStateException(f3.toString());
        }
    }

    @Override // c.d.a.m.v.g
    public void cancel() {
        n.a<?> aVar = this.f984l;
        if (aVar != null) {
            aVar.f1009c.cancel();
        }
    }

    @Override // c.d.a.m.u.d.a
    public void d(Exception exc) {
        this.e.d(this.n, exc, this.f984l.f1009c, c.d.a.m.a.RESOURCE_DISK_CACHE);
    }

    @Override // c.d.a.m.u.d.a
    public void f(Object obj) {
        this.e.c(this.f981i, obj, this.f984l.f1009c, c.d.a.m.a.RESOURCE_DISK_CACHE, this.n);
    }
}
