(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "Compojure rest application"
  :url "http://github.com/amurf/compojure-rest-base"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.0"]
                 [ring/ring-json "0.4.0"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler {{name}}.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.1"]]}})
