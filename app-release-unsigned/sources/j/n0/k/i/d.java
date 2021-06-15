package j.n0.k.i;

import android.util.Log;
import c.c.a.a.a;
import i.s.c.h;
import i.x.e;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class d extends Handler {
    public static final d a = new d();

    @Override // java.util.logging.Handler
    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        int min;
        h.f(logRecord, "record");
        c cVar = c.f3696c;
        String loggerName = logRecord.getLoggerName();
        h.b(loggerName, "record.loggerName");
        int i2 = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        h.b(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        h.f(loggerName, "loggerName");
        h.f(message, "message");
        String str = c.b.get(loggerName);
        if (str == null) {
            int i3 = 23;
            h.e(loggerName, "$this$take");
            int length = loggerName.length();
            if (23 > length) {
                i3 = length;
            }
            str = loggerName.substring(0, i3);
            h.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(str, i2)) {
            if (thrown != null) {
                StringBuilder h2 = a.h(message, "\n");
                h2.append(Log.getStackTraceString(thrown));
                message = h2.toString();
            }
            int length2 = message.length();
            int i4 = 0;
            while (i4 < length2) {
                int i5 = e.i(message, '\n', i4, false, 4);
                if (i5 == -1) {
                    i5 = length2;
                }
                while (true) {
                    min = Math.min(i5, i4 + 4000);
                    String substring = message.substring(i4, min);
                    h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i2, str, substring);
                    if (min >= i5) {
                        break;
                    }
                    i4 = min;
                }
                i4 = min + 1;
            }
        }
    }
}
