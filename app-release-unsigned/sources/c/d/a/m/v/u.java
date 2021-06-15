package c.d.a.m.v;

import c.c.a.a.a;
import c.d.a.m.p;
import c.d.a.m.u.e;
import c.d.a.m.v.j;
import g.h.i.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class u<Data, ResourceType, Transcode> {
    public final c<List<Throwable>> a;
    public final List<? extends j<Data, ResourceType, Transcode>> b;

    /* renamed from: c  reason: collision with root package name */
    public final String f973c;

    public u(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<j<Data, ResourceType, Transcode>> list, c<List<Throwable>> cVar) {
        this.a = cVar;
        if (!list.isEmpty()) {
            this.b = list;
            StringBuilder f2 = a.f("Failed LoadPath{");
            f2.append(cls.getSimpleName());
            f2.append("->");
            f2.append(cls2.getSimpleName());
            f2.append("->");
            f2.append(cls3.getSimpleName());
            f2.append("}");
            this.f973c = f2.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public w<Transcode> a(e<Data> eVar, p pVar, int i2, int i3, j.a<ResourceType> aVar) {
        List<Throwable> b2 = this.a.b();
        Objects.requireNonNull(b2, "Argument must not be null");
        List<Throwable> list = b2;
        try {
            int size = this.b.size();
            w<Transcode> wVar = null;
            for (int i4 = 0; i4 < size; i4++) {
                try {
                    wVar = ((j) this.b.get(i4)).a(eVar, i2, i3, pVar, aVar);
                } catch (r e) {
                    list.add(e);
                }
                if (wVar != null) {
                    break;
                }
            }
            if (wVar != null) {
                return wVar;
            }
            throw new r(this.f973c, new ArrayList(list));
        } finally {
            this.a.a(list);
        }
    }

    public String toString() {
        StringBuilder f2 = a.f("LoadPath{decodePaths=");
        f2.append(Arrays.toString(this.b.toArray()));
        f2.append('}');
        return f2.toString();
    }
}
