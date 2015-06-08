(defproject creating-chart-for-the-web "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.4"]
                 [ring/ring-defaults "0.1.5"]]
  :plugins [[lein-ring "0.9.4"]]
  :ring {:handler creating-chart-for-the-web.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]
                        [ring/ring-mock "0.2.0"]]}})