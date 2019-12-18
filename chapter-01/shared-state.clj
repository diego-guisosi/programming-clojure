;Definition of a set with an atom reference
(def visitors (atom #{}))

;Definition of hello function with side effects
(defn hello
  "Hello function that keeps track of the visitors"
  [name]
  (swap! visitors conj name)
  (str "Hello, " name))

;Definition of a function that prints visitor state
(defn print_visitors
  "This function prints all hello visitors"
  []
  (println (deref visitors))
  (println @visitors))

(hello "Dixy")
(print_visitors)

(hello "James")
(print_visitors)
