package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;

public final class Services extends GeneratedMessageV3 implements ServicesOrBuilder {
    private static final Services DEFAULT_INSTANCE = new Services();
    /* access modifiers changed from: private */
    public static final Parser<Services> PARSER = new AbstractParser<Services>() {
        public Services parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Services(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public Adjust adjust_;
    /* access modifiers changed from: private */
    public Appsflyer appsflyer_;
    /* access modifiers changed from: private */
    public Facebook facebook_;
    /* access modifiers changed from: private */
    public Firebase firebase_;
    private byte memoizedIsInitialized;

    public interface AdjustOrBuilder extends MessageOrBuilder {
    }

    public interface AppsflyerOrBuilder extends MessageOrBuilder {
    }

    public interface FacebookOrBuilder extends MessageOrBuilder {
    }

    public interface FirebaseOrBuilder extends MessageOrBuilder {
    }

    private Services(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Services() {
        this.memoizedIsInitialized = -1;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Services();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Services(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            Appsflyer.Builder builder = this.appsflyer_ != null ? this.appsflyer_.toBuilder() : null;
                            Appsflyer appsflyer = (Appsflyer) codedInputStream.readMessage(Appsflyer.parser(), extensionRegistryLite);
                            this.appsflyer_ = appsflyer;
                            if (builder != null) {
                                builder.mergeFrom(appsflyer);
                                this.appsflyer_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            Adjust.Builder builder2 = this.adjust_ != null ? this.adjust_.toBuilder() : null;
                            Adjust adjust = (Adjust) codedInputStream.readMessage(Adjust.parser(), extensionRegistryLite);
                            this.adjust_ = adjust;
                            if (builder2 != null) {
                                builder2.mergeFrom(adjust);
                                this.adjust_ = builder2.buildPartial();
                            }
                        } else if (readTag == 26) {
                            Facebook.Builder builder3 = this.facebook_ != null ? this.facebook_.toBuilder() : null;
                            Facebook facebook = (Facebook) codedInputStream.readMessage(Facebook.parser(), extensionRegistryLite);
                            this.facebook_ = facebook;
                            if (builder3 != null) {
                                builder3.mergeFrom(facebook);
                                this.facebook_ = builder3.buildPartial();
                            }
                        } else if (readTag == 34) {
                            Firebase.Builder builder4 = this.firebase_ != null ? this.firebase_.toBuilder() : null;
                            Firebase firebase = (Firebase) codedInputStream.readMessage(Firebase.parser(), extensionRegistryLite);
                            this.firebase_ = firebase;
                            if (builder4 != null) {
                                builder4.mergeFrom(firebase);
                                this.firebase_ = builder4.buildPartial();
                            }
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
        return Api.internal_static_com_appodeal_ads_Services_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_Services_fieldAccessorTable.ensureFieldAccessorsInitialized(Services.class, Builder.class);
    }

    public static final class Appsflyer extends GeneratedMessageV3 implements AppsflyerOrBuilder {
        private static final Appsflyer DEFAULT_INSTANCE = new Appsflyer();
        /* access modifiers changed from: private */
        public static final Parser<Appsflyer> PARSER = new AbstractParser<Appsflyer>() {
            public Appsflyer parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Appsflyer(codedInputStream, extensionRegistryLite);
            }
        };
        /* access modifiers changed from: private */
        public volatile Object attributionId_;
        /* access modifiers changed from: private */
        public volatile Object conversionData_;
        private byte memoizedIsInitialized;

        private Appsflyer(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Appsflyer() {
            this.memoizedIsInitialized = -1;
            this.attributionId_ = "";
            this.conversionData_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Appsflyer();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Appsflyer(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.attributionId_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.conversionData_ = codedInputStream.readStringRequireUtf8();
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
            return Api.internal_static_com_appodeal_ads_Services_Appsflyer_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Services_Appsflyer_fieldAccessorTable.ensureFieldAccessorsInitialized(Appsflyer.class, Builder.class);
        }

        public String getAttributionId() {
            Object obj = this.attributionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.attributionId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAttributionIdBytes() {
            Object obj = this.attributionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.attributionId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getConversionData() {
            Object obj = this.conversionData_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.conversionData_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getConversionDataBytes() {
            Object obj = this.conversionData_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.conversionData_ = copyFromUtf8;
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
            if (!getAttributionIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.attributionId_);
            }
            if (!getConversionDataBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.conversionData_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getAttributionIdBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.attributionId_);
            }
            if (!getConversionDataBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.conversionData_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Appsflyer)) {
                return super.equals(obj);
            }
            Appsflyer appsflyer = (Appsflyer) obj;
            if (getAttributionId().equals(appsflyer.getAttributionId()) && getConversionData().equals(appsflyer.getConversionData()) && this.unknownFields.equals(appsflyer.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAttributionId().hashCode()) * 37) + 2) * 53) + getConversionData().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Appsflyer appsflyer) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(appsflyer);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppsflyerOrBuilder {
            private Object attributionId_;
            private Object conversionData_;

            public final boolean isInitialized() {
                return true;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Api.internal_static_com_appodeal_ads_Services_Appsflyer_fieldAccessorTable.ensureFieldAccessorsInitialized(Appsflyer.class, Builder.class);
            }

            private Builder() {
                this.attributionId_ = "";
                this.conversionData_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.attributionId_ = "";
                this.conversionData_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = Appsflyer.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.attributionId_ = "";
                this.conversionData_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return Api.internal_static_com_appodeal_ads_Services_Appsflyer_descriptor;
            }

            public Appsflyer getDefaultInstanceForType() {
                return Appsflyer.getDefaultInstance();
            }

            public Appsflyer build() {
                Appsflyer buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Appsflyer buildPartial() {
                Appsflyer appsflyer = new Appsflyer((GeneratedMessageV3.Builder) this);
                Object unused = appsflyer.attributionId_ = this.attributionId_;
                Object unused2 = appsflyer.conversionData_ = this.conversionData_;
                onBuilt();
                return appsflyer;
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
                if (message instanceof Appsflyer) {
                    return mergeFrom((Appsflyer) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Appsflyer appsflyer) {
                if (appsflyer == Appsflyer.getDefaultInstance()) {
                    return this;
                }
                if (!appsflyer.getAttributionId().isEmpty()) {
                    this.attributionId_ = appsflyer.attributionId_;
                    onChanged();
                }
                if (!appsflyer.getConversionData().isEmpty()) {
                    this.conversionData_ = appsflyer.conversionData_;
                    onChanged();
                }
                mergeUnknownFields(appsflyer.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.appodeal.ads.api.Services.Appsflyer.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Services.Appsflyer.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.appodeal.ads.api.Services$Appsflyer r3 = (com.appodeal.ads.api.Services.Appsflyer) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.appodeal.ads.api.Services.Appsflyer) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.appodeal.ads.api.Services$Appsflyer r4 = (com.appodeal.ads.api.Services.Appsflyer) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.appodeal.ads.api.Services.Appsflyer) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Services.Appsflyer.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Services$Appsflyer$Builder");
            }

            public Builder setAttributionId(String str) {
                if (str != null) {
                    this.attributionId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setConversionData(String str) {
                if (str != null) {
                    this.conversionData_ = str;
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

        public static Appsflyer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Appsflyer> parser() {
            return PARSER;
        }

        public Parser<Appsflyer> getParserForType() {
            return PARSER;
        }

        public Appsflyer getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Adjust extends GeneratedMessageV3 implements AdjustOrBuilder {
        private static final Adjust DEFAULT_INSTANCE = new Adjust();
        /* access modifiers changed from: private */
        public static final Parser<Adjust> PARSER = new AbstractParser<Adjust>() {
            public Adjust parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Adjust(codedInputStream, extensionRegistryLite);
            }
        };
        /* access modifiers changed from: private */
        public volatile Object attributionId_;
        /* access modifiers changed from: private */
        public volatile Object conversionData_;
        private byte memoizedIsInitialized;

        private Adjust(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Adjust() {
            this.memoizedIsInitialized = -1;
            this.attributionId_ = "";
            this.conversionData_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Adjust();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Adjust(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.attributionId_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.conversionData_ = codedInputStream.readStringRequireUtf8();
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
            return Api.internal_static_com_appodeal_ads_Services_Adjust_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Services_Adjust_fieldAccessorTable.ensureFieldAccessorsInitialized(Adjust.class, Builder.class);
        }

        public String getAttributionId() {
            Object obj = this.attributionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.attributionId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAttributionIdBytes() {
            Object obj = this.attributionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.attributionId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getConversionData() {
            Object obj = this.conversionData_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.conversionData_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getConversionDataBytes() {
            Object obj = this.conversionData_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.conversionData_ = copyFromUtf8;
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
            if (!getAttributionIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.attributionId_);
            }
            if (!getConversionDataBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.conversionData_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getAttributionIdBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.attributionId_);
            }
            if (!getConversionDataBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.conversionData_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Adjust)) {
                return super.equals(obj);
            }
            Adjust adjust = (Adjust) obj;
            if (getAttributionId().equals(adjust.getAttributionId()) && getConversionData().equals(adjust.getConversionData()) && this.unknownFields.equals(adjust.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAttributionId().hashCode()) * 37) + 2) * 53) + getConversionData().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Adjust adjust) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adjust);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdjustOrBuilder {
            private Object attributionId_;
            private Object conversionData_;

            public final boolean isInitialized() {
                return true;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Api.internal_static_com_appodeal_ads_Services_Adjust_fieldAccessorTable.ensureFieldAccessorsInitialized(Adjust.class, Builder.class);
            }

            private Builder() {
                this.attributionId_ = "";
                this.conversionData_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.attributionId_ = "";
                this.conversionData_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = Adjust.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.attributionId_ = "";
                this.conversionData_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return Api.internal_static_com_appodeal_ads_Services_Adjust_descriptor;
            }

            public Adjust getDefaultInstanceForType() {
                return Adjust.getDefaultInstance();
            }

            public Adjust build() {
                Adjust buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Adjust buildPartial() {
                Adjust adjust = new Adjust((GeneratedMessageV3.Builder) this);
                Object unused = adjust.attributionId_ = this.attributionId_;
                Object unused2 = adjust.conversionData_ = this.conversionData_;
                onBuilt();
                return adjust;
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
                if (message instanceof Adjust) {
                    return mergeFrom((Adjust) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Adjust adjust) {
                if (adjust == Adjust.getDefaultInstance()) {
                    return this;
                }
                if (!adjust.getAttributionId().isEmpty()) {
                    this.attributionId_ = adjust.attributionId_;
                    onChanged();
                }
                if (!adjust.getConversionData().isEmpty()) {
                    this.conversionData_ = adjust.conversionData_;
                    onChanged();
                }
                mergeUnknownFields(adjust.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.appodeal.ads.api.Services.Adjust.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Services.Adjust.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.appodeal.ads.api.Services$Adjust r3 = (com.appodeal.ads.api.Services.Adjust) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.appodeal.ads.api.Services.Adjust) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.appodeal.ads.api.Services$Adjust r4 = (com.appodeal.ads.api.Services.Adjust) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.appodeal.ads.api.Services.Adjust) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Services.Adjust.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Services$Adjust$Builder");
            }

            public Builder setAttributionId(String str) {
                if (str != null) {
                    this.attributionId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setConversionData(String str) {
                if (str != null) {
                    this.conversionData_ = str;
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

        public static Adjust getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Adjust> parser() {
            return PARSER;
        }

        public Parser<Adjust> getParserForType() {
            return PARSER;
        }

        public Adjust getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Facebook extends GeneratedMessageV3 implements FacebookOrBuilder {
        private static final Facebook DEFAULT_INSTANCE = new Facebook();
        /* access modifiers changed from: private */
        public static final Parser<Facebook> PARSER = new AbstractParser<Facebook>() {
            public Facebook parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Facebook(codedInputStream, extensionRegistryLite);
            }
        };
        /* access modifiers changed from: private */
        public volatile Object appId_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object userId_;

        private Facebook(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Facebook() {
            this.memoizedIsInitialized = -1;
            this.userId_ = "";
            this.appId_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Facebook();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Facebook(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.userId_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.appId_ = codedInputStream.readStringRequireUtf8();
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
            return Api.internal_static_com_appodeal_ads_Services_Facebook_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Services_Facebook_fieldAccessorTable.ensureFieldAccessorsInitialized(Facebook.class, Builder.class);
        }

        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getAppId() {
            Object obj = this.appId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAppIdBytes() {
            Object obj = this.appId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appId_ = copyFromUtf8;
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
            if (!getUserIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.userId_);
            }
            if (!getAppIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.appId_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getUserIdBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.userId_);
            }
            if (!getAppIdBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.appId_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Facebook)) {
                return super.equals(obj);
            }
            Facebook facebook = (Facebook) obj;
            if (getUserId().equals(facebook.getUserId()) && getAppId().equals(facebook.getAppId()) && this.unknownFields.equals(facebook.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUserId().hashCode()) * 37) + 2) * 53) + getAppId().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Facebook facebook) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(facebook);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FacebookOrBuilder {
            private Object appId_;
            private Object userId_;

            public final boolean isInitialized() {
                return true;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Api.internal_static_com_appodeal_ads_Services_Facebook_fieldAccessorTable.ensureFieldAccessorsInitialized(Facebook.class, Builder.class);
            }

            private Builder() {
                this.userId_ = "";
                this.appId_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.userId_ = "";
                this.appId_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = Facebook.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.userId_ = "";
                this.appId_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return Api.internal_static_com_appodeal_ads_Services_Facebook_descriptor;
            }

            public Facebook getDefaultInstanceForType() {
                return Facebook.getDefaultInstance();
            }

            public Facebook build() {
                Facebook buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Facebook buildPartial() {
                Facebook facebook = new Facebook((GeneratedMessageV3.Builder) this);
                Object unused = facebook.userId_ = this.userId_;
                Object unused2 = facebook.appId_ = this.appId_;
                onBuilt();
                return facebook;
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
                if (message instanceof Facebook) {
                    return mergeFrom((Facebook) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Facebook facebook) {
                if (facebook == Facebook.getDefaultInstance()) {
                    return this;
                }
                if (!facebook.getUserId().isEmpty()) {
                    this.userId_ = facebook.userId_;
                    onChanged();
                }
                if (!facebook.getAppId().isEmpty()) {
                    this.appId_ = facebook.appId_;
                    onChanged();
                }
                mergeUnknownFields(facebook.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.appodeal.ads.api.Services.Facebook.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Services.Facebook.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.appodeal.ads.api.Services$Facebook r3 = (com.appodeal.ads.api.Services.Facebook) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.appodeal.ads.api.Services.Facebook) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.appodeal.ads.api.Services$Facebook r4 = (com.appodeal.ads.api.Services.Facebook) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.appodeal.ads.api.Services.Facebook) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Services.Facebook.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Services$Facebook$Builder");
            }

            public Builder setUserId(String str) {
                if (str != null) {
                    this.userId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setAppId(String str) {
                if (str != null) {
                    this.appId_ = str;
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

        public static Facebook getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Facebook> parser() {
            return PARSER;
        }

        public Parser<Facebook> getParserForType() {
            return PARSER;
        }

        public Facebook getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Firebase extends GeneratedMessageV3 implements FirebaseOrBuilder {
        private static final Firebase DEFAULT_INSTANCE = new Firebase();
        /* access modifiers changed from: private */
        public static final Parser<Firebase> PARSER = new AbstractParser<Firebase>() {
            public Firebase parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Firebase(codedInputStream, extensionRegistryLite);
            }
        };
        /* access modifiers changed from: private */
        public volatile Object appInstanceId_;
        /* access modifiers changed from: private */
        public LazyStringList keywords_;
        private byte memoizedIsInitialized;

        private Firebase(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Firebase() {
            this.memoizedIsInitialized = -1;
            this.appInstanceId_ = "";
            this.keywords_ = LazyStringArrayList.EMPTY;
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Firebase();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Firebase(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.appInstanceId_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.keywords_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.keywords_.add(readStringRequireUtf8);
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
                            this.keywords_ = this.keywords_.getUnmodifiableView();
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.keywords_ = this.keywords_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Api.internal_static_com_appodeal_ads_Services_Firebase_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Services_Firebase_fieldAccessorTable.ensureFieldAccessorsInitialized(Firebase.class, Builder.class);
        }

        public String getAppInstanceId() {
            Object obj = this.appInstanceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appInstanceId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAppInstanceIdBytes() {
            Object obj = this.appInstanceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appInstanceId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getKeywordsList() {
            return this.keywords_;
        }

        public int getKeywordsCount() {
            return this.keywords_.size();
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
            if (!getAppInstanceIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.appInstanceId_);
            }
            for (int i = 0; i < this.keywords_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.keywords_.getRaw(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getAppInstanceIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.appInstanceId_) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.keywords_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.keywords_.getRaw(i3));
            }
            int size = computeStringSize + i2 + (getKeywordsList().size() * 1) + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Firebase)) {
                return super.equals(obj);
            }
            Firebase firebase = (Firebase) obj;
            if (getAppInstanceId().equals(firebase.getAppInstanceId()) && getKeywordsList().equals(firebase.getKeywordsList()) && this.unknownFields.equals(firebase.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAppInstanceId().hashCode();
            if (getKeywordsCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getKeywordsList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Firebase firebase) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(firebase);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FirebaseOrBuilder {
            private Object appInstanceId_;
            private int bitField0_;
            private LazyStringList keywords_;

            public final boolean isInitialized() {
                return true;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Api.internal_static_com_appodeal_ads_Services_Firebase_fieldAccessorTable.ensureFieldAccessorsInitialized(Firebase.class, Builder.class);
            }

            private Builder() {
                this.appInstanceId_ = "";
                this.keywords_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appInstanceId_ = "";
                this.keywords_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = Firebase.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.appInstanceId_ = "";
                this.keywords_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return Api.internal_static_com_appodeal_ads_Services_Firebase_descriptor;
            }

            public Firebase getDefaultInstanceForType() {
                return Firebase.getDefaultInstance();
            }

            public Firebase build() {
                Firebase buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Firebase buildPartial() {
                Firebase firebase = new Firebase((GeneratedMessageV3.Builder) this);
                Object unused = firebase.appInstanceId_ = this.appInstanceId_;
                if ((this.bitField0_ & 1) != 0) {
                    this.keywords_ = this.keywords_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused2 = firebase.keywords_ = this.keywords_;
                onBuilt();
                return firebase;
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
                if (message instanceof Firebase) {
                    return mergeFrom((Firebase) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Firebase firebase) {
                if (firebase == Firebase.getDefaultInstance()) {
                    return this;
                }
                if (!firebase.getAppInstanceId().isEmpty()) {
                    this.appInstanceId_ = firebase.appInstanceId_;
                    onChanged();
                }
                if (!firebase.keywords_.isEmpty()) {
                    if (this.keywords_.isEmpty()) {
                        this.keywords_ = firebase.keywords_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureKeywordsIsMutable();
                        this.keywords_.addAll(firebase.keywords_);
                    }
                    onChanged();
                }
                mergeUnknownFields(firebase.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.appodeal.ads.api.Services.Firebase.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Services.Firebase.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.appodeal.ads.api.Services$Firebase r3 = (com.appodeal.ads.api.Services.Firebase) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.appodeal.ads.api.Services.Firebase) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.appodeal.ads.api.Services$Firebase r4 = (com.appodeal.ads.api.Services.Firebase) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.appodeal.ads.api.Services.Firebase) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Services.Firebase.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Services$Firebase$Builder");
            }

            public Builder setAppInstanceId(String str) {
                if (str != null) {
                    this.appInstanceId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureKeywordsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.keywords_ = new LazyStringArrayList(this.keywords_);
                    this.bitField0_ |= 1;
                }
            }

            public Builder addAllKeywords(Iterable<String> iterable) {
                ensureKeywordsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.keywords_);
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Firebase getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Firebase> parser() {
            return PARSER;
        }

        public Parser<Firebase> getParserForType() {
            return PARSER;
        }

        public Firebase getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public boolean hasAppsflyer() {
        return this.appsflyer_ != null;
    }

    public Appsflyer getAppsflyer() {
        Appsflyer appsflyer = this.appsflyer_;
        return appsflyer == null ? Appsflyer.getDefaultInstance() : appsflyer;
    }

    public boolean hasAdjust() {
        return this.adjust_ != null;
    }

    public Adjust getAdjust() {
        Adjust adjust = this.adjust_;
        return adjust == null ? Adjust.getDefaultInstance() : adjust;
    }

    public boolean hasFacebook() {
        return this.facebook_ != null;
    }

    public Facebook getFacebook() {
        Facebook facebook = this.facebook_;
        return facebook == null ? Facebook.getDefaultInstance() : facebook;
    }

    public boolean hasFirebase() {
        return this.firebase_ != null;
    }

    public Firebase getFirebase() {
        Firebase firebase = this.firebase_;
        return firebase == null ? Firebase.getDefaultInstance() : firebase;
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
        if (this.appsflyer_ != null) {
            codedOutputStream.writeMessage(1, getAppsflyer());
        }
        if (this.adjust_ != null) {
            codedOutputStream.writeMessage(2, getAdjust());
        }
        if (this.facebook_ != null) {
            codedOutputStream.writeMessage(3, getFacebook());
        }
        if (this.firebase_ != null) {
            codedOutputStream.writeMessage(4, getFirebase());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.appsflyer_ != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getAppsflyer());
        }
        if (this.adjust_ != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getAdjust());
        }
        if (this.facebook_ != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getFacebook());
        }
        if (this.firebase_ != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getFirebase());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Services)) {
            return super.equals(obj);
        }
        Services services = (Services) obj;
        if (hasAppsflyer() != services.hasAppsflyer()) {
            return false;
        }
        if ((hasAppsflyer() && !getAppsflyer().equals(services.getAppsflyer())) || hasAdjust() != services.hasAdjust()) {
            return false;
        }
        if ((hasAdjust() && !getAdjust().equals(services.getAdjust())) || hasFacebook() != services.hasFacebook()) {
            return false;
        }
        if ((hasFacebook() && !getFacebook().equals(services.getFacebook())) || hasFirebase() != services.hasFirebase()) {
            return false;
        }
        if ((!hasFirebase() || getFirebase().equals(services.getFirebase())) && this.unknownFields.equals(services.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasAppsflyer()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getAppsflyer().hashCode();
        }
        if (hasAdjust()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getAdjust().hashCode();
        }
        if (hasFacebook()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getFacebook().hashCode();
        }
        if (hasFirebase()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getFirebase().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Services services) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(services);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServicesOrBuilder {
        private SingleFieldBuilderV3<Adjust, Adjust.Builder, AdjustOrBuilder> adjustBuilder_;
        private Adjust adjust_;
        private SingleFieldBuilderV3<Appsflyer, Appsflyer.Builder, AppsflyerOrBuilder> appsflyerBuilder_;
        private Appsflyer appsflyer_;
        private SingleFieldBuilderV3<Facebook, Facebook.Builder, FacebookOrBuilder> facebookBuilder_;
        private Facebook facebook_;
        private SingleFieldBuilderV3<Firebase, Firebase.Builder, FirebaseOrBuilder> firebaseBuilder_;
        private Firebase firebase_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Services_fieldAccessorTable.ensureFieldAccessorsInitialized(Services.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = Services.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.appsflyerBuilder_ == null) {
                this.appsflyer_ = null;
            } else {
                this.appsflyer_ = null;
                this.appsflyerBuilder_ = null;
            }
            if (this.adjustBuilder_ == null) {
                this.adjust_ = null;
            } else {
                this.adjust_ = null;
                this.adjustBuilder_ = null;
            }
            if (this.facebookBuilder_ == null) {
                this.facebook_ = null;
            } else {
                this.facebook_ = null;
                this.facebookBuilder_ = null;
            }
            if (this.firebaseBuilder_ == null) {
                this.firebase_ = null;
            } else {
                this.firebase_ = null;
                this.firebaseBuilder_ = null;
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_Services_descriptor;
        }

        public Services getDefaultInstanceForType() {
            return Services.getDefaultInstance();
        }

        public Services build() {
            Services buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Services buildPartial() {
            Services services = new Services((GeneratedMessageV3.Builder) this);
            SingleFieldBuilderV3<Appsflyer, Appsflyer.Builder, AppsflyerOrBuilder> singleFieldBuilderV3 = this.appsflyerBuilder_;
            if (singleFieldBuilderV3 == null) {
                Appsflyer unused = services.appsflyer_ = this.appsflyer_;
            } else {
                Appsflyer unused2 = services.appsflyer_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Adjust, Adjust.Builder, AdjustOrBuilder> singleFieldBuilderV32 = this.adjustBuilder_;
            if (singleFieldBuilderV32 == null) {
                Adjust unused3 = services.adjust_ = this.adjust_;
            } else {
                Adjust unused4 = services.adjust_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<Facebook, Facebook.Builder, FacebookOrBuilder> singleFieldBuilderV33 = this.facebookBuilder_;
            if (singleFieldBuilderV33 == null) {
                Facebook unused5 = services.facebook_ = this.facebook_;
            } else {
                Facebook unused6 = services.facebook_ = singleFieldBuilderV33.build();
            }
            SingleFieldBuilderV3<Firebase, Firebase.Builder, FirebaseOrBuilder> singleFieldBuilderV34 = this.firebaseBuilder_;
            if (singleFieldBuilderV34 == null) {
                Firebase unused7 = services.firebase_ = this.firebase_;
            } else {
                Firebase unused8 = services.firebase_ = singleFieldBuilderV34.build();
            }
            onBuilt();
            return services;
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
            if (message instanceof Services) {
                return mergeFrom((Services) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Services services) {
            if (services == Services.getDefaultInstance()) {
                return this;
            }
            if (services.hasAppsflyer()) {
                mergeAppsflyer(services.getAppsflyer());
            }
            if (services.hasAdjust()) {
                mergeAdjust(services.getAdjust());
            }
            if (services.hasFacebook()) {
                mergeFacebook(services.getFacebook());
            }
            if (services.hasFirebase()) {
                mergeFirebase(services.getFirebase());
            }
            mergeUnknownFields(services.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.Services.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Services.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.Services r3 = (com.appodeal.ads.api.Services) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.Services) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.Services r4 = (com.appodeal.ads.api.Services) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.Services) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Services.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Services$Builder");
        }

        public Builder setAppsflyer(Appsflyer.Builder builder) {
            SingleFieldBuilderV3<Appsflyer, Appsflyer.Builder, AppsflyerOrBuilder> singleFieldBuilderV3 = this.appsflyerBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.appsflyer_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAppsflyer(Appsflyer appsflyer) {
            SingleFieldBuilderV3<Appsflyer, Appsflyer.Builder, AppsflyerOrBuilder> singleFieldBuilderV3 = this.appsflyerBuilder_;
            if (singleFieldBuilderV3 == null) {
                Appsflyer appsflyer2 = this.appsflyer_;
                if (appsflyer2 != null) {
                    this.appsflyer_ = Appsflyer.newBuilder(appsflyer2).mergeFrom(appsflyer).buildPartial();
                } else {
                    this.appsflyer_ = appsflyer;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(appsflyer);
            }
            return this;
        }

        public Builder setAdjust(Adjust.Builder builder) {
            SingleFieldBuilderV3<Adjust, Adjust.Builder, AdjustOrBuilder> singleFieldBuilderV3 = this.adjustBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.adjust_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAdjust(Adjust adjust) {
            SingleFieldBuilderV3<Adjust, Adjust.Builder, AdjustOrBuilder> singleFieldBuilderV3 = this.adjustBuilder_;
            if (singleFieldBuilderV3 == null) {
                Adjust adjust2 = this.adjust_;
                if (adjust2 != null) {
                    this.adjust_ = Adjust.newBuilder(adjust2).mergeFrom(adjust).buildPartial();
                } else {
                    this.adjust_ = adjust;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(adjust);
            }
            return this;
        }

        public Builder setFacebook(Facebook.Builder builder) {
            SingleFieldBuilderV3<Facebook, Facebook.Builder, FacebookOrBuilder> singleFieldBuilderV3 = this.facebookBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.facebook_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeFacebook(Facebook facebook) {
            SingleFieldBuilderV3<Facebook, Facebook.Builder, FacebookOrBuilder> singleFieldBuilderV3 = this.facebookBuilder_;
            if (singleFieldBuilderV3 == null) {
                Facebook facebook2 = this.facebook_;
                if (facebook2 != null) {
                    this.facebook_ = Facebook.newBuilder(facebook2).mergeFrom(facebook).buildPartial();
                } else {
                    this.facebook_ = facebook;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(facebook);
            }
            return this;
        }

        public Builder setFirebase(Firebase.Builder builder) {
            SingleFieldBuilderV3<Firebase, Firebase.Builder, FirebaseOrBuilder> singleFieldBuilderV3 = this.firebaseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.firebase_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeFirebase(Firebase firebase) {
            SingleFieldBuilderV3<Firebase, Firebase.Builder, FirebaseOrBuilder> singleFieldBuilderV3 = this.firebaseBuilder_;
            if (singleFieldBuilderV3 == null) {
                Firebase firebase2 = this.firebase_;
                if (firebase2 != null) {
                    this.firebase_ = Firebase.newBuilder(firebase2).mergeFrom(firebase).buildPartial();
                } else {
                    this.firebase_ = firebase;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(firebase);
            }
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Services getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Services> parser() {
        return PARSER;
    }

    public Parser<Services> getParserForType() {
        return PARSER;
    }

    public Services getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
