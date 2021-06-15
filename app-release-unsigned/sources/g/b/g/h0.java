package g.b.g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsuga.news.R;
import g.h.k.c;
import java.lang.reflect.Field;

public class h0 extends ListView {
    public final Rect e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public int f2093f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f2094g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2095h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f2096i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f2097j;

    /* renamed from: k  reason: collision with root package name */
    public Field f2098k;

    /* renamed from: l  reason: collision with root package name */
    public a f2099l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2100m;
    public boolean n;
    public boolean o;
    public c p;
    public b q;

    public static class a extends g.b.e.a.a {

        /* renamed from: f  reason: collision with root package name */
        public boolean f2101f = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        @Override // g.b.e.a.a
        public void draw(Canvas canvas) {
            if (this.f2101f) {
                this.e.draw(canvas);
            }
        }

        @Override // g.b.e.a.a
        public void setHotspot(float f2, float f3) {
            if (this.f2101f) {
                this.e.setHotspot(f2, f3);
            }
        }

        @Override // g.b.e.a.a
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f2101f) {
                this.e.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // g.b.e.a.a
        public boolean setState(int[] iArr) {
            if (this.f2101f) {
                return this.e.setState(iArr);
            }
            return false;
        }

        @Override // g.b.e.a.a
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f2101f) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            h0 h0Var = h0.this;
            h0Var.q = null;
            h0Var.drawableStateChanged();
        }
    }

    public h0(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.n = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2098k = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f2099l;
        if (aVar != null) {
            aVar.f2101f = z;
        }
    }

    public int a(int i2, int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i5 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i5;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i2, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return (i4 < 0 || i6 <= i4 || i8 <= 0 || i5 == i3) ? i3 : i8;
            }
            if (i4 >= 0 && i6 >= i4) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.view.MotionEvent r17, int r18) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.h0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.e.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.e);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.q == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    public boolean hasFocus() {
        return this.n || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.n || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.n || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.n && this.f2100m) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.q = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.q == null) {
            b bVar = new b();
            this.q = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2097j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.q;
        if (bVar != null) {
            h0 h0Var = h0.this;
            h0Var.q = null;
            h0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f2100m = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f2099l = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2093f = rect.left;
        this.f2094g = rect.top;
        this.f2095h = rect.right;
        this.f2096i = rect.bottom;
    }
}
