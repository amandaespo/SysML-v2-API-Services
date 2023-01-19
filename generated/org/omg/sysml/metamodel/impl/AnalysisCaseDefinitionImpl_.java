package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AllocationUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Differencing;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.Intersecting;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.MetadataUsage;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Subclassification;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Unioning;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.UseCaseUsage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AnalysisCaseDefinitionImpl.class)
public abstract class AnalysisCaseDefinitionImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, CalculationUsage> calculation;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Usage> directedUsage;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, PortUsage> ownedPort;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, String> declaredShortName;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, Boolean> isConjugated;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, EnumerationUsage> ownedEnumeration;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Usage> usage;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Feature> output;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, MetadataUsage> ownedMetadata;
	public static volatile CollectionAttribute<AnalysisCaseDefinitionImpl, Usage> variant;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, ActionUsage> action;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Differencing> ownedDifferencing;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, UUID> elementId;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, Boolean> isLibraryElement;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, ViewUsage> ownedView;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, String> qualifiedName;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Documentation> documentation;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Type> intersectingType;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Feature> endFeature;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Feature> directedFeature;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, AllocationUsage> ownedAllocation;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<AnalysisCaseDefinitionImpl, FlowConnectionUsage> ownedFlow;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, ActionUsage> ownedAction;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, CaseUsage> ownedCase;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, PartUsage> actorParameter;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, OccurrenceUsage> ownedOccurrence;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, String> name;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Usage> ownedUsage;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, String> shortName;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Membership> ownedMembership;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, ActionUsage> analysisAction;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, UseCaseUsage> ownedUseCase;
	public static volatile CollectionAttribute<AnalysisCaseDefinitionImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, StateUsage> ownedState;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, Boolean> isIndividual;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Membership> membership;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, Boolean> isImpliedIncluded;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, Boolean> isVariation;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Feature> parameter;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Element> member;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Feature> ownedEndFeature;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, String> declaredName;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<AnalysisCaseDefinitionImpl, Subclassification> ownedSubclassification;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<AnalysisCaseDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Membership> importedMembership;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<AnalysisCaseDefinitionImpl, Expression> expression;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, Boolean> isModelLevelEvaluable;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, String> aliasIds;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, ConnectorAsUsage> ownedConnection;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Import> ownedImport;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<AnalysisCaseDefinitionImpl, Boolean> isAbstract;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Type> differencingType;
	public static volatile CollectionAttribute<AnalysisCaseDefinitionImpl, VariantMembership> variantMembership;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Unioning> ownedUnioning;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Type> unioningType;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Specialization> ownedSpecialization;
	public static volatile CollectionAttribute<AnalysisCaseDefinitionImpl, ConcernUsage> ownedConcern;
	public static volatile CollectionAttribute<AnalysisCaseDefinitionImpl, Step> step;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, Intersecting> ownedIntersecting;
	public static volatile ListAttribute<AnalysisCaseDefinitionImpl, PartUsage> ownedPart;

	public static final String CALCULATION = "calculation";
	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String OWNED_PORT = "ownedPort";
	public static final String DECLARED_SHORT_NAME = "declaredShortName";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_ENUMERATION = "ownedEnumeration";
	public static final String OWNED_VERIFICATION_CASE = "ownedVerificationCase";
	public static final String USAGE = "usage";
	public static final String OWNED_VIEWPOINT = "ownedViewpoint";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_RENDERING = "ownedRendering";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String OWNED_METADATA = "ownedMetadata";
	public static final String VARIANT = "variant";
	public static final String ACTION = "action";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_DIFFERENCING = "ownedDifferencing";
	public static final String ELEMENT_ID = "elementId";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IS_LIBRARY_ELEMENT = "isLibraryElement";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_VIEW = "ownedView";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String INTERSECTING_TYPE = "intersectingType";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String OWNED_ALLOCATION = "ownedAllocation";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String OWNED_FLOW = "ownedFlow";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String ACTOR_PARAMETER = "actorParameter";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String OWNED_OCCURRENCE = "ownedOccurrence";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String ANALYSIS_ACTION = "analysisAction";
	public static final String OWNED_USE_CASE = "ownedUseCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String OWNED_STATE = "ownedState";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_IMPLIED_INCLUDED = "isImpliedIncluded";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String DECLARED_NAME = "declaredName";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String OWNED_SUBCLASSIFICATION = "ownedSubclassification";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String EXPRESSION = "expression";
	public static final String IS_MODEL_LEVEL_EVALUABLE = "isModelLevelEvaluable";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_CONNECTION = "ownedConnection";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String OWNED_REQUIREMENT = "ownedRequirement";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String DIFFERENCING_TYPE = "differencingType";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String OWNED_UNIONING = "ownedUnioning";
	public static final String UNIONING_TYPE = "unioningType";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String OWNED_CONCERN = "ownedConcern";
	public static final String STEP = "step";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_INTERSECTING = "ownedIntersecting";
	public static final String OWNED_PART = "ownedPart";

}

