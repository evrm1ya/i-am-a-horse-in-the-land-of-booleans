(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [quotient dividend]
  (if (= 0 (mod dividend quotient))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "gotcha!"
    (= 0 (mod n 5)) "buzz"
    (= 0 (mod n 3)) "fizz"
    :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (and (> age 12) (< age 20))))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (or (= 0 (mod year 400)) 
      (and (= 0 (mod year 4))
           (not= 0 (mod year 100)))))

; '_______'
