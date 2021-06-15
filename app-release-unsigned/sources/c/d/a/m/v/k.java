package c.d.a.m.v;

public abstract class k {
    public static final k a = new a();
    public static final k b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final k f931c = new c();

    public class a extends k {
        @Override // c.d.a.m.v.k
        public boolean a() {
            return false;
        }

        @Override // c.d.a.m.v.k
        public boolean b() {
            return false;
        }

        @Override // c.d.a.m.v.k
        public boolean c(c.d.a.m.a aVar) {
            return false;
        }

        @Override // c.d.a.m.v.k
        public boolean d(boolean z, c.d.a.m.a aVar, c.d.a.m.c cVar) {
            return false;
        }
    }

    public class b extends k {
        @Override // c.d.a.m.v.k
        public boolean a() {
            return true;
        }

        @Override // c.d.a.m.v.k
        public boolean b() {
            return false;
        }

        @Override // c.d.a.m.v.k
        public boolean c(c.d.a.m.a aVar) {
            return (aVar == c.d.a.m.a.DATA_DISK_CACHE || aVar == c.d.a.m.a.MEMORY_CACHE) ? false : true;
        }

        @Override // c.d.a.m.v.k
        public boolean d(boolean z, c.d.a.m.a aVar, c.d.a.m.c cVar) {
            return false;
        }
    }

    public class c extends k {
        @Override // c.d.a.m.v.k
        public boolean a() {
            return true;
        }

        @Override // c.d.a.m.v.k
        public boolean b() {
            return true;
        }

        @Override // c.d.a.m.v.k
        public boolean c(c.d.a.m.a aVar) {
            return aVar == c.d.a.m.a.REMOTE;
        }

        @Override // c.d.a.m.v.k
        public boolean d(boolean z, c.d.a.m.a aVar, c.d.a.m.c cVar) {
            return ((z && aVar == c.d.a.m.a.DATA_DISK_CACHE) || aVar == c.d.a.m.a.LOCAL) && cVar == c.d.a.m.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(c.d.a.m.a aVar);

    public abstract boolean d(boolean z, c.d.a.m.a aVar, c.d.a.m.c cVar);
}
