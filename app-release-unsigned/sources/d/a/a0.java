package d.a;

import d.a.a.b;
import i.o.e;

public abstract class a0 extends s {

    /* renamed from: f  reason: collision with root package name */
    public long f1771f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1772g;

    /* renamed from: h  reason: collision with root package name */
    public b<w<?>> f1773h;

    public final void f0(boolean z) {
        long g0 = this.f1771f - g0(z);
        this.f1771f = g0;
        if (g0 <= 0 && this.f1772g) {
            shutdown();
        }
    }

    public final long g0(boolean z) {
        return z ? 4294967296L : 1;
    }

    public final void h0(w<?> wVar) {
        b<w<?>> bVar = this.f1773h;
        if (bVar == null) {
            bVar = new b<>();
            this.f1773h = bVar;
        }
        Object[] objArr = bVar.a;
        int i2 = bVar.f1755c;
        objArr[i2] = wVar;
        int length = (objArr.length - 1) & (i2 + 1);
        bVar.f1755c = length;
        int i3 = bVar.b;
        if (length == i3) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            e.d(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = bVar.a;
            int length3 = objArr3.length;
            int i4 = bVar.b;
            e.d(objArr3, objArr2, length3 - i4, 0, i4, 4);
            bVar.a = objArr2;
            bVar.b = 0;
            bVar.f1755c = length2;
        }
    }

    public final void i0(boolean z) {
        this.f1771f = g0(z) + this.f1771f;
        if (!z) {
            this.f1772g = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j0() {
        /*
            r7 = this;
            d.a.a.b<d.a.w<?>> r0 = r7.f1773h
            r1 = 0
            if (r0 == 0) goto L_0x0029
            int r2 = r0.b
            int r3 = r0.f1755c
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000e
            goto L_0x0021
        L_0x000e:
            java.lang.Object[] r3 = r0.a
            r6 = r3[r2]
            r3[r2] = r4
            int r2 = r2 + r5
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.b = r2
            java.lang.String r0 = "null cannot be cast to non-null type T"
            java.util.Objects.requireNonNull(r6, r0)
            r4 = r6
        L_0x0021:
            d.a.w r4 = (d.a.w) r4
            if (r4 == 0) goto L_0x0029
            r4.run()
            return r5
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.j0():boolean");
    }

    public void shutdown() {
    }
}
