package c.a.a.b.e;

import android.view.View;
import c.a.a.b.e.b;
import i.m;
import i.s.b.l;
import i.s.c.h;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ b e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b.a f379f;

    public /* synthetic */ a(b bVar, b.a aVar) {
        this.e = bVar;
        this.f379f = aVar;
    }

    public final void onClick(View view) {
        b bVar = this.e;
        b.a aVar = this.f379f;
        h.e(bVar, "this$0");
        h.e(aVar, "this$1");
        l<? super c.a.a.b.d.a.a, m> lVar = bVar.e;
        if (lVar != null) {
            c.a.a.b.d.a.a aVar2 = bVar.f380d.get(aVar.e());
            h.d(aVar2, "listData[absoluteAdapterPosition]");
            lVar.o(aVar2);
        }
    }
}
