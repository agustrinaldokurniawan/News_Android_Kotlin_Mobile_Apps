package d.a.a;

import d.a.v0;
import i.q.f;
import i.s.b.p;
import i.s.c.h;
import i.s.c.i;
import java.util.Objects;

public final class a {
    public static final o a = new o("ZERO");

    /* renamed from: d.a.a.a$a  reason: collision with other inner class name */
    public static final class C0056a extends i implements p<s, f.a, s> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0056a f1750f = new C0056a(0);

        /* renamed from: g  reason: collision with root package name */
        public static final C0056a f1751g = new C0056a(1);

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ int f1752h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0056a(int i2) {
            super(2);
            this.f1752h = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // i.s.b.p
        public final s k(s sVar, f.a aVar) {
            int i2 = this.f1752h;
            if (i2 == 0) {
                s sVar2 = sVar;
                f.a aVar2 = aVar;
                if (aVar2 instanceof v0) {
                    f fVar = sVar2.f1770c;
                    Object[] objArr = sVar2.a;
                    int i3 = sVar2.b;
                    sVar2.b = i3 + 1;
                    ((v0) aVar2).K(fVar, objArr[i3]);
                }
                return sVar2;
            } else if (i2 == 1) {
                s sVar3 = sVar;
                f.a aVar3 = aVar;
                if (aVar3 instanceof v0) {
                    Object Q = ((v0) aVar3).Q(sVar3.f1770c);
                    Object[] objArr2 = sVar3.a;
                    int i4 = sVar3.b;
                    sVar3.b = i4 + 1;
                    objArr2[i4] = Q;
                }
                return sVar3;
            } else {
                throw null;
            }
        }
    }

    public static final class b extends i implements p<Object, f.a, Object> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f1753f = new b();

        public b() {
            super(2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // i.s.b.p
        public Object k(Object obj, f.a aVar) {
            f.a aVar2 = aVar;
            if (!(aVar2 instanceof v0)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? aVar2 : Integer.valueOf(intValue + 1);
        }
    }

    public static final class c extends i implements p<v0<?>, f.a, v0<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f1754f = new c();

        public c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // i.s.b.p
        public v0<?> k(v0<?> v0Var, f.a aVar) {
            v0<?> v0Var2 = v0Var;
            f.a aVar2 = aVar;
            if (v0Var2 != null) {
                return v0Var2;
            }
            if (!(aVar2 instanceof v0)) {
                aVar2 = null;
            }
            return (v0) aVar2;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj != a) {
            if (obj instanceof s) {
                ((s) obj).b = 0;
                fVar.fold(obj, C0056a.f1750f);
                return;
            }
            Object fold = fVar.fold(null, c.f1754f);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((v0) fold).K(fVar, obj);
        }
    }

    public static final Object b(f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.fold(0, b.f1753f);
            h.c(obj);
        }
        if (obj == 0) {
            return a;
        }
        return obj instanceof Integer ? fVar.fold(new s(fVar, ((Number) obj).intValue()), C0056a.f1751g) : ((v0) obj).Q(fVar);
    }
}
