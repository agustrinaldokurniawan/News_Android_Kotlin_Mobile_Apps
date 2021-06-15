package d.a.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class j<E> {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur");
    public volatile Object _cur;

    public j(boolean z) {
        this._cur = new k(8, z);
    }

    public final boolean a(E e) {
        while (true) {
            k kVar = (k) this._cur;
            int a2 = kVar.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.compareAndSet(this, kVar, kVar.d());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            k kVar = (k) this._cur;
            if (!kVar.b()) {
                a.compareAndSet(this, kVar, kVar.d());
            } else {
                return;
            }
        }
    }

    public final int c() {
        long j2 = ((k) this._cur)._state;
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0))) & 1073741823;
    }

    public final E d() {
        while (true) {
            k kVar = (k) this._cur;
            E e = (E) kVar.e();
            if (e != k.f1765c) {
                return e;
            }
            a.compareAndSet(this, kVar, kVar.d());
        }
    }
}
