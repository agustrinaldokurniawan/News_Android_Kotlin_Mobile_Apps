package c.d.a.m.x.g;

import android.graphics.Bitmap;
import c.d.a.m.v.s;
import c.d.a.m.x.e.b;
import c.d.a.m.x.g.g;

public class e extends b<c> implements s {
    public e(c cVar) {
        super(cVar);
    }

    @Override // c.d.a.m.x.e.b, c.d.a.m.v.s
    public void a() {
        ((c) this.e).b().prepareToDraw();
    }

    @Override // c.d.a.m.v.w
    public int b() {
        g gVar = ((c) this.e).e.a;
        return gVar.a.b() + gVar.o;
    }

    @Override // c.d.a.m.v.w
    public Class<c> c() {
        return c.class;
    }

    @Override // c.d.a.m.v.w
    public void d() {
        ((c) this.e).stop();
        c cVar = (c) this.e;
        cVar.f1084h = true;
        g gVar = cVar.e.a;
        gVar.f1090c.clear();
        Bitmap bitmap = gVar.f1098l;
        if (bitmap != null) {
            gVar.e.e(bitmap);
            gVar.f1098l = null;
        }
        gVar.f1092f = false;
        g.a aVar = gVar.f1095i;
        if (aVar != null) {
            gVar.f1091d.l(aVar);
            gVar.f1095i = null;
        }
        g.a aVar2 = gVar.f1097k;
        if (aVar2 != null) {
            gVar.f1091d.l(aVar2);
            gVar.f1097k = null;
        }
        g.a aVar3 = gVar.n;
        if (aVar3 != null) {
            gVar.f1091d.l(aVar3);
            gVar.n = null;
        }
        gVar.a.clear();
        gVar.f1096j = true;
    }
}
