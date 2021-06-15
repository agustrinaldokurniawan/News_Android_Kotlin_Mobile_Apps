package c.d.a.m.v.c0;

public final class f implements a<byte[]> {
    @Override // c.d.a.m.v.c0.a
    public String a() {
        return "ByteArrayPool";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.v.c0.a
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // c.d.a.m.v.c0.a
    public int c() {
        return 1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.d.a.m.v.c0.a
    public byte[] newArray(int i2) {
        return new byte[i2];
    }
}
