package g.h.j;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public class g {
    public ViewParent a;
    public ViewParent b;

    /* renamed from: c  reason: collision with root package name */
    public final View f2527c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2528d;
    public int[] e;

    public g(View view) {
        this.f2527c = view;
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent g2;
        if (!this.f2528d || (g2 = g(0)) == null) {
            return false;
        }
        try {
            return g2.onNestedFling(this.f2527c, f2, f3, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public boolean b(float f2, float f3) {
        ViewParent g2;
        if (!this.f2528d || (g2 = g(0)) == null) {
            return false;
        }
        try {
            return g2.onNestedPreFling(this.f2527c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent g2;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.f2528d || (g2 = g(i4)) == null) {
            return false;
        }
        if (i2 != 0 || i3 != 0) {
            if (iArr2 != null) {
                this.f2527c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (this.e == null) {
                    this.e = new int[2];
                }
                iArr3 = this.e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f2527c;
            if (g2 instanceof h) {
                ((h) g2).j(view, i2, i3, iArr3, i4);
            } else if (i4 == 0) {
                try {
                    g2.onNestedPreScroll(view, i2, i3, iArr3);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedPreScroll", e2);
                }
            }
            if (iArr2 != null) {
                this.f2527c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        f(i2, i3, i4, i5, null, i6, iArr2);
    }

    public boolean e(int i2, int i3, int i4, int i5, int[] iArr) {
        return f(i2, i3, i4, i5, iArr, 0, null);
    }

    public final boolean f(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent g2;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f2528d || (g2 = g(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2527c.getLocationInWindow(iArr);
            i8 = iArr[0];
            i7 = iArr[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f2527c;
        if (g2 instanceof i) {
            ((i) g2).m(view, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (g2 instanceof h) {
                ((h) g2).n(view, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    g2.onNestedScroll(view, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            this.f2527c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent g(int i2) {
        if (i2 == 0) {
            return this.a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.b;
    }

    public boolean h(int i2) {
        return g(i2) != null;
    }

    public boolean i(int i2, int i3) {
        boolean z;
        if (g(i3) != null) {
            return true;
        }
        if (this.f2528d) {
            View view = this.f2527c;
            for (ViewParent parent = this.f2527c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f2527c;
                boolean z2 = parent instanceof h;
                if (z2) {
                    z = ((h) parent).o(view, view2, i2, i3);
                } else {
                    if (i3 == 0) {
                        try {
                            z = parent.onStartNestedScroll(view, view2, i2);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i3 == 0) {
                        this.a = parent;
                    } else if (i3 == 1) {
                        this.b = parent;
                    }
                    View view3 = this.f2527c;
                    if (z2) {
                        ((h) parent).d(view, view3, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public void j(int i2) {
        ViewParent g2 = g(i2);
        if (g2 != null) {
            View view = this.f2527c;
            if (g2 instanceof h) {
                ((h) g2).i(view, i2);
            } else if (i2 == 0) {
                try {
                    g2.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.a = null;
            } else if (i2 == 1) {
                this.b = null;
            }
        }
    }
}
