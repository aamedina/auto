(ns net.wikipunk.auto
  "The Automotive Ontology"
  (:require
   [clojure.string :as str]
   [com.stuartsierra.component :as com]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.auto.boot]
   [net.wikipunk.rdf :as rdf]))

(defrecord AUTO [vocab domains modules]
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this)

  rdf/NamespaceSpitter
  (emit [_ arg-map]
    (rdf/emit domains arg-map)
    (rdf/emit modules arg-map)))

(defn quickstart
  []
  (require '[net.wikipunk.rdf.auto :as auto-spec]
           '[net.wikipunk.rdf.auto-av :as auto-av]
           '[net.wikipunk.rdf.auto-cc :as auto-cc]
           '[net.wikipunk.rdf.auto-ev :as auto-ev]
           '[net.wikipunk.rdf.auto-mo :as auto-mo]
           '[net.wikipunk.rdf.auto-ti :as auto-ti]
           '[net.wikipunk.rdf.auto-vc :as auto-vc]
           '[net.wikipunk.rdf.auto-vp :as auto-vp]
           '[net.wikipunk.rdf.auto-vs :as auto-vs]))