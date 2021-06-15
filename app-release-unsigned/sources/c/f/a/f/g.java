package c.f.a.f;

import android.view.View;
import android.view.ViewGroup;
import i.s.c.h;
import i.w.e;
import java.util.Iterator;

public final class g implements e<View> {
    public final /* synthetic */ ViewGroup a;

    public g(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // i.w.e
    public Iterator<View> iterator() {
        ViewGroup viewGroup = this.a;
        h.f(viewGroup, "$this$iterator");
        return new h(viewGroup);
    }
}
