package g.q.c;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class m implements Runnable {
    public static final ThreadLocal<m> e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    public static Comparator<c> f2929f = new a();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<RecyclerView> f2930g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public long f2931h;

    /* renamed from: i  reason: collision with root package name */
    public long f2932i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<c> f2933j = new ArrayList<>();

    public class a implements Comparator<c> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r0 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return -1;
         */
        @Override // java.util.Comparator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(g.q.c.m.c r7, g.q.c.m.c r8) {
            /*
                r6 = this;
                g.q.c.m$c r7 = (g.q.c.m.c) r7
                g.q.c.m$c r8 = (g.q.c.m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2937d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r3 = r2
                goto L_0x000d
            L_0x000c:
                r3 = r1
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2937d
                if (r4 != 0) goto L_0x0013
                r4 = r2
                goto L_0x0014
            L_0x0013:
                r4 = r1
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001d
                if (r0 != 0) goto L_0x001b
            L_0x0019:
                r1 = r2
                goto L_0x0037
            L_0x001b:
                r1 = r5
                goto L_0x0037
            L_0x001d:
                boolean r0 = r7.a
                boolean r3 = r8.a
                if (r0 == r3) goto L_0x0026
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0026:
                int r0 = r8.b
                int r2 = r7.b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x002f
                r1 = r0
                goto L_0x0037
            L_0x002f:
                int r7 = r7.f2936c
                int r8 = r8.f2936c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0037
                r1 = r7
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g.q.c.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.l.c {
        public int a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f2934c;

        /* renamed from: d  reason: collision with root package name */
        public int f2935d;

        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i3 >= 0) {
                int i4 = this.f2935d * 2;
                int[] iArr = this.f2934c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2934c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[(i4 * 2)];
                    this.f2934c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f2934c;
                iArr4[i4] = i2;
                iArr4[i4 + 1] = i3;
                this.f2935d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public void b(RecyclerView recyclerView, boolean z) {
            this.f2935d = 0;
            int[] iArr = this.f2934c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.l lVar = recyclerView.s;
            if (recyclerView.r != null && lVar != null && lVar.f251k) {
                if (z) {
                    if (!recyclerView.f237k.g()) {
                        lVar.j(recyclerView.r.a(), this);
                    }
                } else if (!recyclerView.M()) {
                    lVar.i(this.a, this.b, recyclerView.m0, this);
                }
                int i2 = this.f2935d;
                if (i2 > lVar.f252l) {
                    lVar.f252l = i2;
                    lVar.f253m = z;
                    recyclerView.f235i.l();
                }
            }
        }

        public boolean c(int i2) {
            if (this.f2934c != null) {
                int i3 = this.f2935d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f2934c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class c {
        public boolean a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f2936c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f2937d;
        public int e;
    }

    public void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f2931h == 0) {
            this.f2931h = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.l0;
        bVar.a = i2;
        bVar.b = i3;
    }

    public void b(long j2) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f2930g.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = this.f2930g.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.l0.b(recyclerView3, false);
                i2 += recyclerView3.l0.f2935d;
            }
        }
        this.f2933j.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = this.f2930g.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.l0;
                int abs = Math.abs(bVar.b) + Math.abs(bVar.a);
                for (int i6 = 0; i6 < bVar.f2935d * 2; i6 += 2) {
                    if (i4 >= this.f2933j.size()) {
                        cVar2 = new c();
                        this.f2933j.add(cVar2);
                    } else {
                        cVar2 = this.f2933j.get(i4);
                    }
                    int[] iArr = bVar.f2934c;
                    int i7 = iArr[i6 + 1];
                    cVar2.a = i7 <= abs;
                    cVar2.b = abs;
                    cVar2.f2936c = i7;
                    cVar2.f2937d = recyclerView4;
                    cVar2.e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f2933j, f2929f);
        int i8 = 0;
        while (i8 < this.f2933j.size() && (recyclerView = (cVar = this.f2933j.get(i8)).f2937d) != null) {
            RecyclerView.z c2 = c(recyclerView, cVar.e, cVar.a ? Long.MAX_VALUE : j2);
            if (!(c2 == null || c2.f291c == null || !c2.j() || c2.k() || (recyclerView2 = c2.f291c.get()) == null)) {
                if (recyclerView2.I && recyclerView2.f238l.h() != 0) {
                    recyclerView2.d0();
                }
                b bVar2 = recyclerView2.l0;
                bVar2.b(recyclerView2, true);
                if (bVar2.f2935d != 0) {
                    try {
                        int i9 = g.h.f.b.a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.w wVar = recyclerView2.m0;
                        RecyclerView.d dVar = recyclerView2.r;
                        wVar.f276d = 1;
                        wVar.e = dVar.a();
                        wVar.f278g = false;
                        wVar.f279h = false;
                        wVar.f280i = false;
                        for (int i10 = 0; i10 < bVar2.f2935d * 2; i10 += 2) {
                            c(recyclerView2, bVar2.f2934c[i10], j2);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i11 = g.h.f.b.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.a = false;
            cVar.b = 0;
            cVar.f2936c = 0;
            cVar.f2937d = null;
            cVar.e = 0;
            i8++;
        }
    }

    public final RecyclerView.z c(RecyclerView recyclerView, int i2, long j2) {
        boolean z;
        int h2 = recyclerView.f238l.h();
        int i3 = 0;
        while (true) {
            if (i3 >= h2) {
                z = false;
                break;
            }
            RecyclerView.z K = RecyclerView.K(recyclerView.f238l.g(i3));
            if (K.f292d == i2 && !K.k()) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            return null;
        }
        RecyclerView.r rVar = recyclerView.f235i;
        try {
            recyclerView.U();
            RecyclerView.z j3 = rVar.j(i2, false, j2);
            if (j3 != null) {
                if (!j3.j() || j3.k()) {
                    rVar.a(j3, false);
                } else {
                    rVar.g(j3.b);
                }
            }
            return j3;
        } finally {
            recyclerView.V(false);
        }
    }

    public void run() {
        try {
            int i2 = g.h.f.b.a;
            Trace.beginSection("RV Prefetch");
            if (this.f2930g.isEmpty()) {
                this.f2931h = 0;
                Trace.endSection();
                return;
            }
            int size = this.f2930g.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = this.f2930g.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f2931h = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2932i);
            this.f2931h = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f2931h = 0;
            int i4 = g.h.f.b.a;
            Trace.endSection();
            throw th;
        }
    }
}
