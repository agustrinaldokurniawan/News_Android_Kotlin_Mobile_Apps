package g.h.j;

import android.view.View;
import g.h.j.o;

public class r extends o.b<CharSequence> {
    public r(int i2, Class cls, int i3, int i4) {
        super(i2, cls, i3, i4);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // g.h.j.o.b
    public CharSequence b(View view) {
        return view.getStateDescription();
    }
}
