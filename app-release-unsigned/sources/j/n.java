package j;

import c.c.a.a.a;
import i.s.c.f;
import i.s.c.h;
import i.x.e;
import j.n0.c;
import j.n0.h.c;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class n {
    public static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f3458c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f3459d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public static final n e = null;

    /* renamed from: f  reason: collision with root package name */
    public final String f3460f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3461g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3462h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3463i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3464j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3465k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3466l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f3467m;
    public final boolean n;

    public n(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, f fVar) {
        this.f3460f = str;
        this.f3461g = str2;
        this.f3462h = j2;
        this.f3463i = str3;
        this.f3464j = str4;
        this.f3465k = z;
        this.f3466l = z2;
        this.f3467m = z3;
        this.n = z4;
    }

    public static final int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            boolean z2 = true;
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || '9' < charAt) && (('a' > charAt || 'z' < charAt) && (('A' > charAt || 'Z' < charAt) && charAt != ':')))) {
                z2 = false;
            }
            if (z2 == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final long b(String str, int i2, int i3) {
        int a2 = a(str, i2, i3, false);
        Matcher matcher = f3459d.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i3) {
            int a3 = a(str, a2 + 1, i3, true);
            matcher.region(a2, a3);
            if (i5 == -1 && matcher.usePattern(f3459d).matches()) {
                String group = matcher.group(1);
                h.b(group, "matcher.group(1)");
                i5 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                h.b(group2, "matcher.group(2)");
                i8 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                h.b(group3, "matcher.group(3)");
                i9 = Integer.parseInt(group3);
            } else if (i6 != -1 || !matcher.usePattern(f3458c).matches()) {
                if (i7 == -1) {
                    Pattern pattern = b;
                    if (matcher.usePattern(pattern).matches()) {
                        String group4 = matcher.group(1);
                        h.b(group4, "matcher.group(1)");
                        Locale locale = Locale.US;
                        h.b(locale, "Locale.US");
                        String lowerCase = group4.toLowerCase(locale);
                        h.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        h.b(pattern2, "MONTH_PATTERN.pattern()");
                        i7 = e.j(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(a).matches()) {
                    String group5 = matcher.group(1);
                    h.b(group5, "matcher.group(1)");
                    i4 = Integer.parseInt(group5);
                }
            } else {
                String group6 = matcher.group(1);
                h.b(group6, "matcher.group(1)");
                i6 = Integer.parseInt(group6);
            }
            a2 = a(str, a3 + 1, i3, false);
        }
        if (70 <= i4 && 99 >= i4) {
            i4 += 1900;
        }
        if (i4 >= 0 && 69 >= i4) {
            i4 += 2000;
        }
        if (i4 >= 1601) {
            if (i7 != -1) {
                if (1 <= i6 && 31 >= i6) {
                    if (i5 >= 0 && 23 >= i5) {
                        if (i8 >= 0 && 59 >= i8) {
                            if (i9 >= 0 && 59 >= i9) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(c.e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i4);
                                gregorianCalendar.set(2, i7 - 1);
                                gregorianCalendar.set(5, i6);
                                gregorianCalendar.set(11, i5);
                                gregorianCalendar.set(12, i8);
                                gregorianCalendar.set(13, i9);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final long c(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            h.e("-?\\d+", "pattern");
            Pattern compile = Pattern.compile("-?\\d+");
            h.d(compile, "Pattern.compile(pattern)");
            h.e(compile, "nativePattern");
            h.e(str, "input");
            if (!compile.matcher(str).matches()) {
                throw e2;
            } else if (e.u(str, "-", false, 2)) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return h.a(nVar.f3460f, this.f3460f) && h.a(nVar.f3461g, this.f3461g) && nVar.f3462h == this.f3462h && h.a(nVar.f3463i, this.f3463i) && h.a(nVar.f3464j, this.f3464j) && nVar.f3465k == this.f3465k && nVar.f3466l == this.f3466l && nVar.f3467m == this.f3467m && nVar.n == this.n;
        }
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int b2 = a.b(this.f3461g, a.b(this.f3460f, 527, 31), 31);
        int b3 = a.b(this.f3464j, a.b(this.f3463i, (Long.hashCode(this.f3462h) + b2) * 31, 31), 31);
        int hashCode = Boolean.hashCode(this.f3466l);
        int hashCode2 = Boolean.hashCode(this.f3467m);
        return Boolean.hashCode(this.n) + ((hashCode2 + ((hashCode + ((Boolean.hashCode(this.f3465k) + b3) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3460f);
        sb.append('=');
        sb.append(this.f3461g);
        if (this.f3467m) {
            if (this.f3462h == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                Date date = new Date(this.f3462h);
                c.a aVar = j.n0.h.c.a;
                h.f(date, "$this$toHttpDateString");
                str = ((DateFormat) j.n0.h.c.a.get()).format(date);
                h.b(str, "STANDARD_DATE_FORMAT.get().format(this)");
            }
            sb.append(str);
        }
        if (!this.n) {
            sb.append("; domain=");
            sb.append(this.f3463i);
        }
        sb.append("; path=");
        sb.append(this.f3464j);
        if (this.f3465k) {
            sb.append("; secure");
        }
        if (this.f3466l) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        h.b(sb2, "toString()");
        return sb2;
    }
}
