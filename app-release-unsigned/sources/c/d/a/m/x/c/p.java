package c.d.a.m.x.c;

import c.d.a.m.v.c0.b;
import com.bumptech.glide.load.ImageHeaderParser;
import g.k.a.a;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class p implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(InputStream inputStream, b bVar) {
        a aVar = new a(inputStream);
        a.c e = aVar.e("Orientation");
        int i2 = 1;
        if (e != null) {
            try {
                i2 = e.f(aVar.T);
            } catch (NumberFormatException unused) {
            }
        }
        if (i2 == 0) {
            return -1;
        }
        return i2;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
