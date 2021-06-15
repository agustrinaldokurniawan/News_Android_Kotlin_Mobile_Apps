package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10f;

    public static class a implements Parcelable.Creator<RatingCompat> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i2) {
            return new RatingCompat[i2];
        }
    }

    public RatingCompat(int i2, float f2) {
        this.e = i2;
        this.f10f = f2;
    }

    public int describeContents() {
        return this.e;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Rating:style=");
        f2.append(this.e);
        f2.append(" rating=");
        float f3 = this.f10f;
        f2.append(f3 < 0.0f ? "unrated" : String.valueOf(f3));
        return f2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f10f);
    }
}
