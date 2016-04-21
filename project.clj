(defproject clj-aws-s3 "0.3.11"
  :description "Clojure Amazon S3 library with updated dependencies.  Fork of weavejester/clj-aws-s3"
  :url "https://github.com/cmhobbs/clj-aws-s3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.amazonaws/aws-java-sdk "1.10.71"]
                 [clj-time "0.11.0"]]
  :plugins [[codox "0.8.10"]])
