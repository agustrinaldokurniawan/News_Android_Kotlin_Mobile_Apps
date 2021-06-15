package c.e.b.a0.z;

import c.e.b.a0.p;
import c.e.b.c0.b;
import c.e.b.i;
import c.e.b.v;
import c.e.b.x;
import c.e.b.y;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class c extends x<Date> {
    public static final y a = new a();
    public final List<DateFormat> b;

    public class a implements y {
        @Override // c.e.b.y
        public <T> x<T> a(i iVar, c.e.b.b0.a<T> aVar) {
            if (aVar.a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (p.a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy" + " " + "h:mm:ss a", locale));
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.e.b.x
    public Date a(c.e.b.c0.a aVar) {
        Date date;
        if (aVar.p0() == b.NULL) {
            aVar.l0();
            return null;
        }
        String n0 = aVar.n0();
        synchronized (this) {
            Iterator<DateFormat> it = this.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        date = it.next().parse(n0);
                        break;
                    } catch (ParseException unused) {
                    }
                } else {
                    try {
                        date = c.e.b.a0.z.t.a.b(n0, new ParsePosition(0));
                        break;
                    } catch (ParseException e) {
                        throw new v(n0, e);
                    }
                }
            }
        }
        return date;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
    @Override // c.e.b.x
    public void b(c.e.b.c0.c cVar, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                cVar.b0();
            } else {
                cVar.k0(this.b.get(0).format(date2));
            }
        }
    }
}
