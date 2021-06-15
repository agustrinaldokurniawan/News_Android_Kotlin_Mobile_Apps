package c.d.a.m.v;

import c.d.a.m.a;
import c.d.a.m.m;
import c.d.a.m.u.d;
import c.d.a.m.v.g;
import c.d.a.m.w.n;
import java.io.File;
import java.util.List;

public class d implements g, d.a<Object> {
    public final List<m> e;

    /* renamed from: f  reason: collision with root package name */
    public final h<?> f878f;

    /* renamed from: g  reason: collision with root package name */
    public final g.a f879g;

    /* renamed from: h  reason: collision with root package name */
    public int f880h = -1;

    /* renamed from: i  reason: collision with root package name */
    public m f881i;

    /* renamed from: j  reason: collision with root package name */
    public List<n<File, ?>> f882j;

    /* renamed from: k  reason: collision with root package name */
    public int f883k;

    /* renamed from: l  reason: collision with root package name */
    public volatile n.a<?> f884l;

    /* renamed from: m  reason: collision with root package name */
    public File f885m;

    public d(h<?> hVar, g.a aVar) {
        List<m> a = hVar.a();
        this.e = a;
        this.f878f = hVar;
        this.f879g = aVar;
    }

    public d(List<m> list, h<?> hVar, g.a aVar) {
        this.e = list;
        this.f878f = hVar;
        this.f879g = aVar;
    }

    @Override // c.d.a.m.v.g
    public boolean a() {
        while (true) {
            List<n<File, ?>> list = this.f882j;
            if (list != null) {
                if (this.f883k < list.size()) {
                    this.f884l = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f883k < this.f882j.size())) {
                            break;
                        }
                        List<n<File, ?>> list2 = this.f882j;
                        int i2 = this.f883k;
                        this.f883k = i2 + 1;
                        File file = this.f885m;
                        h<?> hVar = this.f878f;
                        this.f884l = list2.get(i2).a(file, hVar.e, hVar.f902f, hVar.f905i);
                        if (this.f884l != null && this.f878f.g(this.f884l.f1009c.a())) {
                            this.f884l.f1009c.e(this.f878f.o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i3 = this.f880h + 1;
            this.f880h = i3;
            if (i3 >= this.e.size()) {
                return false;
            }
            m mVar = this.e.get(this.f880h);
            h<?> hVar2 = this.f878f;
            File b = hVar2.b().b(new e(mVar, hVar2.n));
            this.f885m = b;
            if (b != null) {
                this.f881i = mVar;
                this.f882j = this.f878f.f900c.f740c.f(b);
                this.f883k = 0;
            }
        }
    }

    @Override // c.d.a.m.v.g
    public void cancel() {
        n.a<?> aVar = this.f884l;
        if (aVar != null) {
            aVar.f1009c.cancel();
        }
    }

    @Override // c.d.a.m.u.d.a
    public void d(Exception exc) {
        this.f879g.d(this.f881i, exc, this.f884l.f1009c, a.DATA_DISK_CACHE);
    }

    @Override // c.d.a.m.u.d.a
    public void f(Object obj) {
        this.f879g.c(this.f881i, obj, this.f884l.f1009c, a.DATA_DISK_CACHE, this.f881i);
    }
}
