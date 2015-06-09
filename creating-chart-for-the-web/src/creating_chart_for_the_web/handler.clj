(ns creating-chart-for-the-web.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.util.response :refer [redirect]]
            [hiccup.page :refer [html5]]))

(defn index-page []
  (html5
   [:head
    [:title "Web Charts"]]
   [:body
    [:h1 {:id "web-charts"} "Web Charts"]
    [:ol
     [:li [:a {:href "/data/census-race.json"}
           "2010 Census Race Data"]]]]))

(defroutes app-routes
  (GET "/" [] (index-page))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
