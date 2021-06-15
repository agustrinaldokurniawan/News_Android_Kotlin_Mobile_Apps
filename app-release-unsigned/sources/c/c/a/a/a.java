package c.c.a.a;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import g.l.b.m;
import java.lang.reflect.Type;

public class a {
    public static float a(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) * f4) + f5;
    }

    public static int b(String str, int i2, int i3) {
        return (str.hashCode() + i2) * i3;
    }

    public static String c(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String d(String str, Type type) {
        return str + type;
    }

    public static String e(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder f(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder g(String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder i(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.A());
        return sb.toString();
    }

    public static String k(Class cls, StringBuilder sb, String str, String str2) {
        sb.append(cls.getSimpleName());
        sb.append(str);
        sb.append(cls.getSimpleName());
        sb.append(str2);
        return sb.toString();
    }

    public static String l(String str, int i2) {
        return str + i2;
    }

    public static String m(String str, int i2, String str2, int i3) {
        return str + i2 + str2 + i3;
    }

    public static String n(String str, long j2) {
        return str + j2;
    }

    public static String o(String str, Uri uri) {
        return str + uri;
    }

    public static String p(String str, m mVar, String str2) {
        return str + mVar + str2;
    }

    public static String q(String str, String str2) {
        return str + str2;
    }
}
