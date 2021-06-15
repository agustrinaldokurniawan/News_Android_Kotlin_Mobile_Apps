package c.f.a.g;

import com.ismaeldivita.chipnavigation.view.BadgeImageView;
import com.tsuga.news.R;
import i.s.b.a;

public final class i extends i.s.c.i implements a<BadgeImageView> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f1583f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(h hVar) {
        super(0);
        this.f1583f = hVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public BadgeImageView c() {
        return (BadgeImageView) this.f1583f.findViewById(R.id.cnb_item_icon);
    }
}
