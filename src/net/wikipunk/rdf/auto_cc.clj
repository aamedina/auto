(ns net.wikipunk.rdf.auto-cc
  "The Car Control Ontology (CC) has been constructed to describe driving actions and paths of autonomous vehicles."
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "The Car Control Ontology (CC) has been constructed to describe driving actions and paths of autonomous vehicles."},
   :dcterms/license "https://creativecommons.org/licenses/by-nc-sa/4.0/",
   :owl/imports
   ["https://spec.edmcouncil.org/auto/ontology/master/latest/MO/MiddleOntology/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"],
   :rdf/ns-prefix-map
   {"auto-cc" "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfa/prefix "auto-cc",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Car Control Ontology (CC) has been initially created by Lihua Zhao and Yutaka Sasaki at the Computational Intelligence Laboratory, Toyota Technological Institute, Nagoya, Japan (see https://www.toyota-ti.ac.jp/Lab/Denshi/COIN/Ontology/TTICore-0.03/) and published by the Toyota Technological Institute Smart Vehicle Research Project. CCO, as created by the Computational Intelligence Laboratory, is available under the Creative Commons - Attribution-NonCommercial-ShareAlike\n4.0 International (http://creativecommons.org/licenses/by-nc-sa/4.0/)."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Car control ontology (CC)"},
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/dependsOn "https://spec.edmcouncil.org/auto/ontology/EC/",
   :sm/fileAbbreviation "auto-de-cc",
   :sm/filename "CarControl.rdf",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/hasMaturityLevel"
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/Provisional"})

(def Acceleration
  "increase in the speed of something"
  {:db/ident         :auto-cc/Acceleration,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "acceleration"},
   :rdfs/subClassOf  :auto-cc/SpeedProfile,
   :skos/definition  "increase in the speed of something"})

(def BackwardCollisionWarning
  "notice of a possible collision with an object behind the vehicle"
  {:db/ident :auto-cc/BackwardCollisionWarning,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "backward collision warning"},
   :rdfs/subClassOf :auto-cc/CollisionWarning,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "notice of a possible collision with an object behind the vehicle"}})

(def CollisionWarning
  "notice of a possible collision"
  {:db/ident         :auto-cc/CollisionWarning,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "collision warning"},
   :rdfs/subClassOf  :auto-cc/Warning,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "notice of a possible collision"}})

(def ConstantSpeed
  "value representing the speed of a vehicle and indicating that the speed is constant"
  {:db/ident :auto-cc/ConstantSpeed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "constant speed"},
   :rdfs/subClassOf :auto-mo/Quality,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "value representing the speed of a vehicle and indicating that the speed is constant"}})

(def CurrentLaneSafeDist
  "current lane safe distance"
  {:db/ident         :auto-cc/CurrentLaneSafeDist,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "current lane safe distance"},
   :rdfs/subClassOf  :auto-cc/RoadCondition})

(def Deceleration
  "decrease in the speed of something"
  {:db/ident         :auto-cc/Deceleration,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "deceleration"},
   :rdfs/subClassOf  :auto-cc/SpeedProfile,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "decrease in the speed of something"}})

(def DestinationSelection
  "decision where to go"
  {:db/ident         :auto-cc/DestinationSelection,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "destination selection"},
   :rdfs/subClassOf  :auto-cc/StrategicFunction,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "decision where to go"}})

(def DrivingAction
  "action which consists of the driver controlling and guiding the movement of a vehicle"
  {:db/ident :auto-cc/DrivingAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "driving action"},
   :rdfs/subClassOf :auto-mo/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action which consists of the driver controlling and guiding the movement of a vehicle"}})

(def DynamicDrivingTask
  "all of the real-time operational and tactical functions required to operate a vehicle in on-road traffic, excluding the strategic functions"
  {:db/ident :auto-cc/DynamicDrivingTask,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dynamic driving task"},
   :rdfs/subClassOf
   [{:owl/onProperty     :auto-mo/hasPart,
     :owl/someValuesFrom :auto-cc/LateralVehicleMotionControl,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-mo/hasPart,
     :owl/someValuesFrom :auto-cc/LongitudinalVehicleMotionControl,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-mo/hasPart,
     :owl/someValuesFrom :auto-cc/Monitor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-mo/hasPart,
     :owl/someValuesFrom :auto-cc/ObjectAndEventDetectionAndResponse,
     :rdf/type           :owl/Restriction}
    :auto-cc/Task
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :auto-cc/OperateMotorVehicle,
     :owl/onProperty :auto-cc/hasRealizationIn,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :auto-mo/hasPart,
     :owl/someValuesFrom :auto-cc/ManeuverPlanning,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :auto-mo/hasPart,
     :owl/someValuesFrom :auto-cc/EnhancingConspicuity,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "all of the real-time operational and tactical functions required to operate a vehicle in on-road traffic, excluding the strategic functions"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/abbreviation"
   "DDT",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 3.13"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/explanatoryNote"
   [{:rdf/language "en",
     :rdf/value
     "For purposes of DDT performance: \n- level 1 encompasses automation of part of the innermost loop (i.e., either lateral vehicle motion control functionality or longitudinal vehicle motion control functionality and limited OEDR associated with the given axis of vehicle motion control); \n- level 2 encompasses automation of the innermost loop (lateral and longitudinal vehicle motion control and limited OEDR associated with vehicle motion control), and \n- levels 3-5 encompass automation of both inner loops (lateral and longitudinal vehicle motion control and complete OEDR). Note that DDT performance does not include strategic aspects of driving (e.g., determining whether, when and where to travel)."}
    {:rdf/language "en",
     :rdf/value    "Figure 1 displays a schematic view of the driving task."}
    {:rdf/language "en",
     :rdf/value
     "In this document, reference is made to “complete(ing) the DDT.” This means fully performing all of the subtasks of the DDT, whether by the (human) driver, by the driving automation system, or by both."}
    {:rdf/language "en",
     :rdf/value
     "For simplification and to provide a useful shorthand term, subtasks: \n- Monitoring the driving environment via object and event detection, recognition, classification, and response preparation (operational and tactical) and\n- Object and event response execution \nare referred to collectively as object and event detection and response (OEDR)."}]})

(def DynamicDrivingTaskSubtask
  "specific real-time tactical or operational function required to operate a vehicle in on-road traffic"
  {:db/ident :auto-cc/DynamicDrivingTaskSubtask,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dynamic driving task subtask"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :auto-cc/DynamicDrivingTask,
                      :owl/onProperty :auto-mo/isPartOf,
                      :rdf/type       :owl/Restriction}
                     :auto-cc/Task],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specific real-time tactical or operational function required to operate a vehicle in on-road traffic"}})

(def EnhancingConspicuity
  "DDT subtask comprising activities which make the vehicle more visible and distinguishable from its surroundings, such as by lightning, sounding the horn, gesturing etc."
  {:db/ident :auto-cc/EnhancingConspicuity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "enhancing conspicuity"},
   :rdfs/subClassOf :auto-cc/TacticalFunction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "DDT subtask comprising activities which make the vehicle more visible and distinguishable from its surroundings, such as by lightning, sounding the horn, gesturing etc."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/explanatoryNote"
   {:rdf/language "en",
    :rdf/value
    "Enhancing conspicuity via lighting, signaling and gesturing, etc."}})

(def ForwardCollisionWarning
  "notice of a possible collision with an object in front of the vehicle"
  {:db/ident :auto-cc/ForwardCollisionWarning,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "forward collision warning"},
   :rdfs/subClassOf :auto-cc/CollisionWarning,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "notice of a possible collision with an object in front of the vehicle"}})

(def Go
  "action resulting in the vehicle changing its position"
  {:db/ident         :auto-cc/Go,
   :rdf/type         :owl/Class,
   :rdfs/comment     "1",
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "go"},
   :rdfs/subClassOf  :auto-cc/DrivingAction,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "action resulting in the vehicle changing its position"}})

(def GoBackward
  "action resulting in the vehicle moving backwards"
  {:db/ident         :auto-cc/GoBackward,
   :rdf/type         :owl/Class,
   :rdfs/comment     "5",
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "go backward"},
   :rdfs/subClassOf  :auto-cc/DrivingAction,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "action resulting in the vehicle moving backwards"}})

(def GoForward
  "action resulting in the vehicle moving forward"
  {:db/ident         :auto-cc/GoForward,
   :rdf/type         :owl/Class,
   :rdfs/comment     "4",
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "go forward"},
   :rdfs/subClassOf  :auto-cc/DrivingAction,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "action resulting in the vehicle moving forward"}})

(def GreenGo
  "color of the traffic signal, evoked by light with a dominant wavelength of roughly 495-570 nm that signalizes that vehicle is allowed to and should go forward"
  {:db/ident :auto-cc/GreenGo,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "green go"},
   :rdfs/subClassOf :auto-cc/TrafficSignalControl,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "color of the traffic signal, evoked by light with a dominant wavelength of roughly 495-570 nm that signalizes that vehicle is allowed to and should go forward"}})

(def LaneChange
  "action during which the vehicle changes lanes"
  {:db/ident         :auto-cc/LaneChange,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "lane change"},
   :rdfs/subClassOf  :auto-mo/Action,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "action during which the vehicle changes lanes"}})

(def LaneDepartureWarning
  "notice of the departure from the lane"
  {:db/ident         :auto-cc/LaneDepartureWarning,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "lane departure warning"},
   :rdfs/subClassOf  :auto-cc/Warning,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "notice of the departure from the lane"}})

(def LateralVehicleMotionControl
  "the DDT subtask comprising the activities necessary for the real-time, sustained regulation of the y-axis component of vehicle motion"
  {:db/ident :auto-cc/LateralVehicleMotionControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lateral vehicle motion control"},
   :rdfs/subClassOf :auto-cc/OperationalFunction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the DDT subtask comprising the activities necessary for the real-time, sustained regulation of the y-axis component of vehicle motion"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 3.15"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/explanatoryNote"
   {:rdf/language "en",
    :rdf/value
    "Lateral vehicle motion control includes the detection of the vehicle positioning relative to lane boundaries and application of steering and/or differential braking inputs to maintain appropriate lateral positioning."}})

(def LeftLaneChange
  "action during which a vehicle changes lanes, moving to the one on the left"
  {:db/ident :auto-cc/LeftLaneChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "left lane change"},
   :rdfs/subClassOf :auto-cc/LaneChange,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action during which a vehicle changes lanes, moving to the one on the left"}})

(def LongitudinalVehicleMotionControl
  "the DDT subtask comprising the activities necessary for the real-time, sustained regulation of the x-axis component of vehicle motion"
  {:db/ident :auto-cc/LongitudinalVehicleMotionControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "longitudinal vehicle motion control"},
   :rdfs/subClassOf :auto-cc/OperationalFunction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the DDT subtask comprising the activities necessary for the real-time, sustained regulation of the x-axis component of vehicle motion"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 3.16"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/explanatoryNote"
   {:rdf/language "en",
    :rdf/value
    "Longitudinal vehicle motion control includes maintaining set speed as well as detecting a preceding vehicle in the path of the subject vehicle, maintaining an appropriate gap to the preceding vehicle and applying propulsion or braking inputs to cause the vehicle to maintain that speed or gap."}})

(def ManeuverPlanning
  "function that includes deciding whether and when to overtake another vehicle or change lanes"
  {:db/ident :auto-cc/ManeuverPlanning,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maneuver planning"},
   :rdfs/subClassOf :auto-cc/TacticalFunction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "function that includes deciding whether and when to overtake another vehicle or change lanes"}})

(def Monitor
  "a range of functions involving real-time human or machine sensing and processing of data used to operate a vehicle, or to support its operation"
  {:db/ident :auto-cc/Monitor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "monitor"},
   :rdfs/subClassOf [:auto-cc/OperationalFunction :auto-cc/TacticalFunction],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a range of functions involving real-time human or machine sensing and processing of data used to operate a vehicle, or to support its operation"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 3.19"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/explanatoryNote"
   [{:rdf/language "en",
     :rdf/value
     "The following four terms (1 – monitor the user, 2 – monitor the driving environment, 3 – monitor vehicle performance, and 4 – monitor driving automation system performance) describe categories of monitoring (see Scope regarding primary actors)."}
    {:rdf/language "en",
     :rdf/value
     "The terms below describing types of monitoring should be used when the general term “monitor” and its derivatives are insufficiently precise."}
    {:rdf/language "en",
     :rdf/value
     "The driver state or condition of being receptive to alerts or other indicators of a DDT performance-relevant system failure, as assumed in level 3, is not a form of monitoring. The difference between receptivity and monitoring is best illustrated by example: A person who becomes aware of a fire alarm or a telephone ringing may not necessarily have been monitoring the fire alarm or the telephone. Likewise, a user who becomes aware of a trailer hitch falling off may not necessarily have been monitoring the trailer hitch. By contrast, a driver in a vehicle with an active level 1 adaptive cruise control (ACC) system is expected to monitor both the driving environment and the ACC performance and otherwise not to wait for an alert to draw his/her attention to a situation requiring a response (see 3.23)."}]})

(def MonitorDrivingAutomationSystemPerformance
  "the activities automated routines for evaluating whether the driving automation system is performing part or all of the DDT appropriately"
  {:db/ident :auto-cc/MonitorDrivingAutomationSystemPerformance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "monitor driving automation system performance"},
   :rdfs/subClassOf :auto-cc/Monitor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the activities automated routines for evaluating whether the driving automation system is performing part or all of the DDT appropriately"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 3.19.4"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/explanatoryNote"
   [{:rdf/language "en",
     :rdf/value
     "The term monitor driving automation system performance should not be used in lieu of supervise, which includes both monitoring and responding as needed to perform the DDT and is therefore more comprehensive."}
    {:rdf/language "en",
     :rdf/value
     "Recognizing requests to intervene issued by a driving automation system is not a form of monitoring driving automation system performance, but rather a form of receptivity."}
    {:rdf/language "en",
     :rdf/value
     "At higher levels of driving automation (levels 3-5), the ADS monitors its own performance of the complete DDT."}
    {:rdf/language "en",
     :rdf/value
     "At levels 1-2, the driver monitors the driving automation system’s performance."}],
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/usageNote"
   [{:rdf/language "en",
     :rdf/value
     "A remote driver engaging a level 2 automated parking feature monitors the pathway of the vehicle to ensure that the feature is responsive to pedestrians and obstacles."}
    {:rdf/language "en",
     :rdf/value
     "A conventional driver verifies that an engaged ACC system is maintaining an appropriate gap while following a preceding vehicle in a curve."}]})

(def MonitorDrivingEnvironment
  "the activities automated routines that accomplish real-time roadway environmental object and event detection, recognition, classification, and response preparation (excluding actual response), as needed to operate a vehicle"
  {:db/ident :auto-cc/MonitorDrivingEnvironment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "monitor the driving environment"},
   :rdfs/subClassOf :auto-cc/Monitor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the activities automated routines that accomplish real-time roadway environmental object and event detection, recognition, classification, and response preparation (excluding actual response), as needed to operate a vehicle"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 3.19.2"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/explanatoryNote"
   [{:rdf/language "en",
     :rdf/value
     "When operating conventional vehicles that are not equipped with an engaged ADS, drivers visually sample the road scene sufficiently to competently perform the DDT while also performing secondary tasks that require short periods of eyes-off-road time (e.g., adjusting cabin comfort settings, scanning road signs, tuning a radio, etc.). Thus, monitoring the driving environment does not necessarily entail continuous eyes- on-road time by the driver."}
    {:rdf/language "en",
     :rdf/value
     "Monitoring the driving environment via object and event detection, recognition, classification, and response preparation"}]})

(def MonitorUser
  "the activities and/or automated routines designed to assess whether and to what degree the user is performing the role specified for him/her"
  {:db/ident :auto-cc/MonitorUser,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "monitor the user"},
   :rdfs/subClassOf :auto-cc/Monitor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the activities and/or automated routines designed to assess whether and to what degree the user is performing the role specified for him/her"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 3.19.1"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/explanatoryNote"
   [{:rdf/language "en",
     :rdf/value
     "User monitoring is primarily useful for levels 2 and 3, as evidence from the field on the use of level 1 features has not identified significant incidence of misuse or abuse of driving automation technology, and above these levels the ADS is by definition capable of achieving a minimal risk condition automatically."}
    {:rdf/language "en",
     :rdf/value
     "User monitoring in the context of driving automation is most likely to be deployed as a countermeasure for misuse or abuse (including over-reliance due to complacency) of a driving automation system but may also serve other purposes."}]})

(def MonitorVehiclePerformanceForDDTPerformanceRelevantSystemFailures
  "the activities and/or automated routines that accomplish real-time evaluation of the vehicle performance, and response preparation, as needed to operate a vehicle"
  {:db/ident
   :auto-cc/MonitorVehiclePerformanceForDDTPerformanceRelevantSystemFailures,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "monitor vehicle performance for DDT performance-relevant system failures"},
   :rdfs/subClassOf :auto-cc/Monitor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the activities and/or automated routines that accomplish real-time evaluation of the vehicle performance, and response preparation, as needed to operate a vehicle"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 3.19.3"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/explanatoryNote"
   {:rdf/language "en",
    :rdf/value
    "While performing the DDT, level 4 and 5 ADSs monitor vehicle performance. However, for level 3 ADSs, as well as for level 1 and 2 driving automation systems, the human driver is assumed to be receptive to vehicle conditions that adversely affect performance of the DDT (see definition of receptivity at 3.23)."},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/usageNote"
   [{:rdf/language "en",
     :rdf/value
     "While a level 4 ADS is engaged in stop-and-go traffic, a malfunctioning brake caliper causes the vehicle to pull to the left when the brakes are applied."}
    {:rdf/language "en",
     :rdf/value
     "While a level 2 driving automation system is engaged in stop-and-go traffic, a malfunctioning brake caliper causes the vehicle to pull slightly to the left when the brakes are applied."}]})

(def ObjectAndEventDetectionAndResponse
  "the subtasks of the DDT that include monitoring the driving environment (detecting, recognizing, and classifying objects and events and preparing to respond as needed) and executing an appropriate response to such objects and events (i.e., as needed to complete the DDT and/or DDT fallback)"
  {:db/ident :auto-cc/ObjectAndEventDetectionAndResponse,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "object and event detection and response"},
   :rdfs/subClassOf [:auto-cc/TacticalFunction :auto-cc/OperationalFunction],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Object and event response execution"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the subtasks of the DDT that include monitoring the driving environment (detecting, recognizing, and classifying objects and events and preparing to respond as needed) and executing an appropriate response to such objects and events (i.e., as needed to complete the DDT and/or DDT fallback)"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/abbreviation"
   "OEDR",
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 3.20"}})

(def OperateMotorVehicle
  "the activities performed by a (human) driver (with or without support from one or more level 1 or 2 driving automation features ) or by an ADS (level 3-5) to perform the entire DDT for a given vehicle during a trip"
  {:db/ident :auto-cc/OperateMotorVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "operate a motor vehicle"},
   :rdfs/subClassOf :auto-mo/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the activities performed by a (human) driver (with or without support from one or more level 1 or 2 driving automation features ) or by an ADS (level 3-5) to perform the entire DDT for a given vehicle during a trip"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 3.21"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/explanatoryNote"
   [{:rdf/language "en",
     :rdf/value
     "The term “drive” is not used in this document, however, in many cases it could be used correctly in lieu of “operate.”"}
    {:rdf/language "en",
     :rdf/value
     "Although use of the term operate/operating implies the existence of a vehicle “operator,” this term is not defined or used in this document, which otherwise provides very specific terms and definitions for the various types of ADS-equipped vehicle users."}]})

(def OperationalFunction
  "a function that involves split-second reactions that can be considered pre-cognitive or innate, such as making micro-corrections to steering, braking and accelerating to maintain lane position in traffic or to avoid a sudden obstacle or hazardous event in the vehicle’s pathway"
  {:db/ident :auto-cc/OperationalFunction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "operational effort"},
   :rdfs/subClassOf :auto-cc/DynamicDrivingTaskSubtask,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a function that involves split-second reactions that can be considered pre-cognitive or innate, such as making micro-corrections to steering, braking and accelerating to maintain lane position in traffic or to avoid a sudden obstacle or hazardous event in the vehicle’s pathway"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 8.11"}})

(def OverSpeedWarning
  "notice that the speed of a vehicle is above the legally determined value"
  {:db/ident :auto-cc/OverSpeedWarning,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "overspeed warning"},
   :rdfs/subClassOf :auto-cc/Warning,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "notice that the speed of a vehicle is above the legally determined value"}})

(def RedStop
  "color of a traffic signal, evoked by light with a dominant wavelength of roughly 625-740 nm, which indicates that the vehicle is not allowed to go forward and should stop"
  {:db/ident :auto-cc/RedStop,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "red stop"},
   :rdfs/subClassOf :auto-cc/TrafficSignalControl,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "color of a traffic signal, evoked by light with a dominant wavelength of roughly 625-740 nm, which indicates that the vehicle is not allowed to go forward and should stop"}})

(def RightLaneChange
  "action during which a vehicle changes lanes, moving to the one on the right"
  {:db/ident :auto-cc/RightLaneChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "right lane change"},
   :rdfs/subClassOf :auto-cc/LaneChange,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action during which a vehicle changes lanes, moving to the one on the right"}})

(def RoadCondition
  "structured value representing the current condition of a road"
  {:db/ident :auto-cc/RoadCondition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "road condition"},
   :rdfs/subClassOf :auto-mo/Quality,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured value representing the current condition of a road"}})

(def SideCollisionWarning
  "notice of a possible collision with an object located at the side of the vehicle"
  {:db/ident :auto-cc/SideCollisionWarning,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "side collision warning"},
   :rdfs/subClassOf :auto-cc/CollisionWarning,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "notice of a possible collision with an object located at the side of the vehicle"}})

(def SmoothAcceleration
  "gradual increase in the speed of a vehicle"
  {:db/ident         :auto-cc/SmoothAcceleration,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "smooth acceleration"},
   :rdfs/subClassOf  :auto-cc/Acceleration,
   :skos/definition  {:rdf/language "en",
                      :rdf/value "gradual increase in the speed of a vehicle"}})

(def SmoothDeceleration
  "gradual decrease in the speed of a vehicle"
  {:db/ident         :auto-cc/SmoothDeceleration,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "smooth deceleration"},
   :rdfs/subClassOf  :auto-cc/Deceleration,
   :skos/definition  {:rdf/language "en",
                      :rdf/value "gradual decrease in the speed of a vehicle"}})

(def SpeedProfile
  "juxtaposition of all changes in the speed of a vehicle"
  {:db/ident :auto-cc/SpeedProfile,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speed profile"},
   :rdfs/subClassOf :auto-mo/Process,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "juxtaposition of all changes in the speed of a vehicle"}})

(def Stop
  "action resulting in the vehicle stopping any movement"
  {:db/ident         :auto-cc/Stop,
   :rdf/type         :owl/Class,
   :rdfs/comment     "0",
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "stop"},
   :rdfs/subClassOf  :auto-cc/DrivingAction,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "action resulting in the vehicle stopping any movement"}})

(def StrategicFunction
  "function that involves deciding whether, where and when to go, how to travel, which best routes to take, etc."
  {:db/ident :auto-cc/StrategicFunction,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "destiantion and waypoints planning"},
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "strategic function"},
   :rdfs/subClassOf :auto-cc/Task,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "function that involves deciding whether, where and when to go, how to travel, which best routes to take, etc."}})

(def SuddenAcceleration
  "sudden increase in the speed of a vehicle"
  {:db/ident         :auto-cc/SuddenAcceleration,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "sudden acceleration"},
   :rdfs/subClassOf  :auto-cc/Acceleration,
   :skos/definition  {:rdf/language "en",
                      :rdf/value "sudden increase in the speed of a vehicle"}})

(def SuddenDeceleration
  "sudden decrease in the speed of a vehicle"
  {:db/ident         :auto-cc/SuddenDeceleration,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "sudden deceleration"},
   :rdfs/subClassOf  :auto-cc/Deceleration,
   :skos/definition  {:rdf/language "en",
                      :rdf/value "sudden decrease in the speed of a vehicle"}})

(def TacticalFunction
  "a function that involves maneuvering the vehicle in traffic during a trip, including deciding whether and when to overtake another vehicle or change lanes, selecting an appropriate speed, checking mirrors, etc"
  {:db/ident :auto-cc/TacticalFunction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tactical effort"},
   :rdfs/subClassOf :auto-cc/DynamicDrivingTaskSubtask,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a function that involves maneuvering the vehicle in traffic during a trip, including deciding whether and when to overtake another vehicle or change lanes, selecting an appropriate speed, checking mirrors, etc"},
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/adaptedFrom"
   {:rdf/language "en",
    :rdf/value    "J3016 JUN2018, section 8.11"}})

(def Task
  "function that a human or an automated driver can perform"
  {:db/ident :auto-cc/Task,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "task"},
   :rdfs/subClassOf :auto-mo/Disposition,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "function that a human or an automated driver can perform"}})

(def ToLeft
  "action resulting in the vehicle making a below 90 degrees turn to the left"
  {:db/ident :auto-cc/ToLeft,
   :rdf/type :owl/Class,
   :rdfs/comment "2",
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "to left"},
   :rdfs/subClassOf :auto-cc/DrivingAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action resulting in the vehicle making a below 90 degrees turn to the left"}})

(def ToRight
  "action resulting in the vehicle making a below 90 degrees turn to the right"
  {:db/ident :auto-cc/ToRight,
   :rdf/type :owl/Class,
   :rdfs/comment "3",
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "to right"},
   :rdfs/subClassOf :auto-cc/DrivingAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action resulting in the vehicle making a below 90 degrees turn to the right"}})

(def TrafficSignalControl
  "highway traffic signal by which traffic is alternately directed to stop and permitted to proceed"
  {:db/ident :auto-cc/TrafficSignalControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traffic signal control"},
   :rdfs/subClassOf :auto-mo/GenericallyDependentContinuant,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "highway traffic signal by which traffic is alternately directed to stop and permitted to proceed"}})

(def TripScheduling
  "decision when to go"
  {:db/ident         :auto-cc/TripScheduling,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "trip scheduling"},
   :rdfs/subClassOf  :auto-cc/StrategicFunction,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "decision when to go"}})

(def TurnLeft
  "action resulting in the vehicle making an above, or equal to 90 degrees turn to the left"
  {:db/ident :auto-cc/TurnLeft,
   :rdf/type :owl/Class,
   :rdfs/comment "6",
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "turn left"},
   :rdfs/subClassOf :auto-cc/DrivingAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action resulting in the vehicle making an above, or equal to 90 degrees turn to the left"}})

(def TurnRight
  "action resulting in the vehicle making an above, or equal to 90 degrees turn to the right"
  {:db/ident :auto-cc/TurnRight,
   :rdf/type :owl/Class,
   :rdfs/comment "7",
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "turn right"},
   :rdfs/subClassOf :auto-cc/DrivingAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action resulting in the vehicle making an above, or equal to 90 degrees turn to the right"}})

(def WaitThenGo
  "action that consists of the vehicle firstly not moving, and then moving"
  {:db/ident :auto-cc/WaitThenGo,
   :rdf/type :owl/Class,
   :rdfs/comment "8",
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "wait then go"},
   :rdfs/subClassOf :auto-cc/DrivingAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action that consists of the vehicle firstly not moving, and then moving"}})

(def Warning
  "notice of possible danger or a problem"
  {:db/ident         :auto-cc/Warning,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "warning"},
   :rdfs/subClassOf  :auto-mo/Process,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "notice of possible danger or a problem"}})

(def WaypointSelection
  "selection of a waypoint"
  {:db/ident         :auto-cc/WaypointSelection,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "waypoint selection"},
   :rdfs/subClassOf  :auto-cc/StrategicFunction,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "selection of a waypoint"}})

(def Yellow
  "color of a traffic signal, evoked by light with a dominant wavelength of roughly 575-585 nm which is an intermediate between red and green"
  {:db/ident :auto-cc/Yellow,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "yellow"},
   :rdfs/subClassOf :auto-cc/TrafficSignalControl,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "color of a traffic signal, evoked by light with a dominant wavelength of roughly 575-585 nm which is an intermediate between red and green"}})

(def approachTo
  "relates a vehicle to an intersection it is approaching"
  {:db/ident :auto-cc/approachTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "approach to"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "relates a vehicle to an intersection it is approaching"}})

(def collisionWarningWith
  "indicates incoming collisions between our vehicle and other vehicles"
  {:db/ident :auto-cc/collisionWarningWith,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collision warning with"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates incoming collisions between our vehicle and other vehicles"}})

(def endLane
  "relates a path to its end lane"
  {:db/ident         :auto-cc/endLane,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "end lane"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "relates a path to its end lane"}})

(def enterOf
  "enter of"
  {:db/ident :auto-cc/enterOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label "enter of",
   :rdfs/subPropertyOf :auto-cc/isNodeOf})

(def exitOf
  "exit of"
  {:db/ident :auto-cc/exitOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label "exit of",
   :rdfs/subPropertyOf :auto-cc/isNodeOf})

(def giveWay
  "give way"
  {:db/ident         :auto-cc/giveWay,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "give way"}})

(def hasAgent
  "relates something to an agent"
  {:db/ident         :auto-cc/hasAgent,
   :owl/inverseOf    :auto-cc/isAgentOf,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has agent"},
   :rdfs/range       :auto-mo/Agent,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "relates something to an agent"}})

(def hasNode
  "relates a way, a path or a road to a given node"
  {:db/ident         :auto-cc/hasNode,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has node"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "relates a way, a path or a road to a given node"}})

(def hasPathSegment
  "relates a way, a path or a road to a given path segment"
  {:db/ident :auto-cc/hasPathSegment,
   :owl/inverseOf :auto-cc/isPathSegmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label "has path segment",
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "relates a way, a path or a road to a given path segment"}})

(def hasRealizationIn
  "has realization in"
  {:db/ident         :auto-cc/hasRealizationIn,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has realization in"}})

(def isAgentOf
  "is agent of"
  {:db/ident         :auto-cc/isAgentOf,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :auto-mo/Agent,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "is agent of"}})

(def isNodeOf
  "relates a node to a given way, path or road"
  {:db/ident         :auto-cc/isNodeOf,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "is node of"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "relates a node to a given way, path or road"}})

(def isPathSegmentOf
  "relates a path segment to a given way, path or road"
  {:db/ident         :auto-cc/isPathSegmentOf,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       "is path segment of",
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "relates a path segment to a given way, path or road"}})

(def nextNode
  "relates a node to a subsequent one"
  {:db/ident         :auto-cc/nextNode,
   :owl/inverseOf    :auto-cc/prevNode,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       "next node",
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "relates a node to a subsequent one"}})

(def nextPathSegment
  "relates a path segment to a subsequent one"
  {:db/ident         :auto-cc/nextPathSegment,
   :owl/inverseOf    :auto-cc/prevPathSegment,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       "next path segment",
   :skos/definition  {:rdf/language "en",
                      :rdf/value "relates a path segment to a subsequent one"}})

(def nodePos
  "relates a node to its position expressed in longitude, latitude and optionally altitude"
  {:db/ident :auto-cc/nodePos,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label "node position",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a node to its position expressed in longitude, latitude and optionally altitude"}})

(def pathSegmentID
  "relates a path segment to its ID"
  {:db/ident         :auto-cc/pathSegmentID,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       "path segment ID",
   :rdfs/range       :xsd/string,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "relates a path segment to its ID"}})

(def prevNode
  "relates a node to a previous one"
  {:db/ident         :auto-cc/prevNode,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       "previous node",
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "relates a node to a previous one"}})

(def prevPathSegment
  "relates a path segment to a previous one"
  {:db/ident         :auto-cc/prevPathSegment,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       "previous path segment",
   :skos/definition  {:rdf/language "en",
                      :rdf/value "relates a path segment to a previous one"}})

(def startLane
  "relates a path to its starting lane"
  {:db/ident         :auto-cc/startLane,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/auto/ontology/DE/CarControl/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "start lane"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "relates a path to its starting lane"}})

(def ^{:private true} hasPart
  {:db/ident :auto-mo/hasPart,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} isPartOf
  {:db/ident :auto-mo/isPartOf,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} altLabel
  {:db/ident :skos/altLabel,
   :rdf/type :owl/AnnotationProperty})