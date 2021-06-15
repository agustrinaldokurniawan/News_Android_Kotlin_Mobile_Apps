package g.n;

public class u {
    public final a a;
    public final v b;

    public interface a {
        <T extends t> T a(Class<T> cls);
    }

    public static abstract class b extends c implements a {
        @Override // g.n.u.a
        public <T extends t> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends t> T c(String str, Class<T> cls);
    }

    public static class c {
        public void b(t tVar) {
        }
    }

    public u(v vVar, a aVar) {
        this.a = aVar;
        this.b = vVar;
    }

    public <T extends t> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends t> T b(String str, Class<T> cls) {
        T t = (T) this.b.a.get(str);
        if (cls.isInstance(t)) {
            a aVar = this.a;
            if (aVar instanceof c) {
                ((c) aVar).b(t);
            }
            return t;
        }
        a aVar2 = this.a;
        T t2 = aVar2 instanceof b ? (T) ((b) aVar2).c(str, cls) : (T) aVar2.a(cls);
        t put = this.b.a.put(str, t2);
        if (put != null) {
            put.a();
        }
        return t2;
    }
}
