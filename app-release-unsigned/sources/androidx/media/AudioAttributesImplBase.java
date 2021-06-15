package androidx.media;

import android.util.SparseIntArray;
import c.c.a.a.a;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a = 0;
    public int b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f200c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f201d = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.b != audioAttributesImplBase.b) {
            return false;
        }
        int i2 = this.f200c;
        int i3 = audioAttributesImplBase.f200c;
        int i4 = audioAttributesImplBase.f201d;
        int i5 = 4;
        if (i4 == -1) {
            int i6 = audioAttributesImplBase.a;
            SparseIntArray sparseIntArray = AudioAttributesCompat.a;
            if ((i3 & 1) != 1) {
                if ((i3 & 4) != 4) {
                    switch (i6) {
                        case 2:
                            i5 = 0;
                            break;
                        case 3:
                            i5 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i5 = 5;
                            break;
                        case 6:
                            i5 = 2;
                            break;
                        case 11:
                            i5 = 10;
                            break;
                        case 12:
                        default:
                            i5 = 3;
                            break;
                        case 13:
                            i5 = 1;
                            break;
                    }
                } else {
                    i5 = 6;
                }
            } else {
                i5 = 7;
            }
        } else {
            i5 = i4;
        }
        if (i5 == 6) {
            i3 |= 4;
        } else if (i5 == 7) {
            i3 |= 1;
        }
        return i2 == (i3 & 273) && this.a == audioAttributesImplBase.a && this.f201d == i4;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.f200c), Integer.valueOf(this.a), Integer.valueOf(this.f201d)});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f201d != -1) {
            sb.append(" stream=");
            sb.append(this.f201d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i2 = this.a;
        SparseIntArray sparseIntArray = AudioAttributesCompat.a;
        switch (i2) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = a.l("unknown usage ", i2);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f200c).toUpperCase());
        return sb.toString();
    }
}
