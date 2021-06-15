package g.h.h;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import g.h.h.d;
import java.util.Locale;

public final class a {
    public static final c a;
    public static final String b = Character.toString(8206);

    /* renamed from: c  reason: collision with root package name */
    public static final String f2508c = Character.toString(8207);

    /* renamed from: d  reason: collision with root package name */
    public static final a f2509d;
    public static final a e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2510f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2511g;

    /* renamed from: h  reason: collision with root package name */
    public final c f2512h;

    /* renamed from: g.h.h.a$a  reason: collision with other inner class name */
    public static class C0075a {
        public static final byte[] a = new byte[1792];
        public final CharSequence b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2513c;

        /* renamed from: d  reason: collision with root package name */
        public int f2514d;
        public char e;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                a[i2] = Character.getDirectionality(i2);
            }
        }

        public C0075a(CharSequence charSequence, boolean z) {
            this.b = charSequence;
            this.f2513c = charSequence.length();
        }

        public byte a() {
            char charAt = this.b.charAt(this.f2514d - 1);
            this.e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.b, this.f2514d);
                this.f2514d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2514d--;
            char c2 = this.e;
            return c2 < 1792 ? a[c2] : Character.getDirectionality(c2);
        }
    }

    static {
        c cVar = d.f2517c;
        a = cVar;
        f2509d = new a(false, 2, cVar);
        e = new a(true, 2, cVar);
    }

    public a(boolean z, int i2, c cVar) {
        this.f2510f = z;
        this.f2511g = i2;
        this.f2512h = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.h.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            g.h.h.a$a r0 = new g.h.h.a$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.f2513c
            r0.f2514d = r6
            r6 = r1
        L_0x000b:
            r2 = r6
        L_0x000c:
            int r3 = r0.f2514d
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r6 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r6 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r6 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r1 = r4
            goto L_0x0041
        L_0x0036:
            if (r6 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r1 = -1
            goto L_0x0041
        L_0x003d:
            if (r6 != 0) goto L_0x000c
        L_0x003f:
            r6 = r2
            goto L_0x000b
        L_0x0041:
            return r1
            switch-data {14->0x002c, 15->0x002c, 16->0x0029, 17->0x0029, 18->0x0026, }
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.h.a.b(java.lang.CharSequence):int");
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        Locale locale2 = e.a;
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z = false;
        }
        c cVar = a;
        if (cVar == a) {
            return z ? e : f2509d;
        }
        return new a(z, 2, cVar);
    }

    public CharSequence d(CharSequence charSequence, c cVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean b2 = ((d.c) cVar).b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.f2511g & 2) != 0) && z) {
            boolean b3 = ((d.c) (b2 ? d.b : d.a)).b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.f2510f || (!b3 && a(charSequence) != 1)) ? (!this.f2510f || (b3 && a(charSequence) != -1)) ? str : f2508c : b));
        }
        if (b2 != this.f2510f) {
            spannableStringBuilder.append(b2 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean b4 = ((d.c) (b2 ? d.b : d.a)).b(charSequence, 0, charSequence.length());
            if (!this.f2510f && (b4 || b(charSequence) == 1)) {
                str = b;
            } else if (this.f2510f && (!b4 || b(charSequence) == -1)) {
                str = f2508c;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }
}
