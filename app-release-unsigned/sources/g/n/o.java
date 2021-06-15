package g.n;

import androidx.lifecycle.LiveData;

public class o<T> extends LiveData<T> {
    @Override // androidx.lifecycle.LiveData
    public void h(T t) {
        LiveData.a("setValue");
        this.f192h++;
        this.f190f = t;
        c(null);
    }
}
