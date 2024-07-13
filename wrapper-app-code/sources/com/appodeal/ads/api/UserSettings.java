package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;

public final class UserSettings extends GeneratedMessageV3 implements UserSettingsOrBuilder {
    private static final UserSettings DEFAULT_INSTANCE = new UserSettings();
    /* access modifiers changed from: private */
    public static final Parser<UserSettings> PARSER = new AbstractParser<UserSettings>() {
        public UserSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new UserSettings(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public int age_;
    /* access modifiers changed from: private */
    public volatile Object gender_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public volatile Object userId_;

    private UserSettings(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private UserSettings() {
        this.memoizedIsInitialized = -1;
        this.userId_ = "";
        this.gender_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new UserSettings();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private UserSettings(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.gender_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 24) {
                            this.age_ = codedInputStream.readInt32();
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
        return Api.internal_static_com_appodeal_ads_UserSettings_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_UserSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(UserSettings.class, Builder.class);
    }

    @Deprecated
    public String getUserId() {
        Object obj = this.userId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.userId_ = stringUtf8;
        return stringUtf8;
    }

    @Deprecated
    public ByteString getUserIdBytes() {
        Object obj = this.userId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.userId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    @Deprecated
    public String getGender() {
        Object obj = this.gender_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.gender_ = stringUtf8;
        return stringUtf8;
    }

    @Deprecated
    public ByteString getGenderBytes() {
        Object obj = this.gender_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.gender_ = copyFromUtf8;
        return copyFromUtf8;
    }

    @Deprecated
    public int getAge() {
        return this.age_;
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
        if (!getGenderBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.gender_);
        }
        int i = this.age_;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
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
        if (!getGenderBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.gender_);
        }
        int i3 = this.age_;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i3);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserSettings)) {
            return super.equals(obj);
        }
        UserSettings userSettings = (UserSettings) obj;
        if (getUserId().equals(userSettings.getUserId()) && getGender().equals(userSettings.getGender()) && getAge() == userSettings.getAge() && this.unknownFields.equals(userSettings.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUserId().hashCode()) * 37) + 2) * 53) + getGender().hashCode()) * 37) + 3) * 53) + getAge()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(UserSettings userSettings) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(userSettings);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UserSettingsOrBuilder {
        private int age_;
        private Object gender_;
        private Object userId_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_UserSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(UserSettings.class, Builder.class);
        }

        private Builder() {
            this.userId_ = "";
            this.gender_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.userId_ = "";
            this.gender_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = UserSettings.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.userId_ = "";
            this.gender_ = "";
            this.age_ = 0;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_UserSettings_descriptor;
        }

        public UserSettings getDefaultInstanceForType() {
            return UserSettings.getDefaultInstance();
        }

        public UserSettings build() {
            UserSettings buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public UserSettings buildPartial() {
            UserSettings userSettings = new UserSettings((GeneratedMessageV3.Builder) this);
            Object unused = userSettings.userId_ = this.userId_;
            Object unused2 = userSettings.gender_ = this.gender_;
            int unused3 = userSettings.age_ = this.age_;
            onBuilt();
            return userSettings;
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
            if (message instanceof UserSettings) {
                return mergeFrom((UserSettings) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(UserSettings userSettings) {
            if (userSettings == UserSettings.getDefaultInstance()) {
                return this;
            }
            if (!userSettings.getUserId().isEmpty()) {
                this.userId_ = userSettings.userId_;
                onChanged();
            }
            if (!userSettings.getGender().isEmpty()) {
                this.gender_ = userSettings.gender_;
                onChanged();
            }
            if (userSettings.getAge() != 0) {
                setAge(userSettings.getAge());
            }
            mergeUnknownFields(userSettings.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.UserSettings.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.UserSettings.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.UserSettings r3 = (com.appodeal.ads.api.UserSettings) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.UserSettings) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.UserSettings r4 = (com.appodeal.ads.api.UserSettings) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.UserSettings) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.UserSettings.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.UserSettings$Builder");
        }

        @Deprecated
        public Builder setAge(int i) {
            this.age_ = i;
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

    public static UserSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<UserSettings> parser() {
        return PARSER;
    }

    public Parser<UserSettings> getParserForType() {
        return PARSER;
    }

    public UserSettings getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
