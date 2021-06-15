package c.d.a.m.v.c0;

import android.graphics.Bitmap;
import android.os.Build;
import c.d.a.s.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class m implements k {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config[] b;

    /* renamed from: c  reason: collision with root package name */
    public static final Bitmap.Config[] f872c = {Bitmap.Config.RGB_565};

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f873d = {Bitmap.Config.ARGB_4444};
    public static final Bitmap.Config[] e = {Bitmap.Config.ALPHA_8};

    /* renamed from: f  reason: collision with root package name */
    public final c f874f = new c();

    /* renamed from: g  reason: collision with root package name */
    public final g<b, Bitmap> f875g = new g<>();

    /* renamed from: h  reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f876h = new HashMap();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c.d.a.m.v.c0.m.a.a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = c.d.a.m.v.c0.m.a.a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = c.d.a.m.v.c0.m.a.a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = c.d.a.m.v.c0.m.a.a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.v.c0.m.a.<clinit>():void");
        }
    }

    public static final class b implements l {
        public final c a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f877c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // c.d.a.m.v.c0.l
        public void a() {
            this.a.c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && j.b(this.f877c, bVar.f877c);
        }

        public int hashCode() {
            int i2 = this.b * 31;
            Bitmap.Config config = this.f877c;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.c(this.b, this.f877c);
        }
    }

    public static class c extends c<b> {
        /* Return type fixed from 'c.d.a.m.v.c0.l' to match base method */
        @Override // c.d.a.m.v.c0.c
        public b a() {
            return new b(this);
        }

        public b d(int i2, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b = i2;
            bVar.f877c = config;
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        a = configArr;
        b = configArr;
    }

    public static String c(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d2.remove(num);
        } else {
            d2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int c2 = j.c(i2, i3, config);
        b bVar = (b) this.f874f.b();
        bVar.b = c2;
        bVar.f877c = config;
        int i4 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i5 = a.a[config.ordinal()];
            if (i5 == 1) {
                configArr = a;
            } else if (i5 == 2) {
                configArr = f872c;
            } else if (i5 != 3) {
                configArr = i5 != 4 ? new Bitmap.Config[]{config} : e;
            } else {
                configArr = f873d;
            }
        } else {
            configArr = b;
        }
        int length = configArr.length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(c2));
            if (ceilingKey == null || ceilingKey.intValue() > c2 * 8) {
                i4++;
            } else if (ceilingKey.intValue() != c2 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f874f.c(bVar);
                bVar = this.f874f.d(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a2 = this.f875g.a(bVar);
        if (a2 != null) {
            a(Integer.valueOf(bVar.b), a2);
            a2.reconfigure(i2, i3, config);
        }
        return a2;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f876h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f876h.put(config, treeMap);
        return treeMap;
    }

    public String e(Bitmap bitmap) {
        return c(j.d(bitmap), bitmap.getConfig());
    }

    public void f(Bitmap bitmap) {
        b d2 = this.f874f.d(j.d(bitmap), bitmap.getConfig());
        this.f875g.b(d2, bitmap);
        NavigableMap<Integer, Integer> d3 = d(bitmap.getConfig());
        Integer num = (Integer) d3.get(Integer.valueOf(d2.b));
        Integer valueOf = Integer.valueOf(d2.b);
        int i2 = 1;
        if (num != null) {
            i2 = 1 + num.intValue();
        }
        d3.put(valueOf, Integer.valueOf(i2));
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("SizeConfigStrategy{groupedMap=");
        f2.append(this.f875g);
        f2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f876h.entrySet()) {
            f2.append(entry.getKey());
            f2.append('[');
            f2.append(entry.getValue());
            f2.append("], ");
        }
        if (!this.f876h.isEmpty()) {
            f2.replace(f2.length() - 2, f2.length(), "");
        }
        f2.append(")}");
        return f2.toString();
    }
}
