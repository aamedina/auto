# auto
RDF vocabulary for the Automotive Ontology

## rdfs:seeAlso
* https://github.com/edmcouncil/auto

## dev

``` clojure
user> (reset)
```

``` clojure
dev> (doc :auto-vc/Truck)
=>
:auto-vc/Truck
   a motor vehicle designed to transport cargo
  isa?
  :auto-vc/TransportVehicle
   :auto-vc/LargeSpecialVehicle
    :auto-vc/SpecialVehicle
     :auto-vc/Car
      :auto-vc/MotorizedRoadVehicle
       :auto-vc/RoadVehicle
        :auto-vc/LandVehicle
         :auto-vc/Vehicle
          :auto-mo/Object
           :auto-mo/MaterialEntity
            :auto-mo/IndependentContinuant
             :auto-mo/Continuant
              :owl/Class
               :rdfs/Class
```

``` clojure
dev> (sort (descendants rdf/*classes* :auto-vc/Vehicle))
=>
(:auto-av/AutomatedDrivingSystemDedicatedVehicle
 :auto-av/AutomatedDrivingSystemDualModeVehicle
 :auto-av/AutomatedDrivingSystemEquippedVehicle
 :auto-av/ConventionalVehicle
 :auto-av/MotorVehicle
 :auto-vc/AgriculturalCommodityTrailer
 :auto-vc/Aircraft
 :auto-vc/Autocycle
 :auto-vc/Bicycle
 :auto-vc/Boat
 :auto-vc/BoatTrailer
 :auto-vc/Bus
 :auto-vc/Canoe
 :auto-vc/Car
 :auto-vc/CargoVan
 :auto-vc/CharterBus
 :auto-vc/CommercialMotorVehicle
 :auto-vc/ContainerChassisTrailer
 :auto-vc/CoveredFarmVehicle
 :auto-vc/CribTypeLogTrailer
 :auto-vc/FullTrailer
 :auto-vc/HeavyHaulerTrailer
 :auto-vc/HeavyTruck
 :auto-vc/HorizontalDischargeTrailer
 :auto-vc/HumanPoweredLandVehicle
 :auto-vc/IntercityBus
 :auto-vc/Kayak
 :auto-vc/LandVehicle
 :auto-vc/LargeBus
 :auto-vc/LargeMotorcycle
 :auto-vc/LargeSpecialVehicle
 :auto-vc/LightTruck
 :auto-vc/LowSpeedVehicle
 :auto-vc/MediumTruck
 :auto-vc/Moped
 :auto-vc/Motor-drivenCycle
 :auto-vc/MotorBoat
 :auto-vc/Motorcycle
 :auto-vc/MotorizedBicycle
 :auto-vc/MotorizedRoadVehicle
 :auto-vc/OtherBus
 :auto-vc/PassengerCar
 :auto-vc/PassengerVan
 :auto-vc/Pedalcycle
 :auto-vc/PoleTrailer
 :auto-vc/PulpwoodTrailer
 :auto-vc/Quadracycle
 :auto-vc/RailwayTrain
 :auto-vc/RailwayVehicle
 :auto-vc/RegularVehicle
 :auto-vc/Rickshaw
 :auto-vc/RoadVehicle
 :auto-vc/SailingBoat
 :auto-vc/SchoolBus
 :auto-vc/Semitrailer
 :auto-vc/Ship
 :auto-vc/SingleUnitTruck
 :auto-vc/SmallBus
 :auto-vc/SmallSpecialVehicle
 :auto-vc/SpecialVehicle
 :auto-vc/Speed-limitedMotor-drivenCycle
 :auto-vc/StraddleTrailer
 :auto-vc/Three-wheeledMotorcycle
 :auto-vc/TractorPoleTrailer
 :auto-vc/Trailer
 :auto-vc/TransitBus
 :auto-vc/TransportVehicle
 :auto-vc/Truck
 :auto-vc/TruckCombination
 :auto-vc/TruckTractor
 :auto-vc/UtilityVehicle
 :auto-vc/Van
 :auto-vc/Van-basedBus
 :auto-vc/Van-basedMotorhome
 :auto-vc/Watercraft)
```

``` clojure
dev> (run! rdf/print-doc (sort (descendants rdf/*classes* :auto-vs/ObservableSignal)))
=>
-------------------------
:auto-vs/ABSError
   Signal.ADAS.ABS.Error : Indicates if ABS incurred an error condition. True = Error. False = No Error.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ABSIsActive
   Signal.ADAS.ABS.IsActive : Indicates if ABS is enabled. Tue = Enabled. False = Disabled.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/ABSIsEngaged
   Signal.ADAS.ABS.IsEngaged : Indicates if ABS is currently regulating brake pressure. True = Engaged. False = Not Engaged.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AbsoluteLoad
   Signal.OBD.AbsoluteLoad : PID 43 - Absolute load value
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AcceleratorPedalPosition
   Signal.Chassis.Accelerator.PedalPosition : Accelerator pedal position as percent. 0 = Not depressed. 100 = Fully depressed.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AcceleratorPositionD-E-F
   Signal.OBD.AcceleratorPositionD/E/F : PID 49/4A/4B - Accelerator pedal position D/E/F
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AccumulatedDriveTime
   Signal.Vehicle.DriveTime : Accumulated drive time in seconds.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AccumulatedIdleTime
   Signal.Vehicle.IdleTime : Accumulated idle time in seconds.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AccumulatedIgnitionOffTime
   Signal.Vehicle.IgnitionOffTime : Accumulated ignition off time in seconds.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AccumulatedIgnitionOnTime
   Signal.Vehicle.IgnitionOnTime : Accumulated ignition on time in seconds.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AccumulatedTravelledDistance
   Signal.Vehicle.TravelledDistance : Odometer reading
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AirDistribution
   Signal.Cabin.HVAC.RowX.Left/Right.AirDistribution : Direction of airstream
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/AirStatus
   Signal.OBD.AirStatus : PID 12 - Secondary air status
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/AirbagIsDeployed
   Signal.Cabin.Seat.RowX.PosY.Airbag.IsDeployed : Airbag deployment status. True = Airbag deployed. False = Airbag not deployed.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/Altitude
   Signal.Cabin.Infotainment.Navigation.CurrentLocation.Altitude : Current elevation of the position in meters.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AmbientAirTemperature
   Signal.Vehicle.AmbientAirTemperature / Signal.Cabin.HVAC.AmbientAirTemperature / Signal.Drivetrain.InternalCombustionEngine.Engine.AmbientAirTemperature / Signal.OBD.AmbientAirTemperature / PID 46 : Ambient air temperature (outside)
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AmbientLightLevel
   Signal.Cabin.Lights.AmbientLight : How much ambient light is detected in cabin. 0 = No ambient light. 100 = Full brightness
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/AuxInputStatus
   Signal.OBD.AuxInputStatus : PID 1E - Auxiliary input status (power take off)
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/AverageConsumption
   Signal.Drivetrain.FuelSystem.AverageConsumption : Average consumption in liters per 100 km.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/BarometricPressure
   Signal.OBD.BarometricPressure : PID 33 - Barometric pressure
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/BatteryCapacity
   Signal.Drivetrain.BatteryManagement.BatteryCapacity : Remaining capacity of the batter pack
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/BatteryTemperature
   Signal.Drivetrain.BatteryManagement.BatteryTemperature : Temperature of the battery pack
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/BrakeFluidLevel
   Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.FluidLevel : Brake fluid level as percent. 0 = Empty. 100 = Full.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/BrakeFluidLevelLow
   Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.FluidLevelLow : Brake fluid level status. True = Brake fluid level low. False = Brake fluid level OK.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/BrakePedalPosition
   Signal.Chassis.Brake.PedalPosition : Brake pedal position as percent. 0 = Not depressed. 100 = Fully depressed.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/BrakesWorn
   Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.BrakesWorn : Brake pad wear status. True = Worn. False = Not Worn.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/CatalystTemperature
   Signal.OBD.Catalyst.BankX.TemperatureY : PID 3C->3F - Catalyst temperature from bank X, sensor Y
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ClutchWear
   Signal.Drivetrain.Transmission.ClutchWear : Clutch wear as a percent. 0 = no wear. 100 = worn.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/CommandedEGR
   Signal.OBD.CommandedEGR : PID 2C - Commanded exhaust gas recirculation (EGR)
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/CommandedEVAP
   Signal.OBD.CommandedEVAP : PID 2E - Commanded evaporative purge (EVAP) valve
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/CommandedEquivalenceRatio
   Signal.OBD.CommandedEquivalenceRatio : PID 44 - Commanded equivalence ratio
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ConsumptionSinceStart
   Signal.Drivetrain.FuelSystem.ConsumptionSinceStart : Fuel amount consumed since start in liters.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ControlModuleVoltage
   Signal.OBD.ControlModuleVoltage : PID 42 - Control module voltage
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/CoolantTemperature
   Signal.OBD.CoolantTemperature : PID 05 - Coolant temperature
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/CruiseControlError
   Signal.ADAS.CruiseControl.Error : Indicates if cruise control system incurred and error condition. True = Error. False = NoError.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/CruiseControlIsActive
   Signal.ADAS.CruiseControl.IsActive : Indicates if cruise control system is enabled. True = Enabled. False = Disabled.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/CurrentGear
   Signal.Drivetrain.Transmission.Gear : Current gear. 0=Neutral. -1=Reverse
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/CurrentPower
   Signal.Drivetrain.InternalCombustionEngine.Engine.Power : Current engine power output.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/CurrentTravelledDistance
   Signal.Vehicle.TripMeterReading : Current trip meter reading
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/CushionHeight
   Signal.Cabin.Seat.RowX.PosY.Cushion.Height : Height of the seat front. 0 = Lowermost. 100 = Uppermost.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/CushionLength
   Signal.Cabin.Seat.RowX.PosY.Cushion.Length : Forward length of cushion (leg support). 0 = Rearmost. 100 = Forwardmost.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/DTCCount
   Signal.OBD.Status.DTCCount : Number of Diagnostic Trouble Codes (DTC)
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/DeclinedMediaURI
   Signal.Cabin.Infotainment.Media.DeclinedURI : URI of suggested media that was declined
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/DestinationLatitude
   Signal.Cabin.Infotainment.Navigation.DestinationSet.Latitude : Latitude of destination
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/DestinationLongitude
   Signal.Cabin.Infotainment.Navigation.DestinationSet.Longitude : Longitude of destination
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/DistanceSinceDTCClear
   Signal.OBD.DistanceSinceDTCClear : PID 31 - Distance traveled since codes cleared
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/DistanceToObjectSignal
   Signal.ADAS.ObstacleDetection.DistanceToObject.Front/Rear/Left/Right : distance to object in meters
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/DistanceWithMIL
   Signal.OBD.DistanceWithMIL : PID 21 - Distance traveled with MIL on
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/DoorIsLocked
   Signal.Cabin.Door.RowX.Left/Right.IsLocked : Is door locked or unlocked. True = Locked. False = Unlocked.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/DoorIsOpen
   Signal.Cabin.Door.RowX.Left/Right.IsOpen : Is door open or closed
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/ECT
   Signal.Drivetrain.InternalCombustionEngine.Engine.ECT : Engine coolant temperature.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/EGRError
   Signal.OBD.EGRError : PID 2D - Exhaust gas recirculation (EGR) error
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/EOP
   Signal.Drivetrain.InternalCombustionEngine.Engine.EOP : Engine oil pressure.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ESCError
   Signal.ADAS.ESC.Error : Indicates if ESC incurred an error condition. True = Error. False = No Error.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ESCIsActive
   Signal.ADAS.ESC.IsActive : Indicates if ECS is enabled. Tue = Enabled. False = Disabled.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/ESCIsEngaged
   Signal.ADAS.ESC.IsEngaged : Indicates if ESC is currently regulating vehicle stability. True = Engaged. False = Not Engaged.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/EVAPVaporPressure
   Signal.OBD.EVAPVaporPressure : PID 32 - Evaporative purge (EVAP) system pressure
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/EVAPVaporPressureAbsolute
   Signal.OBD.EVAPVaporPressureAbsolute : PID 53 - Absolute evaporative purge (EVAP) system pressure
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/EVAPVaporPressureAlternate
   Signal.OBD.EVAPVaporPressureAlternate : PID 54 - Alternate evaporative purge (EVAP) system pressure
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/EngineLoad
   Signal.OBD.EngineLoad : PID 04 - Engine load in percent - 0 = no load, 100 = full load
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/EngineOilTemperature
   Signal.Drivetrain.InternalCombustionEngine.Engine.EOT / Signal.OBD.OilTemperature / PID 5C : Engine oil temperature.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/EthanolPercent
   Signal.OBD.EthanolPercent : PID 52 - Percentage of ethanol in the fuel
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/FanSpeed
   Signal.Cabin.HVAC.RowX.Left/Right.FanSpeed : Fan Speed, 0 = off. 100 = max
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/FreezeDTC
   Signal.OBD.FreezeDTC : PID 02 - DTC that triggered the freeze frame
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/FuelInjectionTiming
   Signal.OBD.FuelInjectionTiming : PID 5D - Fuel injection timing
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/FuelPressure
   Signal.OBD.FuelPressure : PID 0A - Fuel pressure
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/FuelRailPressureAbsolute
   Signal.OBD.FuelRailPressureAbsolute : PID 59 - Absolute fuel rail pressure
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/FuelRailPressureDirect
   Signal.OBD.FuelRailPressureDirect : PID 23 - Fuel rail pressure direct inject
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/FuelRailPressureVac
   Signal.OBD.FuelRailPressureVac : PID 22 - Fuel rail pressure relative to vacuum
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/FuelRate
   Signal.OBD.FuelRate : PID 5E - Engine fuel rate
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/FuelStatus
   Signal.OBD.FuelStatus : PID 03 - Fuel status
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/FuelType
   Signal.OBD.FuelType : PID 51 - Fuel type
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/GPSAccuracy
   Signal.Cabin.Infotainment.Navigation.CurrentLocation.Accuracy : Accuracy level of the latitude and longitude coordinates in meters.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/GPSHeading
   Signal.Cabin.Infotainment.Navigation.CurrentLocation.Heading : Current magnetic compass heading, in degrees.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/GearChangeMode
   Signal.Drivetrain.Transmission.GearChangeMode : Is the gearbox in automatic or manual (paddle) mode.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/GearboxTemperature
   Signal.Drivetrain.Transmission.Temperature : The current gearbox temperature.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/HeadRestraintHeight
   Signal.Cabin.Seat.RowX.PosY.HeadRestraint.Height : Height of head restraint. 0 = Bottommost. 100 = Topmost.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/HoodIsOpen
   Signal.Body.Hood.IsOpen : hood open or closed. True = Open. False = Closed
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/HornIsActive
   Signal.Body.Horn.IsActive : Horn active or inactive. True = Active. False = Inactive.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/HybridBatteryRemaining
   Signal.OBD.HybridBatteryRemaining : PID 5B - Remaining life of hybrid battery
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/InstantConsumption
   Signal.Drivetrain.FuelSystem.InstantConsumption : Current consumption in liters per 100 km.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/IntakeTemperature
   Signal.OBD.IntakeTemp : PID 0F - Intake temperature
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/IsAirConditioningActive
   Signal.Cabin.HVAC.IsAirConditioningActive : Is Air conditioning active.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/IsBackupLightOn
   Signal.Body.Lights.IsBackupOn : Is backup (reverse) light on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsBelted
   Signal.Cabin.Seat.RowX.PosY.IsBelted : Is the belt engaged.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/IsBrakeLightOn
   Signal.Body.Lights.IsBrakeOn : Is brake light on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsChildLockActive
   Signal.Cabin.Door.RowX.Left/Right.IsChildLockActive : Is door child lock engaged. True = Engaged. False = Disengaged.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/IsDomeLightOn
   Signal.Cabin.Lights.IsDomeOn : Is central dome light light on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsFrontDefrosterActive
   Signal.Cabin.HVAC.IsFrontDefrosterActive : Is front defroster active.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsFrontFogLightOn
   Signal.Body.Lights.IsFrontFogOn : Is front fog light on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsGloveBoxLightOn
   Signal.Cabin.Lights.IsGloveBoxOn : Is glove box light on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsHazardLightOn
   Signal.Body.Lights.IsHazardOn : Are hazards on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsHighBeamOn
   Signal.Body.Lights.IsHighBeamOn : Is high beam on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsLeftIndicatorOn
   Signal.Body.Lights.IsLeftIndicatorOn : Is left indicator flashing
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsLowBeamOn
   Signal.Body.Lights.IsLowBeamOn : Is low beam on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsParkingLightOn
   Signal.Body.Lights.IsParkingOn : Is parking light on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsPassengerLightOn
   Signal.Cabin.Lights.RowX.Left/Right.IsPassengerOn : Is passenger light on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsRearDefrosterActive
   Signal.Cabin.HVAC.IsRearDefrosterActive : Is rear defroster active.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsRearFogLightOn
   Signal.Body.Lights.IsRearFogOn : Is rear fog light on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsRecirculationActive
   Signal.Cabin.HVAC.IsRecirculationActive : Is recirculation active.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsRightIndicatorOn
   Signal.Body.Lights.IsRightIndicatorOn : Is right indicator flashing
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsRunningLightOn
   Signal.Body.Lights.IsRunningOn : Are running lights on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/IsSharedLightOn
   Signal.Cabin.Lights.RowX.IsSharedOn : Is light shared across first row on
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/IsTrunkLightOn
   Signal.Cabin.Lights.IsTrunkOn : Is trunk light light on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/LaneDepartureDetectionError
   Signal.ADAS.LaneDepartureDetection.Error : Indicates if lane departure system incurred an error condition. True = Error. False = No Error.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/LaneDepartureDetectionIsActive
   Signal.ADAS.LaneDepartureDetection.IsActive : Indicates if lane departure detection system is enabled. True = Enabled. False = Disabled.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/LaneDepartureDetectionWarning
   Signal.ADAS.LaneDepartureDetection.Warning : Indicates if lane departure detection registered a lane departure
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/LateralAcceleration
   Signal.Vehicle.Acceleration.Lateral : Vehicle acceleration in Y (lateral acceleration).
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/Latitude
   Signal.Cabin.Infotainment.Navigation.CurrentLocation.Latitude : Current latitude of vehicle, as reported by GPS.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/LightIntensity
   Signal.Cabin.Lights.LightIntensity : Intensity of the interior lights. 0 = Off. 100 = Full brightness.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/LocalTemperature
   Signal.Cabin.HVAC.RowX.Left/Right.Temperature : Temperature
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/LongTermFuelTrim
   Signal.OBD.LongTermFuelTrim1 : PID 07/09 - Long Term (learned) Fuel Trim - Bank 1 - negative percent leaner, positive percent richer
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/LongTermO2Trim
   Signal.OBD.LongTermO2Trim : PID 56/58 - Long term secondary O2 trim
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/Longitude
   Signal.Cabin.Infotainment.Navigation.CurrentLocation.Longitude : Current longitude of vehicle, as reported by GPS.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/LongitudinalAcceleration
   Signal.Vehicle.Acceleration.Longitudinal : Vehicle acceleration in X (longitudinal acceleration).
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/LumbarHeight
   Signal.Cabin.Seat.RowX.PosY.Lumbar.Height : Lumbar support position. 0 = Lowermost. 100 = Uppermost.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/LumbarInflation
   Signal.Cabin.Seat.RowX.PosY.Lumbar.Inflation : Lumbar support inflation. 0 = Fully deflated. 100 = Fully inflated.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/MAF
   Signal.Drivetrain.InternalCombustionEngine.Engine.MAF / Signal.OBD.MAF / PID 10 : Grams of air drawn into engine per second.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/MAP
   Signal.Drivetrain.InternalCombustionEngine.Engine.MAP / Signal.OBD.MAP : PID 0B : Manifold air pressure possibly boosted using forced induction.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/MIL
   Signal.OBD.Status.MIL : Malfunction Indicator Light (MIL) False = Off, True = On
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/MaxMAF
   Signal.OBD.MaxMAF : PID 50 - Maximum flow for mass air flow sensor
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/MediaAction
   Signal.Cabin.Infotainment.Media.Action : Tells if the media was
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/MediaAlbum
   Signal.Cabin.Infotainment.Media.Played.Album : Name of album being played
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/MediaArtist
   Signal.Cabin.Infotainment.Media.Played.Artist : Name of artist being played
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/MediaSource
   Signal.Cabin.Infotainment.Media.Played.Source : Media selected for playback
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/MediaTrack
   Signal.Cabin.Infotainment.Media.Played.Track : Name of track being played
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/MediaURI
   Signal.Cabin.Infotainment.Media.Played.URI : User Resource associated with the media
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/MediaVolume
   Signal.Cabin.Infotainment.Media.Volume : Current Media Volume
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/MirrorHeatingStatus
   Signal.Body.Mirrors.Left/Right.Heating.Status : Mirror Heater on or off. True = Heater On. False = Heater Off.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/MirrorPan
   Signal.Body.Mirrors.Left/Right.Pan : Mirror pan as a percent. 0 = Center Position. 100 = Fully Left Position. -100 = Fully Right Position.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/MirrorTilt
   Signal.Body.Mirrors.Left/Right.Tilt : Mirror tilt as a percent. 0 = Center Position. 100 = Fully Upward Position. -100 = Fully Downward Position.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/O2Current
   Signal.OBD.O2WR.Sensor1.Current : PID 34-3B - Lambda current for wide range/band oxygen sensor 1
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/O2Voltage
   Signal.OBD.O2.BankX.SensorY.Voltage : PID 14->1B - Sensor voltage
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/O2WRVoltage
   Signal.OBD.O2WR.SensorX.Voltage : PID 24->2B - Lambda voltage for wide range/band oxygen sensor X
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ObstacleDetectionError
   Signal.ADAS.ObstacleDetection.Error : Indicates if obstacle sensor system incurred an error condition. True = Error. False = No Error.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ObstacleDetectionIsActive
   Signal.ADAS.ObstacleDetection.IsActive : Indicates if obstacle sensor system is enabled. Tue = Enabled. False = Disabled.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/PadWear
   Signal.Chassis.Axle.RowX.Wheel.Left/Right.Brake.PadWear : Brake pad wear as percent. 0 = No Wear. 100 = Worn.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ParkingBrakeIsEngaged
   Signal.Chassis.ParkingBrake.IsEngaged : Parking brake status. True = Parking Brake is Engaged. False = Parking Brake is not Engaged.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/PerformanceMode
   Signal.Drivetrain.Transmission.PerformanceMode : Current gearbox performance mode.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/PidsA
   Signal.OBD.PidsA : PID 00 - Bit array of the supported pids 01 to 20
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/PidsB
   Signal.OBD.PidsB : PID 20 - Bit array of the supported pids 21 to 40
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/PidsC
   Signal.OBD.PidsC : PID 40 - Bit array of the supported pids 41 to 60
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/RainIntensity
   Signal.Body.Raindetection.Intensity : Rain intensity. 0 = Dry, No Rain. 100 = Covered.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ReachableRange
   Signal.Drivetrain.FuelSystem.Range : Range in meters.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/RearviewMirrorDimmingLevel
   Signal.Cabin.RearviewMirror.DimmingLevel : Dimming level of rearview mirror. 0 = undimmed. 100 = fully dimmed
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/RelativeAcceleratorPosition
   Signal.OBD.RelativeAcceleratorPosition : PID 5A - Relative accelerator pedal position
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/RelativeThrottlePosition
   Signal.OBD.RelativeThrottlePosition : PID 45 - Relative throttle position
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/RotationSpeed
   Signal.Drivetrain.InternalCombustionEngine.Engine.Speed / Signal.OBD.EngineSpeed : PID 0C : Engine speed measured as rotations per minute.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/RunTime
   Signal.OBD.RunTime : PID 1F - Engine run time
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/RunTimeMIL
   Signal.OBD.RunTimeMIL : PID 4D - Run time with MIL on
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/SeatHasPassenger
   Signal.Cabin.Seat.RowX.PosY.HasPassenger : Does the seat have a passenger in it.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/SeatHeating
   Signal.Cabin.Seat.RowX.PosY.Heating : Seat cooling / heating. 0 = off. -100 = max cold. +100 = max heat
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/SeatMassage
   Signal.Cabin.Seat.RowX.PosY.Massage : Seat massage level. 0 = off. 100 = max massage.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/SeatPosition
   Signal.Cabin.Seat.RowX.PosY.Position : Seat horizontal position. 0 = Frontmost. 100 = Rearmost
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/SeatRecline
   Signal.Cabin.Seat.RowX.PosY.Recline : Recline level. -90 = Max forward recline. 90 max backward recline
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/SelectedMediaURI
   Signal.Cabin.Infotainment.Media.SelectedURI : URI of suggested media that was selected
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/ShortTermFuelTrim
   Signal.OBD.ShortTermFuelTrim1 : PID 06/08 - Short Term (immediate) Fuel Trim - Bank 1 - negative percent leaner, positive percent richer
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ShortTermO2Trim
   Signal.OBD.ShortTermO2Trim : PID 55/57 - Short term secondary O2 trim
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/SideBolsterInflation
   Signal.Cabin.Seat.RowX.PosY.SideBolster.Inflation : Lumbar support inflation. 0 = Fully deflated. 100 = Fully inflated.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/SpeedSet
   Signal.ADAS.CruiseControl.SpeedSet : Set cruise control speed in kilometers per hour
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/SteeringWheelAngle
   Signal.Chassis.SteeringWheel.Angle : Steering wheel angle. Positive = degrees to the left. Negative = degrees to the right.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/SteeringWheelExtension
   Signal.Chassis.SteeringWheel.Extension : Steering wheel column extension from dashboard. 0 = Closest to dashboard. 100 = Furthest from dashboard.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/SteeringWheelTilt
   Signal.Chassis.SteeringWheel.Tilt : Steering wheel column tilt. 0 = Lowest position. 100 = Highest position.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/SunroofPosition
   Signal.Cabin.Sunroof.Position : Sunroof position. 0 = Fully closed 100 = Fully opened. -100 = Fully tilted
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TCSError
   Signal.ADAS.TCS.Error : Indicates if TCS incurred an error condition. True = Error. False = No Error.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TCSIsActive
   Signal.ADAS.TCS.IsActive : Indicates if TCS is enabled. Tue = Enabled. False = Disabled.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/TCSIsEngaged
   Signal.ADAS.TCS.IsEngaged : Indicates if TCS is currently regulating traction. True = Engaged. False = Not Engaged.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TPS
   Signal.Drivetrain.InternalCombustionEngine.Engine.TPS : Current throttle position.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TankLevel
   Signal.Drivetrain.FuelSystem.Level / Signal.OBD.FuelLevel / PID 2F: Level in fuel tank as percent of capacity. 0 = empty. 100 = full.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ThrottleActuation
   Signal.OBD.ThrottleActuator : PID 4C - Commanded throttle actuator
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/ThrottlePosition
   Signal.OBD.ThrottlePosition : PID 11 - Throttle position - 0 = closed throttle, 100 = open throttle
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/ThrottlePositionB-C
   Signal.OBD.ThrottlePositionB/C : PID 47/48 - Absolute throttle position B/C
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TimeSinceDTCCleared
   Signal.OBD.TimeSinceDTCCleared : PID 4E - Time since trouble codes cleared
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TimeSinceStart
   Signal.Drivetrain.FuelSystem.TimeSinceStart : Time elapsed since start in seconds.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TimingAdvance
   Signal.OBD.TimingAdvance : PID 0E - Time advance (angle)
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TirePressure
   Signal.Chassis.Axle.RowX.Wheel.Left/Right.Tire.Pressure : Tire pressure in kilo-Pascal
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TirePressureLow
   Signal.Chassis.Axle.RowX.Wheel.Left/Right.Tire.PressureLow : Tire Pressure Status. True = Low tire pressure. False = Good tire pressure.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TireTemperature
   Signal.Chassis.Axle.RowX.Wheel.Left/Right.Tire.Temperature : Tire temperature in Celsius.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/Torque
   Signal.Drivetrain.InternalCombustionEngine.Engine.Torque : Current engine torque.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TravelledDistance
   Signal.Drivetrain.Transmission.TravelledDistance : Odometer reading
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/TrunkIsLocked
   Signal.Body.Trunk.IsLocked : Is trunk locked or unlocked. True = Locked. False = Unlocked.
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/TrunkIsOpen
   Signal.Body.Trunk.IsOpen : Trunk open or closed. True = Open. False = Closed
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/VehiclePitch
   Signal.Vehicle.AngularVelocity.Pitch : Vehicle rotation rate along Y (lateral).
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/VehicleRoll
   Signal.Vehicle.AngularVelocity.Roll : Vehicle rotation rate along X (longitudinal).
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/VehicleSpeed
   Signal.Vehicle.Speed / Signal.Drivetrain.Transmission.Speed / Signal.Cabin.Infotainment.Navigation.CurrentLocation.Speed / Signal.OBD.Speed : PID 0D: Vehicle speed
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/VehicleYaw
   Signal.Vehicle.AngularVelocity.Yaw : Vehicle rotation rate along Z (vertical).
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/VerticalAcceleration
   Signal.Vehicle.Acceleration.Vertical : Vehicle acceleration in Z (vertical acceleration).
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/WarmupsSinceDTCClear
   Signal.OBD.WarmupsSinceDTCClear : PID 30 - Number of warm-ups since codes cleared
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/WasherFluidLevel
   Signal.Body.Windshield.Front/Rear.WasherFluid.Level : Washer fluid level as a percent. 0 = Empty. 100 = Full.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/WasherFluidLevelLow
   Signal.Body.Windshield.Front/Rear.WasherFluid.LevelLow : Low level indication for washer fluid. True = Level Low. False = Level OK.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/WindowPosition
   Signal.Cabin.Door.RowX.Left/Right.Window.Position : Window position. 0 = Fully closed 100 = Fully opened.
  isa?
  :auto-vs/ObservableSignal
   :owl/Class
    :rdfs/Class
-------------------------
:auto-vs/WindshieldHeatingStatus
   Signal.Body.Windshield.Front.Heating.Status : Front/Rear windshield heater status. 0 - off, 1 - on
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
-------------------------
:auto-vs/WipingStatus
   Signal.Body.Windshield.Front.Wiping.Status : Front wiper status
  isa?
  :auto-vs/ObservableSignal
   :auto-vs/ActuableSignal
    :owl/Class
     :rdfs/Class
```
