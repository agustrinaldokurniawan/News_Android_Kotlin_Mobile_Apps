package c.b.a.b0;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import c.b.a.c0.i;
import c.b.a.f0.c;
import java.util.HashMap;
import java.util.Map;

public class a {
    public final i<String> a = new i<>();
    public final Map<i<String>, Typeface> b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Typeface> f520c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f521d;
    public String e = ".ttf";

    public a(Drawable.Callback callback) {
        AssetManager assets;
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.f521d = assets;
    }
}
