package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import g.f.c.i.e;
import g.f.c.i.g;
import g.f.c.i.m.b;
import g.f.d.c;
import g.f.d.d;
import g.f.d.f;
import g.f.d.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class ConstraintLayout extends ViewGroup {
    public SparseArray<View> e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<g.f.d.b> f124f = new ArrayList<>(4);

    /* renamed from: g  reason: collision with root package name */
    public e f125g = new e();

    /* renamed from: h  reason: collision with root package name */
    public int f126h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f127i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f128j = Integer.MAX_VALUE;

    /* renamed from: k  reason: collision with root package name */
    public int f129k = Integer.MAX_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public boolean f130l = true;

    /* renamed from: m  reason: collision with root package name */
    public int f131m = 257;
    public d n = null;
    public c o = null;
    public int p = -1;
    public HashMap<String, Integer> q = new HashMap<>();
    public int r = -1;
    public int s = -1;
    public SparseArray<g.f.c.i.d> t = new SparseArray<>();
    public b u = new b(this);
    public int v = 0;
    public int w = 0;

    public static class a extends ViewGroup.MarginLayoutParams {
        public float A = 0.5f;
        public String B = null;
        public int C = 1;
        public float D = -1.0f;
        public float E = -1.0f;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public float N = 1.0f;
        public float O = 1.0f;
        public int P = -1;
        public int Q = -1;
        public int R = -1;
        public boolean S = false;
        public boolean T = false;
        public String U = null;
        public boolean V = true;
        public boolean W = true;
        public boolean X = false;
        public boolean Y = false;
        public boolean Z = false;
        public int a = -1;
        public boolean a0 = false;
        public int b = -1;
        public int b0 = -1;

        /* renamed from: c  reason: collision with root package name */
        public float f132c = -1.0f;
        public int c0 = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f133d = -1;
        public int d0 = -1;
        public int e = -1;
        public int e0 = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f134f = -1;
        public int f0 = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f135g = -1;
        public int g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f136h = -1;
        public float h0 = 0.5f;

        /* renamed from: i  reason: collision with root package name */
        public int f137i = -1;
        public int i0;

        /* renamed from: j  reason: collision with root package name */
        public int f138j = -1;
        public int j0;

        /* renamed from: k  reason: collision with root package name */
        public int f139k = -1;
        public float k0;

        /* renamed from: l  reason: collision with root package name */
        public int f140l = -1;
        public g.f.c.i.d l0 = new g.f.c.i.d();

        /* renamed from: m  reason: collision with root package name */
        public int f141m = -1;
        public int n = 0;
        public float o = 0.0f;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0000a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(64, 8);
                sparseIntArray.append(65, 9);
                sparseIntArray.append(67, 10);
                sparseIntArray.append(68, 11);
                sparseIntArray.append(74, 12);
                sparseIntArray.append(73, 13);
                sparseIntArray.append(46, 14);
                sparseIntArray.append(45, 15);
                sparseIntArray.append(43, 16);
                sparseIntArray.append(47, 2);
                sparseIntArray.append(49, 3);
                sparseIntArray.append(48, 4);
                sparseIntArray.append(82, 49);
                sparseIntArray.append(83, 50);
                sparseIntArray.append(53, 5);
                sparseIntArray.append(54, 6);
                sparseIntArray.append(55, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(69, 17);
                sparseIntArray.append(70, 18);
                sparseIntArray.append(52, 19);
                sparseIntArray.append(51, 20);
                sparseIntArray.append(86, 21);
                sparseIntArray.append(89, 22);
                sparseIntArray.append(87, 23);
                sparseIntArray.append(84, 24);
                sparseIntArray.append(88, 25);
                sparseIntArray.append(85, 26);
                sparseIntArray.append(60, 29);
                sparseIntArray.append(75, 30);
                sparseIntArray.append(50, 44);
                sparseIntArray.append(62, 45);
                sparseIntArray.append(77, 46);
                sparseIntArray.append(61, 47);
                sparseIntArray.append(76, 48);
                sparseIntArray.append(41, 27);
                sparseIntArray.append(40, 28);
                sparseIntArray.append(78, 31);
                sparseIntArray.append(56, 32);
                sparseIntArray.append(80, 33);
                sparseIntArray.append(79, 34);
                sparseIntArray.append(81, 35);
                sparseIntArray.append(58, 36);
                sparseIntArray.append(57, 37);
                sparseIntArray.append(59, 38);
                sparseIntArray.append(63, 39);
                sparseIntArray.append(72, 40);
                sparseIntArray.append(66, 41);
                sparseIntArray.append(44, 42);
                sparseIntArray.append(42, 43);
                sparseIntArray.append(71, 51);
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i2;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = C0000a.a.get(index);
                switch (i4) {
                    case 1:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f141m);
                        this.f141m = resourceId;
                        if (resourceId == -1) {
                            this.f141m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        continue;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f2;
                        if (f2 < 0.0f) {
                            this.o = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        continue;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        continue;
                    case 7:
                        this.f132c = obtainStyledAttributes.getFloat(index, this.f132c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f133d);
                        this.f133d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f133d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f134f);
                        this.f134f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f134f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f135g);
                        this.f135g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f135g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f136h);
                        this.f136h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f136h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f137i);
                        this.f137i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f137i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f138j);
                        this.f138j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f138j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f139k);
                        this.f139k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f139k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f140l);
                        this.f140l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f140l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        continue;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        continue;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        continue;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                    case 27:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        continue;
                    case 28:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        continue;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case 31:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.H = i5;
                        if (i5 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i6;
                        if (i6 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.J) == -2) {
                                this.J = -2;
                            }
                        }
                    case 34:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                    case 35:
                        this.N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.N));
                        this.H = 2;
                        continue;
                    case 36:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                    case 37:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                    case 38:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                    default:
                        switch (i4) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i2, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i2);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(substring4);
                                            continue;
                                            continue;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                continue;
                            case 46:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 47:
                                this.F = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                continue;
                            case 50:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 51:
                                this.U = obtainStyledAttributes.getString(index);
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.V = false;
                if (i2 == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.W = false;
                if (i3 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f132c != -1.0f || this.a != -1 || this.b != -1) {
                this.Y = true;
                this.V = true;
                this.W = true;
                if (!(this.l0 instanceof g)) {
                    this.l0 = new g();
                }
                ((g) this.l0).T(this.R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ce, code lost:
            if (r1 > 0) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00dd, code lost:
            if (r1 > 0) goto L_0x00d0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00ef  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
            // Method dump skipped, instructions count: 253
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public class b implements b.AbstractC0071b {
        public ConstraintLayout a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f142c;

        /* renamed from: d  reason: collision with root package name */
        public int f143d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f144f;

        /* renamed from: g  reason: collision with root package name */
        public int f145g;

        public b(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public final boolean a(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:118:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b5  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x01b7  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01ba  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x01e7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x01e8  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(g.f.c.i.d r18, g.f.c.i.m.b.a r19) {
            /*
            // Method dump skipped, instructions count: 732
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(g.f.c.i.d, g.f.c.i.m.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        f(attributeSet, i2, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    /* renamed from: b */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public Object c(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.q;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.q.get(str);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public View d(int i2) {
        return this.e.get(i2);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<g.f.d.b> arrayList = this.f124f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f124f.get(i2).j();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i5 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i4;
                        float f3 = (float) i5;
                        float f4 = (float) (i4 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = (float) (i5 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public final g.f.c.i.d e(View view) {
        if (view == this) {
            return this.f125g;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).l0;
    }

    public final void f(AttributeSet attributeSet, int i2, int i3) {
        e eVar = this.f125g;
        eVar.b0 = this;
        b bVar = this.u;
        eVar.o0 = bVar;
        eVar.n0.f2359f = bVar;
        this.e.put(getId(), this);
        this.n = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.b, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 9) {
                    this.f126h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f126h);
                } else if (index == 10) {
                    this.f127i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f127i);
                } else if (index == 7) {
                    this.f128j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f128j);
                } else if (index == 8) {
                    this.f129k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f129k);
                } else if (index == 90) {
                    this.f131m = obtainStyledAttributes.getInt(index, this.f131m);
                } else if (index == 39) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.o = new c(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.o = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.n = dVar;
                        dVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.n = null;
                    }
                    this.p = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f125g.c0(this.f131m);
    }

    public void forceLayout() {
        this.f130l = true;
        this.r = -1;
        this.s = -1;
        super.forceLayout();
    }

    public boolean g() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f129k;
    }

    public int getMaxWidth() {
        return this.f128j;
    }

    public int getMinHeight() {
        return this.f127i;
    }

    public int getMinWidth() {
        return this.f126h;
    }

    public int getOptimizationLevel() {
        return this.f125g.x0;
    }

    public void h(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        b bVar = this.u;
        int i6 = bVar.e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i4 + bVar.f143d, i2, 0);
        int min = Math.min(this.f128j, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f129k, ViewGroup.resolveSizeAndState(i5 + i6, i3, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.r = min;
        this.s = min2;
    }

    public void i(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.q == null) {
                this.q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x050f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j() {
        /*
        // Method dump skipped, instructions count: 1412
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.j():boolean");
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            g.f.c.i.d dVar = aVar.l0;
            if ((childAt.getVisibility() != 8 || aVar.Y || aVar.Z || isInEditMode) && !aVar.a0) {
                int u2 = dVar.u();
                int v2 = dVar.v();
                int t2 = dVar.t() + u2;
                int n2 = dVar.n() + v2;
                childAt.layout(u2, v2, t2, n2);
                if ((childAt instanceof g.f.d.g) && (content = ((g.f.d.g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(u2, v2, t2, n2);
                }
            }
        }
        int size = this.f124f.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f124f.get(i7).h();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0240 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0834  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x05b0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r28, int r29) {
        /*
        // Method dump skipped, instructions count: 2139
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        g.f.c.i.d e2 = e(view);
        if ((view instanceof Guideline) && !(e2 instanceof g)) {
            a aVar = (a) view.getLayoutParams();
            g gVar = new g();
            aVar.l0 = gVar;
            aVar.Y = true;
            gVar.T(aVar.R);
        }
        if (view instanceof g.f.d.b) {
            g.f.d.b bVar = (g.f.d.b) view;
            bVar.k();
            ((a) view.getLayoutParams()).Z = true;
            if (!this.f124f.contains(bVar)) {
                this.f124f.add(bVar);
            }
        }
        this.e.put(view.getId(), view);
        this.f130l = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.e.remove(view.getId());
        g.f.c.i.d e2 = e(view);
        this.f125g.l0.remove(e2);
        e2.D();
        this.f124f.remove(view);
        this.f130l = true;
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        this.f130l = true;
        this.r = -1;
        this.s = -1;
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.n = dVar;
    }

    public void setId(int i2) {
        this.e.remove(getId());
        super.setId(i2);
        this.e.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.f129k) {
            this.f129k = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.f128j) {
            this.f128j = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f127i) {
            this.f127i = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.f126h) {
            this.f126h = i2;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(f fVar) {
        c cVar = this.o;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f131m = i2;
        e eVar = this.f125g;
        eVar.x0 = i2;
        g.f.c.d.a = eVar.b0(512);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
