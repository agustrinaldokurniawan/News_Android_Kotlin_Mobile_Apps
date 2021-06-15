package c.d.a.m.w;

import c.d.a.f;
import c.d.a.m.p;
import c.d.a.m.u.d;
import c.d.a.m.w.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class b<Data> implements n<byte[], Data> {
    public final AbstractC0024b<Data> a;

    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: c.d.a.m.w.b$a$a  reason: collision with other inner class name */
        public class C0023a implements AbstractC0024b<ByteBuffer> {
            public C0023a(a aVar) {
            }

            @Override // c.d.a.m.w.b.AbstractC0024b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // c.d.a.m.w.b.AbstractC0024b
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // c.d.a.m.w.o
        public n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0023a(this));
        }
    }

    /* renamed from: c.d.a.m.w.b$b  reason: collision with other inner class name */
    public interface AbstractC0024b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements c.d.a.m.u.d<Data> {
        public final byte[] e;

        /* renamed from: f  reason: collision with root package name */
        public final AbstractC0024b<Data> f993f;

        public c(byte[] bArr, AbstractC0024b<Data> bVar) {
            this.e = bArr;
            this.f993f = bVar;
        }

        @Override // c.d.a.m.u.d
        public Class<Data> a() {
            return this.f993f.a();
        }

        @Override // c.d.a.m.u.d
        public void b() {
        }

        @Override // c.d.a.m.u.d
        public c.d.a.m.a c() {
            return c.d.a.m.a.LOCAL;
        }

        @Override // c.d.a.m.u.d
        public void cancel() {
        }

        @Override // c.d.a.m.u.d
        public void e(f fVar, d.a<? super Data> aVar) {
            aVar.f(this.f993f.b(this.e));
        }
    }

    public static class d implements o<byte[], InputStream> {

        public class a implements AbstractC0024b<InputStream> {
            public a(d dVar) {
            }

            @Override // c.d.a.m.w.b.AbstractC0024b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // c.d.a.m.w.b.AbstractC0024b
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // c.d.a.m.w.o
        public n<byte[], InputStream> b(r rVar) {
            return new b(new a(this));
        }
    }

    public b(AbstractC0024b<Data> bVar) {
        this.a = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.w.n
    public n.a a(byte[] bArr, int i2, int i3, p pVar) {
        byte[] bArr2 = bArr;
        return new n.a(new c.d.a.r.b(bArr2), new c(bArr2, this.a));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public /* bridge */ /* synthetic */ boolean b(byte[] bArr) {
        return true;
    }
}
