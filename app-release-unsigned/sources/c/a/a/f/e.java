package c.a.a.f;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.d.a.m.x.c.r;
import c.d.a.q.f;
import com.tsuga.news.R;
import com.tsuga.news.ReadNewsActivity;
import g.l.b.m;
import g.n.v;
import i.d;
import i.s.b.l;
import i.s.c.h;
import i.s.c.i;
import i.s.c.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class e extends m {
    public static final /* synthetic */ int X = 0;
    public c.a.a.c.e Y;
    public final i.c Z = h.a.t.a.E(d.NONE, new c(this, null, null, new b(this), null));

    public static final class a extends i implements l<c.a.a.b.d.a.a, i.m> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f403f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(1);
            this.f403f = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // i.s.b.l
        public i.m o(c.a.a.b.d.a.a aVar) {
            c.a.a.b.d.a.a aVar2 = aVar;
            h.e(aVar2, "it");
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", aVar2);
            new e().u0(bundle);
            Intent intent = new Intent(this.f403f.h(), ReadNewsActivity.class);
            intent.putExtra("data", aVar2);
            this.f403f.z0(intent);
            return i.m.a;
        }
    }

    public static final class b extends i implements i.s.b.a<l.a.b.a.a> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ m f404f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m mVar) {
            super(0);
            this.f404f = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public l.a.b.a.a c() {
            m mVar = this.f404f;
            h.e(mVar, "storeOwner");
            v g2 = mVar.g();
            h.d(g2, "storeOwner.viewModelStore");
            return new l.a.b.a.a(g2, mVar);
        }
    }

    public static final class c extends i implements i.s.b.a<f> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ m f405f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i.s.b.a f406g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m mVar, l.a.c.l.a aVar, i.s.b.a aVar2, i.s.b.a aVar3, i.s.b.a aVar4) {
            super(0);
            this.f405f = mVar;
            this.f406g = aVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public f c() {
            return h.a.t.a.w(this.f405f, null, null, this.f406g, p.a(f.class), null);
        }
    }

    public final void B0(boolean z) {
        ImageButton imageButton;
        int i2;
        Context context;
        if (z) {
            c.a.a.c.e eVar = this.Y;
            if (eVar != null) {
                imageButton = eVar.b;
                context = o0();
                i2 = R.drawable.ic_baseline_bookmark_24_white;
                Object obj = g.h.c.a.a;
            } else {
                h.k("binding");
                throw null;
            }
        } else {
            c.a.a.c.e eVar2 = this.Y;
            if (eVar2 != null) {
                imageButton = eVar2.b;
                context = o0();
                i2 = R.drawable.ic_baseline_bookmark_border_24;
                Object obj2 = g.h.c.a.a;
            } else {
                h.k("binding");
                throw null;
            }
        }
        imageButton.setImageDrawable(context.getDrawable(i2));
    }

    @Override // g.l.b.m
    public View R(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.read_news_fragment, viewGroup, false);
        int i2 = R.id.bottom_content;
        View findViewById = inflate.findViewById(R.id.bottom_content);
        if (findViewById != null) {
            i2 = R.id.btn_bookmark;
            ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.btn_bookmark);
            if (imageButton != null) {
                i2 = R.id.btn_read_more;
                Button button = (Button) inflate.findViewById(R.id.btn_read_more);
                if (button != null) {
                    i2 = R.id.container_content;
                    View findViewById2 = inflate.findViewById(R.id.container_content);
                    if (findViewById2 != null) {
                        i2 = R.id.container_top;
                        View findViewById3 = inflate.findViewById(R.id.container_top);
                        if (findViewById3 != null) {
                            i2 = R.id.iv_image;
                            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_image);
                            if (imageView != null) {
                                i2 = R.id.rv_news;
                                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_news);
                                if (recyclerView != null) {
                                    i2 = R.id.tv_content;
                                    TextView textView = (TextView) inflate.findViewById(R.id.tv_content);
                                    if (textView != null) {
                                        i2 = R.id.tv_date;
                                        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_date);
                                        if (textView2 != null) {
                                            i2 = R.id.tv_headline;
                                            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_headline);
                                            if (textView3 != null) {
                                                i2 = R.id.tv_source;
                                                TextView textView4 = (TextView) inflate.findViewById(R.id.tv_source);
                                                if (textView4 != null) {
                                                    i2 = R.id.tv_title;
                                                    TextView textView5 = (TextView) inflate.findViewById(R.id.tv_title);
                                                    if (textView5 != null) {
                                                        ScrollView scrollView = (ScrollView) inflate;
                                                        c.a.a.c.e eVar = new c.a.a.c.e(scrollView, findViewById, imageButton, button, findViewById2, findViewById3, imageView, recyclerView, textView, textView2, textView3, textView4, textView5);
                                                        h.d(eVar, "inflate(inflater, container, false)");
                                                        this.Y = eVar;
                                                        if (eVar != null) {
                                                            h.d(scrollView, "binding.root");
                                                            return scrollView;
                                                        }
                                                        h.k("binding");
                                                        throw null;
                                                    }
                                                }
                                            }
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

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0037 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0047 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.String] */
    @Override // g.l.b.m
    public void g0(View view, Bundle bundle) {
        c.a.a.b.d.a.a aVar;
        Object obj;
        String str;
        String str2;
        String str3;
        Date date;
        h.e(view, "view");
        c.a.a.b.e.b bVar = new c.a.a.b.e.b();
        bVar.e = new a(this);
        Bundle bundle2 = this.f2718k;
        if (bundle2 == null) {
            aVar = null;
        } else {
            aVar = (c.a.a.b.d.a.a) bundle2.getParcelable("data");
        }
        if (aVar != null) {
            B0(aVar.f378m);
        }
        c.a.a.c.e eVar = this.Y;
        if (eVar != null) {
            c.d.a.i d2 = c.d.a.b.d(view);
            if (aVar == null) {
                obj = null;
            } else {
                obj = aVar.f372g;
            }
            if (obj == null) {
                obj = "";
            }
            if (obj.length() == 0) {
                obj = Integer.valueOf((int) R.drawable.empty_news);
            }
            d2.m(obj).a(new f().v(new c.d.a.m.x.c.i(), new r(0.0f, 0.0f, 50.0f, 40.0f))).D(eVar.f387d);
            TextView textView = eVar.f391i;
            if (aVar == null) {
                str = null;
            } else {
                str = aVar.f375j;
            }
            textView.setText(str);
            TextView textView2 = eVar.f390h;
            if (aVar == null) {
                str2 = null;
            } else {
                str2 = aVar.f374i;
            }
            textView2.setText(str2);
            TextView textView3 = eVar.f388f;
            if (aVar == null) {
                str3 = null;
            } else {
                str3 = aVar.f377l;
            }
            textView3.setText(str3);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", new Locale("id", "ID"));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMMM yyyy", new Locale("id", "ID"));
            if (aVar == null) {
                date = null;
            } else {
                date = simpleDateFormat.parse(aVar.e);
            }
            eVar.f389g.setText(String.valueOf(date == null ? null : simpleDateFormat2.format(date)));
            eVar.b.setOnClickListener(new a(aVar, this));
            eVar.f386c.setOnClickListener(new b(this, aVar));
            ((f) this.Z.getValue()).f408d.d(E(), new c(bVar));
            c.a.a.c.e eVar2 = this.Y;
            if (eVar2 != null) {
                RecyclerView recyclerView = eVar2.e;
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(bVar);
                return;
            }
            h.k("binding");
            throw null;
        }
        h.k("binding");
        throw null;
    }
}
