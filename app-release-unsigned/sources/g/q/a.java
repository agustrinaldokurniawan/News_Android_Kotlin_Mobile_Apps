package g.q;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c.b.a.c0.j.d;
import c.b.a.e0.e;
import c.b.a.e0.g0;
import c.b.a.e0.h;
import c.b.a.e0.h0.c;
import c.b.a.e0.n;
import c.b.a.e0.q;
import c.b.a.e0.v;
import c.b.a.g;
import c.d.a.m.f;
import c.d.a.m.i;
import c.d.a.m.k;
import c.d.a.m.l;
import c.d.a.m.v.c0.b;
import c.d.a.m.x.c.x;
import com.bumptech.glide.load.ImageHeaderParser;
import g.q.c.s;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public final class a {
    public static long a;
    public static Method b;

    public static float a(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    public static float b(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow((double) f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static void c(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int d(RecyclerView.w wVar, s sVar, View view, View view2, RecyclerView.l lVar, boolean z) {
        if (lVar.y() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(lVar.R(view) - lVar.R(view2)) + 1;
        }
        return Math.min(sVar.l(), sVar.b(view2) - sVar.e(view));
    }

    public static int e(RecyclerView.w wVar, s sVar, View view, View view2, RecyclerView.l lVar, boolean z, boolean z2) {
        if (lVar.y() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (wVar.b() - Math.max(lVar.R(view), lVar.R(view2))) - 1) : Math.max(0, Math.min(lVar.R(view), lVar.R(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(sVar.b(view2) - sVar.e(view))) / ((float) (Math.abs(lVar.R(view) - lVar.R(view2)) + 1)))) + ((float) (sVar.k() - sVar.e(view))));
    }

    public static int f(RecyclerView.w wVar, s sVar, View view, View view2, RecyclerView.l lVar, boolean z) {
        if (lVar.y() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return wVar.b();
        }
        return (int) ((((float) (sVar.b(view2) - sVar.e(view))) / ((float) (Math.abs(lVar.R(view) - lVar.R(view2)) + 1))) * ((float) wVar.b()));
    }

    public static int g(float f2, int i2, int i3) {
        if (i2 == i3) {
            return i2;
        }
        float f3 = ((float) ((i2 >> 24) & 255)) / 255.0f;
        float a2 = a(((float) ((i2 >> 16) & 255)) / 255.0f);
        float a3 = a(((float) ((i2 >> 8) & 255)) / 255.0f);
        float a4 = a(((float) (i2 & 255)) / 255.0f);
        float a5 = a(((float) ((i3 >> 16) & 255)) / 255.0f);
        float a6 = a(((float) ((i3 >> 8) & 255)) / 255.0f);
        float a7 = a(((float) (i3 & 255)) / 255.0f);
        float a8 = c.c.a.a.a.a(((float) ((i3 >> 24) & 255)) / 255.0f, f3, f2, f3);
        float a9 = c.c.a.a.a.a(a5, a2, f2, a2);
        float a10 = c.c.a.a.a.a(a6, a3, f2, a3);
        float a11 = c.c.a.a.a.a(a7, a4, f2, a4);
        int round = Math.round(b(a9) * 255.0f) << 16;
        return Math.round(b(a11) * 255.0f) | round | (Math.round(a8 * 255.0f) << 24) | (Math.round(b(a10) * 255.0f) << 8);
    }

    public static int h(Cursor cursor, String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + "`");
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    String q = c.c.a.a.a.q(".", str);
                    String c2 = c.c.a.a.a.c(".", str, "`");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= columnNames.length) {
                            break;
                        }
                        String str3 = columnNames[i2];
                        if (str3.length() < str.length() + 2 || (!str3.endsWith(q) && (str3.charAt(0) != '`' || !str3.endsWith(c2)))) {
                            i2++;
                        }
                    }
                    columnIndex = i2;
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static int i(List<ImageHeaderParser> list, InputStream inputStream, b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return j(list, new i(inputStream, bVar));
    }

    public static int j(List<ImageHeaderParser> list, k kVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int a2 = kVar.a(list.get(i2));
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType k(List<ImageHeaderParser> list, InputStream inputStream, b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return l(list, new f(inputStream));
    }

    public static ImageHeaderParser.ImageType l(List<ImageHeaderParser> list, l lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType a2 = lVar.a(list.get(i2));
            if (a2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @SuppressLint({"NewApi"})
    public static boolean m() {
        try {
            if (b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
            return false;
        }
    }

    public static boolean n(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean o(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= 384;
    }

    public static <T> ObjectAnimator p(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }

    public static <T> List<c.b.a.g0.a<T>> q(c cVar, g gVar, g0<T> g0Var) {
        return q.a(cVar, gVar, 1.0f, g0Var, false);
    }

    public static c.b.a.c0.j.a r(c cVar, g gVar) {
        return new c.b.a.c0.j.a(q(cVar, gVar, e.a));
    }

    public static c.b.a.c0.j.b s(c cVar, g gVar) {
        return t(cVar, gVar, true);
    }

    public static c.b.a.c0.j.b t(c cVar, g gVar, boolean z) {
        return new c.b.a.c0.j.b(q.a(cVar, gVar, z ? c.b.a.f0.g.c() : 1.0f, h.a, false));
    }

    public static d u(c cVar, g gVar) {
        return new d(q(cVar, gVar, n.a));
    }

    public static c.b.a.c0.j.f v(c cVar, g gVar) {
        return new c.b.a.c0.j.f(q.a(cVar, gVar, c.b.a.f0.g.c(), v.a, true));
    }
}
