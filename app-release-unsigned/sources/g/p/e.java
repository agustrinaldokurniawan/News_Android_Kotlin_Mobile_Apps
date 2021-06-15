package g.p;

import android.content.Context;
import android.os.Bundle;
import g.n.e;
import g.n.i;
import g.n.j;
import g.n.v;
import g.n.w;
import g.s.a;
import g.s.b;
import g.s.c;
import java.util.UUID;

public final class e implements i, w, c {
    public final j e;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f2826f;

    /* renamed from: g  reason: collision with root package name */
    public final j f2827g;

    /* renamed from: h  reason: collision with root package name */
    public final b f2828h;

    /* renamed from: i  reason: collision with root package name */
    public final UUID f2829i;

    /* renamed from: j  reason: collision with root package name */
    public e.b f2830j;

    /* renamed from: k  reason: collision with root package name */
    public e.b f2831k;

    /* renamed from: l  reason: collision with root package name */
    public g f2832l;

    public e(Context context, j jVar, Bundle bundle, i iVar, g gVar) {
        this(context, jVar, bundle, iVar, gVar, UUID.randomUUID(), null);
    }

    public e(Context context, j jVar, Bundle bundle, i iVar, g gVar, UUID uuid, Bundle bundle2) {
        this.f2827g = new j(this);
        b bVar = new b(this);
        this.f2828h = bVar;
        this.f2830j = e.b.CREATED;
        this.f2831k = e.b.RESUMED;
        this.f2829i = uuid;
        this.e = jVar;
        this.f2826f = bundle;
        this.f2832l = gVar;
        bVar.a(bundle2);
        if (iVar != null) {
            this.f2830j = ((j) iVar.a()).b;
        }
    }

    @Override // g.n.i
    public g.n.e a() {
        return this.f2827g;
    }

    @Override // g.s.c
    public a c() {
        return this.f2828h.b;
    }

    public void d() {
        e.b bVar;
        j jVar;
        if (this.f2830j.ordinal() < this.f2831k.ordinal()) {
            jVar = this.f2827g;
            bVar = this.f2830j;
        } else {
            jVar = this.f2827g;
            bVar = this.f2831k;
        }
        jVar.i(bVar);
    }

    @Override // g.n.w
    public v g() {
        g gVar = this.f2832l;
        if (gVar != null) {
            UUID uuid = this.f2829i;
            v vVar = gVar.f2837d.get(uuid);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            gVar.f2837d.put(uuid, vVar2);
            return vVar2;
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }
}
