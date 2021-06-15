package c.d.a.m.w;

import c.d.a.f;
import c.d.a.m.p;
import c.d.a.m.u.d;
import c.d.a.m.w.n;

public class v<Model> implements n<Model, Model> {
    public static final v<?> a = new v<>();

    public static class a<Model> implements o<Model, Model> {
        public static final a<?> a = new a<>();

        @Override // c.d.a.m.w.o
        public n<Model, Model> b(r rVar) {
            return v.a;
        }
    }

    public static class b<Model> implements d<Model> {
        public final Model e;

        public b(Model model) {
            this.e = model;
        }

        @Override // c.d.a.m.u.d
        public Class<Model> a() {
            return (Class<Model>) this.e.getClass();
        }

        @Override // c.d.a.m.u.d
        public void b() {
        }

        @Override // c.d.a.m.u.d
        public c.d.a.m.a c() {
            return c.d.a.m.a.LOCAL;
        }

        @Override // c.d.a.m.u.d
        public void cancel() {
        }

        @Override // c.d.a.m.u.d
        public void e(f fVar, d.a<? super Model> aVar) {
            aVar.f(this.e);
        }
    }

    @Override // c.d.a.m.w.n
    public n.a<Model> a(Model model, int i2, int i3, p pVar) {
        return new n.a<>(new c.d.a.r.b(model), new b(model));
    }

    @Override // c.d.a.m.w.n
    public boolean b(Model model) {
        return true;
    }
}
