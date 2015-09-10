(ns zenpresfe.routes
  (:require [compojure.core :refer :all]
            [zenpresfe.layout :as page]
            [zenpresfe.pnc.ctrl :as pages]
            [noir.response :as resp]))


(defroutes home
  (GET "/" req
       (pages/homepage))
  (GET "/sd" req
       (pages/homepagesd))
  (GET "/smp" req
       (pages/homepagesmp))
  (GET "/sma" req
       (pages/homepagesma))
  (GET "/guru" req
       (pages/homepageguru))
  (GET "/signup" req
       (pages/signuppage))
  (GET "/actionsignup" req
       (pages/actionsignuppage))
  (GET "/login" req
       (pages/loginpage))
  (GET "/dp" req
       (pages/dppage))
  (GET "/problem-dp" req
       (pages/problemdppage))
  (GET "/problem-dp2" req
       (pages/problemdppage2))
  (GET "/dpsoal" req
       (pages/dpsoalpage))
  (GET "/dpsoalscore" req
       (pages/dpsoalscorepage)))

;asdasdssssssss