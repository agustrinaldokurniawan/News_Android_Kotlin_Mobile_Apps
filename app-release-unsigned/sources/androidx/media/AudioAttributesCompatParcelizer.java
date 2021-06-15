package androidx.media;

import g.w.a;
import g.w.c;
import java.util.Objects;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.b;
        if (aVar.i(1)) {
            cVar = aVar.o();
        }
        audioAttributesCompat.b = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.b;
        aVar.p(1);
        aVar.w(audioAttributesImpl);
    }
}
