package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import c.e.a.a.m.a0;
import c.e.a.a.m.d;
import c.e.a.a.m.n;
import c.e.a.a.m.o;
import c.e.a.a.m.t;
import com.tsuga.news.R;
import g.h.i.b;
import java.util.Calendar;
import java.util.Objects;

public final class MaterialCalendarGridView extends GridView {
    public final Calendar e = a0.e();

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1679f;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (o.F0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f1679f = o.G0(getContext(), R.attr.nestedScrollable);
        g.h.j.o.o(this, new n(this));
    }

    /* renamed from: a */
    public t getAdapter() {
        return (t) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        t a = getAdapter();
        d<?> dVar = a.f1261g;
        a.getItem(a.b());
        a.getItem(a.d());
        for (b<Long, Long> bVar : dVar.d()) {
            Objects.requireNonNull(bVar);
        }
    }

    public void onFocusChanged(boolean z, int i2, Rect rect) {
        int i3;
        if (z) {
            if (i2 == 33) {
                i3 = getAdapter().d();
            } else if (i2 == 130) {
                i3 = getAdapter().b();
            } else {
                super.onFocusChanged(true, i2, rect);
                return;
            }
            setSelection(i3);
            return;
        }
        super.onFocusChanged(false, i2, rect);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void onMeasure(int i2, int i3) {
        if (this.f1679f) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof t) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), t.class.getCanonicalName()));
        }
    }

    public void setSelection(int i2) {
        if (i2 < getAdapter().b()) {
            i2 = getAdapter().b();
        }
        super.setSelection(i2);
    }
}
