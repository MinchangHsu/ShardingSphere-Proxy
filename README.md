# ShardingSphere-Proxy


## Getting Started

* shardingsphere-proxy 使用 5.4.0 [shardingsphere docker hub ](https://hub.docker.com/r/apache/shardingsphere-proxy) 兩年前的<br>最新版本要去關往查看[官網](https://shardingsphere.apache.org/document/current/en/downloads/)<br> 撰寫這份文件時間是 2023/10/19
* 


1. 啟動 docker MySQL 8 
2. 需預先建立 schema 不用建Table， Table後續會連到 shardingsphere 來建立分表
    ```sql
    create schema if not exists demo_ds_0;
    create schema if not exists demo_ds_1;
   ```

3. 啟動 docker sharding 已提前設定連線內容，連到MySQL 8 帳號密碼都可以在 docker compose 檔案裡面查看<br>sharingsphere 連線帳號密碼可到 /conf/server.yaml 查看

4. 透過DB連線工具，連線 shargingsphere database 就選擇 MySQL , <br>如果是資料庫 postgresql 就選擇 postgresql, 舉一反三...
5. 透過 shardingsphere 建立分表
6. import postman collection json
6. 啟動 spring boot
7. 測試API
8. 查看 spring boot console 內容