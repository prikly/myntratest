package kotlin.reflect.jvm.internal.impl.types;

import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* compiled from: AbstractTypeChecker.kt */
public final class AbstractTypeChecker {
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();
    public static boolean RUN_SLOW_ASSERTIONS;

    /* compiled from: AbstractTypeChecker.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            iArr[TypeVariance.INV.ordinal()] = 1;
            iArr[TypeVariance.OUT.ordinal()] = 2;
            iArr[TypeVariance.IN.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private AbstractTypeChecker() {
    }

    public static /* synthetic */ boolean isSubtypeOf$default(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractTypeChecker.isSubtypeOf(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    public final boolean isSubtypeOf(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        Intrinsics.checkNotNullParameter(typeCheckerState, AdOperationMetric.INIT_STATE);
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "subType");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "superType");
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        if (!typeCheckerState.customIsSubtypeOf(kotlinTypeMarker, kotlinTypeMarker2)) {
            return false;
        }
        return completeIsSubTypeOf(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    public final boolean equalTypes(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        Intrinsics.checkNotNullParameter(typeCheckerState, AdOperationMetric.INIT_STATE);
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY);
        Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "b");
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        if (INSTANCE.isCommonDenotableType(typeSystemContext, kotlinTypeMarker) && INSTANCE.isCommonDenotableType(typeSystemContext, kotlinTypeMarker2)) {
            KotlinTypeMarker prepareType = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker));
            KotlinTypeMarker prepareType2 = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker2));
            SimpleTypeMarker lowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(prepareType);
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(prepareType), typeSystemContext.typeConstructor(prepareType2))) {
                return false;
            }
            if (typeSystemContext.argumentsCount(lowerBoundIfFlexible) == 0) {
                if (typeSystemContext.hasFlexibleNullability(prepareType) || typeSystemContext.hasFlexibleNullability(prepareType2) || typeSystemContext.isMarkedNullable(lowerBoundIfFlexible) == typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(prepareType2))) {
                    return true;
                }
                return false;
            }
        }
        if (!isSubtypeOf$default(INSTANCE, typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, false, 8, (Object) null) || !isSubtypeOf$default(INSTANCE, typeCheckerState, kotlinTypeMarker2, kotlinTypeMarker, false, 8, (Object) null)) {
            return false;
        }
        return true;
    }

    private final boolean completeIsSubTypeOf(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        KotlinTypeMarker prepareType = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker));
        KotlinTypeMarker prepareType2 = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker2));
        Boolean checkSubtypeForSpecialCases = INSTANCE.checkSubtypeForSpecialCases(typeCheckerState, typeSystemContext.lowerBoundIfFlexible(prepareType), typeSystemContext.upperBoundIfFlexible(prepareType2));
        if (checkSubtypeForSpecialCases == null) {
            Boolean addSubtypeConstraint = typeCheckerState.addSubtypeConstraint(prepareType, prepareType2, z);
            if (addSubtypeConstraint == null) {
                return INSTANCE.isSubtypeOfForSingleClassifierType(typeCheckerState, typeSystemContext.lowerBoundIfFlexible(prepareType), typeSystemContext.upperBoundIfFlexible(prepareType2));
            }
            return addSubtypeConstraint.booleanValue();
        }
        boolean booleanValue = checkSubtypeForSpecialCases.booleanValue();
        typeCheckerState.addSubtypeConstraint(prepareType, prepareType2, z);
        return booleanValue;
    }

    private final Boolean checkSubtypeForIntegerLiteralType(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (!typeSystemContext.isIntegerLiteralType(simpleTypeMarker) && !typeSystemContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return null;
        }
        if (typeSystemContext.isIntegerLiteralType(simpleTypeMarker) && typeSystemContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return true;
        }
        if (typeSystemContext.isIntegerLiteralType(simpleTypeMarker)) {
            if (m61checkSubtypeForIntegerLiteralType$lambda7$isTypeInIntegerLiteralType(typeSystemContext, typeCheckerState, simpleTypeMarker, simpleTypeMarker2, false)) {
                return true;
            }
        } else if (typeSystemContext.isIntegerLiteralType(simpleTypeMarker2) && (m60checkSubtypeForIntegerLiteralType$lambda7$isIntegerLiteralTypeInIntersectionComponents(typeSystemContext, simpleTypeMarker) || m61checkSubtypeForIntegerLiteralType$lambda7$isTypeInIntegerLiteralType(typeSystemContext, typeCheckerState, simpleTypeMarker2, simpleTypeMarker, true))) {
            return true;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (isSubtypeOf$default(INSTANCE, r11, r13, r6, false, 8, (java.lang.Object) null) != false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e A[SYNTHETIC] */
    /* renamed from: checkSubtypeForIntegerLiteralType$lambda-7$isTypeInIntegerLiteralType  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean m61checkSubtypeForIntegerLiteralType$lambda7$isTypeInIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r10, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r11, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r12, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r13, boolean r14) {
        /*
            java.util.Collection r12 = r10.possibleIntegerTypes(r12)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r0 = r12 instanceof java.util.Collection
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0017
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0017
        L_0x0015:
            r1 = 0
            goto L_0x004e
        L_0x0017:
            java.util.Iterator r12 = r12.iterator()
        L_0x001b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r12.next()
            r6 = r0
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r6 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r6
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r0 = r10.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r6)
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r3 = r10.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r13)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 != 0) goto L_0x004b
            if (r14 == 0) goto L_0x0049
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r3 = INSTANCE
            r5 = r13
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r5 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r5
            r7 = 0
            r8 = 8
            r9 = 0
            r4 = r11
            boolean r0 = isSubtypeOf$default(r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r0 = 0
            goto L_0x004c
        L_0x004b:
            r0 = 1
        L_0x004c:
            if (r0 == 0) goto L_0x001b
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.m61checkSubtypeForIntegerLiteralType$lambda7$isTypeInIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: checkSubtypeForIntegerLiteralType$lambda-7$isIntegerLiteralTypeInIntersectionComponents  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean m60checkSubtypeForIntegerLiteralType$lambda7$isIntegerLiteralTypeInIntersectionComponents(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r3, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r4) {
        /*
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r4 = r3.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r4)
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0044
            java.util.Collection r4 = r3.supertypes(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x001f
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001f
        L_0x001d:
            r3 = 0
            goto L_0x0041
        L_0x001f:
            java.util.Iterator r4 = r4.iterator()
        L_0x0023:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r0 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r0
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r0 = r3.asSimpleType(r0)
            if (r0 != 0) goto L_0x0037
        L_0x0035:
            r0 = 0
            goto L_0x003e
        L_0x0037:
            boolean r0 = r3.isIntegerLiteralType(r0)
            if (r0 != r1) goto L_0x0035
            r0 = 1
        L_0x003e:
            if (r0 == 0) goto L_0x0023
            r3 = 1
        L_0x0041:
            if (r3 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.m60checkSubtypeForIntegerLiteralType$lambda7$isIntegerLiteralTypeInIntersectionComponents(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker):boolean");
    }

    private final boolean hasNothingSupertype(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        TypeConstructorMarker typeConstructor = typeSystemContext.typeConstructor(simpleTypeMarker);
        if (typeSystemContext.isClassTypeConstructor(typeConstructor)) {
            return typeSystemContext.isNothingConstructor(typeConstructor);
        }
        if (typeSystemContext.isNothingConstructor(typeSystemContext.typeConstructor(simpleTypeMarker))) {
            return true;
        }
        typeCheckerState.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(simpleTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() <= 1000) {
                SimpleTypeMarker pop = supertypesDeque.pop();
                Intrinsics.checkNotNullExpressionValue(pop, "current");
                if (supertypesSet.add(pop)) {
                    if (typeSystemContext.isClassType(pop)) {
                        supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                    } else {
                        supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    }
                    if (!(!Intrinsics.areEqual((Object) supertypesPolicy, (Object) TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                        supertypesPolicy = null;
                    }
                    if (supertypesPolicy == null) {
                        continue;
                    } else {
                        TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                        for (KotlinTypeMarker transformType : typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(pop))) {
                            SimpleTypeMarker transformType2 = supertypesPolicy.transformType(typeCheckerState, transformType);
                            if (typeSystemContext.isNothingConstructor(typeSystemContext.typeConstructor(transformType2))) {
                                typeCheckerState.clear();
                                return true;
                            }
                            supertypesDeque.add(transformType2);
                        }
                        continue;
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarker + ". Supertypes = " + CollectionsKt.joinToString$default(supertypesSet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)).toString());
            }
        }
        typeCheckerState.clear();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014a, code lost:
        if ((r3.getVariance(r9) == kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV) != false) goto L_0x014c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isSubtypeOfForSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r19, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r20, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r3 = r19.getTypeSystemContext()
            boolean r4 = RUN_SLOW_ASSERTIONS
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0066
            boolean r4 = r3.isSingleClassifierType(r1)
            if (r4 != 0) goto L_0x002c
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r4 = r3.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r1)
            boolean r4 = r3.isIntersection(r4)
            if (r4 != 0) goto L_0x002c
            r4 = r1
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r4
            boolean r4 = r0.isAllowedTypeVariable(r4)
            if (r4 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r4 = 0
            goto L_0x002d
        L_0x002c:
            r4 = 1
        L_0x002d:
            boolean r7 = kotlin._Assertions.ENABLED
            if (r7 == 0) goto L_0x0040
            if (r4 == 0) goto L_0x0034
            goto L_0x0040
        L_0x0034:
            java.lang.String r0 = "Not singleClassifierType and not intersection subType: "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x0040:
            boolean r4 = r3.isSingleClassifierType(r2)
            if (r4 != 0) goto L_0x0052
            r4 = r2
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r4
            boolean r4 = r0.isAllowedTypeVariable(r4)
            if (r4 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r4 = 0
            goto L_0x0053
        L_0x0052:
            r4 = 1
        L_0x0053:
            boolean r7 = kotlin._Assertions.ENABLED
            if (r7 == 0) goto L_0x0066
            if (r4 == 0) goto L_0x005a
            goto L_0x0066
        L_0x005a:
            java.lang.String r0 = "Not singleClassifierType superType: "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x0066:
            kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker r4 = kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker.INSTANCE
            boolean r4 = r4.isPossibleSubtype(r0, r1, r2)
            if (r4 != 0) goto L_0x006f
            return r5
        L_0x006f:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r4 = INSTANCE
            r7 = r1
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r7 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r7
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r8 = r3.lowerBoundIfFlexible(r7)
            r9 = r2
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r9 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r9
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r10 = r3.upperBoundIfFlexible(r9)
            java.lang.Boolean r4 = r4.checkSubtypeForIntegerLiteralType(r0, r8, r10)
            if (r4 != 0) goto L_0x01f4
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r4 = r3.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r2)
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r7 = r3.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r1)
            boolean r7 = r3.areEqualTypeConstructors(r7, r4)
            if (r7 == 0) goto L_0x009a
            int r7 = r3.parametersCount(r4)
            if (r7 != 0) goto L_0x009a
            return r6
        L_0x009a:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r7 = r3.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r2)
            boolean r7 = r3.isAnyConstructor(r7)
            if (r7 == 0) goto L_0x00a5
            return r6
        L_0x00a5:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r7 = INSTANCE
            java.util.List r7 = r7.findCorrespondingSupertypes(r0, r1, r4)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r9)
            r8.<init>(r10)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r7 = r7.iterator()
        L_0x00be:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00dd
            java.lang.Object r10 = r7.next()
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r10 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r10
            r11 = r10
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r11 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r11
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r11 = r0.prepareType(r11)
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r11 = r3.asSimpleType(r11)
            if (r11 != 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r10 = r11
        L_0x00d9:
            r8.add(r10)
            goto L_0x00be
        L_0x00dd:
            java.util.List r8 = (java.util.List) r8
            int r7 = r8.size()
            if (r7 == 0) goto L_0x01ed
            if (r7 == r6) goto L_0x01dc
            kotlin.reflect.jvm.internal.impl.types.model.ArgumentList r7 = new kotlin.reflect.jvm.internal.impl.types.model.ArgumentList
            int r10 = r3.parametersCount(r4)
            r7.<init>(r10)
            int r10 = r3.parametersCount(r4)
            r11 = 0
            r12 = 0
        L_0x00f6:
            if (r11 >= r10) goto L_0x019e
            int r13 = r11 + 1
            if (r12 != 0) goto L_0x010b
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r12 = r3.getParameter(r4, r11)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r12 = r3.getVariance((kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker) r12)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r14 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT
            if (r12 == r14) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            r12 = 0
            goto L_0x010c
        L_0x010b:
            r12 = 1
        L_0x010c:
            if (r12 == 0) goto L_0x0112
            r17 = r4
            goto L_0x0195
        L_0x0112:
            r14 = r8
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r15 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r14, r9)
            r15.<init>(r5)
            java.util.Collection r15 = (java.util.Collection) r15
            java.util.Iterator r5 = r14.iterator()
        L_0x0124:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x0186
            java.lang.Object r14 = r5.next()
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r14 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r14
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r9 = r3.getArgumentOrNull(r14, r11)
            r16 = 0
            if (r9 != 0) goto L_0x013d
            r17 = r4
        L_0x013a:
            r9 = r16
            goto L_0x014c
        L_0x013d:
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r6 = r3.getVariance((kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) r9)
            r17 = r4
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r4 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV
            if (r6 != r4) goto L_0x0149
            r4 = 1
            goto L_0x014a
        L_0x0149:
            r4 = 0
        L_0x014a:
            if (r4 == 0) goto L_0x013a
        L_0x014c:
            if (r9 == 0) goto L_0x015b
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = r3.getType(r9)
            r15.add(r4)
            r4 = r17
            r6 = 1
            r9 = 10
            goto L_0x0124
        L_0x015b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Incorrect type: "
            r3.append(r4)
            r3.append(r14)
            java.lang.String r4 = ", subType: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", superType: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0186:
            r17 = r4
            java.util.List r15 = (java.util.List) r15
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = r3.intersectTypes(r15)
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r4 = r3.asTypeArgument(r4)
            r7.add(r4)
        L_0x0195:
            r11 = r13
            r4 = r17
            r5 = 0
            r6 = 1
            r9 = 10
            goto L_0x00f6
        L_0x019e:
            if (r12 != 0) goto L_0x01ac
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r1 = INSTANCE
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker r7 = (kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker) r7
            boolean r1 = r1.isSubtypeForSameConstructor(r0, r7, r2)
            if (r1 == 0) goto L_0x01ac
            r1 = 1
            return r1
        L_0x01ac:
            r1 = 1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r4 = r8 instanceof java.util.Collection
            if (r4 == 0) goto L_0x01be
            r4 = r8
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x01be
        L_0x01bc:
            r5 = 0
            goto L_0x01db
        L_0x01be:
            java.util.Iterator r4 = r8.iterator()
        L_0x01c2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01bc
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r5 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r5
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r6 = INSTANCE
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker r5 = r3.asArgumentList(r5)
            boolean r5 = r6.isSubtypeForSameConstructor(r0, r5, r2)
            if (r5 == 0) goto L_0x01c2
            r5 = 1
        L_0x01db:
            return r5
        L_0x01dc:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r1 = INSTANCE
            java.lang.Object r4 = kotlin.collections.CollectionsKt.first(r8)
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r4 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r4
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker r3 = r3.asArgumentList(r4)
            boolean r0 = r1.isSubtypeForSameConstructor(r0, r3, r2)
            return r0
        L_0x01ed:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r2 = INSTANCE
            boolean r0 = r2.hasNothingSupertype(r0, r1)
            return r0
        L_0x01f4:
            boolean r6 = r4.booleanValue()
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r19
            r1 = r7
            r2 = r9
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.addSubtypeConstraint$default(r0, r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.isSubtypeOfForSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker):boolean");
    }

    private final boolean isTypeVariableAgainstStarProjectionForSelfType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeParameterMarker typeParameter;
        SimpleTypeMarker asSimpleType = typeSystemContext.asSimpleType(kotlinTypeMarker);
        if (!(asSimpleType instanceof CapturedTypeMarker)) {
            return false;
        }
        CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) asSimpleType;
        if (typeSystemContext.isOldCapturedType(capturedTypeMarker) || !typeSystemContext.isStarProjection(typeSystemContext.projection(typeSystemContext.typeConstructor(capturedTypeMarker))) || typeSystemContext.captureStatus(capturedTypeMarker) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        TypeConstructorMarker typeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarker2);
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructor instanceof TypeVariableTypeConstructorMarker ? (TypeVariableTypeConstructorMarker) typeConstructor : null;
        if (typeVariableTypeConstructorMarker == null || (typeParameter = typeSystemContext.getTypeParameter(typeVariableTypeConstructorMarker)) == null || !typeSystemContext.hasRecursiveBounds(typeParameter, typeConstructorMarker)) {
            return false;
        }
        return true;
    }

    public final boolean isSubtypeForSameConstructor(TypeCheckerState typeCheckerState, TypeArgumentListMarker typeArgumentListMarker, SimpleTypeMarker simpleTypeMarker) {
        boolean z;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        TypeArgumentListMarker typeArgumentListMarker2 = typeArgumentListMarker;
        SimpleTypeMarker simpleTypeMarker2 = simpleTypeMarker;
        Intrinsics.checkNotNullParameter(typeCheckerState2, "<this>");
        Intrinsics.checkNotNullParameter(typeArgumentListMarker2, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(simpleTypeMarker2, "superType");
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        TypeConstructorMarker typeConstructor = typeSystemContext.typeConstructor(simpleTypeMarker2);
        int size = typeSystemContext.size(typeArgumentListMarker2);
        int parametersCount = typeSystemContext.parametersCount(typeConstructor);
        if (size == parametersCount) {
            KotlinTypeMarker kotlinTypeMarker = simpleTypeMarker2;
            if (size == typeSystemContext.argumentsCount(kotlinTypeMarker)) {
                int i = 0;
                while (i < parametersCount) {
                    int i2 = i + 1;
                    TypeArgumentMarker argument = typeSystemContext.getArgument(kotlinTypeMarker, i);
                    if (!typeSystemContext.isStarProjection(argument)) {
                        KotlinTypeMarker type = typeSystemContext.getType(argument);
                        TypeArgumentMarker typeArgumentMarker = typeSystemContext.get(typeArgumentListMarker2, i);
                        boolean z2 = typeSystemContext.getVariance(typeArgumentMarker) == TypeVariance.INV;
                        if (!_Assertions.ENABLED || z2) {
                            KotlinTypeMarker type2 = typeSystemContext.getType(typeArgumentMarker);
                            TypeVariance effectiveVariance = INSTANCE.effectiveVariance(typeSystemContext.getVariance(typeSystemContext.getParameter(typeConstructor, i)), typeSystemContext.getVariance(argument));
                            if (effectiveVariance == null) {
                                return typeCheckerState.isErrorTypeEqualsToAnything();
                            }
                            if (effectiveVariance == TypeVariance.INV && (INSTANCE.isTypeVariableAgainstStarProjectionForSelfType(typeSystemContext, type2, type, typeConstructor) || INSTANCE.isTypeVariableAgainstStarProjectionForSelfType(typeSystemContext, type, type2, typeConstructor))) {
                                continue;
                            } else if (typeCheckerState.argumentsDepth <= 100) {
                                typeCheckerState2.argumentsDepth = typeCheckerState.argumentsDepth + 1;
                                int i3 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
                                if (i3 == 1) {
                                    z = INSTANCE.equalTypes(typeCheckerState2, type2, type);
                                } else if (i3 == 2) {
                                    z = isSubtypeOf$default(INSTANCE, typeCheckerState, type2, type, false, 8, (Object) null);
                                } else if (i3 == 3) {
                                    z = isSubtypeOf$default(INSTANCE, typeCheckerState, type, type2, false, 8, (Object) null);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                typeCheckerState2.argumentsDepth = typeCheckerState.argumentsDepth - 1;
                                if (!z) {
                                    return false;
                                }
                            } else {
                                throw new IllegalStateException(Intrinsics.stringPlus("Arguments depth is too high. Some related argument: ", type2).toString());
                            }
                        } else {
                            throw new AssertionError(Intrinsics.stringPlus("Incorrect sub argument: ", typeArgumentMarker));
                        }
                    }
                    i = i2;
                }
                return true;
            }
        }
        return false;
    }

    private final boolean isCommonDenotableType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        return typeSystemContext.isDenotable(typeSystemContext.typeConstructor(kotlinTypeMarker)) && !typeSystemContext.isDynamic(kotlinTypeMarker) && !typeSystemContext.isDefinitelyNotNullType(kotlinTypeMarker) && Intrinsics.areEqual((Object) typeSystemContext.typeConstructor(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker)), (Object) typeSystemContext.typeConstructor(typeSystemContext.upperBoundIfFlexible(kotlinTypeMarker)));
    }

    public final TypeVariance effectiveVariance(TypeVariance typeVariance, TypeVariance typeVariance2) {
        Intrinsics.checkNotNullParameter(typeVariance, "declared");
        Intrinsics.checkNotNullParameter(typeVariance2, "useSite");
        if (typeVariance == TypeVariance.INV) {
            return typeVariance2;
        }
        if (typeVariance2 == TypeVariance.INV || typeVariance == typeVariance2) {
            return typeVariance;
        }
        return null;
    }

    private final boolean isStubTypeSubtypeOfAnother(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        DefinitelyNotNullTypeMarker asDefinitelyNotNullType = typeSystemContext.asDefinitelyNotNullType(simpleTypeMarker);
        SimpleTypeMarker original = asDefinitelyNotNullType == null ? simpleTypeMarker : typeSystemContext.original(asDefinitelyNotNullType);
        DefinitelyNotNullTypeMarker asDefinitelyNotNullType2 = typeSystemContext.asDefinitelyNotNullType(simpleTypeMarker2);
        if (typeSystemContext.typeConstructor(original) != typeSystemContext.typeConstructor(asDefinitelyNotNullType2 == null ? simpleTypeMarker2 : typeSystemContext.original(asDefinitelyNotNullType2))) {
            return false;
        }
        if (!typeSystemContext.isDefinitelyNotNullType(simpleTypeMarker) && typeSystemContext.isDefinitelyNotNullType(simpleTypeMarker2)) {
            return false;
        }
        if (!typeSystemContext.isMarkedNullable(simpleTypeMarker) || typeSystemContext.isMarkedNullable(simpleTypeMarker2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0150, code lost:
        if (r11 == false) goto L_0x0169;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Boolean checkSubtypeForSpecialCases(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r18, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r19, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r20) {
        /*
            r17 = this;
            r0 = r19
            r1 = r20
            kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r2 = r18.getTypeSystemContext()
            r10 = r0
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r10 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r10
            boolean r3 = r2.isError(r10)
            r11 = 0
            r12 = 1
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r12)
            if (r3 != 0) goto L_0x0173
            r14 = r1
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r14 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r14
            boolean r3 = r2.isError(r14)
            if (r3 == 0) goto L_0x0022
            goto L_0x0173
        L_0x0022:
            boolean r3 = r2.isStubTypeForBuilderInference(r0)
            if (r3 == 0) goto L_0x0042
            boolean r3 = r2.isStubTypeForBuilderInference(r1)
            if (r3 == 0) goto L_0x0042
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r3 = INSTANCE
            boolean r0 = r3.isStubTypeSubtypeOfAnother(r2, r0, r1)
            if (r0 != 0) goto L_0x003c
            boolean r0 = r18.isStubTypeEqualsToAnything()
            if (r0 == 0) goto L_0x003d
        L_0x003c:
            r11 = 1
        L_0x003d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L_0x0042:
            boolean r3 = r2.isStubType(r0)
            if (r3 != 0) goto L_0x016a
            boolean r3 = r2.isStubType(r1)
            if (r3 == 0) goto L_0x0050
            goto L_0x016a
        L_0x0050:
            kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker r3 = r2.asDefinitelyNotNullType(r1)
            if (r3 != 0) goto L_0x0058
            r3 = r1
            goto L_0x005c
        L_0x0058:
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r3 = r2.original(r3)
        L_0x005c:
            kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker r3 = r2.asCapturedType(r3)
            r15 = 0
            if (r3 != 0) goto L_0x0065
            r4 = r15
            goto L_0x0069
        L_0x0065:
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = r2.lowerType(r3)
        L_0x0069:
            if (r3 == 0) goto L_0x00bd
            if (r4 == 0) goto L_0x00bd
            boolean r5 = r2.isMarkedNullable((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r1)
            if (r5 == 0) goto L_0x007b
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = r2.withNullability((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r4, (boolean) r12)
        L_0x0077:
            r9 = r18
            r6 = r4
            goto L_0x0086
        L_0x007b:
            boolean r5 = r2.isDefinitelyNotNullType(r14)
            if (r5 == 0) goto L_0x0077
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = r2.makeDefinitelyNotNullOrNotNull(r4)
            goto L_0x0077
        L_0x0086:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r3 = r9.getLowerCapturedTypePolicy(r0, r3)
            int[] r4 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.WhenMappings.$EnumSwitchMapping$1
            int r3 = r3.ordinal()
            r3 = r4[r3]
            if (r3 == r12) goto L_0x00ab
            r4 = 2
            if (r3 == r4) goto L_0x0098
            goto L_0x00bd
        L_0x0098:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r3 = INSTANCE
            r7 = 0
            r8 = 8
            r16 = 0
            r4 = r18
            r5 = r10
            r9 = r16
            boolean r3 = isSubtypeOf$default(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x00bd
            return r13
        L_0x00ab:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r3 = INSTANCE
            r7 = 0
            r8 = 8
            r9 = 0
            r4 = r18
            r5 = r10
            boolean r0 = isSubtypeOf$default(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x00bd:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r3 = r2.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r1)
            boolean r4 = r2.isIntersection(r3)
            if (r4 == 0) goto L_0x0119
            boolean r0 = r2.isMarkedNullable((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r1)
            r0 = r0 ^ r12
            boolean r4 = kotlin._Assertions.ENABLED
            if (r4 == 0) goto L_0x00df
            if (r0 == 0) goto L_0x00d3
            goto L_0x00df
        L_0x00d3:
            java.lang.String r0 = "Intersection type should not be marked nullable!: "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x00df:
            java.util.Collection r0 = r2.supertypes(r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x00f4
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00f4
        L_0x00f2:
            r11 = 1
            goto L_0x0114
        L_0x00f4:
            java.util.Iterator r0 = r0.iterator()
        L_0x00f8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00f2
            java.lang.Object r1 = r0.next()
            r6 = r1
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r6 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r6
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r3 = INSTANCE
            r7 = 0
            r8 = 8
            r9 = 0
            r4 = r18
            r5 = r10
            boolean r1 = isSubtypeOf$default(r3, r4, r5, r6, r7, r8, r9)
            if (r1 != 0) goto L_0x00f8
        L_0x0114:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L_0x0119:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r3 = r2.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r0)
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker
            if (r0 != 0) goto L_0x0152
            boolean r0 = r2.isIntersection(r3)
            if (r0 == 0) goto L_0x0169
            java.util.Collection r0 = r2.supertypes(r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x013c
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x013c
        L_0x013a:
            r11 = 1
            goto L_0x0150
        L_0x013c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0140:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x013a
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r3 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r3
            boolean r3 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker
            if (r3 != 0) goto L_0x0140
        L_0x0150:
            if (r11 == 0) goto L_0x0169
        L_0x0152:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r0 = INSTANCE
            kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r3 = r18.getTypeSystemContext()
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r0 = r0.getTypeParameterForArgumentInBaseIfItEqualToTarget(r3, r14, r10)
            if (r0 == 0) goto L_0x0169
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r1 = r2.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r1)
            boolean r0 = r2.hasRecursiveBounds(r0, r1)
            if (r0 == 0) goto L_0x0169
            return r13
        L_0x0169:
            return r15
        L_0x016a:
            boolean r0 = r18.isStubTypeEqualsToAnything()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0173:
            boolean r3 = r18.isErrorTypeEqualsToAnything()
            if (r3 == 0) goto L_0x017a
            return r13
        L_0x017a:
            boolean r3 = r2.isMarkedNullable((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r0)
            if (r3 == 0) goto L_0x018b
            boolean r3 = r2.isMarkedNullable((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r1)
            if (r3 != 0) goto L_0x018b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L_0x018b:
            kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker r3 = kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker.INSTANCE
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r0 = r2.withNullability((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r0, (boolean) r11)
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r0 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r0
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r1 = r2.withNullability((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r1, (boolean) r11)
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r1 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r1
            boolean r0 = r3.strictEqualTypes(r2, r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.checkSubtypeForSpecialCases(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker):java.lang.Boolean");
    }

    private final TypeParameterMarker getTypeParameterForArgumentInBaseIfItEqualToTarget(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        int argumentsCount = typeSystemContext.argumentsCount(kotlinTypeMarker);
        int i = 0;
        while (true) {
            TypeArgumentMarker typeArgumentMarker = null;
            if (i >= argumentsCount) {
                return null;
            }
            int i2 = i + 1;
            TypeArgumentMarker argument = typeSystemContext.getArgument(kotlinTypeMarker, i);
            boolean z = true;
            if (!typeSystemContext.isStarProjection(argument)) {
                typeArgumentMarker = argument;
            }
            if (typeArgumentMarker != null) {
                KotlinTypeMarker type = typeSystemContext.getType(typeArgumentMarker);
                if (!typeSystemContext.isCapturedType(typeSystemContext.lowerBoundIfFlexible(type)) || !typeSystemContext.isCapturedType(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker2))) {
                    z = false;
                }
                if (!Intrinsics.areEqual((Object) type, (Object) kotlinTypeMarker2) && (!z || !Intrinsics.areEqual((Object) typeSystemContext.typeConstructor(type), (Object) typeSystemContext.typeConstructor(kotlinTypeMarker2)))) {
                    TypeParameterMarker typeParameterForArgumentInBaseIfItEqualToTarget = getTypeParameterForArgumentInBaseIfItEqualToTarget(typeSystemContext, type, kotlinTypeMarker2);
                    if (typeParameterForArgumentInBaseIfItEqualToTarget != null) {
                        return typeParameterForArgumentInBaseIfItEqualToTarget;
                    }
                }
            }
            i = i2;
        }
        return typeSystemContext.getParameter(typeSystemContext.typeConstructor(kotlinTypeMarker), i);
    }

    private final List<SimpleTypeMarker> collectAllSupertypesWithGivenTypeConstructor(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        SimpleTypeMarker simpleTypeMarker2 = simpleTypeMarker;
        TypeConstructorMarker typeConstructorMarker2 = typeConstructorMarker;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        List<SimpleTypeMarker> fastCorrespondingSupertypes = typeSystemContext.fastCorrespondingSupertypes(simpleTypeMarker2, typeConstructorMarker2);
        if (fastCorrespondingSupertypes == null) {
            if (!typeSystemContext.isClassTypeConstructor(typeConstructorMarker2) && typeSystemContext.isClassType(simpleTypeMarker2)) {
                return CollectionsKt.emptyList();
            }
            if (!typeSystemContext.isCommonFinalClassConstructor(typeConstructorMarker2)) {
                fastCorrespondingSupertypes = new SmartList<>();
                typeCheckerState.initialize();
                ArrayDeque<SimpleTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
                Intrinsics.checkNotNull(supertypesDeque);
                Set<SimpleTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
                Intrinsics.checkNotNull(supertypesSet);
                supertypesDeque.push(simpleTypeMarker2);
                while (!supertypesDeque.isEmpty()) {
                    if (supertypesSet.size() <= 1000) {
                        SimpleTypeMarker pop = supertypesDeque.pop();
                        Intrinsics.checkNotNullExpressionValue(pop, "current");
                        if (supertypesSet.add(pop)) {
                            SimpleTypeMarker captureFromArguments = typeSystemContext.captureFromArguments(pop, CaptureStatus.FOR_SUBTYPING);
                            if (captureFromArguments == null) {
                                captureFromArguments = pop;
                            }
                            if (typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(captureFromArguments), typeConstructorMarker2)) {
                                fastCorrespondingSupertypes.add(captureFromArguments);
                                supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                            } else if (typeSystemContext.argumentsCount(captureFromArguments) == 0) {
                                supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                            } else {
                                supertypesPolicy = typeCheckerState.getTypeSystemContext().substitutionSupertypePolicy(captureFromArguments);
                            }
                            if (!(!Intrinsics.areEqual((Object) supertypesPolicy, (Object) TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                                supertypesPolicy = null;
                            }
                            if (supertypesPolicy != null) {
                                TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                                for (KotlinTypeMarker transformType : typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(pop))) {
                                    supertypesDeque.add(supertypesPolicy.transformType(typeCheckerState, transformType));
                                }
                                TypeCheckerState typeCheckerState2 = typeCheckerState;
                            }
                        }
                    } else {
                        throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarker2 + ". Supertypes = " + CollectionsKt.joinToString$default(supertypesSet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)).toString());
                    }
                }
                TypeCheckerState typeCheckerState3 = typeCheckerState;
                typeCheckerState.clear();
            } else if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(simpleTypeMarker2), typeConstructorMarker2)) {
                return CollectionsKt.emptyList();
            } else {
                SimpleTypeMarker captureFromArguments2 = typeSystemContext.captureFromArguments(simpleTypeMarker2, CaptureStatus.FOR_SUBTYPING);
                if (captureFromArguments2 != null) {
                    simpleTypeMarker2 = captureFromArguments2;
                }
                return CollectionsKt.listOf(simpleTypeMarker2);
            }
        }
        return fastCorrespondingSupertypes;
    }

    private final List<SimpleTypeMarker> collectAndFilter(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return selectOnlyPureKotlinSupertypes(typeCheckerState, collectAllSupertypesWithGivenTypeConstructor(typeCheckerState, simpleTypeMarker, typeConstructorMarker));
    }

    private final List<SimpleTypeMarker> selectOnlyPureKotlinSupertypes(TypeCheckerState typeCheckerState, List<? extends SimpleTypeMarker> list) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (list.size() < 2) {
            return list;
        }
        Collection arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TypeArgumentListMarker asArgumentList = typeSystemContext.asArgumentList((SimpleTypeMarker) next);
            int size = typeSystemContext.size(asArgumentList);
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                int i2 = i + 1;
                if (!(typeSystemContext.asFlexibleType(typeSystemContext.getType(typeSystemContext.get(asArgumentList, i))) == null)) {
                    z = false;
                    break;
                }
                i = i2;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List<SimpleTypeMarker> list2 = (List) arrayList;
        return list2.isEmpty() ^ true ? list2 : list;
    }

    public final List<SimpleTypeMarker> findCorrespondingSupertypes(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        SimpleTypeMarker simpleTypeMarker2 = simpleTypeMarker;
        TypeConstructorMarker typeConstructorMarker2 = typeConstructorMarker;
        Intrinsics.checkNotNullParameter(typeCheckerState2, AdOperationMetric.INIT_STATE);
        Intrinsics.checkNotNullParameter(simpleTypeMarker2, "subType");
        Intrinsics.checkNotNullParameter(typeConstructorMarker2, "superConstructor");
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (typeSystemContext.isClassType(simpleTypeMarker2)) {
            return INSTANCE.collectAndFilter(typeCheckerState2, simpleTypeMarker2, typeConstructorMarker2);
        }
        if (!typeSystemContext.isClassTypeConstructor(typeConstructorMarker2) && !typeSystemContext.isIntegerLiteralTypeConstructor(typeConstructorMarker2)) {
            return INSTANCE.collectAllSupertypesWithGivenTypeConstructor(typeCheckerState2, simpleTypeMarker2, typeConstructorMarker2);
        }
        SmartList<SimpleTypeMarker> smartList = new SmartList<>();
        typeCheckerState.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(simpleTypeMarker2);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() <= 1000) {
                SimpleTypeMarker pop = supertypesDeque.pop();
                Intrinsics.checkNotNullExpressionValue(pop, "current");
                if (supertypesSet.add(pop)) {
                    if (typeSystemContext.isClassType(pop)) {
                        smartList.add(pop);
                        supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                    } else {
                        supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    }
                    if (!(!Intrinsics.areEqual((Object) supertypesPolicy, (Object) TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                        supertypesPolicy = null;
                    }
                    if (supertypesPolicy != null) {
                        TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                        for (KotlinTypeMarker transformType : typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(pop))) {
                            supertypesDeque.add(supertypesPolicy.transformType(typeCheckerState2, transformType));
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarker2 + ". Supertypes = " + CollectionsKt.joinToString$default(supertypesSet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)).toString());
            }
        }
        typeCheckerState.clear();
        Collection arrayList = new ArrayList();
        for (SimpleTypeMarker simpleTypeMarker3 : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(simpleTypeMarker3, "it");
            CollectionsKt.addAll(arrayList, abstractTypeChecker.collectAndFilter(typeCheckerState2, simpleTypeMarker3, typeConstructorMarker2));
        }
        return (List) arrayList;
    }
}
