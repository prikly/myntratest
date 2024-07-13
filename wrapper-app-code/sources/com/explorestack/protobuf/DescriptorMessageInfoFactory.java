package com.explorestack.protobuf;

import com.appodeal.ads.modules.common.internal.Constants;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.StructuralMessageInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

final class DescriptorMessageInfoFactory implements MessageInfoFactory {
    private static final String GET_DEFAULT_INSTANCE_METHOD_NAME = "getDefaultInstance";
    private static final DescriptorMessageInfoFactory instance = new DescriptorMessageInfoFactory();
    private static IsInitializedCheckAnalyzer isInitializedCheckAnalyzer = new IsInitializedCheckAnalyzer();
    private static final Set<String> specialFieldNames = new HashSet(Arrays.asList(new String[]{"cached_size", "serialized_size", "class"}));

    private DescriptorMessageInfoFactory() {
    }

    public static DescriptorMessageInfoFactory getInstance() {
        return instance;
    }

    public boolean isSupported(Class<?> cls) {
        return GeneratedMessageV3.class.isAssignableFrom(cls);
    }

    public MessageInfo messageInfoFor(Class<?> cls) {
        if (GeneratedMessageV3.class.isAssignableFrom(cls)) {
            return convert(cls, descriptorForType(cls));
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    private static Message getDefaultInstance(Class<?> cls) {
        try {
            return (Message) cls.getDeclaredMethod(GET_DEFAULT_INSTANCE_METHOD_NAME, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception e2) {
            throw new IllegalArgumentException("Unable to get default instance for message class " + cls.getName(), e2);
        }
    }

    private static Descriptors.Descriptor descriptorForType(Class<?> cls) {
        return getDefaultInstance(cls).getDescriptorForType();
    }

    private static MessageInfo convert(Class<?> cls, Descriptors.Descriptor descriptor) {
        int i = AnonymousClass3.$SwitchMap$com$google$protobuf$Descriptors$FileDescriptor$Syntax[descriptor.getFile().getSyntax().ordinal()];
        if (i == 1) {
            return convertProto2(cls, descriptor);
        }
        if (i == 2) {
            return convertProto3(cls, descriptor);
        }
        throw new IllegalArgumentException("Unsupported syntax: " + descriptor.getFile().getSyntax());
    }

    static class IsInitializedCheckAnalyzer {
        private int index = 0;
        private final Map<Descriptors.Descriptor, Node> nodeCache = new HashMap();
        private final Map<Descriptors.Descriptor, Boolean> resultCache = new ConcurrentHashMap();
        private final Stack<Node> stack = new Stack<>();

        IsInitializedCheckAnalyzer() {
        }

        public boolean needsIsInitializedCheck(Descriptors.Descriptor descriptor) {
            Boolean bool = this.resultCache.get(descriptor);
            if (bool != null) {
                return bool.booleanValue();
            }
            synchronized (this) {
                Boolean bool2 = this.resultCache.get(descriptor);
                if (bool2 != null) {
                    boolean booleanValue = bool2.booleanValue();
                    return booleanValue;
                }
                boolean z = dfs(descriptor).component.needsIsInitializedCheck;
                return z;
            }
        }

        private static class Node {
            StronglyConnectedComponent component = null;
            final Descriptors.Descriptor descriptor;
            final int index;
            int lowLink;

            Node(Descriptors.Descriptor descriptor2, int i) {
                this.descriptor = descriptor2;
                this.index = i;
                this.lowLink = i;
            }
        }

        private static class StronglyConnectedComponent {
            final List<Descriptors.Descriptor> messages;
            boolean needsIsInitializedCheck;

            private StronglyConnectedComponent() {
                this.messages = new ArrayList();
                this.needsIsInitializedCheck = false;
            }
        }

        private Node dfs(Descriptors.Descriptor descriptor) {
            Node pop;
            int i = this.index;
            this.index = i + 1;
            Node node = new Node(descriptor, i);
            this.stack.push(node);
            this.nodeCache.put(descriptor, node);
            for (Descriptors.FieldDescriptor next : descriptor.getFields()) {
                if (next.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    Node node2 = this.nodeCache.get(next.getMessageType());
                    if (node2 == null) {
                        node.lowLink = Math.min(node.lowLink, dfs(next.getMessageType()).lowLink);
                    } else if (node2.component == null) {
                        node.lowLink = Math.min(node.lowLink, node2.lowLink);
                    }
                }
            }
            if (node.index == node.lowLink) {
                StronglyConnectedComponent stronglyConnectedComponent = new StronglyConnectedComponent();
                do {
                    pop = this.stack.pop();
                    pop.component = stronglyConnectedComponent;
                    stronglyConnectedComponent.messages.add(pop.descriptor);
                } while (pop != node);
                analyze(stronglyConnectedComponent);
            }
            return node;
        }

        private void analyze(StronglyConnectedComponent stronglyConnectedComponent) {
            boolean z;
            Iterator<Descriptors.Descriptor> it = stronglyConnectedComponent.messages.iterator();
            loop0:
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Descriptors.Descriptor next = it.next();
                if (next.isExtendable()) {
                    break;
                }
                Iterator<Descriptors.FieldDescriptor> it2 = next.getFields().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Descriptors.FieldDescriptor next2 = it2.next();
                        if (next2.isRequired()) {
                            break loop0;
                        } else if (next2.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            Node node = this.nodeCache.get(next2.getMessageType());
                            if (node.component != stronglyConnectedComponent && node.component.needsIsInitializedCheck) {
                                break loop0;
                            }
                        }
                    }
                }
            }
            stronglyConnectedComponent.needsIsInitializedCheck = z;
            for (Descriptors.Descriptor put : stronglyConnectedComponent.messages) {
                this.resultCache.put(put, Boolean.valueOf(stronglyConnectedComponent.needsIsInitializedCheck));
            }
        }
    }

    private static boolean needsIsInitializedCheck(Descriptors.Descriptor descriptor) {
        return isInitializedCheckAnalyzer.needsIsInitializedCheck(descriptor);
    }

    private static StructuralMessageInfo convertProto2(Class<?> cls, Descriptors.Descriptor descriptor) {
        Class<?> cls2 = cls;
        List<Descriptors.FieldDescriptor> fields = descriptor.getFields();
        StructuralMessageInfo.Builder newBuilder = StructuralMessageInfo.newBuilder(fields.size());
        newBuilder.withDefaultInstance(getDefaultInstance(cls));
        newBuilder.withSyntax(ProtoSyntax.PROTO2);
        newBuilder.withMessageSetWireFormat(descriptor.getOptions().getMessageSetWireFormat());
        AnonymousClass2 r4 = null;
        OneofState oneofState = new OneofState();
        Field field = null;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i < fields.size()) {
            final Descriptors.FieldDescriptor fieldDescriptor = fields.get(i);
            boolean javaStringCheckUtf8 = fieldDescriptor.getFile().getOptions().getJavaStringCheckUtf8();
            Internal.EnumVerifier r14 = fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM ? new Internal.EnumVerifier() {
                public boolean isInRange(int i) {
                    return fieldDescriptor.getEnumType().findValueByNumber(i) != null;
                }
            } : r4;
            if (fieldDescriptor.getContainingOneof() != null) {
                newBuilder.withField(buildOneofMember(cls2, fieldDescriptor, oneofState, javaStringCheckUtf8, r14));
            } else {
                Field field2 = field(cls2, fieldDescriptor);
                int number = fieldDescriptor.getNumber();
                FieldType fieldType = getFieldType(fieldDescriptor);
                if (fieldDescriptor.isMapField()) {
                    final Descriptors.FieldDescriptor findFieldByNumber = fieldDescriptor.getMessageType().findFieldByNumber(2);
                    if (findFieldByNumber.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                        r14 = new Internal.EnumVerifier() {
                            public boolean isInRange(int i) {
                                return findFieldByNumber.getEnumType().findValueByNumber(i) != null;
                            }
                        };
                    }
                    newBuilder.withField(FieldInfo.forMapField(field2, number, SchemaUtil.getMapDefaultEntry(cls2, fieldDescriptor.getName()), r14));
                } else if (!fieldDescriptor.isRepeated()) {
                    if (field == null) {
                        field = bitField(cls2, i2);
                    }
                    if (fieldDescriptor.isRequired()) {
                        newBuilder.withField(FieldInfo.forProto2RequiredField(field2, number, fieldType, field, i3, javaStringCheckUtf8, r14));
                    } else {
                        newBuilder.withField(FieldInfo.forProto2OptionalField(field2, number, fieldType, field, i3, javaStringCheckUtf8, r14));
                    }
                } else if (r14 != null) {
                    if (fieldDescriptor.isPacked()) {
                        newBuilder.withField(FieldInfo.forPackedFieldWithEnumVerifier(field2, number, fieldType, r14, cachedSizeField(cls2, fieldDescriptor)));
                    } else {
                        newBuilder.withField(FieldInfo.forFieldWithEnumVerifier(field2, number, fieldType, r14));
                    }
                } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    newBuilder.withField(FieldInfo.forRepeatedMessageField(field2, number, fieldType, getTypeForRepeatedMessageField(cls2, fieldDescriptor)));
                } else if (fieldDescriptor.isPacked()) {
                    newBuilder.withField(FieldInfo.forPackedField(field2, number, fieldType, cachedSizeField(cls2, fieldDescriptor)));
                } else {
                    newBuilder.withField(FieldInfo.forField(field2, number, fieldType, javaStringCheckUtf8));
                }
                i++;
                r4 = null;
            }
            i3 <<= 1;
            if (i3 == 0) {
                i2++;
                field = null;
                i3 = 1;
            }
            i++;
            r4 = null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < fields.size(); i4++) {
            Descriptors.FieldDescriptor fieldDescriptor2 = fields.get(i4);
            if (fieldDescriptor2.isRequired() || (fieldDescriptor2.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && needsIsInitializedCheck(fieldDescriptor2.getMessageType()))) {
                arrayList.add(Integer.valueOf(fieldDescriptor2.getNumber()));
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        newBuilder.withCheckInitialized(iArr);
        return newBuilder.build();
    }

    private static StructuralMessageInfo convertProto3(Class<?> cls, Descriptors.Descriptor descriptor) {
        List<Descriptors.FieldDescriptor> fields = descriptor.getFields();
        StructuralMessageInfo.Builder newBuilder = StructuralMessageInfo.newBuilder(fields.size());
        newBuilder.withDefaultInstance(getDefaultInstance(cls));
        newBuilder.withSyntax(ProtoSyntax.PROTO3);
        OneofState oneofState = new OneofState();
        for (int i = 0; i < fields.size(); i++) {
            Descriptors.FieldDescriptor fieldDescriptor = fields.get(i);
            if (fieldDescriptor.getContainingOneof() != null) {
                newBuilder.withField(buildOneofMember(cls, fieldDescriptor, oneofState, true, (Internal.EnumVerifier) null));
            } else if (fieldDescriptor.isMapField()) {
                newBuilder.withField(FieldInfo.forMapField(field(cls, fieldDescriptor), fieldDescriptor.getNumber(), SchemaUtil.getMapDefaultEntry(cls, fieldDescriptor.getName()), (Internal.EnumVerifier) null));
            } else if (fieldDescriptor.isRepeated() && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                newBuilder.withField(FieldInfo.forRepeatedMessageField(field(cls, fieldDescriptor), fieldDescriptor.getNumber(), getFieldType(fieldDescriptor), getTypeForRepeatedMessageField(cls, fieldDescriptor)));
            } else if (fieldDescriptor.isPacked()) {
                newBuilder.withField(FieldInfo.forPackedField(field(cls, fieldDescriptor), fieldDescriptor.getNumber(), getFieldType(fieldDescriptor), cachedSizeField(cls, fieldDescriptor)));
            } else {
                newBuilder.withField(FieldInfo.forField(field(cls, fieldDescriptor), fieldDescriptor.getNumber(), getFieldType(fieldDescriptor), true));
            }
        }
        return newBuilder.build();
    }

    private static FieldInfo buildOneofMember(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor, OneofState oneofState, boolean z, Internal.EnumVerifier enumVerifier) {
        OneofInfo oneof = oneofState.getOneof(cls, fieldDescriptor.getContainingOneof());
        FieldType fieldType = getFieldType(fieldDescriptor);
        return FieldInfo.forOneofMemberField(fieldDescriptor.getNumber(), fieldType, oneof, getOneofStoredType(cls, fieldDescriptor, fieldType), z, enumVerifier);
    }

    private static Class<?> getOneofStoredType(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor, FieldType fieldType) {
        switch (AnonymousClass3.$SwitchMap$com$google$protobuf$JavaType[fieldType.getJavaType().ordinal()]) {
            case 1:
                return Boolean.class;
            case 2:
                return ByteString.class;
            case 3:
                return Double.class;
            case 4:
                return Float.class;
            case 5:
            case 6:
                return Integer.class;
            case 7:
                return Long.class;
            case 8:
                return String.class;
            case 9:
                return getOneofStoredTypeForMessage(cls, fieldDescriptor);
            default:
                throw new IllegalArgumentException("Invalid type for oneof: " + fieldType);
        }
    }

    /* renamed from: com.explorestack.protobuf.DescriptorMessageInfoFactory$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FileDescriptor$Syntax;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(2:71|72)|73|75|76|(3:77|78|80)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(2:71|72)|73|75|76|(3:77|78|80)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|75|76|(3:77|78|80)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|75|76|(3:77|78|80)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|75|76|(3:77|78|80)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|75|76|(3:77|78|80)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(70:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|75|76|77|78|80) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x014a */
        static {
            /*
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type[] r0 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = r0
                r1 = 1
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r2 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r3 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r4 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x003e }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r6 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r7 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r8 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r9 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.GROUP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x006c }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r10 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.INT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r10 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.INT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r10 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r10 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x009c }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r10 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SFIXED64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r10 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SINT32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r10 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SINT64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r10 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r10 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.UINT32     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r10 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.UINT64     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.explorestack.protobuf.JavaType[] r9 = com.explorestack.protobuf.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                $SwitchMap$com$google$protobuf$JavaType = r9
                com.explorestack.protobuf.JavaType r10 = com.explorestack.protobuf.JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r9 = $SwitchMap$com$google$protobuf$JavaType     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.explorestack.protobuf.JavaType r10 = com.explorestack.protobuf.JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r9[r10] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r9 = $SwitchMap$com$google$protobuf$JavaType     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.explorestack.protobuf.JavaType r10 = com.explorestack.protobuf.JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r9[r10] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r2 = $SwitchMap$com$google$protobuf$JavaType     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.explorestack.protobuf.JavaType r9 = com.explorestack.protobuf.JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r2[r9] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r2 = $SwitchMap$com$google$protobuf$JavaType     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.explorestack.protobuf.JavaType r3 = com.explorestack.protobuf.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r2 = $SwitchMap$com$google$protobuf$JavaType     // Catch:{ NoSuchFieldError -> 0x011b }
                com.explorestack.protobuf.JavaType r3 = com.explorestack.protobuf.JavaType.INT     // Catch:{ NoSuchFieldError -> 0x011b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r2[r3] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r2 = $SwitchMap$com$google$protobuf$JavaType     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.explorestack.protobuf.JavaType r3 = com.explorestack.protobuf.JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r2[r3] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r2 = $SwitchMap$com$google$protobuf$JavaType     // Catch:{ NoSuchFieldError -> 0x012f }
                com.explorestack.protobuf.JavaType r3 = com.explorestack.protobuf.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x012f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r2[r3] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r2 = $SwitchMap$com$google$protobuf$JavaType     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.explorestack.protobuf.JavaType r3 = com.explorestack.protobuf.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r2[r3] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                com.explorestack.protobuf.Descriptors$FileDescriptor$Syntax[] r2 = com.explorestack.protobuf.Descriptors.FileDescriptor.Syntax.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$google$protobuf$Descriptors$FileDescriptor$Syntax = r2
                com.explorestack.protobuf.Descriptors$FileDescriptor$Syntax r3 = com.explorestack.protobuf.Descriptors.FileDescriptor.Syntax.PROTO2     // Catch:{ NoSuchFieldError -> 0x014a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x014a }
            L_0x014a:
                int[] r1 = $SwitchMap$com$google$protobuf$Descriptors$FileDescriptor$Syntax     // Catch:{ NoSuchFieldError -> 0x0154 }
                com.explorestack.protobuf.Descriptors$FileDescriptor$Syntax r2 = com.explorestack.protobuf.Descriptors.FileDescriptor.Syntax.PROTO3     // Catch:{ NoSuchFieldError -> 0x0154 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0154 }
            L_0x0154:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorMessageInfoFactory.AnonymousClass3.<clinit>():void");
        }
    }

    private static FieldType getFieldType(Descriptors.FieldDescriptor fieldDescriptor) {
        switch (AnonymousClass3.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
            case 1:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.BOOL;
                }
                return fieldDescriptor.isPacked() ? FieldType.BOOL_LIST_PACKED : FieldType.BOOL_LIST;
            case 2:
                return fieldDescriptor.isRepeated() ? FieldType.BYTES_LIST : FieldType.BYTES;
            case 3:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.DOUBLE;
                }
                return fieldDescriptor.isPacked() ? FieldType.DOUBLE_LIST_PACKED : FieldType.DOUBLE_LIST;
            case 4:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.ENUM;
                }
                return fieldDescriptor.isPacked() ? FieldType.ENUM_LIST_PACKED : FieldType.ENUM_LIST;
            case 5:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.FIXED32;
                }
                return fieldDescriptor.isPacked() ? FieldType.FIXED32_LIST_PACKED : FieldType.FIXED32_LIST;
            case 6:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.FIXED64;
                }
                return fieldDescriptor.isPacked() ? FieldType.FIXED64_LIST_PACKED : FieldType.FIXED64_LIST;
            case 7:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.FLOAT;
                }
                return fieldDescriptor.isPacked() ? FieldType.FLOAT_LIST_PACKED : FieldType.FLOAT_LIST;
            case 8:
                return fieldDescriptor.isRepeated() ? FieldType.GROUP_LIST : FieldType.GROUP;
            case 9:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.INT32;
                }
                return fieldDescriptor.isPacked() ? FieldType.INT32_LIST_PACKED : FieldType.INT32_LIST;
            case 10:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.INT64;
                }
                return fieldDescriptor.isPacked() ? FieldType.INT64_LIST_PACKED : FieldType.INT64_LIST;
            case 11:
                if (fieldDescriptor.isMapField()) {
                    return FieldType.MAP;
                }
                return fieldDescriptor.isRepeated() ? FieldType.MESSAGE_LIST : FieldType.MESSAGE;
            case 12:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.SFIXED32;
                }
                return fieldDescriptor.isPacked() ? FieldType.SFIXED32_LIST_PACKED : FieldType.SFIXED32_LIST;
            case 13:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.SFIXED64;
                }
                return fieldDescriptor.isPacked() ? FieldType.SFIXED64_LIST_PACKED : FieldType.SFIXED64_LIST;
            case 14:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.SINT32;
                }
                return fieldDescriptor.isPacked() ? FieldType.SINT32_LIST_PACKED : FieldType.SINT32_LIST;
            case 15:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.SINT64;
                }
                return fieldDescriptor.isPacked() ? FieldType.SINT64_LIST_PACKED : FieldType.SINT64_LIST;
            case 16:
                return fieldDescriptor.isRepeated() ? FieldType.STRING_LIST : FieldType.STRING;
            case 17:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.UINT32;
                }
                return fieldDescriptor.isPacked() ? FieldType.UINT32_LIST_PACKED : FieldType.UINT32_LIST;
            case 18:
                if (!fieldDescriptor.isRepeated()) {
                    return FieldType.UINT64;
                }
                return fieldDescriptor.isPacked() ? FieldType.UINT64_LIST_PACKED : FieldType.UINT64_LIST;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + fieldDescriptor.getType());
        }
    }

    private static Field bitField(Class<?> cls, int i) {
        return field(cls, "bitField" + i + "_");
    }

    private static Field field(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        return field(cls, getFieldName(fieldDescriptor));
    }

    private static Field cachedSizeField(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        return field(cls, getCachedSizeFieldName(fieldDescriptor));
    }

    /* access modifiers changed from: private */
    public static Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unable to find field " + str + " in message class " + cls.getName());
        }
    }

    static String getFieldName(Descriptors.FieldDescriptor fieldDescriptor) {
        String str;
        if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP) {
            str = fieldDescriptor.getMessageType().getName();
        } else {
            str = fieldDescriptor.getName();
        }
        String str2 = specialFieldNames.contains(str) ? "__" : "_";
        return snakeCaseToCamelCase(str) + str2;
    }

    private static String getCachedSizeFieldName(Descriptors.FieldDescriptor fieldDescriptor) {
        return snakeCaseToCamelCase(fieldDescriptor.getName()) + "MemoizedSerializedSize";
    }

    /* access modifiers changed from: private */
    public static String snakeCaseToCamelCase(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '_') {
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                } else {
                    if (z) {
                        sb.append(Character.toUpperCase(charAt));
                        z = false;
                    } else if (i == 0) {
                        sb.append(Character.toLowerCase(charAt));
                    } else {
                        sb.append(charAt);
                    }
                }
            }
            z = true;
        }
        return sb.toString();
    }

    private static Class<?> getOneofStoredTypeForMessage(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        try {
            return cls.getDeclaredMethod(getterForField(fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName()), new Class[0]).getReturnType();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Class<?> getTypeForRepeatedMessageField(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        try {
            return cls.getDeclaredMethod(getterForField(fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName()), new Class[]{Integer.TYPE}).getReturnType();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static String getterForField(String str) {
        String snakeCaseToCamelCase = snakeCaseToCamelCase(str);
        return Constants.GET + Character.toUpperCase(snakeCaseToCamelCase.charAt(0)) + snakeCaseToCamelCase.substring(1, snakeCaseToCamelCase.length());
    }

    private static final class OneofState {
        private OneofInfo[] oneofs;

        private OneofState() {
            this.oneofs = new OneofInfo[2];
        }

        /* access modifiers changed from: package-private */
        public OneofInfo getOneof(Class<?> cls, Descriptors.OneofDescriptor oneofDescriptor) {
            int index = oneofDescriptor.getIndex();
            OneofInfo[] oneofInfoArr = this.oneofs;
            if (index >= oneofInfoArr.length) {
                this.oneofs = (OneofInfo[]) Arrays.copyOf(oneofInfoArr, index * 2);
            }
            OneofInfo oneofInfo = this.oneofs[index];
            if (oneofInfo != null) {
                return oneofInfo;
            }
            OneofInfo newInfo = newInfo(cls, oneofDescriptor);
            this.oneofs[index] = newInfo;
            return newInfo;
        }

        private static OneofInfo newInfo(Class<?> cls, Descriptors.OneofDescriptor oneofDescriptor) {
            String access$200 = DescriptorMessageInfoFactory.snakeCaseToCamelCase(oneofDescriptor.getName());
            return new OneofInfo(oneofDescriptor.getIndex(), DescriptorMessageInfoFactory.field(cls, access$200 + "Case_"), DescriptorMessageInfoFactory.field(cls, access$200 + "_"));
        }
    }
}
