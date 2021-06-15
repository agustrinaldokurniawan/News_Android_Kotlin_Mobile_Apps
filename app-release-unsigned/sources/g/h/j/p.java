package g.h.j;

import android.view.View;
import g.h.j.o;

public class p extends o.b<Boolean> {
    public p(int i2, Class cls, int i3) {
        super(i2, cls, i3);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // g.h.j.o.b
    public Boolean b(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
