package i.r;

import i.s.c.h;
import i.t.b;
import i.t.c;
import java.lang.reflect.Method;

public class a {

    /* renamed from: i.r.a$a  reason: collision with other inner class name */
    public static final class C0120a {
        public static final Method a;

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
            if (i.s.c.h.a(r6, java.lang.Throwable.class) != false) goto L_0x0040;
         */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                i.s.c.h.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x000e:
                java.lang.String r5 = "it"
                r6 = 0
                if (r4 >= r2) goto L_0x0047
                r7 = r1[r4]
                i.s.c.h.d(r7, r5)
                java.lang.String r8 = r7.getName()
                java.lang.String r9 = "addSuppressed"
                boolean r8 = i.s.c.h.a(r8, r9)
                r9 = 1
                if (r8 == 0) goto L_0x003f
                java.lang.Class[] r8 = r7.getParameterTypes()
                java.lang.String r10 = "it.parameterTypes"
                i.s.c.h.d(r8, r10)
                java.lang.String r10 = "$this$singleOrNull"
                i.s.c.h.e(r8, r10)
                int r10 = r8.length
                if (r10 != r9) goto L_0x0038
                r6 = r8[r3]
            L_0x0038:
                boolean r6 = i.s.c.h.a(r6, r0)
                if (r6 == 0) goto L_0x003f
                goto L_0x0040
            L_0x003f:
                r9 = r3
            L_0x0040:
                if (r9 == 0) goto L_0x0044
                r6 = r7
                goto L_0x0047
            L_0x0044:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x0047:
                i.r.a.C0120a.a = r6
                int r0 = r1.length
            L_0x004a:
                if (r3 >= r0) goto L_0x0061
                r2 = r1[r3]
                i.s.c.h.d(r2, r5)
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = i.s.c.h.a(r2, r4)
                if (r2 == 0) goto L_0x005e
                goto L_0x0061
            L_0x005e:
                int r3 = r3 + 1
                goto L_0x004a
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.r.a.C0120a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        h.e(th, "cause");
        h.e(th2, "exception");
        Method method = C0120a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public c b() {
        return new b();
    }
}
