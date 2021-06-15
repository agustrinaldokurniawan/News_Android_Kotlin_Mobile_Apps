package c.a.a.b.a;

import c.a.a.b.b.o.b.d.c;
import i.s.b.p;
import i.s.c.h;
import i.s.c.i;
import j.c0;
import j.y;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import l.a.c.n.a;
import m.b0;
import m.h0.a.g;
import m.t;
import m.x;

public final class d extends i implements p<a, l.a.c.k.a, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final d f338f = new d();

    public d() {
        super(2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // i.s.b.p
    public c k(a aVar, l.a.c.k.a aVar2) {
        a aVar3 = aVar;
        h.e(aVar3, "$this$single");
        h.e(aVar2, "it");
        x xVar = x.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        h.f("https://newsapi.org/v2/", "$this$toHttpUrl");
        y.a aVar4 = new y.a();
        aVar4.d(null, "https://newsapi.org/v2/");
        y a = aVar4.a();
        List<String> list = a.f3718i;
        if ("".equals(list.get(list.size() - 1))) {
            arrayList.add(new m.i0.a.a(new c.e.b.i()));
            arrayList2.add(new g(null, false));
            c0 c0Var = (c0) aVar3.a(i.s.c.p.a(c0.class), null, null);
            Objects.requireNonNull(c0Var, "client == null");
            Executor a2 = xVar.a();
            ArrayList arrayList3 = new ArrayList(arrayList2);
            m.i iVar = new m.i(a2);
            arrayList3.addAll(xVar.b ? Arrays.asList(m.g.a, iVar) : Collections.singletonList(iVar));
            ArrayList arrayList4 = new ArrayList(arrayList.size() + 1 + (xVar.b ? 1 : 0));
            arrayList4.add(new m.c());
            arrayList4.addAll(arrayList);
            arrayList4.addAll(xVar.b ? Collections.singletonList(t.a) : Collections.emptyList());
            m.c0 c0Var2 = new m.c0(c0Var, a, Collections.unmodifiableList(arrayList4), Collections.unmodifiableList(arrayList3), a2, false);
            if (c.class.isInterface()) {
                ArrayDeque arrayDeque = new ArrayDeque(1);
                arrayDeque.add(c.class);
                while (!arrayDeque.isEmpty()) {
                    Class cls = (Class) arrayDeque.removeFirst();
                    if (cls.getTypeParameters().length != 0) {
                        StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                        sb.append(cls.getName());
                        if (cls != c.class) {
                            sb.append(" which is an interface of ");
                            sb.append(c.class.getName());
                        }
                        throw new IllegalArgumentException(sb.toString());
                    }
                    Collections.addAll(arrayDeque, cls.getInterfaces());
                }
                if (c0Var2.f3821f) {
                    x xVar2 = x.a;
                    Method[] declaredMethods = c.class.getDeclaredMethods();
                    for (Method method : declaredMethods) {
                        if (((!xVar2.b || !method.isDefault()) ? null : 1) == null && !Modifier.isStatic(method.getModifiers())) {
                            c0Var2.b(method);
                        }
                    }
                }
                return (c) Proxy.newProxyInstance(c.class.getClassLoader(), new Class[]{c.class}, new b0(c0Var2, c.class));
            }
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        throw new IllegalArgumentException("baseUrl must end in /: " + a);
    }
}
