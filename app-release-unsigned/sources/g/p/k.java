package g.p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import g.e.i;
import g.p.j;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class k extends j implements Iterable<j> {

    /* renamed from: m  reason: collision with root package name */
    public final i<j> f2857m = new i<>();
    public int n;
    public String o;

    public class a implements Iterator<j> {
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2858f = false;

        public a() {
        }

        public boolean hasNext() {
            return this.e + 1 < k.this.f2857m.k();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public j next() {
            if (hasNext()) {
                this.f2858f = true;
                i<j> iVar = k.this.f2857m;
                int i2 = this.e + 1;
                this.e = i2;
                return iVar.l(i2);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f2858f) {
                k.this.f2857m.l(this.e).f2846f = null;
                i<j> iVar = k.this.f2857m;
                int i2 = this.e;
                Object[] objArr = iVar.f2254h;
                Object obj = objArr[i2];
                Object obj2 = i.e;
                if (obj != obj2) {
                    objArr[i2] = obj2;
                    iVar.f2252f = true;
                }
                this.e = i2 - 1;
                this.f2858f = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public k(q<? extends k> qVar) {
        super(qVar);
    }

    @Override // g.p.j
    public j.a d(i iVar) {
        j.a d2 = super.d(iVar);
        a aVar = new a();
        while (aVar.hasNext()) {
            j.a d3 = ((j) aVar.next()).d(iVar);
            if (d3 != null && (d2 == null || d3.compareTo(d2) > 0)) {
                d2 = d3;
            }
        }
        return d2;
    }

    @Override // g.p.j
    public void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g.p.t.a.f2880d);
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f2847g) {
            this.n = resourceId;
            this.o = null;
            this.o = j.c(context, resourceId);
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Start destination " + resourceId + " cannot use the same id as the graph " + this);
    }

    public final void f(j jVar) {
        int i2 = jVar.f2847g;
        if (i2 == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        } else if (i2 != this.f2847g) {
            j g2 = this.f2857m.g(i2);
            if (g2 != jVar) {
                if (jVar.f2846f == null) {
                    if (g2 != null) {
                        g2.f2846f = null;
                    }
                    jVar.f2846f = this;
                    this.f2857m.j(jVar.f2847g, jVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
        } else {
            throw new IllegalArgumentException("Destination " + jVar + " cannot have the same id as graph " + this);
        }
    }

    public final j g(int i2) {
        return h(i2, true);
    }

    public final j h(int i2, boolean z) {
        k kVar;
        j h2 = this.f2857m.h(i2, null);
        if (h2 != null) {
            return h2;
        }
        if (!z || (kVar = this.f2846f) == null) {
            return null;
        }
        return kVar.g(i2);
    }

    @Override // java.lang.Iterable
    public final Iterator<j> iterator() {
        return new a();
    }

    @Override // g.p.j
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        j g2 = g(this.n);
        if (g2 == null) {
            str = this.o;
            if (str == null) {
                sb.append("0x");
                str = Integer.toHexString(this.n);
            }
        } else {
            sb.append("{");
            sb.append(g2.toString());
            str = "}";
        }
        sb.append(str);
        return sb.toString();
    }
}
