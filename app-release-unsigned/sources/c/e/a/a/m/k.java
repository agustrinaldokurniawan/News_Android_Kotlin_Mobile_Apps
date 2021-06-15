package c.e.a.a.m;

import android.view.View;

public class k implements View.OnClickListener {
    public final /* synthetic */ g e;

    public k(g gVar) {
        this.e = gVar;
    }

    public void onClick(View view) {
        g gVar = this.e;
        int i2 = gVar.d0;
        if (i2 == 2) {
            gVar.F0(1);
        } else if (i2 == 1) {
            gVar.F0(2);
        }
    }
}
