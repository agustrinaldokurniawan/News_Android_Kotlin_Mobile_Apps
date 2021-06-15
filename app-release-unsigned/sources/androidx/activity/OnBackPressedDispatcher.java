package androidx.activity;

import android.annotation.SuppressLint;
import g.a.b;
import g.n.e;
import g.n.g;
import g.n.i;
import g.n.j;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final ArrayDeque<b> b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements g, g.a.a {
        public final e a;
        public final b b;

        /* renamed from: c  reason: collision with root package name */
        public g.a.a f36c;

        public LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            this.a = eVar;
            this.b = bVar;
            eVar.a(this);
        }

        @Override // g.a.a
        public void cancel() {
            j jVar = (j) this.a;
            jVar.d("removeObserver");
            jVar.a.e(this);
            this.b.b.remove(this);
            g.a.a aVar = this.f36c;
            if (aVar != null) {
                aVar.cancel();
                this.f36c = null;
            }
        }

        @Override // g.n.g
        public void d(i iVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.b;
                onBackPressedDispatcher.b.add(bVar);
                a aVar2 = new a(bVar);
                bVar.b.add(aVar2);
                this.f36c = aVar2;
            } else if (aVar == e.a.ON_STOP) {
                g.a.a aVar3 = this.f36c;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
            } else if (aVar == e.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    public class a implements g.a.a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // g.a.a
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.a);
            this.a.b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(i iVar, b bVar) {
        e a2 = iVar.a();
        if (((j) a2).b != e.b.DESTROYED) {
            bVar.b.add(new LifecycleOnBackPressedCancellable(a2, bVar));
        }
    }

    public void b() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
