package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tsuga.news.R;
import g.a.e.d;
import g.h.b.e;
import g.n.e;
import g.n.g;
import g.n.i;
import g.n.j;
import g.n.r;
import g.n.v;
import g.n.w;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends e implements i, w, g.s.c, g.a.c, g.a.e.e {

    /* renamed from: f  reason: collision with root package name */
    public final g.a.d.a f28f = new g.a.d.a();

    /* renamed from: g  reason: collision with root package name */
    public final j f29g;

    /* renamed from: h  reason: collision with root package name */
    public final g.s.b f30h;

    /* renamed from: i  reason: collision with root package name */
    public v f31i;

    /* renamed from: j  reason: collision with root package name */
    public final OnBackPressedDispatcher f32j;

    /* renamed from: k  reason: collision with root package name */
    public final d f33k;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    public class b extends d {
        public b(ComponentActivity componentActivity) {
        }
    }

    public static final class c {
        public v a;
    }

    public ComponentActivity() {
        j jVar = new j(this);
        this.f29g = jVar;
        this.f30h = new g.s.b(this);
        this.f32j = new OnBackPressedDispatcher(new a());
        new AtomicInteger();
        this.f33k = new b(this);
        if (jVar != null) {
            jVar.a(new g() {
                /* class androidx.activity.ComponentActivity.AnonymousClass3 */

                @Override // g.n.g
                public void d(i iVar, e.a aVar) {
                    if (aVar == e.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            jVar.a(new g() {
                /* class androidx.activity.ComponentActivity.AnonymousClass4 */

                @Override // g.n.g
                public void d(i iVar, e.a aVar) {
                    if (aVar == e.a.ON_DESTROY) {
                        ComponentActivity.this.f28f.b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.g().a();
                        }
                    }
                }
            });
            jVar.a(new g() {
                /* class androidx.activity.ComponentActivity.AnonymousClass5 */

                @Override // g.n.g
                public void d(i iVar, e.a aVar) {
                    ComponentActivity.this.k();
                    j jVar = ComponentActivity.this.f29g;
                    jVar.d("removeObserver");
                    jVar.a.e(this);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // g.n.i
    public g.n.e a() {
        return this.f29g;
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        l();
        super.addContentView(view, layoutParams);
    }

    @Override // g.a.c
    public final OnBackPressedDispatcher b() {
        return this.f32j;
    }

    @Override // g.s.c
    public final g.s.a c() {
        return this.f30h.b;
    }

    @Override // g.a.e.e
    public final d d() {
        return this.f33k;
    }

    @Override // g.n.w
    public v g() {
        if (getApplication() != null) {
            k();
            return this.f31i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void k() {
        if (this.f31i == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f31i = cVar.a;
            }
            if (this.f31i == null) {
                this.f31i = new v();
            }
        }
    }

    public final void l() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.f33k.a(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        this.f32j.b();
    }

    @Override // g.h.b.e
    public void onCreate(Bundle bundle) {
        this.f30h.a(bundle);
        g.a.d.a aVar = this.f28f;
        aVar.b = this;
        for (g.a.d.b bVar : aVar.a) {
            bVar.a(this);
        }
        super.onCreate(bundle);
        d dVar = this.f33k;
        Objects.requireNonNull(dVar);
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (!(stringArrayList == null || integerArrayList == null)) {
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int intValue = integerArrayList.get(i2).intValue();
                    String str = stringArrayList.get(i2);
                    dVar.b.put(Integer.valueOf(intValue), str);
                    dVar.f1845c.put(str, Integer.valueOf(intValue));
                }
                dVar.e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                dVar.a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                dVar.f1849h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
        r.c(this);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (!this.f33k.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        v vVar = this.f31i;
        if (vVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            vVar = cVar.a;
        }
        if (vVar == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.a = vVar;
        return cVar2;
    }

    @Override // g.h.b.e
    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.f29g;
        if (jVar instanceof j) {
            e.b bVar = e.b.CREATED;
            jVar.d("setCurrentState");
            jVar.g(bVar);
        }
        super.onSaveInstanceState(bundle);
        this.f30h.b(bundle);
        d dVar = this.f33k;
        Objects.requireNonNull(dVar);
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(dVar.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(dVar.b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(dVar.e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) dVar.f1849h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", dVar.a);
    }

    public void reportFullyDrawn() {
        try {
            if (g.q.a.m()) {
                Trace.beginSection("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        l();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        l();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        l();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
