package c.a.a.f;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tsuga.news.R;
import g.l.b.m;
import i.s.c.h;

public final class g extends m {
    public static final /* synthetic */ int X = 0;
    public c.a.a.c.g Y;

    public static final class a extends WebViewClient {
        public final /* synthetic */ g a;

        public a(g gVar) {
            this.a = gVar;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c.a.a.c.g gVar = this.a.Y;
            if (gVar == null) {
                h.k("binding");
                throw null;
            } else if (gVar.f394c.getVisibility() == 0) {
                c.a.a.c.g gVar2 = this.a.Y;
                if (gVar2 != null) {
                    gVar2.f394c.setVisibility(8);
                } else {
                    h.k("binding");
                    throw null;
                }
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            c.a.a.c.g gVar = this.a.Y;
            if (gVar != null) {
                gVar.f395d.setVisibility(0);
            } else {
                h.k("binding");
                throw null;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // g.l.b.m
    public View R(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        View inflate = r().inflate(R.layout.webview, viewGroup, false);
        int i2 = R.id.btn_close;
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.btn_close);
        if (imageButton != null) {
            i2 = R.id.pg;
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.pg);
            if (progressBar != null) {
                i2 = R.id.tv_error;
                TextView textView = (TextView) inflate.findViewById(R.id.tv_error);
                if (textView != null) {
                    i2 = R.id.tv_title;
                    TextView textView2 = (TextView) inflate.findViewById(R.id.tv_title);
                    if (textView2 != null) {
                        i2 = R.id.webview;
                        WebView webView = (WebView) inflate.findViewById(R.id.webview);
                        if (webView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            c.a.a.c.g gVar = new c.a.a.c.g(constraintLayout, imageButton, progressBar, textView, textView2, webView);
                            h.d(gVar, "inflate(layoutInflater, container, false)");
                            this.Y = gVar;
                            if (gVar != null) {
                                h.d(constraintLayout, "binding.root");
                                return constraintLayout;
                            }
                            h.k("binding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // g.l.b.m
    public void g0(View view, Bundle bundle) {
        String str;
        String str2;
        h.e(view, "view");
        Bundle bundle2 = this.f2718k;
        if (bundle2 == null) {
            str = null;
        } else {
            str = bundle2.getString("url");
        }
        Bundle bundle3 = this.f2718k;
        if (bundle3 == null) {
            str2 = null;
        } else {
            str2 = bundle3.getString("title");
        }
        if (str != null) {
            c.a.a.c.g gVar = this.Y;
            if (gVar != null) {
                WebSettings settings = gVar.f396f.getSettings();
                h.d(settings, "binding.webview.settings");
                settings.setDomStorageEnabled(true);
                c.a.a.c.g gVar2 = this.Y;
                if (gVar2 != null) {
                    gVar2.f396f.setWebViewClient(new a(this));
                    c.a.a.c.g gVar3 = this.Y;
                    if (gVar3 != null) {
                        gVar3.f396f.loadUrl(str);
                        c.a.a.c.g gVar4 = this.Y;
                        if (gVar4 != null) {
                            gVar4.e.setText(str2);
                            c.a.a.c.g gVar5 = this.Y;
                            if (gVar5 != null) {
                                gVar5.b.setOnClickListener(new d(this));
                            } else {
                                h.k("binding");
                                throw null;
                            }
                        } else {
                            h.k("binding");
                            throw null;
                        }
                    } else {
                        h.k("binding");
                        throw null;
                    }
                } else {
                    h.k("binding");
                    throw null;
                }
            } else {
                h.k("binding");
                throw null;
            }
        } else {
            Toast.makeText(o0(), "Invalid Url!", 0).show();
        }
    }
}
