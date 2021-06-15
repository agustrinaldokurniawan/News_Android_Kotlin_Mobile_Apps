package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f13f;

    /* renamed from: g  reason: collision with root package name */
    public int f14g;

    /* renamed from: h  reason: collision with root package name */
    public int f15h;

    /* renamed from: i  reason: collision with root package name */
    public int f16i;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.e = parcel.readInt();
        this.f14g = parcel.readInt();
        this.f15h = parcel.readInt();
        this.f16i = parcel.readInt();
        this.f13f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.f14g);
        parcel.writeInt(this.f15h);
        parcel.writeInt(this.f16i);
        parcel.writeInt(this.f13f);
    }
}
