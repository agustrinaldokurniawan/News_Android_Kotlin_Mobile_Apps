package com.tsuga.news;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import c.a.a.c.b;
import c.a.a.f.e;
import g.b.c.a;
import g.b.c.g;
import i.s.c.h;

public final class ReadNewsActivity extends g {
    public b r;

    @Override // androidx.activity.ComponentActivity, g.l.b.p, g.h.b.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_read_news, (ViewGroup) null, false);
        FragmentContainerView fragmentContainerView = (FragmentContainerView) inflate.findViewById(R.id.fragment_read_container_view);
        if (fragmentContainerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            b bVar = new b(constraintLayout, fragmentContainerView);
            h.d(bVar, "inflate(layoutInflater)");
            this.r = bVar;
            if (bVar != null) {
                setContentView(constraintLayout);
                a r2 = r();
                if (r2 != null) {
                    r2.c();
                }
                getWindow().setFlags(67108864, 67108864);
                getWindow().getDecorView().setSystemUiVisibility(8192);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("data", (c.a.a.b.d.a.a) getIntent().getParcelableExtra("data"));
                e eVar = new e();
                eVar.u0(bundle2);
                g.l.b.a aVar = new g.l.b.a(m());
                aVar.e(R.id.fragment_read_container_view, eVar);
                aVar.c();
                return;
            }
            h.k("binding");
            throw null;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.fragment_read_container_view)));
    }
}
