package g.b.g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.tsuga.news.R;
import g.b.b;
import g.b.f.i.g;
import g.h.j.o;
import g.h.j.u;
import g.h.j.v;

public abstract class a extends ViewGroup {
    public final C0066a e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f2030f;

    /* renamed from: g  reason: collision with root package name */
    public ActionMenuView f2031g;

    /* renamed from: h  reason: collision with root package name */
    public c f2032h;

    /* renamed from: i  reason: collision with root package name */
    public int f2033i;

    /* renamed from: j  reason: collision with root package name */
    public u f2034j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2035k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2036l;

    /* renamed from: g.b.g.a$a  reason: collision with other inner class name */
    public class C0066a implements v {
        public boolean a = false;
        public int b;

        public C0066a() {
        }

        @Override // g.h.j.v
        public void a(View view) {
            if (!this.a) {
                a aVar = a.this;
                aVar.f2034j = null;
                a.super.setVisibility(this.b);
            }
        }

        @Override // g.h.j.v
        public void b(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        @Override // g.h.j.v
        public void c(View view) {
            this.a = true;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = new C0066a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2030f = context;
        } else {
            this.f2030f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int d(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public u e(int i2, long j2) {
        u uVar = this.f2034j;
        if (uVar != null) {
            uVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            u b = o.b(this);
            b.a(1.0f);
            b.c(j2);
            C0066a aVar = this.e;
            a.this.f2034j = b;
            aVar.b = i2;
            View view = b.a.get();
            if (view != null) {
                b.e(view, aVar);
            }
            return b;
        }
        u b2 = o.b(this);
        b2.a(0.0f);
        b2.c(j2);
        C0066a aVar2 = this.e;
        a.this.f2034j = b2;
        aVar2.b = i2;
        View view2 = b2.a.get();
        if (view2 != null) {
            b2.e(view2, aVar2);
        }
        return b2;
    }

    public int getAnimatedVisibility() {
        return this.f2034j != null ? this.e.b : getVisibility();
    }

    public int getContentHeight() {
        return this.f2033i;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, b.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f2032h;
        if (cVar != null) {
            Configuration configuration2 = cVar.f1956f.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            cVar.t = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            g gVar = cVar.f1957g;
            if (gVar != null) {
                gVar.q(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2036l = false;
        }
        if (!this.f2036l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2036l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2036l = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2035k = false;
        }
        if (!this.f2035k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2035k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2035k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            u uVar = this.f2034j;
            if (uVar != null) {
                uVar.b();
            }
            super.setVisibility(i2);
        }
    }
}
