package i.x;

import i.f;
import i.s.b.p;
import i.s.c.h;
import i.u.c;
import i.u.d;
import i.w.e;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class b implements e<c> {
    public final CharSequence a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3335c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, f<Integer, Integer>> f3336d;

    public static final class a implements Iterator<c>, i.s.c.s.a {
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3337f;

        /* renamed from: g  reason: collision with root package name */
        public int f3338g;

        /* renamed from: h  reason: collision with root package name */
        public c f3339h;

        /* renamed from: i  reason: collision with root package name */
        public int f3340i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ b f3341j;

        public a(b bVar) {
            this.f3341j = bVar;
            int a = d.a(bVar.b, 0, bVar.a.length());
            this.f3337f = a;
            this.f3338g = a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: i.x.b.a.a():void");
        }

        public boolean hasNext() {
            if (this.e == -1) {
                a();
            }
            return this.e == 1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public c next() {
            if (this.e == -1) {
                a();
            }
            if (this.e != 0) {
                c cVar = this.f3339h;
                Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f3339h = null;
                this.e = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: i.s.b.p<? super java.lang.CharSequence, ? super java.lang.Integer, i.f<java.lang.Integer, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence charSequence, int i2, int i3, p<? super CharSequence, ? super Integer, f<Integer, Integer>> pVar) {
        h.e(charSequence, "input");
        h.e(pVar, "getNextMatch");
        this.a = charSequence;
        this.b = i2;
        this.f3335c = i3;
        this.f3336d = pVar;
    }

    @Override // i.w.e
    public Iterator<c> iterator() {
        return new a(this);
    }
}
