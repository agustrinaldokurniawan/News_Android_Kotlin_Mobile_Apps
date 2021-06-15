package g.t.a;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

public interface c extends Closeable {

    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        public final void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }

        public abstract void b(b bVar);

        public abstract void c(b bVar);

        public abstract void d(b bVar, int i2, int i3);

        public abstract void e(b bVar);

        public abstract void f(b bVar, int i2, int i3);
    }

    public interface b {
    }

    b P();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
