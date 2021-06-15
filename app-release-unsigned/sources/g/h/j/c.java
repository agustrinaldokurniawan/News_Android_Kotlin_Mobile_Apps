package g.h.j;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;
import java.util.Objects;

public final class c {
    public final ClipData a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2521c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f2522d;
    public final Bundle e;

    public static final class a {
        public ClipData a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f2523c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f2524d;
        public Bundle e;

        public a(ClipData clipData, int i2) {
            this.a = clipData;
            this.b = i2;
        }
    }

    public c(a aVar) {
        ClipData clipData = aVar.a;
        Objects.requireNonNull(clipData);
        this.a = clipData;
        int i2 = aVar.b;
        if (i2 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 3));
        } else if (i2 <= 3) {
            this.b = i2;
            int i3 = aVar.f2523c;
            if ((i3 & 1) == i3) {
                this.f2521c = i3;
                this.f2522d = aVar.f2524d;
                this.e = aVar.e;
                return;
            }
            StringBuilder f2 = c.c.a.a.a.f("Requested flags 0x");
            f2.append(Integer.toHexString(i3));
            f2.append(", but only 0x");
            f2.append(Integer.toHexString(1));
            f2.append(" are allowed");
            throw new IllegalArgumentException(f2.toString());
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 3));
        }
    }

    public String toString() {
        String str;
        StringBuilder f2 = c.c.a.a.a.f("ContentInfoCompat{clip=");
        f2.append(this.a);
        f2.append(", source=");
        int i2 = this.b;
        f2.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? String.valueOf(i2) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
        f2.append(", flags=");
        int i3 = this.f2521c;
        if ((i3 & 1) != 0) {
            str = "FLAG_CONVERT_TO_PLAIN_TEXT";
        } else {
            str = String.valueOf(i3);
        }
        f2.append(str);
        f2.append(", linkUri=");
        f2.append(this.f2522d);
        f2.append(", extras=");
        f2.append(this.e);
        f2.append("}");
        return f2.toString();
    }
}
