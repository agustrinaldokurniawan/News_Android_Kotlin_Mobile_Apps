package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import c.c.a.a.a;

@TargetApi(21)
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.a.equals(((AudioAttributesImplApi21) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder f2 = a.f("AudioAttributesCompat: audioattributes=");
        f2.append(this.a);
        return f2.toString();
    }
}
