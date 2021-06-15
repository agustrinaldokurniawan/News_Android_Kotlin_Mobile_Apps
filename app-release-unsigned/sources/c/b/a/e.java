package c.b.a;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

public class e implements Callable<s<g>> {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f630f;

    public e(LottieAnimationView lottieAnimationView, int i2) {
        this.f630f = lottieAnimationView;
        this.e = i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public s<g> call() {
        LottieAnimationView lottieAnimationView = this.f630f;
        boolean z = lottieAnimationView.v;
        Context context = lottieAnimationView.getContext();
        if (!z) {
            return h.e(context, this.e, null);
        }
        int i2 = this.e;
        return h.e(context, i2, h.h(context, i2));
    }
}
