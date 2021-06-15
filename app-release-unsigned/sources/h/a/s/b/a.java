package h.a.s.b;

public final class a {
    public static final Runnable a = new c();
    public static final h.a.r.a b = new C0105a();

    /* renamed from: c  reason: collision with root package name */
    public static final h.a.r.b<Object> f3088c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final h.a.r.b<Throwable> f3089d = new d();

    /* renamed from: h.a.s.b.a$a  reason: collision with other inner class name */
    public static final class C0105a implements h.a.r.a {
        @Override // h.a.r.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class b implements h.a.r.b<Object> {
        @Override // h.a.r.b
        public void a(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class c implements Runnable {
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class d implements h.a.r.b<Throwable> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.a.r.b
        public void a(Throwable th) {
            h.a.t.a.M(new h.a.q.c(th));
        }
    }
}
