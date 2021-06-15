package c.f.a.g;

import com.ismaeldivita.chipnavigation.view.BadgeImageView;
import com.tsuga.news.R;
import i.s.b.a;
import i.s.c.i;

public final class c extends i implements a<BadgeImageView> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f1565f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(0);
        this.f1565f = eVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public BadgeImageView c() {
        return (BadgeImageView) this.f1565f.findViewById(R.id.cnb_item_icon);
    }
}
