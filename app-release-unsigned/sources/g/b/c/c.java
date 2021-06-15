package g.b.c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public class c implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f1865f;

    public c(AlertController.b bVar, AlertController alertController) {
        this.f1865f = bVar;
        this.e = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f1865f.f53h.onClick(this.e.b, i2);
        if (!this.f1865f.f54i) {
            this.e.b.dismiss();
        }
    }
}
