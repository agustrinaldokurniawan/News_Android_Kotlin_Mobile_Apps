package l.a.c.h;

import i.s.c.h;
import l.a.c.a;

public final class d<T> extends c<T> {

    /* renamed from: c  reason: collision with root package name */
    public T f3796c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(a aVar, l.a.c.f.a<T> aVar2) {
        super(aVar, aVar2);
        h.e(aVar, "koin");
        h.e(aVar2, "beanDefinition");
    }

    @Override // l.a.c.h.c
    public T a(b bVar) {
        h.e(bVar, "context");
        T t = this.f3796c;
        return t == null ? (T) super.a(bVar) : t;
    }

    @Override // l.a.c.h.c
    public T b(b bVar) {
        h.e(bVar, "context");
        synchronized (this) {
            if (!(this.f3796c != null)) {
                this.f3796c = a(bVar);
            }
        }
        T t = this.f3796c;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }
}
