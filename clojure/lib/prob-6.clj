(defn square [num]
  (* num num))
(defn sum-squares [start end]
  (apply + (map square (range start (inc end)))))

(defn square-sum [start end]
  (square (apply + (range start (inc end)))))

(defn difference [start end]
  (let [sum-sqrs (sum-squares start end) squrd-sum (square-sum start end)]
    (- squrd-sum sum-sqrs)))

;(println (format "Sum of squares: %s" (sum-squares 1 10)))
;(println (format "Square of sum: %s" (square-sum 1 10)))
(println (format "Difference is: %s" (difference 1 100)))