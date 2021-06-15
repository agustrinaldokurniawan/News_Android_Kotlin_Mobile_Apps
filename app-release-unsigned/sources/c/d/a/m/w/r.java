package c.d.a.m.w;

import c.d.a.g;
import c.d.a.m.p;
import c.d.a.m.w.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class r {
    public static final c a = new c();
    public static final n<Object, Object> b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<b<?, ?>> f1016c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final c f1017d;
    public final Set<b<?, ?>> e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final g.h.i.c<List<Throwable>> f1018f;

    public static class a implements n<Object, Object> {
        @Override // c.d.a.m.w.n
        public n.a<Object> a(Object obj, int i2, int i3, p pVar) {
            return null;
        }

        @Override // c.d.a.m.w.n
        public boolean b(Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {
        public final Class<Model> a;
        public final Class<Data> b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f1019c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.a = cls;
            this.b = cls2;
            this.f1019c = oVar;
        }
    }

    public static class c {
    }

    public r(g.h.i.c<List<Throwable>> cVar) {
        c cVar2 = a;
        this.f1018f = cVar;
        this.f1017d = cVar2;
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: c.d.a.m.w.n<? extends Model, ? extends Data>, java.lang.Object, c.d.a.m.w.n<Model, Data> */
    public final <Model, Data> n<Model, Data> a(b<?, ?> bVar) {
        n nVar = (n<? extends Model, ? extends Data>) bVar.f1019c.b(this);
        Objects.requireNonNull(nVar, "Argument must not be null");
        return nVar;
    }

    public synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.f1016c) {
                if (this.e.contains(bVar)) {
                    z = true;
                } else if (bVar.a.isAssignableFrom(cls) && bVar.b.isAssignableFrom(cls2)) {
                    this.e.add(bVar);
                    arrayList.add(a(bVar));
                    this.e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f1017d;
                g.h.i.c<List<Throwable>> cVar2 = this.f1018f;
                Objects.requireNonNull(cVar);
                return new q(arrayList, cVar2);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z) {
                return (n<Model, Data>) b;
            } else {
                throw new g.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.e.clear();
            throw th;
        }
    }

    public synchronized <Model> List<n<Model, ?>> c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f1016c) {
                if (!this.e.contains(bVar)) {
                    if (bVar.a.isAssignableFrom(cls)) {
                        this.e.add(bVar);
                        n<? extends Model, ? extends Data> b2 = bVar.f1019c.b(this);
                        Objects.requireNonNull(b2, "Argument must not be null");
                        arrayList.add(b2);
                        this.e.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.e.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized List<Class<?>> d(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f1016c) {
            if (!arrayList.contains(bVar.b) && bVar.a.isAssignableFrom(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }
}
