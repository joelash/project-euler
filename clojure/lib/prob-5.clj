(use 'clojure.contrib.math)

(println (format "The answer is: %s" (reduce lcm (range 1 21))))
