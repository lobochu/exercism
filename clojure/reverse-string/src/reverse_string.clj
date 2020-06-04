(ns reverse-string)

(defn reverse-string-1 [s]
  ;;The loop form can be abstract away as conj each input into list, which imply a reduce form.
  (loop [in (seq s)
         acc ()]
    (if in
      (recur (next in) (conj acc (first in)))
      (apply str acc)
      ))
  )

(defn reverse-string-2 [s]
  (apply str (reduce conj () (seq s)))
  )

(defn reverse-string [s]
  (apply str (into () s)))
