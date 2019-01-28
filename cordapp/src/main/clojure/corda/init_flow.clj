(ns corda.init-flow
  (:import (net.corda.core.utilities ProgressTracker$Step)
           (java.lang.annotation RetentionPolicy Retention)
           (co.paralleluniverse.fibers Suspendable)))

(gen-class
  :name ^{net.corda.core.flows.StartableByRPC {}} corda.InitFlow
  :extends net.corda.core.flows.FlowLogic)

(defn -getProgressTracker [] [(new ProgressTracker$Step "Cheering")])



(defn ^{Suspendable {}
        Retention   RetentionPolicy/RUNTIME} -call []
  (println ("Hellow from Clojure"))
  "ReturnString")
