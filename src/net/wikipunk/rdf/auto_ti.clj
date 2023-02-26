(ns net.wikipunk.rdf.auto-ti
  "The Traffic Incident Ontology (TI) is an ontology for traffic incidents. In part, it is based on the Classification of Motor Vehicle Traffic Crashes (AMERICAN NATIONAL STANDARD, ANSI D.16-2017)."
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "The Traffic Incident Ontology (TI) is an ontology for traffic incidents.\n\nIn part, it is based on the Classification of Motor Vehicle Traffic Crashes (AMERICAN NATIONAL STANDARD, ANSI D.16-2017)."},
   :dcterms/creator "Piotr Kulicki",
   :dcterms/license "http://creativecommons.org/licenses/by/3.0/",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/auto/ontology/master/latest/VC/VehicleCore/"
    "https://spec.edmcouncil.org/auto/ontology/master/latest/MO/MiddleOntology/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"],
   :rdf/ns-prefix-map
   {"auto-ti" "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "auto-ti",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label "Traffic incident ontology (TI)",
   :sm/fileAbbreviation "auto-de-ti",
   :sm/filename "TrafficIncidents.rdf"})

(def Accident
  "something bad that happens that is not expected or intended and that often damages something or injures someone"
  {:db/ident :auto-ti/Accident,
   :owl/disjointWith :auto-ti/Collision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "wypadek"}
                {:rdf/language "en",
                 :rdf/value    "accident"}],
   :rdfs/subClassOf [{:owl/unionOf [{:owl/onProperty     :auto-ti/hasEffect,
                                     :owl/someValuesFrom :auto-ti/Death,
                                     :rdf/type           :owl/Restriction}
                                    {:owl/onProperty :auto-ti/hasEffect,
                                     :owl/someValuesFrom
                                     :auto-ti/DestructionOfProperty,
                                     :rdf/type :owl/Restriction}
                                    {:owl/onProperty     :auto-ti/hasEffect,
                                     :owl/someValuesFrom :auto-ti/Victim,
                                     :rdf/type           :owl/Restriction}],
                      :rdf/type    :owl/Class}
                     :auto-ti/TrafficIncident],
   :skos/definition
   [{:rdf/language "pl",
     :rdf/value
     "zdarzenie w ruchu drogowym, gdzie jeden lub więcej uczestników ruchu drogowego bierze udział w zdarzeniu, w wyniku którego uczestnik ruchu drogowego został ranny lub doszło do jego śmierci."}
    {:rdf/language "en",
     :rdf/value
     "something bad that happens that is not expected or intended and that often damages something or injures someone"}]})

(def AircraftAccident
  "A transport accident that involves an aircraft in-transport."
  {:db/ident :auto-ti/AircraftAccident,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.10",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "aircraft accident"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A transport accident that involves an aircraft in-transport."}})

(def At-IntersectionCrash
  "A traffic crash in which the first harmful event occurs within the limits of an intersection."
  {:db/ident :auto-ti/At-IntersectionCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.7.3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "at-intersection crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A traffic crash in which the first harmful event occurs within the limits of an intersection."}})

(def AtWork
  "Engaged in duties, activities or tasks that produce a product or service; that are done in exchange for money, goods, services, profit or benefit; and that are legal activities in the United States."
  {:db/ident :auto-ti/AtWork,
   :fibo-fnd-utl-av/adaptedFrom {:rdf/language "en",
                                 :rdf/value    "ANSI D.16-2017, section 2.9.6"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This definition is adapted from the definition used in the Census of Fatal Occupational Injuries program at the Bureau of Labor Statistics."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "at work"},
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Engaged in duties, activities or tasks that produce a product or service; that are done in exchange for money, goods, services, profit or benefit; and that are legal activities in the United States."}})

(def Cataclysm
  "An avalanche, landslide/mudslide, hurricane, cyclone, downburst, flood, torrential rain, cloudburst, lightning, tornado, tidal wave, earthquake or volcanic eruption (See 2.4.9 transport crash)."
  {:db/ident :auto-ti/Cataclysm,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.5",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cataclysm"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An avalanche, landslide/mudslide, hurricane, cyclone, downburst, flood, torrential rain, cloudburst, lightning, tornado, tidal wave, earthquake or volcanic eruption (See 2.4.9 transport crash)."}})

(def Collision
  "occurs when a vehicle that is moving along a roadway collides with another vehicle or object"
  {:db/ident :auto-ti/Collision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "kolizja"}
                {:rdf/language "en",
                 :rdf/value    "collision"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-ti/DestructionOfProperty,
                      :owl/onProperty    :auto-ti/hasEffect,
                      :rdf/type          :owl/Restriction}
                     :auto-ti/TrafficIncident],
   :skos/definition
   [{:rdf/language "pl",
     :rdf/value
     "występuje, gdy pojazd poruszający się po jezdni zderza się z innym pojazdem lub przedmiotem"}
    {:rdf/language "en",
     :rdf/value
     "occurs when a vehicle that is moving along a roadway collides with another vehicle or object"}]})

(def CollisionCrash
  "A road vehicle crash other than an overturning crash in which the first harmful event is a collision of a road vehicle in-transport with another road vehicle, other property or pedestrians."
  {:db/ident :auto-ti/CollisionCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A road vehicle crash other than an overturning crash in which the first harmful event is a collision of a road vehicle in-transport with another road vehicle, other property or pedestrians."}})

(def CollisionInvolvingMotorVehicleInTransport
  "A crash that is both a motor vehicle crash and a collision crash in which the first harmful event is the collision of two or more motor vehicles in-transport."
  {:db/ident :auto-ti/CollisionInvolvingMotorVehicleInTransport,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.6",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision involving motor vehicle in-transport"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A crash that is both a motor vehicle crash and a collision crash in which the first harmful event is the collision of two or more motor vehicles in-transport."}})

(def CollisionInvolvingOtherRoadVehicleInTransport
  "A crash that is both an other-road vehicle crash and a collision crash in which the first harmful event is the collision of two or more other road vehicles in-transport."
  {:db/ident :auto-ti/CollisionInvolvingOtherRoadVehicleInTransport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "collision involving other road vehicle in transport"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A crash that is both an other-road vehicle crash and a collision crash in which the first harmful event is the collision of two or more other road vehicles in-transport."}})

(def CollisioninvolvingAnimal
  "A collision crash in which the first harmful event is the collision of an animal, other than an animal powering an other road vehicle, and a road vehicle in-transport."
  {:db/ident :auto-ti/CollisioninvolvingAnimal,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.11",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision involving animal"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A collision crash in which the first harmful event is the collision of an animal, other than an animal powering an other road vehicle, and a road vehicle in-transport."}})

(def CollisioninvolvingFixedObject
  "A collision crash in which the first harmful event is the striking of a fixed object by a road vehicle in- transport."
  {:db/ident :auto-ti/CollisioninvolvingFixedObject,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.12",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Fixed objects include such objects as guardrails, bridge railings or abutments, construction barricades, impact attenuators, trees, embedded rocks, utility poles, ditches, steep earth or rock slopes, culverts, fences and buildings."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision involving fixed object"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A collision crash in which the first harmful event is the striking of a fixed object by a road vehicle in- transport."}})

(def CollisioninvolvingOtherObject
  "Any collision crash other than a (1) collision involving pedestrian, (2) collision involving motor vehicle in-transport, (3) collision involving other road vehicle in-transport, (4) collision involving parked motor vehicle, (5) collision involving railway vehicle, (6) collision involving pedalcycle, (7) collision involving animal, or (8) collision involving fixed object."
  {:db/ident :auto-ti/CollisioninvolvingOtherObject,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.13",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision involving other object"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any collision crash other than a (1) collision involving pedestrian, (2) collision involving motor vehicle in-transport, (3) collision involving other road vehicle in-transport, (4) collision involving parked motor vehicle, (5) collision involving railway vehicle, (6) collision involving pedalcycle, (7) collision involving animal, or (8) collision involving fixed object."}})

(def CollisioninvolvingOtherRoadVehicle
  "A collision involving other road vehicle in- in Transport transport is a crash that is both an other-road- vehicle crash and a collision crash in which the first harmful event is the collision of two or more other road vehicles in-transport."
  {:db/ident :auto-ti/CollisioninvolvingOtherRoadVehicle,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.7",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision involving other road vehicle"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A collision involving other road vehicle in- in Transport transport is a crash that is both an other-road- vehicle crash and a collision crash in which the first harmful event is the collision of two or more other road vehicles in-transport."}})

(def CollisioninvolvingParkedMotor
  "A crash in which the first harmful event is the striking of a motor vehicle not in- transport (See 2.2.34.1) by a road vehicle in- transport (See 2.2.34)."
  {:db/ident :auto-ti/CollisioninvolvingParkedMotor,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.8",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision involving parked motor"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A crash in which the first harmful event is the striking of a motor vehicle not in- transport (See 2.2.34.1) by a road vehicle in- transport (See 2.2.34)."}})

(def CollisioninvolvingPedalcycle
  "A crash that is both a motor vehicle crash and a collision crash in which the first harmful event is the collision of a pedalcycle in-transport and a motor vehicle in- transport."
  {:db/ident :auto-ti/CollisioninvolvingPedalcycle,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.10",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision involving pedalcycle"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A crash that is both a motor vehicle crash and a collision crash in which the first harmful event is the collision of a pedalcycle in-transport and a motor vehicle in- transport."}})

(def CollisioninvolvingPedestrianCrash
  "A collision crash in which the first harmful event is the collision of a pedestrian and a road vehicle in- transport."
  {:db/ident :auto-ti/CollisioninvolvingPedestrianCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.5",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision involving pedestrian crash"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A collision crash in which the first harmful event is the collision of a pedestrian and a road vehicle in- transport."}})

(def CollisioninvolvingRailwayVehicle
  "A collision crash in which the first harmful event is the collision of a road vehicle in-transport and a railway vehicle."
  {:db/ident :auto-ti/CollisioninvolvingRailwayVehicle,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.9",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision involving railway vehicle"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A collision crash in which the first harmful event is the collision of a road vehicle in-transport and a railway vehicle."}})

(def Commerce
  "Any trade, traffic or transportation of commodities or persons for financial consideration or exchange, or in the furtherance of a business enterprise."
  {:db/ident :auto-ti/Commerce,
   :fibo-fnd-utl-av/adaptedFrom {:rdf/language "en",
                                 :rdf/value    "ANSI D.16-2017, section 2.9.1"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commerce"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any trade, traffic or transportation of commodities or persons for financial consideration or exchange, or in the furtherance of a business enterprise."}})

(def ContactVehicle
  "Any road vehicle which comes in contact with one or more road vehicles, non-motorists or property in a collision crash, or has a noncollision crash."
  {:db/ident :auto-ti/ContactVehicle,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.7",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A contact vehicle is directly involved in a crash. (See 2.6.2 Collision crash and 2.6.3 Noncollision crash.)"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contact vehicle"},
   :rdfs/subClassOf :auto-ti/RoleInAccident,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any road vehicle which comes in contact with one or more road vehicles, non-motorists or property in a collision crash, or has a noncollision crash."}})

(def Crash
  "An unstabilized situation which includes at least one harmful event."
  {:db/ident :auto-ti/Crash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.6",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "crash"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An unstabilized situation which includes at least one harmful event."}})

(def Damage
  "A harm to property that reduces the monetary value of that property."
  {:db/ident :auto-ti/Damage,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.7",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "damage"},
   :rdfs/subClassOf :auto-ti/HarmfulEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A harm to property that reduces the monetary value of that property."}})

(def DangerousBehaviour
  "action by a traffic user which results in a traffic incident"
  {:db/ident :auto-ti/DangerousBehaviour,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "niebezpieczne zachowanie"}
                {:rdf/language "en",
                 :rdf/value    "dangerous behaviour"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/hasEffect,
                      :owl/someValuesFrom :auto-ti/TrafficIncident,
                      :rdf/type           :owl/Restriction}
                     :auto-ti/TrafficIncidentCauses],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "action by a traffic user which results in a traffic incident"}})

(def DangerousOvertaking
  "action in which a traffic user overtakes another vehicle in a way that leads to an incident"
  {:db/ident :auto-ti/DangerousOvertaking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "niebezpiecznie wyprzedzanie"}
                {:rdf/language "en",
                 :rdf/value    "dangerous overtaking"}],
   :rdfs/subClassOf :auto-ti/DangerousBehaviour,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action in which a traffic user overtakes another vehicle in a way that leads to an incident"}})

(def Death
  "a process leading to the cessation of all vital functions of the body as a result of irreversible inhibition of biological reactions in its cells"
  {:db/ident :auto-ti/Death,
   :owl/disjointWith [:auto-ti/Victim :auto-ti/DestructionOfProperty],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "śmierć"}
                {:rdf/language "en",
                 :rdf/value    "death"}],
   :rdfs/subClassOf :auto-ti/TrafficIncidentEffect,
   :skos/definition
   [{:rdf/language "pl",
     :rdf/value
     "proces prowadzący do ustania wszelkich funkcji życiowych organizmu w wyniku nieodwracalnego zahamowania reakcji biologicznych w jego komórkach."}
    {:rdf/language "en",
     :rdf/value
     "a process leading to the cessation of all vital functions of the body as a result of irreversible inhibition of biological reactions in its cells"}]})

(def DeliberateIntent
  "The classification given to the cause of an event which occurs when a person acts deliberately to cause the event or deliberately refrains from prudent acts which would prevent occurrence of the event."
  {:db/ident :auto-ti/DeliberateIntent,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deliberate intent"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The classification given to the cause of an event which occurs when a person acts deliberately to cause the event or deliberately refrains from prudent acts which would prevent occurrence of the event."}})

(def DestructionOfProperty
  "damage to or the destruction of public or private property, caused either by a person who is not its owner or by natural phenomena"
  {:db/ident :auto-ti/DestructionOfProperty,
   :owl/disjointWith :auto-ti/Victim,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "zniszczenie mienia"}
                {:rdf/language "en",
                 :rdf/value    "destruction of property"}],
   :rdfs/subClassOf :auto-ti/TrafficIncidentEffect,
   :skos/definition
   [{:rdf/language "pl",
     :rdf/value
     "uszkodzenie lub zniszczenie własności publicznej lub prywatnej, spowodowane przez osobę niebędącą jej właścicielem lub przez zjawiska naturalne."}
    {:rdf/language "en",
     :rdf/value
     "damage to or the destruction of public or private property, caused either by a person who is not its owner or by natural phenomena"}]})

(def DisablingDamage
  "A road vehicle damage which precludes departure of the vehicle from the scene of the crash in its usual operating manner by daylight after simple repairs."
  {:db/ident :auto-ti/DisablingDamage,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.11",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "disabling damage"},
   :rdfs/subClassOf :auto-ti/RoadVehicleDamage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A road vehicle damage which precludes departure of the vehicle from the scene of the crash in its usual operating manner by daylight after simple repairs."}})

(def DistanceBack
  "distance back"
  {:db/ident :auto-ti/DistanceBack,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "distance back"}})

(def DistanceFront
  "distance front"
  {:db/ident :auto-ti/DistanceFront,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "distance front"}})

(def Driver
  "An occupant who is in actual physical control of a transport vehicle or, for an out-of control vehicle, an occupant who was in control until control was lost."
  {:db/ident :auto-ti/Driver,
   :fibo-fnd-utl-av/adaptedFrom {:rdf/language "en",
                                 :rdf/value "ANSI D.16-2017, section 2.2.37"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driver"},
   :rdfs/subClassOf :auto-ti/RoleOfPersonInTraffic,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An occupant who is in actual physical control of a transport vehicle or, for an out-of control vehicle, an occupant who was in control until control was lost."}})

(def DrivewayAccess-RelatedCrash
  "A traffic crash that (1) occurs adjacent to a driveway, (2) is not a driveway access crash and (3) results from an activity, behavior or control related to the movement of traffic units onto or out of a driveway."
  {:db/ident :auto-ti/DrivewayAccess-RelatedCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.7.4.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driveway access-related crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A traffic crash that (1) occurs adjacent to a driveway, (2) is not a driveway access crash and (3) results from an activity, behavior or control related to the movement of traffic units onto or out of a driveway."}})

(def DrivewayTowawayOperation
  "operation in which an empty or unladen motor vehicle with one or more sets of wheels on the surface of the roadway is being transported by means of a saddle-mount or tow-bar between vehicle manufacturer's facilities, a vehicle manufacturer and a dealership or purchaser or to a repair facility"
  {:db/ident :auto-ti/DrivewayTowawayOperation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driveway-towaway operation"},
   :rdfs/subClassOf :auto-mo/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "operation in which an empty or unladen motor vehicle with one or more sets of wheels on the surface of the roadway is being transported by means of a saddle-mount or tow-bar between vehicle manufacturer's facilities, a vehicle manufacturer and a dealership or purchaser or to a repair facility"}})

(def DrivewayaccessCrash
  "A traffic crash in which the first harmful event occurs on a driveway access (See 2.5.9) or involves a road vehicle entering or leaving another roadway by way of a driveway access (See Figure 4)."
  {:db/ident :auto-ti/DrivewayaccessCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.7.4",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This requires at least one traffic unit (vehicle, pedalcyclist or pedestrian) to be physically on the driveway access within the trafficway."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driveway access crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A traffic crash in which the first harmful event occurs on a driveway access (See 2.5.9) or involves a road vehicle entering or leaving another roadway by way of a driveway access (See Figure 4)."}})

(def DrivingUnderTheInfluence
  "driving motor or non-mechanical vehicles during or after consuming alcohol or psychoactive substances"
  {:db/ident :auto-ti/DrivingUnderTheInfluence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "prowadzenie pojazdu w stanie nietrzeźwości"}
                {:rdf/language "en",
                 :rdf/value    "driving under the influence"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/isOffenceOf,
                      :owl/someValuesFrom :auto-ti/TrafficViolation,
                      :rdf/type           :owl/Restriction}
                     :auto-ti/DangerousBehaviour],
   :skos/definition
   [{:rdf/language "pl",
     :rdf/value
     "prowadzenie pojazdów mechanicznych albo innych niż mechaniczne w okresie spożywania lub po spożyciu alkoholu lub substancji psychoaktywnych"}
    {:rdf/language "en",
     :rdf/value
     "driving motor or non-mechanical vehicles during or after consuming alcohol or psychoactive substances"}]})

(def Entrance-ExitRamp-relatedCrash
  "A traffic crash in which the first harmful event occurs off the entrance/exit ramp roadway, but is related to the use of or entry onto the ramp."
  {:db/ident :auto-ti/Entrance-ExitRamp-relatedCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.7.9.1",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the first harmful event occurs in the intersection of a ramp and a surface roadway, then it would be classified under 2.7.3 – at-intersection crash."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "entrance/exit ramp-related crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A traffic crash in which the first harmful event occurs off the entrance/exit ramp roadway, but is related to the use of or entry onto the ramp."}})

(def Entrance-ExitRampCrash
  "A traffic crash in which the first harmful event occurs on an entrance or exit ramp roadway and is not the result of an activity, behavior or control related to the movement of traffic units through an intersection."
  {:db/ident :auto-ti/Entrance-ExitRampCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.7.9",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This would include all the areas between the gore and termination of the entrance/exit ramp."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "entrance/exit ramp crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A traffic crash in which the first harmful event occurs on an entrance or exit ramp roadway and is not the result of an activity, behavior or control related to the movement of traffic units through an intersection."}})

(def EntryOnRedLight
  "action of crossing the pedestrian crossing while the traffic light is red"
  {:db/ident :auto-ti/EntryOnRedLight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "wejście na czerwonym świetle"}
                {:rdf/language "en",
                 :rdf/value    "entry on red light"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/isOffenceOf,
                      :owl/someValuesFrom :auto-ti/TrafficViolation,
                      :rdf/type           :owl/Restriction}
                     :auto-ti/DangerousBehaviour],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action of crossing the pedestrian crossing while the traffic light is red"}})

(def Fainting
  "short-term loss of consciousness due to transient global decrease in cerebral perfusion. It is characterized by rapid development of symptoms up to complete loss of consciousness, short duration, and spontaneous and full recovery."
  {:db/ident :auto-ti/Fainting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "omdlenie"}
                {:rdf/language "en",
                 :rdf/value    "fainting"}],
   :rdfs/subClassOf :auto-ti/TrafficIncidentCauses,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "short-term loss of consciousness due to transient global decrease in cerebral perfusion. It is characterized by rapid development of symptoms up to complete loss of consciousness, short duration, and spontaneous and full recovery."}
    "krótkotrwała utrata przytomności wywołana przejściowym globalnym zmniejszeniem perfuzji mózgowej. Charakteryzuje się szybkim rozwojem objawów aż do zupełnej utraty przytomności, krótkim czasem trwania oraz samoistnym i pełnym odzyskaniem przytomności."]})

(def FarmVehicleDriver
  "farmer who drives a commercial motor vehicle that is used within 150 air-miles of their farm to transport agricultural products, farm machinery, farm supplies, or both, to or from a farm"
  {:db/ident :auto-ti/FarmVehicleDriver,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "farm vehicle driver"},
   :rdfs/subClassOf :auto-ti/Driver,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "farmer who drives a commercial motor vehicle that is used within 150 air-miles of their farm to transport agricultural products, farm machinery, farm supplies, or both, to or from a farm"}})

(def FatalCrash
  "Any injury crash that results in one or more fatal injuries."
  {:db/ident :auto-ti/FatalCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.27",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fatal crash"},
   :rdfs/subClassOf :auto-ti/InjuryCrash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Any injury crash that results in one or more fatal injuries."}})

(def FatalInjury
  "Any injury that results in death within 30 days after the motor vehicle crash in which the injury occurred."
  {:db/ident :auto-ti/FatalInjury,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "K"},
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.2",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the person did not die at the scene but died within 30 days of the motor vehicle crash in which the injury occurred, the injury classification should be changed from the attribute previously assigned to the attribute \"Fatal injury\" 2.3.3 Fatality A fatality is any death resulting from a fatal injury (See 3.1.3)."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fatal injury"},
   :rdfs/subClassOf :auto-ti/Injury,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any injury that results in death within 30 days after the motor vehicle crash in which the injury occurred."}})

(def Fatality
  "Any death resulting from a fatal injury."
  {:db/ident :auto-ti/Fatality,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 3.1.3.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fatality"},
   :rdfs/subClassOf :auto-ti/HarmfulEvent,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Any death resulting from a fatal injury."}})

(def ForcingTheRightOfWay
  "refraining from traffic if this traffic may force another driver to change direction or lane or change the speed significantly and to stop, slow down or accelerate by pedestrians"
  {:db/ident :auto-ti/ForcingTheRightOfWay,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "wymuszenie pierwszeństwa"}
                {:rdf/language "en",
                 :rdf/value    "forcing the right of way"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/isOffenceOf,
                      :owl/someValuesFrom :auto-ti/TrafficViolation,
                      :rdf/type           :owl/Restriction}
                     :auto-ti/DangerousBehaviour],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "refraining from traffic if this traffic may force another driver to change direction or lane or change the speed significantly and to stop, slow down or accelerate by pedestrians"}
    {:rdf/language "pl",
     :rdf/value
     "niepowstrzymanie się od ruchu, jeżeli ruch mógłby zmusić innego kierującego do zmiany kierunku lub pasa ruchu albo istotnej zmiany prędkości, a pieszego - do zatrzymania się, zwolnienia lub przyspieszenia kroku"}]})

(def FunctionalDamage
  "Any road vehicle damage, other than disabling damage, which affects operation of the road vehicle or its parts."
  {:db/ident :auto-ti/FunctionalDamage,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.12",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "functional damage"},
   :rdfs/subClassOf :auto-ti/RoadVehicleDamage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any road vehicle damage, other than disabling damage, which affects operation of the road vehicle or its parts."}})

(def HarmfulEvent
  "An occurrence of injury or damage."
  {:db/ident :auto-ti/HarmfulEvent,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "harmful event"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An occurrence of injury or damage."}})

(def HazardousMaterial
  "A substance or material which has been designated by the U.S. Department of Transportation, or other authorizing entity, as capable of posing an unreasonable risk to health, safety and property when transported in commerce."
  {:db/ident :auto-ti/HazardousMaterial,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.9.5",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Any motor vehicle transporting quantities of hazardous materials in quantities above the thresholds established by the U.S. Department of Transportation, or other authorized entity, is required to display a hazardous materials placard."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hazardous material"},
   :rdfs/subClassOf :auto-mo/MaterialEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A substance or material which has been designated by the U.S. Department of Transportation, or other authorizing entity, as capable of posing an unreasonable risk to health, safety and property when transported in commerce."}})

(def HazardousMaterialsPlacard
  "A sign required to be affixed to any motor vehicle transporting quantities of hazardous materials in quantities above the thresholds established by the U.S. Department of Transportation, or other authorized entity."
  {:db/ident :auto-ti/HazardousMaterialsPlacard,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.9.5.1",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This placard identifies the hazard class division number, 4-digit hazardous material identification number, or name of the hazardous material being transported."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hazardous materials placard"},
   :rdfs/subClassOf :auto-mo/MaterialEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A sign required to be affixed to any motor vehicle transporting quantities of hazardous materials in quantities above the thresholds established by the U.S. Department of Transportation, or other authorized entity."}})

(def In-transport
  "The state or condition of a transport vehicle which is in motion or within the portion of a transport way ordinarily used by similar transport vehicles."
  {:db/ident :auto-ti/In-transport,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.34",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "When applied to motor vehicles, “ in-transport '' means on a roadway or in motion within or outside the trafficway. A transport vehicle which is also a working motor vehicle at the time of the unstabilized situation is not `` in-transport. '' In roadway lanes used for travel during some periods and for parking during other periods, a parked motor vehicle should be considered to be in-transport during periods when parking is forbidden."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in-transport"},
   :rdfs/subClassOf :auto-ti/State,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The state or condition of a transport vehicle which is in motion or within the portion of a transport way ordinarily used by similar transport vehicles."}})

(def Injury
  "A bodily harm to a person."
  {:db/ident :auto-ti/Injury,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "injury"},
   :rdfs/subClassOf :auto-ti/HarmfulEvent,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A bodily harm to a person."}})

(def InjuryCrash
  "Any road vehicle crash that results in one or more injuries."
  {:db/ident :auto-ti/InjuryCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.26",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "injury crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Any road vehicle crash that results in one or more injuries."}})

(def InoperativeVehicle
  "state of a vehicle in which some or all of its functions do not work"
  {:db/ident :auto-ti/InoperativeVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "niesprawny pojazd"}
                {:rdf/language "en",
                 :rdf/value    "inoperative vehicle"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/isOffenceOf,
                      :owl/someValuesFrom :auto-ti/TrafficViolation,
                      :rdf/type           :owl/Restriction}
                     :auto-ti/TrafficIncidentCauses],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "state of a vehicle in which some or all of its functions do not work"}})

(def InterchangeCrash
  "A traffic crash in which the first harmful event occurs within boundaries which include all ramps of auxiliary roadways and include each roadway entering or leaving the interchange to a point 30 meters (100 feet) beyond the gore or curb return at the outermost ramp connection. Interchange crashes may include at-intersection crashes, intersection- related crashes, driveway access crashes or nonjunction crashes."
  {:db/ident :auto-ti/InterchangeCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.7.7",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interchange crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A traffic crash in which the first harmful event occurs within boundaries which include all ramps of auxiliary roadways and include each roadway entering or leaving the interchange to a point 30 meters (100 feet) beyond the gore or curb return at the outermost ramp connection. Interchange crashes may include at-intersection crashes, intersection- related crashes, driveway access crashes or nonjunction crashes."}})

(def Intersection-relatedCrash
  "A traffic crash in which the first harmful event (1) occurs on an approach to or exit from an intersection and (2) results from an activity, behavior or control related to the movement of traffic units through the intersection."
  {:db/ident :auto-ti/Intersection-relatedCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.7.5",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "intersection-related crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A traffic crash in which the first harmful event (1) occurs on an approach to or exit from an intersection and (2) results from an activity, behavior or control related to the movement of traffic units through the intersection."}})

(def InterstateCommerce
  "A commerce in the United States where the transit between the points of origin and termination does not occur entirely within the borders of the state of origin."
  {:db/ident :auto-ti/InterstateCommerce,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.9.2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interstate commerce"},
   :rdfs/subClassOf :auto-ti/Commerce,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A commerce in the United States where the transit between the points of origin and termination does not occur entirely within the borders of the state of origin."}})

(def InterstateSystem
  "The National System of Interstate and Defense Highways as defined in Section 101, Title 23, United States Code."
  {:db/ident :auto-ti/InterstateSystem,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.5.3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interstate system"},
   :rdfs/subClassOf :auto-mo/MaterialEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The National System of Interstate and Defense Highways as defined in Section 101, Title 23, United States Code."}})

(def IntrastateCommerce
  "A commerce in any state where the transit between the points of origin and termination occurs entirely within the borders of the state of origin."
  {:db/ident :auto-ti/IntrastateCommerce,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.9.3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "intrastate commerce"},
   :rdfs/subClassOf :auto-ti/Commerce,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A commerce in any state where the transit between the points of origin and termination occurs entirely within the borders of the state of origin."}})

(def JackknifeCrash
  "A noncollision crash in which the first harmful event results from unintended contact between any two units of a multi-unit road vehicle such as a truck combination."
  {:db/ident :auto-ti/JackknifeCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jackknife crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A noncollision crash in which the first harmful event results from unintended contact between any two units of a multi-unit road vehicle such as a truck combination."}})

(def LegalIntervention
  "A category of deliberate intent in which the person who acts or refrains from acting is a law-enforcing agent or other official."
  {:db/ident :auto-ti/LegalIntervention,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "legal intervention"},
   :rdfs/subClassOf :auto-ti/DeliberateIntent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A category of deliberate intent in which the person who acts or refrains from acting is a law-enforcing agent or other official."}})

(def MotorCarrier
  "The legal business entity, individual, partnership, corporation or organization that directs, controls and is responsible for the transportation of goods, property or people."
  {:db/ident :auto-ti/MotorCarrier,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.9.4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor carrier"},
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The legal business entity, individual, partnership, corporation or organization that directs, controls and is responsible for the transportation of goods, property or people."}})

(def MotorVehicleCrash
  "A transport crash that (1) involves a motor vehicle in-transport, (2) is not an aircraft accident or watercraft accident, and (3) does not include any harmful event involving a railway train in-transport prior to involvement of a motor vehicle in-transport."
  {:db/ident :auto-ti/MotorVehicleCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.12",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor vehicle crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A transport crash that (1) involves a motor vehicle in-transport, (2) is not an aircraft accident or watercraft accident, and (3) does not include any harmful event involving a railway train in-transport prior to involvement of a motor vehicle in-transport."}})

(def MotorVehicleDamage
  "A road vehicle damage to a motor vehicle."
  {:db/ident :auto-ti/MotorVehicleDamage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor vehicle damage"},
   :rdfs/subClassOf :auto-ti/RoadVehicleDamage,
   :skos/definition {:rdf/language "en",
                     :rdf/value "A road vehicle damage to a motor vehicle."}})

(def MotorVehicleNontrafficCrash
  "A motor vehicle crash which is a nontraffic crash."
  {:db/ident :auto-ti/MotorVehicleNontrafficCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.23",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor vehicle nontraffic crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A motor vehicle crash which is a nontraffic crash."}})

(def MotorVehicleTrafficCrash
  "A motor vehicle cash which is a traffic crash."
  {:db/ident :auto-ti/MotorVehicleTrafficCrash,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor vehicle traffic crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A motor vehicle cash which is a traffic crash."}})

(def MotorcycleConversionKit
  "A device that makes it possible to convert a conventional two-wheel motorcycle into a motorcycle having the look and the stability of a tricycle-type vehicle, which improves stability and increases ease of operation."
  {:db/ident :auto-ti/MotorcycleConversionKit,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.9.5",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An original definition from ANSI D.16-2017:\nA motorcycle conversion assembly makes it possible to convert a conventional two-wheel motorcycle into a motorcycle having the look and the stability of a tricycle-type vehicle, which improves stability and increases ease of operation."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motorcycle conversion kit"},
   :rdfs/subClassOf :auto-ti/Property,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A device that makes it possible to convert a conventional two-wheel motorcycle into a motorcycle having the look and the stability of a tricycle-type vehicle, which improves stability and increases ease of operation."}})

(def Motorist
  "Any occupant of a motor vehicle in-transport."
  {:db/ident :auto-ti/Motorist,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.40",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motorist"},
   :rdfs/subClassOf :auto-ti/RoleOfPersonInTraffic,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Any occupant of a motor vehicle in-transport."}})

(def MovementSpeed
  "relates a vehicle to its movement speed"
  {:db/ident :auto-ti/MovementSpeed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "movement speed"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a vehicle to its movement speed"}})

(def MovingObject
  "object which is in motion and changes location"
  {:db/ident :auto-ti/MovingObject,
   :owl/disjointWith :auto-ti/StaticObject,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "obiekt ruchomy"}
                {:rdf/language "en",
                 :rdf/value    "moving object"}],
   :rdfs/subClassOf :auto-ti/OtherObjectsWithWhichCarCanCollide,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "object which is in motion and changes location"}})

(def NoApparentInjury
  "A situation where there is no reason to believe that the person received any bodily harm from the motor vehicle crash. There is no physical evidence of injury and the person does not report any change in normal function."
  {:db/ident :auto-ti/NoApparentInjury,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "O"},
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.6.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "no apparent injury (O)"},
   :rdfs/subClassOf :auto-ti/Injury,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A situation where there is no reason to believe that the person received any bodily harm from the motor vehicle crash. There is no physical evidence of injury and the person does not report any change in normal function."}})

(def NoApparentInjuryCrash
  "Any road vehicle crash other than an injury crash."
  {:db/ident :auto-ti/NoApparentInjuryCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.29",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A no apparent injury crash is also called a property damage only crash."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "no apparent injury crash"},
   :rdfs/subClassOf :auto-ti/Injury,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Any road vehicle crash other than an injury crash."}})

(def Non-contactVehicle
  "Any vehicle other than a contact vehicle."
  {:db/ident :auto-ti/Non-contactVehicle,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.8",
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A noncontact vehicle is indirectly involved in a crash."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non-contact vehicle"},
   :rdfs/subClassOf :auto-ti/RoleInAccident,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Any vehicle other than a contact vehicle."}})

(def Non-fatalInjuryCrash
  "Any injury crash other than a fatal crash."
  {:db/ident :auto-ti/Non-fatalInjuryCrash,
   :fibo-fnd-utl-av/adaptedFrom {:rdf/language "en",
                                 :rdf/value "ANSI D.16-2017, section 2.4.28"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non-fatal injury crash"},
   :rdfs/subClassOf :auto-ti/InjuryCrash,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Any injury crash other than a fatal crash."}})

(def Non-junctionCrash
  "A road vehicle crash that is not an at-intersection crash, a driveway access crash or an intersection-related crash."
  {:db/ident :auto-ti/Non-junctionCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.7.6",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non-junction crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A road vehicle crash that is not an at-intersection crash, a driveway access crash or an intersection-related crash."}})

(def Non-motorist
  "Any person other than a motorist"
  {:db/ident :auto-ti/Non-motorist,
   :fibo-fnd-utl-av/adaptedFrom {:rdf/language "en",
                                 :rdf/value "ANSI D.16-2017, section 2.2.41"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non-motorist"},
   :rdfs/subClassOf :auto-ti/RoleOfPersonInTraffic,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Any person other than a motorist"}})

(def Non-trafficCrash
  "A road vehicle crash which is not a traffic crash."
  {:db/ident :auto-ti/Non-trafficCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.19",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non-traffic crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A road vehicle crash which is not a traffic crash."}})

(def NoncollisionCrash
  "Any road vehicle crash other than a collision crash."
  {:db/ident :auto-ti/NoncollisionCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "noncollision crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Any road vehicle crash other than a collision crash."}})

(def NotAdaptingSpeedToWeatherConditions
  "action of driving at a speed that is inadequate to weather conditions"
  {:db/ident :auto-ti/NotAdaptingSpeedToWeatherConditions,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "not adapting speed to weather conditions"}
                {:rdf/language "pl",
                 :rdf/value
                 "niedostosowanie prędkości do warunków atmosferycznych"}],
   :rdfs/subClassOf :auto-ti/DangerousBehaviour,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action of driving at a speed that is inadequate to weather conditions"}})

(def NotIn-transport
  "The state or condition of a transport vehicle which is not \"in-transport.\""
  {:db/ident :auto-ti/NotIn-transport,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Original definition from ANSI D.16-2017: any transport vehicle which is not \"in-transport.\""
    "ANSI D.16-2017, section 2.2.34.1"],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "not in-transport"},
   :rdfs/subClassOf :auto-ti/State,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The state or condition of a transport vehicle which is not \"in-transport.\""}})

(def ObjectMass
  "relates an object to its mass"
  {:db/ident :auto-ti/ObjectMass,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "object mass"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates an object to its mass"}})

(def ObjectValue
  "relates an object to its value"
  {:db/ident :auto-ti/ObjectValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "object value"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates an object to its value"}})

(def Occupant
  "Any person who is part of a transport vehicle."
  {:db/ident :auto-ti/Occupant,
   :fibo-fnd-utl-av/adaptedFrom {:rdf/language "en",
                                 :rdf/value "ANSI D.16-2017, section 2.2.35"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "occupant"},
   :rdfs/subClassOf :auto-ti/RoleOfPersonInTraffic,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Any person who is part of a transport vehicle."}})

(def Off-roadwayCrash
  "Any road vehicle crash other than an on-roadway crash."
  {:db/ident :auto-ti/Off-roadwayCrash,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "off-roadway crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Any road vehicle crash other than an on-roadway crash."}})

(def On-roadwayCrash
  "(1) a collision crash in which the initial point of contact between colliding units in the first harmful event is within a roadway or (2) a non-collision crash in which the road vehicle involved was partly or entirely on the roadway at the time of the first harmful event."
  {:db/ident :auto-ti/On-roadwayCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.7.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "on-roadway crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "(1) a collision crash in which the initial point of contact between colliding units in the first harmful event is within a roadway or (2) a non-collision crash in which the road vehicle involved was partly or entirely on the roadway at the time of the first harmful event."}})

(def Other-road-vehicleCrash
  "A transport crash that (1) involves an other road vehicle in- transport and (2) is not an aircraft accident, watercraft accident, motor vehicle crash or railway accident."
  {:db/ident :auto-ti/Other-road-vehicleCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.14",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "other-road-vehicle crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A transport crash that (1) involves an other road vehicle in- transport and (2) is not an aircraft accident, watercraft accident, motor vehicle crash or railway accident."}})

(def Other-road-vehicleDamage
  "A road vehicle damage to an other road vehicle."
  {:db/ident :auto-ti/Other-road-vehicleDamage,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.10",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "other-road-vehicle damage"},
   :rdfs/subClassOf :auto-ti/RoadVehicleDamage,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A road vehicle damage to an other road vehicle."}})

(def Other-road-vehicleNontrafficCrash
  "An other-road-vehicle crash which is a nontraffic crash."
  {:db/ident :auto-ti/Other-road-vehicleNontrafficCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.25",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "other-road-vehicle nontraffic crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "An other-road-vehicle crash which is a nontraffic crash."}})

(def Other-road-vehicleTrafficCrash
  "An other- road-vehicle crash which is a traffic crash."
  {:db/ident :auto-ti/Other-road-vehicleTrafficCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.24",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "other-road-vehicle traffic crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An other- road-vehicle crash which is a traffic crash."}})

(def OtherObjectsWithWhichCarCanCollide
  "objects other than infrastructure, agents, vehicles, property, natural places, hazardous material, hazardous material placard, with which vehicles can collide"
  {:db/ident :auto-ti/OtherObjectsWithWhichCarCanCollide,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "other objects with which car can colide"}
                {:rdf/language "pl",
                 :rdf/value
                 "inne przedmioty z którymi samochód może się zderzyć"}],
   :rdfs/subClassOf :auto-mo/MaterialEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "objects other than infrastructure, agents, vehicles, property, natural places, hazardous material, hazardous material placard, with which vehicles can collide"}})

(def OverturningCrash
  "A road vehicle crash in which the first harmful event is the overturning of a road vehicle."
  {:db/ident :auto-ti/OverturningCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.6.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "overturning crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A road vehicle crash in which the first harmful event is the overturning of a road vehicle."}})

(def Passenger
  "Any occupant of a road vehicle other than its driver."
  {:db/ident :auto-ti/Passenger,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.38",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "passenger"},
   :rdfs/subClassOf :auto-ti/RoleOfPersonInTraffic,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Any occupant of a road vehicle other than its driver."}})

(def PedalcycleCrash
  "An other-road-vehicle crash that (1) involves a pedalcycle in-transport and (2) is not a streetcar crash."
  {:db/ident :auto-ti/PedalcycleCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.16",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pedalcycle crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An other-road-vehicle crash that (1) involves a pedalcycle in-transport and (2) is not a streetcar crash."}})

(def Pedalcyclist
  "Any occupant of a pedalcycle in-transport."
  {:db/ident :auto-ti/Pedalcyclist,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.39",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pedalcyclist"},
   :rdfs/subClassOf :auto-ti/RoleOfPersonInTraffic,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Any occupant of a pedalcycle in-transport."}})

(def Pedestrian
  "Any person who is not an occupant."
  {:db/ident :auto-ti/Pedestrian,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.36",
   :owl/disjointWith :auto-vc/Vehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "pieszy"}
                {:rdf/language "en",
                 :rdf/value    "pedestrian"}],
   :rdfs/subClassOf :auto-ti/RoleOfPersonInTraffic,
   :skos/definition
   [{:rdf/language "pl",
     :rdf/value
     "osobę znajdującą się poza pojazdem na drodze i niewykonującą na niej robót lub czynności przewidzianych odrębnymi przepisami"}
    {:rdf/language "en",
     :rdf/value    "Any person who is not an occupant."}
    {:rdf/language "en",
     :rdf/value    "a person walking rather than travelling in a vehicle"}]})

(def PersonalConveyance
  "A device, other than a transport device, used by a pedestrian (See 2.2.36) for personal mobility assistance or recreation. These devices can be motorized or human powered, but not propelled by pedaling."
  {:db/ident :auto-ti/PersonalConveyance,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.6.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "personal conveyance"},
   :rdfs/subClassOf :auto-ti/Property,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A device, other than a transport device, used by a pedestrian (See 2.2.36) for personal mobility assistance or recreation. These devices can be motorized or human powered, but not propelled by pedaling."}})

(def PolicePursuit
  "An event that is initiated when a law enforcement officer, operating an authorized emergency vehicle, gives notice to stop to a motorist the officer is attempting to contact, and that motorist fails to comply with the signal by either maintaining his/her speed, increasing speed, or taking other evasive action to elude the officer 's continued attempts to stop the motorist."
  {:db/ident :auto-ti/PolicePursuit,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.3.1",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This notice needs to be either through the use of visual or audible emergency signals, including alternating flashing headlights, or a combination of emergency devices. A pursuit is terminated when the motorist stops, or when the attempt to apprehend is discontinued."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "police pursuit"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An event that is initiated when a law enforcement officer, operating an authorized emergency vehicle, gives notice to stop to a motorist the officer is attempting to contact, and that motorist fails to comply with the signal by either maintaining his/her speed, increasing speed, or taking other evasive action to elude the officer 's continued attempts to stop the motorist."}})

(def PossibleInjury
  "Any injury reported or claimed which is not a fatal, suspected serious, or suspected minor injury."
  {:db/ident :auto-ti/PossibleInjury,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "C"},
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.6",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Possible injuries are those that are reported by the person or are indicated by his/her behavior, but no wounds or injuries are readily evident, and includes : Momentary loss of consciousness or claim of injury, limping, or complaint of pain or nausea."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "possible injury"},
   :rdfs/subClassOf :auto-ti/Injury,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any injury reported or claimed which is not a fatal, suspected serious, or suspected minor injury."}})

(def PrivateMotorCarrier
  "person who provides transportation of property or passengers, by commercial motor vehicle, and is not a for-hire motor carrier"
  {:db/ident :auto-ti/PrivateMotorCarrier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private motor carrier"},
   :rdfs/subClassOf :auto-ti/MotorCarrier,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "person who provides transportation of property or passengers, by commercial motor vehicle, and is not a for-hire motor carrier"}})

(def Property
  "Any physical object other than a person."
  {:db/ident :auto-ti/Property,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.1.2",
   :owl/equivalentClass {:owl/intersectionOf [:auto-mo/MaterialEntity
                                              {:owl/complementOf
                                               :auto-mo/Person,
                                               :rdf/type :owl/Class}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "property"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Any physical object other than a person."}})

(def PropertyDamageOnlyCrash
  "A no apparent injury crash."
  {:db/ident :auto-ti/PropertyDamageOnlyCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.30",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "property damage only crash"},
   :rdfs/subClassOf :auto-ti/CollisionCrash,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A no apparent injury crash."}})

(def QualifiedVAExaminer
  "advanced practice nurse, doctor of chiropractic, doctor of medicine, doctor of osteopathy, physician assistant, or other medical professional who is employed in the Department of Veterans Affairs"
  {:db/ident :auto-ti/QualifiedVAExaminer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "qualified VA examiner"},
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "advanced practice nurse, doctor of chiropractic, doctor of medicine, doctor of osteopathy, physician assistant, or other medical professional who is employed in the Department of Veterans Affairs"}})

(def RadarDetector
  "device or mechanism designed to detect the emission of radio microwaves, laser beams or any other future speed measurement technology employed by enforcement personnel to measure the speed of commercial motor vehicles upon public roads and highways for enforcement purposes"
  {:db/ident :auto-ti/RadarDetector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "radar detector"},
   :rdfs/subClassOf :auto-mo/Object,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device or mechanism designed to detect the emission of radio microwaves, laser beams or any other future speed measurement technology employed by enforcement personnel to measure the speed of commercial motor vehicles upon public roads and highways for enforcement purposes"}})

(def RailwayAccident
  "A transport accident that (1) involves a railway train in-transport and (2) is not an aircraft accident, watercraft accident or motor vehicle crash."
  {:db/ident :auto-ti/RailwayAccident,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.13",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "railway accident"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A transport accident that (1) involves a railway train in-transport and (2) is not an aircraft accident, watercraft accident or motor vehicle crash."}})

(def Receiver
  "person who takes delivery from a motor carrier or driver of a commercial motor vehicle of property transported in interstate commerce or hazardous materials transported in interstate or intrastate commerce"
  {:db/ident :auto-ti/Receiver,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "receiver"},
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "person who takes delivery from a motor carrier or driver of a commercial motor vehicle of property transported in interstate commerce or hazardous materials transported in interstate or intrastate commerce"}})

(def RoadVehicleCrash
  "A transport crash that is either a motor vehicle crash or an other-road vehicle crash."
  {:db/ident :auto-ti/RoadVehicleCrash,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road vehicle crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A transport crash that is either a motor vehicle crash or an other-road vehicle crash."}})

(def RoadVehicleDamage
  "A damage to a road vehicle."
  {:db/ident :auto-ti/RoadVehicleDamage,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.8",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road vehicle damage"},
   :rdfs/subClassOf :auto-ti/Damage,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A damage to a road vehicle."}})

(def RoadVehicleNontrafficCrash
  "A nontraffic crash."
  {:db/ident :auto-ti/RoadVehicleNontrafficCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.21",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road vehicle nontraffic crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A nontraffic crash."}})

(def RoadVehicleTrafficCrash
  "A traffic crash."
  {:db/ident :auto-ti/RoadVehicleTrafficCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.20",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road vehicle traffic crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A traffic crash."}})

(def RoleInAccident
  "role a vehicle takes in an accident"
  {:db/ident :auto-ti/RoleInAccident,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "role in accident"},
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "role a vehicle takes in an accident"}})

(def RoleOfPersonInTraffic
  "role a person can take while being in traffic"
  {:db/ident :auto-ti/RoleOfPersonInTraffic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "role of person in traffic"},
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "role a person can take while being in traffic"}})

(def SchoolBusCrash
  "(1) a motor vehicle crash in which a school bus, with or without a pupil on board, is involved directly as a contact vehicle, or (2) a motor vehicle crash or an other-road- vehicle crash in which a school bus, with or without a pupil on board, is involved indirectly as a noncontact vehicle."
  {:db/ident :auto-ti/SchoolBusCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.8.2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "school bus crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "(1) a motor vehicle crash in which a school bus, with or without a pupil on board, is involved directly as a contact vehicle, or (2) a motor vehicle crash or an other-road- vehicle crash in which a school bus, with or without a pupil on board, is involved indirectly as a noncontact vehicle."}})

(def SpeedMismatching
  "action of having inadequate speed"
  {:db/ident :auto-ti/SpeedMismatching,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "speed mismatching"}
                {:rdf/language "pl",
                 :rdf/value    "niedopasowanie prędkości"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/isOffenceOf,
                      :owl/someValuesFrom :auto-ti/TrafficViolation,
                      :rdf/type           :owl/Restriction}
                     :auto-ti/DangerousBehaviour],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "action of having inadequate speed"}})

(def State
  "state or condition of a transport vehicle"
  {:db/ident :auto-ti/State,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "state"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition {:rdf/language "en",
                     :rdf/value "state or condition of a transport vehicle"}})

(def StaticObject
  "object that does not move"
  {:db/ident :auto-ti/StaticObject,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "static object"}
                {:rdf/language "pl",
                 :rdf/value    "obiekt statyczny"}],
   :rdfs/subClassOf :auto-ti/OtherObjectsWithWhichCarCanCollide,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "object that does not move"}})

(def StreetcarCrash
  "An other-road-vehicle crash that involves a streetcar in-transport."
  {:db/ident :auto-ti/StreetcarCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.15",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "streetcar crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An other-road-vehicle crash that involves a streetcar in-transport."}})

(def SuspectedMinorInjury
  "Any injury that is evident at the scene of the crash, other than fatal or serious injuries, including lump on the head, abrasions, bruises, minor lacerations (cuts on the skin surface with minimal bleeding and no exposure of deeper tissue /muscles)."
  {:db/ident :auto-ti/SuspectedMinorInjury,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "B"},
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.5",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "suspected minor injury"},
   :rdfs/subClassOf :auto-ti/Injury,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any injury that is evident at the scene of the crash, other than fatal or serious injuries, including lump on the head, abrasions, bruises, minor lacerations (cuts on the skin surface with minimal bleeding and no exposure of deeper tissue /muscles)."}})

(def SuspectedSeriousInjury
  "Any injury other than fatal which results in one or more of the following : Severe laceration resulting in exposure of underlying tissues /muscle /organs or resulting in significant loss of blood; broken or distorted extremity (arm or leg); crush injuries; suspected skull, chest, or abdominal injury other than bruises or minor lacerations; significant burns (second and third degree burns over 10 % or more of the body); unconsciousness when taken from the crash scene, or paralysis."
  {:db/ident :auto-ti/SuspectedSeriousInjury,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "A"},
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.3.4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "suspected serious injury"},
   :rdfs/subClassOf :auto-ti/Injury,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any injury other than fatal which results in one or more of the following : Severe laceration resulting in exposure of underlying tissues /muscle /organs or resulting in significant loss of blood; broken or distorted extremity (arm or leg); crush injuries; suspected skull, chest, or abdominal injury other than bruises or minor lacerations; significant burns (second and third degree burns over 10 % or more of the body); unconsciousness when taken from the crash scene, or paralysis."}})

(def TooHigh
  "action of having too high speed"
  {:db/ident :auto-ti/TooHigh,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "zbyt duża prędkość"}
                {:rdf/language "en",
                 :rdf/value    "too high"}],
   :rdfs/subClassOf :auto-ti/SpeedMismatching,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "action of having too high speed"}})

(def TooLow
  "action of having too low speed"
  {:db/ident :auto-ti/TooLow,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "zbyt mała prędkość"}
                {:rdf/language "en",
                 :rdf/value    "too low"}],
   :rdfs/subClassOf :auto-ti/SpeedMismatching,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "action of having too low speed"}})

(def TooSmallDistanceBetweenVehicles
  "action of maintaining too small a distance between two vehicles"
  {:db/ident :auto-ti/TooSmallDistanceBetweenVehicles,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value "zachowanie zbyt małej odległości między pojazdami"}
                {:rdf/language "en",
                 :rdf/value    "too small distance between vehicles"}],
   :rdfs/subClassOf :auto-ti/DangerousBehaviour,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action of maintaining too small a distance between two vehicles"}})

(def TrafficCrash
  "A road vehicle crash in which (1) the unstabilized situation originates on a trafficway or (2) a harmful event occurs on a trafficway."
  {:db/ident :auto-ti/TrafficCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.18",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traffic crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A road vehicle crash in which (1) the unstabilized situation originates on a trafficway or (2) a harmful event occurs on a trafficway."}})

(def TrafficIncident
  "all road accidents - irrespective of whether there is an accident or serious material damage"
  {:db/ident :auto-ti/TrafficIncident,
   :owl/equivalentClass [{:owl/onProperty     :auto-ti/hasEffect,
                          :owl/someValuesFrom :auto-ti/TrafficIncidentEffect,
                          :rdf/type           :owl/Restriction}
                         {:owl/onProperty     :auto-ti/hasCause,
                          :owl/someValuesFrom :auto-ti/TrafficIncidentCauses,
                          :rdf/type           :owl/Restriction}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "zdarzenie drogowe"}
                {:rdf/language "en",
                 :rdf/value    "traffic incident"}],
   :rdfs/subClassOf [:auto-mo/Process
                     {:owl/onProperty     :auto-ti/hasTrafficUser,
                      :owl/someValuesFrom :auto-ti/TrafficParticipant,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "all road accidents - irrespective of whether there is an accident or serious material damage"}
    {:rdf/language "pl",
     :rdf/value
     "wszystkie wydarzenia na drodze – niezależnie od tego, czy są jakieś ofiary lub poważne straty materialne"}]})

(def TrafficIncidentCauses
  "possible causes of a traffic incident"
  {:db/ident :auto-ti/TrafficIncidentCauses,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "traffic incident causes"}
                {:rdf/language "pl",
                 :rdf/value    "przyczyna zdarzeń drogowych"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/hasTrafficUser,
                      :owl/someValuesFrom :auto-ti/TrafficParticipant,
                      :rdf/type           :owl/Restriction}
                     :auto-mo/Process],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "possible causes of a traffic incident"}})

(def TrafficIncidentEffect
  "possible effect of a traffic incident"
  {:db/ident :auto-ti/TrafficIncidentEffect,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "traffic incident effect"}
                {:rdf/language "pl",
                 :rdf/value    "skutek zdarzeń drogowych"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/hasTrafficUser,
                      :owl/someValuesFrom :auto-ti/TrafficParticipant,
                      :rdf/type           :owl/Restriction}
                     :auto-mo/Process],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "possible effect of a traffic incident"}})

(def TrafficParticipant
  "pedestrians, drivers, and other people in the vehicle or on a vehicle on the road"
  {:db/ident :auto-ti/TrafficParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "uczestnik ruchu"}
                {:rdf/language "en",
                 :rdf/value    "traffic participant"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/isParticipantOf,
                      :owl/someValuesFrom :auto-ti/TrafficViolation,
                      :rdf/type           :owl/Restriction}
                     :auto-mo/Role],
   :skos/definition
   ["pieszy, kierujący, a także inne osoby przebywające w pojeździe lub na pojeździe znajdującym się na drodze"
    {:rdf/language "en",
     :rdf/value
     "pedestrians, drivers, and other people in the vehicle or on a vehicle on the road"}]})

(def TrafficUnit
  "A land vehicle or a pedestrian."
  {:db/ident :auto-ti/TrafficUnit,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.42",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traffic unit"},
   :rdfs/subClassOf :auto-mo/Role,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A land vehicle or a pedestrian."}})

(def TrafficViolation
  "socially harmful act (even to a slight extent), prohibited by the law in force at the time of its commission, under pain of imprisonment, restriction of liberty, fine up to PLN 5,000 or reprimand"
  {:db/ident :auto-ti/TrafficViolation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "wykroczenie drogowe"}
                {:rdf/language "en",
                 :rdf/value    "traffic violation"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/hasTrafficUser,
                      :owl/someValuesFrom :auto-ti/TrafficParticipant,
                      :rdf/type           :owl/Restriction}
                     :auto-mo/Process],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "socially harmful act (even to a slight extent), prohibited by the law in force at the time of its commission, under pain of imprisonment, restriction of liberty, fine up to PLN 5,000 or reprimand"}
    {:rdf/language "pl",
     :rdf/value
     "czyn społecznie szkodliwy (nawet w stopniu znikomym), zabroniony przez ustawę obowiązującą w czasie jego popełnienia pod groźbą kary aresztu, ograniczenia wolności, grzywny do 5000 złotych lub nagany"}]})

(def TransportCrash
  "A crash (1) that involves a transport vehicle in-transport, (2) in which the first harmful event is not produced by the discharge of a firearm or explosive device, and (3) that does not directly result from a cataclysm where the timing is such that the cataclysm is occurring at the time of the accident or crash."
  {:db/ident :auto-ti/TransportCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.9",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transport crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A crash (1) that involves a transport vehicle in-transport, (2) in which the first harmful event is not produced by the discharge of a firearm or explosive device, and (3) that does not directly result from a cataclysm where the timing is such that the cataclysm is occurring at the time of the accident or crash."}})

(def TransportDevice
  "Any device designed primarily for moving persons or property along with the device itself from one place to another, except (1) a weapon, (2) a device used primarily within the confines of a building and its premises, or (3) a personal conveyance."
  {:db/ident :auto-ti/TransportDevice,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.1.3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transport device"},
   :rdfs/subClassOf :auto-ti/Property,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any device designed primarily for moving persons or property along with the device itself from one place to another, except (1) a weapon, (2) a device used primarily within the confines of a building and its premises, or (3) a personal conveyance."}})

(def UnstabilizedSituation
  "A set of events not under human control."
  {:db/ident :auto-ti/UnstabilizedSituation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "It originates when control is lost and terminates when control is regained or, in the absence of persons who are able to regain control, when all persons and propertyare at rest."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unstabilized situation"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A set of events not under human control."}})

(def UsingMobilePhoneDuringDriving
  "action of using a mobile phone by a driver while operating a vehicle"
  {:db/ident :auto-ti/UsingMobilePhoneDuringDriving,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label
   [{:rdf/language "en",
     :rdf/value    "using mobile phone during driving"}
    {:rdf/language "pl",
     :rdf/value
     "korzystanie z telefonu komórkowego podczas prowadzenia samochodu"}],
   :rdfs/subClassOf [{:owl/onProperty     :auto-ti/isOffenceOf,
                      :owl/someValuesFrom :auto-ti/TrafficViolation,
                      :rdf/type           :owl/Restriction}
                     :auto-ti/DangerousBehaviour],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action of using a mobile phone by a driver while operating a vehicle"}})

(def VeteranOperator
  "operator of a commercial motor vehicle who is a veteran enrolled in the health care system"
  {:db/ident :auto-ti/VeteranOperator,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "veteran operator"},
   :rdfs/subClassOf :auto-ti/Motorist,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "operator of a commercial motor vehicle who is a veteran enrolled in the health care system"}})

(def Victim
  {:db/ident :auto-ti/Victim,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "victim"}
                {:rdf/language "pl",
                 :rdf/value    "poszkodowanie"}],
   :rdfs/subClassOf :auto-ti/TrafficIncidentEffect,
   :skos/definition
   [{:rdf/language "pl",
     :rdf/value    "zostać zranionym lub uszkodzonym z powodu czegoś lub kogoś"}
    {:rdf/language "pl",
     :rdf/value    "to be hurt or damaged because of something or someone"}]})

(def WatercraftAccident
  "A transport accident if it (1) involves a watercraft in-transport and (2) is not an aircraft accident."
  {:db/ident :auto-ti/WatercraftAccident,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.4.11",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "watercraft accident"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A transport accident if it (1) involves a watercraft in-transport and (2) is not an aircraft accident."}})

(def Weather
  "current atmospheric conditions"
  {:db/ident :auto-ti/Weather,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "weather"}
                {:rdf/language "pl",
                 :rdf/value    "pogoda"}],
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "current atmospheric conditions"}})

(def WorkZoneCrash
  "A motor vehicle traffic crash in which the first harmful event occurs within the boundaries of a work zone or on an approach to or exit from a work zone, resulting from an activity, behavior or control related to the movement of the traffic units through the work zone."
  {:db/ident :auto-ti/WorkZoneCrash,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.7.8",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "work zone crash"},
   :rdfs/subClassOf :auto-ti/Crash,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A motor vehicle traffic crash in which the first harmful event occurs within the boundaries of a work zone or on an approach to or exit from a work zone, resulting from an activity, behavior or control related to the movement of the traffic units through the work zone."}})

(def does
  "relates a traffic user or a vehicle to an action"
  {:db/ident :auto-ti/does,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "does"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "relates a traffic user or a vehicle to an action"}})

(def grossCombinationWeightRating
  "The value specified by the manufacturer as the recommended maximum loaded weight of a combination (articulated) motor vehicle."
  {:db/ident :auto-ti/grossCombinationWeightRating,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "GCWR"},
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.23.1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This is for truck tractors and single-unit trucks pulling a trailer (s). GCWR is the sum of the gross vehicle weight ratings (GVWR) of all units; power unit and its trailer (s)."},
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gross combination weight rating"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The value specified by the manufacturer as the recommended maximum loaded weight of a combination (articulated) motor vehicle."}})

(def grossVehicleWeight
  "The actual weight of a road vehicle including the weight of the road vehicle, its load of persons and property, and all added equipment."
  {:db/ident :auto-ti/grossVehicleWeight,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "GVW"},
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.22",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-vc/RoadVehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gross vehicle weight"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The actual weight of a road vehicle including the weight of the road vehicle, its load of persons and property, and all added equipment."}})

(def grossVehicleWeightRating
  "The value specified by the manufacturer as the recommended maximum loaded weight of a single motor vehicle."
  {:db/ident :auto-ti/grossVehicleWeightRating,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "GVWR"},
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.23",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This rating includes the maximum rated capacity of a vehicle, including the base vehicle, mounted equipment and any cargo and passengers. Most of the time, GVWR is the sum of the maximum rated capacity of the axles of the vehicle."},
   :rdfs/domain :auto-vc/Vehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gross vehicle weight rating"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The value specified by the manufacturer as the recommended maximum loaded weight of a single motor vehicle."}})

(def hasCause
  "relates a process to another process that causes it"
  {:db/ident :auto-ti/hasCause,
   :owl/inverseOf :auto-ti/isCauseOf,
   :rdf/type [:owl/AsymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has cause"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "relates a process to another process that causes it"}})

(def hasDangerousBehaviour
  "relates a traffic user to a dangerous behaviour he is exhibiting"
  {:db/ident :auto-ti/hasDangerousBehaviour,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has dangerous behaviour"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a traffic user to a dangerous behaviour he is exhibiting"}})

(def hasEffect
  "relates a process to another process that is its effect"
  {:db/ident :auto-ti/hasEffect,
   :owl/inverseOf :auto-ti/isEffectOf,
   :rdf/type [:owl/AsymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has effect"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "relates a process to another process that is its effect"}})

(def hasPatient
  "relates a hospital to a patient present there"
  {:db/ident :auto-ti/hasPatient,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has patient"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "relates a hospital to a patient present there"}})

(def hasTrafficUser
  "relates a crash to a traffic user who participates in it"
  {:db/ident :auto-ti/hasTrafficUser,
   :owl/inverseOf :auto-ti/isParticipantOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has traffic user"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "relates a crash to a traffic user who participates in it"}})

(def isCauseOf
  "relates a process to another one that is caused by it"
  {:db/ident :auto-ti/isCauseOf,
   :rdf/type [:owl/AsymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is cause of"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "relates a process to another one that is caused by it"}})

(def isEffectOf
  "relates a process to another process of which it is an effect"
  {:db/ident :auto-ti/isEffectOf,
   :rdf/type [:owl/AsymmetricProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is effect of"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a process to another process of which it is an effect"}})

(def isOffenceOf
  "is offence of"
  {:db/ident :auto-ti/isOffenceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is offence of"}})

(def isParticipantOf
  "relates a traffic user to a crash in which he participates"
  {:db/ident :auto-ti/isParticipantOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is participant of"},
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "relates a traffic user to a crash in which he participates"}})

(def isPatientOf
  "relates a traffic user to a hospital in which he is being treated"
  {:db/ident :auto-ti/isPatientOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is patient of"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a traffic user to a hospital in which he is being treated"}})

(def operatesAtADSLevel
  "relates a vehicle to the ADS level at which it operates"
  {:db/ident :auto-ti/operatesAtADSLevel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is capable of driving at"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "relates a vehicle to the ADS level at which it operates"}})

(def totalLanesInRoadway
  "A number of through lanes of the roadway."
  {:db/ident :auto-ti/totalLanesInRoadway,
   :fibo-fnd-utl-av/adaptedFrom "ANSI D.16-2017, section 2.2.33.1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Original definition:\nThe total number of lanes in a roadway is collected for each vehicle, on the roadway on which that vehicle was traveling. Through lanes also includes shared through/turn lanes but excludes, turn-only lanes, auxiliary lanes, such as collector-distributor lanes, weaving lanes, frontage road lanes, parking lanes, acceleration/deceleration lanes, toll collection lanes and truck climbing lanes. Total lanes are collected in two parts as total through lanes and total auxiliary lanes."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/DE/TrafficIncidents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "total lanes in roadway"},
   :rdfs/range :xsd/int,
   :skos/definition {:rdf/language "en",
                     :rdf/value "A number of through lanes of the roadway."}})