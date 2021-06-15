package g.p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import g.p.q;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@q.b("activity")
public class a extends q<C0089a> {
    public Context a;
    public Activity b;

    /* renamed from: g.p.a$a  reason: collision with other inner class name */
    public static class C0089a extends j {

        /* renamed from: m  reason: collision with root package name */
        public Intent f2823m;
        public String n;

        public C0089a(q<? extends C0089a> qVar) {
            super(qVar);
        }

        @Override // g.p.j
        public void e(Context context, AttributeSet attributeSet) {
            super.e(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, s.a);
            String string = obtainAttributes.getString(4);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            if (this.f2823m == null) {
                this.f2823m = new Intent();
            }
            this.f2823m.setPackage(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f2823m == null) {
                    this.f2823m = new Intent();
                }
                this.f2823m.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.f2823m == null) {
                this.f2823m = new Intent();
            }
            this.f2823m.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.f2823m == null) {
                    this.f2823m = new Intent();
                }
                this.f2823m.setData(parse);
            }
            this.n = obtainAttributes.getString(3);
            obtainAttributes.recycle();
        }

        @Override // g.p.j
        public String toString() {
            Intent intent = this.f2823m;
            String str = null;
            ComponentName component = intent == null ? null : intent.getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                Intent intent2 = this.f2823m;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
            }
            return sb.toString();
        }
    }

    public static final class b implements q.a {
    }

    public a(Context context) {
        this.a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    /* Return type fixed from 'g.p.j' to match base method */
    @Override // g.p.q
    public C0089a a() {
        return new C0089a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g.p.j, android.os.Bundle, g.p.o, g.p.q$a] */
    @Override // g.p.q
    public j b(C0089a aVar, Bundle bundle, o oVar, q.a aVar2) {
        Intent intent;
        int intExtra;
        C0089a aVar3 = aVar;
        if (aVar3.f2823m != null) {
            Intent intent2 = new Intent(aVar3.f2823m);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = aVar3.n;
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z = aVar2 instanceof b;
            if (z) {
                Objects.requireNonNull((b) aVar2);
                intent2.addFlags(0);
            }
            if (!(this.a instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (oVar != null && oVar.a) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.b;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar3.f2847g);
            Resources resources = this.a.getResources();
            if (oVar != null) {
                int i2 = oVar.f2863f;
                int i3 = oVar.f2864g;
                if ((i2 <= 0 || !resources.getResourceTypeName(i2).equals("animator")) && (i3 <= 0 || !resources.getResourceTypeName(i3).equals("animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i2);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i3);
                } else {
                    StringBuilder f2 = c.c.a.a.a.f("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                    f2.append(resources.getResourceName(i2));
                    f2.append(" and popExit resource ");
                    f2.append(resources.getResourceName(i3));
                    f2.append("when launching ");
                    f2.append(aVar3);
                    Log.w("ActivityNavigator", f2.toString());
                }
            }
            if (z) {
                Objects.requireNonNull((b) aVar2);
            }
            this.a.startActivity(intent2);
            if (oVar == null || this.b == null) {
                return null;
            }
            int i4 = oVar.f2862d;
            int i5 = oVar.e;
            if ((i4 > 0 && resources.getResourceTypeName(i4).equals("animator")) || (i5 > 0 && resources.getResourceTypeName(i5).equals("animator"))) {
                StringBuilder f3 = c.c.a.a.a.f("Activity destinations do not support Animator resource. Ignoring enter resource ");
                f3.append(resources.getResourceName(i4));
                f3.append(" and exit resource ");
                f3.append(resources.getResourceName(i5));
                f3.append("when launching ");
                f3.append(aVar3);
                Log.w("ActivityNavigator", f3.toString());
                return null;
            } else if (i4 < 0 && i5 < 0) {
                return null;
            } else {
                this.b.overridePendingTransition(Math.max(i4, 0), Math.max(i5, 0));
                return null;
            }
        } else {
            StringBuilder f4 = c.c.a.a.a.f("Destination ");
            f4.append(aVar3.f2847g);
            f4.append(" does not have an Intent set.");
            throw new IllegalStateException(f4.toString());
        }
    }

    @Override // g.p.q
    public boolean e() {
        Activity activity = this.b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
