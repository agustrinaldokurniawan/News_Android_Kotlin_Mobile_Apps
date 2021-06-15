package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import c.e.a.a.j.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import g.b.c.p;
import g.b.g.b0;
import g.b.g.d;
import g.b.g.f;
import g.b.g.g;
import g.b.g.r;

public class MaterialComponentsViewInflater extends p {
    @Override // g.b.c.p
    public d a(Context context, AttributeSet attributeSet) {
        return new c.e.a.a.z.p(context, attributeSet);
    }

    @Override // g.b.c.p
    public f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.b.c.p
    public g c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // g.b.c.p
    public r d(Context context, AttributeSet attributeSet) {
        return new c.e.a.a.s.a(context, attributeSet);
    }

    @Override // g.b.c.p
    public b0 e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
