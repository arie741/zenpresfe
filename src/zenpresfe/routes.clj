(ns zenpresfe.routes
  (:require [compojure.core :refer :all]
            [zenpresfe.layout :as page]
            [zenpresfe.pnc.ctrl :as pages]
            [noir.response :as resp]))


(defroutes home
  (GET "/" req
       (pages/homepage)))

;asdasd