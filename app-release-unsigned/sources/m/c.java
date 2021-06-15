package m;

import i.m;
import j.h0;
import j.j0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import m.h;
import m.j0.w;

public final class c extends h.a {
    public boolean a = true;

    public static final class a implements h<j0, j0> {
        public static final a a = new a();

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // m.h
        public j0 a(j0 j0Var) {
            j0 j0Var2 = j0Var;
            try {
                return g0.a(j0Var2);
            } finally {
                j0Var2.close();
            }
        }
    }

    public static final class b implements h<h0, h0> {
        public static final b a = new b();

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // m.h
        public h0 a(h0 h0Var) {
            return h0Var;
        }
    }

    /* renamed from: m.c$c  reason: collision with other inner class name */
    public static final class C0130c implements h<j0, j0> {
        public static final C0130c a = new C0130c();

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // m.h
        public j0 a(j0 j0Var) {
            return j0Var;
        }
    }

    public static final class d implements h<Object, String> {
        public static final d a = new d();

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // m.h
        public String a(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements h<j0, m> {
        public static final e a = new e();

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // m.h
        public m a(j0 j0Var) {
            j0Var.close();
            return m.a;
        }
    }

    public static final class f implements h<j0, Void> {
        public static final f a = new f();

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // m.h
        public Void a(j0 j0Var) {
            j0Var.close();
            return null;
        }
    }

    @Override // m.h.a
    @Nullable
    public h<?, h0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, c0 c0Var) {
        if (h0.class.isAssignableFrom(g0.f(type))) {
            return b.a;
        }
        return null;
    }

    @Override // m.h.a
    @Nullable
    public h<j0, ?> b(Type type, Annotation[] annotationArr, c0 c0Var) {
        if (type == j0.class) {
            return g0.i(annotationArr, w.class) ? C0130c.a : a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (!this.a || type != m.class) {
            return null;
        }
        try {
            return e.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }
}
