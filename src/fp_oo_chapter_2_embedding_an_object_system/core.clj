(ns fp-oo-chapter-2-embedding-an-object-system.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

{:a 1 :b 2}
(hash-map :a 1 :b 2)
(apply hash-map [:a 1 :b 2])

(def do-something-with-a-colored-point
  (fn [& args]
    (apply hash-map args)))

(get {:a 1 :b 2} :a)
(get {} :x)
(:a {:a 1 :b 2})
(def do-something-to-map
  (fn [function]
    (function {:a "a value" :b "b value"})))
(do-something-to-map :a)
(do-something-to-map count)
(assoc {:a 1 :b 2} :c 3)
(assoc {:a 1 :b 2} :c 3 :d 4)
(merge {:a 1 :b 2} {:c 3 :d 4} {:e 5})
(dissoc {:a 1 :b 2 :c 3 :d 4} :c :d)
(assoc {:a 1} :a 22222)
(merge {:a 1 :b 2 :c 3} {:a 111 :b 222 :d 4} {:b "two"})

;; 3.2

(def Point
  (fn [x y]
    {:x x
     :y y}))

(:x (Point 1 2))
(get (Point 3 4) :y)

(def x
  (fn [this] (get this :x)))

(x (Point 1 2))

(def x
  (fn [this] (:x this)))

(def x :x)
(def y :y)

;; 3.3

(def Point
  (fn [x y]
    {:x x
     :y y
     :__class_symbol__ 'Point}))

(def class-of :__class_symbol__)

(class-of (Point 1 2))

(def shift
  (fn [this xinc yinc]
    (Point (+ (x this) xinc)
           (+ (y this) yinc))))

(shift (Point 1 100) -1 -200)

; 3.4 Excercises

; COPY/PASTE BOILERPLATE
(def point {:x 1, :y 2, :__class_symbol__ 'Point})

(def Point
     (fn [x y]
       {:x x,
        :y y
        :__class_symbol__ 'Point}))

(def x :x)
(def y :y)
(def class-of :__class_symbol__)

(def shift
     (fn [this xinc yinc]
       (Point (+ (x this) xinc)
              (+ (y this) yinc))))

(def Triangle
     (fn [point1 point2 point3]
       {:point1 point1, :point2 point2, :point3 point3
        :__class_symbol__ 'Triangle}))


(def right-triangle (Triangle (Point 0 0)
                              (Point 0 1)
                              (Point 1 0)))

(def equal-right-triangle (Triangle (Point 0 0)
                                    (Point 0 1)
                                    (Point 1 0)))

(def different-triangle (Triangle (Point 0 0)
                                  (Point 0 10)
                                  (Point 10 0)))
; END COPY/PASTE BOILERPLATE

; Exercise 1





