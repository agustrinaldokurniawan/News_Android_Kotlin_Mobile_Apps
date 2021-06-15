package g.b.g;

import android.view.View;
import android.widget.AdapterView;

public class l0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ m0 e;

    public l0(m0 m0Var) {
        this.e = m0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        h0 h0Var;
        if (i2 != -1 && (h0Var = this.e.f2132i) != null) {
            h0Var.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
