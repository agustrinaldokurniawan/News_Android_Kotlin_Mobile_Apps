package g.b.g;

public class r0 {
    public int a = 0;
    public int b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2150c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f2151d = Integer.MIN_VALUE;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2152f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2153g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2154h = false;

    public void a(int i2, int i3) {
        this.f2150c = i2;
        this.f2151d = i3;
        this.f2154h = true;
        if (this.f2153g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.b = i3;
        }
    }
}
