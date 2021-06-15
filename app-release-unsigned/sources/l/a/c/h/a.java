package l.a.c.h;

import i.s.c.h;

public final class a<T> extends c<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(l.a.c.a aVar, l.a.c.f.a<T> aVar2) {
        super(aVar, aVar2);
        h.e(aVar, "koin");
        h.e(aVar2, "beanDefinition");
    }

    @Override // l.a.c.h.c
    public T b(b bVar) {
        h.e(bVar, "context");
        return a(bVar);
    }
}
