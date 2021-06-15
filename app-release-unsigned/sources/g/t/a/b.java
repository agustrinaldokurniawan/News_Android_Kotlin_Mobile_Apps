package g.t.a;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

public interface b extends Closeable {
    void B();

    f D(String str);

    void F();

    Cursor G(e eVar);

    Cursor U(String str);

    Cursor X(e eVar, CancellationSignal cancellationSignal);

    boolean Z();

    boolean isOpen();

    void j();

    void k();

    boolean s();

    void v(String str);
}
