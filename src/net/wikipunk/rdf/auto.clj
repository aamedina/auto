(ns net.wikipunk.rdf.auto
  "This is the metadata ontology used to describe the AUTO Specification."
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/auto/master/MetadataAUTO.rdf",
   :dcterms/abstract
   "This is the metadata ontology used to describe the AUTO Specification.",
   :dcterms/issued #inst "2022-09-11T04:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports ["https://spec.edmcouncil.org/auto/ontology/AV/MetadataAV/"
                 "https://spec.edmcouncil.org/auto/ontology/DE/MetadataDE/"
                 "https://spec.edmcouncil.org/auto/ontology/VC/MetadataVC/"
                 "https://spec.edmcouncil.org/auto/ontology/MO/MetadataMO/"
                 "https://spec.edmcouncil.org/auto/ontology/VS/MetadataVS/"],
   :owl/versionIRI "https://spec.edmcouncil.org/auto/ontology/MetadataAUTO/",
   :rdf/ns-prefix-map
   {"auto" "https://spec.edmcouncil.org/auto/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-fnd-utl-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "auto",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/MetadataAUTO/",
   :rdfs/label "Metadata for the EDMC-AUTO Specification",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2022 EDM Council, Inc.",
   :sm/fileAbbreviation "auto-spec",
   :sm/filename "MetadataAUTO.rdf"})

(def AutoDomain
  "The Automotive Ontology (AUTO) is a collaborative effort among industry practitioners, semantic technology experts and information scientists to standardize the language used to precisely define the terms, conditions, and characteristics of automotive domain. The definitions and relationships that comprise the AUTO specification have been modularized into a number of domains, which in turn include a number constituent ontologies."
  {:db/ident :auto/AutoDomain,
   :dcterms/abstract
   "The Automotive Ontology (AUTO) is a collaborative effort among industry practitioners, semantic technology experts and information scientists to standardize the language used to precisely define the terms, conditions, and characteristics of automotive domain.  The definitions and relationships that comprise the AUTO specification have been modularized into a number of domains, which in turn include a number constituent ontologies.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/auto/ontology/AV/MetadataAV/"
    "https://spec.edmcouncil.org/auto/ontology/DE/MetadataDE/"
    "https://spec.edmcouncil.org/auto/ontology/VS/MetadataVS/"
    "https://spec.edmcouncil.org/auto/ontology/VS/MetadataVC/"
    "https://spec.edmcouncil.org/auto/ontology/MO/MetadataMO/"],
   :dcterms/issued #inst "2022-09-11T04:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title "Automotive Ontology (AUTO)",
   :owl/imports "https://spec.edmcouncil.org/auto/ontology/VC/MetadataVC/",
   :rdf/type [:sm/Specification :owl/NamedIndividual],
   :rdfs/label "Automotive Ontology",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/auto/"],
   :sm/copyright "Copyright (c) 2022 EDM Council, Inc.",
   :sm/dependsOn "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
   :sm/keyword "Automotive Ontology",
   :sm/specificationAbbreviation "AUTO",
   :sm/specificationURL "https://spec.edmcouncil.org/auto/",
   :sm/technologyArea "formal semantics"})