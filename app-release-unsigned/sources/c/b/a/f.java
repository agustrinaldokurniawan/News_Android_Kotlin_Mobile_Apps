package c.b.a;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Map;
import java.util.concurrent.Callable;

public class f implements Callable<s<g>> {
    public final /* synthetic */ String e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f653f;

    public f(LottieAnimationView lottieAnimationView, String str) {
        this.f653f = lottieAnimationView;
        this.e = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public s<g> call() {
        LottieAnimationView lottieAnimationView = this.f653f;
        boolean z = lottieAnimationView.v;
        Context context = lottieAnimationView.getContext();
        if (!z) {
            return h.b(context, this.e, null);
        }
        String str = this.e;
        Map<String, u<g>> map = h.a;
        return h.b(context, str, "asset_" + str);
    }
}
