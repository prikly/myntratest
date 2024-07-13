package com.explorestack.protobuf;

import com.explorestack.protobuf.GeneratedMessage;
import com.explorestack.protobuf.GeneratedMessage.Builder;
import com.explorestack.protobuf.MessageOrBuilder;

public class SingleFieldBuilder<MType extends GeneratedMessage, BType extends GeneratedMessage.Builder, IType extends MessageOrBuilder> implements GeneratedMessage.BuilderParent {
    private BType builder;
    private boolean isClean;
    private MType message;
    private GeneratedMessage.BuilderParent parent;

    public SingleFieldBuilder(MType mtype, GeneratedMessage.BuilderParent builderParent, boolean z) {
        this.message = (GeneratedMessage) Internal.checkNotNull(mtype);
        this.parent = builderParent;
        this.isClean = z;
    }

    public void dispose() {
        this.parent = null;
    }

    public MType getMessage() {
        if (this.message == null) {
            this.message = (GeneratedMessage) this.builder.buildPartial();
        }
        return this.message;
    }

    public MType build() {
        this.isClean = true;
        return getMessage();
    }

    public BType getBuilder() {
        if (this.builder == null) {
            BType btype = (GeneratedMessage.Builder) this.message.newBuilderForType((GeneratedMessage.BuilderParent) this);
            this.builder = btype;
            btype.mergeFrom((Message) this.message);
            this.builder.markClean();
        }
        return this.builder;
    }

    public IType getMessageOrBuilder() {
        Object obj = this.builder;
        if (obj != null) {
            return obj;
        }
        return this.message;
    }

    public SingleFieldBuilder<MType, BType, IType> setMessage(MType mtype) {
        this.message = (GeneratedMessage) Internal.checkNotNull(mtype);
        BType btype = this.builder;
        if (btype != null) {
            btype.dispose();
            this.builder = null;
        }
        onChanged();
        return this;
    }

    public SingleFieldBuilder<MType, BType, IType> mergeFrom(MType mtype) {
        if (this.builder == null) {
            MType mtype2 = this.message;
            if (mtype2 == mtype2.getDefaultInstanceForType()) {
                this.message = mtype;
                onChanged();
                return this;
            }
        }
        getBuilder().mergeFrom((Message) mtype);
        onChanged();
        return this;
    }

    public SingleFieldBuilder<MType, BType, IType> clear() {
        MType mtype;
        MType mtype2 = this.message;
        if (mtype2 != null) {
            mtype = mtype2.getDefaultInstanceForType();
        } else {
            mtype = this.builder.getDefaultInstanceForType();
        }
        this.message = (GeneratedMessage) mtype;
        BType btype = this.builder;
        if (btype != null) {
            btype.dispose();
            this.builder = null;
        }
        onChanged();
        return this;
    }

    private void onChanged() {
        GeneratedMessage.BuilderParent builderParent;
        if (this.builder != null) {
            this.message = null;
        }
        if (this.isClean && (builderParent = this.parent) != null) {
            builderParent.markDirty();
            this.isClean = false;
        }
    }

    public void markDirty() {
        onChanged();
    }
}
