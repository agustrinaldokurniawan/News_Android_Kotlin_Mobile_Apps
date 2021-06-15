package i.s.c;

import i.v.c;
import java.io.Serializable;
import java.util.Objects;

public abstract class b implements i.v.a, Serializable {
    public transient i.v.a e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3310f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f3311g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3312h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3313i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3314j;

    public static class a implements Serializable {
        public static final a e = new a();
    }

    public b() {
        this.f3310f = a.e;
        this.f3311g = null;
        this.f3312h = null;
        this.f3313i = null;
        this.f3314j = false;
    }

    public b(Object obj, Class cls, String str, String str2, boolean z) {
        this.f3310f = obj;
        this.f3311g = cls;
        this.f3312h = str;
        this.f3313i = str2;
        this.f3314j = z;
    }

    public i.v.a b() {
        i.v.a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        i.v.a e2 = e();
        this.e = e2;
        return e2;
    }

    public abstract i.v.a e();

    public c f() {
        Class cls = this.f3311g;
        if (cls == null) {
            return null;
        }
        if (!this.f3314j) {
            return p.a(cls);
        }
        Objects.requireNonNull(p.a);
        return new j(cls, "");
    }
}
