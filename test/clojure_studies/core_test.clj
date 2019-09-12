(ns clojure-studies.core-test
  (:require [clojure.test :refer :all]
            [clojure-studies.core :refer :all]))

(deftest a-test
  (testing "invalid result"
    (is (= (foo 1 1) 2))))
