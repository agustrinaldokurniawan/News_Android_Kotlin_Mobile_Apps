package g.b;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import g.b.g.c1;
import g.b.g.g1;
import g.f.c.i.c;
import g.f.c.i.d;
import g.f.c.i.g;
import g.f.c.i.i;
import g.f.c.i.m.n;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class a {
    public static Field a;
    public static boolean b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f1850c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1851d;
    public static Field e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1852f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f1853g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1854h;

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01d3, code lost:
        if (r3 == r6) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01e9, code lost:
        if (r3 == r6) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01ed, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02b4, code lost:
        if (r4[r16].f2315f.f2314d == r6) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0139, code lost:
        if (r5[r2].f2315f.f2314d == r6) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x05a5  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x065b  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x069d  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x06ff  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x070b  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x070f  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x071f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(g.f.c.i.e r34, g.f.c.d r35, java.util.ArrayList<g.f.c.i.d> r36, int r37) {
        /*
        // Method dump skipped, instructions count: 1875
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a.a(g.f.c.i.e, g.f.c.d, java.util.ArrayList, int):void");
    }

    public static n b(d dVar, int i2, ArrayList<n> arrayList, n nVar) {
        c cVar;
        int i3;
        int i4 = i2 == 0 ? dVar.j0 : dVar.k0;
        int i5 = 0;
        if (i4 != -1 && (nVar == null || i4 != nVar.f2384c)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                n nVar2 = arrayList.get(i6);
                if (nVar2.f2384c == i4) {
                    if (nVar != null) {
                        nVar.d(i2, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i6++;
                }
            }
        } else if (i4 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof i) {
                i iVar = (i) dVar;
                int i7 = 0;
                while (true) {
                    if (i7 >= iVar.m0) {
                        i3 = -1;
                        break;
                    }
                    d dVar2 = iVar.l0[i7];
                    if ((i2 == 0 && (i3 = dVar2.j0) != -1) || (i2 == 1 && (i3 = dVar2.k0) != -1)) {
                        break;
                    }
                    i7++;
                }
                if (i3 != -1) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = arrayList.get(i8);
                        if (nVar3.f2384c == i3) {
                            nVar = nVar3;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n(i2);
            }
            arrayList.add(nVar);
        }
        if (nVar.a(dVar)) {
            if (dVar instanceof g) {
                g gVar = (g) dVar;
                c cVar2 = gVar.o0;
                if (gVar.p0 == 0) {
                    i5 = 1;
                }
                cVar2.c(i5, arrayList, nVar);
            }
            if (i2 == 0) {
                dVar.j0 = nVar.f2384c;
                dVar.D.c(i2, arrayList, nVar);
                cVar = dVar.F;
            } else {
                dVar.k0 = nVar.f2384c;
                dVar.E.c(i2, arrayList, nVar);
                dVar.H.c(i2, arrayList, nVar);
                cVar = dVar.G;
            }
            cVar.c(i2, arrayList, nVar);
            dVar.K.c(i2, arrayList, nVar);
        }
        return nVar;
    }

    public static n c(ArrayList<n> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = arrayList.get(i3);
            if (i2 == nVar.f2384c) {
                return nVar;
            }
        }
        return null;
    }

    public static void d(Object obj) {
        if (!f1851d) {
            try {
                f1850c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f1851d = true;
        }
        Class<?> cls = f1850c;
        if (cls != null) {
            if (!f1852f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f1852f = true;
            }
            Field field = e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    public static InputConnection e(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof g1) {
                    editorInfo.hintText = ((g1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static void f(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        c1 c1Var = c1.e;
        if (c1Var != null && c1Var.f2072g == view) {
            c1.c(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            c1 c1Var2 = c1.f2071f;
            if (c1Var2 != null && c1Var2.f2072g == view) {
                c1Var2.b();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new c1(view, charSequence);
    }

    public static boolean g(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }
}
