;Var bindings -> def or defn
(def light-years 100000)

;Lexical bindings with functions parameters
(defn hello-greeter [name] (str "Hello, " name))  ;name parameter will be locally bound to the argument passed to the function

;Lexical bindings with let - binds top and right with the value of the expressions
(defn square-corners [bottom left size]
  (let [top (+ bottom size)
        right (+ left size)]
    [[bottom left] [top left] [top right] [bottom right]]))

;Destructuring enables binding to only part of a collection. Any place where you bind a name you can destructure to bind only the part of the collection that matters
;Destructuring with maps
(defn hello-author-1 [author] (str "Hello, " (:first-name author)))
(defn hello-author-2 [{author-name :first-name}] (str "Hello, " author-name))
;Destructuring with vectors
(let [[first second] [1 2 3]] (str first second)) ;binds first and second names to the initial elements of the collection and discards the third one
(let [[_ _ third] [1 2 3]] (str third))           ;binds the first two elements of the collection to bind (the remaining value will be 2) and third to the third element
(let [[x y :as coords] [1 2 3 4 5 6]] (str "x=" x ", y=" y " - total of elements: " (count coords))) ;:as clause binds the entire collection to coords symbol

;Praticing...
(require '[clojure.string :as str])
(defn ellipsize [text]
  (let [[first-word second-word third-word] (str/split text #"\W+")]
    (str/join " " [first-word second-word third-word "..."])))
