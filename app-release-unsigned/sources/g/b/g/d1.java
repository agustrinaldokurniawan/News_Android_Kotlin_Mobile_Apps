package g.b.g;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.tsuga.news.R;

public class d1 {
    public final Context a;
    public final View b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f2082c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f2083d;
    public final Rect e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f2084f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f2085g = new int[2];

    public d1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2083d = layoutParams;
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.b = inflate;
        this.f2082c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(d1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131820549;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.b.getParent() != null) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.b);
        }
    }
}
