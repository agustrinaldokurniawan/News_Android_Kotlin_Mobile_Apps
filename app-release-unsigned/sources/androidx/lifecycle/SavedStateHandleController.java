package androidx.lifecycle;

import g.n.e;
import g.n.g;
import g.n.i;
import g.n.j;
import g.n.s;
import g.n.t;
import g.n.v;
import g.n.w;
import g.s.a;
import g.s.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class SavedStateHandleController implements g {
    public final String a;
    public boolean b = false;

    /* renamed from: c  reason: collision with root package name */
    public final s f199c;

    public static final class a implements a.AbstractC0096a {
        @Override // g.s.a.AbstractC0096a
        public void a(c cVar) {
            if (cVar instanceof w) {
                v g2 = ((w) cVar).g();
                g.s.a c2 = cVar.c();
                Objects.requireNonNull(g2);
                Iterator it = new HashSet(g2.a.keySet()).iterator();
                while (it.hasNext()) {
                    SavedStateHandleController.h(g2.a.get((String) it.next()), c2, cVar.a());
                }
                if (!new HashSet(g2.a.keySet()).isEmpty()) {
                    c2.c(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, s sVar) {
        this.a = str;
        this.f199c = sVar;
    }

    public static void h(t tVar, g.s.a aVar, e eVar) {
        Object obj;
        Map<String, Object> map = tVar.a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = tVar.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.b) {
            savedStateHandleController.i(aVar, eVar);
            j(aVar, eVar);
        }
    }

    public static void j(final g.s.a aVar, final e eVar) {
        e.b bVar = ((j) eVar).b;
        if (bVar != e.b.INITIALIZED) {
            if (!(bVar.compareTo(e.b.STARTED) >= 0)) {
                eVar.a(new g() {
                    /* class androidx.lifecycle.SavedStateHandleController.AnonymousClass1 */

                    @Override // g.n.g
                    public void d(i iVar, e.a aVar) {
                        if (aVar == e.a.ON_START) {
                            j jVar = (j) e.this;
                            jVar.d("removeObserver");
                            jVar.a.e(this);
                            aVar.c(a.class);
                        }
                    }
                });
                return;
            }
        }
        aVar.c(a.class);
    }

    @Override // g.n.g
    public void d(i iVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            this.b = false;
            j jVar = (j) iVar.a();
            jVar.d("removeObserver");
            jVar.a.e(this);
        }
    }

    public void i(g.s.a aVar, e eVar) {
        if (!this.b) {
            this.b = true;
            eVar.a(this);
            aVar.b(this.a, this.f199c.e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
