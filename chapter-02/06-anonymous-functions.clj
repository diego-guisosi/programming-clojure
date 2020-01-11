;fn -> declares an anonymous function
;   (fn [params*] body)
(filter (fn [name] (> (count name) 3)) ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"])

;function reader macro
;#([params*] body), where first param can be %1 or %, second can be %2 and the rest of the params %&
(filter #(> (count %) 3) ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"])
