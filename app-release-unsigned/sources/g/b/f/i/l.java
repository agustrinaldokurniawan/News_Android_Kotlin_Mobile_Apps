package g.b.f.i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.tsuga.news.R;
import g.b.f.i.m;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public class l {
    public final Context a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2012c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2013d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public View f2014f;

    /* renamed from: g  reason: collision with root package name */
    public int f2015g = 8388611;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2016h;

    /* renamed from: i  reason: collision with root package name */
    public m.a f2017i;

    /* renamed from: j  reason: collision with root package name */
    public k f2018j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f2019k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f2020l = new a();

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            l.this.c();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.a = context;
        this.b = gVar;
        this.f2014f = view;
        this.f2012c = z;
        this.f2013d = i2;
        this.e = i3;
    }

    public k a() {
        if (this.f2018j == null) {
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            k dVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new d(this.a, this.f2014f, this.f2013d, this.e, this.f2012c) : new q(this.a, this.b, this.f2014f, this.f2013d, this.e, this.f2012c);
            dVar.l(this.b);
            dVar.r(this.f2020l);
            dVar.n(this.f2014f);
            dVar.h(this.f2017i);
            dVar.o(this.f2016h);
            dVar.p(this.f2015g);
            this.f2018j = dVar;
        }
        return this.f2018j;
    }

    public boolean b() {
        k kVar = this.f2018j;
        return kVar != null && kVar.b();
    }

    public void c() {
        this.f2018j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2019k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(m.a aVar) {
        this.f2017i = aVar;
        k kVar = this.f2018j;
        if (kVar != null) {
            kVar.h(aVar);
        }
    }

    public final void e(int i2, int i3, boolean z, boolean z2) {
        k a2 = a();
        a2.s(z2);
        if (z) {
            int i4 = this.f2015g;
            View view = this.f2014f;
            AtomicInteger atomicInteger = o.a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f2014f.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.e = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.f();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f2014f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
