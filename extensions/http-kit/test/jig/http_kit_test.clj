;; Copyright © 2013, JUXT LTD. All Rights Reserved.
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this distribution.
;;
;; By using this software in any fashion, you are agreeing to be bound by the
;; terms of this license.
;;
;; You must not remove this notice, or any other, from this software.

(ns jig.http-kit-test
  (:require
   jig
   [clojure.test :refer :all]
   [jig.http-kit :refer :all])
  (:import (jig.http_kit Server)))

(deftest test-startup
  (Server. {}))
