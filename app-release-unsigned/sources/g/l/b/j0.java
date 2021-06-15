package g.l.b;

import g.n.e;
import java.util.ArrayList;

public abstract class j0 {
    public ArrayList<a> a = new ArrayList<>();
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f2696c;

    /* renamed from: d  reason: collision with root package name */
    public int f2697d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f2698f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2699g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2700h = true;

    /* renamed from: i  reason: collision with root package name */
    public String f2701i;

    /* renamed from: j  reason: collision with root package name */
    public int f2702j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2703k;

    /* renamed from: l  reason: collision with root package name */
    public int f2704l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2705m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public boolean p = false;

    public static final class a {
        public int a;
        public m b;

        /* renamed from: c  reason: collision with root package name */
        public int f2706c;

        /* renamed from: d  reason: collision with root package name */
        public int f2707d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f2708f;

        /* renamed from: g  reason: collision with root package name */
        public e.b f2709g;

        /* renamed from: h  reason: collision with root package name */
        public e.b f2710h;

        public a() {
        }

        public a(int i2, m mVar) {
            this.a = i2;
            this.b = mVar;
            e.b bVar = e.b.RESUMED;
            this.f2709g = bVar;
            this.f2710h = bVar;
        }
    }

    public j0(x xVar, ClassLoader classLoader) {
    }

    public void b(a aVar) {
        this.a.add(aVar);
        aVar.f2706c = this.b;
        aVar.f2707d = this.f2696c;
        aVar.e = this.f2697d;
        aVar.f2708f = this.e;
    }

    public abstract int c();

    public abstract void d(int i2, m mVar, String str, int i3);

    public j0 e(int i2, m mVar) {
        if (i2 != 0) {
            d(i2, mVar, null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
