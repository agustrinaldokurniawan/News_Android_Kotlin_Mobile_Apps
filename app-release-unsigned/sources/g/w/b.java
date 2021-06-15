package g.w;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import g.e.a;
import java.lang.reflect.Method;

public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f3068d;
    public final Parcel e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3069f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3070g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3071h;

    /* renamed from: i  reason: collision with root package name */
    public int f3072i;

    /* renamed from: j  reason: collision with root package name */
    public int f3073j;

    /* renamed from: k  reason: collision with root package name */
    public int f3074k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    public b(Parcel parcel, int i2, int i3, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3068d = new SparseIntArray();
        this.f3072i = -1;
        this.f3073j = 0;
        this.f3074k = -1;
        this.e = parcel;
        this.f3069f = i2;
        this.f3070g = i3;
        this.f3073j = i2;
        this.f3071h = str;
    }

    @Override // g.w.a
    public void a() {
        int i2 = this.f3072i;
        if (i2 >= 0) {
            int i3 = this.f3068d.get(i2);
            int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(i3);
            this.e.writeInt(dataPosition - i3);
            this.e.setDataPosition(dataPosition);
        }
    }

    @Override // g.w.a
    public a b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f3073j;
        if (i2 == this.f3069f) {
            i2 = this.f3070g;
        }
        return new b(parcel, dataPosition, i2, c.c.a.a.a.e(new StringBuilder(), this.f3071h, "  "), this.a, this.b, this.f3067c);
    }

    @Override // g.w.a
    public boolean f() {
        return this.e.readInt() != 0;
    }

    @Override // g.w.a
    public byte[] g() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    @Override // g.w.a
    public CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // g.w.a
    public boolean i(int i2) {
        while (this.f3073j < this.f3070g) {
            int i3 = this.f3074k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.f3073j);
            int readInt = this.e.readInt();
            this.f3074k = this.e.readInt();
            this.f3073j += readInt;
        }
        return this.f3074k == i2;
    }

    @Override // g.w.a
    public int j() {
        return this.e.readInt();
    }

    @Override // g.w.a
    public <T extends Parcelable> T l() {
        return (T) this.e.readParcelable(b.class.getClassLoader());
    }

    @Override // g.w.a
    public String n() {
        return this.e.readString();
    }

    @Override // g.w.a
    public void p(int i2) {
        a();
        this.f3072i = i2;
        this.f3068d.put(i2, this.e.dataPosition());
        this.e.writeInt(0);
        this.e.writeInt(i2);
    }

    @Override // g.w.a
    public void q(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // g.w.a
    public void r(byte[] bArr) {
        if (bArr != null) {
            this.e.writeInt(bArr.length);
            this.e.writeByteArray(bArr);
            return;
        }
        this.e.writeInt(-1);
    }

    @Override // g.w.a
    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // g.w.a
    public void t(int i2) {
        this.e.writeInt(i2);
    }

    @Override // g.w.a
    public void u(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // g.w.a
    public void v(String str) {
        this.e.writeString(str);
    }
}
