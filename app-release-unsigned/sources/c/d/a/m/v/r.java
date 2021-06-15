package c.d.a.m.v;

import android.util.Log;
import c.d.a.m.m;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class r extends Exception {
    public static final StackTraceElement[] e = new StackTraceElement[0];

    /* renamed from: f  reason: collision with root package name */
    public final List<Throwable> f967f;

    /* renamed from: g  reason: collision with root package name */
    public m f968g;

    /* renamed from: h  reason: collision with root package name */
    public c.d.a.m.a f969h;

    /* renamed from: i  reason: collision with root package name */
    public Class<?> f970i;

    /* renamed from: j  reason: collision with root package name */
    public String f971j;

    public static final class a implements Appendable {
        public final Appendable e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f972f = true;

        public a(Appendable appendable) {
            this.e = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) {
            boolean z = false;
            if (this.f972f) {
                this.f972f = false;
                this.e.append("  ");
            }
            if (c2 == '\n') {
                z = true;
            }
            this.f972f = z;
            this.e.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i2, int i3) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f972f) {
                this.f972f = false;
                this.e.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i3 - 1) == '\n') {
                z = true;
            }
            this.f972f = z;
            this.e.append(charSequence, i2, i3);
            return this;
        }
    }

    public r(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.f971j = str;
        setStackTrace(e);
        this.f967f = emptyList;
    }

    public r(String str, List<Throwable> list) {
        this.f971j = str;
        setStackTrace(e);
        this.f967f = list;
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof r) {
                ((r) th).f(appendable);
            } else {
                d(th, appendable);
            }
            i2 = i3;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (th instanceof r) {
            for (Throwable th2 : ((r) th).f967f) {
                a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    public void e(String str) {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder f2 = c.c.a.a.a.f("Root cause (");
            int i3 = i2 + 1;
            f2.append(i3);
            f2.append(" of ");
            f2.append(size);
            f2.append(")");
            Log.i(str, f2.toString(), (Throwable) arrayList.get(i2));
            i2 = i3;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f967f, new a(appendable));
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f971j);
        String str4 = "";
        if (this.f970i != null) {
            StringBuilder f2 = c.c.a.a.a.f(", ");
            f2.append(this.f970i);
            str = f2.toString();
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f969h != null) {
            StringBuilder f3 = c.c.a.a.a.f(", ");
            f3.append(this.f969h);
            str2 = f3.toString();
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f968g != null) {
            StringBuilder f4 = c.c.a.a.a.f(", ");
            f4.append(this.f968g);
            str4 = f4.toString();
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void printStackTrace() {
        f(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }

    public r(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.f971j = str;
        setStackTrace(e);
        this.f967f = singletonList;
    }
}
