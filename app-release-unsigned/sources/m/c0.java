package m;

import j.e;
import j.h0;
import j.j0;
import j.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import m.c;
import m.e;
import m.h;

public final class c0 {
    public final Map<Method, d0<?>> a = new ConcurrentHashMap();
    public final e.a b;

    /* renamed from: c  reason: collision with root package name */
    public final y f3819c;

    /* renamed from: d  reason: collision with root package name */
    public final List<h.a> f3820d;
    public final List<e.a> e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3821f;

    public c0(e.a aVar, y yVar, List<h.a> list, List<e.a> list2, @Nullable Executor executor, boolean z) {
        this.b = aVar;
        this.f3819c = yVar;
        this.f3820d = list;
        this.e = list2;
        this.f3821f = z;
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.e.indexOf(null) + 1;
        int size = this.e.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            e<?, ?> a2 = this.e.get(i2).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public d0<?> b(Method method) {
        d0<?> d0Var;
        d0<?> d0Var2 = this.a.get(method);
        if (d0Var2 != null) {
            return d0Var2;
        }
        synchronized (this.a) {
            d0Var = this.a.get(method);
            if (d0Var == null) {
                d0Var = d0.b(this, method);
                this.a.put(method, d0Var);
            }
        }
        return d0Var;
    }

    public <T> h<T, h0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f3820d.indexOf(null) + 1;
        int size = this.f3820d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            h<T, h0> hVar = (h<T, h0>) this.f3820d.get(i2).a(type, annotationArr, annotationArr2, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f3820d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f3820d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> h<j0, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f3820d.indexOf(null) + 1;
        int size = this.f3820d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            h<j0, T> hVar = (h<j0, T>) this.f3820d.get(i2).b(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f3820d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f3820d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> h<T, String> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f3820d.size();
        for (int i2 = 0; i2 < size; i2++) {
            Objects.requireNonNull(this.f3820d.get(i2));
        }
        return c.d.a;
    }
}
