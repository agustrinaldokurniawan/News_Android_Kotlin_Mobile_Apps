package c.e.b.a0.z;

import c.e.b.a0.q;
import c.e.b.a0.t;
import c.e.b.c0.a;
import c.e.b.c0.b;
import c.e.b.c0.c;
import c.e.b.i;
import c.e.b.k;
import c.e.b.n;
import c.e.b.o;
import c.e.b.p;
import c.e.b.s;
import c.e.b.v;
import c.e.b.x;
import c.e.b.y;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class g implements y {
    public final c.e.b.a0.g e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1473f;

    public final class a<K, V> extends x<Map<K, V>> {
        public final x<K> a;
        public final x<V> b;

        /* renamed from: c  reason: collision with root package name */
        public final t<? extends Map<K, V>> f1474c;

        public a(i iVar, Type type, x<K> xVar, Type type2, x<V> xVar2, t<? extends Map<K, V>> tVar) {
            this.a = new n(iVar, xVar, type);
            this.b = new n(iVar, xVar2, type2);
            this.f1474c = tVar;
        }

        @Override // c.e.b.x
        public Object a(c.e.b.c0.a aVar) {
            int i2;
            b p0 = aVar.p0();
            if (p0 == b.NULL) {
                aVar.l0();
                return null;
            }
            Map map = (Map) this.f1474c.a();
            if (p0 == b.BEGIN_ARRAY) {
                aVar.b();
                while (aVar.b0()) {
                    aVar.b();
                    K a2 = this.a.a(aVar);
                    if (map.put(a2, this.b.a(aVar)) == null) {
                        aVar.u();
                    } else {
                        throw new v("duplicate key: " + ((Object) a2));
                    }
                }
                aVar.u();
            } else {
                aVar.c();
                while (aVar.b0()) {
                    Objects.requireNonNull((a.C0050a) q.a);
                    if (aVar instanceof e) {
                        e eVar = (e) aVar;
                        eVar.w0(b.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) eVar.x0()).next();
                        eVar.z0(entry.getValue());
                        eVar.z0(new s((String) entry.getKey()));
                    } else {
                        int i3 = aVar.f1519l;
                        if (i3 == 0) {
                            i3 = aVar.n();
                        }
                        if (i3 == 13) {
                            i2 = 9;
                        } else if (i3 == 12) {
                            i2 = 8;
                        } else if (i3 == 14) {
                            i2 = 10;
                        } else {
                            StringBuilder f2 = c.c.a.a.a.f("Expected a name but was ");
                            f2.append(aVar.p0());
                            f2.append(aVar.e0());
                            throw new IllegalStateException(f2.toString());
                        }
                        aVar.f1519l = i2;
                    }
                    K a3 = this.a.a(aVar);
                    if (map.put(a3, this.b.a(aVar)) != null) {
                        throw new v("duplicate key: " + ((Object) a3));
                    }
                }
                aVar.K();
            }
            return map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: c.e.b.x<V> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: c.e.b.x<V> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.e.b.x
        public void b(c cVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.b0();
                return;
            }
            if (!g.this.f1473f) {
                cVar.e();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.Q(String.valueOf(entry.getKey()));
                    this.b.b(cVar, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    x<K> xVar = this.a;
                    K key = entry2.getKey();
                    Objects.requireNonNull(xVar);
                    try {
                        f fVar = new f();
                        xVar.b(fVar, key);
                        if (fVar.q.isEmpty()) {
                            n nVar = fVar.s;
                            arrayList.add(nVar);
                            arrayList2.add(entry2.getValue());
                            Objects.requireNonNull(nVar);
                            z |= (nVar instanceof k) || (nVar instanceof c.e.b.q);
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + fVar.q);
                        }
                    } catch (IOException e) {
                        throw new o(e);
                    }
                }
                if (z) {
                    cVar.c();
                    int size = arrayList.size();
                    while (i2 < size) {
                        cVar.c();
                        o.X.b(cVar, (n) arrayList.get(i2));
                        this.b.b(cVar, arrayList2.get(i2));
                        cVar.u();
                        i2++;
                    }
                    cVar.u();
                    return;
                }
                cVar.e();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    n nVar2 = (n) arrayList.get(i2);
                    Objects.requireNonNull(nVar2);
                    if (nVar2 instanceof s) {
                        s a2 = nVar2.a();
                        Object obj2 = a2.a;
                        if (obj2 instanceof Number) {
                            str = String.valueOf(a2.c());
                        } else if (obj2 instanceof Boolean) {
                            str = Boolean.toString(a2.b());
                        } else if (obj2 instanceof String) {
                            str = a2.d();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (nVar2 instanceof p) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    cVar.Q(str);
                    this.b.b(cVar, arrayList2.get(i2));
                    i2++;
                }
            }
            cVar.K();
        }
    }

    public g(c.e.b.a0.g gVar, boolean z) {
        this.e = gVar;
        this.f1473f = z;
    }

    @Override // c.e.b.y
    public <T> x<T> a(i iVar, c.e.b.b0.a<T> aVar) {
        Type[] typeArr;
        Type type = aVar.b;
        if (!Map.class.isAssignableFrom(aVar.a)) {
            return null;
        }
        Class<?> e2 = c.e.b.a0.a.e(type);
        if (type == Properties.class) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            Type f2 = c.e.b.a0.a.f(type, e2, Map.class);
            typeArr = f2 instanceof ParameterizedType ? ((ParameterizedType) f2).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = typeArr[0];
        return new a(iVar, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? o.f1492f : iVar.b(new c.e.b.b0.a<>(type2)), typeArr[1], iVar.b(new c.e.b.b0.a<>(typeArr[1])), this.e.a(aVar));
    }
}
