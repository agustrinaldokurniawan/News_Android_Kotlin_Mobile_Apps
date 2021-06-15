package g.a.e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0061a();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final Intent f1844f;

    /* renamed from: g.a.e.a$a  reason: collision with other inner class name */
    public class C0061a implements Parcelable.Creator<a> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(int i2, Intent intent) {
        this.e = i2;
        this.f1844f = intent;
    }

    public a(Parcel parcel) {
        this.e = parcel.readInt();
        this.f1844f = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("ActivityResult{resultCode=");
        int i2 = this.e;
        f2.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        f2.append(", data=");
        f2.append(this.f1844f);
        f2.append('}');
        return f2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.f1844f == null ? 0 : 1);
        Intent intent = this.f1844f;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
