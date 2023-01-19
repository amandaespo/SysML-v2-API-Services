package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Differencing;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureInverting;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Intersecting;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Unioning;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MetadataFeatureImpl.class)
public abstract class MetadataFeatureImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile SingularAttribute<MetadataFeatureImpl, String> declaredShortName;
	public static volatile ListAttribute<MetadataFeatureImpl, Feature> chainingFeature;
	public static volatile ListAttribute<MetadataFeatureImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<MetadataFeatureImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<MetadataFeatureImpl, Type> type;
	public static volatile ListAttribute<MetadataFeatureImpl, Feature> output;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isSufficient;
	public static volatile ListAttribute<MetadataFeatureImpl, Differencing> ownedDifferencing;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<MetadataFeatureImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<MetadataFeatureImpl, UUID> elementId;
	public static volatile ListAttribute<MetadataFeatureImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isLibraryElement;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isDerived;
	public static volatile ListAttribute<MetadataFeatureImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<MetadataFeatureImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<MetadataFeatureImpl, String> qualifiedName;
	public static volatile ListAttribute<MetadataFeatureImpl, Documentation> documentation;
	public static volatile ListAttribute<MetadataFeatureImpl, Type> intersectingType;
	public static volatile ListAttribute<MetadataFeatureImpl, Feature> endFeature;
	public static volatile ListAttribute<MetadataFeatureImpl, Feature> directedFeature;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isEnd;
	public static volatile ListAttribute<MetadataFeatureImpl, Type> featuringType;
	public static volatile ListAttribute<MetadataFeatureImpl, Feature> input;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isComposite;
	public static volatile SingularAttribute<MetadataFeatureImpl, String> name;
	public static volatile SingularAttribute<MetadataFeatureImpl, String> shortName;
	public static volatile ListAttribute<MetadataFeatureImpl, Element> ownedMember;
	public static volatile ListAttribute<MetadataFeatureImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<MetadataFeatureImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<MetadataFeatureImpl, Membership> membership;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isPortion;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isImpliedIncluded;
	public static volatile ListAttribute<MetadataFeatureImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isReadOnly;
	public static volatile ListAttribute<MetadataFeatureImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<MetadataFeatureImpl, Feature> feature;
	public static volatile ListAttribute<MetadataFeatureImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<MetadataFeatureImpl, Element> member;
	public static volatile ListAttribute<MetadataFeatureImpl, Feature> ownedEndFeature;
	public static volatile SingularAttribute<MetadataFeatureImpl, String> declaredName;
	public static volatile ListAttribute<MetadataFeatureImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<MetadataFeatureImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<MetadataFeatureImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<MetadataFeatureImpl, Annotation> annotation;
	public static volatile ListAttribute<MetadataFeatureImpl, Membership> importedMembership;
	public static volatile ListAttribute<MetadataFeatureImpl, Element> ownedElement;
	public static volatile ListAttribute<MetadataFeatureImpl, String> aliasIds;
	public static volatile ListAttribute<MetadataFeatureImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<MetadataFeatureImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<MetadataFeatureImpl, Import> ownedImport;
	public static volatile ListAttribute<MetadataFeatureImpl, Element> annotatedElement;
	public static volatile SingularAttribute<MetadataFeatureImpl, Boolean> isAbstract;
	public static volatile ListAttribute<MetadataFeatureImpl, Type> differencingType;
	public static volatile ListAttribute<MetadataFeatureImpl, Unioning> ownedUnioning;
	public static volatile ListAttribute<MetadataFeatureImpl, Type> unioningType;
	public static volatile ListAttribute<MetadataFeatureImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<MetadataFeatureImpl, Intersecting> ownedIntersecting;
	public static volatile CollectionAttribute<MetadataFeatureImpl, FeatureInverting> ownedFeatureInverting;

	public static final String DECLARED_SHORT_NAME = "declaredShortName";
	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_DIFFERENCING = "ownedDifferencing";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String ELEMENT_ID = "elementId";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IS_LIBRARY_ELEMENT = "isLibraryElement";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String INTERSECTING_TYPE = "intersectingType";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String IS_END = "isEnd";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NAME = "name";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_PORTION = "isPortion";
	public static final String IS_IMPLIED_INCLUDED = "isImpliedIncluded";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String DECLARED_NAME = "declaredName";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String DIRECTION = "direction";
	public static final String ANNOTATION = "annotation";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String ANNOTATED_ELEMENT = "annotatedElement";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String DIFFERENCING_TYPE = "differencingType";
	public static final String OWNED_UNIONING = "ownedUnioning";
	public static final String UNIONING_TYPE = "unioningType";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String OWNED_INTERSECTING = "ownedIntersecting";
	public static final String OWNED_FEATURE_INVERTING = "ownedFeatureInverting";

}

