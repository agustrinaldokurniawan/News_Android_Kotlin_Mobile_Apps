package c.d.a.m.x.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import c.d.a.b;
import c.d.a.m.t;
import c.d.a.m.v.c0.d;
import c.d.a.m.v.w;
import java.security.MessageDigest;

public class o implements t<Drawable> {
    public final t<Bitmap> b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1057c;

    public o(t<Bitmap> tVar, boolean z) {
        this.b = tVar;
        this.f1057c = z;
    }

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // c.d.a.m.t
    public w<Drawable> b(Context context, w<Drawable> wVar, int i2, int i3) {
        d dVar = b.b(context).f723g;
        Drawable drawable = wVar.get();
        w<Bitmap> a = n.a(dVar, drawable, i2, i3);
        if (a != null) {
            w<Bitmap> b2 = this.b.b(context, a, i2, i3);
            if (!b2.equals(a)) {
                return v.e(context.getResources(), b2);
            }
            b2.d();
            return wVar;
        } else if (!this.f1057c) {
            return wVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.b.equals(((o) obj).b);
        }
        return false;
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        return this.b.hashCode();
    }
}
