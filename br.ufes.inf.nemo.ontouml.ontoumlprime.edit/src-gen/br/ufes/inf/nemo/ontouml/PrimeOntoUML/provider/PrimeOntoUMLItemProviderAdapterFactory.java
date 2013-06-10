/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.provider;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.util.PrimeOntoUMLAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimeOntoUMLItemProviderAdapterFactory extends PrimeOntoUMLAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimeOntoUMLItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelItemProvider modelItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createModelAdapter()
  {
    if (modelItemProvider == null)
    {
      modelItemProvider = new ModelItemProvider(this);
    }

    return modelItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageItemProvider packageItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createPackageAdapter()
  {
    if (packageItemProvider == null)
    {
      packageItemProvider = new PackageItemProvider(this);
    }

    return packageItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneralizationSetItemProvider generalizationSetItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGeneralizationSetAdapter()
  {
    if (generalizationSetItemProvider == null)
    {
      generalizationSetItemProvider = new GeneralizationSetItemProvider(this);
    }

    return generalizationSetItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitiveDataTypeItemProvider primitiveDataTypeItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createPrimitiveDataTypeAdapter()
  {
    if (primitiveDataTypeItemProvider == null)
    {
      primitiveDataTypeItemProvider = new PrimitiveDataTypeItemProvider(this);
    }

    return primitiveDataTypeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexDataTypeItemProvider complexDataTypeItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createComplexDataTypeAdapter()
  {
    if (complexDataTypeItemProvider == null)
    {
      complexDataTypeItemProvider = new ComplexDataTypeItemProvider(this);
    }

    return complexDataTypeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeAttributeItemProvider dataTypeAttributeItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDataTypeAttributeAdapter()
  {
    if (dataTypeAttributeItemProvider == null)
    {
      dataTypeAttributeItemProvider = new DataTypeAttributeItemProvider(this);
    }

    return dataTypeAttributeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationItemProvider enumerationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEnumerationAdapter()
  {
    if (enumerationItemProvider == null)
    {
      enumerationItemProvider = new EnumerationItemProvider(this);
    }

    return enumerationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentOfRelationItemProvider componentOfRelationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createComponentOfRelationAdapter()
  {
    if (componentOfRelationItemProvider == null)
    {
      componentOfRelationItemProvider = new ComponentOfRelationItemProvider(this);
    }

    return componentOfRelationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MembershipRelationItemProvider membershipRelationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMembershipRelationAdapter()
  {
    if (membershipRelationItemProvider == null)
    {
      membershipRelationItemProvider = new MembershipRelationItemProvider(this);
    }

    return membershipRelationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubCollectionRelationItemProvider subCollectionRelationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createSubCollectionRelationAdapter()
  {
    if (subCollectionRelationItemProvider == null)
    {
      subCollectionRelationItemProvider = new SubCollectionRelationItemProvider(this);
    }

    return subCollectionRelationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubQuantityRelationItemProvider subQuantityRelationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createSubQuantityRelationAdapter()
  {
    if (subQuantityRelationItemProvider == null)
    {
      subQuantityRelationItemProvider = new SubQuantityRelationItemProvider(this);
    }

    return subQuantityRelationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KindItemProvider kindItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createKindAdapter()
  {
    if (kindItemProvider == null)
    {
      kindItemProvider = new KindItemProvider(this);
    }

    return kindItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.QuantityUniversal} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantityUniversalItemProvider quantityUniversalItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.QuantityUniversal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createQuantityUniversalAdapter()
  {
    if (quantityUniversalItemProvider == null)
    {
      quantityUniversalItemProvider = new QuantityUniversalItemProvider(this);
    }

    return quantityUniversalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectiveUniversalItemProvider collectiveUniversalItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createCollectiveUniversalAdapter()
  {
    if (collectiveUniversalItemProvider == null)
    {
      collectiveUniversalItemProvider = new CollectiveUniversalItemProvider(this);
    }

    return collectiveUniversalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubKind} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubKindItemProvider subKindItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubKind}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createSubKindAdapter()
  {
    if (subKindItemProvider == null)
    {
      subKindItemProvider = new SubKindItemProvider(this);
    }

    return subKindItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Role} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleItemProvider roleItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Role}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createRoleAdapter()
  {
    if (roleItemProvider == null)
    {
      roleItemProvider = new RoleItemProvider(this);
    }

    return roleItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhaseItemProvider phaseItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createPhaseAdapter()
  {
    if (phaseItemProvider == null)
    {
      phaseItemProvider = new PhaseItemProvider(this);
    }

    return phaseItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Category} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CategoryItemProvider categoryItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Category}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createCategoryAdapter()
  {
    if (categoryItemProvider == null)
    {
      categoryItemProvider = new CategoryItemProvider(this);
    }

    return categoryItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MixinItemProvider mixinItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMixinAdapter()
  {
    if (mixinItemProvider == null)
    {
      mixinItemProvider = new MixinItemProvider(this);
    }

    return mixinItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RoleMixin} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleMixinItemProvider roleMixinItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RoleMixin}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createRoleMixinAdapter()
  {
    if (roleMixinItemProvider == null)
    {
      roleMixinItemProvider = new RoleMixinItemProvider(this);
    }

    return roleMixinItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelatorUniversalItemProvider relatorUniversalItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createRelatorUniversalAdapter()
  {
    if (relatorUniversalItemProvider == null)
    {
      relatorUniversalItemProvider = new RelatorUniversalItemProvider(this);
    }

    return relatorUniversalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryMaterialRelationItemProvider binaryMaterialRelationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBinaryMaterialRelationAdapter()
  {
    if (binaryMaterialRelationItemProvider == null)
    {
      binaryMaterialRelationItemProvider = new BinaryMaterialRelationItemProvider(this);
    }

    return binaryMaterialRelationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryFormalRelationItemProvider binaryFormalRelationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBinaryFormalRelationAdapter()
  {
    if (binaryFormalRelationItemProvider == null)
    {
      binaryFormalRelationItemProvider = new BinaryFormalRelationItemProvider(this);
    }

    return binaryFormalRelationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MediationItemProvider mediationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMediationAdapter()
  {
    if (mediationItemProvider == null)
    {
      mediationItemProvider = new MediationItemProvider(this);
    }

    return mediationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacterizationItemProvider characterizationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createCharacterizationAdapter()
  {
    if (characterizationItemProvider == null)
    {
      characterizationItemProvider = new CharacterizationItemProvider(this);
    }

    return characterizationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModeUniversalItemProvider modeUniversalItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createModeUniversalAdapter()
  {
    if (modeUniversalItemProvider == null)
    {
      modeUniversalItemProvider = new ModeUniversalItemProvider(this);
    }

    return modeUniversalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualityUniversalItemProvider qualityUniversalItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createQualityUniversalAdapter()
  {
    if (qualityUniversalItemProvider == null)
    {
      qualityUniversalItemProvider = new QualityUniversalItemProvider(this);
    }

    return qualityUniversalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected nAryMaterialRelationItemProvider nAryMaterialRelationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createnAryMaterialRelationAdapter()
  {
    if (nAryMaterialRelationItemProvider == null)
    {
      nAryMaterialRelationItemProvider = new nAryMaterialRelationItemProvider(this);
    }

    return nAryMaterialRelationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected nAryFormalRelationItemProvider nAryFormalRelationItemProvider;

  /**
   * This creates an adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createnAryFormalRelationAdapter()
  {
    if (nAryFormalRelationItemProvider == null)
    {
      nAryFormalRelationItemProvider = new nAryFormalRelationItemProvider(this);
    }

    return nAryFormalRelationItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    if (modelItemProvider != null) modelItemProvider.dispose();
    if (packageItemProvider != null) packageItemProvider.dispose();
    if (generalizationSetItemProvider != null) generalizationSetItemProvider.dispose();
    if (primitiveDataTypeItemProvider != null) primitiveDataTypeItemProvider.dispose();
    if (complexDataTypeItemProvider != null) complexDataTypeItemProvider.dispose();
    if (dataTypeAttributeItemProvider != null) dataTypeAttributeItemProvider.dispose();
    if (enumerationItemProvider != null) enumerationItemProvider.dispose();
    if (componentOfRelationItemProvider != null) componentOfRelationItemProvider.dispose();
    if (membershipRelationItemProvider != null) membershipRelationItemProvider.dispose();
    if (subCollectionRelationItemProvider != null) subCollectionRelationItemProvider.dispose();
    if (subQuantityRelationItemProvider != null) subQuantityRelationItemProvider.dispose();
    if (kindItemProvider != null) kindItemProvider.dispose();
    if (quantityUniversalItemProvider != null) quantityUniversalItemProvider.dispose();
    if (collectiveUniversalItemProvider != null) collectiveUniversalItemProvider.dispose();
    if (subKindItemProvider != null) subKindItemProvider.dispose();
    if (roleItemProvider != null) roleItemProvider.dispose();
    if (phaseItemProvider != null) phaseItemProvider.dispose();
    if (categoryItemProvider != null) categoryItemProvider.dispose();
    if (mixinItemProvider != null) mixinItemProvider.dispose();
    if (roleMixinItemProvider != null) roleMixinItemProvider.dispose();
    if (relatorUniversalItemProvider != null) relatorUniversalItemProvider.dispose();
    if (binaryMaterialRelationItemProvider != null) binaryMaterialRelationItemProvider.dispose();
    if (binaryFormalRelationItemProvider != null) binaryFormalRelationItemProvider.dispose();
    if (mediationItemProvider != null) mediationItemProvider.dispose();
    if (characterizationItemProvider != null) characterizationItemProvider.dispose();
    if (modeUniversalItemProvider != null) modeUniversalItemProvider.dispose();
    if (qualityUniversalItemProvider != null) qualityUniversalItemProvider.dispose();
    if (nAryMaterialRelationItemProvider != null) nAryMaterialRelationItemProvider.dispose();
    if (nAryFormalRelationItemProvider != null) nAryFormalRelationItemProvider.dispose();
  }

}
