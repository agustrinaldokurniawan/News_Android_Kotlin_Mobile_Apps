package k;

import java.io.Closeable;
import java.io.Flushable;

public interface x extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    a0 g();

    void l(e eVar, long j2);
}
