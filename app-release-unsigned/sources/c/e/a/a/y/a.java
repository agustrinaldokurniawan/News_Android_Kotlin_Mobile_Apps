package c.e.a.a.y;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g.e.h;

public class a extends g.j.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0042a();

    /* renamed from: g  reason: collision with root package name */
    public final h<String, Bundle> f1406g;

    /* renamed from: c.e.a.a.y.a$a  reason: collision with other inner class name */
    public static class C0042a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i2) {
            return new a[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader, C0042a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f1406g = new h<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f1406g.put(strArr[i2], bundleArr[i2]);
        }
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("ExtendableSavedState{");
        f2.append(Integer.toHexString(System.identityHashCode(this)));
        f2.append(" states=");
        f2.append(this.f1406g);
        f2.append("}");
        return f2.toString();
    }

    @Override // g.j.a.a
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2593f, i2);
        int i3 = this.f1406g.f2251k;
        parcel.writeInt(i3);
        String[] strArr = new String[i3];
        Bundle[] bundleArr = new Bundle[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr[i4] = this.f1406g.h(i4);
            bundleArr[i4] = this.f1406g.l(i4);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
