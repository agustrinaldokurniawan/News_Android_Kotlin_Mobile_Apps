package c.f.a.g;

import android.view.View;
import com.tsuga.news.R;
import i.s.b.a;
import i.s.c.i;

public final class g extends i implements a<View> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f1572f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(0);
        this.f1572f = hVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public View c() {
        return this.f1572f.findViewById(R.id.cbn_item_internal_container);
    }
}
