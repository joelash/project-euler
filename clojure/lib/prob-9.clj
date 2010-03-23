(defn sqared [x] (* x x))

(defn p-triple? [a b c]
  (= (+ (sqared a) (sqared b)) (sqared c)))

(defn prob9
  (reduce (def [x] println x) (range 1 1001)))

(prob9)