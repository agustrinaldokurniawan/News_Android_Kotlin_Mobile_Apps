package c.d.a.m.x.f;

import c.d.a.m.v.w;
import java.io.File;
import java.util.Objects;

public class b implements w {
    public final T e;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.io.File */
    /* JADX WARN: Multi-variable type inference failed */
    public b(File file) {
        Objects.requireNonNull(file, "Argument must not be null");
        this.e = file;
    }

    @Override // c.d.a.m.v.w
    public final /* bridge */ /* synthetic */ int b() {
        return 1;
    }

    @Override // c.d.a.m.v.w
    public Class c() {
        return this.e.getClass();
    }

    @Override // c.d.a.m.v.w
    public void d() {
    }

    @Override // c.d.a.m.v.w
    public final Object get() {
        return this.e;
    }
}
