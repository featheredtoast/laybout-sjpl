(ns sjlibrary.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [sjlibrary.core-test]))

(enable-console-print!)

(doo-tests 'sjlibrary.core-test)
