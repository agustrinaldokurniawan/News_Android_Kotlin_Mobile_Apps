package j;

import i.j;
import i.s.c.f;
import i.s.c.h;
import i.x.e;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a0 {
    public static final Pattern a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: c  reason: collision with root package name */
    public static final a f3357c = null;

    /* renamed from: d  reason: collision with root package name */
    public final String f3358d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f3359f;

    public static final class a {
        public static final a0 a(String str) {
            h.f(str, "$this$toMediaType");
            Matcher matcher = a0.a.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                h.b(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                h.b(locale, "Locale.US");
                String lowerCase = group.toLowerCase(locale);
                h.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                h.b(group2, "typeSubtype.group(2)");
                h.b(locale, "Locale.US");
                String lowerCase2 = group2.toLowerCase(locale);
                h.b(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = a0.b.matcher(str);
                for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 != null) {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (e.u(group4, "'", false, 2) && e.c(group4, "'", false, 2) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                h.b(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                        }
                    } else {
                        StringBuilder f2 = c.c.a.a.a.f("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        h.b(substring, "(this as java.lang.String).substring(startIndex)");
                        f2.append(substring);
                        f2.append("\" for: \"");
                        f2.append(str);
                        f2.append('\"');
                        throw new IllegalArgumentException(f2.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new a0(str, lowerCase, lowerCase2, (String[]) array, null);
                }
                throw new j("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
    }

    public a0(String str, String str2, String str3, String[] strArr, f fVar) {
        this.f3358d = str;
        this.e = str2;
        this.f3359f = strArr;
    }

    public static final a0 a(String str) {
        return a.a(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && h.a(((a0) obj).f3358d, this.f3358d);
    }

    public int hashCode() {
        return this.f3358d.hashCode();
    }

    public String toString() {
        return this.f3358d;
    }
}
