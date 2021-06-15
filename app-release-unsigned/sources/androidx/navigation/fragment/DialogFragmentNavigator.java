package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.navigation.NavController;
import g.h.b.d;
import g.l.b.b0;
import g.l.b.l;
import g.l.b.m;
import g.n.e;
import g.n.g;
import g.n.i;
import g.p.j;
import g.p.o;
import g.p.q;
import g.p.u.b;
import g.p.u.c;
import java.util.HashSet;

@q.b("dialog")
public final class DialogFragmentNavigator extends q<a> {
    public final Context a;
    public final b0 b;

    /* renamed from: c  reason: collision with root package name */
    public int f213c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<String> f214d = new HashSet<>();
    public g e = new g(this) {
        /* class androidx.navigation.fragment.DialogFragmentNavigator.AnonymousClass1 */

        @Override // g.n.g
        public void d(i iVar, e.a aVar) {
            NavController j2;
            if (aVar == e.a.ON_STOP) {
                l lVar = (l) iVar;
                if (!lVar.D0().isShowing()) {
                    int i2 = b.X;
                    m mVar = lVar;
                    while (true) {
                        if (mVar == null) {
                            View view = lVar.J;
                            if (view != null) {
                                j2 = d.j(view);
                            } else {
                                Dialog dialog = lVar.i0;
                                if (dialog == null || dialog.getWindow() == null) {
                                    throw new IllegalStateException("Fragment " + lVar + " does not have a NavController set");
                                }
                                j2 = d.j(dialog.getWindow().getDecorView());
                            }
                        } else if (mVar instanceof b) {
                            j2 = ((b) mVar).Y;
                            if (j2 == null) {
                                throw new IllegalStateException("NavController is not available before onCreate()");
                            }
                        } else {
                            m mVar2 = mVar.u().t;
                            if (mVar2 instanceof b) {
                                j2 = ((b) mVar2).Y;
                                if (j2 == null) {
                                    throw new IllegalStateException("NavController is not available before onCreate()");
                                }
                            } else {
                                mVar = mVar.z;
                            }
                        }
                    }
                    j2.f();
                }
            }
        }
    };

    public static class a extends j implements g.p.b {

        /* renamed from: m  reason: collision with root package name */
        public String f215m;

        public a(q<? extends a> qVar) {
            super(qVar);
        }

        @Override // g.p.j
        public void e(Context context, AttributeSet attributeSet) {
            super.e(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, c.a);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f215m = string;
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, b0 b0Var) {
        this.a = context;
        this.b = b0Var;
    }

    /* Return type fixed from 'g.p.j' to match base method */
    @Override // g.p.q
    public a a() {
        return new a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g.p.j, android.os.Bundle, g.p.o, g.p.q$a] */
    @Override // g.p.q
    public j b(a aVar, Bundle bundle, o oVar, q.a aVar2) {
        a aVar3 = aVar;
        if (this.b.S()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String str = aVar3.f215m;
        if (str != null) {
            if (str.charAt(0) == '.') {
                str = this.a.getPackageName() + str;
            }
            m a2 = this.b.K().a(this.a.getClassLoader(), str);
            if (!l.class.isAssignableFrom(a2.getClass())) {
                StringBuilder f2 = c.c.a.a.a.f("Dialog destination ");
                String str2 = aVar3.f215m;
                if (str2 != null) {
                    throw new IllegalArgumentException(c.c.a.a.a.e(f2, str2, " is not an instance of DialogFragment"));
                }
                throw new IllegalStateException("DialogFragment class was not set");
            }
            l lVar = (l) a2;
            lVar.u0(bundle);
            lVar.S.a(this.e);
            b0 b0Var = this.b;
            StringBuilder f3 = c.c.a.a.a.f("androidx-nav-fragment:navigator:dialog:");
            int i2 = this.f213c;
            this.f213c = i2 + 1;
            f3.append(i2);
            String sb = f3.toString();
            lVar.k0 = false;
            lVar.l0 = true;
            g.l.b.a aVar4 = new g.l.b.a(b0Var);
            aVar4.d(0, lVar, sb, 1);
            aVar4.c();
            return aVar3;
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    @Override // g.p.q
    public void c(Bundle bundle) {
        this.f213c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
        for (int i2 = 0; i2 < this.f213c; i2++) {
            b0 b0Var = this.b;
            l lVar = (l) b0Var.I("androidx-nav-fragment:navigator:dialog:" + i2);
            if (lVar != null) {
                lVar.S.a(this.e);
            } else {
                HashSet<String> hashSet = this.f214d;
                hashSet.add("androidx-nav-fragment:navigator:dialog:" + i2);
            }
        }
    }

    @Override // g.p.q
    public Bundle d() {
        if (this.f213c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f213c);
        return bundle;
    }

    @Override // g.p.q
    public boolean e() {
        if (this.f213c == 0) {
            return false;
        }
        if (this.b.S()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        b0 b0Var = this.b;
        StringBuilder f2 = c.c.a.a.a.f("androidx-nav-fragment:navigator:dialog:");
        int i2 = this.f213c - 1;
        this.f213c = i2;
        f2.append(i2);
        m I = b0Var.I(f2.toString());
        if (I != null) {
            I.S.b(this.e);
            ((l) I).B0(false, false);
        }
        return true;
    }
}
