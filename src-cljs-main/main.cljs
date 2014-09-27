(ns om-clojurescript-template.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn itemsList [data owner]
  (reify
    om/IRender
    (render [this]
      (apply dom/div #js {:id "items"}
        (cons (dom/button #js {:onClick pushToItems} "Click")
              (vec (map (fn [item] (dom/div #js {:id "item"} (:text item))) data)))))))

(def items (atom []))

(defn pushToItems [e] (swap! items (fn [l] (conj (take 5 l) {:text (str (rand-int 30) " - " (.-timeStamp e))}))))

(om/root itemsList items {:target (. js/document (getElementById "mainapp"))})
