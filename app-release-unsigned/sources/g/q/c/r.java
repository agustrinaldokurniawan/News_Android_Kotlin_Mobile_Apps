package g.q.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class r extends s {
    public r(RecyclerView.l lVar) {
        super(lVar, null);
    }

    @Override // g.q.c.s
    public int b(View view) {
        return this.a.B(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).bottomMargin;
    }

    @Override // g.q.c.s
    public int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.a.E(view) + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // g.q.c.s
    public int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.a.F(view) + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // g.q.c.s
    public int e(View view) {
        return this.a.H(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).topMargin;
    }

    @Override // g.q.c.s
    public int f() {
        return this.a.q;
    }

    @Override // g.q.c.s
    public int g() {
        RecyclerView.l lVar = this.a;
        return lVar.q - lVar.N();
    }

    @Override // g.q.c.s
    public int h() {
        return this.a.N();
    }

    @Override // g.q.c.s
    public int i() {
        return this.a.o;
    }

    @Override // g.q.c.s
    public int j() {
        return this.a.n;
    }

    @Override // g.q.c.s
    public int k() {
        return this.a.Q();
    }

    @Override // g.q.c.s
    public int l() {
        RecyclerView.l lVar = this.a;
        return (lVar.q - lVar.Q()) - this.a.N();
    }

    @Override // g.q.c.s
    public int n(View view) {
        this.a.V(view, true, this.f2949c);
        return this.f2949c.bottom;
    }

    @Override // g.q.c.s
    public int o(View view) {
        this.a.V(view, true, this.f2949c);
        return this.f2949c.top;
    }

    @Override // g.q.c.s
    public void p(int i2) {
        this.a.c0(i2);
    }
}
