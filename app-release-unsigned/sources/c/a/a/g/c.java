package c.a.a.g;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.c.f;
import com.airbnb.lottie.LottieAnimationView;
import com.tsuga.news.R;
import com.tsuga.news.ReadNewsActivity;
import g.l.b.m;
import g.n.v;
import i.s.b.l;
import i.s.c.h;
import i.s.c.i;
import i.s.c.p;
import java.util.List;
import java.util.Objects;

public final class c extends m {
    public static final /* synthetic */ int X = 0;
    public f Y;
    public final i.c Z = h.a.t.a.E(i.d.NONE, new d(this, null, null, new C0007c(this), null));

    public static final class a extends i implements l<c.a.a.b.d.a.a, i.m> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f409f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(1);
            this.f409f = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // i.s.b.l
        public i.m o(c.a.a.b.d.a.a aVar) {
            c.a.a.b.d.a.a aVar2 = aVar;
            h.e(aVar2, "it");
            Intent intent = new Intent(this.f409f.h(), ReadNewsActivity.class);
            intent.putExtra("data", aVar2);
            this.f409f.z0(intent);
            return i.m.a;
        }
    }

    public static final class b implements TextWatcher {
        public final /* synthetic */ c e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c.a.a.b.e.b f410f;

        public b(c cVar, c.a.a.b.e.b bVar) {
            this.e = cVar;
            this.f410f = bVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            d dVar = (d) this.e.Z.getValue();
            String valueOf = String.valueOf(charSequence);
            Objects.requireNonNull(dVar);
            h.e(valueOf, "keyword");
            g.n.m mVar = new g.n.m(dVar.f414c.c(valueOf));
            h.d(mVar, "fromPublisher(newsUseCase.getNewsByKeyword(keyword))");
            mVar.d(this.e.E(), new b(this.f410f, this.e));
        }
    }

    /* renamed from: c.a.a.g.c$c  reason: collision with other inner class name */
    public static final class C0007c extends i implements i.s.b.a<l.a.b.a.a> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ m f411f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0007c(m mVar) {
            super(0);
            this.f411f = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public l.a.b.a.a c() {
            m mVar = this.f411f;
            h.e(mVar, "storeOwner");
            v g2 = mVar.g();
            h.d(g2, "storeOwner.viewModelStore");
            return new l.a.b.a.a(g2, mVar);
        }
    }

    public static final class d extends i implements i.s.b.a<d> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ m f412f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i.s.b.a f413g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m mVar, l.a.c.l.a aVar, i.s.b.a aVar2, i.s.b.a aVar3, i.s.b.a aVar4) {
            super(0);
            this.f412f = mVar;
            this.f413g = aVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public d c() {
            return h.a.t.a.w(this.f412f, null, null, this.f413g, p.a(d.class), null);
        }
    }

    public final void B0(List<c.a.a.b.d.a.a> list) {
        int i2;
        LottieAnimationView lottieAnimationView = null;
        if (list.isEmpty()) {
            f fVar = this.Y;
            if (fVar != null) {
                lottieAnimationView = fVar.b;
            }
            if (lottieAnimationView != null) {
                i2 = 0;
            } else {
                return;
            }
        } else {
            f fVar2 = this.Y;
            if (fVar2 != null) {
                lottieAnimationView = fVar2.b;
            }
            if (lottieAnimationView != null) {
                i2 = 8;
            } else {
                return;
            }
        }
        lottieAnimationView.setVisibility(i2);
    }

    @Override // g.l.b.m
    public View R(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        View inflate = r().inflate(R.layout.search_fragment, viewGroup, false);
        int i2 = R.id.empty_search;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.empty_search);
        if (lottieAnimationView != null) {
            i2 = R.id.et_news;
            EditText editText = (EditText) inflate.findViewById(R.id.et_news);
            if (editText != null) {
                i2 = R.id.pg;
                ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.pg);
                if (progressBar != null) {
                    i2 = R.id.rv_news;
                    RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_news);
                    if (recyclerView != null) {
                        i2 = R.id.tv_error;
                        TextView textView = (TextView) inflate.findViewById(R.id.tv_error);
                        if (textView != null) {
                            i2 = R.id.tv_headline;
                            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_headline);
                            if (textView2 != null) {
                                i2 = R.id.tv_headline_desc;
                                TextView textView3 = (TextView) inflate.findViewById(R.id.tv_headline_desc);
                                if (textView3 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    f fVar = new f(constraintLayout, lottieAnimationView, editText, progressBar, recyclerView, textView, textView2, textView3);
                                    this.Y = fVar;
                                    if (fVar == null) {
                                        return null;
                                    }
                                    return constraintLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // g.l.b.m
    public void S() {
        this.H = true;
        this.Y = null;
    }

    @Override // g.l.b.m
    public void g0(View view, Bundle bundle) {
        EditText editText;
        h.e(view, "view");
        if (h() != null) {
            c.a.a.b.e.b bVar = new c.a.a.b.e.b();
            bVar.e = new a(this);
            d dVar = (d) this.Z.getValue();
            Objects.requireNonNull(dVar);
            h.e("", "keyword");
            g.n.m mVar = new g.n.m(dVar.f414c.c(""));
            h.d(mVar, "fromPublisher(newsUseCase.getNewsByKeyword(keyword))");
            mVar.d(E(), new a(bVar, this));
            f fVar = this.Y;
            if (!(fVar == null || (editText = fVar.f392c) == null)) {
                editText.addTextChangedListener(new b(this, bVar));
            }
            f fVar2 = this.Y;
            if (fVar2 != null) {
                RecyclerView recyclerView = fVar2.f393d;
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setAdapter(bVar);
            }
        }
    }
}
