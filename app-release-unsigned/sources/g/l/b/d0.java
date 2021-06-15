package g.l.b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g.l.b.b0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();
    public ArrayList<g0> e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f2665f;

    /* renamed from: g  reason: collision with root package name */
    public b[] f2666g;

    /* renamed from: h  reason: collision with root package name */
    public int f2667h;

    /* renamed from: i  reason: collision with root package name */
    public String f2668i = null;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<String> f2669j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<Bundle> f2670k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<b0.k> f2671l;

    public class a implements Parcelable.Creator<d0> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public d0 createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public d0[] newArray(int i2) {
            return new d0[i2];
        }
    }

    public d0() {
    }

    public d0(Parcel parcel) {
        this.e = parcel.createTypedArrayList(g0.CREATOR);
        this.f2665f = parcel.createStringArrayList();
        this.f2666g = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2667h = parcel.readInt();
        this.f2668i = parcel.readString();
        this.f2669j = parcel.createStringArrayList();
        this.f2670k = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2671l = parcel.createTypedArrayList(b0.k.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.e);
        parcel.writeStringList(this.f2665f);
        parcel.writeTypedArray(this.f2666g, i2);
        parcel.writeInt(this.f2667h);
        parcel.writeString(this.f2668i);
        parcel.writeStringList(this.f2669j);
        parcel.writeTypedList(this.f2670k);
        parcel.writeTypedList(this.f2671l);
    }
}
