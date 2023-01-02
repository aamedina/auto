(ns net.wikipunk.rdf.auto-av
  "This product contains SAE International copyrighted intellectual property, which has been and is licensed with permission for use by Licensee and its Sublicensee. The true authority of any SAE standard is the PDF version, which can be found at saemobilus.sae.org."
  {:dcterms/creator ["Marcin Skulimowski" "Robert Trypuz" "Piotr Kulicki"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/rights ["SAE J3016™"
                    {:rdf/language "en",
                     :rdf/value
                     "\"J\" standards are a trademark of SAE International."}],
   :dcterms/source
   {:rdf/language "en",
    :rdf/value
    "J3016 “Levels of Driving Automation” standard, revision 2021-04"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/auto/ontology/master/latest/VC/VehicleParts/"
    "https://spec.edmcouncil.org/auto/ontology/master/latest/VC/VehicleCore/"
    "https://spec.edmcouncil.org/auto/ontology/master/latest/DE/CarControl/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/auto/ontology/master/latest/AV/VehicleAutomationLevels/",
   :rdf/ns-prefix-map
   {"AnnotationVocabulary"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "SpecificationMetadata"
    "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "auto-av"
    "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfa/prefix "auto-av",
   :rdfa/uri
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This product contains SAE International copyrighted intellectual property, which has been and is licensed with permission for use by Licensee and its Sublicensee. The true authority of any SAE standard is the PDF version, which can be found at saemobilus.sae.org."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vehicle Automation Levels Ontology"},
   :rdfs/seeAlso "https://onto.kul.pl/av/",
   :sm/copyright {:rdf/language "en",
                  :rdf/value    "© SAE International, All rights reserved."},
   :sm/fileAbbreviation {:rdf/language "en",
                         :rdf/value    "auto-av-val"}})

(def ActiveSafetySystem
  "Active safety systems are vehicle systems that sense and monitor conditions inside and outside the vehicle for the purpose of identifying perceived present and potential dangers to the vehicle, occupants, and/or other road users, and automatically intervene to help avoid or mitigate potential collisions via various methods, including alerts to the driver, vehicle system adjustments, and/or active control of the vehicle subsystems (brakes, throttle, suspension, etc.)."
  {:db/ident :auto-av/ActiveSafetySystem,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.1",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For purposes of this report, systems that meet the definition of active safety systems are considered to have a design purpose that is primarily focused on improving safety rather than comfort, convenience, or general driver assistance. Active safety systems warn or intervene during a high-risk event or maneuver."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "active safety system"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/performs,
                      :owl/someValuesFrom :auto-av/MonitoringDrivingEnvironment,
                      :rdf/type           :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Active safety systems are vehicle systems that sense and monitor conditions inside and outside the vehicle for the purpose of identifying perceived present and potential dangers to the vehicle, occupants, and/or other road users, and automatically intervene to help avoid or mitigate potential collisions via various methods, including alerts to the driver, vehicle system adjustments, and/or active control of the vehicle subsystems (brakes, throttle, suspension, etc.)."}})

(def AutomatedDriving
  {:db/ident :auto-av/AutomatedDriving,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "automated driving"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/hasUserWhileDASisUnengaged,
                      :owl/someValuesFrom :auto-av/HumanDriver,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :auto-av/hasParticipant,
                      :owl/someValuesFrom
                      :auto-av/AutomatedDrivingSystemEquippedVehicle,
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :auto-av/DynamicDrivingTask,
                      :owl/onProperty    :auto-av/realizes,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-av/AutomatedDrivingSystem,
                      :owl/onProperty    :auto-av/isPerformedBy,
                      :rdf/type          :owl/Restriction}
                     :auto-av/DrivingAutomation]})

(def AutomatedDrivingSystem
  "The hardware and software that are collectively capable of performing the entire DDT on a sustained basis, regardless of whether it is limited to a specific operational design domain (ODD); this term is used specifically to describe a Level 3, 4, or 5 driving automation system."
  {:db/ident :auto-av/AutomatedDrivingSystem,
   :fibo-fnd-utl-av/abbreviation "ADS",
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.2",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In contrast to ADS, the generic term “driving automation system” (see 3.6) refers to any Level 1 to 5 system or feature that performs part or all of the DDT on a sustained basis. Given the similarity between the generic term, “driving automation system,” and the Level 3 to 5 specific term, “automated driving system,” the latter term should be capitalized when spelled out and reduced to its abbreviation, ADS, as much as possible, while the former term should not be."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "automated driving system"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/performs,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:auto-av/AutomatedDriving
                                            :auto-av/RequestToIntervene],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :auto-av/DrivingAutomationSystem],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The hardware and software that are collectively capable of performing the entire DDT on a sustained basis, regardless of whether it is limited to a specific operational design domain (ODD); this term is used specifically to describe a Level 3, 4, or 5 driving automation system."}})

(def AutomatedDrivingSystemDedicatedVehicle
  "ADS-equipped vehicle designed for driverless operation under routine/normal operating conditions during all trips within its given ODD (if any)"
  {:db/ident :auto-av/AutomatedDrivingSystemDedicatedVehicle,
   :fibo-fnd-utl-av/abbreviation "ADS-DV",
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.32.3",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "An ADS-DV might be designed without user interfaces designed to be operable by an in-vehicle driver, such as braking, accelerating, steering, and transmission gear selection input devices, or it might be designed so that these devices are inoperative under routine/normal operating conditions."}
    {:rdf/language "en",
     :rdf/value
     "ADS-DVs might be operated temporarily by a human driver: (1) to manage transient deviations from the ODD, (2) to address a system failure, or (3) while in a marshalling yard before or after being repaired/serviced or dispatched."}
    {:rdf/language "en",
     :rdf/value
     "In contrast to previous versions of this document, which specified that an ADS-DV was limited to Levels 4 and 5, this revised definition of an ADS-DV also allows for the possibility of a Level 3 ADS-DV if the remote fallback-ready user can be receptive to both ADS-issued requests to intervene and to evident DDT performance-relevant system failures in the vehicle. Once either of these conditions occurs, the remote fallback-ready user begins to perform the DDT fallback in (virtually) real time using wireless means. (See also 3.24 and 3.22.)"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ADS dedicated vehicle"},
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/intersectionOf
                      [:auto-av/DriverlessOperation
                       {:owl/onProperty :auto-av/isDispatchedBy,
                        :owl/someValuesFrom
                        :auto-av/DriverlessOperationDispatcher,
                        :rdf/type :owl/Restriction}],
                      :rdf/type :owl/Class},
     :owl/onProperty :auto-av/isDispatchedIn,
     :rdf/type       :owl/Restriction}
    :auto-av/AutomatedDrivingSystemEquippedVehicle
    {:owl/onProperty     :auto-av/operatedBy,
     :owl/someValuesFrom {:owl/intersectionOf
                          [:auto-av/AutomatedDrivingSystem
                           {:owl/onProperty :auto-av/performs,
                            :owl/someValuesFrom
                            {:owl/unionOf [:auto-av/FullDrivingAutomation
                                           :auto-av/HighDrivingAutomation],
                             :rdf/type    :owl/Class},
                            :rdf/type :owl/Restriction}],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ADS-equipped vehicle designed for driverless operation under routine/normal operating conditions during all trips within its given ODD (if any)"},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 4 ADS-DV designed to operate exclusively within a geographically prescribed central business district where it delivers supplies using roads (but not necessarily routes) specified by the ADS-DV dispatcher."}
    {:rdf/language "en",
     :rdf/value
     "A Level 4 ADS-DV designed to operate exclusively within a corporate campus where it picks up and discharges passengers along a specific route specified by the ADS-DV dispatcher."}
    {:rdf/language "en",
     :rdf/value
     "A Level 5 ADS-DV capable of operating on all mapped roads in the US that are navigable by a human driver. The user simply inputs a destination, and the ADS-DV automatically navigates to that destination."}]})

(def AutomatedDrivingSystemDualModeVehicle
  "ADS-equipped vehicle designed to enable either driverless operation under routine/normal operating conditions within its given ODD (if any), or operation by an in-vehicle driver, for complete trips"
  {:db/ident :auto-av/AutomatedDrivingSystemDualModeVehicle,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.32.2",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "When operated by the ADS, dual-mode vehicles enable driverless operation, although a human driver could also be present in the driver’s seat."}
    {:rdf/language "en",
     :rdf/value
     "An ADS sub-trip feature that is usable during only part of a trip, such as a feature designed to perform the complete DDT during traffic jams on freeways, would not be sufficient to classify its host vehicle as a dual-mode vehicle because it would not be capable of driverless operation for a complete trip."}
    {:rdf/language "en",
     :rdf/value
     "A vehicle equipped with a Level 5 feature in which at any time the driver can choose to engage the feature, or can choose to operate the vehicle manually, would be classified as a dual-mode vehicle."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ADS dual-mode vehicle"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/operatedBy,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:auto-av/AutomatedDrivingSystem
                                            :auto-av/InVehicleDriver],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :auto-av/AutomatedDrivingSystemEquippedVehicle],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ADS-equipped vehicle designed to enable either driverless operation under routine/normal operating conditions within its given ODD (if any), or operation by an in-vehicle driver, for complete trips"}})

(def AutomatedDrivingSystemEquippedVehicle
  "vehicle equipped with an automated driving system"
  {:db/ident :auto-av/AutomatedDrivingSystemEquippedVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ADS equipped vehicle"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/isEquippedWith,
                      :owl/someValuesFrom :auto-av/AutomatedDrivingSystem,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :auto-av/isCapableToParticipateIn,
                      :owl/someValuesFrom :auto-av/DriverlessOperation,
                      :rdf/type           :owl/Restriction}
                     :auto-av/MotorVehicle],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "vehicle equipped with an automated driving system"}})

(def Campus
  "collection of buildings and grounds that belong to a given institution, either academic or non-academic"
  {:db/ident :auto-av/Campus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "campus"},
   :rdfs/subClassOf :auto-av/ConfinedGeographicLocation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "collection of buildings and grounds that belong to a given institution, either academic or non-academic"}})

(def CentralBusinessDistrict
  "commercial and business center of a city"
  {:db/ident :auto-av/CentralBusinessDistrict,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "central business district"},
   :rdfs/subClassOf :auto-av/ConfinedGeographicLocation,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "commercial and business center of a city"}})

(def CityCentre
  "commercial, cultural and often geographic heart of a city"
  {:db/ident :auto-av/CityCentre,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "city centre"},
   :rdfs/subClassOf :auto-av/ConfinedGeographicLocation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "commercial, cultural and often geographic heart of a city"}})

(def Condition
  {:db/ident :auto-av/Condition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "condition"}})

(def ConditionalDrivingAutomation
  "The sustained and ODD-specific performance by an ADS of the entire DDT under routine/normal operation (see 3.27) with the expectation that the DDT fallback-ready user is receptive to ADS-issued requests to intervene, as well as to DDT performance-relevant system failures in other vehicle systems, and will respond appropriately."
  {:db/ident :auto-av/ConditionalDrivingAutomation,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "Level 3"},
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 5.4",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "The DDT fallback-ready user need not supervise a Level 3 ADS while it is engaged but is expected to be prepared to either resume DDT performance when the ADS issues a request to intervene or to perform the fallback and achieve a minimal risk condition if the failure condition precludes continued vehicle operation."}
    {:rdf/language "en",
     :rdf/value
     "In the event of a DDT performance-relevant system failure in a Level 3 ADS, or in the event that the ADS exits its ODD, the ADS will issue a request to intervene within sufficient time for the fallback-ready user (whether in-vehicle or remote) to respond appropriately."}
    {:rdf/language "en",
     :rdf/value
     "An “appropriate” response by a DDT fallback-ready user to a request to intervene may entail either bringing the vehicle to a minimal risk condition or continuing to operate the vehicle after the ADS has disengaged."}
    {:rdf/language "en",
     :rdf/value
     "Unlike Level 1 and 2 driver support features, all Level 3 and 4 ADS features are designed to monitor and enforce their ODD limitations while engaged, and to prevent engagement or operation outside of their prescribed ODD."}
    {:rdf/language "en",
     :rdf/value
     "A Level 3 ADS’s DDT fallback-ready user is also expected to be receptive to evident DDT performance-relevant system failures in vehicle systems that do not necessarily trigger an ADS-issued request to intervene, such as a broken body or suspension component."}
    {:rdf/language "en",
     :rdf/value
     "Although automated DDT fallback performance is not expected of Level 3 ADS features, a Level 3 feature may be capable of performing the DDT fallback and achieving a minimal risk condition under certain, limited conditions."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "conditional driving automation"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/resultsIn,
                      :owl/someValuesFrom :auto-av/SubTripFeature,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :auto-av/hasUsageSpecification,
                      :owl/someValuesFrom :auto-av/OperationalDesignDomain,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :auto-av/hasUserWhileDASisEnagaged,
                      :owl/someValuesFrom
                      :auto-av/DynamicDriverTaskFallbackReadyUser,
                      :rdf/type :owl/Restriction}
                     :auto-av/AutomatedDriving],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The sustained and ODD-specific performance by an ADS of the entire DDT under routine/normal operation (see 3.27) with the expectation that the DDT fallback-ready user is receptive to ADS-issued requests to intervene, as well as to DDT performance-relevant system failures in other vehicle systems, and will respond appropriately."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "An ADS feature capable of performing the entire DDT in low-speed, stop-and-go freeway traffic."}})

(def ConfinedGeographicLocation
  "region (point, line, or area) on Earth's surface or elsewhere"
  {:db/ident :auto-av/ConfinedGeographicLocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "confined geographic location"},
   :rdfs/subClassOf :auto-av/OperatingCondition,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "region (point, line, or area) on Earth's surface or elsewhere"}})

(def CongestedTraffic
  "traffic that is characterized by slower speeds, longer trip times, and increased vehicular queueing"
  {:db/ident :auto-av/CongestedTraffic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "congested traffic"},
   :rdfs/subClassOf :auto-av/TrafficType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "traffic that is characterized by slower speeds, longer trip times, and increased vehicular queueing"}})

(def ConventionalVehicle
  "vehicle designed to be operated by an in-vehicle driver during part or all of every trip"
  {:db/ident :auto-av/ConventionalVehicle,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.32.1",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "While it may be counterintuitive to call a vehicle equipped with an ADS “conventional,” it is appropriate in this context because an in-vehicle driver is required for at least part of every trip. As emphasized below, this taxonomy classifies the driving automation level of features rather than of vehicles (although, in the special case of an ADS-DV, the classification of the ADS feature and the vehicle are effectively the same)."}
    {:rdf/language "en",
     :rdf/value
     "A conventional vehicle may be equipped with one or more Level 1 or 2 driving automation system features that support the driver in performing the DDT, but do not perform the complete DDT. A conventional vehicle may also be equipped with a Level 3 and/or Level 4 ADS sub-trip feature(s) that requires an in-vehicle driver to operate the vehicle during portions of each trip (see 3.7.2)."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "conventional vehicle"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/operatedBy,
                      :owl/someValuesFrom :auto-av/InVehicleDriver,
                      :rdf/type           :owl/Restriction}
                     :auto-av/MotorVehicle
                     {:owl/onProperty     :auto-av/isCapableToParticipateIn,
                      :owl/someValuesFrom :auto-av/OperationWithDriver,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "vehicle designed to be operated by an in-vehicle driver during part or all of every trip"},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A vehicle equipped with Level 1 adaptive cruise control, Level 1 lane centering, and a Level 3 ADS feature designed to perform the complete DDT during traffic jams on fully access-controlled freeways. The Level 3 ADS traffic jam feature requires the user to operate the vehicle on the way to the freeway before engaging the feature, as well as again operating the vehicle upon exiting the freeway in order to complete the trip."}
    {:rdf/language "en",
     :rdf/value
     "A vehicle equipped with a Level 4 valet parking feature designed to allow the user to exit the vehicle near a parking lot and then dispatch it to a parking space."}
    {:rdf/language "en",
     :rdf/value
     "A vehicle with no driving automation system features that is designed to be operated by an in-vehicle driver throughout all trips."}]})

(def CorporateCampus
  "collection of buildings and grounds that belong to a given corporation"
  {:db/ident :auto-av/CorporateCampus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporate campus"},
   :rdfs/subClassOf :auto-av/Campus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "collection of buildings and grounds that belong to a given corporation"}})

(def CorporateCampusSpecificRoute
  "specific route in a corporate campus"
  {:db/ident :auto-av/CorporateCampusSpecificRoute,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.32.3, Example 1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporate campus, specific route"},
   :rdfs/subClassOf :auto-av/OperationalDesignDomain,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "specific route in a corporate campus"}})

(def DDTPerformanceRelevantSystemFailure
  "A malfunction in a driving automation system and/or other vehicle system that prevents the driving automation system from reliably performing its portion of the DDT on a sustained basis, including the complete DDT, that it would otherwise perform."
  {:db/ident :auto-av/DDTPerformanceRelevantSystemFailure,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.17",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "This definition applies to vehicle fault conditions and driving automation system failures that prevent a driving automation system from performing at full capability according to design intention."}
    {:rdf/language "en",
     :rdf/value
     "This term does not apply to transient lapses in performance by a Level 1 or 2 driver support feature that are due to inherent design limitations and that do not otherwise prevent the system from performing its part of the DDT on a sustained basis."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DDT performance-relevant system failure"},
   :rdfs/subClassOf [:auto-av/Operation
                     {:owl/onProperty     :auto-av/isMalfunctionOf,
                      :owl/someValuesFrom {:owl/intersectionOf
                                           [:auto-av/DrivingAutomationSystem
                                            {:owl/complementOf
                                             {:owl/onProperty :auto-av/performs,
                                              :owl/someValuesFrom
                                              :auto-av/DynamicDrivingSubtask,
                                              :rdf/type :owl/Restriction},
                                             :rdf/type :owl/Class}],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A malfunction in a driving automation system and/or other vehicle system that prevents the driving automation system from reliably performing its portion of the DDT on a sustained basis, including the complete DDT, that it would otherwise perform."},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 1 driver support feature that performs the lateral vehicle motion control subtask of the DDT experiences a DDT performance-relevant system failure in one of its cameras, which prevents it from reliably detecting lane markings. The feature causes a malfunction indication message to be displayed in the center console at the same time that the feature automatically disengages, requiring the driver to immediately resume performing the lateral vehicle motion control subtask of the DDT."}
    {:rdf/language "en",
     :rdf/value
     "A vehicle with an engaged Level 3 ADS experiences a sudden tire blow-out, which causes the vehicle to handle very poorly, giving the fallback-ready user ample kinesthetic feedback indicating a vehicle malfunction necessitating intervention. The fallback-ready user responds by resuming the DDT, turning on the hazard lamps, and pulling the vehicle onto the closest road shoulder, thereby achieving a minimal risk condition."}
    {:rdf/language "en",
     :rdf/value
     "A Level 3 ADS experiences a DDT performance-relevant system failure in one of its radar sensors, which prevents it from reliably detecting objects in the vehicle’s pathway. The ADS responds by issuing a request to intervene to the DDT fallback-ready user. The ADS continues to perform the DDT, while reducing vehicle speed, for several seconds to allow time for the DDT fallback-ready user to resume operation of the vehicle in an orderly manner."}
    {:rdf/language "en",
     :rdf/value
     "A Level 4 ADS experiences a DDT performance-relevant system failure in one of its computing modules. The ADS transitions to DDT fallback by engaging a redundant computing module(s) to achieve a minimal risk condition."}]})

(def Daylight
  "period when there is natural light from the sun"
  {:db/ident :auto-av/Daylight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "daylight"},
   :rdfs/subClassOf :auto-av/TimeOfDay,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "period when there is natural light from the sun"}})

(def DesignatedFreewayHighVolumeTraffic
  "high-volume traffic on a designated freeway"
  {:db/ident :auto-av/DesignatedFreewayHighVolumeTraffic,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.7, Example 1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "designated freeway, high-volume traffic"},
   :rdfs/subClassOf :auto-av/OperationalDesignDomain,
   :skos/definition {:rdf/language "en",
                     :rdf/value "high-volume traffic on a designated freeway"}})

(def DispatchInDriverlessOperation
  "To place an ADS-equipped vehicle into service in driverless operation by engaging the ADS"
  {:db/ident :auto-av/DispatchInDriverlessOperation,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.4",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "Only ADS-equipped vehicles capable of driverless operation (namely, an ADS-DV or a dual-mode vehicle) are potentially subject to being dispatched."}
    {:rdf/language "en",
     :rdf/value
     "The term “dispatch,” as used outside of the context of ADS-equipped vehicles, is generally understood to mean sending a particular vehicle to a particular pick-up or drop-off location for purposes of providing a transportation service. In the context of ADS-equipped vehicles, and as used herein, this term includes software-enabled dispatch of multiple ADS-equipped vehicles in driverless operation that may complete multiple trips involving pick-up and drop-off of passengers or goods throughout a day or other pre-defined period of service, and which may involve multiple agents performing various tasks related to the dispatch function. In order to highlight this specialized use of the term dispatch, the term is modified and conditioned by the stipulation that it refers exclusively to dispatching vehicles in driverless operation."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dispatch in driveless operation"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-av/isPerformedBy,
     :owl/someValuesFrom :auto-av/DriverlessOperationDispatchingEntity,
     :rdf/type           :owl/Restriction}
    :auto-av/Operation
    {:owl/onProperty     :auto-av/hasParticipant,
     :owl/someValuesFrom :auto-av/AutomatedDrivingSystemEquippedVehicle,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To place an ADS-equipped vehicle into service in driverless operation by engaging the ADS"}})

(def DriverAssistance
  "The sustained and ODD-specific execution by a driving automation system of either the lateral or the longitudinal vehicle motion control subtask of the DDT (but not both simultaneously) with the expectation that the driver performs the remainder of the DDT."
  {:db/ident :auto-av/DriverAssistance,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "Level 1"},
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 5.2",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "The term “driver assistance” as a modifier is also commonly used to describe automotive features that are not considered to be driving automation system features, because they do not provide sustained performance of part or all of the DDT."}
    {:rdf/language "en",
     :rdf/value
     "The term “Advanced Driver Assistance Systems” (ADAS) is commonly used to describe a broad range of features, including those that provide warnings and/or momentary intervention, such as forward collision warning (FCW) systems, lane keeping assistance (LKA) systems, and automatic emergency braking (AEB) systems, as well as some convenience features that involve Level 1 driver support features, such as ACC and certain parking assistance features. As such, the term ADAS is too broad and imprecise for use in a technical definitions document."}
    {:rdf/language "en",
     :rdf/value
     "A Level 1 driver support feature performing either the lateral or the longitudinal vehicle motion control subtask of the DDT is capable of only limited OEDR within its dimension (lateral or longitudinal), meaning that there are some events that the driving automation system is not capable of recognizing or responding to. Therefore, the driver must supervise the driving automation system performance by completing the OEDR subtask of the DDT as well as performing the other dimension of vehicle motion control. See Figure 2 (discussing the three primary subtasks of the DDT)."}],
   :owl/disjointWith :auto-av/PartialDrivingAutomation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driver assistance"},
   :rdfs/subClassOf [{:owl/complementOf
                      {:owl/onProperty :auto-av/realizes,
                       :owl/someValuesFrom
                       {:owl/intersectionOf
                        [:auto-av/LateralVehicleMotionControl
                         :auto-av/LongitudinalVehicleMotionControl],
                        :rdf/type :owl/Class},
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Class}
                     :auto-av/DriverSupport],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The sustained and ODD-specific execution by a driving automation system of either the lateral or the longitudinal vehicle motion control subtask of the DDT (but not both simultaneously) with the expectation that the driver performs the remainder of the DDT."}})

(def DriverSupport
  {:db/ident :auto-av/DriverSupport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driver support"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/hasParticipant,
                      :owl/someValuesFrom :auto-av/ConventionalVehicle,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :auto-av/hasUsageSpecification,
                      :owl/someValuesFrom :auto-av/OperationalDesignDomain,
                      :rdf/type           :owl/Restriction}
                     :auto-av/DrivingAutomation
                     {:owl/allValuesFrom :auto-av/DynamicDrivingSubtask,
                      :owl/onProperty    :auto-av/realizes,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty :auto-av/realizes,
                      :owl/someValuesFrom
                      {:owl/unionOf [:auto-av/LateralVehicleMotionControl
                                     :auto-av/LongitudinalVehicleMotionControl],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :auto-av/hasUserAtAllTimes,
                      :owl/someValuesFrom
                      {:owl/intersectionOf
                       [:auto-av/HumanDriver
                        {:owl/onProperty :auto-av/performs,
                         :owl/someValuesFrom
                         :auto-av/SuperviseDrivingAutomationSystemPerformance,
                         :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom
                      {:owl/unionOf [:auto-av/LateralVehicleMotionControl
                                     :auto-av/LongitudinalVehicleMotionControl],
                       :rdf/type    :owl/Class},
                      :owl/onProperty :auto-av/realizes,
                      :rdf/type :owl/Restriction}]})

(def DriverSupportDrivingAutomationSystemFeature
  "A general term for Level 1 and Level 2 driving automation system features."
  {:db/ident :auto-av/DriverSupportDrivingAutomationSystemFeature,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.8",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Level 1 (driver assistance) and Level 2 (partial automation) features are capable of performing only part of the DDT, and thus require a driver to perform the remainder of the DDT, as well as to supervise the feature’s performance while engaged. As such, these features, when engaged, support - but do not replace - a driver in performing the DDT."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driver support DAS feature"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/isResultOf,
                      :owl/someValuesFrom :auto-av/DriverSupport,
                      :rdf/type           :owl/Restriction}
                     :auto-av/DrivingAutomationSystemFeature],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A general term for Level 1 and Level 2 driving automation system features."}})

(def DriverlessOperation
  "on-road operation of an ADS-equipped vehicle that is unoccupied, or in which on-board users are not drivers or in-vehicle fallback-ready users"
  {:db/ident :auto-av/DriverlessOperation,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.9",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "On-board passengers are neither drivers nor fallback-ready users."}
    {:rdf/language "en",
     :rdf/value
     "ADS-DVs are always dispatched in driverless operation (subject to NOTE 3 in 3.33.3)."}
    {:rdf/language "en",
     :rdf/value
     "ADS-equipped dual-mode vehicles may be dispatched in driverless operation."}],
   :owl/disjointWith :auto-av/OperationWithDriver,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driverless operation"},
   :rdfs/subClassOf
   [{:owl/allValuesFrom :auto-av/AutomatedDrivingSystem,
     :owl/onProperty    :auto-av/isPerformedBy,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom {:owl/complementOf
                         {:owl/unionOf
                          [:auto-av/DynamicDriverTaskFallbackReadyUser
                           :auto-av/InVehicleDriver],
                          :rdf/type :owl/Class},
                         :rdf/type :owl/Class},
     :owl/onProperty    :auto-av/hasOnboardUser,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom :auto-av/AutomatedDrivingSystemEquippedVehicle,
     :owl/onProperty    :auto-av/hasParticipant,
     :rdf/type          :owl/Restriction}
    :auto-av/MotorVehicleOperation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "on-road operation of an ADS-equipped vehicle that is unoccupied, or in which on-board users are not drivers or in-vehicle fallback-ready users"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "A Level 4 ADS-DV is dispatched in driverless operation for purposes of providing transportation service."}})

(def DriverlessOperationDispatcher
  "user(s) who dispatches an ADS-equipped vehicle(s) in driverless operation"
  {:db/ident :auto-av/DriverlessOperationDispatcher,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.31.4",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A dispacher(s) may also perform other fleet operations functions."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driverless operation dispatcher"},
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-av/FleetOperation,
     :owl/onProperty :auto-av/performs,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :auto-av/isUserInWhileDASisEnagaged,
     :owl/someValuesFrom {:owl/unionOf [:auto-av/FullDrivingAutomation
                                        :auto-av/HighDrivingAutomation],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    :auto-av/DriverlessOperationDispatchingEntity
    :auto-av/HumanUser
    {:owl/allValuesFrom {:owl/unionOf [:auto-av/FullDrivingAutomation
                                       :auto-av/HighDrivingAutomation],
                         :rdf/type    :owl/Class},
     :owl/onProperty    :auto-av/isUserInWhileDASisEnagaged,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "user(s) who dispatches an ADS-equipped vehicle(s) in driverless operation"}})

(def DriverlessOperationDispatchingEntity
  "An entity that dispatches an ADS-equipped vehicle(s) in driverless operation."
  {:db/ident :auto-av/DriverlessOperationDispatchingEntity,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.3",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The functions carried out by a dispatching entity may be divided among one or several agents, depending on the usage specification for the ADS-equipped vehicle(s) in question."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driverless operation dispatching entity"},
   :rdfs/subClassOf {:owl/onProperty     :auto-av/performs,
                     :owl/someValuesFrom :auto-av/DispatchInDriverlessOperation,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity that dispatches an ADS-equipped vehicle(s) in driverless operation."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "A fleet of Level 4 closed campus ADS-dedicated vehicles is placed into service by a driverless operation dispatching entity, which engages the ADS for each vehicle after verifying its operational readiness and disengages the ADS when each vehicle is taken out of service."}})

(def DrivingAutomation
  "The performance by hardware/software systems of part or all of the DDT on a sustained basis."
  {:db/ident :auto-av/DrivingAutomation,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.5",
   :owl/disjointWith :auto-av/NoDrivingAutomation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driving automation"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-av/DrivingAutomationSystem,
                      :owl/onProperty    :auto-av/isPerformedBy,
                      :rdf/type          :owl/Restriction}
                     :auto-av/SustainedOperationOfVehicle],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The performance by hardware/software systems of part or all of the DDT on a sustained basis."}})

(def DrivingAutomationSystem
  "The hardware and software that are collectively capable of performing part or all of the DDT on a sustained basis; this term is used generically to describe any system capable of Level 1 to 5 driving automation."
  {:db/ident :auto-av/DrivingAutomationSystem,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.6",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In contrast to this generic term for any Level 1 to 5 system, the specific term for a Level 3 to 5 system is “automated driving system (ADS).” Given the similarity between the generic term, “driving automation system,” and the Level 3 to 5 specific term, “Automated Driving System,” the latter term should be capitalized when spelled out and reduced to its abbreviation, ADS, as much as possible, while the former term should not be (see 3.2)."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driving automation system"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-av/performs,
     :owl/someValuesFrom {:owl/unionOf [:auto-av/DrivingAutomation
                                        :auto-av/RequestToIntervene],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/hasFeature,
     :owl/someValuesFrom :auto-av/DrivingAutomationSystemFeature,
     :rdf/type           :owl/Restriction}
    :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The hardware and software that are collectively capable of performing part or all of the DDT on a sustained basis; this term is used generically to describe any system capable of Level 1 to 5 driving automation."}})

(def DrivingAutomationSystemFeature
  "A Level 1-5 driving automation system’s design-specific functionality at a given level of driving automation within a particular ODD, if applicable."
  {:db/ident :auto-av/DrivingAutomationSystemFeature,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.7",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "Because the term “driving automation system” subsumes both driver support features and ADS features, it is also acceptable to refer to them as such."}
    {:rdf/language "en",
     :rdf/value
     "Features may be referred to by generic names (e.g., automated parking) or by proprietary names."}
    {:rdf/language "en",
     :rdf/value    "Each feature satisfies a usage specification."}
    {:rdf/language "en",
     :rdf/value
     "A given driving automation system may have multiple features, each associated with a particular level of driving automation and ODD."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DAS feature"},
   :rdfs/subClassOf [:auto-av/Feature
                     {:owl/allValuesFrom :auto-av/DrivingAutomationSystem,
                      :owl/onProperty    :auto-av/isFeatureOf,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty     :auto-av/isFeatureOf,
                      :owl/someValuesFrom :auto-av/DrivingAutomationSystem,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :auto-av/DrivingAutomation,
                      :owl/onProperty    :auto-av/isResultOf,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Level 1-5 driving automation system’s design-specific functionality at a given level of driving automation within a particular ODD, if applicable."},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 4 ADS feature that performs the DDT, including DDT fallback, in a specified geo-fenced urban center."}
    {:rdf/language "en",
     :rdf/value
     "A Level 3 ADS feature that performs the DDT, excluding DDT fallback, in high-volume traffic on fully access-controlled freeways."}]})

(def DynamicDriverTaskFallbackReadyUser
  "user of a vehicle equipped with an engaged Level 3 ADS feature who is properly qualified and able to operate the vehicle and is receptive to ADS-issued requests to intervene and to evident DDT performance-relevant system failures in the vehicle compelling him or her to perform the DDT fallback"
  {:db/ident :auto-av/DynamicDriverTaskFallbackReadyUser,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.31.3",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "DDT performance by a Level 3 ADS assumes that a fallback-ready user is available to perform the DDT as required. There is no such assumption at Levels 4 and 5."}
    {:rdf/language "en",
     :rdf/value
     "A DDT fallback-ready user who transitions to performing part or all of the DDT becomes a driver (in-vehicle or remote)."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DDT fallback-ready user"},
   :rdfs/subClassOf [{:owl/onProperty :auto-av/isReceptiveTo,
                      :owl/someValuesFrom
                      :auto-av/DDTPerformanceRelevantSystemFailure,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-av/DynamicDrivingTaskFallback,
                      :owl/onProperty :auto-av/performs,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-av/MinimalRiskConditionAchievement,
                      :owl/onProperty :auto-av/performs,
                      :rdf/type       :owl/Restriction}
                     :auto-av/HumanUser
                     {:owl/onProperty     :auto-av/isUserInWhileDASisEnagaged,
                      :owl/someValuesFrom :auto-av/ConditionalDrivingAutomation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :auto-av/isReceptiveTo,
                      :owl/someValuesFrom :auto-av/RequestToIntervene,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :auto-av/ConditionalDrivingAutomation,
                      :owl/onProperty    :auto-av/isUserInWhileDASisEnagaged,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "user of a vehicle equipped with an engaged Level 3 ADS feature who is properly qualified and able to operate the vehicle and is receptive to ADS-issued requests to intervene and to evident DDT performance-relevant system failures in the vehicle compelling him or her to perform the DDT fallback"}})

(def DynamicDrivingSubtask
  "A real-time operational or tactical function required to operate a vehicle in on-road traffic."
  {:db/ident :auto-av/DynamicDrivingSubtask,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.10",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dynamic driving subtask"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/isPartOf,
                      :owl/someValuesFrom :auto-av/DynamicDrivingTask,
                      :rdf/type           :owl/Restriction}
                     :auto-cc/Task],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A real-time operational or tactical function required to operate a vehicle in on-road traffic."}})

(def DynamicDrivingTask
  "All of the real-time operational and tactical functions required to operate a vehicle in on-road traffic, excluding the strategic functions such as trip scheduling and selection of destinations and waypoints, and including, without limitation, the following subtasks: Lateral vehicle motion control via steering (operational); Longitudinal vehicle motion control via acceleration and deceleration (operational); Monitoring the driving environment via object and event detection, recognition, classification, and response preparation (operational and tactical); Object and event response execution (operational and tactical); Maneuver planning (tactical); Enhancing conspicuity via lighting, sounding the horn, signaling, gesturing, etc. (tactical)."
  {:db/ident :auto-av/DynamicDrivingTask,
   :fibo-fnd-utl-av/abbreviation "DDT",
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.10",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "In this document, reference is made to “complete(ing) the DDT.” This means fully performing all of the subtasks of the DDT, whether that role is fulfilled by the (human) driver, by the driving automation system, or by a combination of both."}
    {:rdf/language "en",
     :rdf/value
     "Figure 2 displays a schematic view of the driving task. For more information on the differences between operational, tactical, and strategic functions of driving, see 8.11."}
    {:rdf/language "en",
     :rdf/value
     "For simplification and to provide a useful shorthand term, subtasks (3) and (4) are referred to collectively as object and event detection and response (OEDR) (see 3.19)."}
    {:rdf/language "en",
     :rdf/value
     "Some driving automation systems (or the vehicles equipped with them) may have a means to change longitudinal vehicle motion control between forward and reverse."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dynamic driving task"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-av/hasPart,
     :owl/someValuesFrom :auto-av/ObjectAndEventDetectionAndResponse,
     :rdf/type           :owl/Restriction}
    :auto-cc/Task
    {:owl/onProperty     :auto-av/hasPart,
     :owl/someValuesFrom :auto-av/LongitudinalVehicleMotionControl,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/hasPart,
     :owl/someValuesFrom :auto-av/LateralVehicleMotionControl,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/hasPart,
     :owl/someValuesFrom :auto-av/Monitor,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "All of the real-time operational and tactical functions required to operate a vehicle in on-road traffic, excluding the strategic functions such as trip scheduling and selection of destinations and waypoints, and including, without limitation, the following subtasks: Lateral vehicle motion control via steering (operational); Longitudinal vehicle motion control via acceleration and deceleration (operational); Monitoring the driving environment via object and event detection, recognition, classification, and response preparation (operational and tactical); Object and event response execution (operational and tactical); Maneuver planning (tactical); Enhancing conspicuity via lighting, sounding the horn, signaling, gesturing, etc. (tactical)."}})

(def DynamicDrivingTaskFallback
  "The response by the user to either perform the DDT or achieve a minimal risk condition (1) after occurrence of a DDT performance-relevant system failure(s), or (2) upon operational design domain (ODD) exit, or the response by an ADS to achieve minimal risk condition, given the same circumstances."
  {:db/ident :auto-av/DynamicDrivingTaskFallback,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.12",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "While performing DDT fallback, an ADS may operate temporarily outside of its ODD (see 3.21 NOTE 1)."}
    {:rdf/language "en",
     :rdf/value
     "The DDT and the DDT fallback are distinct functions, and the capability to perform one does not necessarily entail the ability to perform the other. Thus, a Level 3 ADS, which is capable of performing the entire DDT within its ODD, may not be capable of performing the DDT fallback in all situations that require it and thus will issue a request to intervene to the DDT fallback-ready user when necessary (see Figures 3 to 6)."}
    {:rdf/language "en",
     :rdf/value
     "Some Level 3 features may be designed to automatically perform the fallback and achieve a minimal risk condition in some circumstances, such as when an obstacle-free, adjacent shoulder is present, but not in others, such as when no such road shoulder is available. The assignment of Level 3 therefore does not restrict the ADS from automatically achieving the minimal risk condition, but it cannot guarantee automated achievement of minimal risk condition in all cases within its ODD. Moreover, automated minimal risk condition achievement in some, but not all, circumstances that demand it does not constitute Level 4 functionality."}
    {:rdf/language "en",
     :rdf/value
     "At Level 3, an ADS is capable of continuing to perform the DDT for at least several seconds after providing the fallback-ready user with a request to intervene. The DDT fallback-ready user is then expected to resume manual vehicle operation, or to achieve a minimal risk condition if s/he determines it to be necessary."}
    {:rdf/language "en",
     :rdf/value
     "While a Level 4 or 5 ADS is performing the DDT fallback, it may be limited by design in speed and/or range of lateral and/or longitudinal vehicle motion control (i.e., it may enter so-called “limp-home mode”)."}
    {:rdf/language "en",
     :rdf/value
     "At Levels 4 and 5, the ADS must be capable of performing the DDT fallback and achieving a minimal risk condition. Level 4 and 5 ADS-equipped vehicles that are designed to also accommodate operation by a driver (whether in-vehicle or remote) may allow a user to perform the DDT fallback, when circumstances allow this to be done safely, if s/he chooses to do so (see Figures 7 and 8). However, a Level 4 or 5 ADS need not be designed to allow a user to perform DDT fallback and, indeed, may be designed to disallow it in order to reduce crash risk (see 8.9)."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DDT fallback"},
   :rdfs/subClassOf
   [{:owl/allValuesFrom {:owl/unionOf
                         [:auto-av/DDTPerformanceRelevantSystemFailure
                          :auto-av/OperationalDesignDomainExit],
                         :rdf/type :owl/Class},
     :owl/onProperty    :auto-av/isResultOf,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :auto-av/isPerformedBy,
     :owl/someValuesFrom {:owl/unionOf [:auto-av/AutomatedDrivingSystem
                                        :auto-av/HumanUser],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/hasParticipant,
     :owl/someValuesFrom :auto-av/MotorVehicle,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/isResultOf,
     :owl/someValuesFrom {:owl/unionOf
                          [:auto-av/DDTPerformanceRelevantSystemFailure
                           :auto-av/OperationalDesignDomainExit],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom {:owl/unionOf [:auto-av/AutomatedDrivingSystem
                                       :auto-av/HumanUser],
                         :rdf/type    :owl/Class},
     :owl/onProperty    :auto-av/isPerformedBy,
     :rdf/type          :owl/Restriction}
    :auto-av/Operation
    {:owl/unionOf [:auto-av/MinimalRiskConditionAchievement
                   {:owl/onProperty     :auto-av/realizes,
                    :owl/someValuesFrom :auto-av/DynamicDrivingTask,
                    :rdf/type           :owl/Restriction}],
     :rdf/type    :owl/Class}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The response by the user to either perform the DDT or achieve a minimal risk condition (1) after occurrence of a DDT performance-relevant system failure(s), or (2) upon operational design domain (ODD) exit, or the response by an ADS to achieve minimal risk condition, given the same circumstances."},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 1 adaptive cruise control (ACC) feature experiences a system failure that causes the feature to stop performing its intended function. The human driver performs the DDT fallback by resuming performance of the complete DDT."}
    {:rdf/language "en",
     :rdf/value
     "A Level 3 ADS feature that performs the entire DDT during traffic jams on freeways is not able to do so when it encounters a crash scene and therefore issues a request to intervene to the DDT fallback-ready user. S/he responds by taking over performance of the entire DDT in order to maneuver around the crash scene (see Figure 4). (Note that in this example, a minimal risk condition is not needed or achieved.)"}]})

(def FailureMigrationStrategy
  "vehicle function (not an ADS function) designed to automatically bring an ADS-equipped vehicle to a controlled stop in path following either: (1) prolonged failure of the fallback-ready user of a Level 3 ADS feature to perform the fallback after the ADS has issued a request to intervene, or (2) occurrence of a system failure or external event so catastrophic that it incapacitates the ADS, which can no longer perform vehicle motion control in order to perform the fallback and achieve a minimal risk condition. (See 8.6.)"
  {:db/ident :auto-av/FailureMigrationStrategy,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.11",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Some vehicles equipped with Level 2 driver support features may be designed to brake a vehicle to a full stop if the driver fails to indicate his/her continued supervision of feature performance during engagement. Although that is similar in function to a failure mitigation strategy as defined above, the term “failure mitigation strategy” is reserved for ADS features that do not require driver supervision."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "failure migration strategy"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-av/isFeatureOf,
     :owl/someValuesFrom :auto-av/AutomatedDrivingSystemEquippedVehicle,
     :rdf/type           :owl/Restriction}
    {:owl/complementOf {:owl/onProperty     :auto-av/isFeatureOf,
                        :owl/someValuesFrom :auto-av/AutomatedDrivingSystem,
                        :rdf/type           :owl/Restriction},
     :rdf/type         :owl/Class}
    :auto-av/Feature],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "vehicle function (not an ADS function) designed to automatically bring an ADS-equipped vehicle to a controlled stop in path following either: (1) prolonged failure of the fallback-ready user of a Level 3 ADS feature to perform the fallback after the ADS has issued a request to intervene, or (2) occurrence of a system failure or external event so catastrophic that it incapacitates the ADS, which can no longer perform vehicle motion control in order to perform the fallback and achieve a minimal risk condition. (See 8.6.)"}})

(def FairWeather
  "weather conditions conducive to driving such as good visibility and dry road surface"
  {:db/ident :auto-av/FairWeather,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fair weather"},
   :rdfs/subClassOf :auto-av/WeatherType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "weather conditions conducive to driving such as good visibility and dry road surface"}})

(def FallingWeather
  "weather characterized by heavy rain, snow or hail that makes driving difficult"
  {:db/ident :auto-av/FallingWeather,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "falling weather"},
   :rdfs/subClassOf :auto-av/WeatherType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "weather characterized by heavy rain, snow or hail that makes driving difficult"}})

(def Feature
  "Indicates a built-in feature, accessory, or component of the vehicle."
  {:db/ident :auto-av/Feature,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "feature"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicates a built-in feature, accessory, or component of the vehicle."}})

(def FleetOperation
  "The activities that support the management of a fleet of ADS-equipped vehicles in driverless operation, which may include, without limitation: Ensuring operational readiness; Dispatching ADS-equipped vehicles in driverless operation (i.e., engaging the ADSs prior to placing the vehicles in service on public roads); Authorizing each trip (e.g., payment, trip route selection); Providing fleet asset management services to vehicles while in-use (e.g., managing emergencies, summoning or providing remote assistance as needed, responding to customer requests and break-downs); Serving as the responsible agent vis-a-vis law enforcement, emergency responders and other authorities for vehicles while in use; Disengaging the ADS at the end of service; Performing vehicle repair and maintenance as needed."
  {:db/ident :auto-av/FleetOperation,
   :fibo-fnd-utl-av/adaptedFrom {:rdf/language "en",
                                 :rdf/value    "SAE-J3016 APR2021, sec. 3.13"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fleet operation"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-av/hasParticipant,
     :owl/someValuesFrom :auto-av/AutomatedDrivingSystemEquippedVehicle,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/hasPart,
     :owl/someValuesFrom :auto-av/DispatchInDriverlessOperation,
     :rdf/type           :owl/Restriction}
    :auto-av/Operation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The activities that support the management of a fleet of ADS-equipped vehicles in driverless operation, which may include, without limitation: Ensuring operational readiness; Dispatching ADS-equipped vehicles in driverless operation (i.e., engaging the ADSs prior to placing the vehicles in service on public roads); Authorizing each trip (e.g., payment, trip route selection); Providing fleet asset management services to vehicles while in-use (e.g., managing emergencies, summoning or providing remote assistance as needed, responding to customer requests and break-downs); Serving as the responsible agent vis-a-vis law enforcement, emergency responders and other authorities for vehicles while in use; Disengaging the ADS at the end of service; Performing vehicle repair and maintenance as needed."}})

(def FoggyWeather
  "weather characterized by fog that reduces visibility on the road"
  {:db/ident :auto-av/FoggyWeather,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "foggy weather"},
   :rdfs/subClassOf :auto-av/WeatherType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "weather characterized by fog that reduces visibility on the road"}})

(def Freeway
  "wide road for fast-moving traffic, especially in the US, with a limited number of places at which drivers can enter and leave it"
  {:db/ident :auto-av/Freeway,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "freeway"},
   :rdfs/subClassOf :auto-av/RoadType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "wide road for fast-moving traffic, especially in the US, with a limited number of places at which drivers can enter and leave it"}})

(def FreewayLowSpeedOptimalRoadMaintenanceFairWeather
  "fully access-controlled freeway in low-speed traffic under fair weather conditions and optimal road maintenance"
  {:db/ident :auto-av/FreewayLowSpeedOptimalRoadMaintenanceFairWeather,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.21, Example 2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "freeway, low speed, optimal road maintenance, fair weather"},
   :rdfs/subClassOf :auto-av/OperationalDesignDomain,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "fully access-controlled freeway in low-speed traffic under fair weather conditions and optimal road maintenance"}})

(def FreewayTrafficJam
  "traffic jam on a freeway"
  {:db/ident :auto-av/FreewayTrafficJam,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.32.1, Example 2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "freeway, traffic jam"},
   :rdfs/subClassOf :auto-av/OperationalDesignDomain,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "traffic jam on a freeway"}})

(def FullDrivingAutomation
  "The sustained and unconditional (i.e., not ODD-specific) performance by an ADS of the entire DDT and DDT fallback."
  {:db/ident :auto-av/FullDrivingAutomation,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "Level 5"},
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 5.6",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "“Unconditional/not ODD-specific” means that the ADS can operate the vehicle on-road anywhere within its region of the world and under all road conditions in which a conventional vehicle can be reasonably operated by a typically skilled human driver. This means, for example, that there are no design-based weather, time-of-day, or geographical restrictions on where and when the ADS can operate the vehicle. However, there may be conditions not manageable by a driver in which the ADS would also be unable to complete a given trip (e.g., white-out snow storm, flooded roads, glare ice, etc.) until or unless the adverse conditions clear. At the onset of such unmanageable conditions the ADS would perform the DDT fallback to achieve a minimal risk condition (e.g., by pulling over to the side of the road and waiting for the conditions to change)."}
    {:rdf/language "en",
     :rdf/value
     "In the event of a DDT performance-relevant system failure (of an ADS or the vehicle), a Level 5 ADS automatically performs the DDT fallback and achieves a minimal risk condition."}
    {:rdf/language "en",
     :rdf/value    "The user does not need to supervise a Level 5 ADS."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "full driving automation"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-av/hasUserWhileDASisEnagaged,
     :owl/someValuesFrom {:owl/unionOf [:auto-av/DriverlessOperationDispatcher
                                        :auto-av/Passenger
                                        :auto-av/RemoteAssistant],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    :auto-av/AutomatedDriving
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/onProperty     :auto-av/realizes,
                      :owl/someValuesFrom :auto-av/DynamicDrivingTaskFallback,
                      :rdf/type           :owl/Restriction},
     :owl/onProperty :auto-av/hasPart,
     :rdf/type       :owl/Restriction}
    {:owl/complementOf {:owl/onProperty     :auto-av/hasUsageSpecification,
                        :owl/someValuesFrom :auto-av/OperationalDesignDomain,
                        :rdf/type           :owl/Restriction},
     :rdf/type         :owl/Class}
    {:owl/onProperty     :auto-av/resultsIn,
     :owl/someValuesFrom :auto-av/FullTripFeature,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The sustained and unconditional (i.e., not ODD-specific) performance by an ADS of the entire DDT and DDT fallback."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "A vehicle with an ADS that, once programmed with a destination, is capable of operating the vehicle throughout complete trips on public roadways, regardless of the starting and end points or intervening road, traffic, and weather conditions."}})

(def FullTripFeature
  "ADS features that operate a vehicle throughout complete trips"
  {:db/ident :auto-av/FullTripFeature,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.7.3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "full-trip feature"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/isResultOf,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:auto-av/FullDrivingAutomation
                                            :auto-av/HighDrivingAutomation],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :auto-av/MotorVehicleOperation,
                      :owl/onProperty    :auto-av/performs,
                      :rdf/type          :owl/Restriction}
                     :auto-av/DrivingAutomationSystemFeature],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "ADS features that operate a vehicle throughout complete trips"},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 4 ADS-DV is dispatched in driverless operation for purposes of providing ride-hailing services to customers located within its geo-fenced area of operation."}
    {:rdf/language "en",
     :rdf/value
     "A Level 5 dual-mode vehicle is dispatched in driverless operation by its owner to go to a designated airport, pick up several family members, and bring them home. All vehicle occupants remain passengers throughout the return trip."}]})

(def GeofencedArea
  "geographic area with a virtual boundary, defined by GPS or RFID technology, that enables software to trigger a response when a mobile device enters or leaves a particular area"
  {:db/ident :auto-av/GeofencedArea,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "geofenced area"},
   :rdfs/subClassOf :auto-av/ConfinedGeographicLocation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "geographic area with a virtual boundary, defined by GPS or RFID technology, that enables software to trigger a response when a mobile device enters or leaves a particular area"}})

(def HighDrivingAutomation
  "The sustained and ODD-specific performance by an ADS of the entire DDT and DDT fallback’."
  {:db/ident :auto-av/HighDrivingAutomation,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "Level 4"},
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 5.5",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "The user does not need to supervise a Level 4 ADS feature or be receptive to a request to intervene while the ADS is engaged. A Level 4 ADS is capable of automatically performing DDT fallback, as well as achieving a minimal risk condition if a user does not resume performance of the DDT. This automated DDT fallback and minimal risk condition achievement capability is the primary difference between Level 4 and Level 3 ADS features. This means that an in-vehicle user of an engaged Level 4 ADS feature is a passenger who need not respond to DDT performance-relevant system failures."}
    {:rdf/language "en",
     :rdf/value
     "Level 4 ADS features may be designed to operate the vehicle throughout complete trips (see 3.7.3), or they may be designed to operate the vehicle during only part of a given trip (see 3.7.2), For example, in order to complete a given trip, a user of a vehicle equipped with a Level 4 ADS feature designed to operate the vehicle during high-speed freeway conditions will need to perform the DDT when the freeway ends in order to complete his or her intended trip; the ADS, however, will automatically perform the DDT fallback and achieve a minimal risk condition if the user fails to take over when the freeway ends (e.g., because s/he is sleeping). Unlike at Level 3, the Level 4 feature user is not a DDT fallback-ready user while the ADS is engaged (see Example 2 below), and thus is not expected to respond to a request to intervene in order to perform the fallback. Nevertheless, in the case that a Level 4 sub-trip feature reaches its ODD limit, the ADS may issue an alert to the passenger that s/he should resume driving in order to complete their trip. (Note that in this latter case, the alert in question is not a request to intervene, because it does not signal the need for fallback performance.)"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "high driving automation"},
   :rdfs/subClassOf
   [:auto-av/AutomatedDriving
    {:owl/onProperty     :auto-av/hasUserWhileDASisEnagaged,
     :owl/someValuesFrom {:owl/unionOf [:auto-av/DriverlessOperationDispatcher
                                        :auto-av/Passenger
                                        :auto-av/RemoteAssistant],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/onProperty     :auto-av/realizes,
                      :owl/someValuesFrom :auto-av/DynamicDrivingTaskFallback,
                      :rdf/type           :owl/Restriction},
     :owl/onProperty :auto-av/hasPart,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :auto-av/resultsIn,
     :owl/someValuesFrom :auto-av/SubTripFeature,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/hasUsageSpecification,
     :owl/someValuesFrom :auto-av/OperationalDesignDomain,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The sustained and ODD-specific performance by an ADS of the entire DDT and DDT fallback’."},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 4 ADS feature capable of performing the entire DDT during sustained operation on a motorway or freeway (i.e., within its ODD). (Note: The presence of a user in the driver’s seat who is capable of performing the DDT is envisioned in this example, as driver performance of the DDT would have been necessary before entering, and would again be necessary after leaving, the motorway or freeway. Thus, such a feature would alert the user that s/he should resume vehicle operation shortly before exiting the ODD, but if the user fails to respond to such an alert, the ADS will nevertheless perform the DDT fallback and achieve a minimal risk condition automatically.)"}
    {:rdf/language "en",
     :rdf/value
     "A Level 4 ADS feature capable of performing the entire DDT during valet parking (i.e., curb-to-door or vice versa) without any driver supervision."}
    {:rdf/language "en",
     :rdf/value
     "A driverless operation dispatcher may engage a Level 4 ADS-DV capable of following a pre-defined route within a confined geographical area (e.g., residential community, military base, university campus)."}]})

(def HighVolumeTraffic
  "traffic with a volume of more than 50,000 AADT (Annual Average Daily Traffic)"
  {:db/ident :auto-av/HighVolumeTraffic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "high-volume traffic"},
   :rdfs/subClassOf :auto-av/TrafficType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "traffic with a volume of more than 50,000 AADT (Annual Average Daily Traffic)"}})

(def Highway
  "main road, especially one that connects towns or cities"
  {:db/ident :auto-av/Highway,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "highway"},
   :rdfs/subClassOf :auto-av/RoadType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "main road, especially one that connects towns or cities"}})

(def HumanDriver
  "user who performs in real time part or all of the DDT and/or DDT fallback for a particular vehicle"
  {:db/ident :auto-av/HumanDriver,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.31.1",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This definition of “driver” does not include a robotic test device designed to exercise steering, braking, and acceleration during certain dynamic test maneuvers."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "human driver"},
   :rdfs/subClassOf
   [{:owl/allValuesFrom {:owl/unionOf [:auto-av/DriverSupport
                                       :auto-av/NoDrivingAutomation],
                         :rdf/type    :owl/Class},
     :owl/onProperty    :auto-av/isUserInAtAllTimes,
     :rdf/type          :owl/Restriction}
    :auto-av/HumanUser
    {:owl/allValuesFrom :auto-av/AutomatedDriving,
     :owl/onProperty    :auto-av/isUserInWhileDASisUnengaged,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :auto-av/isUserInWhileDASisUnengaged,
     :owl/someValuesFrom :auto-av/AutomatedDriving,
     :rdf/type           :owl/Restriction}
    {:owl/unionOf [{:owl/onProperty     :auto-av/performs,
                    :owl/someValuesFrom :auto-av/DynamicDrivingTaskFallback,
                    :rdf/type           :owl/Restriction}
                   {:owl/onProperty     :auto-av/realizes,
                    :owl/someValuesFrom {:owl/unionOf
                                         [:auto-av/DynamicDrivingSubtask
                                          :auto-av/DynamicDrivingTask],
                                         :rdf/type :owl/Class},
                    :rdf/type           :owl/Restriction}],
     :rdf/type    :owl/Class}
    {:owl/onProperty     :auto-av/operates,
     :owl/someValuesFrom :auto-av/ConventionalVehicle,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/isUserInAtAllTimes,
     :owl/someValuesFrom {:owl/unionOf [:auto-av/DriverSupport
                                        :auto-av/NoDrivingAutomation],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "user who performs in real time part or all of the DDT and/or DDT fallback for a particular vehicle"}})

(def HumanUser
  "general term referencing the human role in driving automation"
  {:db/ident :auto-av/HumanUser,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.31",
   :fibo-fnd-utl-av/explanatoryNote
   ["These human categories define roles that do not overlap and may be performed in varying sequences during a given trip"
    {:rdf/language "en",
     :rdf/value
     "The following five terms (1 - driver, 2 - passenger, 3 - DDT fallback-ready user, 4 - driverless operation dispatcher, and 5 - remote assistant) describe categories of (human) users."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "human user"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "general term referencing the human role in driving automation"}})

(def InVehicleDriver
  "driver who manually exercises in-vehicle braking, accelerating, steering, and transmission gear selection input devices in order to operate a vehicle"
  {:db/ident :auto-av/InVehicleDriver,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.31.1.1",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "“Conventional driver” is an acceptable synonym for in-vehicle driver."}
    {:rdf/language "en",
     :rdf/value
     "In a conventional or dual-mode vehicle equipped with a driving automation system, an in-vehicle driver, who may be a passenger or a fallback-ready user during ADS engagement, may assume or resume performance of part or all of the DDT from the driving automation system during a given trip."}
    {:rdf/language "en",
     :rdf/value
     "An in-vehicle driver is seated in what is normally referred to as “the driver’s seat” in automotive contexts, which is a unique seating position that makes in-vehicle input devices (steering wheel, brake and accelerator pedals, gear shift) accessible to a (human) driver."}],
   :fibo-fnd-utl-av/synonym {:rdf/language "en",
                             :rdf/value    "conventional driver"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in-vehicle driver"},
   :rdfs/subClassOf [:auto-av/HumanDriver
                     {:owl/hasValue   true,
                      :owl/onProperty :auto-av/occupiesSeatOfDriver,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :auto-av/operatesManually,
                      :owl/someValuesFrom :auto-av/ConventionalVehicle,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "driver who manually exercises in-vehicle braking, accelerating, steering, and transmission gear selection input devices in order to operate a vehicle"}})

(def InVehicleDynamicDriverTaskFallbackReadyUser
  "fallback-ready user of a conventional vehicle with an engaged Level 3 ADS feature who is seated in the driver’s seat"
  {:db/ident :auto-av/InVehicleDynamicDriverTaskFallbackReadyUser,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.31.3.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in-vehicle DDT fallback-ready user"},
   :rdfs/subClassOf [{:owl/hasValue   true,
                      :owl/onProperty :auto-av/occupiesSeatOfDriver,
                      :rdf/type       :owl/Restriction}
                     :auto-av/DynamicDriverTaskFallbackReadyUser],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "fallback-ready user of a conventional vehicle with an engaged Level 3 ADS feature who is seated in the driver’s seat"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "A Level 3 ADS sub-trip feature designed to perform the DDT in congested traffic on certain freeways encounters emergency responders who are rerouting traffic to the exit due to a serious crash; the ADS issues a request to intervene. The in-vehicle fallback-ready user becomes a driver and performs the fallback by manually operating the vehicle."}})

(def InVehicleUser
  "user occupying a seat in the vehicle"
  {:db/ident :auto-av/InVehicleUser,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, page 29",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in-vehicle user"},
   :rdfs/subClassOf :auto-av/HumanUser,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "user occupying a seat in the vehicle"}})

(def LateralVehicleMotionControl
  "The DDT subtask comprising the activities necessary for the real-time, sustained regulation of the y-axis component of vehicle motion (see Figure 9)."
  {:db/ident :auto-av/LateralVehicleMotionControl,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.14",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Lateral vehicle motion control includes the detection of the vehicle positioning relative to lane boundaries and application of steering and/or differential braking inputs to maintain appropriate lateral positioning."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lateral vehicle motion control"},
   :rdfs/subClassOf :auto-av/DynamicDrivingSubtask,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The DDT subtask comprising the activities necessary for the real-time, sustained regulation of the y-axis component of vehicle motion (see Figure 9)."}})

(def LongitudinalVehicleMotionControl
  "The DDT subtask comprising the activities necessary for the real-time, sustained regulation of the x-axis component of vehicle motion (see Figure 9)."
  {:db/ident :auto-av/LongitudinalVehicleMotionControl,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.15",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Longitudinal vehicle motion control may include forward and reverse directionality depending on the usage specification."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "longitudinal vehicle motion control"},
   :rdfs/subClassOf :auto-av/DynamicDrivingSubtask,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The DDT subtask comprising the activities necessary for the real-time, sustained regulation of the x-axis component of vehicle motion (see Figure 9)."}})

(def LowVolumeTraffic
  "traffic with a volume of less than 400 AADT (Annual Average Daily Traffic)"
  {:db/ident :auto-av/LowVolumeTraffic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "low-volume traffic"},
   :rdfs/subClassOf :auto-av/TrafficType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "traffic with a volume of less than 400 AADT (Annual Average Daily Traffic)"}})

(def ManeuverBasedFeature
  "driving automation system feature equipped on a conventional vehicle that executes a limited set of lateral and/or longitudinal vehicle motion control actions (levels 1-4) as well as associated object and event detection and response (OEDR) and all other elements of the complete DDT (level 3 or 4) in order to fulfil a specific, narrowly defined use case (e.g., parking maneuver)"
  {:db/ident :auto-av/ManeuverBasedFeature,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.7.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maneuver-based feature"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/isResultOf,
                      :owl/someValuesFrom {:owl/intersectionOf
                                           [:auto-av/DrivingAutomation
                                            {:owl/complementOf
                                             {:owl/unionOf
                                              [:auto-av/FullDrivingAutomation
                                               :auto-av/HighDrivingAutomation],
                                              :rdf/type :owl/Class},
                                             :rdf/type :owl/Class}],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :auto-av/DrivingAutomationSystemFeature],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "driving automation system feature equipped on a conventional vehicle that executes a limited set of lateral and/or longitudinal vehicle motion control actions (levels 1-4) as well as associated object and event detection and response (OEDR) and all other elements of the complete DDT (level 3 or 4) in order to fulfil a specific, narrowly defined use case (e.g., parking maneuver)"},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 3 highway overtaking assistance feature automatically performs the lateral and longitudinal vehicle motion control actions, as well as associated OEDR, necessary to pass a slower-moving vehicle on a multi-lane highway when activated by the driver or fallback-ready user."}
    {:rdf/language "en",
     :rdf/value
     "A Level 1 parking assistance feature automatically performs the lateral vehicle motion control actions necessary to parallel park a vehicle, while the driver performs the longitudinal vehicle motion control actions and supervises the feature."}
    {:rdf/language "en",
     :rdf/value
     "A Level 2 parking assistance feature automatically performs the lateral and longitudinal vehicle motion control actions necessary to parallel park a vehicle under the supervision of the driver."}]})

(def MilitaryBase
  "facility for the storage of military equipment and the training of soldiers"
  {:db/ident :auto-av/MilitaryBase,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "military base"},
   :rdfs/subClassOf :auto-av/ConfinedGeographicLocation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "facility for the storage of military equipment and the training of soldiers"}})

(def MilitaryBaseSpeedLimit25Daylight
  "geographically-defined military base, only during daylight at speeds not to exceed 25 mph"
  {:db/ident :auto-av/MilitaryBaseSpeedLimit25Daylight,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.21, Example 3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "military base, speed limit 25 kph, daylight"},
   :rdfs/subClassOf :auto-av/OperationalDesignDomain,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "geographically-defined military base, only during daylight at speeds not to exceed 25 mph"}})

(def MinimalRiskCondition
  "A stable, stopped condition to which a user or an ADS may bring a vehicle after performing the DDT fallback in order to reduce the risk of a crash when a given trip cannot or should not be continued."
  {:db/ident :auto-av/MinimalRiskCondition,
   :fibo-fnd-utl-av/abbreviation "MRC",
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.16",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "At Levels 1 and 2, the in-vehicle driver is expected to achieve a minimal risk condition as needed."}
    {:rdf/language "en",
     :rdf/value
     "At Levels 4 and 5, the ADS is capable of automatically achieving a minimal risk condition when necessary (i.e., due to ODD exit, if applicable, or due to a DDT performance-relevant system failure in the ADS or vehicle). The characteristics of automated achievement of a minimal risk condition at Levels 4 and 5 will vary according to the type and extent of the system failure, the ODD (if any) for the ADS feature in question, and the particular operating conditions when the system failure or ODD exit occurs. It may entail automatically bringing the vehicle to a stop within its current travel path, or it may entail a more extensive maneuver designed to remove the vehicle from an active lane of traffic and/or to automatically return the vehicle to a dispatching facility."}
    {:rdf/language "en",
     :rdf/value
     "At Level 3, given a DDT performance-relevant system failure in the ADS or vehicle, the DDT fallback-ready user is expected to achieve a minimal risk condition when s/he determines that it is necessary, or to otherwise perform the DDT if the vehicle is operable."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimal risk condition"},
   :rdfs/subClassOf [:auto-av/Condition
                     {:owl/onProperty     :auto-av/hasParticipant,
                      :owl/someValuesFrom :auto-av/MotorVehicle,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :auto-av/isResultOf,
                      :owl/someValuesFrom
                      :auto-av/MinimalRiskConditionAchievement,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A stable, stopped condition to which a user or an ADS may bring a vehicle after performing the DDT fallback in order to reduce the risk of a crash when a given trip cannot or should not be continued."},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A vehicle in which a Level 4 ADS is installed experiences a DDT performance-relevant system failure in its primary electrical power system. The ADS utilizes a backup power source in order to achieve a minimal risk condition."}
    {:rdf/language "en",
     :rdf/value
     "A Level 4 ADS feature designed to operate a vehicle at high speeds on freeways experiences a DDT performance-relevant system failure and automatically removes the vehicle from active lanes of traffic before coming to a stop."}]})

(def MinimalRiskConditionAchievement
  {:db/ident :auto-av/MinimalRiskConditionAchievement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimal risk condition achievement"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-av/isPerformedBy,
     :owl/someValuesFrom {:owl/unionOf [:auto-av/AutomatedDrivingSystem
                                        :auto-av/HumanUser],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/hasParticipant,
     :owl/someValuesFrom :auto-av/MotorVehicle,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom {:owl/unionOf [:auto-av/AutomatedDrivingSystem
                                       :auto-av/HumanUser],
                         :rdf/type    :owl/Class},
     :owl/onProperty    :auto-av/isPerformedBy,
     :rdf/type          :owl/Restriction}
    :auto-av/Operation]})

(def Monitor
  "A general term describing a range of functions involving real-time human or machine sensing and processing of data used to operate a vehicle, or to support its operation."
  {:db/ident :auto-av/Monitor,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.18",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "The terms below describing types of monitoring should be used when the general term “monitor” and its derivatives are insufficiently precise."}
    {:rdf/language "en",
     :rdf/value
     "The following four terms (1 - monitor the user, 2 - monitor the driving environment, 3 - monitor vehicle performance, and 4 - monitor driving automation system performance) describe categories of monitoring (see scope regarding primary actors)."}
    {:rdf/language "en",
     :rdf/value
     "The driver state or condition of being receptive to alerts or other indicators of a DDT performance-relevant system failure, as assumed in Level 3, is not a form of monitoring. The difference between receptivity and monitoring is best illustrated by example: A person who becomes aware of a fire alarm or a telephone ringing may not necessarily have been monitoring the fire alarm or the telephone. Likewise, a user who becomes aware of a trailer hitch falling off may not necessarily have been monitoring the trailer hitch. By contrast, a driver in a vehicle with an active Level 1 adaptive cruise control (ACC) system is expected to monitor both the driving environment and the ACC performance and otherwise not to wait for an alert to draw his/her attention to a situation requiring a response (see 3.22)."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "monitor"},
   :rdfs/subClassOf :auto-av/DynamicDrivingSubtask,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A general term describing a range of functions involving real-time human or machine sensing and processing of data used to operate a vehicle, or to support its operation."}})

(def MonitorDrivingAutomationSystemPerformance
  "The activities and/or automated routines for evaluating whether the driving automation system is performing part or all of the DDT appropriately."
  {:db/ident :auto-av/MonitorDrivingAutomationSystemPerformance,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.18.4",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "At higher levels of driving automation (Levels 3 to 5), the ADS monitors its own performance of the complete DDT."}
    {:rdf/language "en",
     :rdf/value
     "At Levels 1 and 2, the driver monitors the driver support feature’s performance as part of supervising."}
    {:rdf/language "en",
     :rdf/value
     "Recognizing requests to intervene issued by a driving automation system is not a form of monitoring driving automation system performance, but rather a form of receptivity."}
    {:rdf/language "en",
     :rdf/value
     "The term monitor driving automation system performance should not be used in lieu of supervise, which includes both monitoring and responding as needed to perform the DDT and is therefore more comprehensive."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "monitor driving automation system performance"},
   :rdfs/subClassOf :auto-av/Monitor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The activities and/or automated routines for evaluating whether the driving automation system is performing part or all of the DDT appropriately."},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "An in-vehicle driver monitors an engaged ACC feature to verify that it is maintaining an appropriate gap while following a preceding vehicle in a curve."}
    {:rdf/language "en",
     :rdf/value
     "A remote driver engaging a Level 2 automated parking feature monitors the pathway of the vehicle to verify that the feature is responsive to pedestrians and obstacles."}]})

(def MonitorUser
  "The activities and/or automated routines designed to assess whether and to what degree the user is performing the role specified for him/her."
  {:db/ident :auto-av/MonitorUser,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.18.1",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "User monitoring is primarily useful for Levels 2 and 3, as evidence from the field on the use of Level 1 features has not identified significant incidence of misuse or abuse of driving automation technology, and above these levels, the ADS is by definition capable of achieving a minimal risk condition automatically."}
    {:rdf/language "en",
     :rdf/value
     "User monitoring in the context of driving automation is most likely to be deployed as a countermeasure for misuse or abuse (including over-reliance due to complacency) of a driving automation system, but may also be used for other purposes."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "monitor the user"},
   :rdfs/subClassOf :auto-av/Monitor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The activities and/or automated routines designed to assess whether and to what degree the user is performing the role specified for him/her."}})

(def MonitorVehiclePerformance
  "The activities and/or automated routines that accomplish real-time evaluation of the vehicle performance, and response preparation, as needed to operate a vehicle."
  {:db/ident :auto-av/MonitorVehiclePerformance,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.18.3",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "While performing the DDT, Level 4 and 5 ADSs monitor vehicle performance. However, for Level 3 ADSs, as well as for Level 1 and 2 driving automation systems, the human driver is assumed to be receptive to vehicle conditions that adversely affect performance of the DDT (see 3.22)."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "monitor vehicle performance"},
   :rdfs/subClassOf :auto-av/Monitor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The activities and/or automated routines that accomplish real-time evaluation of the vehicle performance, and response preparation, as needed to operate a vehicle."},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "While a Level 4 ADS is engaged in stop-and-go traffic, a malfunctioning brake caliper causes the vehicle to pull to the left when the brakes are applied. The ADS recognizes this deviation, corrects the vehicle’s lateral position and transitions to a limp-home mode until it achieves a minimal risk condition."}
    {:rdf/language "en",
     :rdf/value
     "While a Level 2 driver support feature is engaged in stop-and-go traffic, a malfunctioning brake caliper causes the vehicle to pull slightly to the left when the brakes are applied. The human driver observes that the vehicle is deviating from its lane and either corrects the vehicle’s lateral position or disengages the feature entirely."}]})

(def MonitoringDrivingEnvironment
  "The activities and/or automated routines that accomplish real-time roadway environmental object and event detection, recognition, classification, and response preparation (excluding actual response), as needed to operate a vehicle."
  {:db/ident :auto-av/MonitoringDrivingEnvironment,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.18.2",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "When operating conventional vehicles that are not equipped with an engaged ADS, drivers visually sample the road scene sufficiently to competently perform the DDT while also performing secondary tasks that require short periods of eyes-off-road time (e.g., adjusting cabin comfort settings, scanning road signs, tuning a radio, etc.). Thus, monitoring the driving environment does not necessarily entail continuous eyes-on-road time by the driver."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "monitor the driving environment"},
   :rdfs/subClassOf :auto-av/Monitor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The activities and/or automated routines that accomplish real-time roadway environmental object and event detection, recognition, classification, and response preparation (excluding actual response), as needed to operate a vehicle."}})

(def MotorVehicle
  "machine designed to provide conveyance on public streets, roads, and highways"
  {:db/ident :auto-av/MotorVehicle,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.32",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "Types of [motor] vehicles discussed in this Recommended Practice include ADS-equipped vehicles, ADS-dedicated vehicles, dual-mode vehicles, and conventional vehicles. ADS-dedicated vehicles and dual-mode vehicles are always ADS-equipped vehicles. Conventional vehicles may or may not be ADS-equipped vehicles."}
    {:rdf/language "en",
     :rdf/value
     "As used in this document, [motor] vehicle refers to motorized vehicles and excludes those operated only on rail lines. For reference, 49 U.S.C. § 30102(a)(6) defines [motor] vehicle as follows: “[motor] vehicle means a vehicle driven or drawn by mechanical power and manufactured primarily for use on public streets, roads, and highways, but does not include a vehicle operated only on a rail line.”"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor vehicle"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/hasPart,
                      :owl/someValuesFrom :auto-vp/VehiclePart,
                      :rdf/type           :owl/Restriction}
                     :auto-vc/LandVehicle],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "machine designed to provide conveyance on public streets, roads, and highways"}})

(def MotorVehicleOperation
  "Collectively, the activities performed by a (human) driver (with or without support from one or more Level 1 or 2 driving automation features) or by an ADS (Level 3 to 5) to perform the entire DDT for a given vehicle."
  {:db/ident :auto-av/MotorVehicleOperation,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.20",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "Terms such as “drive,” “operate,” “driver,” and “operator” may have legal meanings that are different from their technical meanings, as contained in this document."}
    {:rdf/language "en",
     :rdf/value
     "Although use of the term operate/operating/operation implies the existence of a vehicle “operator,” this term is not defined or used in this document, which otherwise provides very specific terms and definitions for the various types of ADS-equipped vehicle users (see 3.32)."}
    {:rdf/language "en",
     :rdf/value
     "The term “drive” is not used in this document, however, in many cases it could be used correctly in lieu of “operate.”"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor vehicle operation"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/realizes,
                      :owl/someValuesFrom :auto-av/DynamicDrivingTask,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :auto-av/hasPart,
                      :owl/someValuesFrom :auto-av/SustainedOperationOfVehicle,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :auto-av/isPerformedBy,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:auto-av/AutomatedDrivingSystem
                                            :auto-av/HumanDriver],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :auto-av/Operation
                     {:owl/onProperty     :auto-av/hasParticipant,
                      :owl/someValuesFrom :auto-av/MotorVehicle,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Collectively, the activities performed by a (human) driver (with or without support from one or more Level 1 or 2 driving automation features) or by an ADS (Level 3 to 5) to perform the entire DDT for a given vehicle."}})

(def Nighttime
  "period when there is no natural light from the sun"
  {:db/ident :auto-av/Nighttime,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "nighttime"},
   :rdfs/subClassOf :auto-av/TimeOfDay,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "period when there is no natural light from the sun"}})

(def NoDrivingAutomation
  "The performance by the driver of the entire DDT, even when enhanced by active safety systems."
  {:db/ident :auto-av/NoDrivingAutomation,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "Level 0"},
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 5.1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "no driving automation"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-av/HumanDriver,
                      :owl/onProperty    :auto-av/hasUserAtAllTimes,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty     :auto-av/hasUserAtAllTimes,
                      :owl/someValuesFrom :auto-av/HumanDriver,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :auto-av/HumanDriver,
                      :owl/onProperty    :auto-av/isPerformedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty     :auto-av/realizes,
                      :owl/someValuesFrom :auto-av/DynamicDrivingTask,
                      :rdf/type           :owl/Restriction}
                     :auto-av/SustainedOperationOfVehicle],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The performance by the driver of the entire DDT, even when enhanced by active safety systems."}})

(def ObjectAndEventDetectionAndResponse
  "The subtasks of the DDT that include monitoring the driving environment (detecting, recognizing, and classifying objects and events and preparing to respond as needed) and executing an appropriate response to such objects and events (i.e., as needed to complete the DDT and/or DDT fallback)."
  {:db/ident :auto-av/ObjectAndEventDetectionAndResponse,
   :fibo-fnd-utl-av/abbreviation "OEDR",
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.19",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "object and event detection and response"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/hasPart,
                      :owl/someValuesFrom :auto-av/MonitoringDrivingEnvironment,
                      :rdf/type           :owl/Restriction}
                     :auto-av/DynamicDrivingSubtask],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The subtasks of the DDT that include monitoring the driving environment (detecting, recognizing, and classifying objects and events and preparing to respond as needed) and executing an appropriate response to such objects and events (i.e., as needed to complete the DDT and/or DDT fallback)."}})

(def OperatingCondition
  "condition defining an operational design domain (ODD)"
  {:db/ident :auto-av/OperatingCondition,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.21",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "operating condition"},
   :rdfs/subClassOf :auto-av/Condition,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "condition defining an operational design domain (ODD)"}})

(def Operation
  "act, process, or manner of operating"
  {:db/ident :auto-av/Operation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label "operation",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "act, process, or manner of operating"}})

(def OperationWithDriver
  "operation of a vehicle in which a human driver is present"
  {:db/ident :auto-av/OperationWithDriver,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "operation with driver"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-av/HumanDriver,
                      :owl/onProperty    :auto-av/isPerformedBy,
                      :rdf/type          :owl/Restriction}
                     :auto-av/MotorVehicleOperation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "operation of a vehicle in which a human driver is present"}})

(def OperationalDesignDomain
  "Operating conditions under which a given driving automation system or feature thereof is specifically designed to function, including, but not limited to, environmental, geographical, and time-of-day restrictions, and/or the requisite presence or absence of certain traffic or roadway characteristics."
  {:db/ident :auto-av/OperationalDesignDomain,
   :fibo-fnd-utl-av/abbreviation "ODD",
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.21",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "While Level 3 and 4 ADS features/vehicles are designed to operate exclusively within their respective ODDs, some ODD conditions are subject to rapid change during on-road operation (e.g., inclement weather, obscured lane lines). Such transient changes in the operating environment do not necessarily represent an “ODD exit,” as the ADS determines when such a change in conditions requires fallback performance (whether by the fallback-ready user or ADS)."}
    {:rdf/language "en",
     :rdf/value
     "Section 6 discusses the significance of ODDs in the context of the levels of driving automation."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "operational design domain"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-av/RoadType,
                      :owl/onProperty :auto-av/hasOperatingCondition,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-av/ConfinedGeographicLocation,
                      :owl/onProperty :auto-av/hasOperatingCondition,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-av/WeatherType,
                      :owl/onProperty :auto-av/hasOperatingCondition,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-av/TimeOfDay,
                      :owl/onProperty :auto-av/hasOperatingCondition,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-av/SpeedLimit,
                      :owl/onProperty :auto-av/hasOperatingCondition,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-av/RoadMaintenance,
                      :owl/onProperty :auto-av/hasOperatingCondition,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-av/TrafficType,
                      :owl/onProperty :auto-av/hasOperatingCondition,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Operating conditions under which a given driving automation system or feature thereof is specifically designed to function, including, but not limited to, environmental, geographical, and time-of-day restrictions, and/or the requisite presence or absence of certain traffic or roadway characteristics."},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "An ADS-dedicated commercial truck is designed to pick up parts from a geo-fenced sea port and deliver them via a specific route to a distribution center located 30 miles away. The vehicle’s ODD is limited to day- time operation within the specified sea port and the specific roads that constitute the prescribed route between the sea port and the distribution center."}
    {:rdf/language "en",
     :rdf/value
     "A Level 1 ACC driver support feature is designed to provide longitudinal vehicle motion control support to the driver on fully access-controlled freeways under fair weather conditions."}
    {:rdf/language "en",
     :rdf/value
     "An ADS-dedicated vehicle is designed to operate only within a geographically defined military base, and only during daylight at speeds not to exceed 25 mph."}
    {:rdf/language "en",
     :rdf/value
     "A level 3 ADS highway feature with an ODD requirement of clearly visible lane lines encounters a short stretch of roadway with obscured lane lines. The ADS feature is able to compensate for brief periods of faded or missing lane markings through other means (e.g., sensor fusion, digital map, lead vehicle following) and continues to operate the vehicle for a brief period before the lane lines again become clearly visible. A short while later, the lane lines again become obscured and remain so for longer duration, causing the ADS feature to issue a request to intervene to the fallback-ready user."}
    {:rdf/language "en",
     :rdf/value
     "An ADS feature is designed to operate a vehicle only on fully access-controlled freeways in low-speed traffic, under fair weather conditions and optimal road maintenance conditions (e.g., good lane markings and not under construction)."}]})

(def OperationalDesignDomainExit
  "leaving the operational dessing domain (ODD) assigned to a specific function of the vehicle's ADS system"
  {:db/ident :auto-av/OperationalDesignDomainExit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "operational design domain exit"},
   :rdfs/subClassOf [{:owl/onProperty :auto-av/hasParticipant,
                      :owl/someValuesFrom
                      :auto-av/AutomatedDrivingSystemEquippedVehicle,
                      :rdf/type :owl/Restriction}
                     :auto-av/Operation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "leaving the operational dessing domain (ODD) assigned to a specific function of the vehicle's ADS system"}})

(def OptimalRoadMaintenance
  "road maintenance that guarantees a high level of comfort and convenience for users, which usually means roads that are two-lane, paved, with good lane markings and are not under construction"
  {:db/ident :auto-av/OptimalRoadMaintenance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "optimal road maintenance"},
   :rdfs/subClassOf :auto-av/RoadMaintenance,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "road maintenance that guarantees a high level of comfort and convenience for users, which usually means roads that are two-lane, paved, with good lane markings and are not under construction"}})

(def ParkingSpace
  "area where vehicles can be left"
  {:db/ident :auto-av/ParkingSpace,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parking space"},
   :rdfs/subClassOf :auto-av/ConfinedGeographicLocation,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "area where vehicles can be left"}})

(def PartialDrivingAutomation
  "The sustained and ODD-specific execution by a driving automation system of both the lateral and longitudinal vehicle motion control subtasks of the DDT with the expectation that the driver completes the OEDR subtask and supervises the driving automation system."
  {:db/ident :auto-av/PartialDrivingAutomation,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "Level 2"},
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 5.3",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A Level 2 driver support feature is capable of only limited OEDR, meaning that there are some events that it is not capable of recognizing or responding to. Therefore, the driver supervises the feature’s performance by completing the OEDR subtask of the DDT. See Figure 2 (discussing the three primary subtasks of the DDT)."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "partial driving automation"},
   :rdfs/subClassOf [{:owl/onProperty :auto-av/realizes,
                      :owl/someValuesFrom
                      {:owl/intersectionOf
                       [:auto-av/LateralVehicleMotionControl
                        :auto-av/LongitudinalVehicleMotionControl],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :auto-av/DriverSupport],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The sustained and ODD-specific execution by a driving automation system of both the lateral and longitudinal vehicle motion control subtasks of the DDT with the expectation that the driver completes the OEDR subtask and supervises the driving automation system."}})

(def Passenger
  "user in a vehicle who has no role in the operation of that vehicle"
  {:db/ident :auto-av/Passenger,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.31.2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "passenger"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/isUserInAtAllTimes,
                      :owl/someValuesFrom :auto-av/SustainedOperationOfVehicle,
                      :rdf/type           :owl/Restriction}
                     :auto-av/InVehicleUser
                     {:owl/complementOf {:owl/onProperty :auto-av/operates,
                                         :owl/someValuesFrom
                                         :auto-av/MotorVehicle,
                                         :rdf/type :owl/Restriction},
                      :rdf/type         :owl/Class}
                     :auto-av/HumanUser],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "user in a vehicle who has no role in the operation of that vehicle"},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "The person seated in the driver’s seat of a vehicle equipped with a Level 4 ADS feature designed to automate high-speed vehicle operation on access-controlled freeways is a passenger while this Level 4 feature is engaged. This same person, however, is a driver before engaging this Level 4 ADS feature and again after disengaging the feature in order to exit the controlled access freeway."}
    {:rdf/language "en",
     :rdf/value
     "The in-vehicle users of a Level 5 ADS-equipped dual-mode vehicle are passengers whenever the Level 5 ADS is engaged."}
    {:rdf/language "en",
     :rdf/value
     "The in-vehicle users of an ADS-DV shuttle on a university campus are passengers."}]})

(def PoorRoadMaintenance
  {:db/ident :auto-av/PoorRoadMaintenance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label
   [{:rdf/language "en",
     :rdf/value
     "road maintenance that offers a low degree of comfort and convenience for users, often meaning poor lane markings and construction or repair work"}
    {:rdf/language "en",
     :rdf/value    "poor road maintenance"}],
   :rdfs/subClassOf :auto-av/RoadMaintenance})

(def PredefinedRoute
  "precisely defined route within a confined geographical area"
  {:db/ident :auto-av/PredefinedRoute,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "predefined route"},
   :rdfs/subClassOf :auto-av/ConfinedGeographicLocation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "precisely defined route within a confined geographical area"}})

(def RemoteAssistance
  "event-driven provision, by a remotely located human (see 3.31.5), of information or advice to an ADS-equipped vehicle in driverless operation in order to facilitate trip continuation when the ADS encounters a situation it cannot manage"
  {:db/ident :auto-av/RemoteAssistance,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.23",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "Remote assistance may include providing an ADS with revised goals and/or tasks."}
    {:rdf/language "en",
     :rdf/value
     "Remote assistance does not include real-time DDT or fallback performance by a remote driver. Rather, the ADS performs the complete DDT and/or fallback, even when assisted by a remotely located human."}
    {:rdf/language "en",
     :rdf/value
     "The remote assistance function does not include providing strategic instruction regarding selection of destinations or trip initiation timing (i.e., dispatch functions), even if the same person performs both remote assistance and dispatching functions."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "remote assistance"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/isPerformedBy,
                      :owl/someValuesFrom :auto-av/RemoteAssistant,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :auto-av/hasParticipant,
                      :owl/someValuesFrom
                      {:owl/intersectionOf
                       [:auto-av/AutomatedDrivingSystemEquippedVehicle
                        {:owl/onProperty     :auto-av/isDispatchedIn,
                         :owl/someValuesFrom :auto-av/DriverlessOperation,
                         :rdf/type           :owl/Restriction}],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :auto-av/RemoteAssistant,
                      :owl/onProperty    :auto-av/isPerformedBy,
                      :rdf/type          :owl/Restriction}
                     :auto-av/Operation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "event-driven provision, by a remotely located human (see 3.31.5), of information or advice to an ADS-equipped vehicle in driverless operation in order to facilitate trip continuation when the ADS encounters a situation it cannot manage"},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 4 ADS-DV encounters an unannounced area of road construction within its ODD. The ADS-DV communicates to a remotely located human that it is unable to proceed around the construction. The remotely located human provides a new pathway for the vehicle to follow around the construction zone that allows the ADS-DV to automatically proceed and complete its trip."}
    {:rdf/language "en",
     :rdf/value
     "A Level 4 ADS-DV detects an object in its lane that appears to be too large to drive over and stops. A remote assistant uses the vehicle’s cameras to identify that the object is an empty bag that can be safely driven through/over, and provides the instruction to the ADS-DV to proceed."}]})

(def RemoteAssistant
  "human(s) who provides remote assistance to an ADS-equipped vehicle in driverless operation"
  {:db/ident :auto-av/RemoteAssistant,
   :fibo-fnd-utl-av/adaptedFrom {:rdf/language "en",
                                 :rdf/value "SAE-J3016 APR2021, sec. 3.31.5"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A remote assistant(s) may also perform other fleet operations functions."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "remote assistant"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-av/DriverlessOperation,
                      :owl/onProperty    :auto-av/isUserInWhileDASisEnagaged,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty     :auto-av/performs,
                      :owl/someValuesFrom :auto-av/RemoteAssistance,
                      :rdf/type           :owl/Restriction}
                     :auto-av/HumanUser
                     {:owl/onProperty     :auto-av/isUserInWhileDASisEnagaged,
                      :owl/someValuesFrom :auto-av/DriverlessOperation,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "human(s) who provides remote assistance to an ADS-equipped vehicle in driverless operation"}})

(def RemoteDriver
  "driver who is not seated in a position to manually exercise in-vehicle braking, accelerating, steering, and transmission gear selection input devices (if any), but is able to operate the vehicle"
  {:db/ident :auto-av/RemoteDriver,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.31.1.2",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "A remote driver does not include a person who merely creates driving-relevant conditions that are sensed by, or communicated to, the ADS (e.g., a police officer who announces over a loudspeaker that a particular stop sign should be ignored; another driver who flashes his/her head lamps to encourage overtaking, or a pedestrian using a dedicated short range communication (DSRC) system to announce his/her presence)."}
    {:rdf/language "en",
     :rdf/value
     "A remote driver is not the same as a driverless operation dispatcher (see 3.32.4), although a driverless operation dispatcher may become a remote driver if s/he has the means to operate the vehicle remotely."}
    {:rdf/language "en",
     :rdf/value
     "A remote driver may include a user who is within the vehicle, within line-of-sight of the vehicle, or beyond line-of-sight of the vehicle."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "remote driver"},
   :rdfs/subClassOf [:auto-av/HumanDriver
                     {:owl/hasValue   false,
                      :owl/onProperty :auto-av/occupiesSeatOfDriver,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :auto-av/operatesRemotely,
                      :owl/someValuesFrom :auto-av/ConventionalVehicle,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "driver who is not seated in a position to manually exercise in-vehicle braking, accelerating, steering, and transmission gear selection input devices (if any), but is able to operate the vehicle"},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 4 closed campus delivery vehicle that has experienced a DDT performance-relevant system failure, which forced it to resort to a minimal risk condition by parking on the side of a campus roadway, is returned to its designated marshalling yard by a remote driver who is able to operate the vehicle using wireless means."}
    {:rdf/language "en",
     :rdf/value
     "A Level 2 automated parking feature allows the remote driver to exit the vehicle near an intended parking space and to cause the vehicle to move into the parking space automatically by pressing and holding a special button on the key fob, while s/he is monitoring the driving environment to ensure that no one and nothing enters the vehicle pathway during the parking maneuver. If, during the maneuver, a dog enters the pathway of the vehicle, the remote driver releases the button on the key fob in order to cause the vehicle to stop automatically. (Note that the remote driver in this Level 2 example completes the OEDR subtask of the DDT during the parking maneuver.)"}
    {:rdf/language "en",
     :rdf/value
     "Identical situation to Example 1, except that the remote driver is sitting in the back seat, rather than standing outside the vehicle."}]})

(def RemoteDriving
  "real-time performance of part or all of the DDT and/or DDT fallback (including, real-time braking, steering, acceleration, and transmission shifting), by a remote driver"
  {:db/ident :auto-av/RemoteDriving,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.24",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "Remote driving of a vehicle by a human is sometimes referred to as “teleoperation.” However, “teleoperation” is not defined consistently in the literature, and thus, to avoid confusion, is not used herein."}
    {:rdf/language "en",
     :rdf/value    "Remote driving is not driving automation."}
    {:rdf/language "en",
     :rdf/value
     "A receptive remote fallback-ready user becomes a remote driver when s/he performs the fallback."}
    {:rdf/language "en",
     :rdf/value
     "The remote driver performs or completes the OEDR and has the authority to overrule the ADS for purposes of lateral and longitudinal vehicle motion control."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "remote driving"},
   :rdfs/subClassOf [:auto-av/Operation
                     {:owl/onProperty :auto-av/realizes,
                      :owl/someValuesFrom
                      {:owl/unionOf [:auto-av/DynamicDrivingSubtask
                                     :auto-av/DynamicDrivingTask
                                     :auto-av/DynamicDrivingTaskFallback],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :auto-av/isPerformedBy,
                      :owl/someValuesFrom :auto-av/RemoteDriver,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :auto-av/hasParticipant,
                      :owl/someValuesFrom :auto-av/MotorVehicle,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :auto-av/RemoteDriver,
                      :owl/onProperty    :auto-av/isPerformedBy,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "real-time performance of part or all of the DDT and/or DDT fallback (including, real-time braking, steering, acceleration, and transmission shifting), by a remote driver"}})

(def RemoteDynamicDriverTaskFallbackReadyUser
  "fallback-ready user of a Level 3 ADS-equipped vehicle in driverless operation who is not in the driver’s seat"
  {:db/ident :auto-av/RemoteDynamicDriverTaskFallbackReadyUser,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.31.3.2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "remote DDT fallback-ready user"},
   :rdfs/subClassOf [{:owl/hasValue   false,
                      :owl/onProperty :auto-av/occupiesSeatOfDriver,
                      :rdf/type       :owl/Restriction}
                     :auto-av/DynamicDriverTaskFallbackReadyUser],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "fallback-ready user of a Level 3 ADS-equipped vehicle in driverless operation who is not in the driver’s seat"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "A Level 3 ADS-DV encounters a crash scene for which emergency personnel are re-routing traffic; the ADS issues a request to intervene. The remote fallback-ready user becomes a remote driver and performs the fallback by remotely operating the vehicle."}})

(def RequestToIntervene
  "An alert provided by a Level 3 ADS to a fallback-ready user indicating that s/he should promptly perform the DDT fallback, which may entail resuming manual operation of the vehicle (i.e., becoming a driver again), or achieving a minimal risk condition if the vehicle is not operable."
  {:db/ident :auto-av/RequestToIntervene,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.25",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "As previously noted in this document, it may be possible for a passenger in a Level 4 or 5 ADS-operated vehicle to also resume manual operation of the vehicle under certain conditions, provided that the vehicle and feature are designed for this (e.g., a dual-mode vehicle or a conventional vehicle with a Level 4 sub-trip feature). However, even when alerted by the ADS to take over vehicle operation, a passenger of such a vehicle is not required to do so to ensure competent operation, as Level 4 and 5 ADS features/vehicles are capable of automatically achieving a minimal risk condition when necessary. Thus, such an alert to a passenger of a Level 4 or 5 ADS-operated vehicle is not a “request to intervene” as defined herein for Level 3 ADS-equipped vehicles."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "request to intervene"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-av/isPerformedBy,
     :owl/someValuesFrom {:owl/intersectionOf
                          [:auto-av/AutomatedDrivingSystem
                           {:owl/onProperty :auto-av/performs,
                            :owl/someValuesFrom
                            :auto-av/ConditionalDrivingAutomation,
                            :rdf/type :owl/Restriction}],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/hasParticipant,
     :owl/someValuesFrom :auto-av/AutomatedDrivingSystemEquippedVehicle,
     :rdf/type           :owl/Restriction}
    :auto-av/Operation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An alert provided by a Level 3 ADS to a fallback-ready user indicating that s/he should promptly perform the DDT fallback, which may entail resuming manual operation of the vehicle (i.e., becoming a driver again), or achieving a minimal risk condition if the vehicle is not operable."}})

(def ResidentalCommunityArea
  "area belonging to a residential community"
  {:db/ident :auto-av/ResidentalCommunityArea,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "residental community area"},
   :rdfs/subClassOf :auto-av/ConfinedGeographicLocation,
   :skos/definition {:rdf/language "en",
                     :rdf/value "area belonging to a residential community"}})

(def RoadMaintenance
  "preserving and keeping each type of roadway, roadside, structures as nearly as possible in its original condition as constructed or as subsequently improved and the operation of roadway facilities and services to provide satisfactory and safe transportation"
  {:db/ident :auto-av/RoadMaintenance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road maintenance"},
   :rdfs/subClassOf :auto-av/OperatingCondition,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "preserving and keeping each type of roadway, roadside, structures as nearly as possible in its original condition as constructed or as subsequently improved and the operation of roadway facilities and services to provide satisfactory and safe transportation"}})

(def RoadType
  "particular kind of road"
  {:db/ident :auto-av/RoadType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road type"},
   :rdfs/subClassOf :auto-av/OperatingCondition,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "particular kind of road"}})

(def RoutineAutomatedDrivingSystemOperation
  "operation of a vehicle by an ADS within its prescribed ODD, if any, while no DDT performance-relevant system failure is occurring"
  {:db/ident :auto-av/RoutineAutomatedDrivingSystemOperation,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.26",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Routine/normal ADS operation includes vehicle responses to objects and events that are safety- and time-critical, as well as vehicle responses to the same that are not safety- and time-critical."},
   :fibo-fnd-utl-av/synonym {:rdf/language "en",
                             :rdf/value    "normal ADS operation"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "routine ADS operation"},
   :rdfs/subClassOf
   [{:owl/complementOf {:owl/onProperty :auto-av/hasPart,
                        :owl/someValuesFrom
                        :auto-av/OperationalDesignDomainExit,
                        :rdf/type :owl/Restriction},
     :rdf/type         :owl/Class}
    {:owl/complementOf {:owl/onProperty :auto-av/hasPart,
                        :owl/someValuesFrom
                        :auto-av/DDTPerformanceRelevantSystemFailure,
                        :rdf/type :owl/Restriction},
     :rdf/type         :owl/Class}
    {:owl/allValuesFrom :auto-av/AutomatedDrivingSystem,
     :owl/onProperty    :auto-av/isPerformedBy,
     :rdf/type          :owl/Restriction}
    :auto-av/MotorVehicleOperation
    {:owl/allValuesFrom :auto-av/AutomatedDrivingSystemEquippedVehicle,
     :owl/onProperty    :auto-av/hasParticipant,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "operation of a vehicle by an ADS within its prescribed ODD, if any, while no DDT performance-relevant system failure is occurring"}})

(def SpeedLimit
  "speed limit at which an ADS feature is designed to operate"
  {:db/ident :auto-av/SpeedLimit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit"},
   :rdfs/subClassOf :auto-av/OperatingCondition,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "speed limit at which an ADS feature is designed to operate"}})

(def SpeedLimit25
  "speed limit of 25 km per hour"
  {:db/ident :auto-av/SpeedLimit25,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 25"},
   :rdfs/subClassOf :auto-av/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 25 km per hour"}})

(def SpeedLimit30
  "speed limit of 30 km per hour"
  {:db/ident :auto-av/SpeedLimit30,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 30"},
   :rdfs/subClassOf :auto-av/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 30 km per hour"}})

(def SpeedLimit40
  "speed limit of 40 km per hour"
  {:db/ident :auto-av/SpeedLimit40,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 40"},
   :rdfs/subClassOf :auto-av/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 40 km per hour"}})

(def SpeedLimit50
  "speed limit of 50 km per hour"
  {:db/ident :auto-av/SpeedLimit50,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 50"},
   :rdfs/subClassOf :auto-av/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 50 km per hour"}})

(def SpeedLimit60
  "speed limit of 60 km per hour"
  {:db/ident :auto-av/SpeedLimit60,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 60"},
   :rdfs/subClassOf :auto-av/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 60 km per hour"}})

(def SpeedLimit70
  "speed limit of 70 km per hour"
  {:db/ident :auto-av/SpeedLimit70,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 70"},
   :rdfs/subClassOf :auto-av/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 70 km per hour"}})

(def SpeedLimit80
  "speed limit of 80 km per hour"
  {:db/ident :auto-av/SpeedLimit80,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed limit 80"},
   :rdfs/subClassOf :auto-av/SpeedLimit,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "speed limit of 80 km per hour"}})

(def StopAndGoTraffic
  "phenomenon that highway vehicles, instead of maintaining a steady speed, are often forced to be engaged in repeated deceleration–acceleration cycles"
  {:db/ident :auto-av/StopAndGoTraffic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stop-and-go traffic"},
   :rdfs/subClassOf :auto-av/TrafficType,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "phenomenon that highway vehicles, instead of maintaining a steady speed, are often forced to be engaged in repeated deceleration–acceleration cycles"}})

(def SubTripFeature
  "driving automation system feature equipped on a conventional vehicle that requires a human driver to perform the complete DDT for at least part of every trip"
  {:db/ident :auto-av/SubTripFeature,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.7.2",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Sub-trip features require a human driver to operate the vehicle between the point-of-origin and the boundary of the feature’s ODD and/or after leaving the feature’s ODD until the destination is reached (i.e., trip completion)."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sub-trip feature"},
   :rdfs/subClassOf
   [:auto-av/DrivingAutomationSystemFeature
    {:owl/onProperty     :auto-av/isResultOf,
     :owl/someValuesFrom {:owl/intersectionOf [:auto-av/DrivingAutomation
                                               {:owl/complementOf
                                                :auto-av/FullDrivingAutomation,
                                                :rdf/type :owl/Class}],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom {:owl/onProperty     :auto-av/isPartOf,
                         :owl/someValuesFrom :auto-av/MotorVehicleOperation,
                         :rdf/type           :owl/Restriction},
     :owl/onProperty    :auto-av/performs,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "driving automation system feature equipped on a conventional vehicle that requires a human driver to perform the complete DDT for at least part of every trip"},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 2 highway feature performs lateral and longitudinal vehicle motion control functions to support the driver in maintaining position within its lane of travel, as well as consistent headway to a lead vehicle in its lane when travelling at higher speeds."}
    {:rdf/language "en",
     :rdf/value
     "During a given vehicle trip, a user with a Level 4 automated parking feature dispatches the vehicle in driverless operation for the purpose of finding a parking space in a nearby designated parking facility. Following a period of shopping, the user retrieves the vehicle via dispatch in order to begin his/her trip home."}
    {:rdf/language "en",
     :rdf/value
     "A Level 1 adaptive cruise control (ACC) feature performs longitudinal vehicle motion control functions to support the driver in maintaining consistent headway to a lead vehicle in its lane when travelling at higher speeds."}
    {:rdf/language "en",
     :rdf/value
     "A Level 3 traffic jam feature performs the complete DDT on a fully access-controlled freeway in dense traffic, but requires a human driver to operate the vehicle upon ODD exit (e.g., when traffic clears, as well as before entering the congested freeway, and again upon exiting it)."}]})

(def SuperviseDrivingAutomationSystemPerformance
  "The driver activities, performed while operating a vehicle with an engaged Level 1 or 2 driver support feature, to monitor that feature’s performance, respond to inappropriate actions taken by the feature, and to otherwise complete the DDT."
  {:db/ident :auto-av/SuperviseDrivingAutomationSystemPerformance,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.27",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "supervise DAS performance"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-av/isPerformedBy,
     :owl/someValuesFrom :auto-av/HumanDriver,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty :auto-av/hasParticipant,
     :owl/someValuesFrom
     {:owl/intersectionOf
      [:auto-av/MotorVehicle
       {:owl/onProperty :auto-av/hasPart,
        :owl/someValuesFrom
        {:owl/intersectionOf
         [:auto-av/DrivingAutomationSystem
          {:owl/onProperty :auto-av/hasFeature,
           :owl/someValuesFrom
           :auto-av/DriverSupportDrivingAutomationSystemFeature,
           :rdf/type :owl/Restriction}],
         :rdf/type :owl/Class},
        :rdf/type :owl/Restriction}],
      :rdf/type :owl/Class},
     :rdf/type :owl/Restriction}
    {:owl/allValuesFrom :auto-av/HumanDriver,
     :owl/onProperty    :auto-av/isPerformedBy,
     :rdf/type          :owl/Restriction}
    :auto-av/Operation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The driver activities, performed while operating a vehicle with an engaged Level 1 or 2 driver support feature, to monitor that feature’s performance, respond to inappropriate actions taken by the feature, and to otherwise complete the DDT."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "A driver notices that an engaged adaptive cruise control (ACC) feature is not maintaining headway to a preceding vehicle in a curve and brakes accordingly."}})

(def SustainedOperationOfVehicle
  "Performance of part or all of the DDT both between and across external events, including responding to external events and continuing performance of part or all of the DDT in the absence of external events."
  {:db/ident :auto-av/SustainedOperationOfVehicle,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.28",
   :fibo-fnd-utl-av/explanatoryNote
   ["Conventional cruise control does not provide sustained operation because it does not respond to external events. It is therefore also not classifiable (other than at Level 0) under the taxonomy."
    {:rdf/language "en",
     :rdf/value
     "Sustained performance of part or all of the DDT by a driving automation system changes the user’s role. (See scope for discussion of roles.) By contrast, an automated intervention that is not sustained according to this definition does not qualify as driving automation. Hence, systems that provide momentary intervention in lateral and/or longitudinal vehicle motion control but do not perform any part of the DDT on a sustained basis (e.g., anti-lock brake systems, electronic stability control, automatic emergency braking) are not classifiable (other than at Level 0) under the taxonomy."}
    {:rdf/language "en",
     :rdf/value
     "External events are situations in the driving environment that necessitate a response by a driver or driving automation system (e.g., other vehicles, lane markings, traffic signs)."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sustained operation of a vehicle"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-av/isPerformedBy,
     :owl/someValuesFrom {:owl/unionOf [:auto-av/DrivingAutomationSystem
                                        :auto-av/HumanDriver],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    :auto-av/Operation
    {:owl/onProperty     :auto-av/realizes,
     :owl/someValuesFrom {:owl/unionOf [:auto-av/DynamicDrivingSubtask
                                        :auto-av/DynamicDrivingTask],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-av/isPartOf,
     :owl/someValuesFrom :auto-av/MotorVehicleOperation,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Performance of part or all of the DDT both between and across external events, including responding to external events and continuing performance of part or all of the DDT in the absence of external events."}})

(def TimeOfDay
  "particular time of day"
  {:db/ident :auto-av/TimeOfDay,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "time of day"},
   :rdfs/subClassOf :auto-av/OperatingCondition,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "particular time of day"}})

(def TrafficType
  "type of road traffic"
  {:db/ident :auto-av/TrafficType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traffic type"},
   :rdfs/subClassOf :auto-av/OperatingCondition,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "type of road traffic"}})

(def Trip
  "The traversal of an entire travel pathway by a vehicle from the point of origin to a destination."
  {:db/ident :auto-av/Trip,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.29",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Performance of the DDT during a given trip may be accomplished in whole or in part by a driver, driving automation system, or both."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trip"},
   :rdfs/subClassOf [{:owl/onProperty     :auto-av/hasParticipant,
                      :owl/someValuesFrom :auto-av/MotorVehicle,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :auto-av/MotorVehicleOperation,
                      :owl/onProperty :auto-av/isResultOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :auto-av/Operation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The traversal of an entire travel pathway by a vehicle from the point of origin to a destination."}})

(def UniversityCampus
  "land on which a college or university and related institutional buildings are situated"
  {:db/ident :auto-av/UniversityCampus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "university campus"},
   :rdfs/subClassOf :auto-av/Campus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "land on which a college or university and related institutional buildings are situated"}})

(def WeatherType
  "type of weather"
  {:db/ident :auto-av/WeatherType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "weather type"},
   :rdfs/subClassOf :auto-av/OperatingCondition,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "type of weather"}})

(def hasFeature
  "links driving automation system (DAS) with its feature"
  {:db/ident :auto-av/hasFeature,
   :owl/inverseOf :auto-av/isFeatureOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has feature"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "links driving automation system (DAS) with its feature"}})

(def hasOnboardUser
  {:db/ident :auto-av/hasOnboardUser,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has on-board user"}})

(def hasOperatingCondition
  "relates an operational design domain (ODD) with an operating condition"
  {:db/ident :auto-av/hasOperatingCondition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-av/OperationalDesignDomain,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has operating condition"},
   :rdfs/range :auto-av/OperatingCondition,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates an operational design domain (ODD) with an operating condition"}})

(def hasPart
  {:db/ident :auto-av/hasPart,
   :owl/inverseOf :auto-av/isPartOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has part"}})

(def hasParticipant
  {:db/ident :auto-av/hasParticipant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has participant"}})

(def hasUsageSpecification
  "relates particular level of driving automation with a corresponding operational design domain (ODD)"
  {:db/ident :auto-av/hasUsageSpecification,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.30",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-av/DrivingAutomation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has usage specification"},
   :rdfs/range :auto-av/OperationalDesignDomain,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates particular level of driving automation with a corresponding operational design domain (ODD)"},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "A Level 3 feature operates the vehicle in high-volume traffic on designated fully access-controlled freeways."}
    {:rdf/language "en",
     :rdf/value
     "A Level 4 ADS-DV operates at low speeds in designated urban centers."}
    {:rdf/language "en",
     :rdf/value
     "A Level 2 feature provides lateral and longitudinal vehicle motion control support to the driver on fully access-controlled freeways."}]})

(def hasUserAtAllTimes
  "links a sustained operation of a vehicle with the role of human user in this operation"
  {:db/ident :auto-av/hasUserAtAllTimes,
   :owl/inverseOf :auto-av/isUserInAtAllTimes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has user at all times"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "links a sustained operation of a vehicle with the role of human user in this operation"}})

(def hasUserWhileDASisEnagaged
  "links a driving automation level, while DAS is engaged, with the role of human user in this automation"
  {:db/ident :auto-av/hasUserWhileDASisEnagaged,
   :owl/inverseOf :auto-av/isUserInWhileDASisEnagaged,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has user while DAS is engaged"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "links a driving automation level, while DAS is engaged, with the role of human user in this automation"}})

(def hasUserWhileDASisUnengaged
  "links a driving automation level, while DAS is unengaged, with the role of human user in this automation"
  {:db/ident :auto-av/hasUserWhileDASisUnengaged,
   :owl/inverseOf :auto-av/isUserInWhileDASisUnengaged,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has user while DAS is unengaged"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "links a driving automation level, while DAS is unengaged, with the role of human user in this automation"}})

(def isCapableToParticipateIn
  "links a motor vehicle with a vehicle operation in which this vehicle is able to participate"
  {:db/ident :auto-av/isCapableToParticipateIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is capable to participate in"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "links a motor vehicle with a vehicle operation in which this vehicle is able to participate"}})

(def isDispatchedBy
  {:db/ident :auto-av/isDispatchedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is dispatched by"}})

(def isDispatchedIn
  {:db/ident :auto-av/isDispatchedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is dispatched in"}})

(def isEquippedWith
  {:db/ident :auto-av/isEquippedWith,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is equipped with"},
   :rdfs/subPropertyOf :auto-av/hasPart})

(def isFeatureOf
  "links a DAS feature with DAS"
  {:db/ident :auto-av/isFeatureOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is feature of"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "links a DAS feature with DAS"}})

(def isMalfunctionOf
  {:db/ident :auto-av/isMalfunctionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is malfunction of"}})

(def isPartOf
  {:db/ident :auto-av/isPartOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is part of"}})

(def isPerformedBy
  {:db/ident :auto-av/isPerformedBy,
   :owl/inverseOf :auto-av/performs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is performed by"}})

(def isRealizedIn
  "relates a human user role with a sustained operation in which this role occurs"
  {:db/ident :auto-av/isRealizedIn,
   :owl/inverseOf :auto-av/realizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is realized in"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a human user role with a sustained operation in which this role occurs"}})

(def isReceptiveTo
  "An aspect of consciousness characterized by a person’s ability to reliably and appropriately focus his/her attention in response to a stimulus."
  {:db/ident :auto-av/isReceptiveTo,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.22",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "In Level 0 to 2 driving automation, the driver is expected to be receptive to evident vehicle system failures, such as a broken tie rod."}
    {:rdf/language "en",
     :rdf/value
     "In Level 3 driving automation, a DDT fallback-ready user is considered to be receptive to a request to intervene and/or to an evident vehicle system failure, whether or not the ADS issues a request to intervene as a result of such a vehicle system failure."}],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-av/HumanUser,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is receptive to"},
   :rdfs/range {:owl/unionOf [:auto-av/DDTPerformanceRelevantSystemFailure
                              :auto-av/RequestToIntervene],
                :rdf/type    :owl/Class},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An aspect of consciousness characterized by a person’s ability to reliably and appropriately focus his/her attention in response to a stimulus."},
   :skos/example
   [{:rdf/language "en",
     :rdf/value
     "While a Level 3 ADS is performing the DDT in stop-and-go traffic, the left-front tire experiences a sudden blow-out. The DDT fallback-ready user is receptive to the kinesthetic cue of the vehicle pulling significantly to the left and intervenes in order to move the vehicle onto the road shoulder."}
    {:rdf/language "en",
     :rdf/value
     "While a Level 3 ADS is performing the DDT on a free-flowing highway, the left side mirror glass falls out of the housing. The DDT fallback-ready user, while receptive, does not and is not expected to notice this failure, because it is not apparent, and does not adversely affect DDT performance by the ADS."}]})

(def isResultOf
  "links process with its result"
  {:db/ident :auto-av/isResultOf,
   :owl/inverseOf :auto-av/resultsIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is result of"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "links process with its result"}})

(def isUserInAtAllTimes
  {:db/ident :auto-av/isUserInAtAllTimes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is user in at all times"}})

(def isUserInWhileDASisEnagaged
  {:db/ident :auto-av/isUserInWhileDASisEnagaged,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is user in while DAS is engaged"}})

(def isUserInWhileDASisUnengaged
  {:db/ident :auto-av/isUserInWhileDASisUnengaged,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is user in while DAS is unengaged"}})

(def occupiesSeatOfDriver
  {:db/ident :auto-av/occupiesSeatOfDriver,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :auto-av/HumanUser,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "occupies the seat of driver"},
   :rdfs/range :xsd/boolean})

(def operatedBy
  "Collectively, the activities performed by a (human) driver (with or without support from one or more Level 1 or 2 driving automation features) or by an ADS (Level 3 to 5) to perform the entire DDT for a given vehicle."
  {:db/ident :auto-av/operatedBy,
   :fibo-fnd-utl-av/adaptedFrom "SAE-J3016 APR2021, sec. 3.20",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "The term “drive” is not used in this document, however, in many cases it could be used correctly in lieu of “operate.”"}
    {:rdf/language "en",
     :rdf/value
     "Terms such as “drive,” “operate,” “driver,” and “operator” may have legal meanings that are different from their technical meanings, as contained in this document."}
    {:rdf/language "en",
     :rdf/value
     "Although use of the term operate/operating/operation implies the existence of a vehicle “operator,” this term is not defined or used in this document, which otherwise provides very specific terms and definitions for the various types of ADS-equipped vehicle users (see 3.32)."}],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "operated by"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Collectively, the activities performed by a (human) driver (with or without support from one or more Level 1 or 2 driving automation features) or by an ADS (Level 3 to 5) to perform the entire DDT for a given vehicle."}})

(def operates
  {:db/ident :auto-av/operates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "operates"}})

(def operatesManually
  {:db/ident :auto-av/operatesManually,
   :owl/propertyDisjointWith :auto-av/operatesRemotely,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "operates manually"},
   :rdfs/subPropertyOf :auto-av/operates})

(def operatesRemotely
  {:db/ident :auto-av/operatesRemotely,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "operates remotely"},
   :rdfs/subPropertyOf :auto-av/operates})

(def performs
  {:db/ident :auto-av/performs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "performs"}})

(def realizes
  {:db/ident :auto-av/realizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realizes"}})

(def resultsIn
  {:db/ident :auto-av/resultsIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/AV/VehicleAutomationLevels/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "results in"}})