(ns leiningen.new.compojure-rest-base
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "compojure-rest-base"))

(defn compojure-rest-base
  "Generate a minimal compojure rest application"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' compojure-rest-base project.")
    (->files data
             ["src/{{sanitized}}/handler.clj" (render "handler.clj" data)]
             ["test/{{sanitized}}/test_handler.clj" (render "test_handler.clj" data)]
             ["project.clj" (render "project.clj" data)])))
