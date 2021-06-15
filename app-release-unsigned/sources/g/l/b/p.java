package g.l.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import g.a.c;
import g.a.e.d;
import g.a.e.e;
import g.n.e;
import g.n.j;
import g.n.v;
import g.n.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class p extends ComponentActivity {

    /* renamed from: l  reason: collision with root package name */
    public final w f2746l;

    /* renamed from: m  reason: collision with root package name */
    public final j f2747m = new j(this);
    public boolean n;
    public boolean o;
    public boolean p = true;

    public class a extends y<p> implements w, c, e, f0 {
        public a() {
            super(p.this);
        }

        @Override // g.n.i
        public g.n.e a() {
            return p.this.f2747m;
        }

        @Override // g.a.c
        public OnBackPressedDispatcher b() {
            return p.this.f32j;
        }

        @Override // g.a.e.e
        public d d() {
            return p.this.f33k;
        }

        @Override // g.l.b.f0
        public void e(b0 b0Var, m mVar) {
            p.this.o();
        }

        @Override // g.l.b.v
        public View f(int i2) {
            return p.this.findViewById(i2);
        }

        @Override // g.n.w
        public v g() {
            return p.this.g();
        }

        @Override // g.l.b.v
        public boolean h() {
            Window window = p.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // g.l.b.y
        public p i() {
            return p.this;
        }

        @Override // g.l.b.y
        public LayoutInflater j() {
            return p.this.getLayoutInflater().cloneInContext(p.this);
        }

        @Override // g.l.b.y
        public boolean k(m mVar) {
            return !p.this.isFinishing();
        }

        @Override // g.l.b.y
        public void l() {
            p.this.p();
        }
    }

    public p() {
        a aVar = new a();
        g.h.b.d.e(aVar, "callbacks == null");
        this.f2746l = new w(aVar);
        this.f30h.b.b("android:support:fragments", new n(this));
        o oVar = new o(this);
        g.a.d.a aVar2 = this.f28f;
        if (aVar2.b != null) {
            oVar.a(aVar2.b);
        }
        aVar2.a.add(oVar);
    }

    public static boolean n(b0 b0Var, e.b bVar) {
        e.b bVar2 = e.b.STARTED;
        boolean z = false;
        for (m mVar : b0Var.L()) {
            if (mVar != null) {
                y<?> yVar = mVar.x;
                if ((yVar == null ? null : yVar.i()) != null) {
                    z |= n(mVar.j(), bVar);
                }
                v0 v0Var = mVar.T;
                if (v0Var != null) {
                    v0Var.e();
                    if (v0Var.f2779f.b.compareTo(bVar2) >= 0) {
                        j jVar = mVar.T.f2779f;
                        jVar.d("setCurrentState");
                        jVar.g(bVar);
                        z = true;
                    }
                }
                if (mVar.S.b.compareTo(bVar2) >= 0) {
                    j jVar2 = mVar.S;
                    jVar2.d("setCurrentState");
                    jVar2.g(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.n);
        printWriter.print(" mResumed=");
        printWriter.print(this.o);
        printWriter.print(" mStopped=");
        printWriter.print(this.p);
        if (getApplication() != null) {
            g.o.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2746l.a.f2800h.y(str, fileDescriptor, printWriter, strArr);
    }

    public b0 m() {
        return this.f2746l.a.f2800h;
    }

    @Deprecated
    public void o() {
    }

    @Override // androidx.activity.ComponentActivity
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f2746l.a();
        super.onActivityResult(i2, i3, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2746l.a();
        this.f2746l.a.f2800h.k(configuration);
    }

    @Override // androidx.activity.ComponentActivity, g.h.b.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2747m.e(e.a.ON_CREATE);
        this.f2746l.a.f2800h.m();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        w wVar = this.f2746l;
        return onCreatePanelMenu | wVar.a.f2800h.n(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f2746l.a.f2800h.f2644f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f2746l.a.f2800h.o();
        this.f2747m.e(e.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f2746l.a.f2800h.p();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f2746l.a.f2800h.r(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f2746l.a.f2800h.l(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f2746l.a.f2800h.q(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2746l.a();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f2746l.a.f2800h.s(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.o = false;
        this.f2746l.a.f2800h.w(5);
        this.f2747m.e(e.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f2746l.a.f2800h.u(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f2747m.e(e.a.ON_RESUME);
        b0 b0Var = this.f2746l.a.f2800h;
        b0Var.B = false;
        b0Var.C = false;
        b0Var.J.f2677i = false;
        b0Var.w(7);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return super.onPreparePanel(0, view, menu) | this.f2746l.a.f2800h.v(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    @Override // androidx.activity.ComponentActivity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f2746l.a();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.o = true;
        this.f2746l.a();
        this.f2746l.a.f2800h.C(true);
    }

    public void onStart() {
        super.onStart();
        this.p = false;
        if (!this.n) {
            this.n = true;
            b0 b0Var = this.f2746l.a.f2800h;
            b0Var.B = false;
            b0Var.C = false;
            b0Var.J.f2677i = false;
            b0Var.w(4);
        }
        this.f2746l.a();
        this.f2746l.a.f2800h.C(true);
        this.f2747m.e(e.a.ON_START);
        b0 b0Var2 = this.f2746l.a.f2800h;
        b0Var2.B = false;
        b0Var2.C = false;
        b0Var2.J.f2677i = false;
        b0Var2.w(5);
    }

    public void onStateNotSaved() {
        this.f2746l.a();
    }

    public void onStop() {
        super.onStop();
        this.p = true;
        do {
        } while (n(m(), e.b.CREATED));
        b0 b0Var = this.f2746l.a.f2800h;
        b0Var.C = true;
        b0Var.J.f2677i = true;
        b0Var.w(4);
        this.f2747m.e(e.a.ON_STOP);
    }

    @Deprecated
    public void p() {
        invalidateOptionsMenu();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f2746l.a.f2800h.f2644f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
