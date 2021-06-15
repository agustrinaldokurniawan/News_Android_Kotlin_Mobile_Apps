package g.l.b;

import android.view.View;
import java.util.ArrayList;

public class n0 implements Runnable {
    public final /* synthetic */ Object e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s0 f2733f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f2734g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ m f2735h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2736i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2737j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2738k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f2739l;

    public n0(Object obj, s0 s0Var, View view, m mVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.e = obj;
        this.f2733f = s0Var;
        this.f2734g = view;
        this.f2735h = mVar;
        this.f2736i = arrayList;
        this.f2737j = arrayList2;
        this.f2738k = arrayList3;
        this.f2739l = obj2;
    }

    public void run() {
        Object obj = this.e;
        if (obj != null) {
            this.f2733f.o(obj, this.f2734g);
            this.f2737j.addAll(q0.h(this.f2733f, this.e, this.f2735h, this.f2736i, this.f2734g));
        }
        if (this.f2738k != null) {
            if (this.f2739l != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f2734g);
                this.f2733f.p(this.f2739l, this.f2738k, arrayList);
            }
            this.f2738k.clear();
            this.f2738k.add(this.f2734g);
        }
    }
}
