package g.f.d;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.c.a.a.a;
import g.f.c.i.d;
import g.f.c.i.h;
import java.util.Arrays;
import java.util.HashMap;

public abstract class b extends View {
    public int[] e;

    /* renamed from: f  reason: collision with root package name */
    public int f2398f;

    /* renamed from: g  reason: collision with root package name */
    public Context f2399g;

    /* renamed from: h  reason: collision with root package name */
    public h f2400h;

    /* renamed from: i  reason: collision with root package name */
    public String f2401i;

    /* renamed from: j  reason: collision with root package name */
    public String f2402j;

    /* renamed from: k  reason: collision with root package name */
    public HashMap<Integer, String> f2403k;

    public b(Context context) {
        super(context);
        this.e = new int[32];
        this.f2403k = new HashMap<>();
        this.f2399g = context;
        f(null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new int[32];
        this.f2403k = new HashMap<>();
        this.f2399g = context;
        f(attributeSet);
    }

    public final void a(String str) {
        if (str != null && str.length() != 0 && this.f2399g != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            int i2 = 0;
            if (isInEditMode() && constraintLayout2 != null) {
                Object c2 = constraintLayout2.c(0, trim);
                if (c2 instanceof Integer) {
                    i2 = ((Integer) c2).intValue();
                }
            }
            if (i2 == 0 && constraintLayout2 != null) {
                i2 = e(constraintLayout2, trim);
            }
            if (i2 == 0) {
                try {
                    i2 = h.class.getField(trim).getInt(null);
                } catch (Exception unused) {
                }
            }
            if (i2 == 0) {
                i2 = this.f2399g.getResources().getIdentifier(trim, "id", this.f2399g.getPackageName());
            }
            if (i2 != 0) {
                this.f2403k.put(Integer.valueOf(i2), trim);
                b(i2);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void b(int i2) {
        if (i2 != getId()) {
            int i3 = this.f2398f + 1;
            int[] iArr = this.e;
            if (i3 > iArr.length) {
                this.e = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.e;
            int i4 = this.f2398f;
            iArr2[i4] = i2;
            this.f2398f = i4 + 1;
        }
    }

    public final void c(String str) {
        if (!(str == null || str.length() == 0 || this.f2399g == null)) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).U)) {
                    if (childAt.getId() == -1) {
                        StringBuilder f2 = a.f("to use ConstraintTag view ");
                        f2.append(childAt.getClass().getSimpleName());
                        f2.append(" must have an ID");
                        Log.w("ConstraintHelper", f2.toString());
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    public void d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f2398f; i2++) {
                View d2 = constraintLayout.d(this.e[i2]);
                if (d2 != null) {
                    d2.setVisibility(visibility);
                    if (elevation > 0.0f) {
                        d2.setTranslationZ(d2.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.f2399g.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void f(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2401i = string;
                    setIds(string);
                } else if (index == 20) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2402j = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void g(d dVar, boolean z) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.e, this.f2398f);
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
        if (this.f2400h != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).l0 = (d) this.f2400h;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2401i;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2402j;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f2401i = str;
        if (str != null) {
            int i2 = 0;
            this.f2398f = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    a(str.substring(i2));
                    return;
                } else {
                    a(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2402j = str;
        if (str != null) {
            int i2 = 0;
            this.f2398f = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    c(str.substring(i2));
                    return;
                } else {
                    c(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2401i = null;
        this.f2398f = 0;
        for (int i2 : iArr) {
            b(i2);
        }
    }

    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f2401i == null) {
            b(i2);
        }
    }
}
