(ns two-fer)

(defn two-fer  ;; <- arglist goes here
  ;; your code goes here
  ;;One for X, one for me.
  ;; can use conditional args to decide whether args condition meets the requirement
  ([] (two-fer "you"))
  ([name] (str "One for " name ", one for me."))
)
