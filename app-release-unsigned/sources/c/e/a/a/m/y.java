package c.e.a.a.m;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g.q.c.o;

public class y extends LinearLayoutManager {

    public class a extends o {
        public a(y yVar, Context context) {
            super(context);
        }

        @Override // g.q.c.o
        public float f(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public y(Context context, int i2, boolean z) {
        super(i2, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public void W0(RecyclerView recyclerView, RecyclerView.w wVar, int i2) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.a = i2;
        X0(aVar);
    }
}
