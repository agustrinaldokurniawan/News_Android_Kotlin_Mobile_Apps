package g.q.c;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class k extends y {

    /* renamed from: h  reason: collision with root package name */
    public static TimeInterpolator f2908h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2909i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2910j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<b> f2911k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<a> f2912l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.z>> f2913m = new ArrayList<>();
    public ArrayList<ArrayList<b>> n = new ArrayList<>();
    public ArrayList<ArrayList<a>> o = new ArrayList<>();
    public ArrayList<RecyclerView.z> p = new ArrayList<>();
    public ArrayList<RecyclerView.z> q = new ArrayList<>();
    public ArrayList<RecyclerView.z> r = new ArrayList<>();
    public ArrayList<RecyclerView.z> s = new ArrayList<>();

    public static class a {
        public RecyclerView.z a;
        public RecyclerView.z b;

        /* renamed from: c  reason: collision with root package name */
        public int f2914c;

        /* renamed from: d  reason: collision with root package name */
        public int f2915d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f2916f;

        public a(RecyclerView.z zVar, RecyclerView.z zVar2, int i2, int i3, int i4, int i5) {
            this.a = zVar;
            this.b = zVar2;
            this.f2914c = i2;
            this.f2915d = i3;
            this.e = i4;
            this.f2916f = i5;
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("ChangeInfo{oldHolder=");
            f2.append(this.a);
            f2.append(", newHolder=");
            f2.append(this.b);
            f2.append(", fromX=");
            f2.append(this.f2914c);
            f2.append(", fromY=");
            f2.append(this.f2915d);
            f2.append(", toX=");
            f2.append(this.e);
            f2.append(", toY=");
            f2.append(this.f2916f);
            f2.append('}');
            return f2.toString();
        }
    }

    public static class b {
        public RecyclerView.z a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f2917c;

        /* renamed from: d  reason: collision with root package name */
        public int f2918d;
        public int e;

        public b(RecyclerView.z zVar, int i2, int i3, int i4, int i5) {
            this.a = zVar;
            this.b = i2;
            this.f2917c = i3;
            this.f2918d = i4;
            this.e = i5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void e(RecyclerView.z zVar) {
        View view = zVar.b;
        view.animate().cancel();
        int size = this.f2911k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2911k.get(size).a == zVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(zVar);
                this.f2911k.remove(size);
            }
        }
        l(this.f2912l, zVar);
        if (this.f2909i.remove(zVar)) {
            view.setAlpha(1.0f);
            c(zVar);
        }
        if (this.f2910j.remove(zVar)) {
            view.setAlpha(1.0f);
            c(zVar);
        }
        int size2 = this.o.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList = this.o.get(size2);
            l(arrayList, zVar);
            if (arrayList.isEmpty()) {
                this.o.remove(size2);
            }
        }
        int size3 = this.n.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList2 = this.n.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.n.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f2913m.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.z> arrayList3 = this.f2913m.get(size5);
                if (arrayList3.remove(zVar)) {
                    view.setAlpha(1.0f);
                    c(zVar);
                    if (arrayList3.isEmpty()) {
                        this.f2913m.remove(size5);
                    }
                }
            } else {
                this.r.remove(zVar);
                this.p.remove(zVar);
                this.s.remove(zVar);
                this.q.remove(zVar);
                k();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void f() {
        int size = this.f2911k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.f2911k.get(size);
            View view = bVar.a.b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.a);
            this.f2911k.remove(size);
        }
        int size2 = this.f2909i.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.f2909i.get(size2));
            this.f2909i.remove(size2);
        }
        int size3 = this.f2910j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.z zVar = this.f2910j.get(size3);
            zVar.b.setAlpha(1.0f);
            c(zVar);
            this.f2910j.remove(size3);
        }
        int size4 = this.f2912l.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.f2912l.get(size4);
            RecyclerView.z zVar2 = aVar.a;
            if (zVar2 != null) {
                m(aVar, zVar2);
            }
            RecyclerView.z zVar3 = aVar.b;
            if (zVar3 != null) {
                m(aVar, zVar3);
            }
        }
        this.f2912l.clear();
        if (g()) {
            int size5 = this.n.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList<b> arrayList = this.n.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        b bVar2 = arrayList.get(size6);
                        View view2 = bVar2.a.b;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        c(bVar2.a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.n.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f2913m.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList<RecyclerView.z> arrayList2 = this.f2913m.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.z zVar4 = arrayList2.get(size8);
                        zVar4.b.setAlpha(1.0f);
                        c(zVar4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f2913m.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.o.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList<a> arrayList3 = this.o.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            a aVar2 = arrayList3.get(size10);
                            RecyclerView.z zVar5 = aVar2.a;
                            if (zVar5 != null) {
                                m(aVar2, zVar5);
                            }
                            RecyclerView.z zVar6 = aVar2.b;
                            if (zVar6 != null) {
                                m(aVar2, zVar6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.o.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    j(this.r);
                    j(this.q);
                    j(this.p);
                    j(this.s);
                    d();
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean g() {
        return !this.f2910j.isEmpty() || !this.f2912l.isEmpty() || !this.f2911k.isEmpty() || !this.f2909i.isEmpty() || !this.q.isEmpty() || !this.r.isEmpty() || !this.p.isEmpty() || !this.s.isEmpty() || !this.n.isEmpty() || !this.f2913m.isEmpty() || !this.o.isEmpty();
    }

    @Override // g.q.c.y
    public boolean i(RecyclerView.z zVar, int i2, int i3, int i4, int i5) {
        View view = zVar.b;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) zVar.b.getTranslationY());
        n(zVar);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(zVar);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.f2911k.add(new b(zVar, translationX, translationY, i4, i5));
        return true;
    }

    public void j(List<RecyclerView.z> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                list.get(size).b.animate().cancel();
            } else {
                return;
            }
        }
    }

    public void k() {
        if (!g()) {
            d();
        }
    }

    public final void l(List<a> list, RecyclerView.z zVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                a aVar = list.get(size);
                if (m(aVar, zVar) && aVar.a == null && aVar.b == null) {
                    list.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean m(a aVar, RecyclerView.z zVar) {
        if (aVar.b == zVar) {
            aVar.b = null;
        } else if (aVar.a != zVar) {
            return false;
        } else {
            aVar.a = null;
        }
        zVar.b.setAlpha(1.0f);
        zVar.b.setTranslationX(0.0f);
        zVar.b.setTranslationY(0.0f);
        c(zVar);
        return true;
    }

    public final void n(RecyclerView.z zVar) {
        if (f2908h == null) {
            f2908h = new ValueAnimator().getInterpolator();
        }
        zVar.b.animate().setInterpolator(f2908h);
        e(zVar);
    }
}
