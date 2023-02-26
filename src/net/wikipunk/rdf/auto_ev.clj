(ns net.wikipunk.rdf.auto-ev
  "A sophisticated machine understandable map is required for autonomous vehicles to perceive driving environments. Therefore, we construct a map ontology."
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "A sophisticated machine understandable map is required for autonomous vehicles to perceive driving environments. Therefore, we construct a map ontology."},
   :dcterms/license "https://creativecommons.org/licenses/by-nc-sa/4.0/",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/auto/ontology/master/latest/MO/MiddleOntology/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"],
   :rdf/ns-prefix-map
   {"auto-ev"
    "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "auto-ev",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The traffic environment ontology (TE) provides a model for traffic infrastructure. \n\n\t\t\tIt contains many classes and properties extracted from: Map Ontology created by Lihua Zhao and Yutaka Sasaki at the Computational Intelligence Laboratory, Toyota Technological Institute, Nagoya, Japan (see https://www.toyota-ti.ac.jp/Lab/Denshi/COIN/Ontology/TTICore-0.03/) and published by the Toyota Technological Institute Smart Vehicle Research Project."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Traffic environment ontology (TE)"},
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/dependsOn "https://spec.edmcouncil.org/auto/ontology/EC/",
   :sm/fileAbbreviation "auto-de-map",
   :sm/filename "Map.rdf"}
  (:refer-clojure :exclude [name]))

(def Airport
  "place from which aircraft operate that usually has paved runways and maintenance facilities and often serves as a terminal"
  {:db/ident :auto-ev/Airport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "airport"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "place from which aircraft operate that usually has paved runways and maintenance facilities and often serves as a terminal"}})

(def Airway
  "A transport way reserved primarily for use by aircraft taking off, in flight, or landing."
  {:db/ident :auto-ev/Airway,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.1.9",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "airway"},
   :rdfs/subClassOf :auto-ev/TransportWay,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A transport way reserved primarily for use by aircraft taking off, in flight, or landing."}})

(def Amenity
  "something that helps to provide comfort, convenience, or enjoyment"
  {:db/ident :auto-ev/Amenity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "amenity"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "something that helps to provide comfort, convenience, or enjoyment"}})

(def AtGradeIntersection
  "An intersection where all roadways cross or join at the same level."
  {:db/ident :auto-ev/AtGradeIntersection,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.12",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "at grade intersection"},
   :rdfs/subClassOf :auto-ev/Intersection,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An intersection where all roadways cross or join at the same level."}})

(def AuxiliaryRoadSign
  "sign that provides information such as direction, time and temperature displays, hours of operation, or warning; auxiliary signs are intended for the convenience of the public. An auxiliary sign may include the business name and/or logo, but may not include its product or services"
  {:db/ident :auto-ev/AuxiliaryRoadSign,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "auxiliary road sign"},
   :rdfs/subClassOf :auto-ev/RoadSign,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "sign that provides information such as direction, time and temperature displays, hours of operation, or warning; auxiliary signs are intended for the convenience of the public. An auxiliary sign may include the business name and/or logo, but may not include its product or services"}})

(def Bank
  "establishment for the custody, loan, exchange, or issue of money, for the extension of credit, and for facilitating the transmission of funds"
  {:db/ident :auto-ev/Bank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bank"},
   :rdfs/subClassOf :auto-ev/Building,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "establishment for the custody, loan, exchange, or issue of money, for the extension of credit, and for facilitating the transmission of funds"}})

(def BicycleLane
  "A bikeway adjacent to travel lanes which has been designated for preferential or exclusive use by pedalcyclists through striping, signage or pavement markings"
  {:db/ident :auto-ev/BicycleLane,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.45",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bicycle lane"},
   :rdfs/subClassOf :auto-ev/Bikeway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A bikeway adjacent to travel lanes which has been designated for preferential or exclusive use by pedalcyclists through striping, signage or pavement markings"}})

(def BicycleTrail
  "A bikeway reserved for pedalcycles and separated from roadways by open space or barriers."
  {:db/ident :auto-ev/BicycleTrail,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bicycle trail"},
   :rdfs/subClassOf :auto-ev/Bikeway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A bikeway reserved for pedalcycles and separated from roadways by open space or barriers."}})

(def Bikeway
  "A trafficway specifically designated as being open for pedalcycle travel or, where various classes of pedalcycle are segregated, that part of a trafficway open for a particular class (See 2.2.28)"
  {:db/ident :auto-ev/Bikeway,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bikeway"},
   :rdfs/subClassOf :auto-ev/TransportWay,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A trafficway specifically designated as being open for pedalcycle travel or, where various classes of pedalcycle are segregated, that part of a trafficway open for a particular class (See 2.2.28)"}})

(def Building
  "usually roofed and walled structure built for permanent use"
  {:db/ident :auto-ev/Building,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "building"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "usually roofed and walled structure built for permanent use"}})

(def BusLane
  "part of the road which is intended to be used only by buses"
  {:db/ident :auto-ev/BusLane,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bus lane"},
   :rdfs/subClassOf :auto-ev/Lane,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "part of the road which is intended to be used only by buses"}})

(def BusStation
  "place incorporating waiting areas, stands for buses, and ticket offices from which buses or coaches depart"
  {:db/ident :auto-ev/BusStation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bus station"},
   :rdfs/subClassOf :auto-ev/Station,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "place incorporating waiting areas, stands for buses, and ticket offices from which buses or coaches depart"}})

(def BusStop
  "place on a road where buses stop to let passengers on and off"
  {:db/ident :auto-ev/BusStop,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bus stop"},
   :rdfs/subClassOf :auto-ev/BusStation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "place on a road where buses stop to let passengers on and off"}})

(def BusinessDistrict
  "territory contiguous to and including a highway when within any 600 feet along such highway there are buildings in use for business or industrial purposes, including but not limited to hotels, banks, office buildings, railroad stations and public buildings which occupy at least 300 feet of frontage on one side or 300 feet collectively on both sides of the highway"
  {:db/ident :auto-ev/BusinessDistrict,
   :owl/disjointWith :auto-ev/ResidentialDistrict,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "business district"},
   :rdfs/subClassOf :auto-ev/UrbanDistrict,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "territory contiguous to and including a highway when within any 600 feet along such highway there are buildings in use for business or industrial purposes, including but not limited to hotels, banks, office buildings, railroad stations and public buildings which occupy at least 300 feet of frontage on one side or 300 feet collectively on both sides of the highway"}})

(def ChannelizedIntersection
  "An at-grade intersection in which traffic is diverted into definite paths by raised or painted traffic islands."
  {:db/ident :auto-ev/ChannelizedIntersection,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.13",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "channelized intersection"},
   :rdfs/subClassOf :auto-ev/AtGradeIntersection,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An at-grade intersection in which traffic is diverted into definite paths by raised or painted traffic islands."}})

(def CityStreet
  "A trafficway within a city trafficway system that is not an Interstate highway, other U.S. route numbered highway, other state route numbered highway, or county road."
  {:db/ident :auto-ev/CityStreet,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.8",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "city street"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A trafficway within a city trafficway system that is not an Interstate highway, other U.S. route numbered highway, other state route numbered highway, or county road."}})

(def College
  "institution offering instruction, usually in a professional, vocational, or technical field"
  {:db/ident :auto-ev/College,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "college"},
   :rdfs/subClassOf :auto-ev/EducationalInstitute,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "institution offering instruction, usually in a professional, vocational, or technical field"}})

(def Convenience
  "small, often franchised market that is open long hours"
  {:db/ident :auto-ev/Convenience,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "convenience"},
   :rdfs/subClassOf :auto-ev/Shop,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "small, often franchised market that is open long hours"}})

(def CountyRoad
  "A trafficway within a county trafficway system that is not an Interstate highway, other U.S. route numbered highway, or other state route numbered highway."
  {:db/ident :auto-ev/CountyRoad,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.7",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "county road"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A trafficway within a county trafficway system that is not an Interstate highway, other U.S. route numbered highway, or other state route numbered highway."}})

(def Crosswalk
  "(1) that part of a roadway at an intersection included within the connections of the lateral lines of the sidewalks on opposite sides of the roadway measured from the curbs or, in the absence of curbs, from the edges of the traversable roadway, or (2) any portion of a roadway at an intersection or elsewhere distinctly indicated for pedestrian crossing by lines or other markings on the surface of the roadway."
  {:db/ident :auto-ev/Crosswalk,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.21",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "crosswalk"},
   :rdfs/subClassOf :auto-ev/RoadPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "(1) that part of a roadway at an intersection included within the connections of the lateral lines of the sidewalks on opposite sides of the roadway measured from the curbs or, in the absence of curbs, from the edges of the traversable roadway, or (2) any portion of a roadway at an intersection or elsewhere distinctly indicated for pedestrian crossing by lines or other markings on the surface of the roadway."}})

(def CrosswalkRoadSegment
  "road segment which contains a crosswalk"
  {:db/ident :auto-ev/CrosswalkRoadSegment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "crosswalk road segment"},
   :rdfs/subClassOf :auto-ev/RoadSegment,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "road segment which contains a crosswalk"}})

(def CurbReturn
  "The curved section of curb used at intersections in joining straight sections of curb."
  {:db/ident :auto-ev/CurbReturn,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.20",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "curb return"},
   :rdfs/subClassOf :auto-ev/RoadPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The curved section of curb used at intersections in joining straight sections of curb."}})

(def DirectionalRoadSign
  "sign installed on public land that advertises the direction to be taken to a service, tourist attraction or a townsite/locality"
  {:db/ident :auto-ev/DirectionalRoadSign,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "directional road sign"},
   :rdfs/subClassOf :auto-ev/RoadSign,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "sign installed on public land that advertises the direction to be taken to a service, tourist attraction or a townsite/locality"}})

(def Driveway
  "A private way which provides vehicular access to the public from a trafficway to property, parking or loading areas outside the boundaries of the trafficway, but is considered to be not open to the public for transportation purposes as a trafficway."
  {:db/ident :auto-ev/Driveway,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.9.1",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A driveway is outside the trafficway and is typically not provided an official identification name or number."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driveway"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A private way which provides vehicular access to the public from a trafficway to property, parking or loading areas outside the boundaries of the trafficway, but is considered to be not open to the public for transportation purposes as a trafficway."}})

(def DrivewayAccess
  "A portion of the trafficway at the end of a driveway (See 2.5.9.1), providing access to property adjacent to a trafficway."
  {:db/ident :auto-ev/DrivewayAccess,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.9",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driveway access"},
   :rdfs/subClassOf :auto-ev/RoadPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A portion of the trafficway at the end of a driveway (See 2.5.9.1), providing access to property adjacent to a trafficway."}})

(def EducationalInstitute
  "institute that provides education as its main purpose"
  {:db/ident :auto-ev/EducationalInstitute,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "educational institute"},
   :rdfs/subClassOf :auto-ev/Building,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "institute that provides education as its main purpose"}})

(def EndLane
  "lane located at the end of a path"
  {:db/ident :auto-ev/EndLane,
   :owl/disjointWith :auto-ev/StartLane,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "end lane"},
   :rdfs/subClassOf :auto-ev/LaneSegment,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "lane located at the end of a path"}})

(def EndNode
  "end GPS position of a path"
  {:db/ident :auto-ev/EndNode,
   :owl/disjointWith :auto-ev/StartNode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "end node"},
   :rdfs/subClassOf :auto-ev/Node,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "end GPS position of a path"}})

(def FastFood
  "restaurant specializing in food that can be prepared and served quickly"
  {:db/ident :auto-ev/FastFood,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fast food"},
   :rdfs/subClassOf :auto-ev/Restaurant,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "restaurant specializing in food that can be prepared and served quickly"}})

(def FireStation
  "building housing fire apparatus and usually firefighters"
  {:db/ident :auto-ev/FireStation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fire station"},
   :rdfs/subClassOf :auto-ev/Building,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "building housing fire apparatus and usually firefighters"}})

(def Forest
  "dense growth of trees and underbrush covering a large tract"
  {:db/ident :auto-ev/Forest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "forest"},
   :rdfs/subClassOf :auto-ev/NaturalPlace,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "dense growth of trees and underbrush covering a large tract"}})

(def FrontageRoad
  "A roadway generally paralleling an expressway, freeway, parkway or through street so designed as to intercept, collect and distribute traffic desiring to cross, enter or leave such facility and to furnish access to property which otherwise would be isolated as a result of controlled-access features."
  {:db/ident :auto-ev/FrontageRoad,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.18",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The frontage road may be within the same trafficway as the main roadway or in a separate trafficway."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "frontage road"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A roadway generally paralleling an expressway, freeway, parkway or through street so designed as to intercept, collect and distribute traffic desiring to cross, enter or leave such facility and to furnish access to property which otherwise would be isolated as a result of controlled-access features."}})

(def Fully-controlledAccessHighway
  "A trafficway on which preference is given to through traffic by permitting access only from other trafficways and by providing grade separations at all crossing trafficways."
  {:db/ident :auto-ev/Fully-controlledAccessHighway,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.15",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fully-controlled access highway"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A trafficway on which preference is given to through traffic by permitting access only from other trafficways and by providing grade separations at all crossing trafficways."}})

(def GasStation
  "retail station for servicing motor vehicles, especially with gasoline and oil"
  {:db/ident :auto-ev/GasStation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gas station"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "retail station for servicing motor vehicles, especially with gasoline and oil"}})

(def Gore
  "An area of land where two roadways diverge or converge."
  {:db/ident :auto-ev/Gore,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.19",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The area is bounded on two sides by the edges of the roadways, which join at the point of divergence or convergence. The direction of traffic shall be the same on both sides of these roadways. The area includes shoulders or marked pavement, if any, between the roadways. The third side is 60 meters (approximately 200 feet) from the point of divergence or convergence or, if any other road is within 70 meters (230 feet) of that point, a line 10 meters (33 feet) from the nearest edge of such road."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gore"},
   :rdfs/subClassOf :auto-ev/RoadPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "An area of land where two roadways diverge or converge."}})

(def GradeSeparation
  "A crossing at different levels of two trafficways, or a trafficway and a railway."
  {:db/ident :auto-ev/GradeSeparation,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.14",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "grade separation"},
   :rdfs/subClassOf :auto-ev/Intersection,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A crossing at different levels of two trafficways, or a trafficway and a railway."}})

(def Highway
  "road that is part of the strategic traffic network for automobiles across the country and connects areas of political/economic importance or areas that are critical to the nation's interests"
  {:db/ident :auto-ev/Highway,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "highway"},
   :rdfs/subClassOf :auto-ev/RoadType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "road that is part of the strategic traffic network for automobiles across the country and connects areas of political/economic importance or areas that are critical to the nation's interests"}})

(def Hospital
  "institution where the sick or injured are given medical or surgical care"
  {:db/ident :auto-ev/Hospital,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hospital"},
   :rdfs/subClassOf :auto-ev/Building,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "institution where the sick or injured are given medical or surgical care"}})

(def Infrastructure
  "basic installations and facilities on which the continuance and growth of a community, state, etc. depend, such as roads, schools, power plants, transportation and communication systems, etc."
  {:db/ident :auto-ev/Infrastructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "infrastructure"},
   :rdfs/subClassOf :auto-mo/MaterialEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basic installations and facilities on which the continuance and growth of a community, state, etc. depend, such as roads, schools, power plants, transportation and communication systems, etc."}})

(def InstructionRoadSign
  "sign which does not contain advertising or promotional matter but relates solely to traffic or pedestrian control, warnings or hours of operation"
  {:db/ident :auto-ev/InstructionRoadSign,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "instruction road sign"},
   :rdfs/subClassOf :auto-ev/RoadSign,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "sign which does not contain advertising or promotional matter but relates solely to traffic or pedestrian control, warnings or hours of operation"}})

(def InstructionSurfaceSign
  "sign which does not contain advertising or promotional matter but relates solely to traffic or pedestrian control, warnings or hours of operation, that is located on the road surface"
  {:db/ident :auto-ev/InstructionSurfaceSign,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "instruction surface sign"},
   :rdfs/subClassOf :auto-ev/RoadSurfaceMarking,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "sign which does not contain advertising or promotional matter but relates solely to traffic or pedestrian control, warnings or hours of operation, that is located on the road surface"}})

(def Interchange
  "A system of interconnecting roadways in conjunction with one or more grade separations, providing for the movement of traffic between two or more roadways on different levels."
  {:db/ident :auto-ev/Interchange,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.16",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interchange"},
   :rdfs/subClassOf :auto-ev/RoadPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A system of interconnecting roadways in conjunction with one or more grade separations, providing for the movement of traffic between two or more roadways on different levels."}})

(def Intersection
  "An area which (1) contains a crossing or connection of two or more roadways not classified as driveway access and (2) is embraced within the prolongation of the lateral curb lines or, if none, the lateral boundary lines of the roadways."
  {:db/ident :auto-ev/Intersection,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.10",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Where the distance along a roadway between two areas meeting these criteria is less than 10 meters (33 feet), the two areas and the roadway connecting them are considered to be parts of a single intersection."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "intersection"},
   :rdfs/subClassOf [:auto-ev/RoadPart :auto-ev/Junction],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An area which (1) contains a crossing or connection of two or more roadways not classified as driveway access and (2) is embraced within the prolongation of the lateral curb lines or, if none, the lateral boundary lines of the roadways."}})

(def IntersectionSegment
  "path segment that contains an intersection of two or more lanes"
  {:db/ident :auto-ev/IntersectionSegment,
   :owl/disjointWith :auto-ev/LaneSegment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "intersection segment"},
   :rdfs/subClassOf :auto-ev/PathSegment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "path segment that contains an intersection of two or more lanes"}})

(def InterstateHighway
  "A trafficway on the Interstate System."
  {:db/ident :auto-ev/InterstateHighway,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interstate highway"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A trafficway on the Interstate System."}})

(def InterstateSystem
  "The National System of Interstate and Defense Highways as defined in Section 101, Title 23, United States Code."
  {:db/ident :auto-ev/InterstateSystem,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interstate system"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The National System of Interstate and Defense Highways as defined in Section 101, Title 23, United States Code."}})

(def Junction
  "An intersection or the connection between a driveway access and a roadway other than a driveway access."
  {:db/ident :auto-ev/Junction,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.11",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "junction"},
   :rdfs/subClassOf :auto-ev/RoadPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An intersection or the connection between a driveway access and a roadway other than a driveway access."}})

(def Kindergarten
  "school or class for children usually from four to six years old"
  {:db/ident :auto-ev/Kindergarten,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "kindergarten"},
   :rdfs/subClassOf :auto-ev/EducationalInstitute,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "school or class for children usually from four to six years old"}})

(def Lake
  "considerable inland body of standing water"
  {:db/ident :auto-ev/Lake,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lake"},
   :rdfs/subClassOf :auto-ev/NaturalPlace,
   :skos/definition {:rdf/language "en",
                     :rdf/value "considerable inland body of standing water"}})

(def LandWay
  "The space within property lines or other boundary lines of any transport way that is neither an airway nor a waterway."
  {:db/ident :auto-ev/LandWay,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "land way"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The space within property lines or other boundary lines of any transport way that is neither an airway nor a waterway."}})

(def Lane
  "one of the longitudinal strips into which the carriageway is divisible, whether or not defined by longitudinal road markings, which is wide enough for one moving line of motor vehicles other than motorcycles"
  {:db/ident :auto-ev/Lane,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lane"},
   :rdfs/subClassOf :auto-ev/RoadPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "one of the longitudinal strips into which the carriageway is divisible, whether or not defined by longitudinal road markings, which is wide enough for one moving line of motor vehicles other than motorcycles"}})

(def LaneAdapter
  "connection between an uncontrolled intersection and a two-way narrow road"
  {:db/ident :auto-ev/LaneAdapter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lane adapter"},
   :rdfs/subClassOf :auto-ev/Junction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "connection between an uncontrolled intersection and a two-way narrow road"}})

(def LaneSegment
  "lane segment"
  {:db/ident :auto-ev/LaneSegment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lane segment"},
   :rdfs/subClassOf :auto-ev/PathSegment})

(def Leisure
  "large public building containing different facilities for leisure activities"
  {:db/ident :auto-ev/Leisure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "leisure"},
   :rdfs/subClassOf :auto-ev/Amenity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "large public building containing different facilities for leisure activities"}})

(def LocalRoad
  "local road"
  {:db/ident :auto-ev/LocalRoad,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "local road"},
   :rdfs/subClassOf :auto-ev/OrdinaryRoad})

(def LongitudinalPartOfTrafficway
  "part of a traffic way which is a roadway or a line parallel to it"
  {:db/ident :auto-ev/LongitudinalPartOfTrafficway,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "longitudinal part of trafficway"},
   :rdfs/subClassOf [:auto-ev/RoadPart :auto-ev/Infrastructure],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "part of a traffic way which is a roadway or a line parallel to it"}})

(def Median
  "An area of a trafficway between parallel roads separating travel in opposite directions."
  {:db/ident :auto-ev/Median,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.29",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A flush or painted median should be 4 or more feet wide between inside roadway edge lines. Medians fewer than 4 feet wide shall have a barrier to be considered a median. Continuous left-turn lanes are not considered painted medians."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "median"},
   :rdfs/subClassOf :auto-ev/LongitudinalPartOfTrafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An area of a trafficway between parallel roads separating travel in opposite directions."}})

(def MetroStation
  "station for a rapid transit system, which as a whole is usually called a \"metro\" or \"subway\""
  {:db/ident :auto-ev/MetroStation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "metro station"},
   :rdfs/subClassOf :auto-ev/Station,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "station for a rapid transit system, which as a whole is usually called a \"metro\" or \"subway\""}})

(def MunicipalRoad
  "road that is part of the road network within municipal jurisdiction"
  {:db/ident :auto-ev/MunicipalRoad,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "municipal road"},
   :rdfs/subClassOf :auto-ev/OrdinaryRoad,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "road that is part of the road network within municipal jurisdiction"}})

(def NationalRoad
  "road that is part of the strategic road network for the nation"
  {:db/ident :auto-ev/NationalRoad,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "national road"},
   :rdfs/subClassOf :auto-ev/OrdinaryRoad,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "road that is part of the strategic road network for the nation"}})

(def NaturalPlace
  "place created by nature to which people come for entertainment"
  {:db/ident :auto-ev/NaturalPlace,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "natural place"},
   :rdfs/subClassOf :auto-mo/MaterialEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "place created by nature to which people come for entertainment"}})

(def Node
  "single point in space defined by its latitude, longitude and node ID"
  {:db/ident :auto-ev/Node,
   :owl/disjointWith :auto-ev/PathSegment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "node"},
   :rdfs/subClassOf :auto-ev/Path,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "single point in space defined by its latitude, longitude and node ID"}})

(def OneWayLane
  "lane where driving vehicles otherwise than in one direction is prohibited"
  {:db/ident :auto-ev/OneWayLane,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "one way lane"},
   :rdfs/subClassOf :auto-ev/Lane,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lane where driving vehicles otherwise than in one direction is prohibited"}})

(def OrdinaryRoad
  "road that is not a highway"
  {:db/ident :auto-ev/OrdinaryRoad,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ordinary road"},
   :rdfs/subClassOf :auto-ev/RoadType,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "road that is not a highway"}})

(def OtherSigns
  "other sign that can be encountered by the driver on the road"
  {:db/ident :auto-ev/OtherSigns,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "other sign"},
   :rdfs/subClassOf :auto-ev/RoadSurfaceMarking,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "other sign that can be encountered by the driver on the road"}})

(def OtherStateRouteNumberedHighway
  "A trafficway within a state trafficway system, but not an interstate highway or other U.S. route numbered highway."
  {:db/ident :auto-ev/OtherStateRouteNumberedHighway,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.6",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "other state route numbered highway"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A trafficway within a state trafficway system, but not an interstate highway or other U.S. route numbered highway."}})

(def OtherUSRouteNumberedHighwayAnother
  "A trafficway numbered by the American Association of State Highway Officials, but not an interstate highway."
  {:db/ident :auto-ev/OtherUSRouteNumberedHighwayAnother,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.5",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "other US route numbered highway another"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A trafficway numbered by the American Association of State Highway Officials, but not an interstate highway."}})

(def Park
  "piece of ground in or near a city or town kept for ornament and recreation"
  {:db/ident :auto-ev/Park,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "park"},
   :rdfs/subClassOf :auto-ev/Leisure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "piece of ground in or near a city or town kept for ornament and recreation"}})

(def ParkingLot
  "An area used primarily for parking road vehicles."
  {:db/ident :auto-ev/ParkingLot,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.22",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "When paved and marked, it commonly includes the following areas : 1.) Parking stalls — areas reserved primarily for parked road vehicles, 2.) Parking lot aisles — areas used primarily for vehicular access to parking stalls, Parking lot aisles are not trafficways. 3.) Parking lot ways — land ways which are used primarily for vehicular circulation within parking lots and for vehicular access to parking lot aisles."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parking lot"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An area used primarily for parking road vehicles."}})

(def ParkingLotWay
  "A parking lots open to the public are trafficways."
  {:db/ident :auto-ev/ParkingLotWay,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.22.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parking lot way"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A parking lots open to the public are trafficways."}})

(def ParkingPlace
  "place to park a car, truck, etc"
  {:db/ident :auto-ev/ParkingPlace,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parking place"},
   :rdfs/subClassOf :auto-ev/Amenity,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "place to park a car, truck, etc"}})

(def Path
  "line of movement of a vehicle"
  {:db/ident :auto-ev/Path,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "path"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "line of movement of a vehicle"}})

(def PathSegment
  "part of a path that can be an intersection, a lane, a crosswalk or a turn"
  {:db/ident :auto-ev/PathSegment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "path segment"},
   :rdfs/subClassOf :auto-ev/Path,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "part of a path that can be an intersection, a lane, a crosswalk or a turn"}})

(def Pharmacy
  "place where medicines are compounded or dispensed"
  {:db/ident :auto-ev/Pharmacy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pharmacy"},
   :rdfs/subClassOf :auto-ev/Shop,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "place where medicines are compounded or dispensed"}})

(def PoliceStation
  "headquarters of the police for a locality"
  {:db/ident :auto-ev/PoliceStation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "police station"},
   :rdfs/subClassOf :auto-ev/Building,
   :skos/definition {:rdf/language "en",
                     :rdf/value "headquarters of the police for a locality"}})

(def PostOffice
  "local branch of a national post office handling the mail for a particular place or area"
  {:db/ident :auto-ev/PostOffice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "post office"},
   :rdfs/subClassOf :auto-ev/Building,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "local branch of a national post office handling the mail for a particular place or area"}})

(def PrefecturalRoad
  "road that is part of the regional arterial road network"
  {:db/ident :auto-ev/PrefecturalRoad,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "prefectural road"},
   :rdfs/subClassOf :auto-ev/OrdinaryRoad,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "road that is part of the regional arterial road network"}})

(def PrivateRoad
  "road owned by a private entity"
  {:db/ident :auto-ev/PrivateRoad,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private road"},
   :rdfs/subClassOf :auto-ev/OrdinaryRoad,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "road owned by a private entity"}})

(def PrivateWay
  "Any land way other than a trafficway."
  {:db/ident :auto-ev/PrivateWay,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.2",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The space within a crossing of a private way and a trafficway shall be considered a trafficway."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private way"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Any land way other than a trafficway."}})

(def Railway
  "Any private way reserved primarily for land vehicles moving persons or property from one place to another on rails."
  {:db/ident :auto-ev/Railway,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "railway"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any private way reserved primarily for land vehicles moving persons or property from one place to another on rails."}})

(def RailwayStation
  "building containing accommodations for railroad passengers or freight"
  {:db/ident :auto-ev/RailwayStation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "railway station"},
   :rdfs/subClassOf :auto-ev/Station,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "building containing accommodations for railroad passengers or freight"}})

(def Ramp
  "An auxiliary roadway used for entering or leaving through-traffic lanes."
  {:db/ident :auto-ev/Ramp,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.17",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Road Vehicle A road vehicle is any land vehicle other than a railway vehicle."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ramp"},
   :rdfs/subClassOf :auto-ev/RoadPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An auxiliary roadway used for entering or leaving through-traffic lanes."}})

(def RegulatoryRoadSign
  "sign used to inform road users of selected traffic laws or regulations and indicate the applicability of the legal requirements"
  {:db/ident :auto-ev/RegulatoryRoadSign,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Regulatory sign"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "regulatory road sign"},
   :rdfs/subClassOf :auto-ev/RoadSign,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "sign used to inform road users of selected traffic laws or regulations and indicate the applicability of the legal requirements"}})

(def RegulatorySurfaceSign
  "sign used to inform road users of selected traffic laws or regulations and indicate the applicability of the legal requirements located on the road surface"
  {:db/ident :auto-ev/RegulatorySurfaceSign,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "regulatory surface sign"},
   :rdfs/subClassOf :auto-ev/RoadSurfaceMarking,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "sign used to inform road users of selected traffic laws or regulations and indicate the applicability of the legal requirements located on the road surface"}})

(def ResidentialDistrict
  "territory contiguous to and including a highway not comprising a business district when the property on such highway for a distance of 300 feet or more is in the main improved with residences or residences and buildings in use for business"
  {:db/ident :auto-ev/ResidentialDistrict,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "residential district"},
   :rdfs/subClassOf :auto-ev/UrbanDistrict,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "territory contiguous to and including a highway not comprising a business district when the property on such highway for a distance of 300 feet or more is in the main improved with residences or residences and buildings in use for business"}})

(def Restaurant
  "business establishment where meals or refreshments may be purchased"
  {:db/ident :auto-ev/Restaurant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "restaurant"},
   :rdfs/subClassOf :auto-ev/Amenity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "business establishment where meals or refreshments may be purchased"}})

(def River
  "natural stream of water of usually considerable volume"
  {:db/ident :auto-ev/River,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "river"},
   :rdfs/subClassOf :auto-ev/NaturalPlace,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "natural stream of water of usually considerable volume"}})

(def Road
  "A part of a trafficway which includes both the roadway and any shoulder alongside the roadway."
  {:db/ident :auto-ev/Road,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.33",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road"},
   :rdfs/subClassOf :auto-ev/LongitudinalPartOfTrafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A part of a trafficway which includes both the roadway and any shoulder alongside the roadway."}})

(def RoadPart
  "part of the road"
  {:db/ident :auto-ev/RoadPart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road part"},
   :rdfs/subClassOf [:auto-ev/TransportWay :auto-ev/Infrastructure],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "part of the road"}})

(def RoadSegment
  "segment of the road"
  {:db/ident :auto-ev/RoadSegment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road segment"},
   :rdfs/subClassOf :auto-ev/RoadPart,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "segment of the road"}})

(def RoadSign
  "sign located on or visible from the road that informs the drivers about laws, attractions, regulations and more"
  {:db/ident :auto-ev/RoadSign,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road sign"},
   :rdfs/subClassOf :auto-ev/TrafficSign,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "sign located on or visible from the road that informs the drivers about laws, attractions, regulations and more"}})

(def RoadSurfaceMarking
  "marking located on the road surface, which informs the drivers about laws, attractions, regulations and more"
  {:db/ident :auto-ev/RoadSurfaceMarking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road surface marking"},
   :rdfs/subClassOf :auto-ev/TrafficSign,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "marking located on the road surface, which informs the drivers about laws, attractions, regulations and more"}})

(def RoadType
  "particular kind of road"
  {:db/ident :auto-ev/RoadType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road type"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "particular kind of road"}})

(def Roadside
  "The outermost part of the trafficway from the property line or other boundary in to the edge of the first road."
  {:db/ident :auto-ev/Roadside,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.31",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "roadside"},
   :rdfs/subClassOf :auto-ev/LongitudinalPartOfTrafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The outermost part of the trafficway from the property line or other boundary in to the edge of the first road."}})

(def Roadway
  "A part of a trafficway designed, improved and ordinarily used for motor vehicle travel or, where various classes of motor vehicles are segregated, that part of a trafficway used by a particular class."
  {:db/ident :auto-ev/Roadway,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.28",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Separate roadways may be provided for opposing directions of traffic or for trucks and automobiles."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "roadway"},
   :rdfs/subClassOf :auto-ev/LongitudinalPartOfTrafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A part of a trafficway designed, improved and ordinarily used for motor vehicle travel or, where various classes of motor vehicles are segregated, that part of a trafficway used by a particular class."}})

(def Roundabout
  "circular intersection with yield control at entry, which permits a vehicle on the circulatory roadway to proceed, and with deflection of the approaching vehicle counter-clockwise around a central island"
  {:db/ident :auto-ev/Roundabout,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "roundabout"},
   :rdfs/subClassOf :auto-ev/Junction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "circular intersection with yield control at entry, which permits a vehicle on the circulatory roadway to proceed, and with deflection of the approaching vehicle counter-clockwise around a central island"}})

(def School
  "institution for the teaching of children"
  {:db/ident :auto-ev/School,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "school"},
   :rdfs/subClassOf :auto-ev/EducationalInstitute,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "institution for the teaching of children"}})

(def Separator
  "The area of a trafficway between parallel roads separating travel in the same direction or separating a frontage road (See 2.5.18) from other roads."
  {:db/ident :auto-ev/Separator,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.30",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "separator"},
   :rdfs/subClassOf :auto-ev/Trafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The area of a trafficway between parallel roads separating travel in the same direction or separating a frontage road (See 2.5.18) from other roads."}})

(def SharedRoad
  "Any bikeway which is part of a roadway, but not a bicycle lane."
  {:db/ident :auto-ev/SharedRoad,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.46",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "shared road"},
   :rdfs/subClassOf :auto-ev/Bikeway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any bikeway which is part of a roadway, but not a bicycle lane."}})

(def Shop
  "small retail establishment or a department in a large one offering a specified line of goods or services"
  {:db/ident :auto-ev/Shop,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "shop"},
   :rdfs/subClassOf :auto-ev/Amenity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "small retail establishment or a department in a large one offering a specified line of goods or services"}})

(def Shoulder
  "A part of a trafficway contiguous with the roadway for emergency use, for accommodation of stopped road vehicles, and for lateral support of the roadway structure."
  {:db/ident :auto-ev/Shoulder,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.32",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "shoulder"},
   :rdfs/subClassOf :auto-ev/LongitudinalPartOfTrafficway,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A part of a trafficway contiguous with the roadway for emergency use, for accommodation of stopped road vehicles, and for lateral support of the roadway structure."}})

(def SpeedLimit
  "maximum (or minimum) speed applicable to a section of highway as established by law or regulation"
  {:db/ident :auto-ev/SpeedLimit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit"},
   :rdfs/subClassOf :auto-mo/QualitativeValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "maximum (or minimum) speed applicable to a section of highway as established by law or regulation"}})

(def SpeedLimit100
  "speed limit of 100 km per hour"
  {:db/ident :auto-ev/SpeedLimit100,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 100"},
   :rdfs/subClassOf :auto-ev/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 100 km per hour"}})

(def SpeedLimit25
  "speed limit of 25 km per hour"
  {:db/ident :auto-ev/SpeedLimit25,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 25"},
   :rdfs/subClassOf :auto-ev/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 25 km per hour"}})

(def SpeedLimit30
  "speed limit of 30 km per hour"
  {:db/ident :auto-ev/SpeedLimit30,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 30"},
   :rdfs/subClassOf :auto-ev/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 30 km per hour"}})

(def SpeedLimit40
  "speed limit of 40 km per hour"
  {:db/ident :auto-ev/SpeedLimit40,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 40"},
   :rdfs/subClassOf :auto-ev/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 40 km per hour"}})

(def SpeedLimit50
  "speed limit of 50 km per hour"
  {:db/ident :auto-ev/SpeedLimit50,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 50"},
   :rdfs/subClassOf :auto-ev/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 50 km per hour"}})

(def SpeedLimit60
  "speed limit of 60 km per hour"
  {:db/ident :auto-ev/SpeedLimit60,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 60"},
   :rdfs/subClassOf :auto-ev/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 60 km per hour"}})

(def SpeedLimit70
  "speed limit of 70 km per hour"
  {:db/ident :auto-ev/SpeedLimit70,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 70"},
   :rdfs/subClassOf :auto-ev/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 70 km per hour"}})

(def SpeedLimit80
  "speed limit of 80 km per hour"
  {:db/ident :auto-ev/SpeedLimit80,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 80"},
   :rdfs/subClassOf :auto-ev/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 80 km per hour"}})

(def SportsCentre
  "place where people take part in sports"
  {:db/ident :auto-ev/SportsCentre,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sports centre"},
   :rdfs/subClassOf :auto-ev/Leisure,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "place where people take part in sports"}})

(def StartLane
  "lane located at the start of a path"
  {:db/ident :auto-ev/StartLane,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "start lane"},
   :rdfs/subClassOf :auto-ev/LaneSegment,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "lane located at the start of a path"}})

(def StartNode
  "starting GPS position of a path"
  {:db/ident :auto-ev/StartNode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "start node"},
   :rdfs/subClassOf :auto-ev/Node,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "starting GPS position of a path"}})

(def Station
  "regular stopping place on a transportation route"
  {:db/ident :auto-ev/Station,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "station"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "regular stopping place on a transportation route"}})

(def Supermarket
  "self-service retail market selling especially foods and household merchandise"
  {:db/ident :auto-ev/Supermarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "supermarket"},
   :rdfs/subClassOf :auto-ev/Shop,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "self-service retail market selling especially foods and household merchandise"}})

(def TollGate
  "point where the driver of a vehicle must pay a toll"
  {:db/ident :auto-ev/TollGate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "toll gate"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "point where the driver of a vehicle must pay a toll"}})

(def TrafficSign
  "road sign, signal, device, notice or road marking that identifies a danger, advises persons of the precautions to be taken against such danger, indicates the existence of a road regulation or implements such a regulation"
  {:db/ident :auto-ev/TrafficSign,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traffic sign"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "road sign, signal, device, notice or road marking that identifies a danger, advises persons of the precautions to be taken against such danger, indicates the existence of a road regulation or implements such a regulation"}})

(def TrafficSignal
  "device manually, electrically or mechanically operated for the regulation of traffic"
  {:db/ident :auto-ev/TrafficSignal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traffic signal"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device manually, electrically or mechanically operated for the regulation of traffic"}})

(def Trafficway
  "Any land way open to the public as a matter of right or custom for moving persons or property from one place to another."
  {:db/ident :auto-ev/Trafficway,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trafficway"},
   :rdfs/subClassOf :auto-ev/TransportWay,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any land way open to the public as a matter of right or custom for moving persons or property from one place to another."}})

(def TransportWay
  "Any way or place reserved or commonly used for the operation of transport vehicles."
  {:db/ident :auto-ev/TransportWay,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.1.8",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transport way"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any way or place reserved or commonly used for the operation of transport vehicles."}})

(def Turn
  "instant change of direction of a singular road"
  {:db/ident :auto-ev/Turn,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "turn"},
   :rdfs/subClassOf :auto-ev/Junction,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "instant change of direction of a singular road"}})

(def TurnLane
  "A lane exclusively designated for vehicles turning from one trafficway to another."
  {:db/ident :auto-ev/TurnLane,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.23",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "turn lane"},
   :rdfs/subClassOf :auto-ev/TransportWay,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A lane exclusively designated for vehicles turning from one trafficway to another."}})

(def TwoWayLane
  "lane allowing for two-way traffic"
  {:db/ident :auto-ev/TwoWayLane,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "two way lane"},
   :rdfs/subClassOf :auto-ev/Lane,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "lane allowing for two-way traffic"}})

(def University
  "institution of higher learning providing facilities for teaching and research and authorized to grant academic degrees"
  {:db/ident :auto-ev/University,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "university"},
   :rdfs/subClassOf :auto-ev/EducationalInstitute,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "institution of higher learning providing facilities for teaching and research and authorized to grant academic degrees"}})

(def UrbanArea
  "An area whose boundaries shall be those fixed by responsible state and local officials in cooperation with each other and approved by the Federal Highway Administration, U.S. Department of Transportation."
  {:db/ident :auto-ev/UrbanArea,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.1",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Such boundaries are established in accordance with the provisions of Title 23 of the United States Code. Urban area boundary information is available from state highway or transportation departments. In the event that boundaries have not been fixed as above for any urban place designated by the Bureau of the Census having population of 5000 or more, the area within boundaries fixed by the Bureau of the Census shall be an urban area."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "urban area"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An area whose boundaries shall be those fixed by responsible state and local officials in cooperation with each other and approved by the Federal Highway Administration, U.S. Department of Transportation."}})

(def UrbanDistrict
  "territory contiguous to and including any street built up with structures devoted to business, industry or dwelling houses situated at intervals of less than 100 feet for a distance of a quarter of a mile or more"
  {:db/ident :auto-ev/UrbanDistrict,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "urban district"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "territory contiguous to and including any street built up with structures devoted to business, industry or dwelling houses situated at intervals of less than 100 feet for a distance of a quarter of a mile or more"}})

(def UtilityPole
  "tall pole that is used to support telephone wires, electrical wires, etc"
  {:db/ident :auto-ev/UtilityPole,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "utility pole"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "tall pole that is used to support telephone wires, electrical wires, etc"}})

(def WarningRoadSign
  "sign used to indicate conditions that are actually or potentially hazardous to users of the road"
  {:db/ident :auto-ev/WarningRoadSign,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Warning sign"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "warning road sign"},
   :rdfs/subClassOf :auto-ev/RoadSign,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "sign used to indicate conditions that are actually or potentially hazardous to users of the road"}})

(def Waterway
  "A transport way reserved primarily for use by watercraft."
  {:db/ident :auto-ev/Waterway,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.1.10",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "waterway"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A transport way reserved primarily for use by watercraft."}})

(def WorkZone
  "An area of a trafficway where construction, maintenance or utility work activities are identified by warning signs/signals/indicators, including those on transport devices (e.g., signs, flashing lights, channelizing devices, barriers, pavement markings, flagmen, warning signs and arrow boards mounted on the vehicles in a mobile maintenance activity) that mark the beginning and end of a construction, maintenance or utility work activity."
  {:db/ident :auto-ev/WorkZone,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.24",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "It extends from the first warning sign, signal or flashing lights to the END ROAD WORK sign or the last traffic control device pertinent for that work activity. Work zones also include roadway sections where there is ongoing, moving (mobile) work activity such as lane line painting or roadside mowing only if the beginning of the ongoing, moving (mobile) work activity is designated by warning signs or signals."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "work zone"},
   :rdfs/subClassOf :auto-ev/Infrastructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An area of a trafficway where construction, maintenance or utility work activities are identified by warning signs/signals/indicators, including those on transport devices (e.g., signs, flashing lights, channelizing devices, barriers, pavement markings, flagmen, warning signs and arrow boards mounted on the vehicles in a mobile maintenance activity) that mark the beginning and end of a construction, maintenance or utility work activity."}})

(def address
  "relates an infrastructure to its address"
  {:db/ident :auto-ev/address,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-ev/Infrastructure,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "address",
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates an infrastructure to its address"}})

(def adminArea
  "relates a node, an infrastructure or a natural place to its administrative area"
  {:db/ident :auto-ev/adminArea,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "admin area",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a node, an infrastructure or a natural place to its administrative area"}})

(def allowLaneChange
  "indicates whether a vehicle can change lanes"
  {:db/ident :auto-ev/allowLaneChange,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "allow lane change",
   :rdfs/range :xsd/boolean,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "indicates whether a vehicle can change lanes"}})

(def allowedDir
  "allowed direction"
  {:db/ident :auto-ev/allowedDir,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-ev/Lane,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "allowed direction",
   :rdfs/subPropertyOf :owl/topDataProperty})

(def alt
  "relates a vehicle or a node to its altitude expressed in meters"
  {:db/ident :auto-ev/alt,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "altitude",
   :rdfs/range :xsd/decimal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a vehicle or a node to its altitude expressed in meters"}})

(def angle
  "angle"
  {:db/ident :auto-ev/angle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-ev/TrafficSignal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "angle",
   :rdfs/range :xsd/decimal})

(def boundCoordinate
  "bound coordinate"
  {:db/ident :auto-ev/boundCoordinate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "bound coordinate"})

(def boundPos
  "relates a junction or a road segment with its boundary GPS point"
  {:db/ident :auto-ev/boundPos,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "bound position",
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a junction or a road segment with its boundary GPS point"}})

(def brand
  "relates a material entity to its brand"
  {:db/ident :auto-ev/brand,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "brand",
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a material entity to its brand"}})

(def curve_id
  "curve ID"
  {:db/ident :auto-ev/curve_id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "curve ID",
   :rdfs/range :xsd/string})

(def drivingDir
  "relates a lane to its driving direction"
  {:db/ident :auto-ev/drivingDir,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-ev/Lane,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "driving direction",
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a lane to its driving direction"}})

(def enterPos
  "enter position"
  {:db/ident :auto-ev/enterPos,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-ev/Lane,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "enter position",
   :rdfs/subPropertyOf :owl/topDataProperty})

(def exitPos
  "exit position"
  {:db/ident :auto-ev/exitPos,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-ev/Lane,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "exit position",
   :rdfs/subPropertyOf :owl/topDataProperty})

(def goStraightTo
  "relates a vehicle to a road part straight of him, onto which it should go when changing lanes"
  {:db/ident :auto-ev/goStraightTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "go straight to"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a vehicle to a road part straight of him, onto which it should go when changing lanes"}})

(def hasCar
  "has car"
  {:db/ident :auto-ev/hasCar,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has car"}})

(def hasIntersection
  "relates a road type to an intersection"
  {:db/ident :auto-ev/hasIntersection,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-ev/RoadType,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has intersection"},
   :rdfs/range :auto-ev/Intersection,
   :rdfs/subPropertyOf :auto-ev/hasJunction,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a road type to an intersection"}})

(def hasJunction
  "relates a road type to a junction"
  {:db/ident :auto-ev/hasJunction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "has junction",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a road type to a junction"}})

(def hasLane
  "relates a road segment to a lane it contains"
  {:db/ident :auto-ev/hasLane,
   :owl/inverseOf :auto-ev/isLaneOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-ev/RoadSegment,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has lane"},
   :rdfs/range :auto-ev/Lane,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "relates a road segment to a lane it contains"}})

(def hasRoadSegment
  "relates a road part to a road segment it contains"
  {:db/ident :auto-ev/hasRoadSegment,
   :owl/inverseOf :auto-ev/isRoadSegmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has road segment"},
   :rdfs/range :auto-ev/RoadSegment,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "relates a road part to a road segment it contains"}})

(def isConnectedTo
  "relates a road to a road connected to it"
  {:db/ident :auto-ev/isConnectedTo,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is connected to"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a road to a road connected to it"}})

(def isEmpty
  "indicates whether a given road part is empty"
  {:db/ident :auto-ev/isEmpty,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-ev/RoadPart,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "is empty",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "indicates whether a given road part is empty"}})

(def isLaneOf
  "relates a lane to a road segment which contains said lane"
  {:db/ident :auto-ev/isLaneOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-ev/Lane,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is lane of"},
   :rdfs/range :auto-ev/RoadSegment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "relates a lane to a road segment which contains said lane"}})

(def isLeftOf
  "is left of"
  {:db/ident :auto-ev/isLeftOf,
   :owl/inverseOf :auto-ev/isRightOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is left of"}})

(def isNextTo
  "relates a lane to a lane next to it"
  {:db/ident :auto-ev/isNextTo,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/domain :auto-ev/Lane,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is next to"},
   :rdfs/range :auto-ev/Lane,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a lane to a lane next to it"}})

(def isOn
  "is on"
  {:db/ident :auto-ev/isOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is on"}})

(def isRightOf
  "is right of"
  {:db/ident :auto-ev/isRightOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is right of"}})

(def isRoadSegmentOf
  "relates a road segment to its road part"
  {:db/ident :auto-ev/isRoadSegmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-ev/RoadSegment,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is road segment of"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a road segment to its road part"}})

(def lat
  "relates a vehicle or a node to its latitude"
  {:db/ident :auto-ev/lat,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "latitude",
   :rdfs/range :xsd/decimal,
   :skos/definition {:rdf/language "en",
                     :rdf/value "relates a vehicle or a node to its latitude"}})

(def loc_x
  "relates a node to its x coordinate"
  {:db/ident :auto-ev/loc_x,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "location x",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a node to its x coordinate"}})

(def loc_y
  "relates a node to its y coordinate"
  {:db/ident :auto-ev/loc_y,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "location y",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a node to its y coordinate"}})

(def loc_z
  "relates a node to its z coordinate"
  {:db/ident :auto-ev/loc_z,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "location z",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a node to its z coordinate"}})

(def lon
  "relates a vehicle or a node to its longitude"
  {:db/ident :auto-ev/lon,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "longitude",
   :rdfs/range :xsd/decimal,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "relates a vehicle or a node to its longitude"}})

(def name
  "relates something to its name"
  {:db/ident :auto-ev/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "name",
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates something to its name"}})

(def nearTo
  "near to"
  {:db/ident :auto-ev/nearTo,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "near to"}})

(def opening_hours
  "relates an infrastructure or a natural place to the hours during which it is open"
  {:db/ident :auto-ev/opening_hours,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "opening hours",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates an infrastructure or a natural place to the hours during which it is open"}})

(def operator
  "operator"
  {:db/ident :auto-ev/operator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-ev/Infrastructure,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "operator",
   :rdfs/range :xsd/string})

(def orientation
  "orientation"
  {:db/ident :auto-ev/orientation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "orientation",
   :rdfs/subPropertyOf :owl/topDataProperty})

(def osm_node_id
  "relates a node to its OpenStreetMap ID"
  {:db/ident :auto-ev/osm_node_id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-ev/Node,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "OSM node ID",
   :rdfs/range :xsd/integer,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a node to its OpenStreetMap ID"}})

(def osm_ref
  "links a road individual to OpenStreetMap map entity"
  {:db/ident :auto-ev/osm_ref,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "OSM refrence",
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "links a road individual to OpenStreetMap map entity"}})

(def osm_way_id
  "relates a way to its OpenStreetMap ID"
  {:db/ident :auto-ev/osm_way_id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "OSM way ID",
   :rdfs/range :xsd/integer,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a way to its OpenStreetMap ID"}})

(def phone
  "relates an infrastructure to its phone number"
  {:db/ident :auto-ev/phone,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "phone",
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "relates an infrastructure to its phone number"}})

(def postcode
  "relates an infrastructure to its postal code"
  {:db/ident :auto-ev/postcode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "postcode",
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "relates an infrastructure to its postal code"}})

(def pubFacAdmin
  "pub fac admin"
  {:db/ident :auto-ev/pubFacAdmin,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "pub fac admin"})

(def relatedTrafficLight
  "links a driver to the traffic lights they should observe on a lane"
  {:db/ident :auto-ev/relatedTrafficLight,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "related traffic light"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "links a driver to the traffic lights they should observe on a lane"}})

(def river_id
  "relates a river to its ID"
  {:db/ident :auto-ev/river_id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-ev/River,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "river ID",
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a river to its ID"}})

(def speedMax
  "relates a lane to the maximum speed a vehicle can legally drive at while on it"
  {:db/ident :auto-ev/speedMax,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "speed max",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :owl/topDataProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a lane to the maximum speed a vehicle can legally drive at while on it"}})

(def turnLeftTo
  "relates a vehicle to a road part left of him, onto which it should go when changing lanes"
  {:db/ident :auto-ev/turnLeftTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "turn left to"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a vehicle to a road part left of him, onto which it should go when changing lanes"}})

(def turnRightTo
  "relates a vehicle to a road part right of him, onto which it should go when changing lanes"
  {:db/ident :auto-ev/turnRightTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "turn right to"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a vehicle to a road part right of him, onto which it should go when changing lanes"}})

(def website
  "relates an infrastructure or a natural place to its website"
  {:db/ident :auto-ev/website,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficEnvironment/",
   :rdfs/label "website",
   :rdfs/range :xsd/anyURI,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "relates an infrastructure or a natural place to its website"}})