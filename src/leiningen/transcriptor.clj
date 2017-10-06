(ns leiningen.transcriptor
  (:require [leiningen.core.eval :as lein-eval]))

(defn transcriptor
  "Runs all of your .repl files with transcriptor.

  Takes an optional path to find .repl files in. Defaults to the current directory."
  ([project]
   (transcriptor project "."))
  ([project path]
   (lein-eval/eval-in-project project
                              `(doall (map xr/run (xr/repl-files ~path)))
                              '(require '[cognitect.transcriptor :as xr]))))
