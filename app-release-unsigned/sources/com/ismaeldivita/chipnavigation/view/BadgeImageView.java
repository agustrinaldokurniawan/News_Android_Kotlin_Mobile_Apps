package com.ismaeldivita.chipnavigation.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import g.b.g.n;
import i.s.c.h;

public final class BadgeImageView extends n {

    /* renamed from: g  reason: collision with root package name */
    public final c.f.a.g.a f1743g;

    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ BadgeImageView a;

        public a(BadgeImageView badgeImageView) {
            this.a = badgeImageView;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (this.a.getVisibility() == 0) {
                c.f.a.g.a aVar = this.a.f1743g;
                Rect rect = new Rect();
                this.a.getDrawingRect(rect);
                aVar.b(rect);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.f(context, "context");
        this.f1743g = new c.f.a.g.a(context);
        addOnLayoutChangeListener(new a(this));
    }

    public final void c(int i2) {
        Rect rect = new Rect();
        getDrawingRect(rect);
        c.f.a.g.a aVar = this.f1743g;
        aVar.b = i2;
        Rect rect2 = aVar.f1559c;
        if (rect2 != null) {
            aVar.b(rect2);
        }
        if (!rect.isEmpty()) {
            this.f1743g.b(rect);
        }
        getOverlay().add(this.f1743g);
        invalidate();
    }

    public final void setBadgeColor(int i2) {
        this.f1743g.a().setColor(i2);
    }
}
