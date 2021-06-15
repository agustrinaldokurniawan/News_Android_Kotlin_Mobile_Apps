package g.n;

import android.annotation.SuppressLint;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import g.c.a.b.b;
import g.n.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class j extends e {
    public g.c.a.b.a<h, a> a = new g.c.a.b.a<>();
    public e.b b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<i> f2812c;

    /* renamed from: d  reason: collision with root package name */
    public int f2813d = 0;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2814f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<e.b> f2815g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2816h;

    public static class a {
        public e.b a;
        public g b;

        public a(h hVar, e.b bVar) {
            g gVar;
            Map<Class<?>, Integer> map = l.a;
            boolean z = hVar instanceof g;
            boolean z2 = hVar instanceof c;
            if (z && z2) {
                gVar = new FullLifecycleObserverAdapter((c) hVar, (g) hVar);
            } else if (z2) {
                gVar = new FullLifecycleObserverAdapter((c) hVar, null);
            } else if (z) {
                gVar = (g) hVar;
            } else {
                Class<?> cls = hVar.getClass();
                if (l.c(cls) == 2) {
                    List<Constructor<? extends d>> list = l.b.get(cls);
                    if (list.size() == 1) {
                        gVar = new SingleGeneratedAdapterObserver(l.a(list.get(0), hVar));
                    } else {
                        d[] dVarArr = new d[list.size()];
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            dVarArr[i2] = l.a(list.get(i2), hVar);
                        }
                        gVar = new CompositeGeneratedAdaptersObserver(dVarArr);
                    }
                } else {
                    gVar = new ReflectiveGenericLifecycleObserver(hVar);
                }
            }
            this.b = gVar;
            this.a = bVar;
        }

        public void a(i iVar, e.a aVar) {
            e.b a2 = aVar.a();
            this.a = j.f(this.a, a2);
            this.b.d(iVar, aVar);
            this.a = a2;
        }
    }

    public j(i iVar) {
        this.f2812c = new WeakReference<>(iVar);
        this.b = e.b.INITIALIZED;
        this.f2816h = true;
    }

    public static e.b f(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    @Override // g.n.e
    public void a(h hVar) {
        i iVar;
        d("addObserver");
        e.b bVar = this.b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        a aVar = new a(hVar, bVar2);
        if (this.a.d(hVar, aVar) == null && (iVar = this.f2812c.get()) != null) {
            boolean z = this.f2813d != 0 || this.e;
            e.b c2 = c(hVar);
            this.f2813d++;
            while (aVar.a.compareTo((Enum) c2) < 0 && this.a.f2201i.containsKey(hVar)) {
                this.f2815g.add(aVar.a);
                e.a b2 = e.a.b(aVar.a);
                if (b2 != null) {
                    aVar.a(iVar, b2);
                    h();
                    c2 = c(hVar);
                } else {
                    StringBuilder f2 = c.c.a.a.a.f("no event up from ");
                    f2.append(aVar.a);
                    throw new IllegalStateException(f2.toString());
                }
            }
            if (!z) {
                j();
            }
            this.f2813d--;
        }
    }

    @Override // g.n.e
    public void b(h hVar) {
        d("removeObserver");
        this.a.e(hVar);
    }

    public final e.b c(h hVar) {
        g.c.a.b.a<h, a> aVar = this.a;
        e.b bVar = null;
        b.c<K, V> cVar = aVar.f2201i.containsKey(hVar) ? aVar.f2201i.get(hVar).f2207h : null;
        e.b bVar2 = cVar != null ? cVar.f2205f.a : null;
        if (!this.f2815g.isEmpty()) {
            ArrayList<e.b> arrayList = this.f2815g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return f(f(this.b, bVar2), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void d(String str) {
        if (this.f2816h && !g.c.a.a.a.d().b()) {
            throw new IllegalStateException(c.c.a.a.a.c("Method ", str, " must be called on the main thread"));
        }
    }

    public void e(e.a aVar) {
        d("handleLifecycleEvent");
        g(aVar.a());
    }

    public final void g(e.b bVar) {
        if (this.b != bVar) {
            this.b = bVar;
            if (this.e || this.f2813d != 0) {
                this.f2814f = true;
                return;
            }
            this.e = true;
            j();
            this.e = false;
        }
    }

    public final void h() {
        ArrayList<e.b> arrayList = this.f2815g;
        arrayList.remove(arrayList.size() - 1);
    }

    public void i(e.b bVar) {
        d("setCurrentState");
        g(bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: g.c.a.b.a<g.n.h, g.n.j$a> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: g.c.a.b.a<g.n.h, g.n.j$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        e.b bVar;
        i iVar = this.f2812c.get();
        if (iVar != null) {
            while (true) {
                g.c.a.b.a<h, a> aVar = this.a;
                boolean z = true;
                if (!(aVar.f2204h == 0 || (aVar.e.f2205f.a == (bVar = aVar.f2202f.f2205f.a) && this.b == bVar))) {
                    z = false;
                }
                this.f2814f = false;
                if (!z) {
                    if (this.b.compareTo((Enum) aVar.e.f2205f.a) < 0) {
                        g.c.a.b.a<h, a> aVar2 = this.a;
                        b.C0069b bVar2 = new b.C0069b(aVar2.f2202f, aVar2.e);
                        aVar2.f2203g.put(bVar2, Boolean.FALSE);
                        while (bVar2.hasNext() && !this.f2814f) {
                            Map.Entry entry = (Map.Entry) bVar2.next();
                            a aVar3 = (a) entry.getValue();
                            while (aVar3.a.compareTo((Enum) this.b) > 0 && !this.f2814f && this.a.contains(entry.getKey())) {
                                int ordinal = aVar3.a.ordinal();
                                e.a aVar4 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : e.a.ON_PAUSE : e.a.ON_STOP : e.a.ON_DESTROY;
                                if (aVar4 != null) {
                                    this.f2815g.add(aVar4.a());
                                    aVar3.a(iVar, aVar4);
                                    h();
                                } else {
                                    StringBuilder f2 = c.c.a.a.a.f("no event down from ");
                                    f2.append(aVar3.a);
                                    throw new IllegalStateException(f2.toString());
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar = this.a.f2202f;
                    if (!this.f2814f && cVar != null && this.b.compareTo((Enum) cVar.f2205f.a) > 0) {
                        b<K, V>.d b2 = this.a.b();
                        while (b2.hasNext() && !this.f2814f) {
                            Map.Entry entry2 = (Map.Entry) b2.next();
                            a aVar5 = (a) entry2.getValue();
                            while (aVar5.a.compareTo((Enum) this.b) < 0 && !this.f2814f && this.a.contains(entry2.getKey())) {
                                this.f2815g.add(aVar5.a);
                                e.a b3 = e.a.b(aVar5.a);
                                if (b3 != null) {
                                    aVar5.a(iVar, b3);
                                    h();
                                } else {
                                    StringBuilder f3 = c.c.a.a.a.f("no event up from ");
                                    f3.append(aVar5.a);
                                    throw new IllegalStateException(f3.toString());
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
