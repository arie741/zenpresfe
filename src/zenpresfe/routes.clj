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
  (GET "/public" req
       (pages/homepagepublic))
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
       (pages/dpsoalscorepage))
  (GET "/exercise" req
       (pages/exercisepage))
  (GET "/exercisesoal" req
       (pages/exercisesoalpage))
  (GET "/exercisedone" req
       (pages/exercisedonepage))
  (GET "/exercisenote" req
       (pages/exercisenotepage))
  (GET "/proset1" req
       (pages/proset1page))
  (GET "/proset2" req
       (pages/proset2page))
  (GET "/proset3" req
       (pages/proset3page))
  (GET "/createclass" req
       (pages/createclasspage))
  (GET "/seclass" req
       (pages/seclasspage))
  (GET "/dptingkat" req
       (pages/dptingkatpage))
  (GET "/profile" req
       (pages/profilepage))
  (GET "/myprogress" req
       (pages/myprogresspage))
  (GET "/contactus" req
       (pages/contactuspage))
  (GET "/profileguru" req
       (pages/profilegurupage))
  (GET "/rank" req
       (pages/rankpage)))

;asdasdssssssss