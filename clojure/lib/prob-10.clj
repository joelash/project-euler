(use 'clojure.contrib.lazy-seqs)

(defn prob10 []
  (apply + (take-while #(< % 2000000) primes)))

(println (format "The total is: %s" (prob10)))