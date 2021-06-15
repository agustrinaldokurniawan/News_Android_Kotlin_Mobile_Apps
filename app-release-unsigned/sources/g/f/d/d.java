package g.f.d;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import g.f.c.g;
import g.f.d.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

public class d {
    public static final int[] a = {0, 4, 8};
    public static SparseIntArray b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, a> f2409c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2410d = true;
    public HashMap<Integer, a> e = new HashMap<>();

    public static class a {
        public int a;
        public final C0072d b = new C0072d();

        /* renamed from: c  reason: collision with root package name */
        public final c f2411c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final b f2412d = new b();
        public final e e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, a> f2413f = new HashMap<>();

        public void a(ConstraintLayout.a aVar) {
            b bVar = this.f2412d;
            aVar.f133d = bVar.f2419i;
            aVar.e = bVar.f2420j;
            aVar.f134f = bVar.f2421k;
            aVar.f135g = bVar.f2422l;
            aVar.f136h = bVar.f2423m;
            aVar.f137i = bVar.n;
            aVar.f138j = bVar.o;
            aVar.f139k = bVar.p;
            aVar.f140l = bVar.q;
            aVar.p = bVar.r;
            aVar.q = bVar.s;
            aVar.r = bVar.t;
            aVar.s = bVar.u;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.E;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.H;
            aVar.x = bVar.P;
            aVar.y = bVar.O;
            aVar.u = bVar.L;
            aVar.w = bVar.N;
            aVar.z = bVar.v;
            aVar.A = bVar.w;
            aVar.f141m = bVar.y;
            aVar.n = bVar.z;
            b bVar2 = this.f2412d;
            aVar.o = bVar2.A;
            aVar.B = bVar2.x;
            aVar.P = bVar2.B;
            aVar.Q = bVar2.C;
            aVar.E = bVar2.Q;
            aVar.D = bVar2.R;
            aVar.G = bVar2.T;
            aVar.F = bVar2.S;
            aVar.S = bVar2.i0;
            aVar.T = bVar2.j0;
            aVar.H = bVar2.U;
            aVar.I = bVar2.V;
            aVar.L = bVar2.W;
            aVar.M = bVar2.X;
            aVar.J = bVar2.Y;
            aVar.K = bVar2.Z;
            aVar.N = bVar2.a0;
            aVar.O = bVar2.b0;
            aVar.R = bVar2.D;
            aVar.f132c = bVar2.f2418h;
            aVar.a = bVar2.f2416f;
            aVar.b = bVar2.f2417g;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar2.f2415d;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar2.e;
            String str = bVar2.h0;
            if (str != null) {
                aVar.U = str;
            }
            aVar.setMarginStart(this.f2412d.J);
            aVar.setMarginEnd(this.f2412d.I);
            aVar.a();
        }

        public final void b(int i2, ConstraintLayout.a aVar) {
            this.a = i2;
            b bVar = this.f2412d;
            bVar.f2419i = aVar.f133d;
            bVar.f2420j = aVar.e;
            bVar.f2421k = aVar.f134f;
            bVar.f2422l = aVar.f135g;
            bVar.f2423m = aVar.f136h;
            bVar.n = aVar.f137i;
            bVar.o = aVar.f138j;
            bVar.p = aVar.f139k;
            bVar.q = aVar.f140l;
            bVar.r = aVar.p;
            bVar.s = aVar.q;
            bVar.t = aVar.r;
            bVar.u = aVar.s;
            bVar.v = aVar.z;
            bVar.w = aVar.A;
            bVar.x = aVar.B;
            bVar.y = aVar.f141m;
            bVar.z = aVar.n;
            bVar.A = aVar.o;
            bVar.B = aVar.P;
            bVar.C = aVar.Q;
            bVar.D = aVar.R;
            bVar.f2418h = aVar.f132c;
            bVar.f2416f = aVar.a;
            bVar.f2417g = aVar.b;
            b bVar2 = this.f2412d;
            bVar2.f2415d = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar2.e = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar2.E = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar2.F = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar2.G = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar2.Q = aVar.E;
            bVar2.R = aVar.D;
            bVar2.T = aVar.G;
            bVar2.S = aVar.F;
            bVar2.i0 = aVar.S;
            bVar2.j0 = aVar.T;
            bVar2.U = aVar.H;
            bVar2.V = aVar.I;
            bVar2.W = aVar.L;
            bVar2.X = aVar.M;
            bVar2.Y = aVar.J;
            bVar2.Z = aVar.K;
            bVar2.a0 = aVar.N;
            bVar2.b0 = aVar.O;
            bVar2.h0 = aVar.U;
            bVar2.L = aVar.u;
            bVar2.N = aVar.w;
            bVar2.K = aVar.t;
            bVar2.M = aVar.v;
            b bVar3 = this.f2412d;
            bVar3.P = aVar.x;
            bVar3.O = aVar.y;
            bVar3.I = aVar.getMarginEnd();
            this.f2412d.J = aVar.getMarginStart();
        }

        public final void c(int i2, e.a aVar) {
            b(i2, aVar);
            this.b.f2430d = aVar.m0;
            e eVar = this.e;
            eVar.f2431c = aVar.p0;
            eVar.f2432d = aVar.q0;
            eVar.e = aVar.r0;
            eVar.f2433f = aVar.s0;
            eVar.f2434g = aVar.t0;
            eVar.f2435h = aVar.u0;
            eVar.f2436i = aVar.v0;
            eVar.f2437j = aVar.w0;
            eVar.f2438k = aVar.x0;
            eVar.f2439l = aVar.y0;
            eVar.n = aVar.o0;
            eVar.f2440m = aVar.n0;
        }

        public Object clone() {
            a aVar = new a();
            b bVar = aVar.f2412d;
            b bVar2 = this.f2412d;
            Objects.requireNonNull(bVar);
            bVar.b = bVar2.b;
            bVar.f2415d = bVar2.f2415d;
            bVar.f2414c = bVar2.f2414c;
            bVar.e = bVar2.e;
            bVar.f2416f = bVar2.f2416f;
            bVar.f2417g = bVar2.f2417g;
            bVar.f2418h = bVar2.f2418h;
            bVar.f2419i = bVar2.f2419i;
            bVar.f2420j = bVar2.f2420j;
            bVar.f2421k = bVar2.f2421k;
            bVar.f2422l = bVar2.f2422l;
            bVar.f2423m = bVar2.f2423m;
            bVar.n = bVar2.n;
            bVar.o = bVar2.o;
            bVar.p = bVar2.p;
            bVar.q = bVar2.q;
            bVar.r = bVar2.r;
            bVar.s = bVar2.s;
            bVar.t = bVar2.t;
            bVar.u = bVar2.u;
            bVar.v = bVar2.v;
            bVar.w = bVar2.w;
            bVar.x = bVar2.x;
            bVar.y = bVar2.y;
            bVar.z = bVar2.z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.a0 = bVar2.a0;
            bVar.b0 = bVar2.b0;
            bVar.c0 = bVar2.c0;
            bVar.d0 = bVar2.d0;
            bVar.e0 = bVar2.e0;
            bVar.h0 = bVar2.h0;
            int[] iArr = bVar2.f0;
            if (iArr != null) {
                bVar.f0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.f0 = null;
            }
            bVar.g0 = bVar2.g0;
            bVar.i0 = bVar2.i0;
            bVar.j0 = bVar2.j0;
            bVar.k0 = bVar2.k0;
            c cVar = aVar.f2411c;
            c cVar2 = this.f2411c;
            Objects.requireNonNull(cVar);
            cVar.b = cVar2.b;
            cVar.f2424c = cVar2.f2424c;
            cVar.f2425d = cVar2.f2425d;
            cVar.e = cVar2.e;
            cVar.f2426f = cVar2.f2426f;
            cVar.f2428h = cVar2.f2428h;
            cVar.f2427g = cVar2.f2427g;
            C0072d dVar = aVar.b;
            C0072d dVar2 = this.b;
            Objects.requireNonNull(dVar);
            dVar.a = dVar2.a;
            dVar.b = dVar2.b;
            dVar.f2430d = dVar2.f2430d;
            dVar.e = dVar2.e;
            dVar.f2429c = dVar2.f2429c;
            e eVar = aVar.e;
            e eVar2 = this.e;
            Objects.requireNonNull(eVar);
            eVar.b = eVar2.b;
            eVar.f2431c = eVar2.f2431c;
            eVar.f2432d = eVar2.f2432d;
            eVar.e = eVar2.e;
            eVar.f2433f = eVar2.f2433f;
            eVar.f2434g = eVar2.f2434g;
            eVar.f2435h = eVar2.f2435h;
            eVar.f2436i = eVar2.f2436i;
            eVar.f2437j = eVar2.f2437j;
            eVar.f2438k = eVar2.f2438k;
            eVar.f2439l = eVar2.f2439l;
            eVar.f2440m = eVar2.f2440m;
            eVar.n = eVar2.n;
            aVar.a = this.a;
            return aVar;
        }
    }

    public static class b {
        public static SparseIntArray a;
        public float A = 0.0f;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public int P = -1;
        public float Q = -1.0f;
        public float R = -1.0f;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = 0;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public int Z = -1;
        public float a0 = 1.0f;
        public boolean b = false;
        public float b0 = 1.0f;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2414c = false;
        public int c0 = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f2415d;
        public int d0 = 0;
        public int e;
        public int e0 = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2416f = -1;
        public int[] f0;

        /* renamed from: g  reason: collision with root package name */
        public int f2417g = -1;
        public String g0;

        /* renamed from: h  reason: collision with root package name */
        public float f2418h = -1.0f;
        public String h0;

        /* renamed from: i  reason: collision with root package name */
        public int f2419i = -1;
        public boolean i0 = false;

        /* renamed from: j  reason: collision with root package name */
        public int f2420j = -1;
        public boolean j0 = false;

        /* renamed from: k  reason: collision with root package name */
        public int f2421k = -1;
        public boolean k0 = true;

        /* renamed from: l  reason: collision with root package name */
        public int f2422l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f2423m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public float v = 0.5f;
        public float w = 0.5f;
        public String x = null;
        public int y = -1;
        public int z = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(39, 24);
            a.append(40, 25);
            a.append(42, 28);
            a.append(43, 29);
            a.append(48, 35);
            a.append(47, 34);
            a.append(21, 4);
            a.append(20, 3);
            a.append(18, 1);
            a.append(56, 6);
            a.append(57, 7);
            a.append(28, 17);
            a.append(29, 18);
            a.append(30, 19);
            a.append(0, 26);
            a.append(44, 31);
            a.append(45, 32);
            a.append(27, 10);
            a.append(26, 9);
            a.append(60, 13);
            a.append(63, 16);
            a.append(61, 14);
            a.append(58, 11);
            a.append(62, 15);
            a.append(59, 12);
            a.append(51, 38);
            a.append(37, 37);
            a.append(36, 39);
            a.append(50, 40);
            a.append(35, 20);
            a.append(49, 36);
            a.append(25, 5);
            a.append(38, 76);
            a.append(46, 76);
            a.append(41, 76);
            a.append(19, 76);
            a.append(17, 76);
            a.append(3, 23);
            a.append(5, 27);
            a.append(7, 30);
            a.append(8, 8);
            a.append(4, 33);
            a.append(6, 2);
            a.append(1, 22);
            a.append(2, 21);
            a.append(22, 61);
            a.append(24, 62);
            a.append(23, 63);
            a.append(55, 69);
            a.append(34, 70);
            a.append(12, 71);
            a.append(10, 72);
            a.append(11, 73);
            a.append(13, 74);
            a.append(9, 75);
        }

        public void a(Context context, AttributeSet attributeSet) {
            String str;
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.e);
            this.f2414c = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = a.get(index);
                if (i3 == 80) {
                    this.i0 = obtainStyledAttributes.getBoolean(index, this.i0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            int i4 = this.q;
                            int[] iArr = d.a;
                            int resourceId = obtainStyledAttributes.getResourceId(index, i4);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.q = resourceId;
                            continue;
                        case 2:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            continue;
                        case 3:
                            int i5 = this.p;
                            int[] iArr2 = d.a;
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, i5);
                            if (resourceId2 == -1) {
                                resourceId2 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.p = resourceId2;
                            continue;
                        case 4:
                            int i6 = this.o;
                            int[] iArr3 = d.a;
                            int resourceId3 = obtainStyledAttributes.getResourceId(index, i6);
                            if (resourceId3 == -1) {
                                resourceId3 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.o = resourceId3;
                            continue;
                        case 5:
                            this.x = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            continue;
                        case 7:
                            this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                            continue;
                        case 8:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            continue;
                        case 9:
                            int i7 = this.u;
                            int[] iArr4 = d.a;
                            int resourceId4 = obtainStyledAttributes.getResourceId(index, i7);
                            if (resourceId4 == -1) {
                                resourceId4 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.u = resourceId4;
                            continue;
                        case 10:
                            int i8 = this.t;
                            int[] iArr5 = d.a;
                            int resourceId5 = obtainStyledAttributes.getResourceId(index, i8);
                            if (resourceId5 == -1) {
                                resourceId5 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.t = resourceId5;
                            continue;
                        case 11:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        case 12:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        case 13:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        case 14:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        case 15:
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            continue;
                        case 16:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        case 17:
                            this.f2416f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2416f);
                            continue;
                        case 18:
                            this.f2417g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2417g);
                            continue;
                        case 19:
                            this.f2418h = obtainStyledAttributes.getFloat(index, this.f2418h);
                            continue;
                        case 20:
                            this.v = obtainStyledAttributes.getFloat(index, this.v);
                            continue;
                        case 21:
                            this.e = obtainStyledAttributes.getLayoutDimension(index, this.e);
                            continue;
                        case 22:
                            this.f2415d = obtainStyledAttributes.getLayoutDimension(index, this.f2415d);
                            continue;
                        case 23:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            continue;
                        case 24:
                            int i9 = this.f2419i;
                            int[] iArr6 = d.a;
                            int resourceId6 = obtainStyledAttributes.getResourceId(index, i9);
                            if (resourceId6 == -1) {
                                resourceId6 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f2419i = resourceId6;
                            continue;
                        case 25:
                            int i10 = this.f2420j;
                            int[] iArr7 = d.a;
                            int resourceId7 = obtainStyledAttributes.getResourceId(index, i10);
                            if (resourceId7 == -1) {
                                resourceId7 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f2420j = resourceId7;
                            continue;
                        case 26:
                            this.D = obtainStyledAttributes.getInt(index, this.D);
                            continue;
                        case 27:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            continue;
                        case 28:
                            int i11 = this.f2421k;
                            int[] iArr8 = d.a;
                            int resourceId8 = obtainStyledAttributes.getResourceId(index, i11);
                            if (resourceId8 == -1) {
                                resourceId8 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f2421k = resourceId8;
                            continue;
                        case 29:
                            int i12 = this.f2422l;
                            int[] iArr9 = d.a;
                            int resourceId9 = obtainStyledAttributes.getResourceId(index, i12);
                            if (resourceId9 == -1) {
                                resourceId9 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f2422l = resourceId9;
                            continue;
                        case 30:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        case 31:
                            int i13 = this.r;
                            int[] iArr10 = d.a;
                            int resourceId10 = obtainStyledAttributes.getResourceId(index, i13);
                            if (resourceId10 == -1) {
                                resourceId10 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.r = resourceId10;
                            continue;
                        case 32:
                            int i14 = this.s;
                            int[] iArr11 = d.a;
                            int resourceId11 = obtainStyledAttributes.getResourceId(index, i14);
                            if (resourceId11 == -1) {
                                resourceId11 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.s = resourceId11;
                            continue;
                        case 33:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            continue;
                        case 34:
                            int i15 = this.n;
                            int[] iArr12 = d.a;
                            int resourceId12 = obtainStyledAttributes.getResourceId(index, i15);
                            if (resourceId12 == -1) {
                                resourceId12 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.n = resourceId12;
                            continue;
                        case 35:
                            int i16 = this.f2423m;
                            int[] iArr13 = d.a;
                            int resourceId13 = obtainStyledAttributes.getResourceId(index, i16);
                            if (resourceId13 == -1) {
                                resourceId13 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f2423m = resourceId13;
                            continue;
                        case 36:
                            this.w = obtainStyledAttributes.getFloat(index, this.w);
                            continue;
                        case 37:
                            this.R = obtainStyledAttributes.getFloat(index, this.R);
                            continue;
                        case 38:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            continue;
                        case 39:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            continue;
                        case 40:
                            this.T = obtainStyledAttributes.getInt(index, this.T);
                            continue;
                        default:
                            switch (i3) {
                                case 54:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    continue;
                                case 55:
                                    this.V = obtainStyledAttributes.getInt(index, this.V);
                                    continue;
                                case 56:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    continue;
                                case 57:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    continue;
                                case 58:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    continue;
                                case 59:
                                    this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    continue;
                                    continue;
                                default:
                                    switch (i3) {
                                        case 61:
                                            int i17 = this.y;
                                            int[] iArr14 = d.a;
                                            int resourceId14 = obtainStyledAttributes.getResourceId(index, i17);
                                            if (resourceId14 == -1) {
                                                resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                            }
                                            this.y = resourceId14;
                                            continue;
                                        case 62:
                                            this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                                            continue;
                                        case 63:
                                            this.A = obtainStyledAttributes.getFloat(index, this.A);
                                            continue;
                                            continue;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.b0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.c0 = obtainStyledAttributes.getInt(index, this.c0);
                                                    break;
                                                case 73:
                                                    this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                                    break;
                                                case 74:
                                                    this.g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.k0 = obtainStyledAttributes.getBoolean(index, this.k0);
                                                    break;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(a.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    break;
                                                case 77:
                                                    this.h0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(a.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.j0 = obtainStyledAttributes.getBoolean(index, this.j0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {
        public static SparseIntArray a;
        public boolean b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f2424c = -1;

        /* renamed from: d  reason: collision with root package name */
        public String f2425d = null;
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2426f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f2427g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f2428h = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(2, 1);
            a.append(4, 2);
            a.append(5, 3);
            a.append(1, 4);
            a.append(0, 5);
            a.append(3, 6);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2445f);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.f2428h = obtainStyledAttributes.getFloat(index, this.f2428h);
                        break;
                    case 2:
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        this.f2425d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : g.f.b.a.a.a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f2426f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i3 = this.f2424c;
                        int[] iArr = d.a;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2424c = resourceId;
                        break;
                    case 6:
                        this.f2427g = obtainStyledAttributes.getFloat(index, this.f2427g);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: g.f.d.d$d  reason: collision with other inner class name */
    public static class C0072d {
        public boolean a = false;
        public int b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2429c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f2430d = 1.0f;
        public float e = Float.NaN;

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2446g);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.f2430d = obtainStyledAttributes.getFloat(index, this.f2430d);
                } else if (index == 0) {
                    int i3 = obtainStyledAttributes.getInt(index, this.b);
                    this.b = i3;
                    int[] iArr = d.a;
                    this.b = d.a[i3];
                } else if (index == 4) {
                    this.f2429c = obtainStyledAttributes.getInt(index, this.f2429c);
                } else if (index == 3) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {
        public static SparseIntArray a;
        public boolean b = false;

        /* renamed from: c  reason: collision with root package name */
        public float f2431c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f2432d = 0.0f;
        public float e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f2433f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f2434g = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f2435h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f2436i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f2437j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f2438k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f2439l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2440m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(6, 1);
            a.append(7, 2);
            a.append(8, 3);
            a.append(4, 4);
            a.append(5, 5);
            a.append(0, 6);
            a.append(1, 7);
            a.append(2, 8);
            a.append(3, 9);
            a.append(9, 10);
            a.append(10, 11);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2448i);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.f2431c = obtainStyledAttributes.getFloat(index, this.f2431c);
                        break;
                    case 2:
                        this.f2432d = obtainStyledAttributes.getFloat(index, this.f2432d);
                        break;
                    case 3:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 4:
                        this.f2433f = obtainStyledAttributes.getFloat(index, this.f2433f);
                        break;
                    case 5:
                        this.f2434g = obtainStyledAttributes.getFloat(index, this.f2434g);
                        break;
                    case 6:
                        this.f2435h = obtainStyledAttributes.getDimension(index, this.f2435h);
                        break;
                    case 7:
                        this.f2436i = obtainStyledAttributes.getDimension(index, this.f2436i);
                        break;
                    case 8:
                        this.f2437j = obtainStyledAttributes.getDimension(index, this.f2437j);
                        break;
                    case 9:
                        this.f2438k = obtainStyledAttributes.getDimension(index, this.f2438k);
                        break;
                    case 10:
                        this.f2439l = obtainStyledAttributes.getDimension(index, this.f2439l);
                        break;
                    case 11:
                        this.f2440m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        sparseIntArray.append(77, 25);
        b.append(78, 26);
        b.append(80, 29);
        b.append(81, 30);
        b.append(87, 36);
        b.append(86, 35);
        b.append(59, 4);
        b.append(58, 3);
        b.append(56, 1);
        b.append(95, 6);
        b.append(96, 7);
        b.append(66, 17);
        b.append(67, 18);
        b.append(68, 19);
        b.append(0, 27);
        b.append(82, 32);
        b.append(83, 33);
        b.append(65, 10);
        b.append(64, 9);
        b.append(99, 13);
        b.append(102, 16);
        b.append(100, 14);
        b.append(97, 11);
        b.append(101, 15);
        b.append(98, 12);
        b.append(90, 40);
        b.append(75, 39);
        b.append(74, 41);
        b.append(89, 42);
        b.append(73, 20);
        b.append(88, 37);
        b.append(63, 5);
        b.append(76, 82);
        b.append(85, 82);
        b.append(79, 82);
        b.append(57, 82);
        b.append(55, 82);
        b.append(5, 24);
        b.append(7, 28);
        b.append(23, 31);
        b.append(24, 8);
        b.append(6, 34);
        b.append(8, 2);
        b.append(3, 23);
        b.append(4, 21);
        b.append(2, 22);
        b.append(13, 43);
        b.append(26, 44);
        b.append(21, 45);
        b.append(22, 46);
        b.append(20, 60);
        b.append(18, 47);
        b.append(19, 48);
        b.append(14, 49);
        b.append(15, 50);
        b.append(16, 51);
        b.append(17, 52);
        b.append(25, 53);
        b.append(91, 54);
        b.append(69, 55);
        b.append(92, 56);
        b.append(70, 57);
        b.append(93, 58);
        b.append(71, 59);
        b.append(60, 61);
        b.append(62, 62);
        b.append(61, 63);
        b.append(27, 64);
        b.append(107, 65);
        b.append(34, 66);
        b.append(108, 67);
        b.append(104, 79);
        b.append(1, 38);
        b.append(103, 68);
        b.append(94, 69);
        b.append(72, 70);
        b.append(31, 71);
        b.append(29, 72);
        b.append(30, 73);
        b.append(32, 74);
        b.append(28, 75);
        b.append(105, 76);
        b.append(84, 77);
        b.append(109, 78);
        b.append(54, 80);
        b.append(53, 81);
    }

    public void a(ConstraintLayout constraintLayout, boolean z) {
        int i2;
        Iterator<String> it;
        NoSuchMethodException e2;
        IllegalAccessException e3;
        InvocationTargetException e4;
        String str;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.e.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!this.e.containsKey(Integer.valueOf(id))) {
                StringBuilder f2 = c.c.a.a.a.f("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                f2.append(str);
                Log.w("ConstraintSet", f2.toString());
            } else if (this.f2410d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.e.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f2412d.e0 = 1;
                    }
                    int i4 = aVar.f2412d.e0;
                    if (i4 != -1 && i4 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f2412d.c0);
                        barrier.setMargin(aVar.f2412d.d0);
                        barrier.setAllowsGoneWidget(aVar.f2412d.k0);
                        b bVar = aVar.f2412d;
                        int[] iArr = bVar.f0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str2 = bVar.g0;
                            if (str2 != null) {
                                bVar.f0 = c(barrier, str2);
                                barrier.setReferencedIds(aVar.f2412d.f0);
                            }
                        }
                    }
                    ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                    aVar2.a();
                    aVar.a(aVar2);
                    if (z) {
                        HashMap<String, a> hashMap = aVar.f2413f;
                        Class<?> cls = childAt.getClass();
                        Iterator<String> it2 = hashMap.keySet().iterator();
                        while (it2.hasNext()) {
                            String next = it2.next();
                            a aVar3 = hashMap.get(next);
                            String q = c.c.a.a.a.q("set", next);
                            try {
                                switch (g.f(aVar3.b)) {
                                    case 0:
                                        it = it2;
                                        cls.getMethod(q, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar3.f2394c));
                                        break;
                                    case 1:
                                        it = it2;
                                        cls.getMethod(q, Float.TYPE).invoke(childAt, Float.valueOf(aVar3.f2395d));
                                        break;
                                    case 2:
                                        it = it2;
                                        cls.getMethod(q, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar3.f2397g));
                                        break;
                                    case 3:
                                        it = it2;
                                        Method method = cls.getMethod(q, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(aVar3.f2397g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        it = it2;
                                        cls.getMethod(q, CharSequence.class).invoke(childAt, aVar3.e);
                                        break;
                                    case 5:
                                        it = it2;
                                        cls.getMethod(q, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar3.f2396f));
                                        break;
                                    case 6:
                                        it = it2;
                                        try {
                                            cls.getMethod(q, Float.TYPE).invoke(childAt, Float.valueOf(aVar3.f2395d));
                                        } catch (NoSuchMethodException e5) {
                                            e2 = e5;
                                            Log.e("TransitionLayout", e2.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(cls.getName());
                                            sb.append(" must have a method ");
                                            sb.append(q);
                                            Log.e("TransitionLayout", sb.toString());
                                            childCount = childCount;
                                            hashMap = hashMap;
                                            it2 = it;
                                        } catch (IllegalAccessException e6) {
                                            e3 = e6;
                                            StringBuilder i5 = c.c.a.a.a.i(" Custom Attribute \"", next, "\" not found on ");
                                            i5.append(cls.getName());
                                            Log.e("TransitionLayout", i5.toString());
                                            e3.printStackTrace();
                                            childCount = childCount;
                                            hashMap = hashMap;
                                            it2 = it;
                                        } catch (InvocationTargetException e7) {
                                            e4 = e7;
                                            StringBuilder i6 = c.c.a.a.a.i(" Custom Attribute \"", next, "\" not found on ");
                                            i6.append(cls.getName());
                                            Log.e("TransitionLayout", i6.toString());
                                            e4.printStackTrace();
                                            childCount = childCount;
                                            hashMap = hashMap;
                                            it2 = it;
                                        }
                                    default:
                                        it = it2;
                                        break;
                                }
                            } catch (NoSuchMethodException e8) {
                                e2 = e8;
                                it = it2;
                                Log.e("TransitionLayout", e2.getMessage());
                                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(cls.getName());
                                sb2.append(" must have a method ");
                                sb2.append(q);
                                Log.e("TransitionLayout", sb2.toString());
                                childCount = childCount;
                                hashMap = hashMap;
                                it2 = it;
                            } catch (IllegalAccessException e9) {
                                e3 = e9;
                                it = it2;
                                StringBuilder i52 = c.c.a.a.a.i(" Custom Attribute \"", next, "\" not found on ");
                                i52.append(cls.getName());
                                Log.e("TransitionLayout", i52.toString());
                                e3.printStackTrace();
                                childCount = childCount;
                                hashMap = hashMap;
                                it2 = it;
                            } catch (InvocationTargetException e10) {
                                e4 = e10;
                                it = it2;
                                StringBuilder i62 = c.c.a.a.a.i(" Custom Attribute \"", next, "\" not found on ");
                                i62.append(cls.getName());
                                Log.e("TransitionLayout", i62.toString());
                                e4.printStackTrace();
                                childCount = childCount;
                                hashMap = hashMap;
                                it2 = it;
                            }
                            childCount = childCount;
                            hashMap = hashMap;
                            it2 = it;
                        }
                    }
                    i2 = childCount;
                    childAt.setLayoutParams(aVar2);
                    C0072d dVar = aVar.b;
                    if (dVar.f2429c == 0) {
                        childAt.setVisibility(dVar.b);
                    }
                    childAt.setAlpha(aVar.b.f2430d);
                    childAt.setRotation(aVar.e.f2431c);
                    childAt.setRotationX(aVar.e.f2432d);
                    childAt.setRotationY(aVar.e.e);
                    childAt.setScaleX(aVar.e.f2433f);
                    childAt.setScaleY(aVar.e.f2434g);
                    if (!Float.isNaN(aVar.e.f2435h)) {
                        childAt.setPivotX(aVar.e.f2435h);
                    }
                    if (!Float.isNaN(aVar.e.f2436i)) {
                        childAt.setPivotY(aVar.e.f2436i);
                    }
                    childAt.setTranslationX(aVar.e.f2437j);
                    childAt.setTranslationY(aVar.e.f2438k);
                    childAt.setTranslationZ(aVar.e.f2439l);
                    e eVar = aVar.e;
                    if (eVar.f2440m) {
                        childAt.setElevation(eVar.n);
                    }
                } else {
                    i2 = childCount;
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
                i3++;
                childCount = i2;
            }
            i2 = childCount;
            i3++;
            childCount = i2;
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Integer num = (Integer) it3.next();
            a aVar4 = this.e.get(num);
            int i7 = aVar4.f2412d.e0;
            if (i7 != -1 && i7 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar2 = aVar4.f2412d;
                int[] iArr2 = bVar2.f0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str3 = bVar2.g0;
                    if (str3 != null) {
                        bVar2.f0 = c(barrier2, str3);
                        barrier2.setReferencedIds(aVar4.f2412d.f0);
                    }
                }
                barrier2.setType(aVar4.f2412d.c0);
                barrier2.setMargin(aVar4.f2412d.d0);
                ConstraintLayout.a b2 = constraintLayout.generateDefaultLayoutParams();
                barrier2.k();
                aVar4.a(b2);
                constraintLayout.addView(barrier2, b2);
            }
            if (aVar4.f2412d.b) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.a b3 = constraintLayout.generateDefaultLayoutParams();
                aVar4.a(b3);
                constraintLayout.addView(guideline, b3);
            }
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        NoSuchMethodException e2;
        IllegalAccessException e3;
        InvocationTargetException e4;
        a aVar;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        dVar.e.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!dVar.f2410d || id != -1) {
                if (!dVar.e.containsKey(Integer.valueOf(id))) {
                    dVar.e.put(Integer.valueOf(id), new a());
                }
                a aVar3 = dVar.e.get(Integer.valueOf(id));
                HashMap<String, a> hashMap = dVar.f2409c;
                HashMap<String, a> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    a aVar4 = hashMap.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            aVar = new a(aVar4, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        } else {
                            try {
                                aVar = new a(aVar4, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (NoSuchMethodException e5) {
                                e2 = e5;
                                e2.printStackTrace();
                            } catch (IllegalAccessException e6) {
                                e3 = e6;
                                e3.printStackTrace();
                            } catch (InvocationTargetException e7) {
                                e4 = e7;
                                e4.printStackTrace();
                            }
                        }
                        hashMap2.put(str, aVar);
                    } catch (NoSuchMethodException e8) {
                        e2 = e8;
                        e2.printStackTrace();
                    } catch (IllegalAccessException e9) {
                        e3 = e9;
                        e3.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e4 = e10;
                        e4.printStackTrace();
                    }
                }
                aVar3.f2413f = hashMap2;
                aVar3.b(id, aVar2);
                aVar3.b.b = childAt.getVisibility();
                aVar3.b.f2430d = childAt.getAlpha();
                aVar3.e.f2431c = childAt.getRotation();
                aVar3.e.f2432d = childAt.getRotationX();
                aVar3.e.e = childAt.getRotationY();
                aVar3.e.f2433f = childAt.getScaleX();
                aVar3.e.f2434g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    e eVar = aVar3.e;
                    eVar.f2435h = pivotX;
                    eVar.f2436i = pivotY;
                }
                aVar3.e.f2437j = childAt.getTranslationX();
                aVar3.e.f2438k = childAt.getTranslationY();
                aVar3.e.f2439l = childAt.getTranslationZ();
                e eVar2 = aVar3.e;
                if (eVar2.f2440m) {
                    eVar2.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    b bVar = aVar3.f2412d;
                    bVar.k0 = barrier.n.o0;
                    bVar.f0 = barrier.getReferencedIds();
                    aVar3.f2412d.c0 = barrier.getType();
                    aVar3.f2412d.d0 = barrier.getMargin();
                }
                i2++;
                dVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final int[] c(View view, String str) {
        int i2;
        Object c2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i2 = ((Integer) c2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public final a d(Context context, AttributeSet attributeSet) {
        String str;
        StringBuilder sb;
        c cVar;
        String str2;
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (!(index == 1 || 23 == index || 24 == index)) {
                aVar.f2411c.b = true;
                aVar.f2412d.f2414c = true;
                aVar.b.a = true;
                aVar.e.b = true;
            }
            switch (b.get(index)) {
                case 1:
                    b bVar = aVar.f2412d;
                    int resourceId = obtainStyledAttributes.getResourceId(index, bVar.q);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar.q = resourceId;
                    continue;
                case 2:
                    b bVar2 = aVar.f2412d;
                    bVar2.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar2.H);
                    continue;
                case 3:
                    b bVar3 = aVar.f2412d;
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, bVar3.p);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar3.p = resourceId2;
                    continue;
                case 4:
                    b bVar4 = aVar.f2412d;
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, bVar4.o);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar4.o = resourceId3;
                    continue;
                case 5:
                    aVar.f2412d.x = obtainStyledAttributes.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f2412d;
                    bVar5.B = obtainStyledAttributes.getDimensionPixelOffset(index, bVar5.B);
                    continue;
                case 7:
                    b bVar6 = aVar.f2412d;
                    bVar6.C = obtainStyledAttributes.getDimensionPixelOffset(index, bVar6.C);
                    continue;
                case 8:
                    b bVar7 = aVar.f2412d;
                    bVar7.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar7.I);
                    continue;
                case 9:
                    b bVar8 = aVar.f2412d;
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, bVar8.u);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar8.u = resourceId4;
                    continue;
                case 10:
                    b bVar9 = aVar.f2412d;
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, bVar9.t);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar9.t = resourceId5;
                    continue;
                case 11:
                    b bVar10 = aVar.f2412d;
                    bVar10.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar10.N);
                    continue;
                case 12:
                    b bVar11 = aVar.f2412d;
                    bVar11.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar11.O);
                    continue;
                case 13:
                    b bVar12 = aVar.f2412d;
                    bVar12.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar12.K);
                    continue;
                case 14:
                    b bVar13 = aVar.f2412d;
                    bVar13.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar13.M);
                    continue;
                case 15:
                    b bVar14 = aVar.f2412d;
                    bVar14.P = obtainStyledAttributes.getDimensionPixelSize(index, bVar14.P);
                    continue;
                case 16:
                    b bVar15 = aVar.f2412d;
                    bVar15.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar15.L);
                    continue;
                case 17:
                    b bVar16 = aVar.f2412d;
                    bVar16.f2416f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f2416f);
                    continue;
                case 18:
                    b bVar17 = aVar.f2412d;
                    bVar17.f2417g = obtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f2417g);
                    continue;
                case 19:
                    b bVar18 = aVar.f2412d;
                    bVar18.f2418h = obtainStyledAttributes.getFloat(index, bVar18.f2418h);
                    continue;
                case 20:
                    b bVar19 = aVar.f2412d;
                    bVar19.v = obtainStyledAttributes.getFloat(index, bVar19.v);
                    continue;
                case 21:
                    b bVar20 = aVar.f2412d;
                    bVar20.e = obtainStyledAttributes.getLayoutDimension(index, bVar20.e);
                    continue;
                case 22:
                    C0072d dVar = aVar.b;
                    dVar.b = obtainStyledAttributes.getInt(index, dVar.b);
                    C0072d dVar2 = aVar.b;
                    dVar2.b = a[dVar2.b];
                    continue;
                case 23:
                    b bVar21 = aVar.f2412d;
                    bVar21.f2415d = obtainStyledAttributes.getLayoutDimension(index, bVar21.f2415d);
                    continue;
                case 24:
                    b bVar22 = aVar.f2412d;
                    bVar22.E = obtainStyledAttributes.getDimensionPixelSize(index, bVar22.E);
                    continue;
                case 25:
                    b bVar23 = aVar.f2412d;
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, bVar23.f2419i);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar23.f2419i = resourceId6;
                    continue;
                case 26:
                    b bVar24 = aVar.f2412d;
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, bVar24.f2420j);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar24.f2420j = resourceId7;
                    continue;
                case 27:
                    b bVar25 = aVar.f2412d;
                    bVar25.D = obtainStyledAttributes.getInt(index, bVar25.D);
                    continue;
                case 28:
                    b bVar26 = aVar.f2412d;
                    bVar26.F = obtainStyledAttributes.getDimensionPixelSize(index, bVar26.F);
                    continue;
                case 29:
                    b bVar27 = aVar.f2412d;
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, bVar27.f2421k);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar27.f2421k = resourceId8;
                    continue;
                case 30:
                    b bVar28 = aVar.f2412d;
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, bVar28.f2422l);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar28.f2422l = resourceId9;
                    continue;
                case 31:
                    b bVar29 = aVar.f2412d;
                    bVar29.J = obtainStyledAttributes.getDimensionPixelSize(index, bVar29.J);
                    continue;
                case 32:
                    b bVar30 = aVar.f2412d;
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, bVar30.r);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar30.r = resourceId10;
                    continue;
                case 33:
                    b bVar31 = aVar.f2412d;
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, bVar31.s);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar31.s = resourceId11;
                    continue;
                case 34:
                    b bVar32 = aVar.f2412d;
                    bVar32.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar32.G);
                    continue;
                case 35:
                    b bVar33 = aVar.f2412d;
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, bVar33.n);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar33.n = resourceId12;
                    continue;
                case 36:
                    b bVar34 = aVar.f2412d;
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, bVar34.f2423m);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar34.f2423m = resourceId13;
                    continue;
                case 37:
                    b bVar35 = aVar.f2412d;
                    bVar35.w = obtainStyledAttributes.getFloat(index, bVar35.w);
                    continue;
                case 38:
                    aVar.a = obtainStyledAttributes.getResourceId(index, aVar.a);
                    continue;
                case 39:
                    b bVar36 = aVar.f2412d;
                    bVar36.R = obtainStyledAttributes.getFloat(index, bVar36.R);
                    continue;
                case 40:
                    b bVar37 = aVar.f2412d;
                    bVar37.Q = obtainStyledAttributes.getFloat(index, bVar37.Q);
                    continue;
                case 41:
                    b bVar38 = aVar.f2412d;
                    bVar38.S = obtainStyledAttributes.getInt(index, bVar38.S);
                    continue;
                case 42:
                    b bVar39 = aVar.f2412d;
                    bVar39.T = obtainStyledAttributes.getInt(index, bVar39.T);
                    continue;
                case 43:
                    C0072d dVar3 = aVar.b;
                    dVar3.f2430d = obtainStyledAttributes.getFloat(index, dVar3.f2430d);
                    continue;
                case 44:
                    e eVar = aVar.e;
                    eVar.f2440m = true;
                    eVar.n = obtainStyledAttributes.getDimension(index, eVar.n);
                    continue;
                case 45:
                    e eVar2 = aVar.e;
                    eVar2.f2432d = obtainStyledAttributes.getFloat(index, eVar2.f2432d);
                    continue;
                case 46:
                    e eVar3 = aVar.e;
                    eVar3.e = obtainStyledAttributes.getFloat(index, eVar3.e);
                    continue;
                case 47:
                    e eVar4 = aVar.e;
                    eVar4.f2433f = obtainStyledAttributes.getFloat(index, eVar4.f2433f);
                    continue;
                case 48:
                    e eVar5 = aVar.e;
                    eVar5.f2434g = obtainStyledAttributes.getFloat(index, eVar5.f2434g);
                    continue;
                case 49:
                    e eVar6 = aVar.e;
                    eVar6.f2435h = obtainStyledAttributes.getDimension(index, eVar6.f2435h);
                    continue;
                case 50:
                    e eVar7 = aVar.e;
                    eVar7.f2436i = obtainStyledAttributes.getDimension(index, eVar7.f2436i);
                    continue;
                case 51:
                    e eVar8 = aVar.e;
                    eVar8.f2437j = obtainStyledAttributes.getDimension(index, eVar8.f2437j);
                    continue;
                case 52:
                    e eVar9 = aVar.e;
                    eVar9.f2438k = obtainStyledAttributes.getDimension(index, eVar9.f2438k);
                    continue;
                case 53:
                    e eVar10 = aVar.e;
                    eVar10.f2439l = obtainStyledAttributes.getDimension(index, eVar10.f2439l);
                    continue;
                case 54:
                    b bVar40 = aVar.f2412d;
                    bVar40.U = obtainStyledAttributes.getInt(index, bVar40.U);
                    continue;
                case 55:
                    b bVar41 = aVar.f2412d;
                    bVar41.V = obtainStyledAttributes.getInt(index, bVar41.V);
                    continue;
                case 56:
                    b bVar42 = aVar.f2412d;
                    bVar42.W = obtainStyledAttributes.getDimensionPixelSize(index, bVar42.W);
                    continue;
                case 57:
                    b bVar43 = aVar.f2412d;
                    bVar43.X = obtainStyledAttributes.getDimensionPixelSize(index, bVar43.X);
                    continue;
                case 58:
                    b bVar44 = aVar.f2412d;
                    bVar44.Y = obtainStyledAttributes.getDimensionPixelSize(index, bVar44.Y);
                    continue;
                case 59:
                    b bVar45 = aVar.f2412d;
                    bVar45.Z = obtainStyledAttributes.getDimensionPixelSize(index, bVar45.Z);
                    continue;
                case 60:
                    e eVar11 = aVar.e;
                    eVar11.f2431c = obtainStyledAttributes.getFloat(index, eVar11.f2431c);
                    continue;
                case 61:
                    b bVar46 = aVar.f2412d;
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, bVar46.y);
                    if (resourceId14 == -1) {
                        resourceId14 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar46.y = resourceId14;
                    continue;
                case 62:
                    b bVar47 = aVar.f2412d;
                    bVar47.z = obtainStyledAttributes.getDimensionPixelSize(index, bVar47.z);
                    continue;
                case 63:
                    b bVar48 = aVar.f2412d;
                    bVar48.A = obtainStyledAttributes.getFloat(index, bVar48.A);
                    continue;
                case 64:
                    c cVar2 = aVar.f2411c;
                    int resourceId15 = obtainStyledAttributes.getResourceId(index, cVar2.f2424c);
                    if (resourceId15 == -1) {
                        resourceId15 = obtainStyledAttributes.getInt(index, -1);
                    }
                    cVar2.f2424c = resourceId15;
                    continue;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        cVar = aVar.f2411c;
                        str2 = obtainStyledAttributes.getString(index);
                    } else {
                        cVar = aVar.f2411c;
                        str2 = g.f.b.a.a.a[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    cVar.f2425d = str2;
                    continue;
                case 66:
                    aVar.f2411c.f2426f = obtainStyledAttributes.getInt(index, 0);
                    continue;
                case 67:
                    c cVar3 = aVar.f2411c;
                    cVar3.f2428h = obtainStyledAttributes.getFloat(index, cVar3.f2428h);
                    continue;
                case 68:
                    C0072d dVar4 = aVar.b;
                    dVar4.e = obtainStyledAttributes.getFloat(index, dVar4.e);
                    continue;
                case 69:
                    aVar.f2412d.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f2412d.b0 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f2412d;
                    bVar49.c0 = obtainStyledAttributes.getInt(index, bVar49.c0);
                    continue;
                case 73:
                    b bVar50 = aVar.f2412d;
                    bVar50.d0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar50.d0);
                    continue;
                case 74:
                    aVar.f2412d.g0 = obtainStyledAttributes.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f2412d;
                    bVar51.k0 = obtainStyledAttributes.getBoolean(index, bVar51.k0);
                    continue;
                case 76:
                    c cVar4 = aVar.f2411c;
                    cVar4.e = obtainStyledAttributes.getInt(index, cVar4.e);
                    continue;
                case 77:
                    aVar.f2412d.h0 = obtainStyledAttributes.getString(index);
                    continue;
                case 78:
                    C0072d dVar5 = aVar.b;
                    dVar5.f2429c = obtainStyledAttributes.getInt(index, dVar5.f2429c);
                    continue;
                case 79:
                    c cVar5 = aVar.f2411c;
                    cVar5.f2427g = obtainStyledAttributes.getFloat(index, cVar5.f2427g);
                    continue;
                case 80:
                    b bVar52 = aVar.f2412d;
                    bVar52.i0 = obtainStyledAttributes.getBoolean(index, bVar52.i0);
                    continue;
                case 81:
                    b bVar53 = aVar.f2412d;
                    bVar53.j0 = obtainStyledAttributes.getBoolean(index, bVar53.j0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(b.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a d2 = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.f2412d.b = true;
                    }
                    this.e.put(Integer.valueOf(d2.a), d2);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
