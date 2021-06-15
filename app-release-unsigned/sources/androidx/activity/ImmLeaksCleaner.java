package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import g.n.e;
import g.n.g;
import g.n.i;
import java.lang.reflect.Field;

public final class ImmLeaksCleaner implements g {
    public static int a;
    public static Field b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f34c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f35d;
    public Activity e;

    @Override // g.n.g
    public void d(i iVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            if (a == 0) {
                try {
                    a = 2;
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    f34c = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    f35d = declaredField2;
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    b = declaredField3;
                    declaredField3.setAccessible(true);
                    a = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (a == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.e.getSystemService("input_method");
                try {
                    Object obj = b.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) f34c.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            f35d.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused2) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused3) {
                            } catch (ClassCastException unused4) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused5) {
                }
            }
        }
    }
}
