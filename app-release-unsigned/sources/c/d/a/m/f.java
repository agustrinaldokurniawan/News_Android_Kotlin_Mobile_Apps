package c.d.a.m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

public class f implements l {
    public final /* synthetic */ InputStream a;

    public f(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // c.d.a.m.l
    public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.c(this.a);
        } finally {
            this.a.reset();
        }
    }
}
