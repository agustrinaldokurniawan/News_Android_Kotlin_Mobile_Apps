package g.p;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h {
    public static final Pattern a = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public final ArrayList<String> b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, b> f2838c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public Pattern f2839d = null;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2840f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2841g;

    /* renamed from: h  reason: collision with root package name */
    public Pattern f2842h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2843i;

    public static class a implements Comparable<a> {
        public String e;

        /* renamed from: f  reason: collision with root package name */
        public String f2844f;

        public a(String str) {
            String[] split = str.split("/", -1);
            this.e = split[0];
            this.f2844f = split[1];
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            int i2 = this.e.equals(aVar.e) ? 2 : 0;
            return this.f2844f.equals(aVar.f2844f) ? i2 + 1 : i2;
        }
    }

    public static class b {
        public String a;
        public ArrayList<String> b = new ArrayList<>();
    }

    public h(String str, String str2, String str3) {
        int i2 = 0;
        this.e = false;
        this.f2840f = false;
        this.f2842h = null;
        this.f2841g = str2;
        this.f2843i = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            int i3 = 1;
            this.f2840f = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!a.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f2840f) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, compile);
                }
                this.e = false;
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    b bVar = new b();
                    while (matcher2.find()) {
                        bVar.b.add(matcher2.group(i3));
                        sb2.append(Pattern.quote(queryParameter.substring(i2, matcher2.start())));
                        sb2.append("(.+?)?");
                        i2 = matcher2.end();
                        i3 = 1;
                    }
                    if (i2 < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i2)));
                    }
                    bVar.a = sb2.toString().replace(".*", "\\E.*\\Q");
                    this.f2838c.put(str4, bVar);
                    i2 = 0;
                    i3 = 1;
                }
            } else {
                this.e = a(str, sb, compile);
            }
            this.f2839d = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            a aVar = new a(str3);
            StringBuilder f2 = c.c.a.a.a.f("^(");
            f2.append(aVar.e);
            f2.append("|[*]+)/(");
            f2.append(aVar.f2844f);
            f2.append("|[*]+)$");
            this.f2842h = Pattern.compile(f2.toString().replace("*|[*]", "[\\s\\S]"));
            return;
        }
        throw new IllegalArgumentException(c.c.a.a.a.c("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i2 = 0;
        while (matcher.find()) {
            this.b.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i2, matcher.start())));
            sb.append("(.+?)");
            i2 = matcher.end();
            z = false;
        }
        if (i2 < str.length()) {
            sb.append(Pattern.quote(str.substring(i2)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    public final boolean b(Bundle bundle, String str, String str2, d dVar) {
        if (dVar != null) {
            p pVar = dVar.a;
            try {
                pVar.d(bundle, str, pVar.c(str2));
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else {
            bundle.putString(str, str2);
            return false;
        }
    }
}
