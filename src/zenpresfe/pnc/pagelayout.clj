(ns zenpresfe.pnc.pagelayout
  (:require [net.cgrand.enlive-html :as html]
            [hiccup.core :as hc]))


;;layout

(html/deftemplate header "selmer/header.html"
  [])

(html/deftemplate footer "selmer/footer.html"
  [])

(html/deftemplate layout "selmer/layout.html"
  [content contenttitle]
  [:title] (html/content contenttitle)
  [:header] (html/html-content (apply str (header)))
  [:pagecontents] (html/html-content (apply str (content)))
  [:footer] (html/html-content (apply str (footer))))

(defn createpage [pcontents tcontent]
  (apply str (layout pcontents tcontent)))

;ssssssssssssssssssssssssssssssssssssssss
