package c.e.a.a.d;

import android.view.View;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public class h {
    public final View a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1198c;

    /* renamed from: d  reason: collision with root package name */
    public int f1199d;
    public int e;

    public h(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        int top = this.f1199d - (view.getTop() - this.b);
        AtomicInteger atomicInteger = o.a;
        view.offsetTopAndBottom(top);
        View view2 = this.a;
        view2.offsetLeftAndRight(this.e - (view2.getLeft() - this.f1198c));
    }
}
