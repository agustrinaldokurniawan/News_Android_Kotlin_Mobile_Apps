package g.q.c;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import g.h.j.z.b;
import g.h.j.z.c;
import java.util.Map;
import java.util.WeakHashMap;

public class x extends g.h.j.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f2952d;
    public final a e;

    public static class a extends g.h.j.a {

        /* renamed from: d  reason: collision with root package name */
        public final x f2953d;
        public Map<View, g.h.j.a> e = new WeakHashMap();

        public a(x xVar) {
            this.f2953d = xVar;
        }

        @Override // g.h.j.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            g.h.j.a aVar = this.e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : this.b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // g.h.j.a
        public c b(View view) {
            g.h.j.a aVar = this.e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // g.h.j.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            g.h.j.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // g.h.j.a
        public void d(View view, b bVar) {
            if (!this.f2953d.j() && this.f2953d.f2952d.getLayoutManager() != null) {
                this.f2953d.f2952d.getLayoutManager().l0(view, bVar);
                g.h.j.a aVar = this.e.get(view);
                if (aVar != null) {
                    aVar.d(view, bVar);
                    return;
                }
            }
            this.b.onInitializeAccessibilityNodeInfo(view, bVar.b);
        }

        @Override // g.h.j.a
        public void e(View view, AccessibilityEvent accessibilityEvent) {
            g.h.j.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // g.h.j.a
        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            g.h.j.a aVar = this.e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : this.b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // g.h.j.a
        public boolean g(View view, int i2, Bundle bundle) {
            if (this.f2953d.j() || this.f2953d.f2952d.getLayoutManager() == null) {
                return super.g(view, i2, bundle);
            }
            g.h.j.a aVar = this.e.get(view);
            if (aVar != null) {
                if (aVar.g(view, i2, bundle)) {
                    return true;
                }
            } else if (super.g(view, i2, bundle)) {
                return true;
            }
            RecyclerView.l layoutManager = this.f2953d.f2952d.getLayoutManager();
            RecyclerView.r rVar = layoutManager.b.f235i;
            return layoutManager.D0();
        }

        @Override // g.h.j.a
        public void h(View view, int i2) {
            g.h.j.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.h(view, i2);
            } else {
                this.b.sendAccessibilityEvent(view, i2);
            }
        }

        @Override // g.h.j.a
        public void i(View view, AccessibilityEvent accessibilityEvent) {
            g.h.j.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                this.b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.f2952d = recyclerView;
        a aVar = this.e;
        this.e = aVar == null ? new a(this) : aVar;
    }

    @Override // g.h.j.a
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !j()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().j0(accessibilityEvent);
            }
        }
    }

    @Override // g.h.j.a
    public void d(View view, b bVar) {
        this.b.onInitializeAccessibilityNodeInfo(view, bVar.b);
        if (!j() && this.f2952d.getLayoutManager() != null) {
            RecyclerView.l layoutManager = this.f2952d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.b;
            RecyclerView.r rVar = recyclerView.f235i;
            RecyclerView.w wVar = recyclerView.m0;
            if (recyclerView.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
                bVar.b.addAction(8192);
                bVar.b.setScrollable(true);
            }
            if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
                bVar.b.addAction(4096);
                bVar.b.setScrollable(true);
            }
            bVar.i(b.C0078b.a(layoutManager.T(rVar, wVar), layoutManager.A(rVar, wVar), layoutManager.X(), layoutManager.U()));
        }
    }

    @Override // g.h.j.a
    public boolean g(View view, int i2, Bundle bundle) {
        if (super.g(view, i2, bundle)) {
            return true;
        }
        if (j() || this.f2952d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.l layoutManager = this.f2952d.getLayoutManager();
        RecyclerView.r rVar = layoutManager.b.f235i;
        return layoutManager.C0(i2);
    }

    public boolean j() {
        return this.f2952d.M();
    }
}
