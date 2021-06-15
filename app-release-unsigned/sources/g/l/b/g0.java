package g.l.b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new a();
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2680f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2681g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2682h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2683i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2684j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2685k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2686l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2687m;
    public final Bundle n;
    public final boolean o;
    public final int p;
    public Bundle q;

    public class a implements Parcelable.Creator<g0> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public g0 createFromParcel(Parcel parcel) {
            return new g0(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public g0[] newArray(int i2) {
            return new g0[i2];
        }
    }

    public g0(Parcel parcel) {
        this.e = parcel.readString();
        this.f2680f = parcel.readString();
        boolean z = true;
        this.f2681g = parcel.readInt() != 0;
        this.f2682h = parcel.readInt();
        this.f2683i = parcel.readInt();
        this.f2684j = parcel.readString();
        this.f2685k = parcel.readInt() != 0;
        this.f2686l = parcel.readInt() != 0;
        this.f2687m = parcel.readInt() != 0;
        this.n = parcel.readBundle();
        this.o = parcel.readInt() == 0 ? false : z;
        this.q = parcel.readBundle();
        this.p = parcel.readInt();
    }

    public g0(m mVar) {
        this.e = mVar.getClass().getName();
        this.f2680f = mVar.f2717j;
        this.f2681g = mVar.r;
        this.f2682h = mVar.A;
        this.f2683i = mVar.B;
        this.f2684j = mVar.C;
        this.f2685k = mVar.F;
        this.f2686l = mVar.q;
        this.f2687m = mVar.E;
        this.n = mVar.f2718k;
        this.o = mVar.D;
        this.p = mVar.R.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.e);
        sb.append(" (");
        sb.append(this.f2680f);
        sb.append(")}:");
        if (this.f2681g) {
            sb.append(" fromLayout");
        }
        if (this.f2683i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2683i));
        }
        String str = this.f2684j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2684j);
        }
        if (this.f2685k) {
            sb.append(" retainInstance");
        }
        if (this.f2686l) {
            sb.append(" removing");
        }
        if (this.f2687m) {
            sb.append(" detached");
        }
        if (this.o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.e);
        parcel.writeString(this.f2680f);
        parcel.writeInt(this.f2681g ? 1 : 0);
        parcel.writeInt(this.f2682h);
        parcel.writeInt(this.f2683i);
        parcel.writeString(this.f2684j);
        parcel.writeInt(this.f2685k ? 1 : 0);
        parcel.writeInt(this.f2686l ? 1 : 0);
        parcel.writeInt(this.f2687m ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeBundle(this.q);
        parcel.writeInt(this.p);
    }
}
