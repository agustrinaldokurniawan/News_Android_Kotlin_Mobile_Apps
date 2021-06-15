package g.f.d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import g.f.c.g;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class a {
    public String a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f2394c;

    /* renamed from: d  reason: collision with root package name */
    public float f2395d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2396f;

    /* renamed from: g  reason: collision with root package name */
    public int f2397g;

    public a(a aVar, Object obj) {
        this.a = aVar.a;
        this.b = aVar.b;
        b(obj);
    }

    public a(String str, int i2, Object obj) {
        this.a = str;
        this.b = i2;
        b(obj);
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        int i2;
        float f2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f2444d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i3 = 0;
        Object obj = null;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            int i5 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i3 = 6;
            } else {
                if (index == 3) {
                    i5 = 3;
                } else if (index == 2) {
                    i5 = 4;
                } else {
                    if (index == 7) {
                        f2 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        f2 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == 5) {
                        obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        i3 = 2;
                    } else if (index == 6) {
                        i2 = obtainStyledAttributes.getInteger(index, -1);
                        obj = Integer.valueOf(i2);
                        i3 = i5;
                    } else if (index == 8) {
                        obj = obtainStyledAttributes.getString(index);
                        i3 = 5;
                    }
                    obj = Float.valueOf(f2);
                    i3 = 7;
                }
                i2 = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(i2);
                i3 = i5;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, i3, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public void b(Object obj) {
        switch (g.f(this.b)) {
            case 0:
                this.f2394c = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f2395d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f2397g = ((Integer) obj).intValue();
                return;
            case 4:
                this.e = (String) obj;
                return;
            case 5:
                this.f2396f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
