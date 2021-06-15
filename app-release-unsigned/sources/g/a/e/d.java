package g.a.e;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class d {
    public Random a = new Random();
    public final Map<Integer, String> b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f1845c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, c> f1846d = new HashMap();
    public ArrayList<String> e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, b<?>> f1847f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f1848g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f1849h = new Bundle();

    public class a extends c<I> {
        public final /* synthetic */ String a;

        public a(String str, int i2, g.a.e.f.a aVar) {
            this.a = str;
        }

        @Override // g.a.e.c
        public void a() {
            d.this.c(this.a);
        }
    }

    public static class b<O> {
        public final b<O> a;
        public final g.a.e.f.a<?, O> b;

        public b(b<O> bVar, g.a.e.f.a<?, O> aVar) {
            this.a = bVar;
            this.b = aVar;
        }
    }

    public static class c {
    }

    public final boolean a(int i2, int i3, Intent intent) {
        b<O> bVar;
        String str = this.b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.e.remove(str);
        b<?> bVar2 = this.f1847f.get(str);
        if (bVar2 == null || (bVar = bVar2.a) == null) {
            this.f1848g.remove(str);
            this.f1849h.putParcelable(str, new a(i3, intent));
            return true;
        }
        bVar.a(bVar2.b.a(i3, intent));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: g.a.e.b<O> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> c<I> b(String str, g.a.e.f.a<I, O> aVar, b<O> bVar) {
        int i2;
        Integer num = this.f1845c.get(str);
        if (num != null) {
            i2 = num.intValue();
        } else {
            int nextInt = this.a.nextInt(2147418112);
            while (true) {
                i2 = nextInt + 65536;
                if (!this.b.containsKey(Integer.valueOf(i2))) {
                    break;
                }
                nextInt = this.a.nextInt(2147418112);
            }
            this.b.put(Integer.valueOf(i2), str);
            this.f1845c.put(str, Integer.valueOf(i2));
        }
        this.f1847f.put(str, new b<>(bVar, aVar));
        if (this.f1848g.containsKey(str)) {
            Object obj = this.f1848g.get(str);
            this.f1848g.remove(str);
            bVar.a(obj);
        }
        a aVar2 = (a) this.f1849h.getParcelable(str);
        if (aVar2 != null) {
            this.f1849h.remove(str);
            bVar.a(aVar.a(aVar2.e, aVar2.f1844f));
        }
        return new a(str, i2, aVar);
    }

    public final void c(String str) {
        Integer remove;
        if (!this.e.contains(str) && (remove = this.f1845c.remove(str)) != null) {
            this.b.remove(remove);
        }
        this.f1847f.remove(str);
        if (this.f1848g.containsKey(str)) {
            StringBuilder i2 = c.c.a.a.a.i("Dropping pending result for request ", str, ": ");
            i2.append(this.f1848g.get(str));
            Log.w("ActivityResultRegistry", i2.toString());
            this.f1848g.remove(str);
        }
        if (this.f1849h.containsKey(str)) {
            StringBuilder i3 = c.c.a.a.a.i("Dropping pending result for request ", str, ": ");
            i3.append(this.f1849h.getParcelable(str));
            Log.w("ActivityResultRegistry", i3.toString());
            this.f1849h.remove(str);
        }
        if (this.f1846d.get(str) != null) {
            throw null;
        }
    }
}
