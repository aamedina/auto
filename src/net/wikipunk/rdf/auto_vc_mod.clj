(ns net.wikipunk.rdf.auto-vc-mod
  "This ontology provides metadata for the vehicle core concepts."
  {:dcterms/abstract
   "This ontology provides metadata for the vehicle core concepts.",
   :dcterms/creator "Robert Trypuz",
   :dcterms/issued #inst "2021-07-17T05:43:00.000-00:00",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/auto/ontology/master/latest/VC/MetadataVC/",
   :rdf/ns-prefix-map
   {"auto-vc-mod" "https://spec.edmcouncil.org/auto/ontology/VC/MetadataVC/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "auto-vc-mod",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/VC/MetadataVC/",
   :rdfs/label "Metadata for the EDMC-AUTO Vehicle Core (VC) Domain",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2021 EDM Council, Inc.",
   :sm/fileAbbreviation "auto-vc-mod",
   :sm/filename "MetadataVC.rdf"})

(def VCDomain
  "Automotive Core: A schema.org-compliant fundamental ontology for vehicle information in e-commerce."
  {:db/ident :auto-vc-mod/VCDomain,
   :dcterms/abstract
   "Automotive Core: A schema.org-compliant fundamental ontology for vehicle information in e-commerce.",
   :dcterms/creator "https://www.w3.org/community/gao/",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title "EDMC Automotive Ontology (AUTO) VC Domain",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/VC/MetadataVC/",
   :rdfs/label "Vehicle Core",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/auto/"],
   :sm/contributor ["W3C Automotive Ontology Community Group"
                    "Makolab SA"
                    "Hepp Research GmbH"
                    "The John Paul II Catholic University of Lublin"],
   :sm/copyright "Copyright (c) 2021 EDM Council, Inc.",
   :sm/dependsOn "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
   :sm/keyword
   ["Ontology" "Cars" "Boats" "Bikes" "Automobiles" "Used Cars" "Vehicles"],
   :sm/moduleAbbreviation "auto-vc"})