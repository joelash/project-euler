; NOT NEEDED BUT USEFUL TO HAVE
(defn fib [num]
  (if (<= num 1)
    num
    (+ (fib (- num 1)) (fib (- num 2)))))

(defn fib-upto [end]
  (loop [result [1, 2] p2 1 p1 2]
    (let [next (+ p1 p2)]
      (if (>= next end)
        result
        (recur (conj result next) p1 next)))))

(defn sum-even-fib-to [end]
  (apply + (filter even? (fib-upto end))))

(println (format "Sum: %s" (sum-even-fib-to 4000000)))