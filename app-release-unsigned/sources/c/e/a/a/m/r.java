package c.e.a.a.m;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class r<S> extends x<S> {
    public int Y;
    public d<S> Z;
    public a a0;

    public class a extends w<S> {
        public a() {
        }

        @Override // c.e.a.a.m.w
        public void a(S s) {
            Iterator<w<S>> it = r.this.X.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    @Override // g.l.b.m
    public void O(Bundle bundle) {
        super.O(bundle);
        if (bundle == null) {
            bundle = this.f2718k;
        }
        this.Y = bundle.getInt("THEME_RES_ID_KEY");
        this.Z = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.a0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // g.l.b.m
    public View R(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.Z.h(layoutInflater.cloneInContext(new ContextThemeWrapper(k(), this.Y)), viewGroup, bundle, this.a0, new a());
    }

    @Override // g.l.b.m
    public void d0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Y);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.Z);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
    }
}
