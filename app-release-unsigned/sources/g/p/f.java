package g.p;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public final UUID e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2833f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f2834g;

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f2835h;

    public class a implements Parcelable.Creator<f> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    public f(Parcel parcel) {
        this.e = UUID.fromString(parcel.readString());
        this.f2833f = parcel.readInt();
        this.f2834g = parcel.readBundle(f.class.getClassLoader());
        this.f2835h = parcel.readBundle(f.class.getClassLoader());
    }

    public f(e eVar) {
        this.e = eVar.f2829i;
        this.f2833f = eVar.e.f2847g;
        this.f2834g = eVar.f2826f;
        Bundle bundle = new Bundle();
        this.f2835h = bundle;
        eVar.f2828h.b(bundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.e.toString());
        parcel.writeInt(this.f2833f);
        parcel.writeBundle(this.f2834g);
        parcel.writeBundle(this.f2835h);
    }
}
