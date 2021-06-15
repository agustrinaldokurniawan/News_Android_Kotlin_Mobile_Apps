package g.l.b;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g.l.b.j0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int[] e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<String> f2634f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f2635g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f2636h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2637i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2638j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2639k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2640l;

    /* renamed from: m  reason: collision with root package name */
    public final CharSequence f2641m;
    public final int n;
    public final CharSequence o;
    public final ArrayList<String> p;
    public final ArrayList<String> q;
    public final boolean r;

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

    public b(Parcel parcel) {
        this.e = parcel.createIntArray();
        this.f2634f = parcel.createStringArrayList();
        this.f2635g = parcel.createIntArray();
        this.f2636h = parcel.createIntArray();
        this.f2637i = parcel.readInt();
        this.f2638j = parcel.readString();
        this.f2639k = parcel.readInt();
        this.f2640l = parcel.readInt();
        this.f2641m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.readInt();
        this.o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.p = parcel.createStringArrayList();
        this.q = parcel.createStringArrayList();
        this.r = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.a.size();
        this.e = new int[(size * 5)];
        if (aVar.f2699g) {
            this.f2634f = new ArrayList<>(size);
            this.f2635g = new int[size];
            this.f2636h = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                j0.a aVar2 = aVar.a.get(i2);
                int i4 = i3 + 1;
                this.e[i3] = aVar2.a;
                ArrayList<String> arrayList = this.f2634f;
                m mVar = aVar2.b;
                arrayList.add(mVar != null ? mVar.f2717j : null);
                int[] iArr = this.e;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f2706c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f2707d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.e;
                iArr[i7] = aVar2.f2708f;
                this.f2635g[i2] = aVar2.f2709g.ordinal();
                this.f2636h[i2] = aVar2.f2710h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f2637i = aVar.f2698f;
            this.f2638j = aVar.f2701i;
            this.f2639k = aVar.s;
            this.f2640l = aVar.f2702j;
            this.f2641m = aVar.f2703k;
            this.n = aVar.f2704l;
            this.o = aVar.f2705m;
            this.p = aVar.n;
            this.q = aVar.o;
            this.r = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.e);
        parcel.writeStringList(this.f2634f);
        parcel.writeIntArray(this.f2635g);
        parcel.writeIntArray(this.f2636h);
        parcel.writeInt(this.f2637i);
        parcel.writeString(this.f2638j);
        parcel.writeInt(this.f2639k);
        parcel.writeInt(this.f2640l);
        TextUtils.writeToParcel(this.f2641m, parcel, 0);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.o, parcel, 0);
        parcel.writeStringList(this.p);
        parcel.writeStringList(this.q);
        parcel.writeInt(this.r ? 1 : 0);
    }
}
