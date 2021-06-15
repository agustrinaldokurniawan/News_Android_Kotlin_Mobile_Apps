package androidx.media;

import g.w.a;
import java.util.Objects;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = aVar.k(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = aVar.k(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.f200c = aVar.k(audioAttributesImplBase.f200c, 3);
        audioAttributesImplBase.f201d = aVar.k(audioAttributesImplBase.f201d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        Objects.requireNonNull(aVar);
        int i2 = audioAttributesImplBase.a;
        aVar.p(1);
        aVar.t(i2);
        int i3 = audioAttributesImplBase.b;
        aVar.p(2);
        aVar.t(i3);
        int i4 = audioAttributesImplBase.f200c;
        aVar.p(3);
        aVar.t(i4);
        int i5 = audioAttributesImplBase.f201d;
        aVar.p(4);
        aVar.t(i5);
    }
}
