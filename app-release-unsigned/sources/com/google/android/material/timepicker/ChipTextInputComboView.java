package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import c.e.a.a.r.j;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.tsuga.news.R;

public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout f1715f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f1716g;

    /* renamed from: h  reason: collision with root package name */
    public TextWatcher f1717h;

    public class b extends j {
        public b(a aVar) {
        }

        @Override // c.e.a.a.r.j
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.e.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.e.setText(ChipTextInputComboView.a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.e = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f1715f = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f1716g = editText;
        editText.setVisibility(4);
        b bVar = new b(null);
        this.f1717h = bVar;
        editText.addTextChangedListener(bVar);
        b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public final void b() {
        this.f1716g.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public boolean isChecked() {
        return this.e.isChecked();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void setChecked(boolean z) {
        this.e.setChecked(z);
        int i2 = 0;
        this.f1716g.setVisibility(z ? 0 : 4);
        Chip chip = this.e;
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            this.f1716g.requestFocus();
            if (!TextUtils.isEmpty(this.f1716g.getText())) {
                EditText editText = this.f1716g;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public void setTag(int i2, Object obj) {
        this.e.setTag(i2, obj);
    }

    public void toggle() {
        this.e.toggle();
    }
}
