package c.d.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import c.d.a.m.v.k;
import c.d.a.m.v.l;
import c.d.a.n.r;
import c.d.a.q.b;
import c.d.a.q.c;
import c.d.a.q.d;
import c.d.a.q.e;
import c.d.a.q.f;
import c.d.a.q.i;
import c.d.a.s.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class h<TranscodeType> extends c.d.a.q.a<h<TranscodeType>> implements Cloneable {
    public final Context E;
    public final i F;
    public final Class<TranscodeType> G;
    public final d H;
    public j<?, ? super TranscodeType> I;
    public Object J;
    public List<e<TranscodeType>> K;
    public h<TranscodeType> L;
    public h<TranscodeType> M;
    public boolean N = true;
    public boolean O;
    public boolean P;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|8|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|8|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
        static {
            /*
            // Method dump skipped, instructions count: 119
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.a.h.a.<clinit>():void");
        }
    }

    static {
        f fVar = (f) ((f) ((f) new f().g(k.b)).l(f.LOW)).q(true);
    }

    @SuppressLint({"CheckResult"})
    public h(b bVar, i iVar, Class<TranscodeType> cls, Context context) {
        f fVar;
        this.F = iVar;
        this.G = cls;
        this.E = context;
        d dVar = iVar.f759f.f725i;
        j<?, ?> jVar = dVar.f743g.get(cls);
        if (jVar == null) {
            for (Map.Entry<Class<?>, j<?, ?>> entry : dVar.f743g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    jVar = (j<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.I = (j<?, ? super TranscodeType>) (jVar == null ? (j<?, ? super TranscodeType>) d.a : jVar);
        this.H = bVar.f725i;
        for (e<Object> eVar : iVar.n) {
            x(eVar);
        }
        synchronized (iVar) {
            fVar = iVar.o;
        }
        a(fVar);
    }

    /* renamed from: A */
    public h<TranscodeType> d() {
        h<TranscodeType> hVar = (h) super.clone();
        hVar.I = hVar.I.a();
        if (hVar.K != null) {
            hVar.K = new ArrayList(hVar.K);
        }
        h<TranscodeType> hVar2 = hVar.L;
        if (hVar2 != null) {
            hVar.L = hVar2.d();
        }
        h<TranscodeType> hVar3 = hVar.M;
        if (hVar3 != null) {
            hVar.M = hVar3.d();
        }
        return hVar;
    }

    public final f B(f fVar) {
        int ordinal = fVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return f.IMMEDIATE;
        }
        if (ordinal == 2) {
            return f.HIGH;
        }
        if (ordinal == 3) {
            return f.NORMAL;
        }
        StringBuilder f2 = c.c.a.a.a.f("unknown priority: ");
        f2.append(this.f1129h);
        throw new IllegalArgumentException(f2.toString());
    }

    public final <Y extends c.d.a.q.j.h<TranscodeType>> Y C(Y y, e<TranscodeType> eVar, c.d.a.q.a<?> aVar, Executor executor) {
        Objects.requireNonNull(y, "Argument must not be null");
        if (this.O) {
            c z = z(new Object(), y, eVar, null, this.I, aVar.f1129h, aVar.o, aVar.n, aVar, executor);
            c f2 = y.f();
            if (z.h(f2)) {
                if (!(!aVar.f1134m && f2.i())) {
                    Objects.requireNonNull(f2, "Argument must not be null");
                    if (!f2.isRunning()) {
                        f2.f();
                    }
                    return y;
                }
            }
            this.F.l(y);
            y.j(z);
            i iVar = this.F;
            synchronized (iVar) {
                iVar.f764k.e.add(y);
                r rVar = iVar.f762i;
                rVar.a.add(z);
                if (!rVar.f1124c) {
                    z.f();
                } else {
                    z.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    rVar.b.add(z);
                }
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c.d.a.q.j.i<android.widget.ImageView, TranscodeType> D(android.widget.ImageView r5) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.h.D(android.widget.ImageView):c.d.a.q.j.i");
    }

    public final h<TranscodeType> E(Object obj) {
        if (this.z) {
            return d().E(obj);
        }
        this.J = obj;
        this.O = true;
        m();
        return this;
    }

    public final c F(Object obj, c.d.a.q.j.h<TranscodeType> hVar, e<TranscodeType> eVar, c.d.a.q.a<?> aVar, d dVar, j<?, ? super TranscodeType> jVar, f fVar, int i2, int i3, Executor executor) {
        Context context = this.E;
        d dVar2 = this.H;
        Object obj2 = this.J;
        Class<TranscodeType> cls = this.G;
        List<e<TranscodeType>> list = this.K;
        l lVar = dVar2.f744h;
        Objects.requireNonNull(jVar);
        return new c.d.a.q.h(context, dVar2, obj, obj2, cls, aVar, i2, i3, fVar, hVar, eVar, list, dVar, lVar, c.d.a.q.k.a.b, executor);
    }

    public h<TranscodeType> x(e<TranscodeType> eVar) {
        if (this.z) {
            return d().x(eVar);
        }
        if (eVar != null) {
            if (this.K == null) {
                this.K = new ArrayList();
            }
            this.K.add(eVar);
        }
        m();
        return this;
    }

    /* renamed from: y */
    public h<TranscodeType> a(c.d.a.q.a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (h) super.a(aVar);
    }

    public final c z(Object obj, c.d.a.q.j.h<TranscodeType> hVar, e<TranscodeType> eVar, d dVar, j<?, ? super TranscodeType> jVar, f fVar, int i2, int i3, c.d.a.q.a<?> aVar, Executor executor) {
        b bVar;
        b bVar2;
        i iVar;
        int i4;
        int i5;
        f fVar2;
        int i6;
        int i7;
        if (this.M != null) {
            b bVar3 = new b(obj, dVar);
            bVar = bVar3;
            bVar2 = bVar3;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        h<TranscodeType> hVar2 = this.L;
        if (hVar2 == null) {
            iVar = F(obj, hVar, eVar, aVar, bVar2, jVar, fVar, i2, i3, executor);
        } else if (!this.P) {
            j<?, ? super TranscodeType> jVar2 = hVar2.N ? jVar : hVar2.I;
            if (c.d.a.q.a.h(hVar2.e, 8)) {
                fVar2 = this.L.f1129h;
            } else {
                fVar2 = B(fVar);
            }
            h<TranscodeType> hVar3 = this.L;
            int i8 = hVar3.o;
            int i9 = hVar3.n;
            if (j.k(i2, i3)) {
                h<TranscodeType> hVar4 = this.L;
                if (!j.k(hVar4.o, hVar4.n)) {
                    i7 = aVar.o;
                    i6 = aVar.n;
                    i iVar2 = new i(obj, bVar2);
                    c F2 = F(obj, hVar, eVar, aVar, iVar2, jVar, fVar, i2, i3, executor);
                    this.P = true;
                    h<TranscodeType> hVar5 = this.L;
                    c z = hVar5.z(obj, hVar, eVar, iVar2, jVar2, fVar2, i7, i6, hVar5, executor);
                    this.P = false;
                    iVar2.f1148c = F2;
                    iVar2.f1149d = z;
                    iVar = iVar2;
                }
            }
            i6 = i9;
            i7 = i8;
            i iVar22 = new i(obj, bVar2);
            c F22 = F(obj, hVar, eVar, aVar, iVar22, jVar, fVar, i2, i3, executor);
            this.P = true;
            h<TranscodeType> hVar52 = this.L;
            c z2 = hVar52.z(obj, hVar, eVar, iVar22, jVar2, fVar2, i7, i6, hVar52, executor);
            this.P = false;
            iVar22.f1148c = F22;
            iVar22.f1149d = z2;
            iVar = iVar22;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return iVar;
        }
        h<TranscodeType> hVar6 = this.M;
        int i10 = hVar6.o;
        int i11 = hVar6.n;
        if (j.k(i2, i3)) {
            h<TranscodeType> hVar7 = this.M;
            if (!j.k(hVar7.o, hVar7.n)) {
                i5 = aVar.o;
                i4 = aVar.n;
                h<TranscodeType> hVar8 = this.M;
                c z3 = hVar8.z(obj, hVar, eVar, bVar, hVar8.I, hVar8.f1129h, i5, i4, hVar8, executor);
                bVar.f1135c = iVar;
                bVar.f1136d = z3;
                return bVar;
            }
        }
        i4 = i11;
        i5 = i10;
        h<TranscodeType> hVar82 = this.M;
        c z32 = hVar82.z(obj, hVar, eVar, bVar, hVar82.I, hVar82.f1129h, i5, i4, hVar82, executor);
        bVar.f1135c = iVar;
        bVar.f1136d = z32;
        return bVar;
    }
}
