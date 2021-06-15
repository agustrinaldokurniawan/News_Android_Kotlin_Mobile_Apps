package c.e.a.a.b0;

import android.view.View;
import com.google.android.material.timepicker.ClockFaceView;
import com.tsuga.news.R;
import g.h.j.a;
import g.h.j.z.b;

public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1178d;

    public b(ClockFaceView clockFaceView) {
        this.f1178d = clockFaceView;
    }

    @Override // g.h.j.a
    public void d(View view, g.h.j.z.b bVar) {
        this.b.onInitializeAccessibilityNodeInfo(view, bVar.b);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            bVar.b.setTraversalAfter(this.f1178d.D.get(intValue - 1));
        }
        bVar.j(b.c.a(0, 1, intValue, 1, false, view.isSelected()));
    }
}
