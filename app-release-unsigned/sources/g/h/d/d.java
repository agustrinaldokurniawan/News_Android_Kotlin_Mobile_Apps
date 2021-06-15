package g.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import g.h.c.b.b;
import g.h.c.b.c;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class d extends j {
    public static Class<?> b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<?> f2477c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f2478d = null;
    public static Method e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2479f = false;

    public static boolean f(Object obj, String str, int i2, boolean z) {
        g();
        try {
            return ((Boolean) f2478d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f2479f) {
            f2479f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            f2477c = constructor;
            b = cls;
            f2478d = method;
            e = method2;
        }
    }

    @Override // g.h.d.j
    public Typeface a(Context context, b bVar, Resources resources, int i2) {
        g();
        try {
            Object newInstance = f2477c.newInstance(new Object[0]);
            c[] cVarArr = bVar.a;
            for (c cVar : cVarArr) {
                File n = g.h.b.d.n(context);
                if (n == null) {
                    return null;
                }
                try {
                    if (!g.h.b.d.h(n, resources, cVar.f2469f)) {
                        n.delete();
                        return null;
                    }
                    if (!f(newInstance, n.getPath(), cVar.b, cVar.f2467c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    n.delete();
                }
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055 A[SYNTHETIC, Splitter:B:18:0x0055] */
    @Override // g.h.d.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r4, android.os.CancellationSignal r5, g.h.g.l[] r6, int r7) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.d.d.b(android.content.Context, android.os.CancellationSignal, g.h.g.l[], int):android.graphics.Typeface");
    }
}
