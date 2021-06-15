package c.e.b.a0.z;

import c.e.b.a0.s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class o {
    public static final c.e.b.x<String> A;
    public static final c.e.b.x<BigDecimal> B = new h();
    public static final c.e.b.x<BigInteger> C = new i();
    public static final c.e.b.y D;
    public static final c.e.b.x<StringBuilder> E;
    public static final c.e.b.y F;
    public static final c.e.b.x<StringBuffer> G;
    public static final c.e.b.y H;
    public static final c.e.b.x<URL> I;
    public static final c.e.b.y J;
    public static final c.e.b.x<URI> K;
    public static final c.e.b.y L;
    public static final c.e.b.x<InetAddress> M;
    public static final c.e.b.y N;
    public static final c.e.b.x<UUID> O;
    public static final c.e.b.y P;
    public static final c.e.b.x<Currency> Q;
    public static final c.e.b.y R;
    public static final c.e.b.y S = new r();
    public static final c.e.b.x<Calendar> T;
    public static final c.e.b.y U;
    public static final c.e.b.x<Locale> V;
    public static final c.e.b.y W;
    public static final c.e.b.x<c.e.b.n> X;
    public static final c.e.b.y Y;
    public static final c.e.b.y Z = new w();
    public static final c.e.b.x<Class> a;
    public static final c.e.b.y b;

    /* renamed from: c  reason: collision with root package name */
    public static final c.e.b.x<BitSet> f1490c;

    /* renamed from: d  reason: collision with root package name */
    public static final c.e.b.y f1491d;
    public static final c.e.b.x<Boolean> e;

    /* renamed from: f  reason: collision with root package name */
    public static final c.e.b.x<Boolean> f1492f = new y();

    /* renamed from: g  reason: collision with root package name */
    public static final c.e.b.y f1493g;

    /* renamed from: h  reason: collision with root package name */
    public static final c.e.b.x<Number> f1494h;

    /* renamed from: i  reason: collision with root package name */
    public static final c.e.b.y f1495i;

    /* renamed from: j  reason: collision with root package name */
    public static final c.e.b.x<Number> f1496j;

    /* renamed from: k  reason: collision with root package name */
    public static final c.e.b.y f1497k;

    /* renamed from: l  reason: collision with root package name */
    public static final c.e.b.x<Number> f1498l;

    /* renamed from: m  reason: collision with root package name */
    public static final c.e.b.y f1499m;
    public static final c.e.b.x<AtomicInteger> n;
    public static final c.e.b.y o;
    public static final c.e.b.x<AtomicBoolean> p;
    public static final c.e.b.y q;
    public static final c.e.b.x<AtomicIntegerArray> r;
    public static final c.e.b.y s;
    public static final c.e.b.x<Number> t = new b();
    public static final c.e.b.x<Number> u = new c();
    public static final c.e.b.x<Number> v = new d();
    public static final c.e.b.x<Number> w;
    public static final c.e.b.y x;
    public static final c.e.b.x<Character> y;
    public static final c.e.b.y z;

    public class a extends c.e.b.x<AtomicIntegerArray> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public AtomicIntegerArray a(c.e.b.c0.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.b0()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.h0()));
                } catch (NumberFormatException e) {
                    throw new c.e.b.v(e);
                }
            }
            aVar.u();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, AtomicIntegerArray atomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            cVar.c();
            int length = atomicIntegerArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.h0((long) atomicIntegerArray2.get(i2));
            }
            cVar.u();
        }
    }

    public class a0 extends c.e.b.x<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Number a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.h0());
            } catch (NumberFormatException e) {
                throw new c.e.b.v(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Number number) {
            cVar.j0(number);
        }
    }

    public class b extends c.e.b.x<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Number a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            try {
                return Long.valueOf(aVar.i0());
            } catch (NumberFormatException e) {
                throw new c.e.b.v(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Number number) {
            cVar.j0(number);
        }
    }

    public class b0 extends c.e.b.x<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Number a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.h0());
            } catch (NumberFormatException e) {
                throw new c.e.b.v(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Number number) {
            cVar.j0(number);
        }
    }

    public class c extends c.e.b.x<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Number a(c.e.b.c0.a aVar) {
            if (aVar.p0() != c.e.b.c0.b.NULL) {
                return Float.valueOf((float) aVar.g0());
            }
            aVar.l0();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Number number) {
            cVar.j0(number);
        }
    }

    public class c0 extends c.e.b.x<AtomicInteger> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public AtomicInteger a(c.e.b.c0.a aVar) {
            try {
                return new AtomicInteger(aVar.h0());
            } catch (NumberFormatException e) {
                throw new c.e.b.v(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, AtomicInteger atomicInteger) {
            cVar.h0((long) atomicInteger.get());
        }
    }

    public class d extends c.e.b.x<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Number a(c.e.b.c0.a aVar) {
            if (aVar.p0() != c.e.b.c0.b.NULL) {
                return Double.valueOf(aVar.g0());
            }
            aVar.l0();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Number number) {
            cVar.j0(number);
        }
    }

    public class d0 extends c.e.b.x<AtomicBoolean> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public AtomicBoolean a(c.e.b.c0.a aVar) {
            return new AtomicBoolean(aVar.f0());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, AtomicBoolean atomicBoolean) {
            cVar.l0(atomicBoolean.get());
        }
    }

    public class e extends c.e.b.x<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Number a(c.e.b.c0.a aVar) {
            c.e.b.c0.b p0 = aVar.p0();
            int ordinal = p0.ordinal();
            if (ordinal == 5 || ordinal == 6) {
                return new c.e.b.a0.r(aVar.n0());
            }
            if (ordinal == 8) {
                aVar.l0();
                return null;
            }
            throw new c.e.b.v("Expecting number, got: " + p0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Number number) {
            cVar.j0(number);
        }
    }

    public static final class e0<T extends Enum<T>> extends c.e.b.x<T> {
        public final Map<String, T> a = new HashMap();
        public final Map<T, String> b = new HashMap();

        public e0(Class<T> cls) {
            try {
                T[] enumConstants = cls.getEnumConstants();
                for (T t : enumConstants) {
                    String name = t.name();
                    c.e.b.z.b bVar = (c.e.b.z.b) cls.getField(name).getAnnotation(c.e.b.z.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.a.put(str, t);
                        }
                    }
                    this.a.put(name, t);
                    this.b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // c.e.b.x
        public Object a(c.e.b.c0.a aVar) {
            if (aVar.p0() != c.e.b.c0.b.NULL) {
                return this.a.get(aVar.n0());
            }
            aVar.l0();
            return null;
        }

        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Object obj) {
            Enum r3 = (Enum) obj;
            cVar.k0(r3 == null ? null : this.b.get(r3));
        }
    }

    public class f extends c.e.b.x<Character> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Character a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            String n0 = aVar.n0();
            if (n0.length() == 1) {
                return Character.valueOf(n0.charAt(0));
            }
            throw new c.e.b.v(c.c.a.a.a.q("Expecting character, got: ", n0));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Character ch) {
            Character ch2 = ch;
            cVar.k0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    public class g extends c.e.b.x<String> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public String a(c.e.b.c0.a aVar) {
            c.e.b.c0.b p0 = aVar.p0();
            if (p0 != c.e.b.c0.b.NULL) {
                return p0 == c.e.b.c0.b.BOOLEAN ? Boolean.toString(aVar.f0()) : aVar.n0();
            }
            aVar.l0();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, String str) {
            cVar.k0(str);
        }
    }

    public class h extends c.e.b.x<BigDecimal> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public BigDecimal a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            try {
                return new BigDecimal(aVar.n0());
            } catch (NumberFormatException e) {
                throw new c.e.b.v(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, BigDecimal bigDecimal) {
            cVar.j0(bigDecimal);
        }
    }

    public class i extends c.e.b.x<BigInteger> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public BigInteger a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            try {
                return new BigInteger(aVar.n0());
            } catch (NumberFormatException e) {
                throw new c.e.b.v(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, BigInteger bigInteger) {
            cVar.j0(bigInteger);
        }
    }

    public class j extends c.e.b.x<StringBuilder> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public StringBuilder a(c.e.b.c0.a aVar) {
            if (aVar.p0() != c.e.b.c0.b.NULL) {
                return new StringBuilder(aVar.n0());
            }
            aVar.l0();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            cVar.k0(sb2 == null ? null : sb2.toString());
        }
    }

    public class k extends c.e.b.x<Class> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Class a(c.e.b.c0.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Class cls) {
            StringBuilder f2 = c.c.a.a.a.f("Attempted to serialize java.lang.Class: ");
            f2.append(cls.getName());
            f2.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(f2.toString());
        }
    }

    public class l extends c.e.b.x<StringBuffer> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public StringBuffer a(c.e.b.c0.a aVar) {
            if (aVar.p0() != c.e.b.c0.b.NULL) {
                return new StringBuffer(aVar.n0());
            }
            aVar.l0();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, StringBuffer stringBuffer) {
            StringBuffer stringBuffer2 = stringBuffer;
            cVar.k0(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    public class m extends c.e.b.x<URL> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public URL a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            String n0 = aVar.n0();
            if ("null".equals(n0)) {
                return null;
            }
            return new URL(n0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, URL url) {
            URL url2 = url;
            cVar.k0(url2 == null ? null : url2.toExternalForm());
        }
    }

    public class n extends c.e.b.x<URI> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public URI a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            try {
                String n0 = aVar.n0();
                if ("null".equals(n0)) {
                    return null;
                }
                return new URI(n0);
            } catch (URISyntaxException e) {
                throw new c.e.b.o(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, URI uri) {
            URI uri2 = uri;
            cVar.k0(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* renamed from: c.e.b.a0.z.o$o  reason: collision with other inner class name */
    public class C0048o extends c.e.b.x<InetAddress> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public InetAddress a(c.e.b.c0.a aVar) {
            if (aVar.p0() != c.e.b.c0.b.NULL) {
                return InetAddress.getByName(aVar.n0());
            }
            aVar.l0();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, InetAddress inetAddress) {
            InetAddress inetAddress2 = inetAddress;
            cVar.k0(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    public class p extends c.e.b.x<UUID> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public UUID a(c.e.b.c0.a aVar) {
            if (aVar.p0() != c.e.b.c0.b.NULL) {
                return UUID.fromString(aVar.n0());
            }
            aVar.l0();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, UUID uuid) {
            UUID uuid2 = uuid;
            cVar.k0(uuid2 == null ? null : uuid2.toString());
        }
    }

    public class q extends c.e.b.x<Currency> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Currency a(c.e.b.c0.a aVar) {
            return Currency.getInstance(aVar.n0());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Currency currency) {
            cVar.k0(currency.getCurrencyCode());
        }
    }

    public class r implements c.e.b.y {

        public class a extends c.e.b.x<Timestamp> {
            public final /* synthetic */ c.e.b.x a;

            public a(r rVar, c.e.b.x xVar) {
                this.a = xVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // c.e.b.x
            public Timestamp a(c.e.b.c0.a aVar) {
                Date date = (Date) this.a.a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
            @Override // c.e.b.x
            public void b(c.e.b.c0.c cVar, Timestamp timestamp) {
                this.a.b(cVar, timestamp);
            }
        }

        @Override // c.e.b.y
        public <T> c.e.b.x<T> a(c.e.b.i iVar, c.e.b.b0.a<T> aVar) {
            if (aVar.a != Timestamp.class) {
                return null;
            }
            Objects.requireNonNull(iVar);
            return new a(this, iVar.b(new c.e.b.b0.a<>(Date.class)));
        }
    }

    public class s extends c.e.b.x<Calendar> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Calendar a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            aVar.c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.p0() != c.e.b.c0.b.END_OBJECT) {
                String j0 = aVar.j0();
                int h0 = aVar.h0();
                if ("year".equals(j0)) {
                    i2 = h0;
                } else if ("month".equals(j0)) {
                    i3 = h0;
                } else if ("dayOfMonth".equals(j0)) {
                    i4 = h0;
                } else if ("hourOfDay".equals(j0)) {
                    i5 = h0;
                } else if ("minute".equals(j0)) {
                    i6 = h0;
                } else if ("second".equals(j0)) {
                    i7 = h0;
                }
            }
            aVar.K();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Calendar calendar) {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                cVar.b0();
                return;
            }
            cVar.e();
            cVar.Q("year");
            cVar.h0((long) calendar2.get(1));
            cVar.Q("month");
            cVar.h0((long) calendar2.get(2));
            cVar.Q("dayOfMonth");
            cVar.h0((long) calendar2.get(5));
            cVar.Q("hourOfDay");
            cVar.h0((long) calendar2.get(11));
            cVar.Q("minute");
            cVar.h0((long) calendar2.get(12));
            cVar.Q("second");
            cVar.h0((long) calendar2.get(13));
            cVar.K();
        }
    }

    public class t extends c.e.b.x<Locale> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Locale a(c.e.b.c0.a aVar) {
            Locale locale;
            String str = null;
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.n0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str != null) {
                locale = new Locale(nextToken, nextToken2, str);
            }
            return locale;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Locale locale) {
            Locale locale2 = locale;
            cVar.k0(locale2 == null ? null : locale2.toString());
        }
    }

    public class u extends c.e.b.x<c.e.b.n> {
        /* renamed from: c */
        public c.e.b.n a(c.e.b.c0.a aVar) {
            int ordinal = aVar.p0().ordinal();
            if (ordinal == 0) {
                c.e.b.k kVar = new c.e.b.k();
                aVar.b();
                while (aVar.b0()) {
                    kVar.e.add(a(aVar));
                }
                aVar.u();
                return kVar;
            } else if (ordinal == 2) {
                c.e.b.q qVar = new c.e.b.q();
                aVar.c();
                while (aVar.b0()) {
                    qVar.a.put(aVar.j0(), a(aVar));
                }
                aVar.K();
                return qVar;
            } else if (ordinal == 5) {
                return new c.e.b.s(aVar.n0());
            } else {
                if (ordinal == 6) {
                    return new c.e.b.s(new c.e.b.a0.r(aVar.n0()));
                }
                if (ordinal == 7) {
                    return new c.e.b.s(Boolean.valueOf(aVar.f0()));
                }
                if (ordinal == 8) {
                    aVar.l0();
                    return c.e.b.p.a;
                }
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: d */
        public void b(c.e.b.c0.c cVar, c.e.b.n nVar) {
            if (nVar == null || (nVar instanceof c.e.b.p)) {
                cVar.b0();
            } else if (nVar instanceof c.e.b.s) {
                c.e.b.s a = nVar.a();
                Object obj = a.a;
                if (obj instanceof Number) {
                    cVar.j0(a.c());
                } else if (obj instanceof Boolean) {
                    cVar.l0(a.b());
                } else {
                    cVar.k0(a.d());
                }
            } else {
                boolean z = nVar instanceof c.e.b.k;
                if (z) {
                    cVar.c();
                    if (z) {
                        Iterator<c.e.b.n> it = ((c.e.b.k) nVar).iterator();
                        while (it.hasNext()) {
                            b(cVar, it.next());
                        }
                        cVar.u();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + nVar);
                }
                boolean z2 = nVar instanceof c.e.b.q;
                if (z2) {
                    cVar.e();
                    if (z2) {
                        c.e.b.a0.s sVar = c.e.b.a0.s.this;
                        s.e<K, V> eVar = sVar.f1459j.f1467h;
                        int i2 = sVar.f1458i;
                        while (true) {
                            s.e<K, V> eVar2 = sVar.f1459j;
                            if (!(eVar != eVar2)) {
                                cVar.K();
                                return;
                            } else if (eVar == eVar2) {
                                throw new NoSuchElementException();
                            } else if (sVar.f1458i == i2) {
                                s.e<K, V> eVar3 = eVar.f1467h;
                                cVar.Q(eVar.f1469j);
                                b(cVar, eVar.f1470k);
                                eVar = eVar3;
                            } else {
                                throw new ConcurrentModificationException();
                            }
                        }
                    } else {
                        throw new IllegalStateException("Not a JSON Object: " + nVar);
                    }
                } else {
                    StringBuilder f2 = c.c.a.a.a.f("Couldn't write ");
                    f2.append(nVar.getClass());
                    throw new IllegalArgumentException(f2.toString());
                }
            }
        }
    }

    public class v extends c.e.b.x<BitSet> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
            if (r7.h0() != 0) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
            r1 = false;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0054 A[SYNTHETIC] */
        @Override // c.e.b.x
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet a(c.e.b.c0.a r7) {
            /*
            // Method dump skipped, instructions count: 107
            */
            throw new UnsupportedOperationException("Method not decompiled: c.e.b.a0.z.o.v.a(c.e.b.c0.a):java.lang.Object");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            cVar.c();
            int length = bitSet2.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.h0(bitSet2.get(i2) ? 1 : 0);
            }
            cVar.u();
        }
    }

    public class w implements c.e.b.y {
        @Override // c.e.b.y
        public <T> c.e.b.x<T> a(c.e.b.i iVar, c.e.b.b0.a<T> aVar) {
            Class<? super T> cls = aVar.a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new e0(cls);
        }
    }

    public class x extends c.e.b.x<Boolean> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Boolean a(c.e.b.c0.a aVar) {
            c.e.b.c0.b p0 = aVar.p0();
            if (p0 == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            return Boolean.valueOf(p0 == c.e.b.c0.b.STRING ? Boolean.parseBoolean(aVar.n0()) : aVar.f0());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Boolean bool) {
            cVar.i0(bool);
        }
    }

    public class y extends c.e.b.x<Boolean> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Boolean a(c.e.b.c0.a aVar) {
            if (aVar.p0() != c.e.b.c0.b.NULL) {
                return Boolean.valueOf(aVar.n0());
            }
            aVar.l0();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Boolean bool) {
            Boolean bool2 = bool;
            cVar.k0(bool2 == null ? "null" : bool2.toString());
        }
    }

    public class z extends c.e.b.x<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.e.b.x
        public Number a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.h0());
            } catch (NumberFormatException e) {
                throw new c.e.b.v(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
        @Override // c.e.b.x
        public void b(c.e.b.c0.c cVar, Number number) {
            cVar.j0(number);
        }
    }

    static {
        c.e.b.w wVar = new c.e.b.w(new k());
        a = wVar;
        b = new p(Class.class, wVar);
        c.e.b.w wVar2 = new c.e.b.w(new v());
        f1490c = wVar2;
        f1491d = new p(BitSet.class, wVar2);
        x xVar = new x();
        e = xVar;
        f1493g = new q(Boolean.TYPE, Boolean.class, xVar);
        z zVar = new z();
        f1494h = zVar;
        f1495i = new q(Byte.TYPE, Byte.class, zVar);
        a0 a0Var = new a0();
        f1496j = a0Var;
        f1497k = new q(Short.TYPE, Short.class, a0Var);
        b0 b0Var = new b0();
        f1498l = b0Var;
        f1499m = new q(Integer.TYPE, Integer.class, b0Var);
        c.e.b.w wVar3 = new c.e.b.w(new c0());
        n = wVar3;
        o = new p(AtomicInteger.class, wVar3);
        c.e.b.w wVar4 = new c.e.b.w(new d0());
        p = wVar4;
        q = new p(AtomicBoolean.class, wVar4);
        c.e.b.w wVar5 = new c.e.b.w(new a());
        r = wVar5;
        s = new p(AtomicIntegerArray.class, wVar5);
        e eVar = new e();
        w = eVar;
        x = new p(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = new q(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        D = new p(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = new p(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = new p(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = new p(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = new p(URI.class, nVar);
        C0048o oVar = new C0048o();
        M = oVar;
        N = new s(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = new p(UUID.class, pVar);
        c.e.b.w wVar6 = new c.e.b.w(new q());
        Q = wVar6;
        R = new p(Currency.class, wVar6);
        s sVar = new s();
        T = sVar;
        U = new r(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = new p(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = new s(c.e.b.n.class, uVar);
    }
}
