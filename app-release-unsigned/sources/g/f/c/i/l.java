package g.f.c.i;

import g.f.c.c;
import java.util.ArrayList;

public class l extends d {
    public ArrayList<d> l0 = new ArrayList<>();

    @Override // g.f.c.i.d
    public void D() {
        this.l0.clear();
        super.D();
    }

    @Override // g.f.c.i.d
    public void G(c cVar) {
        super.G(cVar);
        int size = this.l0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.l0.get(i2).G(cVar);
        }
    }

    public void S() {
        ArrayList<d> arrayList = this.l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = this.l0.get(i2);
                if (dVar instanceof l) {
                    ((l) dVar).S();
                }
            }
        }
    }
}
