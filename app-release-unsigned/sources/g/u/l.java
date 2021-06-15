package g.u;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class l {
    public static h a = new a();
    public static ThreadLocal<WeakReference<g.e.a<ViewGroup, ArrayList<h>>>> b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f3055c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public h e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f3056f;

        /* renamed from: g.u.l$a$a  reason: collision with other inner class name */
        public class C0101a extends k {
            public final /* synthetic */ g.e.a a;

            public C0101a(g.e.a aVar) {
                this.a = aVar;
            }

            @Override // g.u.h.d
            public void e(h hVar) {
                ((ArrayList) this.a.get(a.this.f3056f)).remove(hVar);
                hVar.A(this);
            }
        }

        public a(h hVar, ViewGroup viewGroup) {
            this.e = hVar;
            this.f3056f = viewGroup;
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x01ef A[EDGE_INSN: B:133:0x01ef->B:88:0x01ef ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01f4  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0215  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
            // Method dump skipped, instructions count: 692
            */
            throw new UnsupportedOperationException("Method not decompiled: g.u.l.a.onPreDraw():boolean");
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f3056f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3056f.removeOnAttachStateChangeListener(this);
            l.f3055c.remove(this.f3056f);
            ArrayList<h> arrayList = l.a().get(this.f3056f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<h> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().C(this.f3056f);
                }
            }
            this.e.l(true);
        }
    }

    public static g.e.a<ViewGroup, ArrayList<h>> a() {
        g.e.a<ViewGroup, ArrayList<h>> aVar;
        WeakReference<g.e.a<ViewGroup, ArrayList<h>>> weakReference = b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        g.e.a<ViewGroup, ArrayList<h>> aVar2 = new g.e.a<>();
        b.set(new WeakReference<>(aVar2));
        return aVar2;
    }
}
