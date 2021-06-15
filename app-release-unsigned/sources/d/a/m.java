package d.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class m {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(m.class, "_handled");
    public volatile int _handled;
    public final Throwable b;

    public m(Throwable th, boolean z) {
        this.b = th;
        this._handled = z ? 1 : 0;
    }

    public m(Throwable th, boolean z, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        this.b = th;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        this._handled = i3;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.b + ']';
    }
}
