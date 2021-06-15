package c.e.b.a0.z;

import c.e.b.c0.b;
import c.e.b.c0.c;
import c.e.b.i;
import c.e.b.v;
import c.e.b.x;
import c.e.b.y;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class l extends x<Time> {
    public static final y a = new a();
    public final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    public class a implements y {
        @Override // c.e.b.y
        public <T> x<T> a(i iVar, c.e.b.b0.a<T> aVar) {
            if (aVar.a == Time.class) {
                return new l();
            }
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.e.b.x
    public Time a(c.e.b.c0.a aVar) {
        synchronized (this) {
            if (aVar.p0() == b.NULL) {
                aVar.l0();
                return null;
            }
            try {
                return new Time(this.b.parse(aVar.n0()).getTime());
            } catch (ParseException e) {
                throw new v(e);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
    @Override // c.e.b.x
    public void b(c cVar, Time time) {
        Time time2 = time;
        synchronized (this) {
            cVar.k0(time2 == null ? null : this.b.format(time2));
        }
    }
}
