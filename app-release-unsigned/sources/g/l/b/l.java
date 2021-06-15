package g.l.b;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.tsuga.news.R;
import g.l.b.b0;
import g.l.b.j0;
import g.l.b.m;
import g.n.i;
import g.n.o;
import g.n.p;
import java.util.Objects;

public class l extends m implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler X;
    public Runnable Y = new a();
    public DialogInterface.OnCancelListener Z = new b();
    public DialogInterface.OnDismissListener a0 = new c();
    public int b0 = 0;
    public int c0 = 0;
    public boolean d0 = true;
    public boolean e0 = true;
    public int f0 = -1;
    public boolean g0;
    public p<i> h0 = new d();
    public Dialog i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0 = false;

    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            l lVar = l.this;
            lVar.a0.onDismiss(lVar.i0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            l lVar = l.this;
            Dialog dialog = lVar.i0;
            if (dialog != null) {
                lVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            l lVar = l.this;
            Dialog dialog = lVar.i0;
            if (dialog != null) {
                lVar.onDismiss(dialog);
            }
        }
    }

    public class d implements p<i> {
        public d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // g.n.p
        @SuppressLint({"SyntheticAccessor"})
        public void a(i iVar) {
            if (iVar != null) {
                l lVar = l.this;
                if (lVar.e0) {
                    View p0 = lVar.p0();
                    if (p0.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    } else if (l.this.i0 != null) {
                        if (b0.O(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + l.this.i0);
                        }
                        l.this.i0.setContentView(p0);
                    }
                }
            }
        }
    }

    public class e extends v {
        public final /* synthetic */ v a;

        public e(v vVar) {
            this.a = vVar;
        }

        @Override // g.l.b.v
        public View f(int i2) {
            if (this.a.h()) {
                return this.a.f(i2);
            }
            Dialog dialog = l.this.i0;
            if (dialog != null) {
                return dialog.findViewById(i2);
            }
            return null;
        }

        @Override // g.l.b.v
        public boolean h() {
            return this.a.h() || l.this.m0;
        }
    }

    public final void B0(boolean z, boolean z2) {
        if (!this.k0) {
            this.k0 = true;
            this.l0 = false;
            Dialog dialog = this.i0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.i0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.X.getLooper()) {
                        onDismiss(this.i0);
                    } else {
                        this.X.post(this.Y);
                    }
                }
            }
            this.j0 = true;
            if (this.f0 >= 0) {
                b0 u = u();
                int i2 = this.f0;
                if (i2 >= 0) {
                    u.A(new b0.m(null, i2, 1), false);
                    this.f0 = -1;
                    return;
                }
                throw new IllegalArgumentException(c.c.a.a.a.l("Bad id: ", i2));
            }
            a aVar = new a(u());
            b0 b0Var = this.w;
            if (b0Var == null || b0Var == aVar.q) {
                aVar.b(new j0.a(3, this));
                if (z) {
                    aVar.g(true);
                } else {
                    aVar.c();
                }
            } else {
                StringBuilder f2 = c.c.a.a.a.f("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
                f2.append(toString());
                f2.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(f2.toString());
            }
        }
    }

    public Dialog C0(Bundle bundle) {
        if (b0.O(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(o0(), this.c0);
    }

    public final Dialog D0() {
        Dialog dialog = this.i0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // g.l.b.m
    public void L(Context context) {
        super.L(context);
        o<i> oVar = this.U;
        p<i> pVar = this.h0;
        Objects.requireNonNull(oVar);
        LiveData.a("observeForever");
        LiveData.b bVar = new LiveData.b(oVar, pVar);
        LiveData<T>.c d2 = oVar.f188c.d(pVar, bVar);
        if (!(d2 instanceof LiveData.LifecycleBoundObserver)) {
            if (d2 == null) {
                bVar.h(true);
            }
            if (!this.l0) {
                this.k0 = false;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    @Override // g.l.b.m
    public void O(Bundle bundle) {
        super.O(bundle);
        this.X = new Handler();
        this.e0 = this.B == 0;
        if (bundle != null) {
            this.b0 = bundle.getInt("android:style", 0);
            this.c0 = bundle.getInt("android:theme", 0);
            this.d0 = bundle.getBoolean("android:cancelable", true);
            this.e0 = bundle.getBoolean("android:showsDialog", this.e0);
            this.f0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // g.l.b.m
    public void T() {
        this.H = true;
        Dialog dialog = this.i0;
        if (dialog != null) {
            this.j0 = true;
            dialog.setOnDismissListener(null);
            this.i0.dismiss();
            if (!this.k0) {
                onDismiss(this.i0);
            }
            this.i0 = null;
            this.m0 = false;
        }
    }

    @Override // g.l.b.m
    public void U() {
        this.H = true;
        if (!this.l0 && !this.k0) {
            this.k0 = true;
        }
        this.U.g(this.h0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[Catch:{ all -> 0x006b }] */
    @Override // g.l.b.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.LayoutInflater V(android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: g.l.b.l.V(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // g.l.b.m
    public v d() {
        return new e(new m.a());
    }

    @Override // g.l.b.m
    public void d0(Bundle bundle) {
        Dialog dialog = this.i0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.b0;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.c0;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.d0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.e0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.f0;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    @Override // g.l.b.m
    public void e0() {
        this.H = true;
        Dialog dialog = this.i0;
        if (dialog != null) {
            this.j0 = false;
            dialog.show();
            View decorView = this.i0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // g.l.b.m
    public void f0() {
        this.H = true;
        Dialog dialog = this.i0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // g.l.b.m
    public void h0(Bundle bundle) {
        Bundle bundle2;
        this.H = true;
        if (this.i0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.i0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // g.l.b.m
    public void i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.i0(layoutInflater, viewGroup, bundle);
        if (this.J == null && this.i0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.i0.onRestoreInstanceState(bundle2);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.j0) {
            if (b0.O(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            B0(true, true);
        }
    }
}
