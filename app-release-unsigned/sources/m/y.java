package m;

import i.s.c.h;
import j.a0;
import j.b0;
import j.e0;
import j.h0;
import j.u;
import j.x;
import j.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import k.g;

public final class y {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern b = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: c  reason: collision with root package name */
    public final String f3869c;

    /* renamed from: d  reason: collision with root package name */
    public final j.y f3870d;
    @Nullable
    public String e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public y.a f3871f;

    /* renamed from: g  reason: collision with root package name */
    public final e0.a f3872g = new e0.a();

    /* renamed from: h  reason: collision with root package name */
    public final x.a f3873h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public a0 f3874i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3875j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public b0.a f3876k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public u.a f3877l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public h0 f3878m;

    public static class a extends h0 {
        public final h0 b;

        /* renamed from: c  reason: collision with root package name */
        public final a0 f3879c;

        public a(h0 h0Var, a0 a0Var) {
            this.b = h0Var;
            this.f3879c = a0Var;
        }

        @Override // j.h0
        public long a() {
            return this.b.a();
        }

        @Override // j.h0
        public a0 b() {
            return this.f3879c;
        }

        @Override // j.h0
        public void c(g gVar) {
            this.b.c(gVar);
        }
    }

    public y(String str, j.y yVar, @Nullable String str2, @Nullable x xVar, @Nullable a0 a0Var, boolean z, boolean z2, boolean z3) {
        this.f3869c = str;
        this.f3870d = yVar;
        this.e = str2;
        this.f3874i = a0Var;
        this.f3875j = z;
        this.f3873h = xVar != null ? xVar.c() : new x.a();
        if (z2) {
            this.f3877l = new u.a();
        } else if (z3) {
            b0.a aVar = new b0.a();
            this.f3876k = aVar;
            a0 a0Var2 = b0.f3360c;
            h.f(a0Var2, "type");
            if (h.a(a0Var2.e, "multipart")) {
                aVar.b = a0Var2;
                return;
            }
            throw new IllegalArgumentException(("multipart != " + a0Var2).toString());
        }
    }

    public void a(String str, String str2, boolean z) {
        u.a aVar = this.f3877l;
        if (z) {
            Objects.requireNonNull(aVar);
            h.f(str, "name");
            h.f(str2, "value");
            List<String> list = aVar.a;
            y.b bVar = j.y.b;
            list.add(y.b.a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f3707c, 83));
            aVar.b.add(y.b.a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f3707c, 83));
            return;
        }
        Objects.requireNonNull(aVar);
        h.f(str, "name");
        h.f(str2, "value");
        List<String> list2 = aVar.a;
        y.b bVar2 = j.y.b;
        list2.add(y.b.a(bVar2, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f3707c, 91));
        aVar.b.add(y.b.a(bVar2, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f3707c, 91));
    }

    public void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                a0.a aVar = a0.f3357c;
                this.f3874i = a0.a.a(str2);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(c.c.a.a.a.q("Malformed content type: ", str2), e2);
            }
        } else {
            this.f3873h.a(str, str2);
        }
    }

    public void c(x xVar, h0 h0Var) {
        b0.a aVar = this.f3876k;
        Objects.requireNonNull(aVar);
        h.f(h0Var, "body");
        h.f(h0Var, "body");
        boolean z = true;
        if ((xVar != null ? xVar.a("Content-Type") : null) == null) {
            if ((xVar != null ? xVar.a("Content-Length") : null) != null) {
                z = false;
            }
            if (z) {
                b0.b bVar = new b0.b(xVar, h0Var, null);
                h.f(bVar, "part");
                aVar.f3368c.add(bVar);
                return;
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
    }

    public void d(String str, @Nullable String str2, boolean z) {
        String str3 = this.e;
        String str4 = null;
        if (str3 != null) {
            y.a f2 = this.f3870d.f(str3);
            this.f3871f = f2;
            if (f2 != null) {
                this.e = null;
            } else {
                StringBuilder f3 = c.c.a.a.a.f("Malformed URL. Base: ");
                f3.append(this.f3870d);
                f3.append(", Relative: ");
                f3.append(this.e);
                throw new IllegalArgumentException(f3.toString());
            }
        }
        y.a aVar = this.f3871f;
        if (z) {
            Objects.requireNonNull(aVar);
            h.f(str, "encodedName");
            if (aVar.f3726h == null) {
                aVar.f3726h = new ArrayList();
            }
            List<String> list = aVar.f3726h;
            if (list != null) {
                y.b bVar = j.y.b;
                list.add(y.b.a(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
                List<String> list2 = aVar.f3726h;
                if (list2 != null) {
                    if (str2 != null) {
                        str4 = y.b.a(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211);
                    }
                    list2.add(str4);
                    return;
                }
                h.j();
                throw null;
            }
            h.j();
            throw null;
        }
        Objects.requireNonNull(aVar);
        h.f(str, "name");
        if (aVar.f3726h == null) {
            aVar.f3726h = new ArrayList();
        }
        List<String> list3 = aVar.f3726h;
        if (list3 != null) {
            y.b bVar2 = j.y.b;
            list3.add(y.b.a(bVar2, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
            List<String> list4 = aVar.f3726h;
            if (list4 != null) {
                if (str2 != null) {
                    str4 = y.b.a(bVar2, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219);
                }
                list4.add(str4);
                return;
            }
            h.j();
            throw null;
        }
        h.j();
        throw null;
    }
}
