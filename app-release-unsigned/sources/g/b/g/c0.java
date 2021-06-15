package g.b.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class c0 {
    public static final RectF a = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> b = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: c  reason: collision with root package name */
    public static ConcurrentHashMap<String, Field> f2061c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public int f2062d = 0;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public float f2063f = -1.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f2064g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f2065h = -1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2066i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public boolean f2067j = false;

    /* renamed from: k  reason: collision with root package name */
    public TextPaint f2068k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f2069l;

    /* renamed from: m  reason: collision with root package name */
    public final Context f2070m;
    public final c n;

    public static class a extends c {
        @Override // g.b.g.c0.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) c0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class b extends a {
        @Override // g.b.g.c0.c, g.b.g.c0.a
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // g.b.g.c0.c
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) c0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public c0(TextView textView) {
        this.f2069l = textView;
        this.f2070m = textView.getContext();
        this.n = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    public static Method d(String str) {
        try {
            Method method = b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                b.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    public void a() {
        if (i() && this.f2062d != 0) {
            if (this.e) {
                if (this.f2069l.getMeasuredHeight() > 0 && this.f2069l.getMeasuredWidth() > 0) {
                    int measuredWidth = this.n.b(this.f2069l) ? 1048576 : (this.f2069l.getMeasuredWidth() - this.f2069l.getTotalPaddingLeft()) - this.f2069l.getTotalPaddingRight();
                    int height = (this.f2069l.getHeight() - this.f2069l.getCompoundPaddingBottom()) - this.f2069l.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = a;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float c2 = (float) c(rectF);
                            if (c2 != this.f2069l.getTextSize()) {
                                f(0, c2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.e = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f2066i.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                int i6 = this.f2066i[i5];
                CharSequence text = this.f2069l.getText();
                TransformationMethod transformationMethod = this.f2069l.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f2069l)) == null)) {
                    text = transformation;
                }
                int maxLines = this.f2069l.getMaxLines();
                TextPaint textPaint = this.f2068k;
                if (textPaint == null) {
                    this.f2068k = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f2068k.set(this.f2069l.getPaint());
                this.f2068k.setTextSize((float) i6);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f2068k, Math.round(rectF.right));
                obtain.setAlignment((Layout.Alignment) e(this.f2069l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(this.f2069l.getLineSpacingExtra(), this.f2069l.getLineSpacingMultiplier()).setIncludePad(this.f2069l.getIncludeFontPadding()).setBreakStrategy(this.f2069l.getBreakStrategy()).setHyphenationFrequency(this.f2069l.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.n.a(obtain, this.f2069l);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                    int i7 = i5 + 1;
                    i4 = i3;
                    i3 = i7;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f2066i[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public void f(int i2, float f2) {
        Context context = this.f2070m;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f2069l.getPaint().getTextSize()) {
            this.f2069l.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f2069l.isInLayout();
            if (this.f2069l.getLayout() != null) {
                this.e = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(this.f2069l, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.f2069l.requestLayout();
                } else {
                    this.f2069l.forceLayout();
                }
                this.f2069l.invalidate();
            }
        }
    }

    public final boolean g() {
        if (!i() || this.f2062d != 1) {
            this.e = false;
        } else {
            if (!this.f2067j || this.f2066i.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f2065h - this.f2064g) / this.f2063f))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((((float) i2) * this.f2063f) + this.f2064g);
                }
                this.f2066i = b(iArr);
            }
            this.e = true;
        }
        return this.e;
    }

    public final boolean h() {
        int[] iArr = this.f2066i;
        int length = iArr.length;
        boolean z = length > 0;
        this.f2067j = z;
        if (z) {
            this.f2062d = 1;
            this.f2064g = (float) iArr[0];
            this.f2065h = (float) iArr[length - 1];
            this.f2063f = -1.0f;
        }
        return z;
    }

    public final boolean i() {
        return !(this.f2069l instanceof k);
    }

    public final void j(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.f2062d = 1;
            this.f2064g = f2;
            this.f2065h = f3;
            this.f2063f = f4;
            this.f2067j = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }
}
