package com.explorestack.protobuf.compiler;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.DescriptorProtos;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolMessageEnum;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PluginProtos {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%google/protobuf/compiler/plugin.proto\u0012\u0018google.protobuf.compiler\u001a google/protobuf/descriptor.proto\"F\n\u0007Version\u0012\r\n\u0005major\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005minor\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005patch\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006suffix\u0018\u0004 \u0001(\t\"º\u0001\n\u0014CodeGeneratorRequest\u0012\u0018\n\u0010file_to_generate\u0018\u0001 \u0003(\t\u0012\u0011\n\tparameter\u0018\u0002 \u0001(\t\u00128\n\nproto_file\u0018\u000f \u0003(\u000b2$.google.protobuf.FileDescriptorProto\u0012;\n\u0010compiler_version\u0018\u0003 \u0001(\u000b2!.google.protobuf.compiler.Version\"Á\u0002\n\u0015CodeGeneratorResponse\u0012\r\n\u0005error\u0018\u0001 \u0001(\t\u0012\u001a\n\u0012supported_features\u0018\u0002 \u0001(\u0004\u0012B\n\u0004file\u0018\u000f \u0003(\u000b24.google.protobuf.compiler.CodeGeneratorResponse.File\u001a\n\u0004File\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0017\n\u000finsertion_point\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007content\u0018\u000f \u0001(\t\u0012?\n\u0013generated_code_info\u0018\u0010 \u0001(\u000b2\".google.protobuf.GeneratedCodeInfo\"8\n\u0007Feature\u0012\u0010\n\fFEATURE_NONE\u0010\u0000\u0012\u001b\n\u0017FEATURE_PROTO3_OPTIONAL\u0010\u0001BW\n\u001ccom.google.protobuf.compilerB\fPluginProtosZ)google.golang.org/protobuf/types/pluginpb"}, new Descriptors.FileDescriptor[]{DescriptorProtos.getDescriptor()});
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_google_protobuf_compiler_Version_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_Version_fieldAccessorTable;

    public interface CodeGeneratorRequestOrBuilder extends MessageOrBuilder {
        Version getCompilerVersion();

        VersionOrBuilder getCompilerVersionOrBuilder();

        String getFileToGenerate(int i);

        ByteString getFileToGenerateBytes(int i);

        int getFileToGenerateCount();

        List<String> getFileToGenerateList();

        String getParameter();

        ByteString getParameterBytes();

        DescriptorProtos.FileDescriptorProto getProtoFile(int i);

        int getProtoFileCount();

        List<DescriptorProtos.FileDescriptorProto> getProtoFileList();

        DescriptorProtos.FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int i);

        List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList();

        boolean hasCompilerVersion();

        boolean hasParameter();
    }

    public interface CodeGeneratorResponseOrBuilder extends MessageOrBuilder {
        String getError();

        ByteString getErrorBytes();

        CodeGeneratorResponse.File getFile(int i);

        int getFileCount();

        List<CodeGeneratorResponse.File> getFileList();

        CodeGeneratorResponse.FileOrBuilder getFileOrBuilder(int i);

        List<? extends CodeGeneratorResponse.FileOrBuilder> getFileOrBuilderList();

        long getSupportedFeatures();

        boolean hasError();

        boolean hasSupportedFeatures();
    }

    public interface VersionOrBuilder extends MessageOrBuilder {
        int getMajor();

        int getMinor();

        int getPatch();

        String getSuffix();

        ByteString getSuffixBytes();

        boolean hasMajor();

        boolean hasMinor();

        boolean hasPatch();

        boolean hasSuffix();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private PluginProtos() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class Version extends GeneratedMessageV3 implements VersionOrBuilder {
        private static final Version DEFAULT_INSTANCE = new Version();
        public static final int MAJOR_FIELD_NUMBER = 1;
        public static final int MINOR_FIELD_NUMBER = 2;
        @Deprecated
        public static final Parser<Version> PARSER = new AbstractParser<Version>() {
            public Version parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Version(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PATCH_FIELD_NUMBER = 3;
        public static final int SUFFIX_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int major_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public int minor_;
        /* access modifiers changed from: private */
        public int patch_;
        /* access modifiers changed from: private */
        public volatile Object suffix_;

        private Version(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Version() {
            this.memoizedIsInitialized = -1;
            this.suffix_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Version();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Version(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.major_ = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.bitField0_ |= 2;
                                this.minor_ = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                this.bitField0_ |= 4;
                                this.patch_ = codedInputStream.readInt32();
                            } else if (readTag == 34) {
                                ByteString readBytes = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.suffix_ = readBytes;
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.internal_static_google_protobuf_compiler_Version_fieldAccessorTable.ensureFieldAccessorsInitialized(Version.class, Builder.class);
        }

        public boolean hasMajor() {
            return (this.bitField0_ & 1) != 0;
        }

        public int getMajor() {
            return this.major_;
        }

        public boolean hasMinor() {
            return (this.bitField0_ & 2) != 0;
        }

        public int getMinor() {
            return this.minor_;
        }

        public boolean hasPatch() {
            return (this.bitField0_ & 4) != 0;
        }

        public int getPatch() {
            return this.patch_;
        }

        public boolean hasSuffix() {
            return (this.bitField0_ & 8) != 0;
        }

        public String getSuffix() {
            Object obj = this.suffix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.suffix_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getSuffixBytes() {
            Object obj = this.suffix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.suffix_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeInt32(1, this.major_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeInt32(2, this.minor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeInt32(3, this.patch_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.suffix_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, this.major_);
            }
            if ((this.bitField0_ & 2) != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, this.minor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                i2 += CodedOutputStream.computeInt32Size(3, this.patch_);
            }
            if ((this.bitField0_ & 8) != 0) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.suffix_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Version)) {
                return super.equals(obj);
            }
            Version version = (Version) obj;
            if (hasMajor() != version.hasMajor()) {
                return false;
            }
            if ((hasMajor() && getMajor() != version.getMajor()) || hasMinor() != version.hasMinor()) {
                return false;
            }
            if ((hasMinor() && getMinor() != version.getMinor()) || hasPatch() != version.hasPatch()) {
                return false;
            }
            if ((hasPatch() && getPatch() != version.getPatch()) || hasSuffix() != version.hasSuffix()) {
                return false;
            }
            if ((!hasSuffix() || getSuffix().equals(version.getSuffix())) && this.unknownFields.equals(version.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (hasMajor()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getMajor();
            }
            if (hasMinor()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getMinor();
            }
            if (hasPatch()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getPatch();
            }
            if (hasSuffix()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getSuffix().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Version parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Version parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Version parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Version parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Version parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Version parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Version parseFrom(InputStream inputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Version parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Version parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Version parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Version) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Version parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Version parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Version version) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(version);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VersionOrBuilder {
            private int bitField0_;
            private int major_;
            private int minor_;
            private int patch_;
            private Object suffix_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.internal_static_google_protobuf_compiler_Version_fieldAccessorTable.ensureFieldAccessorsInitialized(Version.class, Builder.class);
            }

            private Builder() {
                this.suffix_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.suffix_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = Version.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.major_ = 0;
                int i = this.bitField0_ & -2;
                this.bitField0_ = i;
                this.minor_ = 0;
                int i2 = i & -3;
                this.bitField0_ = i2;
                this.patch_ = 0;
                int i3 = i2 & -5;
                this.bitField0_ = i3;
                this.suffix_ = "";
                this.bitField0_ = i3 & -9;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
            }

            public Version getDefaultInstanceForType() {
                return Version.getDefaultInstance();
            }

            public Version build() {
                Version buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Version buildPartial() {
                int i;
                Version version = new Version((GeneratedMessageV3.Builder) this);
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    int unused = version.major_ = this.major_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    int unused2 = version.minor_ = this.minor_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    int unused3 = version.patch_ = this.patch_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    i |= 8;
                }
                Object unused4 = version.suffix_ = this.suffix_;
                int unused5 = version.bitField0_ = i;
                onBuilt();
                return version;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof Version) {
                    return mergeFrom((Version) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Version version) {
                if (version == Version.getDefaultInstance()) {
                    return this;
                }
                if (version.hasMajor()) {
                    setMajor(version.getMajor());
                }
                if (version.hasMinor()) {
                    setMinor(version.getMinor());
                }
                if (version.hasPatch()) {
                    setPatch(version.getPatch());
                }
                if (version.hasSuffix()) {
                    this.bitField0_ |= 8;
                    this.suffix_ = version.suffix_;
                    onChanged();
                }
                mergeUnknownFields(version.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.compiler.PluginProtos.Version.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser<com.explorestack.protobuf.compiler.PluginProtos$Version> r1 = com.explorestack.protobuf.compiler.PluginProtos.Version.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.explorestack.protobuf.compiler.PluginProtos$Version r3 = (com.explorestack.protobuf.compiler.PluginProtos.Version) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.explorestack.protobuf.compiler.PluginProtos.Version) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.explorestack.protobuf.compiler.PluginProtos$Version r4 = (com.explorestack.protobuf.compiler.PluginProtos.Version) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.explorestack.protobuf.compiler.PluginProtos.Version) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.compiler.PluginProtos.Version.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.compiler.PluginProtos$Version$Builder");
            }

            public boolean hasMajor() {
                return (this.bitField0_ & 1) != 0;
            }

            public int getMajor() {
                return this.major_;
            }

            public Builder setMajor(int i) {
                this.bitField0_ |= 1;
                this.major_ = i;
                onChanged();
                return this;
            }

            public Builder clearMajor() {
                this.bitField0_ &= -2;
                this.major_ = 0;
                onChanged();
                return this;
            }

            public boolean hasMinor() {
                return (this.bitField0_ & 2) != 0;
            }

            public int getMinor() {
                return this.minor_;
            }

            public Builder setMinor(int i) {
                this.bitField0_ |= 2;
                this.minor_ = i;
                onChanged();
                return this;
            }

            public Builder clearMinor() {
                this.bitField0_ &= -3;
                this.minor_ = 0;
                onChanged();
                return this;
            }

            public boolean hasPatch() {
                return (this.bitField0_ & 4) != 0;
            }

            public int getPatch() {
                return this.patch_;
            }

            public Builder setPatch(int i) {
                this.bitField0_ |= 4;
                this.patch_ = i;
                onChanged();
                return this;
            }

            public Builder clearPatch() {
                this.bitField0_ &= -5;
                this.patch_ = 0;
                onChanged();
                return this;
            }

            public boolean hasSuffix() {
                return (this.bitField0_ & 8) != 0;
            }

            public String getSuffix() {
                Object obj = this.suffix_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.suffix_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getSuffixBytes() {
                Object obj = this.suffix_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.suffix_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSuffix(String str) {
                if (str != null) {
                    this.bitField0_ |= 8;
                    this.suffix_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSuffix() {
                this.bitField0_ &= -9;
                this.suffix_ = Version.getDefaultInstance().getSuffix();
                onChanged();
                return this;
            }

            public Builder setSuffixBytes(ByteString byteString) {
                if (byteString != null) {
                    this.bitField0_ |= 8;
                    this.suffix_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Version getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Version> parser() {
            return PARSER;
        }

        public Parser<Version> getParserForType() {
            return PARSER;
        }

        public Version getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CodeGeneratorRequest extends GeneratedMessageV3 implements CodeGeneratorRequestOrBuilder {
        public static final int COMPILER_VERSION_FIELD_NUMBER = 3;
        private static final CodeGeneratorRequest DEFAULT_INSTANCE = new CodeGeneratorRequest();
        public static final int FILE_TO_GENERATE_FIELD_NUMBER = 1;
        public static final int PARAMETER_FIELD_NUMBER = 2;
        @Deprecated
        public static final Parser<CodeGeneratorRequest> PARSER = new AbstractParser<CodeGeneratorRequest>() {
            public CodeGeneratorRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CodeGeneratorRequest(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PROTO_FILE_FIELD_NUMBER = 15;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public Version compilerVersion_;
        /* access modifiers changed from: private */
        public LazyStringList fileToGenerate_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object parameter_;
        /* access modifiers changed from: private */
        public List<DescriptorProtos.FileDescriptorProto> protoFile_;

        private CodeGeneratorRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CodeGeneratorRequest() {
            this.memoizedIsInitialized = -1;
            this.fileToGenerate_ = LazyStringArrayList.EMPTY;
            this.parameter_ = "";
            this.protoFile_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CodeGeneratorRequest();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CodeGeneratorRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                ByteString readBytes = codedInputStream.readBytes();
                                if (!z2 || !true) {
                                    this.fileToGenerate_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.fileToGenerate_.add(readBytes);
                            } else if (readTag == 18) {
                                ByteString readBytes2 = codedInputStream.readBytes();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.parameter_ = readBytes2;
                            } else if (readTag == 26) {
                                Version.Builder builder = (this.bitField0_ & 2) != 0 ? this.compilerVersion_.toBuilder() : null;
                                Version version = (Version) codedInputStream.readMessage(Version.PARSER, extensionRegistryLite);
                                this.compilerVersion_ = version;
                                if (builder != null) {
                                    builder.mergeFrom(version);
                                    this.compilerVersion_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (readTag == 122) {
                                if (!z2 || !true) {
                                    this.protoFile_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.protoFile_.add(codedInputStream.readMessage(DescriptorProtos.FileDescriptorProto.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 && true) {
                            this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CodeGeneratorRequest.class, Builder.class);
        }

        public ProtocolStringList getFileToGenerateList() {
            return this.fileToGenerate_;
        }

        public int getFileToGenerateCount() {
            return this.fileToGenerate_.size();
        }

        public String getFileToGenerate(int i) {
            return (String) this.fileToGenerate_.get(i);
        }

        public ByteString getFileToGenerateBytes(int i) {
            return this.fileToGenerate_.getByteString(i);
        }

        public boolean hasParameter() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getParameter() {
            Object obj = this.parameter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.parameter_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getParameterBytes() {
            Object obj = this.parameter_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.parameter_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public List<DescriptorProtos.FileDescriptorProto> getProtoFileList() {
            return this.protoFile_;
        }

        public List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList() {
            return this.protoFile_;
        }

        public int getProtoFileCount() {
            return this.protoFile_.size();
        }

        public DescriptorProtos.FileDescriptorProto getProtoFile(int i) {
            return this.protoFile_.get(i);
        }

        public DescriptorProtos.FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int i) {
            return this.protoFile_.get(i);
        }

        public boolean hasCompilerVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public Version getCompilerVersion() {
            Version version = this.compilerVersion_;
            return version == null ? Version.getDefaultInstance() : version;
        }

        public VersionOrBuilder getCompilerVersionOrBuilder() {
            Version version = this.compilerVersion_;
            return version == null ? Version.getDefaultInstance() : version;
        }

        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getProtoFileCount(); i++) {
                if (!getProtoFile(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.fileToGenerate_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.fileToGenerate_.getRaw(i));
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.parameter_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(3, getCompilerVersion());
            }
            for (int i2 = 0; i2 < this.protoFile_.size(); i2++) {
                codedOutputStream.writeMessage(15, this.protoFile_.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.fileToGenerate_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.fileToGenerate_.getRaw(i3));
            }
            int size = i2 + 0 + (getFileToGenerateList().size() * 1);
            if ((this.bitField0_ & 1) != 0) {
                size += GeneratedMessageV3.computeStringSize(2, this.parameter_);
            }
            if ((this.bitField0_ & 2) != 0) {
                size += CodedOutputStream.computeMessageSize(3, getCompilerVersion());
            }
            for (int i4 = 0; i4 < this.protoFile_.size(); i4++) {
                size += CodedOutputStream.computeMessageSize(15, this.protoFile_.get(i4));
            }
            int serializedSize = size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeGeneratorRequest)) {
                return super.equals(obj);
            }
            CodeGeneratorRequest codeGeneratorRequest = (CodeGeneratorRequest) obj;
            if (!getFileToGenerateList().equals(codeGeneratorRequest.getFileToGenerateList()) || hasParameter() != codeGeneratorRequest.hasParameter()) {
                return false;
            }
            if ((hasParameter() && !getParameter().equals(codeGeneratorRequest.getParameter())) || !getProtoFileList().equals(codeGeneratorRequest.getProtoFileList()) || hasCompilerVersion() != codeGeneratorRequest.hasCompilerVersion()) {
                return false;
            }
            if ((!hasCompilerVersion() || getCompilerVersion().equals(codeGeneratorRequest.getCompilerVersion())) && this.unknownFields.equals(codeGeneratorRequest.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getFileToGenerateCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getFileToGenerateList().hashCode();
            }
            if (hasParameter()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getParameter().hashCode();
            }
            if (getProtoFileCount() > 0) {
                hashCode = (((hashCode * 37) + 15) * 53) + getProtoFileList().hashCode();
            }
            if (hasCompilerVersion()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getCompilerVersion().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CodeGeneratorRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CodeGeneratorRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CodeGeneratorRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CodeGeneratorRequest codeGeneratorRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(codeGeneratorRequest);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CodeGeneratorRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> compilerVersionBuilder_;
            private Version compilerVersion_;
            private LazyStringList fileToGenerate_;
            private Object parameter_;
            private RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> protoFileBuilder_;
            private List<DescriptorProtos.FileDescriptorProto> protoFile_;

            public static final Descriptors.Descriptor getDescriptor() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CodeGeneratorRequest.class, Builder.class);
            }

            private Builder() {
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.parameter_ = "";
                this.protoFile_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.parameter_ = "";
                this.protoFile_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CodeGeneratorRequest.alwaysUseFieldBuilders) {
                    getProtoFileFieldBuilder();
                    getCompilerVersionFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                int i = this.bitField0_ & -2;
                this.bitField0_ = i;
                this.parameter_ = "";
                this.bitField0_ = i & -3;
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.protoFile_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> singleFieldBuilderV3 = this.compilerVersionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.compilerVersion_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor;
            }

            public CodeGeneratorRequest getDefaultInstanceForType() {
                return CodeGeneratorRequest.getDefaultInstance();
            }

            public CodeGeneratorRequest build() {
                CodeGeneratorRequest buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CodeGeneratorRequest buildPartial() {
                CodeGeneratorRequest codeGeneratorRequest = new CodeGeneratorRequest((GeneratedMessageV3.Builder) this);
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused = codeGeneratorRequest.fileToGenerate_ = this.fileToGenerate_;
                int i2 = (i & 2) != 0 ? 1 : 0;
                Object unused2 = codeGeneratorRequest.parameter_ = this.parameter_;
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) != 0) {
                        this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                        this.bitField0_ &= -5;
                    }
                    List unused3 = codeGeneratorRequest.protoFile_ = this.protoFile_;
                } else {
                    List unused4 = codeGeneratorRequest.protoFile_ = repeatedFieldBuilderV3.build();
                }
                if ((i & 8) != 0) {
                    SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> singleFieldBuilderV3 = this.compilerVersionBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Version unused5 = codeGeneratorRequest.compilerVersion_ = this.compilerVersion_;
                    } else {
                        Version unused6 = codeGeneratorRequest.compilerVersion_ = singleFieldBuilderV3.build();
                    }
                    i2 |= 2;
                }
                int unused7 = codeGeneratorRequest.bitField0_ = i2;
                onBuilt();
                return codeGeneratorRequest;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CodeGeneratorRequest) {
                    return mergeFrom((CodeGeneratorRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CodeGeneratorRequest codeGeneratorRequest) {
                if (codeGeneratorRequest == CodeGeneratorRequest.getDefaultInstance()) {
                    return this;
                }
                if (!codeGeneratorRequest.fileToGenerate_.isEmpty()) {
                    if (this.fileToGenerate_.isEmpty()) {
                        this.fileToGenerate_ = codeGeneratorRequest.fileToGenerate_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFileToGenerateIsMutable();
                        this.fileToGenerate_.addAll(codeGeneratorRequest.fileToGenerate_);
                    }
                    onChanged();
                }
                if (codeGeneratorRequest.hasParameter()) {
                    this.bitField0_ |= 2;
                    this.parameter_ = codeGeneratorRequest.parameter_;
                    onChanged();
                }
                if (this.protoFileBuilder_ == null) {
                    if (!codeGeneratorRequest.protoFile_.isEmpty()) {
                        if (this.protoFile_.isEmpty()) {
                            this.protoFile_ = codeGeneratorRequest.protoFile_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureProtoFileIsMutable();
                            this.protoFile_.addAll(codeGeneratorRequest.protoFile_);
                        }
                        onChanged();
                    }
                } else if (!codeGeneratorRequest.protoFile_.isEmpty()) {
                    if (this.protoFileBuilder_.isEmpty()) {
                        this.protoFileBuilder_.dispose();
                        RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = null;
                        this.protoFileBuilder_ = null;
                        this.protoFile_ = codeGeneratorRequest.protoFile_;
                        this.bitField0_ &= -5;
                        if (CodeGeneratorRequest.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getProtoFileFieldBuilder();
                        }
                        this.protoFileBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.protoFileBuilder_.addAllMessages(codeGeneratorRequest.protoFile_);
                    }
                }
                if (codeGeneratorRequest.hasCompilerVersion()) {
                    mergeCompilerVersion(codeGeneratorRequest.getCompilerVersion());
                }
                mergeUnknownFields(codeGeneratorRequest.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getProtoFileCount(); i++) {
                    if (!getProtoFile(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorRequest.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser<com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorRequest> r1 = com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorRequest.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorRequest r3 = (com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorRequest) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorRequest) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorRequest r4 = (com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorRequest) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorRequest) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorRequest.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorRequest$Builder");
            }

            private void ensureFileToGenerateIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.fileToGenerate_ = new LazyStringArrayList(this.fileToGenerate_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getFileToGenerateList() {
                return this.fileToGenerate_.getUnmodifiableView();
            }

            public int getFileToGenerateCount() {
                return this.fileToGenerate_.size();
            }

            public String getFileToGenerate(int i) {
                return (String) this.fileToGenerate_.get(i);
            }

            public ByteString getFileToGenerateBytes(int i) {
                return this.fileToGenerate_.getByteString(i);
            }

            public Builder setFileToGenerate(int i, String str) {
                if (str != null) {
                    ensureFileToGenerateIsMutable();
                    this.fileToGenerate_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addFileToGenerate(String str) {
                if (str != null) {
                    ensureFileToGenerateIsMutable();
                    this.fileToGenerate_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllFileToGenerate(Iterable<String> iterable) {
                ensureFileToGenerateIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.fileToGenerate_);
                onChanged();
                return this;
            }

            public Builder clearFileToGenerate() {
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addFileToGenerateBytes(ByteString byteString) {
                if (byteString != null) {
                    ensureFileToGenerateIsMutable();
                    this.fileToGenerate_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean hasParameter() {
                return (this.bitField0_ & 2) != 0;
            }

            public String getParameter() {
                Object obj = this.parameter_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.parameter_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getParameterBytes() {
                Object obj = this.parameter_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.parameter_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setParameter(String str) {
                if (str != null) {
                    this.bitField0_ |= 2;
                    this.parameter_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearParameter() {
                this.bitField0_ &= -3;
                this.parameter_ = CodeGeneratorRequest.getDefaultInstance().getParameter();
                onChanged();
                return this;
            }

            public Builder setParameterBytes(ByteString byteString) {
                if (byteString != null) {
                    this.bitField0_ |= 2;
                    this.parameter_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureProtoFileIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.protoFile_ = new ArrayList(this.protoFile_);
                    this.bitField0_ |= 4;
                }
            }

            public List<DescriptorProtos.FileDescriptorProto> getProtoFileList() {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.protoFile_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getProtoFileCount() {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.protoFile_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public DescriptorProtos.FileDescriptorProto getProtoFile(int i) {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.protoFile_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setProtoFile(int i, DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, fileDescriptorProto);
                } else if (fileDescriptorProto != null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.set(i, fileDescriptorProto);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setProtoFile(int i, DescriptorProtos.FileDescriptorProto.Builder builder) {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addProtoFile(DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(fileDescriptorProto);
                } else if (fileDescriptorProto != null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(fileDescriptorProto);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addProtoFile(int i, DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, fileDescriptorProto);
                } else if (fileDescriptorProto != null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(i, fileDescriptorProto);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addProtoFile(DescriptorProtos.FileDescriptorProto.Builder builder) {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addProtoFile(int i, DescriptorProtos.FileDescriptorProto.Builder builder) {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllProtoFile(Iterable<? extends DescriptorProtos.FileDescriptorProto> iterable) {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureProtoFileIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.protoFile_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearProtoFile() {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.protoFile_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeProtoFile(int i) {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public DescriptorProtos.FileDescriptorProto.Builder getProtoFileBuilder(int i) {
                return getProtoFileFieldBuilder().getBuilder(i);
            }

            public DescriptorProtos.FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int i) {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.protoFile_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList() {
                RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.protoFileBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.protoFile_);
            }

            public DescriptorProtos.FileDescriptorProto.Builder addProtoFileBuilder() {
                return getProtoFileFieldBuilder().addBuilder(DescriptorProtos.FileDescriptorProto.getDefaultInstance());
            }

            public DescriptorProtos.FileDescriptorProto.Builder addProtoFileBuilder(int i) {
                return getProtoFileFieldBuilder().addBuilder(i, DescriptorProtos.FileDescriptorProto.getDefaultInstance());
            }

            public List<DescriptorProtos.FileDescriptorProto.Builder> getProtoFileBuilderList() {
                return getProtoFileFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileFieldBuilder() {
                if (this.protoFileBuilder_ == null) {
                    this.protoFileBuilder_ = new RepeatedFieldBuilderV3<>(this.protoFile_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.protoFile_ = null;
                }
                return this.protoFileBuilder_;
            }

            public boolean hasCompilerVersion() {
                return (this.bitField0_ & 8) != 0;
            }

            public Version getCompilerVersion() {
                SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> singleFieldBuilderV3 = this.compilerVersionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Version version = this.compilerVersion_;
                return version == null ? Version.getDefaultInstance() : version;
            }

            public Builder setCompilerVersion(Version version) {
                SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> singleFieldBuilderV3 = this.compilerVersionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(version);
                } else if (version != null) {
                    this.compilerVersion_ = version;
                    onChanged();
                } else {
                    throw null;
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setCompilerVersion(Version.Builder builder) {
                SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> singleFieldBuilderV3 = this.compilerVersionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.compilerVersion_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeCompilerVersion(Version version) {
                Version version2;
                SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> singleFieldBuilderV3 = this.compilerVersionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) == 0 || (version2 = this.compilerVersion_) == null || version2 == Version.getDefaultInstance()) {
                        this.compilerVersion_ = version;
                    } else {
                        this.compilerVersion_ = Version.newBuilder(this.compilerVersion_).mergeFrom(version).buildPartial();
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(version);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder clearCompilerVersion() {
                SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> singleFieldBuilderV3 = this.compilerVersionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.compilerVersion_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public Version.Builder getCompilerVersionBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return getCompilerVersionFieldBuilder().getBuilder();
            }

            public VersionOrBuilder getCompilerVersionOrBuilder() {
                SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> singleFieldBuilderV3 = this.compilerVersionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Version version = this.compilerVersion_;
                return version == null ? Version.getDefaultInstance() : version;
            }

            private SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> getCompilerVersionFieldBuilder() {
                if (this.compilerVersionBuilder_ == null) {
                    this.compilerVersionBuilder_ = new SingleFieldBuilderV3<>(getCompilerVersion(), getParentForChildren(), isClean());
                    this.compilerVersion_ = null;
                }
                return this.compilerVersionBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CodeGeneratorRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CodeGeneratorRequest> parser() {
            return PARSER;
        }

        public Parser<CodeGeneratorRequest> getParserForType() {
            return PARSER;
        }

        public CodeGeneratorRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CodeGeneratorResponse extends GeneratedMessageV3 implements CodeGeneratorResponseOrBuilder {
        private static final CodeGeneratorResponse DEFAULT_INSTANCE = new CodeGeneratorResponse();
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int FILE_FIELD_NUMBER = 15;
        @Deprecated
        public static final Parser<CodeGeneratorResponse> PARSER = new AbstractParser<CodeGeneratorResponse>() {
            public CodeGeneratorResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CodeGeneratorResponse(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SUPPORTED_FEATURES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public volatile Object error_;
        /* access modifiers changed from: private */
        public List<File> file_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public long supportedFeatures_;

        public interface FileOrBuilder extends MessageOrBuilder {
            String getContent();

            ByteString getContentBytes();

            DescriptorProtos.GeneratedCodeInfo getGeneratedCodeInfo();

            DescriptorProtos.GeneratedCodeInfoOrBuilder getGeneratedCodeInfoOrBuilder();

            String getInsertionPoint();

            ByteString getInsertionPointBytes();

            String getName();

            ByteString getNameBytes();

            boolean hasContent();

            boolean hasGeneratedCodeInfo();

            boolean hasInsertionPoint();

            boolean hasName();
        }

        private CodeGeneratorResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CodeGeneratorResponse() {
            this.memoizedIsInitialized = -1;
            this.error_ = "";
            this.file_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CodeGeneratorResponse();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CodeGeneratorResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                ByteString readBytes = codedInputStream.readBytes();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.error_ = readBytes;
                            } else if (readTag == 16) {
                                this.bitField0_ |= 2;
                                this.supportedFeatures_ = codedInputStream.readUInt64();
                            } else if (readTag == 122) {
                                if (!z2 || !true) {
                                    this.file_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.file_.add(codedInputStream.readMessage(File.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 && true) {
                            this.file_ = Collections.unmodifiableList(this.file_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.file_ = Collections.unmodifiableList(this.file_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CodeGeneratorResponse.class, Builder.class);
        }

        public enum Feature implements ProtocolMessageEnum {
            FEATURE_NONE(0),
            FEATURE_PROTO3_OPTIONAL(1);
            
            public static final int FEATURE_NONE_VALUE = 0;
            public static final int FEATURE_PROTO3_OPTIONAL_VALUE = 1;
            private static final Feature[] VALUES = null;
            private static final Internal.EnumLiteMap<Feature> internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new Internal.EnumLiteMap<Feature>() {
                    public Feature findValueByNumber(int i) {
                        return Feature.forNumber(i);
                    }
                };
                VALUES = values();
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Feature valueOf(int i) {
                return forNumber(i);
            }

            public static Feature forNumber(int i) {
                if (i == 0) {
                    return FEATURE_NONE;
                }
                if (i != 1) {
                    return null;
                }
                return FEATURE_PROTO3_OPTIONAL;
            }

            public static Internal.EnumLiteMap<Feature> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CodeGeneratorResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Feature valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }

            private Feature(int i) {
                this.value = i;
            }
        }

        public static final class File extends GeneratedMessageV3 implements FileOrBuilder {
            public static final int CONTENT_FIELD_NUMBER = 15;
            private static final File DEFAULT_INSTANCE = new File();
            public static final int GENERATED_CODE_INFO_FIELD_NUMBER = 16;
            public static final int INSERTION_POINT_FIELD_NUMBER = 2;
            public static final int NAME_FIELD_NUMBER = 1;
            @Deprecated
            public static final Parser<File> PARSER = new AbstractParser<File>() {
                public File parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new File(codedInputStream, extensionRegistryLite);
                }
            };
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public int bitField0_;
            /* access modifiers changed from: private */
            public volatile Object content_;
            /* access modifiers changed from: private */
            public DescriptorProtos.GeneratedCodeInfo generatedCodeInfo_;
            /* access modifiers changed from: private */
            public volatile Object insertionPoint_;
            private byte memoizedIsInitialized;
            /* access modifiers changed from: private */
            public volatile Object name_;

            private File(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private File() {
                this.memoizedIsInitialized = -1;
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new File();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private File(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                if (extensionRegistryLite != null) {
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                    boolean z = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    ByteString readBytes = codedInputStream.readBytes();
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.name_ = readBytes;
                                } else if (readTag == 18) {
                                    ByteString readBytes2 = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    this.insertionPoint_ = readBytes2;
                                } else if (readTag == 122) {
                                    ByteString readBytes3 = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                    this.content_ = readBytes3;
                                } else if (readTag == 130) {
                                    DescriptorProtos.GeneratedCodeInfo.Builder builder = (this.bitField0_ & 8) != 0 ? this.generatedCodeInfo_.toBuilder() : null;
                                    DescriptorProtos.GeneratedCodeInfo generatedCodeInfo = (DescriptorProtos.GeneratedCodeInfo) codedInputStream.readMessage(DescriptorProtos.GeneratedCodeInfo.PARSER, extensionRegistryLite);
                                    this.generatedCodeInfo_ = generatedCodeInfo;
                                    if (builder != null) {
                                        builder.mergeFrom(generatedCodeInfo);
                                        this.generatedCodeInfo_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 8;
                                } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.setUnfinishedMessage(this);
                        } catch (IOException e3) {
                            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                        } catch (Throwable th) {
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    return;
                }
                throw null;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable.ensureFieldAccessorsInitialized(File.class, Builder.class);
            }

            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean hasInsertionPoint() {
                return (this.bitField0_ & 2) != 0;
            }

            public String getInsertionPoint() {
                Object obj = this.insertionPoint_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.insertionPoint_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getInsertionPointBytes() {
                Object obj = this.insertionPoint_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.insertionPoint_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean hasContent() {
                return (this.bitField0_ & 4) != 0;
            }

            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.content_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean hasGeneratedCodeInfo() {
                return (this.bitField0_ & 8) != 0;
            }

            public DescriptorProtos.GeneratedCodeInfo getGeneratedCodeInfo() {
                DescriptorProtos.GeneratedCodeInfo generatedCodeInfo = this.generatedCodeInfo_;
                return generatedCodeInfo == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : generatedCodeInfo;
            }

            public DescriptorProtos.GeneratedCodeInfoOrBuilder getGeneratedCodeInfoOrBuilder() {
                DescriptorProtos.GeneratedCodeInfo generatedCodeInfo = this.generatedCodeInfo_;
                return generatedCodeInfo == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : generatedCodeInfo;
            }

            public final boolean isInitialized() {
                byte b2 = this.memoizedIsInitialized;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.insertionPoint_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 15, this.content_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeMessage(16, getGeneratedCodeInfo());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.bitField0_ & 1) != 0) {
                    i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    i2 += GeneratedMessageV3.computeStringSize(2, this.insertionPoint_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    i2 += GeneratedMessageV3.computeStringSize(15, this.content_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    i2 += CodedOutputStream.computeMessageSize(16, getGeneratedCodeInfo());
                }
                int serializedSize = i2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof File)) {
                    return super.equals(obj);
                }
                File file = (File) obj;
                if (hasName() != file.hasName()) {
                    return false;
                }
                if ((hasName() && !getName().equals(file.getName())) || hasInsertionPoint() != file.hasInsertionPoint()) {
                    return false;
                }
                if ((hasInsertionPoint() && !getInsertionPoint().equals(file.getInsertionPoint())) || hasContent() != file.hasContent()) {
                    return false;
                }
                if ((hasContent() && !getContent().equals(file.getContent())) || hasGeneratedCodeInfo() != file.hasGeneratedCodeInfo()) {
                    return false;
                }
                if ((!hasGeneratedCodeInfo() || getGeneratedCodeInfo().equals(file.getGeneratedCodeInfo())) && this.unknownFields.equals(file.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = 779 + getDescriptor().hashCode();
                if (hasName()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
                }
                if (hasInsertionPoint()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getInsertionPoint().hashCode();
                }
                if (hasContent()) {
                    hashCode = (((hashCode * 37) + 15) * 53) + getContent().hashCode();
                }
                if (hasGeneratedCodeInfo()) {
                    hashCode = (((hashCode * 37) + 16) * 53) + getGeneratedCodeInfo().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static File parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static File parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static File parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static File parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static File parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static File parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static File parseFrom(InputStream inputStream) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static File parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static File parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (File) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static File parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (File) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static File parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static File parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(File file) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(file);
            }

            public Builder toBuilder() {
                if (this == DEFAULT_INSTANCE) {
                    return new Builder();
                }
                return new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileOrBuilder {
                private int bitField0_;
                private Object content_;
                private SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> generatedCodeInfoBuilder_;
                private DescriptorProtos.GeneratedCodeInfo generatedCodeInfo_;
                private Object insertionPoint_;
                private Object name_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable.ensureFieldAccessorsInitialized(File.class, Builder.class);
                }

                private Builder() {
                    this.name_ = "";
                    this.insertionPoint_ = "";
                    this.content_ = "";
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.name_ = "";
                    this.insertionPoint_ = "";
                    this.content_ = "";
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (File.alwaysUseFieldBuilders) {
                        getGeneratedCodeInfoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.name_ = "";
                    int i = this.bitField0_ & -2;
                    this.bitField0_ = i;
                    this.insertionPoint_ = "";
                    int i2 = i & -3;
                    this.bitField0_ = i2;
                    this.content_ = "";
                    this.bitField0_ = i2 & -5;
                    SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> singleFieldBuilderV3 = this.generatedCodeInfoBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.generatedCodeInfo_ = null;
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -9;
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor;
                }

                public File getDefaultInstanceForType() {
                    return File.getDefaultInstance();
                }

                public File build() {
                    File buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public File buildPartial() {
                    File file = new File((GeneratedMessageV3.Builder) this);
                    int i = this.bitField0_;
                    int i2 = (i & 1) != 0 ? 1 : 0;
                    Object unused = file.name_ = this.name_;
                    if ((i & 2) != 0) {
                        i2 |= 2;
                    }
                    Object unused2 = file.insertionPoint_ = this.insertionPoint_;
                    if ((i & 4) != 0) {
                        i2 |= 4;
                    }
                    Object unused3 = file.content_ = this.content_;
                    if ((i & 8) != 0) {
                        SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> singleFieldBuilderV3 = this.generatedCodeInfoBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            DescriptorProtos.GeneratedCodeInfo unused4 = file.generatedCodeInfo_ = this.generatedCodeInfo_;
                        } else {
                            DescriptorProtos.GeneratedCodeInfo unused5 = file.generatedCodeInfo_ = singleFieldBuilderV3.build();
                        }
                        i2 |= 8;
                    }
                    int unused6 = file.bitField0_ = i2;
                    onBuilt();
                    return file;
                }

                public Builder clone() {
                    return (Builder) super.clone();
                }

                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                public Builder mergeFrom(Message message) {
                    if (message instanceof File) {
                        return mergeFrom((File) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(File file) {
                    if (file == File.getDefaultInstance()) {
                        return this;
                    }
                    if (file.hasName()) {
                        this.bitField0_ |= 1;
                        this.name_ = file.name_;
                        onChanged();
                    }
                    if (file.hasInsertionPoint()) {
                        this.bitField0_ |= 2;
                        this.insertionPoint_ = file.insertionPoint_;
                        onChanged();
                    }
                    if (file.hasContent()) {
                        this.bitField0_ |= 4;
                        this.content_ = file.content_;
                        onChanged();
                    }
                    if (file.hasGeneratedCodeInfo()) {
                        mergeGeneratedCodeInfo(file.getGeneratedCodeInfo());
                    }
                    mergeUnknownFields(file.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser<com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File> r1 = com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                        com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File r3 = (com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                        if (r3 == 0) goto L_0x000e
                        r2.mergeFrom((com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File) r3)
                    L_0x000e:
                        return r2
                    L_0x000f:
                        r3 = move-exception
                        goto L_0x001f
                    L_0x0011:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                        com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File r4 = (com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File) r4     // Catch:{ all -> 0x000f }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                        throw r3     // Catch:{ all -> 0x001d }
                    L_0x001d:
                        r3 = move-exception
                        r0 = r4
                    L_0x001f:
                        if (r0 == 0) goto L_0x0024
                        r2.mergeFrom((com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File) r0)
                    L_0x0024:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File$Builder");
                }

                public boolean hasName() {
                    return (this.bitField0_ & 1) != 0;
                }

                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.name_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setName(String str) {
                    if (str != null) {
                        this.bitField0_ |= 1;
                        this.name_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearName() {
                    this.bitField0_ &= -2;
                    this.name_ = File.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    if (byteString != null) {
                        this.bitField0_ |= 1;
                        this.name_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public boolean hasInsertionPoint() {
                    return (this.bitField0_ & 2) != 0;
                }

                public String getInsertionPoint() {
                    Object obj = this.insertionPoint_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.insertionPoint_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                public ByteString getInsertionPointBytes() {
                    Object obj = this.insertionPoint_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.insertionPoint_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setInsertionPoint(String str) {
                    if (str != null) {
                        this.bitField0_ |= 2;
                        this.insertionPoint_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearInsertionPoint() {
                    this.bitField0_ &= -3;
                    this.insertionPoint_ = File.getDefaultInstance().getInsertionPoint();
                    onChanged();
                    return this;
                }

                public Builder setInsertionPointBytes(ByteString byteString) {
                    if (byteString != null) {
                        this.bitField0_ |= 2;
                        this.insertionPoint_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public boolean hasContent() {
                    return (this.bitField0_ & 4) != 0;
                }

                public String getContent() {
                    Object obj = this.content_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.content_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                public ByteString getContentBytes() {
                    Object obj = this.content_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.content_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setContent(String str) {
                    if (str != null) {
                        this.bitField0_ |= 4;
                        this.content_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearContent() {
                    this.bitField0_ &= -5;
                    this.content_ = File.getDefaultInstance().getContent();
                    onChanged();
                    return this;
                }

                public Builder setContentBytes(ByteString byteString) {
                    if (byteString != null) {
                        this.bitField0_ |= 4;
                        this.content_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public boolean hasGeneratedCodeInfo() {
                    return (this.bitField0_ & 8) != 0;
                }

                public DescriptorProtos.GeneratedCodeInfo getGeneratedCodeInfo() {
                    SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> singleFieldBuilderV3 = this.generatedCodeInfoBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    DescriptorProtos.GeneratedCodeInfo generatedCodeInfo = this.generatedCodeInfo_;
                    return generatedCodeInfo == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : generatedCodeInfo;
                }

                public Builder setGeneratedCodeInfo(DescriptorProtos.GeneratedCodeInfo generatedCodeInfo) {
                    SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> singleFieldBuilderV3 = this.generatedCodeInfoBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(generatedCodeInfo);
                    } else if (generatedCodeInfo != null) {
                        this.generatedCodeInfo_ = generatedCodeInfo;
                        onChanged();
                    } else {
                        throw null;
                    }
                    this.bitField0_ |= 8;
                    return this;
                }

                public Builder setGeneratedCodeInfo(DescriptorProtos.GeneratedCodeInfo.Builder builder) {
                    SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> singleFieldBuilderV3 = this.generatedCodeInfoBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.generatedCodeInfo_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.bitField0_ |= 8;
                    return this;
                }

                public Builder mergeGeneratedCodeInfo(DescriptorProtos.GeneratedCodeInfo generatedCodeInfo) {
                    DescriptorProtos.GeneratedCodeInfo generatedCodeInfo2;
                    SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> singleFieldBuilderV3 = this.generatedCodeInfoBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 8) == 0 || (generatedCodeInfo2 = this.generatedCodeInfo_) == null || generatedCodeInfo2 == DescriptorProtos.GeneratedCodeInfo.getDefaultInstance()) {
                            this.generatedCodeInfo_ = generatedCodeInfo;
                        } else {
                            this.generatedCodeInfo_ = DescriptorProtos.GeneratedCodeInfo.newBuilder(this.generatedCodeInfo_).mergeFrom(generatedCodeInfo).buildPartial();
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(generatedCodeInfo);
                    }
                    this.bitField0_ |= 8;
                    return this;
                }

                public Builder clearGeneratedCodeInfo() {
                    SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> singleFieldBuilderV3 = this.generatedCodeInfoBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.generatedCodeInfo_ = null;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -9;
                    return this;
                }

                public DescriptorProtos.GeneratedCodeInfo.Builder getGeneratedCodeInfoBuilder() {
                    this.bitField0_ |= 8;
                    onChanged();
                    return getGeneratedCodeInfoFieldBuilder().getBuilder();
                }

                public DescriptorProtos.GeneratedCodeInfoOrBuilder getGeneratedCodeInfoOrBuilder() {
                    SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> singleFieldBuilderV3 = this.generatedCodeInfoBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    DescriptorProtos.GeneratedCodeInfo generatedCodeInfo = this.generatedCodeInfo_;
                    return generatedCodeInfo == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : generatedCodeInfo;
                }

                private SingleFieldBuilderV3<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.Builder, DescriptorProtos.GeneratedCodeInfoOrBuilder> getGeneratedCodeInfoFieldBuilder() {
                    if (this.generatedCodeInfoBuilder_ == null) {
                        this.generatedCodeInfoBuilder_ = new SingleFieldBuilderV3<>(getGeneratedCodeInfo(), getParentForChildren(), isClean());
                        this.generatedCodeInfo_ = null;
                    }
                    return this.generatedCodeInfoBuilder_;
                }

                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static File getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<File> parser() {
                return PARSER;
            }

            public Parser<File> getParserForType() {
                return PARSER;
            }

            public File getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getError() {
            Object obj = this.error_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.error_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getErrorBytes() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasSupportedFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        public long getSupportedFeatures() {
            return this.supportedFeatures_;
        }

        public List<File> getFileList() {
            return this.file_;
        }

        public List<? extends FileOrBuilder> getFileOrBuilderList() {
            return this.file_;
        }

        public int getFileCount() {
            return this.file_.size();
        }

        public File getFile(int i) {
            return this.file_.get(i);
        }

        public FileOrBuilder getFileOrBuilder(int i) {
            return this.file_.get(i);
        }

        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.error_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.supportedFeatures_);
            }
            for (int i = 0; i < this.file_.size(); i++) {
                codedOutputStream.writeMessage(15, this.file_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.error_) + 0 : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += CodedOutputStream.computeUInt64Size(2, this.supportedFeatures_);
            }
            for (int i2 = 0; i2 < this.file_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(15, this.file_.get(i2));
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeGeneratorResponse)) {
                return super.equals(obj);
            }
            CodeGeneratorResponse codeGeneratorResponse = (CodeGeneratorResponse) obj;
            if (hasError() != codeGeneratorResponse.hasError()) {
                return false;
            }
            if ((hasError() && !getError().equals(codeGeneratorResponse.getError())) || hasSupportedFeatures() != codeGeneratorResponse.hasSupportedFeatures()) {
                return false;
            }
            if ((!hasSupportedFeatures() || getSupportedFeatures() == codeGeneratorResponse.getSupportedFeatures()) && getFileList().equals(codeGeneratorResponse.getFileList()) && this.unknownFields.equals(codeGeneratorResponse.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (hasError()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getError().hashCode();
            }
            if (hasSupportedFeatures()) {
                hashCode = (((hashCode * 37) + 2) * 53) + Internal.hashLong(getSupportedFeatures());
            }
            if (getFileCount() > 0) {
                hashCode = (((hashCode * 37) + 15) * 53) + getFileList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CodeGeneratorResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CodeGeneratorResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CodeGeneratorResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CodeGeneratorResponse codeGeneratorResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(codeGeneratorResponse);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CodeGeneratorResponseOrBuilder {
            private int bitField0_;
            private Object error_;
            private RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> fileBuilder_;
            private List<File> file_;
            private long supportedFeatures_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CodeGeneratorResponse.class, Builder.class);
            }

            private Builder() {
                this.error_ = "";
                this.file_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.error_ = "";
                this.file_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CodeGeneratorResponse.alwaysUseFieldBuilders) {
                    getFileFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.error_ = "";
                int i = this.bitField0_ & -2;
                this.bitField0_ = i;
                this.supportedFeatures_ = 0;
                this.bitField0_ = i & -3;
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.file_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor;
            }

            public CodeGeneratorResponse getDefaultInstanceForType() {
                return CodeGeneratorResponse.getDefaultInstance();
            }

            public CodeGeneratorResponse build() {
                CodeGeneratorResponse buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CodeGeneratorResponse buildPartial() {
                CodeGeneratorResponse codeGeneratorResponse = new CodeGeneratorResponse((GeneratedMessageV3.Builder) this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 0 ? 1 : 0;
                Object unused = codeGeneratorResponse.error_ = this.error_;
                if ((i & 2) != 0) {
                    long unused2 = codeGeneratorResponse.supportedFeatures_ = this.supportedFeatures_;
                    i2 |= 2;
                }
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) != 0) {
                        this.file_ = Collections.unmodifiableList(this.file_);
                        this.bitField0_ &= -5;
                    }
                    List unused3 = codeGeneratorResponse.file_ = this.file_;
                } else {
                    List unused4 = codeGeneratorResponse.file_ = repeatedFieldBuilderV3.build();
                }
                int unused5 = codeGeneratorResponse.bitField0_ = i2;
                onBuilt();
                return codeGeneratorResponse;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CodeGeneratorResponse) {
                    return mergeFrom((CodeGeneratorResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CodeGeneratorResponse codeGeneratorResponse) {
                if (codeGeneratorResponse == CodeGeneratorResponse.getDefaultInstance()) {
                    return this;
                }
                if (codeGeneratorResponse.hasError()) {
                    this.bitField0_ |= 1;
                    this.error_ = codeGeneratorResponse.error_;
                    onChanged();
                }
                if (codeGeneratorResponse.hasSupportedFeatures()) {
                    setSupportedFeatures(codeGeneratorResponse.getSupportedFeatures());
                }
                if (this.fileBuilder_ == null) {
                    if (!codeGeneratorResponse.file_.isEmpty()) {
                        if (this.file_.isEmpty()) {
                            this.file_ = codeGeneratorResponse.file_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureFileIsMutable();
                            this.file_.addAll(codeGeneratorResponse.file_);
                        }
                        onChanged();
                    }
                } else if (!codeGeneratorResponse.file_.isEmpty()) {
                    if (this.fileBuilder_.isEmpty()) {
                        this.fileBuilder_.dispose();
                        RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = null;
                        this.fileBuilder_ = null;
                        this.file_ = codeGeneratorResponse.file_;
                        this.bitField0_ &= -5;
                        if (CodeGeneratorResponse.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getFileFieldBuilder();
                        }
                        this.fileBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.fileBuilder_.addAllMessages(codeGeneratorResponse.file_);
                    }
                }
                mergeUnknownFields(codeGeneratorResponse.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser<com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse> r1 = com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse r3 = (com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse r4 = (com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse$Builder");
            }

            public boolean hasError() {
                return (this.bitField0_ & 1) != 0;
            }

            public String getError() {
                Object obj = this.error_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.error_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getErrorBytes() {
                Object obj = this.error_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.error_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setError(String str) {
                if (str != null) {
                    this.bitField0_ |= 1;
                    this.error_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearError() {
                this.bitField0_ &= -2;
                this.error_ = CodeGeneratorResponse.getDefaultInstance().getError();
                onChanged();
                return this;
            }

            public Builder setErrorBytes(ByteString byteString) {
                if (byteString != null) {
                    this.bitField0_ |= 1;
                    this.error_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean hasSupportedFeatures() {
                return (this.bitField0_ & 2) != 0;
            }

            public long getSupportedFeatures() {
                return this.supportedFeatures_;
            }

            public Builder setSupportedFeatures(long j) {
                this.bitField0_ |= 2;
                this.supportedFeatures_ = j;
                onChanged();
                return this;
            }

            public Builder clearSupportedFeatures() {
                this.bitField0_ &= -3;
                this.supportedFeatures_ = 0;
                onChanged();
                return this;
            }

            private void ensureFileIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.file_ = new ArrayList(this.file_);
                    this.bitField0_ |= 4;
                }
            }

            public List<File> getFileList() {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.file_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getFileCount() {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.file_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public File getFile(int i) {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.file_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setFile(int i, File file) {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, file);
                } else if (file != null) {
                    ensureFileIsMutable();
                    this.file_.set(i, file);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setFile(int i, File.Builder builder) {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFileIsMutable();
                    this.file_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addFile(File file) {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(file);
                } else if (file != null) {
                    ensureFileIsMutable();
                    this.file_.add(file);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addFile(int i, File file) {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, file);
                } else if (file != null) {
                    ensureFileIsMutable();
                    this.file_.add(i, file);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addFile(File.Builder builder) {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFileIsMutable();
                    this.file_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addFile(int i, File.Builder builder) {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFileIsMutable();
                    this.file_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllFile(Iterable<? extends File> iterable) {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFileIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.file_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearFile() {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.file_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeFile(int i) {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFileIsMutable();
                    this.file_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public File.Builder getFileBuilder(int i) {
                return getFileFieldBuilder().getBuilder(i);
            }

            public FileOrBuilder getFileOrBuilder(int i) {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.file_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends FileOrBuilder> getFileOrBuilderList() {
                RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = this.fileBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.file_);
            }

            public File.Builder addFileBuilder() {
                return getFileFieldBuilder().addBuilder(File.getDefaultInstance());
            }

            public File.Builder addFileBuilder(int i) {
                return getFileFieldBuilder().addBuilder(i, File.getDefaultInstance());
            }

            public List<File.Builder> getFileBuilderList() {
                return getFileFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> getFileFieldBuilder() {
                if (this.fileBuilder_ == null) {
                    this.fileBuilder_ = new RepeatedFieldBuilderV3<>(this.file_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.file_ = null;
                }
                return this.fileBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CodeGeneratorResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CodeGeneratorResponse> parser() {
            return PARSER;
        }

        public Parser<CodeGeneratorResponse> getParserForType() {
            return PARSER;
        }

        public CodeGeneratorResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_protobuf_compiler_Version_descriptor = descriptor2;
        internal_static_google_protobuf_compiler_Version_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Major", "Minor", "Patch", "Suffix"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor = descriptor3;
        internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"FileToGenerate", "Parameter", "ProtoFile", "CompilerVersion"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor = descriptor4;
        internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{LogConstants.EVENT_ERROR, "SupportedFeatures", "File"});
        Descriptors.Descriptor descriptor5 = internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor.getNestedTypes().get(0);
        internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor = descriptor5;
        internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Name", "InsertionPoint", "Content", "GeneratedCodeInfo"});
        DescriptorProtos.getDescriptor();
    }
}
