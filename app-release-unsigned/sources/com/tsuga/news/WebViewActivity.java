package com.tsuga.news;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import c.a.a.c.c;
import g.b.c.a;
import g.b.c.g;
import i.s.c.h;

public final class WebViewActivity extends g {
    public c r;

    @Override // androidx.activity.ComponentActivity, g.l.b.p, g.h.b.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_web_view, (ViewGroup) null, false);
        FragmentContainerView fragmentContainerView = (FragmentContainerView) inflate.findViewById(R.id.webview_fragment_container_view);
        if (fragmentContainerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            c cVar = new c(constraintLayout, fragmentContainerView);
            h.d(cVar, "inflate(layoutInflater)");
            this.r = cVar;
            if (cVar != null) {
                setContentView(constraintLayout);
                a r2 = r();
                if (r2 != null) {
                    r2.c();
                }
                getWindow().setFlags(67108864, 67108864);
                getWindow().getDecorView().setSystemUiVisibility(8192);
                String stringExtra = getIntent().getStringExtra("url");
                String stringExtra2 = getIntent().getStringExtra("title");
                Bundle bundle2 = new Bundle();
                bundle2.putString("url", stringExtra);
                bundle2.putString("title", stringExtra2);
                c.a.a.f.g gVar = new c.a.a.f.g();
                gVar.u0(bundle2);
                g.l.b.a aVar = new g.l.b.a(m());
                aVar.e(R.id.webview_fragment_container_view, gVar);
                aVar.c();
                return;
            }
            h.k("binding");
            throw null;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.webview_fragment_container_view)));
    }
}
