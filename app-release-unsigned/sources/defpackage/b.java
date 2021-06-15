package defpackage;

import android.widget.TextView;
import c.f.a.g.h;
import com.tsuga.news.R;
import i.s.b.a;
import i.s.c.i;

/* renamed from: b  reason: default package */
public final class b extends i implements a<TextView> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f322f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f323g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i2, Object obj) {
        super(0);
        this.f322f = i2;
        this.f323g = obj;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public final TextView c() {
        int i2 = this.f322f;
        if (i2 == 0) {
            return (TextView) ((h) this.f323g).findViewById(R.id.cbn_item_notification_count);
        }
        if (i2 == 1) {
            return (TextView) ((h) this.f323g).findViewById(R.id.cbn_item_title);
        }
        throw null;
    }
}
