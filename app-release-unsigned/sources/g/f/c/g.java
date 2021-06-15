package g.f.c;

import android.graphics.Paint;

public /* synthetic */ class g {
    public static /* synthetic */ int[] a;
    public static /* synthetic */ int[] b;

    /* renamed from: c  reason: collision with root package name */
    public static /* synthetic */ int[] f2283c;

    /* renamed from: d  reason: collision with root package name */
    public static /* synthetic */ int[] f2284d;
    public static /* synthetic */ int[] e;

    /* renamed from: f  reason: collision with root package name */
    public static /* synthetic */ int[] f2285f;

    /* renamed from: g  reason: collision with root package name */
    public static /* synthetic */ int[] f2286g;

    /* renamed from: h  reason: collision with root package name */
    public static /* synthetic */ int[] f2287h;

    /* renamed from: i  reason: collision with root package name */
    public static /* synthetic */ int[] f2288i;

    /* renamed from: j  reason: collision with root package name */
    public static /* synthetic */ int[] f2289j;

    /* renamed from: k  reason: collision with root package name */
    public static /* synthetic */ int[] f2290k;

    /* renamed from: l  reason: collision with root package name */
    public static /* synthetic */ int[] f2291l;

    /* renamed from: m  reason: collision with root package name */
    public static /* synthetic */ int[] f2292m;
    public static /* synthetic */ int[] n;
    public static /* synthetic */ int[] o;
    public static /* synthetic */ int[] p;
    public static /* synthetic */ int[] q;
    public static /* synthetic */ int[] r;
    public static /* synthetic */ int[] s;
    public static /* synthetic */ int[] t;
    public static /* synthetic */ int[] u;

    public static synchronized /* synthetic */ int[] a() {
        int[] iArr;
        synchronized (g.class) {
            if (f2286g == null) {
                f2286g = g(3);
            }
            iArr = f2286g;
        }
        return iArr;
    }

    public static synchronized /* synthetic */ int[] b() {
        int[] iArr;
        synchronized (g.class) {
            if (f2289j == null) {
                f2289j = g(2);
            }
            iArr = f2289j;
        }
        return iArr;
    }

    public static synchronized /* synthetic */ int[] c() {
        int[] iArr;
        synchronized (g.class) {
            if (f2290k == null) {
                f2290k = g(3);
            }
            iArr = f2290k;
        }
        return iArr;
    }

    public static int[] com$airbnb$lottie$model$DocumentData$Justification$s$values() {
        return (int[]) a().clone();
    }

    public static int[] com$airbnb$lottie$model$content$PolystarShape$Type$s$values() {
        return (int[]) b().clone();
    }

    public static int[] com$airbnb$lottie$model$content$ShapeStroke$LineCapType$s$values() {
        return (int[]) c().clone();
    }

    public static int[] com$airbnb$lottie$model$content$ShapeStroke$LineJoinType$s$values() {
        return (int[]) d().clone();
    }

    public static int[] com$airbnb$lottie$model$layer$Layer$MatteType$s$values() {
        return (int[]) e().clone();
    }

    public static synchronized /* synthetic */ int[] d() {
        int[] iArr;
        synchronized (g.class) {
            if (f2291l == null) {
                f2291l = g(3);
            }
            iArr = f2291l;
        }
        return iArr;
    }

    public static synchronized /* synthetic */ int[] e() {
        int[] iArr;
        synchronized (g.class) {
            if (n == null) {
                n = g(6);
            }
            iArr = n;
        }
        return iArr;
    }

    public static /* synthetic */ int f(int i2) {
        if (i2 != 0) {
            return i2 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] g(int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            iArr[i3] = i4;
            i3 = i4;
        }
        return iArr;
    }

    public static Paint.Cap h(int i2) {
        int f2 = f(i2);
        return f2 != 0 ? f2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }

    public static Paint.Join i(int i2) {
        int f2 = f(i2);
        if (f2 == 0) {
            return Paint.Join.MITER;
        }
        if (f2 == 1) {
            return Paint.Join.ROUND;
        }
        if (f2 != 2) {
            return null;
        }
        return Paint.Join.BEVEL;
    }

    public static /* synthetic */ boolean j(int i2) {
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return false;
        }
        if (i2 == 4 || i2 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ int k(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        throw null;
    }
}
