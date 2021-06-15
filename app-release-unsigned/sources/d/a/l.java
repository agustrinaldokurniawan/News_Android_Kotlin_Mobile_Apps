package d.a;

import c.c.a.a.a;
import i.m;
import i.s.c.h;
import java.util.Objects;

public final class l {
    public final Object a;
    public final d b;

    /* renamed from: c  reason: collision with root package name */
    public final i.s.b.l<Throwable, m> f1825c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1826d;
    public final Throwable e;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: i.s.b.l<? super java.lang.Throwable, i.m> */
    /* JADX WARN: Multi-variable type inference failed */
    public l(Object obj, d dVar, i.s.b.l<? super Throwable, m> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = dVar;
        this.f1825c = lVar;
        this.f1826d = obj2;
        this.e = th;
    }

    public l(Object obj, d dVar, i.s.b.l lVar, Object obj2, Throwable th, int i2) {
        dVar = (i2 & 2) != 0 ? null : dVar;
        lVar = (i2 & 4) != 0 ? null : lVar;
        obj2 = (i2 & 8) != 0 ? null : obj2;
        th = (i2 & 16) != 0 ? null : th;
        this.a = obj;
        this.b = dVar;
        this.f1825c = lVar;
        this.f1826d = obj2;
        this.e = th;
    }

    public static l a(l lVar, Object obj, d dVar, i.s.b.l lVar2, Object obj2, Throwable th, int i2) {
        Object obj3 = null;
        Object obj4 = (i2 & 1) != 0 ? lVar.a : null;
        if ((i2 & 2) != 0) {
            dVar = lVar.b;
        }
        i.s.b.l<Throwable, m> lVar3 = (i2 & 4) != 0 ? lVar.f1825c : null;
        if ((i2 & 8) != 0) {
            obj3 = lVar.f1826d;
        }
        if ((i2 & 16) != 0) {
            th = lVar.e;
        }
        Objects.requireNonNull(lVar);
        return new l(obj4, dVar, lVar3, obj3, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.a(this.a, lVar.a) && h.a(this.b, lVar.b) && h.a(this.f1825c, lVar.f1825c) && h.a(this.f1826d, lVar.f1826d) && h.a(this.e, lVar.e);
    }

    public int hashCode() {
        Object obj = this.a;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        d dVar = this.b;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        i.s.b.l<Throwable, m> lVar = this.f1825c;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        Object obj2 = this.f1826d;
        int hashCode4 = (hashCode3 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Throwable th = this.e;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder f2 = a.f("CompletedContinuation(result=");
        f2.append(this.a);
        f2.append(", cancelHandler=");
        f2.append(this.b);
        f2.append(", onCancellation=");
        f2.append(this.f1825c);
        f2.append(", idempotentResume=");
        f2.append(this.f1826d);
        f2.append(", cancelCause=");
        f2.append(this.e);
        f2.append(")");
        return f2.toString();
    }
}
