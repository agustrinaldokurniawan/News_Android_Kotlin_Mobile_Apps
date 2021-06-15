package c.b.a.a0.c;

import android.graphics.Path;
import c.b.a.c0.k.f;
import c.b.a.c0.k.k;
import java.util.ArrayList;
import java.util.List;

public class g {
    public final List<a<k, Path>> a;
    public final List<a<Integer, Integer>> b;

    /* renamed from: c  reason: collision with root package name */
    public final List<f> f495c;

    public g(List<f> list) {
        this.f495c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.add(list.get(i2).b.a());
            this.b.add(list.get(i2).f563c.a());
        }
    }
}
