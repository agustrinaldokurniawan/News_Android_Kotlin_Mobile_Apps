package c.b.a.a0.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import c.b.a.a0.c.c;
import c.b.a.f0.g;
import java.util.ArrayList;
import java.util.List;

public class b {
    public List<s> a = new ArrayList();

    public void a(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            s sVar = this.a.get(size);
            ThreadLocal<PathMeasure> threadLocal = g.a;
            if (sVar != null && !sVar.a) {
                g.a(path, ((c) sVar.f485d).k() / 100.0f, ((c) sVar.e).k() / 100.0f, ((c) sVar.f486f).k() / 360.0f);
            }
        }
    }
}
