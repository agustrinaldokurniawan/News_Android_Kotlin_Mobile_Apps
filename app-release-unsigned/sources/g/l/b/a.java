package g.l.b;

import android.util.Log;
import g.l.b.b0;
import g.l.b.j0;
import g.l.b.m;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class a extends j0 implements b0.l {
    public final b0 q;
    public boolean r;
    public int s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(g.l.b.b0 r3) {
        /*
            r2 = this;
            g.l.b.x r0 = r3.K()
            g.l.b.y<?> r1 = r3.q
            if (r1 == 0) goto L_0x000f
            android.content.Context r1 = r1.f2798f
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2.<init>(r0, r1)
            r0 = -1
            r2.s = r0
            r2.q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.l.b.a.<init>(g.l.b.b0):void");
    }

    @Override // g.l.b.b0.l
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (b0.O(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2699g) {
            return true;
        }
        b0 b0Var = this.q;
        if (b0Var.f2643d == null) {
            b0Var.f2643d = new ArrayList<>();
        }
        b0Var.f2643d.add(this);
        return true;
    }

    @Override // g.l.b.j0
    public int c() {
        return g(false);
    }

    @Override // g.l.b.j0
    public void d(int i2, m mVar, String str, int i3) {
        Class<?> cls = mVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder f2 = c.c.a.a.a.f("Fragment ");
            f2.append(cls.getCanonicalName());
            f2.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(f2.toString());
        }
        if (str != null) {
            String str2 = mVar.C;
            if (str2 == null || str.equals(str2)) {
                mVar.C = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + mVar + ": was " + mVar.C + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = mVar.A;
                if (i4 == 0 || i4 == i2) {
                    mVar.A = i2;
                    mVar.B = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + mVar + ": was " + mVar.A + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + mVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new j0.a(i3, mVar));
        mVar.w = this.q;
    }

    public void f(int i2) {
        if (this.f2699g) {
            if (b0.O(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                j0.a aVar = this.a.get(i3);
                m mVar = aVar.b;
                if (mVar != null) {
                    mVar.v += i2;
                    if (b0.O(2)) {
                        StringBuilder f2 = c.c.a.a.a.f("Bump nesting of ");
                        f2.append(aVar.b);
                        f2.append(" to ");
                        f2.append(aVar.b.v);
                        Log.v("FragmentManager", f2.toString());
                    }
                }
            }
        }
    }

    public int g(boolean z) {
        if (!this.r) {
            if (b0.O(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new w0("FragmentManager"));
                h("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            this.s = this.f2699g ? this.q.f2647i.getAndIncrement() : -1;
            this.q.A(this, z);
            return this.s;
        }
        throw new IllegalStateException("commit already called");
    }

    public void h(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2701i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f2698f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2698f));
            }
            if (!(this.b == 0 && this.f2696c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2696c));
            }
            if (!(this.f2697d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2697d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.f2702j == 0 && this.f2703k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2702j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2703k);
            }
            if (!(this.f2704l == 0 && this.f2705m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2704l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2705m);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                j0.a aVar = this.a.get(i2);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder f2 = c.c.a.a.a.f("cmd=");
                        f2.append(aVar.a);
                        str2 = f2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.f2706c == 0 && aVar.f2707d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2706c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2707d));
                    }
                    if (aVar.e != 0 || aVar.f2708f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2708f));
                    }
                }
            }
        }
    }

    public void i() {
        b0 b0Var;
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            j0.a aVar = this.a.get(i2);
            m mVar = aVar.b;
            if (mVar != null) {
                mVar.y0(false);
                int i3 = this.f2698f;
                if (!(mVar.M == null && i3 == 0)) {
                    mVar.f();
                    mVar.M.f2725h = i3;
                }
                ArrayList<String> arrayList = this.n;
                ArrayList<String> arrayList2 = this.o;
                mVar.f();
                m.b bVar = mVar.M;
                bVar.f2726i = arrayList;
                bVar.f2727j = arrayList2;
            }
            switch (aVar.a) {
                case 1:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.d0(mVar, false);
                    this.q.a(mVar);
                    continue;
                case 2:
                default:
                    StringBuilder f2 = c.c.a.a.a.f("Unknown cmd: ");
                    f2.append(aVar.a);
                    throw new IllegalArgumentException(f2.toString());
                case 3:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.Y(mVar);
                    continue;
                case 4:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.N(mVar);
                    continue;
                case 5:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.d0(mVar, false);
                    this.q.h0(mVar);
                    continue;
                case 6:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.j(mVar);
                    continue;
                case 7:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.d0(mVar, false);
                    this.q.c(mVar);
                    continue;
                case 8:
                    b0Var = this.q;
                    break;
                case 9:
                    b0Var = this.q;
                    mVar = null;
                    break;
                case 10:
                    this.q.e0(mVar, aVar.f2710h);
                    continue;
            }
            b0Var.f0(mVar);
        }
    }

    public void j(boolean z) {
        b0 b0Var;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            j0.a aVar = this.a.get(size);
            m mVar = aVar.b;
            if (mVar != null) {
                mVar.y0(true);
                int i2 = this.f2698f;
                int i3 = 8194;
                if (i2 != 4097) {
                    i3 = i2 != 4099 ? i2 != 8194 ? 0 : 4097 : 4099;
                }
                if (!(mVar.M == null && i3 == 0)) {
                    mVar.f();
                    mVar.M.f2725h = i3;
                }
                ArrayList<String> arrayList = this.o;
                ArrayList<String> arrayList2 = this.n;
                mVar.f();
                m.b bVar = mVar.M;
                bVar.f2726i = arrayList;
                bVar.f2727j = arrayList2;
            }
            switch (aVar.a) {
                case 1:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.d0(mVar, true);
                    this.q.Y(mVar);
                    continue;
                case 2:
                default:
                    StringBuilder f2 = c.c.a.a.a.f("Unknown cmd: ");
                    f2.append(aVar.a);
                    throw new IllegalArgumentException(f2.toString());
                case 3:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.a(mVar);
                    continue;
                case 4:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.h0(mVar);
                    continue;
                case 5:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.d0(mVar, true);
                    this.q.N(mVar);
                    continue;
                case 6:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.c(mVar);
                    continue;
                case 7:
                    mVar.s0(aVar.f2706c, aVar.f2707d, aVar.e, aVar.f2708f);
                    this.q.d0(mVar, true);
                    this.q.j(mVar);
                    continue;
                case 8:
                    b0Var = this.q;
                    mVar = null;
                    break;
                case 9:
                    b0Var = this.q;
                    break;
                case 10:
                    this.q.e0(mVar, aVar.f2709g);
                    continue;
            }
            b0Var.f0(mVar);
        }
    }

    public boolean k(int i2) {
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = this.a.get(i3).b;
            int i4 = mVar != null ? mVar.B : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean l(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            m mVar = this.a.get(i5).b;
            int i6 = mVar != null ? mVar.B : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        m mVar2 = aVar.a.get(i8).b;
                        if ((mVar2 != null ? mVar2.B : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    public j0 m(m mVar) {
        b0 b0Var = mVar.w;
        if (b0Var == null || b0Var == this.q) {
            b(new j0.a(8, mVar));
            return this;
        }
        StringBuilder f2 = c.c.a.a.a.f("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        f2.append(mVar.toString());
        f2.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(f2.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.f2701i != null) {
            sb.append(" ");
            sb.append(this.f2701i);
        }
        sb.append("}");
        return sb.toString();
    }
}
