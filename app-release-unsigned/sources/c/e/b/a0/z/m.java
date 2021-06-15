package c.e.b.a0.z;

import c.e.b.c0.c;
import c.e.b.i;
import c.e.b.l;
import c.e.b.t;
import c.e.b.u;
import c.e.b.x;
import c.e.b.y;

public final class m<T> extends x<T> {
    public final u<T> a;
    public final c.e.b.m<T> b;

    /* renamed from: c  reason: collision with root package name */
    public final i f1486c;

    /* renamed from: d  reason: collision with root package name */
    public final c.e.b.b0.a<T> f1487d;
    public final m<T>.b e = new b(this, null);

    /* renamed from: f  reason: collision with root package name */
    public x<T> f1488f;

    public final class b implements t, l {
        public b(m mVar, a aVar) {
        }
    }

    public m(u<T> uVar, c.e.b.m<T> mVar, i iVar, c.e.b.b0.a<T> aVar, y yVar) {
        this.a = uVar;
        this.b = mVar;
        this.f1486c = iVar;
        this.f1487d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        throw new c.e.b.v(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        throw new c.e.b.o(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        throw new c.e.b.v(r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028 A[ExcHandler: NumberFormatException (r4v8 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:7:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[ExcHandler: IOException (r4v7 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036 A[ExcHandler: d (r4v6 'e' c.e.b.c0.d A[CUSTOM_DECLARE]), Splitter:B:7:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b  */
    @Override // c.e.b.x
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T a(c.e.b.c0.a r4) {
        /*
            r3 = this;
            c.e.b.m<T> r0 = r3.b
            r1 = 0
            if (r0 != 0) goto L_0x0019
            c.e.b.x<T> r0 = r3.f1488f
            if (r0 == 0) goto L_0x000a
            goto L_0x0014
        L_0x000a:
            c.e.b.i r0 = r3.f1486c
            c.e.b.b0.a<T> r2 = r3.f1487d
            c.e.b.x r0 = r0.c(r1, r2)
            r3.f1488f = r0
        L_0x0014:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L_0x0019:
            r4.p0()     // Catch:{ EOFException -> 0x003d, d -> 0x0036, IOException -> 0x002f, NumberFormatException -> 0x0028 }
            r0 = 0
            c.e.b.x<c.e.b.n> r2 = c.e.b.a0.z.o.X     // Catch:{ EOFException -> 0x0026, d -> 0x0036, IOException -> 0x002f, NumberFormatException -> 0x0028 }
            java.lang.Object r4 = r2.a(r4)     // Catch:{ EOFException -> 0x0026, d -> 0x0036, IOException -> 0x002f, NumberFormatException -> 0x0028 }
            c.e.b.n r4 = (c.e.b.n) r4     // Catch:{ EOFException -> 0x0026, d -> 0x0036, IOException -> 0x002f, NumberFormatException -> 0x0028 }
            goto L_0x0043
        L_0x0026:
            r4 = move-exception
            goto L_0x003f
        L_0x0028:
            r4 = move-exception
            c.e.b.v r0 = new c.e.b.v
            r0.<init>(r4)
            throw r0
        L_0x002f:
            r4 = move-exception
            c.e.b.o r0 = new c.e.b.o
            r0.<init>(r4)
            throw r0
        L_0x0036:
            r4 = move-exception
            c.e.b.v r0 = new c.e.b.v
            r0.<init>(r4)
            throw r0
        L_0x003d:
            r4 = move-exception
            r0 = 1
        L_0x003f:
            if (r0 == 0) goto L_0x0058
            c.e.b.p r4 = c.e.b.p.a
        L_0x0043:
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r4 instanceof c.e.b.p
            if (r0 == 0) goto L_0x004b
            return r1
        L_0x004b:
            c.e.b.m<T> r0 = r3.b
            c.e.b.b0.a<T> r1 = r3.f1487d
            java.lang.reflect.Type r1 = r1.b
            c.e.b.a0.z.m<T>$b r2 = r3.e
            java.lang.Object r4 = r0.a(r4, r1, r2)
            return r4
        L_0x0058:
            c.e.b.v r0 = new c.e.b.v
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.b.a0.z.m.a(c.e.b.c0.a):java.lang.Object");
    }

    @Override // c.e.b.x
    public void b(c cVar, T t) {
        u<T> uVar = this.a;
        if (uVar == null) {
            x<T> xVar = this.f1488f;
            if (xVar == null) {
                xVar = this.f1486c.c(null, this.f1487d);
                this.f1488f = xVar;
            }
            xVar.b(cVar, t);
        } else if (t == null) {
            cVar.b0();
        } else {
            o.X.b(cVar, uVar.a(t, this.f1487d.b, this.e));
        }
    }
}
