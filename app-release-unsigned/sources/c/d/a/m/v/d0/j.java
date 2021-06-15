package c.d.a.m.v.d0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class j {
    public final int a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f889c;

    /* renamed from: d  reason: collision with root package name */
    public final int f890d;

    public static final class a {
        public static final int a = (Build.VERSION.SDK_INT < 26 ? 4 : 1);
        public final Context b;

        /* renamed from: c  reason: collision with root package name */
        public ActivityManager f891c;

        /* renamed from: d  reason: collision with root package name */
        public c f892d;
        public float e = ((float) a);

        public a(Context context) {
            this.b = context;
            this.f891c = (ActivityManager) context.getSystemService("activity");
            this.f892d = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.f891c.isLowRamDevice()) {
                this.e = 0.0f;
            }
        }
    }

    public static final class b implements c {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }
    }

    public interface c {
    }

    public j(a aVar) {
        this.f889c = aVar.b;
        int i2 = aVar.f891c.isLowRamDevice() ? 2097152 : 4194304;
        this.f890d = i2;
        ActivityManager activityManager = aVar.f891c;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = ((b) aVar.f892d).a;
        float f2 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int round2 = Math.round(aVar.e * f2);
        int round3 = Math.round(f2 * 2.0f);
        int i3 = round - i2;
        int i4 = round3 + round2;
        if (i4 <= i3) {
            this.b = round3;
            this.a = round2;
        } else {
            float f3 = ((float) i3) / (aVar.e + 2.0f);
            this.b = Math.round(2.0f * f3);
            this.a = Math.round(f3 * aVar.e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder f4 = c.c.a.a.a.f("Calculation complete, Calculated memory cache size: ");
            f4.append(a(this.b));
            f4.append(", pool size: ");
            f4.append(a(this.a));
            f4.append(", byte array size: ");
            f4.append(a(i2));
            f4.append(", memory class limited? ");
            f4.append(i4 > round);
            f4.append(", max size: ");
            f4.append(a(round));
            f4.append(", memoryClass: ");
            f4.append(aVar.f891c.getMemoryClass());
            f4.append(", isLowMemoryDevice: ");
            f4.append(aVar.f891c.isLowRamDevice());
            Log.d("MemorySizeCalculator", f4.toString());
        }
    }

    public final String a(int i2) {
        return Formatter.formatFileSize(this.f889c, (long) i2);
    }
}
