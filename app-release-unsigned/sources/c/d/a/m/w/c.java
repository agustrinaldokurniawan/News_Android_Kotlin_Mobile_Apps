package c.d.a.m.w;

import android.util.Log;
import c.d.a.m.d;
import c.d.a.m.p;
import c.d.a.s.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c implements d<ByteBuffer> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.io.File, c.d.a.m.p] */
    @Override // c.d.a.m.d
    public boolean a(ByteBuffer byteBuffer, File file, p pVar) {
        try {
            a.b(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
