package c.a.a.b.b.o.a.c;

import android.database.Cursor;
import g.r.j;
import g.r.l;
import g.r.n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class b implements a {
    public final j a;
    public final g.r.f<c.a.a.b.b.o.a.b.a> b;

    /* renamed from: c  reason: collision with root package name */
    public final g.r.e<c.a.a.b.b.o.a.b.a> f358c;

    public class a extends g.r.f<c.a.a.b.b.o.a.b.a> {
        public a(b bVar, j jVar) {
            super(jVar);
        }

        @Override // g.r.p
        public String c() {
            return "INSERT OR REPLACE INTO `news` (`publishedAt`,`author`,`urlToImage`,`description`,`source`,`title`,`url`,`content`,`isBookmark`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g.t.a.f, java.lang.Object] */
        @Override // g.r.f
        public void e(g.t.a.f fVar, c.a.a.b.b.o.a.b.a aVar) {
            c.a.a.b.b.o.a.b.a aVar2 = aVar;
            String str = aVar2.a;
            if (str == null) {
                fVar.I(1);
            } else {
                fVar.x(1, str);
            }
            String str2 = aVar2.b;
            if (str2 == null) {
                fVar.I(2);
            } else {
                fVar.x(2, str2);
            }
            String str3 = aVar2.f352c;
            if (str3 == null) {
                fVar.I(3);
            } else {
                fVar.x(3, str3);
            }
            String str4 = aVar2.f353d;
            if (str4 == null) {
                fVar.I(4);
            } else {
                fVar.x(4, str4);
            }
            String str5 = aVar2.e;
            if (str5 == null) {
                fVar.I(5);
            } else {
                fVar.x(5, str5);
            }
            String str6 = aVar2.f354f;
            if (str6 == null) {
                fVar.I(6);
            } else {
                fVar.x(6, str6);
            }
            String str7 = aVar2.f355g;
            if (str7 == null) {
                fVar.I(7);
            } else {
                fVar.x(7, str7);
            }
            String str8 = aVar2.f356h;
            if (str8 == null) {
                fVar.I(8);
            } else {
                fVar.x(8, str8);
            }
            fVar.y(9, aVar2.f357i ? 1 : 0);
        }
    }

    /* renamed from: c.a.a.b.b.o.a.c.b$b  reason: collision with other inner class name */
    public class C0004b extends g.r.e<c.a.a.b.b.o.a.b.a> {
        public C0004b(b bVar, j jVar) {
            super(jVar);
        }

        @Override // g.r.p
        public String c() {
            return "UPDATE OR ABORT `news` SET `publishedAt` = ?,`author` = ?,`urlToImage` = ?,`description` = ?,`source` = ?,`title` = ?,`url` = ?,`content` = ?,`isBookmark` = ? WHERE `publishedAt` = ?";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g.t.a.f, java.lang.Object] */
        @Override // g.r.e
        public void e(g.t.a.f fVar, c.a.a.b.b.o.a.b.a aVar) {
            c.a.a.b.b.o.a.b.a aVar2 = aVar;
            String str = aVar2.a;
            if (str == null) {
                fVar.I(1);
            } else {
                fVar.x(1, str);
            }
            String str2 = aVar2.b;
            if (str2 == null) {
                fVar.I(2);
            } else {
                fVar.x(2, str2);
            }
            String str3 = aVar2.f352c;
            if (str3 == null) {
                fVar.I(3);
            } else {
                fVar.x(3, str3);
            }
            String str4 = aVar2.f353d;
            if (str4 == null) {
                fVar.I(4);
            } else {
                fVar.x(4, str4);
            }
            String str5 = aVar2.e;
            if (str5 == null) {
                fVar.I(5);
            } else {
                fVar.x(5, str5);
            }
            String str6 = aVar2.f354f;
            if (str6 == null) {
                fVar.I(6);
            } else {
                fVar.x(6, str6);
            }
            String str7 = aVar2.f355g;
            if (str7 == null) {
                fVar.I(7);
            } else {
                fVar.x(7, str7);
            }
            String str8 = aVar2.f356h;
            if (str8 == null) {
                fVar.I(8);
            } else {
                fVar.x(8, str8);
            }
            fVar.y(9, aVar2.f357i ? 1 : 0);
            String str9 = aVar2.a;
            if (str9 == null) {
                fVar.I(10);
            } else {
                fVar.x(10, str9);
            }
        }
    }

    public class c implements Callable<Void> {
        public final /* synthetic */ List e;

        public c(List list) {
            this.e = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX INFO: finally extract failed */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: g.r.f<c.a.a.b.b.o.a.b.a> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public Void call() {
            j jVar = b.this.a;
            jVar.a();
            if (jVar.f2982j == null) {
                jVar.h();
                try {
                    g.r.f<c.a.a.b.b.o.a.b.a> fVar = b.this.b;
                    List<Object> list = this.e;
                    g.t.a.f a = fVar.a();
                    try {
                        for (Object obj : list) {
                            fVar.e(a, obj);
                            a.S();
                        }
                        fVar.d(a);
                        b.this.a.f2977d.P().B();
                        return null;
                    } catch (Throwable th) {
                        fVar.d(a);
                        throw th;
                    }
                } finally {
                    b.this.a.e();
                }
            } else {
                throw null;
            }
        }
    }

    public class d implements Callable<List<c.a.a.b.b.o.a.b.a>> {
        public final /* synthetic */ l e;

        public d(l lVar) {
            this.e = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public List<c.a.a.b.b.o.a.b.a> call() {
            Cursor a = g.r.s.b.a(b.this.a, this.e, false, null);
            try {
                int h2 = g.q.a.h(a, "publishedAt");
                int h3 = g.q.a.h(a, "author");
                int h4 = g.q.a.h(a, "urlToImage");
                int h5 = g.q.a.h(a, "description");
                int h6 = g.q.a.h(a, "source");
                int h7 = g.q.a.h(a, "title");
                int h8 = g.q.a.h(a, "url");
                int h9 = g.q.a.h(a, "content");
                int h10 = g.q.a.h(a, "isBookmark");
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    arrayList.add(new c.a.a.b.b.o.a.b.a(a.isNull(h2) ? null : a.getString(h2), a.isNull(h3) ? null : a.getString(h3), a.isNull(h4) ? null : a.getString(h4), a.isNull(h5) ? null : a.getString(h5), a.isNull(h6) ? null : a.getString(h6), a.isNull(h7) ? null : a.getString(h7), a.isNull(h8) ? null : a.getString(h8), a.isNull(h9) ? null : a.getString(h9), a.getInt(h10) != 0));
                }
                return arrayList;
            } finally {
                a.close();
            }
        }

        @Override // java.lang.Object
        public void finalize() {
            this.e.n();
        }
    }

    public class e implements Callable<List<c.a.a.b.b.o.a.b.a>> {
        public final /* synthetic */ l e;

        public e(l lVar) {
            this.e = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public List<c.a.a.b.b.o.a.b.a> call() {
            Cursor a = g.r.s.b.a(b.this.a, this.e, false, null);
            try {
                int h2 = g.q.a.h(a, "publishedAt");
                int h3 = g.q.a.h(a, "author");
                int h4 = g.q.a.h(a, "urlToImage");
                int h5 = g.q.a.h(a, "description");
                int h6 = g.q.a.h(a, "source");
                int h7 = g.q.a.h(a, "title");
                int h8 = g.q.a.h(a, "url");
                int h9 = g.q.a.h(a, "content");
                int h10 = g.q.a.h(a, "isBookmark");
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    arrayList.add(new c.a.a.b.b.o.a.b.a(a.isNull(h2) ? null : a.getString(h2), a.isNull(h3) ? null : a.getString(h3), a.isNull(h4) ? null : a.getString(h4), a.isNull(h5) ? null : a.getString(h5), a.isNull(h6) ? null : a.getString(h6), a.isNull(h7) ? null : a.getString(h7), a.isNull(h8) ? null : a.getString(h8), a.isNull(h9) ? null : a.getString(h9), a.getInt(h10) != 0));
                }
                return arrayList;
            } finally {
                a.close();
            }
        }

        @Override // java.lang.Object
        public void finalize() {
            this.e.n();
        }
    }

    public class f implements Callable<List<c.a.a.b.b.o.a.b.a>> {
        public final /* synthetic */ l e;

        public f(l lVar) {
            this.e = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public List<c.a.a.b.b.o.a.b.a> call() {
            Cursor a = g.r.s.b.a(b.this.a, this.e, false, null);
            try {
                int h2 = g.q.a.h(a, "publishedAt");
                int h3 = g.q.a.h(a, "author");
                int h4 = g.q.a.h(a, "urlToImage");
                int h5 = g.q.a.h(a, "description");
                int h6 = g.q.a.h(a, "source");
                int h7 = g.q.a.h(a, "title");
                int h8 = g.q.a.h(a, "url");
                int h9 = g.q.a.h(a, "content");
                int h10 = g.q.a.h(a, "isBookmark");
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    arrayList.add(new c.a.a.b.b.o.a.b.a(a.isNull(h2) ? null : a.getString(h2), a.isNull(h3) ? null : a.getString(h3), a.isNull(h4) ? null : a.getString(h4), a.isNull(h5) ? null : a.getString(h5), a.isNull(h6) ? null : a.getString(h6), a.isNull(h7) ? null : a.getString(h7), a.isNull(h8) ? null : a.getString(h8), a.isNull(h9) ? null : a.getString(h9), a.getInt(h10) != 0));
                }
                return arrayList;
            } finally {
                a.close();
            }
        }

        @Override // java.lang.Object
        public void finalize() {
            this.e.n();
        }
    }

    public class g implements Callable<List<c.a.a.b.b.o.a.b.a>> {
        public final /* synthetic */ l e;

        public g(l lVar) {
            this.e = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public List<c.a.a.b.b.o.a.b.a> call() {
            Cursor a = g.r.s.b.a(b.this.a, this.e, false, null);
            try {
                int h2 = g.q.a.h(a, "publishedAt");
                int h3 = g.q.a.h(a, "author");
                int h4 = g.q.a.h(a, "urlToImage");
                int h5 = g.q.a.h(a, "description");
                int h6 = g.q.a.h(a, "source");
                int h7 = g.q.a.h(a, "title");
                int h8 = g.q.a.h(a, "url");
                int h9 = g.q.a.h(a, "content");
                int h10 = g.q.a.h(a, "isBookmark");
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    arrayList.add(new c.a.a.b.b.o.a.b.a(a.isNull(h2) ? null : a.getString(h2), a.isNull(h3) ? null : a.getString(h3), a.isNull(h4) ? null : a.getString(h4), a.isNull(h5) ? null : a.getString(h5), a.isNull(h6) ? null : a.getString(h6), a.isNull(h7) ? null : a.getString(h7), a.isNull(h8) ? null : a.getString(h8), a.isNull(h9) ? null : a.getString(h9), a.getInt(h10) != 0));
                }
                return arrayList;
            } finally {
                a.close();
            }
        }

        @Override // java.lang.Object
        public void finalize() {
            this.e.n();
        }
    }

    public b(j jVar) {
        this.a = jVar;
        this.b = new a(this, jVar);
        this.f358c = new C0004b(this, jVar);
    }

    @Override // c.a.a.b.b.o.a.c.a
    public h.a.c<List<c.a.a.b.b.o.a.b.a>> a() {
        return n.a(this.a, false, new String[]{"news"}, new d(l.e("select * from news", 0)));
    }

    @Override // c.a.a.b.b.o.a.c.a
    public h.a.c<List<c.a.a.b.b.o.a.b.a>> b(String str) {
        l e2 = l.e("select * from news where isBookmark=1 and (title like ? or content like ? or description like ? or author like ? or source like ?)", 5);
        if (str == null) {
            e2.I(1);
        } else {
            e2.x(1, str);
        }
        if (str == null) {
            e2.I(2);
        } else {
            e2.x(2, str);
        }
        if (str == null) {
            e2.I(3);
        } else {
            e2.x(3, str);
        }
        if (str == null) {
            e2.I(4);
        } else {
            e2.x(4, str);
        }
        if (str == null) {
            e2.I(5);
        } else {
            e2.x(5, str);
        }
        return n.a(this.a, false, new String[]{"news"}, new g(e2));
    }

    @Override // c.a.a.b.b.o.a.c.a
    public h.a.c<List<c.a.a.b.b.o.a.b.a>> c(String str) {
        l e2 = l.e("select * from news where title like ? or content like ? or description like ? or author like ? or source like ?", 5);
        if (str == null) {
            e2.I(1);
        } else {
            e2.x(1, str);
        }
        if (str == null) {
            e2.I(2);
        } else {
            e2.x(2, str);
        }
        if (str == null) {
            e2.I(3);
        } else {
            e2.x(3, str);
        }
        if (str == null) {
            e2.I(4);
        } else {
            e2.x(4, str);
        }
        if (str == null) {
            e2.I(5);
        } else {
            e2.x(5, str);
        }
        return n.a(this.a, false, new String[]{"news"}, new f(e2));
    }

    @Override // c.a.a.b.b.o.a.c.a
    public h.a.a d(List<c.a.a.b.b.o.a.b.a> list) {
        return new h.a.s.e.a.a(new c(list));
    }

    @Override // c.a.a.b.b.o.a.c.a
    public void e(c.a.a.b.b.o.a.b.a aVar) {
        this.a.b();
        j jVar = this.a;
        jVar.a();
        if (jVar.f2982j == null) {
            jVar.h();
            try {
                g.r.e<c.a.a.b.b.o.a.b.a> eVar = this.f358c;
                g.t.a.f a2 = eVar.a();
                try {
                    eVar.e(a2, aVar);
                    a2.C();
                    if (a2 == eVar.f3001c) {
                        eVar.a.set(false);
                    }
                    this.a.f2977d.P().B();
                } catch (Throwable th) {
                    eVar.d(a2);
                    throw th;
                }
            } finally {
                this.a.e();
            }
        } else {
            throw null;
        }
    }

    @Override // c.a.a.b.b.o.a.c.a
    public h.a.c<List<c.a.a.b.b.o.a.b.a>> f() {
        return n.a(this.a, false, new String[]{"news"}, new e(l.e("select * from news where isBookmark = 1", 0)));
    }
}
