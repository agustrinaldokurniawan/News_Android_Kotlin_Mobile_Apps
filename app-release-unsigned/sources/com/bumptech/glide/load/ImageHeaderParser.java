package com.bumptech.glide.load;

import c.d.a.m.v.c0.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        public final boolean e;

        /* access modifiers changed from: public */
        ImageType(boolean z) {
            this.e = z;
        }

        public boolean hasAlpha() {
            return this.e;
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(InputStream inputStream, b bVar);

    ImageType c(InputStream inputStream);
}
