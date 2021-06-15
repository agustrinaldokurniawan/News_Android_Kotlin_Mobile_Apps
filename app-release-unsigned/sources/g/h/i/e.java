package g.h.i;

public class e<T> extends d<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f2519c = new Object();

    public e(int i2) {
        super(i2);
    }

    @Override // g.h.i.c, g.h.i.d
    public boolean a(T t) {
        boolean a;
        synchronized (this.f2519c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // g.h.i.c, g.h.i.d
    public T b() {
        T t;
        synchronized (this.f2519c) {
            t = (T) super.b();
        }
        return t;
    }
}
