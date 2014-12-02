(ns fp-oo-chapter-2-embedding-an-object-system.core-test
  (:require [clojure.test :refer :all]
            [fp-oo-chapter-2-embedding-an-object-system.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0))))


(do-something-with-a-colored-point  :x 1 :y 2 :color "red")
(do-something-with-a-colored-point :color "red" :y 2 :x 1)
