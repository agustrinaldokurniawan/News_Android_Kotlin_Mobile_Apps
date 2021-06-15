package g.q.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g.q.c.b;

public class v implements b.AbstractC0093b {
    public final /* synthetic */ RecyclerView a;

    public v(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public View a(int i2) {
        return this.a.getChildAt(i2);
    }

    public int b() {
        return this.a.getChildCount();
    }

    public void c(int i2) {
        View childAt = this.a.getChildAt(i2);
        if (childAt != null) {
            this.a.p(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i2);
    }
}
