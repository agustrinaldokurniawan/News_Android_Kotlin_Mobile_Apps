package c.e.a.a.m;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public final class s implements Comparable<s>, Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();
    public final Calendar e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1254f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1255g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1256h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1257i;

    /* renamed from: j  reason: collision with root package name */
    public final long f1258j;

    /* renamed from: k  reason: collision with root package name */
    public String f1259k;

    public static class a implements Parcelable.Creator<s> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public s createFromParcel(Parcel parcel) {
            return s.k(parcel.readInt(), parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public s[] newArray(int i2) {
            return new s[i2];
        }
    }

    public s(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b = a0.b(calendar);
        this.e = b;
        this.f1254f = b.get(2);
        this.f1255g = b.get(1);
        this.f1256h = b.getMaximum(7);
        this.f1257i = b.getActualMaximum(5);
        this.f1258j = b.getTimeInMillis();
    }

    public static s k(int i2, int i3) {
        Calendar e2 = a0.e();
        e2.set(1, i2);
        e2.set(2, i3);
        return new s(e2);
    }

    public static s l(long j2) {
        Calendar e2 = a0.e();
        e2.setTimeInMillis(j2);
        return new s(e2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f1254f == sVar.f1254f && this.f1255g == sVar.f1255g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1254f), Integer.valueOf(this.f1255g)});
    }

    /* renamed from: j */
    public int compareTo(s sVar) {
        return this.e.compareTo(sVar.e);
    }

    public int m() {
        int firstDayOfWeek = this.e.get(7) - this.e.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f1256h : firstDayOfWeek;
    }

    public String n(Context context) {
        if (this.f1259k == null) {
            long timeInMillis = this.e.getTimeInMillis();
            this.f1259k = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.f1259k;
    }

    public s o(int i2) {
        Calendar b = a0.b(this.e);
        b.add(2, i2);
        return new s(b);
    }

    public int p(s sVar) {
        if (this.e instanceof GregorianCalendar) {
            return (sVar.f1254f - this.f1254f) + ((sVar.f1255g - this.f1255g) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1255g);
        parcel.writeInt(this.f1254f);
    }
}
