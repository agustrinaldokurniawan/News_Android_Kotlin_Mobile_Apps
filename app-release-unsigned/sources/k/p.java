package k;

import i.j;
import i.o.b;
import i.o.c;
import i.s.c.f;
import i.s.c.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

public final class p extends b<i> implements RandomAccess {
    public static final a e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public final i[] f3751f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f3752g;

    public static final class a {
        public a(f fVar) {
        }

        public final void a(long j2, e eVar, int i2, List<? extends i> list, int i3, int i4, List<Integer> list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            e eVar2;
            int i9 = i2;
            if (i3 < i4) {
                for (int i10 = i3; i10 < i4; i10++) {
                    if (!(((i) list.get(i10)).d() >= i9)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                i iVar = (i) list.get(i3);
                i iVar2 = (i) list.get(i4 - 1);
                int i11 = -1;
                if (i9 == iVar.d()) {
                    int i12 = i3 + 1;
                    i5 = i12;
                    i6 = list2.get(i3).intValue();
                    iVar = (i) list.get(i12);
                } else {
                    i5 = i3;
                    i6 = -1;
                }
                if (iVar.g(i9) != iVar2.g(i9)) {
                    int i13 = 1;
                    for (int i14 = i5 + 1; i14 < i4; i14++) {
                        if (((i) list.get(i14 - 1)).g(i9) != ((i) list.get(i14)).g(i9)) {
                            i13++;
                        }
                    }
                    long b = b(eVar) + j2 + ((long) 2) + ((long) (i13 * 2));
                    eVar.u0(i13);
                    eVar.u0(i6);
                    for (int i15 = i5; i15 < i4; i15++) {
                        byte g2 = ((i) list.get(i15)).g(i9);
                        if (i15 == i5 || g2 != ((i) list.get(i15 - 1)).g(i9)) {
                            eVar.u0(g2 & 255);
                        }
                    }
                    e eVar3 = new e();
                    while (i5 < i4) {
                        byte g3 = ((i) list.get(i5)).g(i9);
                        int i16 = i5 + 1;
                        int i17 = i16;
                        while (true) {
                            if (i17 >= i4) {
                                i7 = i4;
                                break;
                            } else if (g3 != ((i) list.get(i17)).g(i9)) {
                                i7 = i17;
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (i16 == i7 && i9 + 1 == ((i) list.get(i5)).d()) {
                            eVar.u0(list2.get(i5).intValue());
                            i8 = i7;
                            eVar2 = eVar3;
                        } else {
                            eVar.u0(((int) (b(eVar3) + b)) * i11);
                            i8 = i7;
                            eVar2 = eVar3;
                            a(b, eVar3, i9 + 1, list, i5, i7, list2);
                        }
                        eVar3 = eVar2;
                        i5 = i8;
                        i11 = -1;
                    }
                    eVar.q0(eVar3);
                    return;
                }
                int min = Math.min(iVar.d(), iVar2.d());
                int i18 = i9;
                int i19 = 0;
                while (i18 < min && iVar.g(i18) == iVar2.g(i18)) {
                    i19++;
                    i18++;
                }
                long b2 = b(eVar) + j2 + ((long) 2) + ((long) i19) + 1;
                eVar.u0(-i19);
                eVar.u0(i6);
                int i20 = i9 + i19;
                while (i9 < i20) {
                    eVar.u0(iVar.g(i9) & 255);
                    i9++;
                }
                if (i5 + 1 == i4) {
                    if (i20 == ((i) list.get(i5)).d()) {
                        eVar.u0(list2.get(i5).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                e eVar4 = new e();
                eVar.u0(((int) (b(eVar4) + b2)) * -1);
                a(b2, eVar4, i20, list, i5, i4, list2);
                eVar.q0(eVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long b(e eVar) {
            return eVar.f3738f / ((long) 4);
        }

        public final p c(i... iVarArr) {
            int i2;
            h.f(iVarArr, "byteStrings");
            int i3 = 0;
            if (iVarArr.length == 0) {
                return new p(new i[0], new int[]{0, -1}, null);
            }
            h.e(iVarArr, "$this$toMutableList");
            h.e(iVarArr, "$this$asCollection");
            ArrayList arrayList = new ArrayList(new c(iVarArr, false));
            h.e(arrayList, "$this$sort");
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(iVarArr.length);
            for (i iVar : iVarArr) {
                arrayList2.add(-1);
            }
            Object[] array = arrayList2.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                Integer[] numArr2 = (Integer[]) Arrays.copyOf(numArr, numArr.length);
                h.e(numArr2, "elements");
                List<Integer> arrayList3 = numArr2.length == 0 ? new ArrayList<>() : new ArrayList<>(new c(numArr2, true));
                int length = iVarArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    i iVar2 = iVarArr[i4];
                    int i6 = i5 + 1;
                    int size = arrayList.size();
                    h.e(arrayList, "$this$binarySearch");
                    int size2 = arrayList.size();
                    if (size < 0) {
                        throw new IllegalArgumentException("fromIndex (" + 0 + ") is greater than toIndex (" + size + ").");
                    } else if (size <= size2) {
                        int i7 = size - 1;
                        int i8 = 0;
                        while (true) {
                            if (i8 > i7) {
                                i2 = -(i8 + 1);
                                break;
                            }
                            i2 = (i8 + i7) >>> 1;
                            int m2 = h.a.t.a.m((Comparable) arrayList.get(i2), iVar2);
                            if (m2 >= 0) {
                                if (m2 <= 0) {
                                    break;
                                }
                                i7 = i2 - 1;
                            } else {
                                i8 = i2 + 1;
                            }
                        }
                        arrayList3.set(i2, Integer.valueOf(i5));
                        i4++;
                        i5 = i6;
                    } else {
                        throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                    }
                }
                if (((i) arrayList.get(0)).d() > 0) {
                    int i9 = 0;
                    while (i9 < arrayList.size()) {
                        i iVar3 = (i) arrayList.get(i9);
                        int i10 = i9 + 1;
                        int i11 = i10;
                        while (i11 < arrayList.size()) {
                            i iVar4 = (i) arrayList.get(i11);
                            Objects.requireNonNull(iVar4);
                            h.f(iVar3, "prefix");
                            if (!iVar4.h(0, iVar3, 0, iVar3.d())) {
                                continue;
                                break;
                            }
                            if (!(iVar4.d() != iVar3.d())) {
                                throw new IllegalArgumentException(("duplicate option: " + iVar4).toString());
                            } else if (arrayList3.get(i11).intValue() > arrayList3.get(i9).intValue()) {
                                arrayList.remove(i11);
                                arrayList3.remove(i11);
                            } else {
                                i11++;
                            }
                        }
                        i9 = i10;
                    }
                    e eVar = new e();
                    a(0, eVar, 0, arrayList, 0, arrayList.size(), arrayList3);
                    int[] iArr = new int[((int) b(eVar))];
                    while (!eVar.R()) {
                        iArr[i3] = eVar.readInt();
                        i3++;
                    }
                    Object[] copyOf = Arrays.copyOf(iVarArr, iVarArr.length);
                    h.b(copyOf, "java.util.Arrays.copyOf(this, size)");
                    return new p((i[]) copyOf, iArr, null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new j("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public p(i[] iVarArr, int[] iArr, f fVar) {
        this.f3751f = iVarArr;
        this.f3752g = iArr;
    }

    @Override // i.o.a
    public int a() {
        return this.f3751f.length;
    }

    @Override // i.o.a
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.o.b, java.util.List
    public i get(int i2) {
        return this.f3751f[i2];
    }

    @Override // i.o.b
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // i.o.b
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
