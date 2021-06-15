package c.a.a.e;

import android.content.Intent;
import android.view.View;
import c.a.a.b.b.n;
import c.a.a.b.d.a.a;
import com.tsuga.news.ReadNewsActivity;
import com.tsuga.news.home.HomeFragment;
import i.s.c.h;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ HomeFragment e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n f398f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f399g;

    public /* synthetic */ b(HomeFragment homeFragment, n nVar, int i2) {
        this.e = homeFragment;
        this.f398f = nVar;
        this.f399g = i2;
    }

    public final void onClick(View view) {
        HomeFragment homeFragment = this.e;
        n nVar = this.f398f;
        int i2 = this.f399g;
        int i3 = HomeFragment.X;
        h.e(homeFragment, "this$0");
        T t = nVar.a;
        h.c(t);
        Intent intent = new Intent(homeFragment.h(), ReadNewsActivity.class);
        intent.putExtra("data", (a) t.get(i2));
        homeFragment.z0(intent);
    }
}
