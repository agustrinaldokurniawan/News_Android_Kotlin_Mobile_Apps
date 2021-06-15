package l.a.c.j;

import java.util.ArrayList;
import java.util.HashSet;
import l.a.c.f.c;
import l.a.c.n.b;

public final class a {
    public final boolean a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final l.a.c.l.a f3801c = b.b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3802d;
    public final ArrayList<l.a.c.l.a> e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<l.a.c.f.a<?>> f3803f = new HashSet<>();

    public a(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        b bVar = b.a;
    }

    public final c a(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = this.a || z2;
        if (!this.b && !z) {
            z3 = false;
        }
        return new c(z4, z3, false, 4);
    }
}
