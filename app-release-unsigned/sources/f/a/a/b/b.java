package f.a.a.b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import f.a.a.b.a;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public a e;

    public class a implements Parcelable.Creator<b> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* renamed from: f.a.a.b.b$b  reason: collision with other inner class name */
    public class BinderC0060b extends a.AbstractBinderC0058a {
        public BinderC0060b() {
        }
    }

    public b(Parcel parcel) {
        a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i2 = a.AbstractBinderC0058a.a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new a.AbstractBinderC0058a.C0059a(readStrongBinder) : (a) queryLocalInterface;
        }
        this.e = aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void j(int i2, Bundle bundle) {
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.e == null) {
                this.e = new BinderC0060b();
            }
            parcel.writeStrongBinder(this.e.asBinder());
        }
    }
}
