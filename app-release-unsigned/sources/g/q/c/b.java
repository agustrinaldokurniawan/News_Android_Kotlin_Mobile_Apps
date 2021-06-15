package g.q.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g.h.j.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class b {
    public final AbstractC0093b a;
    public final a b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f2891c = new ArrayList();

    public static class a {
        public long a = 0;
        public a b;

        public void a(int i2) {
            if (i2 >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(i2 - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i2);
        }

        public int b(int i2) {
            long j2;
            a aVar = this.b;
            if (aVar == null) {
                if (i2 >= 64) {
                    j2 = this.a;
                }
                j2 = this.a & ((1 << i2) - 1);
            } else {
                if (i2 >= 64) {
                    return Long.bitCount(this.a) + aVar.b(i2 - 64);
                }
                j2 = this.a & ((1 << i2) - 1);
            }
            return Long.bitCount(j2);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public boolean d(int i2) {
            if (i2 < 64) {
                return (this.a & (1 << i2)) != 0;
            }
            c();
            return this.b.d(i2 - 64);
        }

        public void e(int i2, boolean z) {
            if (i2 >= 64) {
                c();
                this.b.e(i2 - 64, z);
                return;
            }
            long j2 = this.a;
            boolean z2 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.a = ((j2 & (~j3)) << 1) | (j2 & j3);
            if (z) {
                h(i2);
            } else {
                a(i2);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public boolean f(int i2) {
            if (i2 >= 64) {
                c();
                return this.b.f(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.a;
            boolean z = (j3 & j2) != 0;
            long j4 = j3 & (~j2);
            this.a = j4;
            long j5 = j2 - 1;
            this.a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public void g() {
            this.a = 0;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i2) {
            if (i2 >= 64) {
                c();
                this.b.h(i2 - 64);
                return;
            }
            this.a |= 1 << i2;
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* renamed from: g.q.c.b$b  reason: collision with other inner class name */
    public interface AbstractC0093b {
    }

    public b(AbstractC0093b bVar) {
        this.a = bVar;
    }

    public void a(View view, int i2, boolean z) {
        int b2 = i2 < 0 ? ((v) this.a).b() : f(i2);
        this.b.e(b2, z);
        if (z) {
            i(view);
        }
        v vVar = (v) this.a;
        vVar.a.addView(view, b2);
        RecyclerView recyclerView = vVar.a;
        Objects.requireNonNull(recyclerView);
        RecyclerView.K(view);
        recyclerView.S();
    }

    public void b(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b2 = i2 < 0 ? ((v) this.a).b() : f(i2);
        this.b.e(b2, z);
        if (z) {
            i(view);
        }
        v vVar = (v) this.a;
        Objects.requireNonNull(vVar);
        RecyclerView.z K = RecyclerView.K(view);
        if (K != null) {
            if (K.o() || K.u()) {
                K.f298k &= -257;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(K);
                throw new IllegalArgumentException(c.c.a.a.a.j(vVar.a, sb));
            }
        }
        vVar.a.attachViewToParent(view, b2, layoutParams);
    }

    public void c(int i2) {
        RecyclerView.z K;
        int f2 = f(i2);
        this.b.f(f2);
        v vVar = (v) this.a;
        View childAt = vVar.a.getChildAt(f2);
        if (!(childAt == null || (K = RecyclerView.K(childAt)) == null)) {
            if (!K.o() || K.u()) {
                K.b(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(K);
                throw new IllegalArgumentException(c.c.a.a.a.j(vVar.a, sb));
            }
        }
        vVar.a.detachViewFromParent((RecyclerView) f2);
    }

    public View d(int i2) {
        return ((v) this.a).a(f(i2));
    }

    public int e() {
        return ((v) this.a).b() - this.f2891c.size();
    }

    public final int f(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int b2 = ((v) this.a).b();
        int i3 = i2;
        while (i3 < b2) {
            int b3 = i2 - (i3 - this.b.b(i3));
            if (b3 == 0) {
                while (this.b.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b3;
        }
        return -1;
    }

    public View g(int i2) {
        return ((v) this.a).a.getChildAt(i2);
    }

    public int h() {
        return ((v) this.a).b();
    }

    public final void i(View view) {
        this.f2891c.add(view);
        v vVar = (v) this.a;
        Objects.requireNonNull(vVar);
        RecyclerView.z K = RecyclerView.K(view);
        if (K != null) {
            RecyclerView recyclerView = vVar.a;
            int i2 = K.r;
            if (i2 == -1) {
                View view2 = K.b;
                AtomicInteger atomicInteger = o.a;
                i2 = view2.getImportantForAccessibility();
            }
            K.q = i2;
            recyclerView.j0(K, 4);
        }
    }

    public int j(View view) {
        int indexOfChild = ((v) this.a).a.indexOfChild(view);
        if (indexOfChild != -1 && !this.b.d(indexOfChild)) {
            return indexOfChild - this.b.b(indexOfChild);
        }
        return -1;
    }

    public boolean k(View view) {
        return this.f2891c.contains(view);
    }

    public final boolean l(View view) {
        if (!this.f2891c.remove(view)) {
            return false;
        }
        v vVar = (v) this.a;
        Objects.requireNonNull(vVar);
        RecyclerView.z K = RecyclerView.K(view);
        if (K == null) {
            return true;
        }
        vVar.a.j0(K, K.q);
        K.q = 0;
        return true;
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.f2891c.size();
    }
}
