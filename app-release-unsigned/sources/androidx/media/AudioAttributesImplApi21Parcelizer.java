package androidx.media;

import android.media.AudioAttributes;
import g.w.a;
import java.util.Objects;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) aVar.m(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = aVar.k(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        aVar.p(1);
        aVar.u(audioAttributes);
        int i2 = audioAttributesImplApi21.b;
        aVar.p(2);
        aVar.t(i2);
    }
}
