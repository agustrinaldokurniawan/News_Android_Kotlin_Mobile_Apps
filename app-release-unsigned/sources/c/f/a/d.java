package c.f.a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import i.s.c.h;

public final class d extends View.BaseSavedState {
    public static final Parcelable.ClassLoaderCreator<d> CREATOR = new b();
    public Bundle e;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0051a();
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final int f1540f;

        /* renamed from: c.f.a.d$a$a  reason: collision with other inner class name */
        public static class C0051a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.f(parcel, "in");
                return new a(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new a[i2];
            }
        }

        public a(int i2, int i3) {
            this.e = i2;
            this.f1540f = i3;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            h.f(parcel, "parcel");
            parcel.writeInt(this.e);
            parcel.writeInt(this.f1540f);
        }
    }

    public static final class b implements Parcelable.ClassLoaderCreator<d> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            h.f(parcel, "source");
            return new d(parcel, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i2) {
            return new d[0];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
            h.f(parcel, "source");
            h.f(classLoader, "loader");
            return new d(parcel, classLoader);
        }
    }

    public static final class c implements Parcelable {
        public static final Parcelable.Creator CREATOR = new a();
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f1541f;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.f(parcel, "in");
                return new c(parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(int i2, boolean z) {
            this.e = i2;
            this.f1541f = z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            h.f(parcel, "parcel");
            parcel.writeInt(this.e);
            parcel.writeInt(this.f1541f ? 1 : 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        h.f(parcel, "source");
        this.e = parcel.readBundle(classLoader);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Parcelable parcelable, Bundle bundle) {
        super(parcelable);
        h.f(bundle, "bundle");
        this.e = bundle;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        h.f(parcel, "out");
        super.writeToParcel(parcel, i2);
        parcel.writeBundle(this.e);
    }
}
