package c.e.a.a.m;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

public class j extends RecyclerView.p {
    public final /* synthetic */ v a;
    public final /* synthetic */ MaterialButton b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f1251c;

    public j(g gVar, v vVar, MaterialButton materialButton) {
        this.f1251c = gVar;
        this.a = vVar;
        this.b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b(RecyclerView recyclerView, int i2, int i3) {
        LinearLayoutManager C0 = this.f1251c.C0();
        int j1 = i2 < 0 ? C0.j1() : C0.k1();
        this.f1251c.c0 = this.a.e(j1);
        MaterialButton materialButton = this.b;
        v vVar = this.a;
        materialButton.setText(vVar.e.e.o(j1).n(vVar.f1266d));
    }
}
