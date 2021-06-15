package com.ismaeldivita.chipnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.f.a.d;
import c.f.a.f.g;
import com.tsuga.news.R;
import i.m;
import i.s.b.l;
import i.s.c.h;
import i.s.c.i;
import i.w.d;
import i.w.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ChipNavigationBar extends ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public int A;
    public boolean B;
    public final c.f.a.e.b C;
    public int D = -1;
    public final Map<Integer, Integer> E = new LinkedHashMap();
    public a y;
    public b z;

    public enum a {
        HORIZONTAL,
        VERTICAL
    }

    public interface b {
        void a(int i2);
    }

    public static final class c extends i implements l<Object, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f1740f = new c();

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.l
        public Boolean o(Object obj) {
            return Boolean.valueOf(obj instanceof c.f.a.g.f);
        }
    }

    public static final class d extends i implements l<View, i.f<? extends Integer, ? extends Boolean>> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f1741f = new d();

        public d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // i.s.b.l
        public i.f<? extends Integer, ? extends Boolean> o(View view) {
            View view2 = view;
            h.f(view2, "it");
            return new i.f(Integer.valueOf(view2.getId()), Boolean.valueOf(view2.isEnabled()));
        }
    }

    public static final class e extends i implements l<View, m> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ChipNavigationBar f1742f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ChipNavigationBar chipNavigationBar) {
            super(1);
            this.f1742f = chipNavigationBar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // i.s.b.l
        public m o(View view) {
            View view2 = view;
            h.f(view2, "view");
            ChipNavigationBar.n(this.f1742f, view2.getId(), false, 2);
            return m.a;
        }
    }

    public static final class f implements b {
        public final /* synthetic */ l a;

        public f(l lVar) {
            this.a = lVar;
        }

        @Override // com.ismaeldivita.chipnavigation.ChipNavigationBar.b
        public void a(int i2) {
            this.a.o(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipNavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = a.HORIZONTAL;
        h.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f.a.c.b);
        int resourceId = obtainStyledAttributes.getResourceId(6, -1);
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        boolean z3 = obtainStyledAttributes.getBoolean(3, false);
        boolean z4 = obtainStyledAttributes.getBoolean(2, false);
        boolean z5 = obtainStyledAttributes.getBoolean(0, false);
        int i2 = obtainStyledAttributes.getInt(8, 0);
        if (i2 != 0 && i2 == 1) {
            aVar = a.VERTICAL;
        }
        h.b(obtainStyledAttributes, "a");
        this.C = new c.f.a.e.b(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        setMenuOrientation(aVar);
        if (resourceId >= 0) {
            setMenuResource(resourceId);
        }
        setMinimumExpandedWidth((int) dimension);
        h.f(this, "$this$applyWindowInsets");
        setOnApplyWindowInsetsListener(new c.f.a.f.d(new c.f.a.f.c(z2, z3, z4, z5), new c.f.a.f.b(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom())));
        if (isAttachedToWindow()) {
            requestApplyInsets();
        } else {
            addOnAttachStateChangeListener(new c.f.a.f.e());
        }
        k();
        setClickable(true);
    }

    private final g.f.a.a.a getHorizontalFlow() {
        g.f.a.a.a aVar = new g.f.a.a.a(getContext());
        aVar.setOrientation(0);
        aVar.setHorizontalStyle(0);
        aVar.setHorizontalAlign(0);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return aVar;
    }

    private final View getSelectedItem() {
        Object obj;
        h.f(this, "$this$getChildren");
        h.f(this, "$this$iterator");
        c.f.a.f.h hVar = new c.f.a.f.h(this);
        while (true) {
            if (!hVar.hasNext()) {
                obj = null;
                break;
            }
            obj = hVar.next();
            if (((View) obj).isSelected()) {
                break;
            }
        }
        return (View) obj;
    }

    private final g.f.a.a.a getVerticalFlow() {
        g.f.a.a.a aVar = new g.f.a.a.a(getContext());
        aVar.setOrientation(1);
        aVar.setHorizontalAlign(0);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return aVar;
    }

    public static void n(ChipNavigationBar chipNavigationBar, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        chipNavigationBar.m(i2, z2, true);
    }

    public final int getSelectedItemId() {
        View selectedItem = getSelectedItem();
        if (selectedItem != null) {
            return selectedItem.getId();
        }
        return -1;
    }

    public final void k() {
        this.B = false;
        a aVar = this.y;
        if (aVar == null) {
            h.k("orientationMode");
            throw null;
        } else if (aVar == a.VERTICAL) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                h.b(childAt, "getChildAt(i)");
                childAt.setMinimumWidth(0);
                if (!(childAt instanceof c.f.a.g.h)) {
                    childAt = null;
                }
                c.f.a.g.h hVar = (c.f.a.g.h) childAt;
                if (hVar != null) {
                    hVar.c();
                }
            }
        }
    }

    public final c.f.a.g.f l(int i2) {
        Object obj;
        boolean z2;
        h.f(this, "$this$getChildren");
        g gVar = new g(this);
        c cVar = c.f1740f;
        h.e(gVar, "$this$filter");
        h.e(cVar, "predicate");
        d.a aVar = new d.a(new i.w.d(gVar, true, cVar));
        while (true) {
            if (!aVar.hasNext()) {
                obj = null;
                break;
            }
            obj = aVar.next();
            if (((c.f.a.g.f) obj).getId() == i2) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        return (c.f.a.g.f) obj;
    }

    public final void m(int i2, boolean z2, boolean z3) {
        c.f.a.g.f l2;
        b bVar;
        View selectedItem = getSelectedItem();
        if (z2 && (selectedItem == null || selectedItem.getId() != i2)) {
            if (selectedItem != null) {
                selectedItem.setSelected(false);
            }
            c.f.a.g.f l3 = l(i2);
            if (l3 != null) {
                TransitionManager.beginDelayedTransition(this);
                l3.setSelected(true);
                if (z3 && (bVar = this.z) != null) {
                    bVar.a(i2);
                }
            }
        } else if (!z2 && (l2 = l(i2)) != null) {
            TransitionManager.beginDelayedTransition(this);
            l2.setSelected(false);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Map map;
        Map map2;
        c.f.a.g.f l2;
        ArrayList<d.c> parcelableArrayList;
        ArrayList<d.a> parcelableArrayList2;
        if (parcelable instanceof c.f.a.d) {
            c.f.a.d dVar = (c.f.a.d) parcelable;
            super.onRestoreInstanceState(dVar.getSuperState());
            Bundle bundle = dVar.e;
            int i2 = -1;
            if ((bundle != null ? bundle.getInt("menuId") : -1) != -1) {
                Bundle bundle2 = dVar.e;
                setMenuResource(bundle2 != null ? bundle2.getInt("menuId") : -1);
            }
            Bundle bundle3 = dVar.e;
            if ((bundle3 != null ? bundle3.getInt("selectedItem") : -1) != -1) {
                Bundle bundle4 = dVar.e;
                if (bundle4 != null) {
                    i2 = bundle4.getInt("selectedItem");
                }
                m(i2, true, false);
            }
            Bundle bundle5 = dVar.e;
            if (bundle5 != null ? bundle5.getBoolean("expanded") : false) {
                this.B = true;
                a aVar = this.y;
                if (aVar == null) {
                    h.k("orientationMode");
                    throw null;
                } else if (aVar == a.VERTICAL) {
                    int childCount = getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = getChildAt(i3);
                        h.b(childAt, "getChildAt(i)");
                        childAt.setMinimumWidth(this.A);
                        if (!(childAt instanceof c.f.a.g.h)) {
                            childAt = null;
                        }
                        c.f.a.g.h hVar = (c.f.a.g.h) childAt;
                        if (hVar != null) {
                            hVar.e();
                        }
                    }
                }
            } else {
                k();
            }
            Bundle bundle6 = dVar.e;
            int i4 = 16;
            if (bundle6 == null || (parcelableArrayList2 = bundle6.getParcelableArrayList("badges")) == null) {
                map = i.o.i.e;
            } else {
                int H = h.a.t.a.H(h.a.t.a.l(parcelableArrayList2, 10));
                if (H < 16) {
                    H = 16;
                }
                map = new LinkedHashMap(H);
                for (d.a aVar2 : parcelableArrayList2) {
                    map.put(Integer.valueOf(aVar2.e), Integer.valueOf(aVar2.f1540f));
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                int intValue2 = ((Number) entry.getValue()).intValue();
                if (intValue2 > 0) {
                    this.E.put(Integer.valueOf(intValue), Integer.valueOf(intValue2));
                    c.f.a.g.f l3 = l(intValue);
                    if (l3 != null) {
                        l3.b(intValue2);
                    }
                } else {
                    this.E.put(Integer.valueOf(intValue), 0);
                    c.f.a.g.f l4 = l(intValue);
                    if (l4 != null) {
                        int i5 = c.f.a.g.f.e;
                        l4.b(0);
                    }
                }
            }
            Bundle bundle7 = dVar.e;
            if (bundle7 == null || (parcelableArrayList = bundle7.getParcelableArrayList("enabled")) == null) {
                map2 = i.o.i.e;
            } else {
                int H2 = h.a.t.a.H(h.a.t.a.l(parcelableArrayList, 10));
                if (H2 >= 16) {
                    i4 = H2;
                }
                map2 = new LinkedHashMap(i4);
                for (d.c cVar : parcelableArrayList) {
                    map2.put(Integer.valueOf(cVar.e), Boolean.valueOf(cVar.f1541f));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                int intValue3 = ((Number) entry2.getKey()).intValue();
                boolean booleanValue = ((Boolean) entry2.getValue()).booleanValue();
                if (!booleanValue && (l2 = l(intValue3)) != null) {
                    l2.setEnabled(booleanValue);
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        c.f.a.d dVar = new c.f.a.d(super.onSaveInstanceState(), new Bundle());
        int i2 = this.D;
        Bundle bundle = dVar.e;
        if (bundle != null) {
            bundle.putInt("menuId", i2);
        }
        int selectedItemId = getSelectedItemId();
        Bundle bundle2 = dVar.e;
        if (bundle2 != null) {
            bundle2.putInt("selectedItem", selectedItemId);
        }
        Map<Integer, Integer> map = this.E;
        h.f(map, "value");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arrayList.add(new d.a(entry.getKey().intValue(), entry.getValue().intValue()));
        }
        Bundle bundle3 = dVar.e;
        if (bundle3 != null) {
            bundle3.putParcelableArrayList("badges", new ArrayList<>(arrayList));
        }
        boolean z2 = this.B;
        Bundle bundle4 = dVar.e;
        if (bundle4 != null) {
            bundle4.putBoolean("expanded", z2);
        }
        h.f(this, "$this$getChildren");
        g gVar = new g(this);
        d dVar2 = d.f1741f;
        h.e(gVar, "$this$map");
        h.e(dVar2, "transform");
        i.w.h hVar = new i.w.h(gVar, dVar2);
        h.e(hVar, "$this$toMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h.e(hVar, "$this$toMap");
        h.e(linkedHashMap, "destination");
        h.e(linkedHashMap, "$this$putAll");
        h.e(hVar, "pairs");
        h.a aVar = new h.a(hVar);
        while (aVar.hasNext()) {
            i.f fVar = (i.f) aVar.next();
            linkedHashMap.put(fVar.e, fVar.f3289f);
        }
        Map k2 = i.o.e.k(linkedHashMap);
        i.s.c.h.f(k2, "value");
        ArrayList arrayList2 = new ArrayList(k2.size());
        for (Map.Entry entry2 : k2.entrySet()) {
            arrayList2.add(new d.c(((Number) entry2.getKey()).intValue(), ((Boolean) entry2.getValue()).booleanValue()));
        }
        Bundle bundle5 = dVar.e;
        if (bundle5 != null) {
            bundle5.putParcelableArrayList("enabled", new ArrayList<>(arrayList2));
        }
        return dVar;
    }

    public final void setMenuOrientation(a aVar) {
        i.s.c.h.f(aVar, "menuOrientation");
        this.y = aVar;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x017b */
    public final void setMenuResource(int i2) {
        String str;
        int i3;
        boolean z2;
        g.f.a.a.a aVar;
        String str2;
        c.f.a.g.f fVar;
        String str3;
        AttributeSet attributeSet;
        Context context;
        String str4;
        ArrayList arrayList;
        PorterDuff.Mode mode;
        this.D = i2;
        Context context2 = getContext();
        String str5 = "context";
        i.s.c.h.b(context2, str5);
        i.s.c.h.f(context2, str5);
        c.f.a.e.b bVar = this.C;
        i.s.c.h.f(bVar, "menuStyle");
        XmlResourceParser layout = context2.getResources().getLayout(i2);
        i.s.c.h.b(layout, "context.resources.getLayout(menuRes)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
        int eventType = layout.getEventType();
        while (true) {
            str = "menu";
            i3 = 2;
            z2 = true;
            if (eventType != 2) {
                eventType = layout.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = layout.getName();
                if (i.s.c.h.a(name, str)) {
                    i.s.c.h.b(asAttributeSet, "attrs");
                    ArrayList arrayList2 = new ArrayList();
                    int eventType2 = layout.getEventType();
                    int i4 = 0;
                    boolean z3 = false;
                } else {
                    throw new IllegalArgumentException(c.c.a.a.a.q("Expecting menu, got ", name).toString());
                }
            }
        }
        i.s.c.h.b(asAttributeSet, "attrs");
        ArrayList arrayList22 = new ArrayList();
        int eventType22 = layout.getEventType();
        int i42 = 0;
        boolean z32 = false;
        while (!z32) {
            String name2 = layout.getName();
            if (eventType22 != i3 || !i.s.c.h.a(name2, "item")) {
                context = context2;
                str3 = str5;
                arrayList = arrayList22;
                str4 = str;
                attributeSet = asAttributeSet;
                if (eventType22 == 3 && i.s.c.h.a(name2, str4)) {
                    z32 = true;
                } else if (eventType22 == 1) {
                    throw new RuntimeException("Unexpected end of document");
                }
            } else {
                TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(asAttributeSet, c.f.a.c.a);
                int resourceId = obtainStyledAttributes.getResourceId(i3, i42);
                CharSequence text = obtainStyledAttributes.getText(3);
                i.s.c.h.b(text, "sAttr.getText(R.styleabl…ipMenuItem_android_title)");
                CharSequence text2 = obtainStyledAttributes.getText(4);
                int resourceId2 = obtainStyledAttributes.getResourceId(i42, i42);
                int i5 = z2 ? 1 : 0;
                int i6 = z2 ? 1 : 0;
                int i7 = z2 ? 1 : 0;
                boolean z4 = obtainStyledAttributes.getBoolean(i5, z2);
                i.s.c.h.b(obtainStyledAttributes, "sAttr");
                i.s.c.h.f(context2, "$this$getValueFromAttr");
                TypedValue typedValue = new TypedValue();
                context2.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, z2);
                int color = obtainStyledAttributes.getColor(6, typedValue.data);
                int i8 = obtainStyledAttributes.getInt(7, -1);
                attributeSet = asAttributeSet;
                if (i8 == 3) {
                    mode = PorterDuff.Mode.SRC_OVER;
                } else if (i8 == 5) {
                    mode = PorterDuff.Mode.SRC_IN;
                } else if (i8 != 9) {
                    switch (i8) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.ADD;
                            break;
                        default:
                            mode = null;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
                i.s.c.h.f(context2, "$this$getValueFromAttr");
                TypedValue typedValue2 = new TypedValue();
                str3 = str5;
                context2.getTheme().resolveAttribute(R.attr.colorAccent, typedValue2, z2);
                int color2 = obtainStyledAttributes.getColor(8, obtainStyledAttributes.getColor(6, typedValue2.data));
                i.s.c.h.f(context2, "$this$getValueFromAttr");
                TypedValue typedValue3 = new TypedValue();
                context2.getTheme().resolveAttribute(R.attr.colorAccent, typedValue3, z2);
                int color3 = obtainStyledAttributes.getColor(6, typedValue3.data);
                int color4 = obtainStyledAttributes.getColor(5, Color.argb((int) (((double) Color.alpha(color3)) * 0.15d), Color.red(color3), Color.green(color3), Color.blue(color3)));
                context = context2;
                arrayList = arrayList22;
                str4 = str;
                c.f.a.e.a aVar2 = new c.f.a.e.a(resourceId, text, text2, resourceId2, z4, mode, color, color2, color4, bVar);
                obtainStyledAttributes.recycle();
                arrayList.add(aVar2);
                i42 = 0;
            }
            eventType22 = layout.next();
            z2 = true;
            i3 = 2;
            arrayList22 = arrayList;
            str = str4;
            context2 = context;
            asAttributeSet = attributeSet;
            str5 = str3;
            z32 = z32;
        }
        String str6 = str5;
        i.s.c.h.f(arrayList22, "items");
        e eVar = new e(this);
        removeAllViews();
        Iterator it = arrayList22.iterator();
        while (it.hasNext()) {
            c.f.a.e.a aVar3 = (c.f.a.e.a) it.next();
            a aVar4 = this.y;
            if (aVar4 != null) {
                int ordinal = aVar4.ordinal();
                if (ordinal == 0) {
                    str2 = str6;
                    Context context3 = getContext();
                    i.s.c.h.b(context3, str2);
                    fVar = new c.f.a.g.e(context3, null, 2);
                } else if (ordinal == 1) {
                    Context context4 = getContext();
                    str2 = str6;
                    i.s.c.h.b(context4, str2);
                    fVar = new c.f.a.g.h(context4, null, 2);
                } else {
                    throw new i.e();
                }
                fVar.a(aVar3);
                fVar.setOnClickListener(new c.f.a.a(eVar));
                addView(fVar);
                str6 = str2;
            } else {
                i.s.c.h.k("orientationMode");
                throw null;
            }
        }
        a aVar5 = this.y;
        if (aVar5 != null) {
            int ordinal2 = aVar5.ordinal();
            if (ordinal2 == 0) {
                aVar = getHorizontalFlow();
            } else if (ordinal2 == 1) {
                aVar = getVerticalFlow();
            } else {
                throw new i.e();
            }
            ArrayList arrayList3 = new ArrayList(h.a.t.a.l(arrayList22, 10));
            Iterator it2 = arrayList22.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((c.f.a.e.a) it2.next()).a));
            }
            i.s.c.h.e(arrayList3, "$this$toIntArray");
            int[] iArr = new int[arrayList3.size()];
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                iArr[i42] = ((Number) it3.next()).intValue();
                i42++;
            }
            aVar.setReferencedIds(iArr);
            addView(aVar);
            return;
        }
        i.s.c.h.k("orientationMode");
        throw null;
    }

    public final void setMinimumExpandedWidth(int i2) {
        this.A = i2;
    }

    public final void setOnItemSelectedListener(b bVar) {
        i.s.c.h.f(bVar, "listener");
        this.z = bVar;
    }

    public final void setOnItemSelectedListener(l<? super Integer, m> lVar) {
        i.s.c.h.f(lVar, "block");
        setOnItemSelectedListener(new f(lVar));
    }
}
