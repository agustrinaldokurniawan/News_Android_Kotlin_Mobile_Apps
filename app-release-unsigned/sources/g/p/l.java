package g.p;

import android.os.Bundle;
import c.c.a.a.a;
import g.p.q;

@q.b("navigation")
public class l extends q<k> {
    public final r a;

    public l(r rVar) {
        this.a = rVar;
    }

    /* Return type fixed from 'g.p.j' to match base method */
    @Override // g.p.q
    public k a() {
        return new k(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g.p.j, android.os.Bundle, g.p.o, g.p.q$a] */
    @Override // g.p.q
    public j b(k kVar, Bundle bundle, o oVar, q.a aVar) {
        String str;
        k kVar2 = kVar;
        int i2 = kVar2.n;
        if (i2 == 0) {
            StringBuilder f2 = a.f("no start destination defined via app:startDestination for ");
            int i3 = kVar2.f2847g;
            if (i3 != 0) {
                if (kVar2.f2848h == null) {
                    kVar2.f2848h = Integer.toString(i3);
                }
                str = kVar2.f2848h;
            } else {
                str = "the root navigation";
            }
            f2.append(str);
            throw new IllegalStateException(f2.toString());
        }
        j h2 = kVar2.h(i2, false);
        if (h2 != null) {
            return this.a.c(h2.e).b(h2, h2.a(bundle), oVar, aVar);
        }
        if (kVar2.o == null) {
            kVar2.o = Integer.toString(kVar2.n);
        }
        throw new IllegalArgumentException(a.c("navigation destination ", kVar2.o, " is not a direct child of this NavGraph"));
    }

    @Override // g.p.q
    public boolean e() {
        return true;
    }
}
