package m;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import m.e;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
public final class g extends e.a {
    public static final e.a a = new g();

    @IgnoreJRERequirement
    public static final class a<R> implements e<R, CompletableFuture<R>> {
        public final Type a;

        @IgnoreJRERequirement
        /* renamed from: m.g$a$a  reason: collision with other inner class name */
        public class C0131a implements f<R> {
            public final CompletableFuture<R> a;

            public C0131a(a aVar, CompletableFuture<R> completableFuture) {
                this.a = completableFuture;
            }

            @Override // m.f
            public void a(d<R> dVar, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // m.f
            public void b(d<R> dVar, a0<R> a0Var) {
                if (a0Var.a()) {
                    this.a.complete(a0Var.b);
                } else {
                    this.a.completeExceptionally(new j(a0Var));
                }
            }
        }

        public a(Type type) {
            this.a = type;
        }

        @Override // m.e
        public Type a() {
            return this.a;
        }

        @Override // m.e
        public Object b(d dVar) {
            b bVar = new b(dVar);
            dVar.K(new C0131a(this, bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {
        public final d<?> e;

        public b(d<?> dVar) {
            this.e = dVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.e.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements e<R, CompletableFuture<a0<R>>> {
        public final Type a;

        @IgnoreJRERequirement
        public class a implements f<R> {
            public final CompletableFuture<a0<R>> a;

            public a(c cVar, CompletableFuture<a0<R>> completableFuture) {
                this.a = completableFuture;
            }

            @Override // m.f
            public void a(d<R> dVar, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // m.f
            public void b(d<R> dVar, a0<R> a0Var) {
                this.a.complete(a0Var);
            }
        }

        public c(Type type) {
            this.a = type;
        }

        @Override // m.e
        public Type a() {
            return this.a;
        }

        @Override // m.e
        public Object b(d dVar) {
            b bVar = new b(dVar);
            dVar.K(new a(this, bVar));
            return bVar;
        }
    }

    @Override // m.e.a
    @Nullable
    public e<?, ?> a(Type type, Annotation[] annotationArr, c0 c0Var) {
        if (g0.f(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e = g0.e(0, (ParameterizedType) type);
            if (g0.f(e) != a0.class) {
                return new a(e);
            }
            if (e instanceof ParameterizedType) {
                return new c(g0.e(0, (ParameterizedType) e));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
