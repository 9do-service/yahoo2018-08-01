# Android java 介面

目前尚未提供範例程式，建議可以參考 https://github.com/SamuGG/android-sqlite-example 利用 Android java 讀取 sqlite 台灣商品交易資料庫範例。

資料庫內容為 2018 年 8 月 1 日一整天，Yahoo 商城在台灣的交易狀況，開發者可以自行透過 Android java 程式的撰寫讀取資料庫的內容，並以圖表的方式呈現其結果，開發與分析消費者的消費概況。範例資料庫的欄位包含：company_id(店家統編)、company_name(店家名稱)、userID(消費者裝置代碼)、inv_date(發票日期)、product_name(產品名稱)、unit_price(產品購買單價)、quantity(產品購買數量)、inv_time(購物時間)、pay_type(付款方式)。如果開發者想要開發商品比價的 App ，可以 group by 產品名稱欄位並以 inv_time 由小到大排序，以值方圖或摺線圖呈現，就可以觀察一天內商品價格的變化。其他更多的應用，請開發者自行思考規劃。

測試的時候請將 yahoo20180801.db 資料庫放在 android 目錄下，或修改原始碼變更資料庫檔案位置。

若開發者對角度數據提供的資料庫感興趣，可與角度數據聯繫購買您所需要的消費資料庫，或客製開發所需之 API。

## 其他議題

1. 哪一種商品最受歡迎？
2. 哪一種商品在 2018 年 8 月 1 日一整天總營收最高？
3. 哪一種商品消費者喜歡刷卡？
