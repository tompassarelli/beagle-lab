(ns e20.author)

(defrecord User [name email age])

(defn user-name [r] (:name r))

(defn user-email [r] (:email r))

(defn user-age [r] (:age r))

(defn User-name [r]
  (get r :name))

(defn User-email [r]
  (get r :email))

(defn User-age [r]
  (get r :age))

(defrecord Product [sku title price])

(defn product-sku [r] (:sku r))

(defn product-title [r] (:title r))

(defn product-price [r] (:price r))

(defn Product-sku [r]
  (get r :sku))

(defn Product-title [r]
  (get r :title))

(defn Product-price [r]
  (get r :price))

(defrecord Order [user-id total status])

(defn order-user-id [r] (:user-id r))

(defn order-total [r] (:total r))

(defn order-status [r] (:status r))

(defn Order-user-id [r]
  (get r :user-id))

(defn Order-total [r]
  (get r :total))

(defn Order-status [r]
  (get r :status))
