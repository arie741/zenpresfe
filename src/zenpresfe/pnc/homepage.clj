(ns zenpresfe.pnc.homepage
  (:require [net.cgrand.enlive-html :as html]
            [zenpresfe.pnc.pagelayout :refer :all]
            [hiccup.core :as hc]))


(html/deftemplate home "selmer/home.html" [])
