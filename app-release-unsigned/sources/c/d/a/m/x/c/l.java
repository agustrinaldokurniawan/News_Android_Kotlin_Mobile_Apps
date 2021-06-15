package c.d.a.m.x.c;

import c.d.a.m.o;

public abstract class l {
    public static final l a = new c();
    public static final l b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final l f1043c;

    /* renamed from: d  reason: collision with root package name */
    public static final l f1044d = new d();
    public static final l e;

    /* renamed from: f  reason: collision with root package name */
    public static final o<l> f1045f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f1046g = true;

    public static class a extends l {
        @Override // c.d.a.m.x.c.l
        public int a(int i2, int i3, int i4, int i5) {
            return (b(i2, i3, i4, i5) != 1.0f && !l.f1046g) ? 1 : 2;
        }

        @Override // c.d.a.m.x.c.l
        public float b(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, l.a.b(i2, i3, i4, i5));
        }
    }

    public static class b extends l {
        @Override // c.d.a.m.x.c.l
        public int a(int i2, int i3, int i4, int i5) {
            return 2;
        }

        @Override // c.d.a.m.x.c.l
        public float b(int i2, int i3, int i4, int i5) {
            return Math.max(((float) i4) / ((float) i2), ((float) i5) / ((float) i3));
        }
    }

    public static class c extends l {
        @Override // c.d.a.m.x.c.l
        public int a(int i2, int i3, int i4, int i5) {
            return l.f1046g ? 2 : 1;
        }

        @Override // c.d.a.m.x.c.l
        public float b(int i2, int i3, int i4, int i5) {
            if (l.f1046g) {
                return Math.min(((float) i4) / ((float) i2), ((float) i5) / ((float) i3));
            }
            int max = Math.max(i3 / i5, i2 / i4);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    public static class d extends l {
        @Override // c.d.a.m.x.c.l
        public int a(int i2, int i3, int i4, int i5) {
            return 2;
        }

        @Override // c.d.a.m.x.c.l
        public float b(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }
    }

    static {
        b bVar = new b();
        f1043c = bVar;
        e = bVar;
        f1045f = o.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
    }

    public abstract int a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
