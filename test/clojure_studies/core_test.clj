(ns clojure-studies.core-test
  (:require [clojure.test :refer :all]
            [clojure-studies.core :refer :all]))

(clojure.test/deftest testing-foo
  (testing "invalid result"
    (is (= (clojure-studies.core/foo 1 1) 2))))

(clojure.test/deftest testing-greeting
  (testing "invalid result"
    (assert (= "Hello, World!" (clojure-studies.core/greeting)))
    (assert (= "Hello, Clojure!" (clojure-studies.core/greeting "Clojure")))
    (assert (= "Good morning, Clojure!" (clojure-studies.core/greeting "Good morning" "Clojure")))))

(clojure.test/deftest testing-do-nothing
  (testing "invalid result"
    (assert (= 1 (clojure-studies.core/do-nothing 1)))))

(clojure.test/deftest testing-always-thing
  (testing "invalid result"
    (assert (= 100 (clojure-studies.core/always-thing 1 2 3 4)))))


(clojure.test/deftest testing-make-thingy
  (testing "invalid result"
    (let [n (rand-int Integer/MAX_VALUE)
          f (clojure-studies.core/make-thingy n)]
      (assert (= n (f)))
      (assert (= n (f 123)))
      (assert (= n (apply f 123 (range)))))))
