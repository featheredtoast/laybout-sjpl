(ns sjlibrary.core
  (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(defonce app-state (atom {:text "Hello Chestnut!"}))

(defn app []
  [:div {:class "app"}
   [:div {:class "row"}
    [:div {:class "col-md-4"}
     [:div {:class "card"}
      "TV's Adam west to visit the SJPL!!!"]]
    [:div {:class "col-md-4"}
     [:div {:class "card"}
      "New NASA Shuttle exibit 2018!"]]
    [:div {:class "col-md-4"}
     [:div {:class "card"}
      "Things people write!"
      [:ul
       [:li "Feelings!"]
       [:li "Thoughts!"]
       [:li "Deep philosophical ramblings!"]
       [:li "Other things!"]
       [:li "More other things!"]]]]]
   [:div {:class "row"}
    [:div {:class "col-md-4"}
     [:div {:class "card"}
      "Build your own Iron Man suit! (Core reactor not included)"]]
    [:div {:class "col-md-4"}
     [:div {:class "card"}
      "SJPL celebrates national Pet A Cat Day with ALL THE CATS!"]]
    [:div {:class "col-md-4"}
     [:div {:class "card"}
      "Services"
      [:ul
       [:li "Books!"]
       [:li "Movies!"]
       [:li "Homework help! (Passing grade not guaranteed)"]]]]]])

(reagent/render [app] (js/document.getElementById "app"))
