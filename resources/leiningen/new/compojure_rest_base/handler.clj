(ns {{name}}.handler
  (:use     [ring.util.response :only [response]])
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.middleware.json :as middleware]))

(defn handle-route-here
    [request]
    (response {:json "example"}))

(defroutes api-routes
    (GET "/route-here" [] handle-route-here))

(defroutes app-routes
    (context "/api" [] api-routes)
    (route/not-found "Not Found"))

(def app
  (-> (handler/api app-routes)
      (middleware/wrap-json-response)))
