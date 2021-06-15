package j;

import i.j;
import i.o.e;
import i.s.c.h;
import j.j;
import j.n0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

public final class m {
    public static final j[] a;
    public static final j[] b;

    /* renamed from: c  reason: collision with root package name */
    public static final m f3444c;

    /* renamed from: d  reason: collision with root package name */
    public static final m f3445d = new m(false, false, null, null);
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3446f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f3447g;

    /* renamed from: h  reason: collision with root package name */
    public final String[] f3448h;

    public static final class a {
        public boolean a;
        public String[] b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f3449c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3450d;

        public a(m mVar) {
            h.f(mVar, "connectionSpec");
            this.a = mVar.e;
            this.b = mVar.f3447g;
            this.f3449c = mVar.f3448h;
            this.f3450d = mVar.f3446f;
        }

        public a(boolean z) {
            this.a = z;
        }

        public final m a() {
            return new m(this.a, this.f3450d, this.b, this.f3449c);
        }

        public final a b(String... strArr) {
            h.f(strArr, "cipherSuites");
            if (this.a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.b = (String[]) clone;
                        return this;
                    }
                    throw new j("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(j... jVarArr) {
            h.f(jVarArr, "cipherSuites");
            if (this.a) {
                ArrayList arrayList = new ArrayList(jVarArr.length);
                for (j jVar : jVarArr) {
                    arrayList.add(jVar.t);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    b((String[]) Arrays.copyOf(strArr, strArr.length));
                    return this;
                }
                throw new j("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a d(boolean z) {
            if (this.a) {
                this.f3450d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(String... strArr) {
            h.f(strArr, "tlsVersions");
            if (this.a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f3449c = (String[]) clone;
                        return this;
                    }
                    throw new j("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(m0... m0VarArr) {
            h.f(m0VarArr, "tlsVersions");
            if (this.a) {
                ArrayList arrayList = new ArrayList(m0VarArr.length);
                for (m0 m0Var : m0VarArr) {
                    arrayList.add(m0Var.f3457l);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    e((String[]) Arrays.copyOf(strArr, strArr.length));
                    return this;
                }
                throw new j("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }

    static {
        j jVar = j.p;
        j jVar2 = j.q;
        j jVar3 = j.r;
        j jVar4 = j.f3432j;
        j jVar5 = j.f3434l;
        j jVar6 = j.f3433k;
        j jVar7 = j.f3435m;
        j jVar8 = j.o;
        j jVar9 = j.n;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9};
        a = jVarArr;
        j[] jVarArr2 = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, j.f3430h, j.f3431i, j.f3428f, j.f3429g, j.f3427d, j.e, j.f3426c};
        b = jVarArr2;
        a aVar = new a(true);
        aVar.c((j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        m0 m0Var = m0.TLS_1_3;
        m0 m0Var2 = m0.TLS_1_2;
        aVar.f(m0Var, m0Var2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c((j[]) Arrays.copyOf(jVarArr2, jVarArr2.length));
        aVar2.f(m0Var, m0Var2);
        aVar2.d(true);
        f3444c = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c((j[]) Arrays.copyOf(jVarArr2, jVarArr2.length));
        aVar3.f(m0Var, m0Var2, m0.TLS_1_1, m0.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
    }

    public m(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.e = z;
        this.f3446f = z2;
        this.f3447g = strArr;
        this.f3448h = strArr2;
    }

    public final List<j> a() {
        String[] strArr = this.f3447g;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(j.s.b(str));
        }
        return e.o(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        h.f(sSLSocket, "socket");
        if (!this.e) {
            return false;
        }
        String[] strArr = this.f3448h;
        if (strArr != null && !c.i(strArr, sSLSocket.getEnabledProtocols(), i.p.a.a)) {
            return false;
        }
        String[] strArr2 = this.f3447g;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        j.b bVar = j.s;
        Comparator<String> comparator = j.a;
        if (!c.i(strArr2, enabledCipherSuites, j.a)) {
            return false;
        }
        return true;
    }

    public final List<m0> c() {
        String[] strArr = this.f3448h;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m0.f3456k.a(str));
        }
        return e.o(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.e;
        m mVar = (m) obj;
        if (z != mVar.e) {
            return false;
        }
        return !z || (Arrays.equals(this.f3447g, mVar.f3447g) && Arrays.equals(this.f3448h, mVar.f3448h) && this.f3446f == mVar.f3446f);
    }

    public int hashCode() {
        if (!this.e) {
            return 17;
        }
        String[] strArr = this.f3447g;
        int i2 = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f3448h;
        if (strArr2 != null) {
            i2 = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i2) * 31) + (!this.f3446f ? 1 : 0);
    }

    public String toString() {
        if (!this.e) {
            return "ConnectionSpec()";
        }
        StringBuilder h2 = c.c.a.a.a.h("ConnectionSpec(", "cipherSuites=");
        h2.append(Objects.toString(a(), "[all enabled]"));
        h2.append(", ");
        h2.append("tlsVersions=");
        h2.append(Objects.toString(c(), "[all enabled]"));
        h2.append(", ");
        h2.append("supportsTlsExtensions=");
        h2.append(this.f3446f);
        h2.append(')');
        return h2.toString();
    }
}
