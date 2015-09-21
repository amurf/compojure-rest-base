(ns {{name}}.test-handler
  (:use clojure.test
        ring.mock.request
        {{name}}.handler))

(deftest test-app
  (testing "users endpoint"
    (let [response (app (request :get "/api/route-here"))]
      (is (= (:status response) 200))
      (is (= (get-in response [:headers "Content-Type"]) "application/json; charset=utf-8")))))
