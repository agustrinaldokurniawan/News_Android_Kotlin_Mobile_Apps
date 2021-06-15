package c.d.a.q.j;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import c.d.a.q.c;
import c.d.a.q.h;
import com.tsuga.news.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Deprecated
public abstract class i<T extends View, Z> extends a<Z> {
    public final T e;

    /* renamed from: f  reason: collision with root package name */
    public final a f1155f;

    public static final class a {
        public static Integer a;
        public final View b;

        /* renamed from: c  reason: collision with root package name */
        public final List<g> f1156c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public ViewTreeObserver$OnPreDrawListenerC0033a f1157d;

        /* renamed from: c.d.a.q.j.i$a$a  reason: collision with other inner class name */
        public static final class ViewTreeObserver$OnPreDrawListenerC0033a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<a> e;

            public ViewTreeObserver$OnPreDrawListenerC0033a(a aVar) {
                this.e = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.e.get();
                if (aVar == null || aVar.f1156c.isEmpty()) {
                    return true;
                }
                int d2 = aVar.d();
                int c2 = aVar.c();
                if (!aVar.e(d2, c2)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.f1156c).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).b(d2, c2);
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.b = view;
        }

        public void a() {
            ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f1157d);
            }
            this.f1157d = null;
            this.f1156c.clear();
        }

        public final int b(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.b.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.b.getContext();
            if (a == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return a.intValue();
        }

        public final int c() {
            int paddingBottom = this.b.getPaddingBottom() + this.b.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            return b(this.b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int d() {
            int paddingRight = this.b.getPaddingRight() + this.b.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            return b(this.b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean e(int i2, int i3) {
            if (!(i2 > 0 || i2 == Integer.MIN_VALUE)) {
                return false;
            }
            return i3 > 0 || i3 == Integer.MIN_VALUE;
        }
    }

    public i(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.e = t;
        this.f1155f = new a(t);
    }

    @Override // c.d.a.q.j.h
    public void a(g gVar) {
        this.f1155f.f1156c.remove(gVar);
    }

    @Override // c.d.a.q.j.h
    public c f() {
        Object tag = this.e.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof c) {
            return (c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // c.d.a.q.j.h
    public void h(g gVar) {
        a aVar = this.f1155f;
        int d2 = aVar.d();
        int c2 = aVar.c();
        if (aVar.e(d2, c2)) {
            ((h) gVar).b(d2, c2);
            return;
        }
        if (!aVar.f1156c.contains(gVar)) {
            aVar.f1156c.add(gVar);
        }
        if (aVar.f1157d == null) {
            ViewTreeObserver viewTreeObserver = aVar.b.getViewTreeObserver();
            a.ViewTreeObserver$OnPreDrawListenerC0033a aVar2 = new a.ViewTreeObserver$OnPreDrawListenerC0033a(aVar);
            aVar.f1157d = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    @Override // c.d.a.q.j.h
    public void j(c cVar) {
        this.e.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Target for: ");
        f2.append(this.e);
        return f2.toString();
    }
}
