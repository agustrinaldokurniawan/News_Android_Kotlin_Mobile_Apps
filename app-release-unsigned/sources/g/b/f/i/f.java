package g.b.f.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import g.b.f.i.n;
import java.util.ArrayList;

public class f extends BaseAdapter {
    public g e;

    /* renamed from: f  reason: collision with root package name */
    public int f1982f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1983g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1984h;

    /* renamed from: i  reason: collision with root package name */
    public final LayoutInflater f1985i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1986j;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f1984h = z;
        this.f1985i = layoutInflater;
        this.e = gVar;
        this.f1986j = i2;
        a();
    }

    public void a() {
        g gVar = this.e;
        i iVar = gVar.w;
        if (iVar != null) {
            gVar.i();
            ArrayList<i> arrayList = gVar.f1994k;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList.get(i2) == iVar) {
                    this.f1982f = i2;
                    return;
                }
            }
        }
        this.f1982f = -1;
    }

    /* renamed from: b */
    public i getItem(int i2) {
        ArrayList<i> arrayList;
        if (this.f1984h) {
            g gVar = this.e;
            gVar.i();
            arrayList = gVar.f1994k;
        } else {
            arrayList = this.e.l();
        }
        int i3 = this.f1982f;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return arrayList.get(i2);
    }

    public int getCount() {
        ArrayList<i> arrayList;
        if (this.f1984h) {
            g gVar = this.e;
            gVar.i();
            arrayList = gVar.f1994k;
        } else {
            arrayList = this.e.l();
        }
        int i2 = this.f1982f;
        int size = arrayList.size();
        return i2 < 0 ? size : size - 1;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1985i.inflate(this.f1986j, viewGroup, false);
        }
        int i3 = getItem(i2).b;
        int i4 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.e.m() && i3 != (i4 >= 0 ? getItem(i4).b : i3));
        n.a aVar = (n.a) view;
        if (this.f1983g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i2), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
