package l.a.a.c;

import android.util.Log;
import i.s.c.h;
import l.a.c.i.b;
import l.a.c.i.c;

public final class a extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(bVar);
        h.e(bVar, "level");
    }

    @Override // l.a.c.i.c
    public void d(b bVar, String str) {
        h.e(bVar, "level");
        h.e(str, "msg");
        if (this.a.compareTo((Enum) bVar) <= 0) {
            int ordinal = bVar.ordinal();
            if (ordinal == 0) {
                Log.d("[Koin]", str);
            } else if (ordinal != 1) {
                Log.e("[Koin]", str);
            } else {
                Log.i("[Koin]", str);
            }
        }
    }
}
