package g.r;

import android.annotation.SuppressLint;
import android.content.Context;
import g.r.j;
import g.t.a.c;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class c {
    public final c.b a;
    public final Context b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2956c;

    /* renamed from: d  reason: collision with root package name */
    public final j.b f2957d;
    public final List<Object> e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2958f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f2959g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f2960h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2961i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2962j;

    /* JADX WARN: Incorrect args count in method signature: (Landroid/content/Context;Ljava/lang/String;Lg/t/a/c$b;Lg/r/j$b;Ljava/util/List<Lg/r/j$a;>;ZLjava/lang/Object;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set<Ljava/lang/Integer;>;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable<Ljava/io/InputStream;>;Ljava/lang/Object;Ljava/util/List<Ljava/lang/Object;>;)V */
    @SuppressLint({"LambdaLast"})
    public c(Context context, String str, c.b bVar, j.b bVar2, List list, boolean z, int i2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set set, String str2, File file, Callable callable, List list2) {
        this.a = bVar;
        this.b = context;
        this.f2956c = str;
        this.f2957d = bVar2;
        this.f2958f = i2;
        this.f2959g = executor;
        this.f2960h = executor2;
        this.f2961i = z3;
        this.f2962j = z4;
        this.e = list2 == null ? Collections.emptyList() : list2;
    }

    public boolean a(int i2, int i3) {
        if (!(i2 > i3) || !this.f2962j) {
            return this.f2961i;
        }
        return false;
    }
}
