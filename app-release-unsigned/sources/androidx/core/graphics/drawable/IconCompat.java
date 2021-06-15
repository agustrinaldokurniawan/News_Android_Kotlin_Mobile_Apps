package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public int b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Object f169c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f170d = null;
    public Parcelable e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f171f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f172g = 0;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f173h = null;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f174i = a;

    /* renamed from: j  reason: collision with root package name */
    public String f175j = null;

    /* renamed from: k  reason: collision with root package name */
    public String f176k;

    public String toString() {
        String str;
        int i2;
        int i3;
        if (this.b == -1) {
            return String.valueOf(this.f169c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f169c).getWidth());
                sb.append("x");
                i2 = ((Bitmap) this.f169c).getHeight();
                sb.append(i2);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f176k);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                int i4 = this.b;
                if (i4 == -1) {
                    int i5 = Build.VERSION.SDK_INT;
                    Icon icon = (Icon) this.f169c;
                    if (i5 >= 28) {
                        i3 = icon.getResId();
                    } else {
                        try {
                            i3 = ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            i3 = 0;
                        }
                    }
                } else if (i4 == 2) {
                    i3 = this.f171f;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                objArr[0] = Integer.valueOf(i3);
                sb.append(String.format("0x%08x", objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f171f);
                if (this.f172g != 0) {
                    sb.append(" off=");
                    i2 = this.f172g;
                    sb.append(i2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f169c);
                break;
        }
        if (this.f173h != null) {
            sb.append(" tint=");
            sb.append(this.f173h);
        }
        if (this.f174i != a) {
            sb.append(" mode=");
            sb.append(this.f174i);
        }
        sb.append(")");
        return sb.toString();
    }
}
