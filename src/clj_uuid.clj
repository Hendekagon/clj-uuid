(ns clj-uuid
  (:refer-clojure :exclude [uuid? max < = >])
  (:require [danlentz.clj-uuid.api]))

(def clj-uuid/UUIDNameBytes danlentz.clj-uuid.api/UUIDNameBytes)
(def clj-uuid/get-instant danlentz.clj-uuid.api/get-instant)
(def clj-uuid/get-unix-time danlentz.clj-uuid.api/get-unix-time)
(def clj-uuid/get-clk-low danlentz.clj-uuid.api/get-clk-low)
(def clj-uuid/UUIDable danlentz.clj-uuid.api/UUIDable)
(def clj-uuid/= danlentz.clj-uuid.api/=)
(def clj-uuid/uuid-urn-string? danlentz.clj-uuid.api/uuid-urn-string?)
(def clj-uuid/v6 danlentz.clj-uuid.api/v6)
(def clj-uuid/hash-code danlentz.clj-uuid.api/hash-code)
(def clj-uuid/< danlentz.clj-uuid.api/<)
(def clj-uuid/to-hex-string danlentz.clj-uuid.api/to-hex-string)
(def clj-uuid/uuid= danlentz.clj-uuid.api/uuid=)
(def clj-uuid/to-byte-array danlentz.clj-uuid.api/to-byte-array)
(def clj-uuid/+max+ danlentz.clj-uuid.api/+max+)
(def clj-uuid/get-word-low danlentz.clj-uuid.api/get-word-low)
(def clj-uuid/get-clk-seq danlentz.clj-uuid.api/get-clk-seq)
(def clj-uuid/uuid-string? danlentz.clj-uuid.api/uuid-string?)
(def clj-uuid/+namespace-x500+ danlentz.clj-uuid.api/+namespace-x500+)
(def clj-uuid/get-node-id danlentz.clj-uuid.api/get-node-id)
(def clj-uuid/squuid danlentz.clj-uuid.api/squuid)
(def clj-uuid/uuid> danlentz.clj-uuid.api/uuid>)
(def clj-uuid/v1 danlentz.clj-uuid.api/v1)
(def clj-uuid/null? danlentz.clj-uuid.api/null?)
(def clj-uuid/v5 danlentz.clj-uuid.api/v5)
(def clj-uuid/uuid< danlentz.clj-uuid.api/uuid<)
(def clj-uuid/v7 danlentz.clj-uuid.api/v7)
(def clj-uuid/get-word-high danlentz.clj-uuid.api/get-word-high)
(def clj-uuid/> danlentz.clj-uuid.api/>)
(def clj-uuid/max? danlentz.clj-uuid.api/max?)
(def clj-uuid/+null+ danlentz.clj-uuid.api/+null+)
(def clj-uuid/to-string danlentz.clj-uuid.api/to-string)
(def clj-uuid/get-clk-high danlentz.clj-uuid.api/get-clk-high)
(def clj-uuid/get-timestamp danlentz.clj-uuid.api/get-timestamp)
(def clj-uuid/get-time-low danlentz.clj-uuid.api/get-time-low)
(def clj-uuid/as-byte-array danlentz.clj-uuid.api/as-byte-array)
(def clj-uuid/to-urn-string danlentz.clj-uuid.api/to-urn-string)
(def clj-uuid/monotonic-time danlentz.clj-uuid.api/monotonic-time)
(def clj-uuid/v0 danlentz.clj-uuid.api/v0)
(def clj-uuid/v8 danlentz.clj-uuid.api/v8)
(def clj-uuid/get-version danlentz.clj-uuid.api/get-version)
(def clj-uuid/+namespace-oid+ danlentz.clj-uuid.api/+namespace-oid+)
(def clj-uuid/get-time-high danlentz.clj-uuid.api/get-time-high)
(def clj-uuid/get-time-mid danlentz.clj-uuid.api/get-time-mid)
(def clj-uuid/get-variant danlentz.clj-uuid.api/get-variant)
(def clj-uuid/UUIDRfc4122 danlentz.clj-uuid.api/UUIDRfc4122)
(def clj-uuid/uuid? danlentz.clj-uuid.api/uuid?)
(def clj-uuid/UUIDRfc9562 danlentz.clj-uuid.api/UUIDRfc9562)
(def clj-uuid/null danlentz.clj-uuid.api/null)
(def clj-uuid/uuidable? danlentz.clj-uuid.api/uuidable?)
(def clj-uuid/max danlentz.clj-uuid.api/max)
(def clj-uuid/v4 danlentz.clj-uuid.api/v4)
(def clj-uuid/+namespace-url+ danlentz.clj-uuid.api/+namespace-url+)
(def clj-uuid/uuid-vec? danlentz.clj-uuid.api/uuid-vec?)
(def clj-uuid/to-uri danlentz.clj-uuid.api/to-uri)
(def clj-uuid/v3 danlentz.clj-uuid.api/v3)
(def clj-uuid/as-uuid danlentz.clj-uuid.api/as-uuid)
(def clj-uuid/+namespace-dns+ danlentz.clj-uuid.api/+namespace-dns+)