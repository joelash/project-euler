(defn palindrome? [thing]
  (let [check (reverse (str thing))]
    (= check (reverse check))))

(defn palindromes []
  (loop [x 999 pals []]
    (if (< x 100) pals
      (recur (dec x)
            (loop [y x pals pals]
              (if (< y 100) pals (do
                (let [mult (* x y)]
                  (if (palindrome? mult) (recur (dec y) (conj pals mult))
            (recur (dec y) pals))))))))))

(defn pals []
  (loop [x 999 pals []]
    (if (< x 100) pals (do
      (if (even? x) (recur (dec x) (conj pals x))
      (recur (dec x) pals))))))

(defn max-pal []
  (apply max (palindromes )))

;(println (palindromes ))
(println (format "The largest palindrome is: %s" (max-pal )))
