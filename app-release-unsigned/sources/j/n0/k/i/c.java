package j.n0.k.i;

import h.a.t.a;
import i.o.i;
import i.s.c.h;
import j.c0;
import j.n0.f.d;
import j.n0.j.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

public final class c {
    public static final CopyOnWriteArraySet<Logger> a = new CopyOnWriteArraySet<>();
    public static final Map<String, String> b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f3696c = null;

    static {
        Map<String, String> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = c0.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = c0.class.getName();
        h.b(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = e.class.getName();
        h.b(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = d.class.getName();
        h.b(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        h.e(linkedHashMap, "$this$toMap");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = i.e;
        } else if (size != 1) {
            h.e(linkedHashMap, "$this$toMutableMap");
            map = new LinkedHashMap<>(linkedHashMap);
        } else {
            map = a.c0(linkedHashMap);
        }
        b = map;
    }
}
