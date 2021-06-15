package g.f.c.i.m;

import c.c.a.a.a;
import g.f.c.i.d;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends o {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<o> f2355k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public int f2356l;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r2 == 1) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(g.f.c.i.d r4, int r5) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.m.c.<init>(g.f.c.i.d, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d7  */
    @Override // g.f.c.i.m.d, g.f.c.i.m.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(g.f.c.i.m.d r26) {
        /*
        // Method dump skipped, instructions count: 991
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.m.c.a(g.f.c.i.m.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
        if (r1 != null) goto L_0x0078;
     */
    @Override // g.f.c.i.m.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.m.c.d():void");
    }

    @Override // g.f.c.i.m.o
    public void e() {
        for (int i2 = 0; i2 < this.f2355k.size(); i2++) {
            this.f2355k.get(i2).e();
        }
    }

    @Override // g.f.c.i.m.o
    public void f() {
        this.f2387c = null;
        Iterator<o> it = this.f2355k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // g.f.c.i.m.o
    public long j() {
        int size = this.f2355k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = this.f2355k.get(i2);
            j2 = ((long) oVar.f2392i.f2364f) + oVar.j() + j2 + ((long) oVar.f2391h.f2364f);
        }
        return j2;
    }

    @Override // g.f.c.i.m.o
    public boolean k() {
        int size = this.f2355k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f2355k.get(i2).k()) {
                return false;
            }
        }
        return true;
    }

    public final d m() {
        for (int i2 = 0; i2 < this.f2355k.size(); i2++) {
            d dVar = this.f2355k.get(i2).b;
            if (dVar.c0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final d n() {
        for (int size = this.f2355k.size() - 1; size >= 0; size--) {
            d dVar = this.f2355k.get(size).b;
            if (dVar.c0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder f2 = a.f("ChainRun ");
        f2.append(this.f2389f == 0 ? "horizontal : " : "vertical : ");
        String sb = f2.toString();
        Iterator<o> it = this.f2355k.iterator();
        while (it.hasNext()) {
            String q = a.q(sb, "<");
            sb = a.q(q + it.next(), "> ");
        }
        return sb;
    }
}
