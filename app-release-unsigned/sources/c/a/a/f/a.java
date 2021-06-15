package c.a.a.f;

import android.view.View;
import i.s.c.h;
import java.util.Objects;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ c.a.a.b.d.a.a e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f401f;

    public /* synthetic */ a(c.a.a.b.d.a.a aVar, e eVar) {
        this.e = aVar;
        this.f401f = eVar;
    }

    public final void onClick(View view) {
        Boolean bool;
        c.a.a.b.d.a.a aVar = this.e;
        e eVar = this.f401f;
        int i2 = e.X;
        h.e(eVar, "this$0");
        if (aVar == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(aVar.f378m);
        }
        h.c(bool);
        boolean z = !bool.booleanValue();
        f fVar = (f) eVar.Z.getValue();
        Objects.requireNonNull(fVar);
        h.e(aVar, "news");
        fVar.f407c.d(aVar, z);
        eVar.B0(z);
    }
}
