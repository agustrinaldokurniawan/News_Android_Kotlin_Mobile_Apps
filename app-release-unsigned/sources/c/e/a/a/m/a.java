package c.e.a.a.m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0039a();
    public final s e;

    /* renamed from: f  reason: collision with root package name */
    public final s f1227f;

    /* renamed from: g  reason: collision with root package name */
    public final c f1228g;

    /* renamed from: h  reason: collision with root package name */
    public s f1229h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1230i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1231j;

    /* renamed from: c.e.a.a.m.a$a  reason: collision with other inner class name */
    public static class C0039a implements Parcelable.Creator<a> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a((s) parcel.readParcelable(s.class.getClassLoader()), (s) parcel.readParcelable(s.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (s) parcel.readParcelable(s.class.getClassLoader()), null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public static final class b {
        public static final long a = a0.a(s.k(1900, 0).f1258j);
        public static final long b = a0.a(s.k(2100, 11).f1258j);

        /* renamed from: c  reason: collision with root package name */
        public long f1232c = a;

        /* renamed from: d  reason: collision with root package name */
        public long f1233d = b;
        public Long e;

        /* renamed from: f  reason: collision with root package name */
        public c f1234f = new e(Long.MIN_VALUE);

        public b(a aVar) {
            this.f1232c = aVar.e.f1258j;
            this.f1233d = aVar.f1227f.f1258j;
            this.e = Long.valueOf(aVar.f1229h.f1258j);
            this.f1234f = aVar.f1228g;
        }
    }

    public interface c extends Parcelable {
        boolean e(long j2);
    }

    public a(s sVar, s sVar2, c cVar, s sVar3, C0039a aVar) {
        this.e = sVar;
        this.f1227f = sVar2;
        this.f1229h = sVar3;
        this.f1228g = cVar;
        if (sVar3 != null && sVar.e.compareTo(sVar3.e) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (sVar3 == null || sVar3.e.compareTo(sVar2.e) <= 0) {
            this.f1231j = sVar.p(sVar2) + 1;
            this.f1230i = (sVar2.f1255g - sVar.f1255g) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
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
        return this.e.equals(aVar.e) && this.f1227f.equals(aVar.f1227f) && Objects.equals(this.f1229h, aVar.f1229h) && this.f1228g.equals(aVar.f1228g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f1227f, this.f1229h, this.f1228g});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f1227f, 0);
        parcel.writeParcelable(this.f1229h, 0);
        parcel.writeParcelable(this.f1228g, 0);
    }
}
