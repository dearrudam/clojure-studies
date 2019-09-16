(ns clojure-studies.core)

(defn foo
  "A foo function"
  [x y] (+ x y))


;;
;; Functions tests
;;=============================================================================================
;;
;; 1) Define a function greet that takes no arguments and prints "Hello". Replace the with the implementation: 
;; (defn greet [] )

(defn greet []
  (println "Hello"))
;;
;;
;;=============================================================================================
;;
;;2) Redefine greet using def, first with the fn special form and then with the #() reader macro.

;; using fn
(def greetfn
  (fn [] (println "Hello")))

;; using #()
(def greet#
  #(println "Hello"))
;;
;;
;;=============================================================================================
;;3) Define a function greeting which:
;;
;;Given no arguments, returns "Hello, World!"
;;
;;Given one argument x, returns "Hello, x!"
;;
;;Given two arguments x and y, returns "x, y!"
;;
;; Hint use the str function to concatenate strings
;;(doc str)
(defn greeting
  ([] (greeting "Hello" "World"))
  ([x] (greeting "Hello" x))
  ([x,y] (str x ", " y "!")))
;;
;;
;;=============================================================================================
;;4) Define a function do-nothing which takes a single argument x and returns it, unchanged.
(defn do-nothing [x] x)
;;
;;
;;=============================================================================================
;;5) Define a function always-thing which takes any number of arguments, ignores all of them, and returns the number 100.
(defn always-thing [& args] 100)
;;
;;
;;=============================================================================================
;;6) Define a function make-thingy which takes a single argument x. It should return another function, which takes any number of arguments and always returns x.
(defn make-thingy
  [x] (fn [& args] x))
;;
;;
;;=============================================================================================
;;7) Define a function triplicate which takes another function and calls it three times, without any arguments.
(defn triplicate
  [f] (f) (f) (f))
;;
;;
;;=============================================================================================
;;8) Define a function opposite which takes a single argument f. It should return another function which takes any number of arguments, applies f on them, and then calls not on the result. The not function in Clojure does logical negation.
(defn opposite [f]
  (fn [& args] (not (apply f args))))