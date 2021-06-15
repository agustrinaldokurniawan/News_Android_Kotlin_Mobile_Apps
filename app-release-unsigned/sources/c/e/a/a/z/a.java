package c.e.a.a.z;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.tsuga.news.R;

public class a extends m {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f1407d = new C0043a();
    public final View.OnFocusChangeListener e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.f f1408f = new c();

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.g f1409g = new d();

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f1410h;

    /* renamed from: i  reason: collision with root package name */
    public ValueAnimator f1411i;

    /* renamed from: c.e.a.a.z.a$a  reason: collision with other inner class name */
    public class C0043a implements TextWatcher {
        public C0043a() {
        }

        public void afterTextChanged(Editable editable) {
            if (a.this.a.getSuffixText() == null) {
                a.this.d(editable.length() > 0);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            a aVar = a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.d(z2);
        }
    }

    public class c implements TextInputLayout.f {
        public c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if ((r0.getText().length() > 0) != false) goto L_0x001d;
         */
        @Override // com.google.android.material.textfield.TextInputLayout.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.google.android.material.textfield.TextInputLayout r5) {
            /*
                r4 = this;
                android.widget.EditText r0 = r5.getEditText()
                boolean r1 = r0.hasFocus()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                android.text.Editable r1 = r0.getText()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0018
                r1 = r2
                goto L_0x0019
            L_0x0018:
                r1 = r3
            L_0x0019:
                if (r1 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r2 = r3
            L_0x001d:
                r5.setEndIconVisible(r2)
                r5.setEndIconCheckable(r3)
                c.e.a.a.z.a r5 = c.e.a.a.z.a.this
                android.view.View$OnFocusChangeListener r5 = r5.e
                r0.setOnFocusChangeListener(r5)
                c.e.a.a.z.a r5 = c.e.a.a.z.a.this
                android.text.TextWatcher r5 = r5.f1407d
                r0.removeTextChangedListener(r5)
                c.e.a.a.z.a r5 = c.e.a.a.z.a.this
                android.text.TextWatcher r5 = r5.f1407d
                r0.addTextChangedListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.e.a.a.z.a.c.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    public class d implements TextInputLayout.g {

        /* renamed from: c.e.a.a.z.a$d$a  reason: collision with other inner class name */
        public class RunnableC0044a implements Runnable {
            public final /* synthetic */ EditText e;

            public RunnableC0044a(EditText editText) {
                this.e = editText;
            }

            public void run() {
                this.e.removeTextChangedListener(a.this.f1407d);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i2 == 2) {
                editText.post(new RunnableC0044a(editText));
                if (editText.getOnFocusChangeListener() == a.this.e) {
                    editText.setOnFocusChangeListener(null);
                }
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        public void onClick(View view) {
            Editable text = a.this.a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.a.o();
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // c.e.a.a.z.m
    public void a() {
        this.a.setEndIconDrawable(g.b.d.a.a.a(this.b, R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.a.setEndIconOnClickListener(new e());
        this.a.a(this.f1408f);
        TextInputLayout textInputLayout2 = this.a;
        textInputLayout2.j0.add(this.f1409g);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(c.e.a.a.c.a.f1180d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = c.e.a.a.c.a.a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1410h = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1410h.addListener(new b(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new d(this));
        this.f1411i = ofFloat3;
        ofFloat3.addListener(new c(this));
    }

    @Override // c.e.a.a.z.m
    public void c(boolean z) {
        if (this.a.getSuffixText() != null) {
            d(z);
        }
    }

    public final void d(boolean z) {
        boolean z2 = this.a.k() == z;
        if (z && !this.f1410h.isRunning()) {
            this.f1411i.cancel();
            this.f1410h.start();
            if (z2) {
                this.f1410h.end();
            }
        } else if (!z) {
            this.f1410h.cancel();
            this.f1411i.start();
            if (z2) {
                this.f1411i.end();
            }
        }
    }
}
