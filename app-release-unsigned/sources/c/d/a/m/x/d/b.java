package c.d.a.m.x.d;

import c.d.a.m.v.w;
import java.util.Objects;

public class b implements w<byte[]> {
    public final byte[] e;

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.e = bArr;
    }

    @Override // c.d.a.m.v.w
    public int b() {
        return this.e.length;
    }

    @Override // c.d.a.m.v.w
    public Class<byte[]> c() {
        return byte[].class;
    }

    @Override // c.d.a.m.v.w
    public void d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.d.a.m.v.w
    public byte[] get() {
        return this.e;
    }
}
