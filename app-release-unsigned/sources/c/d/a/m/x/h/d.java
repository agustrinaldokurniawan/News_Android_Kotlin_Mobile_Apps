package c.d.a.m.x.h;

import c.d.a.m.p;
import c.d.a.m.v.w;
import c.d.a.m.x.d.b;
import c.d.a.m.x.g.c;
import c.d.a.s.a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public class d implements e<c, byte[]> {
    @Override // c.d.a.m.x.h.e
    public w<byte[]> a(w<c> wVar, p pVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = wVar.get().e.a.a.g().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = a.a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.a == 0 && bVar.b == bVar.f1159c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new b(bArr);
    }
}
