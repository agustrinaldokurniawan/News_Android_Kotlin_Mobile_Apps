package c.a.a.f;

import android.content.Intent;
import android.view.View;
import c.a.a.b.d.a.a;
import com.tsuga.news.WebViewActivity;
import i.s.c.h;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ e e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f402f;

    public /* synthetic */ b(e eVar, a aVar) {
        this.e = eVar;
        this.f402f = aVar;
    }

    public final void onClick(View view) {
        String str;
        e eVar = this.e;
        a aVar = this.f402f;
        int i2 = e.X;
        h.e(eVar, "this$0");
        String str2 = null;
        if (aVar == null) {
            str = null;
        } else {
            str = aVar.f376k;
        }
        if (aVar != null) {
            str2 = aVar.f375j;
        }
        Intent intent = new Intent(eVar.h(), WebViewActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("title", str2);
        eVar.z0(intent);
    }
}
