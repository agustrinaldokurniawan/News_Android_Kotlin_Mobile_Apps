package c.d.a.n;

import c.d.a.q.j.h;
import c.d.a.s.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class t implements m {
    public final Set<h<?>> e = Collections.newSetFromMap(new WeakHashMap());

    @Override // c.d.a.n.m
    public void e() {
        Iterator it = ((ArrayList) j.e(this.e)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).e();
        }
    }

    @Override // c.d.a.n.m
    public void i() {
        Iterator it = ((ArrayList) j.e(this.e)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).i();
        }
    }

    @Override // c.d.a.n.m
    public void k() {
        Iterator it = ((ArrayList) j.e(this.e)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).k();
        }
    }
}
