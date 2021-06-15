package c.b.a.b0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import c.b.a.f0.c;
import c.b.a.n;
import java.util.HashMap;
import java.util.Map;

public class b {
    public static final Object a = new Object();
    public final Context b;

    /* renamed from: c  reason: collision with root package name */
    public final String f522c;

    /* renamed from: d  reason: collision with root package name */
    public c.b.a.b f523d;
    public final Map<String, n> e;

    public b(Drawable.Callback callback, String str, c.b.a.b bVar, Map<String, n> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = str + '/';
        }
        this.f522c = str;
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.e = new HashMap();
            this.b = null;
            return;
        }
        this.b = ((View) callback).getContext();
        this.e = map;
        this.f523d = bVar;
    }

    public final Bitmap a(String str, Bitmap bitmap) {
        synchronized (a) {
            this.e.get(str).e = bitmap;
        }
        return bitmap;
    }
}
