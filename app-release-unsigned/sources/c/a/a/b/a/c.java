package c.a.a.b.a;

import android.app.ActivityManager;
import android.content.Context;
import com.tsuga.news.core.data.source.local.room.NewsDatabase;
import g.r.b;
import g.r.j;
import g.r.o;
import g.r.q;
import i.s.b.p;
import i.s.c.h;
import i.s.c.i;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import l.a.c.n.a;

public final class c extends i implements p<a, l.a.c.k.a, NewsDatabase> {

    /* renamed from: f  reason: collision with root package name */
    public static final c f337f = new c();

    public c() {
        super(2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // i.s.b.p
    public NewsDatabase k(a aVar, l.a.c.k.a aVar2) {
        a aVar3 = aVar;
        h.e(aVar3, "$this$single");
        h.e(aVar2, "it");
        h.e(aVar3, "<this>");
        try {
            Context context = (Context) aVar3.a(i.s.c.p.a(Context.class), null, null);
            j.b bVar = new j.b();
            Executor executor = g.c.a.a.a.b;
            g.t.a.g.c cVar = new g.t.a.g.c();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int i2 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
            g.r.c cVar2 = new g.r.c(context, "News.db", cVar, bVar, null, false, i2, executor, executor, false, false, true, null, null, null, null, null);
            String name = NewsDatabase.class.getPackage().getName();
            String canonicalName = NewsDatabase.class.getCanonicalName();
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String str = canonicalName.replace('.', '_') + "_Impl";
            try {
                j jVar = (j) Class.forName(name.isEmpty() ? str : name + "." + str, true, NewsDatabase.class.getClassLoader()).newInstance();
                g.t.a.c d2 = jVar.d(cVar2);
                jVar.f2977d = d2;
                o oVar = (o) jVar.l(o.class, d2);
                if (oVar != null) {
                    oVar.f2999k = cVar2;
                }
                if (((b) jVar.l(b.class, jVar.f2977d)) == null) {
                    boolean z = i2 == 3;
                    jVar.f2977d.setWriteAheadLoggingEnabled(z);
                    jVar.f2980h = null;
                    jVar.b = executor;
                    jVar.f2976c = new q(executor);
                    jVar.f2978f = false;
                    jVar.f2979g = z;
                    Map<Class<?>, List<Class<?>>> f2 = jVar.f();
                    BitSet bitSet = new BitSet();
                    for (Map.Entry<Class<?>, List<Class<?>>> entry : f2.entrySet()) {
                        Class<?> key = entry.getKey();
                        Iterator<Class<?>> it = entry.getValue().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Class<?> next = it.next();
                                int size = cVar2.e.size() - 1;
                                while (true) {
                                    if (size < 0) {
                                        size = -1;
                                        break;
                                    } else if (next.isAssignableFrom(cVar2.e.get(size).getClass())) {
                                        bitSet.set(size);
                                        break;
                                    } else {
                                        size--;
                                    }
                                }
                                if (size >= 0) {
                                    jVar.f2984l.put(next, cVar2.e.get(size));
                                } else {
                                    throw new IllegalArgumentException("A required type converter (" + next + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                                }
                            }
                        }
                    }
                    for (int size2 = cVar2.e.size() - 1; size2 >= 0; size2--) {
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected type converter " + cVar2.e.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        }
                    }
                    return (NewsDatabase) jVar;
                }
                Objects.requireNonNull(jVar.e);
                throw null;
            } catch (ClassNotFoundException unused) {
                StringBuilder f3 = c.c.a.a.a.f("cannot find implementation for ");
                f3.append(NewsDatabase.class.getCanonicalName());
                f3.append(". ");
                f3.append(str);
                f3.append(" does not exist");
                throw new RuntimeException(f3.toString());
            } catch (IllegalAccessException unused2) {
                StringBuilder f4 = c.c.a.a.a.f("Cannot access the constructor");
                f4.append(NewsDatabase.class.getCanonicalName());
                throw new RuntimeException(f4.toString());
            } catch (InstantiationException unused3) {
                StringBuilder f5 = c.c.a.a.a.f("Failed to create an instance of ");
                f5.append(NewsDatabase.class.getCanonicalName());
                throw new RuntimeException(f5.toString());
            }
        } catch (Exception unused4) {
            throw new l.a.a.a.a("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
