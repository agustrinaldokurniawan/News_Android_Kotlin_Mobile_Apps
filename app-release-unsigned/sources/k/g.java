package k;

import java.nio.channels.WritableByteChannel;

public interface g extends x, WritableByteChannel {
    g A(int i2);

    g E(int i2);

    g N(String str);

    g O(long j2);

    g T(int i2);

    e d();

    @Override // k.x, java.io.Flushable
    void flush();

    g h(byte[] bArr);

    g i(byte[] bArr, int i2, int i3);

    g m(i iVar);

    g p(long j2);
}
