package g.b.g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.tsuga.news.R;
import g.b.f.i.g;
import g.b.f.i.i;
import g.b.f.i.k;
import g.b.f.i.l;
import g.b.f.i.m;
import g.b.f.i.n;
import g.b.f.i.p;
import g.b.f.i.r;
import java.util.ArrayList;
import java.util.Objects;

public class c extends g.b.f.i.b {
    public b A;
    public final f B = new f();

    /* renamed from: m  reason: collision with root package name */
    public d f2056m;
    public Drawable n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public int v;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public e x;
    public a y;
    public RunnableC0067c z;

    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!rVar.A.g()) {
                View view2 = c.this.f2056m;
                this.f2014f = view2 == null ? (View) c.this.f1962l : view2;
            }
            d(c.this.B);
        }

        @Override // g.b.f.i.l
        public void c() {
            c cVar = c.this;
            cVar.y = null;
            Objects.requireNonNull(cVar);
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: g.b.g.c$c  reason: collision with other inner class name */
    public class RunnableC0067c implements Runnable {
        public e e;

        public RunnableC0067c(e eVar) {
            this.e = eVar;
        }

        public void run() {
            g.a aVar;
            g gVar = c.this.f1957g;
            if (!(gVar == null || (aVar = gVar.f1989f) == null)) {
                aVar.b(gVar);
            }
            View view = (View) c.this.f1962l;
            if (!(view == null || view.getWindowToken() == null || !this.e.f())) {
                c.this.x = this.e;
            }
            c.this.z = null;
        }
    }

    public class d extends n implements ActionMenuView.a {

        public class a extends j0 {
            public a(View view, c cVar) {
                super(view);
            }

            @Override // g.b.g.j0
            public p b() {
                e eVar = c.this.x;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // g.b.g.j0
            public boolean c() {
                c.this.n();
                return true;
            }

            @Override // g.b.g.j0
            public boolean d() {
                c cVar = c.this;
                if (cVar.z != null) {
                    return false;
                }
                cVar.k();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            g.b.a.f(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.n();
            return true;
        }

        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, R.attr.actionOverflowMenuStyle, 0);
            this.f2015g = 8388613;
            d(c.this.B);
        }

        @Override // g.b.f.i.l
        public void c() {
            g gVar = c.this.f1957g;
            if (gVar != null) {
                gVar.c(true);
            }
            c.this.x = null;
            super.c();
        }
    }

    public class f implements m.a {
        public f() {
        }

        @Override // g.b.f.i.m.a
        public void a(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.k().c(false);
            }
            m.a aVar = c.this.f1959i;
            if (aVar != null) {
                aVar.a(gVar, z);
            }
        }

        @Override // g.b.f.i.m.a
        public boolean b(g gVar) {
            c cVar = c.this;
            if (gVar == cVar.f1957g) {
                return false;
            }
            int i2 = ((r) gVar).A.a;
            m.a aVar = cVar.f1959i;
            if (aVar != null) {
                return aVar.b(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    @Override // g.b.f.i.m
    public void a(g gVar, boolean z2) {
        b();
        m.a aVar = this.f1959i;
        if (aVar != null) {
            aVar.a(gVar, z2);
        }
    }

    public boolean b() {
        return k() | l();
    }

    @Override // g.b.f.i.m
    public boolean c() {
        int i2;
        ArrayList<i> arrayList;
        int i3;
        boolean z2;
        g gVar = this.f1957g;
        if (gVar != null) {
            arrayList = gVar.l();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i4 = this.t;
        int i5 = this.s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f1962l;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            i iVar = arrayList.get(i6);
            int i9 = iVar.y;
            if ((i9 & 2) == 2) {
                i8++;
            } else if ((i9 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.u && iVar.C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.p && (z3 || i7 + i8 > i4)) {
            i4--;
        }
        int i10 = i4 - i8;
        SparseBooleanArray sparseBooleanArray = this.w;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            i iVar2 = arrayList.get(i11);
            int i13 = iVar2.y;
            if ((i13 & 2) == i3 ? z2 : false) {
                View f2 = f(iVar2, null, viewGroup);
                f2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = f2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int i14 = iVar2.b;
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                iVar2.k(z2);
            } else if ((i13 & 1) == z2 ? z2 : false) {
                int i15 = iVar2.b;
                boolean z4 = sparseBooleanArray.get(i15);
                boolean z5 = ((i10 > 0 || z4) && i5 > 0) ? z2 : false;
                if (z5) {
                    View f3 = f(iVar2, null, viewGroup);
                    f3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = f3.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z5 &= i5 + i12 > 0;
                }
                if (z5 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z4) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i11; i16++) {
                        i iVar3 = arrayList.get(i16);
                        if (iVar3.b == i15) {
                            if (iVar3.g()) {
                                i10++;
                            }
                            iVar3.k(false);
                        }
                    }
                }
                if (z5) {
                    i10--;
                }
                iVar2.k(z5);
            } else {
                iVar2.k(false);
                i11++;
                i3 = 2;
                z2 = true;
            }
            i11++;
            i3 = 2;
            z2 = true;
        }
        return z2;
    }

    @Override // g.b.f.i.m
    public void d(Context context, g gVar) {
        this.f1956f = context;
        LayoutInflater.from(context);
        this.f1957g = gVar;
        Resources resources = context.getResources();
        if (!this.q) {
            this.p = true;
        }
        int i2 = 2;
        this.r = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.t = i2;
        int i5 = this.r;
        if (this.p) {
            if (this.f2056m == null) {
                d dVar = new d(this.e);
                this.f2056m = dVar;
                if (this.o) {
                    dVar.setImageDrawable(this.n);
                    this.n = null;
                    this.o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2056m.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f2056m.getMeasuredWidth();
        } else {
            this.f2056m = null;
        }
        this.s = i5;
        this.v = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public View f(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        View actionView = iVar.getActionView();
        int i2 = 0;
        if (actionView == null || iVar.f()) {
            if (view instanceof n.a) {
                aVar = (n.a) view;
            } else {
                aVar = (n.a) this.f1958h.inflate(this.f1961k, viewGroup, false);
            }
            aVar.d(iVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f1962l);
            if (this.A == null) {
                this.A = new b();
            }
            actionMenuItemView.setPopupCallback(this.A);
            actionView = (View) aVar;
        }
        if (iVar.C) {
            i2 = 8;
        }
        actionView.setVisibility(i2);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // g.b.f.i.m
    public boolean i(r rVar) {
        boolean z2 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (true) {
            g gVar = rVar2.z;
            if (gVar == this.f1957g) {
                break;
            }
            rVar2 = (r) gVar;
        }
        i iVar = rVar2.A;
        ViewGroup viewGroup = (ViewGroup) this.f1962l;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == iVar) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        int i3 = rVar.A.a;
        int size = rVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i4++;
        }
        a aVar = new a(this.f1956f, rVar, view);
        this.y = aVar;
        aVar.f2016h = z2;
        k kVar = aVar.f2018j;
        if (kVar != null) {
            kVar.o(z2);
        }
        if (this.y.f()) {
            m.a aVar2 = this.f1959i;
            if (aVar2 != null) {
                aVar2.b(rVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    @Override // g.b.f.i.m
    public void j(boolean z2) {
        n nVar;
        int i2;
        boolean z3;
        ViewGroup viewGroup = (ViewGroup) this.f1962l;
        ArrayList<i> arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            g gVar = this.f1957g;
            if (gVar != null) {
                gVar.i();
                ArrayList<i> l2 = this.f1957g.l();
                int size = l2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = l2.get(i3);
                    if (iVar.g()) {
                        View childAt = viewGroup.getChildAt(i2);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View f2 = f(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            f2.setPressed(false);
                            f2.jumpDrawablesToCurrentState();
                        }
                        if (f2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) f2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(f2);
                            }
                            ((ViewGroup) this.f1962l).addView(f2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f2056m) {
                    z3 = false;
                } else {
                    viewGroup.removeViewAt(i2);
                    z3 = true;
                }
                if (!z3) {
                    i2++;
                }
            }
        }
        ((View) this.f1962l).requestLayout();
        g gVar2 = this.f1957g;
        if (gVar2 != null) {
            gVar2.i();
            ArrayList<i> arrayList2 = gVar2.f1993j;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                g.h.j.b bVar = arrayList2.get(i4).A;
            }
        }
        g gVar3 = this.f1957g;
        if (gVar3 != null) {
            gVar3.i();
            arrayList = gVar3.f1994k;
        }
        if (this.p && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        d dVar = this.f2056m;
        if (z4) {
            if (dVar == null) {
                this.f2056m = new d(this.e);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2056m.getParent();
            if (viewGroup3 != this.f1962l) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2056m);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1962l;
                d dVar2 = this.f2056m;
                ActionMenuView.c q2 = actionMenuView.h();
                q2.a = true;
                actionMenuView.addView(dVar2, q2);
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.f1962l)) {
            ((ViewGroup) nVar).removeView(this.f2056m);
        }
        ((ActionMenuView) this.f1962l).setOverflowReserved(this.p);
    }

    public boolean k() {
        n nVar;
        RunnableC0067c cVar = this.z;
        if (cVar == null || (nVar = this.f1962l) == null) {
            e eVar = this.x;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f2018j.dismiss();
            }
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.z = null;
        return true;
    }

    public boolean l() {
        a aVar = this.y;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b()) {
            return true;
        }
        aVar.f2018j.dismiss();
        return true;
    }

    public boolean m() {
        e eVar = this.x;
        return eVar != null && eVar.b();
    }

    public boolean n() {
        g gVar;
        if (!this.p || m() || (gVar = this.f1957g) == null || this.f1962l == null || this.z != null) {
            return false;
        }
        gVar.i();
        if (gVar.f1994k.isEmpty()) {
            return false;
        }
        RunnableC0067c cVar = new RunnableC0067c(new e(this.f1956f, this.f1957g, this.f2056m, true));
        this.z = cVar;
        ((View) this.f1962l).post(cVar);
        return true;
    }
}
