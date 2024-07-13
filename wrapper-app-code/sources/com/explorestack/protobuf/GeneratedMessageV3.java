package com.explorestack.protobuf;

import com.appodeal.ads.modules.common.internal.Constants;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.DynamicMessage;
import com.explorestack.protobuf.FieldSet;
import com.explorestack.protobuf.GeneratedMessage;
import com.explorestack.protobuf.GeneratedMessageLite;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.LazyField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageReflection;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class GeneratedMessageV3 extends AbstractMessage implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected UnknownFieldSet unknownFields;

    protected interface BuilderParent extends AbstractMessage.BuilderParent {
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageOrBuilder {
        Message getDefaultInstanceForType();

        <Type> Type getExtension(Extension<MessageType, Type> extension);

        <Type> Type getExtension(Extension<MessageType, List<Type>> extension, int i);

        <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite);

        <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i);

        <Type> Type getExtension(GeneratedMessage.GeneratedExtension<MessageType, Type> generatedExtension);

        <Type> Type getExtension(GeneratedMessage.GeneratedExtension<MessageType, List<Type>> generatedExtension, int i);

        <Type> int getExtensionCount(Extension<MessageType, List<Type>> extension);

        <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite);

        <Type> int getExtensionCount(GeneratedMessage.GeneratedExtension<MessageType, List<Type>> generatedExtension);

        <Type> boolean hasExtension(Extension<MessageType, Type> extension);

        <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite);

        <Type> boolean hasExtension(GeneratedMessage.GeneratedExtension<MessageType, Type> generatedExtension);
    }

    interface ExtensionDescriptorRetriever {
        Descriptors.FieldDescriptor getDescriptor();
    }

    /* access modifiers changed from: protected */
    public abstract FieldAccessorTable internalGetFieldAccessorTable();

    /* access modifiers changed from: protected */
    public void makeExtensionsImmutable() {
    }

    /* access modifiers changed from: protected */
    public abstract Message.Builder newBuilderForType(BuilderParent builderParent);

    protected GeneratedMessageV3() {
        this.unknownFields = UnknownFieldSet.getDefaultInstance();
    }

    protected GeneratedMessageV3(Builder<?> builder) {
        this.unknownFields = builder.getUnknownFields();
    }

    public Parser<? extends GeneratedMessageV3> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    static void setAlwaysUseFieldBuildersForTesting(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internalGetFieldAccessorTable().descriptor;
    }

    /* access modifiers changed from: protected */
    public void mergeFromAndMakeImmutableInternal(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Schema schemaFor = Protobuf.getInstance().schemaFor(this);
        try {
            schemaFor.mergeFrom(this, CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
            schemaFor.makeImmutable(this);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.setUnfinishedMessage(this);
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
        }
    }

    /* access modifiers changed from: private */
    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable(boolean z) {
        TreeMap treeMap = new TreeMap();
        List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().descriptor.getFields();
        int i = 0;
        while (i < fields.size()) {
            Descriptors.FieldDescriptor fieldDescriptor = fields.get(i);
            Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                i += containingOneof.getFieldCount() - 1;
                if (!hasOneof(containingOneof)) {
                    i++;
                } else {
                    fieldDescriptor = getOneofFieldDescriptor(containingOneof);
                }
            } else {
                if (fieldDescriptor.isRepeated()) {
                    List list = (List) getField(fieldDescriptor);
                    if (!list.isEmpty()) {
                        treeMap.put(fieldDescriptor, list);
                    }
                } else if (!hasField(fieldDescriptor)) {
                }
                i++;
            }
            if (!z || fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.STRING) {
                treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                i++;
            } else {
                treeMap.put(fieldDescriptor, getFieldRaw(fieldDescriptor));
                i++;
            }
        }
        return treeMap;
    }

    public boolean isInitialized() {
        for (Descriptors.FieldDescriptor next : getDescriptorForType().getFields()) {
            if (next.isRequired() && !hasField(next)) {
                return false;
            }
            if (next.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (next.isRepeated()) {
                    for (Message isInitialized : (List) getField(next)) {
                        if (!isInitialized.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (hasField(next) && !((Message) getField(next)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    /* access modifiers changed from: package-private */
    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().getOneof(oneofDescriptor).has(this);
    }

    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().getOneof(oneofDescriptor).get(this);
    }

    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).has(this);
    }

    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).get(this);
    }

    /* access modifiers changed from: package-private */
    public Object getFieldRaw(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).getRaw(this);
    }

    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeatedCount(this);
    }

    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeated(this, i);
    }

    public UnknownFieldSet getUnknownFields() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* access modifiers changed from: protected */
    public boolean parseUnknownField(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        if (codedInputStream.shouldDiscardUnknownFields()) {
            return codedInputStream.skipField(i);
        }
        return builder.mergeFieldFrom(i, codedInputStream);
    }

    /* access modifiers changed from: protected */
    public boolean parseUnknownFieldProto3(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        return parseUnknownField(codedInputStream, builder, extensionRegistryLite, i);
    }

    protected static <M extends Message> M parseWithIOException(Parser<M> parser, InputStream inputStream) throws IOException {
        try {
            return (Message) parser.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseWithIOException(Parser<M> parser, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            return (Message) parser.parseFrom(inputStream, extensionRegistryLite);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseWithIOException(Parser<M> parser, CodedInputStream codedInputStream) throws IOException {
        try {
            return (Message) parser.parseFrom(codedInputStream);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseWithIOException(Parser<M> parser, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            return (Message) parser.parseFrom(codedInputStream, extensionRegistryLite);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseDelimitedWithIOException(Parser<M> parser, InputStream inputStream) throws IOException {
        try {
            return (Message) parser.parseDelimitedFrom(inputStream);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseDelimitedWithIOException(Parser<M> parser, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            return (Message) parser.parseDelimitedFrom(inputStream, extensionRegistryLite);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    protected static boolean canUseUnsafe() {
        return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
    }

    protected static Internal.IntList emptyIntList() {
        return IntArrayList.emptyList();
    }

    protected static Internal.IntList newIntList() {
        return new IntArrayList();
    }

    protected static Internal.IntList mutableCopy(Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Internal.LongList emptyLongList() {
        return LongArrayList.emptyList();
    }

    protected static Internal.LongList newLongList() {
        return new LongArrayList();
    }

    protected static Internal.LongList mutableCopy(Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Internal.FloatList emptyFloatList() {
        return FloatArrayList.emptyList();
    }

    protected static Internal.FloatList newFloatList() {
        return new FloatArrayList();
    }

    protected static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Internal.DoubleList emptyDoubleList() {
        return DoubleArrayList.emptyList();
    }

    protected static Internal.DoubleList newDoubleList() {
        return new DoubleArrayList();
    }

    protected static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Internal.BooleanList emptyBooleanList() {
        return BooleanArrayList.emptyList();
    }

    protected static Internal.BooleanList newBooleanList() {
        return new BooleanArrayList();
    }

    protected static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        MessageReflection.writeMessageTo(this, getAllFieldsRaw(), codedOutputStream, false);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        this.memoizedSize = MessageReflection.getSerializedSize(this, getAllFieldsRaw());
        return this.memoizedSize;
    }

    protected static final class UnusedPrivateParameter {
        static final UnusedPrivateParameter INSTANCE = new UnusedPrivateParameter();

        private UnusedPrivateParameter() {
        }
    }

    /* access modifiers changed from: protected */
    public Object newInstance(UnusedPrivateParameter unusedPrivateParameter) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    /* access modifiers changed from: protected */
    public Message.Builder newBuilderForType(final AbstractMessage.BuilderParent builderParent) {
        return newBuilderForType((BuilderParent) new BuilderParent() {
            public void markDirty() {
                builderParent.markDirty();
            }
        });
    }

    public static abstract class Builder<BuilderType extends Builder<BuilderType>> extends AbstractMessage.Builder<BuilderType> {
        private BuilderParent builderParent;
        private boolean isClean;
        private Builder<BuilderType>.BuilderParentImpl meAsParent;
        private UnknownFieldSet unknownFields;

        /* access modifiers changed from: protected */
        public abstract FieldAccessorTable internalGetFieldAccessorTable();

        protected Builder() {
            this((BuilderParent) null);
        }

        protected Builder(BuilderParent builderParent2) {
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
            this.builderParent = builderParent2;
        }

        /* access modifiers changed from: package-private */
        public void dispose() {
            this.builderParent = null;
        }

        /* access modifiers changed from: protected */
        public void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        /* access modifiers changed from: protected */
        public void markClean() {
            this.isClean = true;
        }

        /* access modifiers changed from: protected */
        public boolean isClean() {
            return this.isClean;
        }

        public BuilderType clone() {
            BuilderType buildertype = (Builder) getDefaultInstanceForType().newBuilderForType();
            buildertype.mergeFrom(buildPartial());
            return buildertype;
        }

        public BuilderType clear() {
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
            onChanged();
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internalGetFieldAccessorTable().descriptor;
        }

        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        /* access modifiers changed from: private */
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().descriptor.getFields();
            int i = 0;
            while (i < fields.size()) {
                Descriptors.FieldDescriptor fieldDescriptor = fields.get(i);
                Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
                if (containingOneof != null) {
                    i += containingOneof.getFieldCount() - 1;
                    if (!hasOneof(containingOneof)) {
                        i++;
                    } else {
                        fieldDescriptor = getOneofFieldDescriptor(containingOneof);
                    }
                } else {
                    if (fieldDescriptor.isRepeated()) {
                        List list = (List) getField(fieldDescriptor);
                        if (!list.isEmpty()) {
                            treeMap.put(fieldDescriptor, list);
                        }
                    } else if (!hasField(fieldDescriptor)) {
                    }
                    i++;
                }
                treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                i++;
            }
            return treeMap;
        }

        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).newBuilder();
        }

        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getBuilder(this);
        }

        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeatedBuilder(this, i);
        }

        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().getOneof(oneofDescriptor).has(this);
        }

        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().getOneof(oneofDescriptor).get(this);
        }

        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).has(this);
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            Object obj = internalGetFieldAccessorTable().getField(fieldDescriptor).get(this);
            return fieldDescriptor.isRepeated() ? Collections.unmodifiableList((List) obj) : obj;
        }

        public BuilderType setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).set(this, obj);
            return this;
        }

        public BuilderType clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).clear(this);
            return this;
        }

        public BuilderType clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            internalGetFieldAccessorTable().getOneof(oneofDescriptor).clear(this);
            return this;
        }

        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeatedCount(this);
        }

        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeated(this, i);
        }

        public BuilderType setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).setRepeated(this, i, obj);
            return this;
        }

        public BuilderType addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).addRepeated(this, obj);
            return this;
        }

        private BuilderType setUnknownFieldsInternal(UnknownFieldSet unknownFieldSet) {
            this.unknownFields = unknownFieldSet;
            onChanged();
            return this;
        }

        public BuilderType setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return setUnknownFieldsInternal(unknownFieldSet);
        }

        /* access modifiers changed from: protected */
        public BuilderType setUnknownFieldsProto3(UnknownFieldSet unknownFieldSet) {
            return setUnknownFieldsInternal(unknownFieldSet);
        }

        public BuilderType mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return setUnknownFields(UnknownFieldSet.newBuilder(this.unknownFields).mergeFrom(unknownFieldSet).build());
        }

        public boolean isInitialized() {
            for (Descriptors.FieldDescriptor next : getDescriptorForType().getFields()) {
                if (next.isRequired() && !hasField(next)) {
                    return false;
                }
                if (next.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    if (next.isRepeated()) {
                        for (Message isInitialized : (List) getField(next)) {
                            if (!isInitialized.isInitialized()) {
                                return false;
                            }
                        }
                        continue;
                    } else if (hasField(next) && !((Message) getField(next)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private class BuilderParentImpl implements BuilderParent {
            private BuilderParentImpl() {
            }

            public void markDirty() {
                Builder.this.onChanged();
            }
        }

        /* access modifiers changed from: protected */
        public BuilderParent getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new BuilderParentImpl();
            }
            return this.meAsParent;
        }

        /* access modifiers changed from: protected */
        public final void onChanged() {
            BuilderParent builderParent2;
            if (this.isClean && (builderParent2 = this.builderParent) != null) {
                builderParent2.markDirty();
                this.isClean = false;
            }
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMutableMapField(int i) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage> extends GeneratedMessageV3 implements ExtendableMessageOrBuilder<MessageType> {
        private static final long serialVersionUID = 1;
        /* access modifiers changed from: private */
        public final FieldSet<Descriptors.FieldDescriptor> extensions;

        protected ExtendableMessage() {
            this.extensions = FieldSet.newFieldSet();
        }

        protected ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            super(extendableBuilder);
            this.extensions = extendableBuilder.buildExtensions();
        }

        private void verifyExtensionContainingType(Extension<MessageType, ?> extension) {
            if (extension.getDescriptor().getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("Extension is for type \"" + extension.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + getDescriptorForType().getFullName() + "\".");
            }
        }

        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            return this.extensions.hasField(access$500.getDescriptor());
        }

        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            return this.extensions.getRepeatedFieldCount(access$500.getDescriptor());
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            Descriptors.FieldDescriptor descriptor = access$500.getDescriptor();
            Object field = this.extensions.getField(descriptor);
            if (field != null) {
                return access$500.fromReflectionType(field);
            }
            if (descriptor.isRepeated()) {
                return Collections.emptyList();
            }
            if (descriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return access$500.getMessageDefaultInstance();
            }
            return access$500.fromReflectionType(descriptor.getDefaultValue());
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            return access$500.singularFromReflectionType(this.extensions.getRepeatedField(access$500.getDescriptor(), i));
        }

        public final <Type> boolean hasExtension(Extension<MessageType, Type> extension) {
            return hasExtension(extension);
        }

        public final <Type> boolean hasExtension(GeneratedMessage.GeneratedExtension<MessageType, Type> generatedExtension) {
            return hasExtension(generatedExtension);
        }

        public final <Type> int getExtensionCount(Extension<MessageType, List<Type>> extension) {
            return getExtensionCount(extension);
        }

        public final <Type> int getExtensionCount(GeneratedMessage.GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            return getExtensionCount(generatedExtension);
        }

        public final <Type> Type getExtension(Extension<MessageType, Type> extension) {
            return getExtension(extension);
        }

        public final <Type> Type getExtension(GeneratedMessage.GeneratedExtension<MessageType, Type> generatedExtension) {
            return getExtension(generatedExtension);
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.explorestack.protobuf.ExtensionLite, com.explorestack.protobuf.Extension<MessageType, java.util.List<Type>>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <Type> Type getExtension(com.explorestack.protobuf.Extension<MessageType, java.util.List<Type>> r1, int r2) {
            /*
                r0 = this;
                java.lang.Object r1 = r0.getExtension(r1, (int) r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.GeneratedMessageV3.ExtendableMessage.getExtension(com.explorestack.protobuf.Extension, int):java.lang.Object");
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.explorestack.protobuf.GeneratedMessage$GeneratedExtension<MessageType, java.util.List<Type>>, com.explorestack.protobuf.ExtensionLite] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <Type> Type getExtension(com.explorestack.protobuf.GeneratedMessage.GeneratedExtension<MessageType, java.util.List<Type>> r1, int r2) {
            /*
                r0 = this;
                java.lang.Object r1 = r0.getExtension(r1, (int) r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.GeneratedMessageV3.ExtendableMessage.getExtension(com.explorestack.protobuf.GeneratedMessage$GeneratedExtension, int):java.lang.Object");
        }

        /* access modifiers changed from: protected */
        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        public boolean isInitialized() {
            return GeneratedMessageV3.super.isInitialized() && extensionsAreInitialized();
        }

        /* access modifiers changed from: protected */
        public boolean parseUnknownField(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            if (codedInputStream.shouldDiscardUnknownFields()) {
                builder = null;
            }
            return MessageReflection.mergeFieldFrom(codedInputStream, builder, extensionRegistryLite, getDescriptorForType(), new MessageReflection.ExtensionAdapter(this.extensions), i);
        }

        /* access modifiers changed from: protected */
        public boolean parseUnknownFieldProto3(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            return parseUnknownField(codedInputStream, builder, extensionRegistryLite, i);
        }

        /* access modifiers changed from: protected */
        public void makeExtensionsImmutable() {
            this.extensions.makeImmutable();
        }

        protected class ExtensionWriter {
            private final Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<Descriptors.FieldDescriptor, Object> next;

            private ExtensionWriter(boolean z) {
                Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> it = ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = this.iter.next();
                }
                this.messageSetWireFormat = z;
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<Descriptors.FieldDescriptor, Object> entry = this.next;
                    if (entry != null && entry.getKey().getNumber() < i) {
                        Descriptors.FieldDescriptor key = this.next.getKey();
                        if (!this.messageSetWireFormat || key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated()) {
                            FieldSet.writeField(key, this.next.getValue(), codedOutputStream);
                        } else if (this.next instanceof LazyField.LazyEntry) {
                            codedOutputStream.writeRawMessageSetExtension(key.getNumber(), ((LazyField.LazyEntry) this.next).getField().toByteString());
                        } else {
                            codedOutputStream.writeMessageSetExtension(key.getNumber(), (Message) this.next.getValue());
                        }
                        if (this.iter.hasNext()) {
                            this.next = this.iter.next();
                        } else {
                            this.next = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(false);
        }

        /* access modifiers changed from: protected */
        public ExtendableMessage<MessageType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(true);
        }

        /* access modifiers changed from: protected */
        public int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        /* access modifiers changed from: protected */
        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        /* access modifiers changed from: protected */
        public Map<Descriptors.FieldDescriptor, Object> getExtensionFields() {
            return this.extensions.getAllFields();
        }

        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map access$800 = getAllFieldsMutable(false);
            access$800.putAll(getExtensionFields());
            return Collections.unmodifiableMap(access$800);
        }

        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
            Map access$800 = getAllFieldsMutable(false);
            access$800.putAll(getExtensionFields());
            return Collections.unmodifiableMap(access$800);
        }

        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return GeneratedMessageV3.super.hasField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.hasField(fieldDescriptor);
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return GeneratedMessageV3.super.getField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            Object field = this.extensions.getField(fieldDescriptor);
            if (field != null) {
                return field;
            }
            if (fieldDescriptor.isRepeated()) {
                return Collections.emptyList();
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return DynamicMessage.getDefaultInstance(fieldDescriptor.getMessageType());
            }
            return fieldDescriptor.getDefaultValue();
        }

        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return GeneratedMessageV3.super.getRepeatedFieldCount(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.getRepeatedFieldCount(fieldDescriptor);
        }

        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            if (!fieldDescriptor.isExtension()) {
                return GeneratedMessageV3.super.getRepeatedField(fieldDescriptor, i);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.getRepeatedField(fieldDescriptor, i);
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<BuilderType> implements ExtendableMessageOrBuilder<MessageType> {
        private FieldSet.Builder<Descriptors.FieldDescriptor> extensions;

        protected ExtendableBuilder() {
        }

        protected ExtendableBuilder(BuilderParent builderParent) {
            super(builderParent);
        }

        /* access modifiers changed from: package-private */
        public void internalSetExtensionSet(FieldSet<Descriptors.FieldDescriptor> fieldSet) {
            this.extensions = FieldSet.Builder.fromFieldSet(fieldSet);
        }

        public BuilderType clear() {
            this.extensions = null;
            return (ExtendableBuilder) super.clear();
        }

        private void ensureExtensionsIsMutable() {
            if (this.extensions == null) {
                this.extensions = FieldSet.newBuilder();
            }
        }

        private void verifyExtensionContainingType(Extension<MessageType, ?> extension) {
            if (extension.getDescriptor().getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("Extension is for type \"" + extension.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + getDescriptorForType().getFullName() + "\".");
            }
        }

        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder == null) {
                return false;
            }
            return builder.hasField(access$500.getDescriptor());
        }

        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            Descriptors.FieldDescriptor descriptor = access$500.getDescriptor();
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder == null) {
                return 0;
            }
            return builder.getRepeatedFieldCount(descriptor);
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            Descriptors.FieldDescriptor descriptor = access$500.getDescriptor();
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            Object field = builder == null ? null : builder.getField(descriptor);
            if (field != null) {
                return access$500.fromReflectionType(field);
            }
            if (descriptor.isRepeated()) {
                return Collections.emptyList();
            }
            if (descriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return access$500.getMessageDefaultInstance();
            }
            return access$500.fromReflectionType(descriptor.getDefaultValue());
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            Descriptors.FieldDescriptor descriptor = access$500.getDescriptor();
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder != null) {
                return access$500.singularFromReflectionType(builder.getRepeatedField(descriptor, i));
            }
            throw new IndexOutOfBoundsException();
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, Type> extensionLite, Type type) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            ensureExtensionsIsMutable();
            this.extensions.setField(access$500.getDescriptor(), access$500.toReflectionType(type));
            onChanged();
            return this;
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i, Type type) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            ensureExtensionsIsMutable();
            this.extensions.setRepeatedField(access$500.getDescriptor(), i, access$500.singularToReflectionType(type));
            onChanged();
            return this;
        }

        public final <Type> BuilderType addExtension(ExtensionLite<MessageType, List<Type>> extensionLite, Type type) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            ensureExtensionsIsMutable();
            this.extensions.addRepeatedField(access$500.getDescriptor(), access$500.singularToReflectionType(type));
            onChanged();
            return this;
        }

        public final BuilderType clearExtension(ExtensionLite<MessageType, ?> extensionLite) {
            Extension access$500 = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(access$500);
            ensureExtensionsIsMutable();
            this.extensions.clearField(access$500.getDescriptor());
            onChanged();
            return this;
        }

        public final <Type> boolean hasExtension(Extension<MessageType, Type> extension) {
            return hasExtension(extension);
        }

        public final <Type> boolean hasExtension(GeneratedMessage.GeneratedExtension<MessageType, Type> generatedExtension) {
            return hasExtension(generatedExtension);
        }

        public final <Type> int getExtensionCount(Extension<MessageType, List<Type>> extension) {
            return getExtensionCount(extension);
        }

        public final <Type> int getExtensionCount(GeneratedMessage.GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            return getExtensionCount(generatedExtension);
        }

        public final <Type> Type getExtension(Extension<MessageType, Type> extension) {
            return getExtension(extension);
        }

        public final <Type> Type getExtension(GeneratedMessage.GeneratedExtension<MessageType, Type> generatedExtension) {
            return getExtension(generatedExtension);
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.explorestack.protobuf.ExtensionLite, com.explorestack.protobuf.Extension<MessageType, java.util.List<Type>>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <Type> Type getExtension(com.explorestack.protobuf.Extension<MessageType, java.util.List<Type>> r1, int r2) {
            /*
                r0 = this;
                java.lang.Object r1 = r0.getExtension(r1, (int) r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.GeneratedMessageV3.ExtendableBuilder.getExtension(com.explorestack.protobuf.Extension, int):java.lang.Object");
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.explorestack.protobuf.GeneratedMessage$GeneratedExtension<MessageType, java.util.List<Type>>, com.explorestack.protobuf.ExtensionLite] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <Type> Type getExtension(com.explorestack.protobuf.GeneratedMessage.GeneratedExtension<MessageType, java.util.List<Type>> r1, int r2) {
            /*
                r0 = this;
                java.lang.Object r1 = r0.getExtension(r1, (int) r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.GeneratedMessageV3.ExtendableBuilder.getExtension(com.explorestack.protobuf.GeneratedMessage$GeneratedExtension, int):java.lang.Object");
        }

        public final <Type> BuilderType setExtension(Extension<MessageType, Type> extension, Type type) {
            return setExtension(extension, type);
        }

        public <Type> BuilderType setExtension(GeneratedMessage.GeneratedExtension<MessageType, Type> generatedExtension, Type type) {
            return setExtension(generatedExtension, type);
        }

        public final <Type> BuilderType setExtension(Extension<MessageType, List<Type>> extension, int i, Type type) {
            return setExtension(extension, i, type);
        }

        public <Type> BuilderType setExtension(GeneratedMessage.GeneratedExtension<MessageType, List<Type>> generatedExtension, int i, Type type) {
            return setExtension(generatedExtension, i, type);
        }

        public final <Type> BuilderType addExtension(Extension<MessageType, List<Type>> extension, Type type) {
            return addExtension(extension, type);
        }

        public <Type> BuilderType addExtension(GeneratedMessage.GeneratedExtension<MessageType, List<Type>> generatedExtension, Type type) {
            return addExtension(generatedExtension, type);
        }

        public final <Type> BuilderType clearExtension(Extension<MessageType, ?> extension) {
            return clearExtension(extension);
        }

        public <Type> BuilderType clearExtension(GeneratedMessage.GeneratedExtension<MessageType, ?> generatedExtension) {
            return clearExtension(generatedExtension);
        }

        /* access modifiers changed from: protected */
        public boolean extensionsAreInitialized() {
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder == null) {
                return true;
            }
            return builder.isInitialized();
        }

        /* access modifiers changed from: private */
        public FieldSet<Descriptors.FieldDescriptor> buildExtensions() {
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder == null) {
                return FieldSet.emptySet();
            }
            return builder.build();
        }

        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map access$900 = getAllFieldsMutable();
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder != null) {
                access$900.putAll(builder.getAllFields());
            }
            return Collections.unmodifiableMap(access$900);
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            Object field = builder == null ? null : builder.getField(fieldDescriptor);
            if (field != null) {
                return field;
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return DynamicMessage.getDefaultInstance(fieldDescriptor.getMessageType());
            }
            return fieldDescriptor.getDefaultValue();
        }

        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getFieldBuilder(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                ensureExtensionsIsMutable();
                Object fieldAllowBuilders = this.extensions.getFieldAllowBuilders(fieldDescriptor);
                if (fieldAllowBuilders == null) {
                    DynamicMessage.Builder newBuilder = DynamicMessage.newBuilder(fieldDescriptor.getMessageType());
                    this.extensions.setField(fieldDescriptor, newBuilder);
                    onChanged();
                    return newBuilder;
                } else if (fieldAllowBuilders instanceof Message.Builder) {
                    return (Message.Builder) fieldAllowBuilders;
                } else {
                    if (fieldAllowBuilders instanceof Message) {
                        Message.Builder builder = ((Message) fieldAllowBuilders).toBuilder();
                        this.extensions.setField(fieldDescriptor, builder);
                        onChanged();
                        return builder;
                    }
                    throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
                }
            } else {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
        }

        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldCount(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder == null) {
                return 0;
            }
            return builder.getRepeatedFieldCount(fieldDescriptor);
        }

        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedField(fieldDescriptor, i);
            }
            verifyContainingType(fieldDescriptor);
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder != null) {
                return builder.getRepeatedField(fieldDescriptor, i);
            }
            throw new IndexOutOfBoundsException();
        }

        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldBuilder(fieldDescriptor, i);
            }
            verifyContainingType(fieldDescriptor);
            ensureExtensionsIsMutable();
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                Object repeatedFieldAllowBuilders = this.extensions.getRepeatedFieldAllowBuilders(fieldDescriptor, i);
                if (repeatedFieldAllowBuilders instanceof Message.Builder) {
                    return (Message.Builder) repeatedFieldAllowBuilders;
                }
                if (repeatedFieldAllowBuilders instanceof Message) {
                    Message.Builder builder = ((Message) repeatedFieldAllowBuilders).toBuilder();
                    this.extensions.setRepeatedField(fieldDescriptor, i, builder);
                    onChanged();
                    return builder;
                }
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }

        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.hasField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder == null) {
                return false;
            }
            return builder.hasField(fieldDescriptor);
        }

        public BuilderType setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (ExtendableBuilder) super.setField(fieldDescriptor, obj);
            }
            verifyContainingType(fieldDescriptor);
            ensureExtensionsIsMutable();
            this.extensions.setField(fieldDescriptor, obj);
            onChanged();
            return this;
        }

        public BuilderType clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return (ExtendableBuilder) super.clearField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            ensureExtensionsIsMutable();
            this.extensions.clearField(fieldDescriptor);
            onChanged();
            return this;
        }

        public BuilderType setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (ExtendableBuilder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
            verifyContainingType(fieldDescriptor);
            ensureExtensionsIsMutable();
            this.extensions.setRepeatedField(fieldDescriptor, i, obj);
            onChanged();
            return this;
        }

        public BuilderType addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (ExtendableBuilder) super.addRepeatedField(fieldDescriptor, obj);
            }
            verifyContainingType(fieldDescriptor);
            ensureExtensionsIsMutable();
            this.extensions.addRepeatedField(fieldDescriptor, obj);
            onChanged();
            return this;
        }

        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                return DynamicMessage.newBuilder(fieldDescriptor.getMessageType());
            }
            return super.newBuilderForField(fieldDescriptor);
        }

        /* access modifiers changed from: protected */
        public final void mergeExtensionFields(ExtendableMessage extendableMessage) {
            if (extendableMessage.extensions != null) {
                ensureExtensionsIsMutable();
                this.extensions.mergeFrom(extendableMessage.extensions);
                onChanged();
            }
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }

    /* access modifiers changed from: private */
    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    /* access modifiers changed from: private */
    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* access modifiers changed from: protected */
    public MapField internalGetMapField(int i) {
        throw new RuntimeException("No map fields found in " + getClass().getName());
    }

    public static final class FieldAccessorTable {
        private String[] camelCaseNames;
        /* access modifiers changed from: private */
        public final Descriptors.Descriptor descriptor;
        private final FieldAccessor[] fields;
        private volatile boolean initialized;
        private final OneofAccessor[] oneofs;

        private interface FieldAccessor {
            void addRepeated(Builder builder, Object obj);

            void clear(Builder builder);

            Object get(Builder builder);

            Object get(GeneratedMessageV3 generatedMessageV3);

            Message.Builder getBuilder(Builder builder);

            Object getRaw(Builder builder);

            Object getRaw(GeneratedMessageV3 generatedMessageV3);

            Object getRepeated(Builder builder, int i);

            Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i);

            Message.Builder getRepeatedBuilder(Builder builder, int i);

            int getRepeatedCount(Builder builder);

            int getRepeatedCount(GeneratedMessageV3 generatedMessageV3);

            Object getRepeatedRaw(Builder builder, int i);

            Object getRepeatedRaw(GeneratedMessageV3 generatedMessageV3, int i);

            boolean has(Builder builder);

            boolean has(GeneratedMessageV3 generatedMessageV3);

            Message.Builder newBuilder();

            void set(Builder builder, Object obj);

            void setRepeated(Builder builder, int i, Object obj);
        }

        public FieldAccessorTable(Descriptors.Descriptor descriptor2, String[] strArr, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2) {
            this(descriptor2, strArr);
            ensureFieldAccessorsInitialized(cls, cls2);
        }

        public FieldAccessorTable(Descriptors.Descriptor descriptor2, String[] strArr) {
            this.descriptor = descriptor2;
            this.camelCaseNames = strArr;
            this.fields = new FieldAccessor[descriptor2.getFields().size()];
            this.oneofs = new OneofAccessor[descriptor2.getOneofs().size()];
            this.initialized = false;
        }

        public FieldAccessorTable ensureFieldAccessorsInitialized(Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2) {
            if (this.initialized) {
                return this;
            }
            synchronized (this) {
                if (this.initialized) {
                    return this;
                }
                int length = this.fields.length;
                int i = 0;
                while (true) {
                    String str = null;
                    if (i >= length) {
                        break;
                    }
                    Descriptors.FieldDescriptor fieldDescriptor = this.descriptor.getFields().get(i);
                    if (fieldDescriptor.getContainingOneof() != null) {
                        str = this.camelCaseNames[fieldDescriptor.getContainingOneof().getIndex() + length];
                    }
                    String str2 = str;
                    if (fieldDescriptor.isRepeated()) {
                        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            if (fieldDescriptor.isMapField()) {
                                this.fields[i] = new MapFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                            } else {
                                this.fields[i] = new RepeatedMessageFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                            }
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                            this.fields[i] = new RepeatedEnumFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                        } else {
                            this.fields[i] = new RepeatedFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                        }
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        this.fields[i] = new SingularMessageFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str2);
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                        this.fields[i] = new SingularEnumFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str2);
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
                        this.fields[i] = new SingularStringFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str2);
                    } else {
                        this.fields[i] = new SingularFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str2);
                    }
                    i++;
                }
                int length2 = this.oneofs.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.oneofs[i2] = new OneofAccessor(this.descriptor, i2, this.camelCaseNames[i2 + length], cls, cls2);
                }
                this.initialized = true;
                this.camelCaseNames = null;
                return this;
            }
        }

        /* access modifiers changed from: private */
        public FieldAccessor getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.descriptor) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            } else if (!fieldDescriptor.isExtension()) {
                return this.fields[fieldDescriptor.getIndex()];
            } else {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
        }

        /* access modifiers changed from: private */
        public OneofAccessor getOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            if (oneofDescriptor.getContainingType() == this.descriptor) {
                return this.oneofs[oneofDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        private static class OneofAccessor {
            private final Method caseMethod;
            private final Method caseMethodBuilder;
            private final Method clearMethod;
            private final Descriptors.Descriptor descriptor;
            private final Descriptors.FieldDescriptor fieldDescriptor;

            OneofAccessor(Descriptors.Descriptor descriptor2, int i, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2) {
                this.descriptor = descriptor2;
                Descriptors.OneofDescriptor oneofDescriptor = descriptor2.getOneofs().get(i);
                if (oneofDescriptor.isSynthetic()) {
                    this.caseMethod = null;
                    this.caseMethodBuilder = null;
                    this.fieldDescriptor = oneofDescriptor.getFields().get(0);
                } else {
                    this.caseMethod = GeneratedMessageV3.getMethodOrDie(cls, Constants.GET + str + "Case", new Class[0]);
                    this.caseMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str + "Case", new Class[0]);
                    this.fieldDescriptor = null;
                }
                this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, "clear" + str, new Class[0]);
            }

            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                Descriptors.FieldDescriptor fieldDescriptor2 = this.fieldDescriptor;
                if (fieldDescriptor2 != null) {
                    return generatedMessageV3.hasField(fieldDescriptor2);
                }
                return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber() != 0;
            }

            public boolean has(Builder builder) {
                Descriptors.FieldDescriptor fieldDescriptor2 = this.fieldDescriptor;
                if (fieldDescriptor2 != null) {
                    return builder.hasField(fieldDescriptor2);
                }
                return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber() != 0;
            }

            public Descriptors.FieldDescriptor get(GeneratedMessageV3 generatedMessageV3) {
                Descriptors.FieldDescriptor fieldDescriptor2 = this.fieldDescriptor;
                if (fieldDescriptor2 == null) {
                    int number = ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber();
                    if (number > 0) {
                        return this.descriptor.findFieldByNumber(number);
                    }
                    return null;
                } else if (generatedMessageV3.hasField(fieldDescriptor2)) {
                    return this.fieldDescriptor;
                } else {
                    return null;
                }
            }

            public Descriptors.FieldDescriptor get(Builder builder) {
                Descriptors.FieldDescriptor fieldDescriptor2 = this.fieldDescriptor;
                if (fieldDescriptor2 == null) {
                    int number = ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber();
                    if (number > 0) {
                        return this.descriptor.findFieldByNumber(number);
                    }
                    return null;
                } else if (builder.hasField(fieldDescriptor2)) {
                    return this.fieldDescriptor;
                } else {
                    return null;
                }
            }

            public void clear(Builder builder) {
                Object unused = GeneratedMessageV3.invokeOrDie(this.clearMethod, builder, new Object[0]);
            }
        }

        private static class SingularFieldAccessor implements FieldAccessor {
            protected final Descriptors.FieldDescriptor field;
            protected final boolean hasHasMethod;
            protected final MethodInvoker invoker;
            protected final boolean isOneofField;
            protected final Class<?> type;

            private interface MethodInvoker {
                void clear(Builder<?> builder);

                Object get(Builder<?> builder);

                Object get(GeneratedMessageV3 generatedMessageV3);

                int getOneofFieldNumber(Builder<?> builder);

                int getOneofFieldNumber(GeneratedMessageV3 generatedMessageV3);

                boolean has(Builder<?> builder);

                boolean has(GeneratedMessageV3 generatedMessageV3);

                void set(Builder<?> builder, Object obj);
            }

            static MethodInvoker getMethodInvoker(ReflectionInvoker reflectionInvoker) {
                return reflectionInvoker;
            }

            private static final class ReflectionInvoker implements MethodInvoker {
                protected final Method caseMethod;
                protected final Method caseMethodBuilder;
                protected final Method clearMethod;
                protected final Method getMethod;
                protected final Method getMethodBuilder;
                protected final Method hasMethod;
                protected final Method hasMethodBuilder;
                protected final Method setMethod;

                ReflectionInvoker(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2, String str2, boolean z, boolean z2) {
                    Method method;
                    Method method2;
                    Method method3;
                    this.getMethod = GeneratedMessageV3.getMethodOrDie(cls, Constants.GET + str, new Class[0]);
                    this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str, new Class[0]);
                    this.setMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str, this.getMethod.getReturnType());
                    Method method4 = null;
                    if (z2) {
                        method = GeneratedMessageV3.getMethodOrDie(cls, "has" + str, new Class[0]);
                    } else {
                        method = null;
                    }
                    this.hasMethod = method;
                    if (z2) {
                        method2 = GeneratedMessageV3.getMethodOrDie(cls2, "has" + str, new Class[0]);
                    } else {
                        method2 = null;
                    }
                    this.hasMethodBuilder = method2;
                    this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, "clear" + str, new Class[0]);
                    if (z) {
                        method3 = GeneratedMessageV3.getMethodOrDie(cls, Constants.GET + str2 + "Case", new Class[0]);
                    } else {
                        method3 = null;
                    }
                    this.caseMethod = method3;
                    if (z) {
                        method4 = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str2 + "Case", new Class[0]);
                    }
                    this.caseMethodBuilder = method4;
                }

                public Object get(GeneratedMessageV3 generatedMessageV3) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethod, generatedMessageV3, new Object[0]);
                }

                public Object get(Builder<?> builder) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, builder, new Object[0]);
                }

                public int getOneofFieldNumber(GeneratedMessageV3 generatedMessageV3) {
                    return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber();
                }

                public int getOneofFieldNumber(Builder<?> builder) {
                    return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber();
                }

                public void set(Builder<?> builder, Object obj) {
                    Object unused = GeneratedMessageV3.invokeOrDie(this.setMethod, builder, obj);
                }

                public boolean has(GeneratedMessageV3 generatedMessageV3) {
                    return ((Boolean) GeneratedMessageV3.invokeOrDie(this.hasMethod, generatedMessageV3, new Object[0])).booleanValue();
                }

                public boolean has(Builder<?> builder) {
                    return ((Boolean) GeneratedMessageV3.invokeOrDie(this.hasMethodBuilder, builder, new Object[0])).booleanValue();
                }

                public void clear(Builder<?> builder) {
                    Object unused = GeneratedMessageV3.invokeOrDie(this.clearMethod, builder, new Object[0]);
                }
            }

            SingularFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2, String str2) {
                this.isOneofField = fieldDescriptor.getContainingOneof() != null && !fieldDescriptor.getContainingOneof().isSynthetic();
                boolean z = fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO2 || fieldDescriptor.hasOptionalKeyword() || (!this.isOneofField && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE);
                this.hasHasMethod = z;
                ReflectionInvoker reflectionInvoker = new ReflectionInvoker(fieldDescriptor, str, cls, cls2, str2, this.isOneofField, z);
                this.field = fieldDescriptor;
                this.type = reflectionInvoker.getMethod.getReturnType();
                this.invoker = getMethodInvoker(reflectionInvoker);
            }

            public Object get(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.get(generatedMessageV3);
            }

            public Object get(Builder builder) {
                return this.invoker.get((Builder<?>) builder);
            }

            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            public Object getRaw(Builder builder) {
                return get(builder);
            }

            public void set(Builder builder, Object obj) {
                this.invoker.set(builder, obj);
            }

            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            public Object getRepeatedRaw(GeneratedMessageV3 generatedMessageV3, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldRaw() called on a singular field.");
            }

            public Object getRepeated(Builder builder, int i) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            public Object getRepeatedRaw(Builder builder, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldRaw() called on a singular field.");
            }

            public void setRepeated(Builder builder, int i, Object obj) {
                throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
            }

            public void addRepeated(Builder builder, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                if (this.hasHasMethod) {
                    return this.invoker.has(generatedMessageV3);
                }
                if (!this.isOneofField) {
                    return !get(generatedMessageV3).equals(this.field.getDefaultValue());
                }
                if (this.invoker.getOneofFieldNumber(generatedMessageV3) == this.field.getNumber()) {
                    return true;
                }
                return false;
            }

            public boolean has(Builder builder) {
                if (this.hasHasMethod) {
                    return this.invoker.has((Builder<?>) builder);
                }
                if (!this.isOneofField) {
                    return !get(builder).equals(this.field.getDefaultValue());
                }
                if (this.invoker.getOneofFieldNumber((Builder<?>) builder) == this.field.getNumber()) {
                    return true;
                }
                return false;
            }

            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            public int getRepeatedCount(Builder builder) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            public void clear(Builder builder) {
                this.invoker.clear(builder);
            }

            public Message.Builder newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            public Message.Builder getBuilder(Builder builder) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            public Message.Builder getRepeatedBuilder(Builder builder, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
        }

        private static class RepeatedFieldAccessor implements FieldAccessor {
            protected final MethodInvoker invoker;
            protected final Class type;

            interface MethodInvoker {
                void addRepeated(Builder<?> builder, Object obj);

                void clear(Builder<?> builder);

                Object get(Builder<?> builder);

                Object get(GeneratedMessageV3 generatedMessageV3);

                Object getRepeated(Builder<?> builder, int i);

                Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i);

                int getRepeatedCount(Builder<?> builder);

                int getRepeatedCount(GeneratedMessageV3 generatedMessageV3);

                void setRepeated(Builder<?> builder, int i, Object obj);
            }

            static MethodInvoker getMethodInvoker(ReflectionInvoker reflectionInvoker) {
                return reflectionInvoker;
            }

            private static final class ReflectionInvoker implements MethodInvoker {
                protected final Method addRepeatedMethod;
                protected final Method clearMethod;
                protected final Method getCountMethod;
                protected final Method getCountMethodBuilder;
                protected final Method getMethod;
                protected final Method getMethodBuilder;
                protected final Method getRepeatedMethod;
                protected final Method getRepeatedMethodBuilder;
                protected final Method setRepeatedMethod;

                ReflectionInvoker(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2) {
                    this.getMethod = GeneratedMessageV3.getMethodOrDie(cls, Constants.GET + str + "List", new Class[0]);
                    this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str + "List", new Class[0]);
                    StringBuilder sb = new StringBuilder();
                    sb.append(Constants.GET);
                    sb.append(str);
                    this.getRepeatedMethod = GeneratedMessageV3.getMethodOrDie(cls, sb.toString(), Integer.TYPE);
                    this.getRepeatedMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str, Integer.TYPE);
                    Class<?> returnType = this.getRepeatedMethod.getReturnType();
                    this.setRepeatedMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str, Integer.TYPE, returnType);
                    this.addRepeatedMethod = GeneratedMessageV3.getMethodOrDie(cls2, "add" + str, returnType);
                    this.getCountMethod = GeneratedMessageV3.getMethodOrDie(cls, Constants.GET + str + "Count", new Class[0]);
                    this.getCountMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str + "Count", new Class[0]);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("clear");
                    sb2.append(str);
                    this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, sb2.toString(), new Class[0]);
                }

                public Object get(GeneratedMessageV3 generatedMessageV3) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethod, generatedMessageV3, new Object[0]);
                }

                public Object get(Builder<?> builder) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, builder, new Object[0]);
                }

                public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                    return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethod, generatedMessageV3, Integer.valueOf(i));
                }

                public Object getRepeated(Builder<?> builder, int i) {
                    return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethodBuilder, builder, Integer.valueOf(i));
                }

                public void setRepeated(Builder<?> builder, int i, Object obj) {
                    Object unused = GeneratedMessageV3.invokeOrDie(this.setRepeatedMethod, builder, Integer.valueOf(i), obj);
                }

                public void addRepeated(Builder<?> builder, Object obj) {
                    Object unused = GeneratedMessageV3.invokeOrDie(this.addRepeatedMethod, builder, obj);
                }

                public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                    return ((Integer) GeneratedMessageV3.invokeOrDie(this.getCountMethod, generatedMessageV3, new Object[0])).intValue();
                }

                public int getRepeatedCount(Builder<?> builder) {
                    return ((Integer) GeneratedMessageV3.invokeOrDie(this.getCountMethodBuilder, builder, new Object[0])).intValue();
                }

                public void clear(Builder<?> builder) {
                    Object unused = GeneratedMessageV3.invokeOrDie(this.clearMethod, builder, new Object[0]);
                }
            }

            RepeatedFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2) {
                ReflectionInvoker reflectionInvoker = new ReflectionInvoker(fieldDescriptor, str, cls, cls2);
                this.type = reflectionInvoker.getRepeatedMethod.getReturnType();
                this.invoker = getMethodInvoker(reflectionInvoker);
            }

            public Object get(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.get(generatedMessageV3);
            }

            public Object get(Builder builder) {
                return this.invoker.get((Builder<?>) builder);
            }

            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            public Object getRaw(Builder builder) {
                return get(builder);
            }

            public void set(Builder builder, Object obj) {
                clear(builder);
                for (Object addRepeated : (List) obj) {
                    addRepeated(builder, addRepeated);
                }
            }

            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                return this.invoker.getRepeated(generatedMessageV3, i);
            }

            public Object getRepeated(Builder builder, int i) {
                return this.invoker.getRepeated((Builder<?>) builder, i);
            }

            public Object getRepeatedRaw(GeneratedMessageV3 generatedMessageV3, int i) {
                return getRepeated(generatedMessageV3, i);
            }

            public Object getRepeatedRaw(Builder builder, int i) {
                return getRepeated(builder, i);
            }

            public void setRepeated(Builder builder, int i, Object obj) {
                this.invoker.setRepeated(builder, i, obj);
            }

            public void addRepeated(Builder builder, Object obj) {
                this.invoker.addRepeated(builder, obj);
            }

            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            public boolean has(Builder builder) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.getRepeatedCount(generatedMessageV3);
            }

            public int getRepeatedCount(Builder builder) {
                return this.invoker.getRepeatedCount((Builder<?>) builder);
            }

            public void clear(Builder builder) {
                this.invoker.clear(builder);
            }

            public Message.Builder newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            public Message.Builder getBuilder(Builder builder) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            public Message.Builder getRepeatedBuilder(Builder builder, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
        }

        private static class MapFieldAccessor implements FieldAccessor {
            private final Descriptors.FieldDescriptor field;
            private final Message mapEntryMessageDefaultInstance;

            MapFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2) {
                this.field = fieldDescriptor;
                this.mapEntryMessageDefaultInstance = getMapField((GeneratedMessageV3) GeneratedMessageV3.invokeOrDie(GeneratedMessageV3.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), (Object) null, new Object[0])).getMapEntryMessageDefaultInstance();
            }

            private MapField<?, ?> getMapField(GeneratedMessageV3 generatedMessageV3) {
                return generatedMessageV3.internalGetMapField(this.field.getNumber());
            }

            private MapField<?, ?> getMapField(Builder builder) {
                return builder.internalGetMapField(this.field.getNumber());
            }

            private MapField<?, ?> getMutableMapField(Builder builder) {
                return builder.internalGetMutableMapField(this.field.getNumber());
            }

            private Message coerceType(Message message) {
                if (message == null) {
                    return null;
                }
                if (this.mapEntryMessageDefaultInstance.getClass().isInstance(message)) {
                    return message;
                }
                return this.mapEntryMessageDefaultInstance.toBuilder().mergeFrom(message).build();
            }

            public Object get(GeneratedMessageV3 generatedMessageV3) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < getRepeatedCount(generatedMessageV3); i++) {
                    arrayList.add(getRepeated(generatedMessageV3, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            public Object get(Builder builder) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < getRepeatedCount(builder); i++) {
                    arrayList.add(getRepeated(builder, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            public Object getRaw(Builder builder) {
                return get(builder);
            }

            public void set(Builder builder, Object obj) {
                clear(builder);
                for (Object addRepeated : (List) obj) {
                    addRepeated(builder, addRepeated);
                }
            }

            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                return getMapField(generatedMessageV3).getList().get(i);
            }

            public Object getRepeated(Builder builder, int i) {
                return getMapField(builder).getList().get(i);
            }

            public Object getRepeatedRaw(GeneratedMessageV3 generatedMessageV3, int i) {
                return getRepeated(generatedMessageV3, i);
            }

            public Object getRepeatedRaw(Builder builder, int i) {
                return getRepeated(builder, i);
            }

            public void setRepeated(Builder builder, int i, Object obj) {
                getMutableMapField(builder).getMutableList().set(i, coerceType((Message) obj));
            }

            public void addRepeated(Builder builder, Object obj) {
                getMutableMapField(builder).getMutableList().add(coerceType((Message) obj));
            }

            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            public boolean has(Builder builder) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                return getMapField(generatedMessageV3).getList().size();
            }

            public int getRepeatedCount(Builder builder) {
                return getMapField(builder).getList().size();
            }

            public void clear(Builder builder) {
                getMutableMapField(builder).getMutableList().clear();
            }

            public Message.Builder newBuilder() {
                return this.mapEntryMessageDefaultInstance.newBuilderForType();
            }

            public Message.Builder getBuilder(Builder builder) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            public Message.Builder getRepeatedBuilder(Builder builder, int i) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }
        }

        private static final class SingularEnumFieldAccessor extends SingularFieldAccessor {
            private Descriptors.EnumDescriptor enumDescriptor;
            private Method getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor", new Class[0]);
            private Method getValueMethod;
            private Method getValueMethodBuilder;
            private Method setValueMethod;
            private boolean supportUnknownEnumValue;
            private Method valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, "valueOf", Descriptors.EnumValueDescriptor.class);

            SingularEnumFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.enumDescriptor = fieldDescriptor.getEnumType();
                boolean supportsUnknownEnumValue = fieldDescriptor.getFile().supportsUnknownEnumValue();
                this.supportUnknownEnumValue = supportsUnknownEnumValue;
                if (supportsUnknownEnumValue) {
                    this.getValueMethod = GeneratedMessageV3.getMethodOrDie(cls, Constants.GET + str + "Value", new Class[0]);
                    this.getValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str + "Value", new Class[0]);
                    this.setValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str + "Value", Integer.TYPE);
                }
            }

            public Object get(GeneratedMessageV3 generatedMessageV3) {
                if (!this.supportUnknownEnumValue) {
                    return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(generatedMessageV3), new Object[0]);
                }
                return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getValueMethod, generatedMessageV3, new Object[0])).intValue());
            }

            public Object get(Builder builder) {
                if (!this.supportUnknownEnumValue) {
                    return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(builder), new Object[0]);
                }
                return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getValueMethodBuilder, builder, new Object[0])).intValue());
            }

            public void set(Builder builder, Object obj) {
                if (this.supportUnknownEnumValue) {
                    Object unused = GeneratedMessageV3.invokeOrDie(this.setValueMethod, builder, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                    return;
                }
                super.set(builder, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, (Object) null, obj));
            }
        }

        private static final class RepeatedEnumFieldAccessor extends RepeatedFieldAccessor {
            private Method addRepeatedValueMethod;
            private Descriptors.EnumDescriptor enumDescriptor;
            private Method getRepeatedValueMethod;
            private Method getRepeatedValueMethodBuilder;
            private final Method getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor", new Class[0]);
            private Method setRepeatedValueMethod;
            private boolean supportUnknownEnumValue;
            private final Method valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, "valueOf", Descriptors.EnumValueDescriptor.class);

            RepeatedEnumFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.enumDescriptor = fieldDescriptor.getEnumType();
                boolean supportsUnknownEnumValue = fieldDescriptor.getFile().supportsUnknownEnumValue();
                this.supportUnknownEnumValue = supportsUnknownEnumValue;
                if (supportsUnknownEnumValue) {
                    this.getRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls, Constants.GET + str + "Value", Integer.TYPE);
                    this.getRepeatedValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str + "Value", Integer.TYPE);
                    this.setRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str + "Value", Integer.TYPE, Integer.TYPE);
                    this.addRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, "add" + str + "Value", Integer.TYPE);
                }
            }

            public Object get(GeneratedMessageV3 generatedMessageV3) {
                ArrayList arrayList = new ArrayList();
                int repeatedCount = getRepeatedCount(generatedMessageV3);
                for (int i = 0; i < repeatedCount; i++) {
                    arrayList.add(getRepeated(generatedMessageV3, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            public Object get(Builder builder) {
                ArrayList arrayList = new ArrayList();
                int repeatedCount = getRepeatedCount(builder);
                for (int i = 0; i < repeatedCount; i++) {
                    arrayList.add(getRepeated(builder, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                if (!this.supportUnknownEnumValue) {
                    return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(generatedMessageV3, i), new Object[0]);
                }
                return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethod, generatedMessageV3, Integer.valueOf(i))).intValue());
            }

            public Object getRepeated(Builder builder, int i) {
                if (!this.supportUnknownEnumValue) {
                    return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(builder, i), new Object[0]);
                }
                return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethodBuilder, builder, Integer.valueOf(i))).intValue());
            }

            public void setRepeated(Builder builder, int i, Object obj) {
                if (this.supportUnknownEnumValue) {
                    Object unused = GeneratedMessageV3.invokeOrDie(this.setRepeatedValueMethod, builder, Integer.valueOf(i), Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                    return;
                }
                super.setRepeated(builder, i, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, (Object) null, obj));
            }

            public void addRepeated(Builder builder, Object obj) {
                if (this.supportUnknownEnumValue) {
                    Object unused = GeneratedMessageV3.invokeOrDie(this.addRepeatedValueMethod, builder, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                    return;
                }
                super.addRepeated(builder, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, (Object) null, obj));
            }
        }

        private static final class SingularStringFieldAccessor extends SingularFieldAccessor {
            private final Method getBytesMethod;
            private final Method getBytesMethodBuilder;
            private final Method setBytesMethodBuilder;

            SingularStringFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.getBytesMethod = GeneratedMessageV3.getMethodOrDie(cls, Constants.GET + str + "Bytes", new Class[0]);
                this.getBytesMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str + "Bytes", new Class[0]);
                this.setBytesMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str + "Bytes", ByteString.class);
            }

            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return GeneratedMessageV3.invokeOrDie(this.getBytesMethod, generatedMessageV3, new Object[0]);
            }

            public Object getRaw(Builder builder) {
                return GeneratedMessageV3.invokeOrDie(this.getBytesMethodBuilder, builder, new Object[0]);
            }

            public void set(Builder builder, Object obj) {
                if (obj instanceof ByteString) {
                    Object unused = GeneratedMessageV3.invokeOrDie(this.setBytesMethodBuilder, builder, obj);
                    return;
                }
                super.set(builder, obj);
            }
        }

        private static final class SingularMessageFieldAccessor extends SingularFieldAccessor {
            private final Method getBuilderMethodBuilder;
            private final Method newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder", new Class[0]);

            SingularMessageFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str + "Builder", new Class[0]);
            }

            private Object coerceType(Object obj) {
                if (this.type.isInstance(obj)) {
                    return obj;
                }
                return ((Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object) null, new Object[0])).mergeFrom((Message) obj).buildPartial();
            }

            public void set(Builder builder, Object obj) {
                super.set(builder, coerceType(obj));
            }

            public Message.Builder newBuilder() {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object) null, new Object[0]);
            }

            public Message.Builder getBuilder(Builder builder) {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, builder, new Object[0]);
            }
        }

        private static final class RepeatedMessageFieldAccessor extends RepeatedFieldAccessor {
            private final Method getBuilderMethodBuilder;
            private final Method newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder", new Class[0]);

            RepeatedMessageFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, Constants.GET + str + "Builder", Integer.TYPE);
            }

            private Object coerceType(Object obj) {
                if (this.type.isInstance(obj)) {
                    return obj;
                }
                return ((Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object) null, new Object[0])).mergeFrom((Message) obj).build();
            }

            public void setRepeated(Builder builder, int i, Object obj) {
                super.setRepeated(builder, i, coerceType(obj));
            }

            public void addRepeated(Builder builder, Object obj) {
                super.addRepeated(builder, coerceType(obj));
            }

            public Message.Builder newBuilder() {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object) null, new Object[0]);
            }

            public Message.Builder getRepeatedBuilder(Builder builder, int i) {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, builder, Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() throws ObjectStreamException {
        return new GeneratedMessageLite.SerializedForm(this);
    }

    /* access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType>, T> Extension<MessageType, T> checkNotLite(ExtensionLite<MessageType, T> extensionLite) {
        if (!extensionLite.isLite()) {
            return (Extension) extensionLite;
        }
        throw new IllegalArgumentException("Expected non-lite extension.");
    }

    protected static int computeStringSize(int i, Object obj) {
        if (obj instanceof String) {
            return CodedOutputStream.computeStringSize(i, (String) obj);
        }
        return CodedOutputStream.computeBytesSize(i, (ByteString) obj);
    }

    protected static int computeStringSizeNoTag(Object obj) {
        if (obj instanceof String) {
            return CodedOutputStream.computeStringSizeNoTag((String) obj);
        }
        return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
    }

    protected static void writeString(CodedOutputStream codedOutputStream, int i, Object obj) throws IOException {
        if (obj instanceof String) {
            codedOutputStream.writeString(i, (String) obj);
        } else {
            codedOutputStream.writeBytes(i, (ByteString) obj);
        }
    }

    protected static void writeStringNoTag(CodedOutputStream codedOutputStream, Object obj) throws IOException {
        if (obj instanceof String) {
            codedOutputStream.writeStringNoTag((String) obj);
        } else {
            codedOutputStream.writeBytesNoTag((ByteString) obj);
        }
    }

    protected static <V> void serializeIntegerMapTo(CodedOutputStream codedOutputStream, MapField<Integer, V> mapField, MapEntry<Integer, V> mapEntry, int i) throws IOException {
        Map<Integer, V> map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i);
            return;
        }
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            codedOutputStream.writeMessage(i, mapEntry.newBuilderForType().setKey(Integer.valueOf(i4)).setValue(map.get(Integer.valueOf(i4))).build());
        }
    }

    protected static <V> void serializeLongMapTo(CodedOutputStream codedOutputStream, MapField<Long, V> mapField, MapEntry<Long, V> mapEntry, int i) throws IOException {
        Map<Long, V> map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i);
            return;
        }
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            codedOutputStream.writeMessage(i, mapEntry.newBuilderForType().setKey(Long.valueOf(j)).setValue(map.get(Long.valueOf(j))).build());
        }
    }

    protected static <V> void serializeStringMapTo(CodedOutputStream codedOutputStream, MapField<String, V> mapField, MapEntry<String, V> mapEntry, int i) throws IOException {
        Map<String, V> map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i);
            return;
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            codedOutputStream.writeMessage(i, mapEntry.newBuilderForType().setKey(str).setValue(map.get(str)).build());
        }
    }

    protected static <V> void serializeBooleanMapTo(CodedOutputStream codedOutputStream, MapField<Boolean, V> mapField, MapEntry<Boolean, V> mapEntry, int i) throws IOException {
        Map<Boolean, V> map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i);
            return;
        }
        maybeSerializeBooleanEntryTo(codedOutputStream, map, mapEntry, i, false);
        maybeSerializeBooleanEntryTo(codedOutputStream, map, mapEntry, i, true);
    }

    private static <V> void maybeSerializeBooleanEntryTo(CodedOutputStream codedOutputStream, Map<Boolean, V> map, MapEntry<Boolean, V> mapEntry, int i, boolean z) throws IOException {
        if (map.containsKey(Boolean.valueOf(z))) {
            codedOutputStream.writeMessage(i, mapEntry.newBuilderForType().setKey(Boolean.valueOf(z)).setValue(map.get(Boolean.valueOf(z))).build());
        }
    }

    private static <K, V> void serializeMapTo(CodedOutputStream codedOutputStream, Map<K, V> map, MapEntry<K, V> mapEntry, int i) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            codedOutputStream.writeMessage(i, mapEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
        }
    }
}
