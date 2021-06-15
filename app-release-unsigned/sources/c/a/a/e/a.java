package c.a.a.e;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import c.a.a.b.b.n;
import c.a.a.b.e.b;
import c.a.a.c.d;
import c.d.a.i;
import c.d.a.m.x.c.r;
import c.d.a.q.f;
import com.tsuga.news.R;
import com.tsuga.news.home.HomeFragment;
import g.n.p;
import i.s.c.h;
import i.t.c;
import i.u.c;
import java.util.NoSuchElementException;

public final /* synthetic */ class a implements p {
    public final /* synthetic */ HomeFragment a;
    public final /* synthetic */ b b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f397c;

    public /* synthetic */ a(HomeFragment homeFragment, b bVar, View view) {
        this.a = homeFragment;
        this.b = bVar;
        this.f397c = view;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0093 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Integer] */
    @Override // g.n.p
    public final void a(Object obj) {
        ProgressBar progressBar;
        ProgressBar progressBar2;
        TextView textView;
        Button button;
        HomeFragment homeFragment = this.a;
        b bVar = this.b;
        View view = this.f397c;
        n nVar = (n) obj;
        int i2 = HomeFragment.X;
        h.e(homeFragment, "this$0");
        h.e(bVar, "$newsAdapter");
        h.e(view, "$view");
        if (nVar != null) {
            TextView textView2 = null;
            ProgressBar progressBar3 = null;
            TextView textView3 = null;
            if (nVar instanceof n.b) {
                d dVar = homeFragment.Y;
                if (dVar != null) {
                    progressBar3 = dVar.f382d;
                }
                if (progressBar3 != null) {
                    progressBar3.setVisibility(0);
                }
            } else if (nVar instanceof n.c) {
                d dVar2 = homeFragment.Y;
                if (dVar2 == null) {
                    progressBar2 = null;
                } else {
                    progressBar2 = dVar2.f382d;
                }
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
                bVar.e(nVar.a);
                if (nVar.a != null) {
                    T t = nVar.a;
                    h.c(t);
                    c cVar = new c(0, t.size() - 1);
                    c.a aVar = i.t.c.f3319f;
                    h.e(cVar, "$this$random");
                    h.e(aVar, "random");
                    try {
                        int L = h.a.t.a.L(aVar, cVar);
                        d dVar3 = homeFragment.Y;
                        if (dVar3 != null) {
                            i d2 = c.d.a.b.d(view);
                            T t2 = nVar.a;
                            h.c(t2);
                            Object obj2 = ((c.a.a.b.d.a.a) t2.get(L)).f372g;
                            if ((obj2.length() == 0 ? 1 : null) != null) {
                                obj2 = Integer.valueOf((int) R.drawable.empty_news);
                            }
                            d2.m(obj2).a(new f().v(new c.d.a.m.x.c.i(), new r(0.0f, 0.0f, 50.0f, 40.0f))).D(dVar3.f381c);
                        }
                        d dVar4 = homeFragment.Y;
                        if (dVar4 == null) {
                            textView = null;
                        } else {
                            textView = dVar4.f385h;
                        }
                        if (textView != null) {
                            T t3 = nVar.a;
                            h.c(t3);
                            textView.setText(((c.a.a.b.d.a.a) t3.get(L)).f375j);
                        }
                        d dVar5 = homeFragment.Y;
                        if (dVar5 != null) {
                            textView3 = dVar5.f384g;
                        }
                        if (textView3 != null) {
                            T t4 = nVar.a;
                            h.c(t4);
                            textView3.setText(((c.a.a.b.d.a.a) t4.get(L)).f374i);
                        }
                        d dVar6 = homeFragment.Y;
                        if (dVar6 != null && (button = dVar6.b) != null) {
                            button.setOnClickListener(new b(homeFragment, nVar, L));
                        }
                    } catch (IllegalArgumentException e) {
                        throw new NoSuchElementException(e.getMessage());
                    }
                }
            } else if (nVar instanceof n.a) {
                d dVar7 = homeFragment.Y;
                if (dVar7 == null) {
                    progressBar = null;
                } else {
                    progressBar = dVar7.f382d;
                }
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                d dVar8 = homeFragment.Y;
                if (dVar8 != null) {
                    textView2 = dVar8.f383f;
                }
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
        }
    }
}
