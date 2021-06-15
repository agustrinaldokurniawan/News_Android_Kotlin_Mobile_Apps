package c.d.a.m.x.g;

import android.util.Log;
import c.d.a.m.c;
import c.d.a.m.p;
import c.d.a.m.s;
import c.d.a.m.v.w;
import c.d.a.s.a;
import java.io.File;
import java.io.IOException;

public class d implements s<c> {
    @Override // c.d.a.m.d
    public boolean a(Object obj, File file, p pVar) {
        try {
            a.b(((c) ((w) obj).get()).e.a.a.g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // c.d.a.m.s
    public c b(p pVar) {
        return c.SOURCE;
    }
}
