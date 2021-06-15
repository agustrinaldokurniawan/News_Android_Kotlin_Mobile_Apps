package c.a.a.b.b.o.b.e;

import c.e.b.z.b;
import i.s.c.h;

public final class a {
    @b("publishedAt")
    public final String a;
    @b("author")
    public final String b;
    @b("urlToImage")

    /* renamed from: c  reason: collision with root package name */
    public final String f364c;
    @b("description")

    /* renamed from: d  reason: collision with root package name */
    public final String f365d;
    @b("source")
    public final String e;
    @b("title")

    /* renamed from: f  reason: collision with root package name */
    public final String f366f;
    @b("url")

    /* renamed from: g  reason: collision with root package name */
    public final String f367g;
    @b("content")

    /* renamed from: h  reason: collision with root package name */
    public final String f368h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.f364c, aVar.f364c) && h.a(this.f365d, aVar.f365d) && h.a(this.e, aVar.e) && h.a(this.f366f, aVar.f366f) && h.a(this.f367g, aVar.f367g) && h.a(this.f368h, aVar.f368h);
    }

    public int hashCode() {
        return this.f368h.hashCode() + c.c.a.a.a.b(this.f367g, c.c.a.a.a.b(this.f366f, c.c.a.a.a.b(this.e, c.c.a.a.a.b(this.f365d, c.c.a.a.a.b(this.f364c, c.c.a.a.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("NewsResponse(publishedAt=");
        f2.append(this.a);
        f2.append(", author=");
        f2.append(this.b);
        f2.append(", urlToImage=");
        f2.append(this.f364c);
        f2.append(", description=");
        f2.append(this.f365d);
        f2.append(", source=");
        f2.append(this.e);
        f2.append(", title=");
        f2.append(this.f366f);
        f2.append(", url=");
        f2.append(this.f367g);
        f2.append(", content=");
        f2.append(this.f368h);
        f2.append(')');
        return f2.toString();
    }
}
