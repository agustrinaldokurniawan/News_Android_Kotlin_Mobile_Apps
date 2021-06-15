package c.e.a.a.z;

import android.widget.AutoCompleteTextView;

public class k implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ h a;

    public k(h hVar) {
        this.a = hVar;
    }

    public void onDismiss() {
        h hVar = this.a;
        hVar.f1417i = true;
        hVar.f1419k = System.currentTimeMillis();
        h.f(this.a, false);
    }
}
