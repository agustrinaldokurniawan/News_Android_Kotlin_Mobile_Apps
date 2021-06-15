package c.d.a.m.x.d;

import c.d.a.m.u.e;
import java.nio.ByteBuffer;

public class a implements e<ByteBuffer> {
    public final ByteBuffer a;

    /* renamed from: c.d.a.m.x.d.a$a  reason: collision with other inner class name */
    public static class C0030a implements e.a<ByteBuffer> {
        @Override // c.d.a.m.u.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        /* Return type fixed from 'c.d.a.m.u.e' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // c.d.a.m.u.e.a
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.d.a.m.u.e
    public ByteBuffer a() {
        this.a.position(0);
        return this.a;
    }

    @Override // c.d.a.m.u.e
    public void b() {
    }
}
