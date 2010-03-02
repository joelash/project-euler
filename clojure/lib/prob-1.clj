(defn is-mult? [num mult]
  (= 0 (rem num mult)))
(defn to-add [num]
  (if (or (is-mult? num 3) (is-mult? num 5))
    num
    0))
(defn prob1 [start end]
  (loop [total 0 current start end end]
    (if (= current end)
      total
      (recur (+ total (to-add current)) (+ 1 current) end))))

(println (format "Total: %s" (prob1 1 1000)))



;(defn sum-mults [mult max]
;  (def x (/ (- max 1) mult))
;  (/ (* mult x (+ x 1)) 2))
;(println (format "Total: %s" (- (+ (sum-mults 3 1000) (sum-mults 5 1000)) (sum-mults 15 1000))))