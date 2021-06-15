package c.d.a.k;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Closeable {
    public final File e;

    /* renamed from: f  reason: collision with root package name */
    public final File f767f;

    /* renamed from: g  reason: collision with root package name */
    public final File f768g;

    /* renamed from: h  reason: collision with root package name */
    public final File f769h;

    /* renamed from: i  reason: collision with root package name */
    public final int f770i;

    /* renamed from: j  reason: collision with root package name */
    public long f771j;

    /* renamed from: k  reason: collision with root package name */
    public final int f772k;

    /* renamed from: l  reason: collision with root package name */
    public long f773l = 0;

    /* renamed from: m  reason: collision with root package name */
    public Writer f774m;
    public final LinkedHashMap<String, d> n = new LinkedHashMap<>(0, 0.75f, true);
    public int o;
    public long p = 0;
    public final ThreadPoolExecutor q = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    public final Callable<Void> r = new CallableC0012a();

    /* renamed from: c.d.a.k.a$a  reason: collision with other inner class name */
    public class CallableC0012a implements Callable<Void> {
        public CallableC0012a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.f774m != null) {
                    aVar.i0();
                    if (a.this.V()) {
                        a.this.g0();
                        a.this.o = 0;
                    }
                }
            }
            return null;
        }
    }

    public static final class b implements ThreadFactory {
        public b(CallableC0012a aVar) {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {
        public final d a;
        public final boolean[] b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f775c;

        public c(d dVar, CallableC0012a aVar) {
            boolean[] zArr;
            this.a = dVar;
            if (dVar.e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f772k];
            }
            this.b = zArr;
        }

        public void a() {
            a.b(a.this, this, false);
        }

        public File b(int i2) {
            File file;
            synchronized (a.this) {
                d dVar = this.a;
                if (dVar.f779f == this) {
                    if (!dVar.e) {
                        this.b[i2] = true;
                    }
                    file = dVar.f778d[i2];
                    a.this.e.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    public final class d {
        public final String a;
        public final long[] b;

        /* renamed from: c  reason: collision with root package name */
        public File[] f777c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f778d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public c f779f;

        /* renamed from: g  reason: collision with root package name */
        public long f780g;

        public d(String str, CallableC0012a aVar) {
            this.a = str;
            int i2 = a.this.f772k;
            this.b = new long[i2];
            this.f777c = new File[i2];
            this.f778d = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i3 = 0; i3 < a.this.f772k; i3++) {
                sb.append(i3);
                this.f777c[i3] = new File(a.this.e, sb.toString());
                sb.append(".tmp");
                this.f778d[i3] = new File(a.this.e, sb.toString());
                sb.setLength(length);
            }
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.b;
            for (long j2 : jArr) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        public final IOException b(String[] strArr) {
            StringBuilder f2 = c.c.a.a.a.f("unexpected journal line: ");
            f2.append(Arrays.toString(strArr));
            throw new IOException(f2.toString());
        }
    }

    public final class e {
        public final File[] a;

        public e(a aVar, String str, long j2, File[] fileArr, long[] jArr, CallableC0012a aVar2) {
            this.a = fileArr;
        }
    }

    public a(File file, int i2, int i3, long j2) {
        this.e = file;
        this.f770i = i2;
        this.f767f = new File(file, "journal");
        this.f768g = new File(file, "journal.tmp");
        this.f769h = new File(file, "journal.bkp");
        this.f772k = i3;
        this.f771j = j2;
    }

    @TargetApi(26)
    public static void K(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void b(a aVar, c cVar, boolean z) {
        synchronized (aVar) {
            d dVar = cVar.a;
            if (dVar.f779f == cVar) {
                if (z && !dVar.e) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= aVar.f772k) {
                            break;
                        } else if (!cVar.b[i2]) {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                        } else if (!dVar.f778d[i2].exists()) {
                            cVar.a();
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < aVar.f772k; i3++) {
                    File file = dVar.f778d[i3];
                    if (!z) {
                        n(file);
                    } else if (file.exists()) {
                        File file2 = dVar.f777c[i3];
                        file.renameTo(file2);
                        long j2 = dVar.b[i3];
                        long length = file2.length();
                        dVar.b[i3] = length;
                        aVar.f773l = (aVar.f773l - j2) + length;
                    }
                }
                aVar.o++;
                dVar.f779f = null;
                if (dVar.e || z) {
                    dVar.e = true;
                    aVar.f774m.append((CharSequence) "CLEAN");
                    aVar.f774m.append(' ');
                    aVar.f774m.append((CharSequence) dVar.a);
                    aVar.f774m.append((CharSequence) dVar.a());
                    aVar.f774m.append('\n');
                    if (z) {
                        long j3 = aVar.p;
                        aVar.p = 1 + j3;
                        dVar.f780g = j3;
                    }
                } else {
                    aVar.n.remove(dVar.a);
                    aVar.f774m.append((CharSequence) "REMOVE");
                    aVar.f774m.append(' ');
                    aVar.f774m.append((CharSequence) dVar.a);
                    aVar.f774m.append('\n');
                }
                K(aVar.f774m);
                if (aVar.f773l > aVar.f771j || aVar.V()) {
                    aVar.q.submit(aVar.r);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public static a b0(File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    h0(file2, file3, false);
                }
            }
            a aVar = new a(file, i2, i3, j2);
            if (aVar.f767f.exists()) {
                try {
                    aVar.e0();
                    aVar.d0();
                    return aVar;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.e);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, i2, i3, j2);
            aVar2.g0();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    @TargetApi(26)
    public static void e(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void h0(File file, File file2, boolean z) {
        if (z) {
            n(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void n(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized e Q(String str) {
        c();
        d dVar = this.n.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.f777c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.o++;
        this.f774m.append((CharSequence) "READ");
        this.f774m.append(' ');
        this.f774m.append((CharSequence) str);
        this.f774m.append('\n');
        if (V()) {
            this.q.submit(this.r);
        }
        return new e(this, str, dVar.f780g, dVar.f777c, dVar.b, null);
    }

    public final boolean V() {
        int i2 = this.o;
        return i2 >= 2000 && i2 >= this.n.size();
    }

    public final void c() {
        if (this.f774m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f774m != null) {
            Iterator it = new ArrayList(this.n.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f779f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            i0();
            e(this.f774m);
            this.f774m = null;
        }
    }

    public final void d0() {
        n(this.f768g);
        Iterator<d> it = this.n.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f779f == null) {
                while (i2 < this.f772k) {
                    this.f773l += next.b[i2];
                    i2++;
                }
            } else {
                next.f779f = null;
                while (i2 < this.f772k) {
                    n(next.f777c[i2]);
                    n(next.f778d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void e0() {
        b bVar = new b(new FileInputStream(this.f767f), c.a);
        try {
            String c2 = bVar.c();
            String c3 = bVar.c();
            String c4 = bVar.c();
            String c5 = bVar.c();
            String c6 = bVar.c();
            if (!"libcore.io.DiskLruCache".equals(c2) || !"1".equals(c3) || !Integer.toString(this.f770i).equals(c4) || !Integer.toString(this.f772k).equals(c5) || !"".equals(c6)) {
                throw new IOException("unexpected journal header: [" + c2 + ", " + c3 + ", " + c5 + ", " + c6 + "]");
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                try {
                    f0(bVar.c());
                    i2++;
                } catch (EOFException unused) {
                    this.o = i2 - this.n.size();
                    if (bVar.f785i == -1) {
                        z = true;
                    }
                    if (z) {
                        g0();
                    } else {
                        this.f774m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f767f, true), c.a));
                    }
                    try {
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } finally {
            try {
                bVar.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
        }
    }

    public final void f0(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.n.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            d dVar = this.n.get(str2);
            if (dVar == null) {
                dVar = new d(str2, null);
                this.n.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.e = true;
                dVar.f779f = null;
                if (split.length == a.this.f772k) {
                    for (int i3 = 0; i3 < split.length; i3++) {
                        try {
                            dVar.b[i3] = Long.parseLong(split[i3]);
                        } catch (NumberFormatException unused) {
                            dVar.b(split);
                            throw null;
                        }
                    }
                    return;
                }
                dVar.b(split);
                throw null;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f779f = new c(dVar, null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(c.c.a.a.a.q("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(c.c.a.a.a.q("unexpected journal line: ", str));
        }
    }

    public final synchronized void g0() {
        Writer writer = this.f774m;
        if (writer != null) {
            e(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f768g), c.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f770i));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f772k));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.n.values()) {
                bufferedWriter.write(dVar.f779f != null ? "DIRTY " + dVar.a + '\n' : "CLEAN " + dVar.a + dVar.a() + '\n');
            }
            e(bufferedWriter);
            if (this.f767f.exists()) {
                h0(this.f767f, this.f769h, true);
            }
            h0(this.f768g, this.f767f, false);
            this.f769h.delete();
            this.f774m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f767f, true), c.a));
        } catch (Throwable th) {
            e(bufferedWriter);
            throw th;
        }
    }

    public final void i0() {
        while (this.f773l > this.f771j) {
            String key = this.n.entrySet().iterator().next().getKey();
            synchronized (this) {
                c();
                d dVar = this.n.get(key);
                if (dVar != null) {
                    if (dVar.f779f == null) {
                        for (int i2 = 0; i2 < this.f772k; i2++) {
                            File file = dVar.f777c[i2];
                            if (file.exists()) {
                                if (!file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                            }
                            long j2 = this.f773l;
                            long[] jArr = dVar.b;
                            this.f773l = j2 - jArr[i2];
                            jArr[i2] = 0;
                        }
                        this.o++;
                        this.f774m.append((CharSequence) "REMOVE");
                        this.f774m.append(' ');
                        this.f774m.append((CharSequence) key);
                        this.f774m.append('\n');
                        this.n.remove(key);
                        if (V()) {
                            this.q.submit(this.r);
                        }
                    }
                }
            }
        }
    }

    public c u(String str) {
        synchronized (this) {
            c();
            d dVar = this.n.get(str);
            if (dVar == null) {
                dVar = new d(str, null);
                this.n.put(str, dVar);
            } else if (dVar.f779f != null) {
                return null;
            }
            c cVar = new c(dVar, null);
            dVar.f779f = cVar;
            this.f774m.append((CharSequence) "DIRTY");
            this.f774m.append(' ');
            this.f774m.append((CharSequence) str);
            this.f774m.append('\n');
            K(this.f774m);
            return cVar;
        }
    }
}
