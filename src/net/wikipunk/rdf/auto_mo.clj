(ns net.wikipunk.rdf.auto-mo
  "The EDMC-AUTO middle ontology"
  {:dcterms/abstract "The EDMC-AUTO middle ontology",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdf/ns-prefix-map
   {"auto-mo" "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfa/prefix "auto-mo",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/comment "QName: auto-mo-mo:",
   :rdfs/label "EDMC-AUTO Middle Ontology (MO)",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2020 EDM Council, Inc.",
   :sm/dependsOn "https://spec.edmcouncil.org/auto/ontology/MO/",
   :sm/fileAbbreviation "auto-mo-mo",
   :sm/filename "MiddleOntology.rdf"})

(def Action
  "QName: auto-mo-mo:Action"
  {:db/ident :auto-mo/Action,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:Action",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "action"},
   :rdfs/subClassOf :auto-mo/Process})

(def Agent
  "QName: auto-mo-mo:Agent"
  {:db/ident :auto-mo/Agent,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:Agent",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agent"},
   :rdfs/subClassOf :auto-mo/Object})

(def Continuant
  "Continuant"
  {:db/ident :auto-mo/Continuant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Continuant"}})

(def Disposition
  "Disposition"
  {:db/ident :auto-mo/Disposition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disposition"},
   :rdfs/subClassOf :auto-mo/RealizableEntity})

(def GenericallyDependentContinuant
  "Generically dependent continuant"
  {:db/ident :auto-mo/GenericallyDependentContinuant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Generically dependent continuant"},
   :rdfs/subClassOf :auto-mo/Continuant})

(def ImmaterialEntity
  "Immaterial entity"
  {:db/ident :auto-mo/ImmaterialEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Immaterial entity"},
   :rdfs/subClassOf :auto-mo/IndependentContinuant})

(def IndependentContinuant
  "Independent continuant"
  {:db/ident :auto-mo/IndependentContinuant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Independent continuant"},
   :rdfs/subClassOf :auto-mo/Continuant})

(def Location
  "QName: auto-mo-mo:Location"
  {:db/ident :auto-mo/Location,
   :fibo-fnd-utl-av/synonym {:rdf/language "en",
                             :rdf/value    "place"},
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:Location",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "location"},
   :rdfs/subClassOf :auto-mo/ImmaterialEntity})

(def MaterialEntity
  "Material entity"
  {:db/ident :auto-mo/MaterialEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Material entity"},
   :rdfs/subClassOf :auto-mo/IndependentContinuant})

(def Model
  "QName: auto-mo-mo:Model"
  {:db/ident :auto-mo/Model,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:Model",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "model"},
   :rdfs/subClassOf :auto-mo/GenericallyDependentContinuant})

(def NumericalValue
  "QName: auto-mo-mo:NumericalValue"
  {:db/ident :auto-mo/NumericalValue,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:NumericalValue",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "numerical value"},
   :rdfs/subClassOf :auto-mo/QuantitativeValue})

(def ObjectClass
  "QName: auto-mo-mo:Object"
  {:db/ident :auto-mo/Object,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:Object",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "object"},
   :rdfs/subClassOf :auto-mo/MaterialEntity})

(def Occurrent
  "Occurrent"
  {:db/ident :auto-mo/Occurrent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Occurrent"}})

(def Organization
  "QName: auto-mo-mo:Organization"
  {:db/ident :auto-mo/Organization,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:Organization",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization"},
   :rdfs/subClassOf :auto-mo/ImmaterialEntity})

(def Person
  "Any living human."
  {:db/ident :auto-mo/Person,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.1.1",
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Within the context of this manual, a fetus is considered part of a pregnant woman rather than a separate individual. After death, a human body is not considered to be a person."}
    "QName: auto-mo-mo:Person"],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "person"},
   :rdfs/subClassOf :auto-mo/Agent,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Any living human."}})

(def PostalAddress
  "QName: auto-mo-mo:PostalAddress"
  {:db/ident :auto-mo/PostalAddress,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:PostalAddress",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "postal address"},
   :rdfs/subClassOf :auto-mo/GenericallyDependentContinuant})

(def ProcessClass
  "QName: auto-mo-mo:Process"
  {:db/ident :auto-mo/Process,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:Process",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "process"},
   :rdfs/subClassOf :auto-mo/Occurrent})

(def PropertyValue
  "A property-value pair, e.g. representing a feature of a product or place."
  {:db/ident :auto-mo/PropertyValue,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:PropertyValue",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "property value"},
   :rdfs/subClassOf :auto-mo/Quality,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A property-value pair, e.g. representing a feature of a product or place."}})

(def QualitativeValue
  "a predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'"
  {:db/ident :auto-mo/QualitativeValue,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:QualitativeValue",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "qualitative value"},
   :rdfs/subClassOf :auto-mo/ValueSpace,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'"},
   :sm/directSource "https://schema.org/QualitativeValue"})

(def Quality
  "Quality"
  {:db/ident :auto-mo/Quality,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quality"},
   :rdfs/subClassOf :auto-mo/SpecificallyDependentContinuant})

(def QuantitativeValue
  "a point value or interval for product characteristics and other purposes"
  {:db/ident :auto-mo/QuantitativeValue,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:QuantitativeValue",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quantitative value"},
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :auto-mo/hasUnit,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :auto-mo/ValueSpace
                     {:owl/onProperty     :auto-mo/hasValue,
                      :owl/someValuesFrom :rdfs/Literal,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a point value or interval for product characteristics and other purposes"},
   :sm/directSource "https://schema.org/QuantitativeValue"})

(def QuantitativeValueFloat
  "QName: auto-mo-mo:QuantitativeValueFloat"
  {:db/ident :auto-mo/QuantitativeValueFloat,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:QuantitativeValueFloat",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quantitative value float"},
   :rdfs/subClassOf :auto-mo/NumericalValue})

(def QuantitativeValueInteger
  "QName: auto-mo-mo:QuantitativeValueInteger"
  {:db/ident :auto-mo/QuantitativeValueInteger,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:QuantitativeValueInteger",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quantitative value integer"},
   :rdfs/subClassOf :auto-mo/NumericalValue})

(def RealizableEntity
  "Realizable entity"
  {:db/ident :auto-mo/RealizableEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Realizable entity"},
   :rdfs/subClassOf :auto-mo/SpecificallyDependentContinuant})

(def Role
  "QName: auto-mo-mo:Role"
  {:db/ident :auto-mo/Role,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:Role",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "role"},
   :rdfs/subClassOf :auto-mo/RealizableEntity})

(def SpecificallyDependentContinuant
  {:db/ident :auto-mo/SpecificallyDependentContinuant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/subClassOf :auto-mo/Continuant})

(def TextValue
  "QName: auto-mo-mo:TextValue"
  {:db/ident :auto-mo/TextValue,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:TextValue",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "text value"},
   :rdfs/subClassOf :auto-mo/ValueSpace})

(def ValueSpace
  "QName: auto-mo-mo:ValueSpace"
  {:db/ident :auto-mo/ValueSpace,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-mo-mo:ValueSpace",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "value space"}})

(def hasMaxValue
  "QName: auto-mo-mo:hasMaxValue"
  {:db/ident :auto-mo/hasMaxValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "QName: auto-mo-mo:hasMaxValue",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has max value"},
   :rdfs/subPropertyOf :auto-mo/hasValue})

(def hasMinValue
  "QName: auto-mo-mo:hasMinValue"
  {:db/ident :auto-mo/hasMinValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "QName: auto-mo-mo:hasMinValue",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has min value"},
   :rdfs/subPropertyOf :auto-mo/hasValue})

(def hasPart
  "QName: auto-mo-mo:hasPart"
  {:db/ident :auto-mo/hasPart,
   :owl/inverseOf :auto-mo/isPartOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "QName: auto-mo-mo:hasPart",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has part"}})

(def hasUnit
  "QName: auto-mo-mo:hasUnit"
  {:db/ident :auto-mo/hasUnit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "QName: auto-mo-mo:hasUnit",
   :rdfs/domain :auto-mo/QuantitativeValue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has unit"}})

(def hasValue
  "QName: auto-mo-mo:hasValue"
  {:db/ident :auto-mo/hasValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "QName: auto-mo-mo:hasValue",
   :rdfs/domain :auto-mo/QuantitativeValue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has value"}})

(def isPartOf
  "QName: auto-mo-mo:isPartOf"
  {:db/ident :auto-mo/isPartOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "QName: auto-mo-mo:isPartOf",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is part of"}})

(def valueReference
  "QName: auto-mo-mo:valueReference"
  {:db/ident :auto-mo/valueReference,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "QName: auto-mo-mo:valueReference",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "value reference"}})