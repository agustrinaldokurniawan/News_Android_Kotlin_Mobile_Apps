package g.j.b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import g.e.i;
import g.h.j.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a extends g.h.j.a {

    /* renamed from: d  reason: collision with root package name */
    public static final Rect f2594d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final b<g.h.j.z.b> e = new C0083a();

    /* renamed from: f  reason: collision with root package name */
    public static final c<i<g.h.j.z.b>, g.h.j.z.b> f2595f = new b();

    /* renamed from: g  reason: collision with root package name */
    public final Rect f2596g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public final Rect f2597h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public final Rect f2598i = new Rect();

    /* renamed from: j  reason: collision with root package name */
    public final int[] f2599j = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public final AccessibilityManager f2600k;

    /* renamed from: l  reason: collision with root package name */
    public final View f2601l;

    /* renamed from: m  reason: collision with root package name */
    public c f2602m;
    public int n = Integer.MIN_VALUE;
    public int o = Integer.MIN_VALUE;
    public int p = Integer.MIN_VALUE;

    /* renamed from: g.j.b.a$a  reason: collision with other inner class name */
    public class C0083a implements b<g.h.j.z.b> {
        public void a(Object obj, Rect rect) {
            ((g.h.j.z.b) obj).b.getBoundsInParent(rect);
        }
    }

    public class b implements c<i<g.h.j.z.b>, g.h.j.z.b> {
    }

    public class c extends g.h.j.z.c {
        public c() {
        }

        @Override // g.h.j.z.c
        public g.h.j.z.b a(int i2) {
            return new g.h.j.z.b(AccessibilityNodeInfo.obtain(a.this.o(i2).b));
        }

        @Override // g.h.j.z.c
        public g.h.j.z.b b(int i2) {
            int i3 = i2 == 2 ? a.this.n : a.this.o;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return new g.h.j.z.b(AccessibilityNodeInfo.obtain(a.this.o(i3).b));
        }

        @Override // g.h.j.z.c
        public boolean c(int i2, int i3, Bundle bundle) {
            int i4;
            a aVar = a.this;
            if (i2 != -1) {
                boolean z = true;
                if (i3 == 1) {
                    return aVar.t(i2);
                }
                if (i3 == 2) {
                    return aVar.k(i2);
                }
                if (i3 != 64) {
                    return i3 != 128 ? aVar.p(i2, i3, bundle) : aVar.j(i2);
                }
                if (!aVar.f2600k.isEnabled() || !aVar.f2600k.isTouchExplorationEnabled() || (i4 = aVar.n) == i2) {
                    z = false;
                } else {
                    if (i4 != Integer.MIN_VALUE) {
                        aVar.j(i4);
                    }
                    aVar.n = i2;
                    aVar.f2601l.invalidate();
                    aVar.u(i2, 32768);
                }
                return z;
            }
            View view = aVar.f2601l;
            AtomicInteger atomicInteger = o.a;
            return view.performAccessibilityAction(i3, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f2601l = view;
            this.f2600k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            AtomicInteger atomicInteger = o.a;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // g.h.j.a
    public g.h.j.z.c b(View view) {
        if (this.f2602m == null) {
            this.f2602m = new c();
        }
        return this.f2602m;
    }

    @Override // g.h.j.a
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // g.h.j.a
    public void d(View view, g.h.j.z.b bVar) {
        this.b.onInitializeAccessibilityNodeInfo(view, bVar.b);
        q(bVar);
    }

    public final boolean j(int i2) {
        if (this.n != i2) {
            return false;
        }
        this.n = Integer.MIN_VALUE;
        this.f2601l.invalidate();
        u(i2, 65536);
        return true;
    }

    public final boolean k(int i2) {
        if (this.o != i2) {
            return false;
        }
        this.o = Integer.MIN_VALUE;
        s(i2, false);
        u(i2, 8);
        return true;
    }

    public final g.h.j.z.b l(int i2) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g.h.j.z.b bVar = new g.h.j.z.b(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f2594d;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f2601l;
        bVar.f2555c = -1;
        obtain.setParent(view);
        r(i2, bVar);
        if (bVar.g() == null && bVar.e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        obtain.getBoundsInParent(this.f2597h);
        if (!this.f2597h.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(this.f2601l.getContext().getPackageName());
                View view2 = this.f2601l;
                bVar.f2556d = i2;
                obtain.setSource(view2, i2);
                boolean z = false;
                if (this.n == i2) {
                    obtain.setAccessibilityFocused(true);
                    obtain.addAction(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    obtain.addAction(64);
                }
                boolean z2 = this.o == i2;
                if (z2) {
                    obtain.addAction(2);
                } else if (obtain.isFocusable()) {
                    obtain.addAction(1);
                }
                obtain.setFocused(z2);
                this.f2601l.getLocationOnScreen(this.f2599j);
                obtain.getBoundsInScreen(this.f2596g);
                if (this.f2596g.equals(rect)) {
                    obtain.getBoundsInParent(this.f2596g);
                    if (bVar.f2555c != -1) {
                        g.h.j.z.b bVar2 = new g.h.j.z.b(AccessibilityNodeInfo.obtain());
                        for (int i3 = bVar.f2555c; i3 != -1; i3 = bVar2.f2555c) {
                            View view3 = this.f2601l;
                            bVar2.f2555c = -1;
                            bVar2.b.setParent(view3, -1);
                            bVar2.b.setBoundsInParent(f2594d);
                            r(i3, bVar2);
                            bVar2.b.getBoundsInParent(this.f2597h);
                            Rect rect2 = this.f2596g;
                            Rect rect3 = this.f2597h;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        bVar2.b.recycle();
                    }
                    this.f2596g.offset(this.f2599j[0] - this.f2601l.getScrollX(), this.f2599j[1] - this.f2601l.getScrollY());
                }
                if (this.f2601l.getLocalVisibleRect(this.f2598i)) {
                    this.f2598i.offset(this.f2599j[0] - this.f2601l.getScrollX(), this.f2599j[1] - this.f2601l.getScrollY());
                    if (this.f2596g.intersect(this.f2598i)) {
                        bVar.b.setBoundsInScreen(this.f2596g);
                        Rect rect4 = this.f2596g;
                        if (rect4 != null && !rect4.isEmpty() && this.f2601l.getWindowVisibility() == 0) {
                            View view4 = this.f2601l;
                            while (true) {
                                ViewParent parent = view4.getParent();
                                if (parent instanceof View) {
                                    view4 = (View) parent;
                                    if (view4.getAlpha() > 0.0f) {
                                        if (view4.getVisibility() != 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            bVar.b.setVisibleToUser(true);
                        }
                    }
                }
                return bVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void m(List<Integer> list);

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0143, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x0145;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x014f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(int r20, android.graphics.Rect r21) {
        /*
        // Method dump skipped, instructions count: 493
        */
        throw new UnsupportedOperationException("Method not decompiled: g.j.b.a.n(int, android.graphics.Rect):boolean");
    }

    public g.h.j.z.b o(int i2) {
        if (i2 != -1) {
            return l(i2);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f2601l);
        g.h.j.z.b bVar = new g.h.j.z.b(obtain);
        View view = this.f2601l;
        AtomicInteger atomicInteger = o.a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                bVar.b.addChild(this.f2601l, ((Integer) arrayList.get(i3)).intValue());
            }
            return bVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract boolean p(int i2, int i3, Bundle bundle);

    public void q(g.h.j.z.b bVar) {
    }

    public abstract void r(int i2, g.h.j.z.b bVar);

    public void s(int i2, boolean z) {
    }

    public final boolean t(int i2) {
        int i3;
        if ((!this.f2601l.isFocused() && !this.f2601l.requestFocus()) || (i3 = this.o) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            k(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.o = i2;
        s(i2, true);
        u(i2, 8);
        return true;
    }

    public final boolean u(int i2, int i3) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i2 == Integer.MIN_VALUE || !this.f2600k.isEnabled() || (parent = this.f2601l.getParent()) == null) {
            return false;
        }
        if (i2 != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i3);
            g.h.j.z.b o2 = o(i2);
            accessibilityEvent.getText().add(o2.g());
            accessibilityEvent.setContentDescription(o2.e());
            accessibilityEvent.setScrollable(o2.b.isScrollable());
            accessibilityEvent.setPassword(o2.b.isPassword());
            accessibilityEvent.setEnabled(o2.b.isEnabled());
            accessibilityEvent.setChecked(o2.b.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(o2.b.getClassName());
                accessibilityEvent.setSource(this.f2601l, i2);
                accessibilityEvent.setPackageName(this.f2601l.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i3);
            this.f2601l.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.f2601l, accessibilityEvent);
    }

    public final void v(int i2) {
        int i3 = this.p;
        if (i3 != i2) {
            this.p = i2;
            u(i2, 128);
            u(i3, 256);
        }
    }
}
