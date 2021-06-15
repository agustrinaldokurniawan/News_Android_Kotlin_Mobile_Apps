package g.h.k;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import g.h.j.c;
import g.h.j.l;

public final class e implements l {
    public static CharSequence b(Context context, ClipData.Item item, int i2) {
        if ((i2 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence coerceToText = item.coerceToText(context);
        return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
    }

    public static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // g.h.j.l
    public c a(View view, c cVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + cVar);
        }
        int i2 = cVar.b;
        if (i2 == 2) {
            return cVar;
        }
        int i3 = 0;
        if (i2 == 3) {
            TextView textView = (TextView) view;
            ClipData clipData = cVar.a;
            Context context = textView.getContext();
            int i4 = cVar.f2521c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            while (i3 < clipData.getItemCount()) {
                CharSequence b = b(context, clipData.getItemAt(i3), i4);
                if (b != null) {
                    spannableStringBuilder.append(b);
                }
                i3++;
            }
            c((Editable) textView.getText(), spannableStringBuilder);
            return null;
        }
        ClipData clipData2 = cVar.a;
        int i5 = cVar.f2521c;
        TextView textView2 = (TextView) view;
        Editable editable = (Editable) textView2.getText();
        Context context2 = textView2.getContext();
        boolean z = false;
        while (i3 < clipData2.getItemCount()) {
            CharSequence b2 = b(context2, clipData2.getItemAt(i3), i5);
            if (b2 != null) {
                if (!z) {
                    c(editable, b2);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b2);
                }
            }
            i3++;
        }
        return null;
    }
}
