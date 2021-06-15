package g.h.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import g.h.b.d;
import g.h.c.b.b;
import g.h.g.l;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

public class j {
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, b> a = new ConcurrentHashMap<>();

    public interface a<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T e(T[] tArr, int i2, a<T> aVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.a(t2) - i3) * 2) + (aVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > abs) {
                t = t2;
                i4 = abs;
            }
        }
        return t;
    }

    public Typeface a(Context context, b bVar, Resources resources, int i2) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, l[] lVarArr, int i2) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File n = d.n(context);
        if (n == null) {
            return null;
        }
        try {
            if (!d.i(n, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(n.getPath());
            n.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            n.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        File n = d.n(context);
        if (n == null) {
            return null;
        }
        try {
            if (!d.h(n, resources, i2)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(n.getPath());
            n.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            n.delete();
        }
    }
}
