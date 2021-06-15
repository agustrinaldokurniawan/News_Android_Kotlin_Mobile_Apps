package h.a.p;

import h.a.s.a.a;
import h.a.s.g.i;
import h.a.s.j.c;

public final class b implements c, a {
    public c<c> e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f3081f;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[DONT_GENERATE] */
    @Override // h.a.s.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(h.a.p.c r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposables is null"
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r7.f3081f
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r7)
            boolean r0 = r7.f3081f     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x004a }
            return r1
        L_0x0012:
            h.a.s.j.c<h.a.p.c> r0 = r7.e     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            T[] r2 = r0.f3280d     // Catch:{ all -> 0x004a }
            int r3 = r0.a     // Catch:{ all -> 0x004a }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x004a }
            int r4 = h.a.s.j.c.b(r4)     // Catch:{ all -> 0x004a }
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004a }
            r6 = 1
            if (r5 != 0) goto L_0x002a
        L_0x0028:
            r8 = r1
            goto L_0x0043
        L_0x002a:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x0035
        L_0x0030:
            r0.c(r4, r2, r3)     // Catch:{ all -> 0x004a }
            r8 = r6
            goto L_0x0043
        L_0x0035:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004a }
            if (r5 != 0) goto L_0x003c
            goto L_0x0028
        L_0x003c:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x0035
            goto L_0x0030
        L_0x0043:
            if (r8 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            monitor-exit(r7)     // Catch:{ all -> 0x004a }
            return r6
        L_0x0048:
            monitor-exit(r7)     // Catch:{ all -> 0x004a }
            return r1
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.p.b.a(h.a.p.c):boolean");
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
        if (!this.f3081f) {
            synchronized (this) {
                if (!this.f3081f) {
                    c<c> cVar2 = this.e;
                    if (cVar2 == null) {
                        cVar2 = new c<>();
                        this.e = cVar2;
                    }
                    cVar2.a(cVar);
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
        r1 = r1.f3280d;
        r3 = r1.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r5 >= r3) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r6 = r1[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((r6 instanceof h.a.p.c) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        c.f.a.b.h(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r2.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if (r2.size() != 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        throw h.a.s.j.b.b((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        throw new h.a.q.a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    @Override // h.a.p.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e() {
        /*
            r8 = this;
            boolean r0 = r8.f3081f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r8)
            boolean r0 = r8.f3081f     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            return
        L_0x000c:
            r0 = 1
            r8.f3081f = r0     // Catch:{ all -> 0x0056 }
            h.a.s.j.c<h.a.p.c> r1 = r8.e     // Catch:{ all -> 0x0056 }
            r2 = 0
            r8.e = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0055
        L_0x0018:
            T[] r1 = r1.f3280d
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L_0x001d:
            if (r5 >= r3) goto L_0x003c
            r6 = r1[r5]
            boolean r7 = r6 instanceof h.a.p.c
            if (r7 == 0) goto L_0x0039
            h.a.p.c r6 = (h.a.p.c) r6     // Catch:{ all -> 0x002b }
            r6.e()     // Catch:{ all -> 0x002b }
            goto L_0x0039
        L_0x002b:
            r6 = move-exception
            c.f.a.b.h(r6)
            if (r2 != 0) goto L_0x0036
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0036:
            r2.add(r6)
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x001d
        L_0x003c:
            if (r2 == 0) goto L_0x0055
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004f
            java.lang.Object r0 = r2.get(r4)
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
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.p.b.e():void");
    }
}
