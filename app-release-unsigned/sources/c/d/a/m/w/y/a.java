package c.d.a.m.w.y;

import c.d.a.m.o;
import c.d.a.m.p;
import c.d.a.m.u.j;
import c.d.a.m.w.g;
import c.d.a.m.w.m;
import c.d.a.m.w.n;
import c.d.a.m.w.r;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;

public class a implements n<g, InputStream> {
    public static final o<Integer> a = o.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    public final m<g, g> b;

    /* renamed from: c.d.a.m.w.y.a$a  reason: collision with other inner class name */
    public static class C0026a implements c.d.a.m.w.o<g, InputStream> {
        public final m<g, g> a = new m<>(500);

        @Override // c.d.a.m.w.o
        public n<g, InputStream> b(r rVar) {
            return new a(this.a);
        }
    }

    public a(m<g, g> mVar) {
        this.b = mVar;
    }

    /* Return type fixed from 'c.d.a.m.w.n$a' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Queue<c.d.a.m.w.m$b<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.d.a.m.w.n
    public n.a<InputStream> a(g gVar, int i2, int i3, p pVar) {
        g gVar2 = gVar;
        m<g, g> mVar = this.b;
        if (mVar != null) {
            m.b a2 = m.b.a(gVar2, 0, 0);
            B a3 = mVar.a.a(a2);
            Queue<m.b<?>> queue = m.b.a;
            synchronized (queue) {
                queue.offer(a2);
            }
            B b2 = a3;
            if (b2 == null) {
                m<g, g> mVar2 = this.b;
                Objects.requireNonNull(mVar2);
                mVar2.a.d(m.b.a(gVar2, 0, 0), gVar2);
            } else {
                gVar2 = b2;
            }
        }
        return new n.a(gVar2, new j(gVar2, ((Integer) pVar.c(a)).intValue()));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.w.n
    public /* bridge */ /* synthetic */ boolean b(g gVar) {
        return true;
    }
}
