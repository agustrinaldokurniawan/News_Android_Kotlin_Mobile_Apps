package g.o.a;

import g.h.b.d;
import g.n.i;
import g.n.o;
import g.n.p;
import g.n.t;
import g.n.u;
import g.n.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

public class b extends a {
    public final i a;
    public final C0088b b;

    public static class a<D> extends o<D> {
        @Override // androidx.lifecycle.LiveData
        public void e() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void f() {
            throw null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: g.n.p<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void g(p<? super D> pVar) {
            super.g(pVar);
        }

        @Override // androidx.lifecycle.LiveData, g.n.o
        public void h(D d2) {
            super.h(d2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            d.c(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: g.o.a.b$b  reason: collision with other inner class name */
    public static class C0088b extends t {

        /* renamed from: c  reason: collision with root package name */
        public static final u.a f2821c = new a();

        /* renamed from: d  reason: collision with root package name */
        public g.e.i<a> f2822d = new g.e.i<>();

        /* renamed from: g.o.a.b$b$a */
        public static class a implements u.a {
            @Override // g.n.u.a
            public <T extends t> T a(Class<T> cls) {
                return new C0088b();
            }
        }

        @Override // g.n.t
        public void a() {
            if (this.f2822d.k() <= 0) {
                g.e.i<a> iVar = this.f2822d;
                int i2 = iVar.f2255i;
                Object[] objArr = iVar.f2254h;
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = null;
                }
                iVar.f2255i = 0;
                iVar.f2252f = false;
                return;
            }
            Objects.requireNonNull(this.f2822d.l(0));
            throw null;
        }
    }

    public b(i iVar, v vVar) {
        this.a = iVar;
        u.a aVar = C0088b.f2821c;
        String canonicalName = C0088b.class.getCanonicalName();
        if (canonicalName != null) {
            String q = c.c.a.a.a.q("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            t tVar = vVar.a.get(q);
            if (!C0088b.class.isInstance(tVar)) {
                tVar = aVar instanceof u.b ? ((u.b) aVar).c(q, C0088b.class) : ((C0088b.a) aVar).a(C0088b.class);
                t put = vVar.a.put(q, tVar);
                if (put != null) {
                    put.a();
                }
            } else if (aVar instanceof u.c) {
                ((u.c) aVar).b(tVar);
            }
            this.b = (C0088b) tVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // g.o.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0088b bVar = this.b;
        if (bVar.f2822d.k() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (bVar.f2822d.k() > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(bVar.f2822d.i(0));
                printWriter.print(": ");
                printWriter.println(bVar.f2822d.l(0).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        d.c(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
