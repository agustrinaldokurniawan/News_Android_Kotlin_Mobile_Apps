package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f1f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f2g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f3h;

    /* renamed from: i  reason: collision with root package name */
    public final Bitmap f4i;

    /* renamed from: j  reason: collision with root package name */
    public final Uri f5j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f6k;

    /* renamed from: l  reason: collision with root package name */
    public final Uri f7l;

    /* renamed from: m  reason: collision with root package name */
    public Object f8m;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.j(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.e = str;
        this.f1f = charSequence;
        this.f2g = charSequence2;
        this.f3h = charSequence3;
        this.f4i = bitmap;
        this.f5j = uri;
        this.f6k = bundle;
        this.f7l = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat j(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x005b
            r1 = r14
            android.media.MediaDescription r1 = (android.media.MediaDescription) r1
            java.lang.String r3 = r1.getMediaId()
            java.lang.CharSequence r4 = r1.getTitle()
            java.lang.CharSequence r5 = r1.getSubtitle()
            java.lang.CharSequence r6 = r1.getDescription()
            android.graphics.Bitmap r7 = r1.getIconBitmap()
            android.net.Uri r8 = r1.getIconUri()
            android.os.Bundle r2 = r1.getExtras()
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0030
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x0031
        L_0x0030:
            r10 = r0
        L_0x0031:
            if (r10 == 0) goto L_0x004a
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x0044
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x0044
            r9 = r0
            goto L_0x004b
        L_0x0044:
            r2.remove(r9)
            r2.remove(r11)
        L_0x004a:
            r9 = r2
        L_0x004b:
            if (r10 == 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            android.net.Uri r0 = r1.getMediaUri()
            r10 = r0
        L_0x0053:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f8m = r14
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.j(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f1f) + ", " + ((Object) this.f2g) + ", " + ((Object) this.f3h);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Object obj = this.f8m;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.e);
            builder.setTitle(this.f1f);
            builder.setSubtitle(this.f2g);
            builder.setDescription(this.f3h);
            builder.setIconBitmap(this.f4i);
            builder.setIconUri(this.f5j);
            builder.setExtras(this.f6k);
            builder.setMediaUri(this.f7l);
            obj = builder.build();
            this.f8m = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i2);
    }
}
