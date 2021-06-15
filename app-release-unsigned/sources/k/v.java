package k;

import i.s.c.h;
import java.util.concurrent.atomic.AtomicReference;

public final class v {
    public static final u a = new u(new byte[0], 0, 0, false, false);
    public static final int b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<u>[] f3767c;

    /* renamed from: d  reason: collision with root package name */
    public static final v f3768d = new v();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference<u>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        f3767c = atomicReferenceArr;
    }

    public static final void a(u uVar) {
        h.f(uVar, "segment");
        if (!(uVar.f3765f == null && uVar.f3766g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!uVar.f3764d) {
            Thread currentThread = Thread.currentThread();
            h.b(currentThread, "Thread.currentThread()");
            AtomicReference<u> atomicReference = f3767c[(int) (currentThread.getId() & (((long) b) - 1))];
            u uVar2 = atomicReference.get();
            if (uVar2 != a) {
                int i2 = uVar2 != null ? uVar2.f3763c : 0;
                if (i2 < 65536) {
                    uVar.f3765f = uVar2;
                    uVar.b = 0;
                    uVar.f3763c = i2 + 8192;
                    if (!atomicReference.compareAndSet(uVar2, uVar)) {
                        uVar.f3765f = null;
                    }
                }
            }
        }
    }

    public static final u b() {
        Thread currentThread = Thread.currentThread();
        h.b(currentThread, "Thread.currentThread()");
        AtomicReference<u> atomicReference = f3767c[(int) (currentThread.getId() & (((long) b) - 1))];
        u uVar = a;
        u andSet = atomicReference.getAndSet(uVar);
        if (andSet == uVar) {
            return new u();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new u();
        }
        atomicReference.set(andSet.f3765f);
        andSet.f3765f = null;
        andSet.f3763c = 0;
        return andSet;
    }
}
