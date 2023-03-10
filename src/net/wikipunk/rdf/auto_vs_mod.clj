(ns net.wikipunk.rdf.auto-vs-mod
  "This ontology provides metadata for the Vehicle Signals Ontologies"
  {:dcterms/abstract
   "This ontology provides metadata for the Vehicle Signals Ontologies",
   :dcterms/issued #inst "2020-03-18T05:43:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/auto/ontology/master/latest/VS/MetadataVS/",
   :rdf/ns-prefix-map
   {"auto-vs-mod" "https://spec.edmcouncil.org/auto/ontology/VS/MetadataVS/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "auto-vs-mod",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/VS/MetadataVS/",
   :rdfs/label "Metadata for the Vehicle Signals Ontologies",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2020 EDM Council, Inc.",
   :sm/fileAbbreviation "auto-vs-mod",
   :sm/filename "MetadataVS.rdf"})

(def VSDomain
  "This ontology provides metadata for the Vehicle Signals Ontologies"
  {:db/ident :auto-vs-mod/VSDomain,
   :dcterms/abstract
   "This ontology provides metadata for the Vehicle Signals Ontologies",
   :dcterms/creator "https://www.w3.org/community/gao/",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/auto/ontology/VS/VehicleSignals/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title "EDMC Automotive Ontology (AUTO) VS Domain",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/VS/MetadataVS/",
   :rdfs/label "Vehicle Signals",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/auto/"],
   :sm/contributor "FIBO Community",
   :sm/copyright "Copyright (c) 2020 EDM Council, Inc.",
   :sm/dependsOn "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
   :sm/keyword "Vehicle Signals",
   :sm/moduleAbbreviation "auto-vs"})