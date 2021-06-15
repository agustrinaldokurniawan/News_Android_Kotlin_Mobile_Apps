package g.l.b;

import android.os.Bundle;
import android.os.Parcelable;
import g.n.e;
import g.s.a;

public class n implements a.b {
    public final /* synthetic */ p a;

    public n(p pVar) {
        this.a = pVar;
    }

    @Override // g.s.a.b
    public Bundle a() {
        Bundle bundle = new Bundle();
        do {
        } while (p.n(this.a.m(), e.b.CREATED));
        this.a.f2747m.e(e.a.ON_STOP);
        Parcelable b0 = this.a.f2746l.a.f2800h.b0();
        if (b0 != null) {
            bundle.putParcelable("android:support:fragments", b0);
        }
        return bundle;
    }
}
