package c.b.a.c0.k;

import c.b.a.a0.b.c;
import c.b.a.a0.b.d;
import c.b.a.c0.l.b;
import c.c.a.a.a;
import java.util.Arrays;
import java.util.List;

public class m implements b {
    public final String a;
    public final List<b> b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f586c;

    public m(String str, List<b> list, boolean z) {
        this.a = str;
        this.b = list;
        this.f586c = z;
    }

    @Override // c.b.a.c0.k.b
    public c a(c.b.a.m mVar, b bVar) {
        return new d(mVar, bVar, this);
    }

    public String toString() {
        StringBuilder f2 = a.f("ShapeGroup{name='");
        f2.append(this.a);
        f2.append("' Shapes: ");
        f2.append(Arrays.toString(this.b.toArray()));
        f2.append('}');
        return f2.toString();
    }
}
