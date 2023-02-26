(ns net.wikipunk.rdf.auto-vs
  "This Vehicle Signals Ontology (VSSO) describes the car's parts and signals. It is based on the GENIVI's Vehicle Signal Specification."
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/auto/master/VS/VehicleSignals.rdf",
   :dcterms/abstract
   "This Vehicle Signals Ontology (VSSO) describes the car's parts and signals. It is based on the GENIVI's Vehicle Signal Specification.",
   :dcterms/created #inst "2018-01-10T05:00:00.000-00:00",
   :dcterms/license "http://creativecommons.org/licenses/by/4.0/",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/auto/ontology/VC/VehicleParts/"],
   :rdf/ns-prefix-map
   {"auto-vs" "https://spec.edmcouncil.org/auto/ontology/VS/VehicleSignals/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "auto-vs",
   :rdfa/uri "https://spec.edmcouncil.org/auto/ontology/VS/VehicleSignals/",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The GENIVI VSS Ontology (VSSO) has been initially created by Benjamin Klotz, Daniel Wilms, and Raphael Troncy (see http://automotive.eurecom.fr/vsso). VSSO, as created by Benjamin Klotz, Daniel Wilms, and Raphael Troncy, is available under the Creative Commons Attribution 4.0 International license; see http://creativecommons.org/licenses/by/4.0/. VSSO describes the car's attributes, branches and signals defined in GENIVI's Vehicle Signal Specification."},
   :rdfs/label "Vehicle signals ontology (VS)",
   :sm/fileAbbreviation "auto-ec-vsso",
   :sm/filename "VehicleSignals.rdf"})

(def ABSError
  "Signal.ADAS.ABS.Error : Indicates if ABS incurred an error condition. True = Error. False = No Error."
  {:db/ident :auto-vs/ABSError,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Error"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/AntilockBrakingSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.ABS.Error : Indicates if ABS incurred an error condition. True = Error. False = No Error."}})

(def ABSIsActive
  "Signal.ADAS.ABS.IsActive : Indicates if ABS is enabled. Tue = Enabled. False = Disabled."
  {:db/ident :auto-vs/ABSIsActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/AntilockBrakingSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/AntilockBrakingSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.ABS.IsActive : Indicates if ABS is enabled. Tue = Enabled. False = Disabled."}})

(def ABSIsEngaged
  "Signal.ADAS.ABS.IsEngaged : Indicates if ABS is currently regulating brake pressure. True = Engaged. False = Not Engaged."
  {:db/ident :auto-vs/ABSIsEngaged,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsEngaged"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/AntilockBrakingSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.ABS.IsEngaged : Indicates if ABS is currently regulating brake pressure. True = Engaged. False = Not Engaged."}})

(def AbsoluteLoad
  "Signal.OBD.AbsoluteLoad : PID 43 - Absolute load value"
  {:db/ident        :auto-vs/AbsoluteLoad,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "AbsoluteLoad"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.OBD.AbsoluteLoad : PID 43 - Absolute load value"}})

(def AcceleratorPedalPosition
  "Signal.Chassis.Accelerator.PedalPosition : Accelerator pedal position as percent. 0 = Not depressed. 100 = Fully depressed."
  {:db/ident :auto-vs/AcceleratorPedalPosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PedalPosition"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/PedalPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.Accelerator.PedalPosition : Accelerator pedal position as percent. 0 = Not depressed. 100 = Fully depressed."}})

(def AcceleratorPositionD-E-F
  "Signal.OBD.AcceleratorPositionD/E/F : PID 49/4A/4B - Accelerator pedal position D/E/F"
  {:db/ident :auto-vs/AcceleratorPositionD-E-F,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "AcceleratorPositionD"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/PedalPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.AcceleratorPositionD/E/F : PID 49/4A/4B - Accelerator pedal position D/E/F"}})

(def Accelerometer
  "Sensor measuring the linear acceleration"
  {:db/ident        :auto-vs/Accelerometer,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Accelerometer"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the linear acceleration"}})

(def AccumulatedDriveTime
  "Signal.Vehicle.DriveTime : Accumulated drive time in seconds."
  {:db/ident :auto-vs/AccumulatedDriveTime,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DriveTime"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Timer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom "http://qudt.org/schema/qudt/TimeUnit",
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.DriveTime : Accumulated drive time in seconds."}})

(def AccumulatedIdleTime
  "Signal.Vehicle.IdleTime : Accumulated idle time in seconds."
  {:db/ident :auto-vs/AccumulatedIdleTime,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IdleTime"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Timer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom "http://qudt.org/schema/qudt/TimeUnit",
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Signal.Vehicle.IdleTime : Accumulated idle time in seconds."}})

(def AccumulatedIgnitionOffTime
  "Signal.Vehicle.IgnitionOffTime : Accumulated ignition off time in seconds."
  {:db/ident :auto-vs/AccumulatedIgnitionOffTime,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IgnitionOffTime"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Timer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom "http://qudt.org/schema/qudt/TimeUnit",
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.IgnitionOffTime : Accumulated ignition off time in seconds."}})

(def AccumulatedIgnitionOnTime
  "Signal.Vehicle.IgnitionOnTime : Accumulated ignition on time in seconds."
  {:db/ident :auto-vs/AccumulatedIgnitionOnTime,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IgnitionOnTime"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Timer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom "http://qudt.org/schema/qudt/TimeUnit",
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.IgnitionOnTime : Accumulated ignition on time in seconds."}})

(def AccumulatedTravelledDistance
  "Signal.Vehicle.TravelledDistance : Odometer reading"
  {:db/ident        :auto-vs/AccumulatedTravelledDistance,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "TravelledDistance"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Odometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LengthUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.Vehicle.TravelledDistance : Odometer reading"}})

(def ActuableSignal
  "All actuable signals that can dynamically be updated by the vehicle"
  {:db/ident :auto-vs/ActuableSignal,
   :rdf/type [:owl/Class :owl/ObjectProperty],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Actuable signal"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "All actuable signals that can dynamically be updated by the vehicle"}})

(def AirConditioningSystem
  "Air conditioning system"
  {:db/ident        :auto-vs/AirConditioningSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Air conditioning system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Air conditioning system"}})

(def AirDistribution
  "Signal.Cabin.HVAC.RowX.Left/Right.AirDistribution : Direction of airstream"
  {:db/ident :auto-vs/AirDistribution,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "AirDistribution"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FanSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/FanControl,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.HVAC.RowX.Left/Right.AirDistribution : Direction of airstream"}})

(def AirStatus
  "Signal.OBD.AirStatus : PID 12 - Secondary air status"
  {:db/ident        :auto-vs/AirStatus,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "AirStatus"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.OBD.AirStatus : PID 12 - Secondary air status"}})

(def AirbagIsDeployed
  "Signal.Cabin.Seat.RowX.PosY.Airbag.IsDeployed : Airbag deployment status. True = Airbag deployed. False = Airbag not deployed."
  {:db/ident :auto-vs/AirbagIsDeployed,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsDeployed"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/AirbagSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Airbag.IsDeployed : Airbag deployment status. True = Airbag deployed. False = Airbag not deployed."}})

(def AirbagSystem
  "Sensor measuring if the airbag is deployed"
  {:db/ident        :auto-vs/AirbagSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Airbag system"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Sensor measuring if the airbag is deployed"}})

(def Altitude
  "Signal.Cabin.Infotainment.Navigation.CurrentLocation.Altitude : Current elevation of the position in meters."
  {:db/ident :auto-vs/Altitude,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Longitude"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/GPS,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LengthUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Navigation.CurrentLocation.Altitude : Current elevation of the position in meters."}})

(def AmbientAirTemperature
  "Signal.Vehicle.AmbientAirTemperature / Signal.Cabin.HVAC.AmbientAirTemperature / Signal.Drivetrain.InternalCombustionEngine.Engine.AmbientAirTemperature / Signal.OBD.AmbientAirTemperature / PID 46 : Ambient air temperature (outside)"
  {:db/ident :auto-vs/AmbientAirTemperature,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "AmbientAirTemperature"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Thermometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.AmbientAirTemperature / Signal.Cabin.HVAC.AmbientAirTemperature / Signal.Drivetrain.InternalCombustionEngine.Engine.AmbientAirTemperature / Signal.OBD.AmbientAirTemperature / PID 46 : Ambient air temperature (outside)"}})

(def AmbientLightLevel
  "Signal.Cabin.Lights.AmbientLight : How much ambient light is detected in cabin. 0 = No ambient light. 100 = Full brightness"
  {:db/ident :auto-vs/AmbientLightLevel,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "AmbientLight"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LightSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Lights.AmbientLight : How much ambient light is detected in cabin. 0 = No ambient light. 100 = Full brightness"}})

(def AntilockBrakingSystem
  "Appliance that allows thes wheels to maintain tractive contact by prevent them from locking up"
  {:db/ident :auto-vs/AntilockBrakingSystem,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Antilock braking system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Appliance that allows thes wheels to maintain tractive contact by prevent them from locking up"}})

(def AuxInputStatus
  "Signal.OBD.AuxInputStatus : PID 1E - Auxiliary input status (power take off)"
  {:db/ident :auto-vs/AuxInputStatus,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "AuxInputStatus"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.AuxInputStatus : PID 1E - Auxiliary input status (power take off)"}})

(def AverageConsumption
  "Signal.Drivetrain.FuelSystem.AverageConsumption : Average consumption in liters per 100 km."
  {:db/ident :auto-vs/AverageConsumption,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "AverageConsumption"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FlowSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/VolumePerDistanceUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.FuelSystem.AverageConsumption : Average consumption in liters per 100 km."}})

(def BackupLight
  "Turns on and off the backup light"
  {:db/ident        :auto-vs/BackupLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Backup light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the backup light"}})

(def BackupLightSwitch
  "Senses if the backup light switch is on"
  {:db/ident        :auto-vs/BackupLightSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Backup light switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Senses if the backup light switch is on"}})

(def Bank2
  "bank 2"
  {:db/ident        :auto-vs/Bank2,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "bank 2"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def Barometer
  "barometer"
  {:db/ident        :auto-vs/Barometer,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "barometer"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def BarometricPressure
  "Signal.OBD.BarometricPressure : PID 33 - Barometric pressure"
  {:db/ident :auto-vs/BarometricPressure,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BarometricPressure"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Barometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PressureOrStressUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Signal.OBD.BarometricPressure : PID 33 - Barometric pressure"}})

(def BatteryCapacity
  "Signal.Drivetrain.BatteryManagement.BatteryCapacity : Remaining capacity of the batter pack"
  {:db/ident :auto-vs/BatteryCapacity,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BatteryCapacity"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/BatteryMonitor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.BatteryManagement.BatteryCapacity : Remaining capacity of the batter pack"}})

(def BatteryMonitor
  "Sensor measuring the capacity of a battery"
  {:db/ident        :auto-vs/BatteryMonitor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Battery monitor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Sensor measuring the capacity of a battery"}})

(def BatterySensor
  "battery sensor"
  {:db/ident        :auto-vs/BatterySensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "battery sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def BatteryTemperature
  "Signal.Drivetrain.BatteryManagement.BatteryTemperature : Temperature of the battery pack"
  {:db/ident :auto-vs/BatteryTemperature,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BatteryTemperature"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Thermometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.BatteryManagement.BatteryTemperature : Temperature of the battery pack"}})

(def BeltSensor
  "Sensor measuring if a seat is belted"
  {:db/ident        :auto-vs/BeltSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Belt sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring if a seat is belted"}})

(def BrakeFluidLevel
  "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.FluidLevel : Brake fluid level as percent. 0 = Empty. 100 = Full."
  {:db/ident :auto-vs/BrakeFluidLevel,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FluidLevel"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/BrakeFluidLevelSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.FluidLevel : Brake fluid level as percent. 0 = Empty. 100 = Full."}})

(def BrakeFluidLevelLow
  "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.FluidLevelLow : Brake fluid level status. True = Brake fluid level low. False = Brake fluid level OK."
  {:db/ident :auto-vs/BrakeFluidLevelLow,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FluidLevelLow"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/BrakeFluidLevelSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.FluidLevelLow : Brake fluid level status. True = Brake fluid level low. False = Brake fluid level OK."}})

(def BrakeFluidLevelSensor
  "Sensor measuring the brake fluid level"
  {:db/ident        :auto-vs/BrakeFluidLevelSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Brake fluid level sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the brake fluid level"}})

(def BrakeLight
  "Turns on and off the brake light"
  {:db/ident        :auto-vs/BrakeLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Brake light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the brake light"}})

(def BrakeLightSwitch
  "Senses if the brake light switch is on"
  {:db/ident        :auto-vs/BrakeLightSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Brake light switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Senses if the brake light switch is on"}})

(def BrakePadWearSensor
  "Sensor measuring the padwear of a brake"
  {:db/ident        :auto-vs/BrakePadWearSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Brake padwear sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the padwear of a brake"}})

(def BrakePedalPosition
  "Signal.Chassis.Brake.PedalPosition : Brake pedal position as percent. 0 = Not depressed. 100 = Fully depressed."
  {:db/ident :auto-vs/BrakePedalPosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PedalPosition"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/PedalPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.Brake.PedalPosition : Brake pedal position as percent. 0 = Not depressed. 100 = Fully depressed."}})

(def BrakesWorn
  "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.BrakesWorn : Brake pad wear status. True = Worn. False = Not Worn."
  {:db/ident :auto-vs/BrakesWorn,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BrakesWorn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/BrakePadWearSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.BrakesWorn : Brake pad wear status. True = Worn. False = Not Worn."}})

(def CAN
  "CAN"
  {:db/ident        :auto-vs/CAN,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "CAN"},
   :rdfs/subClassOf :sosa/Sensor})

(def Camera
  "camera"
  {:db/ident        :auto-vs/Camera,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "camera"},
   :rdfs/subClassOf :sosa/Sensor})

(def CatalystTemperature
  "Signal.OBD.Catalyst.BankX.TemperatureY : PID 3C->3F - Catalyst temperature from bank X, sensor Y"
  {:db/ident :auto-vs/CatalystTemperature,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Temperature1"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CatalystTemperatureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.Catalyst.BankX.TemperatureY : PID 3C->3F - Catalyst temperature from bank X, sensor Y"}})

(def CatalystTemperatureSensor
  "catalyst temperature sensor"
  {:db/ident        :auto-vs/CatalystTemperatureSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "catalyst temperature sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def ChildLock
  "Child lock"
  {:db/ident        :auto-vs/ChildLock,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Child lock"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Child lock"}})

(def ClutchWear
  "Signal.Drivetrain.Transmission.ClutchWear : Clutch wear as a percent. 0 = no wear. 100 = worn."
  {:db/ident :auto-vs/ClutchWear,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ClutchWear"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ClutchWearIndicator,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.Transmission.ClutchWear : Clutch wear as a percent. 0 = no wear. 100 = worn."}})

(def ClutchWearIndicator
  "Sensor measuring the wear of the clutch"
  {:db/ident        :auto-vs/ClutchWearIndicator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Clutch wear indicator"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the wear of the clutch"}})

(def CommandedEGR
  "Signal.OBD.CommandedEGR : PID 2C - Commanded exhaust gas recirculation (EGR)"
  {:db/ident :auto-vs/CommandedEGR,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CommandedEGR"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/EGRSystemMonitor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.CommandedEGR : PID 2C - Commanded exhaust gas recirculation (EGR)"}})

(def CommandedEVAP
  "Signal.OBD.CommandedEVAP : PID 2E - Commanded evaporative purge (EVAP) valve"
  {:db/ident :auto-vs/CommandedEVAP,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CommandedEVAP"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/EVAPSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/EVAPSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.CommandedEVAP : PID 2E - Commanded evaporative purge (EVAP) valve"}})

(def CommandedEquivalenceRatio
  "Signal.OBD.CommandedEquivalenceRatio : PID 44 - Commanded equivalence ratio"
  {:db/ident :auto-vs/CommandedEquivalenceRatio,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CommandedEquivalenceRatio"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.CommandedEquivalenceRatio : PID 44 - Commanded equivalence ratio"}})

(def ConsumptionSinceStart
  "Signal.Drivetrain.FuelSystem.ConsumptionSinceStart : Fuel amount consumed since start in liters."
  {:db/ident :auto-vs/ConsumptionSinceStart,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ConsumptionSinceStart"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FlowSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/VolumeUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.FuelSystem.ConsumptionSinceStart : Fuel amount consumed since start in liters."}})

(def ControlModuleVoltage
  "Signal.OBD.ControlModuleVoltage : PID 42 - Control module voltage"
  {:db/ident :auto-vs/ControlModuleVoltage,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ControlModuleVoltage"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/VoltageSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/EnergyPerElectricChargeUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.ControlModuleVoltage : PID 42 - Control module voltage"}})

(def CoolantTemperature
  "Signal.OBD.CoolantTemperature : PID 05 - Coolant temperature"
  {:db/ident :auto-vs/CoolantTemperature,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CoolantTemperature"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CoolantTemperatureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Signal.OBD.CoolantTemperature : PID 05 - Coolant temperature"}})

(def CoolantTemperatureSensor
  "coolant temperature sensor"
  {:db/ident        :auto-vs/CoolantTemperatureSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "coolant temperature sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def CoolantThermometer
  "Sensor measuring the temperature of the coolant fluid"
  {:db/ident        :auto-vs/CoolantThermometer,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Coolant thermometer"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sensor measuring the temperature of the coolant fluid"}})

(def CrankshaftPositionSensor
  "crankshaft position sensor"
  {:db/ident        :auto-vs/CrankshaftPositionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "crankshaft position sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def CruiseControlError
  "Signal.ADAS.CruiseControl.Error : Indicates if cruise control system incurred and error condition. True = Error. False = NoError."
  {:db/ident :auto-vs/CruiseControlError,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Error"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CruiseControlSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.CruiseControl.Error : Indicates if cruise control system incurred and error condition. True = Error. False = NoError."}})

(def CruiseControlIsActive
  "Signal.ADAS.CruiseControl.IsActive : Indicates if cruise control system is enabled. True = Enabled. False = Disabled."
  {:db/ident :auto-vs/CruiseControlIsActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CruiseControlSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/CruiseControlSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.CruiseControl.IsActive : Indicates if cruise control system is enabled. True = Enabled. False = Disabled."}})

(def CruiseControlSystem
  "Appliance that automatically controls the speed of a vehicle"
  {:db/ident :auto-vs/CruiseControlSystem,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cruise control system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Appliance that automatically controls the speed of a vehicle"}})

(def CurrentGear
  "Signal.Drivetrain.Transmission.Gear : Current gear. 0=Neutral. -1=Reverse"
  {:db/ident :auto-vs/CurrentGear,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gear"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Gearbox,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/Gearbox,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.Transmission.Gear : Current gear. 0=Neutral. -1=Reverse"}})

(def CurrentPower
  "Signal.Drivetrain.InternalCombustionEngine.Engine.Power : Current engine power output."
  {:db/ident :auto-vs/CurrentPower,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Power"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/PowerMeter,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PowerUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.InternalCombustionEngine.Engine.Power : Current engine power output."}})

(def CurrentTravelledDistance
  "Signal.Vehicle.TripMeterReading : Current trip meter reading"
  {:db/ident :auto-vs/CurrentTravelledDistance,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TripMeterReading"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Odometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom "http://qudt.org/schema/qudt/TimeUnit",
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Signal.Vehicle.TripMeterReading : Current trip meter reading"}})

(def CushionBackward
  "Signal.Cabin.Seat.RowX.PosY.Switch.Cushion.Backward : Seat cushion backward/shorten switch engaged"
  {:db/ident :auto-vs/CushionBackward,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Backward"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CushionPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Cushion.Backward : Seat cushion backward/shorten switch engaged"}})

(def CushionDown
  "Signal.Cabin.Seat.RowX.PosY.Switch.Cushion.Down : Seat cushion down switch engaged"
  {:db/ident :auto-vs/CushionDown,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Down"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CushionPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Cushion.Down : Seat cushion down switch engaged"}})

(def CushionForward
  "Signal.Cabin.Seat.RowX.PosY.Switch.Cushion.Forward : Seat cushion forward/lengthen switch engaged"
  {:db/ident :auto-vs/CushionForward,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Forward"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CushionPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Cushion.Forward : Seat cushion forward/lengthen switch engaged"}})

(def CushionHeight
  "Signal.Cabin.Seat.RowX.PosY.Cushion.Height : Height of the seat front. 0 = Lowermost. 100 = Uppermost."
  {:db/ident :auto-vs/CushionHeight,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Height"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CushionPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Cushion.Height : Height of the seat front. 0 = Lowermost. 100 = Uppermost."}})

(def CushionLength
  "Signal.Cabin.Seat.RowX.PosY.Cushion.Length : Forward length of cushion (leg support). 0 = Rearmost. 100 = Forwardmost."
  {:db/ident :auto-vs/CushionLength,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Length"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CushionPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Cushion.Length : Forward length of cushion (leg support). 0 = Rearmost. 100 = Forwardmost."}})

(def CushionPositionActuator
  "Controls the cushion position"
  {:db/ident        :auto-vs/CushionPositionActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Cushion position actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls the cushion position"}})

(def CushionPositionSensor
  "cushion position sensor"
  {:db/ident        :auto-vs/CushionPositionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "cushion position sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def CushionUp
  "Signal.Cabin.Seat.RowX.PosY.Switch.Cushion.Up : Seat cushion up switch engaged"
  {:db/ident :auto-vs/CushionUp,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Up"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CushionPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Cushion.Up : Seat cushion up switch engaged"}})

(def DTCCount
  "Signal.OBD.Status.DTCCount : Number of Diagnostic Trouble Codes (DTC)"
  {:db/ident :auto-vs/DTCCount,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DTCCount"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.Status.DTCCount : Number of Diagnostic Trouble Codes (DTC)"}})

(def DeclinedMediaURI
  "Signal.Cabin.Infotainment.Media.DeclinedURI : URI of suggested media that was declined"
  {:db/ident :auto-vs/DeclinedMediaURI,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DeclinedURI"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/anyURI,
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Media.DeclinedURI : URI of suggested media that was declined"}})

(def DecreaseMassage
  "Signal.Cabin.Seat.RowX.PosY.Switch.Massage.Decrease : Decrease massage level switch engaged"
  {:db/ident :auto-vs/DecreaseMassage,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Decrease"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MassageSystem,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Massage.Decrease : Decrease massage level switch engaged"}})

(def DeflateSideBolster
  "Signal.Cabin.Seat.RowX.PosY.Switch.SideBolster.Deflate : Lumbar deflation switch engaged"
  {:db/ident :auto-vs/DeflateSideBolster,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Deflate"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LumbarPressureActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.SideBolster.Deflate : Lumbar deflation switch engaged"}})

(def Defroster
  "Windshield defroster"
  {:db/ident        :auto-vs/Defroster,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Defroster"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Windshield defroster"}})

(def DestinationLatitude
  "Signal.Cabin.Infotainment.Navigation.DestinationSet.Latitude : Latitude of destination"
  {:db/ident :auto-vs/DestinationLatitude,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Latitude"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/GPS,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/GPS,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngleUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Navigation.DestinationSet.Latitude : Latitude of destination"}})

(def DestinationLongitude
  "Signal.Cabin.Infotainment.Navigation.DestinationSet.Longitude : Longitude of destination"
  {:db/ident :auto-vs/DestinationLongitude,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Longitude"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/GPS,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/GPS,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngleUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Navigation.DestinationSet.Longitude : Longitude of destination"}})

(def DiagnosticSystem
  "diagnostic system"
  {:db/ident        :auto-vs/DiagnosticSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "diagnostic system"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def DimmingSystem
  "Mirror dimming system"
  {:db/ident        :auto-vs/DimmingSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Dimming system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Mirror dimming system"}})

(def DistanceSinceDTCClear
  "Signal.OBD.DistanceSinceDTCClear : PID 31 - Distance traveled since codes cleared"
  {:db/ident :auto-vs/DistanceSinceDTCClear,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DistanceSinceDTCClear"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LengthUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.DistanceSinceDTCClear : PID 31 - Distance traveled since codes cleared"}})

(def DistanceToObjectSignal
  "Signal.ADAS.ObstacleDetection.DistanceToObject.Front/Rear/Left/Right : distance to object in meters"
  {:db/ident :auto-vs/DistanceToObjectSignal,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RearLeft"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ObstacleDetectionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LengthUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.ObstacleDetection.DistanceToObject.Front/Rear/Left/Right : distance to object in meters"}})

(def DistanceWithMIL
  "Signal.OBD.DistanceWithMIL : PID 21 - Distance traveled with MIL on"
  {:db/ident :auto-vs/DistanceWithMIL,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DistanceWithMIL"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Odometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LengthUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.DistanceWithMIL : PID 21 - Distance traveled with MIL on"}})

(def DomeLight
  "Dome light"
  {:db/ident        :auto-vs/DomeLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Dome light"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Dome light"}})

(def DoorContactActuator
  "Shuts or opens a door"
  {:db/ident        :auto-vs/DoorContactActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Door contact actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Shuts or opens a door"}})

(def DoorContactSensor
  "Sensor measuring if a door is open or closed"
  {:db/ident        :auto-vs/DoorContactSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Door contact sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sensor measuring if a door is open or closed"}})

(def DoorIsLocked
  "Signal.Cabin.Door.RowX.Left/Right.IsLocked : Is door locked or unlocked. True = Locked. False = Unlocked."
  {:db/ident :auto-vs/DoorIsLocked,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsLocked"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DoorLock,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/DoorLock,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Door.RowX.Left/Right.IsLocked : Is door locked or unlocked. True = Locked. False = Unlocked."}})

(def DoorIsOpen
  "Signal.Cabin.Door.RowX.Left/Right.IsOpen : Is door open or closed"
  {:db/ident :auto-vs/DoorIsOpen,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsOpen"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DoorContactSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/DoorContactActuator,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Door.RowX.Left/Right.IsOpen : Is door open or closed"}})

(def DoorLock
  "Door lock"
  {:db/ident        :auto-vs/DoorLock,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Door lock"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Door lock"}})

(def DriveSystem
  "Driving mode control"
  {:db/ident        :auto-vs/DriveSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Drive system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Driving mode control"}})

(def ECT
  "Signal.Drivetrain.InternalCombustionEngine.Engine.ECT : Engine coolant temperature."
  {:db/ident :auto-vs/ECT,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ECT"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CoolantThermometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.InternalCombustionEngine.Engine.ECT : Engine coolant temperature."}})

(def EGRError
  "Signal.OBD.EGRError : PID 2D - Exhaust gas recirculation (EGR) error"
  {:db/ident :auto-vs/EGRError,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EGRError"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/EGRSystemMonitor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.EGRError : PID 2D - Exhaust gas recirculation (EGR) error"}})

(def EGRSystemMonitor
  "EGR system monitor"
  {:db/ident        :auto-vs/EGRSystemMonitor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "EGR system monitor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def EOP
  "Signal.Drivetrain.InternalCombustionEngine.Engine.EOP : Engine oil pressure."
  {:db/ident :auto-vs/EOP,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EOP"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/OilPressureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.InternalCombustionEngine.Engine.EOP : Engine oil pressure."}})

(def ESCError
  "Signal.ADAS.ESC.Error : Indicates if ESC incurred an error condition. True = Error. False = No Error."
  {:db/ident :auto-vs/ESCError,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Error"},
   :rdfs/subClassOf
   [{:owl/allValuesFrom :auto-vs/ElectronicStabilityControlSystem,
     :owl/onProperty    :sosa/isObservedBy,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom "http://qudt.org/schema/qudt/DimensionlessUnit",
     :owl/onProperty    "http://qudt.org/schema/qudt/unit",
     :rdf/type          :owl/Restriction}
    :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.ESC.Error : Indicates if ESC incurred an error condition. True = Error. False = No Error."}})

(def ESCIsActive
  "Signal.ADAS.ESC.IsActive : Indicates if ECS is enabled. Tue = Enabled. False = Disabled."
  {:db/ident :auto-vs/ESCIsActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsActive"},
   :rdfs/subClassOf
   [{:owl/allValuesFrom :auto-vs/ElectronicStabilityControlSystem,
     :owl/onProperty    :sosa/isObservedBy,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom :auto-vs/ElectronicStabilityControlSystem,
     :owl/onProperty    :sosa/isActuatedBy,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom "http://qudt.org/schema/qudt/DimensionlessUnit",
     :owl/onProperty    "http://qudt.org/schema/qudt/unit",
     :rdf/type          :owl/Restriction}
    :auto-vs/ObservableSignal
    :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.ESC.IsActive : Indicates if ECS is enabled. Tue = Enabled. False = Disabled."}})

(def ESCIsEngaged
  "Signal.ADAS.ESC.IsEngaged : Indicates if ESC is currently regulating vehicle stability. True = Engaged. False = Not Engaged."
  {:db/ident :auto-vs/ESCIsEngaged,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsEngaged"},
   :rdfs/subClassOf
   [{:owl/allValuesFrom :auto-vs/ElectronicStabilityControlSystem,
     :owl/onProperty    :sosa/isObservedBy,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom "http://qudt.org/schema/qudt/DimensionlessUnit",
     :owl/onProperty    "http://qudt.org/schema/qudt/unit",
     :rdf/type          :owl/Restriction}
    :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.ESC.IsEngaged : Indicates if ESC is currently regulating vehicle stability. True = Engaged. False = Not Engaged."}})

(def EVAPSystem
  "EVAP system"
  {:db/ident        :auto-vs/EVAPSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "EVAP system"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def EVAPVaporPressure
  "Signal.OBD.EVAPVaporPressure : PID 32 - Evaporative purge (EVAP) system pressure"
  {:db/ident :auto-vs/EVAPVaporPressure,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EVAPVaporPressure"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/EVAPSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PressureOrStressUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.EVAPVaporPressure : PID 32 - Evaporative purge (EVAP) system pressure"}})

(def EVAPVaporPressureAbsolute
  "Signal.OBD.EVAPVaporPressureAbsolute : PID 53 - Absolute evaporative purge (EVAP) system pressure"
  {:db/ident :auto-vs/EVAPVaporPressureAbsolute,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EVAPVaporPressureAbsolute"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/EVAPSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PressureOrStressUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.EVAPVaporPressureAbsolute : PID 53 - Absolute evaporative purge (EVAP) system pressure"}})

(def EVAPVaporPressureAlternate
  "Signal.OBD.EVAPVaporPressureAlternate : PID 54 - Alternate evaporative purge (EVAP) system pressure"
  {:db/ident :auto-vs/EVAPVaporPressureAlternate,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EVAPVaporPressureAlternate"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/EVAPSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PressureOrStressUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.EVAPVaporPressureAlternate : PID 54 - Alternate evaporative purge (EVAP) system pressure"}})

(def ElectronicStabilityControlSystem
  "System detecting loss of traction (skidding) and reducing it"
  {:db/ident :auto-vs/ElectronicStabilityControlSystem,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Electronic stability control system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "System detecting loss of traction (skidding) and reducing it"}})

(def EngineLoad
  "Signal.OBD.EngineLoad : PID 04 - Engine load in percent - 0 = no load, 100 = full load"
  {:db/ident :auto-vs/EngineLoad,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EngineLoad"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.EngineLoad : PID 04 - Engine load in percent - 0 = no load, 100 = full load"}})

(def EngineOilTemperature
  "Signal.Drivetrain.InternalCombustionEngine.Engine.EOT / Signal.OBD.OilTemperature / PID 5C : Engine oil temperature."
  {:db/ident :auto-vs/EngineOilTemperature,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EOT"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/OilThermometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.InternalCombustionEngine.Engine.EOT / Signal.OBD.OilTemperature / PID 5C : Engine oil temperature."}})

(def EthanolPercent
  "Signal.OBD.EthanolPercent : PID 52 - Percentage of ethanol in the fuel"
  {:db/ident :auto-vs/EthanolPercent,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EthanolPercent"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FluidSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.EthanolPercent : PID 52 - Percentage of ethanol in the fuel"}})

(def FanControl
  "Controls a fan speed"
  {:db/ident        :auto-vs/FanControl,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Fan control"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls a fan speed"}})

(def FanSensor
  "Sensor measuring the fan speed"
  {:db/ident        :auto-vs/FanSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Fan sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the fan speed"}})

(def FanSpeed
  "Signal.Cabin.HVAC.RowX.Left/Right.FanSpeed : Fan Speed, 0 = off. 100 = max"
  {:db/ident :auto-vs/FanSpeed,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FanSpeed"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FanSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/FanControl,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.HVAC.RowX.Left/Right.FanSpeed : Fan Speed, 0 = off. 100 = max"}})

(def FlowSensor
  "Sensor measuring the flow of a fluid (fuel)"
  {:db/ident        :auto-vs/FlowSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Flow sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Sensor measuring the flow of a fluid (fuel)"}})

(def FluidSensor
  "fluid sensor"
  {:db/ident        :auto-vs/FluidSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "fluid sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def FreezeDTC
  "Signal.OBD.FreezeDTC : PID 02 - DTC that triggered the freeze frame"
  {:db/ident :auto-vs/FreezeDTC,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FreezeDTC"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.FreezeDTC : PID 02 - DTC that triggered the freeze frame"}})

(def FrontFogLight
  "Turns on and off the front fog light"
  {:db/ident        :auto-vs/FrontFogLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Front fog light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the front fog light"}})

(def FrontFogLightSwitch
  "Senses if the front fog light switch is on"
  {:db/ident        :auto-vs/FrontFogLightSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Front fog position switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Senses if the front fog light switch is on"}})

(def FuelInjectionTiming
  "Signal.OBD.FuelInjectionTiming : PID 5D - Fuel injection timing"
  {:db/ident :auto-vs/FuelInjectionTiming,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FuelInjectionTiming"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CrankshaftPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngleUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.FuelInjectionTiming : PID 5D - Fuel injection timing"}})

(def FuelPressure
  "Signal.OBD.FuelPressure : PID 0A - Fuel pressure"
  {:db/ident        :auto-vs/FuelPressure,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "FuelPressure"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FuelPressureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PressureOrStressUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.OBD.FuelPressure : PID 0A - Fuel pressure"}})

(def FuelPressureSensor
  "fuel pressure sensor"
  {:db/ident        :auto-vs/FuelPressureSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "fuel pressure sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def FuelRailPressureAbsolute
  "Signal.OBD.FuelRailPressureAbsolute : PID 59 - Absolute fuel rail pressure"
  {:db/ident :auto-vs/FuelRailPressureAbsolute,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FuelRailPressureAbsolute"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FuelRailPressureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PressureOrStressUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.FuelRailPressureAbsolute : PID 59 - Absolute fuel rail pressure"}})

(def FuelRailPressureDirect
  "Signal.OBD.FuelRailPressureDirect : PID 23 - Fuel rail pressure direct inject"
  {:db/ident :auto-vs/FuelRailPressureDirect,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FuelRailPressureDirect"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FuelRailPressureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PressureOrStressUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.FuelRailPressureDirect : PID 23 - Fuel rail pressure direct inject"}})

(def FuelRailPressureSensor
  "fuel rail pressure sensor"
  {:db/ident        :auto-vs/FuelRailPressureSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "fuel rail pressure sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def FuelRailPressureVac
  "Signal.OBD.FuelRailPressureVac : PID 22 - Fuel rail pressure relative to vacuum"
  {:db/ident :auto-vs/FuelRailPressureVac,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FuelRailPressureVac"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FuelRailPressureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PressureOrStressUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.FuelRailPressureVac : PID 22 - Fuel rail pressure relative to vacuum"}})

(def FuelRate
  "Signal.OBD.FuelRate : PID 5E - Engine fuel rate"
  {:db/ident        :auto-vs/FuelRate,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "FuelRate"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FlowSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/VolumePerTimeUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.OBD.FuelRate : PID 5E - Engine fuel rate"}})

(def FuelStatus
  "Signal.OBD.FuelStatus : PID 03 - Fuel status"
  {:db/ident        :auto-vs/FuelStatus,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "FuelStatus"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.OBD.FuelStatus : PID 03 - Fuel status"}})

(def FuelTankLevelSensor
  "Sensor measuring the fuel tank level"
  {:db/ident        :auto-vs/FuelTankLevelSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Fuel tank level sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the fuel tank level"}})

(def FuelType
  "Signal.OBD.FuelType : PID 51 - Fuel type"
  {:db/ident        :auto-vs/FuelType,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "FuelType"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Signal.OBD.FuelType : PID 51 - Fuel type"}})

(def GPS
  "Global positioning system (GPS)"
  {:db/ident        :auto-vs/GPS,
   :rdf/type        [:owl/Class :owl/NamedIndividual],
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Global positioning system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Sensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Global positioning system (GPS)"}})

(def GPSAccuracy
  "Signal.Cabin.Infotainment.Navigation.CurrentLocation.Accuracy : Accuracy level of the latitude and longitude coordinates in meters."
  {:db/ident :auto-vs/GPSAccuracy,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accuracy"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/GPS,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LengthUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Navigation.CurrentLocation.Accuracy : Accuracy level of the latitude and longitude coordinates in meters."}})

(def GPSHeading
  "Signal.Cabin.Infotainment.Navigation.CurrentLocation.Heading : Current magnetic compass heading, in degrees."
  {:db/ident :auto-vs/GPSHeading,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Heading"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/GPS,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngleUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Navigation.CurrentLocation.Heading : Current magnetic compass heading, in degrees."}})

(def GearChangeMode
  "Signal.Drivetrain.Transmission.GearChangeMode : Is the gearbox in automatic or manual (paddle) mode."
  {:db/ident :auto-vs/GearChangeMode,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GearChangeMode"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DriveSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/DriveSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.Transmission.GearChangeMode : Is the gearbox in automatic or manual (paddle) mode."}})

(def Gearbox
  "Gearbox monitoring system"
  {:db/ident        :auto-vs/Gearbox,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Gearbox system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Gearbox monitoring system"}})

(def GearboxTemperature
  "Signal.Drivetrain.Transmission.Temperature : The current gearbox temperature."
  {:db/ident :auto-vs/GearboxTemperature,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gearbox temperature"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Thermometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.Transmission.Temperature : The current gearbox temperature."}})

(def GloveBoxLight
  "Glove box light"
  {:db/ident        :auto-vs/GloveBoxLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Glove box light"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Glove box light"}})

(def Gyroscope
  "Sensor measuring the angular orientation and angular velocity"
  {:db/ident :auto-vs/Gyroscope,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gyroscope"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Sensor measuring the angular orientation and angular velocity"}})

(def HazardLight
  "Turns on and off the hazard light"
  {:db/ident        :auto-vs/HazardLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Hazard light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the hazard light"}})

(def HazardLightSwitch
  "Senses if the hazard light switch is on"
  {:db/ident        :auto-vs/HazardLightSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Hazard light switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Senses if the hazard light switch is on"}})

(def HeadRestraintActuator
  "Controls the head restraint position"
  {:db/ident        :auto-vs/HeadRestraintActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Head restraint actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls the head restraint position"}})

(def HeadRestraintDown
  "Signal.Cabin.Seat.RowX.PosY.Switch.HeadRestraint.Down : Head restraint down switch engaged"
  {:db/ident :auto-vs/HeadRestraintDown,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Down"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/HeadRestraintActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.HeadRestraint.Down : Head restraint down switch engaged"}})

(def HeadRestraintHeight
  "Signal.Cabin.Seat.RowX.PosY.HeadRestraint.Height : Height of head restraint. 0 = Bottommost. 100 = Topmost."
  {:db/ident :auto-vs/HeadRestraintHeight,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Height"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/HeadRestraintSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.HeadRestraint.Height : Height of head restraint. 0 = Bottommost. 100 = Topmost."}})

(def HeadRestraintSensor
  "Sensor measuring the position of the head restraint"
  {:db/ident        :auto-vs/HeadRestraintSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Head restraint sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sensor measuring the position of the head restraint"}})

(def HeadRestraintUp
  "Signal.Cabin.Seat.RowX.PosY.Switch.HeadRestraint.Up : Head restraint up switch engaged"
  {:db/ident :auto-vs/HeadRestraintUp,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Up"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/HeadRestraintActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.HeadRestraint.Up : Head restraint up switch engaged"}})

(def HighBeamLight
  "Turns on and off the high beam light"
  {:db/ident        :auto-vs/HighBeamLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "High beam light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the high beam light"}})

(def HighBeamLightSwitch
  "Senses if the high beam switch is on"
  {:db/ident        :auto-vs/HighBeamLightSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "High Beam Light Switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Senses if the high beam switch is on"}})

(def HoodIsOpen
  "Signal.Body.Hood.IsOpen : hood open or closed. True = Open. False = Closed"
  {:db/ident :auto-vs/HoodIsOpen,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsOpen"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/HoodLatch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/HoodLatch,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Hood.IsOpen : hood open or closed. True = Open. False = Closed"}})

(def HoodLatch
  "System controling the hood"
  {:db/ident        :auto-vs/HoodLatch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Hood latch"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "System controling the hood"}})

(def HornIsActive
  "Signal.Body.Horn.IsActive : Horn active or inactive. True = Active. False = Inactive."
  {:db/ident :auto-vs/HornIsActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/HornSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/HornSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Horn.IsActive : Horn active or inactive. True = Active. False = Inactive."}})

(def HornSystem
  "Horn/honk system"
  {:db/ident        :auto-vs/HornSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Horn system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Horn/honk system"}})

(def HybridBatteryRemaining
  "Signal.OBD.HybridBatteryRemaining : PID 5B - Remaining life of hybrid battery"
  {:db/ident :auto-vs/HybridBatteryRemaining,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "HybridBatteryRemaining"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/BatterySensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.HybridBatteryRemaining : PID 5B - Remaining life of hybrid battery"}})

(def IncreaseMassage
  "Signal.Cabin.Seat.RowX.PosY.Switch.Massage.Increase : Increase massage level switch engaged"
  {:db/ident :auto-vs/IncreaseMassage,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Increase"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MassageSystem,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Massage.Increase : Increase massage level switch engaged"}})

(def InflateSideBolster
  "Signal.Cabin.Seat.RowX.PosY.Switch.SideBolster.Inflate : Lumbar inflation switch engaged"
  {:db/ident :auto-vs/InflateSideBolster,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inflate"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LumbarPressureActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.SideBolster.Inflate : Lumbar inflation switch engaged"}})

(def InstantConsumption
  "Signal.Drivetrain.FuelSystem.InstantConsumption : Current consumption in liters per 100 km."
  {:db/ident :auto-vs/InstantConsumption,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "InstantConsumption"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FlowSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/VolumePerDistanceUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.FuelSystem.InstantConsumption : Current consumption in liters per 100 km."}})

(def Intake-AirTemperatureSensor
  "intake air temperature sensor"
  {:db/ident        :auto-vs/Intake-AirTemperatureSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "intake air temperature sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def IntakeTemperature
  "Signal.OBD.IntakeTemp : PID 0F - Intake temperature"
  {:db/ident        :auto-vs/IntakeTemperature,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Intake Temperature"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Intake-AirTemperatureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.OBD.IntakeTemp : PID 0F - Intake temperature"}})

(def IsAirConditioningActive
  "Signal.Cabin.HVAC.IsAirConditioningActive : Is Air conditioning active."
  {:db/ident :auto-vs/IsAirConditioningActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsAirConditioningActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/AirConditioningSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/AirConditioningSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.HVAC.IsAirConditioningActive : Is Air conditioning active."}})

(def IsBackUpLightOn
  "is backup light on"
  {:db/ident        :auto-vs/IsBackUpLightOn,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "is backup light on"},
   :rdfs/subClassOf :auto-vs/ActuableSignal})

(def IsBackupLightOn
  "Signal.Body.Lights.IsBackupOn : Is backup (reverse) light on"
  {:db/ident :auto-vs/IsBackupLightOn,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsBackupOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/BackupLightSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/BackupLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Signal.Body.Lights.IsBackupOn : Is backup (reverse) light on"}})

(def IsBelted
  "Signal.Cabin.Seat.RowX.PosY.IsBelted : Is the belt engaged."
  {:db/ident :auto-vs/IsBelted,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsBelted"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/BeltSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Signal.Cabin.Seat.RowX.PosY.IsBelted : Is the belt engaged."}})

(def IsBrakeLightOn
  "Signal.Body.Lights.IsBrakeOn : Is brake light on"
  {:db/ident        :auto-vs/IsBrakeLightOn,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "IsBrakeOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/BrakeLightSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/BrakeLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.Body.Lights.IsBrakeOn : Is brake light on"}})

(def IsChildLockActive
  "Signal.Cabin.Door.RowX.Left/Right.IsChildLockActive : Is door child lock engaged. True = Engaged. False = Disengaged."
  {:db/ident :auto-vs/IsChildLockActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsChildLockActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ChildLock,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/ChildLock,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Door.RowX.Left/Right.IsChildLockActive : Is door child lock engaged. True = Engaged. False = Disengaged."}})

(def IsDomeLightOn
  "Signal.Cabin.Lights.IsDomeOn : Is central dome light light on"
  {:db/ident :auto-vs/IsDomeLightOn,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsDomeOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DomeLight,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/DomeLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Lights.IsDomeOn : Is central dome light light on"}})

(def IsFrontDefrosterActive
  "Signal.Cabin.HVAC.IsFrontDefrosterActive : Is front defroster active."
  {:db/ident :auto-vs/IsFrontDefrosterActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsFrontDefrosterActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Defroster,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/Defroster,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.HVAC.IsFrontDefrosterActive : Is front defroster active."}})

(def IsFrontFogLightOn
  "Signal.Body.Lights.IsFrontFogOn : Is front fog light on"
  {:db/ident :auto-vs/IsFrontFogLightOn,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsFrontFogOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FrontFogLightSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/FrontFogLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Signal.Body.Lights.IsFrontFogOn : Is front fog light on"}})

(def IsGloveBoxLightOn
  "Signal.Cabin.Lights.IsGloveBoxOn : Is glove box light on"
  {:db/ident :auto-vs/IsGloveBoxLightOn,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsGloveBoxOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/GloveBoxLight,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/GloveBoxLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Signal.Cabin.Lights.IsGloveBoxOn : Is glove box light on"}})

(def IsHazardLightOn
  "Signal.Body.Lights.IsHazardOn : Are hazards on"
  {:db/ident        :auto-vs/IsHazardLightOn,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "IsHazardOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/HazardLightSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/HazardLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.Body.Lights.IsHazardOn : Are hazards on"}})

(def IsHighBeamOn
  "Signal.Body.Lights.IsHighBeamOn : Is high beam on"
  {:db/ident        :auto-vs/IsHighBeamOn,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "IsHighBeamOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/HighBeamLightSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/HighBeamLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.Body.Lights.IsHighBeamOn : Is high beam on"}})

(def IsLeftIndicatorOn
  "Signal.Body.Lights.IsLeftIndicatorOn : Is left indicator flashing"
  {:db/ident :auto-vs/IsLeftIndicatorOn,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsLeftIndicatorOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LeftIndicatorSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/LeftIndicatorLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Lights.IsLeftIndicatorOn : Is left indicator flashing"}})

(def IsLowBeamOn
  "Signal.Body.Lights.IsLowBeamOn : Is low beam on"
  {:db/ident        :auto-vs/IsLowBeamOn,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "IsLowBeamOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LowBeamLightSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/LowBeamLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.Body.Lights.IsLowBeamOn : Is low beam on"}})

(def IsParkingLightOn
  "Signal.Body.Lights.IsParkingOn : Is parking light on"
  {:db/ident        :auto-vs/IsParkingLightOn,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "IsParkingOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ParkingLightSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/ParkingLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.Body.Lights.IsParkingOn : Is parking light on"}})

(def IsPassengerLightOn
  "Signal.Cabin.Lights.RowX.Left/Right.IsPassengerOn : Is passenger light on"
  {:db/ident :auto-vs/IsPassengerLightOn,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsPassengerOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/PassengerLight,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/PassengerLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Lights.RowX.Left/Right.IsPassengerOn : Is passenger light on"}})

(def IsRearDefrosterActive
  "Signal.Cabin.HVAC.IsRearDefrosterActive : Is rear defroster active."
  {:db/ident :auto-vs/IsRearDefrosterActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsRearDefrosterActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Defroster,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/Defroster,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.HVAC.IsRearDefrosterActive : Is rear defroster active."}})

(def IsRearFogLightOn
  "Signal.Body.Lights.IsRearFogOn : Is rear fog light on"
  {:db/ident        :auto-vs/IsRearFogLightOn,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "IsRearFogOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RearFogLightSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/RearFogLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.Body.Lights.IsRearFogOn : Is rear fog light on"}})

(def IsRecirculationActive
  "Signal.Cabin.HVAC.IsRecirculationActive : Is recirculation active."
  {:db/ident :auto-vs/IsRecirculationActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsRecirculationActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RecirculationSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/RecirculationSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.HVAC.IsRecirculationActive : Is recirculation active."}})

(def IsRightIndicatorOn
  "Signal.Body.Lights.IsRightIndicatorOn : Is right indicator flashing"
  {:db/ident :auto-vs/IsRightIndicatorOn,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsRightIndicatorOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RightIndicatorSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/RightIndicatorLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Lights.IsRightIndicatorOn : Is right indicator flashing"}})

(def IsRunningLightOn
  "Signal.Body.Lights.IsRunningOn : Are running lights on"
  {:db/ident        :auto-vs/IsRunningLightOn,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "IsRunningOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RunningLightSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/RunningLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.Body.Lights.IsRunningOn : Are running lights on"}})

(def IsSharedLightOn
  "Signal.Cabin.Lights.RowX.IsSharedOn : Is light shared across first row on"
  {:db/ident :auto-vs/IsSharedLightOn,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsSharedOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LightSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Lights.RowX.IsSharedOn : Is light shared across first row on"}})

(def IsTrunkLightOn
  "Signal.Cabin.Lights.IsTrunkOn : Is trunk light light on"
  {:db/ident :auto-vs/IsTrunkLightOn,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsTrunkOn"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/TrunkLight,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/TrunkLight,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Signal.Cabin.Lights.IsTrunkOn : Is trunk light light on"}})

(def LaneDepartureDetectionError
  "Signal.ADAS.LaneDepartureDetection.Error : Indicates if lane departure system incurred an error condition. True = Error. False = No Error."
  {:db/ident :auto-vs/LaneDepartureDetectionError,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Error"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LaneDepartureDetectionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.LaneDepartureDetection.Error : Indicates if lane departure system incurred an error condition. True = Error. False = No Error."}})

(def LaneDepartureDetectionIsActive
  "Signal.ADAS.LaneDepartureDetection.IsActive : Indicates if lane departure detection system is enabled. True = Enabled. False = Disabled."
  {:db/ident :auto-vs/LaneDepartureDetectionIsActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LaneDepartureDetectionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/LaneDepartureDetectionSensor,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.LaneDepartureDetection.IsActive : Indicates if lane departure detection system is enabled. True = Enabled. False = Disabled."}})

(def LaneDepartureDetectionSensor
  "Sensor measuring when a lane is crossed"
  {:db/ident        :auto-vs/LaneDepartureDetectionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Lane departure detection sensor"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring when a lane is crossed"}})

(def LaneDepartureDetectionWarning
  "Signal.ADAS.LaneDepartureDetection.Warning : Indicates if lane departure detection registered a lane departure"
  {:db/ident :auto-vs/LaneDepartureDetectionWarning,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Warning"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LaneDepartureDetectionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.LaneDepartureDetection.Warning : Indicates if lane departure detection registered a lane departure"}})

(def LateralAcceleration
  "Signal.Vehicle.Acceleration.Lateral : Vehicle acceleration in Y (lateral acceleration)."
  {:db/ident :auto-vs/LateralAcceleration,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lateral"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Accelerometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LinearAccelerationUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.Acceleration.Lateral : Vehicle acceleration in Y (lateral acceleration)."}})

(def Latitude
  "Signal.Cabin.Infotainment.Navigation.CurrentLocation.Latitude : Current latitude of vehicle, as reported by GPS."
  {:db/ident :auto-vs/Latitude,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Latitude"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/GPS,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngleUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Navigation.CurrentLocation.Latitude : Current latitude of vehicle, as reported by GPS."}})

(def LeftIndicator
  "Turns on and off the left indicator"
  {:db/ident        :auto-vs/LeftIndicator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Left indicator light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the left indicator"}})

(def LeftIndicatorLight
  "left indicator light"
  {:db/ident        :auto-vs/LeftIndicatorLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "left indicator light"},
   :rdfs/subClassOf :auto-vs/ActuableSignal})

(def LeftIndicatorSwitch
  "Senses if the left indicator switch is on"
  {:db/ident        :auto-vs/LeftIndicatorSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Left indicator switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Senses if the left indicator switch is on"}})

(def Lidar
  "lidar"
  {:db/ident        :auto-vs/Lidar,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "lidar"},
   :rdfs/subClassOf :sosa/Sensor})

(def LightIntensity
  "Signal.Cabin.Lights.LightIntensity : Intensity of the interior lights. 0 = Off. 100 = Full brightness."
  {:db/ident :auto-vs/LightIntensity,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LightIntensity"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LightSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Lights.LightIntensity : Intensity of the interior lights. 0 = Off. 100 = Full brightness."}})

(def LightSensor
  "Sensor measuring the light intensity"
  {:db/ident        :auto-vs/LightSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Light sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the light intensity"}})

(def LocalTemperature
  "Signal.Cabin.HVAC.RowX.Left/Right.Temperature : Temperature"
  {:db/ident :auto-vs/LocalTemperature,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Temperature"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Thermometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/TemperatureSwitch,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Signal.Cabin.HVAC.RowX.Left/Right.Temperature : Temperature"}})

(def LongTermFuelTrim
  "Signal.OBD.LongTermFuelTrim1 : PID 07/09 - Long Term (learned) Fuel Trim - Bank 1 - negative percent leaner, positive percent richer"
  {:db/ident :auto-vs/LongTermFuelTrim,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LongTermFuelTrim1"},
   :rdfs/subClassOf [{:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.LongTermFuelTrim1 : PID 07/09 - Long Term (learned) Fuel Trim - Bank 1 - negative percent leaner, positive percent richer"}})

(def LongTermO2Trim
  "Signal.OBD.LongTermO2Trim : PID 56/58 - Long term secondary O2 trim"
  {:db/ident :auto-vs/LongTermO2Trim,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LongTermO2Trim"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.LongTermO2Trim : PID 56/58 - Long term secondary O2 trim"}})

(def Longitude
  "Signal.Cabin.Infotainment.Navigation.CurrentLocation.Longitude : Current longitude of vehicle, as reported by GPS."
  {:db/ident :auto-vs/Longitude,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Longitude"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/GPS,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngleUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Navigation.CurrentLocation.Longitude : Current longitude of vehicle, as reported by GPS."}})

(def LongitudinalAcceleration
  "Signal.Vehicle.Acceleration.Longitudinal : Vehicle acceleration in X (longitudinal acceleration)."
  {:db/ident :auto-vs/LongitudinalAcceleration,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Longitudinal"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Accelerometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LinearAccelerationUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.Acceleration.Longitudinal : Vehicle acceleration in X (longitudinal acceleration)."}})

(def LowBeamLight
  "Turns on and off the low beam light"
  {:db/ident        :auto-vs/LowBeamLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Low beam light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the low beam light"}})

(def LowBeamLightSwitch
  "Senses if the low beam light switch is on"
  {:db/ident        :auto-vs/LowBeamLightSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Low Beam Light Switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Senses if the low beam light switch is on"}})

(def LumbarDeflate
  "Signal.Cabin.Seat.RowX.PosY.Switch.Lumbar.Deflate : Lumbar deflation switch engaged"
  {:db/ident :auto-vs/LumbarDeflate,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Deflate"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LumbarPressureActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Lumbar.Deflate : Lumbar deflation switch engaged"}})

(def LumbarDown
  "Signal.Cabin.Seat.RowX.PosY.Switch.Down : Seat down switch engaged"
  {:db/ident :auto-vs/LumbarDown,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Down"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Down : Seat down switch engaged"}})

(def LumbarHeight
  "Signal.Cabin.Seat.RowX.PosY.Lumbar.Height : Lumbar support position. 0 = Lowermost. 100 = Uppermost."
  {:db/ident :auto-vs/LumbarHeight,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Height"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LumbarPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Lumbar.Height : Lumbar support position. 0 = Lowermost. 100 = Uppermost."}})

(def LumbarInflate
  "Signal.Cabin.Seat.RowX.PosY.Switch.Lumbar.Inflate : Lumbar inflation switch engaged"
  {:db/ident :auto-vs/LumbarInflate,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inflate"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LumbarPressureActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Lumbar.Inflate : Lumbar inflation switch engaged"}})

(def LumbarInflation
  "Signal.Cabin.Seat.RowX.PosY.Lumbar.Inflation : Lumbar support inflation. 0 = Fully deflated. 100 = Fully inflated."
  {:db/ident :auto-vs/LumbarInflation,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inflation"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LumbarPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Lumbar.Inflation : Lumbar support inflation. 0 = Fully deflated. 100 = Fully inflated."}})

(def LumbarPositionActuator
  "Controls the lumbar position"
  {:db/ident        :auto-vs/LumbarPositionActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Lumbar position actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls the lumbar position"}})

(def LumbarPositionSensor
  "Sensor measuring the lumbar position"
  {:db/ident        :auto-vs/LumbarPositionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Lumbar position sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the lumbar position"}})

(def LumbarPressureActuator
  "Controls the lumbar pressure"
  {:db/ident        :auto-vs/LumbarPressureActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Lumber pressure actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls the lumbar pressure"}})

(def LumbarPressureSensor
  "lumbar pressure sensor"
  {:db/ident        :auto-vs/LumbarPressureSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "lumbar pressure sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def LumbarUp
  "Signal.Cabin.Seat.RowX.PosY.Switch.Lumbar.Up : Lumbar up switch engaged"
  {:db/ident :auto-vs/LumbarUp,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Up"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LumbarPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Lumbar.Up : Lumbar up switch engaged"}})

(def MAF
  "Signal.Drivetrain.InternalCombustionEngine.Engine.MAF / Signal.OBD.MAF / PID 10 : Grams of air drawn into engine per second."
  {:db/ident :auto-vs/MAF,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MAF"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MassAirFlowSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/MassPerTimeUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.InternalCombustionEngine.Engine.MAF / Signal.OBD.MAF / PID 10 : Grams of air drawn into engine per second."}})

(def MAFSensor
  "MAF sensor"
  {:db/ident        :auto-vs/MAFSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "MAF sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def MAP
  "Signal.Drivetrain.InternalCombustionEngine.Engine.MAP / Signal.OBD.MAP : PID 0B : Manifold air pressure possibly boosted using forced induction."
  {:db/ident :auto-vs/MAP,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MAP"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ManifoldAirPressureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PressureOrStressUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.InternalCombustionEngine.Engine.MAP / Signal.OBD.MAP : PID 0B : Manifold air pressure possibly boosted using forced induction."}})

(def MIL
  "Signal.OBD.Status.MIL : Malfunction Indicator Light (MIL) False = Off, True = On"
  {:db/ident :auto-vs/MIL,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MIL"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.Status.MIL : Malfunction Indicator Light (MIL) False = Off, True = On"}})

(def ManifoldAirPressureSensor
  "Sensor measuring the MAP (manifold air pressure)"
  {:db/ident        :auto-vs/ManifoldAirPressureSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Manifold Air Pressure Sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sensor measuring the MAP (manifold air pressure)"}})

(def MassAirFlowSensor
  "Sensor measuring the MAF (mass air flow)"
  {:db/ident        :auto-vs/MassAirFlowSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Mass air flow sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the MAF (mass air flow)"}})

(def MassageSystem
  "Massage system for car seats"
  {:db/ident        :auto-vs/MassageSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Massage system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Massage system for car seats"}})

(def MaxMAF
  "Signal.OBD.MaxMAF : PID 50 - Maximum flow for mass air flow sensor"
  {:db/ident :auto-vs/MaxMAF,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MaxMAF"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MAFSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/MassPerTimeUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.MaxMAF : PID 50 - Maximum flow for mass air flow sensor"}})

(def MediaAction
  "Signal.Cabin.Infotainment.Media.Action : Tells if the media was"
  {:db/ident :auto-vs/MediaAction,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Action"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Media.Action : Tells if the media was"}})

(def MediaAlbum
  "Signal.Cabin.Infotainment.Media.Played.Album : Name of album being played"
  {:db/ident :auto-vs/MediaAlbum,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Album"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Media.Played.Album : Name of album being played"}})

(def MediaArtist
  "Signal.Cabin.Infotainment.Media.Played.Artist : Name of artist being played"
  {:db/ident :auto-vs/MediaArtist,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Artist"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Media.Played.Artist : Name of artist being played"}})

(def MediaSource
  "Signal.Cabin.Infotainment.Media.Played.Source : Media selected for playback"
  {:db/ident :auto-vs/MediaSource,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Source"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Media.Played.Source : Media selected for playback"}})

(def MediaTrack
  "Signal.Cabin.Infotainment.Media.Played.Track : Name of track being played"
  {:db/ident :auto-vs/MediaTrack,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Track"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Media.Played.Track : Name of track being played"}})

(def MediaURI
  "Signal.Cabin.Infotainment.Media.Played.URI : User Resource associated with the media"
  {:db/ident :auto-vs/MediaURI,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "URI"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/anyURI,
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Media.Played.URI : User Resource associated with the media"}})

(def MediaVolume
  "Signal.Cabin.Infotainment.Media.Volume : Current Media Volume"
  {:db/ident :auto-vs/MediaVolume,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Volume"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Media.Volume : Current Media Volume"}})

(def MirrorHeatingStatus
  "Signal.Body.Mirrors.Left/Right.Heating.Status : Mirror Heater on or off. True = Heater On. False = Heater Off."
  {:db/ident :auto-vs/MirrorHeatingStatus,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Status"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Mirrorheater,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/Mirrorheater,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Mirrors.Left/Right.Heating.Status : Mirror Heater on or off. True = Heater On. False = Heater Off."}})

(def MirrorPan
  "Signal.Body.Mirrors.Left/Right.Pan : Mirror pan as a percent. 0 = Center Position. 100 = Fully Left Position. -100 = Fully Right Position."
  {:db/ident :auto-vs/MirrorPan,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pan"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MirrorPanSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/MirrorPanActuator,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Mirrors.Left/Right.Pan : Mirror pan as a percent. 0 = Center Position. 100 = Fully Left Position. -100 = Fully Right Position."}})

(def MirrorPanActuator
  "Controls a mirro pan"
  {:db/ident        :auto-vs/MirrorPanActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Mirror pan actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls a mirro pan"}})

(def MirrorPanSensor
  "Sensor measuring the pan of a mirror"
  {:db/ident        :auto-vs/MirrorPanSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Mirror Pan Sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the pan of a mirror"}})

(def MirrorTilt
  "Signal.Body.Mirrors.Left/Right.Tilt : Mirror tilt as a percent. 0 = Center Position. 100 = Fully Upward Position. -100 = Fully Downward Position."
  {:db/ident :auto-vs/MirrorTilt,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tilt"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MirrorTiltSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/MirrorTiltActuator,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Mirrors.Left/Right.Tilt : Mirror tilt as a percent. 0 = Center Position. 100 = Fully Upward Position. -100 = Fully Downward Position."}})

(def MirrorTiltActuator
  "Controls a mirro tilt"
  {:db/ident        :auto-vs/MirrorTiltActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Mirror tilt actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls a mirro tilt"}})

(def MirrorTiltSensor
  "Sensor measuring the tilt of a mirror"
  {:db/ident        :auto-vs/MirrorTiltSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Mirro Tilt Sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the tilt of a mirror"}})

(def Mirrorheater
  "Mirror heating appliance"
  {:db/ident        :auto-vs/Mirrorheater,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Mirror heater"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Mirror heating appliance"}})

(def MultimediaSystem
  "Multimedia system"
  {:db/ident        :auto-vs/MultimediaSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Multimedia system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Multimedia system"}})

(def O2Current
  "Signal.OBD.O2WR.Sensor1.Current : PID 34-3B - Lambda current for wide range/band oxygen sensor 1"
  {:db/ident :auto-vs/O2Current,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Current"},
   :rdfs/subClassOf [{:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/ElectricCurrentUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.O2WR.Sensor1.Current : PID 34-3B - Lambda current for wide range/band oxygen sensor 1"}})

(def O2Voltage
  "Signal.OBD.O2.BankX.SensorY.Voltage : PID 14->1B - Sensor voltage"
  {:db/ident :auto-vs/O2Voltage,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Voltage"},
   :rdfs/subClassOf [{:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/EnergyPerElectricChargeUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.O2.BankX.SensorY.Voltage : PID 14->1B - Sensor voltage"}})

(def O2WRVoltage
  "Signal.OBD.O2WR.SensorX.Voltage : PID 24->2B - Lambda voltage for wide range/band oxygen sensor X"
  {:db/ident :auto-vs/O2WRVoltage,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Voltage"},
   :rdfs/subClassOf [{:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/EnergyPerElectricChargeUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.O2WR.SensorX.Voltage : PID 24->2B - Lambda voltage for wide range/band oxygen sensor X"}})

(def ObservableSignal
  "All observable signals that can dynamically be updated by the vehicle"
  {:db/ident :auto-vs/ObservableSignal,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Observable signal"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "All observable signals that can dynamically be updated by the vehicle"}})

(def ObstacleDetectionError
  "Signal.ADAS.ObstacleDetection.Error : Indicates if obstacle sensor system incurred an error condition. True = Error. False = No Error."
  {:db/ident :auto-vs/ObstacleDetectionError,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Error"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ObstacleDetectionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.ObstacleDetection.Error : Indicates if obstacle sensor system incurred an error condition. True = Error. False = No Error."}})

(def ObstacleDetectionIsActive
  "Signal.ADAS.ObstacleDetection.IsActive : Indicates if obstacle sensor system is enabled. Tue = Enabled. False = Disabled."
  {:db/ident :auto-vs/ObstacleDetectionIsActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ObstacleDetectionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/ObstacleDetectionSensor,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.ObstacleDetection.IsActive : Indicates if obstacle sensor system is enabled. Tue = Enabled. False = Disabled."}})

(def ObstacleDetectionSensor
  "Sensor measuring the distance to obstacles"
  {:db/ident        :auto-vs/ObstacleDetectionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Obstacle detection Sensor"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Sensor measuring the distance to obstacles"}})

(def OccupantClassificationSystem
  "Sensor detecting the presence of a passenger in a seat"
  {:db/ident        :auto-vs/OccupantClassificationSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Occupant classification system"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sensor detecting the presence of a passenger in a seat"}})

(def Odometer
  "Sensor measuring the travelled distance"
  {:db/ident        :auto-vs/Odometer,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Odometer"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the travelled distance"}})

(def OilPressureSensor
  "Sensor measuring the pressure of oil in the engine"
  {:db/ident        :auto-vs/OilPressureSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Oil pressure sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sensor measuring the pressure of oil in the engine"}})

(def OilThermometer
  "Sensor measuring the oil temperature"
  {:db/ident        :auto-vs/OilThermometer,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Oil thermometer"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the oil temperature"}})

(def PadWear
  "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.PadWear : Brake pad wear as percent. 0 = No Wear. 100 = Worn."
  {:db/ident :auto-vs/PadWear,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PadWear"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/BrakePadWearSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.PadWear : Brake pad wear as percent. 0 = No Wear. 100 = Worn."}})

(def ParkingBrakeIsEngaged
  "Signal.Chassis.ParkingBrake.IsEngaged : Parking brake status. True = Parking Brake is Engaged. False = Parking Brake is not Engaged."
  {:db/ident :auto-vs/ParkingBrakeIsEngaged,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsEngaged"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ParkingBrakeSwitch,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/ParkingBrakeSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.ParkingBrake.IsEngaged : Parking brake status. True = Parking Brake is Engaged. False = Parking Brake is not Engaged."}})

(def ParkingBrakeSensor
  "Sensor measuring if the parking brake is engaged"
  {:db/ident        :auto-vs/ParkingBrakeSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Parking brake sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sensor measuring if the parking brake is engaged"}})

(def ParkingBrakeSwitch
  "Controls the parking brake"
  {:db/ident        :auto-vs/ParkingBrakeSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Parking brake switch"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls the parking brake"}})

(def ParkingLight
  "Turns on and off the parking light"
  {:db/ident        :auto-vs/ParkingLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Parking light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the parking light"}})

(def ParkingLightSwitch
  "Senses if the parking lkight switch is on"
  {:db/ident        :auto-vs/ParkingLightSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Parking light switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Senses if the parking lkight switch is on"}})

(def PassengerLight
  "Individual passenger light system"
  {:db/ident        :auto-vs/PassengerLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Passenger light"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Individual passenger light system"}})

(def PedalPositionSensor
  "Sensor measuring the pedal position"
  {:db/ident        :auto-vs/PedalPositionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Pedal position sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the pedal position"}})

(def PerformanceMode
  "Signal.Drivetrain.Transmission.PerformanceMode : Current gearbox performance mode."
  {:db/ident :auto-vs/PerformanceMode,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PerformanceMode"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DriveSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/DriveSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.Transmission.PerformanceMode : Current gearbox performance mode."}})

(def PidsA
  "Signal.OBD.PidsA : PID 00 - Bit array of the supported pids 01 to 20"
  {:db/ident :auto-vs/PidsA,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PidsA"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.PidsA : PID 00 - Bit array of the supported pids 01 to 20"}})

(def PidsB
  "Signal.OBD.PidsB : PID 20 - Bit array of the supported pids 21 to 40"
  {:db/ident :auto-vs/PidsB,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PidsB"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.PidsB : PID 20 - Bit array of the supported pids 21 to 40"}})

(def PidsC
  "Signal.OBD.PidsC : PID 40 - Bit array of the supported pids 41 to 60"
  {:db/ident :auto-vs/PidsC,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PidsC"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.PidsC : PID 40 - Bit array of the supported pids 41 to 60"}})

(def PowerMeter
  "Sensor measuring the engine power"
  {:db/ident        :auto-vs/PowerMeter,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Power meter"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the engine power"}})

(def RainIntensity
  "Signal.Body.Raindetection.Intensity : Rain intensity. 0 = Dry, No Rain. 100 = Covered."
  {:db/ident :auto-vs/RainIntensity,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Intensity"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RainSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Raindetection.Intensity : Rain intensity. 0 = Dry, No Rain. 100 = Covered."}})

(def RainSensor
  "Sensor measuring the rain intensity"
  {:db/ident        :auto-vs/RainSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Rain sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the rain intensity"}})

(def ReachableRange
  "Signal.Drivetrain.FuelSystem.Range : Range in meters."
  {:db/ident        :auto-vs/ReachableRange,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Range"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FuelTankLevelSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LengthUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.Drivetrain.FuelSystem.Range : Range in meters."}})

(def RearFogLight
  "Turns on and off the rear fog light"
  {:db/ident        :auto-vs/RearFogLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Rear fog light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the rear fog light"}})

(def RearFogLightSwitch
  "Senses if the rear fog light switch is on"
  {:db/ident        :auto-vs/RearFogLightSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Rear for light switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Senses if the rear fog light switch is on"}})

(def RearShadeActuator
  "Controls a window blind"
  {:db/ident        :auto-vs/RearShadeActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Rear shade actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls a window blind"}})

(def RearShadePosition
  "Signal.Cabin.RearShade.Position : Position of side window blind. 0 = Fully retracted. 100 = Fully deployed."
  {:db/ident :auto-vs/RearShadePosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Position"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RearShadeActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.RearShade.Position : Position of side window blind. 0 = Fully retracted. 100 = Fully deployed."}})

(def RearShadeSwitch
  "Signal.Cabin.RearShade.Switch : Switch controlling sliding action such as window, sunroof, or blind."
  {:db/ident :auto-vs/RearShadeSwitch,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Switch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RearShadeSystem,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.RearShade.Switch : Switch controlling sliding action such as window, sunroof, or blind."}})

(def RearShadeSystem
  "Controls sliding actions"
  {:db/ident        :auto-vs/RearShadeSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Rear shade system"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls sliding actions"}})

(def RearviewMirrorDimmingLevel
  "Signal.Cabin.RearviewMirror.DimmingLevel : Dimming level of rearview mirror. 0 = undimmed. 100 = fully dimmed"
  {:db/ident :auto-vs/RearviewMirrorDimmingLevel,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DimmingLevel"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DimmingSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/DimmingSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.RearviewMirror.DimmingLevel : Dimming level of rearview mirror. 0 = undimmed. 100 = fully dimmed"}})

(def RecirculationSystem
  "Recirculation system"
  {:db/ident        :auto-vs/RecirculationSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Recirculation system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Recirculation system"}})

(def ReclineBackward
  "Signal.Cabin.Seat.RowX.PosY.Switch.Recline.Backward : Seatback recline backward switch engaged"
  {:db/ident :auto-vs/ReclineBackward,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Backward"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Recline.Backward : Seatback recline backward switch engaged"}})

(def ReclineForward
  "Signal.Cabin.Seat.RowX.PosY.Switch.Recline.Forward : Seatback recline forward switch engaged"
  {:db/ident :auto-vs/ReclineForward,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Forward"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Recline.Forward : Seatback recline forward switch engaged"}})

(def RelativeAcceleratorPosition
  "Signal.OBD.RelativeAcceleratorPosition : PID 5A - Relative accelerator pedal position"
  {:db/ident :auto-vs/RelativeAcceleratorPosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RelativeAcceleratorPosition"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/PedalPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.RelativeAcceleratorPosition : PID 5A - Relative accelerator pedal position"}})

(def RelativeThrottlePosition
  "Signal.OBD.RelativeThrottlePosition : PID 45 - Relative throttle position"
  {:db/ident :auto-vs/RelativeThrottlePosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RelativeThrottlePosition"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ThrottlePositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.RelativeThrottlePosition : PID 45 - Relative throttle position"}})

(def RightIndicator
  "Turns on and off the right indicator"
  {:db/ident        :auto-vs/RightIndicator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Right indicator light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the right indicator"}})

(def RightIndicatorLight
  "right indicator light"
  {:db/ident        :auto-vs/RightIndicatorLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "right indicator light"},
   :rdfs/subClassOf :auto-vs/ActuableSignal})

(def RightIndicatorSwitch
  "Senses if the right indicator switch is on"
  {:db/ident        :auto-vs/RightIndicatorSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Right indicator switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Senses if the right indicator switch is on"}})

(def RotationSpeed
  "Signal.Drivetrain.InternalCombustionEngine.Engine.Speed / Signal.OBD.EngineSpeed : PID 0C : Engine speed measured as rotations per minute."
  {:db/ident :auto-vs/RotationSpeed,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Speed"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RotationalSpeedSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngularVelocityUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.InternalCombustionEngine.Engine.Speed / Signal.OBD.EngineSpeed : PID 0C : Engine speed measured as rotations per minute."}})

(def RotationalSpeedSensor
  "Sensor measuring the rotational speed"
  {:db/ident        :auto-vs/RotationalSpeedSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Rotational speed sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the rotational speed"}})

(def RunTime
  "Signal.OBD.RunTime : PID 1F - Engine run time"
  {:db/ident        :auto-vs/RunTime,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "RunTime"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Timer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom "http://qudt.org/schema/qudt/TimeUnit",
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.OBD.RunTime : PID 1F - Engine run time"}})

(def RunTimeMIL
  "Signal.OBD.RunTimeMIL : PID 4D - Run time with MIL on"
  {:db/ident        :auto-vs/RunTimeMIL,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "RunTimeMIL"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Timer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom "http://qudt.org/schema/qudt/TimeUnit",
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Signal.OBD.RunTimeMIL : PID 4D - Run time with MIL on"}})

(def RunningLight
  "Turns on and off the running light"
  {:db/ident        :auto-vs/RunningLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Running light"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Turns on and off the running light"}})

(def RunningLightSwitch
  "Senses if the running light switch is on"
  {:db/ident        :auto-vs/RunningLightSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Running light switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Senses if the running light switch is on"}})

(def SeatBackward
  "Signal.Cabin.Seat.RowX.PosY.Switch.Backward : Seat forward switch engaged"
  {:db/ident :auto-vs/SeatBackward,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Backward"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Backward : Seat forward switch engaged"}})

(def SeatCooler
  "Controls the seat cooler and heater"
  {:db/ident        :auto-vs/SeatCooler,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Seat cooler"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls the seat cooler and heater"}})

(def SeatCooling
  "Signal.Cabin.Seat.RowX.PosY.Switch.Cooler : Cooler switch for Seat heater"
  {:db/ident :auto-vs/SeatCooling,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cooler"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatCooler,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Cooler : Cooler switch for Seat heater"}})

(def SeatDown
  "Signal.Cabin.Seat.RowX.PosY.Switch.Lumbar.Down : Lumbar down switch engaged"
  {:db/ident :auto-vs/SeatDown,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Down"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LumbarPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Lumbar.Down : Lumbar down switch engaged"}})

(def SeatForward
  "Signal.Cabin.Seat.RowX.PosY.Switch.Forward : Seat forward switch engaged"
  {:db/ident :auto-vs/SeatForward,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Forward"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Forward : Seat forward switch engaged"}})

(def SeatHasPassenger
  "Signal.Cabin.Seat.RowX.PosY.HasPassenger : Does the seat have a passenger in it."
  {:db/ident :auto-vs/SeatHasPassenger,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "HasPassenger"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/OccupantClassificationSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.HasPassenger : Does the seat have a passenger in it."}})

(def SeatHeater
  "Sensor measuring the"
  {:db/ident        :auto-vs/SeatHeater,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "seat heater"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the"}})

(def SeatHeating
  "Signal.Cabin.Seat.RowX.PosY.Heating : Seat cooling / heating. 0 = off. -100 = max cold. +100 = max heat"
  {:db/ident :auto-vs/SeatHeating,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Heating"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatHeater,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Heating : Seat cooling / heating. 0 = off. -100 = max cold. +100 = max heat"}})

(def SeatMassage
  "Signal.Cabin.Seat.RowX.PosY.Massage : Seat massage level. 0 = off. 100 = max massage."
  {:db/ident :auto-vs/SeatMassage,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Massage"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MassageSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Massage : Seat massage level. 0 = off. 100 = max massage."}})

(def SeatPosition
  "Signal.Cabin.Seat.RowX.PosY.Position : Seat horizontal position. 0 = Frontmost. 100 = Rearmost"
  {:db/ident :auto-vs/SeatPosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Position"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Position : Seat horizontal position. 0 = Frontmost. 100 = Rearmost"}})

(def SeatPositionActuator
  "Controls the seat position"
  {:db/ident        :auto-vs/SeatPositionActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Seat position actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls the seat position"}})

(def SeatPositionSensor
  "Sensor measuring the position of the seat"
  {:db/ident        :auto-vs/SeatPositionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Seat position sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Sensor measuring the position of the seat"}})

(def SeatRecline
  "Signal.Cabin.Seat.RowX.PosY.Recline : Recline level. -90 = Max forward recline. 90 max backward recline"
  {:db/ident :auto-vs/SeatRecline,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Recline"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngleUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Recline : Recline level. -90 = Max forward recline. 90 max backward recline"}})

(def SeatUp
  "Signal.Cabin.Seat.RowX.PosY.Switch.Up : Seat up switch engaged"
  {:db/ident :auto-vs/SeatUp,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Up"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Up : Seat up switch engaged"}})

(def SeatWarming
  "Signal.Cabin.Seat.RowX.PosY.Switch.Warmer : Warmer switch for Seat heater"
  {:db/ident :auto-vs/SeatWarming,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Warmer"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SeatHeater,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.Switch.Warmer : Warmer switch for Seat heater"}})

(def SelectedMediaURI
  "Signal.Cabin.Infotainment.Media.SelectedURI : URI of suggested media that was selected"
  {:db/ident :auto-vs/SelectedMediaURI,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SelectedURI"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/MultimediaSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/anyURI,
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Infotainment.Media.SelectedURI : URI of suggested media that was selected"}})

(def ShortTermFuelTrim
  "Signal.OBD.ShortTermFuelTrim1 : PID 06/08 - Short Term (immediate) Fuel Trim - Bank 1 - negative percent leaner, positive percent richer"
  {:db/ident :auto-vs/ShortTermFuelTrim,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ShortTermFuelTrim1"},
   :rdfs/subClassOf [{:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.ShortTermFuelTrim1 : PID 06/08 - Short Term (immediate) Fuel Trim - Bank 1 - negative percent leaner, positive percent richer"}})

(def ShortTermO2Trim
  "Signal.OBD.ShortTermO2Trim : PID 55/57 - Short term secondary O2 trim"
  {:db/ident :auto-vs/ShortTermO2Trim,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ShortTermO2Trim"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.ShortTermO2Trim : PID 55/57 - Short term secondary O2 trim"}})

(def SideBolsterInflation
  "Signal.Cabin.Seat.RowX.PosY.SideBolster.Inflation : Lumbar support inflation. 0 = Fully deflated. 100 = Fully inflated."
  {:db/ident :auto-vs/SideBolsterInflation,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inflation"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/LumbarPressureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Seat.RowX.PosY.SideBolster.Inflation : Lumbar support inflation. 0 = Fully deflated. 100 = Fully inflated."}})

(def Sonar
  "sonar"
  {:db/ident        :auto-vs/Sonar,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "sonar"},
   :rdfs/subClassOf :sosa/Sensor})

(def SpeedSet
  "Signal.ADAS.CruiseControl.SpeedSet : Set cruise control speed in kilometers per hour"
  {:db/ident :auto-vs/SpeedSet,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SpeedSet"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/CruiseControlSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/CruiseControlSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LinearVelocityUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.CruiseControl.SpeedSet : Set cruise control speed in kilometers per hour"}})

(def Speedometer
  "Sensor measuring the speed, in a gearbox"
  {:db/ident        :auto-vs/Speedometer,
   :rdf/type        [:owl/Class :owl/NamedIndividual],
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Speedometer"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the speed, in a gearbox"}})

(def SteeringWheelAngle
  "Signal.Chassis.SteeringWheel.Angle : Steering wheel angle. Positive = degrees to the left. Negative = degrees to the right."
  {:db/ident :auto-vs/SteeringWheelAngle,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Angle"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SteeringWheelAngleSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngleUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.SteeringWheel.Angle : Steering wheel angle. Positive = degrees to the left. Negative = degrees to the right."}})

(def SteeringWheelAngleSensor
  "Sensor measuring the angle of the steering wheel"
  {:db/ident        :auto-vs/SteeringWheelAngleSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Steering wheel angle sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sensor measuring the angle of the steering wheel"}})

(def SteeringWheelExtension
  "Signal.Chassis.SteeringWheel.Extension : Steering wheel column extension from dashboard. 0 = Closest to dashboard. 100 = Furthest from dashboard."
  {:db/ident :auto-vs/SteeringWheelExtension,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extension"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SteeringWheelPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/SteeringWheelPositionActuator,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.SteeringWheel.Extension : Steering wheel column extension from dashboard. 0 = Closest to dashboard. 100 = Furthest from dashboard."}})

(def SteeringWheelPositionActuator
  "Controls the steering wheel position"
  {:db/ident        :auto-vs/SteeringWheelPositionActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Steering wheel position actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls the steering wheel position"}})

(def SteeringWheelPositionSensor
  "Sensor measuring the position of a steering wheel"
  {:db/ident        :auto-vs/SteeringWheelPositionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Steering wheel position sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sensor measuring the position of a steering wheel"}})

(def SteeringWheelTilt
  "Signal.Chassis.SteeringWheel.Tilt : Steering wheel column tilt. 0 = Lowest position. 100 = Highest position."
  {:db/ident :auto-vs/SteeringWheelTilt,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tilt"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SteeringWheelPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/SteeringWheelPositionActuator,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.SteeringWheel.Tilt : Steering wheel column tilt. 0 = Lowest position. 100 = Highest position."}})

(def SunRoofShadePosition
  "Signal.Cabin.Sunroof.Shade.Position : Position of side window blind. 0 = Fully retracted. 100 = Fully deployed."
  {:db/ident :auto-vs/SunRoofShadePosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Position"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RearShadeActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Sunroof.Shade.Position : Position of side window blind. 0 = Fully retracted. 100 = Fully deployed."}})

(def SunRoofShadeSwitch
  "Signal.Cabin.Sunroof.Shade.Switch : Switch controlling sliding action such as window, sunroof, or blind."
  {:db/ident :auto-vs/SunRoofShadeSwitch,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Switch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RearShadeSystem,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Sunroof.Shade.Switch : Switch controlling sliding action such as window, sunroof, or blind."}})

(def SunroofPosition
  "Signal.Cabin.Sunroof.Position : Sunroof position. 0 = Fully closed 100 = Fully opened. -100 = Fully tilted"
  {:db/ident :auto-vs/SunroofPosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Position"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SunroofPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Sunroof.Position : Sunroof position. 0 = Fully closed 100 = Fully opened. -100 = Fully tilted"}})

(def SunroofPositionActuator
  "Controls the sunroof slide"
  {:db/ident        :auto-vs/SunroofPositionActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Sunroof position actuator"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls the sunroof slide"}})

(def SunroofPositionSensor
  "Sensor measuring the position of the sunroof"
  {:db/ident        :auto-vs/SunroofPositionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Sunroof position sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sensor measuring the position of the sunroof"}})

(def SunroofSwitch
  "Signal.Cabin.Sunroof.Switch : Switch controlling sliding action such as window, sunroof, or shade."
  {:db/ident :auto-vs/SunroofSwitch,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Switch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/SunroofPositionActuator,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Sunroof.Switch : Switch controlling sliding action such as window, sunroof, or shade."}})

(def TCSError
  "Signal.ADAS.TCS.Error : Indicates if TCS incurred an error condition. True = Error. False = No Error."
  {:db/ident :auto-vs/TCSError,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Error"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/TractionControlSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.TCS.Error : Indicates if TCS incurred an error condition. True = Error. False = No Error."}})

(def TCSIsActive
  "Signal.ADAS.TCS.IsActive : Indicates if TCS is enabled. Tue = Enabled. False = Disabled."
  {:db/ident :auto-vs/TCSIsActive,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsActive"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/TractionControlSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/TractionControlSystem,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.TCS.IsActive : Indicates if TCS is enabled. Tue = Enabled. False = Disabled."}})

(def TCSIsEngaged
  "Signal.ADAS.TCS.IsEngaged : Indicates if TCS is currently regulating traction. True = Engaged. False = Not Engaged."
  {:db/ident :auto-vs/TCSIsEngaged,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsEngaged"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/TractionControlSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.ADAS.TCS.IsEngaged : Indicates if TCS is currently regulating traction. True = Engaged. False = Not Engaged."}})

(def TPS
  "Signal.Drivetrain.InternalCombustionEngine.Engine.TPS : Current throttle position."
  {:db/ident :auto-vs/TPS,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TPS"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ThrottlePositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.InternalCombustionEngine.Engine.TPS : Current throttle position."}})

(def TankLevel
  "Signal.Drivetrain.FuelSystem.Level / Signal.OBD.FuelLevel / PID 2F: Level in fuel tank as percent of capacity. 0 = empty. 100 = full."
  {:db/ident :auto-vs/TankLevel,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Level"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/FuelTankLevelSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.FuelSystem.Level / Signal.OBD.FuelLevel / PID 2F: Level in fuel tank as percent of capacity. 0 = empty. 100 = full."}})

(def TemperatureSwitch
  "Controls the local temperature in HVAC systems"
  {:db/ident        :auto-vs/TemperatureSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Temperature switch"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Controls the local temperature in HVAC systems"}})

(def Thermometer
  "Sensor measuring the temperature"
  {:db/ident        :auto-vs/Thermometer,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Thermometer"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the temperature"}})

(def ThrottleActuation
  "Signal.OBD.ThrottleActuator : PID 4C - Commanded throttle actuator"
  {:db/ident :auto-vs/ThrottleActuation,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ThrottleActuator"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ThrottlePositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/ThrottleActuator,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.ThrottleActuator : PID 4C - Commanded throttle actuator"}})

(def ThrottleActuator
  "throttle actuator"
  {:db/ident        :auto-vs/ThrottleActuator,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "throttle actuator"},
   :rdfs/subClassOf :sosa/Actuator})

(def ThrottlePosition
  "Signal.OBD.ThrottlePosition : PID 11 - Throttle position - 0 = closed throttle, 100 = open throttle"
  {:db/ident :auto-vs/ThrottlePosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ThrottlePosition"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ThrottlePositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.ThrottlePosition : PID 11 - Throttle position - 0 = closed throttle, 100 = open throttle"}})

(def ThrottlePositionB-C
  "Signal.OBD.ThrottlePositionB/C : PID 47/48 - Absolute throttle position B/C"
  {:db/ident :auto-vs/ThrottlePositionB-C,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ThrottlePositionB"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/ThrottlePositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.ThrottlePositionB/C : PID 47/48 - Absolute throttle position B/C"}})

(def ThrottlePositionSensor
  "Sensor measuring the trottle position"
  {:db/ident        :auto-vs/ThrottlePositionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Throttle position"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the trottle position"}})

(def TimeSinceDTCCleared
  "Signal.OBD.TimeSinceDTCCleared : PID 4E - Time since trouble codes cleared"
  {:db/ident :auto-vs/TimeSinceDTCCleared,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TimeSinceDTCCleared"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Timer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom "http://qudt.org/schema/qudt/TimeUnit",
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.TimeSinceDTCCleared : PID 4E - Time since trouble codes cleared"}})

(def TimeSinceStart
  "Signal.Drivetrain.FuelSystem.TimeSinceStart : Time elapsed since start in seconds."
  {:db/ident :auto-vs/TimeSinceStart,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TimeSinceStart"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Timer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom "http://qudt.org/schema/qudt/TimeUnit",
                      :owl/onProperty    "http://qudt.org/schema/qudt/unit",
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.FuelSystem.TimeSinceStart : Time elapsed since start in seconds."}})

(def Timer
  "Sensor measuring the elapsed time"
  {:db/ident        :auto-vs/Timer,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Timer"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the elapsed time"}})

(def TimingAdvance
  "Signal.OBD.TimingAdvance : PID 0E - Time advance (angle)"
  {:db/ident :auto-vs/TimingAdvance,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TimingAdvance"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngleUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Signal.OBD.TimingAdvance : PID 0E - Time advance (angle)"}})

(def TirePressure
  "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Tire.Pressure : Tire pressure in kilo-Pascal"
  {:db/ident :auto-vs/TirePressure,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pressure"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/TirePressureMonitoringSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/PressureOrStressUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Tire.Pressure : Tire pressure in kilo-Pascal"}})

(def TirePressureLow
  "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Tire.PressureLow : Tire Pressure Status. True = Low tire pressure. False = Good tire pressure."
  {:db/ident :auto-vs/TirePressureLow,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PressureLow"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/TirePressureMonitoringSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Tire.PressureLow : Tire Pressure Status. True = Low tire pressure. False = Good tire pressure."}})

(def TirePressureMonitoringSystem
  "Sensor measuring the pressure of a tire"
  {:db/ident        :auto-vs/TirePressureMonitoringSystem,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Tire pressure monitoring system"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the pressure of a tire"}})

(def TireTemperature
  "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Tire.Temperature : Tire temperature in Celsius."
  {:db/ident :auto-vs/TireTemperature,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Temperature"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/TireTemperatureSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/TemperatureUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Chassis.Axle.RowX.Wheel.Left/Right.Tire.Temperature : Tire temperature in Celsius."}})

(def TireTemperatureSensor
  "Sensor measuring the temperature of a tire"
  {:db/ident        :auto-vs/TireTemperatureSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Tire temperature sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Sensor measuring the temperature of a tire"}})

(def Torque
  "Signal.Drivetrain.InternalCombustionEngine.Engine.Torque : Current engine torque."
  {:db/ident :auto-vs/Torque,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Torque"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/TorqueMeter,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/BendingMomentOrTorqueUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.InternalCombustionEngine.Engine.Torque : Current engine torque."}})

(def TorqueMeter
  "Sensor measuring a torque"
  {:db/ident        :auto-vs/TorqueMeter,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Torquemeter"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring a torque"}})

(def TractionControlSystem
  "Appliance designed to prevent loss of traction of wheels"
  {:db/ident :auto-vs/TractionControlSystem,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Traction control system"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Appliance designed to prevent loss of traction of wheels"}})

(def TravelledDistance
  "Signal.Drivetrain.Transmission.TravelledDistance : Odometer reading"
  {:db/ident :auto-vs/TravelledDistance,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TravelledDistance"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Odometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LengthUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Drivetrain.Transmission.TravelledDistance : Odometer reading"}})

(def TrunkIsLocked
  "Signal.Body.Trunk.IsLocked : Is trunk locked or unlocked. True = Locked. False = Unlocked."
  {:db/ident :auto-vs/TrunkIsLocked,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsLocked"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/TrunkLock,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/TrunkLock,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Trunk.IsLocked : Is trunk locked or unlocked. True = Locked. False = Unlocked."}})

(def TrunkIsOpen
  "Signal.Body.Trunk.IsOpen : Trunk open or closed. True = Open. False = Closed"
  {:db/ident :auto-vs/TrunkIsOpen,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IsOpen"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/TrunkLatch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/TrunkLatch,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Trunk.IsOpen : Trunk open or closed. True = Open. False = Closed"}})

(def TrunkLatch
  "System opening the trunk"
  {:db/ident        :auto-vs/TrunkLatch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Trunk latch"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "System opening the trunk"}})

(def TrunkLight
  "Trunk light"
  {:db/ident        :auto-vs/TrunkLight,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Trunk light"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Trunk light"}})

(def TrunkLock
  "System locking the trunk"
  {:db/ident        :auto-vs/TrunkLock,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Trunk lock"},
   :rdfs/subClassOf [:auto-vs/VehicleSensor :sosa/Actuator],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "System locking the trunk"}})

(def VehiclePitch
  "Signal.Vehicle.AngularVelocity.Pitch : Vehicle rotation rate along Y (lateral)."
  {:db/ident :auto-vs/VehiclePitch,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pitch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Gyroscope,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngularVelocityUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.AngularVelocity.Pitch : Vehicle rotation rate along Y (lateral)."}})

(def VehicleRoll
  "Signal.Vehicle.AngularVelocity.Roll : Vehicle rotation rate along X (longitudinal)."
  {:db/ident :auto-vs/VehicleRoll,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Roll"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Gyroscope,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngularVelocityUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.AngularVelocity.Roll : Vehicle rotation rate along X (longitudinal)."}})

(def VehicleSensor
  "vehicle sensor"
  {:db/ident        :auto-vs/VehicleSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "vehicle sensor"},
   :rdfs/subClassOf :auto-vp/VehiclePart})

(def VehicleSpeed
  "Signal.Vehicle.Speed / Signal.Drivetrain.Transmission.Speed / Signal.Cabin.Infotainment.Navigation.CurrentLocation.Speed / Signal.OBD.Speed : PID 0D: Vehicle speed"
  {:db/ident :auto-vs/VehicleSpeed,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Speed"},
   :rdfs/subClassOf
   [{:owl/allValuesFrom {:owl/oneOf [:auto-vs/GPS :auto-vs/Speedometer],
                         :rdf/type  :owl/Class},
     :owl/onProperty    :sosa/isObservedBy,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom "http://qudt.org/schema/qudt/LinearVelocityUnit",
     :owl/onProperty    "http://qudt.org/schema/qudt/unit",
     :rdf/type          :owl/Restriction}
    :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.Speed / Signal.Drivetrain.Transmission.Speed / Signal.Cabin.Infotainment.Navigation.CurrentLocation.Speed / Signal.OBD.Speed : PID 0D: Vehicle speed"}})

(def VehicleYaw
  "Signal.Vehicle.AngularVelocity.Yaw : Vehicle rotation rate along Z (vertical)."
  {:db/ident :auto-vs/VehicleYaw,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Yaw"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Gyroscope,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/AngularVelocityUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.AngularVelocity.Yaw : Vehicle rotation rate along Z (vertical)."}})

(def VerticalAcceleration
  "Signal.Vehicle.Acceleration.Vertical : Vehicle acceleration in Z (vertical acceleration)."
  {:db/ident :auto-vs/VerticalAcceleration,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vertical"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/Accelerometer,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/LinearAccelerationUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Vehicle.Acceleration.Vertical : Vehicle acceleration in Z (vertical acceleration)."}})

(def VoltageSensor
  "voltage sensor"
  {:db/ident        :auto-vs/VoltageSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "voltage sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor})

(def WarmupsSinceDTCClear
  "Signal.OBD.WarmupsSinceDTCClear : PID 30 - Number of warm-ups since codes cleared"
  {:db/ident :auto-vs/WarmupsSinceDTCClear,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "WarmupsSinceDTCClear"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/DiagnosticSystem,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.OBD.WarmupsSinceDTCClear : PID 30 - Number of warm-ups since codes cleared"}})

(def WasherFluidLevel
  "Signal.Body.Windshield.Front/Rear.WasherFluid.Level : Washer fluid level as a percent. 0 = Empty. 100 = Full."
  {:db/ident :auto-vs/WasherFluidLevel,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Level"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/WasherFuildLevelSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Windshield.Front/Rear.WasherFluid.Level : Washer fluid level as a percent. 0 = Empty. 100 = Full."}})

(def WasherFluidLevelLow
  "Signal.Body.Windshield.Front/Rear.WasherFluid.LevelLow : Low level indication for washer fluid. True = Level Low. False = Level OK."
  {:db/ident :auto-vs/WasherFluidLevelLow,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LevelLow"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/WasherFuildLevelSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Windshield.Front/Rear.WasherFluid.LevelLow : Low level indication for washer fluid. True = Level Low. False = Level OK."}})

(def WasherFuildLevelSensor
  "Sensor measuring the washer fluid level"
  {:db/ident        :auto-vs/WasherFuildLevelSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Washer fluid level sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sensor measuring the washer fluid level"}})

(def WindowPosition
  "Signal.Cabin.Door.RowX.Left/Right.Window.Position : Window position. 0 = Fully closed 100 = Fully opened."
  {:db/ident :auto-vs/WindowPosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Position"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/WindowPositionSensor,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Door.RowX.Left/Right.Window.Position : Window position. 0 = Fully closed 100 = Fully opened."}})

(def WindowPositionSensor
  "Sensor measuring the position of a window"
  {:db/ident        :auto-vs/WindowPositionSensor,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Window position sensor"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Sensor measuring the position of a window"}})

(def WindowShadePosition
  "Signal.Cabin.Door.RowX.Left/Right.Shade.Position : Position of side window blind. 0 = Fully retracted. 100 = Fully deployed."
  {:db/ident :auto-vs/WindowShadePosition,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Position"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RearShadeActuator,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Door.RowX.Left/Right.Shade.Position : Position of side window blind. 0 = Fully retracted. 100 = Fully deployed."}})

(def WindowShadeSwitch
  "Signal.Cabin.Door.RowX.Left/Right.Shade.Switch : Switch controlling sliding action such as window, sunroof, or blind."
  {:db/ident :auto-vs/WindowShadeSwitch,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Switch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RearShadeSystem,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Door.RowX.Left/Right.Shade.Switch : Switch controlling sliding action such as window, sunroof, or blind."}})

(def WindowSwitch
  "Signal.Cabin.Door.RowX.Left/Right.Window.Switch : Switch controlling sliding action such as window, sunroof, or blind."
  {:db/ident :auto-vs/WindowSwitch,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Switch"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/RearShadeSystem,
                      :owl/onProperty    :auto-vs/ActuableSignal,
                      :rdf/type          :owl/Restriction}
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Cabin.Door.RowX.Left/Right.Window.Switch : Switch controlling sliding action such as window, sunroof, or blind."}})

(def WindshieldHeater
  "Controls a windshield heater"
  {:db/ident        :auto-vs/WindshieldHeater,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Windshiel heater"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls a windshield heater"}})

(def WindshieldHeaterSwitch
  "Senses the windshield heater status"
  {:db/ident        :auto-vs/WindshieldHeaterSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Windshield heater switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Senses the windshield heater status"}})

(def WindshieldHeatingStatus
  "Signal.Body.Windshield.Front.Heating.Status : Front/Rear windshield heater status. 0 - off, 1 - on"
  {:db/ident :auto-vs/WindshieldHeatingStatus,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Status"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/WindshieldHeaterSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/WindshieldHeater,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Windshield.Front.Heating.Status : Front/Rear windshield heater status. 0 - off, 1 - on"}})

(def Wiper
  "Controls a wiper"
  {:db/ident        :auto-vs/Wiper,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Wiper"},
   :rdfs/subClassOf :sosa/Actuator,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Controls a wiper"}})

(def WiperSwitch
  "Senses the wiping level"
  {:db/ident        :auto-vs/WiperSwitch,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Wiper switch"},
   :rdfs/subClassOf :auto-vs/VehicleSensor,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Senses the wiping level"}})

(def WipingStatus
  "Signal.Body.Windshield.Front.Wiping.Status : Front wiper status"
  {:db/ident :auto-vs/WipingStatus,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Status"},
   :rdfs/subClassOf [{:owl/allValuesFrom :auto-vs/WiperSwitch,
                      :owl/onProperty    :sosa/isObservedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :auto-vs/Wiper,
                      :owl/onProperty    :sosa/isActuatedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/qudt/DimensionlessUnit",
                      :owl/onProperty "http://qudt.org/schema/qudt/unit",
                      :rdf/type :owl/Restriction}
                     :auto-vs/ObservableSignal
                     :auto-vs/ActuableSignal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Signal.Body.Windshield.Front.Wiping.Status : Front wiper status"}})

(def hasSignal
  "Property of having signals in a branch"
  {:db/ident        :auto-vs/hasSignal,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/domain     :auto-vp/VehiclePart,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "has signal"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Property of having signals in a branch"}})

(def ^{:private true} AcceleratorPedal
  {:db/ident        :auto-vp/AcceleratorPedal,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/AcceleratorPedalPosition,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} Airbag
  {:db/ident        :auto-vp/Airbag,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/AirbagIsDeployed,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} BrakePedal
  {:db/ident        :auto-vp/BrakePedal,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/BrakePedalPosition,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} DistanceToObject
  {:db/ident        :auto-vp/DistanceToObject,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/DistanceToObjectSignal,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} HeadRestraint
  {:db/ident        :auto-vp/HeadRestraint,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/HeadRestraintHeight,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} Hood
  {:db/ident        :auto-vp/Hood,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/HoodIsOpen,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} Horn
  {:db/ident        :auto-vp/Horn,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/HornIsActive,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} MirrorHeating
  {:db/ident        :auto-vp/MirrorHeating,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/MirrorHeatingStatus,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} ParkingBrake
  {:db/ident        :auto-vp/ParkingBrake,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/ParkingBrakeIsEngaged,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} Raindetection
  {:db/ident        :auto-vp/Raindetection,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/RainIntensity,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} RearviewMirror
  {:db/ident        :auto-vp/RearviewMirror,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/RearviewMirrorDimmingLevel,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} SideBolster
  {:db/ident        :auto-vp/SideBolster,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/SideBolsterInflation,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} VehiclePart
  "vehicle part"
  {:db/ident   :auto-vp/VehiclePart,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vehicle part"}})

(def ^{:private true} WindshieldHeating
  {:db/ident        :auto-vp/WindshieldHeating,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/WindshieldHeatingStatus,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} Wiping
  {:db/ident        :auto-vp/Wiping,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :auto-vs/WipingStatus,
                     :owl/onProperty    :auto-vs/hasSignal,
                     :rdf/type          :owl/Restriction}})

(def ^{:private true} Actuator
  {:db/ident :sosa/Actuator,
   :rdf/type :owl/Class})

(def ^{:private true} Sensor
  {:db/ident :sosa/Sensor,
   :rdf/type :owl/Class})

(def ^{:private true} isActuatedBy
  {:db/ident :sosa/isActuatedBy,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} isObservedBy
  {:db/ident :sosa/isObservedBy,
   :rdf/type :owl/ObjectProperty})