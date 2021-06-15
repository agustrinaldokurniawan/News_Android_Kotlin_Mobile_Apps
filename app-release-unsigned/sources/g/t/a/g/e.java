package g.t.a.g;

import android.database.sqlite.SQLiteStatement;
import g.t.a.f;

public class e extends d implements f {

    /* renamed from: f  reason: collision with root package name */
    public final SQLiteStatement f3030f;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3030f = sQLiteStatement;
    }

    @Override // g.t.a.f
    public int C() {
        return this.f3030f.executeUpdateDelete();
    }

    @Override // g.t.a.f
    public long S() {
        return this.f3030f.executeInsert();
    }
}
