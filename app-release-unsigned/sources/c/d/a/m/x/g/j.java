package c.d.a.m.x.g;

import android.util.Log;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.c0.b;
import c.d.a.m.v.w;
import com.bumptech.glide.load.ImageHeaderParser;
import g.q.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class j implements r<InputStream, c> {
    public final List<ImageHeaderParser> a;
    public final r<ByteBuffer, c> b;

    /* renamed from: c  reason: collision with root package name */
    public final b f1104c;

    public j(List<ImageHeaderParser> list, r<ByteBuffer, c> rVar, b bVar) {
        this.a = list;
        this.b = rVar;
        this.f1104c = bVar;
    }

    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public w<c> a(InputStream inputStream, int i2, int i3, p pVar) {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i2, i3, pVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public boolean b(InputStream inputStream, p pVar) {
        return !((Boolean) pVar.c(i.b)).booleanValue() && a.k(this.a, inputStream, this.f1104c) == ImageHeaderParser.ImageType.GIF;
    }
}
