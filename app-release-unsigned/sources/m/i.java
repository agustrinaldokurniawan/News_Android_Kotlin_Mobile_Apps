package m;

import j.e0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import m.e;

public final class i extends e.a {
    @Nullable
    public final Executor a;

    public class a implements e<Object, d<?>> {
        public final /* synthetic */ Type a;
        public final /* synthetic */ Executor b;

        public a(i iVar, Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // m.e
        public Type a() {
            return this.a;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [m.d] */
        @Override // m.e
        public d<?> b(d<Object> dVar) {
            Executor executor = this.b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    public static final class b<T> implements d<T> {
        public final Executor e;

        /* renamed from: f  reason: collision with root package name */
        public final d<T> f3831f;

        public class a implements f<T> {
            public final /* synthetic */ f a;

            public a(f fVar) {
                this.a = fVar;
            }

            @Override // m.f
            public void a(d<T> dVar, Throwable th) {
                b.this.e.execute(new a(this, this.a, th));
            }

            @Override // m.f
            public void b(d<T> dVar, a0<T> a0Var) {
                b.this.e.execute(new b(this, this.a, a0Var));
            }
        }

        public b(Executor executor, d<T> dVar) {
            this.e = executor;
            this.f3831f = dVar;
        }

        @Override // m.d
        public void K(f<T> fVar) {
            this.f3831f.K(new a(fVar));
        }

        @Override // m.d
        public e0 b() {
            return this.f3831f.b();
        }

        @Override // m.d
        public a0<T> c() {
            return this.f3831f.c();
        }

        @Override // m.d
        public void cancel() {
            this.f3831f.cancel();
        }

        @Override // m.d
        public boolean e() {
            return this.f3831f.e();
        }

        @Override // m.d
        /* renamed from: n */
        public d<T> clone() {
            return new b(this.e, this.f3831f.n());
        }
    }

    public i(@Nullable Executor executor) {
        this.a = executor;
    }

    @Override // m.e.a
    @Nullable
    public e<?, ?> a(Type type, Annotation[] annotationArr, c0 c0Var) {
        Executor executor = null;
        if (g0.f(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e = g0.e(0, (ParameterizedType) type);
            if (!g0.i(annotationArr, e0.class)) {
                executor = this.a;
            }
            return new a(this, e, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
