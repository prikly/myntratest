package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.TextFormat;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.core.Logger;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class OrtbUtils {
    private static final Printer DEFAULT_PRINTER = new Printer((AnonymousClass1) null);
    /* access modifiers changed from: private */
    public static final String[] PROTO_KNOWN_PACKAGES = {BuildConfig.LIBRARY_PACKAGE_NAME, "com.explorestack"};
    private static final String PROTO_ROOT_PACKAGE = "bidmachine";

    OrtbUtils() {
    }

    static void dump(String str, MessageOrBuilder messageOrBuilder) {
        if (Logger.isLoggingEnabled()) {
            Logger.log(str + " dump:\n" + printToString(messageOrBuilder));
        }
    }

    static void prepareEvents(Map<TrackEventType, List<String>> map, List<Ad.Event> list) {
        if (list != null && list.size() != 0) {
            for (Ad.Event next : list) {
                TrackEventType fromNumber = TrackEventType.fromNumber(next.getTypeValue());
                if (fromNumber != null) {
                    addEvent(map, fromNumber, next.getUrl());
                }
            }
        }
    }

    static void addEvent(Map<TrackEventType, List<String>> map, TrackEventType trackEventType, String str) {
        if (!TextUtils.isEmpty(str)) {
            List list = map.get(trackEventType);
            if (list == null) {
                list = new ArrayList(1);
                map.put(trackEventType, list);
            }
            list.add(str);
        }
    }

    private static String printToString(MessageOrBuilder messageOrBuilder) {
        try {
            StringBuilder sb = new StringBuilder();
            print(messageOrBuilder, sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: private */
    public static void print(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
        DEFAULT_PRINTER.print(messageOrBuilder, new TextGenerator(appendable, (AnonymousClass1) null));
    }

    private static final class TextGenerator {
        private boolean atStartOfLine;
        private final StringBuilder indent;
        private final Appendable output;

        /* synthetic */ TextGenerator(Appendable appendable, AnonymousClass1 r2) {
            this(appendable);
        }

        private TextGenerator(Appendable appendable) {
            this.indent = new StringBuilder();
            this.atStartOfLine = true;
            this.output = appendable;
        }

        /* access modifiers changed from: package-private */
        public void indent() {
            this.indent.append("  ");
        }

        /* access modifiers changed from: package-private */
        public void outdent() {
            int length = this.indent.length();
            if (length != 0) {
                this.indent.delete(length - 2, length);
                return;
            }
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
        }

        /* access modifiers changed from: package-private */
        public void print(CharSequence charSequence) throws IOException {
            int length = charSequence.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2) == 10) {
                    int i3 = i2 + 1;
                    write(charSequence.subSequence(i, i3));
                    this.atStartOfLine = true;
                    i = i3;
                }
            }
            write(charSequence.subSequence(i, length));
        }

        private void write(CharSequence charSequence) throws IOException {
            if (charSequence.length() != 0) {
                if (this.atStartOfLine) {
                    this.atStartOfLine = false;
                    this.output.append(this.indent);
                }
                this.output.append(charSequence);
            }
        }
    }

    private static final class Printer {
        boolean escapeNonAscii;
        boolean singleLineMode;

        /* synthetic */ Printer(AnonymousClass1 r1) {
            this();
        }

        private Printer() {
            this.singleLineMode = false;
            this.escapeNonAscii = true;
        }

        private Printer setSingleLineMode(boolean z) {
            this.singleLineMode = z;
            return this;
        }

        private Printer setEscapeNonAscii(boolean z) {
            this.escapeNonAscii = z;
            return this;
        }

        /* access modifiers changed from: private */
        public void print(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            for (Map.Entry next : messageOrBuilder.getAllFields().entrySet()) {
                printField((Descriptors.FieldDescriptor) next.getKey(), next.getValue(), textGenerator);
            }
            printUnknownFields(messageOrBuilder.getUnknownFields(), textGenerator);
        }

        private void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (fieldDescriptor.isRepeated()) {
                for (Object printSingleField : (List) obj) {
                    printSingleField(fieldDescriptor, printSingleField, textGenerator);
                }
                return;
            }
            printSingleField(fieldDescriptor, obj, textGenerator);
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
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                textGenerator.print(": ");
            } else if (this.singleLineMode) {
                textGenerator.print(" { ");
            } else {
                textGenerator.print(" {\n");
                textGenerator.indent();
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                StringBuilder sb = new StringBuilder();
                if (obj instanceof Any) {
                    Any any = (Any) obj;
                    String[] split = any.getTypeUrl().split("/");
                    String str = split[split.length - 1];
                    String[] access$300 = OrtbUtils.PROTO_KNOWN_PACKAGES;
                    int length = access$300.length;
                    int i = 0;
                    while (i < length) {
                        try {
                            OrtbUtils.print(any.unpack(Class.forName(str.replace("bidmachine", access$300[i]))), sb);
                            break;
                        } catch (ClassNotFoundException unused) {
                            i++;
                        }
                    }
                    if (sb.length() > 0) {
                        textGenerator.indent();
                        textGenerator.print(sb);
                        textGenerator.outdent();
                        textGenerator.print("}");
                        textGenerator.print("\n");
                        return;
                    }
                    return;
                }
                OrtbUtils.print((MessageOrBuilder) obj, sb);
                if (sb.length() > 0) {
                    textGenerator.print(sb);
                    textGenerator.outdent();
                    textGenerator.print("}");
                    textGenerator.print("\n");
                    return;
                }
                return;
            }
            printFieldValue(fieldDescriptor, obj, textGenerator);
            if (this.singleLineMode) {
                textGenerator.print(" ");
            } else {
                textGenerator.print("\n");
            }
        }

        private void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            String str;
            switch (AnonymousClass1.$SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    textGenerator.print(obj.toString());
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
                        str = TextFormat.escapeBytes(ByteString.copyFromUtf8((String) obj));
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
                    print((Message) obj, textGenerator);
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: private */
        public void printUnknownFields(UnknownFieldSet unknownFieldSet, TextGenerator textGenerator) throws IOException {
            for (Map.Entry next : unknownFieldSet.asMap().entrySet()) {
                int intValue = ((Integer) next.getKey()).intValue();
                UnknownFieldSet.Field field = (UnknownFieldSet.Field) next.getValue();
                printUnknownField(intValue, 0, field.getVarintList(), textGenerator);
                printUnknownField(intValue, 5, field.getFixed32List(), textGenerator);
                printUnknownField(intValue, 1, field.getFixed64List(), textGenerator);
                printUnknownField(intValue, 2, field.getLengthDelimitedList(), textGenerator);
                for (UnknownFieldSet next2 : field.getGroupList()) {
                    textGenerator.print(((Integer) next.getKey()).toString());
                    if (this.singleLineMode) {
                        textGenerator.print(" { ");
                    } else {
                        textGenerator.print(" {\n");
                        textGenerator.indent();
                    }
                    printUnknownFields(next2, textGenerator);
                    if (this.singleLineMode) {
                        textGenerator.print("} ");
                    } else {
                        textGenerator.outdent();
                        textGenerator.print("}\n");
                    }
                }
            }
        }

        private void printUnknownField(int i, int i2, List<?> list, TextGenerator textGenerator) throws IOException {
            for (Object next : list) {
                textGenerator.print(String.valueOf(i));
                textGenerator.print(": ");
                OrtbUtils.printUnknownFieldValue(i2, next, textGenerator);
                textGenerator.print(this.singleLineMode ? " " : "\n");
            }
        }
    }

    /* renamed from: io.bidmachine.OrtbUtils$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type[] r0 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type = r0
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.INT32     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.INT64     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SINT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x003e }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.BOOL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x006c }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.DOUBLE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.UINT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.FIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.UINT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x009c }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.FIXED64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.STRING     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.ENUM     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.explorestack.protobuf.Descriptors$FieldDescriptor$Type r1 = com.explorestack.protobuf.Descriptors.FieldDescriptor.Type.GROUP     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.OrtbUtils.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static void printUnknownFieldValue(int i, Object obj, TextGenerator textGenerator) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            textGenerator.print(unsignedToString(((Long) obj).longValue()));
        } else if (tagWireType == 1) {
            textGenerator.print(String.format("0x%016x", new Object[]{(Long) obj}));
        } else if (tagWireType == 2) {
            textGenerator.print("\"");
            textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
            textGenerator.print("\"");
        } else if (tagWireType == 3) {
            DEFAULT_PRINTER.printUnknownFields((UnknownFieldSet) obj, textGenerator);
        } else if (tagWireType == 5) {
            textGenerator.print(String.format("0x%08x", new Object[]{(Integer) obj}));
        } else {
            throw new IllegalArgumentException("Bad tag: " + i);
        }
    }

    private static String unsignedToString(long j) {
        if (j >= 0) {
            return Long.toString(j);
        }
        return BigInteger.valueOf(j & Long.MAX_VALUE).setBit(63).toString();
    }
}
