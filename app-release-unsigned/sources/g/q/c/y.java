package g.q.c;

import androidx.recyclerview.widget.RecyclerView;
import g.q.c.k;

public abstract class y extends RecyclerView.i {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2954g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean a(RecyclerView.z zVar, RecyclerView.z zVar2, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.a;
        int i5 = cVar.b;
        if (zVar2.u()) {
            int i6 = cVar.a;
            i2 = cVar.b;
            i3 = i6;
        } else {
            i3 = cVar2.a;
            i2 = cVar2.b;
        }
        k kVar = (k) this;
        if (zVar == zVar2) {
            return kVar.i(zVar, i4, i5, i3, i2);
        }
        float translationX = zVar.b.getTranslationX();
        float translationY = zVar.b.getTranslationY();
        float alpha = zVar.b.getAlpha();
        kVar.n(zVar);
        zVar.b.setTranslationX(translationX);
        zVar.b.setTranslationY(translationY);
        zVar.b.setAlpha(alpha);
        kVar.n(zVar2);
        zVar2.b.setTranslationX((float) (-((int) (((float) (i3 - i4)) - translationX))));
        zVar2.b.setTranslationY((float) (-((int) (((float) (i2 - i5)) - translationY))));
        zVar2.b.setAlpha(0.0f);
        kVar.f2912l.add(new k.a(zVar, zVar2, i4, i5, i3, i2));
        return true;
    }

    public abstract boolean i(RecyclerView.z zVar, int i2, int i3, int i4, int i5);
}
