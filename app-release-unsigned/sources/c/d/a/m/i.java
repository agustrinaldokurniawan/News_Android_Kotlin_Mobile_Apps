package c.d.a.m;

import c.d.a.m.v.c0.b;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

public class i implements k {
    public final /* synthetic */ InputStream a;
    public final /* synthetic */ b b;

    public i(InputStream inputStream, b bVar) {
        this.a = inputStream;
        this.b = bVar;
    }

    @Override // c.d.a.m.k
    public int a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.b(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
