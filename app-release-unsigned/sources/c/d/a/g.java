package c.d.a;

import c.d.a.m.s;
import c.d.a.m.u.e;
import c.d.a.m.w.n;
import c.d.a.m.w.o;
import c.d.a.m.w.p;
import c.d.a.m.w.r;
import c.d.a.m.x.h.f;
import c.d.a.p.a;
import c.d.a.p.e;
import c.d.a.p.f;
import c.d.a.s.k.a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class g {
    public final p a;
    public final c.d.a.p.a b;

    /* renamed from: c  reason: collision with root package name */
    public final c.d.a.p.e f752c;

    /* renamed from: d  reason: collision with root package name */
    public final f f753d;
    public final c.d.a.m.u.f e;

    /* renamed from: f  reason: collision with root package name */
    public final c.d.a.m.x.h.f f754f;

    /* renamed from: g  reason: collision with root package name */
    public final c.d.a.p.b f755g;

    /* renamed from: h  reason: collision with root package name */
    public final c.d.a.p.d f756h = new c.d.a.p.d();

    /* renamed from: i  reason: collision with root package name */
    public final c.d.a.p.c f757i = new c.d.a.p.c();

    /* renamed from: j  reason: collision with root package name */
    public final g.h.i.c<List<Throwable>> f758j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = c.c.a.a.a.f(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.a.g.c.<init>(java.lang.Object):void");
        }

        public <M> c(M m2, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + ((Object) m2));
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public g() {
        a.c cVar = new a.c(new g.h.i.e(20), new c.d.a.s.k.b(), new c.d.a.s.k.c());
        this.f758j = cVar;
        this.a = new p(cVar);
        this.b = new c.d.a.p.a();
        this.f752c = new c.d.a.p.e();
        this.f753d = new f();
        this.e = new c.d.a.m.u.f();
        this.f754f = new c.d.a.m.x.h.f();
        this.f755g = new c.d.a.p.b();
        List<String> asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        c.d.a.p.e eVar = this.f752c;
        synchronized (eVar) {
            ArrayList arrayList2 = new ArrayList(eVar.a);
            eVar.a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (!arrayList.contains(str2)) {
                    eVar.a.add(str2);
                }
            }
        }
    }

    public <Data> g a(Class<Data> cls, c.d.a.m.d<Data> dVar) {
        c.d.a.p.a aVar = this.b;
        synchronized (aVar) {
            aVar.a.add(new a.C0032a<>(cls, dVar));
        }
        return this;
    }

    public <TResource> g b(Class<TResource> cls, s<TResource> sVar) {
        f fVar = this.f753d;
        synchronized (fVar) {
            fVar.a.add(new f.a<>(cls, sVar));
        }
        return this;
    }

    public <Model, Data> g c(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        p pVar = this.a;
        synchronized (pVar) {
            r rVar = pVar.a;
            synchronized (rVar) {
                r.b<?, ?> bVar = new r.b<>(cls, cls2, oVar);
                List<r.b<?, ?>> list = rVar.f1016c;
                list.add(list.size(), bVar);
            }
            pVar.b.a.clear();
        }
        return this;
    }

    public <Data, TResource> g d(String str, Class<Data> cls, Class<TResource> cls2, c.d.a.m.r<Data, TResource> rVar) {
        c.d.a.p.e eVar = this.f752c;
        synchronized (eVar) {
            eVar.a(str).add(new e.a<>(cls, cls2, rVar));
        }
        return this;
    }

    public List<ImageHeaderParser> e() {
        List<ImageHeaderParser> list;
        c.d.a.p.b bVar = this.f755g;
        synchronized (bVar) {
            list = bVar.a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    public <Model> List<n<Model, ?>> f(Model model) {
        List<n<Model, ?>> list;
        p pVar = this.a;
        Objects.requireNonNull(pVar);
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0025a<?> aVar = pVar.b.a.get(cls);
            list = aVar == null ? null : aVar.a;
            if (list == null) {
                list = Collections.unmodifiableList(pVar.a.c(cls));
                if (pVar.b.a.put(cls, new p.a.C0025a<>(list)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i2 = 0; i2 < size; i2++) {
                n<Model, ?> nVar = list.get(i2);
                if (nVar.b(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i2);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    public g g(e.a<?> aVar) {
        c.d.a.m.u.f fVar = this.e;
        synchronized (fVar) {
            fVar.b.put(aVar.a(), aVar);
        }
        return this;
    }

    public <TResource, Transcode> g h(Class<TResource> cls, Class<Transcode> cls2, c.d.a.m.x.h.e<TResource, Transcode> eVar) {
        c.d.a.m.x.h.f fVar = this.f754f;
        synchronized (fVar) {
            fVar.a.add(new f.a<>(cls, cls2, eVar));
        }
        return this;
    }
}
