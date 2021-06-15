package c.e.b.a0.a0;

import c.e.b.o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class c extends b {
    public static Class b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1447c;

    /* renamed from: d  reason: collision with root package name */
    public final Field f1448d;

    public c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            b = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f1447c = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f1448d = field;
    }

    @Override // c.e.b.a0.a0.b
    public void a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (!(this.f1447c == null || this.f1448d == null)) {
            try {
                b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f1447c, accessibleObject, Long.valueOf(((Long) b.getMethod("objectFieldOffset", Field.class).invoke(this.f1447c, this.f1448d)).longValue()), Boolean.TRUE);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new o("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }
}
