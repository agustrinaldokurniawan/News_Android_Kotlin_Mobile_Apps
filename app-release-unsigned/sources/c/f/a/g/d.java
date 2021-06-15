package c.f.a.g;

import android.widget.TextView;
import com.tsuga.news.R;
import i.s.b.a;
import i.s.c.i;

public final class d extends i implements a<TextView> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f1566f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(0);
        this.f1566f = eVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public TextView c() {
        return (TextView) this.f1566f.findViewById(R.id.cbn_item_title);
    }
}
