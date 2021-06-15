package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c.e.a.a.r.k;
import c.e.a.a.w.j;
import com.google.android.material.button.MaterialButton;
import com.tsuga.news.R;
import g.h.j.o;
import g.h.j.z.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MaterialButtonToggleGroup extends LinearLayout {
    public static final String e = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    public final List<d> f1656f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final c f1657g = new c(null);

    /* renamed from: h  reason: collision with root package name */
    public final f f1658h = new f(null);

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashSet<e> f1659i = new LinkedHashSet<>();

    /* renamed from: j  reason: collision with root package name */
    public final Comparator<MaterialButton> f1660j = new a();

    /* renamed from: k  reason: collision with root package name */
    public Integer[] f1661k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1662l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1663m;
    public boolean n;
    public int o;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    public class b extends g.h.j.a {
        public b() {
        }

        @Override // g.h.j.a
        public void d(View view, g.h.j.z.b bVar) {
            this.b.onInitializeAccessibilityNodeInfo(view, bVar.b);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            String str = MaterialButtonToggleGroup.e;
            Objects.requireNonNull(materialButtonToggleGroup);
            int i2 = -1;
            if (view instanceof MaterialButton) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        i2 = i4;
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.d(i3)) {
                            i4++;
                        }
                        i3++;
                    }
                }
            }
            bVar.j(b.c.a(0, 1, i2, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public class c implements MaterialButton.a {
        public c(a aVar) {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (!materialButtonToggleGroup.f1662l) {
                if (materialButtonToggleGroup.f1663m) {
                    materialButtonToggleGroup.o = z ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.f(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.b(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }
    }

    public static class d {
        public static final c.e.a.a.w.c a = new c.e.a.a.w.a(0.0f);
        public c.e.a.a.w.c b;

        /* renamed from: c  reason: collision with root package name */
        public c.e.a.a.w.c f1665c;

        /* renamed from: d  reason: collision with root package name */
        public c.e.a.a.w.c f1666d;
        public c.e.a.a.w.c e;

        public d(c.e.a.a.w.c cVar, c.e.a.a.w.c cVar2, c.e.a.a.w.c cVar3, c.e.a.a.w.c cVar4) {
            this.b = cVar;
            this.f1665c = cVar3;
            this.f1666d = cVar4;
            this.e = cVar2;
        }
    }

    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z);
    }

    public class f implements MaterialButton.b {
        public f(a aVar) {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(c.e.a.a.a0.a.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131821202), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray d2 = k.d(getContext(), attributeSet, c.e.a.a.b.f1177m, R.attr.materialButtonToggleGroupStyle, 2131821202, new int[0]);
        setSingleSelection(d2.getBoolean(2, false));
        this.o = d2.getResourceId(0, -1);
        this.n = d2.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d2.recycle();
        AtomicInteger atomicInteger = o.a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (d(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && d(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setCheckedId(int i2) {
        this.o = i2;
        b(i2, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            AtomicInteger atomicInteger = o.a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f1651j.add(this.f1657g);
        materialButton.setOnPressedChangeListenerInternal(this.f1658h);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton c2 = c(i2);
                int min = Math.min(c2.getStrokeWidth(), c(i2 - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (getOrientation() == 0) {
                    layoutParams2.setMarginEnd(0);
                    layoutParams2.setMarginStart(-min);
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = -min;
                    layoutParams2.setMarginStart(0);
                }
                c2.setLayoutParams(layoutParams2);
            }
            if (!(getChildCount() == 0 || firstVisibleChildIndex == -1)) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(e, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            f(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1656f.add(new d(shapeAppearanceModel.e, shapeAppearanceModel.f1361h, shapeAppearanceModel.f1359f, shapeAppearanceModel.f1360g));
        o.o(materialButton, new b());
    }

    public final void b(int i2, boolean z) {
        Iterator<e> it = this.f1659i.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2, z);
        }
    }

    public final MaterialButton c(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    public final boolean d(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f1660j);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(c(i2), Integer.valueOf(i2));
        }
        this.f1661k = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof MaterialButton) {
            this.f1662l = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f1662l = false;
        }
    }

    public final boolean f(int i2, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.n || !checkedButtonIds.isEmpty()) {
            if (z && this.f1663m) {
                checkedButtonIds.remove(Integer.valueOf(i2));
                for (Integer num : checkedButtonIds) {
                    int intValue = num.intValue();
                    e(intValue, false);
                    b(intValue, false);
                }
            }
            return true;
        }
        e(i2, true);
        this.o = i2;
        return false;
    }

    public void g() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton c2 = c(i2);
            if (c2.getVisibility() != 8) {
                j shapeAppearanceModel = c2.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                j.b bVar = new j.b(shapeAppearanceModel);
                d dVar2 = this.f1656f.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i2 == firstVisibleChildIndex) {
                        if (!z) {
                            c.e.a.a.w.c cVar = dVar2.b;
                            c.e.a.a.w.c cVar2 = d.a;
                            dVar = new d(cVar, cVar2, dVar2.f1665c, cVar2);
                        } else if (c.e.a.a.a.l(this)) {
                            c.e.a.a.w.c cVar3 = d.a;
                            dVar = new d(cVar3, cVar3, dVar2.f1665c, dVar2.f1666d);
                        } else {
                            c.e.a.a.w.c cVar4 = dVar2.b;
                            c.e.a.a.w.c cVar5 = dVar2.e;
                            c.e.a.a.w.c cVar6 = d.a;
                            dVar = new d(cVar4, cVar5, cVar6, cVar6);
                        }
                    } else if (i2 != lastVisibleChildIndex) {
                        dVar2 = null;
                    } else if (!z) {
                        c.e.a.a.w.c cVar7 = d.a;
                        dVar = new d(cVar7, dVar2.e, cVar7, dVar2.f1666d);
                    } else if (c.e.a.a.a.l(this)) {
                        c.e.a.a.w.c cVar8 = dVar2.b;
                        c.e.a.a.w.c cVar9 = dVar2.e;
                        c.e.a.a.w.c cVar10 = d.a;
                        dVar = new d(cVar8, cVar9, cVar10, cVar10);
                    } else {
                        c.e.a.a.w.c cVar11 = d.a;
                        dVar = new d(cVar11, cVar11, dVar2.f1665c, dVar2.f1666d);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    bVar.c(0.0f);
                } else {
                    bVar.e = dVar2.b;
                    bVar.f1370h = dVar2.e;
                    bVar.f1368f = dVar2.f1665c;
                    bVar.f1369g = dVar2.f1666d;
                }
                c2.setShapeAppearanceModel(bVar.a());
            }
        }
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f1663m) {
            return this.o;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton c2 = c(i2);
            if (c2.isChecked()) {
                arrayList.add(Integer.valueOf(c2.getId()));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f1661k;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w(e, "Child order wasn't updated");
        return i3;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.o;
        if (i2 != -1) {
            e(i2, true);
            f(i2, true);
            setCheckedId(i2);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0078b.a(1, getVisibleButtonCount(), false, this.f1663m ? 1 : 2).a);
    }

    public void onMeasure(int i2, int i3) {
        g();
        a();
        super.onMeasure(i2, i3);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f1651j.remove(this.f1657g);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f1656f.remove(indexOfChild);
        }
        g();
        a();
    }

    public void setSelectionRequired(boolean z) {
        this.n = z;
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z) {
        if (this.f1663m != z) {
            this.f1663m = z;
            this.f1662l = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                MaterialButton c2 = c(i2);
                c2.setChecked(false);
                b(c2.getId(), false);
            }
            this.f1662l = false;
            setCheckedId(-1);
        }
    }
}
