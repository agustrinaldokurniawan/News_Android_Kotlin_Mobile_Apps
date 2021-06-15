package c.d.a.m.w;

import c.d.a.f;
import c.d.a.m.m;
import c.d.a.m.p;
import c.d.a.m.u.d;
import c.d.a.m.v.r;
import c.d.a.m.w.n;
import g.h.i.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class q<Model, Data> implements n<Model, Data> {
    public final List<n<Model, Data>> a;
    public final c<List<Throwable>> b;

    public static class a<Data> implements d<Data>, d.a<Data> {
        public final List<d<Data>> e;

        /* renamed from: f  reason: collision with root package name */
        public final c<List<Throwable>> f1010f;

        /* renamed from: g  reason: collision with root package name */
        public int f1011g;

        /* renamed from: h  reason: collision with root package name */
        public f f1012h;

        /* renamed from: i  reason: collision with root package name */
        public d.a<? super Data> f1013i;

        /* renamed from: j  reason: collision with root package name */
        public List<Throwable> f1014j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1015k;

        public a(List<d<Data>> list, c<List<Throwable>> cVar) {
            this.f1010f = cVar;
            if (!list.isEmpty()) {
                this.e = list;
                this.f1011g = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @Override // c.d.a.m.u.d
        public Class<Data> a() {
            return this.e.get(0).a();
        }

        @Override // c.d.a.m.u.d
        public void b() {
            List<Throwable> list = this.f1014j;
            if (list != null) {
                this.f1010f.a(list);
            }
            this.f1014j = null;
            for (d<Data> dVar : this.e) {
                dVar.b();
            }
        }

        @Override // c.d.a.m.u.d
        public c.d.a.m.a c() {
            return this.e.get(0).c();
        }

        @Override // c.d.a.m.u.d
        public void cancel() {
            this.f1015k = true;
            for (d<Data> dVar : this.e) {
                dVar.cancel();
            }
        }

        @Override // c.d.a.m.u.d.a
        public void d(Exception exc) {
            List<Throwable> list = this.f1014j;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // c.d.a.m.u.d
        public void e(f fVar, d.a<? super Data> aVar) {
            this.f1012h = fVar;
            this.f1013i = aVar;
            this.f1014j = this.f1010f.b();
            this.e.get(this.f1011g).e(fVar, this);
            if (this.f1015k) {
                cancel();
            }
        }

        @Override // c.d.a.m.u.d.a
        public void f(Data data) {
            if (data != null) {
                this.f1013i.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (!this.f1015k) {
                if (this.f1011g < this.e.size() - 1) {
                    this.f1011g++;
                    e(this.f1012h, this.f1013i);
                    return;
                }
                Objects.requireNonNull(this.f1014j, "Argument must not be null");
                this.f1013i.d(new r("Fetch failed", new ArrayList(this.f1014j)));
            }
        }
    }

    public q(List<n<Model, Data>> list, c<List<Throwable>> cVar) {
        this.a = list;
        this.b = cVar;
    }

    @Override // c.d.a.m.w.n
    public n.a<Data> a(Model model, int i2, int i3, p pVar) {
        n.a<Data> a2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        m mVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            n<Model, Data> nVar = this.a.get(i4);
            if (nVar.b(model) && (a2 = nVar.a(model, i2, i3, pVar)) != null) {
                mVar = a2.a;
                arrayList.add(a2.f1009c);
            }
        }
        if (arrayList.isEmpty() || mVar == null) {
            return null;
        }
        return new n.a<>(mVar, new a(arrayList, this.b));
    }

    @Override // c.d.a.m.w.n
    public boolean b(Model model) {
        for (n<Model, Data> nVar : this.a) {
            if (nVar.b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("MultiModelLoader{modelLoaders=");
        f2.append(Arrays.toString(this.a.toArray()));
        f2.append('}');
        return f2.toString();
    }
}
