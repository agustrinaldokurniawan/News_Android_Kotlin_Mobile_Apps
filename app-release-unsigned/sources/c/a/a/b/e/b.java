package c.a.a.b.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import c.d.a.i;
import c.d.a.m.x.c.z;
import c.d.a.q.f;
import com.tsuga.news.R;
import i.m;
import i.s.b.l;
import i.s.c.h;
import java.util.ArrayList;
import java.util.List;

public final class b extends RecyclerView.d<a> {

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<c.a.a.b.d.a.a> f380d = new ArrayList<>();
    public l<? super c.a.a.b.d.a.a, m> e;

    public final class a extends RecyclerView.z {
        public final c.a.a.b.c.a u;
        public final /* synthetic */ b v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view) {
            super(view);
            h.e(bVar, "this$0");
            h.e(view, "itemView");
            this.v = bVar;
            int i2 = R.id.iv_image;
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
            if (imageView != null) {
                i2 = R.id.tv_content;
                TextView textView = (TextView) view.findViewById(R.id.tv_content);
                if (textView != null) {
                    i2 = R.id.tv_title;
                    TextView textView2 = (TextView) view.findViewById(R.id.tv_title);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        c.a.a.b.c.a aVar = new c.a.a.b.c.a(constraintLayout, imageView, textView, textView2);
                        h.d(aVar, "bind(itemView)");
                        this.u = aVar;
                        constraintLayout.setOnClickListener(new a(bVar, this));
                        return;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public int a() {
        return this.f380d.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$z, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public void c(a aVar, int i2) {
        a aVar2 = aVar;
        h.e(aVar2, "holder");
        c.a.a.b.d.a.a aVar3 = this.f380d.get(i2);
        h.d(aVar3, "listData[position]");
        c.a.a.b.d.a.a aVar4 = aVar3;
        h.e(aVar4, "data");
        c.a.a.b.c.a aVar5 = aVar2.u;
        i d2 = c.d.a.b.d(aVar2.b);
        String str = aVar4.f372g;
        boolean z = true;
        boolean z2 = str.length() == 0;
        Integer num = str;
        if (z2) {
            num = Integer.valueOf((int) R.drawable.empty_news);
        }
        ((c.d.a.h) d2.m(num).k(R.drawable.empty_news)).a(new f().v(new c.d.a.m.x.c.i(), new z(13))).D(aVar5.b);
        TextView textView = aVar5.f370d;
        String str2 = aVar4.f375j;
        if (str2.length() == 0) {
            str2 = "[Empty Title]";
        }
        textView.setText(str2);
        TextView textView2 = aVar5.f369c;
        String str3 = aVar4.f373h;
        if (str3.length() != 0) {
            z = false;
        }
        if (z) {
            str3 = "[Empty Description]";
        }
        textView2.setText(str3);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$z' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public a d(ViewGroup viewGroup, int i2) {
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_item, viewGroup, false);
        h.d(inflate, "from(parent.context).inflate(R.layout.news_item, parent, false)");
        return new a(this, inflate);
    }

    public final void e(List<c.a.a.b.d.a.a> list) {
        if (list != null) {
            this.f380d.clear();
            this.f380d.addAll(list);
            this.a.b();
        }
    }
}
