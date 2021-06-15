package com.tsuga.news.core.data.source.local.room;

import android.content.Context;
import g.r.i;
import g.r.k;
import g.t.a.c;
import g.t.a.g.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class NewsDatabase_Impl extends NewsDatabase {

    /* renamed from: m  reason: collision with root package name */
    public volatile c.a.a.b.b.o.a.c.a f1745m;

    public class a extends k.a {
        public a(int i2) {
            super(i2);
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x021f  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x023f  */
        @Override // g.r.k.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public g.r.k.b a(g.t.a.b r29) {
            /*
            // Method dump skipped, instructions count: 597
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tsuga.news.core.data.source.local.room.NewsDatabase_Impl.a.a(g.t.a.b):g.r.k$b");
        }
    }

    @Override // g.r.j
    public i c() {
        return new i(this, new HashMap(0), new HashMap(0), "news");
    }

    @Override // g.r.j
    public c d(g.r.c cVar) {
        k kVar = new k(cVar, new a(1), "4ece089b33ea022235baff3d6abd06cf", "4d38b93d1a903e2896d37b0a3293e797");
        Context context = cVar.b;
        String str = cVar.f2956c;
        if (context != null) {
            g.t.a.g.c cVar2 = (g.t.a.g.c) cVar.a;
            return new b(context, str, kVar, false);
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // g.r.j
    public Map<Class<?>, List<Class<?>>> f() {
        HashMap hashMap = new HashMap();
        hashMap.put(c.a.a.b.b.o.a.c.a.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.tsuga.news.core.data.source.local.room.NewsDatabase
    public c.a.a.b.b.o.a.c.a m() {
        c.a.a.b.b.o.a.c.a aVar;
        if (this.f1745m != null) {
            return this.f1745m;
        }
        synchronized (this) {
            if (this.f1745m == null) {
                this.f1745m = new c.a.a.b.b.o.a.c.b(this);
            }
            aVar = this.f1745m;
        }
        return aVar;
    }
}
