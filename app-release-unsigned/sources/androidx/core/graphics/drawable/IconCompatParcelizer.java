package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import g.w.a;
import java.nio.charset.Charset;
import java.util.Objects;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.b = aVar.k(iconCompat.b, 1);
        byte[] bArr = iconCompat.f170d;
        if (aVar.i(2)) {
            bArr = aVar.g();
        }
        iconCompat.f170d = bArr;
        iconCompat.e = aVar.m(iconCompat.e, 3);
        iconCompat.f171f = aVar.k(iconCompat.f171f, 4);
        iconCompat.f172g = aVar.k(iconCompat.f172g, 5);
        iconCompat.f173h = (ColorStateList) aVar.m(iconCompat.f173h, 6);
        String str = iconCompat.f175j;
        if (aVar.i(7)) {
            str = aVar.n();
        }
        iconCompat.f175j = str;
        String str2 = iconCompat.f176k;
        if (aVar.i(8)) {
            str2 = aVar.n();
        }
        iconCompat.f176k = str2;
        iconCompat.f174i = PorterDuff.Mode.valueOf(iconCompat.f175j);
        switch (iconCompat.b) {
            case -1:
                parcelable = iconCompat.e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f169c = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.e;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f170d;
                    iconCompat.f169c = bArr2;
                    iconCompat.b = 3;
                    iconCompat.f171f = 0;
                    iconCompat.f172g = bArr2.length;
                    break;
                }
                iconCompat.f169c = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f170d, Charset.forName("UTF-16"));
                iconCompat.f169c = str3;
                if (iconCompat.b == 2 && iconCompat.f176k == null) {
                    iconCompat.f176k = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f169c = iconCompat.f170d;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.f175j = iconCompat.f174i.name();
        switch (iconCompat.b) {
            case -1:
            case 1:
            case 5:
                iconCompat.e = (Parcelable) iconCompat.f169c;
                break;
            case 2:
                iconCompat.f170d = ((String) iconCompat.f169c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f170d = (byte[]) iconCompat.f169c;
                break;
            case 4:
            case 6:
                iconCompat.f170d = iconCompat.f169c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.b;
        if (-1 != i2) {
            aVar.p(1);
            aVar.t(i2);
        }
        byte[] bArr = iconCompat.f170d;
        if (bArr != null) {
            aVar.p(2);
            aVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.e;
        if (parcelable != null) {
            aVar.p(3);
            aVar.u(parcelable);
        }
        int i3 = iconCompat.f171f;
        if (i3 != 0) {
            aVar.p(4);
            aVar.t(i3);
        }
        int i4 = iconCompat.f172g;
        if (i4 != 0) {
            aVar.p(5);
            aVar.t(i4);
        }
        ColorStateList colorStateList = iconCompat.f173h;
        if (colorStateList != null) {
            aVar.p(6);
            aVar.u(colorStateList);
        }
        String str = iconCompat.f175j;
        if (str != null) {
            aVar.p(7);
            aVar.v(str);
        }
        String str2 = iconCompat.f176k;
        if (str2 != null) {
            aVar.p(8);
            aVar.v(str2);
        }
    }
}
