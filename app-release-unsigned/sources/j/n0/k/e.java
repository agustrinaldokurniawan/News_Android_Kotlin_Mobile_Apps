package j.n0.k;

import i.j;
import i.s.c.h;
import j.d0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class e extends h {

    /* renamed from: d  reason: collision with root package name */
    public final Method f3687d;
    public final Method e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f3688f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f3689g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f3690h;

    public static final class a implements InvocationHandler {
        public boolean a;
        public String b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f3691c;

        public a(List<String> list) {
            h.f(list, "protocols");
            this.f3691c = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            h.f(obj, "proxy");
            h.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (h.a(name, "supports") && h.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!h.a(name, "unsupported") || !h.a(Void.TYPE, returnType)) {
                if (h.a(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f3691c;
                    }
                }
                if ((h.a(name, "selectProtocol") || h.a(name, "select")) && h.a(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i2 = 0;
                            while (true) {
                                Object obj3 = list.get(i2);
                                if (obj3 != null) {
                                    String str = (String) obj3;
                                    if (!this.f3691c.contains(str)) {
                                        if (i2 == size) {
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        this.b = str;
                                        return str;
                                    }
                                } else {
                                    throw new j("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = this.f3691c.get(0);
                        this.b = str2;
                        return str2;
                    }
                    throw new j("null cannot be cast to non-null type kotlin.collections.List<*>");
                } else if ((!h.a(name, "protocolSelected") && !h.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    if (obj4 != null) {
                        this.b = (String) obj4;
                        return null;
                    }
                    throw new j("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                this.a = true;
                return null;
            }
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        h.f(method, "putMethod");
        h.f(method2, "getMethod");
        h.f(method3, "removeMethod");
        h.f(cls, "clientProviderClass");
        h.f(cls2, "serverProviderClass");
        this.f3687d = method;
        this.e = method2;
        this.f3688f = method3;
        this.f3689g = cls;
        this.f3690h = cls2;
    }

    @Override // j.n0.k.h
    public void a(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        try {
            this.f3688f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    @Override // j.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        h.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next == d0.HTTP_1_0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(h.a.t.a.l(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((d0) it2.next()).f3394m);
        }
        try {
            this.f3687d.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f3689g, this.f3690h}, new a(arrayList2)));
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // j.n0.k.h
    public String f(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.e.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                boolean z = aVar.a;
                if (!z && aVar.b == null) {
                    h.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return aVar.b;
                }
            } else {
                throw new j("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
