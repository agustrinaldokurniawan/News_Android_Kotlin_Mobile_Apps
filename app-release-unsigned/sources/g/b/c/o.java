package g.b.c;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import g.b.f.a;
import g.e.c;
import g.h.j.e;
import java.lang.ref.WeakReference;

public class o extends Dialog implements h {
    public i e;

    /* renamed from: f  reason: collision with root package name */
    public final e.a f1891f;

    public class a implements e.a {
        public a() {
        }

        @Override // g.h.j.e.a
        public boolean e(KeyEvent keyEvent) {
            return o.this.b(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130903331(0x7f030123, float:1.7413477E38)
            if (r6 != 0) goto L_0x0015
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4.<init>(r5, r2)
            g.b.c.o$a r2 = new g.b.c.o$a
            r2.<init>()
            r4.f1891f = r2
            g.b.c.i r2 = r4.a()
            if (r6 != 0) goto L_0x0034
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0034:
            r2.x(r6)
            r5 = 0
            r2.l(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.c.o.<init>(android.content.Context, int):void");
    }

    public i a() {
        if (this.e == null) {
            c<WeakReference<i>> cVar = i.e;
            this.e = new j(getContext(), getWindow(), this, this);
        }
        return this.e;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void dismiss() {
        super.dismiss();
        a().m();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.b(this.f1891f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // g.b.c.h
    public void f(g.b.f.a aVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().e(i2);
    }

    @Override // g.b.c.h
    public void h(g.b.f.a aVar) {
    }

    @Override // g.b.c.h
    public g.b.f.a i(a.AbstractC0064a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        a().j();
    }

    public void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().l(bundle);
    }

    public void onStop() {
        super.onStop();
        a().r();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().u(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().y(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().y(charSequence);
    }
}
