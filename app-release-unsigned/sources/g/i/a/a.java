package g.i.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import g.i.a.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2585f;

    /* renamed from: g  reason: collision with root package name */
    public Cursor f2586g;

    /* renamed from: h  reason: collision with root package name */
    public Context f2587h;

    /* renamed from: i  reason: collision with root package name */
    public int f2588i;

    /* renamed from: j  reason: collision with root package name */
    public C0081a f2589j;

    /* renamed from: k  reason: collision with root package name */
    public DataSetObserver f2590k;

    /* renamed from: l  reason: collision with root package name */
    public b f2591l;

    /* renamed from: g.i.a.a$a  reason: collision with other inner class name */
    public class C0081a extends ContentObserver {
        public C0081a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f2585f && (cursor = aVar.f2586g) != null && !cursor.isClosed()) {
                aVar.e = aVar.f2586g.requery();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.e = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        b bVar;
        boolean z2 = true;
        boolean z3 = z ? true : true;
        if (z3 && true) {
            z3 |= true;
            this.f2585f = true;
        } else {
            this.f2585f = false;
        }
        z2 = cursor == null ? false : z2;
        this.f2586g = cursor;
        this.e = z2;
        this.f2587h = context;
        this.f2588i = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if (z3 & true) {
            this.f2589j = new C0081a();
            bVar = new b();
        } else {
            bVar = null;
            this.f2589j = null;
        }
        this.f2590k = bVar;
        if (z2) {
            C0081a aVar = this.f2589j;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2590k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f2586g;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0081a aVar = this.f2589j;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f2590k;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f2586g = cursor;
            if (cursor != null) {
                C0081a aVar2 = this.f2589j;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f2590k;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f2588i = cursor.getColumnIndexOrThrow("_id");
                this.e = true;
                notifyDataSetChanged();
            } else {
                this.f2588i = -1;
                this.e = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.e || (cursor = this.f2586g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.e) {
            return null;
        }
        this.f2586g.moveToPosition(i2);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.o.inflate(cVar.n, viewGroup, false);
        }
        a(view, this.f2587h, this.f2586g);
        return view;
    }

    public Filter getFilter() {
        if (this.f2591l == null) {
            this.f2591l = new b(this);
        }
        return this.f2591l;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.e || (cursor = this.f2586g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f2586g;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.e || (cursor = this.f2586g) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f2586g.getLong(this.f2588i);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2586g.moveToPosition(i2)) {
            if (view == null) {
                view = d(this.f2587h, this.f2586g, viewGroup);
            }
            a(view, this.f2587h, this.f2586g);
            return view;
        } else {
            throw new IllegalStateException(c.c.a.a.a.l("couldn't move cursor to position ", i2));
        }
    }
}
