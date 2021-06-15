package g.b.c;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import com.tsuga.news.R;
import g.b.g.b0;
import g.b.g.d;
import g.b.g.f;
import g.b.g.g;
import g.b.g.r;
import g.e.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class p {
    public static final Class<?>[] a = {Context.class, AttributeSet.class};
    public static final int[] b = {16843375};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f1892c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d  reason: collision with root package name */
    public static final h<String, Constructor<? extends View>> f1893d = new h<>();
    public final Object[] e = new Object[2];

    public static class a implements View.OnClickListener {
        public final View e;

        /* renamed from: f  reason: collision with root package name */
        public final String f1894f;

        /* renamed from: g  reason: collision with root package name */
        public Method f1895g;

        /* renamed from: h  reason: collision with root package name */
        public Context f1896h;

        public a(View view, String str) {
            this.e = view;
            this.f1894f = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.f1895g == null) {
                Context context = this.e.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1894f, View.class)) != null) {
                            this.f1895g = method;
                            this.f1896h = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.e.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder f2 = c.c.a.a.a.f(" with id '");
                    f2.append(this.e.getContext().getResources().getResourceEntryName(id));
                    f2.append("'");
                    str = f2.toString();
                }
                StringBuilder f3 = c.c.a.a.a.f("Could not find method ");
                f3.append(this.f1894f);
                f3.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                f3.append(this.e.getClass());
                f3.append(str);
                throw new IllegalStateException(f3.toString());
            }
            try {
                this.f1895g.invoke(this.f1896h, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public d a(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public f b(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public g c(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    public r d(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet, R.attr.radioButtonStyle);
    }

    public b0 e(Context context, AttributeSet attributeSet) {
        return new b0(context, attributeSet);
    }

    public View f() {
        return null;
    }

    public final View g(Context context, String str, String str2) {
        String str3;
        h<String, Constructor<? extends View>> hVar = f1893d;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(a);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.e);
    }

    public final void h(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
