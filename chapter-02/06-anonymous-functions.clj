;fn -> declares an anonymous function
;   (fn [params*] body)
(filter (fn [name] (> (count name) 3)) ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"])

;function reader macro
;#([params*] body), where first param can be %1 or %, second can be %2 and the rest of the params %&
(filter #(> (count %) 3) ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"])

;bind a name to anonymous functions with let
(require '[clojure.string :as str])
(defn indexable-words [text]
  (let [indexable-word? #(> (count %) 3)]
    (filter indexable-word? (str/split text #"\W+"))))

(indexable-words "The quick brown fox jumps over the lazy dog")

;functions that creates functions
(defn make-greeting [greeting-prefix]
  (fn [name] (str greeting-prefix ", " name)))

(def hello-greeting (make-greeting "Hello"))
(def aloha-greeting (make-greeting "Aloha"))

(hello-greeting "Diego")
(aloha-greeting "Diego")
