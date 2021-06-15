package g.j.b;

import android.graphics.Rect;
import g.j.b.a;
import java.util.Comparator;

public class d<T> implements Comparator<T> {
    public final Rect a = new Rect();
    public final Rect b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2603c;

    /* renamed from: d  reason: collision with root package name */
    public final b<T> f2604d;

    public d(boolean z, b<T> bVar) {
        this.f2603c = z;
        this.f2604d = bVar;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        Rect rect = this.a;
        Rect rect2 = this.b;
        ((a.C0083a) this.f2604d).a(t, rect);
        ((a.C0083a) this.f2604d).a(t2, rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        if (i4 < i5) {
            return this.f2603c ? 1 : -1;
        }
        if (i4 > i5) {
            return this.f2603c ? -1 : 1;
        }
        int i6 = rect.bottom;
        int i7 = rect2.bottom;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if (i8 < i9) {
            return this.f2603c ? 1 : -1;
        }
        if (i8 > i9) {
            return this.f2603c ? -1 : 1;
        }
        return 0;
    }
}
