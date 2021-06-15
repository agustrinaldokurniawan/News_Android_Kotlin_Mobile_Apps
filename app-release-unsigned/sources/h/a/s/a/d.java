package h.a.s.a;

import h.a.p.c;
import h.a.s.g.i;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public final class d implements c, a {
    public List<c> e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f3087f;

    @Override // h.a.s.a.a
    public boolean a(c cVar) {
        Objects.requireNonNull(cVar, "Disposable item is null");
        if (this.f3087f) {
            return false;
        }
        synchronized (this) {
            if (this.f3087f) {
                return false;
            }
            List<c> list = this.e;
            if (list != null) {
                if (list.remove(cVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // h.a.s.a.a
    public boolean b(c cVar) {
        if (!a(cVar)) {
            return false;
        }
        ((i) cVar).e();
        return true;
    }

    @Override // h.a.s.a.a
    public boolean c(c cVar) {
        if (!this.f3087f) {
            synchronized (this) {
                if (!this.f3087f) {
                    List list = this.e;
                    if (list == null) {
                        list = new LinkedList();
                        this.e = list;
                    }
                    list.add(cVar);
                    return true;
                }
            }
        }
        cVar.e();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r1.hasNext() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.next().e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        c.f.a.b.h(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r2 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r2.size() != 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        throw h.a.s.j.b.b((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        throw new h.a.q.a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    @Override // h.a.p.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e() {
        /*
            r4 = this;
            boolean r0 = r4.f3087f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r4)
            boolean r0 = r4.f3087f     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            return
        L_0x000c:
            r0 = 1
            r4.f3087f = r0     // Catch:{ all -> 0x0056 }
            java.util.List<h.a.p.c> r1 = r4.e     // Catch:{ all -> 0x0056 }
            r2 = 0
            r4.e = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0055
        L_0x0018:
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r1.next()
            h.a.p.c r3 = (h.a.p.c) r3
            r3.e()     // Catch:{ all -> 0x002c }
            goto L_0x001c
        L_0x002c:
            r3 = move-exception
            c.f.a.b.h(r3)
            if (r2 != 0) goto L_0x0037
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0037:
            r2.add(r3)
            goto L_0x001c
        L_0x003b:
            if (r2 == 0) goto L_0x0055
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004f
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = h.a.s.j.b.b(r0)
            throw r0
        L_0x004f:
            h.a.q.a r0 = new h.a.q.a
            r0.<init>(r2)
            throw r0
        L_0x0055:
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.s.a.d.e():void");
    }
}
