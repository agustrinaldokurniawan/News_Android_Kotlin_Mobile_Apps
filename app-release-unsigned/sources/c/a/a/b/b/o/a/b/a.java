package c.a.a.b.b.o.a.b;

import i.s.c.h;

public final class a {
    public String a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final String f352c;

    /* renamed from: d  reason: collision with root package name */
    public final String f353d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f354f;

    /* renamed from: g  reason: collision with root package name */
    public final String f355g;

    /* renamed from: h  reason: collision with root package name */
    public final String f356h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f357i;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        h.e(str, "publishedAt");
        h.e(str2, "author");
        h.e(str3, "urlToImage");
        h.e(str4, "description");
        h.e(str5, "source");
        h.e(str6, "title");
        h.e(str7, "url");
        h.e(str8, "content");
        this.a = str;
        this.b = str2;
        this.f352c = str3;
        this.f353d = str4;
        this.e = str5;
        this.f354f = str6;
        this.f355g = str7;
        this.f356h = str8;
        this.f357i = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.f352c, aVar.f352c) && h.a(this.f353d, aVar.f353d) && h.a(this.e, aVar.e) && h.a(this.f354f, aVar.f354f) && h.a(this.f355g, aVar.f355g) && h.a(this.f356h, aVar.f356h) && this.f357i == aVar.f357i;
    }

    public int hashCode() {
        int b2 = c.c.a.a.a.b(this.f356h, c.c.a.a.a.b(this.f355g, c.c.a.a.a.b(this.f354f, c.c.a.a.a.b(this.e, c.c.a.a.a.b(this.f353d, c.c.a.a.a.b(this.f352c, c.c.a.a.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        boolean z = this.f357i;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return b2 + i2;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("NewsEntity(publishedAt=");
        f2.append(this.a);
        f2.append(", author=");
        f2.append(this.b);
        f2.append(", urlToImage=");
        f2.append(this.f352c);
        f2.append(", description=");
        f2.append(this.f353d);
        f2.append(", source=");
        f2.append(this.e);
        f2.append(", title=");
        f2.append(this.f354f);
        f2.append(", url=");
        f2.append(this.f355g);
        f2.append(", content=");
        f2.append(this.f356h);
        f2.append(", isBookmark=");
        f2.append(this.f357i);
        f2.append(')');
        return f2.toString();
    }
}
