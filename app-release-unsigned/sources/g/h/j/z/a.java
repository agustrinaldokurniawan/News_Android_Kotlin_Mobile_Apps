package g.h.j.z;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final b f2553f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2554g;

    public a(int i2, b bVar, int i3) {
        this.e = i2;
        this.f2553f = bVar;
        this.f2554g = i3;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.e);
        b bVar = this.f2553f;
        bVar.b.performAction(this.f2554g, bundle);
    }
}
