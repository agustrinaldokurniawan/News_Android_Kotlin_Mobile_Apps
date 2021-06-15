package i.q;

import i.q.f;
import i.s.b.p;
import i.s.c.h;

public abstract class a implements f.a {
    private final f.b<?> key;

    public a(f.b<?> bVar) {
        h.e(bVar, "key");
        this.key = bVar;
    }

    @Override // i.q.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        h.e(pVar, "operation");
        return (R) f.a.C0119a.a(this, r, pVar);
    }

    @Override // i.q.f, i.q.f.a
    public <E extends f.a> E get(f.b<E> bVar) {
        h.e(bVar, "key");
        return (E) f.a.C0119a.b(this, bVar);
    }

    @Override // i.q.f.a
    public f.b<?> getKey() {
        return this.key;
    }

    @Override // i.q.f
    public f minusKey(f.b<?> bVar) {
        h.e(bVar, "key");
        return f.a.C0119a.c(this, bVar);
    }

    public f plus(f fVar) {
        h.e(fVar, "context");
        return f.a.C0119a.d(this, fVar);
    }
}
