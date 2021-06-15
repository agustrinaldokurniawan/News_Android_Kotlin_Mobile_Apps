package com.tsuga.news;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import com.tsuga.news.home.HomeFragment;
import g.b.c.g;
import i.m;
import i.s.b.l;
import i.s.c.h;
import i.s.c.i;

public final class MainActivity extends g {
    public static final /* synthetic */ int r = 0;
    public View s;
    public c.a.a.c.a t;

    public static final class a extends i implements l<Integer, m> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ MainActivity f1744f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(MainActivity mainActivity) {
            super(1);
            this.f1744f = mainActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
        @Override // i.s.b.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i.m o(java.lang.Integer r4) {
            /*
                r3 = this;
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                com.tsuga.news.MainActivity r0 = r3.f1744f
                int r1 = com.tsuga.news.MainActivity.r
                java.util.Objects.requireNonNull(r0)
                r1 = 2131230807(0x7f080057, float:1.8077677E38)
                if (r4 == r1) goto L_0x0029
                r1 = 2131230924(0x7f0800cc, float:1.8077915E38)
                if (r4 == r1) goto L_0x0023
                r1 = 2131231069(0x7f08015d, float:1.8078209E38)
                if (r4 == r1) goto L_0x001d
                goto L_0x0039
            L_0x001d:
                c.a.a.g.c r4 = new c.a.a.g.c
                r4.<init>()
                goto L_0x003a
            L_0x0023:
                com.tsuga.news.home.HomeFragment r4 = new com.tsuga.news.home.HomeFragment
                r4.<init>()
                goto L_0x003a
            L_0x0029:
                java.lang.String r4 = "favorite_app://favorite"
                android.net.Uri r4 = android.net.Uri.parse(r4)
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "android.intent.action.VIEW"
                r1.<init>(r2, r4)
                r0.startActivity(r1)
            L_0x0039:
                r4 = 0
            L_0x003a:
                if (r4 == 0) goto L_0x004e
                g.l.b.b0 r0 = r0.m()
                g.l.b.a r1 = new g.l.b.a
                r1.<init>(r0)
                r0 = 2131230923(0x7f0800cb, float:1.8077912E38)
                r1.e(r0, r4)
                r1.c()
            L_0x004e:
                i.m r4 = i.m.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tsuga.news.MainActivity.a.o(java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.activity.ComponentActivity, g.l.b.p, g.h.b.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i2 = R.id.cnb;
        ChipNavigationBar chipNavigationBar = (ChipNavigationBar) inflate.findViewById(R.id.cnb);
        if (chipNavigationBar != null) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) inflate.findViewById(R.id.home_fragment_container);
            if (fragmentContainerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                c.a.a.c.a aVar = new c.a.a.c.a(constraintLayout, chipNavigationBar, fragmentContainerView);
                h.d(aVar, "inflate(layoutInflater)");
                this.t = aVar;
                if (aVar != null) {
                    setContentView(constraintLayout);
                    View decorView = getWindow().getDecorView();
                    h.d(decorView, "window.decorView");
                    this.s = decorView;
                    getWindow().setFlags(512, 512);
                    c.a.a.c.a aVar2 = this.t;
                    if (aVar2 != null) {
                        ChipNavigationBar chipNavigationBar2 = aVar2.b;
                        h.d(chipNavigationBar2, "binding.cnb");
                        int i3 = ChipNavigationBar.x;
                        chipNavigationBar2.m(R.id.home_menu, true, true);
                        c.a.a.c.a aVar3 = this.t;
                        if (aVar3 != null) {
                            aVar3.b.setOnItemSelectedListener(new a(this));
                            g.b.c.a r2 = r();
                            if (r2 != null) {
                                r2.c();
                            }
                            g.l.b.a aVar4 = new g.l.b.a(m());
                            aVar4.e(R.id.home_fragment_container, new HomeFragment());
                            aVar4.c();
                            return;
                        }
                        h.k("binding");
                        throw null;
                    }
                    h.k("binding");
                    throw null;
                }
                h.k("binding");
                throw null;
            }
            i2 = R.id.home_fragment_container;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // g.l.b.p
    public void onResume() {
        super.onResume();
        c.a.a.c.a aVar = this.t;
        if (aVar != null) {
            ChipNavigationBar chipNavigationBar = aVar.b;
            h.d(chipNavigationBar, "binding.cnb");
            int i2 = ChipNavigationBar.x;
            chipNavigationBar.m(R.id.home_menu, true, true);
            g.l.b.a aVar2 = new g.l.b.a(m());
            aVar2.e(R.id.home_fragment_container, new HomeFragment());
            aVar2.c();
            return;
        }
        h.k("binding");
        throw null;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            View view = this.s;
            if (view != null) {
                view.setSystemUiVisibility(13058);
            } else {
                h.k("decorView");
                throw null;
            }
        }
    }

    @Override // g.b.c.g
    public boolean v() {
        h.k("navController");
        throw null;
    }
}
