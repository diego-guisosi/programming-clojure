;vectors - sequential, indexed collection
[1 2 3]

;lists - sequential linked list
;(1 2 3) -> since clojure evaluate lists as function calls (where the first element is the function and the others are the parameters),
;           we can't declare lists literally as we can do with vectors
(quote (1 2 3)) ;quote interpret a list as data instead of a function call
'(1 2 3)        ;' is quote reader macro, which are abbreviations of longr list forms and are used as shortcuts to improve readability

;sets - unordered collections that do not contain duplicates
#{1 2 3 4 5} ;if a set is literally declared with duplicates, an exception is thrown

;maps - collection of key-value pairs
{"Lisp" "McCarthy" "Clojure" "Hickey"} 
{"Lisp" "McCarthy", "Clojure" "Hickey"} ;since commas are optional with clojure, we can use them to improve readability
{:Lisp "McCarthy", :Clojure "Hickey"}   ;the most common key type are keywords, which are special symbols that resolve to themselves
                                        ;keywords can be passed as parameters to maps or receive maps as parameter
                                        ;both cases returns the value associated with the key represented by the keyword in the map

;records - act as a template to construct maps
(defrecord Book [title author]) ;this form creates a Book record
(>Book "20 mil leguas submarinas" "Jules Verne") ;this creates an instance of Book record
                                                 ;we can access attributes using keywords declared in the vector passed as parameter to defrecord
