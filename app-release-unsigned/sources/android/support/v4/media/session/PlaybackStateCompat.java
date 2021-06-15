package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final long f17f;

    /* renamed from: g  reason: collision with root package name */
    public final long f18g;

    /* renamed from: h  reason: collision with root package name */
    public final float f19h;

    /* renamed from: i  reason: collision with root package name */
    public final long f20i;

    /* renamed from: j  reason: collision with root package name */
    public final int f21j;

    /* renamed from: k  reason: collision with root package name */
    public final CharSequence f22k;

    /* renamed from: l  reason: collision with root package name */
    public final long f23l;

    /* renamed from: m  reason: collision with root package name */
    public List<CustomAction> f24m;
    public final long n;
    public final Bundle o;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final CharSequence f25f;

        /* renamed from: g  reason: collision with root package name */
        public final int f26g;

        /* renamed from: h  reason: collision with root package name */
        public final Bundle f27h;

        public static class a implements Parcelable.Creator<CustomAction> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        public CustomAction(Parcel parcel) {
            this.e = parcel.readString();
            this.f25f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f26g = parcel.readInt();
            this.f27h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("Action:mName='");
            f2.append((Object) this.f25f);
            f2.append(", mIcon=");
            f2.append(this.f26g);
            f2.append(", mExtras=");
            f2.append(this.f27h);
            return f2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.e);
            TextUtils.writeToParcel(this.f25f, parcel, i2);
            parcel.writeInt(this.f26g);
            parcel.writeBundle(this.f27h);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.e = parcel.readInt();
        this.f17f = parcel.readLong();
        this.f19h = parcel.readFloat();
        this.f23l = parcel.readLong();
        this.f18g = parcel.readLong();
        this.f20i = parcel.readLong();
        this.f22k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f24m = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.n = parcel.readLong();
        this.o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f21j = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.e + ", position=" + this.f17f + ", buffered position=" + this.f18g + ", speed=" + this.f19h + ", updated=" + this.f23l + ", actions=" + this.f20i + ", error code=" + this.f21j + ", error message=" + this.f22k + ", custom actions=" + this.f24m + ", active item id=" + this.n + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeLong(this.f17f);
        parcel.writeFloat(this.f19h);
        parcel.writeLong(this.f23l);
        parcel.writeLong(this.f18g);
        parcel.writeLong(this.f20i);
        TextUtils.writeToParcel(this.f22k, parcel, i2);
        parcel.writeTypedList(this.f24m);
        parcel.writeLong(this.n);
        parcel.writeBundle(this.o);
        parcel.writeInt(this.f21j);
    }
}
