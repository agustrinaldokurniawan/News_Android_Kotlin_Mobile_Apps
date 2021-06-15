package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.tsuga.news.R;
import g.b.g.l;
import g.h.j.o;

public class CheckableImageButton extends l implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1689g = {16842912};

    /* renamed from: h  reason: collision with root package name */
    public boolean f1690h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1691i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1692j = true;

    public static class a extends g.j.a.a {
        public static final Parcelable.Creator<a> CREATOR = new C0055a();

        /* renamed from: g  reason: collision with root package name */
        public boolean f1693g;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        public static class C0055a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new a[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1693g = parcel.readInt() != 1 ? false : true;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // g.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2593f, i2);
            parcel.writeInt(this.f1693g ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        o.o(this, new c.e.a.a.r.a(this));
    }

    public boolean isChecked() {
        return this.f1690h;
    }

    public int[] onCreateDrawableState(int i2) {
        if (!this.f1690h) {
            return super.onCreateDrawableState(i2);
        }
        int[] iArr = f1689g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f2593f);
        setChecked(aVar.f1693g);
    }

    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f1693g = this.f1690h;
        return aVar;
    }

    public void setCheckable(boolean z) {
        if (this.f1691i != z) {
            this.f1691i = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f1691i && this.f1690h != z) {
            this.f1690h = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f1692j = z;
    }

    public void setPressed(boolean z) {
        if (this.f1692j) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f1690h);
    }
}
