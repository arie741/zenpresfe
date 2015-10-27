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
            [zenpresfe.pnc.exercisenote :refer :all]
            [zenpresfe.pnc.proset1 :refer :all]
            [zenpresfe.pnc.proset2 :refer :all]
            [zenpresfe.pnc.proset3 :refer :all]
            [zenpresfe.pnc.createclass :refer :all]
            [zenpresfe.pnc.seclass :refer :all]
            [zenpresfe.pnc.dptingkat :refer :all]
            [zenpresfe.pnc.profile :refer :all]
            [zenpresfe.pnc.myprogress :refer :all]
            [zenpresfe.pnc.contactus :refer :all]))

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

;;homepagepublic
(defn homepagepublic []
  (createpage home (str "Home" ctitle) headerpublic))

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

;;proset1
(defn proset1page []
  (createpage proset1 (str "DP" ctitle) headern))

;;proset2
(defn proset2page []
  (createpage proset2 (str "DP" ctitle) headern))

;;proset3
(defn proset3page []
  (createpage proset3 (str "DP" ctitle) headern))

;;createclass
(defn createclasspage []
  (createpage createclass (str "Create Class" ctitle) headern))


;;seclass
(defn seclasspage []
  (createpage seclass (str "Show & Edit Class" ctitle) headern))

;;seclass
(defn dptingkatpage []
  (createpage dptingkat (str "Deliberate Practice" ctitle) headern))

;;profile
(defn profilepage []
  (createpage profile (str "Profile" ctitle) headern))

;;myprogress
(defn myprogresspage []
  (createpage myprogress (str "Progress" ctitle) headern))

;;contactus
(defn contactuspage []
  (createpage contactus (str "Contact Us" ctitle) headern))