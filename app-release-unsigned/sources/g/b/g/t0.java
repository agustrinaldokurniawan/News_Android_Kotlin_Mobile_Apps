package g.b.g;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.tsuga.news.R;
import g.i.a.c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

public class t0 extends c implements View.OnClickListener {
    public static final /* synthetic */ int p = 0;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public final SearchView q;
    public final SearchableInfo r;
    public final Context s;
    public final WeakHashMap<String, Drawable.ConstantState> t;
    public final int u;
    public int v = 1;
    public ColorStateList w;
    public int x = -1;
    public int y = -1;
    public int z = -1;

    public static final class a {
        public final TextView a;
        public final TextView b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f2159c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f2160d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.f2159c = (ImageView) view.findViewById(16908295);
            this.f2160d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public t0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.q = searchView;
        this.r = searchableInfo;
        this.u = searchView.getSuggestionCommitIconResId();
        this.s = context;
        this.t = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v6, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0140  */
    @Override // g.i.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.t0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // g.i.a.a
    public void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.x = cursor.getColumnIndex("suggest_text_1");
                this.y = cursor.getColumnIndex("suggest_text_2");
                this.z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // g.i.a.a
    public CharSequence c(Cursor cursor) {
        String h2;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        if (this.r.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!this.r.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h2;
    }

    @Override // g.i.a.c, g.i.a.a
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.o.inflate(this.f2592m, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.u);
        return inflate;
    }

    public Drawable e(Uri uri) {
        int i2;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.s.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i2 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(c.c.a.a.a.o("Single path segment is not a resource ID: ", uri));
                        }
                    } else if (size == 2) {
                        i2 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(c.c.a.a.a.o("More than two path segments: ", uri));
                    }
                    if (i2 != 0) {
                        return resourcesForApplication.getDrawable(i2);
                    }
                    throw new FileNotFoundException(c.c.a.a.a.o("No resource found for: ", uri));
                }
                throw new FileNotFoundException(c.c.a.a.a.o("No path: ", uri));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(c.c.a.a.a.o("No package found for authority: ", uri));
            }
        } else {
            throw new FileNotFoundException(c.c.a.a.a.o("No authority: ", uri));
        }
    }

    public final Drawable f(String str) {
        Uri parse;
        InputStream openInputStream;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + this.s.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = this.t.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Context context = this.s;
                Object obj = g.h.c.a.a;
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    this.t.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (NumberFormatException unused) {
                Drawable.ConstantState constantState2 = this.t.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                parse = Uri.parse(str);
                try {
                    if ("android.resource".equals(parse.getScheme())) {
                        try {
                            drawable = e(parse);
                        } catch (Resources.NotFoundException unused2) {
                            throw new FileNotFoundException("Resource does not exist: " + parse);
                        }
                    } else {
                        openInputStream = this.s.getContentResolver().openInputStream(parse);
                        if (openInputStream != null) {
                            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                            try {
                                openInputStream.close();
                            } catch (IOException e) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e);
                            }
                            drawable = createFromStream;
                        } else {
                            throw new FileNotFoundException("Failed to open " + parse);
                        }
                    }
                } catch (FileNotFoundException e2) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e2.getMessage());
                }
                if (drawable != null) {
                    this.t.put(str, drawable.getConstantState());
                }
            } catch (Resources.NotFoundException unused3) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
                return null;
            } catch (Throwable th) {
                try {
                    openInputStream.close();
                } catch (IOException e3) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e3);
                }
                throw th;
            }
        }
        return drawable;
    }

    public Cursor g(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i2 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.s.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // g.i.a.a
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.o.inflate(this.n, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // g.i.a.a
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View d2 = d(this.s, this.f2586g, viewGroup);
            ((a) d2.getTag()).a.setText(e.toString());
            return d2;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public final void i(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        i(this.f2586g);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        i(this.f2586g);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.q.x((CharSequence) tag);
        }
    }
}
