package c.d.a.m.w;

import c.d.a.s.g;
import c.d.a.s.j;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class m<A, B> {
    public final g<b<A>, B> a;

    public class a extends g<b<A>, B> {
        public a(m mVar, long j2) {
            super(j2);
        }

        @Override // c.d.a.s.g
        public void c(Object obj, Object obj2) {
            b<?> bVar = (b) obj;
            Objects.requireNonNull(bVar);
            Queue<b<?>> queue = b.a;
            synchronized (queue) {
                queue.offer(bVar);
            }
        }
    }

    public static final class b<A> {
        public static final Queue<b<?>> a = new ArrayDeque(0);
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f1007c;

        /* renamed from: d  reason: collision with root package name */
        public A f1008d;

        static {
            char[] cArr = j.a;
        }

        public static <A> b<A> a(A a2, int i2, int i3) {
            b<A> bVar;
            Queue<b<?>> queue = a;
            synchronized (queue) {
                bVar = (b<A>) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.f1008d = a2;
            bVar.f1007c = i2;
            bVar.b = i3;
            return bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1007c == bVar.f1007c && this.b == bVar.b && this.f1008d.equals(bVar.f1008d);
        }

        public int hashCode() {
            return this.f1008d.hashCode() + (((this.b * 31) + this.f1007c) * 31);
        }
    }

    public m(long j2) {
        this.a = new a(this, j2);
    }
}
