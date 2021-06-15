package g.b.f.i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.tsuga.news.R;
import g.b.c.d;
import g.b.f.i.m;
import g.b.f.i.n;
import java.util.ArrayList;
import java.util.Objects;

public class e implements m, AdapterView.OnItemClickListener {
    public Context e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f1976f;

    /* renamed from: g  reason: collision with root package name */
    public g f1977g;

    /* renamed from: h  reason: collision with root package name */
    public ExpandedMenuView f1978h;

    /* renamed from: i  reason: collision with root package name */
    public m.a f1979i;

    /* renamed from: j  reason: collision with root package name */
    public a f1980j;

    public class a extends BaseAdapter {
        public int e = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.f1977g;
            i iVar = gVar.w;
            if (iVar != null) {
                gVar.i();
                ArrayList<i> arrayList = gVar.f1994k;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.get(i2) == iVar) {
                        this.e = i2;
                        return;
                    }
                }
            }
            this.e = -1;
        }

        /* renamed from: b */
        public i getItem(int i2) {
            g gVar = e.this.f1977g;
            gVar.i();
            ArrayList<i> arrayList = gVar.f1994k;
            Objects.requireNonNull(e.this);
            int i3 = i2 + 0;
            int i4 = this.e;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayList.get(i3);
        }

        public int getCount() {
            g gVar = e.this.f1977g;
            gVar.i();
            int size = gVar.f1994k.size();
            Objects.requireNonNull(e.this);
            int i2 = size + 0;
            return this.e < 0 ? i2 : i2 - 1;
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = e.this.f1976f.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((n.a) view).d(getItem(i2), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i2) {
        this.e = context;
        this.f1976f = LayoutInflater.from(context);
    }

    @Override // g.b.f.i.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.f1979i;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public ListAdapter b() {
        if (this.f1980j == null) {
            this.f1980j = new a();
        }
        return this.f1980j;
    }

    @Override // g.b.f.i.m
    public boolean c() {
        return false;
    }

    @Override // g.b.f.i.m
    public void d(Context context, g gVar) {
        if (this.e != null) {
            this.e = context;
            if (this.f1976f == null) {
                this.f1976f = LayoutInflater.from(context);
            }
        }
        this.f1977g = gVar;
        a aVar = this.f1980j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // g.b.f.i.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // g.b.f.i.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // g.b.f.i.m
    public void h(m.a aVar) {
        this.f1979i = aVar;
    }

    @Override // g.b.f.i.m
    public boolean i(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        h hVar = new h(rVar);
        d.a aVar = new d.a(rVar.b);
        e eVar = new e(aVar.a.a, R.layout.abc_list_menu_item_layout);
        hVar.f1998g = eVar;
        eVar.f1979i = hVar;
        g gVar = hVar.e;
        gVar.b(eVar, gVar.b);
        ListAdapter b = hVar.f1998g.b();
        AlertController.b bVar = aVar.a;
        bVar.f52g = b;
        bVar.f53h = hVar;
        View view = rVar.p;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f49c = rVar.o;
            bVar.f50d = rVar.n;
        }
        bVar.f51f = hVar;
        d a2 = aVar.a();
        hVar.f1997f = a2;
        a2.setOnDismissListener(hVar);
        WindowManager.LayoutParams attributes = hVar.f1997f.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hVar.f1997f.show();
        m.a aVar2 = this.f1979i;
        if (aVar2 == null) {
            return true;
        }
        aVar2.b(rVar);
        return true;
    }

    @Override // g.b.f.i.m
    public void j(boolean z) {
        a aVar = this.f1980j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f1977g.s(this.f1980j.getItem(i2), this, 0);
    }
}
