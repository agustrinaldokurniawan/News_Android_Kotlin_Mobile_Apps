package c.e.a.a.f;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class b extends FloatingActionButton.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public void b(FloatingActionButton floatingActionButton) {
            BottomAppBar.w(b.this.b);
        }
    }

    public b(BottomAppBar bottomAppBar, int i2) {
        this.b = bottomAppBar;
        this.a = i2;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.b.A(this.a));
        floatingActionButton.m(new a(), true);
    }
}
