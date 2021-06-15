package g.p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import g.e.i;
import g.p.a;
import g.p.t.a;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public final class n {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public Context b;

    /* renamed from: c  reason: collision with root package name */
    public r f2860c;

    public n(Context context, r rVar) {
        this.b = context;
        this.f2860c = rVar;
    }

    public static p a(TypedValue typedValue, p pVar, p pVar2, String str, String str2) {
        if (pVar == null || pVar == pVar2) {
            return pVar != null ? pVar : pVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public final j b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i2) {
        int i3;
        int depth;
        int i4;
        int i5;
        String str;
        j a2 = this.f2860c.c(xmlResourceParser.getName()).a();
        a2.e(this.b, attributeSet);
        int i6 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i6) {
                break;
            }
            int depth3 = xmlResourceParser.getDepth();
            int i7 = 3;
            if (depth3 < depth2 && next == 3) {
                break;
            } else if (next == 2 && depth3 <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.b);
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        d d2 = d(obtainAttributes, resources, i2);
                        if (a2.f2852l == null) {
                            a2.f2852l = new HashMap<>();
                        }
                        a2.f2852l.put(string, d2);
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else if ("deepLink".equals(name)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, a.f2879c);
                    String string2 = obtainAttributes2.getString(3);
                    String string3 = obtainAttributes2.getString(i6);
                    String string4 = obtainAttributes2.getString(2);
                    if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(string4)) {
                        String str2 = null;
                        String replace = string2 != null ? string2.replace("${applicationId}", this.b.getPackageName()) : null;
                        if (!TextUtils.isEmpty(string3)) {
                            str = string3.replace("${applicationId}", this.b.getPackageName());
                            if (str.isEmpty()) {
                                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                            }
                        } else {
                            str = null;
                        }
                        if (string4 != null) {
                            str2 = string4.replace("${applicationId}", this.b.getPackageName());
                        }
                        h hVar = new h(replace, str, str2);
                        if (a2.f2850j == null) {
                            a2.f2850j = new ArrayList<>();
                        }
                        a2.f2850j.add(hVar);
                        obtainAttributes2.recycle();
                    } else {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                } else {
                    if ("action".equals(name)) {
                        TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, a.a);
                        int resourceId = obtainAttributes3.getResourceId(0, 0);
                        c cVar = new c(obtainAttributes3.getResourceId(i6, 0));
                        obtainAttributes3.getBoolean(4, false);
                        obtainAttributes3.getResourceId(7, -1);
                        obtainAttributes3.getBoolean(8, false);
                        obtainAttributes3.getResourceId(2, -1);
                        obtainAttributes3.getResourceId(3, -1);
                        obtainAttributes3.getResourceId(5, -1);
                        obtainAttributes3.getResourceId(6, -1);
                        Bundle bundle = new Bundle();
                        int i8 = 1;
                        int depth4 = xmlResourceParser.getDepth() + 1;
                        int i9 = i2;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i8 || ((depth = xmlResourceParser.getDepth()) < depth4 && next2 == i7)) {
                                i3 = depth2;
                                bundle.isEmpty();
                                i6 = 1;
                            } else {
                                if (next2 == 2 && depth <= depth4) {
                                    if ("argument".equals(xmlResourceParser.getName())) {
                                        TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, a.b);
                                        String string5 = obtainAttributes4.getString(0);
                                        if (string5 != null) {
                                            d d3 = d(obtainAttributes4, resources, i9);
                                            i4 = depth2;
                                            boolean z = d3.f2824c;
                                            if (z && z) {
                                                d3.a.d(bundle, string5, d3.f2825d);
                                            }
                                            obtainAttributes4.recycle();
                                        } else {
                                            throw new XmlPullParserException("Arguments must have a name");
                                        }
                                    } else {
                                        i4 = depth2;
                                    }
                                    i5 = i2;
                                } else {
                                    i4 = depth2;
                                    i5 = i9;
                                }
                                i7 = 3;
                                i8 = 1;
                                i9 = i5;
                                depth2 = i4;
                            }
                        }
                        i3 = depth2;
                        bundle.isEmpty();
                        i6 = 1;
                        if (!(!(a2 instanceof a.C0089a))) {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a2 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        } else if (resourceId != 0) {
                            if (a2.f2851k == null) {
                                a2.f2851k = new i<>();
                            }
                            a2.f2851k.j(resourceId, cVar);
                            obtainAttributes3.recycle();
                        } else {
                            throw new IllegalArgumentException("Cannot have an action with actionId 0");
                        }
                    } else {
                        i3 = depth2;
                        if ("include".equals(name) && (a2 instanceof k)) {
                            TypedArray obtainAttributes5 = resources.obtainAttributes(attributeSet, s.f2878c);
                            ((k) a2).f(c(obtainAttributes5.getResourceId(0, 0)));
                            obtainAttributes5.recycle();
                        } else if (a2 instanceof k) {
                            ((k) a2).f(b(resources, xmlResourceParser, attributeSet, i2));
                        }
                    }
                    depth2 = i3;
                }
                i3 = depth2;
                depth2 = i3;
            }
        }
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g.p.k c(int r7) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: g.p.n.c(int):g.p.k");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:115|116|117|118|119|120) */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r1 = g.p.p.f2866d;
        r1.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r1 = g.p.p.f2867f;
        r1.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r1 = g.p.p.f2869h;
        r1.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0263, code lost:
        r1 = g.p.p.f2871j;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0251 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x0257 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x025d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.p.d d(android.content.res.TypedArray r17, android.content.res.Resources r18, int r19) {
        /*
        // Method dump skipped, instructions count: 872
        */
        throw new UnsupportedOperationException("Method not decompiled: g.p.n.d(android.content.res.TypedArray, android.content.res.Resources, int):g.p.d");
    }
}
