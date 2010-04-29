(ns example-test
  (:use clojure.test)
  (:use example))

(deftest test-ny-name
  (testing "should return Cool Project"
    (is (= (my-name) "Cool Project"))))