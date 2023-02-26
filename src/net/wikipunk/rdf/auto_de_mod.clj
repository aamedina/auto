(ns net.wikipunk.rdf.auto-de-mod
  "This ontology provides metadata for driving events ontologies"
  {:dcterms/abstract
   "This ontology provides metadata for driving events ontologies",
   :dcterms/issued #inst "2020-11-04T06:43:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/auto/ontology/master/latest/DE/MetadataDE/",
   :rdf/ns-prefix-map
   {"auto-de-mod" "https://spec.edmcouncil.org/auto/ontology/DE/MetadataDE/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "auto-de-mod",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/DE/MetadataDE/",
   :rdfs/label "Metadata for the driving events ontologies",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2020 EDM Council, Inc.",
   :sm/fileAbbreviation "auto-de-mod",
   :sm/filename "MetadataDE.rdf"})

(def DEDomain
  "This ontology provides metadata for the driving events ontologies"
  {:db/ident :auto-de-mod/DEDomain,
   :dcterms/abstract
   "This ontology provides metadata for the driving events ontologies",
   :dcterms/creator "Piotr Kulicki",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/"
    "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/"
    "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title "EDMC Automotive Ontology (AUTO) DE Domain",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/MetadataDE/",
   :rdfs/label "Driving Events",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/auto/"],
   :sm/contributor ["Piotr Kulicki" "AUTO Community" "Robert Trypuz"],
   :sm/copyright "Copyright (c) 2021 EDM Council, Inc.",
   :sm/dependsOn "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
   :sm/keyword "Driving events",
   :sm/moduleAbbreviation "auto-de"})