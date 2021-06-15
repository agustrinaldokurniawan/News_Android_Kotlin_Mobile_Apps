package c.f.a.f;

import android.view.View;
import android.view.ViewGroup;
import i.s.c.s.a;
import java.util.Iterator;

public final class h implements Iterator<View>, a {
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1558f;

    public h(ViewGroup viewGroup) {
        this.f1558f = viewGroup;
    }

    public boolean hasNext() {
        return this.e < this.f1558f.getChildCount();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public View next() {
        ViewGroup viewGroup = this.f1558f;
        int i2 = this.e;
        this.e = i2 + 1;
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public void remove() {
        ViewGroup viewGroup = this.f1558f;
        int i2 = this.e - 1;
        this.e = i2;
        viewGroup.removeViewAt(i2);
    }
}
