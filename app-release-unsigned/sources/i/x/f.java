package i.x;

import i.s.b.p;
import i.s.c.h;
import i.s.c.i;

public final class f extends i implements p<CharSequence, Integer, i.f<? extends Integer, ? extends Integer>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ char[] f3342f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f3343g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(char[] cArr, boolean z) {
        super(2);
        this.f3342f = cArr;
        this.f3343g = z;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // i.s.b.p
    public i.f<? extends Integer, ? extends Integer> k(CharSequence charSequence, Integer num) {
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        h.e(charSequence2, "$receiver");
        int k2 = e.k(charSequence2, this.f3342f, intValue, this.f3343g);
        if (k2 < 0) {
            return null;
        }
        return new i.f(Integer.valueOf(k2), 1);
    }
}
