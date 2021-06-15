package g.l.b;

import android.view.View;
import g.e.g;
import g.h.j.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class q0 {
    public static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final s0 b = new r0();

    /* renamed from: c  reason: collision with root package name */
    public static final s0 f2757c;

    public interface a {
    }

    public static class b {
        public m a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public a f2758c;

        /* renamed from: d  reason: collision with root package name */
        public m f2759d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public a f2760f;
    }

    static {
        s0 s0Var;
        try {
            s0Var = (s0) Class.forName("g.u.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            s0Var = null;
        }
        f2757c = s0Var;
    }

    public static void a(ArrayList<View> arrayList, g.e.a<String, View> aVar, Collection<String> collection) {
        for (int i2 = aVar.f2251k - 1; i2 >= 0; i2--) {
            View l2 = aVar.l(i2);
            AtomicInteger atomicInteger = o.a;
            if (collection.contains(l2.getTransitionName())) {
                arrayList.add(l2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        if (r0.p != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0087, code lost:
        if (r0.D != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0089, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(g.l.b.a r8, g.l.b.j0.a r9, android.util.SparseArray<g.l.b.q0.b> r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: g.l.b.q0.b(g.l.b.a, g.l.b.j0$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(m mVar, m mVar2, boolean z, g.e.a<String, View> aVar, boolean z2) {
        if (z) {
            mVar2.n();
        } else {
            mVar.n();
        }
    }

    public static boolean d(s0 s0Var, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!s0Var.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static g.e.a<String, View> e(s0 s0Var, g.e.a<String, String> aVar, Object obj, b bVar) {
        ArrayList<String> arrayList;
        m mVar = bVar.a;
        View view = mVar.J;
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        g.e.a<String, View> aVar2 = new g.e.a<>();
        s0Var.i(aVar2, view);
        a aVar3 = bVar.f2758c;
        if (bVar.b) {
            mVar.q();
            arrayList = aVar3.n;
        } else {
            mVar.n();
            arrayList = aVar3.o;
        }
        if (arrayList != null) {
            g.k(aVar2, arrayList);
            g.k(aVar2, aVar.values());
        }
        m(aVar, aVar2);
        return aVar2;
    }

    public static g.e.a<String, View> f(s0 s0Var, g.e.a<String, String> aVar, Object obj, b bVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        m mVar = bVar.f2759d;
        g.e.a<String, View> aVar2 = new g.e.a<>();
        s0Var.i(aVar2, mVar.p0());
        a aVar3 = bVar.f2760f;
        if (bVar.e) {
            mVar.n();
            arrayList = aVar3.o;
        } else {
            mVar.q();
            arrayList = aVar3.n;
        }
        if (arrayList != null) {
            g.k(aVar2, arrayList);
        }
        g.k(aVar, aVar2.keySet());
        return aVar2;
    }

    public static s0 g(m mVar, m mVar2) {
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            mVar.p();
            Object A = mVar.A();
            if (A != null) {
                arrayList.add(A);
            }
            Object C = mVar.C();
            if (C != null) {
                arrayList.add(C);
            }
        }
        if (mVar2 != null) {
            mVar2.m();
            Object y = mVar2.y();
            if (y != null) {
                arrayList.add(y);
            }
            mVar2.B();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        s0 s0Var = b;
        if (d(s0Var, arrayList)) {
            return s0Var;
        }
        s0 s0Var2 = f2757c;
        if (s0Var2 != null && d(s0Var2, arrayList)) {
            return s0Var2;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> h(s0 s0Var, Object obj, m mVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = mVar.J;
        if (view2 != null) {
            s0Var.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        s0Var.b(obj, arrayList2);
        return arrayList2;
    }

    public static Object i(s0 s0Var, m mVar, boolean z) {
        Object obj = null;
        if (mVar == null) {
            return null;
        }
        if (z) {
            obj = mVar.y();
        } else {
            mVar.m();
        }
        return s0Var.g(obj);
    }

    public static Object j(s0 s0Var, m mVar, boolean z) {
        Object obj = null;
        if (mVar == null) {
            return null;
        }
        if (z) {
            obj = mVar.A();
        } else {
            mVar.p();
        }
        return s0Var.g(obj);
    }

    public static View k(g.e.a<String, View> aVar, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a aVar2 = bVar.f2758c;
        if (obj == null || aVar == null || (arrayList = aVar2.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.n : aVar2.o).get(0));
    }

    public static Object l(s0 s0Var, m mVar, m mVar2, boolean z) {
        Object obj;
        if (z) {
            obj = mVar2.C();
        } else {
            mVar.B();
            obj = null;
        }
        return s0Var.y(s0Var.g(obj));
    }

    public static void m(g.e.a<String, String> aVar, g.e.a<String, View> aVar2) {
        int i2 = aVar.f2251k;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            if (!aVar2.containsKey(aVar.l(i2))) {
                aVar.j(i2);
            }
        }
    }

    public static void n(s0 s0Var, Object obj, Object obj2, g.e.a<String, View> aVar, boolean z, a aVar2) {
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.o : aVar2.n).get(0));
            s0Var.t(obj, view);
            if (obj2 != null) {
                s0Var.t(obj2, view);
            }
        }
    }

    public static void o(ArrayList<View> arrayList, int i2) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03f5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0230 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void p(android.content.Context r37, g.l.b.v r38, java.util.ArrayList<g.l.b.a> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43, g.l.b.q0.a r44) {
        /*
        // Method dump skipped, instructions count: 1032
        */
        throw new UnsupportedOperationException("Method not decompiled: g.l.b.q0.p(android.content.Context, g.l.b.v, java.util.ArrayList, java.util.ArrayList, int, int, boolean, g.l.b.q0$a):void");
    }
}
