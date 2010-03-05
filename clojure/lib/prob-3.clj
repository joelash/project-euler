(defn mult? [num mult]
  (= 0 (rem num mult)))
(defn prime? [num]
  (if (even? num) false
    (let [stop (quot (+ num 1) 2)]
      (loop [curr 3]
        (cond (>= curr stop) true
          (= 0 (rem num curr)) false
          :else (recur (+ 2 curr)))))))
(defn next-prime [num]
  (let [next (+ 2 num)]
    (if (prime? next)
      next
      (recur next))))
(defn prime-factors-of [num]
  (loop [factors [] curr num prime 3]
    (cond (= 1 curr) factors
      (mult? curr prime) (recur (conj factors prime) (quot curr prime) 3)
      :else (recur factors curr (next-prime prime)))))
(defn max-prime-factor [num]
  (last (prime-factors-of num)))

(println (format "Max prime factor of %s: %s" 600851475143 (max-prime-factor 600851475143)))