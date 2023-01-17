(ns net.wikipunk.rdf.auto-vp
  "This Vehicle Parts Ontology (VP) describes the car's parts. It contains many classes and properties extracted from: - the GENIVI VSS Ontology (VSSO) has been initially created by Benjamin Klotz, Daniel Wilms, and Raphael Troncy (see http://automotive.eurecom.fr/vsso). VSSO, as created by Benjamin Klotz, Daniel Wilms, and Raphael Troncy, is available under the Creative Commons Attribution 4.0 International license; see http://creativecommons.org/licenses/by/4.0/."
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "This Vehicle Parts Ontology (VP) describes the car's parts.\n\nIt contains many classes and properties extracted from:\n- the GENIVI VSS Ontology (VSSO) has been initially created by Benjamin Klotz, Daniel Wilms, and Raphael Troncy (see http://automotive.eurecom.fr/vsso). VSSO, as created by Benjamin Klotz, Daniel Wilms, and Raphael Troncy, is available under the Creative Commons Attribution 4.0 International license; see http://creativecommons.org/licenses/by/4.0/."},
   :dcterms/created #inst "2021-08-16T17:55:00.000-00:00",
   :dcterms/license "http://creativecommons.org/licenses/by/4.0/",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/auto/ontology/master/latest/MO/MiddleOntology/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"],
   :rdf/ns-prefix-map
   {"auto-mo" "https://spec.edmcouncil.org/auto/ontology/MO/MiddleOntology/",
    "auto-vp" "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
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
   :rdf/uri "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfa/prefix "auto-vp",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "Vehicle parts ontology (VP)",
   :sm/fileAbbreviation "auto-vp",
   :sm/filename "VehicleParts.rdf"})

(def ABS
  "portion of a service brake system that automatically controls the degree of rotational wheel slip"
  {:db/ident :auto-vp/ABS,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.ADAS.ABS : Antilock Braking System signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ABS"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/ADAS,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "portion of a service brake system that automatically controls the degree of rotational wheel slip"}})

(def ADAS
  "broad range of features, including those that provide warnings and/or momentary intervention, such as forward collision warning (FCW) systems, lane keeping assistance (LKA) systems, and automatic emergency braking (AEB) systems, as well as some convenience features that involve Level 1 driver support features, such as ACC and certain parking assistance features"
  {:db/ident :auto-vp/ADAS,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.ADAS : All Advanced Driver Assist Systems attributes"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ADAS"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "broad range of features, including those that provide warnings and/or momentary intervention, such as forward collision warning (FCW) systems, lane keeping assistance (LKA) systems, and automatic emergency braking (AEB) systems, as well as some convenience features that involve Level 1 driver support features, such as ACC and certain parking assistance features"}})

(def Acceleration
  "Signal/Attribute.Vehicle.Acceleration : Spacial acceleration"
  {:db/ident :auto-vp/Acceleration,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.Vehicle.Acceleration : Spacial acceleration"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "acceleration"},
   :rdfs/subClassOf :auto-vp/VehiclePart})

(def AcceleratorPedal
  "pedal that controls the amount of gas being fed into the engine and thereby controls the speed of the vehicle"
  {:db/ident :auto-vp/AcceleratorPedal,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.Chassis.Accelerator : Accelerator signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accelerator"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Chassis,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "pedal that controls the amount of gas being fed into the engine and thereby controls the speed of the vehicle"}})

(def AirBrakeSystem
  "system, including an air-over-hydraulic brake subsystem, that uses air as a medium for transmitting pressure or force from the driver control to the service brake but does not include a system that uses compressed air or vacuum only to assist the driver in applying muscular force to hydraulic or mechanical components"
  {:db/ident :auto-vp/AirBrakeSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "air brake system"},
   :rdfs/subClassOf :auto-vp/BrakeSystem,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "system, including an air-over-hydraulic brake subsystem, that uses air as a medium for transmitting pressure or force from the driver control to the service brake but does not include a system that uses compressed air or vacuum only to assist the driver in applying muscular force to hydraulic or mechanical components"}})

(def AirOverHydraulicBrakeSystem
  "subsystem of the air brake system that uses compressed air to transmit a force from the driver control to a hydraulic brake system to actuate the service brakes"
  {:db/ident :auto-vp/AirOverHydraulicBrakeSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "air over-hydraulic brake system"},
   :rdfs/subClassOf :auto-vp/AirBrakeSystem,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subsystem of the air brake system that uses compressed air to transmit a force from the driver control to a hydraulic brake system to actuate the service brakes"}})

(def Airbag
  "inflatable occupant restraint device that is designed to deploy in a side impact crash to help mitigate occupant injury and/or ejection"
  {:db/ident :auto-vp/Airbag,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.Cabin.Seat.RowX.PosX.Airbag : Airbag signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "airbag"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Seat,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "inflatable occupant restraint device that is designed to deploy in a side impact crash to help mitigate occupant injury and/or ejection"}})

(def AltenateO2Sensor
  "Signal/Attribute.OBD.O2Alt.BankX.SensorX : Alternate oxygen sensor"
  {:db/ident :auto-vp/AltenateO2Sensor,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.OBD.O2Alt.BankX.SensorX : Alternate oxygen sensor"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "alternate O2 sensor"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/OBD,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart]})

(def AnchorPoint
  "part of the structure, fitting or attachment on a vehicle or article of cargo to which a tiedown is attached"
  {:db/ident :auto-vp/AnchorPoint,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "anchor point"},
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "part of the structure, fitting or attachment on a vehicle or article of cargo to which a tiedown is attached"}})

(def AngularVelocity
  "Signal/Attribute.Vehicle.AngularVelocity : Spacial rotation"
  {:db/ident :auto-vp/AngularVelocity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.Vehicle.AngularVelocity : Spacial rotation"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gyro"},
   :rdfs/subClassOf :auto-vp/VehiclePart})

(def AutomaticDisconnect
  "device, that when triggered, conductively separates a high voltage source from the electric power train or the rest of the electric power train"
  {:db/ident :auto-vp/AutomaticDisconnect,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "automatic disconnect"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device, that when triggered, conductively separates a high voltage source from the electric power train or the rest of the electric power train"}})

(def AuxiliaryDrivingLamp
  "lighting device mounted to provide illumination forward of the vehicle, which supplements the upper beam of a standard headlighting system"
  {:db/ident :auto-vp/AuxiliaryDrivingLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "auxiliary driving lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lighting device mounted to provide illumination forward of the vehicle, which supplements the upper beam of a standard headlighting system"}})

(def Axle
  "pin or shaft on or with which a wheel or pair of wheels revolves"
  {:db/ident :auto-vp/Axle,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value    "Signal/Attribute.Chassis.Axle : Axle signals"}
    {:rdf/language "en",
     :rdf/value
     "Signal/Attribute.Chassis.Axle : Axle configuration attributes"}],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "axle"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Chassis,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "pin or shaft on or with which a wheel or pair of wheels revolves"}})

(def BackDoor
  "door or door system on the back end of a motor vehicle through which passengers can enter or depart the vehicle or cargo can be loaded or unloaded"
  {:db/ident :auto-vp/BackDoor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "back door"},
   :rdfs/subClassOf :auto-vp/Door,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "door or door system on the back end of a motor vehicle through which passengers can enter or depart the vehicle or cargo can be loaded or unloaded"}})

(def BackupLamp
  "lamp that illuminates the road to the rear of a vehicle and provides a warning signal to pedestrians and other drivers when the vehicle is backing up or is about to back up"
  {:db/ident :auto-vp/BackupLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "backup lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lamp that illuminates the road to the rear of a vehicle and provides a warning signal to pedestrians and other drivers when the vehicle is backing up or is about to back up"}})

(def BatteryManagement
  "device or solution that manages battery performance, including controlling the charging and discharging of batteries, electrochemical cells, and fuel cells"
  {:db/ident :auto-vp/BatteryManagement,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Drivetrain.BatteryManagement : Battery Management attributes"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "battery management"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Drivetrain,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device or solution that manages battery performance, including controlling the charging and discharging of batteries, electrochemical cells, and fuel cells"}})

(def Bead
  "part of the tire made of steel wires, wrapped or reinforced by ply cords, that is shaped to fit the rim"
  {:db/ident :auto-vp/Bead,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bead"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Tire,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "part of the tire made of steel wires, wrapped or reinforced by ply cords, that is shaped to fit the rim"}})

(def BiasPlyTire
  "pneumatic tire in which the ply cords that extend to the beads are laid at alternate angles substantially less than 90° to the centerline of the tread"
  {:db/ident :auto-vp/BiasPlyTire,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bias ply tire"},
   :rdfs/subClassOf :auto-vp/PneumaticTire,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "pneumatic tire in which the ply cords that extend to the beads are laid at alternate angles substantially less than 90° to the centerline of the tread"}})

(def Blocking
  "structure, device, or another substantial article placed against or around an article of cargo to prevent horizontal movement of the article of cargo"
  {:db/ident :auto-vp/Blocking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "blocking"},
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structure, device, or another substantial article placed against or around an article of cargo to prevent horizontal movement of the article of cargo"}})

(def Body
  "outer panels that shroud a vehicle's mechanical and electrical workings"
  {:db/ident :auto-vp/Body,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Signal/Attribute.Body : All body components"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "body"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "outer panels that shroud a vehicle's mechanical and electrical workings"}})

(def BoosterSeat
  "backless child restraint system or a belt-positioning seat"
  {:db/ident :auto-vp/BoosterSeat,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "booster seat",
   :rdfs/subClassOf :auto-vp/Seat,
   :skos/definition
   "backless child restraint system or a belt-positioning seat"})

(def Brace
  "fixed diagonal structural member in an open body vehicle that is used to brace the roll-bar and that connects the roll-bar to the main body of the vehicle structure"
  {:db/ident :auto-vp/Brace,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "brace",
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   "fixed diagonal structural member in an open body vehicle that is used to brace the roll-bar and that connects the roll-bar to the main body of the vehicle structure"})

(def Bracing
  "structure, device, or another substantial article placed against an article of cargo to prevent it from tipping, that may also prevent it from shifting"
  {:db/ident :auto-vp/Bracing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bracing"},
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structure, device, or another substantial article placed against an article of cargo to prevent it from tipping, that may also prevent it from shifting"}})

(def Brake
  "energy conversion mechanism used to stop, or hold a vehicle stationary"
  {:db/ident :auto-vp/Brake,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Chassis.Axle.RowX.Wheel.Left/Right.Brake : Brake signals for wheel"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "brake"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Wheel,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "energy conversion mechanism used to stop, or hold a vehicle stationary"}})

(def BrakeFluid
  "liquid designed for use in a motor vehicle hydraulic brake system in which it will contact elastomeric components"
  {:db/ident :auto-vp/BrakeFluid,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "brake fluid"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/BrakeSystem,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "liquid designed for use in a motor vehicle hydraulic brake system in which it will contact elastomeric components"}})

(def BrakeHose
  "flexible conduit, other than a vacuum tubing connector, manufactured for use in a brake system to transmit or contain the fluid pressure or vacuum used to apply force to a vehicle's brakes"
  {:db/ident :auto-vp/BrakeHose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "brake hose",
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/BrakeSystem,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   "flexible conduit, other than a vacuum tubing connector, manufactured for use in a brake system to transmit or contain the fluid pressure or vacuum used to apply force to a vehicle's brakes"})

(def BrakeHoseAssembly
  "brake hose, with or without armor, equipped with end fittings for use in a brake system"
  {:db/ident :auto-vp/BrakeHoseAssembly,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "brake hose assembly",
   :rdfs/subClassOf :auto-vp/BrakeHose,
   :skos/definition
   "brake hose, with or without armor, equipped with end fittings for use in a brake system"})

(def BrakePedal
  "device used to control the brakes of a vehicle"
  {:db/ident :auto-vp/BrakePedal,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.Chassis.Brake : Brake system signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "brake pedal"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Chassis,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "device used to control the brakes of a vehicle"}})

(def BrakePowerUnit
  "device installed in a brake system that provides the energy required to actuate the brakes, either directly or indirectly through an auxiliary device, with the operator action consisting only of modulating the energy application level"
  {:db/ident :auto-vp/BrakePowerUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "brake power unit",
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/BrakeSystem,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   "device installed in a brake system that provides the energy required to actuate the brakes, either directly or indirectly through an auxiliary device, with the operator action consisting only of modulating the energy application level"})

(def BrakeSystem
  "system, which purpose is to stop or hold a vehicle stationary"
  {:db/ident :auto-vp/BrakeSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "brake system",
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   "system, which purpose is to stop or hold a vehicle stationary"})

(def BrakeTubing
  "conduit or line used in a brake system to transmit or contain the medium (fluid or vacuum) used to apply the motor vehicle's brakes"
  {:db/ident :auto-vp/BrakeTubing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "brake tubing",
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/BrakeSystem,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   "conduit or line used in a brake system to transmit or contain the medium (fluid or vacuum) used to apply the motor vehicle's brakes"})

(def BulletResistantShield
  "shield or barrier that is installed completely inside a motor vehicle behind and separate from glazing materials that prevents bullets from coming through it"
  {:db/ident :auto-vp/BulletResistantShield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bullet resistant shield"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "shield or barrier that is installed completely inside a motor vehicle behind and separate from glazing materials that prevents bullets from coming through it"}})

(def Cabin
  "interior space of a vehicle"
  {:db/ident :auto-vp/Cabin,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.Cabin : All in-cabin components"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cabin"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "interior space of a vehicle"}})

(def CarBed
  "child restraint system designed to restrain or position a child in the supine or prone position on a continuous flat surface"
  {:db/ident :auto-vp/CarBed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "car bed"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "child restraint system designed to restrain or position a child in the supine or prone position on a continuous flat surface"}})

(def Carcass
  "tire structure, except for tread and sidewall rubber"
  {:db/ident :auto-vp/Carcass,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "carcass"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Tire,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "tire structure, except for tread and sidewall rubber"}})

(def CargoEquipment
  "equipment used for transportation, protection and preservation of cargo"
  {:db/ident :auto-vp/CargoEquipment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cargo equipment"},
   :rdfs/subClassOf :auto-mo/MaterialEntity,
   :skos/definition
   "equipment used for transportation, protection and preservation of cargo"})

(def CargoLamp
  "lamp that is mounted on a multipurpose passenger vehicle, truck, or bus for the purpose of providing illumination to load or unload cargo"
  {:db/ident :auto-vp/CargoLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cargo lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lamp that is mounted on a multipurpose passenger vehicle, truck, or bus for the purpose of providing illumination to load or unload cargo"}})

(def Casing
  "used tire to which additional tread may be attached for the purpose of retreading"
  {:db/ident :auto-vp/Casing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "casing"},
   :rdfs/subClassOf :auto-vp/Tire,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "used tire to which additional tread may be attached for the purpose of retreading"}})

(def Catalyst
  "canister in the exhaust system, usually situated before the muffler, containing a substance that reacts chemically with the exhaust in order to reduce harmful emissions"
  {:db/ident :auto-vp/Catalyst,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.OBD.Catalyst : Catalyst signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "catalyst"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/OBD,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "canister in the exhaust system, usually situated before the muffler, containing a substance that reacts chemically with the exhaust in order to reduce harmful emissions"}})

(def ChargeConnector
  "conductive device that, by insertion into a vehicle charge inlet, establishes an electrical connection of the vehicle to the external electric power supply for the purpose of transferring energy and exchanging information"
  {:db/ident :auto-vp/ChargeConnector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "charge connector"},
   :rdfs/subClassOf :auto-vp/Connector,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "conductive device that, by insertion into a vehicle charge inlet, establishes an electrical connection of the vehicle to the external electric power supply for the purpose of transferring energy and exchanging information"}})

(def Chassis
  "load-supporting frame of a commercial motor vehicle, exclusive of any appurtenances which might be added to accommodate cargo"
  {:db/ident :auto-vp/Chassis,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.Chassis : All attributes concerning steering"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "chassis"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "load-supporting frame of a commercial motor vehicle, exclusive of any appurtenances which might be added to accommodate cargo"}})

(def ClearanceLamp
  "lamp that provides light to the front or rear, mounted on the permanent structure of the vehicle, such that it indicates the overall width of the vehicle"
  {:db/ident :auto-vp/ClearanceLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "clearanece lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lamp that provides light to the front or rear, mounted on the permanent structure of the vehicle, such that it indicates the overall width of the vehicle"}})

(def CombinationHeadlamp
  "headlamp that is a combination of two different headlamp types chosen from a type F sealed beam headlamp, an integral beam headlamp, or a replaceable bulb headlamp"
  {:db/ident :auto-vp/CombinationHeadlamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "combination headlamp"},
   :rdfs/subClassOf :auto-vp/Headlamp,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "headlamp that is a combination of two different headlamp types chosen from a type F sealed beam headlamp, an integral beam headlamp, or a replaceable bulb headlamp"}})

(def Connector
  "device providing mechanical connection and disconnection of high voltage electrical conductors to a suitable mating component, including its housing"
  {:db/ident :auto-vp/Connector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "connector"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device providing mechanical connection and disconnection of high voltage electrical conductors to a suitable mating component, including its housing"}})

(def ConvexMirror
  "mirror having a curved reflective surface whose shape is the same as that of the exterior surface of a section of a sphere"
  {:db/ident :auto-vp/ConvexMirror,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "convex mirror"},
   :rdfs/subClassOf :auto-vp/Mirrors,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mirror having a curved reflective surface whose shape is the same as that of the exterior surface of a section of a sphere"}})

(def Cord
  "set of strands forming the plies in the tire"
  {:db/ident :auto-vp/Cord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cord"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Tire,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "set of strands forming the plies in the tire"}})

(def CruiseControl
  "device that automatically controls the vehicle's speed when engaged by the driver"
  {:db/ident :auto-vp/CruiseControl,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.ADAS.CruiseControl : Signals from Cruise Control system"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cruise control"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/ADAS,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device that automatically controls the vehicle's speed when engaged by the driver"}})

(def CurrentDriveCycleStatus
  "current status of a drive cycle of a vehicle"
  {:db/ident :auto-vp/CurrentDriveCycleStatus,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.OBD.DriveCycleStatus : PID 41 - OBD status for the current drive cycle"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "drive cycle status"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/OBD,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "current status of a drive cycle of a vehicle"}})

(def CurrentLocation
  "current location of a vehicle"
  {:db/ident :auto-vp/CurrentLocation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Infotainment.Navigation.CurrentLocation : The current latitude and longitude of the vehicle."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "current location"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Navigation,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "current location of a vehicle"}})

(def Cushion
  "anything that is used to soften an impact or absorb shocks"
  {:db/ident :auto-vp/Cushion,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Seat.RowX.PosX.Cushion : Cushion signals."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cushion"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Seat,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "anything that is used to soften an impact or absorb shocks"}})

(def CushionSwitch
  "Signal/Attribute.Cabin.Seat.RowX.PosX.Switch.Cushion : Cushion switches"
  {:db/ident :auto-vp/CushionSwitch,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Seat.RowX.PosX.Switch.Cushion : Cushion switches"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cushion switch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/SeatSwitch,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart]})

(def DaytimeRunningLamp
  "steady burning lamp that is used to improve the conspicuity of a vehicle from the front and front sides when the regular headlamps are not required for driving"
  {:db/ident :auto-vp/DaytimeRunningLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "daytime running lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "steady burning lamp that is used to improve the conspicuity of a vehicle from the front and front sides when the regular headlamps are not required for driving"}})

(def DestinatonSet
  "device that sets the destination of a vehicle"
  {:db/ident :auto-vp/DestinatonSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Infotainment.Navigation.DestinatonSet : A navigation has been selected."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "destination set"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Navigation,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "device that sets the destination of a vehicle"}})

(def DistanceToObject
  "device that tells the driver the distance from the vehicle to a given object"
  {:db/ident :auto-vp/DistanceToObject,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.ADAS.ObstacleDetection.DistanceToObject : Distance signals form Obstacle Sensor System"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "distance to object"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/ObstacleDetection,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device that tells the driver the distance from the vehicle to a given object"}})

(def Door
  "assembly that is installed in an interior or exterior wall; that is movable in a sliding, pivoting, hinged, or revolving manner of movement; and that is used by consumers to produce or close off an opening for use as a means of human passage"
  {:db/ident :auto-vp/Door,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Signal/Attribute.Cabin.Door : All doors"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "door"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "assembly that is installed in an interior or exterior wall; that is movable in a sliding, pivoting, hinged, or revolving manner of movement; and that is used by consumers to produce or close off an opening for use as a means of human passage"}})

(def DoorFrame
  "rearmost perimeter structure, including trim but excluding glass, of the forward door and the forwardmost perimeter structure, including trim but excluding glass"
  {:db/ident :auto-vp/DoorFrame,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "door frame"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Door,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rearmost perimeter structure, including trim but excluding glass, of the forward door and the forwardmost perimeter structure, including trim but excluding glass"}})

(def DoubleDoor
  "system of two doors where the front door or wing door opens first and connects to the rear door or bolted door, which opens second"
  {:db/ident :auto-vp/DoubleDoor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "double door"},
   :rdfs/subClassOf :auto-vp/Door,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "system of two doors where the front door or wing door opens first and connects to the rear door or bolted door, which opens second"}})

(def Drivetrain
  "system of components that generates power and transmits it to the wheels of a vehicle"
  {:db/ident :auto-vp/Drivetrain,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Drivetrain : Drivetrain attributes internal combustion engines"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "drivetrain"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "system of components that generates power and transmits it to the wheels of a vehicle"}})

(def Dunnage
  "set of loose materials used to support and protect cargo"
  {:db/ident :auto-vp/Dunnage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dunnage"},
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "set of loose materials used to support and protect cargo"}})

(def DunnageBag
  "inflatable bag intended to fill otherwise empty space between articles of cargo, or between articles of cargo and the wall of the vehicle"
  {:db/ident :auto-vp/DunnageBag,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dunnage bag"},
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "inflatable bag intended to fill otherwise empty space between articles of cargo, or between articles of cargo and the wall of the vehicle"}})

(def ESC
  "system that augments vehicle directional stability by applying and adjusting the vehicle brake torques individually to induce a correcting yaw moment to a vehicle, is computer-controlled with the computer using a closed-loop algorithm to limit vehicle oversteer and to limit vehicle understeer and has a means to monitor driver steering inputs"
  {:db/ident :auto-vp/ESC,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.ADAS.ESC : Electronic Stability Control System signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ESC"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/ADAS,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "system that augments vehicle directional stability by applying and adjusting the vehicle brake torques individually to induce a correcting yaw moment to a vehicle, is computer-controlled with the computer using a closed-loop algorithm to limit vehicle oversteer and to limit vehicle understeer and has a means to monitor driver steering inputs"}})

(def EdgeProtector
  "device placed on the exposed edge of an article to distribute tiedown forces over a larger area of cargo than the tiedown itself, to protect the tiedown and/or cargo from damage, and to allow the tiedown to slide freely when being tensioned"
  {:db/ident :auto-vp/EdgeProtector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "edge protector"},
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device placed on the exposed edge of an article to distribute tiedown forces over a larger area of cargo than the tiedown itself, to protect the tiedown and/or cargo from damage, and to allow the tiedown to slide freely when being tensioned"}})

(def ElectricBrakeSystem
  "system that uses electric current to actuate the service brake"
  {:db/ident :auto-vp/ElectricBrakeSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "electric brake system",
   :rdfs/subClassOf :auto-vp/BrakeSystem,
   :skos/definition
   "system that uses electric current to actuate the service brake"})

(def ElectricMotor
  "electro-mechanical machine which converts electrical energy into mechanical energy"
  {:db/ident :auto-vp/ElectricMotor,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Drivetrain.ElectricMotor : Electric Motor specific signals."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "electric motor"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Drivetrain,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "electro-mechanical machine which converts electrical energy into mechanical energy"}})

(def ElectricalChassis
  "set of conductive parts of the vehicle whose electrical potential is taken as reference and which are conductively linked together, and not high voltage sources during normal vehicle operation"
  {:db/ident :auto-vp/ElectricalChassis,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "electrical chassis"},
   :rdfs/subClassOf :auto-vp/Chassis,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "set of conductive parts of the vehicle whose electrical potential is taken as reference and which are conductively linked together, and not high voltage sources during normal vehicle operation"}})

(def EmergencyBrakeSystem
  "mechanism designed to stop a vehicle after a single failure occurs in the service brake system of a part designed to contain compressed air or brake fluid or vacuum"
  {:db/ident :auto-vp/EmergencyBrakeSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "emergency brake system",
   :rdfs/subClassOf :auto-vp/BrakeSystem,
   :skos/definition
   "mechanism designed to stop a vehicle after a single failure occurs in the service brake system of a part designed to contain compressed air or brake fluid or vacuum"})

(def Engine
  "machine for converting any of various forms of energy into mechanical force and motion"
  {:db/ident :auto-vp/Engine,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Drivetrain.InternalCombustionEngine : Engine-specific attributes"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "engine"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Drivetrain,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "machine for converting any of various forms of energy into mechanical force and motion"}})

(def ExternalLights
  "head lights, tail lights, stop lights, back-up lights, turn signals and hazard warning lights"
  {:db/ident :auto-vp/ExternalLights,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Signal/Attribute.Body.Lights : All lights"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "external lights"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Body,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/Lamp],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "head lights, tail lights, stop lights, back-up lights, turn signals and hazard warning lights"}})

(def FifthWheel
  "device mounted on a truck tractor or similar towing vehicle (e.g., converter dolly) which interfaces with and couples to the upper coupler assembly of a semitrailer"
  {:db/ident :auto-vp/FifthWheel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fifth wheel"},
   :rdfs/subClassOf :auto-vp/Wheel,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device mounted on a truck tractor or similar towing vehicle (e.g., converter dolly) which interfaces with and couples to the upper coupler assembly of a semitrailer"}})

(def Floor
  "portion of an automobile that is located below the passenger compartment"
  {:db/ident :auto-vp/Floor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "floor",
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   "portion of an automobile that is located below the passenger compartment"})

(def FoldingDoor
  "movable barrier, which will close off an entranceway to a bus, multipurpose passenger vehicle or truck, consisting of two or more hinge panels that swing, slide, or rotate and does not have a striker and latch assembly"
  {:db/ident :auto-vp/FoldingDoor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "folding door"},
   :rdfs/subClassOf :auto-vp/Door,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "movable barrier, which will close off an entranceway to a bus, multipurpose passenger vehicle or truck, consisting of two or more hinge panels that swing, slide, or rotate and does not have a striker and latch assembly"}})

(def FrictionMat
  "device placed between the deck of a vehicle and an article of cargo, or between articles of cargo, intended to provide greater friction than exists naturally between these surfaces"
  {:db/ident :auto-vp/FrictionMat,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "friction mat"},
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device placed between the deck of a vehicle and an article of cargo, or between articles of cargo, intended to provide greater friction than exists naturally between these surfaces"}})

(def FrontFogLamp
  "lighting device whose beam provides downward illumination forward of the vehicle and close to the ground, and is to be used only under conditions of rain, snow, dust, smoke or fog"
  {:db/ident :auto-vp/FrontFogLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "front fog lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lighting device whose beam provides downward illumination forward of the vehicle and close to the ground, and is to be used only under conditions of rain, snow, dust, smoke or fog"}})

(def FuelCell
  "electrochemical cell that produces electricity via the non-combustion reaction of a consumable fuel, typically hydrogen"
  {:db/ident :auto-vp/FuelCell,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.Drivetrain.FuelCell : Fuel Cell attributes"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fuel cell"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Drivetrain,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "electrochemical cell that produces electricity via the non-combustion reaction of a consumable fuel, typically hydrogen"}})

(def FuelSystem
  "combination of fuel tank, fuel pump, fuel lines, oil injection metering system, and carburetor or fuel injection components, and includes all fuel system vents"
  {:db/ident :auto-vp/FuelSystem,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Drivetrain.FuelSystem : Fuel System attributes"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fuel system"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Drivetrain,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "combination of fuel tank, fuel pump, fuel lines, oil injection metering system, and carburetor or fuel injection components, and includes all fuel system vents"}})

(def GPS
  "GPS"
  {:db/ident :auto-vp/GPS,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPS"}})

(def Groove
  "space between two adjacent tread ribs"
  {:db/ident :auto-vp/Groove,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "groove"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "space between two adjacent tread ribs"}})

(def HVAC
  "system used for moving air between indoor and outdoor areas along with heating and cooling"
  {:db/ident :auto-vp/HVAC,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "Signal/Attribute.Cabin.HVAC : Climate control"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "HVAC"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "system used for moving air between indoor and outdoor areas along with heating and cooling"}})

(def HazardWarningSignal
  "set of lamps that flash simultaneously to the front and rear, on both the right and left sides of a commercial motor vehicle, to indicate to an approaching driver the presence of a vehicular hazard"
  {:db/ident :auto-vp/HazardWarningSignal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hazard warning signal"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "set of lamps that flash simultaneously to the front and rear, on both the right and left sides of a commercial motor vehicle, to indicate to an approaching driver the presence of a vehicular hazard"}})

(def HeadRestraint
  "device that limits the rearward displacement of a seated occupant's head relative to the occupant's torso"
  {:db/ident :auto-vp/HeadRestraint,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Seat.RowX.PosX.HeadRestraint : Head restraint settings"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "head restraint"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Seat,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device that limits the rearward displacement of a seated occupant's head relative to the occupant's torso"}})

(def HeadRestraintSwitch
  "device that allows for modification of the level of height or angle of a head restraint"
  {:db/ident :auto-vp/HeadRestraintSwitch,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Seat.RowX.PosX.Switch.HeadRestraint : Head restraint switches"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "head restraint switch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/SeatSwitch,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device that allows for modification of the level of height or angle of a head restraint"}})

(def Headlamp
  "lamp used to provide general illumination ahead of a motor vehicle"
  {:db/ident :auto-vp/Headlamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "headlamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lamp used to provide general illumination ahead of a motor vehicle"}})

(def Heater
  "device or assembly of devices or appliances used to heat the interior of any motor vehicle"
  {:db/ident :auto-vp/Heater,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "heater"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/HVAC,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device or assembly of devices or appliances used to heat the interior of any motor vehicle"}})

(def HighMountedStopLamp
  "lamp mounted high and possibly forward of the tail, stop, and rear turn signal lamps intended to give a steady stop warning through intervening vehicles to operators of following vehicles"
  {:db/ident :auto-vp/HighMountedStopLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "high mounted stop lamp"},
   :rdfs/subClassOf :auto-vp/StopLamp,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lamp mounted high and possibly forward of the tail, stop, and rear turn signal lamps intended to give a steady stop warning through intervening vehicles to operators of following vehicles"}})

(def Hinge
  "device system used to position the door relative to the body structure and control the path of the door swing for passenger ingress and egress"
  {:db/ident :auto-vp/Hinge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hinge"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Door,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device system used to position the door relative to the body structure and control the path of the door swing for passenger ingress and egress"}})

(def Hood
  "exterior movable body panel forward of the windshield that is used to cover an engine, luggage, storage, or battery compartment"
  {:db/ident :auto-vp/Hood,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Signal/Attribute.Body.Hood : Hood status"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hood"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Body,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exterior movable body panel forward of the windshield that is used to cover an engine, luggage, storage, or battery compartment"}})

(def HookLifterContainer
  "specialized container, primarily used to contain and transport materials in the waste, recycling, construction/demolition and scrap industries, which is used in conjunction with specialized vehicles, in which the container is loaded and unloaded onto a tilt frame body by an articulating hook-arm"
  {:db/ident :auto-vp/HookLifterContainer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "hook-lifter container",
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   "specialized container, primarily used to contain and transport materials in the waste, recycling, construction/demolition and scrap industries, which is used in conjunction with specialized vehicles, in which the container is loaded and unloaded onto a tilt frame body by an articulating hook-arm"})

(def Horn
  "device able to give an adequate and reliable warning sign"
  {:db/ident :auto-vp/Horn,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Signal/Attribute.Body.Horn : Horn signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "horn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Body,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "device able to give an adequate and reliable warning sign"}})

(def HydraulicGuard
  "guard designed to use fluid properties to provide resistance force to deformation"
  {:db/ident :auto-vp/HydraulicGuard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hydraulic guard"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "guard designed to use fluid properties to provide resistance force to deformation"}})

(def IdentificationLamp
  "lamp used to identify certain types of commercial motor vehicles"
  {:db/ident :auto-vp/IdentificationLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identification lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lamp used to identify certain types of commercial motor vehicles"}})

(def Infotainment
  "vehicle system that combines entertainment and information delivery to drivers and passengers"
  {:db/ident :auto-vp/Infotainment,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.Cabin.Infotainment : Infotainment system"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "infotainment"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "vehicle system that combines entertainment and information delivery to drivers and passengers"}})

(def Innerliner
  "layer forming the inside surface of a tubeless tire that contains the inflating medium within the tire"
  {:db/ident :auto-vp/Innerliner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "innerliner"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Tire,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "layer forming the inside surface of a tubeless tire that contains the inflating medium within the tire"}})

(def IntegralBeamHeadlamp
  "headlamp comprising an integral and indivisible optical assembly including lens, reflector, and light source"
  {:db/ident :auto-vp/IntegralBeamHeadlamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "integral beam headlamp"},
   :rdfs/subClassOf :auto-vp/Headlamp,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "headlamp comprising an integral and indivisible optical assembly including lens, reflector, and light source"}})

(def InternalCombustionEngine
  "heat engine in which the combustion that generates the heat takes place inside the engine proper instead of in a furnace"
  {:db/ident :auto-vp/InternalCombustionEngine,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "internal combustion engine"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "heat engine in which the combustion that generates the heat takes place inside the engine proper instead of in a furnace"}})

(def InternalLights
  "halogen lamps or light-emitting diodes (LEDs) used to illuminate a vehicle's interior space"
  {:db/ident :auto-vp/InternalLights,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Lights : Interior lights signals and sensors"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "internal lights"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/Lamp],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "halogen lamps or light-emitting diodes (LEDs) used to illuminate a vehicle's interior space"}})

(def Key
  "physical device that, when inserted into the starting system (by physical or electronic means), enables the vehicle operator to activate the engine or motor"
  {:db/ident :auto-vp/Key,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "key"},
   :rdfs/subClassOf :auto-mo/Object,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "physical device that, when inserted into the starting system (by physical or electronic means), enables the vehicle operator to activate the engine or motor"}})

(def Lamp
  "device used to produce artificial light"
  {:db/ident :auto-vp/Lamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lamp"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "device used to produce artificial light"}})

(def LaneDepartureDetection
  "system of electronic components designed to warn a driver when a vehicle strays out of its lane"
  {:db/ident :auto-vp/LaneDepartureDetection,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.ADAS.LaneDepartureDetection : Signals from Land Departure Detection System"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lane departure detection"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/ADAS,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "system of electronic components designed to warn a driver when a vehicle strays out of its lane"}})

(def Latch
  "device employed to maintain the door in a closed position relative to the vehicle body with provisions for deliberate release"
  {:db/ident :auto-vp/Latch,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "latch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Door,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device employed to maintain the door in a closed position relative to the vehicle body with provisions for deliberate release"}})

(def LicensePlateLamp
  "lamp used to illuminate the license plate on the rear of a motor vehicle"
  {:db/ident :auto-vp/LicensePlateLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "license plate lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lamp used to illuminate the license plate on the rear of a motor vehicle"}})

(def LocalHVAC
  "Signal/Attribute.Cabin.HVAC.RowX.Left/Right : Climate control"
  {:db/ident :auto-vp/LocalHVAC,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.Cabin.HVAC.RowX.Left/Right : Climate control"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "local HVAC"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/HVAC,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart]})

(def LocalLights
  "Signal/Attribute.Cabin.Lights.RowX.Left/Right : Interior lights signals and sensors"
  {:db/ident :auto-vp/LocalLights,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Lights.RowX.Left/Right : Interior lights signals and sensors"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "local lights"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/InternalLights,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/Lamp]})

(def LoweredFloor
  "replacement floor on a motor vehicle whose original floor has been removed, in part or in total, and replaced by a floor that is lower than the original floor"
  {:db/ident :auto-vp/LoweredFloor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "lowered floor",
   :rdfs/subClassOf :auto-vp/Floor,
   :skos/definition
   "replacement floor on a motor vehicle whose original floor has been removed, in part or in total, and replaced by a floor that is lower than the original floor"})

(def LuggageCompartment
  "space in the vehicle for luggage accommodation, separated from the passenger compartment by the front or rear bulkhead and bounded by a roof, hood or trunk lid, floor, and side walls"
  {:db/ident :auto-vp/LuggageCompartment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "luggage compartment"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "space in the vehicle for luggage accommodation, separated from the passenger compartment by the front or rear bulkhead and bounded by a roof, hood or trunk lid, floor, and side walls"}})

(def Lumbar
  "mechanical or pneumatic device that matches a vehicle's seat back to the contours of the driver or passenger"
  {:db/ident :auto-vp/Lumbar,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.Cabin.Seat.RowX.PosX.Lumbar : Lumbar signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lumbar"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Seat,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mechanical or pneumatic device that matches a vehicle's seat back to the contours of the driver or passenger"}})

(def LumbarSwitch
  "device that allows for the adjustment of lumbar support"
  {:db/ident :auto-vp/LumbarSwitch,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Seat.RowX.PosX.Switch.Lumbar : Lumbar switches"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lumbar switch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/SeatSwitch,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "device that allows for the adjustment of lumbar support"}})

(def MassageSwitch
  "device that allows for the adjustment of moving elements in the seats"
  {:db/ident :auto-vp/MassageSwitch,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Seat.RowX.PosX.Switch.Massage : Massage switches"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "massage"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/SeatSwitch,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device that allows for the adjustment of moving elements in the seats"}})

(def MechanicallyAimableHeadlamp
  "headlamp having three pads on the lens, forming an aiming plane used for laboratory photometric testing and for adjusting and inspecting the aim of the headlamp when installed on the vehicle"
  {:db/ident :auto-vp/MechanicallyAimableHeadlamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mechanically aimable headlamp"},
   :rdfs/subClassOf :auto-vp/Headlamp,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "headlamp having three pads on the lens, forming an aiming plane used for laboratory photometric testing and for adjusting and inspecting the aim of the headlamp when installed on the vehicle"}})

(def Media
  "system that allows the driver and passengers to access the media in the vehicle"
  {:db/ident :auto-vp/Media,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.Cabin.Infotainment.Media : All Media actions"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "media"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Infotainment,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "system that allows the driver and passengers to access the media in the vehicle"}})

(def MetalCoil
  "article of cargo comprised of elements, mixtures, compounds, or alloys commonly known as metal, metal foil, metal leaf, forged metal, stamped metal, metal wire, metal rod, or metal chain that are packaged as a roll, coil, spool, wind, or wrap, including plastic or rubber coated electrical wire and communications cable"
  {:db/ident :auto-vp/MetalCoil,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "metal coil"},
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "article of cargo comprised of elements, mixtures, compounds, or alloys commonly known as metal, metal foil, metal leaf, forged metal, stamped metal, metal wire, metal rod, or metal chain that are packaged as a roll, coil, spool, wind, or wrap, including plastic or rubber coated electrical wire and communications cable"}})

(def MirrorHeating
  "system that provides heat to the windows"
  {:db/ident :auto-vp/MirrorHeating,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Body.Mirrors.Left/Right.Heating : Mirror heater signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mirror heating"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Mirrors,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "system that provides heat to the windows"}})

(def Mirrors
  "polished or smooth surfaces (as of glass) that form images by reflection"
  {:db/ident :auto-vp/Mirrors,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Signal/Attribute.Body.Mirrors : All mirrors"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mirrors"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Body,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "polished or smooth surfaces (as of glass) that form images by reflection"}})

(def ModifiedRoof
  "replacement roof on a motor vehicle whose original roof has been removed, in part or in total"
  {:db/ident :auto-vp/ModifiedRoof,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "modified roof",
   :rdfs/subClassOf :auto-vp/Roof,
   :skos/definition
   "replacement roof on a motor vehicle whose original roof has been removed, in part or in total"})

(def MultiPieceWindshield
  "windshield consisting of two or more windshield glazing surface areas"
  {:db/ident :auto-vp/MultiPieceWindshield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "multi-piece windshield"},
   :rdfs/subClassOf :auto-vp/Windshield,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "windshield consisting of two or more windshield glazing surface areas"}})

(def Navigation
  "device that communicates with global positioning satellites to determine a vehicle's physical location and plot a course using stored map information"
  {:db/ident :auto-vp/Navigation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Infotainment.Navigation : All navigation actions"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "navigation"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Infotainment,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device that communicates with global positioning satellites to determine a vehicle's physical location and plot a course using stored map information"}})

(def NonPneumaticTire
  "mechanical device that transmits, either directly or through a wheel or wheel center member, the vertical load and tractive forces from the roadway to the vehicle, generates the tractive forces that provide the directional control of the vehicle and does not rely on the containment of any gas or fluid for providing those functions"
  {:db/ident :auto-vp/NonPneumaticTire,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non-pneumatic tire"},
   :rdfs/subClassOf :auto-vp/Tire,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mechanical device that transmits, either directly or through a wheel or wheel center member, the vertical load and tractive forces from the roadway to the vehicle, generates the tractive forces that provide the directional control of the vehicle and does not rely on the containment of any gas or fluid for providing those functions"}})

(def O2Sensor
  "sensor mounted in the exhaust stream that relays air/fuel ratio information to the fuel control computer that allows the computer to make adjustments"
  {:db/ident :auto-vp/O2Sensor,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.OBD.O2WR.SensorX : Wide range/band oxygen senor 8"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "O2 sensor"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/OBD,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "sensor mounted in the exhaust stream that relays air/fuel ratio information to the fuel control computer that allows the computer to make adjustments"}})

(def O2SensorOther
  "Signal/Attribute.OBD.O2.Bank2.Sensor1 : Oxygen sensor"
  {:db/ident :auto-vp/O2SensorOther,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.OBD.O2.Bank2.Sensor1 : Oxygen sensor"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "O2 sensor other"},
   :rdfs/subClassOf :auto-vp/VehiclePart})

(def OBD
  "computer-controlled system that identifies malfunctioning or out-of-adjustment components under its control through the display of trouble codes"
  {:db/ident :auto-vp/OBD,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Signal/Attribute.OBD : OBD data."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OBD"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "computer-controlled system that identifies malfunctioning or out-of-adjustment components under its control through the display of trouble codes"}})

(def OBDStatus
  "current OBD status of a vehicle"
  {:db/ident :auto-vp/OBDStatus,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.OBD.Status : PID 01 - OBD status"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "status"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/OBD,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "current OBD status of a vehicle"}})

(def ObstacleDetection
  "system that detects obstacles in close proximity to the vehicle"
  {:db/ident :auto-vp/ObstacleDetection,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.ADAS.ObstacleDetection : Signals form Obstacle Sensor System"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obstacle detection"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/ADAS,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "system that detects obstacles in close proximity to the vehicle"}})

(def ParkingBrake
  "mechanism designed to prevent the movement of a stationary motor vehicle"
  {:db/ident :auto-vp/ParkingBrake,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.Chassis.ParkingBrake : Parking brake signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parking brake"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Chassis,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mechanism designed to prevent the movement of a stationary motor vehicle"}})

(def ParkingLamp
  "lamp on both the left and right of the vehicle which shows to the front and is intended to mark the vehicle when parked or serve as a reserve front position indicating system in the event of headlamp failure"
  {:db/ident :auto-vp/ParkingLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parking lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lamp on both the left and right of the vehicle which shows to the front and is intended to mark the vehicle when parked or serve as a reserve front position indicating system in the event of headlamp failure"}})

(def PassengerCompartment
  "space for occupant accommodation that is bounded by the roof, floor, side walls, doors, outside glazing, front bulkhead and rear bulkhead or rear gate, as well as electrical protection barriers provided for protecting the occupants from direct contact with high voltage live parts"
  {:db/ident :auto-vp/PassengerCompartment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "passenger compartment"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "space for occupant accommodation that is bounded by the roof, floor, side walls, doors, outside glazing, front bulkhead and rear bulkhead or rear gate, as well as electrical protection barriers provided for protecting the occupants from direct contact with high voltage live parts"}})

(def Played
  "current media played in the vehicle"
  {:db/ident :auto-vp/Played,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Infotainment.Media.Played : Collection of signals updated in concert when a new media is played"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "played"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Media,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "current media played in the vehicle"}})

(def PneumaticTire
  "mechanical device made of rubber, chemicals, fabric and steel or other materials, which, when mounted on an automotive wheel, provides traction and contains the gas or fluid that sustains the load"
  {:db/ident :auto-vp/PneumaticTire,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pneumatic tire"},
   :rdfs/subClassOf :auto-vp/Tire,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mechanical device made of rubber, chemicals, fabric and steel or other materials, which, when mounted on an automotive wheel, provides traction and contains the gas or fluid that sustains the load"}})

(def PushOutWindow
  "vehicle window designed to open outward"
  {:db/ident :auto-vp/PushOutWindow,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "push-out window"},
   :rdfs/subClassOf :auto-vp/Window,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "vehicle window designed to open outward"}})

(def RadialPlyTire
  "pneumatic tire in which the ply cords which extend to the beads are laid at substantially 90° to the centerline of the tread"
  {:db/ident :auto-vp/RadialPlyTire,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "radial ply tire"},
   :rdfs/subClassOf :auto-vp/PneumaticTire,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "pneumatic tire in which the ply cords which extend to the beads are laid at substantially 90° to the centerline of the tread"}})

(def Raindetection
  "feature that detects rain"
  {:db/ident :auto-vp/Raindetection,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.Body.Raindetection : Rainsensor signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rain detection"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Body,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "feature that detects rain"}})

(def RearHeadRestraint
  "rear seat back, or any independently adjustable seat component attached to or adjacent to a seat back, that has a height equal to or greater than 700 mm, in any position of backset and height adjustment"
  {:db/ident :auto-vp/RearHeadRestraint,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rear head restraint"},
   :rdfs/subClassOf :auto-vp/HeadRestraint,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rear seat back, or any independently adjustable seat component attached to or adjacent to a seat back, that has a height equal to or greater than 700 mm, in any position of backset and height adjustment"}})

(def RearImpactGuard
  "device installed on or near the rear of a vehicle so that when the vehicle is struck from the rear, the device limits the distance that the striking vehicle's front end slides under the rear end of the impacted vehicle"
  {:db/ident :auto-vp/RearImpactGuard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rear impact guard"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Body,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device installed on or near the rear of a vehicle so that when the vehicle is struck from the rear, the device limits the distance that the striking vehicle's front end slides under the rear end of the impacted vehicle"}})

(def RearShade
  "shade of a rear window"
  {:db/ident :auto-vp/RearShade,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.Cabin.RearShade : Rear window shade."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rear shade"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "shade of a rear window"}})

(def RearviewMirror
  "mirror (as in an automobile) that gives a view of the area behind a vehicle"
  {:db/ident :auto-vp/RearviewMirror,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.Cabin.RearviewMirror : Rearview mirror"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rearview mirror"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/Mirrors],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mirror (as in an automobile) that gives a view of the area behind a vehicle"}})

(def ReclineSwitch
  "device that allows for reclining a seat"
  {:db/ident :auto-vp/ReclineSwitch,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Seat.RowX.PosX.Switch.Recline : Recline switches"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "recline"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/SeatSwitch,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "device that allows for reclining a seat"}})

(def ReflexReflector
  "device which is used on a vehicle to give an indication to an approaching driver by the reflected light from the lamps on the approaching vehicle"
  {:db/ident :auto-vp/ReflexReflector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "reflex reflector",
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   "device which is used on a vehicle to give an indication to an approaching driver by the reflected light from the lamps on the approaching vehicle"})

(def ReplaceableBulbHeadlamp
  "headlamp comprising a bonded lens and reflector assembly and one or two replaceable light sources"
  {:db/ident :auto-vp/ReplaceableBulbHeadlamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "replaceable bulb headlamp"},
   :rdfs/subClassOf :auto-vp/Headlamp,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "headlamp comprising a bonded lens and reflector assembly and one or two replaceable light sources"}})

(def Rim
  "metal support for a tire or a tire and tube assembly upon which the tire beads are seated"
  {:db/ident :auto-vp/Rim,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rim"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "metal support for a tire or a tire and tube assembly upon which the tire beads are seated"}})

(def Roof
  "portion of an automobile that sits above the passenger compartment, protecting the vehicle occupants from sun, wind and other external elements"
  {:db/ident :auto-vp/Roof,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "roof",
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Body,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   "portion of an automobile that sits above the passenger compartment, protecting the vehicle occupants from sun, wind and other external elements"})

(def SaddleMount
  "device, designed and constructed to be readily demountable, used in driveaway-towaway operations to perform the functions of a conventional fifth wheel"
  {:db/ident :auto-vp/SaddleMount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "saddle-mount"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device, designed and constructed to be readily demountable, used in driveaway-towaway operations to perform the functions of a conventional fifth wheel"}})

(def SchoolBusSignalLamp
  "alternately flashing lamp mounted horizontally both front and rear, intended to identify a vehicle as a school bus and to inform other users of the highway that such vehicle is stopped on the highway to take on or discharge school children"
  {:db/ident :auto-vp/SchoolBusSignalLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "school bus signal lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "alternately flashing lamp mounted horizontally both front and rear, intended to identify a vehicle as a school bus and to inform other users of the highway that such vehicle is stopped on the highway to take on or discharge school children"}})

(def Seat
  "part of a vehicle that has been designed for someone to sit on"
  {:db/ident :auto-vp/Seat,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Signal/Attribute.Cabin.Seat : All seats."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seat"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "part of a vehicle that has been designed for someone to sit on"}})

(def SeatBeltAnchorage
  "component involved in transferring seat belt loads to the vehicle structure, including, but not limited to, the attachment hardware, but excluding webbing or straps, seat frames, seat pedestals, and the vehicle structure itself, whose failure causes separation of the belt from the vehicle structure"
  {:db/ident :auto-vp/SeatBeltAnchorage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "seat belt anchorage",
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Seat,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   "component involved in transferring seat belt loads to the vehicle structure, including, but not limited to, the attachment hardware, but excluding webbing or straps, seat frames, seat pedestals, and the vehicle structure itself, whose failure causes separation of the belt from the vehicle structure"})

(def SeatBeltMountingStructure
  "vehicle body or frame component, including trim, that incorporates an upper seat belt anchorage and that is located rearward of the rearmost outboard designated seating position, and that extends above a horizontal plane 660 mm above the seating reference point (SgRP) of that seating position"
  {:db/ident :auto-vp/SeatBeltMountingStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seat belt mounting structure"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Seat,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "vehicle body or frame component, including trim, that incorporates an upper seat belt anchorage and that is located rearward of the rearmost outboard designated seating position, and that extends above a horizontal plane 660 mm above the seating reference point (SgRP) of that seating position"}})

(def SeatSwitch
  "device that allows for the adjustment of a seat's position"
  {:db/ident :auto-vp/SeatSwitch,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Seat.RowX.PosX.Switch : Seat switch signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "switch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Seat,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "device that allows for the adjustment of a seat's position"}})

(def ServiceBrakeSystem
  "primary brake system used for slowing and stopping a vehicle"
  {:db/ident :auto-vp/ServiceBrakeSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "service brake system",
   :rdfs/subClassOf :auto-vp/BrakeSystem,
   :skos/definition
   "primary brake system used for slowing and stopping a vehicle"})

(def ShoringBar
  "device placed transversely between the walls of a vehicle and cargo to prevent cargo from tipping or shifting"
  {:db/ident :auto-vp/ShoringBar,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "shoring bar"},
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "device placed transversely between the walls of a vehicle and cargo to prevent cargo from tipping or shifting"}})

(def SideBolster
  "set of adjustable seat elements on the sides of the seat cushion and/or on the seat back that allow lateral retention of the occupant"
  {:db/ident :auto-vp/SideBolster,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Seat.RowX.PosX.SideBolster : Side bolster settings"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "side bolster"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Seat,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "set of adjustable seat elements on the sides of the seat cushion and/or on the seat back that allow lateral retention of the occupant"}})

(def SideBolsterSwitch
  "device that allows for adjustment of the side bolster"
  {:db/ident :auto-vp/SideBolsterSwitch,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Seat.RowX.PosX.Switch.SideBolster : Side bolster switches"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "side bolster switch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/SeatSwitch,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "device that allows for adjustment of the side bolster"}})

(def SideFrontDoor
  "door that, in a side view, has 50 percent or more of its opening area forward of the rearmost point on the driver's seat back, when the seat back is adjusted to its most vertical and rearward position"
  {:db/ident :auto-vp/SideFrontDoor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "side front door"},
   :rdfs/subClassOf :auto-vp/Door,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "door that, in a side view, has 50 percent or more of its opening area forward of the rearmost point on the driver's seat back, when the seat back is adjusted to its most vertical and rearward position"}})

(def SideRearDoor
  "door that, in a side view, has 50 percent or more of its opening area to the rear of the rearmost point on the driver's seat back, when the driver's seat is adjusted to its most vertical and rearward position"
  {:db/ident :auto-vp/SideRearDoor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "side rear door"},
   :rdfs/subClassOf :auto-vp/Door,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "door that, in a side view, has 50 percent or more of its opening area to the rear of the rearmost point on the driver's seat back, when the driver's seat is adjusted to its most vertical and rearward position"}})

(def Sidewall
  "portion of a tire between the tread and the bead"
  {:db/ident :auto-vp/Sidewall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sidewall"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "portion of a tire between the tread and the bead"}})

(def SiliconeBaseBrakeFluid
  "brake fluid that consists of not less than 70 percent by weight of a diorgano polysiloxane"
  {:db/ident :auto-vp/SiliconeBaseBrakeFluid,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "silicone base brake fluid"},
   :rdfs/subClassOf :auto-vp/BrakeFluid,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "brake fluid that consists of not less than 70 percent by weight of a diorgano polysiloxane"}})

(def SlidingWindow
  "window designed to open by moving vertically or horizontally"
  {:db/ident :auto-vp/SlidingWindow,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sliding window"},
   :rdfs/subClassOf :auto-vp/Window,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "window designed to open by moving vertically or horizontally"}})

(def Speedometer
  "speedometer"
  {:db/ident :auto-vp/Speedometer,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "speedometer"}})

(def SplitServiceBrakeSystem
  "brake system consisting of two or more subsystems actuated by a single control designed so that a leakage-type failure of a pressure component in a single subsystem (except structural failure of a housing that is common to two or more subsystems) shall not impair the operation of any other subsystem"
  {:db/ident :auto-vp/SplitServiceBrakeSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "split service brake system",
   :rdfs/subClassOf :auto-vp/BrakeSystem,
   :skos/definition
   "brake system consisting of two or more subsystems actuated by a single control designed so that a leakage-type failure of a pressure component in a single subsystem (except structural failure of a housing that is common to two or more subsystems) shall not impair the operation of any other subsystem"})

(def StartingSystem
  "vehicle system used in conjunction with the key to activate the engine or motor"
  {:db/ident :auto-vp/StartingSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "starting system",
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   "vehicle system used in conjunction with the key to activate the engine or motor"})

(def SteeringColumn
  "structural housing that surrounds a steering shaft"
  {:db/ident :auto-vp/SteeringColumn,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "steering column"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/SteeringControlSystem,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "structural housing that surrounds a steering shaft"}})

(def SteeringControlSystem
  "basic steering mechanism and its associated trim hardware, including any portion of a steering column assembly that provides energy absorption upon impact"
  {:db/ident :auto-vp/SteeringControlSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "steering control system"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basic steering mechanism and its associated trim hardware, including any portion of a steering column assembly that provides energy absorption upon impact"}})

(def SteeringShaft
  "component that transmits steering torque from the steering wheel to the steering gear"
  {:db/ident :auto-vp/SteeringShaft,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "steering shaft"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/SteeringControlSystem,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "component that transmits steering torque from the steering wheel to the steering gear"}})

(def SteeringWheel
  "handwheel by means of which one steers a vehicle"
  {:db/ident :auto-vp/SteeringWheel,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Chassis.SteeringWheel : Steering wheel signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "steering wheel"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Chassis,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "handwheel by means of which one steers a vehicle"}})

(def StopLamp
  "lamp shown to the rear of a motor vehicle to indicate that the service brake system is engaged"
  {:db/ident :auto-vp/StopLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stop lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lamp shown to the rear of a motor vehicle to indicate that the service brake system is engaged"}})

(def SunRoofShade
  "shade of a sunroof window"
  {:db/ident :auto-vp/SunRoofShade,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.Cabin.Sunroof.Shade : Sun roof shade status"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sunroof shade"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Sunroof,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "shade of a sunroof window"}})

(def Sunroof
  "fixed or operable opening in the roof of a vehicle that is covered with a metal or glass plug"
  {:db/ident :auto-vp/Sunroof,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.Cabin.Sunroof : Sun roof status."},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sunroof"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Cabin,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "fixed or operable opening in the roof of a vehicle that is covered with a metal or glass plug"}})

(def SurgeBrakeSystem
  "self-contained, permanently closed hydraulic brake system for trailers that relies on inertial forces, developed in response to the braking action of the towing vehicle, applied to a hydraulic device mounted on or connected to the tongue of the trailer, to slow down or stop the towed vehicle"
  {:db/ident :auto-vp/SurgeBrakeSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "surge brake system"},
   :rdfs/subClassOf :auto-vp/BrakeSystem,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "self-contained, permanently closed hydraulic brake system for trailers that relies on inertial forces, developed in response to the braking action of the towing vehicle, applied to a hydraulic device mounted on or connected to the tongue of the trailer, to slow down or stop the towed vehicle"}})

(def TCS
  "safety feature that regulates wheel spin and prevents loss of control under acceleration by ensuring maximum traction and contact between the tires and the road (by adjusting brake pressure to one or more wheels, closing the throttle, or reducing the fuel supply to at least one or more cylinders)"
  {:db/ident :auto-vp/TCS,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Signal/Attribute.ADAS.TCS : Traction Control System signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TCS"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/ADAS,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "safety feature that regulates wheel spin and prevents loss of control under acceleration by ensuring maximum traction and contact between the tires and the road (by adjusting brake pressure to one or more wheels, closing the throttle, or reducing the fuel supply to at least one or more cylinders)"}})

(def TailLamp
  "lamp used to designate the rear of a motor vehicle"
  {:db/ident :auto-vp/TailLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tail lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "lamp used to designate the rear of a motor vehicle"}})

(def Throttle
  "component of the fuel metering device that connects to the driver-operated accelerator control system and that by input from the driver-operated accelerator control system controls the engine speed"
  {:db/ident :auto-vp/Throttle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "throttle",
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   "component of the fuel metering device that connects to the driver-operated accelerator control system and that by input from the driver-operated accelerator control system controls the engine speed"})

(def Tiedown
  "combination of securing devices which forms an assembly that attaches articles of cargo to, or restrains articles of cargo on, a vehicle or trailer, and is attached to anchor point"
  {:db/ident :auto-vp/Tiedown,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tiedown"},
   :rdfs/subClassOf :auto-vp/CargoEquipment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "combination of securing devices which forms an assembly that attaches articles of cargo to, or restrains articles of cargo on, a vehicle or trailer, and is attached to anchor point"}})

(def Tire
  "rubber casing, hoop, and strip or band of all kinds designed and shaped or built to form the tread of or to fit a vehicle wheel"
  {:db/ident :auto-vp/Tire,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Chassis.Axle.RowX.Wheel.Left/Right.Tire : Tire signals for wheel"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tire"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Wheel,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rubber casing, hoop, and strip or band of all kinds designed and shaped or built to form the tread of or to fit a vehicle wheel"}})

(def TowBar
  "strut or column-like device temporarily attached between the rear of a towing vehicle and the front of the vehicle being towed"
  {:db/ident :auto-vp/TowBar,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tow bar"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Body,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "strut or column-like device temporarily attached between the rear of a towing vehicle and the front of the vehicle being towed"}})

(def Transmission
  "system in a vehicle that changes gears at different speeds"
  {:db/ident :auto-vp/Transmission,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Drivetrain.Transmission : Transmission-specific attributes"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transmission"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Drivetrain,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "system in a vehicle that changes gears at different speeds"}})

(def Tread
  "portion of a tire that comes into contact with the road"
  {:db/ident :auto-vp/Tread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tread"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Tire,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "portion of a tire that comes into contact with the road"}})

(def TreadRib
  "tread section running circumferentially around a tire"
  {:db/ident :auto-vp/TreadRib,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tread rib"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Tread,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "tread section running circumferentially around a tire"}})

(def Trunk
  "space that is intended to be used for carrying luggage or cargo"
  {:db/ident :auto-vp/Trunk,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Signal/Attribute.Body.Trunk : Trunk status"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trunk"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Body,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "space that is intended to be used for carrying luggage or cargo"}})

(def TrunkLid
  "moveable body panel that is not designed or intended as a passenger car entry point for passengers and that provides access from outside a passenger car to a trunk compartment"
  {:db/ident :auto-vp/TrunkLid,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trunk lid"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Trunk,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "moveable body panel that is not designed or intended as a passenger car entry point for passengers and that provides access from outside a passenger car to a trunk compartment"}})

(def TurnSignalLamp
  "lamp used to indicate a change in direction by emitting a flashing light on the side of a motor vehicle towards which a turn will be made"
  {:db/ident :auto-vp/TurnSignalLamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "turn signal lamp"},
   :rdfs/subClassOf :auto-vp/ExternalLights,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lamp used to indicate a change in direction by emitting a flashing light on the side of a motor vehicle towards which a turn will be made"}})

(def UnitMagnificationMirror
  "plane or flat mirror with a reflective surface through which the angular height and width of the image of an object is equal to the angular height and width of the object when viewed directly at the same distance except for flaws that do not exceed normal manufacturing tolerances"
  {:db/ident :auto-vp/UnitMagnificationMirror,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unit magnification mirror"},
   :rdfs/subClassOf :auto-vp/Mirrors,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "plane or flat mirror with a reflective surface through which the angular height and width of the image of an object is equal to the angular height and width of the object when viewed directly at the same distance except for flaws that do not exceed normal manufacturing tolerances"}})

(def UsedIn
  "relates a vehicle part to an operation in which it is used"
  {:db/ident :auto-vp/UsedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :auto-vp/VehiclePart,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "used in",
   :rdfs/range :auto-mo/Action,
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :skos/definition
   "relates a vehicle part to an operation in which it is used"})

(def VacuumBrakeSystem
  "system that uses a vacuum and atmospheric pressure for transmitting a force from the driver control to the service brake, not including a system that uses vacuum only to assist the driver in applying muscular force to hydraulic or mechanical components"
  {:db/ident :auto-vp/VacuumBrakeSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label "vacuum brake system",
   :rdfs/subClassOf :auto-vp/BrakeSystem,
   :skos/definition
   "system that uses a vacuum and atmospheric pressure for transmitting a force from the driver control to the service brake, not including a system that uses vacuum only to assist the driver in applying muscular force to hydraulic or mechanical components"})

(def VehicleIdentification
  "series of Arabic numbers and Roman letters that is assigned to a motor vehicle for identification purposes."
  {:db/ident :auto-vp/VehicleIdentification,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Attribute.Vehicle.VehicleIdentification : Attributes that identify a vehicle"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle identification"},
   :rdfs/subClassOf :auto-vp/VehiclePart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "series of Arabic numbers and Roman letters that is assigned to a motor vehicle for identification purposes."}})

(def VehiclePart
  "article the primary use of which is to improve, repair, replace, or serve as a component part of a vehicle"
  {:db/ident :auto-vp/VehiclePart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle part"},
   :rdfs/subClassOf :auto-mo/MaterialEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "article the primary use of which is to improve, repair, replace, or serve as a component part of a vehicle"}})

(def WasherFluid
  "fluid used to wash the car windows and windshields"
  {:db/ident :auto-vp/WasherFluid,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Body.Windshield.Front/Rear.WasherFluid : Front/Rear windshield washer fluid signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "washer fluid"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Windshield,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "fluid used to wash the car windows and windshields"}})

(def Wheel
  "circular object that revolves on an axle and is fixed below a vehicle or other object to enable it to move easily over the ground"
  {:db/ident :auto-vp/Wheel,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.Chassis.Axle.RowX.Wheel : wheel signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "wheel"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Axle,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "circular object that revolves on an axle and is fixed below a vehicle or other object to enable it to move easily over the ground"}})

(def Window
  "opening in the wall or roof of a vehicle, that lets air and light in, as well as increases the visibility of the surroundings"
  {:db/ident :auto-vp/Window,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Door.RowX.Left/Right.Window : Door window status"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "window"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Door,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "opening in the wall or roof of a vehicle, that lets air and light in, as well as increases the visibility of the surroundings"}})

(def WindowShade
  "piece of stiff cloth or heavy paper that you can pull down over a window as a covering"
  {:db/ident :auto-vp/WindowShade,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Cabin.Door.RowX.Left/Right.Shade : Side window shade"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "window shade"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Door,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "piece of stiff cloth or heavy paper that you can pull down over a window as a covering"}})

(def Windshield
  "principal forward facing glazed surface provided for forward vision in operating a motor vehicle"
  {:db/ident :auto-vp/Windshield,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Signal/Attribute.Body.Windshield : Windshield signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "windshield"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Body,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "principal forward facing glazed surface provided for forward vision in operating a motor vehicle"}})

(def WindshieldHeating
  "device that heats the windshield"
  {:db/ident :auto-vp/WindshieldHeating,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signal/Attribute.Body.Windshield.Front/Rear.Heating : Front/Rear windshield heater signals"},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "windshield heating"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Windshield,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "device that heats the windshield"}})

(def Wiping
  "Signal/Attribute.Body.Windshield.Front/Rear.Wiping : Front/Rear windshield wiper signals"
  {:db/ident :auto-vp/Wiping,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["device that wipes the windows and windshields"
    {:rdf/language "en",
     :rdf/value
     "Signal/Attribute.Body.Windshield.Front/Rear.Wiping : Front/Rear windshield wiper signals"}],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "wiping"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vp/Windshield,
                      :owl/onProperty    :auto-mo/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :auto-vp/VehiclePart]})