(ns example
  (:use [clj-web-crawler])
  (:gen-class))

(defn my-name []
    "Cool Project")

(defn -main [& args]
  (println (my-name)))

(defn crawl-url [url]
  (let [clj-ws (client url)
        home  (method "/")] 
    (crawl clj-ws home
      (println (.getStatusCode home)))))