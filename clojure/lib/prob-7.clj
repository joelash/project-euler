(use 'clojure.contrib.lazy-seqs)

(defn nth-prime [n]
  (nth primes (dec n)))

(println (format "10001st prime is: %s" (nth-prime 10001)))