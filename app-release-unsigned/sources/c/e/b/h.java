package c.e.b;

import c.e.b.c0.a;
import c.e.b.c0.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

public class h extends x<AtomicLongArray> {
    public final /* synthetic */ x a;

    public h(x xVar) {
        this.a = xVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.e.b.x
    public AtomicLongArray a(a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.b0()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(aVar)).longValue()));
        }
        aVar.u();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
        }
        return atomicLongArray;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
    @Override // c.e.b.x
    public void b(c cVar, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        cVar.c();
        int length = atomicLongArray2.length();
        for (int i2 = 0; i2 < length; i2++) {
            this.a.b(cVar, Long.valueOf(atomicLongArray2.get(i2)));
        }
        cVar.u();
    }
}
