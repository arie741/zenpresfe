(ns zenpresfe.pnc.exercisenote
  (:require [net.cgrand.enlive-html :as html]
            [zenpresfe.pnc.pagelayout :refer :all]
            [hiccup.core :as hc]))

(html/deftemplate exercisenote "selmer/exercisenote.html" [])