(ns getting-data.core
    (:require [incanter.core :as ic]
              [clojure.java.jdbc :as jdbc]))

(defn load-table-data
  "This loads the data from a database table."
  [db table-name]
  (let [sql (str "SELECT * FROM "
                 table-name ";")]
      (ic/to-dataset (doall (jdbc/query db sql)))))

(def db {:subprotocol "sqlite"
         :subname "data/small-sample.sqlite"
         :classname "org.sqlite.JDBC"})

;(load-table-data db 'people)
