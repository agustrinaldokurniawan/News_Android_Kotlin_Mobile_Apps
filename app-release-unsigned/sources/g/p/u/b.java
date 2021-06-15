package g.p.u;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.DialogFragmentNavigator;
import com.tsuga.news.R;
import g.h.b.d;
import g.l.b.a;
import g.l.b.b0;
import g.l.b.m;
import g.n.v;
import g.p.e;
import g.p.f;
import g.p.g;
import g.p.j;
import g.p.q;
import g.p.r;
import g.p.s;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class b extends m {
    public static final /* synthetic */ int X = 0;
    public g.p.m Y;
    public Boolean Z = null;
    public View a0;
    public int b0;
    public boolean c0;

    @Override // g.l.b.m
    public void L(Context context) {
        super.L(context);
        if (this.c0) {
            a aVar = new a(u());
            aVar.m(this);
            aVar.c();
        }
    }

    @Override // g.l.b.m
    public void M(m mVar) {
        r rVar = this.Y.f209k;
        Objects.requireNonNull(rVar);
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) rVar.c(r.b(DialogFragmentNavigator.class));
        if (dialogFragmentNavigator.f214d.remove(mVar.C)) {
            mVar.S.a(dialogFragmentNavigator.e);
        }
    }

    @Override // g.l.b.m
    public void O(Bundle bundle) {
        Bundle bundle2;
        g.p.m mVar = new g.p.m(o0());
        this.Y = mVar;
        if (this != mVar.f207i) {
            mVar.f207i = this;
            this.S.a(mVar.f211m);
        }
        g.p.m mVar2 = this.Y;
        OnBackPressedDispatcher onBackPressedDispatcher = n0().f32j;
        if (mVar2.f207i != null) {
            mVar2.n.b();
            onBackPressedDispatcher.a(mVar2.f207i, mVar2.n);
            mVar2.f207i.a().b(mVar2.f211m);
            mVar2.f207i.a().a(mVar2.f211m);
            g.p.m mVar3 = this.Y;
            Boolean bool = this.Z;
            int i2 = 0;
            mVar3.o = bool != null && bool.booleanValue();
            mVar3.i();
            Bundle bundle3 = null;
            this.Z = null;
            g.p.m mVar4 = this.Y;
            v g2 = g();
            if (mVar4.f208j != g.b(g2)) {
                if (mVar4.f206h.isEmpty()) {
                    mVar4.f208j = g.b(g2);
                } else {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
            }
            g.p.m mVar5 = this.Y;
            mVar5.f209k.a(new DialogFragmentNavigator(o0(), j()));
            r rVar = mVar5.f209k;
            Context o0 = o0();
            b0 j2 = j();
            int i3 = this.A;
            if (i3 == 0 || i3 == -1) {
                i3 = R.id.nav_host_fragment_container;
            }
            rVar.a(new a(o0, j2, i3));
            if (bundle != null) {
                bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
                if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                    this.c0 = true;
                    a aVar = new a(u());
                    aVar.m(this);
                    aVar.c();
                }
                this.b0 = bundle.getInt("android-support-nav:fragment:graphId");
            } else {
                bundle2 = null;
            }
            if (bundle2 != null) {
                g.p.m mVar6 = this.Y;
                Objects.requireNonNull(mVar6);
                bundle2.setClassLoader(mVar6.a.getClassLoader());
                mVar6.e = bundle2.getBundle("android-support-nav:controller:navigatorState");
                mVar6.f204f = bundle2.getParcelableArray("android-support-nav:controller:backStack");
                mVar6.f205g = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
            }
            int i4 = this.b0;
            if (i4 != 0) {
                this.Y.h(i4, null);
            } else {
                Bundle bundle4 = this.f2718k;
                if (bundle4 != null) {
                    i2 = bundle4.getInt("android-support-nav:fragment:graphId");
                }
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("android-support-nav:fragment:startDestinationArgs");
                }
                if (i2 != 0) {
                    this.Y.h(i2, bundle3);
                }
            }
            super.O(bundle);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    @Override // g.l.b.m
    public View R(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int i2 = this.A;
        if (i2 == 0 || i2 == -1) {
            i2 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i2);
        return fragmentContainerView;
    }

    @Override // g.l.b.m
    public void T() {
        this.H = true;
        View view = this.a0;
        if (view != null && d.j(view) == this.Y) {
            this.a0.setTag(R.id.nav_controller_view_tag, null);
        }
        this.a0 = null;
    }

    @Override // g.l.b.m
    public void Y(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.Y(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.b);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.b0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c.f2884c);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.c0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // g.l.b.m
    public void b0(boolean z) {
        g.p.m mVar = this.Y;
        if (mVar != null) {
            mVar.o = z;
            mVar.i();
            return;
        }
        this.Z = Boolean.valueOf(z);
    }

    @Override // g.l.b.m
    public void d0(Bundle bundle) {
        Bundle bundle2;
        g.p.m mVar = this.Y;
        Objects.requireNonNull(mVar);
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle3 = new Bundle();
        for (Map.Entry<String, q<? extends j>> entry : mVar.f209k.b.entrySet()) {
            String key = entry.getKey();
            Bundle d2 = entry.getValue().d();
            if (d2 != null) {
                arrayList.add(key);
                bundle3.putBundle(key, d2);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        if (!mVar.f206h.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[mVar.f206h.size()];
            int i2 = 0;
            for (e eVar : mVar.f206h) {
                parcelableArr[i2] = new f(eVar);
                i2++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (mVar.f205g) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", mVar.f205g);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.c0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i3 = this.b0;
        if (i3 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i3);
        }
    }

    @Override // g.l.b.m
    public void g0(View view, Bundle bundle) {
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, this.Y);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.a0 = view2;
                if (view2.getId() == this.A) {
                    this.a0.setTag(R.id.nav_controller_view_tag, this.Y);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }
}
