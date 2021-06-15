package c.b.a.c0.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import c.b.a.a0.c.n;
import c.b.a.a0.c.p;
import c.b.a.c0.d;
import c.b.a.c0.j.k;
import c.b.a.g;
import c.b.a.g0.c;
import c.b.a.m;
import c.b.a.r;
import g.e.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class i extends b {
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();
    public final Paint C = new a(this, 1);
    public final Paint D = new b(this, 1);
    public final Map<d, List<c.b.a.a0.b.d>> E = new HashMap();
    public final e<String> F = new e<>(10);
    public final n G;
    public final m H;
    public final g I;
    public c.b.a.a0.c.a<Integer, Integer> J;
    public c.b.a.a0.c.a<Integer, Integer> K;
    public c.b.a.a0.c.a<Integer, Integer> L;
    public c.b.a.a0.c.a<Integer, Integer> M;
    public c.b.a.a0.c.a<Float, Float> N;
    public c.b.a.a0.c.a<Float, Float> O;
    public c.b.a.a0.c.a<Float, Float> P;
    public c.b.a.a0.c.a<Float, Float> Q;
    public c.b.a.a0.c.a<Float, Float> R;
    public final StringBuilder z = new StringBuilder(2);

    public class a extends Paint {
        public a(i iVar, int i2) {
            super(i2);
            setStyle(Paint.Style.FILL);
        }
    }

    public class b extends Paint {
        public b(i iVar, int i2) {
            super(i2);
            setStyle(Paint.Style.STROKE);
        }
    }

    public i(m mVar, e eVar) {
        super(mVar, eVar);
        c.b.a.c0.j.b bVar;
        c.b.a.c0.j.b bVar2;
        c.b.a.c0.j.a aVar;
        c.b.a.c0.j.a aVar2;
        this.H = mVar;
        this.I = eVar.b;
        n nVar = new n(eVar.q.a);
        this.G = nVar;
        nVar.a.add(this);
        d(nVar);
        k kVar = eVar.r;
        if (!(kVar == null || (aVar2 = kVar.a) == null)) {
            c.b.a.a0.c.a<Integer, Integer> a2 = aVar2.a();
            this.J = a2;
            a2.a.add(this);
            d(this.J);
        }
        if (!(kVar == null || (aVar = kVar.b) == null)) {
            c.b.a.a0.c.a<Integer, Integer> a3 = aVar.a();
            this.L = a3;
            a3.a.add(this);
            d(this.L);
        }
        if (!(kVar == null || (bVar2 = kVar.f538c) == null)) {
            c.b.a.a0.c.a<Float, Float> a4 = bVar2.a();
            this.N = a4;
            a4.a.add(this);
            d(this.N);
        }
        if (kVar != null && (bVar = kVar.f539d) != null) {
            c.b.a.a0.c.a<Float, Float> a5 = bVar.a();
            this.P = a5;
            a5.a.add(this);
            d(this.P);
        }
    }

    @Override // c.b.a.a0.b.e, c.b.a.c0.l.b
    public void a(RectF rectF, Matrix matrix, boolean z2) {
        super.a(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, (float) this.I.f671j.width(), (float) this.I.f671j.height());
    }

    @Override // c.b.a.c0.f, c.b.a.c0.l.b
    public <T> void f(T t, c<T> cVar) {
        c.b.a.a0.c.a<?, ?> aVar;
        this.v.c(t, cVar);
        if (t == r.a) {
            c.b.a.a0.c.a<Integer, Integer> aVar2 = this.K;
            if (aVar2 != null) {
                this.u.remove(aVar2);
            }
            if (cVar == null) {
                this.K = null;
                return;
            }
            p pVar = new p(cVar, null);
            this.K = pVar;
            pVar.a.add(this);
            aVar = this.K;
        } else if (t == r.b) {
            c.b.a.a0.c.a<Integer, Integer> aVar3 = this.M;
            if (aVar3 != null) {
                this.u.remove(aVar3);
            }
            if (cVar == null) {
                this.M = null;
                return;
            }
            p pVar2 = new p(cVar, null);
            this.M = pVar2;
            pVar2.a.add(this);
            aVar = this.M;
        } else if (t == r.q) {
            c.b.a.a0.c.a<Float, Float> aVar4 = this.O;
            if (aVar4 != null) {
                this.u.remove(aVar4);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            p pVar3 = new p(cVar, null);
            this.O = pVar3;
            pVar3.a.add(this);
            aVar = this.O;
        } else if (t == r.r) {
            c.b.a.a0.c.a<Float, Float> aVar5 = this.Q;
            if (aVar5 != null) {
                this.u.remove(aVar5);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            p pVar4 = new p(cVar, null);
            this.Q = pVar4;
            pVar4.a.add(this);
            aVar = this.Q;
        } else if (t == r.D) {
            c.b.a.a0.c.a<Float, Float> aVar6 = this.R;
            if (aVar6 != null) {
                this.u.remove(aVar6);
            }
            if (cVar == null) {
                this.R = null;
                return;
            }
            p pVar5 = new p(cVar, null);
            this.R = pVar5;
            pVar5.a.add(this);
            aVar = this.R;
        } else {
            return;
        }
        d(aVar);
    }

    @Override // c.b.a.c0.l.b
    public void l(Canvas canvas, Matrix matrix, int i2) {
        int i3;
        c.b.a.b0.a aVar;
        String str;
        Paint paint;
        List<String> list;
        int i4;
        String str2;
        List<c.b.a.a0.b.d> list2;
        Paint paint2;
        String str3;
        int i5;
        float f2;
        canvas.save();
        int i6 = 1;
        if (!(this.H.f693f.f668g.k() > 0)) {
            canvas.concat(matrix);
        }
        c.b.a.c0.b bVar = (c.b.a.c0.b) this.G.e();
        c.b.a.c0.c cVar = this.I.e.get(bVar.b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        c.b.a.a0.c.a<Integer, Integer> aVar2 = this.K;
        if (aVar2 == null && (aVar2 = this.J) == null) {
            this.C.setColor(bVar.f529h);
        } else {
            this.C.setColor(aVar2.e().intValue());
        }
        c.b.a.a0.c.a<Integer, Integer> aVar3 = this.M;
        if (aVar3 == null && (aVar3 = this.L) == null) {
            this.D.setColor(bVar.f530i);
        } else {
            this.D.setColor(aVar3.e().intValue());
        }
        c.b.a.a0.c.a<Integer, Integer> aVar4 = this.v.f515j;
        if (aVar4 == null) {
            i3 = 100;
        } else {
            i3 = aVar4.e().intValue();
        }
        int i7 = (i3 * 255) / 100;
        this.C.setAlpha(i7);
        this.D.setAlpha(i7);
        c.b.a.a0.c.a<Float, Float> aVar5 = this.O;
        if (aVar5 == null && (aVar5 = this.N) == null) {
            this.D.setStrokeWidth(c.b.a.f0.g.c() * bVar.f531j * c.b.a.f0.g.d(matrix));
        } else {
            this.D.setStrokeWidth(aVar5.e().floatValue());
        }
        if (this.H.f693f.f668g.k() > 0) {
            c.b.a.a0.c.a<Float, Float> aVar6 = this.R;
            float floatValue = (aVar6 != null ? aVar6.e().floatValue() : bVar.f525c) / 100.0f;
            float d2 = c.b.a.f0.g.d(matrix);
            String str4 = bVar.a;
            float c2 = c.b.a.f0.g.c() * bVar.f527f;
            List<String> w = w(str4);
            int size = w.size();
            int i8 = 0;
            while (i8 < size) {
                String str5 = w.get(i8);
                float f3 = 0.0f;
                int i9 = 0;
                while (i9 < str5.length()) {
                    d g2 = this.I.f668g.g(d.a(str5.charAt(i9), cVar.a, cVar.f533c));
                    if (g2 == null) {
                        f2 = c2;
                        i5 = i8;
                        str3 = str5;
                    } else {
                        str3 = str5;
                        double d3 = g2.f534c;
                        f2 = c2;
                        i5 = i8;
                        f3 = (float) ((d3 * ((double) floatValue) * ((double) c.b.a.f0.g.c()) * ((double) d2)) + ((double) f3));
                    }
                    i9++;
                    str5 = str3;
                    c2 = f2;
                    i8 = i5;
                }
                String str6 = str5;
                canvas.save();
                t(bVar.f526d, canvas, f3);
                canvas.translate(0.0f, (((float) i8) * c2) - ((((float) (size - 1)) * c2) / 2.0f));
                int i10 = 0;
                while (i10 < str6.length()) {
                    String str7 = str6;
                    d g3 = this.I.f668g.g(d.a(str7.charAt(i10), cVar.a, cVar.f533c));
                    if (g3 == null) {
                        list = w;
                        i4 = size;
                        str2 = str7;
                    } else {
                        if (this.E.containsKey(g3)) {
                            list2 = this.E.get(g3);
                            list = w;
                            i4 = size;
                            str2 = str7;
                        } else {
                            List<c.b.a.c0.k.m> list3 = g3.a;
                            int size2 = list3.size();
                            ArrayList arrayList = new ArrayList(size2);
                            list = w;
                            int i11 = 0;
                            while (i11 < size2) {
                                arrayList.add(new c.b.a.a0.b.d(this.H, this, list3.get(i11)));
                                i11++;
                                str7 = str7;
                                size = size;
                                list3 = list3;
                            }
                            i4 = size;
                            str2 = str7;
                            this.E.put(g3, arrayList);
                            list2 = arrayList;
                        }
                        int i12 = 0;
                        while (i12 < list2.size()) {
                            Path h2 = list2.get(i12).h();
                            h2.computeBounds(this.A, false);
                            this.B.set(matrix);
                            this.B.preTranslate(0.0f, (-bVar.f528g) * c.b.a.f0.g.c());
                            this.B.preScale(floatValue, floatValue);
                            h2.transform(this.B);
                            if (bVar.f532k) {
                                v(h2, this.C, canvas);
                                paint2 = this.D;
                            } else {
                                v(h2, this.D, canvas);
                                paint2 = this.C;
                            }
                            v(h2, paint2, canvas);
                            i12++;
                            list2 = list2;
                        }
                        float c3 = c.b.a.f0.g.c() * ((float) g3.f534c) * floatValue * d2;
                        float f4 = ((float) bVar.e) / 10.0f;
                        c.b.a.a0.c.a<Float, Float> aVar7 = this.Q;
                        if (!(aVar7 == null && (aVar7 = this.P) == null)) {
                            f4 += aVar7.e().floatValue();
                        }
                        canvas.translate((f4 * d2) + c3, 0.0f);
                    }
                    i10++;
                    w = list;
                    str6 = str2;
                    size = i4;
                }
                canvas.restore();
                i8++;
                c2 = c2;
            }
        } else {
            c.b.a.f0.g.d(matrix);
            m mVar = this.H;
            T t = (T) cVar.a;
            T t2 = (T) cVar.f533c;
            Typeface typeface = null;
            if (mVar.getCallback() == null) {
                aVar = null;
            } else {
                if (mVar.q == null) {
                    mVar.q = new c.b.a.b0.a(mVar.getCallback());
                }
                aVar = mVar.q;
            }
            if (aVar != null) {
                c.b.a.c0.i<String> iVar = aVar.a;
                iVar.a = t;
                iVar.b = t2;
                typeface = aVar.b.get(iVar);
                if (typeface == null) {
                    Typeface typeface2 = aVar.f520c.get(t);
                    if (typeface2 == null) {
                        StringBuilder h3 = c.c.a.a.a.h("fonts/", t);
                        h3.append(aVar.e);
                        typeface2 = Typeface.createFromAsset(aVar.f521d, h3.toString());
                        aVar.f520c.put(t, typeface2);
                    }
                    boolean contains = t2.contains("Italic");
                    boolean contains2 = t2.contains("Bold");
                    int i13 = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
                    typeface = typeface2.getStyle() == i13 ? typeface2 : Typeface.create(typeface2, i13);
                    aVar.b.put(aVar.a, typeface);
                }
            }
            if (typeface != null) {
                String str8 = bVar.a;
                Objects.requireNonNull(this.H);
                this.C.setTypeface(typeface);
                c.b.a.a0.c.a<Float, Float> aVar8 = this.R;
                float floatValue2 = aVar8 != null ? aVar8.e().floatValue() : bVar.f525c;
                this.C.setTextSize(c.b.a.f0.g.c() * floatValue2);
                this.D.setTypeface(this.C.getTypeface());
                this.D.setTextSize(this.C.getTextSize());
                float c4 = c.b.a.f0.g.c() * bVar.f527f;
                float f5 = ((float) bVar.e) / 10.0f;
                c.b.a.a0.c.a<Float, Float> aVar9 = this.Q;
                if (!(aVar9 == null && (aVar9 = this.P) == null)) {
                    f5 += aVar9.e().floatValue();
                }
                float c5 = ((c.b.a.f0.g.c() * f5) * floatValue2) / 100.0f;
                List<String> w2 = w(str8);
                int size3 = w2.size();
                int i14 = 0;
                while (i14 < size3) {
                    String str9 = w2.get(i14);
                    float length = (((float) (str9.length() - i6)) * c5) + this.D.measureText(str9);
                    canvas.save();
                    t(bVar.f526d, canvas, length);
                    canvas.translate(0.0f, (((float) i14) * c4) - ((((float) (size3 - 1)) * c4) / 2.0f));
                    int i15 = 0;
                    while (i15 < str9.length()) {
                        int codePointAt = str9.codePointAt(i15);
                        int charCount = Character.charCount(codePointAt) + i15;
                        while (charCount < str9.length()) {
                            int codePointAt2 = str9.codePointAt(charCount);
                            if (!(Character.getType(codePointAt2) == 16 || Character.getType(codePointAt2) == 27 || Character.getType(codePointAt2) == 6 || Character.getType(codePointAt2) == 28 || Character.getType(codePointAt2) == 19)) {
                                break;
                            }
                            charCount += Character.charCount(codePointAt2);
                            codePointAt = (codePointAt * 31) + codePointAt2;
                        }
                        e<String> eVar = this.F;
                        long j2 = (long) codePointAt;
                        if (eVar.f2230f) {
                            eVar.f();
                        }
                        if (g.e.d.b(eVar.f2231g, eVar.f2233i, j2) >= 0) {
                            str = this.F.g(j2);
                        } else {
                            this.z.setLength(0);
                            int i16 = i15;
                            while (i16 < charCount) {
                                int codePointAt3 = str9.codePointAt(i16);
                                this.z.appendCodePoint(codePointAt3);
                                i16 += Character.charCount(codePointAt3);
                            }
                            str = this.z.toString();
                            this.F.j(j2, str);
                        }
                        i15 += str.length();
                        if (bVar.f532k) {
                            u(str, this.C, canvas);
                            paint = this.D;
                        } else {
                            u(str, this.D, canvas);
                            paint = this.C;
                        }
                        u(str, paint, canvas);
                        canvas.translate(this.C.measureText(str) + c5, 0.0f);
                    }
                    canvas.restore();
                    i14++;
                    i6 = 1;
                }
            }
        }
        canvas.restore();
    }

    public final void t(int i2, Canvas canvas, float f2) {
        float f3;
        int f4 = g.f.c.g.f(i2);
        if (f4 == 1) {
            f3 = -f2;
        } else if (f4 == 2) {
            f3 = (-f2) / 2.0f;
        } else {
            return;
        }
        canvas.translate(f3, 0.0f);
    }

    public final void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    public final void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    public final List<String> w(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }
}
