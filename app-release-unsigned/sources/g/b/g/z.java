package g.b.g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import g.b.b;
import g.h.c.b.e;
import g.h.j.o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class z {
    public final TextView a;
    public x0 b;

    /* renamed from: c  reason: collision with root package name */
    public x0 f2185c;

    /* renamed from: d  reason: collision with root package name */
    public x0 f2186d;
    public x0 e;

    /* renamed from: f  reason: collision with root package name */
    public x0 f2187f;

    /* renamed from: g  reason: collision with root package name */
    public x0 f2188g;

    /* renamed from: h  reason: collision with root package name */
    public x0 f2189h;

    /* renamed from: i  reason: collision with root package name */
    public final c0 f2190i;

    /* renamed from: j  reason: collision with root package name */
    public int f2191j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f2192k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f2193l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2194m;

    public class a extends e {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f2195c;

        public a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.b = i3;
            this.f2195c = weakReference;
        }

        @Override // g.h.c.b.e
        public void d(int i2) {
        }

        @Override // g.h.c.b.e
        public void e(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.b & 2) != 0);
            }
            z zVar = z.this;
            WeakReference weakReference = this.f2195c;
            if (zVar.f2194m) {
                zVar.f2193l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    AtomicInteger atomicInteger = o.a;
                    if (textView.isAttachedToWindow()) {
                        textView.post(new a0(zVar, textView, typeface, zVar.f2191j));
                    } else {
                        textView.setTypeface(typeface, zVar.f2191j);
                    }
                }
            }
        }
    }

    public z(TextView textView) {
        this.a = textView;
        this.f2190i = new c0(textView);
    }

    public static x0 c(Context context, j jVar, int i2) {
        ColorStateList d2 = jVar.d(context, i2);
        if (d2 == null) {
            return null;
        }
        x0 x0Var = new x0();
        x0Var.f2184d = true;
        x0Var.a = d2;
        return x0Var;
    }

    public final void a(Drawable drawable, x0 x0Var) {
        if (drawable != null && x0Var != null) {
            j.f(drawable, x0Var, this.a.getDrawableState());
        }
    }

    public void b() {
        if (!(this.b == null && this.f2185c == null && this.f2186d == null && this.e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.f2185c);
            a(compoundDrawables[2], this.f2186d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f2187f != null || this.f2188g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f2187f);
            a(compoundDrawablesRelative[2], this.f2188g);
        }
    }

    public boolean d() {
        c0 c0Var = this.f2190i;
        return c0Var.i() && c0Var.f2062d != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:194:0x036e, code lost:
        if (r3 != null) goto L_0x0375;
     */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r23, int r24) {
        /*
        // Method dump skipped, instructions count: 964
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.z.e(android.util.AttributeSet, int):void");
    }

    public void f(Context context, int i2) {
        String m2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, b.v);
        z0 z0Var = new z0(context, obtainStyledAttributes);
        if (z0Var.o(14)) {
            this.a.setAllCaps(z0Var.a(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (z0Var.o(0) && z0Var.f(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        m(context, z0Var);
        if (i3 >= 26 && z0Var.o(13) && (m2 = z0Var.m(13)) != null) {
            this.a.setFontVariationSettings(m2);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f2193l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f2191j);
        }
    }

    public void g(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i2 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            Objects.requireNonNull(text);
            if (i2 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i3 = editorInfo.initialSelStart;
            int i4 = editorInfo.initialSelEnd;
            int i5 = i3 > i4 ? i4 + 0 : i3 + 0;
            int i6 = i3 > i4 ? i3 - 0 : i4 + 0;
            int length = text.length();
            if (i5 >= 0 && i6 <= length) {
                int i7 = editorInfo.inputType & 4095;
                if (!(i7 == 129 || i7 == 225 || i7 == 18)) {
                    if (length <= 2048) {
                        g.h.j.a0.a.b(editorInfo, text, i5, i6);
                        return;
                    }
                    int i8 = i6 - i5;
                    int i9 = i8 > 1024 ? 0 : i8;
                    int i10 = 2048 - i9;
                    int min = Math.min(text.length() - i6, i10 - Math.min(i5, (int) (((double) i10) * 0.8d)));
                    int min2 = Math.min(i5, i10 - min);
                    int i11 = i5 - min2;
                    if (g.h.j.a0.a.a(text, i11, 0)) {
                        i11++;
                        min2--;
                    }
                    if (g.h.j.a0.a.a(text, (i6 + min) - 1, 1)) {
                        min--;
                    }
                    CharSequence concat = i9 != i8 ? TextUtils.concat(text.subSequence(i11, i11 + min2), text.subSequence(i6, min + i6)) : text.subSequence(i11, min2 + i9 + min + i11);
                    int i12 = min2 + 0;
                    g.h.j.a0.a.b(editorInfo, concat, i12, i9 + i12);
                    return;
                }
            }
            g.h.j.a0.a.b(editorInfo, null, 0, 0);
        }
    }

    public void h(int i2, int i3, int i4, int i5) {
        c0 c0Var = this.f2190i;
        if (c0Var.i()) {
            DisplayMetrics displayMetrics = c0Var.f2070m.getResources().getDisplayMetrics();
            c0Var.j(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (c0Var.g()) {
                c0Var.a();
            }
        }
    }

    public void i(int[] iArr, int i2) {
        c0 c0Var = this.f2190i;
        if (c0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0Var.f2070m.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                c0Var.f2066i = c0Var.b(iArr2);
                if (!c0Var.h()) {
                    StringBuilder f2 = c.c.a.a.a.f("None of the preset sizes is valid: ");
                    f2.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(f2.toString());
                }
            } else {
                c0Var.f2067j = false;
            }
            if (c0Var.g()) {
                c0Var.a();
            }
        }
    }

    public void j(int i2) {
        c0 c0Var = this.f2190i;
        if (!c0Var.i()) {
            return;
        }
        if (i2 == 0) {
            c0Var.f2062d = 0;
            c0Var.f2064g = -1.0f;
            c0Var.f2065h = -1.0f;
            c0Var.f2063f = -1.0f;
            c0Var.f2066i = new int[0];
            c0Var.e = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = c0Var.f2070m.getResources().getDisplayMetrics();
            c0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0Var.g()) {
                c0Var.a();
            }
        } else {
            throw new IllegalArgumentException(c.c.a.a.a.l("Unknown auto-size text type: ", i2));
        }
    }

    public void k(ColorStateList colorStateList) {
        if (this.f2189h == null) {
            this.f2189h = new x0();
        }
        x0 x0Var = this.f2189h;
        x0Var.a = colorStateList;
        x0Var.f2184d = colorStateList != null;
        this.b = x0Var;
        this.f2185c = x0Var;
        this.f2186d = x0Var;
        this.e = x0Var;
        this.f2187f = x0Var;
        this.f2188g = x0Var;
    }

    public void l(PorterDuff.Mode mode) {
        if (this.f2189h == null) {
            this.f2189h = new x0();
        }
        x0 x0Var = this.f2189h;
        x0Var.b = mode;
        x0Var.f2183c = mode != null;
        this.b = x0Var;
        this.f2185c = x0Var;
        this.f2186d = x0Var;
        this.e = x0Var;
        this.f2187f = x0Var;
        this.f2188g = x0Var;
    }

    public final void m(Context context, z0 z0Var) {
        String m2;
        Typeface typeface;
        Typeface typeface2;
        this.f2191j = z0Var.j(2, this.f2191j);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i2 >= 28) {
            int j2 = z0Var.j(11, -1);
            this.f2192k = j2;
            if (j2 != -1) {
                this.f2191j = (this.f2191j & 2) | 0;
            }
        }
        int i3 = 10;
        if (z0Var.o(10) || z0Var.o(12)) {
            this.f2193l = null;
            if (z0Var.o(12)) {
                i3 = 12;
            }
            int i4 = this.f2192k;
            int i5 = this.f2191j;
            if (!context.isRestricted()) {
                try {
                    Typeface i6 = z0Var.i(i3, this.f2191j, new a(i4, i5, new WeakReference(this.a)));
                    if (i6 != null) {
                        if (i2 >= 28 && this.f2192k != -1) {
                            i6 = Typeface.create(Typeface.create(i6, 0), this.f2192k, (this.f2191j & 2) != 0);
                        }
                        this.f2193l = i6;
                    }
                    this.f2194m = this.f2193l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f2193l == null && (m2 = z0Var.m(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f2192k == -1) {
                    typeface = Typeface.create(m2, this.f2191j);
                } else {
                    Typeface create = Typeface.create(m2, 0);
                    int i7 = this.f2192k;
                    if ((this.f2191j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i7, z);
                }
                this.f2193l = typeface;
            }
        } else if (z0Var.o(1)) {
            this.f2194m = false;
            int j3 = z0Var.j(1, 1);
            if (j3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (j3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (j3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f2193l = typeface2;
        }
    }
}
