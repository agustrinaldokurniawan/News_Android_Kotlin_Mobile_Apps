package j.n0.g;

import i.s.c.h;
import j.l0;
import j.n0.f.c;
import j.n0.f.d;
import j.n0.g.e;
import j.n0.k.h;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public final class j {
    public final long a;
    public final c b;

    /* renamed from: c  reason: collision with root package name */
    public final a f3533c = new a(this, c.c.a.a.a.e(new StringBuilder(), j.n0.c.f3472g, " ConnectionPool"));

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentLinkedQueue<i> f3534d = new ConcurrentLinkedQueue<>();
    public final int e;

    public static final class a extends j.n0.f.a {
        public final /* synthetic */ j e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(str, true);
            this.e = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
            j.n0.c.d(r6.m());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
            if (r0.f3534d.isEmpty() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
            r0.b.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return 0;
         */
        @Override // j.n0.f.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long a() {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: j.n0.g.j.a.a():long");
        }
    }

    public j(d dVar, int i2, long j2, TimeUnit timeUnit) {
        h.f(dVar, "taskRunner");
        h.f(timeUnit, "timeUnit");
        this.e = i2;
        this.a = timeUnit.toNanos(j2);
        this.b = dVar.f();
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(c.c.a.a.a.n("keepAliveDuration <= 0: ", j2).toString());
        }
    }

    public final boolean a(j.a aVar, e eVar, List<l0> list, boolean z) {
        h.f(aVar, "address");
        h.f(eVar, "call");
        Iterator<i> it = this.f3534d.iterator();
        while (it.hasNext()) {
            i next = it.next();
            h.b(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.j()) {
                    }
                }
                if (next.h(aVar, list)) {
                    eVar.d(next);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(i iVar, long j2) {
        byte[] bArr = j.n0.c.a;
        List<Reference<e>> list = iVar.o;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference<e> reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                StringBuilder f2 = c.c.a.a.a.f("A connection to ");
                f2.append(iVar.q.a.a);
                f2.append(" was leaked. ");
                f2.append("Did you forget to close a response body?");
                String sb = f2.toString();
                h.a aVar = j.n0.k.h.f3695c;
                j.n0.k.h.a.k(sb, ((e.b) reference).a);
                list.remove(i2);
                iVar.f3528i = true;
                if (list.isEmpty()) {
                    iVar.p = j2 - this.a;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
