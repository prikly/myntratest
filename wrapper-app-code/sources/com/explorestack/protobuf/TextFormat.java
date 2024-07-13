package com.explorestack.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import com.appnext.base.a.c.d;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.DynamicMessage;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageReflection;
import com.explorestack.protobuf.TextFormatParseInfoTree;
import com.explorestack.protobuf.UnknownFieldSet;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.lang.Character;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextFormat {
    private static final Parser PARSER = Parser.newBuilder().build();
    /* access modifiers changed from: private */
    public static final Logger logger = Logger.getLogger(TextFormat.class.getName());

    private static int digitValue(byte b2) {
        if (48 <= b2 && b2 <= 57) {
            return b2 - 48;
        }
        return ((97 > b2 || b2 > 122) ? b2 - 65 : b2 - 97) + 10;
    }

    private static boolean isHex(byte b2) {
        return (48 <= b2 && b2 <= 57) || (97 <= b2 && b2 <= 102) || (65 <= b2 && b2 <= 70);
    }

    private static boolean isOctal(byte b2) {
        return 48 <= b2 && b2 <= 55;
    }

    private TextFormat() {
    }

    @Deprecated
    public static void print(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
        printer().print(messageOrBuilder, appendable);
    }

    @Deprecated
    public static void print(UnknownFieldSet unknownFieldSet, Appendable appendable) throws IOException {
        printer().print(unknownFieldSet, appendable);
    }

    @Deprecated
    public static void printUnicode(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).print(messageOrBuilder, appendable);
    }

    @Deprecated
    public static void printUnicode(UnknownFieldSet unknownFieldSet, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).print(unknownFieldSet, appendable);
    }

    public static String shortDebugString(MessageOrBuilder messageOrBuilder) {
        return printer().shortDebugString(messageOrBuilder);
    }

    @Deprecated
    public static String shortDebugString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return printer().shortDebugString(fieldDescriptor, obj);
    }

    @Deprecated
    public static String shortDebugString(UnknownFieldSet unknownFieldSet) {
        return printer().shortDebugString(unknownFieldSet);
    }

    @Deprecated
    public static String printToString(MessageOrBuilder messageOrBuilder) {
        return printer().printToString(messageOrBuilder);
    }

    @Deprecated
    public static String printToString(UnknownFieldSet unknownFieldSet) {
        return printer().printToString(unknownFieldSet);
    }

    @Deprecated
    public static String printToUnicodeString(MessageOrBuilder messageOrBuilder) {
        return printer().escapingNonAscii(false).printToString(messageOrBuilder);
    }

    @Deprecated
    public static String printToUnicodeString(UnknownFieldSet unknownFieldSet) {
        return printer().escapingNonAscii(false).printToString(unknownFieldSet);
    }

    @Deprecated
    public static void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        printer().printField(fieldDescriptor, obj, appendable);
    }

    @Deprecated
    public static String printFieldToString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return printer().printFieldToString(fieldDescriptor, obj);
    }

    @Deprecated
    public static void printUnicodeFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).printFieldValue(fieldDescriptor, obj, appendable);
    }

    @Deprecated
    public static void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        printer().printFieldValue(fieldDescriptor, obj, appendable);
    }

    public static void printUnknownFieldValue(int i, Object obj, Appendable appendable) throws IOException {
        printUnknownFieldValue(i, obj, multiLineOutput(appendable));
    }

    private static void printUnknownFieldValue(int i, Object obj, TextGenerator textGenerator) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            textGenerator.print(unsignedToString(((Long) obj).longValue()));
        } else if (tagWireType == 1) {
            textGenerator.print(String.format((Locale) null, "0x%016x", new Object[]{(Long) obj}));
        } else if (tagWireType == 2) {
            try {
                UnknownFieldSet parseFrom = UnknownFieldSet.parseFrom((ByteString) obj);
                textGenerator.print("{");
                textGenerator.eol();
                textGenerator.indent();
                Printer.printUnknownFields(parseFrom, textGenerator);
                textGenerator.outdent();
                textGenerator.print("}");
            } catch (InvalidProtocolBufferException unused) {
                textGenerator.print("\"");
                textGenerator.print(escapeBytes((ByteString) obj));
                textGenerator.print("\"");
            }
        } else if (tagWireType == 3) {
            Printer.printUnknownFields((UnknownFieldSet) obj, textGenerator);
        } else if (tagWireType == 5) {
            textGenerator.print(String.format((Locale) null, "0x%08x", new Object[]{(Integer) obj}));
        } else {
            throw new IllegalArgumentException("Bad tag: " + i);
        }
    }

    public static Printer printer() {
        return Printer.DEFAULT;
    }

    public static final class Printer {
        /* access modifiers changed from: private */
        public static final Printer DEFAULT = new Printer(true, TypeRegistry.getEmptyTypeRegistry());
        private final boolean escapeNonAscii;
        private final TypeRegistry typeRegistry;

        private Printer(boolean z, TypeRegistry typeRegistry2) {
            this.escapeNonAscii = z;
            this.typeRegistry = typeRegistry2;
        }

        public Printer escapingNonAscii(boolean z) {
            return new Printer(z, this.typeRegistry);
        }

        public Printer usingTypeRegistry(TypeRegistry typeRegistry2) {
            if (this.typeRegistry == TypeRegistry.getEmptyTypeRegistry()) {
                return new Printer(this.escapeNonAscii, typeRegistry2);
            }
            throw new IllegalArgumentException("Only one typeRegistry is allowed.");
        }

        public void print(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
            print(messageOrBuilder, TextFormat.multiLineOutput(appendable));
        }

        public void print(UnknownFieldSet unknownFieldSet, Appendable appendable) throws IOException {
            printUnknownFields(unknownFieldSet, TextFormat.multiLineOutput(appendable));
        }

        private void print(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            if (!messageOrBuilder.getDescriptorForType().getFullName().equals("explorestack.protobuf.Any") || !printAny(messageOrBuilder, textGenerator)) {
                printMessage(messageOrBuilder, textGenerator);
            }
        }

        private boolean printAny(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            Descriptors.Descriptor descriptorForType = messageOrBuilder.getDescriptorForType();
            Descriptors.FieldDescriptor findFieldByNumber = descriptorForType.findFieldByNumber(1);
            Descriptors.FieldDescriptor findFieldByNumber2 = descriptorForType.findFieldByNumber(2);
            if (findFieldByNumber != null && findFieldByNumber.getType() == Descriptors.FieldDescriptor.Type.STRING && findFieldByNumber2 != null && findFieldByNumber2.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
                String str = (String) messageOrBuilder.getField(findFieldByNumber);
                if (str.isEmpty()) {
                    return false;
                }
                Object field = messageOrBuilder.getField(findFieldByNumber2);
                try {
                    Descriptors.Descriptor descriptorForTypeUrl = this.typeRegistry.getDescriptorForTypeUrl(str);
                    if (descriptorForTypeUrl == null) {
                        return false;
                    }
                    DynamicMessage.Builder newBuilderForType = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                    newBuilderForType.mergeFrom((ByteString) field);
                    textGenerator.print("[");
                    textGenerator.print(str);
                    textGenerator.print("] {");
                    textGenerator.eol();
                    textGenerator.indent();
                    print((MessageOrBuilder) newBuilderForType, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print("}");
                    textGenerator.eol();
                    return true;
                } catch (InvalidProtocolBufferException unused) {
                }
            }
            return false;
        }

        public String printFieldToString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            try {
                StringBuilder sb = new StringBuilder();
                printField(fieldDescriptor, obj, (Appendable) sb);
                return sb.toString();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
            printField(fieldDescriptor, obj, TextFormat.multiLineOutput(appendable));
        }

        private void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (fieldDescriptor.isMapField()) {
                ArrayList<MapEntryAdapter> arrayList = new ArrayList<>();
                for (Object mapEntryAdapter : (List) obj) {
                    arrayList.add(new MapEntryAdapter(mapEntryAdapter, fieldDescriptor));
                }
                Collections.sort(arrayList);
                for (MapEntryAdapter entry : arrayList) {
                    printSingleField(fieldDescriptor, entry.getEntry(), textGenerator);
                }
            } else if (fieldDescriptor.isRepeated()) {
                for (Object printSingleField : (List) obj) {
                    printSingleField(fieldDescriptor, printSingleField, textGenerator);
                }
            } else {
                printSingleField(fieldDescriptor, obj, textGenerator);
            }
        }

        private static class MapEntryAdapter implements Comparable<MapEntryAdapter> {
            private Object entry;
            private final Descriptors.FieldDescriptor.JavaType fieldType;
            private MapEntry mapEntry;

            public MapEntryAdapter(Object obj, Descriptors.FieldDescriptor fieldDescriptor) {
                if (obj instanceof MapEntry) {
                    this.mapEntry = (MapEntry) obj;
                } else {
                    this.entry = obj;
                }
                this.fieldType = extractFieldType(fieldDescriptor);
            }

            private static Descriptors.FieldDescriptor.JavaType extractFieldType(Descriptors.FieldDescriptor fieldDescriptor) {
                return fieldDescriptor.getMessageType().getFields().get(0).getJavaType();
            }

            public Object getKey() {
                MapEntry mapEntry2 = this.mapEntry;
                if (mapEntry2 != null) {
                    return mapEntry2.getKey();
                }
                return null;
            }

            public Object getEntry() {
                MapEntry mapEntry2 = this.mapEntry;
                if (mapEntry2 != null) {
                    return mapEntry2;
                }
                return this.entry;
            }

            public int compareTo(MapEntryAdapter mapEntryAdapter) {
                if (getKey() == null || mapEntryAdapter.getKey() == null) {
                    TextFormat.logger.info("Invalid key for map field.");
                    return -1;
                }
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[this.fieldType.ordinal()];
                if (i == 1) {
                    return Boolean.compare(((Boolean) getKey()).booleanValue(), ((Boolean) mapEntryAdapter.getKey()).booleanValue());
                }
                if (i == 2) {
                    return Long.compare(((Long) getKey()).longValue(), ((Long) mapEntryAdapter.getKey()).longValue());
                }
                if (i == 3) {
                    return Integer.compare(((Integer) getKey()).intValue(), ((Integer) mapEntryAdapter.getKey()).intValue());
                }
                if (i != 4) {
                    return 0;
                }
                String str = (String) getKey();
                String str2 = (String) mapEntryAdapter.getKey();
                if (str == null && str2 == null) {
                    return 0;
                }
                if (str == null && str2 != null) {
                    return -1;
                }
                if (str == null || str2 != null) {
                    return str.compareTo(str2);
                }
                return 1;
            }
        }

        public void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
            printFieldValue(fieldDescriptor, obj, TextFormat.multiLineOutput(appendable));
        }

        private void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            String str;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    textGenerator.print(((Integer) obj).toString());
                    return;
                case 4:
                case 5:
                case 6:
                    textGenerator.print(((Long) obj).toString());
                    return;
                case 7:
                    textGenerator.print(((Boolean) obj).toString());
                    return;
                case 8:
                    textGenerator.print(((Float) obj).toString());
                    return;
                case 9:
                    textGenerator.print(((Double) obj).toString());
                    return;
                case 10:
                case 11:
                    textGenerator.print(TextFormat.unsignedToString(((Integer) obj).intValue()));
                    return;
                case 12:
                case 13:
                    textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
                    return;
                case 14:
                    textGenerator.print("\"");
                    if (this.escapeNonAscii) {
                        str = TextFormatEscaper.escapeText((String) obj);
                    } else {
                        str = TextFormat.escapeDoubleQuotesAndBackslashes((String) obj).replace("\n", "\\n");
                    }
                    textGenerator.print(str);
                    textGenerator.print("\"");
                    return;
                case 15:
                    textGenerator.print("\"");
                    if (obj instanceof ByteString) {
                        textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                    } else {
                        textGenerator.print(TextFormat.escapeBytes((byte[]) obj));
                    }
                    textGenerator.print("\"");
                    return;
                case 16:
                    textGenerator.print(((Descriptors.EnumValueDescriptor) obj).getName());
                    return;
                case 17:
                case 18:
                    print((MessageOrBuilder) (Message) obj, textGenerator);
                    return;
                default:
                    return;
            }
        }

        public String printToString(MessageOrBuilder messageOrBuilder) {
            try {
                StringBuilder sb = new StringBuilder();
                print(messageOrBuilder, (Appendable) sb);
                return sb.toString();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public String printToString(UnknownFieldSet unknownFieldSet) {
            try {
                StringBuilder sb = new StringBuilder();
                print(unknownFieldSet, (Appendable) sb);
                return sb.toString();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public String shortDebugString(MessageOrBuilder messageOrBuilder) {
            try {
                StringBuilder sb = new StringBuilder();
                print(messageOrBuilder, TextFormat.singleLineOutput(sb));
                return sb.toString();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public String shortDebugString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            try {
                StringBuilder sb = new StringBuilder();
                printField(fieldDescriptor, obj, TextFormat.singleLineOutput(sb));
                return sb.toString();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public String shortDebugString(UnknownFieldSet unknownFieldSet) {
            try {
                StringBuilder sb = new StringBuilder();
                printUnknownFields(unknownFieldSet, TextFormat.singleLineOutput(sb));
                return sb.toString();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        private static void printUnknownFieldValue(int i, Object obj, TextGenerator textGenerator) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
            } else if (tagWireType == 1) {
                textGenerator.print(String.format((Locale) null, "0x%016x", new Object[]{(Long) obj}));
            } else if (tagWireType == 2) {
                try {
                    UnknownFieldSet parseFrom = UnknownFieldSet.parseFrom((ByteString) obj);
                    textGenerator.print("{");
                    textGenerator.eol();
                    textGenerator.indent();
                    printUnknownFields(parseFrom, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print("}");
                } catch (InvalidProtocolBufferException unused) {
                    textGenerator.print("\"");
                    textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                    textGenerator.print("\"");
                }
            } else if (tagWireType == 3) {
                printUnknownFields((UnknownFieldSet) obj, textGenerator);
            } else if (tagWireType == 5) {
                textGenerator.print(String.format((Locale) null, "0x%08x", new Object[]{(Integer) obj}));
            } else {
                throw new IllegalArgumentException("Bad tag: " + i);
            }
        }

        private void printMessage(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            for (Map.Entry next : messageOrBuilder.getAllFields().entrySet()) {
                printField((Descriptors.FieldDescriptor) next.getKey(), next.getValue(), textGenerator);
            }
            printUnknownFields(messageOrBuilder.getUnknownFields(), textGenerator);
        }

        private void printSingleField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (fieldDescriptor.isExtension()) {
                textGenerator.print("[");
                if (!fieldDescriptor.getContainingType().getOptions().getMessageSetWireFormat() || fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.MESSAGE || !fieldDescriptor.isOptional() || fieldDescriptor.getExtensionScope() != fieldDescriptor.getMessageType()) {
                    textGenerator.print(fieldDescriptor.getFullName());
                } else {
                    textGenerator.print(fieldDescriptor.getMessageType().getFullName());
                }
                textGenerator.print("]");
            } else if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP) {
                textGenerator.print(fieldDescriptor.getMessageType().getName());
            } else {
                textGenerator.print(fieldDescriptor.getName());
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                textGenerator.print(" {");
                textGenerator.eol();
                textGenerator.indent();
            } else {
                textGenerator.print(": ");
            }
            printFieldValue(fieldDescriptor, obj, textGenerator);
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                textGenerator.outdent();
                textGenerator.print("}");
            }
            textGenerator.eol();
        }

        /* access modifiers changed from: private */
        public static void printUnknownFields(UnknownFieldSet unknownFieldSet, TextGenerator textGenerator) throws IOException {
            for (Map.Entry next : unknownFieldSet.asMap().entrySet()) {
                int intValue = ((Integer) next.getKey()).intValue();
                UnknownFieldSet.Field field = (UnknownFieldSet.Field) next.getValue();
                printUnknownField(intValue, 0, field.getVarintList(), textGenerator);
                printUnknownField(intValue, 5, field.getFixed32List(), textGenerator);
                printUnknownField(intValue, 1, field.getFixed64List(), textGenerator);
                printUnknownField(intValue, 2, field.getLengthDelimitedList(), textGenerator);
                for (UnknownFieldSet printUnknownFields : field.getGroupList()) {
                    textGenerator.print(((Integer) next.getKey()).toString());
                    textGenerator.print(" {");
                    textGenerator.eol();
                    textGenerator.indent();
                    printUnknownFields(printUnknownFields, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print("}");
                    textGenerator.eol();
                }
            }
        }

        private static void printUnknownField(int i, int i2, List<?> list, TextGenerator textGenerator) throws IOException {
            for (Object next : list) {
                textGenerator.print(String.valueOf(i));
                textGenerator.print(": ");
                printUnknownFieldValue(i2, next, textGenerator);
                textGenerator.eol();
            }
        }
    }

    /* renamed from: com.explorestack.protobuf.TextFormat$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|(3:51|52|54)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fd */
        static {
            /*
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type[] r0 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = r0
                r1 = 1
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r2 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.INT32     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r3 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SINT32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r4 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.INT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x003e }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SINT64     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.BOOL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x006c }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.DOUBLE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r6 = 9
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.UINT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6 = 10
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.FIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r6 = 11
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.UINT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r6 = 12
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x009c }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.FIXED64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r6 = 13
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.STRING     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r6 = 14
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r6 = 15
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.ENUM     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r6 = 16
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r6 = 17
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r4 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.GROUP     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r6 = 18
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType[] r4 = com.explorestack.protobuf.Descriptors.FieldDescriptor.JavaType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType = r4
                com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType r4 = com.explorestack.protobuf.Descriptors.FieldDescriptor.JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.TextFormat.AnonymousClass1.<clinit>():void");
        }
    }

    public static String unsignedToString(int i) {
        if (i >= 0) {
            return Integer.toString(i);
        }
        return Long.toString(((long) i) & 4294967295L);
    }

    public static String unsignedToString(long j) {
        if (j >= 0) {
            return Long.toString(j);
        }
        return BigInteger.valueOf(j & Long.MAX_VALUE).setBit(63).toString();
    }

    /* access modifiers changed from: private */
    public static TextGenerator multiLineOutput(Appendable appendable) {
        return new TextGenerator(appendable, false, (AnonymousClass1) null);
    }

    /* access modifiers changed from: private */
    public static TextGenerator singleLineOutput(Appendable appendable) {
        return new TextGenerator(appendable, true, (AnonymousClass1) null);
    }

    private static final class TextGenerator {
        private boolean atStartOfLine;
        private final StringBuilder indent;
        private final Appendable output;
        private final boolean singleLineMode;

        /* synthetic */ TextGenerator(Appendable appendable, boolean z, AnonymousClass1 r3) {
            this(appendable, z);
        }

        private TextGenerator(Appendable appendable, boolean z) {
            this.indent = new StringBuilder();
            this.atStartOfLine = false;
            this.output = appendable;
            this.singleLineMode = z;
        }

        public void indent() {
            this.indent.append("  ");
        }

        public void outdent() {
            int length = this.indent.length();
            if (length != 0) {
                this.indent.setLength(length - 2);
                return;
            }
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
        }

        public void print(CharSequence charSequence) throws IOException {
            if (this.atStartOfLine) {
                this.atStartOfLine = false;
                this.output.append(this.singleLineMode ? " " : this.indent);
            }
            this.output.append(charSequence);
        }

        public void eol() throws IOException {
            if (!this.singleLineMode) {
                this.output.append("\n");
            }
            this.atStartOfLine = true;
        }
    }

    private static final class Tokenizer {
        private static final Pattern DOUBLE_INFINITY = Pattern.compile("-?inf(inity)?", 2);
        private static final Pattern FLOAT_INFINITY = Pattern.compile("-?inf(inity)?f?", 2);
        private static final Pattern FLOAT_NAN = Pattern.compile("nanf?", 2);
        private static final Pattern TOKEN = Pattern.compile("[a-zA-Z_][0-9a-zA-Z_+-]*+|[.]?[0-9+-][0-9a-zA-Z_.+-]*+|\"([^\"\n\\\\]|\\\\.)*+(\"|\\\\?$)|'([^'\n\\\\]|\\\\.)*+('|\\\\?$)", 8);
        private static final Pattern WHITESPACE = Pattern.compile("(\\s|(#.*$))++", 8);
        private int column;
        /* access modifiers changed from: private */
        public String currentToken;
        private int line;
        private final Matcher matcher;
        private int pos;
        private int previousColumn;
        private int previousLine;
        private final CharSequence text;

        /* synthetic */ Tokenizer(CharSequence charSequence, AnonymousClass1 r2) {
            this(charSequence);
        }

        private Tokenizer(CharSequence charSequence) {
            this.pos = 0;
            this.line = 0;
            this.column = 0;
            this.previousLine = 0;
            this.previousColumn = 0;
            this.text = charSequence;
            this.matcher = WHITESPACE.matcher(charSequence);
            skipWhitespace();
            nextToken();
        }

        /* access modifiers changed from: package-private */
        public int getPreviousLine() {
            return this.previousLine;
        }

        /* access modifiers changed from: package-private */
        public int getPreviousColumn() {
            return this.previousColumn;
        }

        /* access modifiers changed from: package-private */
        public int getLine() {
            return this.line;
        }

        /* access modifiers changed from: package-private */
        public int getColumn() {
            return this.column;
        }

        public boolean atEnd() {
            return this.currentToken.length() == 0;
        }

        public void nextToken() {
            this.previousLine = this.line;
            this.previousColumn = this.column;
            while (this.pos < this.matcher.regionStart()) {
                if (this.text.charAt(this.pos) == 10) {
                    this.line++;
                    this.column = 0;
                } else {
                    this.column++;
                }
                this.pos++;
            }
            if (this.matcher.regionStart() == this.matcher.regionEnd()) {
                this.currentToken = "";
                return;
            }
            this.matcher.usePattern(TOKEN);
            if (this.matcher.lookingAt()) {
                this.currentToken = this.matcher.group();
                Matcher matcher2 = this.matcher;
                matcher2.region(matcher2.end(), this.matcher.regionEnd());
            } else {
                this.currentToken = String.valueOf(this.text.charAt(this.pos));
                Matcher matcher3 = this.matcher;
                matcher3.region(this.pos + 1, matcher3.regionEnd());
            }
            skipWhitespace();
        }

        private void skipWhitespace() {
            this.matcher.usePattern(WHITESPACE);
            if (this.matcher.lookingAt()) {
                Matcher matcher2 = this.matcher;
                matcher2.region(matcher2.end(), this.matcher.regionEnd());
            }
        }

        public boolean tryConsume(String str) {
            if (!this.currentToken.equals(str)) {
                return false;
            }
            nextToken();
            return true;
        }

        public void consume(String str) throws ParseException {
            if (!tryConsume(str)) {
                throw parseException("Expected \"" + str + "\".");
            }
        }

        public boolean lookingAtInteger() {
            if (this.currentToken.length() == 0) {
                return false;
            }
            char charAt = this.currentToken.charAt(0);
            if (('0' <= charAt && charAt <= '9') || charAt == '-' || charAt == '+') {
                return true;
            }
            return false;
        }

        public boolean lookingAt(String str) {
            return this.currentToken.equals(str);
        }

        public String consumeIdentifier() throws ParseException {
            for (int i = 0; i < this.currentToken.length(); i++) {
                char charAt = this.currentToken.charAt(i);
                if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && !(('0' <= charAt && charAt <= '9') || charAt == '_' || charAt == '.'))) {
                    throw parseException("Expected identifier. Found '" + this.currentToken + "'");
                }
            }
            String str = this.currentToken;
            nextToken();
            return str;
        }

        public boolean tryConsumeIdentifier() {
            try {
                consumeIdentifier();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public int consumeInt32() throws ParseException {
            try {
                int parseInt32 = TextFormat.parseInt32(this.currentToken);
                nextToken();
                return parseInt32;
            } catch (NumberFormatException e2) {
                throw integerParseException(e2);
            }
        }

        public int consumeUInt32() throws ParseException {
            try {
                int parseUInt32 = TextFormat.parseUInt32(this.currentToken);
                nextToken();
                return parseUInt32;
            } catch (NumberFormatException e2) {
                throw integerParseException(e2);
            }
        }

        public long consumeInt64() throws ParseException {
            try {
                long parseInt64 = TextFormat.parseInt64(this.currentToken);
                nextToken();
                return parseInt64;
            } catch (NumberFormatException e2) {
                throw integerParseException(e2);
            }
        }

        public boolean tryConsumeInt64() {
            try {
                consumeInt64();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public long consumeUInt64() throws ParseException {
            try {
                long parseUInt64 = TextFormat.parseUInt64(this.currentToken);
                nextToken();
                return parseUInt64;
            } catch (NumberFormatException e2) {
                throw integerParseException(e2);
            }
        }

        public boolean tryConsumeUInt64() {
            try {
                consumeUInt64();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public double consumeDouble() throws ParseException {
            if (DOUBLE_INFINITY.matcher(this.currentToken).matches()) {
                boolean startsWith = this.currentToken.startsWith("-");
                nextToken();
                return startsWith ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            } else if (this.currentToken.equalsIgnoreCase("nan")) {
                nextToken();
                return Double.NaN;
            } else {
                try {
                    double parseDouble = Double.parseDouble(this.currentToken);
                    nextToken();
                    return parseDouble;
                } catch (NumberFormatException e2) {
                    throw floatParseException(e2);
                }
            }
        }

        public boolean tryConsumeDouble() {
            try {
                consumeDouble();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public float consumeFloat() throws ParseException {
            if (FLOAT_INFINITY.matcher(this.currentToken).matches()) {
                boolean startsWith = this.currentToken.startsWith("-");
                nextToken();
                return startsWith ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            } else if (FLOAT_NAN.matcher(this.currentToken).matches()) {
                nextToken();
                return Float.NaN;
            } else {
                try {
                    float parseFloat = Float.parseFloat(this.currentToken);
                    nextToken();
                    return parseFloat;
                } catch (NumberFormatException e2) {
                    throw floatParseException(e2);
                }
            }
        }

        public boolean tryConsumeFloat() {
            try {
                consumeFloat();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean consumeBoolean() throws ParseException {
            if (this.currentToken.equals("true") || this.currentToken.equals("True") || this.currentToken.equals(d.COLUMN_TYPE) || this.currentToken.equals("1")) {
                nextToken();
                return true;
            } else if (this.currentToken.equals("false") || this.currentToken.equals("False") || this.currentToken.equals("f") || this.currentToken.equals(BuildConfig.ADAPTER_VERSION)) {
                nextToken();
                return false;
            } else {
                throw parseException("Expected \"true\" or \"false\". Found \"" + this.currentToken + "\".");
            }
        }

        public String consumeString() throws ParseException {
            return consumeByteString().toStringUtf8();
        }

        public boolean tryConsumeString() {
            try {
                consumeString();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public ByteString consumeByteString() throws ParseException {
            ArrayList arrayList = new ArrayList();
            consumeByteString(arrayList);
            while (true) {
                if (!this.currentToken.startsWith("'") && !this.currentToken.startsWith("\"")) {
                    return ByteString.copyFrom((Iterable<ByteString>) arrayList);
                }
                consumeByteString(arrayList);
            }
        }

        private void consumeByteString(List<ByteString> list) throws ParseException {
            char c2 = 0;
            if (this.currentToken.length() > 0) {
                c2 = this.currentToken.charAt(0);
            }
            if (c2 == '\"' || c2 == '\'') {
                if (this.currentToken.length() >= 2) {
                    String str = this.currentToken;
                    if (str.charAt(str.length() - 1) == c2) {
                        try {
                            ByteString unescapeBytes = TextFormat.unescapeBytes(this.currentToken.substring(1, this.currentToken.length() - 1));
                            nextToken();
                            list.add(unescapeBytes);
                            return;
                        } catch (InvalidEscapeSequenceException e2) {
                            throw parseException(e2.getMessage());
                        }
                    }
                }
                throw parseException("String missing ending quote.");
            }
            throw parseException("Expected string.");
        }

        public ParseException parseException(String str) {
            return new ParseException(this.line + 1, this.column + 1, str);
        }

        public ParseException parseExceptionPreviousToken(String str) {
            return new ParseException(this.previousLine + 1, this.previousColumn + 1, str);
        }

        private ParseException integerParseException(NumberFormatException numberFormatException) {
            return parseException("Couldn't parse integer: " + numberFormatException.getMessage());
        }

        private ParseException floatParseException(NumberFormatException numberFormatException) {
            return parseException("Couldn't parse number: " + numberFormatException.getMessage());
        }

        public UnknownFieldParseException unknownFieldParseExceptionPreviousToken(String str, String str2) {
            return new UnknownFieldParseException(this.previousLine + 1, this.previousColumn + 1, str, str2);
        }
    }

    public static class ParseException extends IOException {
        private static final long serialVersionUID = 3196188060225107702L;
        private final int column;
        private final int line;

        public ParseException(String str) {
            this(-1, -1, str);
        }

        public ParseException(int i, int i2, String str) {
            super(Integer.toString(i) + ":" + i2 + ": " + str);
            this.line = i;
            this.column = i2;
        }

        public int getLine() {
            return this.line;
        }

        public int getColumn() {
            return this.column;
        }
    }

    public static class UnknownFieldParseException extends ParseException {
        private final String unknownField;

        public UnknownFieldParseException(String str) {
            this(-1, -1, "", str);
        }

        public UnknownFieldParseException(int i, int i2, String str, String str2) {
            super(i, i2, str2);
            this.unknownField = str;
        }

        public String getUnknownField() {
            return this.unknownField;
        }
    }

    public static Parser getParser() {
        return PARSER;
    }

    public static void merge(Readable readable, Message.Builder builder) throws IOException {
        PARSER.merge(readable, builder);
    }

    public static void merge(CharSequence charSequence, Message.Builder builder) throws ParseException {
        PARSER.merge(charSequence, builder);
    }

    public static <T extends Message> T parse(CharSequence charSequence, Class<T> cls) throws ParseException {
        Message.Builder newBuilderForType = ((Message) Internal.getDefaultInstance(cls)).newBuilderForType();
        merge(charSequence, newBuilderForType);
        return newBuilderForType.build();
    }

    public static void merge(Readable readable, ExtensionRegistry extensionRegistry, Message.Builder builder) throws IOException {
        PARSER.merge(readable, extensionRegistry, builder);
    }

    public static void merge(CharSequence charSequence, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
        PARSER.merge(charSequence, extensionRegistry, builder);
    }

    public static <T extends Message> T parse(CharSequence charSequence, ExtensionRegistry extensionRegistry, Class<T> cls) throws ParseException {
        Message.Builder newBuilderForType = ((Message) Internal.getDefaultInstance(cls)).newBuilderForType();
        merge(charSequence, extensionRegistry, newBuilderForType);
        return newBuilderForType.build();
    }

    public static class Parser {
        private static final int BUFFER_SIZE = 4096;
        private final boolean allowUnknownEnumValues;
        private final boolean allowUnknownExtensions;
        private final boolean allowUnknownFields;
        private TextFormatParseInfoTree.Builder parseInfoTreeBuilder;
        private final SingularOverwritePolicy singularOverwritePolicy;
        private final TypeRegistry typeRegistry;

        public enum SingularOverwritePolicy {
            ALLOW_SINGULAR_OVERWRITES,
            FORBID_SINGULAR_OVERWRITES
        }

        /* synthetic */ Parser(TypeRegistry typeRegistry2, boolean z, boolean z2, boolean z3, SingularOverwritePolicy singularOverwritePolicy2, TextFormatParseInfoTree.Builder builder, AnonymousClass1 r7) {
            this(typeRegistry2, z, z2, z3, singularOverwritePolicy2, builder);
        }

        private Parser(TypeRegistry typeRegistry2, boolean z, boolean z2, boolean z3, SingularOverwritePolicy singularOverwritePolicy2, TextFormatParseInfoTree.Builder builder) {
            this.typeRegistry = typeRegistry2;
            this.allowUnknownFields = z;
            this.allowUnknownEnumValues = z2;
            this.allowUnknownExtensions = z3;
            this.singularOverwritePolicy = singularOverwritePolicy2;
            this.parseInfoTreeBuilder = builder;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static class Builder {
            private boolean allowUnknownEnumValues = false;
            private boolean allowUnknownExtensions = false;
            private boolean allowUnknownFields = false;
            private TextFormatParseInfoTree.Builder parseInfoTreeBuilder = null;
            private SingularOverwritePolicy singularOverwritePolicy = SingularOverwritePolicy.ALLOW_SINGULAR_OVERWRITES;
            private TypeRegistry typeRegistry = TypeRegistry.getEmptyTypeRegistry();

            public Builder setTypeRegistry(TypeRegistry typeRegistry2) {
                this.typeRegistry = typeRegistry2;
                return this;
            }

            public Builder setAllowUnknownFields(boolean z) {
                this.allowUnknownFields = z;
                return this;
            }

            public Builder setAllowUnknownExtensions(boolean z) {
                this.allowUnknownExtensions = z;
                return this;
            }

            public Builder setSingularOverwritePolicy(SingularOverwritePolicy singularOverwritePolicy2) {
                this.singularOverwritePolicy = singularOverwritePolicy2;
                return this;
            }

            public Builder setParseInfoTreeBuilder(TextFormatParseInfoTree.Builder builder) {
                this.parseInfoTreeBuilder = builder;
                return this;
            }

            public Parser build() {
                return new Parser(this.typeRegistry, this.allowUnknownFields, this.allowUnknownEnumValues, this.allowUnknownExtensions, this.singularOverwritePolicy, this.parseInfoTreeBuilder, (AnonymousClass1) null);
            }
        }

        public void merge(Readable readable, Message.Builder builder) throws IOException {
            merge(readable, ExtensionRegistry.getEmptyRegistry(), builder);
        }

        public void merge(CharSequence charSequence, Message.Builder builder) throws ParseException {
            merge(charSequence, ExtensionRegistry.getEmptyRegistry(), builder);
        }

        public void merge(Readable readable, ExtensionRegistry extensionRegistry, Message.Builder builder) throws IOException {
            merge((CharSequence) toStringBuilder(readable), extensionRegistry, builder);
        }

        private static StringBuilder toStringBuilder(Readable readable) throws IOException {
            StringBuilder sb = new StringBuilder();
            CharBuffer allocate = CharBuffer.allocate(4096);
            while (true) {
                int read = readable.read(allocate);
                if (read == -1) {
                    return sb;
                }
                allocate.flip();
                sb.append(allocate, 0, read);
            }
        }

        static final class UnknownField {
            final String message;
            final Type type;

            enum Type {
                FIELD,
                EXTENSION
            }

            UnknownField(String str, Type type2) {
                this.message = str;
                this.type = type2;
            }
        }

        private void checkUnknownFields(List<UnknownField> list) throws ParseException {
            int i;
            boolean z;
            if (!list.isEmpty()) {
                StringBuilder sb = new StringBuilder("Input contains unknown fields and/or extensions:");
                for (UnknownField unknownField : list) {
                    sb.append(10);
                    sb.append(unknownField.message);
                }
                if (this.allowUnknownFields) {
                    TextFormat.logger.warning(sb.toString());
                    return;
                }
                if (this.allowUnknownExtensions) {
                    Iterator<UnknownField> it = list.iterator();
                    i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        } else if (it.next().type == UnknownField.Type.FIELD) {
                            z = false;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        TextFormat.logger.warning(sb.toString());
                        return;
                    }
                } else {
                    i = 0;
                }
                String[] split = list.get(i).message.split(":");
                throw new ParseException(Integer.parseInt(split[0]), Integer.parseInt(split[1]), sb.toString());
            }
        }

        public void merge(CharSequence charSequence, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
            Tokenizer tokenizer = new Tokenizer(charSequence, (AnonymousClass1) null);
            MessageReflection.BuilderAdapter builderAdapter = new MessageReflection.BuilderAdapter(builder);
            ArrayList arrayList = new ArrayList();
            while (!tokenizer.atEnd()) {
                mergeField(tokenizer, extensionRegistry, builderAdapter, arrayList);
            }
            checkUnknownFields(arrayList);
        }

        private void mergeField(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, List<UnknownField> list) throws ParseException {
            mergeField(tokenizer, extensionRegistry, mergeTarget, this.parseInfoTreeBuilder, list);
        }

        private void mergeField(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, TextFormatParseInfoTree.Builder builder, List<UnknownField> list) throws ParseException {
            Descriptors.FieldDescriptor fieldDescriptor;
            ExtensionRegistry.ExtensionInfo extensionInfo;
            Tokenizer tokenizer2 = tokenizer;
            TextFormatParseInfoTree.Builder builder2 = builder;
            List<UnknownField> list2 = list;
            int line = tokenizer.getLine();
            int column = tokenizer.getColumn();
            Descriptors.Descriptor descriptorForType = mergeTarget.getDescriptorForType();
            if (!"explorestack.protobuf.Any".equals(descriptorForType.getFullName()) || !tokenizer2.tryConsume("[")) {
                Descriptors.FieldDescriptor fieldDescriptor2 = null;
                if (tokenizer2.tryConsume("[")) {
                    StringBuilder sb = new StringBuilder(tokenizer.consumeIdentifier());
                    while (tokenizer2.tryConsume(".")) {
                        sb.append('.');
                        sb.append(tokenizer.consumeIdentifier());
                    }
                    ExtensionRegistry.ExtensionInfo findExtensionByName = mergeTarget.findExtensionByName(extensionRegistry, sb.toString());
                    if (findExtensionByName == null) {
                        list2.add(new UnknownField((tokenizer.getPreviousLine() + 1) + ":" + (tokenizer.getPreviousColumn() + 1) + ":\t" + descriptorForType.getFullName() + ".[" + sb + "]", UnknownField.Type.EXTENSION));
                    } else if (findExtensionByName.descriptor.getContainingType() == descriptorForType) {
                        fieldDescriptor2 = findExtensionByName.descriptor;
                    } else {
                        throw tokenizer2.parseExceptionPreviousToken("Extension \"" + sb + "\" does not extend message type \"" + descriptorForType.getFullName() + "\".");
                    }
                    tokenizer2.consume("]");
                    extensionInfo = findExtensionByName;
                    fieldDescriptor = fieldDescriptor2;
                } else {
                    ExtensionRegistry extensionRegistry2 = extensionRegistry;
                    MessageReflection.MergeTarget mergeTarget2 = mergeTarget;
                    String consumeIdentifier = tokenizer.consumeIdentifier();
                    fieldDescriptor = descriptorForType.findFieldByName(consumeIdentifier);
                    if (!(fieldDescriptor != null || (fieldDescriptor = descriptorForType.findFieldByName(consumeIdentifier.toLowerCase(Locale.US))) == null || fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP)) {
                        fieldDescriptor = null;
                    }
                    if (fieldDescriptor != null && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP && !fieldDescriptor.getMessageType().getName().equals(consumeIdentifier)) {
                        fieldDescriptor = null;
                    }
                    if (fieldDescriptor == null) {
                        list2.add(new UnknownField((tokenizer.getPreviousLine() + 1) + ":" + (tokenizer.getPreviousColumn() + 1) + ":\t" + descriptorForType.getFullName() + "." + consumeIdentifier, UnknownField.Type.FIELD));
                    }
                    extensionInfo = null;
                }
                if (fieldDescriptor != null) {
                    if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        tokenizer2.tryConsume(":");
                        if (builder2 != null) {
                            consumeFieldValues(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder2.getBuilderForSubMessageField(fieldDescriptor), list);
                        } else {
                            consumeFieldValues(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder, list);
                        }
                    } else {
                        tokenizer2.consume(":");
                        consumeFieldValues(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder, list);
                    }
                    if (builder2 != null) {
                        builder2.setLocation(fieldDescriptor, TextFormatParseLocation.create(line, column));
                    }
                    if (!tokenizer2.tryConsume(";")) {
                        tokenizer2.tryConsume(",");
                    }
                } else if (!tokenizer2.tryConsume(":") || tokenizer2.lookingAt("{") || tokenizer2.lookingAt("<")) {
                    skipFieldMessage(tokenizer);
                } else {
                    skipFieldValue(tokenizer);
                }
            } else {
                mergeAnyFieldValue(tokenizer, extensionRegistry, mergeTarget, builder, list, descriptorForType);
            }
        }

        private void consumeFieldValues(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, Descriptors.FieldDescriptor fieldDescriptor, ExtensionRegistry.ExtensionInfo extensionInfo, TextFormatParseInfoTree.Builder builder, List<UnknownField> list) throws ParseException {
            if (!fieldDescriptor.isRepeated() || !tokenizer.tryConsume("[")) {
                consumeFieldValue(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder, list);
            } else if (!tokenizer.tryConsume("]")) {
                while (true) {
                    consumeFieldValue(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder, list);
                    if (!tokenizer.tryConsume("]")) {
                        tokenizer.consume(",");
                    } else {
                        return;
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
        /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Long] */
        /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Boolean] */
        /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Float] */
        /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Double] */
        /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.Long] */
        /* JADX WARNING: type inference failed for: r3v9, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r3v10, types: [com.explorestack.protobuf.ByteString] */
        /* JADX WARNING: type inference failed for: r3v11, types: [com.explorestack.protobuf.Descriptors$EnumValueDescriptor] */
        /* JADX WARNING: type inference failed for: r3v13, types: [com.explorestack.protobuf.Descriptors$EnumValueDescriptor] */
        /* JADX WARNING: type inference failed for: r0v28 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void consumeFieldValue(com.explorestack.protobuf.TextFormat.Tokenizer r14, com.explorestack.protobuf.ExtensionRegistry r15, com.explorestack.protobuf.MessageReflection.MergeTarget r16, com.explorestack.protobuf.Descriptors.FieldDescriptor r17, com.explorestack.protobuf.ExtensionRegistry.ExtensionInfo r18, com.explorestack.protobuf.TextFormatParseInfoTree.Builder r19, java.util.List<com.explorestack.protobuf.TextFormat.Parser.UnknownField> r20) throws com.explorestack.protobuf.TextFormat.ParseException {
            /*
                r13 = this;
                r7 = r13
                r8 = r14
                r9 = r16
                r10 = r17
                r0 = r18
                com.explorestack.protobuf.TextFormat$Parser$SingularOverwritePolicy r1 = r7.singularOverwritePolicy
                com.explorestack.protobuf.TextFormat$Parser$SingularOverwritePolicy r2 = com.explorestack.protobuf.TextFormat.Parser.SingularOverwritePolicy.FORBID_SINGULAR_OVERWRITES
                java.lang.String r6 = "\"."
                if (r1 != r2) goto L_0x0089
                boolean r1 = r17.isRepeated()
                if (r1 != 0) goto L_0x0089
                boolean r1 = r16.hasField(r17)
                if (r1 != 0) goto L_0x006a
                com.explorestack.protobuf.Descriptors$OneofDescriptor r1 = r17.getContainingOneof()
                if (r1 == 0) goto L_0x0089
                com.explorestack.protobuf.Descriptors$OneofDescriptor r1 = r17.getContainingOneof()
                boolean r1 = r9.hasOneof(r1)
                if (r1 != 0) goto L_0x002d
                goto L_0x0089
            L_0x002d:
                com.explorestack.protobuf.Descriptors$OneofDescriptor r0 = r17.getContainingOneof()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Field \""
                r1.append(r2)
                java.lang.String r2 = r17.getFullName()
                r1.append(r2)
                java.lang.String r2 = "\" is specified along with field \""
                r1.append(r2)
                com.explorestack.protobuf.Descriptors$FieldDescriptor r2 = r9.getOneofFieldDescriptor(r0)
                java.lang.String r2 = r2.getFullName()
                r1.append(r2)
                java.lang.String r2 = "\", another member of oneof \""
                r1.append(r2)
                java.lang.String r0 = r0.getName()
                r1.append(r0)
                r1.append(r6)
                java.lang.String r0 = r1.toString()
                com.explorestack.protobuf.TextFormat$ParseException r0 = r14.parseExceptionPreviousToken(r0)
                throw r0
            L_0x006a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Non-repeated field \""
                r0.append(r1)
                java.lang.String r1 = r17.getFullName()
                r0.append(r1)
                java.lang.String r1 = "\" cannot be overwritten."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.explorestack.protobuf.TextFormat$ParseException r0 = r14.parseExceptionPreviousToken(r0)
                throw r0
            L_0x0089:
                com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType r1 = r17.getJavaType()
                com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType r2 = com.explorestack.protobuf.Descriptors.FieldDescriptor.JavaType.MESSAGE
                r3 = 0
                if (r1 != r2) goto L_0x0121
                java.lang.String r1 = "<"
                boolean r1 = r14.tryConsume(r1)
                if (r1 == 0) goto L_0x009d
                java.lang.String r1 = ">"
                goto L_0x00a4
            L_0x009d:
                java.lang.String r1 = "{"
                r14.consume(r1)
                java.lang.String r1 = "}"
            L_0x00a4:
                r11 = r1
                com.explorestack.protobuf.Descriptors$Descriptor r1 = r17.getMessageType()
                java.lang.String r1 = r1.getFullName()
                java.lang.String r2 = "explorestack.protobuf.Any"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x00e2
                java.lang.String r1 = "["
                boolean r1 = r14.tryConsume(r1)
                if (r1 == 0) goto L_0x00e2
                com.explorestack.protobuf.Descriptors$Descriptor r0 = r17.getMessageType()
                com.explorestack.protobuf.DynamicMessage r0 = com.explorestack.protobuf.DynamicMessage.getDefaultInstance(r0)
                com.explorestack.protobuf.MessageReflection$MergeTarget r12 = r9.newMergeTargetForField(r10, r0)
                com.explorestack.protobuf.Descriptors$Descriptor r6 = r17.getMessageType()
                r0 = r13
                r1 = r14
                r2 = r15
                r3 = r12
                r4 = r19
                r5 = r20
                r0.mergeAnyFieldValue(r1, r2, r3, r4, r5, r6)
                java.lang.Object r0 = r12.finish()
                r14.consume(r11)
            L_0x00df:
                r3 = r0
                goto L_0x021e
            L_0x00e2:
                if (r0 != 0) goto L_0x00e5
                goto L_0x00e7
            L_0x00e5:
                com.explorestack.protobuf.Message r3 = r0.defaultInstance
            L_0x00e7:
                com.explorestack.protobuf.MessageReflection$MergeTarget r12 = r9.newMergeTargetForField(r10, r3)
            L_0x00eb:
                boolean r0 = r14.tryConsume(r11)
                if (r0 != 0) goto L_0x011c
                boolean r0 = r14.atEnd()
                if (r0 != 0) goto L_0x0103
                r0 = r13
                r1 = r14
                r2 = r15
                r3 = r12
                r4 = r19
                r5 = r20
                r0.mergeField(r1, r2, r3, r4, r5)
                goto L_0x00eb
            L_0x0103:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Expected \""
                r0.append(r1)
                r0.append(r11)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.explorestack.protobuf.TextFormat$ParseException r0 = r14.parseException(r0)
                throw r0
            L_0x011c:
                java.lang.Object r0 = r12.finish()
                goto L_0x00df
            L_0x0121:
                int[] r0 = com.explorestack.protobuf.TextFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = r17.getType()
                int r1 = r1.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L_0x0216;
                    case 2: goto L_0x0216;
                    case 3: goto L_0x0216;
                    case 4: goto L_0x020d;
                    case 5: goto L_0x020d;
                    case 6: goto L_0x020d;
                    case 7: goto L_0x0204;
                    case 8: goto L_0x01fb;
                    case 9: goto L_0x01f2;
                    case 10: goto L_0x01e9;
                    case 11: goto L_0x01e9;
                    case 12: goto L_0x01e0;
                    case 13: goto L_0x01e0;
                    case 14: goto L_0x01db;
                    case 15: goto L_0x01d6;
                    case 16: goto L_0x013a;
                    case 17: goto L_0x0132;
                    case 18: goto L_0x0132;
                    default: goto L_0x0130;
                }
            L_0x0130:
                goto L_0x021e
            L_0x0132:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Can't get here."
                r0.<init>(r1)
                throw r0
            L_0x013a:
                com.explorestack.protobuf.Descriptors$EnumDescriptor r0 = r17.getEnumType()
                boolean r1 = r14.lookingAtInteger()
                java.lang.String r2 = "Enum type \""
                if (r1 == 0) goto L_0x019d
                int r1 = r14.consumeInt32()
                com.explorestack.protobuf.Descriptors$EnumValueDescriptor r3 = r0.findValueByNumber((int) r1)
                if (r3 != 0) goto L_0x021e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r4 = r0.getFullName()
                r3.append(r4)
                java.lang.String r4 = "\" has no value with number "
                r3.append(r4)
                r3.append(r1)
                r5 = 46
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                boolean r6 = r7.allowUnknownEnumValues
                if (r6 == 0) goto L_0x017c
                java.util.logging.Logger r0 = com.explorestack.protobuf.TextFormat.logger
                r0.warning(r3)
                return
            L_0x017c:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r0 = r0.getFullName()
                r3.append(r0)
                r3.append(r4)
                r3.append(r1)
                r3.append(r5)
                java.lang.String r0 = r3.toString()
                com.explorestack.protobuf.TextFormat$ParseException r0 = r14.parseExceptionPreviousToken(r0)
                throw r0
            L_0x019d:
                java.lang.String r1 = r14.consumeIdentifier()
                com.explorestack.protobuf.Descriptors$EnumValueDescriptor r3 = r0.findValueByName(r1)
                if (r3 != 0) goto L_0x021e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r0 = r0.getFullName()
                r3.append(r0)
                java.lang.String r0 = "\" has no value named \""
                r3.append(r0)
                r3.append(r1)
                r3.append(r6)
                java.lang.String r0 = r3.toString()
                boolean r1 = r7.allowUnknownEnumValues
                if (r1 == 0) goto L_0x01d1
                java.util.logging.Logger r1 = com.explorestack.protobuf.TextFormat.logger
                r1.warning(r0)
                return
            L_0x01d1:
                com.explorestack.protobuf.TextFormat$ParseException r0 = r14.parseExceptionPreviousToken(r0)
                throw r0
            L_0x01d6:
                com.explorestack.protobuf.ByteString r3 = r14.consumeByteString()
                goto L_0x021e
            L_0x01db:
                java.lang.String r3 = r14.consumeString()
                goto L_0x021e
            L_0x01e0:
                long r0 = r14.consumeUInt64()
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                goto L_0x021e
            L_0x01e9:
                int r0 = r14.consumeUInt32()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                goto L_0x021e
            L_0x01f2:
                double r0 = r14.consumeDouble()
                java.lang.Double r3 = java.lang.Double.valueOf(r0)
                goto L_0x021e
            L_0x01fb:
                float r0 = r14.consumeFloat()
                java.lang.Float r3 = java.lang.Float.valueOf(r0)
                goto L_0x021e
            L_0x0204:
                boolean r0 = r14.consumeBoolean()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
                goto L_0x021e
            L_0x020d:
                long r0 = r14.consumeInt64()
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                goto L_0x021e
            L_0x0216:
                int r0 = r14.consumeInt32()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            L_0x021e:
                boolean r0 = r17.isRepeated()
                if (r0 == 0) goto L_0x0228
                r9.addRepeatedField(r10, r3)
                goto L_0x022b
            L_0x0228:
                r9.setField(r10, r3)
            L_0x022b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.TextFormat.Parser.consumeFieldValue(com.explorestack.protobuf.TextFormat$Tokenizer, com.explorestack.protobuf.ExtensionRegistry, com.explorestack.protobuf.MessageReflection$MergeTarget, com.explorestack.protobuf.Descriptors$FieldDescriptor, com.explorestack.protobuf.ExtensionRegistry$ExtensionInfo, com.explorestack.protobuf.TextFormatParseInfoTree$Builder, java.util.List):void");
        }

        private void mergeAnyFieldValue(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, TextFormatParseInfoTree.Builder builder, List<UnknownField> list, Descriptors.Descriptor descriptor) throws ParseException {
            String str;
            Tokenizer tokenizer2 = tokenizer;
            MessageReflection.MergeTarget mergeTarget2 = mergeTarget;
            Descriptors.Descriptor descriptor2 = descriptor;
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(tokenizer.consumeIdentifier());
                if (tokenizer.tryConsume("]")) {
                    tokenizer.tryConsume(":");
                    if (tokenizer.tryConsume("<")) {
                        str = ">";
                    } else {
                        tokenizer.consume("{");
                        str = "}";
                    }
                    String str2 = str;
                    String sb2 = sb.toString();
                    try {
                        Descriptors.Descriptor descriptorForTypeUrl = this.typeRegistry.getDescriptorForTypeUrl(sb2);
                        if (descriptorForTypeUrl != null) {
                            DynamicMessage.Builder newBuilderForType = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                            MessageReflection.BuilderAdapter builderAdapter = new MessageReflection.BuilderAdapter(newBuilderForType);
                            while (!tokenizer.tryConsume(str2)) {
                                mergeField(tokenizer, extensionRegistry, builderAdapter, builder, list);
                            }
                            mergeTarget2.setField(descriptor2.findFieldByName("type_url"), sb.toString());
                            mergeTarget2.setField(descriptor2.findFieldByName(AppMeasurementSdk.ConditionalUserProperty.VALUE), newBuilderForType.build().toByteString());
                            return;
                        }
                        throw tokenizer.parseException("Unable to parse Any of type: " + sb2 + ". Please make sure that the TypeRegistry contains the descriptors for the given types.");
                    } catch (InvalidProtocolBufferException unused) {
                        throw tokenizer.parseException("Invalid valid type URL. Found: " + sb2);
                    }
                } else {
                    if (tokenizer.tryConsume("/")) {
                        sb.append("/");
                    } else if (tokenizer.tryConsume(".")) {
                        sb.append(".");
                    } else {
                        throw tokenizer.parseExceptionPreviousToken("Expected a valid type URL.");
                    }
                }
            }
        }

        private static void skipField(Tokenizer tokenizer) throws ParseException {
            if (tokenizer.tryConsume("[")) {
                do {
                    tokenizer.consumeIdentifier();
                } while (tokenizer.tryConsume("."));
                tokenizer.consume("]");
            } else {
                tokenizer.consumeIdentifier();
            }
            if (!tokenizer.tryConsume(":") || tokenizer.lookingAt("<") || tokenizer.lookingAt("{")) {
                skipFieldMessage(tokenizer);
            } else {
                skipFieldValue(tokenizer);
            }
            if (!tokenizer.tryConsume(";")) {
                tokenizer.tryConsume(",");
            }
        }

        private static void skipFieldMessage(Tokenizer tokenizer) throws ParseException {
            String str;
            if (tokenizer.tryConsume("<")) {
                str = ">";
            } else {
                tokenizer.consume("{");
                str = "}";
            }
            while (!tokenizer.lookingAt(">") && !tokenizer.lookingAt("}")) {
                skipField(tokenizer);
            }
            tokenizer.consume(str);
        }

        private static void skipFieldValue(Tokenizer tokenizer) throws ParseException {
            if (tokenizer.tryConsumeString()) {
                do {
                } while (tokenizer.tryConsumeString());
            } else if (!tokenizer.tryConsumeIdentifier() && !tokenizer.tryConsumeInt64() && !tokenizer.tryConsumeUInt64() && !tokenizer.tryConsumeDouble() && !tokenizer.tryConsumeFloat()) {
                throw tokenizer.parseException("Invalid field value: " + tokenizer.currentToken);
            }
        }
    }

    public static String escapeBytes(ByteString byteString) {
        return TextFormatEscaper.escapeBytes(byteString);
    }

    public static String escapeBytes(byte[] bArr) {
        return TextFormatEscaper.escapeBytes(bArr);
    }

    public static ByteString unescapeBytes(CharSequence charSequence) throws InvalidEscapeSequenceException {
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(charSequence.toString());
        int size = copyFromUtf8.size();
        byte[] bArr = new byte[size];
        int i5 = 0;
        int i6 = 0;
        while (i < copyFromUtf8.size()) {
            byte byteAt = copyFromUtf8.byteAt(i);
            if (byteAt == 92) {
                i++;
                if (i < copyFromUtf8.size()) {
                    byte byteAt2 = copyFromUtf8.byteAt(i);
                    if (isOctal(byteAt2)) {
                        int digitValue = digitValue(byteAt2);
                        int i7 = i + 1;
                        if (i7 < copyFromUtf8.size() && isOctal(copyFromUtf8.byteAt(i7))) {
                            digitValue = (digitValue * 8) + digitValue(copyFromUtf8.byteAt(i7));
                            i = i7;
                        }
                        int i8 = i + 1;
                        if (i8 < copyFromUtf8.size() && isOctal(copyFromUtf8.byteAt(i8))) {
                            digitValue = (digitValue * 8) + digitValue(copyFromUtf8.byteAt(i8));
                            i = i8;
                        }
                        i2 = i6 + 1;
                        bArr[i6] = (byte) digitValue;
                    } else {
                        if (byteAt2 == 34) {
                            i3 = i6 + 1;
                            bArr[i6] = 34;
                        } else if (byteAt2 != 39) {
                            if (byteAt2 == 85) {
                                int i9 = i + 1;
                                i4 = i9 + 7;
                                if (i4 < copyFromUtf8.size()) {
                                    int i10 = i9;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = i9 + 8;
                                        if (i10 < i12) {
                                            byte byteAt3 = copyFromUtf8.byteAt(i10);
                                            if (isHex(byteAt3)) {
                                                i11 = (i11 << 4) | digitValue(byteAt3);
                                                i10++;
                                            } else {
                                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                                            }
                                        } else if (Character.isValidCodePoint(i11)) {
                                            Character.UnicodeBlock of = Character.UnicodeBlock.of(i11);
                                            if (of.equals(Character.UnicodeBlock.LOW_SURROGATES) || of.equals(Character.UnicodeBlock.HIGH_SURROGATES) || of.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES)) {
                                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + copyFromUtf8.substring(i9, i12).toStringUtf8() + "' refers to a surrogate code unit");
                                            }
                                            byte[] bytes = new String(new int[]{i11}, 0, 1).getBytes(StandardCharsets.UTF_8);
                                            System.arraycopy(bytes, 0, bArr, i6, bytes.length);
                                            length = bytes.length;
                                        } else {
                                            throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + copyFromUtf8.substring(i9, i12).toStringUtf8() + "' is not a valid code point value");
                                        }
                                    }
                                } else {
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                                }
                            } else if (byteAt2 == 92) {
                                i3 = i6 + 1;
                                bArr[i6] = 92;
                            } else if (byteAt2 == 102) {
                                i3 = i6 + 1;
                                bArr[i6] = Ascii.FF;
                            } else if (byteAt2 == 110) {
                                i3 = i6 + 1;
                                bArr[i6] = 10;
                            } else if (byteAt2 == 114) {
                                i3 = i6 + 1;
                                bArr[i6] = Ascii.CR;
                            } else if (byteAt2 == 120) {
                                i++;
                                if (i >= copyFromUtf8.size() || !isHex(copyFromUtf8.byteAt(i))) {
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\x' with no digits");
                                }
                                int digitValue2 = digitValue(copyFromUtf8.byteAt(i));
                                int i13 = i + 1;
                                if (i13 < copyFromUtf8.size() && isHex(copyFromUtf8.byteAt(i13))) {
                                    digitValue2 = (digitValue2 * 16) + digitValue(copyFromUtf8.byteAt(i13));
                                    i = i13;
                                }
                                i2 = i6 + 1;
                                bArr[i6] = (byte) digitValue2;
                            } else if (byteAt2 == 97) {
                                i3 = i6 + 1;
                                bArr[i6] = 7;
                            } else if (byteAt2 != 98) {
                                switch (byteAt2) {
                                    case 116:
                                        i3 = i6 + 1;
                                        bArr[i6] = 9;
                                        break;
                                    case 117:
                                        int i14 = i + 1;
                                        i4 = i14 + 3;
                                        if (i4 < copyFromUtf8.size() && isHex(copyFromUtf8.byteAt(i14))) {
                                            int i15 = i14 + 1;
                                            if (isHex(copyFromUtf8.byteAt(i15))) {
                                                int i16 = i14 + 2;
                                                if (isHex(copyFromUtf8.byteAt(i16)) && isHex(copyFromUtf8.byteAt(i4))) {
                                                    char digitValue3 = (char) ((digitValue(copyFromUtf8.byteAt(i14)) << 12) | (digitValue(copyFromUtf8.byteAt(i15)) << 8) | (digitValue(copyFromUtf8.byteAt(i16)) << 4) | digitValue(copyFromUtf8.byteAt(i4)));
                                                    if (!Character.isSurrogate(digitValue3)) {
                                                        byte[] bytes2 = Character.toString(digitValue3).getBytes(StandardCharsets.UTF_8);
                                                        System.arraycopy(bytes2, 0, bArr, i6, bytes2.length);
                                                        length = bytes2.length;
                                                        break;
                                                    } else {
                                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' refers to a surrogate");
                                                    }
                                                }
                                            }
                                        }
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' with too few hex chars");
                                    case 118:
                                        i3 = i6 + 1;
                                        bArr[i6] = Ascii.VT;
                                        break;
                                    default:
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\" + ((char) byteAt2) + '\'');
                                }
                            } else {
                                i3 = i6 + 1;
                                bArr[i6] = 8;
                            }
                            i6 += length;
                            i = i4;
                            i5 = i + 1;
                        } else {
                            i3 = i6 + 1;
                            bArr[i6] = 39;
                        }
                        i6 = i3;
                        i5 = i + 1;
                    }
                } else {
                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\' at end of string.");
                }
            } else {
                i2 = i6 + 1;
                bArr[i6] = byteAt;
            }
            i6 = i2;
            i5 = i + 1;
        }
        if (size == i6) {
            return ByteString.wrap(bArr);
        }
        return ByteString.copyFrom(bArr, 0, i6);
    }

    public static class InvalidEscapeSequenceException extends IOException {
        private static final long serialVersionUID = -8164033650142593304L;

        InvalidEscapeSequenceException(String str) {
            super(str);
        }
    }

    static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return TextFormatEscaper.escapeDoubleQuotesAndBackslashes(str);
    }

    static String unescapeText(String str) throws InvalidEscapeSequenceException {
        return unescapeBytes(str).toStringUtf8();
    }

    static int parseInt32(String str) throws NumberFormatException {
        return (int) parseInteger(str, true, false);
    }

    static int parseUInt32(String str) throws NumberFormatException {
        return (int) parseInteger(str, false, false);
    }

    static long parseInt64(String str) throws NumberFormatException {
        return parseInteger(str, true, true);
    }

    static long parseUInt64(String str) throws NumberFormatException {
        return parseInteger(str, false, true);
    }

    private static long parseInteger(String str, boolean z, boolean z2) throws NumberFormatException {
        int i = 0;
        boolean z3 = true;
        if (!str.startsWith("-", 0)) {
            z3 = false;
        } else if (z) {
            i = 1;
        } else {
            throw new NumberFormatException("Number must be positive: " + str);
        }
        int i2 = 10;
        if (str.startsWith("0x", i)) {
            i += 2;
            i2 = 16;
        } else if (str.startsWith(BuildConfig.ADAPTER_VERSION, i)) {
            i2 = 8;
        }
        String substring = str.substring(i);
        if (substring.length() < 16) {
            long parseLong = Long.parseLong(substring, i2);
            if (z3) {
                parseLong = -parseLong;
            }
            if (z2) {
                return parseLong;
            }
            if (z) {
                if (parseLong <= 2147483647L && parseLong >= -2147483648L) {
                    return parseLong;
                }
                throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
            } else if (parseLong < 4294967296L && parseLong >= 0) {
                return parseLong;
            } else {
                throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
            }
        } else {
            BigInteger bigInteger = new BigInteger(substring, i2);
            if (z3) {
                bigInteger = bigInteger.negate();
            }
            if (!z2) {
                if (z) {
                    if (bigInteger.bitLength() > 31) {
                        throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
                    }
                } else if (bigInteger.bitLength() > 32) {
                    throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
                }
            } else if (z) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: " + str);
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: " + str);
            }
            return bigInteger.longValue();
        }
    }
}
