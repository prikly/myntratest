package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: PackageFragmentDescriptorImpl.kt */
public abstract class PackageFragmentDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PackageFragmentDescriptor {
    private final String debugString;
    private final FqName fqName;

    public final FqName getFqName() {
        return this.fqName;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PackageFragmentDescriptorImpl(ModuleDescriptor moduleDescriptor, FqName fqName2) {
        super(moduleDescriptor, Annotations.Companion.getEMPTY(), fqName2.shortNameOrSpecial(), SourceElement.NO_SOURCE);
        Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
        Intrinsics.checkNotNullParameter(fqName2, "fqName");
        this.fqName = fqName2;
        this.debugString = "package " + this.fqName + " of " + moduleDescriptor;
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d2) {
        Intrinsics.checkNotNullParameter(declarationDescriptorVisitor, "visitor");
        return declarationDescriptorVisitor.visitPackageFragmentDescriptor(this, d2);
    }

    public ModuleDescriptor getContainingDeclaration() {
        return (ModuleDescriptor) super.getContainingDeclaration();
    }

    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(sourceElement, "NO_SOURCE");
        return sourceElement;
    }

    public String toString() {
        return this.debugString;
    }
}
