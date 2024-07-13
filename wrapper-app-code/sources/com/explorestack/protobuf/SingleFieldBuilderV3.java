package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessage.Builder;
import com.explorestack.protobuf.MessageOrBuilder;

public class SingleFieldBuilderV3<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> implements AbstractMessage.BuilderParent {
    private BType builder;
    private boolean isClean;
    private MType message;
    private AbstractMessage.BuilderParent parent;

    public SingleFieldBuilderV3(MType mtype, AbstractMessage.BuilderParent builderParent, boolean z) {
        this.message = (AbstractMessage) Internal.checkNotNull(mtype);
        this.parent = builderParent;
        this.isClean = z;
    }

    public void dispose() {
        this.parent = null;
    }

    public MType getMessage() {
        if (this.message == null) {
            this.message = (AbstractMessage) this.builder.buildPartial();
        }
        return this.message;
    }

    public MType build() {
        this.isClean = true;
        return getMessage();
    }

    public BType getBuilder() {
        if (this.builder == null) {
            BType btype = (AbstractMessage.Builder) this.message.newBuilderForType(this);
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

    public SingleFieldBuilderV3<MType, BType, IType> setMessage(MType mtype) {
        this.message = (AbstractMessage) Internal.checkNotNull(mtype);
        BType btype = this.builder;
        if (btype != null) {
            btype.dispose();
            this.builder = null;
        }
        onChanged();
        return this;
    }

    public SingleFieldBuilderV3<MType, BType, IType> mergeFrom(MType mtype) {
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

    public SingleFieldBuilderV3<MType, BType, IType> clear() {
        MType mtype;
        MType mtype2 = this.message;
        if (mtype2 != null) {
            mtype = mtype2.getDefaultInstanceForType();
        } else {
            mtype = this.builder.getDefaultInstanceForType();
        }
        this.message = (AbstractMessage) mtype;
        BType btype = this.builder;
        if (btype != null) {
            btype.dispose();
            this.builder = null;
        }
        onChanged();
        return this;
    }

    private void onChanged() {
        AbstractMessage.BuilderParent builderParent;
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
