package c.b.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import c.b.a.c0.g;
import c.b.a.e0.h0.d;
import c.b.a.e0.s;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import k.a0;
import k.o;
import k.t;
import k.z;

public class h {
    public static final Map<String, u<g>> a = new HashMap();
    public static final byte[] b = {80, 75, 3, 4};

    public class a implements o<g> {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // c.b.a.o
        public void a(g gVar) {
            h.a.remove(this.a);
        }
    }

    public class b implements o<Throwable> {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // c.b.a.o
        public void a(Throwable th) {
            h.a.remove(this.a);
        }
    }

    public class c implements Callable<s<g>> {
        public final /* synthetic */ g e;

        public c(g gVar) {
            this.e = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public s<g> call() {
            return new s(this.e);
        }
    }

    public static u<g> a(String str, Callable<s<g>> callable) {
        g gVar;
        if (str == null) {
            gVar = null;
        } else {
            g gVar2 = g.a;
            Objects.requireNonNull(gVar2);
            gVar = gVar2.b.a(str);
        }
        if (gVar != null) {
            return new u<>(new c(gVar), false);
        }
        if (str != null) {
            Map<String, u<g>> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        u<g> uVar = new u<>(callable, false);
        if (str != null) {
            uVar.b(new a(str));
            uVar.a(new b(str));
            a.put(str, uVar);
        }
        return uVar;
    }

    public static s<g> b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return c(context.getAssets().open(str), str2);
                }
            }
            return f(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new s<>(e);
        }
    }

    public static s<g> c(InputStream inputStream, String str) {
        try {
            i.s.c.h.f(inputStream, "$this$source");
            o oVar = new o(inputStream, new a0());
            i.s.c.h.f(oVar, "$this$buffer");
            t tVar = new t(oVar);
            String[] strArr = c.b.a.e0.h0.c.e;
            return d(new d(tVar), str, true);
        } finally {
            c.b.a.f0.g.b(inputStream);
        }
    }

    public static s<g> d(c.b.a.e0.h0.c cVar, String str, boolean z) {
        try {
            g a2 = s.a(cVar);
            if (str != null) {
                g.a.a(str, a2);
            }
            s<g> sVar = new s<>(a2);
            if (z) {
                c.b.a.f0.g.b(cVar);
            }
            return sVar;
        } catch (Exception e) {
            s<g> sVar2 = new s<>(e);
            if (z) {
                c.b.a.f0.g.b(cVar);
            }
            return sVar2;
        } catch (Throwable th) {
            if (z) {
                c.b.a.f0.g.b(cVar);
            }
            throw th;
        }
    }

    public static s<g> e(Context context, int i2, String str) {
        Boolean bool;
        try {
            z S = h.a.t.a.S(context.getResources().openRawResource(i2));
            i.s.c.h.f(S, "$this$buffer");
            t tVar = new t(S);
            try {
                k.h c2 = tVar.c();
                byte[] bArr = b;
                int length = bArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        ((t) c2).close();
                        bool = Boolean.TRUE;
                        break;
                    }
                    if (((t) c2).readByte() != bArr[i3]) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    i3++;
                }
            } catch (Exception unused) {
                Objects.requireNonNull((c.b.a.f0.b) c.b.a.f0.c.a);
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                return f(new ZipInputStream(new t.a(tVar)), str);
            }
            return c(new t.a(tVar), str);
        } catch (Resources.NotFoundException e) {
            return new s<>(e);
        }
    }

    public static s<g> f(ZipInputStream zipInputStream, String str) {
        try {
            return g(zipInputStream, str);
        } finally {
            c.b.a.f0.g.b(zipInputStream);
        }
    }

    public static s<g> g(ZipInputStream zipInputStream, String str) {
        n nVar;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            V v = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX")) {
                    if (!nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        if (nextEntry.getName().contains(".json")) {
                            i.s.c.h.f(zipInputStream, "$this$source");
                            o oVar = new o(zipInputStream, new a0());
                            i.s.c.h.f(oVar, "$this$buffer");
                            t tVar = new t(oVar);
                            String[] strArr = c.b.a.e0.h0.c.e;
                            v = d(new d(tVar), null, false).a;
                        } else {
                            if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg")) {
                                if (name.contains(".jpeg")) {
                                }
                            }
                            String[] split = name.split("/");
                            hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    }
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (v == null) {
                return new s<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<n> it = v.f666d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        nVar = null;
                        break;
                    }
                    nVar = it.next();
                    if (nVar.f705d.equals(str2)) {
                        break;
                    }
                }
                if (nVar != null) {
                    nVar.e = c.b.a.f0.g.e((Bitmap) entry.getValue(), nVar.a, nVar.b);
                }
            }
            for (Map.Entry<String, n> entry2 : v.f666d.entrySet()) {
                if (entry2.getValue().e == null) {
                    StringBuilder f2 = c.c.a.a.a.f("There is no image for ");
                    f2.append(entry2.getValue().f705d);
                    return new s<>(new IllegalStateException(f2.toString()));
                }
            }
            if (str != null) {
                g.a.a(str, v);
            }
            return new s<>((g) v);
        } catch (IOException e) {
            return new s<>(e);
        }
    }

    public static String h(Context context, int i2) {
        StringBuilder f2 = c.c.a.a.a.f("rawRes");
        f2.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        f2.append(i2);
        return f2.toString();
    }
}
