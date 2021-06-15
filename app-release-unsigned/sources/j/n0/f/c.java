package j.n0.f;

import h.a.t.a;
import i.s.c.h;
import j.n0.f.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

public final class c {
    public boolean a;
    public a b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f3475c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f3476d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3477f;

    public c(d dVar, String str) {
        h.f(dVar, "taskRunner");
        h.f(str, "name");
        this.e = dVar;
        this.f3477f = str;
    }

    public final void a() {
        byte[] bArr = j.n0.c.a;
        synchronized (this.e) {
            if (b()) {
                this.e.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.b;
        if (aVar != null) {
            if (aVar == null) {
                h.j();
                throw null;
            } else if (aVar.f3474d) {
                this.f3476d = true;
            }
        }
        boolean z = false;
        for (int size = this.f3475c.size() - 1; size >= 0; size--) {
            if (this.f3475c.get(size).f3474d) {
                a aVar2 = this.f3475c.get(size);
                d.b bVar = d.f3478c;
                if (d.b.isLoggable(Level.FINE)) {
                    a.a(aVar2, this, "canceled");
                }
                this.f3475c.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(a aVar, long j2) {
        h.f(aVar, "task");
        synchronized (this.e) {
            if (!this.a) {
                if (d(aVar, j2, false)) {
                    this.e.e(this);
                }
            } else if (aVar.f3474d) {
                d.b bVar = d.f3478c;
                if (d.b.isLoggable(Level.FINE)) {
                    a.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                d.b bVar2 = d.f3478c;
                if (d.b.isLoggable(Level.FINE)) {
                    a.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z) {
        StringBuilder sb;
        String str;
        h.f(aVar, "task");
        h.f(this, "queue");
        c cVar = aVar.a;
        if (cVar != this) {
            if (cVar == null) {
                aVar.a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long c2 = this.e.f3484j.c();
        long j3 = c2 + j2;
        int indexOf = this.f3475c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.b <= j3) {
                d.b bVar = d.f3478c;
                if (d.b.isLoggable(Level.FINE)) {
                    a.a(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f3475c.remove(indexOf);
        }
        aVar.b = j3;
        d.b bVar2 = d.f3478c;
        if (d.b.isLoggable(Level.FINE)) {
            if (z) {
                sb = new StringBuilder();
                str = "run again after ";
            } else {
                sb = new StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(a.s(j3 - c2));
            a.a(aVar, this, sb.toString());
        }
        Iterator<a> it = this.f3475c.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().b - c2 > j2) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            i2 = this.f3475c.size();
        }
        this.f3475c.add(i2, aVar);
        return i2 == 0;
    }

    public final void e() {
        byte[] bArr = j.n0.c.a;
        synchronized (this.e) {
            this.a = true;
            if (b()) {
                this.e.e(this);
            }
        }
    }

    public String toString() {
        return this.f3477f;
    }
}
