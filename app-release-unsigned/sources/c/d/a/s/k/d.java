package c.d.a.s.k;

public abstract class d {

    public static class b extends d {
        public volatile boolean a;

        public b() {
            super(null);
        }

        @Override // c.d.a.s.k.d
        public void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public d(a aVar) {
    }

    public abstract void a();
}
