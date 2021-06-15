package com.tsuga.news.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.c.d;
import com.tsuga.news.R;
import com.tsuga.news.ReadNewsActivity;
import g.l.b.m;
import g.n.v;
import i.s.b.l;
import i.s.c.h;
import i.s.c.i;
import i.s.c.p;
import java.util.Objects;

public final class HomeFragment extends m {
    public static final /* synthetic */ int X = 0;
    public d Y;
    public final i.c Z = h.a.t.a.E(i.d.NONE, new c(this, null, null, new b(this), null));

    public static final class a extends i implements l<c.a.a.b.d.a.a, i.m> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ HomeFragment f1746f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(HomeFragment homeFragment) {
            super(1);
            this.f1746f = homeFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // i.s.b.l
        public i.m o(c.a.a.b.d.a.a aVar) {
            c.a.a.b.d.a.a aVar2 = aVar;
            h.e(aVar2, "it");
            HomeFragment homeFragment = this.f1746f;
            int i2 = HomeFragment.X;
            Objects.requireNonNull(homeFragment);
            Intent intent = new Intent(homeFragment.h(), ReadNewsActivity.class);
            intent.putExtra("data", aVar2);
            homeFragment.z0(intent);
            return i.m.a;
        }
    }

    public static final class b extends i implements i.s.b.a<l.a.b.a.a> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ m f1747f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m mVar) {
            super(0);
            this.f1747f = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public l.a.b.a.a c() {
            m mVar = this.f1747f;
            h.e(mVar, "storeOwner");
            v g2 = mVar.g();
            h.d(g2, "storeOwner.viewModelStore");
            return new l.a.b.a.a(g2, mVar);
        }
    }

    public static final class c extends i implements i.s.b.a<c.a.a.e.c> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ m f1748f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i.s.b.a f1749g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m mVar, l.a.c.l.a aVar, i.s.b.a aVar2, i.s.b.a aVar3, i.s.b.a aVar4) {
            super(0);
            this.f1748f = mVar;
            this.f1749g = aVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public c.a.a.e.c c() {
            return h.a.t.a.w(this.f1748f, null, null, this.f1749g, p.a(c.a.a.e.c.class), null);
        }
    }

    @Override // g.l.b.m
    public View R(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.home_fragment, viewGroup, false);
        int i2 = R.id.btn_read_more;
        Button button = (Button) inflate.findViewById(R.id.btn_read_more);
        if (button != null) {
            i2 = R.id.container_top;
            View findViewById = inflate.findViewById(R.id.container_top);
            if (findViewById != null) {
                i2 = R.id.iv_image;
                ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_image);
                if (imageView != null) {
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
                                    i2 = R.id.tv_source;
                                    TextView textView3 = (TextView) inflate.findViewById(R.id.tv_source);
                                    if (textView3 != null) {
                                        i2 = R.id.tv_title;
                                        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_title);
                                        if (textView4 != null) {
                                            ScrollView scrollView = (ScrollView) inflate;
                                            d dVar = new d(scrollView, button, findViewById, imageView, progressBar, recyclerView, textView, textView2, textView3, textView4);
                                            this.Y = dVar;
                                            if (dVar == null) {
                                                return null;
                                            }
                                            return scrollView;
                                        }
                                    }
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
        h.e(view, "view");
        if (h() != null) {
            c.a.a.b.e.b bVar = new c.a.a.b.e.b();
            bVar.e = new a(this);
            ((c.a.a.e.c) this.Z.getValue()).f400c.d(E(), new c.a.a.e.a(this, bVar, view));
            d dVar = this.Y;
            if (dVar != null) {
                RecyclerView recyclerView = dVar.e;
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(bVar);
            }
        }
    }
}
