package c.d.a.n;

import android.content.Context;
import c.d.a.b;
import c.d.a.i;
import g.l.b.b0;
import g.l.b.m;
import java.util.HashSet;
import java.util.Set;

public class s extends m {
    public final a X;
    public final q Y = new a();
    public final Set<s> Z = new HashSet();
    public s a0;
    public i b0;
    public m c0;

    public class a implements q {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + s.this + "}";
        }
    }

    public s() {
        a aVar = new a();
        this.X = aVar;
    }

    public final m B0() {
        m mVar = this.z;
        return mVar != null ? mVar : this.c0;
    }

    public final void C0(Context context, b0 b0Var) {
        D0();
        s i2 = b.b(context).f728l.i(b0Var, null);
        this.a0 = i2;
        if (!equals(i2)) {
            this.a0.Z.add(this);
        }
    }

    public final void D0() {
        s sVar = this.a0;
        if (sVar != null) {
            sVar.Z.remove(this);
            this.a0 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [g.l.b.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // g.l.b.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L(android.content.Context r4) {
        /*
            r3 = this;
            super.L(r4)
            r4 = r3
        L_0x0004:
            g.l.b.m r0 = r4.z
            if (r0 == 0) goto L_0x000a
            r4 = r0
            goto L_0x0004
        L_0x000a:
            g.l.b.b0 r4 = r4.w
            r0 = 5
            java.lang.String r1 = "SupportRMFragment"
            if (r4 != 0) goto L_0x001d
            boolean r4 = android.util.Log.isLoggable(r1, r0)
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "Unable to register fragment with root, ancestor detached"
            android.util.Log.w(r1, r4)
        L_0x001c:
            return
        L_0x001d:
            android.content.Context r2 = r3.k()     // Catch:{ IllegalStateException -> 0x0025 }
            r3.C0(r2, r4)     // Catch:{ IllegalStateException -> 0x0025 }
            goto L_0x0031
        L_0x0025:
            r4 = move-exception
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "Unable to register fragment with root"
            android.util.Log.w(r1, r0, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.n.s.L(android.content.Context):void");
    }

    @Override // g.l.b.m
    public void S() {
        this.H = true;
        this.X.c();
        D0();
    }

    @Override // g.l.b.m
    public void U() {
        this.H = true;
        this.c0 = null;
        D0();
    }

    @Override // g.l.b.m
    public void e0() {
        this.H = true;
        this.X.d();
    }

    @Override // g.l.b.m
    public void f0() {
        this.H = true;
        this.X.e();
    }

    @Override // g.l.b.m
    public String toString() {
        return super.toString() + "{parent=" + B0() + "}";
    }
}
