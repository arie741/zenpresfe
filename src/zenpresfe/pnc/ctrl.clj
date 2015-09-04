(ns zenpresfe.pnc.ctrl
  (:require [net.cgrand.enlive-html :as html]
            [zenpresfe.pnc.pagelayout :refer :all]
            [com.ashafa.clutch :as cl]
            [hiccup.core :as hc]
            [zenpresfe.pnc.homepage :refer :all]
            [zenpresfe.pnc.signup :refer :all]
            [zenpresfe.pnc.actionsignup :refer :all]))

;;Pages
(def ctitle " - Zenius Prestasi")

;;homepage
(defn homepage []
  (createpage home (str "Home" ctitle) headersd))

;;homepagesd
(defn homepagesd []
  (createpage home (str "Home" ctitle) headersd))

;;homepagesmp
(defn homepagesmp []
  (createpage home (str "Home" ctitle) headersmp))

;;homepagesma
(defn homepagesma []
  (createpage home (str "Home" ctitle) headersma))

;;homepageguru
(defn homepageguru []
  (createpage home (str "Home" ctitle) headerguru))

;;signup
(defn signuppage []
  (createpage signup (str "Sign-up" ctitle) headersd))

;;actionsignup
(defn actionsignuppage []
  (createpage actionsignup (str "Sign-up" ctitle) headersd))