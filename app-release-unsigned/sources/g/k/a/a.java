package g.k.a;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class a {
    public static final d[] A;
    public static final d[] B;
    public static final d[] C;
    public static final d[] D;
    public static final d[][] E;
    public static final d[] F = {new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap<Integer, d>[] G;
    public static final HashMap<String, d>[] H;
    public static final HashSet<String> I = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    public static final HashMap<Integer, Integer> J = new HashMap<>();
    public static final Charset K;
    public static final byte[] L;
    public static final byte[] M;
    public static final boolean a = Log.isLoggable("ExifInterface", 3);
    public static final int[] b = {8, 8, 8};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2615c = {8};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f2616d = {-1, -40, -1};
    public static final byte[] e = {102, 116, 121, 112};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f2617f = {109, 105, 102, 49};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f2618g = {104, 101, 105, 99};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f2619h = {79, 76, 89, 77, 80, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f2620i = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f2621j = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f2622k = {101, 88, 73, 102};

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f2623l = {73, 72, 68, 82};

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f2624m = {73, 69, 78, 68};
    public static final byte[] n = {82, 73, 70, 70};
    public static final byte[] o = {87, 69, 66, 80};
    public static final byte[] p = {69, 88, 73, 70};
    public static SimpleDateFormat q;
    public static final String[] r = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] s = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] t = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final d[] u;
    public static final d[] v;
    public static final d[] w;
    public static final d[] x;
    public static final d[] y;
    public static final d z = new d("StripOffsets", 273, 3);
    public FileDescriptor N;
    public AssetManager.AssetInputStream O;
    public int P;
    public boolean Q;
    public final HashMap<String, c>[] R;
    public Set<Integer> S;
    public ByteOrder T = ByteOrder.BIG_ENDIAN;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public int c0;

    /* renamed from: g.k.a.a$a  reason: collision with other inner class name */
    public class C0084a extends MediaDataSource {
        public long e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f2625f;

        public C0084a(a aVar, b bVar) {
            this.f2625f = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j2, byte[] bArr, int i2, int i3) {
            if (i3 == 0) {
                return 0;
            }
            if (j2 < 0) {
                return -1;
            }
            try {
                long j3 = this.e;
                if (j3 != j2) {
                    if (j3 >= 0 && j2 >= j3 + ((long) this.f2625f.available())) {
                        return -1;
                    }
                    this.f2625f.c(j2);
                    this.e = j2;
                }
                if (i3 > this.f2625f.available()) {
                    i3 = this.f2625f.available();
                }
                b bVar = this.f2625f;
                int read = bVar.f2627g.read(bArr, i2, i3);
                bVar.f2630j += read;
                if (read >= 0) {
                    this.e += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.e = -1;
            return -1;
        }
    }

    public static class b extends InputStream implements DataInput {
        public static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        public static final ByteOrder f2626f = ByteOrder.BIG_ENDIAN;

        /* renamed from: g  reason: collision with root package name */
        public DataInputStream f2627g;

        /* renamed from: h  reason: collision with root package name */
        public ByteOrder f2628h;

        /* renamed from: i  reason: collision with root package name */
        public final int f2629i;

        /* renamed from: j  reason: collision with root package name */
        public int f2630j;

        public b(InputStream inputStream) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f2628h = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f2627g = dataInputStream;
            int available = dataInputStream.available();
            this.f2629i = available;
            this.f2630j = 0;
            this.f2627g.mark(available);
            this.f2628h = byteOrder;
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f2627g.available();
        }

        public long b() {
            return ((long) readInt()) & 4294967295L;
        }

        public void c(long j2) {
            int i2 = this.f2630j;
            if (((long) i2) > j2) {
                this.f2630j = 0;
                this.f2627g.reset();
                this.f2627g.mark(this.f2629i);
            } else {
                j2 -= (long) i2;
            }
            int i3 = (int) j2;
            if (skipBytes(i3) != i3) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public int read() {
            this.f2630j++;
            return this.f2627g.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            int read = this.f2627g.read(bArr, i2, i3);
            this.f2630j += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f2630j++;
            return this.f2627g.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            int i2 = this.f2630j + 1;
            this.f2630j = i2;
            if (i2 <= this.f2629i) {
                int read = this.f2627g.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f2630j += 2;
            return this.f2627g.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            int length = this.f2630j + bArr.length;
            this.f2630j = length;
            if (length > this.f2629i) {
                throw new EOFException();
            } else if (this.f2627g.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) {
            int i4 = this.f2630j + i3;
            this.f2630j = i4;
            if (i4 > this.f2629i) {
                throw new EOFException();
            } else if (this.f2627g.read(bArr, i2, i3) != i3) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() {
            int i2 = this.f2630j + 4;
            this.f2630j = i2;
            if (i2 <= this.f2629i) {
                int read = this.f2627g.read();
                int read2 = this.f2627g.read();
                int read3 = this.f2627g.read();
                int read4 = this.f2627g.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f2628h;
                    if (byteOrder == e) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f2626f) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder f2 = c.c.a.a.a.f("Invalid byte order: ");
                    f2.append(this.f2628h);
                    throw new IOException(f2.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            int i2 = this.f2630j + 8;
            this.f2630j = i2;
            if (i2 <= this.f2629i) {
                int read = this.f2627g.read();
                int read2 = this.f2627g.read();
                int read3 = this.f2627g.read();
                int read4 = this.f2627g.read();
                int read5 = this.f2627g.read();
                int read6 = this.f2627g.read();
                int read7 = this.f2627g.read();
                int read8 = this.f2627g.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f2628h;
                    if (byteOrder == e) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f2626f) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder f2 = c.c.a.a.a.f("Invalid byte order: ");
                    f2.append(this.f2628h);
                    throw new IOException(f2.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            int i2 = this.f2630j + 2;
            this.f2630j = i2;
            if (i2 <= this.f2629i) {
                int read = this.f2627g.read();
                int read2 = this.f2627g.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f2628h;
                    if (byteOrder == e) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f2626f) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder f2 = c.c.a.a.a.f("Invalid byte order: ");
                    f2.append(this.f2628h);
                    throw new IOException(f2.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f2630j += 2;
            return this.f2627g.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f2630j++;
            return this.f2627g.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            int i2 = this.f2630j + 2;
            this.f2630j = i2;
            if (i2 <= this.f2629i) {
                int read = this.f2627g.read();
                int read2 = this.f2627g.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f2628h;
                    if (byteOrder == e) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f2626f) {
                        return (read << 8) + read2;
                    }
                    StringBuilder f2 = c.c.a.a.a.f("Invalid byte order: ");
                    f2.append(this.f2628h);
                    throw new IOException(f2.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) {
            int min = Math.min(i2, this.f2629i - this.f2630j);
            int i3 = 0;
            while (i3 < min) {
                i3 += this.f2627g.skipBytes(min - i3);
            }
            this.f2630j += i3;
            return i3;
        }
    }

    public static class c {
        public final int a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f2631c;

        public c(int i2, int i3, long j2, byte[] bArr) {
            this.a = i2;
            this.b = i3;
            this.f2631c = bArr;
        }

        public c(int i2, int i3, byte[] bArr) {
            this.a = i2;
            this.b = i3;
            this.f2631c = bArr;
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.K);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j2, ByteOrder byteOrder) {
            long[] jArr = {j2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.s[4] * 1)]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                wrap.putInt((int) jArr[i2]);
            }
            return new c(4, 1, wrap.array());
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.s[5] * 1)]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                e eVar2 = eVarArr[i2];
                wrap.putInt((int) eVar2.a);
                wrap.putInt((int) eVar2.b);
            }
            return new c(5, 1, wrap.array());
        }

        public static c d(int i2, ByteOrder byteOrder) {
            int[] iArr = {i2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.s[3] * 1)]);
            wrap.order(byteOrder);
            for (int i3 = 0; i3 < 1; i3++) {
                wrap.putShort((short) iArr[i3]);
            }
            return new c(3, 1, wrap.array());
        }

        public double e(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (h2 instanceof String) {
                return Double.parseDouble((String) h2);
            } else {
                if (h2 instanceof long[]) {
                    long[] jArr = (long[]) h2;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof int[]) {
                    int[] iArr = (int[]) h2;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof double[]) {
                    double[] dArr = (double[]) h2;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof e[]) {
                    e[] eVarArr = (e[]) h2;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return ((double) eVar.a) / ((double) eVar.b);
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int f(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (h2 instanceof String) {
                return Integer.parseInt((String) h2);
            } else {
                if (h2 instanceof long[]) {
                    long[] jArr = (long[]) h2;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h2 instanceof int[]) {
                    int[] iArr = (int[]) h2;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String g(ByteOrder byteOrder) {
            Object h2 = h(byteOrder);
            if (h2 == null) {
                return null;
            }
            if (h2 instanceof String) {
                return (String) h2;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (h2 instanceof long[]) {
                long[] jArr = (long[]) h2;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h2 instanceof int[]) {
                int[] iArr = (int[]) h2;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h2 instanceof double[]) {
                double[] dArr = (double[]) h2;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(h2 instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) h2;
                while (i2 < eVarArr.length) {
                    sb.append(eVarArr[i2].a);
                    sb.append('/');
                    sb.append(eVarArr[i2].b);
                    i2++;
                    if (i2 != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:138:0x0195 A[SYNTHETIC, Splitter:B:138:0x0195] */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01a2 A[SYNTHETIC, Splitter:B:146:0x01a2] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object h(java.nio.ByteOrder r11) {
            /*
            // Method dump skipped, instructions count: 456
            */
            throw new UnsupportedOperationException("Method not decompiled: g.k.a.a.c.h(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("(");
            f2.append(a.r[this.a]);
            f2.append(", data length:");
            f2.append(this.f2631c.length);
            f2.append(")");
            return f2.toString();
        }
    }

    public static class d {
        public final int a;
        public final String b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2632c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2633d;

        public d(String str, int i2, int i3) {
            this.b = str;
            this.a = i2;
            this.f2632c = i3;
            this.f2633d = -1;
        }

        public d(String str, int i2, int i3, int i4) {
            this.b = str;
            this.a = i2;
            this.f2632c = i3;
            this.f2633d = i4;
        }
    }

    public static class e {
        public final long a;
        public final long b;

        public e(long j2, long j3) {
            if (j3 == 0) {
                this.a = 0;
                this.b = 1;
                return;
            }
            this.a = j2;
            this.b = j3;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        u = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        v = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        w = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        x = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        y = dVarArr5;
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        A = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        B = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        C = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        D = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        E = dVarArr10;
        G = new HashMap[dVarArr10.length];
        H = new HashMap[dVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        K = forName;
        L = "Exif\u0000\u0000".getBytes(forName);
        M = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        q = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            d[][] dVarArr11 = E;
            if (i2 < dVarArr11.length) {
                G[i2] = new HashMap<>();
                H[i2] = new HashMap<>();
                d[] dVarArr12 = dVarArr11[i2];
                for (d dVar : dVarArr12) {
                    G[i2].put(Integer.valueOf(dVar.a), dVar);
                    H[i2].put(dVar.b, dVar);
                }
                i2++;
            } else {
                HashMap<Integer, Integer> hashMap = J;
                d[] dVarArr13 = F;
                hashMap.put(Integer.valueOf(dVarArr13[0].a), 5);
                hashMap.put(Integer.valueOf(dVarArr13[1].a), 1);
                hashMap.put(Integer.valueOf(dVarArr13[2].a), 2);
                hashMap.put(Integer.valueOf(dVarArr13[3].a), 3);
                hashMap.put(Integer.valueOf(dVarArr13[4].a), 7);
                hashMap.put(Integer.valueOf(dVarArr13[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public a(InputStream inputStream) {
        boolean z2;
        d[][] dVarArr = E;
        this.R = new HashMap[dVarArr.length];
        this.S = new HashSet(dVarArr.length);
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        FileDescriptor fileDescriptor = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.O = (AssetManager.AssetInputStream) inputStream;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    if (a) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z2 = false;
                }
                if (z2) {
                    this.O = null;
                    fileDescriptor = fileInputStream.getFD();
                }
            }
            this.O = null;
        }
        this.N = fileDescriptor;
        for (int i2 = 0; i2 < E.length; i2++) {
            try {
                this.R[i2] = new HashMap<>();
            } catch (IOException e2) {
                boolean z3 = a;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                }
                a();
                if (!z3) {
                    return;
                }
            } catch (Throwable th) {
                a();
                if (a) {
                    s();
                }
                throw th;
            }
        }
        if (!this.Q) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.P = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (!this.Q) {
            switch (this.P) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    l(bVar);
                    break;
                case 4:
                    g(bVar, 0, 0);
                    break;
                case 7:
                    i(bVar);
                    break;
                case 9:
                    k(bVar);
                    break;
                case 10:
                    m(bVar);
                    break;
                case 12:
                    f(bVar);
                    break;
                case 13:
                    j(bVar);
                    break;
                case 14:
                    o(bVar);
                    break;
            }
        } else {
            n(bVar);
        }
        w(bVar);
        a();
        if (!a) {
            return;
        }
        s();
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i2])));
        }
        return sb.toString();
    }

    public static long[] c(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public static boolean x(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        y(0, 5);
        y(0, 4);
        y(5, 4);
        c cVar = this.R[1].get("PixelXDimension");
        c cVar2 = this.R[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.R[0].put("ImageWidth", cVar);
            this.R[0].put("ImageLength", cVar2);
        }
        if (this.R[4].isEmpty() && q(this.R[5])) {
            HashMap<String, c>[] hashMapArr = this.R;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!q(this.R[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    public final void a() {
        String d2 = d("DateTimeOriginal");
        if (d2 != null && d("DateTime") == null) {
            this.R[0].put("DateTime", c.a(d2));
        }
        if (d("ImageWidth") == null) {
            this.R[0].put("ImageWidth", c.b(0, this.T));
        }
        if (d("ImageLength") == null) {
            this.R[0].put("ImageLength", c.b(0, this.T));
        }
        if (d("Orientation") == null) {
            this.R[0].put("Orientation", c.b(0, this.T));
        }
        if (d("LightSource") == null) {
            this.R[1].put("LightSource", c.b(0, this.T));
        }
    }

    public String d(String str) {
        String str2;
        c e2 = e(str);
        if (e2 != null) {
            if (!I.contains(str)) {
                return e2.g(this.T);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = e2.a;
                if (i2 == 5 || i2 == 10) {
                    e[] eVarArr = (e[]) e2.h(this.T);
                    if (eVarArr == null || eVarArr.length != 3) {
                        StringBuilder f2 = c.c.a.a.a.f("Invalid GPS Timestamp array. array=");
                        f2.append(Arrays.toString(eVarArr));
                        str2 = f2.toString();
                    } else {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVarArr[0].a) / ((float) eVarArr[0].b))), Integer.valueOf((int) (((float) eVarArr[1].a) / ((float) eVarArr[1].b))), Integer.valueOf((int) (((float) eVarArr[2].a) / ((float) eVarArr[2].b))));
                    }
                } else {
                    StringBuilder f3 = c.c.a.a.a.f("GPS Timestamp format is not rational. format=");
                    f3.append(e2.a);
                    str2 = f3.toString();
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(e2.e(this.T));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (a) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < E.length; i2++) {
            c cVar = this.R[i2].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void f(b bVar) {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0084a(this, bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str3 = null;
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.R[0].put("ImageWidth", c.d(Integer.parseInt(str3), this.T));
            }
            if (str2 != null) {
                this.R[0].put("ImageLength", c.d(Integer.parseInt(str2), this.T));
            }
            if (str != null) {
                int i2 = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i2 = 6;
                } else if (parseInt == 180) {
                    i2 = 3;
                } else if (parseInt == 270) {
                    i2 = 8;
                }
                this.R[0].put("Orientation", c.d(i2, this.T));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.c((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i3 = parseInt2 + 6;
                        int i4 = parseInt3 - 6;
                        if (Arrays.equals(bArr, L)) {
                            byte[] bArr2 = new byte[i4];
                            if (bVar.read(bArr2) == i4) {
                                this.Y = i3;
                                u(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (a) {
                Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7 A[FALL_THROUGH] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(g.k.a.a.b r18, int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 508
        */
        throw new UnsupportedOperationException("Method not decompiled: g.k.a.a.g(g.k.a.a$b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cf, code lost:
        if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0143 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8 A[Catch:{ all -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0111 A[SYNTHETIC, Splitter:B:99:0x0111] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(java.io.BufferedInputStream r18) {
        /*
        // Method dump skipped, instructions count: 403
        */
        throw new UnsupportedOperationException("Method not decompiled: g.k.a.a.h(java.io.BufferedInputStream):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(g.k.a.a.b r7) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: g.k.a.a.i(g.k.a.a$b):void");
    }

    public final void j(b bVar) {
        if (a) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f2628h = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f2621j;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i2 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i3 = i2 + 4;
                    if (i3 == 16) {
                        if (!Arrays.equals(bArr2, f2623l)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f2624m)) {
                        if (Arrays.equals(bArr2, f2622k)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.Y = i3;
                                    u(bArr3, 0);
                                    A();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i4 = readInt + 4;
                        bVar.skipBytes(i4);
                        length = i3 + i4;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void k(b bVar) {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        g(bVar, i2, 5);
        bVar.c((long) i3);
        bVar.f2628h = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (a) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == z.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d2 = c.d(readShort, this.T);
                c d3 = c.d(readShort2, this.T);
                this.R[0].put("ImageLength", d2);
                this.R[0].put("ImageWidth", d3);
                if (a) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void l(b bVar) {
        c cVar;
        r(bVar, bVar.available());
        v(bVar, 0);
        z(bVar, 0);
        z(bVar, 5);
        z(bVar, 4);
        A();
        if (this.P == 8 && (cVar = this.R[1].get("MakerNote")) != null) {
            b bVar2 = new b(cVar.f2631c);
            bVar2.f2628h = this.T;
            bVar2.c(6);
            v(bVar2, 9);
            c cVar2 = this.R[9].get("ColorSpace");
            if (cVar2 != null) {
                this.R[1].put("ColorSpace", cVar2);
            }
        }
    }

    public final void m(b bVar) {
        l(bVar);
        if (this.R[0].get("JpgFromRaw") != null) {
            g(bVar, this.c0, 5);
        }
        c cVar = this.R[0].get("ISO");
        c cVar2 = this.R[1].get("PhotographicSensitivity");
        if (cVar != null && cVar2 == null) {
            this.R[1].put("PhotographicSensitivity", cVar);
        }
    }

    public final void n(b bVar) {
        byte[] bArr = L;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.Y = bArr.length;
        u(bArr2, 0);
    }

    public final void o(b bVar) {
        if (a) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f2628h = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(n.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(o.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i2 = skipBytes + 4 + 4;
                    if (Arrays.equals(p, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.Y = i2;
                            u(bArr2, 0);
                            this.Y = i2;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i3 = i2 + readInt2;
                    if (i3 != readInt) {
                        if (i3 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i2 + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f2 = cVar.f(this.T);
            int f3 = cVar2.f(this.T);
            if (this.P == 7) {
                f2 += this.Z;
            }
            int min = Math.min(f3, bVar.f2629i - f2);
            if (f2 > 0 && min > 0) {
                int i2 = this.Y + f2;
                this.V = i2;
                this.W = min;
                if (this.O == null && this.N == null) {
                    bVar.c((long) i2);
                    bVar.readFully(new byte[min]);
                }
            }
            if (a) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f2 + ", length: " + min);
            }
        }
    }

    public final boolean q(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.f(this.T) <= 512 && cVar2.f(this.T) <= 512;
    }

    public final void r(b bVar, int i2) {
        ByteOrder t2 = t(bVar);
        this.T = t2;
        bVar.f2628h = t2;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i3 = this.P;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException(c.c.a.a.a.l("Invalid first Ifd offset: ", readInt));
            }
            int i4 = readInt - 8;
            if (i4 > 0 && bVar.skipBytes(i4) != i4) {
                throw new IOException(c.c.a.a.a.l("Couldn't jump to first Ifd: ", i4));
            }
            return;
        }
        StringBuilder f2 = c.c.a.a.a.f("Invalid start code: ");
        f2.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(f2.toString());
    }

    public final void s() {
        for (int i2 = 0; i2 < this.R.length; i2++) {
            StringBuilder g2 = c.c.a.a.a.g("The size of tag group[", i2, "]: ");
            g2.append(this.R[i2].size());
            Log.d("ExifInterface", g2.toString());
            for (Map.Entry<String, c> entry : this.R[i2].entrySet()) {
                c value = entry.getValue();
                StringBuilder f2 = c.c.a.a.a.f("tagName: ");
                f2.append(entry.getKey());
                f2.append(", tagType: ");
                f2.append(value.toString());
                f2.append(", tagValue: '");
                f2.append(value.g(this.T));
                f2.append("'");
                Log.d("ExifInterface", f2.toString());
            }
        }
    }

    public final ByteOrder t(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (a) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (a) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder f2 = c.c.a.a.a.f("Invalid byte order: ");
            f2.append(Integer.toHexString(readShort));
            throw new IOException(f2.toString());
        }
    }

    public final void u(byte[] bArr, int i2) {
        b bVar = new b(bArr);
        r(bVar, bArr.length);
        v(bVar, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(g.k.a.a.b r24, int r25) {
        /*
        // Method dump skipped, instructions count: 1035
        */
        throw new UnsupportedOperationException("Method not decompiled: g.k.a.a.v(g.k.a.a$b, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(g.k.a.a.b r19) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: g.k.a.a.w(g.k.a.a$b):void");
    }

    public final void y(int i2, int i3) {
        String str;
        if (!this.R[i2].isEmpty() && !this.R[i3].isEmpty()) {
            c cVar = this.R[i2].get("ImageLength");
            c cVar2 = this.R[i2].get("ImageWidth");
            c cVar3 = this.R[i3].get("ImageLength");
            c cVar4 = this.R[i3].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (a) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (cVar3 != null && cVar4 != null) {
                int f2 = cVar.f(this.T);
                int f3 = cVar2.f(this.T);
                int f4 = cVar3.f(this.T);
                int f5 = cVar4.f(this.T);
                if (f2 < f4 && f3 < f5) {
                    HashMap<String, c>[] hashMapArr = this.R;
                    HashMap<String, c> hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                    return;
                }
                return;
            } else if (a) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
            Log.d("ExifInterface", str);
        } else if (a) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void z(b bVar, int i2) {
        c cVar;
        StringBuilder sb;
        String str;
        c cVar2;
        c cVar3;
        c cVar4 = this.R[i2].get("DefaultCropSize");
        c cVar5 = this.R[i2].get("SensorTopBorder");
        c cVar6 = this.R[i2].get("SensorLeftBorder");
        c cVar7 = this.R[i2].get("SensorBottomBorder");
        c cVar8 = this.R[i2].get("SensorRightBorder");
        if (cVar4 != null) {
            if (cVar4.a == 5) {
                e[] eVarArr = (e[]) cVar4.h(this.T);
                if (eVarArr == null || eVarArr.length != 2) {
                    sb = c.c.a.a.a.f("Invalid crop size values. cropSize=");
                    str = Arrays.toString(eVarArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                cVar3 = c.c(eVarArr[0], this.T);
                cVar2 = c.c(eVarArr[1], this.T);
            } else {
                int[] iArr = (int[]) cVar4.h(this.T);
                if (iArr == null || iArr.length != 2) {
                    sb = c.c.a.a.a.f("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                cVar3 = c.d(iArr[0], this.T);
                cVar2 = c.d(iArr[1], this.T);
            }
            this.R[i2].put("ImageWidth", cVar3);
            this.R[i2].put("ImageLength", cVar2);
        } else if (cVar5 == null || cVar6 == null || cVar7 == null || cVar8 == null) {
            c cVar9 = this.R[i2].get("ImageLength");
            c cVar10 = this.R[i2].get("ImageWidth");
            if ((cVar9 == null || cVar10 == null) && (cVar = this.R[i2].get("JPEGInterchangeFormat")) != null) {
                g(bVar, cVar.f(this.T), i2);
            }
        } else {
            int f2 = cVar5.f(this.T);
            int f3 = cVar7.f(this.T);
            int f4 = cVar8.f(this.T);
            int f5 = cVar6.f(this.T);
            if (f3 > f2 && f4 > f5) {
                c d2 = c.d(f3 - f2, this.T);
                c d3 = c.d(f4 - f5, this.T);
                this.R[i2].put("ImageLength", d2);
                this.R[i2].put("ImageWidth", d3);
            }
        }
    }
}
