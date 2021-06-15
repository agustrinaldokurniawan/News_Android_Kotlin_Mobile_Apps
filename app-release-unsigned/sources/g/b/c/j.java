package g.b.c;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import com.tsuga.news.R;
import g.b.f.a;
import g.b.f.i.g;
import g.b.f.i.m;
import g.b.g.e0;
import g.b.g.f1;
import g.b.g.p0;
import g.b.g.z0;
import g.h.j.o;
import g.h.j.u;
import g.h.j.w;
import g.h.j.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class j extends i implements g.a, LayoutInflater.Factory2 {

    /* renamed from: g  reason: collision with root package name */
    public static final g.e.h<String, Integer> f1868g = new g.e.h<>();

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f1869h = {16842836};

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f1870i = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f1871j = true;
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public i[] M;
    public i N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T = -100;
    public int U;
    public boolean V;
    public boolean W;
    public f X;
    public f Y;
    public boolean Z;
    public int a0;
    public final Runnable b0 = new a();
    public boolean c0;
    public Rect d0;
    public Rect e0;
    public p f0;

    /* renamed from: k  reason: collision with root package name */
    public final Object f1872k;

    /* renamed from: l  reason: collision with root package name */
    public final Context f1873l;

    /* renamed from: m  reason: collision with root package name */
    public Window f1874m;
    public d n;
    public final h o;
    public a p;
    public MenuInflater q;
    public CharSequence r;
    public e0 s;
    public b t;
    public C0063j u;
    public g.b.f.a v;
    public ActionBarContextView w;
    public PopupWindow x;
    public Runnable y;
    public u z = null;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            j jVar = j.this;
            if ((jVar.a0 & 1) != 0) {
                jVar.H(0);
            }
            j jVar2 = j.this;
            if ((jVar2.a0 & 4096) != 0) {
                jVar2.H(108);
            }
            j jVar3 = j.this;
            jVar3.Z = false;
            jVar3.a0 = 0;
        }
    }

    public final class b implements m.a {
        public b() {
        }

        @Override // g.b.f.i.m.a
        public void a(g.b.f.i.g gVar, boolean z) {
            j.this.D(gVar);
        }

        @Override // g.b.f.i.m.a
        public boolean b(g.b.f.i.g gVar) {
            Window.Callback O = j.this.O();
            if (O == null) {
                return true;
            }
            O.onMenuOpened(108, gVar);
            return true;
        }
    }

    public class c implements a.AbstractC0064a {
        public a.AbstractC0064a a;

        public class a extends w {
            public a() {
            }

            @Override // g.h.j.v
            public void a(View view) {
                j.this.w.setVisibility(8);
                j jVar = j.this;
                PopupWindow popupWindow = jVar.x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (jVar.w.getParent() instanceof View) {
                    AtomicInteger atomicInteger = o.a;
                    ((View) j.this.w.getParent()).requestApplyInsets();
                }
                j.this.w.h();
                j.this.z.d(null);
                j jVar2 = j.this;
                jVar2.z = null;
                ViewGroup viewGroup = jVar2.B;
                AtomicInteger atomicInteger2 = o.a;
                viewGroup.requestApplyInsets();
            }
        }

        public c(a.AbstractC0064a aVar) {
            this.a = aVar;
        }

        @Override // g.b.f.a.AbstractC0064a
        public boolean a(g.b.f.a aVar, Menu menu) {
            ViewGroup viewGroup = j.this.B;
            AtomicInteger atomicInteger = o.a;
            viewGroup.requestApplyInsets();
            return this.a.a(aVar, menu);
        }

        @Override // g.b.f.a.AbstractC0064a
        public boolean b(g.b.f.a aVar, MenuItem menuItem) {
            return this.a.b(aVar, menuItem);
        }

        @Override // g.b.f.a.AbstractC0064a
        public boolean c(g.b.f.a aVar, Menu menu) {
            return this.a.c(aVar, menu);
        }

        @Override // g.b.f.a.AbstractC0064a
        public void d(g.b.f.a aVar) {
            this.a.d(aVar);
            j jVar = j.this;
            if (jVar.x != null) {
                jVar.f1874m.getDecorView().removeCallbacks(j.this.y);
            }
            j jVar2 = j.this;
            if (jVar2.w != null) {
                jVar2.I();
                j jVar3 = j.this;
                u b2 = o.b(jVar3.w);
                b2.a(0.0f);
                jVar3.z = b2;
                u uVar = j.this.z;
                a aVar2 = new a();
                View view = uVar.a.get();
                if (view != null) {
                    uVar.e(view, aVar2);
                }
            }
            j jVar4 = j.this;
            h hVar = jVar4.o;
            if (hVar != null) {
                hVar.h(jVar4.v);
            }
            j jVar5 = j.this;
            jVar5.v = null;
            ViewGroup viewGroup = jVar5.B;
            AtomicInteger atomicInteger = o.a;
            viewGroup.requestApplyInsets();
        }
    }

    public class d extends g.b.f.h {
        public d(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r11) {
            /*
            // Method dump skipped, instructions count: 521
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.d.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return j.this.G(keyEvent) || this.e.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
            if (r3 != false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
            if (r7 != false) goto L_0x006b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.d.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof g.b.f.i.g)) {
                return this.e.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i2, Menu menu) {
            this.e.onMenuOpened(i2, menu);
            j jVar = j.this;
            Objects.requireNonNull(jVar);
            if (i2 == 108) {
                jVar.P();
                a aVar = jVar.p;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
            return true;
        }

        public void onPanelClosed(int i2, Menu menu) {
            this.e.onPanelClosed(i2, menu);
            j jVar = j.this;
            Objects.requireNonNull(jVar);
            if (i2 == 108) {
                jVar.P();
                a aVar = jVar.p;
                if (aVar != null) {
                    aVar.a(false);
                }
            } else if (i2 == 0) {
                i N = jVar.N(i2);
                if (N.f1890m) {
                    jVar.E(N, false);
                }
            }
        }

        public boolean onPreparePanel(int i2, View view, Menu menu) {
            g.b.f.i.g gVar = menu instanceof g.b.f.i.g ? (g.b.f.i.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.y = true;
            }
            boolean onPreparePanel = this.e.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.y = false;
            }
            return onPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            g.b.f.i.g gVar = j.this.N(0).f1885h;
            if (gVar != null) {
                this.e.onProvideKeyboardShortcuts(list, gVar, i2);
            } else {
                this.e.onProvideKeyboardShortcuts(list, menu, i2);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            Objects.requireNonNull(j.this);
            if (i2 != 0) {
                return this.e.onWindowStartingActionMode(callback, i2);
            }
            return a(callback);
        }
    }

    public class e extends f {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f1876c;

        public e(Context context) {
            super();
            this.f1876c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // g.b.c.j.f
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // g.b.c.j.f
        public int c() {
            return this.f1876c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // g.b.c.j.f
        public void d() {
            j.this.z();
        }
    }

    public abstract class f {
        public BroadcastReceiver a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                f.this.d();
            }
        }

        public f() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    j.this.f1873l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                j.this.f1873l.registerReceiver(this.a, b2);
            }
        }
    }

    public class g extends f {

        /* renamed from: c  reason: collision with root package name */
        public final r f1878c;

        public g(r rVar) {
            super();
            this.f1878c = rVar;
        }

        @Override // g.b.c.j.f
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        @Override // g.b.c.j.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c() {
            /*
            // Method dump skipped, instructions count: 238
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.g.c():int");
        }

        @Override // g.b.c.j.f
        public void d() {
            j.this.z();
        }
    }

    public class h extends ContentFrameLayout {
        public h(Context context) {
            super(context, null);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return j.this.G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    j jVar = j.this;
                    jVar.E(jVar.N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(g.b.d.a.a.a(getContext(), i2));
        }
    }

    public static final class i {
        public int a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f1881c;

        /* renamed from: d  reason: collision with root package name */
        public int f1882d;
        public ViewGroup e;

        /* renamed from: f  reason: collision with root package name */
        public View f1883f;

        /* renamed from: g  reason: collision with root package name */
        public View f1884g;

        /* renamed from: h  reason: collision with root package name */
        public g.b.f.i.g f1885h;

        /* renamed from: i  reason: collision with root package name */
        public g.b.f.i.e f1886i;

        /* renamed from: j  reason: collision with root package name */
        public Context f1887j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1888k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1889l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1890m;
        public boolean n;
        public boolean o = false;
        public boolean p;
        public Bundle q;

        public i(int i2) {
            this.a = i2;
        }

        public void a(g.b.f.i.g gVar) {
            g.b.f.i.e eVar;
            g.b.f.i.g gVar2 = this.f1885h;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.u(this.f1886i);
                }
                this.f1885h = gVar;
                if (gVar != null && (eVar = this.f1886i) != null) {
                    gVar.b(eVar, gVar.b);
                }
            }
        }
    }

    /* renamed from: g.b.c.j$j  reason: collision with other inner class name */
    public final class C0063j implements m.a {
        public C0063j() {
        }

        @Override // g.b.f.i.m.a
        public void a(g.b.f.i.g gVar, boolean z) {
            g.b.f.i.g k2 = gVar.k();
            boolean z2 = k2 != gVar;
            j jVar = j.this;
            if (z2) {
                gVar = k2;
            }
            i L = jVar.L(gVar);
            if (L == null) {
                return;
            }
            if (z2) {
                j.this.C(L.a, L, k2);
                j.this.E(L, true);
                return;
            }
            j.this.E(L, z);
        }

        @Override // g.b.f.i.m.a
        public boolean b(g.b.f.i.g gVar) {
            Window.Callback O;
            if (gVar != gVar.k()) {
                return true;
            }
            j jVar = j.this;
            if (!jVar.G || (O = jVar.O()) == null || j.this.S) {
                return true;
            }
            O.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(android.content.Context r4, android.view.Window r5, g.b.c.h r6, java.lang.Object r7) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.<init>(android.content.Context, android.view.Window, g.b.c.h, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0173, code lost:
        if (r1 != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0178, code lost:
        if (r10.R != false) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b5 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A(boolean r11) {
        /*
        // Method dump skipped, instructions count: 445
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.A(boolean):boolean");
    }

    public final void B(Window window) {
        if (this.f1874m == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof d)) {
                d dVar = new d(callback);
                this.n = dVar;
                window.setCallback(dVar);
                z0 p2 = z0.p(this.f1873l, null, f1869h);
                Drawable h2 = p2.h(0);
                if (h2 != null) {
                    window.setBackgroundDrawable(h2);
                }
                p2.b.recycle();
                this.f1874m = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void C(int i2, i iVar, Menu menu) {
        if (menu == null && iVar != null) {
            menu = iVar.f1885h;
        }
        if ((iVar == null || iVar.f1890m) && !this.S) {
            this.n.e.onPanelClosed(i2, menu);
        }
    }

    public void D(g.b.f.i.g gVar) {
        if (!this.L) {
            this.L = true;
            this.s.l();
            Window.Callback O2 = O();
            if (O2 != null && !this.S) {
                O2.onPanelClosed(108, gVar);
            }
            this.L = false;
        }
    }

    public void E(i iVar, boolean z2) {
        ViewGroup viewGroup;
        e0 e0Var;
        if (!z2 || iVar.a != 0 || (e0Var = this.s) == null || !e0Var.c()) {
            WindowManager windowManager = (WindowManager) this.f1873l.getSystemService("window");
            if (!(windowManager == null || !iVar.f1890m || (viewGroup = iVar.e) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    C(iVar.a, iVar, null);
                }
            }
            iVar.f1888k = false;
            iVar.f1889l = false;
            iVar.f1890m = false;
            iVar.f1883f = null;
            iVar.o = true;
            if (this.N == iVar) {
                this.N = null;
                return;
            }
            return;
        }
        D(iVar.f1885h);
    }

    public final Configuration F(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0123, code lost:
        if (r7 != false) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean G(android.view.KeyEvent r7) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.G(android.view.KeyEvent):boolean");
    }

    public void H(int i2) {
        i N2 = N(i2);
        if (N2.f1885h != null) {
            Bundle bundle = new Bundle();
            N2.f1885h.w(bundle);
            if (bundle.size() > 0) {
                N2.q = bundle;
            }
            N2.f1885h.z();
            N2.f1885h.clear();
        }
        N2.p = true;
        N2.o = true;
        if ((i2 == 108 || i2 == 0) && this.s != null) {
            i N3 = N(0);
            N3.f1888k = false;
            U(N3, null);
        }
    }

    public void I() {
        u uVar = this.z;
        if (uVar != null) {
            uVar.b();
        }
    }

    public final void J() {
        ViewGroup viewGroup;
        if (!this.A) {
            TypedArray obtainStyledAttributes = this.f1873l.obtainStyledAttributes(g.b.b.f1861j);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    t(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    t(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    t(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    t(10);
                }
                this.J = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                K();
                this.f1874m.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f1873l);
                if (this.K) {
                    viewGroup = (ViewGroup) from.inflate(this.I ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.J) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.H = false;
                    this.G = false;
                } else if (this.G) {
                    TypedValue typedValue = new TypedValue();
                    this.f1873l.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new g.b.f.c(this.f1873l, typedValue.resourceId) : this.f1873l).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    e0 e0Var = (e0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.s = e0Var;
                    e0Var.setWindowCallback(O());
                    if (this.H) {
                        this.s.k(109);
                    }
                    if (this.E) {
                        this.s.k(2);
                    }
                    if (this.F) {
                        this.s.k(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    k kVar = new k(this);
                    AtomicInteger atomicInteger = o.a;
                    o.c.c(viewGroup, kVar);
                    if (this.s == null) {
                        this.C = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = f1.a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f1874m.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f1874m.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new l(this));
                    this.B = viewGroup;
                    Object obj = this.f1872k;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.r;
                    if (!TextUtils.isEmpty(title)) {
                        e0 e0Var2 = this.s;
                        if (e0Var2 != null) {
                            e0Var2.setWindowTitle(title);
                        } else {
                            a aVar = this.p;
                            if (aVar != null) {
                                ((s) aVar).f1904g.setWindowTitle(title);
                            } else {
                                TextView textView = this.C;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(16908290);
                    View decorView = this.f1874m.getDecorView();
                    contentFrameLayout2.f95k.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    AtomicInteger atomicInteger2 = o.a;
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f1873l.obtainStyledAttributes(g.b.b.f1861j);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.A = true;
                    i N2 = N(0);
                    if (!this.S && N2.f1885h == null) {
                        Q(108);
                        return;
                    }
                    return;
                }
                StringBuilder f2 = c.c.a.a.a.f("AppCompat does not support the current theme features: { windowActionBar: ");
                f2.append(this.G);
                f2.append(", windowActionBarOverlay: ");
                f2.append(this.H);
                f2.append(", android:windowIsFloating: ");
                f2.append(this.J);
                f2.append(", windowActionModeOverlay: ");
                f2.append(this.I);
                f2.append(", windowNoTitle: ");
                f2.append(this.K);
                f2.append(" }");
                throw new IllegalArgumentException(f2.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void K() {
        if (this.f1874m == null) {
            Object obj = this.f1872k;
            if (obj instanceof Activity) {
                B(((Activity) obj).getWindow());
            }
        }
        if (this.f1874m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public i L(Menu menu) {
        i[] iVarArr = this.M;
        int length = iVarArr != null ? iVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            i iVar = iVarArr[i2];
            if (iVar != null && iVar.f1885h == menu) {
                return iVar;
            }
        }
        return null;
    }

    public final f M(Context context) {
        if (this.X == null) {
            if (r.a == null) {
                Context applicationContext = context.getApplicationContext();
                r.a = new r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.X = new g(r.a);
        }
        return this.X;
    }

    public i N(int i2) {
        i[] iVarArr = this.M;
        if (iVarArr == null || iVarArr.length <= i2) {
            i[] iVarArr2 = new i[(i2 + 1)];
            if (iVarArr != null) {
                System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            }
            this.M = iVarArr2;
            iVarArr = iVarArr2;
        }
        i iVar = iVarArr[i2];
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(i2);
        iVarArr[i2] = iVar2;
        return iVar2;
    }

    public final Window.Callback O() {
        return this.f1874m.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P() {
        /*
            r3 = this;
            r3.J()
            boolean r0 = r3.G
            if (r0 == 0) goto L_0x0037
            g.b.c.a r0 = r3.p
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f1872k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            g.b.c.s r0 = new g.b.c.s
            java.lang.Object r1 = r3.f1872k
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.H
            r0.<init>(r1, r2)
        L_0x001d:
            r3.p = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            g.b.c.s r0 = new g.b.c.s
            java.lang.Object r1 = r3.f1872k
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            g.b.c.a r0 = r3.p
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.c0
            r0.d(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.P():void");
    }

    public final void Q(int i2) {
        this.a0 = (1 << i2) | this.a0;
        if (!this.Z) {
            View decorView = this.f1874m.getDecorView();
            Runnable runnable = this.b0;
            AtomicInteger atomicInteger = o.a;
            decorView.postOnAnimation(runnable);
            this.Z = true;
        }
    }

    public int R(Context context, int i2) {
        f M2;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        if (this.Y == null) {
                            this.Y = new e(context);
                        }
                        M2 = this.Y;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                M2 = M(context);
            }
            return M2.c();
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0154, code lost:
        if (r15 != null) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(g.b.c.j.i r14, android.view.KeyEvent r15) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.S(g.b.c.j$i, android.view.KeyEvent):void");
    }

    public final boolean T(i iVar, int i2, KeyEvent keyEvent, int i3) {
        g.b.f.i.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iVar.f1888k || U(iVar, keyEvent)) && (gVar = iVar.f1885h) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.s == null) {
            E(iVar, true);
        }
        return z2;
    }

    public final boolean U(i iVar, KeyEvent keyEvent) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        Resources.Theme theme;
        e0 e0Var4;
        if (this.S) {
            return false;
        }
        if (iVar.f1888k) {
            return true;
        }
        i iVar2 = this.N;
        if (!(iVar2 == null || iVar2 == iVar)) {
            E(iVar2, false);
        }
        Window.Callback O2 = O();
        if (O2 != null) {
            iVar.f1884g = O2.onCreatePanelView(iVar.a);
        }
        int i2 = iVar.a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (e0Var4 = this.s) != null) {
            e0Var4.g();
        }
        if (iVar.f1884g == null) {
            g.b.f.i.g gVar = iVar.f1885h;
            if (gVar == null || iVar.p) {
                if (gVar == null) {
                    Context context = this.f1873l;
                    int i3 = iVar.a;
                    if ((i3 == 0 || i3 == 108) && this.s != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            g.b.f.c cVar = new g.b.f.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    g.b.f.i.g gVar2 = new g.b.f.i.g(context);
                    gVar2.f1989f = this;
                    iVar.a(gVar2);
                    if (iVar.f1885h == null) {
                        return false;
                    }
                }
                if (z2 && (e0Var3 = this.s) != null) {
                    if (this.t == null) {
                        this.t = new b();
                    }
                    e0Var3.a(iVar.f1885h, this.t);
                }
                iVar.f1885h.z();
                if (!O2.onCreatePanelMenu(iVar.a, iVar.f1885h)) {
                    iVar.a(null);
                    if (z2 && (e0Var2 = this.s) != null) {
                        e0Var2.a(null, this.t);
                    }
                    return false;
                }
                iVar.p = false;
            }
            iVar.f1885h.z();
            Bundle bundle = iVar.q;
            if (bundle != null) {
                iVar.f1885h.v(bundle);
                iVar.q = null;
            }
            if (!O2.onPreparePanel(0, iVar.f1884g, iVar.f1885h)) {
                if (z2 && (e0Var = this.s) != null) {
                    e0Var.a(null, this.t);
                }
                iVar.f1885h.y();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            iVar.n = z3;
            iVar.f1885h.setQwertyMode(z3);
            iVar.f1885h.y();
        }
        iVar.f1888k = true;
        iVar.f1889l = false;
        this.N = iVar;
        return true;
    }

    public final boolean V() {
        ViewGroup viewGroup;
        if (this.A && (viewGroup = this.B) != null) {
            AtomicInteger atomicInteger = o.a;
            if (viewGroup.isLaidOut()) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int X(y yVar, Rect rect) {
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        Context context;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int d2 = yVar.d();
        ActionBarContextView actionBarContextView = this.w;
        int i5 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            boolean z4 = true;
            if (this.w.isShown()) {
                if (this.d0 == null) {
                    this.d0 = new Rect();
                    this.e0 = new Rect();
                }
                Rect rect2 = this.d0;
                Rect rect3 = this.e0;
                rect2.set(yVar.b(), yVar.d(), yVar.c(), yVar.a());
                f1.a(this.B, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                ViewGroup viewGroup = this.B;
                AtomicInteger atomicInteger = o.a;
                y a2 = o.d.a(viewGroup);
                if (a2 == null) {
                    i2 = 0;
                } else {
                    i2 = a2.b();
                }
                int c2 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams2.topMargin == i6 && marginLayoutParams2.leftMargin == i7 && marginLayoutParams2.rightMargin == i8) {
                    z3 = false;
                } else {
                    marginLayoutParams2.topMargin = i6;
                    marginLayoutParams2.leftMargin = i7;
                    marginLayoutParams2.rightMargin = i8;
                    z3 = true;
                }
                if (i6 <= 0 || this.D != null) {
                    View view = this.D;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i4 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == c2))) {
                        marginLayoutParams.height = i4;
                        marginLayoutParams.leftMargin = i2;
                        marginLayoutParams.rightMargin = c2;
                        this.D.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f1873l);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = c2;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                z2 = view3 != null;
                if (z2 && view3.getVisibility() != 0) {
                    View view4 = this.D;
                    if ((view4.getWindowSystemUiVisibility() & 8192) == 0) {
                        z4 = false;
                    }
                    if (z4) {
                        context = this.f1873l;
                        i3 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f1873l;
                        i3 = R.color.abc_decor_view_status_guard;
                    }
                    Object obj = g.h.c.a.a;
                    view4.setBackgroundColor(context.getColor(i3));
                }
                if (!this.I && z2) {
                    d2 = 0;
                }
                z4 = z3;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z2 = false;
            } else {
                z4 = false;
                z2 = false;
            }
            if (z4) {
                this.w.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.D;
        if (view5 != null) {
            if (z2) {
                i5 = 0;
            }
            view5.setVisibility(i5);
        }
        return d2;
    }

    @Override // g.b.f.i.g.a
    public boolean a(g.b.f.i.g gVar, MenuItem menuItem) {
        i L2;
        Window.Callback O2 = O();
        if (O2 == null || this.S || (L2 = L(gVar.k())) == null) {
            return false;
        }
        return O2.onMenuItemSelected(L2.a, menuItem);
    }

    @Override // g.b.f.i.g.a
    public void b(g.b.f.i.g gVar) {
        e0 e0Var = this.s;
        if (e0Var == null || !e0Var.h() || (ViewConfiguration.get(this.f1873l).hasPermanentMenuKey() && !this.s.b())) {
            i N2 = N(0);
            N2.o = true;
            E(N2, false);
            S(N2, null);
            return;
        }
        Window.Callback O2 = O();
        if (this.s.c()) {
            this.s.e();
            if (!this.S) {
                O2.onPanelClosed(108, N(0).f1885h);
            }
        } else if (O2 != null && !this.S) {
            if (this.Z && (1 & this.a0) != 0) {
                this.f1874m.getDecorView().removeCallbacks(this.b0);
                this.b0.run();
            }
            i N3 = N(0);
            g.b.f.i.g gVar2 = N3.f1885h;
            if (gVar2 != null && !N3.p && O2.onPreparePanel(0, N3.f1884g, gVar2)) {
                O2.onMenuOpened(108, N3.f1885h);
                this.s.f();
            }
        }
    }

    @Override // g.b.c.i
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ((ViewGroup) this.B.findViewById(16908290)).addView(view, layoutParams);
        this.n.e.onContentChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0189  */
    @Override // g.b.c.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context d(android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 468
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.d(android.content.Context):android.content.Context");
    }

    @Override // g.b.c.i
    public <T extends View> T e(int i2) {
        J();
        return (T) this.f1874m.findViewById(i2);
    }

    @Override // g.b.c.i
    public int f() {
        return this.T;
    }

    @Override // g.b.c.i
    public MenuInflater g() {
        if (this.q == null) {
            P();
            a aVar = this.p;
            this.q = new g.b.f.f(aVar != null ? aVar.b() : this.f1873l);
        }
        return this.q;
    }

    @Override // g.b.c.i
    public a h() {
        P();
        return this.p;
    }

    @Override // g.b.c.i
    public void i() {
        LayoutInflater from = LayoutInflater.from(this.f1873l);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof j)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.b.c.i
    public void j() {
        P();
        a aVar = this.p;
        Q(0);
    }

    @Override // g.b.c.i
    public void k(Configuration configuration) {
        if (this.G && this.A) {
            P();
            a aVar = this.p;
            if (aVar != null) {
                s sVar = (s) aVar;
                sVar.g(sVar.f1901c.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        g.b.g.j a2 = g.b.g.j.a();
        Context context = this.f1873l;
        synchronized (a2) {
            p0 p0Var = a2.f2105c;
            synchronized (p0Var) {
                g.e.e<WeakReference<Drawable.ConstantState>> eVar = p0Var.f2143g.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        A(false);
    }

    @Override // g.b.c.i
    public void l(Bundle bundle) {
        this.P = true;
        A(false);
        K();
        Object obj = this.f1872k;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = g.h.b.d.m(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a aVar = this.p;
                if (aVar == null) {
                    this.c0 = true;
                } else {
                    aVar.d(true);
                }
            }
            synchronized (i.f1867f) {
                i.s(this);
                i.e.add(new WeakReference<>(this));
            }
        }
        this.Q = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // g.b.c.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m() {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.m():void");
    }

    @Override // g.b.c.i
    public void n(Bundle bundle) {
        J();
    }

    @Override // g.b.c.i
    public void o() {
        P();
        a aVar = this.p;
        if (aVar != null) {
            ((s) aVar).x = true;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:82:0x0197 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, g.b.c.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0109, code lost:
        if (r8.equals("ImageButton") == false) goto L_0x0091;
     */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
        // Method dump skipped, instructions count: 632
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.c.j.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // g.b.c.i
    public void p(Bundle bundle) {
    }

    @Override // g.b.c.i
    public void q() {
        this.R = true;
        z();
    }

    @Override // g.b.c.i
    public void r() {
        this.R = false;
        P();
        a aVar = this.p;
        if (aVar != null) {
            s sVar = (s) aVar;
            sVar.x = false;
            g.b.f.g gVar = sVar.w;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    @Override // g.b.c.i
    public boolean t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.K && i2 == 108) {
            return false;
        }
        if (this.G && i2 == 1) {
            this.G = false;
        }
        if (i2 == 1) {
            W();
            this.K = true;
            return true;
        } else if (i2 == 2) {
            W();
            this.E = true;
            return true;
        } else if (i2 == 5) {
            W();
            this.F = true;
            return true;
        } else if (i2 == 10) {
            W();
            this.I = true;
            return true;
        } else if (i2 == 108) {
            W();
            this.G = true;
            return true;
        } else if (i2 != 109) {
            return this.f1874m.requestFeature(i2);
        } else {
            W();
            this.H = true;
            return true;
        }
    }

    @Override // g.b.c.i
    public void u(int i2) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1873l).inflate(i2, viewGroup);
        this.n.e.onContentChanged();
    }

    @Override // g.b.c.i
    public void v(View view) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.n.e.onContentChanged();
    }

    @Override // g.b.c.i
    public void w(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.n.e.onContentChanged();
    }

    @Override // g.b.c.i
    public void x(int i2) {
        this.U = i2;
    }

    @Override // g.b.c.i
    public final void y(CharSequence charSequence) {
        this.r = charSequence;
        e0 e0Var = this.s;
        if (e0Var != null) {
            e0Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.p;
        if (aVar != null) {
            ((s) aVar).f1904g.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean z() {
        return A(true);
    }
}
