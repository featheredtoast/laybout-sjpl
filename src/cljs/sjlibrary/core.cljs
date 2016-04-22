(ns sjlibrary.core
  (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(defonce app-state (atom {:text "Hello Chestnut!"}))

(defn nav-menu [extra-classes]
  [:ul {:class (str "nav " extra-classes)}
   [:li [:a {:href "#"} "Log in"]]
   [:li [:a {:href "#"} "Get a card"]]
   [:li [:a {:href "#"} "Contact us"]]
   [:li [:a {:href "#"} "Help"]]]
  )

(defn subnav-menu []
  [:ul {:class "nav nav-tabs nav-justified"}
   [:li [:a {:href "#"} "Collections"]]
   [:li [:a {:href "#"} "Library Use"]]
   [:li [:a {:href "#"} "Learn"]]
   [:li {:class "active"} [:a {:href "#"} "Events"]]
   [:li [:a {:href "#"} "Teens"]]
   [:li [:a {:href "#"} "Kids"]]
   [:li [:a {:href "#"} "About"]]
   [:li [:a {:href "#"} "Locations"]]])

(defn app []
  [:div {:class "app"}
   [:div {:class "navbar navbar-default"}
    [:div {:class "container-fluid"}
     [:div {:class "navbar-header"}
      [:button {:type "button" :class "navbar-toggle collapsed" :data-toggle "collapse" :data-target "#main-nav"}
       [:span {:class "sr-only"} "Toggle navigation"]
       [:span {:class "icon-bar"}]
       [:span {:class "icon-bar"}]
       [:span {:class "icon-bar"}]]
      [:a {:class "navbar-brand" :href "#"} [:img {:alt "SJPL" :class "brand" :src "/images/sjpl-logo.png"}]]]
     [:div {:class "collapse navbar-collapse" :id "main-nav"}
      [:div {:class "hidden-xs"}
       (nav-menu "navbar-nav navbar-right")]
      [:div {:class "visible-xs"}
       (nav-menu "nav-justified")
       [:hr]
       (subnav-menu)]]]]
   [:div {:class "content-body container"}
    [:div {:class "subheader row"}
     [:div {:class "col-md-6"}
      [:h3 {:class ""} "San Jose Public Library"]]
     [:div {:class "col-md-6 pull-right"}
      [:div {:class "input-group"}
       [:input {:type "text" :class "form-control" :placeholder "Search"}]
       [:span {:class "input-group-btn"}
        [:button {:type "button" :class "btn btn-default dropdown-toggle" :data-toggle "dropdown"
                  :aria-expanded "false" :aria-haspopup "true"} "Catalog " [:span {:class "caret"}]]
        [:ul {:class "dropdown-menu"}
         [:li [:a {:href "#"} "Catalog"]]
         [:li [:a {:href "#"} "Article"]]
         [:li [:a {:href "#"} "Site"]]]
        [:button {:type "button" :class "btn btn-default"} 
         [:span {:class "glyphicon glyphicon-search"}]]]]]]
    [:div {:class "hidden-xs row"}
     [:div {:class "col-md-12"}
      (subnav-menu)]]
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
        [:li "Homework help! (Passing grade not guaranteed)"]]]]]]])

(reagent/render [app] (js/document.getElementById "app"))
