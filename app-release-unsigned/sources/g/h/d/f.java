package g.h.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c.c.a.a.a;
import g.h.b.d;
import g.h.c.b.b;
import g.h.c.b.c;
import g.h.g.l;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class f extends d {

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f2482g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor<?> f2483h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f2484i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f2485j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f2486k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f2487l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f2488m;

    public f() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = n(cls2);
            method2 = o(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            method5 = p(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder f2 = a.f("Unable to collect necessary methods for class ");
            f2.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", f2.toString(), e);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f2482g = cls;
        this.f2483h = constructor;
        this.f2484i = method3;
        this.f2485j = method2;
        this.f2486k = method;
        this.f2487l = method4;
        this.f2488m = method5;
    }

    private Object m() {
        try {
            return this.f2483h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // g.h.d.j, g.h.d.d
    public Typeface a(Context context, b bVar, Resources resources, int i2) {
        if (!l()) {
            return super.a(context, bVar, resources, i2);
        }
        Object m2 = m();
        if (m2 == null) {
            return null;
        }
        c[] cVarArr = bVar.a;
        for (c cVar : cVarArr) {
            if (!i(context, m2, cVar.a, cVar.e, cVar.b, cVar.f2467c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f2468d))) {
                h(m2);
                return null;
            }
        }
        if (!k(m2)) {
            return null;
        }
        return j(m2);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x00cb */
    @Override // g.h.d.j, g.h.d.d
    public Typeface b(Context context, CancellationSignal cancellationSignal, l[] lVarArr, int i2) {
        Typeface j2;
        boolean z;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            l lVar = (l) j.e(lVarArr, i2, new i(this));
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(lVar.a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(lVar.f2502c).setItalic(lVar.f2503d).build();
                    openFileDescriptor.close();
                    return build;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            HashMap hashMap = new HashMap();
            for (l lVar2 : lVarArr) {
                if (lVar2.e == 0) {
                    Uri uri = lVar2.a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, d.t(context, cancellationSignal, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object m2 = m();
            if (m2 == null) {
                return null;
            }
            int length = lVarArr.length;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                l lVar3 = lVarArr[i3];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar3.a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.f2485j.invoke(m2, byteBuffer, Integer.valueOf(lVar3.b), null, Integer.valueOf(lVar3.f2502c), Integer.valueOf(lVar3.f2503d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        h(m2);
                        return null;
                    }
                    z2 = true;
                }
                i3++;
                z2 = z2;
            }
            if (!z2) {
                h(m2);
                return null;
            } else if (k(m2) && (j2 = j(m2)) != null) {
                return Typeface.create(j2, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    @Override // g.h.d.j
    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        if (!l()) {
            return super.d(context, resources, i2, str, i3);
        }
        Object m2 = m();
        if (m2 == null) {
            return null;
        }
        if (!i(context, m2, str, 0, -1, -1, null)) {
            h(m2);
            return null;
        } else if (!k(m2)) {
            return null;
        } else {
            return j(m2);
        }
    }

    public final void h(Object obj) {
        try {
            this.f2487l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2484i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2482g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2488m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f2486k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        if (this.f2484i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2484i != null;
    }

    public Method n(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method o(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method p(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
