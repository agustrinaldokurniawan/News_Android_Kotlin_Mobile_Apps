package g.l.b;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import g.e.g;
import g.h.j.n;
import g.h.j.o;
import g.l.b.m;
import g.l.b.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class c extends x0 {

    public class a implements Runnable {
        public final /* synthetic */ List e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ x0.d f2657f;

        public a(List list, x0.d dVar) {
            this.e = list;
            this.f2657f = dVar;
        }

        public void run() {
            if (this.e.contains(this.f2657f)) {
                this.e.remove(this.f2657f);
                c cVar = c.this;
                x0.d dVar = this.f2657f;
                Objects.requireNonNull(cVar);
                dVar.a.a(dVar.f2787c.J);
            }
        }
    }

    public static class b extends C0085c {

        /* renamed from: c  reason: collision with root package name */
        public boolean f2659c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2660d = false;
        public t e;

        public b(x0.d dVar, g.h.f.a aVar, boolean z) {
            super(dVar, aVar);
            this.f2659c = z;
        }

        public t c(Context context) {
            if (this.f2660d) {
                return this.e;
            }
            x0.d dVar = this.a;
            t q = g.h.b.d.q(context, dVar.f2787c, dVar.a == x0.d.c.VISIBLE, this.f2659c);
            this.e = q;
            this.f2660d = true;
            return q;
        }
    }

    /* renamed from: g.l.b.c$c  reason: collision with other inner class name */
    public static class C0085c {
        public final x0.d a;
        public final g.h.f.a b;

        public C0085c(x0.d dVar, g.h.f.a aVar) {
            this.a = dVar;
            this.b = aVar;
        }

        public void a() {
            x0.d dVar = this.a;
            if (dVar.e.remove(this.b) && dVar.e.isEmpty()) {
                dVar.b();
            }
        }

        public boolean b() {
            x0.d.c cVar;
            x0.d.c c2 = x0.d.c.c(this.a.f2787c.J);
            x0.d.c cVar2 = this.a.a;
            return c2 == cVar2 || !(c2 == (cVar = x0.d.c.VISIBLE) || cVar2 == cVar);
        }
    }

    public static class d extends C0085c {

        /* renamed from: c  reason: collision with root package name */
        public final Object f2661c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2662d;
        public final Object e;

        public d(x0.d dVar, g.h.f.a aVar, boolean z, boolean z2) {
            super(dVar, aVar);
            Object obj;
            Object obj2;
            if (dVar.a == x0.d.c.VISIBLE) {
                if (z) {
                    obj2 = dVar.f2787c.y();
                } else {
                    dVar.f2787c.m();
                    obj2 = null;
                }
                this.f2661c = obj2;
                if (z) {
                    m.b bVar = dVar.f2787c.M;
                } else {
                    m.b bVar2 = dVar.f2787c.M;
                }
            } else {
                if (z) {
                    obj = dVar.f2787c.A();
                } else {
                    dVar.f2787c.p();
                    obj = null;
                }
                this.f2661c = obj;
            }
            this.f2662d = true;
            if (z2) {
                if (z) {
                    this.e = dVar.f2787c.C();
                    return;
                }
                dVar.f2787c.B();
            }
            this.e = null;
        }

        public final s0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            s0 s0Var = q0.b;
            if (obj instanceof Transition) {
                return s0Var;
            }
            s0 s0Var2 = q0.f2757c;
            if (s0Var2 != null && s0Var2.e(obj)) {
                return s0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.f2787c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // g.l.b.x0
    public void b(List<x0.d> list, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        x0.d.c cVar;
        String str;
        boolean z2;
        HashMap hashMap;
        boolean z3;
        String str2;
        StringBuilder sb;
        boolean z4;
        t c2;
        String str3;
        Iterator it;
        View view;
        x0.d dVar;
        Object obj;
        x0.d.c cVar2;
        x0.d.c cVar3;
        Object obj2;
        x0.d dVar2;
        View view2;
        Object obj3;
        String str4;
        g.e.a aVar;
        ArrayList arrayList3;
        x0.d.c cVar4;
        ArrayList arrayList4;
        s0 s0Var;
        ArrayList<View> arrayList5;
        HashMap hashMap2;
        ArrayList<View> arrayList6;
        Rect rect;
        View view3;
        ArrayList<String> arrayList7;
        ArrayList<String> arrayList8;
        ArrayList<String> arrayList9;
        ArrayList<String> arrayList10;
        View view4;
        boolean z5 = z;
        x0.d.c cVar5 = x0.d.c.GONE;
        x0.d.c cVar6 = x0.d.c.VISIBLE;
        x0.d dVar3 = null;
        x0.d dVar4 = null;
        for (x0.d dVar5 : list) {
            x0.d.c c3 = x0.d.c.c(dVar5.f2787c.J);
            int ordinal = dVar5.a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (!(ordinal == 2 || ordinal == 3)) {
                    }
                } else if (c3 != cVar6) {
                    dVar4 = dVar5;
                }
            }
            if (c3 == cVar6 && dVar3 == null) {
                dVar3 = dVar5;
            }
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(list);
        Iterator<x0.d> it2 = list.iterator();
        while (it2.hasNext()) {
            x0.d next = it2.next();
            g.h.f.a aVar2 = new g.h.f.a();
            next.d();
            next.e.add(aVar2);
            arrayList11.add(new b(next, aVar2, z5));
            g.h.f.a aVar3 = new g.h.f.a();
            next.d();
            next.e.add(aVar3);
            arrayList12.add(new d(next, aVar3, z5, !z5 ? next == dVar4 : next == dVar3));
            next.f2788d.add(new a(arrayList13, next));
        }
        HashMap hashMap3 = new HashMap();
        Iterator it3 = arrayList12.iterator();
        s0 s0Var2 = null;
        while (it3.hasNext()) {
            d dVar6 = (d) it3.next();
            if (!dVar6.b()) {
                s0 c4 = dVar6.c(dVar6.f2661c);
                s0 c5 = dVar6.c(dVar6.e);
                if (c4 == null || c5 == null || c4 == c5) {
                    if (c4 == null) {
                        c4 = c5;
                    }
                    if (s0Var2 == null) {
                        s0Var2 = c4;
                    } else if (!(c4 == null || s0Var2 == c4)) {
                        StringBuilder f2 = c.c.a.a.a.f("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                        f2.append(dVar6.a.f2787c);
                        f2.append(" returned Transition ");
                        f2.append(dVar6.f2661c);
                        f2.append(" which uses a different Transition  type than other Fragments.");
                        throw new IllegalArgumentException(f2.toString());
                    }
                } else {
                    StringBuilder f3 = c.c.a.a.a.f("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    f3.append(dVar6.a.f2787c);
                    f3.append(" returned Transition ");
                    f3.append(dVar6.f2661c);
                    f3.append(" which uses a different Transition  type than its shared element transition ");
                    f3.append(dVar6.e);
                    throw new IllegalArgumentException(f3.toString());
                }
            }
        }
        if (s0Var2 == null) {
            Iterator it4 = arrayList12.iterator();
            while (it4.hasNext()) {
                d dVar7 = (d) it4.next();
                hashMap3.put(dVar7.a, Boolean.FALSE);
                dVar7.a();
            }
            z3 = false;
            z2 = true;
            str = "FragmentManager";
            cVar = cVar5;
            arrayList2 = arrayList11;
            arrayList = arrayList13;
            hashMap = hashMap3;
        } else {
            View view5 = new View(this.a.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList14 = new ArrayList<>();
            ArrayList<View> arrayList15 = new ArrayList<>();
            arrayList2 = arrayList11;
            g.e.a aVar4 = new g.e.a();
            Iterator it5 = arrayList12.iterator();
            Rect rect3 = rect2;
            Object obj4 = null;
            View view6 = null;
            boolean z6 = false;
            View view7 = view5;
            String str5 = "FragmentManager";
            x0.d dVar8 = dVar3;
            x0.d dVar9 = dVar4;
            while (it5.hasNext()) {
                Object obj5 = ((d) it5.next()).e;
                if (!(obj5 != null) || dVar8 == null || dVar9 == null) {
                    arrayList6 = arrayList15;
                    cVar4 = cVar5;
                    aVar = aVar4;
                    arrayList3 = arrayList12;
                    arrayList4 = arrayList13;
                    hashMap2 = hashMap3;
                    view3 = view7;
                    str4 = str5;
                    arrayList5 = arrayList14;
                    s0Var = s0Var2;
                    rect = rect3;
                } else {
                    Object y = s0Var2.y(s0Var2.g(obj5));
                    m.b bVar = dVar9.f2787c.M;
                    if (bVar == null || (arrayList7 = bVar.f2726i) == null) {
                        arrayList7 = new ArrayList<>();
                    }
                    m.b bVar2 = dVar8.f2787c.M;
                    if (bVar2 == null || (arrayList8 = bVar2.f2726i) == null) {
                        arrayList8 = new ArrayList<>();
                    }
                    arrayList4 = arrayList13;
                    m.b bVar3 = dVar8.f2787c.M;
                    if (bVar3 == null || (arrayList9 = bVar3.f2727j) == null) {
                        arrayList9 = new ArrayList<>();
                    }
                    cVar4 = cVar5;
                    arrayList3 = arrayList12;
                    int i2 = 0;
                    while (i2 < arrayList9.size()) {
                        int indexOf = arrayList7.indexOf(arrayList9.get(i2));
                        if (indexOf != -1) {
                            arrayList7.set(indexOf, arrayList8.get(i2));
                        }
                        i2++;
                        arrayList9 = arrayList9;
                    }
                    m.b bVar4 = dVar9.f2787c.M;
                    if (bVar4 == null || (arrayList10 = bVar4.f2727j) == null) {
                        arrayList10 = new ArrayList<>();
                    }
                    if (!z5) {
                        dVar8.f2787c.q();
                        dVar9.f2787c.n();
                    } else {
                        dVar8.f2787c.n();
                        dVar9.f2787c.q();
                    }
                    int i3 = 0;
                    for (int size = arrayList7.size(); i3 < size; size = size) {
                        aVar4.put(arrayList7.get(i3), arrayList10.get(i3));
                        i3++;
                    }
                    g.e.a<String, View> aVar5 = new g.e.a<>();
                    k(aVar5, dVar8.f2787c.J);
                    g.k(aVar5, arrayList7);
                    g.k(aVar4, aVar5.keySet());
                    g.e.a<String, View> aVar6 = new g.e.a<>();
                    k(aVar6, dVar9.f2787c.J);
                    g.k(aVar6, arrayList10);
                    g.k(aVar6, aVar4.values());
                    q0.m(aVar4, aVar6);
                    l(aVar5, aVar4.keySet());
                    l(aVar6, aVar4.values());
                    if (aVar4.isEmpty()) {
                        arrayList14.clear();
                        arrayList15.clear();
                        obj4 = null;
                        rect = rect3;
                        arrayList6 = arrayList15;
                        aVar = aVar4;
                        hashMap2 = hashMap3;
                        view3 = view7;
                        str4 = str5;
                        s0Var = s0Var2;
                        arrayList5 = arrayList14;
                    } else {
                        q0.c(dVar9.f2787c, dVar8.f2787c, z5, aVar5, true);
                        arrayList6 = arrayList15;
                        aVar = aVar4;
                        arrayList5 = arrayList14;
                        str4 = str5;
                        s0Var = s0Var2;
                        n.a(this.a, new h(this, dVar4, dVar3, z, aVar6));
                        Iterator it6 = ((g.e) aVar5.values()).iterator();
                        while (true) {
                            g.a aVar7 = (g.a) it6;
                            if (!aVar7.hasNext()) {
                                break;
                            }
                            j(arrayList5, (View) aVar7.next());
                        }
                        if (!arrayList7.isEmpty()) {
                            View view8 = aVar5.get(arrayList7.get(0));
                            s0Var.t(y, view8);
                            view6 = view8;
                        }
                        Iterator it7 = ((g.e) aVar6.values()).iterator();
                        while (true) {
                            g.a aVar8 = (g.a) it7;
                            if (!aVar8.hasNext()) {
                                break;
                            }
                            j(arrayList6, (View) aVar8.next());
                        }
                        if (arrayList10.isEmpty() || (view4 = aVar6.get(arrayList10.get(0))) == null) {
                            rect = rect3;
                        } else {
                            rect = rect3;
                            n.a(this.a, new i(this, s0Var, view4, rect));
                            z6 = true;
                        }
                        view3 = view7;
                        s0Var.w(y, view3, arrayList5);
                        s0Var.r(y, null, null, null, null, y, arrayList6);
                        Boolean bool = Boolean.TRUE;
                        hashMap2 = hashMap3;
                        dVar3 = dVar3;
                        hashMap2.put(dVar3, bool);
                        dVar4 = dVar4;
                        hashMap2.put(dVar4, bool);
                        obj4 = y;
                        dVar8 = dVar3;
                        dVar9 = dVar4;
                    }
                }
                view7 = view3;
                rect3 = rect;
                arrayList15 = arrayList6;
                arrayList14 = arrayList5;
                s0Var2 = s0Var;
                cVar6 = cVar6;
                arrayList13 = arrayList4;
                arrayList12 = arrayList3;
                aVar4 = aVar;
                str5 = str4;
                z5 = z;
                hashMap3 = hashMap2;
                cVar5 = cVar4;
            }
            x0.d.c cVar7 = cVar5;
            x0.d.c cVar8 = cVar6;
            arrayList = arrayList13;
            hashMap = hashMap3;
            View view9 = view7;
            String str6 = str5;
            ArrayList arrayList16 = new ArrayList();
            Iterator it8 = arrayList12.iterator();
            Object obj6 = null;
            Object obj7 = null;
            while (it8.hasNext()) {
                d dVar10 = (d) it8.next();
                if (dVar10.b()) {
                    it = it8;
                    dVar = dVar4;
                    hashMap.put(dVar10.a, Boolean.FALSE);
                    dVar10.a();
                    view = view9;
                    obj = obj4;
                    dVar2 = dVar9;
                    obj2 = obj6;
                    view2 = view6;
                    cVar3 = cVar8;
                    cVar2 = cVar7;
                } else {
                    it = it8;
                    dVar = dVar4;
                    Object g2 = s0Var2.g(dVar10.f2661c);
                    x0.d dVar11 = dVar10.a;
                    boolean z7 = obj4 != null && (dVar11 == dVar8 || dVar11 == dVar9);
                    if (g2 == null) {
                        if (!z7) {
                            hashMap.put(dVar11, Boolean.FALSE);
                            dVar10.a();
                        }
                        view = view9;
                        obj = obj4;
                        obj3 = obj6;
                        view2 = view6;
                        cVar3 = cVar8;
                        cVar2 = cVar7;
                    } else {
                        obj = obj4;
                        ArrayList<View> arrayList17 = new ArrayList<>();
                        j(arrayList17, dVar11.f2787c.J);
                        if (z7) {
                            if (dVar11 == dVar8) {
                                arrayList17.removeAll(arrayList14);
                            } else {
                                arrayList17.removeAll(arrayList15);
                            }
                        }
                        if (arrayList17.isEmpty()) {
                            s0Var2.a(g2, view9);
                            view = view9;
                            cVar2 = cVar7;
                        } else {
                            s0Var2.b(g2, arrayList17);
                            s0Var2.r(g2, g2, arrayList17, null, null, null, null);
                            cVar2 = cVar7;
                            if (dVar11.a == cVar2) {
                                arrayList.remove(dVar11);
                                view = view9;
                                s0Var2.q(g2, dVar11.f2787c.J, arrayList17);
                                n.a(this.a, new j(this, arrayList17));
                            } else {
                                view = view9;
                            }
                        }
                        cVar3 = cVar8;
                        if (dVar11.a == cVar3) {
                            arrayList16.addAll(arrayList17);
                            if (z6) {
                                s0Var2.s(g2, rect3);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            s0Var2.t(g2, view2);
                        }
                        hashMap.put(dVar11, Boolean.TRUE);
                        if (dVar10.f2662d) {
                            obj7 = s0Var2.m(obj7, g2, null);
                            obj3 = obj6;
                        } else {
                            obj3 = s0Var2.m(obj6, g2, null);
                        }
                    }
                    obj2 = obj3;
                    dVar2 = dVar;
                }
                it8 = it;
                view6 = view2;
                cVar8 = cVar3;
                cVar7 = cVar2;
                dVar4 = dVar;
                view9 = view;
                dVar9 = dVar2;
                obj6 = obj2;
                obj4 = obj;
            }
            x0.d dVar12 = dVar4;
            cVar = cVar7;
            Object l2 = s0Var2.l(obj7, obj6, obj4);
            Iterator it9 = arrayList12.iterator();
            while (it9.hasNext()) {
                d dVar13 = (d) it9.next();
                if (!dVar13.b()) {
                    Object obj8 = dVar13.f2661c;
                    x0.d dVar14 = dVar13.a;
                    boolean z8 = obj4 != null && (dVar14 == dVar8 || dVar14 == dVar12);
                    if (obj8 != null || z8) {
                        ViewGroup viewGroup = this.a;
                        AtomicInteger atomicInteger = o.a;
                        if (!viewGroup.isLaidOut()) {
                            if (b0.O(2)) {
                                StringBuilder f4 = c.c.a.a.a.f("SpecialEffectsController: Container ");
                                f4.append(this.a);
                                f4.append(" has not been laid out. Completing operation ");
                                f4.append(dVar14);
                                str3 = str6;
                                Log.v(str3, f4.toString());
                            } else {
                                str3 = str6;
                            }
                            dVar13.a();
                        } else {
                            s0Var2.u(dVar13.a.f2787c, l2, dVar13.b, new k(this, dVar13));
                            it9 = it9;
                            dVar12 = dVar12;
                        }
                    } else {
                        str3 = str6;
                    }
                    str6 = str3;
                    dVar12 = dVar12;
                }
            }
            str = str6;
            ViewGroup viewGroup2 = this.a;
            AtomicInteger atomicInteger2 = o.a;
            if (!viewGroup2.isLaidOut()) {
                z3 = false;
            } else {
                q0.o(arrayList16, 4);
                ArrayList<String> n = s0Var2.n(arrayList15);
                s0Var2.c(this.a, l2);
                s0Var2.v(this.a, arrayList14, arrayList15, n, aVar4);
                z3 = false;
                q0.o(arrayList16, 0);
                s0Var2.x(obj4, arrayList14, arrayList15);
            }
            z2 = true;
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup3 = this.a;
        Context context = viewGroup3.getContext();
        ArrayList arrayList18 = new ArrayList();
        Iterator it10 = arrayList2.iterator();
        boolean z9 = z3;
        while (it10.hasNext()) {
            b bVar5 = (b) it10.next();
            if (!bVar5.b() && (c2 = bVar5.c(context)) != null) {
                Animator animator = c2.b;
                if (animator == null) {
                    arrayList18.add(bVar5);
                    z4 = z3;
                    z3 = z4;
                } else {
                    x0.d dVar15 = bVar5.a;
                    m mVar = dVar15.f2787c;
                    z4 = z3;
                    if (!Boolean.TRUE.equals(hashMap.get(dVar15))) {
                        boolean z10 = dVar15.a == cVar ? z2 : z4;
                        if (z10) {
                            arrayList.remove(dVar15);
                        }
                        View view10 = mVar.J;
                        viewGroup3.startViewTransition(view10);
                        animator.addListener(new d(this, viewGroup3, view10, z10, dVar15, bVar5));
                        animator.setTarget(view10);
                        animator.start();
                        bVar5.b.b(new e(this, animator));
                        z3 = false;
                        z9 = z2;
                        z2 = z9;
                        arrayList = arrayList;
                        hashMap = hashMap;
                    } else if (b0.O(2)) {
                        Log.v(str, "Ignoring Animator set on " + mVar + " as this Fragment was involved in a Transition.");
                    }
                }
            } else {
                z4 = z3;
            }
            bVar5.a();
            z3 = z4;
        }
        Iterator it11 = arrayList18.iterator();
        while (it11.hasNext()) {
            b bVar6 = (b) it11.next();
            x0.d dVar16 = bVar6.a;
            m mVar2 = dVar16.f2787c;
            if (containsValue) {
                if (b0.O(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(mVar2);
                    str2 = " as Animations cannot run alongside Transitions.";
                }
                bVar6.a();
            } else if (z9) {
                if (b0.O(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(mVar2);
                    str2 = " as Animations cannot run alongside Animators.";
                }
                bVar6.a();
            } else {
                View view11 = mVar2.J;
                t c6 = bVar6.c(context);
                Objects.requireNonNull(c6);
                Animation animation = c6.a;
                Objects.requireNonNull(animation);
                if (dVar16.a != x0.d.c.REMOVED) {
                    view11.startAnimation(animation);
                    bVar6.a();
                } else {
                    viewGroup3.startViewTransition(view11);
                    u uVar = new u(animation, viewGroup3, view11);
                    uVar.setAnimationListener(new f(this, viewGroup3, view11, bVar6));
                    view11.startAnimation(uVar);
                }
                bVar6.b.b(new g(this, view11, viewGroup3, bVar6));
            }
            sb.append(str2);
            Log.v(str, sb.toString());
            bVar6.a();
        }
        Iterator it12 = arrayList.iterator();
        while (it12.hasNext()) {
            x0.d dVar17 = (x0.d) it12.next();
            dVar17.a.a(dVar17.f2787c.J);
        }
        arrayList.clear();
    }

    public void j(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            if (!arrayList.contains(view)) {
                AtomicInteger atomicInteger = o.a;
                if (view.getTransitionName() != null) {
                    arrayList.add(view);
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    j(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void k(Map<String, View> map, View view) {
        AtomicInteger atomicInteger = o.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public void l(g.e.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((g.b) aVar.entrySet()).iterator();
        while (true) {
            g.d dVar = (g.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                AtomicInteger atomicInteger = o.a;
                if (!collection.contains(((View) dVar.getValue()).getTransitionName())) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }
}
