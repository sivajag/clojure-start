(defproject my-project "1.0-SNAPSHOT"
  :description "my project."
  :url "http://my-project.com"
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [compojure "0.4.0-SNAPSHOT"]
                 [ring/ring-jetty-adapter "0.2.0"]
                 [com.jmeeks/clj-web-crawler "0.1.0-SNAPSHOT"]
                 [org.clojars.kjw/commons-httpclient "3.1"]
                 [swarmiji "0.3.0"]]
  :dev-dependencies [[leiningen/lein-swank "1.2.0-SNAPSHOT"]
                     [swank-clojure "1.2.0-SNAPSHOT"]]
  :main example)


(ns leiningen.foo)
 (defn foo [project & args] (println "Hello Foo!!"))