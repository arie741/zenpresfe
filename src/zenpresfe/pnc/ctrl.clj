(ns zenpresfe.pnc.ctrl
  (:require [net.cgrand.enlive-html :as html]
            [zenpresfe.pnc.pagelayout :refer :all]
            [com.ashafa.clutch :as cl]
            [hiccup.core :as hc]
            [zenpresfe.pnc.homepage :refer :all]))

;;Pages
(def ctitle " - Nyoman Arie | Dota 2 Betting Site")

;;homepage
(defn homepage []
  (createpage home (str "Home" ctitle)))