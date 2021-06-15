package c.d.a.m.x.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import g.b.f.c;

public final class a {
    public static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (a) {
                return g.b.d.a.a.a(theme != null ? new c(context2, theme) : context2, i2);
            }
        } catch (NoClassDefFoundError unused) {
            a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = g.h.c.a.a;
                return context2.getDrawable(i2);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return context2.getResources().getDrawable(i2, theme);
    }
}
