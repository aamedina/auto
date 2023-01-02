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
