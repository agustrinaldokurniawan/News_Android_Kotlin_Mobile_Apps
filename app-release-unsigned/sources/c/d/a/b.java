package c.d.a;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c.d.a.c;
import c.d.a.e;
import c.d.a.m.r;
import c.d.a.m.u.k;
import c.d.a.m.v.c0.d;
import c.d.a.m.v.d0.i;
import c.d.a.m.v.d0.j;
import c.d.a.m.v.e0.a;
import c.d.a.m.v.l;
import c.d.a.m.w.a;
import c.d.a.m.w.b;
import c.d.a.m.w.d;
import c.d.a.m.w.e;
import c.d.a.m.w.f;
import c.d.a.m.w.k;
import c.d.a.m.w.s;
import c.d.a.m.w.t;
import c.d.a.m.w.u;
import c.d.a.m.w.v;
import c.d.a.m.w.w;
import c.d.a.m.w.x;
import c.d.a.m.w.y.a;
import c.d.a.m.w.y.b;
import c.d.a.m.w.y.c;
import c.d.a.m.w.y.d;
import c.d.a.m.w.y.e;
import c.d.a.m.x.c.a0;
import c.d.a.m.x.c.e0;
import c.d.a.m.x.c.f0;
import c.d.a.m.x.c.g;
import c.d.a.m.x.c.h;
import c.d.a.m.x.c.k;
import c.d.a.m.x.c.m;
import c.d.a.m.x.c.u;
import c.d.a.m.x.c.w;
import c.d.a.m.x.c.y;
import c.d.a.m.x.d.a;
import c.d.a.m.x.g.j;
import c.d.a.n.p;
import c.d.a.q.e;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import g.l.b.b0;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b implements ComponentCallbacks2 {
    public static volatile b e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f722f;

    /* renamed from: g  reason: collision with root package name */
    public final d f723g;

    /* renamed from: h  reason: collision with root package name */
    public final i f724h;

    /* renamed from: i  reason: collision with root package name */
    public final d f725i;

    /* renamed from: j  reason: collision with root package name */
    public final g f726j;

    /* renamed from: k  reason: collision with root package name */
    public final c.d.a.m.v.c0.b f727k;

    /* renamed from: l  reason: collision with root package name */
    public final p f728l;

    /* renamed from: m  reason: collision with root package name */
    public final c.d.a.n.d f729m;
    public final List<i> n = new ArrayList();

    public interface a {
    }

    public b(Context context, l lVar, i iVar, d dVar, c.d.a.m.v.c0.b bVar, p pVar, c.d.a.n.d dVar2, int i2, a aVar, Map<Class<?>, j<?, ?>> map, List<e<Object>> list, e eVar) {
        r rVar;
        r rVar2;
        this.f723g = dVar;
        this.f727k = bVar;
        this.f724h = iVar;
        this.f728l = pVar;
        this.f729m = dVar2;
        Resources resources = context.getResources();
        g gVar = new g();
        this.f726j = gVar;
        k kVar = new k();
        c.d.a.p.b bVar2 = gVar.f755g;
        synchronized (bVar2) {
            bVar2.a.add(kVar);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            c.d.a.m.x.c.p pVar2 = new c.d.a.m.x.c.p();
            c.d.a.p.b bVar3 = gVar.f755g;
            synchronized (bVar3) {
                bVar3.a.add(pVar2);
            }
        }
        List<ImageHeaderParser> e2 = gVar.e();
        c.d.a.m.x.g.a aVar2 = new c.d.a.m.x.g.a(context, e2, dVar, bVar);
        f0 f0Var = new f0(dVar, new f0.g());
        m mVar = new m(gVar.e(), resources.getDisplayMetrics(), dVar, bVar);
        if (!eVar.a.containsKey(c.b.class) || i3 < 28) {
            rVar = new g(mVar);
            rVar2 = new a0(mVar, bVar);
        } else {
            rVar2 = new u();
            rVar = new h();
        }
        c.d.a.m.x.e.d dVar3 = new c.d.a.m.x.e.d(context);
        s.c cVar = new s.c(resources);
        s.d dVar4 = new s.d(resources);
        s.b bVar4 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        c.d.a.m.x.c.c cVar2 = new c.d.a.m.x.c.c(bVar);
        c.d.a.m.x.h.a aVar4 = new c.d.a.m.x.h.a();
        c.d.a.m.x.h.d dVar5 = new c.d.a.m.x.h.d();
        ContentResolver contentResolver = context.getContentResolver();
        gVar.a(ByteBuffer.class, new c.d.a.m.w.c());
        gVar.a(InputStream.class, new t(bVar));
        gVar.d("Bitmap", ByteBuffer.class, Bitmap.class, rVar);
        gVar.d("Bitmap", InputStream.class, Bitmap.class, rVar2);
        gVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new w(mVar));
        gVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, f0Var);
        gVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new f0(dVar, new f0.c(null)));
        v.a<?> aVar5 = v.a.a;
        gVar.c(Bitmap.class, Bitmap.class, aVar5);
        gVar.d("Bitmap", Bitmap.class, Bitmap.class, new e0());
        gVar.b(Bitmap.class, cVar2);
        gVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new c.d.a.m.x.c.a(resources, rVar));
        gVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new c.d.a.m.x.c.a(resources, rVar2));
        gVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new c.d.a.m.x.c.a(resources, f0Var));
        gVar.b(BitmapDrawable.class, new c.d.a.m.x.c.b(dVar, cVar2));
        gVar.d("Gif", InputStream.class, c.d.a.m.x.g.c.class, new j(e2, aVar2, bVar));
        gVar.d("Gif", ByteBuffer.class, c.d.a.m.x.g.c.class, aVar2);
        gVar.b(c.d.a.m.x.g.c.class, new c.d.a.m.x.g.d());
        gVar.c(c.d.a.l.a.class, c.d.a.l.a.class, aVar5);
        gVar.d("Bitmap", c.d.a.l.a.class, Bitmap.class, new c.d.a.m.x.g.h(dVar));
        gVar.d("legacy_append", Uri.class, Drawable.class, dVar3);
        gVar.d("legacy_append", Uri.class, Bitmap.class, new y(dVar3, dVar));
        gVar.g(new a.C0030a());
        gVar.c(File.class, ByteBuffer.class, new d.b());
        gVar.c(File.class, InputStream.class, new f.e());
        gVar.d("legacy_append", File.class, File.class, new c.d.a.m.x.f.a());
        gVar.c(File.class, ParcelFileDescriptor.class, new f.b());
        gVar.c(File.class, File.class, aVar5);
        gVar.g(new k.a(bVar));
        gVar.g(new ParcelFileDescriptorRewinder.a());
        Class cls = Integer.TYPE;
        gVar.c(cls, InputStream.class, cVar);
        gVar.c(cls, ParcelFileDescriptor.class, bVar4);
        gVar.c(Integer.class, InputStream.class, cVar);
        gVar.c(Integer.class, ParcelFileDescriptor.class, bVar4);
        gVar.c(Integer.class, Uri.class, dVar4);
        gVar.c(cls, AssetFileDescriptor.class, aVar3);
        gVar.c(Integer.class, AssetFileDescriptor.class, aVar3);
        gVar.c(cls, Uri.class, dVar4);
        gVar.c(String.class, InputStream.class, new e.c());
        gVar.c(Uri.class, InputStream.class, new e.c());
        gVar.c(String.class, InputStream.class, new u.c());
        gVar.c(String.class, ParcelFileDescriptor.class, new u.b());
        gVar.c(String.class, AssetFileDescriptor.class, new u.a());
        gVar.c(Uri.class, InputStream.class, new a.c(context.getAssets()));
        gVar.c(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets()));
        gVar.c(Uri.class, InputStream.class, new b.a(context));
        gVar.c(Uri.class, InputStream.class, new c.a(context));
        if (i3 >= 29) {
            gVar.c(Uri.class, InputStream.class, new d.c(context));
            gVar.c(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        gVar.c(Uri.class, InputStream.class, new w.d(contentResolver));
        gVar.c(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver));
        gVar.c(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver));
        gVar.c(Uri.class, InputStream.class, new x.a());
        gVar.c(URL.class, InputStream.class, new e.a());
        gVar.c(Uri.class, File.class, new k.a(context));
        gVar.c(c.d.a.m.w.g.class, InputStream.class, new a.C0026a());
        gVar.c(byte[].class, ByteBuffer.class, new b.a());
        gVar.c(byte[].class, InputStream.class, new b.d());
        gVar.c(Uri.class, Uri.class, aVar5);
        gVar.c(Drawable.class, Drawable.class, aVar5);
        gVar.d("legacy_append", Drawable.class, Drawable.class, new c.d.a.m.x.e.e());
        gVar.h(Bitmap.class, BitmapDrawable.class, new c.d.a.m.x.h.b(resources));
        gVar.h(Bitmap.class, byte[].class, aVar4);
        gVar.h(Drawable.class, byte[].class, new c.d.a.m.x.h.c(dVar, aVar4, dVar5));
        gVar.h(c.d.a.m.x.g.c.class, byte[].class, dVar5);
        f0 f0Var2 = new f0(dVar, new f0.d());
        gVar.d("legacy_append", ByteBuffer.class, Bitmap.class, f0Var2);
        gVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new c.d.a.m.x.c.a(resources, f0Var2));
        this.f725i = new d(context, bVar, gVar, new c.d.a.q.j.f(), aVar, map, list, lVar, eVar, i2);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f722f) {
            f722f = true;
            c cVar = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(c.d.a.o.e.a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c2 = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c.d.a.o.c cVar2 = (c.d.a.o.c) it.next();
                        if (c2.contains(cVar2.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar2);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        StringBuilder f2 = c.c.a.a.a.f("Discovered GlideModule from manifest: ");
                        f2.append(((c.d.a.o.c) it2.next()).getClass());
                        Log.d("Glide", f2.toString());
                    }
                }
                cVar.n = null;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((c.d.a.o.c) it3.next()).b(applicationContext, cVar);
                }
                if (cVar.f733g == null) {
                    int a2 = c.d.a.m.v.e0.a.a();
                    if (!TextUtils.isEmpty("source")) {
                        cVar.f733g = new c.d.a.m.v.e0.a(new ThreadPoolExecutor(a2, a2, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0018a("source", a.b.b, false)));
                    } else {
                        throw new IllegalArgumentException(c.c.a.a.a.q("Name must be non-null and non-empty, but given: ", "source"));
                    }
                }
                if (cVar.f734h == null) {
                    int i2 = c.d.a.m.v.e0.a.f895f;
                    if (!TextUtils.isEmpty("disk-cache")) {
                        cVar.f734h = new c.d.a.m.v.e0.a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0018a("disk-cache", a.b.b, true)));
                    } else {
                        throw new IllegalArgumentException(c.c.a.a.a.q("Name must be non-null and non-empty, but given: ", "disk-cache"));
                    }
                }
                if (cVar.o == null) {
                    int i3 = c.d.a.m.v.e0.a.a() >= 4 ? 2 : 1;
                    if (!TextUtils.isEmpty("animation")) {
                        cVar.o = new c.d.a.m.v.e0.a(new ThreadPoolExecutor(i3, i3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0018a("animation", a.b.b, true)));
                    } else {
                        throw new IllegalArgumentException(c.c.a.a.a.q("Name must be non-null and non-empty, but given: ", "animation"));
                    }
                }
                if (cVar.f736j == null) {
                    cVar.f736j = new c.d.a.m.v.d0.j(new j.a(applicationContext));
                }
                if (cVar.f737k == null) {
                    cVar.f737k = new c.d.a.n.f();
                }
                if (cVar.f731d == null) {
                    int i4 = cVar.f736j.a;
                    if (i4 > 0) {
                        cVar.f731d = new c.d.a.m.v.c0.j((long) i4);
                    } else {
                        cVar.f731d = new c.d.a.m.v.c0.e();
                    }
                }
                if (cVar.e == null) {
                    cVar.e = new c.d.a.m.v.c0.i(cVar.f736j.f890d);
                }
                if (cVar.f732f == null) {
                    cVar.f732f = new c.d.a.m.v.d0.h((long) cVar.f736j.b);
                }
                if (cVar.f735i == null) {
                    cVar.f735i = new c.d.a.m.v.d0.g(applicationContext);
                }
                if (cVar.f730c == null) {
                    cVar.f730c = new l(cVar.f732f, cVar.f735i, cVar.f734h, cVar.f733g, new c.d.a.m.v.e0.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, c.d.a.m.v.e0.a.e, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.ThreadFactoryC0018a("source-unlimited", a.b.b, false))), cVar.o, false);
                }
                List<c.d.a.q.e<Object>> list = cVar.p;
                cVar.p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
                e.a aVar = cVar.b;
                Objects.requireNonNull(aVar);
                e eVar = new e(aVar);
                b bVar = new b(applicationContext, cVar.f730c, cVar.f732f, cVar.f731d, cVar.e, new p(cVar.n, eVar), cVar.f737k, cVar.f738l, cVar.f739m, cVar.a, cVar.p, eVar);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    c.d.a.o.c cVar3 = (c.d.a.o.c) it4.next();
                    try {
                        cVar3.a(applicationContext, bVar, bVar.f726j);
                    } catch (AbstractMethodError e2) {
                        StringBuilder f3 = c.c.a.a.a.f("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                        f3.append(cVar3.getClass().getName());
                        throw new IllegalStateException(f3.toString(), e2);
                    }
                }
                applicationContext.registerComponentCallbacks(bVar);
                e = bVar;
                f722f = false;
            } catch (PackageManager.NameNotFoundException e3) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e3);
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static b b(Context context) {
        if (e == null) {
            Context applicationContext = context.getApplicationContext();
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(applicationContext.getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (InstantiationException e2) {
                c(e2);
                throw null;
            } catch (IllegalAccessException e3) {
                c(e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                c(e4);
                throw null;
            } catch (InvocationTargetException e5) {
                c(e5);
                throw null;
            }
            synchronized (b.class) {
                if (e == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return e;
    }

    public static void c(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static i d(View view) {
        View view2;
        Context context = view.getContext();
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        p pVar = b(context).f728l;
        Objects.requireNonNull(pVar);
        if (!c.d.a.s.j.i()) {
            Objects.requireNonNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity a2 = p.a(view.getContext());
            if (a2 != null) {
                if (a2 instanceof g.l.b.p) {
                    g.l.b.p pVar2 = (g.l.b.p) a2;
                    pVar.f1120g.clear();
                    p.c(pVar2.m().L(), pVar.f1120g);
                    View findViewById = pVar2.findViewById(16908290);
                    g.l.b.m mVar = null;
                    while (!view.equals(findViewById) && (mVar = pVar.f1120g.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    pVar.f1120g.clear();
                    if (mVar == null) {
                        return pVar.g(pVar2);
                    }
                    Objects.requireNonNull(mVar.k(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
                    if (c.d.a.s.j.i()) {
                        return pVar.f(mVar.k().getApplicationContext());
                    }
                    if (mVar.h() != null) {
                        pVar.f1123j.a(mVar.h());
                    }
                    b0 j2 = mVar.j();
                    Context k2 = mVar.k();
                    boolean z = true;
                    if (!(mVar.x != null && mVar.p) || mVar.D || (view2 = mVar.J) == null || view2.getWindowToken() == null || mVar.J.getVisibility() != 0) {
                        z = false;
                    }
                    return pVar.k(k2, j2, mVar, z);
                }
                pVar.f1121h.clear();
                pVar.b(a2.getFragmentManager(), pVar.f1121h);
                View findViewById2 = a2.findViewById(16908290);
                Fragment fragment = null;
                while (!view.equals(findViewById2) && (fragment = pVar.f1121h.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                pVar.f1121h.clear();
                if (fragment == null) {
                    return pVar.e(a2);
                }
                if (fragment.getActivity() == null) {
                    throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
                } else if (c.d.a.s.j.i()) {
                    return pVar.f(fragment.getActivity().getApplicationContext());
                } else {
                    if (fragment.getActivity() != null) {
                        pVar.f1123j.a(fragment.getActivity());
                    }
                    return pVar.d(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
                }
            }
        }
        return pVar.f(view.getContext().getApplicationContext());
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        c.d.a.s.j.a();
        ((c.d.a.s.g) this.f724h).e(0);
        this.f723g.b();
        this.f727k.b();
    }

    public void onTrimMemory(int i2) {
        long j2;
        c.d.a.s.j.a();
        synchronized (this.n) {
            for (i iVar : this.n) {
                Objects.requireNonNull(iVar);
            }
        }
        c.d.a.m.v.d0.h hVar = (c.d.a.m.v.d0.h) this.f724h;
        Objects.requireNonNull(hVar);
        if (i2 >= 40) {
            hVar.e(0);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (hVar) {
                j2 = hVar.b;
            }
            hVar.e(j2 / 2);
        }
        this.f723g.a(i2);
        this.f727k.a(i2);
    }
}
