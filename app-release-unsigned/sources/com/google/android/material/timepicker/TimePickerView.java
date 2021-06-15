package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.e.a.a.b0.d;
import c.e.a.a.b0.e;
import c.e.a.a.b0.f;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.tsuga.news.R;
import g.f.d.d;
import g.h.j.o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public final MaterialButtonToggleGroup A;
    public final View.OnClickListener B;
    public final Chip y;
    public final Chip z;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i2 = TimePickerView.x;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.B = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.A = materialButtonToggleGroup;
        materialButtonToggleGroup.f1659i.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.y = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.z = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        f fVar = new f(this, new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
    }

    public final void k() {
        if (this.A.getVisibility() == 0) {
            g.f.d.d dVar = new g.f.d.d();
            dVar.b(this);
            AtomicInteger atomicInteger = o.a;
            char c2 = getLayoutDirection() == 0 ? (char) 2 : 1;
            if (dVar.e.containsKey(Integer.valueOf((int) R.id.material_clock_display))) {
                d.a aVar = dVar.e.get(Integer.valueOf((int) R.id.material_clock_display));
                switch (c2) {
                    case 1:
                        d.b bVar = aVar.f2412d;
                        bVar.f2420j = -1;
                        bVar.f2419i = -1;
                        bVar.E = -1;
                        bVar.K = -1;
                        break;
                    case 2:
                        d.b bVar2 = aVar.f2412d;
                        bVar2.f2422l = -1;
                        bVar2.f2421k = -1;
                        bVar2.F = -1;
                        bVar2.M = -1;
                        break;
                    case 3:
                        d.b bVar3 = aVar.f2412d;
                        bVar3.n = -1;
                        bVar3.f2423m = -1;
                        bVar3.G = -1;
                        bVar3.L = -1;
                        break;
                    case 4:
                        d.b bVar4 = aVar.f2412d;
                        bVar4.o = -1;
                        bVar4.p = -1;
                        bVar4.H = -1;
                        bVar4.N = -1;
                        break;
                    case 5:
                        aVar.f2412d.q = -1;
                        break;
                    case 6:
                        d.b bVar5 = aVar.f2412d;
                        bVar5.r = -1;
                        bVar5.s = -1;
                        bVar5.J = -1;
                        bVar5.P = -1;
                        break;
                    case 7:
                        d.b bVar6 = aVar.f2412d;
                        bVar6.t = -1;
                        bVar6.u = -1;
                        bVar6.I = -1;
                        bVar6.O = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            dVar.a(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k();
    }

    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            k();
        }
    }
}
