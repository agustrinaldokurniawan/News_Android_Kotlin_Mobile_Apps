package g.r;

import g.t.a.d;
import g.t.a.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class l implements e, d {
    public static final TreeMap<Integer, l> e = new TreeMap<>();

    /* renamed from: f  reason: collision with root package name */
    public volatile String f2986f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f2987g;

    /* renamed from: h  reason: collision with root package name */
    public final double[] f2988h;

    /* renamed from: i  reason: collision with root package name */
    public final String[] f2989i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[][] f2990j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f2991k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2992l;

    /* renamed from: m  reason: collision with root package name */
    public int f2993m;

    public l(int i2) {
        this.f2992l = i2;
        int i3 = i2 + 1;
        this.f2991k = new int[i3];
        this.f2987g = new long[i3];
        this.f2988h = new double[i3];
        this.f2989i = new String[i3];
        this.f2990j = new byte[i3][];
    }

    public static l e(String str, int i2) {
        TreeMap<Integer, l> treeMap = e;
        synchronized (treeMap) {
            Map.Entry<Integer, l> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                l value = ceilingEntry.getValue();
                value.f2986f = str;
                value.f2993m = i2;
                return value;
            }
            l lVar = new l(i2);
            lVar.f2986f = str;
            lVar.f2993m = i2;
            return lVar;
        }
    }

    @Override // g.t.a.d
    public void H(int i2, byte[] bArr) {
        this.f2991k[i2] = 5;
        this.f2990j[i2] = bArr;
    }

    @Override // g.t.a.d
    public void I(int i2) {
        this.f2991k[i2] = 1;
    }

    @Override // g.t.a.d
    public void L(int i2, double d2) {
        this.f2991k[i2] = 3;
        this.f2988h[i2] = d2;
    }

    @Override // g.t.a.e
    public String b() {
        return this.f2986f;
    }

    @Override // g.t.a.e
    public void c(d dVar) {
        for (int i2 = 1; i2 <= this.f2993m; i2++) {
            int i3 = this.f2991k[i2];
            if (i3 == 1) {
                dVar.I(i2);
            } else if (i3 == 2) {
                dVar.y(i2, this.f2987g[i2]);
            } else if (i3 == 3) {
                dVar.L(i2, this.f2988h[i2]);
            } else if (i3 == 4) {
                dVar.x(i2, this.f2989i[i2]);
            } else if (i3 == 5) {
                dVar.H(i2, this.f2990j[i2]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void n() {
        TreeMap<Integer, l> treeMap = e;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f2992l), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // g.t.a.d
    public void x(int i2, String str) {
        this.f2991k[i2] = 4;
        this.f2989i[i2] = str;
    }

    @Override // g.t.a.d
    public void y(int i2, long j2) {
        this.f2991k[i2] = 2;
        this.f2987g[i2] = j2;
    }
}
