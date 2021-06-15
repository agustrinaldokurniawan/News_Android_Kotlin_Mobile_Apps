package c.e.b.a0.z;

import c.e.b.a0.g;
import c.e.b.a0.o;
import c.e.b.a0.t;
import c.e.b.c0.c;
import c.e.b.d;
import c.e.b.v;
import c.e.b.x;
import c.e.b.y;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class j implements y {
    public final g e;

    /* renamed from: f  reason: collision with root package name */
    public final d f1481f;

    /* renamed from: g  reason: collision with root package name */
    public final o f1482g;

    /* renamed from: h  reason: collision with root package name */
    public final d f1483h;

    /* renamed from: i  reason: collision with root package name */
    public final c.e.b.a0.a0.b f1484i = c.e.b.a0.a0.b.a;

    public static final class a<T> extends x<T> {
        public final t<T> a;
        public final Map<String, b> b;

        public a(t<T> tVar, Map<String, b> map) {
            this.a = tVar;
            this.b = map;
        }

        @Override // c.e.b.x
        public T a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            T a2 = this.a.a();
            try {
                aVar.c();
                while (aVar.b0()) {
                    b bVar = this.b.get(aVar.j0());
                    if (bVar != null) {
                        if (bVar.f1485c) {
                            bVar.a(aVar, a2);
                        }
                    }
                    aVar.u0();
                }
                aVar.K();
                return a2;
            } catch (IllegalStateException e) {
                throw new v(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // c.e.b.x
        public void b(c cVar, T t) {
            if (t == null) {
                cVar.b0();
                return;
            }
            cVar.e();
            try {
                for (b bVar : this.b.values()) {
                    if (bVar.c(t)) {
                        cVar.Q(bVar.a);
                        bVar.b(cVar, t);
                    }
                }
                cVar.K();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static abstract class b {
        public final String a;
        public final boolean b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f1485c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.f1485c = z2;
        }

        public abstract void a(c.e.b.c0.a aVar, Object obj);

        public abstract void b(c cVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public j(g gVar, d dVar, o oVar, d dVar2) {
        this.e = gVar;
        this.f1481f = dVar;
        this.f1482g = oVar;
        this.f1483h = dVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0184 A[SYNTHETIC] */
    @Override // c.e.b.y
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> c.e.b.x<T> a(c.e.b.i r35, c.e.b.b0.a<T> r36) {
        /*
        // Method dump skipped, instructions count: 490
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.b.a0.z.j.a(c.e.b.i, c.e.b.b0.a):c.e.b.x");
    }

    public boolean b(Field field, boolean z) {
        boolean z2;
        o oVar = this.f1482g;
        Class<?> type = field.getType();
        if (oVar.f(type) || oVar.d(type, z)) {
            return false;
        }
        if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !oVar.f(field.getType())) {
            List<c.e.b.a> list = z ? oVar.f1450f : oVar.f1451g;
            if (!list.isEmpty()) {
                c.e.b.b bVar = new c.e.b.b(field);
                Iterator<c.e.b.a> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().b(bVar)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            z2 = true;
        }
        return !z2;
    }
}
