package g.b.g;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.tsuga.news.R;
import g.b.a;
import g.h.b.d;
import g.h.j.a0.b;
import g.h.j.c;
import g.h.j.m;
import g.h.j.o;
import g.h.k.e;
import java.util.concurrent.atomic.AtomicInteger;

public class k extends EditText implements m {
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final z f2117f;

    /* renamed from: g  reason: collision with root package name */
    public final y f2118g;

    /* renamed from: h  reason: collision with root package name */
    public final e f2119h;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0.a(context);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.e = eVar;
        eVar.d(attributeSet, i2);
        z zVar = new z(this);
        this.f2117f = zVar;
        zVar.e(attributeSet, i2);
        zVar.b();
        this.f2118g = new y(this);
        this.f2119h = new e();
    }

    @Override // g.h.j.m
    public c a(c cVar) {
        return this.f2119h.a(this, cVar);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.e;
        if (eVar != null) {
            eVar.a();
        }
        z zVar = this.f2117f;
        if (zVar != null) {
            zVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        y yVar;
        return (Build.VERSION.SDK_INT >= 28 || (yVar = this.f2118g) == null) ? super.getTextClassifier() : yVar.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2117f.g(this, onCreateInputConnection, editorInfo);
        a.e(onCreateInputConnection, editorInfo, this);
        AtomicInteger atomicInteger = o.a;
        String[] strArr = (String[]) getTag(R.id.tag_on_receive_content_mime_types);
        if (onCreateInputConnection == null || strArr == null) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArr;
        return new b(onCreateInputConnection, false, new t(this));
    }

    /* JADX INFO: finally extract failed */
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (dragEvent.getLocalState() == null) {
            AtomicInteger atomicInteger = o.a;
            if (((String[]) getTag(R.id.tag_on_receive_content_mime_types)) != null) {
                Context context = getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity == null) {
                    Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
                } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                    activity.requestDragAndDropPermissions(dragEvent);
                    int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                    beginBatchEdit();
                    try {
                        Selection.setSelection((Spannable) getText(), offsetForPosition);
                        o.k(this, new c(new c.a(dragEvent.getClipData(), 3)));
                        endBatchEdit();
                        z = true;
                    } catch (Throwable th) {
                        endBatchEdit();
                        throw th;
                    }
                }
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i2) {
        int i3 = 0;
        if (i2 == 16908322 || i2 == 16908337) {
            AtomicInteger atomicInteger = o.a;
            if (((String[]) getTag(R.id.tag_on_receive_content_mime_types)) != null) {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                    c.a aVar = new c.a(primaryClip, 1);
                    if (i2 != 16908322) {
                        i3 = 1;
                    }
                    aVar.f2523c = i3;
                    o.k(this, new c(aVar));
                }
                i3 = 1;
            }
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.e;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.e;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d.C(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        z zVar = this.f2117f;
        if (zVar != null) {
            zVar.f(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.f2118g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.b = textClassifier;
        }
    }
}
