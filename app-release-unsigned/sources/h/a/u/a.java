package h.a.u;

import h.a.m;
import h.a.s.g.k;
import h.a.s.g.l;
import java.util.concurrent.Callable;

public final class a {
    public static final m a = h.a.t.a.h(new h());
    public static final m b = h.a.t.a.h(new b());

    /* renamed from: c  reason: collision with root package name */
    public static final m f3281c = h.a.t.a.h(new c());

    /* renamed from: h.a.u.a$a  reason: collision with other inner class name */
    public static final class C0115a {
        public static final m a = new h.a.s.g.a();
    }

    public static final class b implements Callable<m> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public m call() {
            return C0115a.a;
        }
    }

    public static final class c implements Callable<m> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public m call() {
            return d.a;
        }
    }

    public static final class d {
        public static final m a = new h.a.s.g.d();
    }

    public static final class e {
        public static final m a = new h.a.s.g.e();
    }

    public static final class f implements Callable<m> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public m call() {
            return e.a;
        }
    }

    public static final class g {
        public static final m a = new k();
    }

    public static final class h implements Callable<m> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public m call() {
            return g.a;
        }
    }

    static {
        l lVar = l.a;
        l lVar2 = l.a;
        h.a.t.a.h(new f());
    }
}
