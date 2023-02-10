(ns net.wikipunk.rdf.auto-av-mod
  "This ontology provides metadata for driving events ontologies"
  {:dcterms/abstract
   "This ontology provides metadata for driving events ontologies",
   :dcterms/issued #inst "2022-09-11T04:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/auto/ontology/master/latest/AV/MetadataAV/",
   :rdf/ns-prefix-map
   {"auto-av-mod" "https://spec.edmcouncil.org/auto/ontology/AV/MetadataAV/"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/auto/ontology/AV/MetadataAV/",
   :rdfa/prefix "auto-av-mod",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/AV/MetadataAV/",
   :rdfs/label "Metadata for the driving events ontologies",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2022 EDM Council, Inc.",
   :sm/fileAbbreviation "auto-av-mod",
   :sm/filename "MetadataAV.rdf"})

(def AVDomain
  "This ontology provides metadata for the autonomous vehicle ontologies"
  {:db/ident :auto-av-mod/AVDomain,
   :dcterms/abstract
   "This ontology provides metadata for the autonomous vehicle ontologies",
   :dcterms/creator ["Robert Trypuz" "Pawel Garbacz"],
   :dcterms/hasPart
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title "EDMC Automotive Ontology (AUTO) Autonomous Vehicles Domain",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/AV/MetadataAV/",
   :rdfs/label "Autonomous Vehicles",
   :sm/contributor ["Paweł Garbacz" "AUTO Community"],
   :sm/copyright "Copyright (c) 2022 EDM Council, Inc.",
   :sm/dependsOn "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
   :sm/keyword "Autonomous Vehicles",
   :sm/moduleAbbreviation "auto-av"})