package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;

public class DeclarationDescriptorVisitorEmptyBodies<R, D> implements DeclarationDescriptorVisitor<R, D> {
    public R visitDeclarationDescriptor(DeclarationDescriptor declarationDescriptor, D d2) {
        return null;
    }

    public R visitVariableDescriptor(VariableDescriptor variableDescriptor, D d2) {
        return visitDeclarationDescriptor(variableDescriptor, d2);
    }

    public R visitFunctionDescriptor(FunctionDescriptor functionDescriptor, D d2) {
        return visitDeclarationDescriptor(functionDescriptor, d2);
    }

    public R visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, D d2) {
        return visitDeclarationDescriptor(typeParameterDescriptor, d2);
    }

    public R visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, D d2) {
        return visitDeclarationDescriptor(packageFragmentDescriptor, d2);
    }

    public R visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, D d2) {
        return visitDeclarationDescriptor(packageViewDescriptor, d2);
    }

    public R visitClassDescriptor(ClassDescriptor classDescriptor, D d2) {
        return visitDeclarationDescriptor(classDescriptor, d2);
    }

    public R visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, D d2) {
        return visitDeclarationDescriptor(typeAliasDescriptor, d2);
    }

    public R visitModuleDeclaration(ModuleDescriptor moduleDescriptor, D d2) {
        return visitDeclarationDescriptor(moduleDescriptor, d2);
    }

    public R visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, D d2) {
        return visitFunctionDescriptor(constructorDescriptor, d2);
    }

    public R visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, D d2) {
        return visitVariableDescriptor(propertyDescriptor, d2);
    }

    public R visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, D d2) {
        return visitVariableDescriptor(valueParameterDescriptor, d2);
    }

    public R visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, D d2) {
        return visitFunctionDescriptor(propertyGetterDescriptor, d2);
    }

    public R visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, D d2) {
        return visitFunctionDescriptor(propertySetterDescriptor, d2);
    }

    public R visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, D d2) {
        return visitDeclarationDescriptor(receiverParameterDescriptor, d2);
    }
}
