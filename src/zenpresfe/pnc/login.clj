(ns zenpresfe.pnc.login
  (:require [net.cgrand.enlive-html :as html]
            [zenpresfe.pnc.pagelayout :refer :all]
            [hiccup.core :as hc]))

(html/deftemplate login "selmer/login.html" [])