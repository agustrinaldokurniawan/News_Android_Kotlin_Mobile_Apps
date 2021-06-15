package g.b.f;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

public class c extends ContextWrapper {
    public int a;
    public Resources.Theme b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f1918c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f1919d;
    public Resources e;

    public c() {
        super(null);
    }

    public c(Context context, int i2) {
        super(context);
        this.a = i2;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }

    public void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f1919d == null) {
            this.f1919d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        if (this.e == null) {
            Configuration configuration = this.f1919d;
            this.e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.e;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1918c == null) {
            this.f1918c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1918c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = 2131820950;
        }
        b();
        return this.b;
    }

    public void setTheme(int i2) {
        if (this.a != i2) {
            this.a = i2;
            b();
        }
    }
}
