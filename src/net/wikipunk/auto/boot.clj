(ns net.wikipunk.auto.boot
  {:rdf/type :jsonld/Context}
  (:require
   [net.wikipunk.fibo.boot]
   [net.wikipunk.rdf.schema]
   [net.wikipunk.rdf.sm]
   [net.wikipunk.rdf.cmns-av]
   [net.wikipunk.rdf.fibo-fnd-utl-av]))

(def auto
  {:dcat/downloadURL "https://raw.githubusercontent.com/edmcouncil/auto/master/MetadataAUTO.rdf"
   :rdfa/prefix      "auto"
   :rdfa/uri         "https://spec.edmcouncil.org/auto/"
   :rdf/type         :rdfa/PrefixMapping})

(def auto-av-mod
  {:rdfa/prefix "auto-av-mod"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/AV/MetadataAV/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-av-mod"     "https://spec.edmcouncil.org/auto/ontology/AV/MetadataAV/"}})

(def auto-de-mod
  {:rdfa/prefix "auto-de-mod"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/DE/MetadataDE/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-de-mod" "https://spec.edmcouncil.org/auto/ontology/DE/MetadataDE/"}})

(def auto-vs-mod
  {:rdfa/prefix "auto-vs-mod"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/VS/MetadataVS/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-vs-mod" "https://spec.edmcouncil.org/auto/ontology/VS/MetadataVS/"}})

(def auto-vc-mod
  {:rdfa/prefix "auto-vc-mod"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/VC/MetadataVC/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-vc-mod" "https://spec.edmcouncil.org/auto/ontology/VC/MetadataVC/"}})

(def auto-mo-mod
  {:rdfa/prefix "auto-mo-mod"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/MO/MetadataMO/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-mo-mod" "https://spec.edmcouncil.org/auto/ontology/MO/MetadataMO/"}})

(def auto-av
  {:rdfa/prefix "auto-av"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-av"         "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/"
    "fibo-fnd-utl-av" "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "sm"              "http://www.omg.org/techprocess/ab/SpecificationMetadata/"}})

(def auto-ti
  {:rdfa/prefix "auto-ti"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-ti" "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/"}})

(def auto-ev
  {:rdfa/prefix "auto-ev"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-ev" "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/"}})

(def auto-cc
  {:rdfa/prefix "auto-cc"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-cc" "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/"}})

(def auto-vs
  {:dcat/downloadURL "https://raw.githubusercontent.com/edmcouncil/auto/master/VS/VehicleSignals.rdf"
   :rdfa/prefix "auto-vs"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/VS/VehicleSignals/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-vs" "https://spec.edmcouncil.org/auto/ontology/VS/VehicleSignals/"}})

(def auto-vc
  {:rdfa/prefix "auto-vc"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-vc" "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"}})

(def auto-vp
  {:rdfa/prefix "auto-vp"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-vp" "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/"}})

(def auto-mo
  {:rdfa/prefix "auto-mo"
   :rdfa/uri    "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map
   {"auto-mo" "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/"}})
