package c.e.a.a.b0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.e.a.a.b;
import c.e.a.a.w.g;
import c.e.a.a.w.h;
import c.e.a.a.w.j;
import com.tsuga.news.R;
import g.f.d.d;
import g.h.j.o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class c extends ConstraintLayout {
    public final Runnable x;
    public int y;
    public g z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c.this.k();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.z = gVar;
        h hVar = new h(0.5f);
        j jVar = gVar.f1340g.a;
        Objects.requireNonNull(jVar);
        j.b bVar = new j.b(jVar);
        bVar.e = hVar;
        bVar.f1368f = hVar;
        bVar.f1369g = hVar;
        bVar.f1370h = hVar;
        gVar.f1340g.a = bVar.a();
        gVar.invalidateSelf();
        this.z.p(ColorStateList.valueOf(-1));
        g gVar2 = this.z;
        AtomicInteger atomicInteger = o.a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.v, i2, 0);
        this.y = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.x = new a();
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            AtomicInteger atomicInteger = o.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.x);
            handler.post(this.x);
        }
    }

    public void k() {
        int childCount = getChildCount();
        int i2 = 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            if ("skip".equals(getChildAt(i3).getTag())) {
                i2++;
            }
        }
        d dVar = new d();
        dVar.b(this);
        float f2 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i5 = this.y;
                if (!dVar.e.containsKey(Integer.valueOf(id))) {
                    dVar.e.put(Integer.valueOf(id), new d.a());
                }
                d.b bVar = dVar.e.get(Integer.valueOf(id)).f2412d;
                bVar.y = R.id.circle_center;
                bVar.z = i5;
                bVar.A = f2;
                f2 = (360.0f / ((float) (childCount - i2))) + f2;
            }
        }
        dVar.a(this, true);
        setConstraintSet(null);
        requestLayout();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.x);
            handler.post(this.x);
        }
    }

    public void setBackgroundColor(int i2) {
        this.z.p(ColorStateList.valueOf(i2));
    }
}
