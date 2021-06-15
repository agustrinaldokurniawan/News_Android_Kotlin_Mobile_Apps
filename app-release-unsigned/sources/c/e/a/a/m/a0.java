package c.e.a.a.m;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public class a0 {
    public static AtomicReference<z> a = new AtomicReference<>();

    public static long a(long j2) {
        Calendar e = e();
        e.setTimeInMillis(j2);
        return b(e).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar f2 = f(calendar);
        Calendar e = e();
        e.set(f2.get(1), f2.get(2), f2.get(5));
        return e;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        z zVar = a.get();
        if (zVar == null) {
            zVar = z.a;
        }
        TimeZone timeZone = zVar.f1270c;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = zVar.b;
        if (l2 != null) {
            instance.setTimeInMillis(l2.longValue());
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(c());
        return instance;
    }

    public static Calendar e() {
        return f(null);
    }

    public static Calendar f(Calendar calendar) {
        Calendar instance = Calendar.getInstance(c());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
