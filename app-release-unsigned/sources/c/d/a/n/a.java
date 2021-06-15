package c.d.a.n;

import c.d.a.s.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class a implements l {
    public final Set<m> a = Collections.newSetFromMap(new WeakHashMap());
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1107c;

    @Override // c.d.a.n.l
    public void a(m mVar) {
        this.a.add(mVar);
        if (this.f1107c) {
            mVar.k();
        } else if (this.b) {
            mVar.i();
        } else {
            mVar.e();
        }
    }

    @Override // c.d.a.n.l
    public void b(m mVar) {
        this.a.remove(mVar);
    }

    public void c() {
        this.f1107c = true;
        Iterator it = ((ArrayList) j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((m) it.next()).k();
        }
    }

    public void d() {
        this.b = true;
        Iterator it = ((ArrayList) j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((m) it.next()).i();
        }
    }

    public void e() {
        this.b = false;
        Iterator it = ((ArrayList) j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((m) it.next()).e();
        }
    }
}
