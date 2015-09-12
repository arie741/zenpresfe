(ns zenpresfe.pnc.ctrl
  (:require [net.cgrand.enlive-html :as html]
            [zenpresfe.pnc.pagelayout :refer :all]
            [com.ashafa.clutch :as cl]
            [hiccup.core :as hc]
            [zenpresfe.pnc.homepage :refer :all]
            [zenpresfe.pnc.signup :refer :all]
            [zenpresfe.pnc.actionsignup :refer :all]
            [zenpresfe.pnc.login :refer :all]
            [zenpresfe.pnc.dp :refer :all]
            [zenpresfe.pnc.problemdp :refer :all]
            [zenpresfe.pnc.problemdp2 :refer :all]
            [zenpresfe.pnc.dpsoal :refer :all]
            [zenpresfe.pnc.dpsoalscore :refer :all]
            [zenpresfe.pnc.exercise :refer :all]
            [zenpresfe.pnc.exercisesoal :refer :all]
            [zenpresfe.pnc.exercisedone :refer :all]
            [zenpresfe.pnc.exercisenote :refer :all]))

;;Pages
(def ctitle " - Zenius Prestasi")

;;homepage
(defn homepage []
  (createpage home (str "Home" ctitle) headern))

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

;;login 
(defn loginpage []
  (createpage login (str "Log in" ctitle) headern))

;;dp
(defn dppage []
  (createpage dp (str "DP" ctitle) headern))

;;dp
(defn problemdppage []
  (createpage problemdp (str "DP" ctitle) headern))

;;dp2
(defn problemdppage2 []
  (createpage problemdp2 (str "DP" ctitle) headern))

;;dp-soal
(defn dpsoalpage []
  (createpage dpsoal (str "DP" ctitle) headern))

;;dp-soal
(defn dpsoalscorepage []
  (createpage dpsoalscore (str "DP" ctitle) headern))

;;exercise
(defn exercisepage []
  (createpage exercise (str "DP" ctitle) headern))

;;exercise
(defn exercisesoalpage []
  (createpage exercisesoal (str "DP" ctitle) headern))

;;exercise
(defn exercisedonepage []
  (createpage exercisedone (str "DP" ctitle) headern))

;;exercise
(defn exercisenotepage []
  (createpage exercisenote (str "DP" ctitle) headern))