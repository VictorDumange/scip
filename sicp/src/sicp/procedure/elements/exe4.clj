(ns sicp.procedure.elements.exe4)


;; Procedure returning procedure
(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))