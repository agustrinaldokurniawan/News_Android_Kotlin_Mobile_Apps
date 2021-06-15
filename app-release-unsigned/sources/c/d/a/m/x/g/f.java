package c.d.a.m.x.g;

import android.content.Context;
import android.graphics.Bitmap;
import c.d.a.b;
import c.d.a.m.t;
import c.d.a.m.v.w;
import c.d.a.m.x.c.e;
import java.security.MessageDigest;
import java.util.Objects;

public class f implements t<c> {
    public final t<Bitmap> b;

    public f(t<Bitmap> tVar) {
        Objects.requireNonNull(tVar, "Argument must not be null");
        this.b = tVar;
    }

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // c.d.a.m.t
    public w<c> b(Context context, w<c> wVar, int i2, int i3) {
        c cVar = wVar.get();
        e eVar = new e(cVar.b(), b.b(context).f723g);
        w<Bitmap> b2 = this.b.b(context, eVar, i2, i3);
        if (!eVar.equals(b2)) {
            eVar.d();
        }
        t<Bitmap> tVar = this.b;
        cVar.e.a.c(tVar, b2.get());
        return wVar;
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.b.equals(((f) obj).b);
        }
        return false;
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        return this.b.hashCode();
    }
}
