package c.e.a.a.z;

import android.view.View;
import android.widget.AdapterView;
import g.b.g.m0;

public class o implements AdapterView.OnItemClickListener {
    public final /* synthetic */ p e;

    public o(p pVar) {
        this.e = pVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        Object obj;
        p pVar = this.e;
        if (i2 < 0) {
            m0 m0Var = pVar.f1438h;
            obj = !m0Var.b() ? null : m0Var.f2132i.getSelectedItem();
        } else {
            obj = pVar.getAdapter().getItem(i2);
        }
        p.a(this.e, obj);
        AdapterView.OnItemClickListener onItemClickListener = this.e.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i2 < 0) {
                m0 m0Var2 = this.e.f1438h;
                view = !m0Var2.b() ? null : m0Var2.f2132i.getSelectedView();
                m0 m0Var3 = this.e.f1438h;
                i2 = !m0Var3.b() ? -1 : m0Var3.f2132i.getSelectedItemPosition();
                m0 m0Var4 = this.e.f1438h;
                j2 = !m0Var4.b() ? Long.MIN_VALUE : m0Var4.f2132i.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.e.f1438h.f2132i, view, i2, j2);
        }
        this.e.f1438h.dismiss();
    }
}
