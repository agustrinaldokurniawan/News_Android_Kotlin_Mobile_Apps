package c.b.a.c0;

import c.b.a.c0.k.m;
import c.c.a.a.a;
import java.util.List;

public class d {
    public final List<m> a;
    public final char b;

    /* renamed from: c  reason: collision with root package name */
    public final double f534c;

    /* renamed from: d  reason: collision with root package name */
    public final String f535d;
    public final String e;

    public d(List<m> list, char c2, double d2, double d3, String str, String str2) {
        this.a = list;
        this.b = c2;
        this.f534c = d3;
        this.f535d = str;
        this.e = str2;
    }

    public static int a(char c2, String str, String str2) {
        return str2.hashCode() + a.b(str, (c2 + 0) * 31, 31);
    }

    public int hashCode() {
        return a(this.b, this.e, this.f535d);
    }
}
