package c.d.a.m.v;

import android.util.Log;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.x.h.e;
import g.h.i.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class j<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends r<DataType, ResourceType>> b;

    /* renamed from: c  reason: collision with root package name */
    public final e<ResourceType, Transcode> f929c;

    /* renamed from: d  reason: collision with root package name */
    public final c<List<Throwable>> f930d;
    public final String e;

    public interface a<ResourceType> {
    }

    public j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends r<DataType, ResourceType>> list, e<ResourceType, Transcode> eVar, c<List<Throwable>> cVar) {
        this.a = cls;
        this.b = list;
        this.f929c = eVar;
        this.f930d = cVar;
        StringBuilder f2 = c.c.a.a.a.f("Failed DecodePath{");
        f2.append(cls.getSimpleName());
        f2.append("->");
        f2.append(cls2.getSimpleName());
        f2.append("->");
        f2.append(cls3.getSimpleName());
        f2.append("}");
        this.e = f2.toString();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [c.d.a.m.v.w] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c.d.a.m.v.w<Transcode> a(c.d.a.m.u.e<DataType> r11, int r12, int r13, c.d.a.m.p r14, c.d.a.m.v.j.a<ResourceType> r15) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.v.j.a(c.d.a.m.u.e, int, int, c.d.a.m.p, c.d.a.m.v.j$a):c.d.a.m.v.w");
    }

    public final w<ResourceType> b(c.d.a.m.u.e<DataType> eVar, int i2, int i3, p pVar, List<Throwable> list) {
        int size = this.b.size();
        w<ResourceType> wVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            r rVar = (r) this.b.get(i4);
            try {
                if (rVar.b(eVar.a(), pVar)) {
                    wVar = rVar.a(eVar.a(), i2, i3, pVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + rVar, e2);
                }
                list.add(e2);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new r(this.e, new ArrayList(list));
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("DecodePath{ dataClass=");
        f2.append(this.a);
        f2.append(", decoders=");
        f2.append(this.b);
        f2.append(", transcoder=");
        f2.append(this.f929c);
        f2.append('}');
        return f2.toString();
    }
}
