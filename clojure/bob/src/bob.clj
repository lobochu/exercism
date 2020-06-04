(ns bob
  (:require [clojure.string :as str]))

(defn- question? [in]  (str/ends-with? (str/trim in) "?"))

(defn- all-uppercase? [in] (= in (re-matches #"[^a-z]*[A-Z][^a-z]*" in)))

(defn response-for [s]
  (if (str/blank? s) "Fine. Be that way!"
    (case [(question? s) (all-uppercase? s)]
      [true  true ] "Calm down, I know what I'm doing!"
      [true  false] "Sure."
      [false true ] "Whoa, chill out!"
      [false false] "Whatever.")))
