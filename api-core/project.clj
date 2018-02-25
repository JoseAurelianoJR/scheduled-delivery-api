(defproject api-core "0.1.0-SNAPSHOT"
  :description "Scheduled Delivery API"
  :url ""
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [ring/ring-json "0.4.0"]
                 [korma "0.4.3"]
                 [org.postgresql/postgresql "42.2.1"]
                 [jumblerg/ring.middleware.cors "1.0.1"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler api-core.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
