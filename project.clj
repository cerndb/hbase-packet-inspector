(defproject hbase-packet-inspector "0.3.0"
  :description "A command-line tool for analyzing network traffic of HBase RegionServers"
  :url "http://github.com/kakao/hbase-packet-inspector"
  :license {:name "Apache License 2.0"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/core.async "1.3.622"]
                 [org.clojure/core.match "1.0.0"] 
                 [org.clojure/tools.cli "1.0.206"]
                 [org.clojure/tools.logging "1.1.0"]
                 [org.clojure/java.jdbc "0.7.12"]
                 [org.slf4j/slf4j-api "1.7.32"]
                 [org.slf4j/slf4j-log4j12 "1.7.32"]
                 [org.apache.hbase/hbase-client "2.4.7"
                  :exclusions [net.minidev/json-smart]]
                 [org.pcap4j/pcap4j-core "1.8.2"]
                 [org.pcap4j/pcap4j-packetfactory-static "1.8.2"]
                 [com.google.guava/guava "31.0.1-jre"]
                 [com.google.protobuf/protobuf-java "2.6.1"] ; Issues with v3
                 [com.h2database/h2 "1.4.197"] ; v1.4.198: 1 error -> reserved keyworkd escaping?
                 [org.apache.kafka/kafka-clients "3.0.0"]
                 [cheshire "5.10.0"]
                 [com.cemerick/url "0.1.1"]
                 [junegunn/grouper "0.1.1"]]
  :plugins [[lein-cloverage "1.2.2"]]
  :main hbase-packet-inspector.core
  :target-path "target/%s"
  :uberjar-name "../hbase-packet-inspector-%s.jar"
  :profiles {:uberjar {:aot :all}})
