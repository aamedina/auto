(ns net.wikipunk.rdf.auto-mo-mod
  "This ontology provides metadata for the middle ontology."
  {:dcterms/abstract "This ontology provides metadata for the middle ontology.",
   :dcterms/creator "Robert Trypuz",
   :dcterms/issued #inst "2020-10-29T05:43:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/auto/ontology/master/latest/MO/MetadataMO/",
   :rdf/ns-prefix-map
   {"auto-mo-mod" "https://spec.edmcouncil.org/auto/ontology/MO/MetadataMO/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/auto/ontology/MO/MetadataMO/",
   :rdfa/prefix "auto-mo-mod",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/MO/MetadataMO/",
   :rdfs/label "Metadata for the EDMC-AUTO middle ontology (MO)",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2021 EDM Council, Inc.",
   :sm/fileAbbreviation "auto-mo-mod",
   :sm/filename "MetadataMO.rdf"})

(def ECDomain
  "EDMC-AUTO middle ontology"
  {:db/ident :auto-mo-mod/ECDomain,
   :dcterms/abstract "EDMC-AUTO middle ontology",
   :dcterms/creator "https://www.w3.org/community/gao/",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title "Vehicle middle ontology (MO)",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/MO/MetadataMO/",
   :rdfs/label "Middle Ontology",
   :rdfs/seeAlso "https://spec.edmcouncil.org/auto/",
   :sm/contributor ["The John Paul II Catholic University of Lublin"
                    "Hepp Research GmbH"
                    "Makolab SA"],
   :sm/copyright "Copyright (c) 2021 EDM Council, Inc.",
   :sm/dependsOn "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
   :sm/keyword "middle ontology",
   :sm/moduleAbbreviation "auto-mo"})