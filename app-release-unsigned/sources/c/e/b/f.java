package c.e.b;

import c.e.b.c0.a;
import c.e.b.c0.b;
import c.e.b.c0.c;

public class f extends x<Number> {
    public f(i iVar) {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.e.b.x
    public Number a(a aVar) {
        if (aVar.p0() != b.NULL) {
            return Float.valueOf((float) aVar.g0());
        }
        aVar.l0();
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
    @Override // c.e.b.x
    public void b(c cVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            cVar.b0();
            return;
        }
        i.a((double) number2.floatValue());
        cVar.j0(number2);
    }
}
