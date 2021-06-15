package g.r;

import android.database.Cursor;
import android.util.Log;
import com.tsuga.news.core.data.source.local.room.NewsDatabase_Impl;
import g.r.j;
import g.t.a.c;
import g.t.a.g.e;
import java.util.List;
import java.util.Objects;

public class k extends c.a {
    public c b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2985c;

    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        public abstract b a(g.t.a.b bVar);
    }

    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public k(c cVar, a aVar, String str, String str2) {
        super(aVar.a);
        this.b = cVar;
        this.f2985c = aVar;
    }

    @Override // g.t.a.c.a
    public void b(g.t.a.b bVar) {
    }

    /* JADX INFO: finally extract failed */
    @Override // g.t.a.c.a
    public void c(g.t.a.b bVar) {
        Cursor G = ((g.t.a.g.a) bVar).G(new g.t.a.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z = G.moveToFirst() && G.getInt(0) == 0;
            G.close();
            Objects.requireNonNull((NewsDatabase_Impl.a) this.f2985c);
            g.t.a.g.a aVar = (g.t.a.g.a) bVar;
            aVar.f3021f.execSQL("CREATE TABLE IF NOT EXISTS `news` (`publishedAt` TEXT NOT NULL, `author` TEXT NOT NULL, `urlToImage` TEXT NOT NULL, `description` TEXT NOT NULL, `source` TEXT NOT NULL, `title` TEXT NOT NULL, `url` TEXT NOT NULL, `content` TEXT NOT NULL, `isBookmark` INTEGER NOT NULL, PRIMARY KEY(`publishedAt`))");
            aVar.f3021f.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.f3021f.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4ece089b33ea022235baff3d6abd06cf')");
            if (!z) {
                b a2 = this.f2985c.a(bVar);
                if (!a2.a) {
                    StringBuilder f2 = c.c.a.a.a.f("Pre-packaged database has an invalid schema: ");
                    f2.append(a2.b);
                    throw new IllegalStateException(f2.toString());
                }
            }
            g(bVar);
            NewsDatabase_Impl.a aVar2 = (NewsDatabase_Impl.a) this.f2985c;
            List<j.a> list = NewsDatabase_Impl.this.f2980h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(NewsDatabase_Impl.this.f2980h.get(i2));
                }
            }
        } catch (Throwable th) {
            G.close();
            throw th;
        }
    }

    @Override // g.t.a.c.a
    public void d(g.t.a.b bVar, int i2, int i3) {
        f(bVar, i2, i3);
    }

    /* JADX INFO: finally extract failed */
    @Override // g.t.a.c.a
    public void e(g.t.a.b bVar) {
        Cursor G = ((g.t.a.g.a) bVar).G(new g.t.a.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            boolean z = G.moveToFirst() && G.getInt(0) != 0;
            G.close();
            if (z) {
                Cursor G2 = ((g.t.a.g.a) bVar).G(new g.t.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = G2.moveToFirst() ? G2.getString(0) : null;
                    G2.close();
                    if (!"4ece089b33ea022235baff3d6abd06cf".equals(string) && !"4d38b93d1a903e2896d37b0a3293e797".equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    G2.close();
                    throw th;
                }
            } else {
                b a2 = this.f2985c.a(bVar);
                if (a2.a) {
                    Objects.requireNonNull((NewsDatabase_Impl.a) this.f2985c);
                    g(bVar);
                } else {
                    StringBuilder f2 = c.c.a.a.a.f("Pre-packaged database has an invalid schema: ");
                    f2.append(a2.b);
                    throw new IllegalStateException(f2.toString());
                }
            }
            NewsDatabase_Impl.a aVar = (NewsDatabase_Impl.a) this.f2985c;
            NewsDatabase_Impl.this.a = bVar;
            i iVar = NewsDatabase_Impl.this.e;
            synchronized (iVar) {
                if (iVar.f2967h) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                } else {
                    ((g.t.a.g.a) bVar).f3021f.execSQL("PRAGMA temp_store = MEMORY;");
                    ((g.t.a.g.a) bVar).f3021f.execSQL("PRAGMA recursive_triggers='ON';");
                    ((g.t.a.g.a) bVar).f3021f.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                    iVar.g(bVar);
                    iVar.f2968i = new e(((g.t.a.g.a) bVar).f3021f.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                    iVar.f2967h = true;
                }
            }
            List<j.a> list = NewsDatabase_Impl.this.f2980h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(NewsDatabase_Impl.this.f2980h.get(i2));
                }
            }
            this.b = null;
        } catch (Throwable th2) {
            G.close();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // g.t.a.c.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(g.t.a.b r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 384
        */
        throw new UnsupportedOperationException("Method not decompiled: g.r.k.f(g.t.a.b, int, int):void");
    }

    public final void g(g.t.a.b bVar) {
        bVar.v("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.v("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + "4ece089b33ea022235baff3d6abd06cf" + "')");
    }
}
