package g.b.g;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import g.b.c.d;
import g.h.j.o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class x extends Spinner {
    public static final int[] e = {16843505};

    /* renamed from: f  reason: collision with root package name */
    public final e f2170f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f2171g;

    /* renamed from: h  reason: collision with root package name */
    public j0 f2172h;

    /* renamed from: i  reason: collision with root package name */
    public SpinnerAdapter f2173i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2174j;

    /* renamed from: k  reason: collision with root package name */
    public f f2175k;

    /* renamed from: l  reason: collision with root package name */
    public int f2176l;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f2177m = new Rect();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (!x.this.getInternalPopup().b()) {
                x.this.b();
            }
            ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public class b implements f, DialogInterface.OnClickListener {
        public g.b.c.d e;

        /* renamed from: f  reason: collision with root package name */
        public ListAdapter f2178f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f2179g;

        public b() {
        }

        @Override // g.b.g.x.f
        public void a(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // g.b.g.x.f
        public boolean b() {
            g.b.c.d dVar = this.e;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        @Override // g.b.g.x.f
        public int c() {
            return 0;
        }

        @Override // g.b.g.x.f
        public void d(int i2, int i3) {
            if (this.f2178f != null) {
                d.a aVar = new d.a(x.this.getPopupContext());
                CharSequence charSequence = this.f2179g;
                if (charSequence != null) {
                    aVar.a.f50d = charSequence;
                }
                ListAdapter listAdapter = this.f2178f;
                int selectedItemPosition = x.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.a;
                bVar.f52g = listAdapter;
                bVar.f53h = this;
                bVar.f55j = selectedItemPosition;
                bVar.f54i = true;
                g.b.c.d a = aVar.a();
                this.e = a;
                ListView listView = a.f1866g.f41g;
                listView.setTextDirection(i2);
                listView.setTextAlignment(i3);
                this.e.show();
            }
        }

        @Override // g.b.g.x.f
        public void dismiss() {
            g.b.c.d dVar = this.e;
            if (dVar != null) {
                dVar.dismiss();
                this.e = null;
            }
        }

        @Override // g.b.g.x.f
        public int g() {
            return 0;
        }

        @Override // g.b.g.x.f
        public Drawable i() {
            return null;
        }

        @Override // g.b.g.x.f
        public CharSequence j() {
            return this.f2179g;
        }

        @Override // g.b.g.x.f
        public void l(CharSequence charSequence) {
            this.f2179g = charSequence;
        }

        @Override // g.b.g.x.f
        public void m(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // g.b.g.x.f
        public void n(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // g.b.g.x.f
        public void o(ListAdapter listAdapter) {
            this.f2178f = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            x.this.setSelection(i2);
            if (x.this.getOnItemClickListener() != null) {
                x.this.performItemClick(null, i2, this.f2178f.getItemId(i2));
            }
            g.b.c.d dVar = this.e;
            if (dVar != null) {
                dVar.dismiss();
                this.e = null;
            }
        }

        @Override // g.b.g.x.f
        public void p(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    public static class c implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter e;

        /* renamed from: f  reason: collision with root package name */
        public ListAdapter f2181f;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2181f = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof v0) {
                v0 v0Var = (v0) spinnerAdapter;
                if (v0Var.getDropDownViewTheme() == null) {
                    v0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2181f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i2);
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f2181f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class d extends m0 implements f {
        public CharSequence G;
        public ListAdapter H;
        public final Rect I = new Rect();
        public int J;

        public class a implements AdapterView.OnItemClickListener {
            public a(x xVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                x.this.setSelection(i2);
                if (x.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    x.this.performItemClick(view, i2, dVar.H.getItemId(i2));
                }
                d.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                d dVar = d.this;
                x xVar = x.this;
                Objects.requireNonNull(dVar);
                AtomicInteger atomicInteger = o.a;
                if (!(xVar.isAttachedToWindow() && xVar.getGlobalVisibleRect(dVar.I))) {
                    d.this.dismiss();
                    return;
                }
                d.this.t();
                d.this.f();
            }
        }

        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener e;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.e = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.e);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2, 0);
            this.v = x.this;
            s(true);
            this.t = 0;
            this.w = new a(x.this);
        }

        @Override // g.b.g.x.f
        public void d(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            t();
            this.F.setInputMethodMode(2);
            f();
            h0 h0Var = this.f2132i;
            h0Var.setChoiceMode(1);
            h0Var.setTextDirection(i2);
            h0Var.setTextAlignment(i3);
            int selectedItemPosition = x.this.getSelectedItemPosition();
            h0 h0Var2 = this.f2132i;
            if (b() && h0Var2 != null) {
                h0Var2.setListSelectionHidden(false);
                h0Var2.setSelection(selectedItemPosition);
                if (h0Var2.getChoiceMode() != 0) {
                    h0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b2 && (viewTreeObserver = x.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.F.setOnDismissListener(new c(bVar));
            }
        }

        @Override // g.b.g.x.f
        public CharSequence j() {
            return this.G;
        }

        @Override // g.b.g.x.f
        public void l(CharSequence charSequence) {
            this.G = charSequence;
        }

        @Override // g.b.g.x.f, g.b.g.m0
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.H = listAdapter;
        }

        @Override // g.b.g.x.f
        public void p(int i2) {
            this.J = i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void t() {
            /*
            // Method dump skipped, instructions count: 158
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.g.x.d.t():void");
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public boolean e;

        public class a implements Parcelable.Creator<e> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.e = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.e ? (byte) 1 : 0);
        }
    }

    public interface f {
        void a(int i2);

        boolean b();

        int c();

        void d(int i2, int i3);

        void dismiss();

        int g();

        Drawable i();

        CharSequence j();

        void l(CharSequence charSequence);

        void m(Drawable drawable);

        void n(int i2);

        void o(ListAdapter listAdapter);

        void p(int i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r4 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.x.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f2177m);
        Rect rect = this.f2177m;
        return i3 + rect.left + rect.right;
    }

    public void b() {
        this.f2175k.d(getTextDirection(), getTextAlignment());
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2170f;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        f fVar = this.f2175k;
        return fVar != null ? fVar.c() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f fVar = this.f2175k;
        return fVar != null ? fVar.g() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f2175k != null ? this.f2176l : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f2175k;
    }

    public Drawable getPopupBackground() {
        f fVar = this.f2175k;
        return fVar != null ? fVar.i() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f2171g;
    }

    public CharSequence getPrompt() {
        f fVar = this.f2175k;
        return fVar != null ? fVar.j() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2170f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2170f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f2175k;
        if (fVar != null && fVar.b()) {
            this.f2175k.dismiss();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2175k != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.e && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f2175k;
        eVar.e = fVar != null && fVar.b();
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        j0 j0Var = this.f2172h;
        if (j0Var == null || !j0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        f fVar = this.f2175k;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AbsSpinner, android.widget.Spinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2174j) {
            this.f2173i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2175k != null) {
            Context context = this.f2171g;
            if (context == null) {
                context = getContext();
            }
            this.f2175k.o(new c(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2170f;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f2170f;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        f fVar = this.f2175k;
        if (fVar != null) {
            fVar.p(i2);
            this.f2175k.a(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        f fVar = this.f2175k;
        if (fVar != null) {
            fVar.n(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f2175k != null) {
            this.f2176l = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f2175k;
        if (fVar != null) {
            fVar.m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(g.b.d.a.a.a(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f2175k;
        if (fVar != null) {
            fVar.l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2170f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2170f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
