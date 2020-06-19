(ns poc-clojure.example)

(print "Hello world")  ; say Hi
;;Multiple lines of comment

(str "Clo"  "jure") ; Returns "Clojure
(str "Hello, " " " "world!")
(str 3 " 2 " " hey ")

(count "Hello world")
(count "Hello")
(count "")

(println true)
(println false)

(print "Hello world" nil)  ; say Hi

(+ 2 2)
(* 2 22)
(/ (+ 4 4) 2)
(+ 2 2 2)
(/ 8 3)
(quot 8 3)
(/ (+ 1.6 2.4) 2.0)
(+ 2 2.2)

(def test (+ 2 2))

(defn hello []
  println "Hello")
(hello)

(defn printInput [input]
  println input)
(printInput "Hello")

(defn average [a b]
  (/ (+ a b) 2.0))
(average 4 6)