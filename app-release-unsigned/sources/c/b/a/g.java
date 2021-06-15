package c.b.a;

import android.graphics.Rect;
import c.b.a.c0.c;
import c.b.a.c0.d;
import c.b.a.c0.h;
import c.b.a.c0.l.e;
import g.e.i;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class g {
    public final v a = new v();
    public final HashSet<String> b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<e>> f665c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, n> f666d;
    public Map<String, c> e;

    /* renamed from: f  reason: collision with root package name */
    public List<h> f667f;

    /* renamed from: g  reason: collision with root package name */
    public i<d> f668g;

    /* renamed from: h  reason: collision with root package name */
    public g.e.e<e> f669h;

    /* renamed from: i  reason: collision with root package name */
    public List<e> f670i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f671j;

    /* renamed from: k  reason: collision with root package name */
    public float f672k;

    /* renamed from: l  reason: collision with root package name */
    public float f673l;

    /* renamed from: m  reason: collision with root package name */
    public float f674m;
    public boolean n;
    public int o = 0;

    public void a(String str) {
        c.b.a.f0.c.b(str);
        this.b.add(str);
    }

    public float b() {
        return (float) ((long) ((c() / this.f674m) * 1000.0f));
    }

    public float c() {
        return this.f673l - this.f672k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r4.substring(0, r4.length() - 1).equalsIgnoreCase(r8) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c.b.a.c0.h d(java.lang.String r8) {
        /*
            r7 = this;
            java.util.List<c.b.a.c0.h> r0 = r7.f667f
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L_0x0008:
            if (r2 >= r0) goto L_0x003f
            java.util.List<c.b.a.c0.h> r3 = r7.f667f
            java.lang.Object r3 = r3.get(r2)
            c.b.a.c0.h r3 = (c.b.a.c0.h) r3
            java.lang.String r4 = r3.a
            boolean r4 = r4.equalsIgnoreCase(r8)
            r5 = 1
            if (r4 == 0) goto L_0x001c
            goto L_0x0039
        L_0x001c:
            java.lang.String r4 = r3.a
            java.lang.String r6 = "\r"
            boolean r4 = r4.endsWith(r6)
            if (r4 == 0) goto L_0x0038
            java.lang.String r4 = r3.a
            int r6 = r4.length()
            int r6 = r6 - r5
            java.lang.String r4 = r4.substring(r1, r6)
            boolean r4 = r4.equalsIgnoreCase(r8)
            if (r4 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r5 = r1
        L_0x0039:
            if (r5 == 0) goto L_0x003c
            return r3
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x003f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.g.d(java.lang.String):c.b.a.c0.h");
    }

    public e e(long j2) {
        return this.f669h.h(j2, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (e eVar : this.f670i) {
            sb.append(eVar.a("\t"));
        }
        return sb.toString();
    }
}
