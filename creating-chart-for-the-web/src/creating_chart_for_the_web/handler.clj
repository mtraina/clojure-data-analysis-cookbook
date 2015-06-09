(ns creating-chart-for-the-web.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.util.response :refer [redirect]]
            [hiccup.page :refer [html5 include-js]]
            [hiccup.element :refer [javascript-tag]]))

(defn index-page []
  (html5
   [:head
    [:title "Web Charts"]]
   [:body
    [:h1 {:id "web-charts"} "Web Charts"]
    [:ol
     [:li [:a {:href "/data/census-race.json"}
           "2010 Census Race Data"]]]
    (include-js "js/script.js")
    (javascript-tag
      "creating_chart_for_the_web.core.hello('from ClojureScript!');")]))

(defroutes app-routes
  (GET "/" [] (index-page))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
