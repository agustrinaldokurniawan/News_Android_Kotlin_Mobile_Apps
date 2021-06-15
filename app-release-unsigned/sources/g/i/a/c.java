package g.i.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    /* renamed from: m  reason: collision with root package name */
    public int f2592m;
    public int n;
    public LayoutInflater o;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, null, z);
        this.n = i2;
        this.f2592m = i2;
        this.o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // g.i.a.a
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.o.inflate(this.f2592m, viewGroup, false);
    }
}
