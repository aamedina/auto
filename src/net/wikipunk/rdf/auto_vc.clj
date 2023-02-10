(ns net.wikipunk.rdf.auto-vc
  "The Vehicle Core (VC) module focuses on the core concepts related to vehicles' types, structure and configuration. It contains many classes and properties extracted from: - the automotive extension of schema.org (https://schema.org/docs/automotive.html). - the Volkswagen Vehicles Ontology created by Martin Hepp with the contribution of Charles Sandeman-Craik, Tribal DDB; Chris Jenkins, Tribal DDB; Tim Redding, Tribal DDB; Yago Otero, Tribal DDB; William Greenly, Tribal DDB; Robin Dingle, Volkswagen UK (see https://lov.linkeddata.es/dataset/lov/vocabs/vvo) and available under the Creative Commons Attribution 3.0 Unported license (see http://creativecommons.org/licenses/by/3.0/). - the Car Options Ontology (COO) created by Martin Hepp, Hepp Research GmbH, with the contribution of Charles Sandeman-Craik, Tribal DDB; Chris Jenkins, Tribal DDB; Tim Redding, Tribal DDB; Yago Otero, Tribal DDB; William Greenly, Tribal DDB; Robin Dingle, Volkswagen UK (see https://lov.linkeddata.es/dataset/lov/vocabs/coo) and available under the Creative Commons Attribution 3.0 Unported license (see http://creativecommons.org/licenses/by/3.0/). - the Vehicle Emissions Ontology (VEO) created by Bojan Najdenov, with the contribution of Milos Jovanovik (see https://lov.linkeddata.es/dataset/lov/vocabs/veo) and available under the Creative Commons Attribution 3.0 Unported license (see http://creativecommons.org/licenses/by/3.0/). - the Car Ontology (CAR) created by Lihua Zhao and Yutaka Sasaki at the Computational Intelligence Laboratory, Toyota Technological Institute, Nagoya, Japan (see https://www.toyota-ti.ac.jp/Lab/Denshi/COIN/Ontology/TTICore-0.03/) and published by the Toyota Technological Institute Smart Vehicle Research Project. MAP, as created by the Computational Intelligence Laboratory, is available under the Creative Commons - Attribution-NonCommercial-ShareAlike 4.0 International (http://creativecommons.org/licenses/by-nc-sa/4.0/). - the Used Cars Ontology (UCO) (created by Hepp Research GmbH and Makolab SA (see http://ontologies.makolab.com/uco/ns.html) and available under the Creative Commons Attribution 3.0 Unported license; see http://creativecommons.org/licenses/by/3.0/) - the Vehicle Sales Ontology (VSO) (created by Martin Hepp (see https://lov.linkeddata.es/dataset/lov/vocabs/vso) and available under the Creative Commons Attribution 3.0 Unported license; see http://creativecommons.org/licenses/by/3.0/)."
  {:dc11/contributor "Robert Trypuz",
   :dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "The Vehicle Core (VC) module focuses on the core concepts related to vehicles' types, structure and configuration.\n\nIt contains many classes and properties extracted from:\n- the automotive extension of schema.org (https://schema.org/docs/automotive.html). \n- the Volkswagen Vehicles Ontology created by Martin Hepp with the contribution of Charles Sandeman-Craik, Tribal DDB; Chris Jenkins, Tribal DDB; Tim Redding, Tribal DDB; Yago Otero, Tribal DDB; William Greenly, Tribal DDB; Robin Dingle, Volkswagen UK (see https://lov.linkeddata.es/dataset/lov/vocabs/vvo) and available under the Creative Commons Attribution 3.0 Unported license (see http://creativecommons.org/licenses/by/3.0/). \n- the Car Options Ontology (COO) created by Martin Hepp, Hepp Research GmbH, with the contribution of Charles Sandeman-Craik, Tribal DDB; Chris Jenkins, Tribal DDB; Tim Redding, Tribal DDB; Yago Otero, Tribal DDB; William Greenly, Tribal DDB; Robin Dingle, Volkswagen UK (see https://lov.linkeddata.es/dataset/lov/vocabs/coo) and available under the Creative Commons Attribution 3.0 Unported license (see http://creativecommons.org/licenses/by/3.0/).\n- the Vehicle Emissions Ontology (VEO) created by Bojan Najdenov, with the contribution of Milos Jovanovik (see https://lov.linkeddata.es/dataset/lov/vocabs/veo) and available under the Creative Commons Attribution 3.0 Unported license (see http://creativecommons.org/licenses/by/3.0/).\n- the Car Ontology (CAR) created by Lihua Zhao and Yutaka Sasaki at the Computational Intelligence Laboratory, Toyota Technological Institute, Nagoya, Japan (see https://www.toyota-ti.ac.jp/Lab/Denshi/COIN/Ontology/TTICore-0.03/) and published by the Toyota Technological Institute Smart Vehicle Research Project. MAP, as created by the Computational Intelligence Laboratory, is available under the Creative Commons - Attribution-NonCommercial-ShareAlike\n4.0 International (http://creativecommons.org/licenses/by-nc-sa/4.0/).\n- the Used Cars Ontology (UCO) (created by Hepp Research GmbH and Makolab SA (see http://ontologies.makolab.com/uco/ns.html) and available under the Creative Commons Attribution 3.0 Unported license; see http://creativecommons.org/licenses/by/3.0/)\n- the Vehicle Sales Ontology (VSO) (created by Martin Hepp (see https://lov.linkeddata.es/dataset/lov/vocabs/vso) and available under the Creative Commons Attribution 3.0 Unported license; see http://creativecommons.org/licenses/by/3.0/)."},
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/auto/ontology/master/latest/MO/MiddleOntology/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/auto/ontology/master/latest/VC/VehicleCore/",
   :rdf/ns-prefix-map
   {"auto-vc" "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfa/prefix "auto-vc",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "Vehicle core ontology (VC)",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2021 EDM Council, Inc.",
   :sm/fileAbbreviation "auto-vc-vc",
   :sm/filename "VehicleCore.rdf",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/hasMaturityLevel"
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/Provisional"}
  (:refer-clojure :exclude [max min type]))

(def AgriculturalCommodityTrailer
  "trailer that is designed to transport bulk agricultural commodities in off-road harvesting sites and to a processing plant or storage location, as evidenced by skeletal construction that accommodates harvest containers, a maximum length of 28 feet, and an arrangement of air control lines and reservoirs that minimizes damage in field operations"
  {:db/ident :auto-vc/AgriculturalCommodityTrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agricultural commodity trailer"},
   :rdfs/subClassOf :auto-vc/FullTrailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "trailer that is designed to transport bulk agricultural commodities in off-road harvesting sites and to a processing plant or storage location, as evidenced by skeletal construction that accommodates harvest containers, a maximum length of 28 feet, and an arrangement of air control lines and reservoirs that minimizes damage in field operations"}})

(def Aircraft
  "A transport vehicle designed primarily for, or in use for, moving persons or property through the air from one place to another."
  {:db/ident :auto-vc/Aircraft,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "aircraft"},
   :rdfs/subClassOf :auto-vc/Vehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A transport vehicle designed primarily for, or in use for, moving persons or property through the air from one place to another."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.1.5"})

(def AllWheelDriveConfiguration
  "All-wheel Drive is a transmission layout where the engine drives all four wheels."
  {:db/ident :auto-vc/AllWheelDriveConfiguration,
   :rdf/type [:auto-vc/DriveWheelConfigurationValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "all-wheel drive"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "All-wheel Drive is a transmission layout where the engine drives all four wheels."}})

(def AudioAndNavigation
  "The class of audio and navigation choices or components (CD/DVD/SatNav, a \"MonoSelectGroup\" in automotive terminology), VW ID: 1"
  {:db/ident :auto-vc/AudioAndNavigation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "audio and navigation choice or component"},
   :rdfs/subClassOf :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The class of audio and navigation choices or components (CD/DVD/SatNav, a \"MonoSelectGroup\" in automotive terminology), VW ID: 1"}})

(def AuthorizedDealer
  "An authorized dealer of the manufacturer of the respective vehicle"
  {:db/ident :auto-vc/AuthorizedDealer,
   :rdf/type [:auto-vc/BusinessEntityType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "authorized dealer"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An authorized dealer of the manufacturer of the respective vehicle"}})

(def Autocycle
  "A large motorcycle with one rear wheel and two front wheels, with either a saddle and handlebars or seat (s) and a steering wheel, that can be fully enclosed, partially enclosed, or unenclosed."
  {:db/ident :auto-vc/Autocycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "autocycle"},
   :rdfs/subClassOf :auto-vc/Motorcycle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A large motorcycle with one rear wheel and two front wheels, with either a saddle and handlebars or seat (s) and a steering wheel, that can be fully enclosed, partially enclosed, or unenclosed."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.9.7"})

(def BaseModel
  "A Base Model is an abstract entity specifying the basic features of a group of vehicles. Examples: VW Golf, VW Polo, VW Passat"
  {:db/ident :auto-vc/BaseModel,
   :owl/disjointWith [:auto-vc/ConfigurationInfo
                      :auto-vc/ChoiceOrComponent
                      :auto-vc/PropertySpecification
                      :auto-vc/SpecItemCollection
                      :auto-vc/Trim
                      :auto-vc/Derivative
                      :auto-vc/CompleteCarModel],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "base model"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-vc/Trim,
                      :owl/onProperty :auto-vc/hasTrim,
                      :rdf/type       :owl/Restriction}
                     :auto-mo/Model],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Base Model is an abstract entity specifying the basic features of a group of vehicles.\n\nExamples: VW Golf, VW Polo, VW Passat"}})

(def Bicycle
  "a pedal-driven, human-powered, single-track vehicle, having two wheels attached to a frame, one behind the other. Some bicycles have a small combustion or electric engine that assists with the pedaling."
  {:db/ident :auto-vc/Bicycle,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "pl",
     :rdf/value
     "pojazd o szerokości nieprzekraczającej 0,9 m poruszany siłą mięśni osoby jadącej tym pojazdem; rower może być wyposażony w uruchamiany naciskiem na pedały pomocniczy napęd elektryczny zasilany prądem o napięciu nie wyższym niż 48 V o znamionowej mocy ciągłej nie większej niż 250 W, którego moc wyjściowa zmniejsza się stopniowo i spada do zera po przekroczeniu prędkości 25 km/h"}
    "QName: auto-vc-vc:Bicycle"],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "rower"}
                {:rdf/language "en",
                 :rdf/value    "bicycle"}],
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Bicycle"
                  "http://dbpedia.org/resource/Bicycle"],
   :rdfs/subClassOf :auto-vc/Pedalcycle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a pedal-driven, human-powered, single-track vehicle, having two wheels attached to a frame, one behind the other. Some bicycles have a small combustion or electric engine that assists with the pedaling."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "bike"}})

(def Boat
  "a watercraft of modest size designed to float or plane, to provide passage across water"
  {:db/ident :auto-vc/Boat,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "boat"},
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Boat"
                  "http://dbpedia.org/resource/Boat"],
   :rdfs/subClassOf :auto-vc/Watercraft,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a watercraft of modest size designed to float or plane, to provide passage across water"}})

(def BoatTrailer
  "trailer designed with cradle-type mountings to transport a boat and configured to permit the launching of the boat from the rear of the trailer"
  {:db/ident :auto-vc/BoatTrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "boat trailer"},
   :rdfs/subClassOf :auto-vc/FullTrailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "trailer designed with cradle-type mountings to transport a boat and configured to permit the launching of the boat from the rear of the trailer"}})

(def BodyStyle4X4
  "Four-by-Four Vehicle, VW ID: 6"
  {:auto-vc/hasID "6",
   :db/ident :auto-vc/BodyStyle4X4,
   :dcterms/source "vso:BodyStyleValue",
   :rdf/type [:auto-vc/BodyStyleValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "4 X 4"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Four-by-Four Vehicle, VW ID: 6"}})

(def BodyStyleCabriolet
  "Cabriolet, VW ID: 4"
  {:auto-vc/hasID "4",
   :db/ident :auto-vc/BodyStyleCabriolet,
   :dcterms/source "vso:BodyStyleValue",
   :rdf/type [:auto-vc/BodyStyleValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cabriolet"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Cabriolet, VW ID: 4"}})

(def BodyStyleCoupe
  "Coupe, VW ID: 7"
  {:auto-vc/hasID "7",
   :db/ident :auto-vc/BodyStyleCoupe,
   :dcterms/source "vso:BodyStyleValue",
   :rdf/type [:auto-vc/BodyStyleValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "coupe"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Coupe, VW ID: 7"}})

(def BodyStyleEstate
  "Estate, VW ID: 3"
  {:auto-vc/hasID "3",
   :db/ident :auto-vc/BodyStyleEstate,
   :dcterms/source "vso:BodyStyleValue",
   :rdf/type [:auto-vc/BodyStyleValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "estate"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Estate, VW ID: 3"}})

(def BodyStyleHatchback
  "Hatchback, VW ID: 1"
  {:auto-vc/hasID "1",
   :db/ident :auto-vc/BodyStyleHatchback,
   :dcterms/source "vso:BodyStyleValue",
   :rdf/type [:auto-vc/BodyStyleValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hatchback"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Hatchback, VW ID: 1"}})

(def BodyStyleMPV
  "Multi-purpose Vehicle, VW ID: 5"
  {:auto-vc/hasID "5",
   :db/ident :auto-vc/BodyStyleMPV,
   :dcterms/source "vso:BodyStyleValue",
   :rdf/type [:auto-vc/BodyStyleValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MPV"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Multi-purpose Vehicle, VW ID: 5"}})

(def BodyStyleSaloon
  "Saloon, VW ID: 2"
  {:auto-vc/hasID "2",
   :db/ident :auto-vc/BodyStyleSaloon,
   :dcterms/source "vso:BodyStyleValue",
   :rdf/type [:auto-vc/BodyStyleValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "saloon"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Saloon, VW ID: 2"}})

(def BodyStyleUnspecified
  "Unspecified, VW ID: 0"
  {:auto-vc/hasID "0",
   :db/ident :auto-vc/BodyStyleUnspecified,
   :dcterms/source "vso:BodyStyleValue",
   :rdf/type [:auto-vc/BodyStyleValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unspecified"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Unspecified, VW ID: 0"}})

(def BodyStyleValue
  "a value indicating the body style of a vehicle"
  {:db/ident :auto-vc/BodyStyleValue,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "You can safely use any reasonable DBPedia URI, e.g. \n  http://dbpedia.org/resource/Convertible\n  http://dbpedia.org/resource/Hatchback\n  http://dbpedia.org/resource/Station_wagon\n  http://dbpedia.org/resource/Sport_utility_vehicle\n  http://dbpedia.org/resource/Roadster"},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "body style value"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "a value indicating the body style of a vehicle"}})

(def Bus
  "A motor vehicle with seating for transporting nine or more persons, including the driver."
  {:db/ident :auto-vc/Bus,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/comment
   ["QName: auto-vc-vc:BusOrCoach"
    {:rdf/language "pl",
     :rdf/value
     "pojazd samochodowy przeznaczony konstrukcyjnie do przewozu więcej niż 9 osób łącznie z kierowcą"}
    {:rdf/language "en",
     :rdf/value
     "A bus (also omnibus or autobus) is a road vehicle designed to carry passengers. Buses have a capacity as high as 300 passengers and are widely used for public transportation. \nCoaches are luxury busses, usually in service for long distance travel."}],
   :rdfs/isDefinedBy
   ["http://purl.org/vso/ns"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "bus"}
                {:rdf/language "pl",
                 :rdf/value    "autobus"}],
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Coach_%28vehicle%29"
                  "http://dbpedia.org/page/Coach_%28vehicle%29"
                  "http://en.wikipedia.org/wiki/Bus"
                  "http://dbpedia.org/resource/Bus"],
   :rdfs/subClassOf [:auto-vc/LargeSpecialVehicle
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :auto-vc/acrissCode,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "A motor vehicle with seating for transporting nine or more persons, including the driver."}
    {:rdf/language "en",
     :rdf/value
     "a road vehicle designed to carry passengers. Coaches are luxury busses, usually in service for long distance travel"}],
   :sm/directSource "https://schema.org/BusOrCoach",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.10",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   [{:rdf/language "en",
     :rdf/value    "omnibus"}
    {:rdf/language "en",
     :rdf/value    "coach"}
    {:rdf/language "en",
     :rdf/value    "autobus"}]})

(def Business
  "The usage of a vehicle for general business purposes, i.e. excluding usages like as a taxi, rental car, or driving instructions."
  {:db/ident :auto-vc/Business,
   :rdf/type [:auto-vc/CarUsageType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "business"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The usage of a vehicle for general business purposes, i.e. excluding usages like as a taxi, rental car, or driving instructions."}})

(def BusinessEntity
  "entity that is formed and administered as per commercial law in order to engage in business activities"
  {:db/ident :auto-vc/BusinessEntity,
   :owl/equivalentClass {:owl/unionOf [:auto-mo/Organization :auto-mo/Person],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "business entity"},
   :rdfs/subClassOf :auto-mo/IndependentContinuant,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entity that is formed and administered as per commercial law in order to engage in business activities"}})

(def BusinessEntityType
  "type of a business entity"
  {:db/ident :auto-vc/BusinessEntityType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "business entity type"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "type of a business entity"}})

(def Canoe
  "a small narrow boat, typically human-powered, though it may also be powered by sails or small electric or gas motors"
  {:db/ident :auto-vc/Canoe,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "canoe"},
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Canoe"
                  "http://dbpedia.org/resource/Canoe"],
   :rdfs/subClassOf :auto-vc/Boat,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a small narrow boat, typically human-powered, though it may also be powered by sails or small electric or gas motors"}})

(def Car
  "a wheeled motor vehicle used for transporting passengers, which also carries its own engine or motor"
  {:db/ident :auto-vc/Car,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Automobiles may be classified by size or weight, or both. Size classification is based on wheelbase. Weight classification is based on curb weight, the weight of an automobile with standard equipment and a full complement of fuel and other fluids, but with no load of persons or property. Before classification, wheelbase should be rounded to the nearest inch and curb weight should be rounded to the nearest 100 pounds."
    "QName: auto-vc-vc:Car"],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "samochód"}
                {:rdf/language "en",
                 :rdf/value    "car"}],
   :rdfs/seeAlso ["http://dbpedia.org/resource/Automobile"
                  "http://en.wikipedia.org/wiki/Automobile"],
   :rdfs/subClassOf [:auto-vc/MotorizedRoadVehicle
                     {:owl/onClass    :auto-vc/BodyStyleValue,
                      :owl/onProperty :auto-vc/bodyStyle,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :auto-vc/acrissCode,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "a wheeled motor vehicle used for transporting passengers, which also carries its own engine or motor"}
    {:rdf/language "en",
     :rdf/value "a wheeled, self-powered motor vehicle used for transportation"}
    {:rdf/language "en",
     :rdf/value
     "A motor vehicle other than a motorcycle, utility vehicle or low speed vehicle consisting of a transport device typically designed for carrying eight or fewer persons."}],
   :sm/directSource "https://schema.org/Car",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.12",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "automobile"}})

(def CarSharing
  "The usage of a vehicle for car sharing networks"
  {:db/ident :auto-vc/CarSharing,
   :rdf/type [:auto-vc/CarUsageType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "car sharing"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The usage of a vehicle for car sharing networks"}})

(def CarUsageType
  "a special usage of a car, e.g. commercial rental, driving school, or as a taxi"
  {:db/ident :auto-vc/CarUsageType,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "car usage"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a special usage of a car, e.g. commercial rental, driving school, or as a taxi"},
   :sm/directSource "https://schema.org/CarUsageType"})

(def CargoVan
  "Any van where the area behind the driver or cab is designed for transporting cargo or operated for general commercial use."
  {:db/ident :auto-vc/CargoVan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cargo van"},
   :rdfs/subClassOf :auto-vc/Van,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any van where the area behind the driver or cab is designed for transporting cargo or operated for general commercial use."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.14.2"})

(def Carport
  "The parking of a vehicle under a protective roof, e.g. in a carport"
  {:db/ident :auto-vc/Carport,
   :rdf/type [:auto-vc/ParkingType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "carport"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The parking of a vehicle under a protective roof, e.g. in a carport"}})

(def CharterBus
  "A bus providing contract service for a group tour or outing, usually on a round-trip basis."
  {:db/ident :auto-vc/CharterBus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "charter bus"},
   :rdfs/subClassOf :auto-vc/Bus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A bus providing contract service for a group tour or outing, usually on a round-trip basis."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.10.5"})

(def Check
  "a mandatory or optional technical inspection, e.g. the MOT, a vendor-specific certification of used cars, etc."
  {:db/ident :auto-vc/Check,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "check"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    {:owl/unionOf
                                       [:auto-mo/Organization
                                        :auto-mo/Person
                                        :auto-vc/BusinessEntityType],
                                       :rdf/type :owl/Class},
                      :owl/onProperty :auto-vc/carriedOutBy,
                      :rdf/type       :owl/Restriction}
                     :auto-mo/Process],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a mandatory or optional technical inspection, e.g. the MOT, a vendor-specific certification of used cars, etc."}})

(def ChoiceOrComponent
  "A Choice or Component is a component (e.g. engine), add-on, feature (color \"ocean blue\"), or service that can be chosen to be part of a final vehicle configuration. Example: Engine 1.6 l TDI, color ocean blue, trailer hitch"
  {:db/ident :auto-vc/ChoiceOrComponent,
   :owl/disjointWith [:auto-vc/Derivative
                      :auto-vc/SpecItemCollection
                      :auto-vc/CompleteCarModel
                      :auto-vc/ConfigurationInfo
                      :auto-vc/Trim
                      :auto-vc/PropertySpecification],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "choice or component"},
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/PropertySpecification,
     :owl/onProperty :auto-vc/featureOverride,
     :rdf/type       :owl/Restriction}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :xsd/string,
                           :owl/onProperty  :auto-vc/productCode,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :xsd/string,
                           :owl/onProperty  :auto-vc/productCode,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    :auto-mo/Model
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/ChoiceOrComponent,
     :owl/onProperty :auto-vc/includes,
     :rdf/type       :owl/Restriction}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :xsd/int,
                           :owl/onProperty  :auto-vc/displayPos,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :xsd/int,
                           :owl/onProperty  :auto-vc/displayPos,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/RelativePriceSpecification,
                           :owl/onProperty :auto-vc/priceModifier,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/RelativePriceSpecification,
                           :owl/onProperty :auto-vc/priceModifier,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    :auto-mo/GenericallyDependentContinuant
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/ChoiceOrComponent,
     :owl/onProperty :auto-vc/compatibleWith,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/ChoiceOrComponent,
     :owl/onProperty :auto-vc/dependsOn,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/ChoiceOrComponent,
     :owl/onProperty :auto-vc/incompatibleWith,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Choice or Component is a component (e.g. engine), add-on, feature (color \"ocean blue\"), or service that can be chosen to be part of a final vehicle configuration.\n  \nExample: Engine 1.6 l TDI, color ocean blue, trailer hitch"}})

(def Combined
  "Combined usage as a traffic pattern"
  {:db/ident :auto-vc/Combined,
   :dcterms/source "vvo:TrafficPattern",
   :rdf/type [:auto-vc/TrafficPattern :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "combined"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Combined usage as a traffic pattern"}})

(def CommercialMotorVehicle
  "Any motor vehicle used for the transportation of goods, property or people in interstate (See 2.9.2) or intrastate (2.9.3) commerce."
  {:db/ident :auto-vc/CommercialMotorVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commercial motor vehicle"},
   :rdfs/subClassOf :auto-vc/TransportVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any motor vehicle used for the transportation of goods, property or people in interstate (See 2.9.2) or intrastate (2.9.3) commerce."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.7.3"})

(def CompleteCarModel
  "A Complete Car Model is an abstract entity specifying all features and configuration choices needed for actually producing a vehicle. In other words, it is the gr:ProductOrServiceModel (\"datasheet\") for a completely configured vehicle. While a Complete Car Model can be defined indepently of a Base Model, Trim, or Derivative, it is usually based on a Derivative plus choices for all mandatory configurational options (coo:SpecItemCollection) of that Derivative. A Complete Car Model should be linked to its Derivative via gr:isVariantOf, if available. Example: VW Golf S 1.6 TDI 3door Manual in ocean blue with air-conditioning, CD player, trailer hitch, power steering, and power windows Note: A coo:CompleteCarModel is NOT an actual car, but a complete feature description of one or multiple actual cars."
  {:db/ident :auto-vc/CompleteCarModel,
   :owl/disjointWith [:auto-vc/PropertySpecification
                      :auto-vc/Trim
                      :auto-vc/SpecItemCollection
                      :auto-vc/Derivative
                      :auto-vc/ConfigurationInfo],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "complete car model"},
   :rdfs/subClassOf [:auto-mo/Model
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-vc/ChoiceOrComponent,
                      :owl/onProperty :auto-vc/hasSpecItemChoice,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Complete Car Model is an abstract entity specifying all features and configuration choices needed for actually producing a vehicle. In other words, it is the gr:ProductOrServiceModel (\"datasheet\") for a completely configured vehicle.\nWhile a Complete Car Model can be defined indepently of a Base Model, Trim, or Derivative, it is usually based on a Derivative plus choices for all mandatory configurational options (coo:SpecItemCollection) of that Derivative.\nA Complete Car Model should be linked to its Derivative via gr:isVariantOf, if available.\n\nExample: VW Golf S 1.6 TDI 3door Manual in ocean blue with air-conditioning, CD player, trailer hitch, power steering, and power windows\n\nNote: A coo:CompleteCarModel is NOT an actual car, but a complete feature description of one or multiple actual cars."}})

(def ConfigurationInfo
  "A Configuration Info is an abstract entity that gives information on whether a set of Choices Or Components results in a valid configuration. Using coo:compatible, it is possible to indicate either compatibility (true) and incompatibility (false) so that modeling remains efficient, no matter whether most combinations are valid or whether most configurations are invalid. If no such statement is found, the validity of a configuration is unknown. Note: The two properties coo:includes and coo:dependsOn, attached to coo:ChoiceOrComponent, may contain additional information on the validity of configuration."
  {:db/ident :auto-vc/ConfigurationInfo,
   :owl/disjointWith [:auto-vc/SpecItemCollection
                      :auto-vc/PropertySpecification
                      :auto-vc/Derivative
                      :auto-vc/Trim],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["http://purl.org/coo/ns#"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "configuration info"},
   :rdfs/subClassOf [{:owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/valid,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :auto-mo/GenericallyDependentContinuant
                     {:owl/onProperty     :auto-vc/includesChoices,
                      :owl/someValuesFrom :auto-vc/ChoiceOrComponent,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-vc/PropertySpecification,
                      :owl/onProperty :auto-vc/featureOverride,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Configuration Info is an abstract entity that gives information on whether a set of Choices Or Components results in a valid configuration. \nUsing coo:compatible, it is possible to indicate either compatibility (true) and incompatibility (false) so that modeling remains efficient, no matter whether most combinations are valid or whether most configurations are invalid.\nIf no such statement is found, the validity of a configuration is unknown.\n\nNote: The two properties coo:includes and coo:dependsOn, attached to coo:ChoiceOrComponent, may contain additional information on the validity of configuration."}})

(def ContainerChassisTrailer
  "semitrailer of skeleton construction limited to a bottom frame, one or more axles, specially built and fitted with locking devices for the transport of intermodal cargo containers so that when the chassis and container are assembled, the units serve the same function as an over the road trailer"
  {:db/ident :auto-vc/ContainerChassisTrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "container chassis trailer"},
   :rdfs/subClassOf :auto-vc/Semitrailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "semitrailer of skeleton construction limited to a bottom frame, one or more axles, specially built and fitted with locking devices for the transport of intermodal cargo containers so that when the chassis and container are assembled, the units serve the same function as an over the road trailer"}})

(def CoveredFarmVehicle
  "straight truck or articulated vehicle that is registered in a State with a license plate or other designation issued by the State of registration that allows law enforcement officials to identify it as a farm vehicle and used to transport agricultural commodities, livestock, machinery or supplies to or from a farm or ranch"
  {:db/ident :auto-vc/CoveredFarmVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "covered farm vehicle"},
   :rdfs/subClassOf :auto-vc/SpecialVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "straight truck or articulated vehicle that is registered in a State with a license plate or other designation issued by the State of registration that allows law enforcement officials to identify it as a farm vehicle and used to transport agricultural commodities, livestock, machinery or supplies to or from a farm or ranch"}})

(def CribTypeLogTrailer
  "trailer equipped with stakes, bunks, a front-end structure, and a rear structure to restrain logs"
  {:db/ident :auto-vc/CribTypeLogTrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "crib-type log trailer"},
   :rdfs/subClassOf :auto-vc/FullTrailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "trailer equipped with stakes, bunks, a front-end structure, and a rear structure to restrain logs"}})

(def DamageOrAccident
  "an event in which the vehicle is being damaged"
  {:db/ident :auto-vc/DamageOrAccident,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["http://purl.org/uco/ns#"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "damage or accident"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/airbagDeployment,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/repaired,
                      :rdf/type        :owl/Restriction}
                     :auto-mo/Process
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    {:owl/unionOf
                                       [:auto-vc/BusinessEntity
                                        :auto-vc/BusinessEntityType],
                                       :rdf/type :owl/Class},
                      :owl/onProperty :auto-vc/carriedOutBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/structuralDamage,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/notAtFaultAccident,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/originalPartsOnly,
                      :rdf/type        :owl/Restriction}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "an event in which the vehicle is being damaged"}})

(def DecorativeTrims
  "The class of decorative trim choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 8"
  {:db/ident :auto-vc/DecorativeTrims,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "decorative trims choice or component"},
   :rdfs/subClassOf :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The class of decorative trim choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 8"}})

(def Derivative
  "A Derivative is an abstract entity specifying (1) the basic features plus (2) a set of functional (e.g. engine type) and non-functional configuration (e.g. upholstery) choices of a group of vehicles. A Derivative has often a number of remaining configuration choices (coo:SpecItemCollection attached via coo:hasSpecItems), which will determine the actual properties of the resulting vehicle. A Derivative should be linked to its Trim via gr:isVariantOf, if available. Examples: VW Golf S 1.6 TDI 3door Manual"
  {:db/ident :auto-vc/Derivative,
   :owl/disjointWith
   [:auto-vc/Trim :auto-vc/SpecItemCollection :auto-vc/PropertySpecification],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["http://purl.org/coo/ns#"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "derivative"},
   :rdfs/subClassOf [{:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                                            :owl/onDataRange :xsd/string,
                                            :owl/onProperty  :auto-vc/dhCode,
                                            :rdf/type        :owl/Restriction}
                                           {:owl/maxQualifiedCardinality 1,
                                            :owl/onDataRange :xsd/string,
                                            :owl/onProperty  :auto-vc/dhCode,
                                            :rdf/type        :owl/Restriction}],
                      :rdf/type :owl/Class}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-vc/CompleteCarModel,
                      :owl/onProperty :auto-vc/hasCompleteCarModel,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-vc/ConfigurationInfo,
                      :owl/onProperty :auto-vc/compatibility,
                      :rdf/type       :owl/Restriction}
                     :auto-mo/Model
                     {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                                            :owl/onDataRange :xsd/string,
                                            :owl/onProperty  :auto-vc/capCode,
                                            :rdf/type        :owl/Restriction}
                                           {:owl/maxQualifiedCardinality 1,
                                            :owl/onDataRange :xsd/string,
                                            :owl/onProperty  :auto-vc/capCode,
                                            :rdf/type        :owl/Restriction}],
                      :rdf/type :owl/Class}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-vc/SpecItemCollection,
                      :owl/onProperty :auto-vc/hasSpecItems,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Derivative is an abstract entity specifying (1) the basic features plus (2) a set of functional (e.g. engine type) and non-functional configuration (e.g. upholstery) choices of a group of vehicles.\nA Derivative has often a number of remaining configuration choices (coo:SpecItemCollection attached via coo:hasSpecItems), which will determine the actual properties of the resulting vehicle.    \nA Derivative should be linked to its Trim via gr:isVariantOf, if available.\n\nExamples: VW Golf S 1.6 TDI 3door Manual"}})

(def Diesel
  "Diesel, VW ID: 2"
  {:auto-vc/hasID "2",
   :db/ident :auto-vc/Diesel,
   :dcterms/source "vso:FuelTypeValue",
   :rdf/type [:auto-vc/FuelTypeValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "diesel"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Diesel, VW ID: 2"}})

(def DriveWheelConfigurationValue
  "a value indicating which roadwheels will receive torque"
  {:db/ident :auto-vc/DriveWheelConfigurationValue,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "drive wheel configuration value"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "a value indicating which roadwheels will receive torque"},
   :sm/directSource "https://schema.org/DriveWheelConfigurationValue"})

(def DrivingSchoolVehicleUsage
  "Indicates the usage of the vehicle for driving school."
  {:db/ident :auto-vc/DrivingSchoolVehicleUsage,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type [:auto-vc/CarUsageType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "driving school vehicle usage",
   :skos/definition "Indicates the usage of the vehicle for driving school."})

(def EmissionStandardValue
  "a value indicating the an emission standard"
  {:db/ident :auto-vc/EmissionStandardValue,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "You can safely use any reasonable DBPedia URI, e.g. \n  http://dbpedia.org/resource/Super_Ultra_Low_Emission_Vehicle\n  http://dbpedia.org/resource/Partial_zero-emissions_vehicle\n\nSee also http://en.wikipedia.org/wiki/Emissions_standard.\n\nUnfortunately, there are no DBPedia identifiers for the popular Euro 1 - Euro 5 standards available.\nIf you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:EmissionStandardValue."},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "emission standard value"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value "a value indicating the an emission standard"}})

(def Engine
  "The class of engines as choices or components"
  {:db/ident :auto-vc/Engine,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "engine choice or component"},
   :rdfs/subClassOf
   [{:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :xsd/string,
                           :owl/onProperty  :auto-vc/fuelInjectionTypeId,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :xsd/string,
                           :owl/onProperty  :auto-vc/fuelInjectionTypeId,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :xsd/string,
                           :owl/onProperty  :auto-vc/cylinderTypeId,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :xsd/string,
                           :owl/onProperty  :auto-vc/cylinderTypeId,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    :auto-vc/ChoiceOrComponent],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The class of engines as choices or components"}})

(def EngineSpecification
  "information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities"
  {:db/ident :auto-vc/EngineSpecification,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "engine specification"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-mo/QualitativeValue,
                      :owl/onProperty :auto-vc/engineType,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-mo/QuantitativeValue,
                      :owl/onProperty :auto-vc/torque,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-mo/QuantitativeValue,
                      :owl/onProperty :auto-vc/engineDisplacement,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-mo/QuantitativeValue,
                      :owl/onProperty :auto-vc/enginePower,
                      :rdf/type       :owl/Restriction}
                     :auto-mo/GenericallyDependentContinuant
                     {:owl/onProperty     :auto-vc/fuelType,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:auto-mo/QualitativeValue
                                            :auto-mo/TextValue],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities"},
   :sm/directSource "https://schema.org/EngineSpecification"})

(def EngineTypeValue
  "a value indicating an engine type"
  {:db/ident :auto-vc/EngineTypeValue,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "You can safely use any reasonable DBPedia URI, e.g. \n  http://dbpedia.org/resource/Two-stroke_engine\n  http://dbpedia.org/resource/Four-stroke_engine\n  http://dbpedia.org/resource/Wankel_engine\n  http://dbpedia.org/resource/Electric_motor"},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "engine type value"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "a value indicating an engine type"}})

(def Euro1
  "The emission standard EURO 1"
  {:db/ident :auto-vc/Euro1,
   :dcterms/source "vso:EmissionStandardValue",
   :rdf/type [:auto-vc/EmissionStandardValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Euro 1"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The emission standard EURO 1"}})

(def Euro2
  "The emission standard EURO 2"
  {:db/ident :auto-vc/Euro2,
   :dcterms/source "vso:EmissionStandardValue",
   :rdf/type [:auto-vc/EmissionStandardValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Euro 2"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The emission standard EURO 2"}})

(def Euro3
  "The emission standard EURO 3"
  {:db/ident :auto-vc/Euro3,
   :dcterms/source "vso:EmissionStandardValue",
   :rdf/type [:auto-vc/EmissionStandardValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Euro 3"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The emission standard EURO 3"}})

(def Euro4
  "The emission standard EURO 4"
  {:db/ident :auto-vc/Euro4,
   :dcterms/source "vso:EmissionStandardValue",
   :rdf/type [:auto-vc/EmissionStandardValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Euro 4"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The emission standard EURO 4"}})

(def ExtraUrban
  "Extra urban as a traffic pattern"
  {:db/ident :auto-vc/ExtraUrban,
   :dcterms/source "vvo:TrafficPattern",
   :rdf/type [:auto-vc/TrafficPattern :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "extra urban"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Extra urban as a traffic pattern"}})

(def FeatureValue
  "a value indicating the features or accessories that are attached to or belong to a vehicle"
  {:db/ident :auto-vc/FeatureValue,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "You can safely use any reasonable DBPedia URI, e.g. \n  http://dbpedia.org/resource/Anti-lock_braking_system\n  http://dbpedia.org/resource/Electronic_stability_control\n  http://dbpedia.org/resource/Armrest\n  http://dbpedia.org/resource/Spoiler_%28automotive%29\n  http://dbpedia.org/resource/CD_Changer\n  http://dbpedia.org/resource/Cup_holder\n  http://dbpedia.org/resource/Tow_hitch\n  http://dbpedia.org/resource/Power_window\n  http://dbpedia.org/resource/Power_steering\n  http://dbpedia.org/resource/Air_conditioner\n  http://dbpedia.org/resource/Child_safety_lock\n  http://dbpedia.org/resource/Parking_sensors"},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "feature value"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a value indicating the features or accessories that are attached to or belong to a vehicle"}})

(def Financing
  "the specification of a payment option via staged payments"
  {:db/ident :auto-vc/Financing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "financing"},
   :rdfs/subClassOf
   [{:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/credit,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/credit,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/shortSubtitle,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/shortSubtitle,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/totalPayable,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/totalPayable,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/discount,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/discount,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/customerCashPrice,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/customerCashPrice,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :xsd/decimal,
                           :owl/onProperty  :auto-vc/finalPayment,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :xsd/decimal,
                           :owl/onProperty  :auto-vc/finalPayment,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :xsd/decimal,
                           :owl/onProperty  :auto-vc/apr,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :xsd/decimal,
                           :owl/onProperty  :auto-vc/apr,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/firstMonthlyPaymentFee,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/firstMonthlyPaymentFee,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/scrappageContribution,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/scrappageContribution,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/advancedPayment,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/advancedPayment,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/depositContribution,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/depositContribution,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/termsAndConditions,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/termsAndConditions,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/shortTitle,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/shortTitle,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/monthlyPayment,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/monthlyPayment,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :xsd/decimal,
                           :owl/onProperty  :auto-vc/noOfMonthlyPayments,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :xsd/decimal,
                           :owl/onProperty  :auto-vc/noOfMonthlyPayments,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/otrRetailPrice,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/otrRetailPrice,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/subtitle,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/subtitle,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/excessMileage,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/excessMileage,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/customerDeposit,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/customerDeposit,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/finalPaymentFee,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/PriceSpecification,
                           :owl/onProperty :auto-vc/finalPaymentFee,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    :auto-vc/PaymentMethod],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "the specification of a payment option via staged payments"}})

(def FourWheelDriveConfiguration
  "Four-wheel Drive is a transmission layout where the engine primarily drives two wheels with a part-time four-wheel drive capability."
  {:db/ident :auto-vc/FourWheelDriveConfiguration,
   :rdf/type [:auto-vc/DriveWheelConfigurationValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "four-wheel drive"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Four-wheel Drive is a transmission layout where the engine primarily drives two wheels with a part-time four-wheel drive capability."}})

(def FrontWheelDriveConfiguration
  "Front-wheel drive is a transmission layout where the engine drives the front wheels."
  {:db/ident :auto-vc/FrontWheelDriveConfiguration,
   :rdf/type [:auto-vc/DriveWheelConfigurationValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "front-wheel drive"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Front-wheel drive is a transmission layout where the engine drives the front wheels."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "FWD"}})

(def FuelQuantity
  "a value indicating an amount of fuel"
  {:db/ident :auto-vc/FuelQuantity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fuel quantity"},
   :rdfs/subClassOf :auto-mo/QuantitativeValueFloat,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "a value indicating an amount of fuel"}})

(def FuelTypeValue
  "a value indicating a type of fuel"
  {:db/ident :auto-vc/FuelTypeValue,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "You can safely use any reasonable DBPedia URI, e.g. \n  http://dbpedia.org/resource/Gasoline\n  http://dbpedia.org/resource/Diesel\n  http://dbpedia.org/resource/Biodiesel\n  http://dbpedia.org/resource/Kerosene"},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fuel type value"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "a value indicating a type of fuel"}})

(def FullTrailer
  "A trailer, other than a pole trailer, designed for carrying property and so constructed that no part of its weight rests upon or is carried by the towing road vehicle."
  {:db/ident :auto-vc/FullTrailer,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An auxiliary undercarriage assembly, commonly known as a converter dolly and consisting of a chassis, fifth wheel and one or more tow bars, is sometimes used to convert a semitrailer to a full trailer. A semitrailer equipped with a converter dolly is considered to be a full trailer."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "full trailer"},
   :rdfs/subClassOf :auto-vc/Trailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A trailer, other than a pole trailer, designed for carrying property and so constructed that no part of its weight rests upon or is carried by the towing road vehicle."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.18"})

(def Garage
  "The parking of a vehicle in a closed garage"
  {:db/ident :auto-vc/Garage,
   :rdf/type [:auto-vc/ParkingType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "garage"},
   :skos/definition {:rdf/language "en",
                     :rdf/value "The parking of a vehicle in a closed garage"}})

(def GearboxAutomatic
  "Automatic gearbox, VW ID: 2"
  {:auto-vc/hasID "2",
   :db/ident :auto-vc/GearboxAutomatic,
   :dcterms/source "vvo:GearboxTypeValue",
   :rdf/type [:auto-vc/GearboxTypeValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "automatic"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Automatic gearbox, VW ID: 2"}})

(def GearboxDSG
  "DSG gearbox, VW ID: 3"
  {:auto-vc/hasID "3",
   :db/ident :auto-vc/GearboxDSG,
   :dcterms/source "vvo:GearboxTypeValue",
   :rdf/type [:auto-vc/GearboxTypeValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DSG"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "DSG gearbox, VW ID: 3"}})

(def GearboxManual
  "Manual gearbox, VW ID: 1"
  {:auto-vc/hasID "1",
   :db/ident :auto-vc/GearboxManual,
   :dcterms/source "vvo:GearboxTypeValue",
   :rdf/type [:auto-vc/GearboxTypeValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "manual"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Manual gearbox, VW ID: 1"}})

(def GearboxTypeValue
  "A value indicating a gearbox type."
  {:db/ident :auto-vc/GearboxTypeValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gearbox type value"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A value indicating a gearbox type."}})

(def HeavyHaulerTrailer
  "trailer whose brakes lines are designed to adapt to separation or extension of the vehicle frame and/or which body consists only of a platform whose primary cargo-carrying surface is not more than 1,016 mm (40 inches) above the ground in an unloaded condition, except that it may include sides that are designed to be easily removable and a permanent “front-end structure”, but that is not a container chassis trailer"
  {:db/ident :auto-vc/HeavyHaulerTrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "heavy hauler trailer"},
   :rdfs/subClassOf :auto-vc/FullTrailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "trailer whose brakes lines are designed to adapt to separation or extension of the vehicle frame and/or which body consists only of a platform whose primary cargo-carrying surface is not more than 1,016 mm (40 inches) above the ground in an unloaded condition, except that it may include sides that are designed to be easily removable and a permanent “front-end structure”, but that is not a container chassis trailer"}})

(def HeavyTruck
  "A truck which has a gross vehicle weight rating (GVWR) of more than 26,000 pounds (11,793 kilograms)."
  {:db/ident :auto-vc/HeavyTruck,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "heavy truck"},
   :rdfs/subClassOf :auto-vc/Truck,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A truck which has a gross vehicle weight rating (GVWR) of more than 26,000 pounds (11,793 kilograms)."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.26"})

(def HorizontalDischargeTrailer
  "trailer or semitrailer that is equipped with a mechanical drive and a conveyor to deliver asphalt and other road building materials, in a controlled horizontal manner, into a lay down machine or paving equipment for road construction and paving operations"
  {:db/ident :auto-vc/HorizontalDischargeTrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "road construction controlled horizontal discharge trailer"},
   :rdfs/subClassOf :auto-vc/FullTrailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "trailer or semitrailer that is equipped with a mechanical drive and a conveyor to deliver asphalt and other road building materials, in a controlled horizontal manner, into a lay down machine or paving equipment for road construction and paving operations"}})

(def HumanPoweredLandVehicle
  "land vehicle propelled over ground by human power"
  {:db/ident :auto-vc/HumanPoweredLandVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "human powered land vehicle"},
   :rdfs/subClassOf :auto-vc/RoadVehicle,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "land vehicle propelled over ground by human power"}})

(def Hybrid
  "Hybrid, VW ID: 3"
  {:auto-vc/hasID "3",
   :db/ident :auto-vc/Hybrid,
   :dcterms/source "vso:FuelTypeValue",
   :rdf/type [:auto-vc/FuelTypeValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hybrid"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Hybrid, VW ID: 3"}})

(def IndependentDealer
  "An independent dealer"
  {:db/ident :auto-vc/IndependentDealer,
   :rdf/type [:auto-vc/BusinessEntityType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "independent dealer"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An independent dealer"}})

(def IntercityBus
  "A bus used for long-distance passenger transportation between cities over fixed routes with regular schedules."
  {:db/ident :auto-vc/IntercityBus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "intercity bus"},
   :rdfs/subClassOf :auto-vc/Bus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A bus used for long-distance passenger transportation between cities over fixed routes with regular schedules."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.10.4"})

(def Kayak
  "a small human-powered watercraft that traditionally has a covered deck, and one or more cockpits, each seating one paddler who strokes a double-bladed paddle. In this ontology, kayaks are considered watercrafts of their own kind, not a subtype of boat"
  {:db/ident :auto-vc/Kayak,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "kayak"},
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Kayak"
                  "http://dbpedia.org/resource/Kayak"],
   :rdfs/subClassOf :auto-vc/Watercraft,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a small human-powered watercraft that traditionally has a covered deck, and one or more cockpits, each seating one paddler who strokes a double-bladed paddle. In this ontology, kayaks are considered watercrafts of their own kind, not a subtype of boat"}})

(def LandVehicle
  "A transport vehicle which is neither an aircraft nor a watercraft."
  {:db/ident :auto-vc/LandVehicle,
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-vc-vc:LandVehicle",
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "land vehicle"},
   :rdfs/subClassOf :auto-vc/Vehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A transport vehicle which is neither an aircraft nor a watercraft."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.1.7"})

(def LargeBus
  "A bus with seating for sixteen or more persons, including the driver."
  {:db/ident :auto-vc/LargeBus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "large bus"},
   :rdfs/subClassOf :auto-vc/Bus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A bus with seating for sixteen or more persons, including the driver."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.10.2"})

(def LargeMotorcycle
  "Any motorcycle other than a motor-driven cycle."
  {:db/ident :auto-vc/LargeMotorcycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "large motorcycle"},
   :rdfs/subClassOf :auto-vc/Motorcycle,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Any motorcycle other than a motor-driven cycle."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.9.2"})

(def LargeSpecialVehicle
  "special vehicle which is considered large"
  {:db/ident :auto-vc/LargeSpecialVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "large special vehicle"}
                {:rdf/language "pl",
                 :rdf/value    "duży pojazd specjalny"}],
   :rdfs/seeAlso
   ["source: https://www.toyota-ti.ac.jp/Lab/Denshi/COIN/Ontology/TTICore-0.03/TTICarOnto.owl"],
   :rdfs/subClassOf :auto-vc/SpecialVehicle,
   :skos/definition {:rdf/language "en",
                     :rdf/value "special vehicle which is considered large"}})

(def LeftHandDriving
  "The steering position is on the left side of the vehicle (viewed from the main direction of driving). For cars this means that you drive on the right side of the road."
  {:db/ident :auto-vc/LeftHandDriving,
   :rdf/type [:auto-vc/SteeringPositionValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "left hand drive"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The steering position is on the left side of the vehicle (viewed from the main direction of driving). For cars this means that you drive on the right side of the road."}})

(def LightTruck
  "A truck which has a gross vehicle weight rating (GVWR) of 10,000 pounds (4,536 kilograms) or less"
  {:db/ident :auto-vc/LightTruck,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "light truck"},
   :rdfs/subClassOf :auto-vc/Truck,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A truck which has a gross vehicle weight rating (GVWR) of 10,000 pounds (4,536 kilograms) or less"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.24"})

(def LowSpeedVehicle
  "A motor vehicle with four or more wheels whose top speed is greater than 20 miles per hour, but not greater than 25 miles per hour."
  {:db/ident :auto-vc/LowSpeedVehicle,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "LSVs are required to be equipped with basic items of safety equipment: headlamps, stop lamps, turn signal lamps, tail lamps, reflex reflectors, parking brake, windshields of either type AS-1 or AS-5 glazing, rearview mirrors, seat belts and vehicle identification numbers (VINs)."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "low speed vehicle"},
   :rdfs/subClassOf :auto-vc/Car,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A motor vehicle with four or more wheels whose top speed is greater than 20 miles per hour, but not greater than 25 miles per hour."}})

(def MediumTruck
  "A truck which has a gross vehicle weight rating (GVWR) of more than 10,000 pounds and less than or equal to 26,000 pounds (4,536 to 11,793 kilograms)."
  {:db/ident :auto-vc/MediumTruck,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "medium truck"},
   :rdfs/subClassOf :auto-vc/Truck,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A truck which has a gross vehicle weight rating (GVWR) of more than 10,000 pounds and less than or equal to 26,000 pounds (4,536 to 11,793 kilograms)."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.25"})

(def ModificationOrMaintenance
  "an event in which a part of the vehicle is being replaced or removed, or a new part is being added."
  {:db/ident :auto-vc/ModificationOrMaintenance,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Typical examples are the replacement of the engine or the installation of a trailor-hitch."},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "modification or maintenance"},
   :rdfs/subClassOf [:auto-mo/Process
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/originalPartsOnly,
                      :rdf/type        :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :auto-vc/partReplaced,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/notAtFaultAccident,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/airbagDeployment,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    {:owl/unionOf
                                       [:auto-vc/BusinessEntity
                                        :auto-vc/BusinessEntityType],
                                       :rdf/type :owl/Class},
                      :owl/onProperty :auto-vc/carriedOutBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :auto-vc/partRemoved,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/structuralDamage,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :auto-vc/repaired,
                      :rdf/type        :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :auto-vc/partAdded,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "an event in which a part of the vehicle is being replaced or removed, or a new part is being added."}})

(def MoneyBack
  "The promise to take back the vehicle without any specific reason for a full refund within a certain amount of time"
  {:db/ident :auto-vc/MoneyBack,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "money-back guarantee"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The promise to take back the vehicle without any specific reason for a full refund within a certain amount of time"}})

(def Moped
  "A speed-limited motor-driven cycle which may be propelled by pedaling."
  {:db/ident :auto-vc/Moped,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "moped"},
   :rdfs/subClassOf :auto-vc/Motorcycle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A speed-limited motor-driven cycle which may be propelled by pedaling."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.9.4"})

(def Motor-drivenCycle
  "Any motorcycle having an engine with less than 150 cubic centimeters displacement or with 5-brake horsepower or less."
  {:db/ident :auto-vc/Motor-drivenCycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor-driven cycle"},
   :rdfs/subClassOf :auto-vc/Motorcycle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any motorcycle having an engine with less than 150 cubic centimeters displacement or with 5-brake horsepower or less."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.9.1"})

(def MotorBoat
  "a boat which is powered by an engine"
  {:db/ident :auto-vc/MotorBoat,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor boat"},
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Motorboat"
                  "http://dbpedia.org/resource/Motorboat"],
   :rdfs/subClassOf :auto-vc/Boat,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "a boat which is powered by an engine"}})

(def MotorVehicleIn-transport
  "motor vehicle on a roadway or in motion within or outside the trafficway"
  {:db/ident :auto-vc/MotorVehicleIn-transport,
   :rdf/type :owl/Class,
   :rdfs/comment [{:rdf/language "en",
                   :rdf/value    "See In-transport"}
                  {:rdf/language "en",
                   :rdf/value "A motor vehicle that is In-transport state."}],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor vehicle in-transport"},
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "motor vehicle on a roadway or in motion within or outside the trafficway"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.34"})

(def Motorcycle
  "a single-track, two-wheeled motor vehicle"
  {:db/ident :auto-vc/Motorcycle,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/comment "QName: auto-vc-vc:Motorcycle",
   :rdfs/isDefinedBy
   ["http://purl.org/vso/ns"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "motorcycle"}
                {:rdf/language "pl",
                 :rdf/value    "motocykl"}],
   :rdfs/seeAlso ["http://dbpedia.org/resource/Motorcycle"
                  "http://en.wikipedia.org/wiki/Motorcycle"],
   :rdfs/subClassOf :auto-vc/MotorizedRoadVehicle,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value    "a single-track, two-wheeled motor vehicle"}
    {:rdf/language "en",
     :rdf/value
     "Any motor vehicle having a seat or saddle for the use of its operator and designed to travel on not more than three wheels in contact with the ground."}
    {:rdf/language "pl",
     :rdf/value
     "pojazd samochodowy zaopatrzony w silnik spalinowy, dwukołowy lub z bocznym wózkiem – wielośladowy"}],
   :sm/directSource "https://schema.org/Motorcycle",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.9",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "motorbike"}})

(def MotorizedBicycle
  "a bicycle with an attached motor used to power the vehicle, or to assist with pedaling"
  {:db/ident :auto-vc/MotorizedBicycle,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motorized bicycle"},
   :rdfs/seeAlso ["http://dbpedia.org/resource/Motorized_bicycle"
                  "http://en.wikipedia.org/wiki/Motorized_bicycle"],
   :rdfs/subClassOf :auto-vc/MotorizedRoadVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a bicycle with an attached motor used to power the vehicle, or to assist with pedaling"},
   :sm/directSource "https://schema.org/MotorizedBicycle"})

(def MotorizedRoadVehicle
  "a wheeled land vehicle whose main propulsion is provided by an engine or motor"
  {:db/ident :auto-vc/MotorizedRoadVehicle,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "See 2.2.7.1, 2.2.7.2, 2.2.9 - 2.2.26"},
   :rdfs/isDefinedBy
   ["http://purl.org/vso/ns"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motorized road vehicle"},
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Motor_vehicle"
                  "http://dbpedia.org/resource/Motor_vehicle"],
   :rdfs/subClassOf [:auto-vc/RoadVehicle
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :auto-vc/productCode,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :auto-vc/insuranceGroup,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :auto-vc/acrissCode,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :auto-vc/insuranceGroup50,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "a wheeled land vehicle whose main propulsion is provided by an engine or motor"}
    {:rdf/language "en",
     :rdf/value
     "Any motorized (mechanically or electrically powered) road vehicle not operated on rails."}],
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.7"})

(def MyCar
  "vehicle that legally belongs to the subject"
  {:db/ident :auto-vc/MyCar,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "mój samochód"}
                {:rdf/language "en",
                 :rdf/value    "my car"}],
   :rdfs/seeAlso [],
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition {:rdf/language "en",
                     :rdf/value "vehicle that legally belongs to the subject"}})

(def Offering
  "thing offered especially as a gift or contribution"
  {:db/ident :auto-vc/Offering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "offering",
   :rdfs/subClassOf
   [{:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/shortSubtitle,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/shortSubtitle,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/subtitle,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/subtitle,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    :auto-mo/GenericallyDependentContinuant
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :xsd/string,
                           :owl/onProperty  :auto-vc/offerPromoCode,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :xsd/string,
                           :owl/onProperty  :auto-vc/offerPromoCode,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/termsAndConditions,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/termsAndConditions,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/shortTitle,
                           :rdf/type        :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onDataRange :rdf/PlainLiteral,
                           :owl/onProperty  :auto-vc/shortTitle,
                           :rdf/type        :owl/Restriction}],
     :rdf/type :owl/Class}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "thing offered especially as a gift or contribution"}})

(def OtherBus
  "Any bus used for transportation purposes other than school bus, transit bus, intercity bus or charter bus."
  {:db/ident :auto-vc/OtherBus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "other bus"},
   :rdfs/subClassOf :auto-vc/Bus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any bus used for transportation purposes other than school bus, transit bus, intercity bus or charter bus."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.10.6"})

(def OwnershipInfo
  "a structured value representing information about the period of ownership of a vehicle by a person or organisation"
  {:db/ident :auto-vc/OwnershipInfo,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["http://purl.org/uco/ns#"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ownership info"},
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/integer,
     :owl/onProperty  :auto-vc/numberOfDrivers,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-mo/QualitativeValue,
     :owl/onProperty :auto-vc/mileageInitial,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/unionOf [:auto-mo/Location :auto-mo/PostalAddress],
                      :rdf/type    :owl/Class},
     :owl/onProperty :auto-vc/mainLocation,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/unionOf [:auto-mo/Organization :auto-mo/Person],
                      :rdf/type    :owl/Class},
     :owl/onProperty :auto-vc/currentOwner,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/unionOf [:auto-mo/Organization :auto-mo/Person],
                      :rdf/type    :owl/Class},
     :owl/onProperty :auto-vc/owner,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/Species,
     :owl/onProperty :auto-vc/pets,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :auto-vc/licensePlate,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/ParkingType,
     :owl/onProperty :auto-vc/parking,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/CarUsageType,
     :owl/onProperty :auto-vc/usage,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/dateTime,
     :owl/onProperty  :auto-vc/from,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :auto-vc/smoking,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-mo/QuantitativeValue,
     :owl/onProperty :auto-vc/mileageEnd,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/dateTime,
     :owl/onProperty  :auto-vc/to,
     :rdf/type        :owl/Restriction}
    :auto-mo/Quality
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/OwnershipInfo,
     :owl/onProperty :auto-vc/contains,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a structured value representing information about the period of ownership of a vehicle by a person or organisation"}})

(def Paint
  "The class of paint choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 3"
  {:db/ident :auto-vc/Paint,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "paint choice or component"},
   :rdfs/subClassOf :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The class of paint choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 3"}})

(def ParkedMotorVehicle
  "A motor vehicle not in- transport, other than a working motor vehicle, that is not in motion and not located on the roadway."
  {:db/ident :auto-vc/ParkedMotorVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parked motor vehicle"},
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A motor vehicle not in- transport, other than a working motor vehicle, that is not in motion and not located on the roadway."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.34.2"})

(def Parking
  "The class of parking-related choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 7"
  {:db/ident :auto-vc/Parking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parking choice or component"},
   :rdfs/subClassOf :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The class of parking-related choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 7"}})

(def ParkingType
  "a type of parking for a vehicle, e.g. in a garage, on the street (open-sky), or in a carport"
  {:db/ident :auto-vc/ParkingType,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "You can use DBpedia URIs for additional types."},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parking type"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a type of parking for a vehicle, e.g. in a garage, on the street (open-sky), or in a carport"}})

(def PassengerCar
  "a road motor vehicle, other than a motor cycle, intended for the carriage of passengers and designed to seat no more than nine persons including the driver"
  {:db/ident :auto-vc/PassengerCar,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "samochód osobowy"}
                {:rdf/language "en",
                 :rdf/value    "passenger car"}],
   :rdfs/seeAlso [],
   :rdfs/subClassOf :auto-vc/RegularVehicle,
   :skos/definition
   [{:rdf/language "pl",
     :rdf/value
     "pojazd samochodowy przeznaczony konstrukcyjnie do przewozu nie więcej niż 9 osób łącznie z kierowcą oraz ich bagażu;"}
    {:rdf/language "en",
     :rdf/value
     "a road motor vehicle, other than a motor cycle, intended for the carriage of passengers and designed to seat no more than nine persons including the driver"}]})

(def PassengerVan
  "Any van where the area behind the driver or cab is designated for carrying passengers."
  {:db/ident :auto-vc/PassengerVan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "passenger van"},
   :rdfs/subClassOf :auto-vc/Van,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any van where the area behind the driver or cab is designated for carrying passengers."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.14.1"})

(def PaymentMethod
  "value indicating the payment method of a payment"
  {:db/ident :auto-vc/PaymentMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payment method"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "value indicating the payment method of a payment"}})

(def Pedalcycle
  "A non-motorized other road vehicle propelled by pedaling."
  {:db/ident :auto-vc/Pedalcycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pedalcycle"},
   :rdfs/subClassOf :auto-vc/HumanPoweredLandVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A non-motorized other road vehicle propelled by pedaling."}})

(def Petrol
  "Petrol, VW ID: 1"
  {:auto-vc/hasID "1",
   :db/ident :auto-vc/Petrol,
   :dcterms/source "vso:FuelTypeValue",
   :rdf/type [:auto-vc/FuelTypeValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "petrol"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Petrol, VW ID: 1"}})

(def PoleTrailer
  "A trailer designed to be attached to the towing road vehicle by means of a reach or pole, or by being boomed or otherwise secured to the towing road vehicle, and ordinarily used for carrying property of a long or irregular shape such as poles, pipes or structural members that are generally capable of sustaining themselves as beams between the supporting connections."
  {:db/ident :auto-vc/PoleTrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pole trailer"},
   :rdfs/subClassOf :auto-vc/Trailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A trailer designed to be attached to the towing road vehicle by means of a reach or pole, or by being boomed or otherwise secured to the towing road vehicle, and ordinarily used for carrying property of a long or irregular shape such as poles, pipes or structural members that are generally capable of sustaining themselves as beams between the supporting connections."}})

(def PriceSpecification
  "indication of the unit price and delivery or payment charges"
  {:db/ident :auto-vc/PriceSpecification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "price specification"},
   :rdfs/subClassOf :auto-mo/ValueSpace,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "indication of the unit price and delivery or payment charges"}})

(def Private
  "The usage of a vehicle soleley for private purposes"
  {:db/ident :auto-vc/Private,
   :rdf/type [:auto-vc/CarUsageType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The usage of a vehicle soleley for private purposes"}})

(def PropertySpecification
  "A Property Specification is an abstract entity specifying a set of properties for a vehicle that results from a single choice or the combination of two or more choices and that override the individual properties of the resulting vehicle. Example 1: Power steering and Air conditioning in combination reduce the available engine power from 90 kW to 89 kW. Example 2: Choosing the color option \"blue\" changes the color of the car to \"blue\"."
  {:db/ident :auto-vc/PropertySpecification,
   :owl/disjointWith [:auto-vc/Trim :auto-vc/SpecItemCollection],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "property speciﬁcation"},
   :rdfs/subClassOf :auto-mo/Model,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Property Specification is an abstract entity specifying a set of properties for a vehicle that results from a single choice or the combination of two or more choices and that override the individual properties of the resulting vehicle.\n\nExample 1: Power steering and Air conditioning in combination reduce the available engine power from 90 kW to 89 kW.\nExample 2: Choosing the color option \"blue\" changes the color of the car to \"blue\"."}})

(def PulpwoodTrailer
  "trailer or semitrailer that is designed exclusively for harvesting logs or pulpwood and constructed with a skeletal frame with no means for attachment of a solid bed, body, or container"
  {:db/ident :auto-vc/PulpwoodTrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pulpwood trailer"},
   :rdfs/subClassOf :auto-vc/FullTrailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "trailer or semitrailer that is designed exclusively for harvesting logs or pulpwood and constructed with a skeletal frame with no means for attachment of a solid bed, body, or container"}})

(def Quadracycle
  "a four-wheeled human-powered vehicle. It is also referred to as a quadricycle, quadcycle pedal car or four-wheeled bicycle"
  {:db/ident :auto-vc/Quadracycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quadracycle"},
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Quadracycle"
                  "http://dbpedia.org/resource/Quadracycle"],
   :rdfs/subClassOf :auto-vc/Pedalcycle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a four-wheeled human-powered vehicle. It is also referred to as a quadricycle, quadcycle pedal car or four-wheeled bicycle"}})

(def RailwayTrain
  "Any motorized railway vehicle."
  {:db/ident :auto-vc/RailwayTrain,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "train"},
   :rdfs/subClassOf :auto-vc/RailwayVehicle,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Any motorized railway vehicle."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.5"})

(def RailwayVehicle
  "Any land vehicle that is (1) designed primarily for, or in use for, moving persons or property from one place to another on rails and (2) not in use on a land way other than a railway."
  {:db/ident :auto-vc/RailwayVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "railway vehicle"},
   :rdfs/subClassOf :auto-vc/LandVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any land vehicle that is (1) designed primarily for, or in use for, moving persons or property from one place to another on rails and (2) not in use on a land way other than a railway."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.4"})

(def RearWheelDriveConfiguration
  "Rear-wheel drive is a transmission layout where the engine drives the rear wheels."
  {:db/ident :auto-vc/RearWheelDriveConfiguration,
   :rdf/type [:auto-vc/DriveWheelConfigurationValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rear-wheel drive"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Rear-wheel drive is a transmission layout where the engine drives the rear wheels."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "RWD"}})

(def RegularVehicle
  "normal vehicle used for daily commuting"
  {:db/ident :auto-vc/RegularVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "zwykły pojazd"}
                {:rdf/language "en",
                 :rdf/value    "regular vehicle"}],
   :rdfs/seeAlso [],
   :rdfs/subClassOf :auto-vc/Car,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "normal vehicle used for daily commuting"}})

(def RelativePriceSpecification
  "relative indication of the unit price and delivery or payment charges"
  {:db/ident :auto-vc/RelativePriceSpecification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "relative price specification"},
   :rdfs/subClassOf :auto-vc/PriceSpecification,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relative indication of the unit price and delivery or payment charges"}})

(def RentalVehicleUsage
  "Indicates the usage of the vehicle as a rental car."
  {:db/ident :auto-vc/RentalVehicleUsage,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type [:auto-vc/CarUsageType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "rental vehicle usage",
   :skos/definition "Indicates the usage of the vehicle as a rental car."})

(def Rickshaw
  "a two-wheeled cart which seats one or two persons and is being drawn by a runner"
  {:db/ident :auto-vc/Rickshaw,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rickshaw"},
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Rickshaw"
                  "http://dbpedia.org/resource/Rickshaw"],
   :rdfs/subClassOf :auto-vc/Pedalcycle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a two-wheeled cart which seats one or two persons and is being drawn by a runner"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "ricksha"}})

(def RightHandDriving
  "The steering position is on the right side of the vehicle (viewed from the main direction of driving). For cars this means that you drive on the left side of the road."
  {:db/ident :auto-vc/RightHandDriving,
   :rdf/type [:auto-vc/SteeringPositionValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "right hand drive"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The steering position is on the right side of the vehicle (viewed from the main direction of driving). For cars this means that you drive on the left side of the road."}})

(def RoadVehicle
  "land vehicle other than a railway vehicle"
  {:db/ident :auto-vc/RoadVehicle,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A superclass of classes addopted from ANSI D.16-2017."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road vehicle"},
   :rdfs/subClassOf :auto-vc/LandVehicle,
   :skos/definition {:rdf/language "en",
                     :rdf/value "land vehicle other than a railway vehicle"}})

(def Roofs
  "The class of roof choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 5"
  {:db/ident :auto-vc/Roofs,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "roofs choice or component"},
   :rdfs/subClassOf :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The class of roof choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 5"}})

(def SailingBoat
  "a boat propelled partly or entirely by sails"
  {:db/ident :auto-vc/SailingBoat,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sailing boat"},
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Sailboat"
                  "http://dbpedia.org/resource/Sailboat"],
   :rdfs/subClassOf :auto-vc/Boat,
   :skos/definition {:rdf/language "en",
                     :rdf/value "a boat propelled partly or entirely by sails"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "sailboat"}})

(def SchoolBus
  "A motor vehicle used for the transportation of any school pupil at or below the 12th-grade level to or from a public or private school or school-related activity."
  {:db/ident :auto-vc/SchoolBus,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A motor vehicle is not a school bus while on trips which involve the transportation exclusively of other passengers or exclusively for other purposes. A motor vehicle is a school bus only if it is externally identifiable by the following characteristics : 1.) Its color is yellow, 2.) The words “ school bus '' appear on the front and rear, 3.) Flashing red lights are located on the front and rear, 4.) Lettering on both sides identifies the school or school district served, or the company operating the bus."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "school bus"},
   :rdfs/subClassOf :auto-vc/Bus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A motor vehicle used for the transportation of any school pupil at or below the 12th-grade level to or from a public or private school or school-related activity."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.8.1"})

(def Seats
  "The class of seat-related choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 9"
  {:db/ident :auto-vc/Seats,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seats choice or component"},
   :rdfs/subClassOf :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The class of seat-related choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 9"}})

(def Semitrailer
  "A trailer, other than a pole trailer, designed for carrying property and so constructed that part of its weight rests upon or is carried by the towing road vehicle."
  {:db/ident :auto-vc/Semitrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "semitrailer"},
   :rdfs/subClassOf :auto-vc/Trailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A trailer, other than a pole trailer, designed for carrying property and so constructed that part of its weight rests upon or is carried by the towing road vehicle."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.17"})

(def Ship
  "a large watercraft that floats on water"
  {:db/ident :auto-vc/Ship,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ship"},
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Ship"
                  "http://dbpedia.org/resource/Ship"],
   :rdfs/subClassOf :auto-vc/Watercraft,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "a large watercraft that floats on water"}})

(def SingleUnitTruck
  "A truck consisting primarily of a single motorized transport device designed for carrying property."
  {:db/ident :auto-vc/SingleUnitTruck,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "When connected to a trailer, such a device may be part of a truck combination."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "single unit truck"},
   :rdfs/subClassOf :auto-vc/Truck,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A truck consisting primarily of a single motorized transport device designed for carrying property."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.19"})

(def SmallBus
  "A bus with seating for nine to fifteen persons, including the driver."
  {:db/ident :auto-vc/SmallBus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "small bus"},
   :rdfs/subClassOf :auto-vc/Bus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A bus with seating for nine to fifteen persons, including the driver."}})

(def SmallSpecialVehicle
  "special vehicle which is considered small"
  {:db/ident :auto-vc/SmallSpecialVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "small special vehicle"}
                {:rdf/language "pl",
                 :rdf/value    "mały pojazd specjalny"}],
   :rdfs/seeAlso
   ["source: https://www.toyota-ti.ac.jp/Lab/Denshi/COIN/Ontology/TTICore-0.03/TTICarOnto.owl"],
   :rdfs/subClassOf :auto-vc/SpecialVehicle,
   :skos/definition {:rdf/language "en",
                     :rdf/value "special vehicle which is considered small"}})

(def SpecItemCollection
  "A Spec Item Collection is an entity collating multiple coo:ChoiceOrComponent options for a given coo:Derivative, i.e. the available configurational choices. The default choice can be indicated using a coo:default link. All other choices are attached using coo:availableChoice. The number of coo:ChoiceOrComponent items that can / must be selected for a valid configuration are indicated via coo:min and coo:max."
  {:db/ident :auto-vc/SpecItemCollection,
   :owl/disjointWith :auto-vc/Trim,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["http://purl.org/coo/ns#"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "spec item collection"},
   :rdfs/subClassOf [{:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                                            :owl/onDataRange :xsd/int,
                                            :owl/onProperty  :auto-vc/min,
                                            :rdf/type        :owl/Restriction}
                                           {:owl/maxQualifiedCardinality 1,
                                            :owl/onDataRange :xsd/int,
                                            :owl/onProperty  :auto-vc/min,
                                            :rdf/type        :owl/Restriction}],
                      :rdf/type :owl/Class}
                     {:owl/onProperty     :auto-vc/availableChoice,
                      :owl/someValuesFrom :auto-vc/ChoiceOrComponent,
                      :rdf/type           :owl/Restriction}
                     :auto-mo/GenericallyDependentContinuant
                     {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                                            :owl/onDataRange :xsd/int,
                                            :owl/onProperty  :auto-vc/max,
                                            :rdf/type        :owl/Restriction}
                                           {:owl/maxQualifiedCardinality 1,
                                            :owl/onDataRange :xsd/int,
                                            :owl/onProperty  :auto-vc/max,
                                            :rdf/type        :owl/Restriction}],
                      :rdf/type :owl/Class}
                     {:owl/intersectionOf
                      [{:owl/minQualifiedCardinality 0,
                        :owl/onClass    :auto-vc/ChoiceOrComponent,
                        :owl/onProperty :auto-vc/default,
                        :rdf/type       :owl/Restriction}
                       {:owl/maxQualifiedCardinality 1,
                        :owl/onClass    :auto-vc/ChoiceOrComponent,
                        :owl/onProperty :auto-vc/default,
                        :rdf/type       :owl/Restriction}],
                      :rdf/type :owl/Class}
                     {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                                            :owl/onDataRange :xsd/int,
                                            :owl/onProperty :auto-vc/displayPos,
                                            :rdf/type :owl/Restriction}
                                           {:owl/maxQualifiedCardinality 1,
                                            :owl/onDataRange :xsd/int,
                                            :owl/onProperty :auto-vc/displayPos,
                                            :rdf/type :owl/Restriction}],
                      :rdf/type :owl/Class}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Spec Item Collection is an entity collating multiple coo:ChoiceOrComponent options for a given coo:Derivative, i.e. the available configurational choices. \nThe default choice can be indicated using a coo:default link. All other choices are attached using coo:availableChoice. The number of coo:ChoiceOrComponent items that can / must be selected for a valid configuration are indicated via coo:min and coo:max."}})

(def SpecialVehicle
  "a vehicle or trailer intended to perform a special function requiring body adjustments or special equipment; this vehicle is capable of carrying persons and objects associated with the performance of this function"
  {:db/ident :auto-vc/SpecialVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "special vehicle"}
                {:rdf/language "pl",
                 :rdf/value    "pojazd specjalny"}],
   :rdfs/seeAlso [],
   :rdfs/subClassOf :auto-vc/Car,
   :skos/definition
   [{:rdf/language "pl",
     :rdf/value
     "pojazd samochodowy lub przyczepa przeznaczone do wykonywania specjalnej funkcji, która powoduje konieczność dostosowania nadwozia lub posiadania specjalnego wyposażenia; w pojeździe tym mogą być przewożone osoby i rzeczy związane z wykonywaniem tej funkcji"}
    {:rdf/language "en",
     :rdf/value
     "a vehicle or trailer intended to perform a special function requiring body adjustments or special equipment; this vehicle is capable of carrying persons and objects associated with the performance of this function"}]})

(def Species
  "typically a pet, for indicating the type of animals that were regularly transported in the vehicle"
  {:db/ident :auto-vc/Species,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If possible, use DBPedia URIs, e.g. http://dbpedia.org/resource/Dog."},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "species"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "typically a pet, for indicating the type of animals that were regularly transported in the vehicle"}})

(def Speed-limitedMotor-drivenCycle
  "Any motor- driven cycle which : 1.) will not attain a speed of more than 30 miles per hour (48 kilometers per hour) in one mile (1.609 kilometers) from a standing start, 2.) has an engine with not more than 50 cubic centimeters displacement or with 2-brake horsepower or less, and 3.) has a power drive system which does not require its operator to shift gears."
  {:db/ident :auto-vc/Speed-limitedMotor-drivenCycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed-limited motor-driven cycle"},
   :rdfs/subClassOf :auto-vc/Motorcycle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any motor- driven cycle which : 1.) will not attain a speed of more than 30 miles per hour (48 kilometers per hour) in one mile (1.609 kilometers) from a standing start, 2.) has an engine with not more than 50 cubic centimeters displacement or with 2-brake horsepower or less, and 3.) has a power drive system which does not require its operator to shift gears."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.9.3"})

(def SpeedInterval
  "a value indicating a speed interval, mostly for explaining acceleration data"
  {:db/ident :auto-vc/SpeedInterval,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed interval"},
   :rdfs/subClassOf :auto-mo/QuantitativeValueFloat,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a value indicating a speed interval, mostly for explaining acceleration data"}})

(def SteeringPositionValue
  "a value indicating a steering position"
  {:db/ident :auto-vc/SteeringPositionValue,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "steering position value"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "a value indicating a steering position"},
   :sm/directSource "https://schema.org/SteeringPositionValue"})

(def SteeringWheels
  "The class of steering wheels choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 6"
  {:db/ident :auto-vc/SteeringWheels,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "steering wheels choice or component"},
   :rdfs/subClassOf :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The class of steering wheels choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 6"}})

(def StraddleTrailer
  "trailer that is designed to transport bulk agricultural commodities from the harvesting location, as evidenced by a framework that is driven over the cargo and lifting arms that suspend the cargo for transit"
  {:db/ident :auto-vc/StraddleTrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "straddle trailer"},
   :rdfs/subClassOf :auto-vc/FullTrailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "trailer that is designed to transport bulk agricultural commodities from the harvesting location, as evidenced by a framework that is driven over the cargo and lifting arms that suspend the cargo for transit"}})

(def Street
  "The parking of a vehicle on a public or private street"
  {:db/ident :auto-vc/Street,
   :rdf/type [:auto-vc/ParkingType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "street"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The parking of a vehicle on a public or private street"}})

(def TT4SpeedAuto
  "4 Speed auto. VW ID: 1"
  {:auto-vc/gearboxTypeId "1",
   :auto-vc/hasID "1",
   :db/ident :auto-vc/TT4SpeedAuto,
   :dcterms/source "vvo:TransmissionTypeValueAutomatic",
   :rdf/type [:auto-vc/TransmissionTypeValueAutomatic :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "4 speed auto"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "4 Speed auto. VW ID: 1"}})

(def TT5SpeedAutoDSG
  "5 Speed auto DSG, VW ID: 8"
  {:auto-vc/gearboxTypeId "3",
   :auto-vc/hasID "8",
   :db/ident :auto-vc/TT5SpeedAutoDSG,
   :dcterms/source "vvo:TransmissionTypeValueAutomatic",
   :rdf/type [:auto-vc/TransmissionTypeValueAutomatic :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "5 speed auto DSG"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "5 Speed auto DSG, VW ID: 8"}})

(def TT5SpeedAutoTiptronic
  "5 Speed auto tiptronic, VW ID: 3"
  {:auto-vc/gearboxTypeId "2",
   :auto-vc/hasID "3",
   :db/ident :auto-vc/TT5SpeedAutoTiptronic,
   :dcterms/source "vvo:TransmissionTypeValueAutomatic",
   :rdf/type [:auto-vc/TransmissionTypeValueAutomatic :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "5 speed auto tiptronic"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "5 Speed auto tiptronic, VW ID: 3"}})

(def TT5SpeedManual
  "5 Speed manual, VW ID: 2"
  {:auto-vc/gearboxTypeId "1",
   :auto-vc/hasID "2",
   :db/ident :auto-vc/TT5SpeedManual,
   :dcterms/source "vvo:TransmissionTypeValueManual",
   :rdf/type [:auto-vc/TransmissionTypeValueManual :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "5 speed manual"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "5 Speed manual, VW ID: 2"}})

(def TT6SpeedAuto
  "6 Speed auto, VW ID: 5"
  {:auto-vc/gearboxTypeId "2",
   :auto-vc/hasID "5",
   :db/ident :auto-vc/TT6SpeedAuto,
   :dcterms/source "vvo:TransmissionTypeValueAutomatic",
   :rdf/type [:auto-vc/TransmissionTypeValueAutomatic :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "6 speed auto"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "6 Speed auto, VW ID: 5"}})

(def TT6SpeedAutoDSG
  "6 Speed auto DSG, VW ID: 6"
  {:auto-vc/gearboxTypeId "3",
   :auto-vc/hasID "6",
   :db/ident :auto-vc/TT6SpeedAutoDSG,
   :dcterms/source "vvo:TransmissionTypeValueAutomatic",
   :rdf/type [:auto-vc/TransmissionTypeValueAutomatic :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "6 speed auto DSG"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "6 Speed auto DSG, VW ID: 6"}})

(def TT6SpeedAutoTiptronic
  "6 Speed auto tiptronic, VW ID: 7"
  {:auto-vc/gearboxTypeId "2",
   :auto-vc/hasID "7",
   :db/ident :auto-vc/TT6SpeedAutoTiptronic,
   :dcterms/source "vvo:TransmissionTypeValueAutomatic",
   :rdf/type [:auto-vc/TransmissionTypeValueAutomatic :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "6 speed auto tiptronic"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "6 Speed auto tiptronic, VW ID: 7"}})

(def TT6SpeedManual
  "6 Speed manual, VW ID: 4"
  {:auto-vc/gearboxTypeId "1",
   :auto-vc/hasID "4",
   :db/ident :auto-vc/TT6SpeedManual,
   :dcterms/source "vvo:TransmissionTypeValueManual",
   :rdf/type [:auto-vc/TransmissionTypeValueManual :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "6 speed manual"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "6 Speed manual, VW ID: 4"}})

(def TT7SpeedAutoDSG
  "7 Speed auto DSG, VW ID: 9"
  {:auto-vc/gearboxTypeId "3",
   :auto-vc/hasID "9",
   :db/ident :auto-vc/TT7SpeedAutoDSG,
   :dcterms/source "vvo:TransmissionTypeValueAutomatic",
   :rdf/type [:auto-vc/TransmissionTypeValueAutomatic :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "7 speed auto DSG"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "7 Speed auto DSG, VW ID: 9"}})

(def TT8SpeedAuto
  "8 Speed auto, VW ID: 10"
  {:auto-vc/gearboxTypeId "2",
   :auto-vc/hasID "10",
   :db/ident :auto-vc/TT8SpeedAuto,
   :dcterms/source "vvo:TransmissionTypeValueAutomatic",
   :rdf/type [:auto-vc/TransmissionTypeValueAutomatic :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "8 speed auto"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "8 Speed auto, VW ID: 10"}})

(def TTUnspecified
  "Unspecified, VW ID: 0"
  {:auto-vc/gearboxTypeId "1",
   :auto-vc/hasID "0",
   :db/ident :auto-vc/TTUnspecified,
   :dcterms/source "vso:TransmissionTypeValue",
   :rdf/type [:auto-vc/TransmissionTypeValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unspecified"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Unspecified, VW ID: 0"}})

(def TaxiVehicleUsage
  "Indicates the usage of the car as a taxi."
  {:db/ident :auto-vc/TaxiVehicleUsage,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type [:auto-vc/CarUsageType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "taxi vehicle usage",
   :skos/definition "Indicates the usage of the car as a taxi."})

(def Three-wheeledMotorcycle
  "Any motor vehicle having a seat or saddle for the use of its operator, and having three wheels in contact with the ground."
  {:db/ident :auto-vc/Three-wheeledMotorcycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "three-wheeled motorcycle"},
   :rdfs/subClassOf :auto-vc/Motorcycle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any motor vehicle having a seat or saddle for the use of its operator, and having three wheels in contact with the ground."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.9.6"})

(def TractorPoleTrailer
  "combination vehicle that carries logs lengthwise so that they form the body of the vehicle"
  {:db/ident :auto-vc/TractorPoleTrailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tractor pole trailer"},
   :rdfs/subClassOf :auto-vc/PoleTrailer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "combination vehicle that carries logs lengthwise so that they form the body of the vehicle"}})

(def TrafficPattern
  "A value indicating a traffic pattern, to be used as a reference for vso:fuelConsumption or vso:fuelEconomy"
  {:db/ident :auto-vc/TrafficPattern,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traffic pattern value"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A value indicating a traffic pattern, to be used as a reference for vso:fuelConsumption or vso:fuelEconomy"}})

(def Trailer
  "A road vehicle designed to be drawn by another road vehicle."
  {:db/ident :auto-vc/Trailer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trailer"},
   :rdfs/subClassOf :auto-vc/RoadVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A road vehicle designed to be drawn by another road vehicle."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.15"})

(def TransitBus
  "A bus used for passenger transportation over fixed, scheduled routes within primarily urban geographical areas."
  {:db/ident :auto-vc/TransitBus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transit bus"},
   :rdfs/subClassOf :auto-vc/Bus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A bus used for passenger transportation over fixed, scheduled routes within primarily urban geographical areas."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.10.3"})

(def TransmissionTypeValue
  "a value indicating a type of transmission"
  {:db/ident :auto-vc/TransmissionTypeValue,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "You can safely use any reasonable DBPedia URI, e.g. \n  http://dbpedia.org/resource/Manual_transmission\n  http://dbpedia.org/resource/Automatic_transmission"},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transmission type value"},
   :rdfs/subClassOf [{:owl/intersectionOf
                      [{:owl/minQualifiedCardinality 0,
                        :owl/onDataRange :xsd/string,
                        :owl/onProperty  :auto-vc/gearboxTypeId,
                        :rdf/type        :owl/Restriction}
                       {:owl/maxQualifiedCardinality 1,
                        :owl/onDataRange :xsd/string,
                        :owl/onProperty  :auto-vc/gearboxTypeId,
                        :rdf/type        :owl/Restriction}],
                      :rdf/type :owl/Class}
                     :auto-mo/QualitativeValue],
   :skos/definition {:rdf/language "en",
                     :rdf/value "a value indicating a type of transmission"}})

(def TransmissionTypeValueAutomatic
  "The class of all automatic transmission types"
  {:db/ident :auto-vc/TransmissionTypeValueAutomatic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transmission type value automatic"},
   :rdfs/subClassOf :auto-vc/TransmissionTypeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The class of all automatic transmission types"}})

(def TransmissionTypeValueManual
  "The class of all manual transmission types"
  {:db/ident :auto-vc/TransmissionTypeValueManual,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transmission type value manual"},
   :rdfs/subClassOf :auto-vc/TransmissionTypeValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value "The class of all manual transmission types"}})

(def TransportVehicle
  "Consists of one or more devices or animals and their load."
  {:db/ident :auto-vc/TransportVehicle,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Such devices or animals shall include at least one of the following : 1.) A transport device, or a unit, made up of connected transport devices, while idle or in use, for moving persons or property from one place to another, 2.) An animal or team of animals while in use for moving person or property other than the animal or team itself from one place to another, or 3.) A movable device such as construction, farm or industrial machinery outside the confines of a building and its premises while in use for moving persons, the device itself, or other property from one place to another."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transport vehicle"},
   :rdfs/subClassOf :auto-vc/SpecialVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Consists of one or more devices or animals and their load."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.1.4"})

(def Trim
  "A Trim is an abstract entity specifying (1) the basic features plus (2) a set of configuration choices (mostly non-functional) of a group of vehicles. A Trim should be linked to its Base Model via gr:isVariantOf, if available. Examples: VW Golf S, VW Polo Match, VW Passat SE"
  {:db/ident :auto-vc/Trim,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trim"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-vc/Derivative,
                      :owl/onProperty :auto-vc/hasDerivative,
                      :rdf/type       :owl/Restriction}
                     :auto-mo/Model],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Trim is an abstract entity specifying (1) the basic features plus (2) a set of configuration choices (mostly non-functional) of a group of vehicles. \nA Trim should be linked to its Base Model via gr:isVariantOf, if available.\n\nExamples: VW Golf S, VW Polo Match, VW Passat SE"}})

(def Truck
  "a motor vehicle designed to transport cargo"
  {:db/ident :auto-vc/Truck,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "pl",
     :rdf/value
     "pojazd samochodowy przeznaczony konstrukcyjnie do przewozu ładunków"}
    "QName: auto-vc-vc:Truck"],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "truck"}
                {:rdf/language "pl",
                 :rdf/value    "samochód ciężarowy"}],
   :rdfs/seeAlso ["http://dbpedia.org/resource/Truck"
                  "http://en.wikipedia.org/wiki/Truck"],
   :rdfs/subClassOf [:auto-vc/LargeSpecialVehicle :auto-vc/TransportVehicle],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value    "a motor vehicle designed to transport cargo"}
    {:rdf/language "en",
     :rdf/value "A motor vehicle designed primarily for carrying property."}],
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.13",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "lorry"}})

(def TruckCombination
  "A truck consisting primarily of a transport device which is a single- unit truck or truck tractor together with one or more attached trailers."
  {:db/ident :auto-vc/TruckCombination,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "truck combination"},
   :rdfs/subClassOf :auto-vc/Truck,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A truck consisting primarily of a transport device which is a single- unit truck or truck tractor together with one or more attached trailers."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.21"})

(def TruckTractor
  "A motor vehicle consisting of a single motorized transport device designed primarily for drawing trailers."
  {:db/ident :auto-vc/TruckTractor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "truck tractor"},
   :rdfs/subClassOf :auto-vc/Truck,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A motor vehicle consisting of a single motorized transport device designed primarily for drawing trailers."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.20"})

(def TwoStrokeMixture
  "A pre-mixed fuel-oil mixture"
  {:db/ident :auto-vc/TwoStrokeMixture,
   :rdf/type [:auto-vc/FuelTypeValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "two-stroke mixture"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A pre-mixed fuel-oil mixture"}})

(def Upholstery
  "The class of upholstery choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 4"
  {:db/ident :auto-vc/Upholstery,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "upholstery choice or component"},
   :rdfs/subClassOf :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The class of upholstery choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 4"}})

(def Urban
  "Urban usage as a traffic pattern"
  {:db/ident :auto-vc/Urban,
   :dcterms/source "vvo:TrafficPattern",
   :rdf/type [:auto-vc/TrafficPattern :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "urban"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Urban usage as a traffic pattern"}})

(def UtilityVehicle
  "A motor vehicle other than a motorcycle or large bus consisting primarily of a transport device designed for carrying persons, and generally considered a multi-purpose vehicle that is designed to have off-road capabilities."
  {:db/ident :auto-vc/UtilityVehicle,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "These vehicles are generally four wheel-drive (4 x 4) and have increased ground clearance. A utility vehicle typically has a gross vehicle weight rating (GVWR) of 10,000 pounds or less. Utility vehicles with wheelbases greater than 88 inches are classified by overall width. The wheelbase and overall width should be rounded to the nearest inch."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "utility vehicle"},
   :rdfs/subClassOf :auto-vc/SpecialVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A motor vehicle other than a motorcycle or large bus consisting primarily of a transport device designed for carrying persons, and generally considered a multi-purpose vehicle that is designed to have off-road capabilities."}})

(def Van
  "A gross vehicle weight rating (GVWR) of 10,000 pounds or less and is basically a “ box on wheels ” that is identifiable by its enclosed passenger and/or cargo area, step-up floor, and relatively short (or nonexistent) hood."
  {:db/ident :auto-vc/Van,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Vans are classified by size based on frame type and overall vehicle body width. Before classification, vehicle width should be rounded to the nearest inch."},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "van"},
   :rdfs/seeAlso ["http://dbpedia.org/resource/Van"
                  "http://en.wikipedia.org/wiki/Van"],
   :rdfs/subClassOf :auto-vc/SmallSpecialVehicle,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "A gross vehicle weight rating (GVWR) of 10,000 pounds or less and is basically a “ box on wheels ” that is identifiable by its enclosed passenger and/or cargo area, step-up floor, and relatively short (or nonexistent) hood."}
    {:rdf/language "en",
     :rdf/value
     "a kind of vehicle used for transporting  goods or groups of people. It is usually a box-shaped vehicle on four wheels, about the same width and length as a large automobile, but taller and usually higher off the ground, also referred to as a light commercial vehicle or LCV."}],
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.14"})

(def Van-basedBus
  "Any passenger van designed for carrying nine or more persons, including the driver."
  {:db/ident :auto-vc/Van-basedBus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "van-based bus"},
   :rdfs/subClassOf :auto-vc/Van,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any passenger van designed for carrying nine or more persons, including the driver."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.14.4"})

(def Van-basedMotorhome
  "Any van where a frame-mounted recreational unit is added behind the driver or cab area."
  {:db/ident :auto-vc/Van-basedMotorhome,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "van-based motorhome"},
   :rdfs/subClassOf :auto-vc/Van,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any van where a frame-mounted recreational unit is added behind the driver or cab area."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.14.3"})

(def Vehicle
  "a device that is designed or used to transport people or cargo over land, water, air, or through space"
  {:db/ident :auto-vc/Vehicle,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "pojazd"}
                {:rdf/language "en",
                 :rdf/value    "vehicle"}],
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Vehicle"
                  "http://dbpedia.org/resource/Vehicle"],
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/dateTime,
     :owl/onProperty  :auto-vc/vehicleModelDate,
     :rdf/type        :owl/Restriction}
    :auto-mo/Object
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/Species,
     :owl/onProperty :auto-vc/pets,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/CarUsageType,
     :owl/onProperty :auto-vc/usage,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/PriceSpecification,
     :owl/onProperty :auto-vc/valuation,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :auto-vc/smoking,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdf/PlainLiteral,
     :owl/onProperty  :auto-vc/termsAndConditions,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-mo/QuantitativeValueFloat,
     :owl/onProperty :auto-vc/accelerationTime,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/PriceSpecification,
     :owl/onProperty :auto-vc/listPrice,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :auto-vc/indicationOfOdometerRollback,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdf/PlainLiteral,
     :owl/onProperty  :auto-vc/shortTitle,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/unionOf [:auto-mo/Organization :auto-mo/Person],
                      :rdf/type    :owl/Class},
     :owl/onProperty :auto-vc/owner,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/unionOf [:auto-mo/Location :auto-mo/PostalAddress],
                      :rdf/type    :owl/Class},
     :owl/onProperty :auto-vc/currentLocation,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :auto-vc/marketingName,
     :owl/someValuesFrom :xsd/string,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/OwnershipInfo,
     :owl/onProperty :auto-vc/hasOwnershipInfo,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-mo/QuantitativeValue,
     :owl/onProperty :auto-vc/cargoVolume,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/dateTime,
     :owl/onProperty  :auto-vc/purchaseDate,
     :rdf/type        :owl/Restriction}
    {:owl/onDataRange :xsd/boolean,
     :owl/onProperty  :auto-vc/airbagDeployment,
     :owl/qualifiedCardinality 1,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :auto-vc/knownVehicleDamages,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdf/PlainLiteral,
     :owl/onProperty  :auto-vc/shortSubtitle,
     :rdf/type        :owl/Restriction}
    {:owl/minCardinality 0,
     :owl/onProperty     :auto-vc/knownVehicleDamages,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-vc/ParkingType,
     :owl/onProperty :auto-vc/parking,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :auto-vc/structuralDamage,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdf/PlainLiteral,
     :owl/onProperty  :auto-vc/subtitle,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/integer,
     :owl/onProperty  :auto-vc/numberOfDrivers,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :auto-vc/rentalUsage,
     :rdf/type        :owl/Restriction}
    {:owl/minCardinality 0,
     :owl/onProperty     :auto-vc/condition,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :auto-vc/repaired,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/integer,
     :owl/onProperty  :auto-vc/numberOfOwners,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/unionOf [:auto-mo/Organization :auto-mo/Person],
                      :rdf/type    :owl/Class},
     :owl/onProperty :auto-vc/currentOwner,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a device that is designed or used to transport people or cargo over land, water, air, or through space"},
   :sm/directSource "https://schema.org/Vehicle"})

(def WarrantyScope
  "period of time during which the warranty is valid"
  {:db/ident :auto-vc/WarrantyScope,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "warranty scope",
   :rdfs/subClassOf :auto-mo/GenericallyDependentContinuant,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "period of time during which the warranty is valid"}})

(def Watercraft
  "a vehicle, vessel or craft designed to move across or through water"
  {:db/ident :auto-vc/Watercraft,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "watercraft"},
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Watercraft"
                  "http://dbpedia.org/resource/Watercraft"],
   :rdfs/subClassOf :auto-vc/Vehicle,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "a vehicle, vessel or craft designed to move across or through water"}
    {:rdf/language "en",
     :rdf/value
     "A transport vehicle designed primarily for, or in use for, moving persons or property on or through, and supported by, water from one place to another."}],
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.1.6"})

(def Wheels
  "The class of wheels-related choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 2"
  {:db/ident :auto-vc/Wheels,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "wheels choice or component"},
   :rdfs/subClassOf :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The class of wheels-related choices or components (a \"MonoSelectGroup\" in automotive terminology), VW ID: 2"}})

(def WorkingMotorVehicle
  "A motor vehicle in the act of performing construction, maintenance or utility work related to the trafficway."
  {:db/ident :auto-vc/WorkingMotorVehicle,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This \"work\" may be located within open or closed portions of the trafficway and motor vehicles performing these activities can be within or outside of the trafficway boundaries."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "working motor vehicle"},
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A motor vehicle in the act of performing construction, maintenance or utility work related to the trafficway."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.2.7.2."})

(def accelerationTime
  "The time needed to accelerate the vehicle from a given start velocity to a given target velocity.<br/><br/> Typical unit code(s): SEC for seconds<br/><br/> <ul> <li>Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use \"SEC\" for seconds and indicate the velocities in the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a>, or use <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a> with a <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> of 0..60 mph or 0..100 km/h to specify the reference speeds.</li> </ul>"
  {:db/ident :auto-vc/accelerationTime,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "acceleration time"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The time needed to accelerate the vehicle from a given start velocity to a given target velocity.<br/><br/>\n\nTypical unit code(s): SEC for seconds<br/><br/>\n\n<ul>\n<li>Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use \"SEC\" for seconds and indicate the velocities in the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a>, or use <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a> with a <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> of 0..60 mph or 0..100 km/h to specify the reference speeds.</li>\n</ul>"})

(def acrissCode
  "The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards."
  {:db/ident :auto-vc/acrissCode,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain [:auto-vc/MotorizedRoadVehicle
                 {:owl/unionOf [:auto-vc/Bus :auto-vc/Car],
                  :rdf/type    :owl/Class}],
   :rdfs/isDefinedBy
   ["http://purl.org/vso/ns"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "acriss code"},
   :rdfs/range :xsd/string,
   :rdfs/seeAlso
   ["http://dbpedia.org/resource/ACRISS_Car_Classification_Code"
    "http://en.wikipedia.org/wiki/ACRISS_Car_Classification_Code"],
   :skos/definition
   ["The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards."
    {:rdf/language "en",
     :rdf/value
     "The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards."}]})

(def advancedPayment
  "Indicates the advanced payment for the financing"
  {:db/ident :auto-vc/advancedPayment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "advanced payment"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates the advanced payment for the financing"}})

(def airbagDeployment
  "This property indicates whether at least one of the airbags of the vehicle has been deployed in the respective accident (when attached to uco:DamageOrAccident) or ever (when directly applied to a vso:Vehicle)."
  {:db/ident :auto-vc/airbagDeployment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:auto-vc/DamageOrAccident :auto-vc/Vehicle],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "airbag deployment"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property indicates whether at least one of the airbags of the vehicle has been deployed in the respective accident (when attached to uco:DamageOrAccident) or ever (when directly applied to a vso:Vehicle)."}})

(def apr
  "Annual percentage rate. Note: 7.5 % is encoded as \"7.5\"^^xsd:decimal, not \"0.075\"^^xsd:decimal."
  {:db/ident :auto-vc/apr,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "apr"},
   :rdfs/range :xsd/decimal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Annual percentage rate. Note: 7.5 % is encoded as \"7.5\"^^xsd:decimal, not \"0.075\"^^xsd:decimal."}})

(def availableChoice
  "This property links available Choices or Components to a Spec Item."
  {:db/ident :auto-vc/availableChoice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/SpecItemCollection,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "available choice"},
   :rdfs/range :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property links available Choices or Components to a Spec Item."}})

(def bodyStyle
  "Indicates the design and body style of the vehicle. Use DBPedia resources to indicate the features, if possible. Popular identifiers are http://dbpedia.org/resource/Convertible http://dbpedia.org/resource/Hatchback http://dbpedia.org/resource/Station_wagon http://dbpedia.org/resource/Sport_utility_vehicle http://dbpedia.org/resource/Roadster See also http://en.wikipedia.org/wiki/Car_body_styles. If you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:BodyStyleValue."
  {:db/ident :auto-vc/bodyStyle,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "body style"},
   :rdfs/range :auto-vc/BodyStyleValue,
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Car_body_styles"],
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "Indicates the design and body style of the vehicle. \n\nUse DBPedia resources to indicate the features, if possible. Popular identifiers are\n  http://dbpedia.org/resource/Convertible\n  http://dbpedia.org/resource/Hatchback\n  http://dbpedia.org/resource/Station_wagon\n  http://dbpedia.org/resource/Sport_utility_vehicle\n  http://dbpedia.org/resource/Roadster\n\nSee also http://en.wikipedia.org/wiki/Car_body_styles.\n\nIf you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:BodyStyleValue."}
    "Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.)."],
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "body type"}})

(def capCode
  "The CAP code"
  {:db/ident :auto-vc/capCode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Derivative,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cap code"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The CAP code"}})

(def cargoVolume
  "The available volume for cargo or luggage. For automobiles, this is usually the trunk volume. Typical unit code(s): LTR for liters, FTQ for cubic foot/feet Note: You can use minValue and maxValue to indicate ranges."
  {:db/ident :auto-vc/cargoVolume,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cargo volume"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.\n\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n\nNote: You can use minValue and maxValue to indicate ranges."})

(def carriedOutBy
  "The business or type of business that carried out the check, repair, maintenance, or modification"
  {:db/ident :auto-vc/carriedOutBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:auto-vc/Check
                               :auto-vc/DamageOrAccident
                               :auto-vc/ModificationOrMaintenance],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "carried out by"},
   :rdfs/range {:owl/unionOf [:auto-vc/BusinessEntity
                              :auto-vc/BusinessEntityType],
                :rdf/type    :owl/Class},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The business or type of business that carried out the check, repair, maintenance, or modification"}})

(def color
  "The color of the vehicle"
  {:db/ident :auto-vc/color,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "color"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The color of the vehicle"}})

(def compatibility
  "Links from a Derivative to information on whether a particular configuration is valid (true) or invalid (false)"
  {:db/ident :auto-vc/compatibility,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Derivative,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "compatibility"},
   :rdfs/range :auto-vc/ConfigurationInfo,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Links from a Derivative to information on whether a particular configuration is valid (true) or invalid (false)"}})

(def compatibleWith
  "Indicates that two Choices or Components are compatible with each other. Note: This property is symmetric, i.e., if A is compatible with B, then B is also compatible with A."
  {:db/ident :auto-vc/compatibleWith,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/domain :auto-vc/ChoiceOrComponent,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "compatible with"},
   :rdfs/range :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicates that two Choices or Components are compatible with each other.\n\nNote: This property is symmetric, i.e., if A is compatible with B, then B is also compatible with A."}})

(def condition
  "A textual description of the condition of the vehicle. This property should be mainly used with gr:ActualProductOrServiceInstance."
  {:db/ident :auto-vc/condition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "condition"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A textual description of the condition of the vehicle. This property should be mainly used with gr:ActualProductOrServiceInstance."}})

(def contains
  "A naive part-whole relation that allows providing more granular uco:OwnershipInfo data for a part of the duration of the ownership"
  {:db/ident :auto-vc/contains,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/OwnershipInfo,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contains"},
   :rdfs/range :auto-vc/OwnershipInfo,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A naive part-whole relation that allows providing more granular uco:OwnershipInfo data for a part of the duration of the ownership"}})

(def countryOfOrigin
  "The country or geo-political region in which the vehicle was initially sold officially, indicated as the two-character version of ISO 3166-1 (ISO 3166-1 alpha-2) for regions or ISO 3166-2, which breaks down the countries from ISO 3166-1 into administrative subdivisions."
  {:db/ident :auto-vc/countryOfOrigin,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "country of origin"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The country or geo-political region in which the vehicle was initially sold officially, indicated as the two-character version of ISO 3166-1 (ISO 3166-1 alpha-2) for regions or ISO 3166-2, which breaks down the countries from ISO 3166-1 into administrative subdivisions."}})

(def countryOfRegistration
  "The country or geo-political region in which the vehicle is currently registered, indicated as the two-character version of ISO 3166-1 (ISO 3166-1 alpha-2) for regions or ISO 3166-2, which breaks down the countries from ISO 3166-1 into administrative subdivisions."
  {:db/ident :auto-vc/countryOfRegistration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "country of registration"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The country or geo-political region in which the vehicle is currently registered, indicated as the two-character version of ISO 3166-1 (ISO 3166-1 alpha-2) for regions or ISO 3166-2, which breaks down the countries from ISO 3166-1 into administrative subdivisions."}})

(def credit
  "Indicates the credit for the financing"
  {:db/ident :auto-vc/credit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Indicates the credit for the financing"}})

(def currentLocation
  "The current location of the vehicle, i.e. where the car could be tested. For indicating alternative locations to which the seller is willing to bring the car, use gr:availableAtOrFrom attached to the gr:Offering, since those are aspects of the offer, not of the vehicle."
  {:db/ident :auto-vc/currentLocation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "current location"},
   :rdfs/range [:auto-mo/PostalAddress :auto-mo/Location],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The current location of the vehicle, i.e. where the car could be tested. For indicating alternative locations to which the seller is willing to bring the car, use gr:availableAtOrFrom attached to the gr:Offering, since those are aspects of the offer, not of the vehicle."}})

(def currentOwner
  "This property points to the current owner of the vehicle."
  {:db/ident :auto-vc/currentOwner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "current owner"},
   :rdfs/subPropertyOf :auto-vc/owner,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "This property points to the current owner of the vehicle."}})

(def customerCashPrice
  "Indicates the customer cash price for the financing"
  {:db/ident :auto-vc/customerCashPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "customer cash price"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates the customer cash price for the financing"}})

(def customerDeposit
  "Indicates the customer deposit for the financing"
  {:db/ident :auto-vc/customerDeposit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "customer deposit"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates the customer deposit for the financing"}})

(def cylinderTypeId
  "The Volkswagen-specific identifier for the cylinder type of a vehicle or engine"
  {:db/ident :auto-vc/cylinderTypeId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cylinder type id"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Volkswagen-specific identifier for the cylinder type of a vehicle or engine"}})

(def dateLaunched
  "The date of the official launch of the car model"
  {:db/ident :auto-vc/dateLaunched,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "date launched"},
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The date of the official launch of the car model"}})

(def dateVehicleFirstRegistered
  "The date of the first registration of the vehicle with the respective public authorities. This property should be used mainly with gr:ActualProductOrServiceInstance."
  {:db/ident :auto-vc/dateVehicleFirstRegistered,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "date vehicle first registered"},
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition
   ["The date of the first registration of the vehicle with the respective public authorities."
    {:rdf/language "en",
     :rdf/value
     "The date of the first registration of the vehicle with the respective public authorities. This property should be used mainly with gr:ActualProductOrServiceInstance."}]})

(def default
  "This property links the default Choice or Component to a Spec Item. Since it is defined a sub-property of coo:availableChoice, the default choice is automatically part of the available choices."
  {:db/ident :auto-vc/default,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "default"},
   :rdfs/subPropertyOf :auto-vc/availableChoice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property links the default Choice or Component to a Spec Item. \nSince it is defined a sub-property of coo:availableChoice, the default choice is automatically part of the available choices."}})

(def dependsOn
  "Links a Choice or Component to one or multiple other Choices Or Components required for that choice Note: This property is transitive, i.e., if B is required by A and C and D are required by B, then C and D are also required by A."
  {:db/ident :auto-vc/dependsOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/ChoiceOrComponent,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "depends on"},
   :rdfs/range :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Links a Choice or Component to one or multiple other Choices Or Components required for that choice  \n\nNote: This property is transitive, i.e., if B is required by A and C and D are required by B, then C and D are also required by A."}})

(def depositContribution
  "Indicates the deposit contribution for the financing"
  {:db/ident :auto-vc/depositContribution,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deposit contribution"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates the deposit contribution for the financing"}})

(def dhCode
  "The DH code"
  {:db/ident :auto-vc/dhCode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Derivative,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dh code"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The DH code"}})

(def discount
  "Indicates the discount for the financing"
  {:db/ident :auto-vc/discount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "discount"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Indicates the discount for the financing"}})

(def displayPos
  "The position at which the option or element should be listed in a menu or user dialog, lower numbers come first. The main usage of this property are coo:SpecItemCollection and coo:ChoiceOrComponent, but it is possible to apply it to any owl:Class. Note: It is recommended to rely on this property only for data originating from a single RDF graph; otherwise, unpredictable results are possible."
  {:db/ident :auto-vc/displayPos,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "display position"},
   :rdfs/range :xsd/int,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The position at which the option or element should be listed in a menu or user dialog, lower numbers come first.\nThe main usage of this property are coo:SpecItemCollection and coo:ChoiceOrComponent, but it is possible to apply it to any owl:Class.\n\nNote: It is recommended to rely on this property only for data originating from a single RDF graph; otherwise, unpredictable results are possible."}})

(def driveWheelConfiguration
  "The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain"
  {:db/ident :auto-vc/driveWheelConfiguration,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "drive wheel configuration"},
   :rdfs/range :auto-vc/DriveWheelConfigurationValue,
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Drive_wheel"],
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain"}
    "The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain."]})

(def driver
  "This property points to the driver or drivers that were regularly driving the vehicle during the respective period of time (when attached to uco:OwnershipInfo) or in total (when attached directly to a vso:Vehicle)."
  {:db/ident :auto-vc/driver,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driver"},
   :rdfs/range :auto-mo/Person,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property points to the driver or drivers that were regularly driving the vehicle during the respective period of time (when attached to uco:OwnershipInfo) or in total (when attached directly to a vso:Vehicle)."}})

(def emissionsCO2
  "The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put \"g/km\" into the unitText property of that value, since there is no UN/CEFACT Common Code for \"g/km\"."
  {:db/ident :auto-vc/emissionsCO2,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "emissions CO2"},
   :rdfs/range :xsd/float,
   :skos/definition
   "The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put \"g/km\" into the unitText property of that value, since there is no UN/CEFACT Common Code for \"g/km\"."})

(def emissionsPerPassenger
  "relates a vehicle to the amount of emissions it emits per passenger present in it during driving"
  {:db/ident :auto-vc/emissionsPerPassenger,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "emissions per passenger"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a vehicle to the amount of emissions it emits per passenger present in it during driving"}})

(def engineDisplacement
  "The volume swept by all of the pistons inside the cylinders of an internal combustion engine in a single movement. <br/><br/> Typical unit code(s): CMQ for cubic centimeter, LTR for liters, INQ for cubic inches * Note 1: You can link to information about how the given value has been determined using the <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a> property. * Note 2: You can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges."
  {:db/ident :auto-vc/engineDisplacement,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/EngineSpecification,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "engine displacement"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The volume swept by all of the pistons inside the cylinders of an internal combustion engine in a single movement. <br/><br/>\n\nTypical unit code(s): CMQ for cubic centimeter, LTR for liters, INQ for cubic inches\n* Note 1: You can link to information about how the given value has been determined using the <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a> property.\n* Note 2: You can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges."})

(def engineName
  "A short text indicating the engine(s) of the vehicle"
  {:db/ident :auto-vc/engineName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-mo/Object,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "engine name"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A short text indicating the engine(s) of the vehicle"}})

(def enginePower
  "The power of the vehicle's engine. Typical unit code(s): KWT for kilowatt, BHP for brake horsepower, N12 for metric horsepower (PS, with 1 PS = 735,49875 W)<br/><br/> <ul> <li>Note 1: There are many different ways of measuring an engine's power. For an overview, see <a href=\"http://en.wikipedia.org/wiki/Horsepower#Engine_power_test_codes\">http://en.wikipedia.org/wiki/Horsepower#Engine<em>power</em>test_codes</a>.</li> <li>Note 2: You can link to information about how the given value has been determined using the <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a> property.</li> <li>Note 3: You can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li> </ul>"
  {:db/ident :auto-vc/enginePower,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/EngineSpecification,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "engine power"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The power of the vehicle's engine.\n    Typical unit code(s): KWT for kilowatt, BHP for brake horsepower, N12 for metric horsepower (PS, with 1 PS = 735,49875 W)<br/><br/>\n\n<ul>\n<li>Note 1: There are many different ways of measuring an engine's power. For an overview, see  <a href=\"http://en.wikipedia.org/wiki/Horsepower#Engine_power_test_codes\">http://en.wikipedia.org/wiki/Horsepower#Engine<em>power</em>test_codes</a>.</li>\n<li>Note 2: You can link to information about how the given value has been determined using the <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a> property.</li>\n<li>Note 3: You can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li>\n</ul>"})

(def engineType
  "The type of engine or engines powering the vehicle. If there are multiple engines, simply attach this property multiple times. Use DBPedia resources to indicate the engine type. Popular identifiers are http://dbpedia.org/resource/Two-stroke_engine http://dbpedia.org/resource/Four-stroke_engine http://dbpedia.org/resource/Wankel_engine http://dbpedia.org/resource/Electric_motor If you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:EngineTypeValue."
  {:db/ident :auto-vc/engineType,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/EngineSpecification,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label ["engine type"
                {:rdf/language "en",
                 :rdf/value    "engine type"}],
   :rdfs/range :auto-vc/EngineTypeValue,
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "The type of engine or engines powering the vehicle. If there are multiple engines, simply attach this property multiple times.\n\nUse DBPedia resources to indicate the engine type. Popular identifiers are\n  http://dbpedia.org/resource/Two-stroke_engine\n  http://dbpedia.org/resource/Four-stroke_engine\n  http://dbpedia.org/resource/Wankel_engine\n  http://dbpedia.org/resource/Electric_motor\n\nIf you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:EngineTypeValue."}
    "The type of engine or engines powering the vehicle."]})

(def eventInformation
  "This property points to events related to the vehicle, like accidents and damages or major modifications or maintenance."
  {:db/ident :auto-vc/eventInformation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "event information"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property points to events related to the vehicle, like accidents and damages or major modifications or maintenance."}})

(def excessMileage
  "Indicates the rate for excess mileage"
  {:db/ident :auto-vc/excessMileage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "excess mileage"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Indicates the rate for excess mileage"}})

(def feature
  "Indicates a built-in feature, accessory, or component of the vehicle. Use DBPedia resources to indicate the features, if possible. Popular identifiers are http://dbpedia.org/resource/Anti-lock_braking_system http://dbpedia.org/resource/Electronic_stability_control http://dbpedia.org/resource/Armrest http://dbpedia.org/resource/Spoiler_%28automotive%29 http://dbpedia.org/resource/CD_Changer http://dbpedia.org/resource/Cup_holder http://dbpedia.org/resource/Tow_hitch http://dbpedia.org/resource/Power_window http://dbpedia.org/resource/Power_steering http://dbpedia.org/resource/Air_conditioner http://dbpedia.org/resource/Child_safety_lock http://dbpedia.org/resource/Parking_sensors See also http://en.wikipedia.org/wiki/Category:Automotive_accessories. If you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:FeatureValue."
  {:db/ident :auto-vc/feature,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "feature"},
   :rdfs/range :auto-mo/PropertyValue,
   :rdfs/seeAlso
   ["http://dbpedia.org/resource/Category:Automotive_accessories"
    "http://en.wikipedia.org/wiki/Category:Automotive_accessories"],
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "Indicates a built-in feature, accessory, or component of the vehicle.\n\nUse DBPedia resources to indicate the features, if possible. Popular identifiers are\n  http://dbpedia.org/resource/Anti-lock_braking_system\n  http://dbpedia.org/resource/Electronic_stability_control\n  http://dbpedia.org/resource/Armrest\n  http://dbpedia.org/resource/Spoiler_%28automotive%29\n  http://dbpedia.org/resource/CD_Changer\n  http://dbpedia.org/resource/Cup_holder\n  http://dbpedia.org/resource/Tow_hitch\n  http://dbpedia.org/resource/Power_window\n  http://dbpedia.org/resource/Power_steering\n  http://dbpedia.org/resource/Air_conditioner\n  http://dbpedia.org/resource/Child_safety_lock\n  http://dbpedia.org/resource/Parking_sensors\n\nSee also http://en.wikipedia.org/wiki/Category:Automotive_accessories.\n\nIf you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:FeatureValue."}
    {:rdf/language "en",
     :rdf/value
     "This property points to vehicle features in a semi-structured property-value form."}]})

(def featureOverride
  "Links a coo:ConfigurationInfo node to information on how a choice or component or the combination of multiple choices will override the regular properties of the resulting vehicle"
  {:db/ident :auto-vc/featureOverride,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:auto-vc/ChoiceOrComponent
                               :auto-vc/ConfigurationInfo],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "feature override"},
   :rdfs/range :auto-vc/PropertySpecification,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Links a coo:ConfigurationInfo node to information on how a choice or component or the combination of multiple choices will override the regular properties of the resulting vehicle"}})

(def finalPayment
  "Indicates the final payment for the financing"
  {:db/ident :auto-vc/finalPayment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "final payment"},
   :rdfs/range :xsd/decimal,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates the final payment for the financing"}})

(def finalPaymentFee
  "Indicates the final payment fee for the financing"
  {:db/ident :auto-vc/finalPaymentFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "final payment fee"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates the final payment fee for the financing"}})

(def firstMonthlyPaymentFee
  "Indicates the first monthly payment fee for the financing"
  {:db/ident :auto-vc/firstMonthlyPaymentFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "first monthly payment fee"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Indicates the first monthly payment fee for the financing"}})

(def from
  "This property indicates the beginning of the period of ownership represented by this uco:OwnershipInfo node."
  {:db/ident :auto-vc/from,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/OwnershipInfo,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "from"},
   :rdfs/range :xsd/dateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property indicates the beginning of the period of ownership represented by this uco:OwnershipInfo node."}})

(def fuelCapacity
  "The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, this should indicate the total of all storage of the same type.<br/><br/> Typical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles)."
  {:db/ident :auto-vc/fuelCapacity,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fuel capacity"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, this should indicate the total of all storage of the same type.<br/><br/>\n\nTypical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles)."})

(def fuelConsumption
  "The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L). Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use unitText to indicate the unit of measurement, e.g. mpg or km/L. Note 2: There are two ways of indicating the fuel consumption, fuelConsumption (e.g. 8 liters per 100 km) and fuelEfficiency (e.g. 30 miles per gallon). They are reciprocal. Note 3: Often, the absolute value is useful only when related to driving speed (\"at 80 km/h\") or usage pattern (\"city traffic\"). You can use valueReference to link the value for the fuel economy to another value. The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km). Note 1: There are unfortunately no standard unit codes for liters per 100 km. Use unitText to indicate the unit of measurement, e.g. L/100 km. Note 2: There are two ways of indicating the fuel consumption, fuelConsumption (e.g. 8 liters per 100 km) and fuelEfficiency (e.g. 30 miles per gallon). They are reciprocal. Note 3: Often, the absolute value is useful only when related to driving speed (\"at 80 km/h\") or usage pattern (\"city traffic\"). You can use valueReference to link the value for the fuel consumption to another value."
  {:db/ident :auto-vc/fuelConsumption,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fuel consumption"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   ["The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).\n\nNote 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use unitText to indicate the unit of measurement, e.g. mpg or km/L.\nNote 2: There are two ways of indicating the fuel consumption, fuelConsumption (e.g. 8 liters per 100 km) and fuelEfficiency (e.g. 30 miles per gallon). They are reciprocal.\nNote 3: Often, the absolute value is useful only when related to driving speed (\"at 80 km/h\") or usage pattern (\"city traffic\"). You can use valueReference to link the value for the fuel economy to another value."
    "The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).\n\nNote 1: There are unfortunately no standard unit codes for liters per 100 km. Use unitText to indicate the unit of measurement, e.g. L/100 km.\nNote 2: There are two ways of indicating the fuel consumption, fuelConsumption (e.g. 8 liters per 100 km) and fuelEfficiency (e.g. 30 miles per gallon). They are reciprocal.\nNote 3: Often, the absolute value is useful only when related to driving speed (\"at 80 km/h\") or usage pattern (\"city traffic\"). You can use valueReference to link the value for the fuel consumption to another value."],
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "fuel efficiency"}})

(def fuelInjectionTypeId
  "The Volkswagen-specific identifier for the fuel injection type of a vehicle or engine"
  {:db/ident :auto-vc/fuelInjectionTypeId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fuel injection type id"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Volkswagen-specific identifier for the fuel injection type of a vehicle or engine"}})

(def fuelType
  "The type of fuel suitable for the engine or engines of the vehicle. Use DBPedia resources to indicate the fuel type. Popular identifiers are http://dbpedia.org/resource/Gasoline http://dbpedia.org/resource/Diesel http://dbpedia.org/resource/Biodiesel http://dbpedia.org/resource/Kerosene For two-stroke mixtures, use vso:TwoStrokeMixture."
  {:db/ident :auto-vc/fuelType,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["http://purl.org/vso/ns"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fuel type"},
   :rdfs/range :auto-vc/FuelTypeValue,
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition
   ["The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle."
    {:rdf/language "en",
     :rdf/value
     "The type of fuel suitable for the engine or engines of the vehicle.\n\nUse DBPedia resources to indicate the fuel type. Popular identifiers are\n  http://dbpedia.org/resource/Gasoline\n  http://dbpedia.org/resource/Diesel\n  http://dbpedia.org/resource/Biodiesel\n  http://dbpedia.org/resource/Kerosene\n\nFor two-stroke mixtures, use vso:TwoStrokeMixture."}]})

(def gearbox
  "The gearbox type of the vehicle or vehicle model"
  {:db/ident :auto-vc/gearbox,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["http://purl.org/vvo/ns#"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gearbox"},
   :rdfs/range :auto-vc/GearboxTypeValue,
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Transmission_%28mechanics%29"
                  "http://dbpedia.org/page/Transmission_%28mechanics%29"],
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The gearbox type of the vehicle or vehicle model"}})

(def gearboxTypeId
  "The Volkswagen-specific gearbox type ID"
  {:db/ident :auto-vc/gearboxTypeId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gearbox type id"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The Volkswagen-specific gearbox type ID"}})

(def hasCompleteCarModel
  "Links one or multiple Complete Car Models to the underlying Derivative"
  {:db/ident :auto-vc/hasCompleteCarModel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Derivative,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has complete car model"},
   :rdfs/range :auto-vc/CompleteCarModel,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Links one or multiple Complete Car Models to the underlying Derivative"}})

(def hasDerivative
  "Links a Derivative to a Trim"
  {:db/ident :auto-vc/hasDerivative,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Trim,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has derivative"},
   :rdfs/range :auto-vc/Derivative,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Links a Derivative to a Trim"}})

(def hasElectricEnergyConsumtion
  "This property represents the electric energy consumption of a vehicle measured in Wh/km."
  {:db/ident :auto-vc/hasElectricEnergyConsumtion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has electric energy consumtion"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "This property represents the electric energy consumption of a vehicle measured in Wh/km."})

(def hasEmissionsReduction
  "This property represents emissions reduction measured in g/km that a vehicle has, through the implemented innovative technologies."
  {:db/ident :auto-vc/hasEmissionsReduction,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has emissions reduction"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "This property represents emissions reduction measured in g/km that a vehicle has, through the implemented innovative technologies."})

(def hasEngineCapacity
  "This property shows the capacity of the engine of a vehicle measured in cm3"
  {:db/ident :auto-vc/hasEngineCapacity,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has engine capacity"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "This property shows the capacity of the engine of a vehicle measured in cm3"})

(def hasFuelMode
  "This property represents the fuel mode of a vehicle"
  {:db/ident :auto-vc/hasFuelMode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has fuel mode"},
   :rdfs/range :rdfs/Literal,
   :skos/definition "This property represents the fuel mode of a vehicle"})

(def hasID
  "An annotation property that can be used to attach element identifiers from XML schemas for the corresponding XML data or schema."
  {:db/ident :auto-vc/hasID,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has ID"},
   :rdfs/range :xsd/string,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "An annotation property that can be used to attach element identifiers from XML schemas for the corresponding XML data or schema."}
    {:rdf/language "en",
     :rdf/value
     "An annotation property that can be used to attach element identifiers from XML schemas for the corresponding XML data or schema"}]})

(def hasInnovativeTechnology
  "This property represents an innovation technology that a vehicle has implemented."
  {:db/ident :auto-vc/hasInnovativeTechnology,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has innovative technology"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "This property represents an innovation technology that a vehicle has implemented."})

(def hasMSRegManufacturerName
  "This property represents a manufacturer name as in the registry of Member States of the European Environment Agency."
  {:db/ident :auto-vc/hasMSRegManufacturerName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has MSReg manufacturer name"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "This property represents a manufacturer name as in the registry of Member States of the European Environment Agency."})

(def hasManufacturerHarmonisedName
  "This property represents a manufacturer harmonised name."
  {:db/ident :auto-vc/hasManufacturerHarmonisedName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has manufacturer harmonised name"},
   :rdfs/range :rdfs/Literal,
   :skos/definition "This property represents a manufacturer harmonised name."})

(def hasManufacturerPooling
  "This property represents a manufacturers pooling."
  {:db/ident :auto-vc/hasManufacturerPooling,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has manufacturer pooling"},
   :rdfs/range :rdfs/Literal,
   :skos/definition "This property represents a manufacturers pooling."})

(def hasOtherAxleWidth
  "This property represents the width of the other steering axle of a vehicle measured in mm."
  {:db/ident :auto-vc/hasOtherAxleWidth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has other axle width"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "This property represents the width of the other steering axle of a vehicle measured in mm."})

(def hasOwnershipInfo
  "This property points to information about the current and previous owners of the vehicle."
  {:db/ident :auto-vc/hasOwnershipInfo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has ownership info"},
   :rdfs/range :auto-vc/OwnershipInfo,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property points to information about the current and previous owners of the vehicle."}})

(def hasSpecItemChoice
  "Links a Complete Car Model to the choices for configurational options"
  {:db/ident :auto-vc/hasSpecItemChoice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/CompleteCarModel,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has spec item choice"},
   :rdfs/range :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Links a Complete Car Model to the choices for configurational options"}})

(def hasSpecItems
  "This property links available Spec Items to a Derivative."
  {:db/ident :auto-vc/hasSpecItems,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Derivative,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has spec items"},
   :rdfs/range :auto-vc/SpecItemCollection,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "This property links available Spec Items to a Derivative."}})

(def hasSteeringAxleWidth
  "This property represents the width of the steering axle of a vehicle measured in mm."
  {:db/ident :auto-vc/hasSteeringAxleWidth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has steering axle width"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "This property represents the width of the steering axle of a vehicle measured in mm."})

(def hasTotalNewRegistrations
  "This property represents the nubmer of total new registration of a vehicle."
  {:db/ident :auto-vc/hasTotalNewRegistrations,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has total new registrations"},
   :rdfs/range :xsd/int,
   :skos/definition
   "This property represents the nubmer of total new registration of a vehicle."})

(def hasTrim
  "Links a Trim to Base Model"
  {:db/ident :auto-vc/hasTrim,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/BaseModel,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has trim"},
   :rdfs/range :auto-vc/Trim,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Links a Trim to Base Model"}})

(def hasTypeApprovalNumber
  "This property represents an internal type approval number."
  {:db/ident :auto-vc/hasTypeApprovalNumber,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has type approval number"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "This property represents an internal type approval number."})

(def height
  "The outer height of the vehicle. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges. Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"
  {:db/ident :auto-vc/height,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "height"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The outer height of the vehicle. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges.\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"}})

(def heightOpenTailgate
  "The outer height of the vehicle with the tailgate open. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges. Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"
  {:db/ident :auto-vc/heightOpenTailgate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "height open tailgate"},
   :rdfs/range :auto-mo/QuantitativeValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The outer height of the vehicle with the tailgate open. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges.\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "height open bonnet"}})

(def includes
  "Links a Choice or Component to one or multiple other Choices Or Components implicity contained Note: This property is transitive, i.e., if B is included in A and C and D are included in B, then C and D are also included in A."
  {:db/ident :auto-vc/includes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/ChoiceOrComponent,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "includes"},
   :rdfs/range :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Links a Choice or Component to one or multiple other Choices Or Components implicity contained\n\nNote: This property is transitive, i.e., if B is included in A and C and D are included in B, then C and D are also included in A."}})

(def includesChoices
  "Indicates the set of Choices Or Components to which the Configuration Info node refers Note 1: Complementing compatibility information can be attached to the components directly via coo:compatibleWith, coo:incompatibleWith, coo:dependsOn, and coo:includes. Note 2: The coo:ConfigurationInfo node makes only a valid statement for a configuration that includes ALL of the Choices or Components attached via this property. Note 3: If you want to know whether further components can be added, check that there are no coo:incompatibleWith relationships with any Choice or Component. This check must also be extended to all Choices or Components implicitly included via coo:includes. Note 4: If you want to know whether some components may be omitted without invalidating the configuration, check that there are no coo:dependsOn relationships with any Choice or Component. This check must also be extended to all Choices Or Components implicitly included via coo:includes. Note 5: Under an Open World Assumption (OWA), only an explicit compatibility statement for your configuration is really reliable. A weaker guarantee may be sufficient for your application, though."
  {:db/ident :auto-vc/includesChoices,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/ConfigurationInfo,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "includes choices"},
   :rdfs/range :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicates the set of Choices Or Components to which the Configuration Info node refers\n\nNote 1: Complementing compatibility information can be attached to the components directly via coo:compatibleWith, coo:incompatibleWith, coo:dependsOn, and coo:includes.\nNote 2: The coo:ConfigurationInfo node makes only a valid statement for a configuration that includes ALL of the Choices or Components attached via this property. \nNote 3: If you want to know whether further components can be added, check that there are no coo:incompatibleWith relationships with any Choice or Component. This check must also be extended to all Choices or Components implicitly included via coo:includes.\nNote 4: If you want to know whether some components may be omitted without invalidating the configuration, check that there are no coo:dependsOn relationships with any Choice or Component. This check must also be extended to all Choices Or Components implicitly included via coo:includes.\nNote 5: Under an Open World Assumption (OWA), only an explicit compatibility statement for your configuration is really reliable. A weaker guarantee may be sufficient for your application, though."}})

(def incompatibleWith
  "Indicates that two Choices or Components are incompatible with each other, independent from other choices. Note: This property is symmetric, i.e., if A is incompatible with B, then B is also incompatible with A."
  {:db/ident :auto-vc/incompatibleWith,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/domain :auto-vc/ChoiceOrComponent,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incompatible with"},
   :rdfs/range :auto-vc/ChoiceOrComponent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicates that two Choices or Components are incompatible with each other, independent from other choices.\n\nNote: This property is symmetric, i.e., if A is incompatible with B, then B is also incompatible with A."}})

(def indicationOfOdometerRollback
  "This property indicates whether it is likely or known that the odometer of the vehicle does not properly reflect the total mileage of the vehicle, e.g. because the odometer has been replaced, reset, or tampered with"
  {:db/ident :auto-vc/indicationOfOdometerRollback,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "indication of odometer rollback"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property indicates whether it is likely or known that the odometer of the vehicle does not properly reflect the total mileage of the vehicle, e.g. because the odometer has been replaced, reset, or tampered with"}})

(def inspected
  "This property points to inspections and certifications that the vehicle has undergone."
  {:db/ident :auto-vc/inspected,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inspected"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property points to inspections and certifications that the vehicle has undergone."}})

(def insuranceGroup
  "The insurance group code"
  {:db/ident :auto-vc/insuranceGroup,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/MotorizedRoadVehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "insurance group"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The insurance group code"}})

(def insuranceGroup50
  "The insurance group 50 code"
  {:db/ident :auto-vc/insuranceGroup50,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/MotorizedRoadVehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "insurance group 50"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The insurance group 50 code"}})

(def knownVehicleDamages
  "A textual description of known damages, both repaired and unrepaired. Note: This property should be used with gr:ActualProductOrServiceInstance (when offering a vehicle) or gr:ProductOrServicesSomeInstancesPlaceholder (when seeking a vehicle using gr:seeks) only."
  {:db/ident :auto-vc/knownVehicleDamages,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["http://purl.org/vso/ns"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "known vehicle damages"},
   :rdfs/range :xsd/string,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "A textual description of known damages, both repaired and unrepaired.\n\nNote: This property should be used with gr:ActualProductOrServiceInstance (when offering a vehicle) or gr:ProductOrServicesSomeInstancesPlaceholder (when seeking a vehicle using gr:seeks) only."}
    "A textual description of known damages, both repaired and unrepaired."]})

(def length
  "The outer length of the vehicle. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges. Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"
  {:db/ident :auto-vc/length,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "length"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The outer length of the vehicle. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges.\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"}})

(def licensePlate
  "The license plate string(s) assigned to the vehicle during the period of ownership"
  {:db/ident :auto-vc/licensePlate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/OwnershipInfo,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "license plate"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The license plate string(s) assigned to the vehicle during the period of ownership"}})

(def listPrice
  "The original list price of the new car at the time of production"
  {:db/ident :auto-vc/listPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "list price"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The original list price of the new car at the time of production"}})

(def luggageCapacitySeatsFolded
  "The available volume for cargo or luggage with the seats folded Typical unit code(s): LTR for liters, FTQ for cubic foot/feet Note: You can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges."
  {:db/ident :auto-vc/luggageCapacitySeatsFolded,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "luggage capacity seats folded"},
   :rdfs/subPropertyOf :auto-vc/cargoVolume,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The available volume for cargo or luggage with the seats folded\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n  \nNote: You can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges."}})

(def luggageCapacitySeatsUpright
  "The available volume for cargo or luggage with the seats upright Typical unit code(s): LTR for liters, FTQ for cubic foot/feet Note: You can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges."
  {:db/ident :auto-vc/luggageCapacitySeatsUpright,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "luggage capacity seats upright"},
   :rdfs/subPropertyOf :auto-vc/cargoVolume,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The available volume for cargo or luggage with the seats upright\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n  \nNote: You can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges."}})

(def mainLocation
  "The main location(s) of the vehicle during the period of ownership"
  {:db/ident :auto-vc/mainLocation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/OwnershipInfo,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "main location"},
   :rdfs/range [:auto-mo/PostalAddress :auto-mo/Location],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The main location(s) of the vehicle during the period of ownership"}})

(def manufacturerCode
  "The manufacturer code"
  {:db/ident :auto-vc/manufacturerCode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "manufacturer code"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The manufacturer code"}})

(def marketingName
  "The name of the object for marketing purposes"
  {:db/ident :auto-vc/marketingName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "marketing name"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The name of the object for marketing purposes"}})

(def max
  "The maximum number of coo:ChoiceOrComponent entities that can be selected for a valid configuration"
  {:db/ident :auto-vc/max,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/SpecItemCollection,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "max"},
   :rdfs/range :xsd/int,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The maximum number of coo:ChoiceOrComponent entities that can be selected for a valid configuration"}})

(def meetsEmissionStandard
  "Indicates that the vehicle meets the respective emission standard. Use DBPedia resources to indicate the standard, if possible. Popular identifiers are http://dbpedia.org/resource/Super_Ultra_Low_Emission_Vehicle http://dbpedia.org/resource/Partial_zero-emissions_vehicle See also http://en.wikipedia.org/wiki/Emissions_standard. Unfortunately, there are no DBPedia identifiers for the popular Euro 1 - Euro 5 standards available. If you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:EmissionStandardValue."
  {:db/ident :auto-vc/meetsEmissionStandard,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "meets emission standard"},
   :rdfs/range :auto-vc/EmissionStandardValue,
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Emissions_standard"],
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition
   ["Indicates that the vehicle meets the respective emission standard."
    {:rdf/language "en",
     :rdf/value
     "Indicates that the vehicle meets the respective emission standard. \n\nUse DBPedia resources to indicate the standard, if possible. Popular identifiers are\n  http://dbpedia.org/resource/Super_Ultra_Low_Emission_Vehicle\n  http://dbpedia.org/resource/Partial_zero-emissions_vehicle\n\nSee also http://en.wikipedia.org/wiki/Emissions_standard.\n\nUnfortunately, there are no DBPedia identifiers for the popular Euro 1 - Euro 5 standards available.\nIf you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:EmissionStandardValue."}]})

(def mileage
  "The mileage of the vehicle at the event, e.g. at the accident, maintenance, check, or modification. Typical unit code(s): KMT for kilometers, SMI for statute miles"
  {:db/ident :auto-vc/mileage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mileage"},
   :rdfs/range :auto-mo/QuantitativeValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The mileage of the vehicle at the event, e.g. at the accident, maintenance, check, or modification. \n\nTypical unit code(s): KMT for kilometers, SMI for statute miles"}})

(def mileageEnd
  "The mileage of the vehicle at the end of the period of ownership. Typical unit code(s): KMT for kilometers, SMI for statute miles"
  {:db/ident :auto-vc/mileageEnd,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/OwnershipInfo,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mileage end"},
   :rdfs/range :auto-mo/QuantitativeValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The mileage of the vehicle at the end of the period of ownership. \n\nTypical unit code(s): KMT for kilometers, SMI for statute miles"}})

(def mileageFromOdometer
  "The total distance travelled by the particular vehicle since its initial production, as read from its odometer. Typical unit code(s): KMT for kilometers, SMI for statute miles"
  {:db/ident :auto-vc/mileageFromOdometer,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mileage from odometer"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The total distance travelled by the particular vehicle since its initial production, as read from its odometer.\n\nTypical unit code(s): KMT for kilometers, SMI for statute miles"})

(def mileageInitial
  "The mileage of the vehicle at the beginning of the period of ownership. Typical unit code(s): KMT for kilometers, SMI for statute miles"
  {:db/ident :auto-vc/mileageInitial,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/OwnershipInfo,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mileage initial"},
   :rdfs/range :auto-mo/QuantitativeValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The mileage of the vehicle at the beginning of the period of ownership. \n\nTypical unit code(s): KMT for kilometers, SMI for statute miles"}})

(def min
  "The minimum number of coo:ChoiceOrComponent entities that must be selected for a valid configuration"
  {:db/ident :auto-vc/min,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/SpecItemCollection,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "min"},
   :rdfs/range :xsd/int,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The minimum number of coo:ChoiceOrComponent entities that must be selected for a valid configuration"}})

(def monthlyPayment
  "Indicates the monthly payment for the financing"
  {:db/ident :auto-vc/monthlyPayment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "monthly payment"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates the monthly payment for the financing"}})

(def noOfMonthlyPayments
  "The number of monthly payments"
  {:db/ident :auto-vc/noOfMonthlyPayments,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number of monthly payments"},
   :rdfs/range :xsd/decimal,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The number of monthly payments"}})

(def notAtFaultAccident
  "This property indicates whether the accident leading to the damage was a not-at-fault accident from the perspective of the owner."
  {:db/ident :auto-vc/notAtFaultAccident,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/DamageOrAccident,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "not-at-fault accident"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property indicates whether the accident leading to the damage was a not-at-fault accident from the perspective of the owner."}})

(def numberOfAirbags
  "The number or type of airbags in the vehicle."
  {:db/ident :auto-vc/numberOfAirbags,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number of airbags"},
   :rdfs/range {:owl/unionOf [:xsd/decimal :xsd/string],
                :rdf/type    :rdfs/Datatype},
   :skos/definition "The number or type of airbags in the vehicle."})

(def numberOfAxles
  "The number of axles. Typical unit code(s): C62"
  {:db/ident :auto-vc/numberOfAxles,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number of axles"},
   :rdfs/range :auto-mo/QuantitativeValueInteger,
   :skos/definition "The number of axles.\n\nTypical unit code(s): C62"})

(def numberOfDoors
  "The number of doors. Typical unit code(s): C62"
  {:db/ident :auto-vc/numberOfDoors,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number of doors"},
   :rdfs/range :xsd/decimal,
   :skos/definition "The number of doors.\n\nTypical unit code(s): C62"})

(def numberOfDrivers
  "The number of people who were/are regularly driving the vehicle in the respective period of time (when attached to uco:OwnershipInfo) or in total (when directly applied to a vso:Vehicle)"
  {:db/ident :auto-vc/numberOfDrivers,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:auto-vc/OwnershipInfo :auto-vc/Vehicle],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number of drivers"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The number of people who were/are regularly driving the vehicle in the respective period of time (when attached to uco:OwnershipInfo) or in total (when directly applied to a vso:Vehicle)"}})

(def numberOfForwardGears
  "The total number of forward gears available for the transmission system of the vehicle. Typical unit code(s): C62"
  {:db/ident :auto-vc/numberOfForwardGears,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number of forward gears"},
   :rdfs/range :auto-mo/QuantitativeValueInteger,
   :skos/definition
   "The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62"})

(def numberOfOwners
  "The total number of people or organizations who owned the vehicle, including the current owner. Note that this value can be higher (but not lower) than the number of uco:OwnershipInfo nodes, since those records may be incomplete."
  {:db/ident :auto-vc/numberOfOwners,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number of owners"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The total number of people or organizations who owned the vehicle, including the current owner.\n\nNote that this value can be higher (but not lower) than the number of uco:OwnershipInfo nodes, since those records may be incomplete."}})

(def numberOfPassengers
  "relates a vehicle to the number of passengers it contains"
  {:db/ident :auto-vc/numberOfPassengers,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has number of passengers"},
   :rdfs/range :xsd/int,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "relates a vehicle to the number of passengers it contains"}})

(def offerPromoCode
  "The code for a promotional offer"
  {:db/ident :auto-vc/offerPromoCode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Offering,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "offer promo code"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The code for a promotional offer"}})

(def originalPartsOnly
  "This indicates whether the parts used for repairing a damage, for a maintenance task, or a modification were all original."
  {:db/ident :auto-vc/originalPartsOnly,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:auto-vc/DamageOrAccident
                               :auto-vc/ModificationOrMaintenance],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "original parts only"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This indicates whether the parts used for repairing a damage, for a maintenance task, or a modification were all original."}})

(def otrRetailPrice
  "Indicates the OTR retail price for the financing"
  {:db/ident :auto-vc/otrRetailPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "otr retail price"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates the OTR retail price for the financing"}})

(def owner
  "This property points to the owner of the vehicle for the respective period of time, as indicated by the uco:OwnershipInfo node."
  {:db/ident :auto-vc/owner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain [:auto-vc/Vehicle :auto-vc/OwnershipInfo],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "owner"},
   :rdfs/range :auto-vc/BusinessEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property points to the owner of the vehicle for the respective period of time, as indicated by the uco:OwnershipInfo node."}})

(def parking
  "The main type(s) of parking that have been used for the vehicle during the period of ownership (if attached to uco:OwnershipInfo) or in general (if attached to the vso:Vehicle directly)"
  {:db/ident :auto-vc/parking,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain [:auto-vc/Vehicle :auto-vc/OwnershipInfo],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parking"},
   :rdfs/range :auto-vc/ParkingType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The main type(s) of parking that have been used for the vehicle during the period of ownership (if attached to uco:OwnershipInfo) or in general (if attached to the vso:Vehicle directly)"}})

(def partAdded
  "A textual description of the part or parts added in the modification (e.g. tuning) or maintenance task"
  {:db/ident :auto-vc/partAdded,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/ModificationOrMaintenance,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "part added"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A textual description of the part or parts added in the modification (e.g. tuning) or maintenance task"}})

(def partRemoved
  "A textual description of the part or parts removed in the modification (e.g. tuning) or maintenance task"
  {:db/ident :auto-vc/partRemoved,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/ModificationOrMaintenance,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "part removed"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A textual description of the part or parts removed in the modification (e.g. tuning) or maintenance task"}})

(def partReplaced
  "A textual description of the part or parts replaced in the modification (e.g. tuning) or maintenance (e.g. new engine) task"
  {:db/ident :auto-vc/partReplaced,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/ModificationOrMaintenance,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "part replaced"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A textual description of the part or parts replaced in the modification (e.g. tuning) or maintenance (e.g. new engine) task"}})

(def payload
  "The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.<br/><br/> Typical unit code(s): KGM for kilogram, LBR for pound<br/><br/> <ul> <li>Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of <a class=\"localLink\" href=\"http://schema.org/weight\">weight</a> and <a class=\"localLink\" href=\"http://schema.org/payload\">payload</a></li> <li>Note 2: You can indicate additional information in the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> node.</li> <li>Note 3: You may also link to a <a class=\"localLink\" href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that provides additional information using <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a>.</li> <li>Note 4: Note that you can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li> </ul>"
  {:db/ident :auto-vc/payload,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payload"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.<br/><br/>\n\nTypical unit code(s): KGM for kilogram, LBR for pound<br/><br/>\n\n<ul>\n<li>Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of <a class=\"localLink\" href=\"http://schema.org/weight\">weight</a> and <a class=\"localLink\" href=\"http://schema.org/payload\">payload</a></li>\n<li>Note 2: You can indicate additional information in the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> node.</li>\n<li>Note 3: You may also link to a <a class=\"localLink\" href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that provides additional information using <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a>.</li>\n<li>Note 4: Note that you can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li>\n</ul>"})

(def pets
  "The type(s) of animals that have been transported in the vehicle during the period of ownership (if attached to uco:OwnershipInfo) or in general (if attached to the vso:Vehicle directly). If possible, use DBPedia URIs, e.g. http://dbpedia.org/resource/Dog."
  {:db/ident :auto-vc/pets,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain [:auto-vc/Vehicle :auto-vc/OwnershipInfo],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pets"},
   :rdfs/range :auto-vc/Species,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The type(s) of animals that have been transported in the vehicle during the period of ownership (if attached to uco:OwnershipInfo) or in general (if attached to the vso:Vehicle directly). \n  \nIf possible, use DBPedia URIs, e.g. http://dbpedia.org/resource/Dog."}})

(def priceModifier
  "Links a coo:ConfigurationInfo node to information on a choice or component or the combination of multiple choices will affect the regular pricing of the resulting vehicle Note: The use of gr:addOn is in general a better way of modeling surcharges"
  {:db/ident :auto-vc/priceModifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "price modiﬁer"},
   :rdfs/range :auto-vc/RelativePriceSpecification,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Links a coo:ConfigurationInfo node to information on a choice or component or the combination of multiple choices will affect the regular pricing of the resulting vehicle\n\nNote: The use of gr:addOn is in general a better way of modeling surcharges"}})

(def productCode
  "The Volkswagen-specific product code for the vehicle model, choice, component, spare part, or service"
  {:db/ident :auto-vc/productCode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "product code"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Volkswagen-specific product code for the vehicle model, choice, component, spare part, or service"}})

(def productionDate
  "The date of production of the vehicle. This property should be used mainly with gr:ActualProductOrServiceInstance."
  {:db/ident :auto-vc/productionDate,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "production date"},
   :rdfs/range :xsd/dateTime,
   :skos/definition
   ["The date of production of the item, e.g. vehicle."
    {:rdf/language "en",
     :rdf/value
     "The date of production of the vehicle. This property should be used mainly with gr:ActualProductOrServiceInstance."}]})

(def propertyID
  "A global identifier, e.g. a URI, a prefixed string, or any other identifier that can be used to refer to a standardized property type"
  {:db/ident :auto-vc/propertyID,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-mo/PropertyValue,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "property ID"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A global identifier, e.g. a URI, a prefixed string, or any other identifier that can be used to refer to a standardized property type"}})

(def propertyName
  "The name of the property"
  {:db/ident :auto-vc/propertyName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-mo/PropertyValue,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "property name"},
   :rdfs/range :rdfs/Literal,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The name of the property"}})

(def propertyValue
  "The value of of the property"
  {:db/ident :auto-vc/propertyValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-mo/PropertyValue,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "property value"},
   :rdfs/range :rdfs/Literal,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The value of of the property"}})

(def purchaseDate
  "The date the item e.g. vehicle was purchased by the current owner."
  {:db/ident :auto-vc/purchaseDate,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "purchase date"},
   :rdfs/range :xsd/dateTime,
   :skos/definition
   "The date the item e.g. vehicle was purchased by the current owner."})

(def referenceDistance
  "The distance to which a vso:fuelConsumption value refers"
  {:db/ident :auto-vc/referenceDistance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-mo/QuantitativeValueFloat,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reference distance"},
   :rdfs/range :auto-mo/QuantitativeValue,
   :rdfs/subPropertyOf :auto-mo/valueReference,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The distance to which a vso:fuelConsumption value refers"}})

(def referenceFuelQuantity
  "The quantity of fuel to which a vso:fuelEconomy value refers"
  {:db/ident :auto-vc/referenceFuelQuantity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-mo/QuantitativeValueFloat,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reference fuel quantity"},
   :rdfs/range :auto-vc/FuelQuantity,
   :rdfs/subPropertyOf :auto-mo/valueReference,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "The quantity of fuel to which a vso:fuelEconomy value refers"}})

(def referenceSpeeds
  "The interval of initial and target speed to which a vso:acceleration value refers"
  {:db/ident :auto-vc/referenceSpeeds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-mo/QuantitativeValueFloat,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reference speeds"},
   :rdfs/range :auto-vc/SpeedInterval,
   :rdfs/subPropertyOf :auto-mo/valueReference,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The interval of initial and target speed to which a vso:acceleration value refers"}})

(def refersToTrafficPattern
  "Indicates the traffic pattern to which the vso:fuelEconomy or vso:fuelConsumption value refers"
  {:db/ident :auto-vc/refersToTrafficPattern,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-mo/QuantitativeValue,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "refers to traffic pattern"},
   :rdfs/range :auto-vc/TrafficPattern,
   :rdfs/subPropertyOf :auto-mo/valueReference,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicates the traffic pattern to which the vso:fuelEconomy or vso:fuelConsumption value refers"}})

(def rentalUsage
  "Indicates whether the vehicle has been used for commercial rental. The legislation in many countries requires this information to be revealed when offering a car for sale. Note 1: This property should be used with gr:ActualProductOrServiceInstance (when offering a vehicle) or gr:ProductOrServicesSomeInstancesPlaceholder (when seeking a vehicle using gr:seeks) only. Note 2: This property is relevant mainly for offers to SELL the vehicle (gr:hasBusinessFunction gr:Sell)."
  {:db/ident :auto-vc/rentalUsage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rental usage"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicates whether the vehicle has been used for commercial rental. The legislation in many countries requires this information to be revealed when offering a car for sale. \n\nNote 1: This property should be used with gr:ActualProductOrServiceInstance (when offering a vehicle) or gr:ProductOrServicesSomeInstancesPlaceholder (when seeking a vehicle using gr:seeks) only.\nNote 2: This property is relevant mainly for offers to SELL the vehicle (gr:hasBusinessFunction gr:Sell)."}})

(def repaired
  "This indicates whether damages resulting from a certain uco:DamageOrAccident (when attached to this type) or all damages (when directly attached to a vso:Vehicle) have been properly repaired. Do not use this propery on a vso:Vehicle if it never had a damage."
  {:db/ident :auto-vc/repaired,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:auto-vc/DamageOrAccident :auto-vc/Vehicle],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "repaired"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This indicates whether damages resulting from a certain uco:DamageOrAccident (when attached to this type) or all damages (when directly attached to a vso:Vehicle) have been properly repaired. Do not use this propery on a vso:Vehicle if it never had a damage."}})

(def roofLoad
  "The permitted total weight of cargo and installations (e.g. a roof rack) on top of the vehicle.<br/><br/> Typical unit code(s): KGM for kilogram, LBR for pound<br/><br/> <ul> <li>Note 1: You can indicate additional information in the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> node.</li> <li>Note 2: You may also link to a <a class=\"localLink\" href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that provides additional information using <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a></li> <li>Note 3: Note that you can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li> </ul>"
  {:db/ident :auto-vc/roofLoad,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "roof load"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The permitted total weight of cargo and installations (e.g. a roof rack) on top of the vehicle.<br/><br/>\n\nTypical unit code(s): KGM for kilogram, LBR for pound<br/><br/>\n\n<ul>\n<li>Note 1: You can indicate additional information in the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> node.</li>\n<li>Note 2: You may also link to a <a class=\"localLink\" href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that provides additional information using <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a></li>\n<li>Note 3: Note that you can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li>\n</ul>"})

(def rotationalSpeedReference
  "The rotational speed to which a vvo:torque or vso:enginePower value refers Typical unit code(s): RPM for revolutions per minute or RPS for revolutions per second"
  {:db/ident :auto-vc/rotationalSpeedReference,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-mo/QuantitativeValue,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rotational speed reference"},
   :rdfs/range :auto-mo/QuantitativeValue,
   :rdfs/subPropertyOf :auto-mo/valueReference,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The rotational speed to which a vvo:torque or vso:enginePower value refers\nTypical unit code(s): RPM for revolutions per minute or RPS for revolutions per second"}})

(def scrappageContribution
  "Indicates the scrappage contribution for the financing"
  {:db/ident :auto-vc/scrappageContribution,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "scrappage contribution"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates the scrappage contribution for the financing"}})

(def seatingCapacity
  "The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law. Typical unit code(s): C62 for persons. The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.<br/><br/> Typical unit code(s): C62 for persons"
  {:db/ident :auto-vc/seatingCapacity,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seating capacity"},
   :rdfs/range :auto-mo/QuantitativeValueInteger,
   :skos/definition
   ["The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons."
    "The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.<br/><br/>\n\nTypical unit code(s): C62 for persons"],
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "vehicle seating capacity"}})

(def serialNumber
  "relates a vehicle to its serial number"
  {:db/ident :auto-vc/serialNumber,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "serial number",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a vehicle to its serial number"}})

(def shortSubtitle
  "The short subtitle for a vehicle, component, offer, or financing option"
  {:db/ident :auto-vc/shortSubtitle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain
   {:owl/unionOf [:auto-vc/Financing :auto-vc/Offering :auto-vc/Vehicle],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "short subtitle"},
   :rdfs/range :rdf/PlainLiteral,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The short subtitle for a vehicle, component, offer, or financing option"}})

(def shortTitle
  "The short title for a vehicle, component, offer, or financing option"
  {:db/ident :auto-vc/shortTitle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain
   {:owl/unionOf [:auto-vc/Financing :auto-vc/Offering :auto-vc/Vehicle],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "short title"},
   :rdfs/range :rdf/PlainLiteral,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The short title for a vehicle, component, offer, or financing option"}})

(def smoking
  "This property indicates whether it has been smoked inside the car in the respective period of time (when attached to uco:OwnershipInfo) or ever (when directly applied to a vso:Vehicle)."
  {:db/ident :auto-vc/smoking,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:auto-vc/OwnershipInfo :auto-vc/Vehicle],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "smoking"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property indicates whether it has been smoked inside the car in the respective period of time (when attached to uco:OwnershipInfo) or ever (when directly applied to a vso:Vehicle)."}})

(def speed
  "The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range (indicated by <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> should be the maximum speed achievable under regular conditions.<br/><br/> Typical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot<br/><br/> *Note 1: Use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate the range. Typically, the minimal value is zero. * Note 2: There are many different ways of measuring the speed range. You can link to information about how the given value has been determined using the <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a> property."
  {:db/ident :auto-vc/speed,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range (indicated by <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> should be the maximum speed achievable under regular conditions.<br/><br/>\n\nTypical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot<br/><br/>\n\n*Note 1: Use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate the range. Typically, the minimal value is zero.\n* Note 2: There are many different ways of measuring the speed range. You can link to information about how the given value has been determined using the <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a> property."})

(def steeringPosition
  "The position of the steering wheel or similar device (mostly for cars)"
  {:db/ident :auto-vc/steeringPosition,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["http://purl.org/vso/ns"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "steering position"},
   :rdfs/range :auto-vc/SteeringPositionValue,
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition
   ["The position of the steering wheel or similar device (mostly for cars)."
    {:rdf/language "en",
     :rdf/value
     "The position of the steering wheel or similar device (mostly for cars)"}]})

(def structuralDamage
  "This property indicates whether the vehicle has suffered from structural damage in the respective accident (when attached to uco:DamageOrAccident) or ever (when directly applied to a vso:Vehicle)."
  {:db/ident :auto-vc/structuralDamage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:auto-vc/DamageOrAccident :auto-vc/Vehicle],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "structural damage"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property indicates whether the vehicle has suffered from structural damage in the respective accident (when attached to uco:DamageOrAccident) or ever (when directly applied to a vso:Vehicle)."}})

(def subtitle
  "The subtitle for a vehicle, component, offer, or financing option"
  {:db/ident :auto-vc/subtitle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain
   {:owl/unionOf [:auto-vc/Financing :auto-vc/Offering :auto-vc/Vehicle],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subtitle"},
   :rdfs/range :rdf/PlainLiteral,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The subtitle for a vehicle, component, offer, or financing option"}})

(def termsAndConditions
  "Terms and conditions of the service, offer, or financing option"
  {:db/ident :auto-vc/termsAndConditions,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain
   {:owl/unionOf [:auto-vc/Financing :auto-vc/Offering :auto-vc/Vehicle],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "terms and conditions"},
   :rdfs/range :rdf/PlainLiteral,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Terms and conditions of the service, offer, or financing option"}})

(def to
  "This property indicates the end of the period of ownership represented by this uco:OwnershipInfo node."
  {:db/ident :auto-vc/to,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/OwnershipInfo,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "to"},
   :rdfs/range :xsd/dateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property indicates the end of the period of ownership represented by this uco:OwnershipInfo node."}})

(def torque
  "The torque (turning force) of an engine Typical unit code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for pound-force per inch"
  {:db/ident :auto-vc/torque,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/EngineSpecification,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "torque"},
   :rdfs/range :auto-mo/QuantitativeValue,
   :skos/definition
   ["The torque (turning force) of the vehicle's engine.<br/><br/>\n\nTypical unit code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for pound-force per inch<br/><br/>\n\n<ul>\n<li>Note 1: You can link to information about how the given value has been determined (e.g. reference RPM) using the <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a> property.</li>\n<li>Note 2: You can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li>\n</ul>"
    {:rdf/language "en",
     :rdf/value
     "The torque (turning force) of an engine\nTypical unit code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for pound-force per inch"}]})

(def totalPayable
  "Indicates the total payable for the financing"
  {:db/ident :auto-vc/totalPayable,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Financing,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "total payable"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates the total payable for the financing"}})

(def trailerWeight
  "The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR)<br/><br/> Typical unit code(s): KGM for kilogram, LBR for pound<br/><br/> <ul> <li>Note 1: You can indicate additional information in the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> node.</li> <li>Note 2: You may also link to a <a class=\"localLink\" href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that provides additional information using <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a>.</li> <li>Note 3: Note that you can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li> </ul> The permitted weight of a trailer attached to the vehicle. Typical unit code(s): KGM for kilogram, LBR for pound Note 1: You can indicate additional information in the name of the QuantitativeValue node. Note 2: You may also link to a QualitativeValue node that provides additional information using valueReference. Note 3: Note that you can use minValue and maxValue to indicate ranges."
  {:db/ident :auto-vc/trailerWeight,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trailer weight"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   ["The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR)<br/><br/>\n\nTypical unit code(s): KGM for kilogram, LBR for pound<br/><br/>\n\n<ul>\n<li>Note 1: You can indicate additional information in the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> node.</li>\n<li>Note 2: You may also link to a <a class=\"localLink\" href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that provides additional information using <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a>.</li>\n<li>Note 3: Note that you can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li>\n</ul>"
    "The permitted weight of a trailer attached to the vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\nNote 1: You can indicate additional information in the name of the QuantitativeValue node. \n\nNote 2: You may also link to a QualitativeValue node that provides additional information using valueReference. \n\nNote 3: Note that you can use minValue and maxValue to indicate ranges."],
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   {:rdf/language "en",
    :rdf/value    "tongue weight"}})

(def transmission
  "The type of component used for transmitting the power from a rotating power source to the wheels or propeller(s) (\"gearbox\" for cars). Use DBPedia resources to indicate the transmission type, if possible. Popular identifiers are http://dbpedia.org/resource/Manual_transmission http://dbpedia.org/resource/Automatic_transmission If you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:TransmissionTypeValue."
  {:db/ident :auto-vc/transmission,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transmission"},
   :rdfs/range :auto-vc/TransmissionTypeValue,
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Transmission_%28mechanics%29"
                  "http://dbpedia.org/page/Transmission_%28mechanics%29"],
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The type of component used for transmitting the power from a rotating power source to the wheels or propeller(s) (\"gearbox\" for cars).\n\nUse DBPedia resources to indicate the transmission type, if possible. Popular identifiers are\n  http://dbpedia.org/resource/Manual_transmission\n  http://dbpedia.org/resource/Automatic_transmission\n\nIf you cannot find a suitable identifier in DBPedia, define your own as an instance of vso:TransmissionTypeValue."}})

(def type
  "This property represents an internal type of vehicle."
  {:db/ident :auto-vc/type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Car,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "type",
   :rdfs/range :rdfs/Literal,
   :skos/definition "This property represents an internal type of vehicle."})

(def unitCode
  "A UN/CEFACT Common Code for indicating the unit of measurement of the value, if available"
  {:db/ident :auto-vc/unitCode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-mo/PropertyValue,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unit code"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A UN/CEFACT Common Code for indicating the unit of measurement of the value, if available"}})

(def unitText
  "A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for uco:unitCode."
  {:db/ident :auto-vc/unitText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-mo/PropertyValue,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unit text"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for uco:unitCode."}})

(def usage
  "The type(s) of usage during the period of ownership (if attached to uco:OwnershipInfo) or in general (if attached to the vso:Vehicle directly)"
  {:db/ident :auto-vc/usage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain [:auto-vc/Vehicle :auto-vc/OwnershipInfo],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "usage"},
   :rdfs/range :auto-vc/CarUsageType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The type(s) of usage during the period of ownership (if attached to uco:OwnershipInfo) or in general (if attached to the vso:Vehicle directly)"}})

(def valid
  "Indicates whether the attached set of choices is a valid (true) or invalid (false) configuration for the Derivative"
  {:db/ident :auto-vc/valid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/ConfigurationInfo,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/coo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valid"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicates whether the attached set of choices is a valid (true) or invalid (false) configuration for the Derivative"}})

(def validFrom
  "This property indicates the beginning of the validity of the inspection represented by the uco:Check node. This is typically the day of the inspection."
  {:db/ident :auto-vc/validFrom,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Check,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valid from"},
   :rdfs/range :xsd/dateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property indicates the beginning of the validity of the inspection represented by the uco:Check node. This is typically the day of the inspection."}})

(def validThrough
  "This property indicates the end of the validity of the inspection represented by the uco:Check node. This is typically the day of the inspection plus one (UK MOT) or two years (e.g. German TÜV)."
  {:db/ident :auto-vc/validThrough,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Check,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valid to"},
   :rdfs/range :xsd/dateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property indicates the end of the validity of the inspection represented by the uco:Check node. This is typically the day of the inspection plus one (UK MOT) or two years (e.g. German TÜV)."}})

(def valuation
  "The market price assessment gained by the respective valuation. Use gr:name to indicate the name of the valuation service."
  {:db/ident :auto-vc/valuation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/uco/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valuation"},
   :rdfs/range :auto-vc/PriceSpecification,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The market price assessment gained by the respective valuation. Use gr:name to indicate the name of the valuation service."}})

(def variant
  "This property represents an internal variant code."
  {:db/ident :auto-vc/variant,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "variant",
   :rdfs/range :rdfs/Literal,
   :skos/definition "This property represents an internal variant code."})

(def vehicleConfiguration
  "A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'."
  {:db/ident :auto-vc/vehicleConfiguration,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle configuration"},
   :rdfs/range :xsd/string,
   :skos/definition
   "A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'."})

(def vehicleEngine
  "Information about the engine or engines of the vehicle."
  {:db/ident :auto-vc/vehicleEngine,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle engine"},
   :rdfs/range :auto-vc/EngineSpecification,
   :skos/definition "Information about the engine or engines of the vehicle."})

(def vehicleIdentificationNumber
  "A unique serial number used by the automotive industry to identify individual motor vehicles"
  {:db/ident :auto-vc/vehicleIdentificationNumber,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["http://purl.org/vso/ns"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle identification number"},
   :rdfs/range :xsd/string,
   :rdfs/seeAlso ["http://en.wikipedia.org/wiki/Vehicle_Identification_Number"
                  "http://dbpedia.org/resource/Vehicle_Identification_Number"],
   :rdfs/subPropertyOf :auto-vc/serialNumber,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "A unique serial number used by the automotive industry to identify individual motor vehicles"}
    "The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles."],
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/abbreviation"
   "VIN",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/synonym"
   [{:rdf/language "en",
     :rdf/value    "Vehicle Identification Number"}
    {:rdf/language "en",
     :rdf/value    "VIN"}]})

(def vehicleInteriorColor
  "The color or color combination of the interior of the vehicle."
  {:db/ident :auto-vc/vehicleInteriorColor,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle interior color"},
   :rdfs/range :xsd/string,
   :skos/definition
   "The color or color combination of the interior of the vehicle."})

(def vehicleInteriorType
  "The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience."
  {:db/ident :auto-vc/vehicleInteriorType,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle interior type"},
   :rdfs/range :xsd/string,
   :skos/definition
   "The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience."})

(def vehicleModelDate
  "The release date of a vehicle model (often used to differentiate versions of the same make and model)"
  {:db/ident :auto-vc/vehicleModelDate,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle model date"},
   :rdfs/range :xsd/dateTime,
   :skos/definition
   ["The release date of a vehicle model (often used to differentiate versions of the same make and model)."
    {:rdf/language "en",
     :rdf/value
     "The release date of a vehicle model (often used to differentiate versions of the same make and model)"}]})

(def vehicleSpecialUsage
  "Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale."
  {:db/ident :auto-vc/vehicleSpecialUsage,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle special usage"},
   :skos/definition
   "Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale."})

(def vehicleTransmission
  "The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (\"gearbox\" for cars)."
  {:db/ident :auto-vc/vehicleTransmission,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle transmission"},
   :rdfs/range {:owl/unionOf [:auto-mo/QualitativeValue :auto-mo/TextValue],
                :rdf/type    :owl/Class},
   :skos/definition
   "The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) (\"gearbox\" for cars)."})

(def vehicleTypeApprovedCategory
  "This property represents a category of the approved vehicle type."
  {:db/ident :auto-vc/vehicleTypeApprovedCategory,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "vehicle type approved category",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "This property represents a category of the approved vehicle type."})

(def version
  "This property represents an internal version code of a vehicle."
  {:db/ident :auto-vc/version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label "version",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   "This property represents an internal version code of a vehicle."})

(def weightTotal
  "The permitted total weight of the loaded vehicle, including passengers and cargo and the weight of the empty vehicle.<br/><br/> Typical unit code(s): KGM for kilogram, LBR for pound<br/><br/> <ul> <li>Note 1: You can indicate additional information in the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> node.</li> <li>Note 2: You may also link to a <a class=\"localLink\" href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that provides additional information using <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a>.</li> <li>Note 3: Note that you can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li> </ul>"
  {:db/ident :auto-vc/weightTotal,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "weight total"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The permitted total weight of the loaded vehicle, including passengers and cargo and the weight of the empty vehicle.<br/><br/>\n\nTypical unit code(s): KGM for kilogram, LBR for pound<br/><br/>\n\n<ul>\n<li>Note 1: You can indicate additional information in the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> node.</li>\n<li>Note 2: You may also link to a <a class=\"localLink\" href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that provides additional information using <a class=\"localLink\" href=\"http://schema.org/valueReference\">valueReference</a>.</li>\n<li>Note 3: Note that you can use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.</li>\n</ul>"})

(def wheelbase
  "The distance between the centers of the front and rear wheels.<br/><br/> Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"
  {:db/ident :auto-vc/wheelbase,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "wheelbase"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   "The distance between the centers of the front and rear wheels.<br/><br/>\n\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"})

(def width
  "The outer width of the vehicle. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges. Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"
  {:db/ident :auto-vc/width,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "width"},
   :rdfs/range :auto-mo/QuantitativeValueFloat,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The outer width of the vehicle. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges.\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"}})

(def widthExcludingDoorMirrors
  "The outer width of the vehicle, excluding door mirrors. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges. Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"
  {:db/ident :auto-vc/widthExcludingDoorMirrors,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "width excluding door mirrors"},
   :rdfs/subPropertyOf :auto-vc/width,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The outer width of the vehicle, excluding door mirrors. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges.\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"}})

(def widthWithDoorsOpen
  "The outer width of the vehicle with the doors open. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges. Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"
  {:db/ident :auto-vc/widthWithDoorsOpen,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vvo/ns#"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "width with doors open"},
   :rdfs/subPropertyOf :auto-vc/width,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The outer width of the vehicle with the doors open. Note that you can use gr:hasMinValueFloat and gr:hasMaxValueFloat to indicate ranges.\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet"}})

(def |0to100KMH|
  "The speed interval from 0 to 100 km/h"
  {:auto-mo/hasMaxValue 100.0,
   :auto-mo/hasMinValue 0.0,
   :auto-mo/hasUnitOfMeasurement "KMH",
   :db/ident :auto-vc/|0to100KMH|,
   :rdf/type [:auto-vc/SpeedInterval :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "0 to 100KMH"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The speed interval from 0 to 100 km/h"}})

(def |0to60MPH|
  "The speed interval from 0 to 60 mph"
  {:auto-mo/hasMaxValue 60.0,
   :auto-mo/hasMinValue 0.0,
   :auto-mo/hasUnitOfMeasurement "HM",
   :db/ident :auto-vc/|0to60MPH|,
   :rdf/type [:auto-vc/SpeedInterval :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "0 to 60MPH"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The speed interval from 0 to 60 mph"}})

(def |1GLI|
  "The fuel quantity of 1 British (imperial) gallon"
  {:auto-mo/hasUnitOfMeasurement "GLI",
   :db/ident :auto-vc/|1GLI|,
   :rdf/type [:auto-vc/FuelQuantity :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "1GLI"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The fuel quantity of 1 British (imperial) gallon"}})

(def |1GLL|
  "The fuel quantity of 1 US gallon"
  {:auto-mo/hasUnitOfMeasurement "GLL",
   :db/ident :auto-vc/|1GLL|,
   :rdf/type [:auto-vc/FuelQuantity :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "1GLL"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The fuel quantity of 1 US gallon"}})

(def |1LTR|
  "The fuel quantity of 1 liter"
  {:auto-mo/hasUnitOfMeasurement "LTR",
   :db/ident :auto-vc/|1LTR|,
   :rdf/type [:auto-vc/FuelQuantity :owl/NamedIndividual],
   :rdfs/isDefinedBy
   ["https://spec.edmcouncil.org/auto/ontology/VC/VehicleCore/"
    "http://purl.org/vso/ns"],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "1LTR"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The fuel quantity of 1 liter"}})

(def ^{:private true} GenericallyDependentContinuant
  "generically dependent continuant"
  {:db/ident   :auto-mo/GenericallyDependentContinuant,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "generically dependent continuant"}})

(def ^{:private true} IndependentContinuant
  "independent continuant"
  {:db/ident   :auto-mo/IndependentContinuant,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "independent continuant"}})

(def ^{:private true} Location
  "location"
  {:db/ident   :auto-mo/Location,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "location"}})

(def ^{:private true} Model
  "model"
  {:db/ident   :auto-mo/Model,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "model"}})

(def ^{:private true} NumericalValue
  "numerical value"
  {:db/ident   :auto-mo/NumericalValue,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "numerical value"}})

(def ^{:private true} ObjectClass
  "object"
  {:db/ident   :auto-mo/Object,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "object"}})

(def ^{:private true} Organization
  "organization"
  {:db/ident   :auto-mo/Organization,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization"}})

(def ^{:private true} Person
  "Any living human."
  {:db/ident :auto-mo/Person,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Within the context of this manual, a fetus is considered part of a pregnant woman rather than a separate individual. After death, a human body is not considered to be a person."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "person"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Any living human."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   "ANSI D.16-2017, section 2.1.1"})

(def ^{:private true} PostalAddress
  "postal address"
  {:db/ident   :auto-mo/PostalAddress,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "postal address"}})

(def ^{:private true} ProcessClass
  "process"
  {:db/ident   :auto-mo/Process,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "process"}})

(def ^{:private true} PropertyValue
  "property value"
  {:db/ident        :auto-mo/PropertyValue,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "property value"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :auto-vc/unitCode,
                      :rdf/type        :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :auto-vc/unitText,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :auto-vc/propertyValue,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :auto-vc/propertyName,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :auto-vc/propertyID,
                      :rdf/type           :owl/Restriction}]})

(def ^{:private true} QualitativeValue
  "a predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'"
  {:db/ident :auto-mo/QualitativeValue,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "qualitative value"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'"},
   :sm/directSource "https://schema.org/QualitativeValue"})

(def ^{:private true} Quality
  "quality"
  {:db/ident   :auto-mo/Quality,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quality"}})

(def ^{:private true} QuantitativeValue
  "a point value or interval for product characteristics and other purposes"
  {:db/ident :auto-mo/QuantitativeValue,
   :dcterms/isPartOf "http://auto.schema.org",
   :dcterms/source
   "http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group",
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quantitative value"},
   :rdfs/subClassOf
   [{:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-vc/TrafficPattern,
                           :owl/onProperty :auto-vc/refersToTrafficPattern,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-vc/TrafficPattern,
                           :owl/onProperty :auto-vc/refersToTrafficPattern,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                           :owl/onClass    :auto-mo/QuantitativeValue,
                           :owl/onProperty :auto-vc/rotationalSpeedReference,
                           :rdf/type       :owl/Restriction}
                          {:owl/maxQualifiedCardinality 1,
                           :owl/onClass    :auto-mo/QuantitativeValue,
                           :owl/onProperty :auto-vc/rotationalSpeedReference,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a point value or interval for product characteristics and other purposes"},
   :sm/directSource "https://schema.org/QuantitativeValue"})

(def ^{:private true} QuantitativeValueFloat
  "quantitative value float"
  {:db/ident        :auto-mo/QuantitativeValueFloat,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "quantitative value float"},
   :rdfs/subClassOf [{:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                                            :owl/onClass :auto-vc/FuelQuantity,
                                            :owl/onProperty
                                            :auto-vc/referenceFuelQuantity,
                                            :rdf/type :owl/Restriction}
                                           {:owl/maxQualifiedCardinality 1,
                                            :owl/onClass :auto-vc/FuelQuantity,
                                            :owl/onProperty
                                            :auto-vc/referenceFuelQuantity,
                                            :rdf/type :owl/Restriction}],
                      :rdf/type :owl/Class}
                     {:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                                            :owl/onClass
                                            :auto-mo/QuantitativeValue,
                                            :owl/onProperty
                                            :auto-vc/referenceDistance,
                                            :rdf/type :owl/Restriction}
                                           {:owl/maxQualifiedCardinality 1,
                                            :owl/onClass
                                            :auto-mo/QuantitativeValue,
                                            :owl/onProperty
                                            :auto-vc/referenceDistance,
                                            :rdf/type :owl/Restriction}],
                      :rdf/type :owl/Class}]})

(def ^{:private true} QuantitativeValueInteger
  {:db/ident :auto-mo/QuantitativeValueInteger,
   :rdf/type :owl/Class})

(def ^{:private true} Role
  "role"
  {:db/ident   :auto-mo/Role,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "role"}})

(def ^{:private true} TextValue
  "text value"
  {:db/ident   :auto-mo/TextValue,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "text value"}})

(def ^{:private true} ValueSpace
  "value space"
  {:db/ident   :auto-mo/ValueSpace,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "value space"}})

(def ^{:private true} datatypeProductOrServiceProperty
  "datatype product or service property"
  {:db/ident   :auto-mo/datatypeProductOrServiceProperty,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "datatype product or service property"})

(def ^{:private true} hasMaxValue
  "has max value"
  {:db/ident   :auto-mo/hasMaxValue,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "has max value"})

(def ^{:private true} hasMinValue
  "has min value"
  {:db/ident   :auto-mo/hasMinValue,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "has min value"})

(def ^{:private true} hasUnitOfMeasurement
  "has unit of measurement"
  {:db/ident    :auto-mo/hasUnitOfMeasurement,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :auto-mo/QuantitativeValue,
   :rdfs/label  "has unit of measurement"})

(def ^{:private true} valueReference
  "value reference"
  {:db/ident   :auto-mo/valueReference,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "value reference"})

(def ^{:private true} definition
  {:db/ident :skos/definition,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} contentLanguage
  {:db/ident :sm/contentLanguage,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} copyright
  {:db/ident :sm/copyright,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} directSource
  {:db/ident :sm/directSource,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} fileAbbreviation
  {:db/ident :sm/fileAbbreviation,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} filename
  {:db/ident :sm/filename,
   :rdf/type :owl/AnnotationProperty})