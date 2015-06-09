(defproject creating-chart-for-the-web "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.4"]
                 [ring/ring-defaults "0.1.5"]
                 [hiccup "1.0.5"]
                 [org.clojure/clojurescript "0.0-3211"]]
  :plugins [[lein-ring "0.9.4"]
            [lein-cljsbuild "1.0.6"]]
  :ring {:handler creating-chart-for-the-web.handler/app}
  :cljsbuild {
    :builds [{
        :source-paths ["src-cljs"]
        :compiler {
          :output-to "resources/public/js/script.js"
          :optimizations :whitespace
          :pretty-print true}}]}
  :profiles {
    :dev {
      :dependencies [[javax.servlet/javax.servlet-api "3.1.0"]
                        [ring/ring-mock "0.2.0"]]}})
