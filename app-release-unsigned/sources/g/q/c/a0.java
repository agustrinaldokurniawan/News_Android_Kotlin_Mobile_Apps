package g.q.c;

import android.view.View;

public class a0 {
    public final b a;
    public a b = new a();

    public static class a {
        public int a = 0;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f2889c;

        /* renamed from: d  reason: collision with root package name */
        public int f2890d;
        public int e;

        public boolean a() {
            int i2 = this.a;
            if ((i2 & 7) != 0 && (i2 & (b(this.f2890d, this.b) << 0)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 112) != 0 && (i3 & (b(this.f2890d, this.f2889c) << 4)) == 0) {
                return false;
            }
            int i4 = this.a;
            if ((i4 & 1792) != 0 && (i4 & (b(this.e, this.b) << 8)) == 0) {
                return false;
            }
            int i5 = this.a;
            return (i5 & 28672) == 0 || (i5 & (b(this.e, this.f2889c) << 12)) != 0;
        }

        public int b(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }
    }

    public interface b {
        View a(int i2);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    public a0(b bVar) {
        this.a = bVar;
    }

    public View a(int i2, int i3, int i4, int i5) {
        int c2 = this.a.c();
        int b2 = this.a.b();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View a2 = this.a.a(i2);
            int e = this.a.e(a2);
            int d2 = this.a.d(a2);
            a aVar = this.b;
            aVar.b = c2;
            aVar.f2889c = b2;
            aVar.f2890d = e;
            aVar.e = d2;
            if (i4 != 0) {
                aVar.a = 0;
                aVar.a = i4 | 0;
                if (aVar.a()) {
                    return a2;
                }
            }
            if (i5 != 0) {
                a aVar2 = this.b;
                aVar2.a = 0;
                aVar2.a = i5 | 0;
                if (aVar2.a()) {
                    view = a2;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public boolean b(View view, int i2) {
        a aVar = this.b;
        int c2 = this.a.c();
        int b2 = this.a.b();
        int e = this.a.e(view);
        int d2 = this.a.d(view);
        aVar.b = c2;
        aVar.f2889c = b2;
        aVar.f2890d = e;
        aVar.e = d2;
        if (i2 == 0) {
            return false;
        }
        a aVar2 = this.b;
        aVar2.a = 0;
        aVar2.a = 0 | i2;
        return aVar2.a();
    }
}
