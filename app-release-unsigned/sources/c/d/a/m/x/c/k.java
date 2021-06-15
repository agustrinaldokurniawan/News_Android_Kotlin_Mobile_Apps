package c.d.a.m.x.c;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;

public final class k implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class a implements c {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // c.d.a.m.x.c.k.c
        public long a(long j2) {
            int min = (int) Math.min((long) this.a.remaining(), j2);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        @Override // c.d.a.m.x.c.k.c
        public int b() {
            return (d() << 8) | d();
        }

        @Override // c.d.a.m.x.c.k.c
        public int c(byte[] bArr, int i2) {
            int min = Math.min(i2, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // c.d.a.m.x.c.k.c
        public short d() {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new c.a();
        }
    }

    public static final class b {
        public final ByteBuffer a;

        public b(byte[] bArr, int i2) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        public short a(int i2) {
            if (this.a.remaining() - i2 >= 2) {
                return this.a.getShort(i2);
            }
            return -1;
        }

        public int b(int i2) {
            if (this.a.remaining() - i2 >= 4) {
                return this.a.getInt(i2);
            }
            return -1;
        }
    }

    public interface c {

        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        long a(long j2);

        int b();

        int c(byte[] bArr, int i2);

        short d();
    }

    public static final class d implements c {
        public final InputStream a;

        public d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // c.d.a.m.x.c.k.c
        public long a(long j2) {
            if (j2 < 0) {
                return 0;
            }
            long j3 = j2;
            while (j3 > 0) {
                long skip = this.a.skip(j3);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j3 -= skip;
            }
            return j2 - j3;
        }

        @Override // c.d.a.m.x.c.k.c
        public int b() {
            return (d() << 8) | d();
        }

        @Override // c.d.a.m.x.c.k.c
        public int c(byte[] bArr, int i2) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2 && (i4 = this.a.read(bArr, i3, i2 - i3)) != -1) {
                i3 += i4;
            }
            if (i3 != 0 || i4 != -1) {
                return i3;
            }
            throw new c.a();
        }

        @Override // c.d.a.m.x.c.k.c
        public short d() {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(InputStream inputStream, c.d.a.m.v.c0.b bVar) {
        String str;
        Objects.requireNonNull(inputStream, "Argument must not be null");
        d dVar = new d(inputStream);
        Objects.requireNonNull(bVar, "Argument must not be null");
        try {
            int b2 = dVar.b();
            if ((b2 & 65496) == 65496 || b2 == 19789 || b2 == 18761) {
                int e = e(dVar);
                if (e != -1) {
                    byte[] bArr = (byte[]) bVar.e(e, byte[].class);
                    try {
                        return f(dVar, bArr, e);
                    } finally {
                        bVar.d(bArr);
                    }
                } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                } else {
                    str = "Failed to parse exif segment length, or exif segment not found";
                }
            } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                return -1;
            } else {
                str = "Parser doesn't handle magic number: " + b2;
            }
            Log.d("DfltImageHeaderParser", str);
            return -1;
        } catch (c.a unused) {
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return d(new d(inputStream));
    }

    public final ImageHeaderParser.ImageType d(c cVar) {
        try {
            int b2 = cVar.b();
            if (b2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int d2 = (b2 << 8) | cVar.d();
            if (d2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int d3 = (d2 << 8) | cVar.d();
            if (d3 == -1991225785) {
                cVar.a(21);
                try {
                    return cVar.d() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (d3 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                cVar.a(4);
                if (((cVar.b() << 16) | cVar.b()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int b3 = (cVar.b() << 16) | cVar.b();
                if ((b3 & -256) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i2 = b3 & 255;
                if (i2 == 88) {
                    cVar.a(4);
                    return (cVar.d() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i2 != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    cVar.a(4);
                    return (cVar.d() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final int e(c cVar) {
        short d2;
        int b2;
        long j2;
        long a2;
        do {
            short d3 = cVar.d();
            if (d3 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) d3));
                }
                return -1;
            }
            d2 = cVar.d();
            if (d2 == 218) {
                return -1;
            }
            if (d2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            b2 = cVar.b() - 2;
            if (d2 == 225) {
                return b2;
            }
            j2 = (long) b2;
            a2 = cVar.a(j2);
        } while (a2 == j2);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) d2) + ", wanted to skip: " + b2 + ", but actually skipped: " + a2);
        }
        return -1;
    }

    public final int f(c cVar, byte[] bArr, int i2) {
        ByteOrder byteOrder;
        String str;
        String str2;
        StringBuilder sb;
        int c2 = cVar.c(bArr, i2);
        if (c2 != i2) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i2 + ", actually read: " + c2);
            }
            return -1;
        }
        boolean z = bArr != null && i2 > a.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i3 >= bArr2.length) {
                    break;
                } else if (bArr[i3] != bArr2[i3]) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (z) {
            b bVar = new b(bArr, i2);
            short a2 = bVar.a(6);
            if (a2 != 18761) {
                if (a2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a2));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            bVar.a.order(byteOrder);
            int b2 = bVar.b(10) + 6;
            short a3 = bVar.a(b2);
            for (int i4 = 0; i4 < a3; i4++) {
                int i5 = (i4 * 12) + b2 + 2;
                short a4 = bVar.a(i5);
                if (a4 == 274) {
                    short a5 = bVar.a(i5 + 2);
                    if (a5 >= 1 && a5 <= 12) {
                        int b3 = bVar.b(i5 + 4);
                        if (b3 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i4 + " tagType=" + ((int) a4) + " formatCode=" + ((int) a5) + " componentCount=" + b3);
                            }
                            int i6 = b3 + b[a5];
                            if (i6 <= 4) {
                                int i7 = i5 + 8;
                                if (i7 < 0 || i7 > bVar.a.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        str = c.c.a.a.a.m("Illegal tagValueOffset=", i7, " tagType=", a4);
                                        Log.d("DfltImageHeaderParser", str);
                                    }
                                } else if (i6 >= 0 && i6 + i7 <= bVar.a.remaining()) {
                                    return bVar.a(i7);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        str = c.c.a.a.a.l("Illegal number of bytes for TI tag data tagType=", a4);
                                        Log.d("DfltImageHeaderParser", str);
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb = new StringBuilder();
                                str2 = "Got byte count > 4, not orientation, continuing, formatCode=";
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "Negative tiff component count";
                            Log.d("DfltImageHeaderParser", str);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb = new StringBuilder();
                        str2 = "Got invalid format code = ";
                    }
                    sb.append(str2);
                    sb.append((int) a5);
                    str = sb.toString();
                    Log.d("DfltImageHeaderParser", str);
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }
}
