package c.a.a.b.d.a;

import android.os.Parcel;
import android.os.Parcelable;
import c.e.b.z.b;
import i.s.c.h;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0006a();
    @b("publishedAt")
    public final String e;
    @b("author")

    /* renamed from: f  reason: collision with root package name */
    public final String f371f;
    @b("urlToImage")

    /* renamed from: g  reason: collision with root package name */
    public final String f372g;
    @b("description")

    /* renamed from: h  reason: collision with root package name */
    public final String f373h;
    @b("source")

    /* renamed from: i  reason: collision with root package name */
    public final String f374i;
    @b("title")

    /* renamed from: j  reason: collision with root package name */
    public final String f375j;
    @b("url")

    /* renamed from: k  reason: collision with root package name */
    public final String f376k;
    @b("content")

    /* renamed from: l  reason: collision with root package name */
    public final String f377l;
    @b("isBookmark")

    /* renamed from: m  reason: collision with root package name */
    public final boolean f378m;

    /* renamed from: c.a.a.b.d.a.a$a  reason: collision with other inner class name */
    public static final class C0006a implements Parcelable.Creator<a> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            h.e(parcel, "parcel");
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        h.e(str, "publishedAt");
        h.e(str2, "author");
        h.e(str3, "urlToImage");
        h.e(str4, "description");
        h.e(str5, "source");
        h.e(str6, "title");
        h.e(str7, "url");
        h.e(str8, "content");
        this.e = str;
        this.f371f = str2;
        this.f372g = str3;
        this.f373h = str4;
        this.f374i = str5;
        this.f375j = str6;
        this.f376k = str7;
        this.f377l = str8;
        this.f378m = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.e, aVar.e) && h.a(this.f371f, aVar.f371f) && h.a(this.f372g, aVar.f372g) && h.a(this.f373h, aVar.f373h) && h.a(this.f374i, aVar.f374i) && h.a(this.f375j, aVar.f375j) && h.a(this.f376k, aVar.f376k) && h.a(this.f377l, aVar.f377l) && this.f378m == aVar.f378m;
    }

    public int hashCode() {
        int b = c.c.a.a.a.b(this.f377l, c.c.a.a.a.b(this.f376k, c.c.a.a.a.b(this.f375j, c.c.a.a.a.b(this.f374i, c.c.a.a.a.b(this.f373h, c.c.a.a.a.b(this.f372g, c.c.a.a.a.b(this.f371f, this.e.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        boolean z = this.f378m;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return b + i2;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("News(publishedAt=");
        f2.append(this.e);
        f2.append(", author=");
        f2.append(this.f371f);
        f2.append(", urlToImage=");
        f2.append(this.f372g);
        f2.append(", description=");
        f2.append(this.f373h);
        f2.append(", source=");
        f2.append(this.f374i);
        f2.append(", title=");
        f2.append(this.f375j);
        f2.append(", url=");
        f2.append(this.f376k);
        f2.append(", content=");
        f2.append(this.f377l);
        f2.append(", isBookmark=");
        f2.append(this.f378m);
        f2.append(')');
        return f2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        h.e(parcel, "out");
        parcel.writeString(this.e);
        parcel.writeString(this.f371f);
        parcel.writeString(this.f372g);
        parcel.writeString(this.f373h);
        parcel.writeString(this.f374i);
        parcel.writeString(this.f375j);
        parcel.writeString(this.f376k);
        parcel.writeString(this.f377l);
        parcel.writeInt(this.f378m ? 1 : 0);
    }
}
