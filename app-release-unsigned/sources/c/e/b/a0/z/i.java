package c.e.b.a0.z;

import c.e.b.a0.z.j;
import c.e.b.b0.a;
import c.e.b.c0.c;
import c.e.b.x;
import java.lang.reflect.Field;

public class i extends j.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Field f1476d;
    public final /* synthetic */ boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f1477f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c.e.b.i f1478g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f1479h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f1480i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, boolean z, boolean z2, Field field, boolean z3, x xVar, c.e.b.i iVar, a aVar, boolean z4) {
        super(str, z, z2);
        this.f1476d = field;
        this.e = z3;
        this.f1477f = xVar;
        this.f1478g = iVar;
        this.f1479h = aVar;
        this.f1480i = z4;
    }

    @Override // c.e.b.a0.z.j.b
    public void a(c.e.b.c0.a aVar, Object obj) {
        Object a = this.f1477f.a(aVar);
        if (a != null || !this.f1480i) {
            this.f1476d.set(obj, a);
        }
    }

    @Override // c.e.b.a0.z.j.b
    public void b(c cVar, Object obj) {
        x xVar;
        Object obj2 = this.f1476d.get(obj);
        if (this.e) {
            xVar = this.f1477f;
        } else {
            xVar = new n(this.f1478g, this.f1477f, this.f1479h.b);
        }
        xVar.b(cVar, obj2);
    }

    @Override // c.e.b.a0.z.j.b
    public boolean c(Object obj) {
        return this.b && this.f1476d.get(obj) != obj;
    }
}
