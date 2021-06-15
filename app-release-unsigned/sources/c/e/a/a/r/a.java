package c.e.a.a.r;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import g.h.j.z.b;

public class a extends g.h.j.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f1294d;

    public a(CheckableImageButton checkableImageButton) {
        this.f1294d = checkableImageButton;
    }

    @Override // g.h.j.a
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f1294d.isChecked());
    }

    @Override // g.h.j.a
    public void d(View view, b bVar) {
        this.b.onInitializeAccessibilityNodeInfo(view, bVar.b);
        bVar.b.setCheckable(this.f1294d.f1691i);
        bVar.b.setChecked(this.f1294d.isChecked());
    }
}
