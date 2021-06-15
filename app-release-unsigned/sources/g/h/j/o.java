package g.h.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.tsuga.news.R;
import g.h.j.a;
import g.h.j.z.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class o {
    public static final AtomicInteger a = new AtomicInteger(1);
    public static WeakHashMap<View, u> b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Field f2531c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f2532d = false;
    public static final int[] e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: f  reason: collision with root package name */
    public static final m f2533f = new a();

    public class a implements m {
        @Override // g.h.j.m
        public c a(c cVar) {
            return cVar;
        }
    }

    public static abstract class b<T> {
        public final int a;
        public final Class<T> b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2534c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2535d;

        public b(int i2, Class<T> cls, int i3) {
            this.a = i2;
            this.b = cls;
            this.f2535d = 0;
            this.f2534c = i3;
        }

        public b(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.b = cls;
            this.f2535d = i3;
            this.f2534c = i4;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        public abstract T b(View view);

        public T c(View view) {
            if (Build.VERSION.SDK_INT >= this.f2534c) {
                return b(view);
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }
    }

    public static class c {

        public class a implements View.OnApplyWindowInsetsListener {
            public y a = null;
            public final /* synthetic */ View b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ k f2536c;

            public a(View view, k kVar) {
                this.b = view;
                this.f2536c = kVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                y i2 = y.i(windowInsets, view);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 30) {
                    c.a(windowInsets, this.b);
                    if (i2.equals(this.a)) {
                        return this.f2536c.a(view, i2).g();
                    }
                }
                this.a = i2;
                y a2 = this.f2536c.a(view, i2);
                if (i3 >= 30) {
                    return a2.g();
                }
                AtomicInteger atomicInteger = o.a;
                view.requestApplyInsets();
                return a2.g();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static y b(View view, y yVar, Rect rect) {
            WindowInsets g2 = yVar.g();
            if (g2 != null) {
                return y.i(view.computeSystemWindowInsets(g2, rect), view);
            }
            rect.setEmpty();
            return yVar;
        }

        public static void c(View view, k kVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, kVar);
            }
            if (kVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, kVar));
            }
        }
    }

    public static class d {
        public static y a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            y i2 = y.i(rootWindowInsets, null);
            i2.b.m(i2);
            i2.b.d(view.getRootView());
            return i2;
        }
    }

    public static class e {
        public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public interface f {
        boolean a(View view, KeyEvent keyEvent);
    }

    public static class g {
        public static final ArrayList<WeakReference<View>> a = new ArrayList<>();
        public WeakHashMap<View, Boolean> b = null;

        /* renamed from: c  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f2537c = null;

        /* renamed from: d  reason: collision with root package name */
        public WeakReference<KeyEvent> f2538d = null;

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((f) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new WeakHashMap();
    }

    public static void a(View view, b.a aVar) {
        a e2 = e(view);
        if (e2 == null) {
            e2 = new a();
        }
        o(view, e2);
        l(aVar.a(), view);
        h(view).add(aVar);
        i(view, 0);
    }

    public static u b(View view) {
        if (b == null) {
            b = new WeakHashMap<>();
        }
        u uVar = b.get(view);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(view);
        b.put(view, uVar2);
        return uVar2;
    }

    public static y c(View view, y yVar) {
        WindowInsets g2 = yVar.g();
        if (g2 != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(g2);
            if (!dispatchApplyWindowInsets.equals(g2)) {
                return y.i(dispatchApplyWindowInsets, view);
            }
        }
        return yVar;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = g.a;
        g gVar = (g) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (gVar == null) {
            gVar = new g();
            view.setTag(R.id.tag_unhandled_key_event_manager, gVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = gVar.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = g.a;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (gVar.b == null) {
                        gVar.b = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = g.a;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            gVar.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                gVar.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = gVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (gVar.f2537c == null) {
                    gVar.f2537c = new SparseArray<>();
                }
                gVar.f2537c.put(keyCode, new WeakReference<>(a2));
            }
        }
        if (a2 != null) {
            return true;
        }
        return false;
    }

    public static a e(View view) {
        View.AccessibilityDelegate f2 = f(view);
        if (f2 == null) {
            return null;
        }
        return f2 instanceof a.C0077a ? ((a.C0077a) f2).a : new a(f2);
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f2532d) {
            return null;
        }
        if (f2531c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2531c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2532d = true;
                return null;
            }
        }
        Object obj = f2531c.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static CharSequence g(View view) {
        return (CharSequence) new q(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view);
    }

    public static List<b.a> h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void i(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = g(view) != null && view.getVisibility() == 0;
            int i3 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i3 = 2048;
                }
                obtain.setEventType(i3);
                obtain.setContentChangeTypes(i2);
                if (z) {
                    obtain.getText().add(g(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (((View) parent).getImportantForAccessibility() == 4) {
                            view.setImportantForAccessibility(2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(g(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static y j(View view, y yVar) {
        WindowInsets g2 = yVar.g();
        if (g2 != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(g2);
            if (!onApplyWindowInsets.equals(g2)) {
                return y.i(onApplyWindowInsets, view);
            }
        }
        return yVar;
    }

    public static c k(View view, c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        l lVar = (l) view.getTag(R.id.tag_on_receive_content_listener);
        if (lVar != null) {
            c a2 = lVar.a(view, cVar);
            if (a2 == null) {
                return null;
            }
            return (view instanceof m ? (m) view : f2533f).a(a2);
        }
        return (view instanceof m ? (m) view : f2533f).a(cVar);
    }

    public static void l(int i2, View view) {
        List<b.a> h2 = h(view);
        for (int i3 = 0; i3 < h2.size(); i3++) {
            if (h2.get(i3).a() == i2) {
                h2.remove(i3);
                return;
            }
        }
    }

    public static void m(View view, b.a aVar, CharSequence charSequence, g.h.j.z.d dVar) {
        a(view, new b.a(null, aVar.f2563j, null, dVar, aVar.f2564k));
    }

    public static void n(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            e.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static void o(View view, a aVar) {
        if (aVar == null && (f(view) instanceof a.C0077a)) {
            aVar = new a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f2520c);
    }
}
