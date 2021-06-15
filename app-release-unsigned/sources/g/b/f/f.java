package g.b.f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import g.b.f.i.i;
import g.b.f.i.j;
import g.b.g.g0;
import g.b.g.z0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f extends MenuInflater {
    public static final Class<?>[] a;
    public static final Class<?>[] b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f1928c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f1929d;
    public Context e;

    /* renamed from: f  reason: collision with root package name */
    public Object f1930f;

    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] a = {MenuItem.class};
        public Object b;

        /* renamed from: c  reason: collision with root package name */
        public Method f1931c;

        public a(Object obj, String str) {
            this.b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1931c = cls.getMethod(str, a);
            } catch (Exception e) {
                StringBuilder i2 = c.c.a.a.a.i("Couldn't resolve menu item onClick handler ", str, " in class ");
                i2.append(cls.getName());
                InflateException inflateException = new InflateException(i2.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1931c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1931c.invoke(this.b, menuItem)).booleanValue();
                }
                this.f1931c.invoke(this.b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class b {
        public g.h.j.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;
        public Menu a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f1932c;

        /* renamed from: d  reason: collision with root package name */
        public int f1933d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1934f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1935g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1936h;

        /* renamed from: i  reason: collision with root package name */
        public int f1937i;

        /* renamed from: j  reason: collision with root package name */
        public int f1938j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f1939k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f1940l;

        /* renamed from: m  reason: collision with root package name */
        public int f1941m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.a = menu;
            this.b = 0;
            this.f1932c = 0;
            this.f1933d = 0;
            this.e = 0;
            this.f1934f = true;
            this.f1935g = true;
        }

        public SubMenu a() {
            this.f1936h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.f1937i, this.f1938j, this.f1939k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.f1940l).setIcon(this.f1941m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!f.this.e.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.f1930f == null) {
                        fVar.f1930f = fVar.a(fVar.e);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f1930f, this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof i) {
                    i iVar = (i) menuItem;
                    iVar.x = (iVar.x & -5) | 4;
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.e == null) {
                            jVar.e = jVar.f2009d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        jVar.e.invoke(jVar.f2009d, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) b(str, f.a, f.this.f1928c));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            g.h.j.b bVar = this.A;
            if (bVar != null) {
                if (menuItem instanceof g.h.e.a.b) {
                    ((g.h.e.a.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z3 = menuItem instanceof g.h.e.a.b;
            if (z3) {
                ((g.h.e.a.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z3) {
                ((g.h.e.a.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.n;
            int i4 = this.o;
            if (z3) {
                ((g.h.e.a.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.p;
            int i5 = this.q;
            if (z3) {
                ((g.h.e.a.b) menuItem).setNumericShortcut(c3, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z3) {
                    ((g.h.e.a.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList == null) {
                return;
            }
            if (z3) {
                ((g.h.e.a.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }

    public f(Context context) {
        super(context);
        this.e = context;
        Object[] objArr = {context};
        this.f1928c = objArr;
        this.f1929d = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:92:0x0228 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v61, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        char c2;
        char c3;
        g.h.j.b bVar;
        ColorStateList colorStateList;
        b bVar2 = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(c.c.a.a.a.q("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                z = z;
                z = z;
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                            z = z;
                            z2 = z2;
                        } else if (name2.equals("group")) {
                            bVar2.b = 0;
                            bVar2.f1932c = 0;
                            bVar2.f1933d = 0;
                            bVar2.e = 0;
                            bVar2.f1934f = true;
                            bVar2.f1935g = true;
                            z = z;
                        } else if (name2.equals("item")) {
                            z = z;
                            if (!bVar2.f1936h) {
                                g.h.j.b bVar3 = bVar2.A;
                                if (bVar3 == null || !bVar3.a()) {
                                    bVar2.f1936h = true;
                                    bVar2.c(bVar2.a.add(bVar2.b, bVar2.f1937i, bVar2.f1938j, bVar2.f1939k));
                                    z = z;
                                } else {
                                    bVar2.a();
                                    z = z;
                                }
                            }
                        } else {
                            z = z;
                            if (name2.equals("menu")) {
                                z = true;
                            }
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.e.obtainStyledAttributes(attributeSet, g.b.b.o);
                        bVar2.b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar2.f1932c = obtainStyledAttributes.getInt(3, 0);
                        bVar2.f1933d = obtainStyledAttributes.getInt(4, 0);
                        bVar2.e = obtainStyledAttributes.getInt(5, 0);
                        bVar2.f1934f = obtainStyledAttributes.getBoolean(2, true);
                        bVar2.f1935g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        z = z;
                    } else if (name3.equals("item")) {
                        z0 p = z0.p(f.this.e, attributeSet, g.b.b.p);
                        bVar2.f1937i = p.l(2, 0);
                        bVar2.f1938j = (p.j(5, bVar2.f1932c) & -65536) | (p.j(6, bVar2.f1933d) & 65535);
                        bVar2.f1939k = p.n(7);
                        bVar2.f1940l = p.n(8);
                        bVar2.f1941m = p.l(0, 0);
                        String m2 = p.m(9);
                        if (m2 == null) {
                            c2 = 0;
                        } else {
                            c2 = m2.charAt(0);
                        }
                        bVar2.n = c2;
                        bVar2.o = p.j(16, 4096);
                        String m3 = p.m(10);
                        if (m3 == null) {
                            c3 = 0;
                        } else {
                            c3 = m3.charAt(0);
                        }
                        bVar2.p = c3;
                        bVar2.q = p.j(20, 4096);
                        bVar2.r = p.o(11) ? p.a(11, false) : bVar2.e ? 1 : 0;
                        bVar2.s = p.a(3, false);
                        bVar2.t = p.a(4, bVar2.f1934f);
                        bVar2.u = p.a(1, bVar2.f1935g);
                        bVar2.v = p.j(21, -1);
                        bVar2.z = p.m(12);
                        bVar2.w = p.l(13, 0);
                        bVar2.x = p.m(15);
                        String m4 = p.m(14);
                        bVar2.y = m4;
                        boolean z3 = m4 != null;
                        if (z3 && bVar2.w == 0 && bVar2.x == null) {
                            bVar = (g.h.j.b) bVar2.b(m4, b, f.this.f1929d);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar = null;
                        }
                        bVar2.A = bVar;
                        bVar2.B = p.n(17);
                        bVar2.C = p.n(22);
                        if (p.o(19)) {
                            bVar2.E = g0.b(p.j(19, -1), bVar2.E);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar2.E = null;
                        }
                        if (p.o(18)) {
                            colorStateList = p.c(18);
                        }
                        bVar2.D = colorStateList;
                        p.b.recycle();
                        bVar2.f1936h = false;
                        z = z;
                    } else {
                        if (name3.equals("menu")) {
                            b(xmlPullParser, attributeSet, bVar2.a());
                        } else {
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                        z = z;
                        z2 = z2;
                    }
                }
                eventType = xmlPullParser.next();
                z = z;
                z2 = z2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof g.h.e.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.e.getResources().getLayout(i2);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
