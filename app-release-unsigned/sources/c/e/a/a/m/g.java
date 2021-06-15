package c.e.a.a.m;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.tsuga.news.R;
import g.h.j.o;
import g.q.c.u;
import java.util.List;

public final class g<S> extends x<S> {
    public static final /* synthetic */ int Y = 0;
    public int Z;
    public d<S> a0;
    public a b0;
    public s c0;
    public int d0;
    public c e0;
    public RecyclerView f0;
    public RecyclerView g0;
    public View h0;
    public View i0;

    public class a implements Runnable {
        public final /* synthetic */ int e;

        public a(int i2) {
            this.e = i2;
        }

        public void run() {
            RecyclerView recyclerView = g.this.g0;
            int i2 = this.e;
            if (!recyclerView.E) {
                RecyclerView.l lVar = recyclerView.s;
                if (lVar == null) {
                    Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else {
                    lVar.W0(recyclerView, recyclerView.m0, i2);
                }
            }
        }
    }

    public class b extends g.h.j.a {
        public b(g gVar) {
        }

        @Override // g.h.j.a
        public void d(View view, g.h.j.z.b bVar) {
            this.b.onInitializeAccessibilityNodeInfo(view, bVar.b);
            bVar.i(null);
        }
    }

    public class c extends y {
        public final /* synthetic */ int G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, int i2, boolean z, int i3) {
            super(context, i2, z);
            this.G = i3;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void Z0(RecyclerView.w wVar, int[] iArr) {
            if (this.G == 0) {
                iArr[0] = g.this.g0.getWidth();
                iArr[1] = g.this.g0.getWidth();
                return;
            }
            iArr[0] = g.this.g0.getHeight();
            iArr[1] = g.this.g0.getHeight();
        }
    }

    public class d implements e {
        public d() {
        }
    }

    public interface e {
    }

    @Override // c.e.a.a.m.x
    public boolean B0(w<S> wVar) {
        return this.X.add(wVar);
    }

    public LinearLayoutManager C0() {
        return (LinearLayoutManager) this.g0.getLayoutManager();
    }

    public final void D0(int i2) {
        this.g0.post(new a(i2));
    }

    public void E0(s sVar) {
        RecyclerView recyclerView;
        int i2;
        v vVar = (v) this.g0.getAdapter();
        int p = vVar.e.e.p(sVar);
        int f2 = p - vVar.f(this.c0);
        boolean z = true;
        boolean z2 = Math.abs(f2) > 3;
        if (f2 <= 0) {
            z = false;
        }
        this.c0 = sVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.g0;
                i2 = p + 3;
            }
            D0(p);
        }
        recyclerView = this.g0;
        i2 = p - 3;
        recyclerView.i0(i2);
        D0(p);
    }

    public void F0(int i2) {
        this.d0 = i2;
        if (i2 == 2) {
            this.f0.getLayoutManager().M0(((c0) this.f0.getAdapter()).e(this.c0.f1255g));
            this.h0.setVisibility(0);
            this.i0.setVisibility(8);
        } else if (i2 == 1) {
            this.h0.setVisibility(8);
            this.i0.setVisibility(0);
            E0(this.c0);
        }
    }

    @Override // g.l.b.m
    public void O(Bundle bundle) {
        super.O(bundle);
        if (bundle == null) {
            bundle = this.f2718k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        this.a0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.b0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.c0 = (s) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // g.l.b.m
    public View R(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        u uVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(k(), this.Z);
        this.e0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        s sVar = this.b0.e;
        if (o.F0(contextThemeWrapper)) {
            i3 = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i3 = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        o.o(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new f());
        gridView.setNumColumns(sVar.f1256h);
        gridView.setEnabled(false);
        this.g0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.g0.setLayoutManager(new c(k(), i2, false, i2));
        this.g0.setTag("MONTHS_VIEW_GROUP_TAG");
        v vVar = new v(contextThemeWrapper, this.a0, this.b0, new d());
        this.g0.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f0.setAdapter(new c0(this));
            this.f0.g(new h(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            o.o(materialButton, new i(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.h0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.i0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            F0(1);
            materialButton.setText(this.c0.n(inflate.getContext()));
            this.g0.h(new j(this, vVar, materialButton));
            materialButton.setOnClickListener(new k(this));
            materialButton3.setOnClickListener(new l(this, vVar));
            materialButton2.setOnClickListener(new m(this, vVar));
        }
        if (!o.F0(contextThemeWrapper) && (recyclerView2 = (uVar = new u()).a) != (recyclerView = this.g0)) {
            if (recyclerView2 != null) {
                RecyclerView.p pVar = uVar.b;
                List<RecyclerView.p> list = recyclerView2.o0;
                if (list != null) {
                    list.remove(pVar);
                }
                uVar.a.setOnFlingListener(null);
            }
            uVar.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    uVar.a.h(uVar.b);
                    uVar.a.setOnFlingListener(uVar);
                    new Scroller(uVar.a.getContext(), new DecelerateInterpolator());
                    uVar.b();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        this.g0.i0(vVar.f(this.c0));
        return inflate;
    }

    @Override // g.l.b.m
    public void d0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.a0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.c0);
    }
}
