package c.d.a.m;

import android.content.Context;
import c.d.a.m.v.w;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class n<T> implements t<T> {
    public final Collection<? extends t<T>> b;

    @SafeVarargs
    public n(t<T>... tVarArr) {
        if (tVarArr.length != 0) {
            this.b = Arrays.asList(tVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        Iterator<? extends t<T>> it = this.b.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(messageDigest);
        }
    }

    @Override // c.d.a.m.t
    public w<T> b(Context context, w<T> wVar, int i2, int i3) {
        Iterator<? extends t<T>> it = this.b.iterator();
        w<T> wVar2 = wVar;
        while (it.hasNext()) {
            w<T> b2 = ((t) it.next()).b(context, wVar2, i2, i3);
            if (wVar2 != null && !wVar2.equals(wVar) && !wVar2.equals(b2)) {
                wVar2.d();
            }
            wVar2 = b2;
        }
        return wVar2;
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.b.equals(((n) obj).b);
        }
        return false;
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        return this.b.hashCode();
    }
}
