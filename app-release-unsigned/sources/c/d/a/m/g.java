package c.d.a.m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;

public class g implements l {
    public final /* synthetic */ ByteBuffer a;

    public g(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // c.d.a.m.l
    public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        return imageHeaderParser.a(this.a);
    }
}
