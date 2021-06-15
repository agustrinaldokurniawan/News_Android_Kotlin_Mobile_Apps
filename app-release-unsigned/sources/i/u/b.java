package i.u;

import i.o.k;
import java.util.NoSuchElementException;

public final class b extends k {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3322f;

    /* renamed from: g  reason: collision with root package name */
    public int f3323g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3324h;

    public b(int i2, int i3, int i4) {
        this.f3324h = i4;
        this.e = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f3322f = z;
        this.f3323g = !z ? i3 : i2;
    }

    @Override // i.o.k
    public int a() {
        int i2 = this.f3323g;
        if (i2 != this.e) {
            this.f3323g = this.f3324h + i2;
        } else if (this.f3322f) {
            this.f3322f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    public boolean hasNext() {
        return this.f3322f;
    }
}
