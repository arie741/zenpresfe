(ns zenpresfe.pnc.pagelayout
  (:require [net.cgrand.enlive-html :as html]
            [hiccup.core :as hc]))


;;layout


(html/deftemplate headern "selmer/header.html"
  [])

(html/deftemplate headersd "selmer/headersd.html"
  [])

(html/deftemplate headersmp "selmer/headersmp.html"
  [])

(html/deftemplate headersma "selmer/headersma.html"
  [])

(html/deftemplate headerguru "selmer/headerguru.html"
  [])

(html/deftemplate footer "selmer/footer.html"
  [])

(html/deftemplate layout "selmer/layout.html"
  [content contenttitle header]
  [:title] (html/content contenttitle)
  [:header] (html/html-content (apply str (header)))
  [:pagecontents] (html/html-content (apply str (content)))
  [:footer] (html/html-content (apply str (footer))))

(defn createpage [pcontents tcontent header]
  (apply str (layout pcontents tcontent header)))

;sssss