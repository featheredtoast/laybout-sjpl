(ns sjlibrary.core
  (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(defonce app-state (atom {:text "Hello Chestnut!"}))

(defn app []
  [:div {:class "app"}
   [:div {:class "header navbar navbar-default"}
    [:span {:class "pull-right"}
     [:a {:class "navbar-text"} "Log in"]
     [:a {:class "navbar-text"} "Get a card"]
     [:a {:class "navbar-text"} "Contact us"]
     [:a {:class "navbar-text"} "Help"]]]
   [:div {:class "subheader row"}
    [:div {:class "col-md-6"}
     [:h3 {:class ""} "The San Jose Public Library"]]
    [:div {:class "col-md-6 pull-right"}
     [:div {:class "input-group"}
      [:input {:type "text" :class "form-control" :placeholder "Search"}]
      [:span {:class "input-group-btn"}
       [:button {:type "button" :class "btn btn-default"} "Catalog"]
       [:button {:type "button" :class "btn btn-default"} "Article"]
       [:button {:type "button" :class "btn btn-default"} "Site"]
       [:button {:type "button" :class "btn btn-default"} 
        [:span {:class "glyphicon glyphicon-search"}]]]]]]
   [:div {:class "row"}
    [:div {:class "col-md-12"}
     [:ul {:class "nav nav-tabs nav-justified"}
      [:li [:a {:href "#"} "Collections"]]
      [:li [:a {:href "#"} "Using the Library"]]
      [:li [:a {:href "#"} "Learn"]]
      [:li {:class "active"} [:a {:href "#"} "Events"]]
      [:li [:a {:href "#"} "Teens"]]
      [:li [:a {:href "#"} "Kids"]]
      [:li [:a {:href "#"} "About"]]
      [:li [:a {:href "#"} "Locations"]]]]]
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
