(ns hello-www.core
  (:use compojure.core
        ring.adapter.jetty)
  (:require [compojure.route :as route]))

(defroutes example
  (GET "/" [] "<h1>Hello World Wide Web!</h1>")
  (GET "/merchant/:mid/consumer/:cid" [mid cid]
       (str "<h1>Hello user " mid "</h1> ok" cid))
  (route/not-found "Page not found"))

(run-jetty example {:port 8080})