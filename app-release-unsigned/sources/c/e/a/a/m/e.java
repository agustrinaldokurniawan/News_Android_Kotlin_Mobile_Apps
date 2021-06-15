package c.e.a.a.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.e.a.a.m.a;
import java.util.Arrays;

public class e implements a.c {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public final long e;

    public static class a implements Parcelable.Creator<e> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel.readLong(), null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i2) {
            return new e[i2];
        }
    }

    public e(long j2) {
        this.e = j2;
    }

    public e(long j2, a aVar) {
        this.e = j2;
    }

    public int describeContents() {
        return 0;
    }

    @Override // c.e.a.a.m.a.c
    public boolean e(long j2) {
        return j2 >= this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.e == ((e) obj).e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.e)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.e);
    }
}
